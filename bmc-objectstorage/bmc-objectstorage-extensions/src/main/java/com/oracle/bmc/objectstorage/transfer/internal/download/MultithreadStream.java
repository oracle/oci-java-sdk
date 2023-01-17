/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.transfer.DownloadManager;
import com.oracle.bmc.util.StreamUtils;

/**
 * An InputStream that can resume a broken download by making a range read
 * request to Object Storage.
 */
public class MultithreadStream extends InputStream {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MultithreadStream.class);

    /**
     * Download manager we can use to create new requests.
     */
    private final DownloadManager downloadManager;

    /**
     * Request that can be cloned to read the object.
     */
    private final GetObjectRequest baseRequest;

    /**
     * Total size of the object.
     */
    private final long objectSize;

    /**
     * Input stream we can read the first part from.
     */
    private final InputStream firstPart;

    /**
     * Number of threads to use.
     */
    private final int numThreads;

    /**
     * Each thread will download up to this much data. An instance of this
     * class uses about {@link #numThreads} * {@link #partSize} of buffer.
     */
    private final int partSize;

    /**
     * Used to manage the threads we have.
     */
    private final ExecutorService executorService;

    /**
     * True if we should shutdown {@link #executorService} when finished. This
     * is set to true if the constructor creates the executor service.
     */
    private final boolean shutdownExecutorService;

    /**
     * Our async read operations.
     */
    private final AsyncRead[] asyncReads;

    /**
     * Which thread in {@link #asyncReads} is the current thread.
     */
    private int asyncReadIndex;

    /**
     * The offset that the next thread should start reading from.
     */
    private long nextReadOffset;

    /**
     * Number of bytes read so far.
     */
    private long bytesReadSoFar;

    /**
     * True if this stream has been closed.
     */
    private boolean isClosed;

    public MultithreadStream(
            DownloadManager downloadManager,
            GetObjectRequest baseRequest,
            long objectSize,
            InputStream firstPart,
            int numThreads,
            ExecutorService executorService,
            int partSize) {
        assert partSize > 0;
        assert numThreads > 0;
        // If the object is not bigger than a single part we should not
        // use a multi-threaded download.
        assert objectSize >= partSize;

        this.downloadManager = downloadManager;
        this.baseRequest = baseRequest;
        this.objectSize = objectSize;
        this.numThreads = numThreads;
        this.partSize = partSize;
        this.firstPart = firstPart;

        this.bytesReadSoFar = 0;

        this.asyncReads = new AsyncRead[this.numThreads];
        this.asyncReadIndex = 0;
        this.nextReadOffset = this.partSize;

        // Start the threads
        if (executorService == null) {
            this.executorService = Executors.newFixedThreadPool(this.numThreads);
            this.shutdownExecutorService = true;
        } else {
            this.executorService = executorService;
            this.shutdownExecutorService = false;
        }
        final int numParts = Math.toIntExact((objectSize + partSize - 1) / partSize);
        // The foreground thread will read the first part
        final int readsToStart = Math.min(numThreads, numParts - 1);
        for (int i = 0; i < readsToStart; ++i) {
            this.asyncReads[i] = this.startAsyncRead(null);
        }
    }

    @Override
    public synchronized void close() throws IOException {
        // If any threads are still running, cancel them.
        for (int i = 0; i < this.asyncReads.length; ++i) {
            if (this.asyncReads[i] != null) {
                this.asyncReads[i].thread.requestCancel();
            }
        }

        StreamUtils.closeQuietly(firstPart);
        // We will give the threads this long to stop
        final long deadline = 30_000;
        final long stopMillis = System.currentTimeMillis() + deadline;

        // Wait for the threads to stop
        for (int i = 0; i < this.asyncReads.length; ++i) {
            if (this.asyncReads[i] != null) {
                final long millisToWait = Math.max(0L, stopMillis - System.currentTimeMillis());
                try {
                    this.asyncReads[i].future.get(millisToWait, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    LOG.warn("Ignoring exception from async read", e);
                }
            }
        }

        if (this.shutdownExecutorService) {
            try {
                this.executorService.shutdownNow();
                this.executorService.awaitTermination(0, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                LOG.warn("Ignoring exception from executor service termination", e);
            }
        }

        this.isClosed = true;
    }

    @Override
    public int read() throws IOException {
        final byte[] b = new byte[1];
        final int r = this.read(b, 0, 1);
        if (r < 0) {
            return -1;
        }
        return Byte.toUnsignedInt(b[0]);
    }

    @Override
    public synchronized int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }

        // Nothing left to read?
        if (this.allDataRead()) {
            return -1;
        }

        if (this.isClosed) {
            throw new IOException("Stream has been closed");
        }

        if (this.bytesReadSoFar < (long) this.partSize) {
            // The first part has some more data for us.
            final int maxBytesToRead =
                    Math.min(len, Math.toIntExact((long) this.partSize - this.bytesReadSoFar));
            final int bytesRead = this.firstPart.read(b, off, maxBytesToRead);
            if (bytesRead < 0) {
                LOG.error(
                        "Truncated download. Got {} from read (expected {} bytes remaining)",
                        bytesRead,
                        maxBytesToRead);
                throw new IOException("Truncated read");
            }
            assert bytesRead > 0;
            this.bytesReadSoFar += bytesRead;
            assert this.bytesReadSoFar <= (long) this.partSize;
            if (this.bytesReadSoFar >= this.partSize) {
                // We are done with the first part
                closeQuietly(this.firstPart);
            }
            LOG.trace(
                    "Read {} bytes from first part ({} total, object is {} bytes)",
                    bytesRead,
                    this.asyncReadIndex,
                    this.bytesReadSoFar,
                    this.objectSize);
            return bytesRead;
        } else {
            // We have not read all the data in the object, so the next background
            // thread will have some data.
            LOG.trace("Reading from thread {}", this.asyncReadIndex);
            final AsyncRead asyncRead = this.asyncReads[this.asyncReadIndex];
            final int bytesRead = asyncRead.thread.read(b, off, len);
            if (bytesRead < 0) {
                LOG.error("Truncated download. Got {} from read", bytesRead);
                throw new IOException("Truncated read");
            }

            this.bytesReadSoFar += bytesRead;
            LOG.trace(
                    "Read {} bytes from thread {} ({} total, object is {} bytes)",
                    bytesRead,
                    this.asyncReadIndex,
                    this.bytesReadSoFar,
                    this.objectSize);

            if (asyncRead.thread.allDataRead()) {
                // This thread has no more data. Shut it down.
                this.asyncReads[this.asyncReadIndex] = null;
                try {
                    final byte[] buffer = joinAsyncRead(asyncRead);
                    assert buffer != null;
                    // Have we read all the data?
                    if (this.allDataRead()) {
                        // Nothing left to read, so we don't need the executor
                        // service any more.
                        this.shutdownExecutorService();
                    } else {
                        // Time to start a new read?
                        if (!this.allReadsStarted()) {
                            // Start a new read
                            this.asyncReads[this.asyncReadIndex] = this.startAsyncRead(buffer);
                            assert this.asyncReads[this.asyncReadIndex] != null;
                        }
                        // There is more data to read so we move to the next async read
                        this.advanceAsyncReadIndex();
                        assert this.asyncReads[this.asyncReadIndex] != null;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    throw new IOException("Unable to start AsyncRead", e);
                }
            }

            return bytesRead;
        }
    }

    /**
     * Wait for an async read to finish and return its buffer.
     */
    private byte[] joinAsyncRead(AsyncRead asyncRead)
            throws ExecutionException, InterruptedException {
        assert asyncRead.thread.allDataRead();
        return asyncRead.future.get();
    }

    /**
     * Returns true if all reads have been started.
     */
    private boolean allReadsStarted() {
        return (this.nextReadOffset >= this.objectSize);
    }

    /**
     * Returns true if all reads have finished.
     */
    private boolean allDataRead() {
        return (this.bytesReadSoFar >= this.objectSize);
    }

    /**
     * Update {@link #asyncReadIndex}.
     */
    private void advanceAsyncReadIndex() {
        assert this.asyncReadIndex >= 0;
        assert this.asyncReadIndex < this.asyncReads.length;
        ++this.asyncReadIndex;
        if (this.asyncReadIndex >= this.asyncReads.length) {
            this.asyncReadIndex = 0;
        }
        assert this.asyncReadIndex >= 0;
        assert this.asyncReadIndex < this.asyncReads.length;
    }

    private void shutdownExecutorService() throws InterruptedException {
        // All AsyncReads should be done
        for (AsyncRead asyncRead : this.asyncReads) {
            assert asyncRead == null;
        }
        if (this.shutdownExecutorService) {
            this.executorService.shutdownNow();
            this.executorService.awaitTermination(1, TimeUnit.SECONDS);
        }
    }

    /**
     * Start a new async read that will read {@link #partSize} bytes from
     * the object starting as {@link #nextReadOffset}, offset by the range
     * in {@link #baseRequest} if necessary.
     * @param buffer An existing buffer to use. If this is null a new
     *               buffer is allocated.
     * @return The new async read.
     */
    private AsyncRead startAsyncRead(@Nullable byte[] buffer) {
        boolean isEndOnlyRange =
                this.baseRequest.getRange() != null
                        && this.baseRequest.getRange().getStartByte() == null
                        && this.baseRequest.getRange().getEndByte() != null;

        // Calculate the new range
        RangeWrapper rangeWrapper = isEndOnlyRange ? endOnlyRange() : notEndOnlyRange();

        int rangeSize = Math.toIntExact(rangeWrapper.getRangeSize());
        Range range = rangeWrapper.getRange();
        final GetObjectRequest getObjectRequest =
                GetObjectRequest.builder().copy(this.baseRequest).range(range).build();

        // Get the buffer
        if (buffer == null) {
            buffer = new byte[Math.toIntExact(rangeSize)];
        } else {
            assert buffer.length >= Math.toIntExact(rangeSize);
        }

        // Start the async read
        LOG.debug(
                "Starting async read of {}/{}/{} from {}-{} ({})",
                getObjectRequest.getNamespaceName(),
                getObjectRequest.getBucketName(),
                getObjectRequest.getObjectName(),
                getObjectRequest.getRange().getStartByte(),
                getObjectRequest.getRange().getEndByte(),
                this.asyncReadIndex);
        final DownloadThread thread =
                new DownloadThread(this.downloadManager, getObjectRequest, buffer, rangeSize);
        final Future<byte[]> future = this.executorService.submit(() -> thread.run());
        final AsyncRead asyncRead = new AsyncRead(future, thread);
        this.nextReadOffset += rangeSize;
        return asyncRead;
    }

    private static void closeQuietly(InputStream s) {
        try {
            s.close();
        } catch (Throwable t) {
            LOG.trace("Ignoring error from InputStream.close", t);
        }
    }

    private static final class AsyncRead {
        /**
         * Completes when the async thread finishes.
         */
        private final Future<byte[]> future;

        /**
         * The download thread we can read from.
         */
        private final DownloadThread thread;

        public AsyncRead(Future<byte[]> future, DownloadThread thread) {
            this.future = future;
            this.thread = thread;
        }
    }

    public RangeWrapper notEndOnlyRange() {
        final long baseRequestRangeStart;
        if (MultithreadStream.this.baseRequest.getRange() != null
                && MultithreadStream.this.baseRequest.getRange().getStartByte() != null) {
            baseRequestRangeStart = MultithreadStream.this.baseRequest.getRange().getStartByte();
        } else {
            baseRequestRangeStart = 0L;
        }
        final long baseRequestRangeEnd;
        if (MultithreadStream.this.baseRequest.getRange() != null
                && MultithreadStream.this.baseRequest.getRange().getEndByte() != null) {
            baseRequestRangeEnd = MultithreadStream.this.baseRequest.getRange().getEndByte();
        } else {
            // If there is no end range we will treat it as max
            baseRequestRangeEnd = Long.MAX_VALUE;
        }
        assert baseRequestRangeStart < baseRequestRangeEnd;
        final long rangeStart = baseRequestRangeStart + MultithreadStream.this.nextReadOffset;
        long rangeEnd = rangeStart + MultithreadStream.this.partSize - 1;
        // Do not go past the end of the range in the request
        rangeEnd = Math.min(rangeEnd, baseRequestRangeEnd);
        // Or past the end of the object
        rangeEnd =
                Math.min(rangeEnd, baseRequestRangeStart + MultithreadStream.this.objectSize - 1);
        assert rangeEnd >= rangeStart;
        final long rangeSize = rangeEnd - rangeStart + 1;
        assert rangeSize > 0;

        // Create the new request
        Range range = new Range(rangeStart, rangeEnd);
        return new RangeWrapper(rangeSize, range);
    }

    public RangeWrapper endOnlyRange() {
        long baseRequestRangeEnd = MultithreadStream.this.baseRequest.getRange().getEndByte();
        if (baseRequestRangeEnd > objectSize) {
            // the requested "end-only" range was larger than the object (e.g. "-101" on a 100 byte object)
            // the first request will just start at the beginning of the object and read partSize bytes
            // that means it's as if we had requested exactly the right size range ("-100").
            baseRequestRangeEnd = objectSize;
        }

        long rangeEnd = baseRequestRangeEnd - MultithreadStream.this.nextReadOffset;
        // Do not go past the end of the range in the request
        rangeEnd = Math.max(rangeEnd, 0);
        final long rangeSize = Math.min(rangeEnd, partSize);
        assert rangeSize > 0;

        // Create the new request
        Range range = new Range(null, rangeEnd);
        return new RangeWrapper(rangeSize, range);
    }

    private final class RangeWrapper {
        private final long rangeSize;
        private final Range range;

        @java.beans.ConstructorProperties({"rangeSize", "range"})
        public RangeWrapper(final long rangeSize, final Range range) {
            this.rangeSize = rangeSize;
            this.range = range;
        }

        public long getRangeSize() {
            return this.rangeSize;
        }

        public Range getRange() {
            return this.range;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof MultithreadStream.RangeWrapper)) return false;
            final MultithreadStream.RangeWrapper other = (MultithreadStream.RangeWrapper) o;
            if (this.getRangeSize() != other.getRangeSize()) return false;
            final java.lang.Object this$range = this.getRange();
            final java.lang.Object other$range = other.getRange();
            if (this$range == null ? other$range != null : !this$range.equals(other$range))
                return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final long $rangeSize = this.getRangeSize();
            result = result * PRIME + (int) ($rangeSize >>> 32 ^ $rangeSize);
            final java.lang.Object $range = this.getRange();
            result = result * PRIME + ($range == null ? 43 : $range.hashCode());
            return result;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "MultithreadStream.RangeWrapper(rangeSize="
                    + this.getRangeSize()
                    + ", range="
                    + this.getRange()
                    + ")";
        }
    }
}
