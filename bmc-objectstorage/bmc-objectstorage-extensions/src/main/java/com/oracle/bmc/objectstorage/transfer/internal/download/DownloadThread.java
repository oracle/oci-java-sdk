/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.IOException;
import java.io.InterruptedIOException;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.DownloadManager;

/**
 * A {@link DownloadThread} object has two important methods, {@link #run()} and {@link
 * #read(byte[], int, int)}.
 *
 * <p>{@link #run()} should be run asynchronously. It performs a request and reads data into the
 * provided buffer.
 *
 * <p>{@link #read(byte[], int, int)} is used by another thread that wants to consume the data that
 * is being read.
 */
public class DownloadThread {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DownloadThread.class);

    /** Used to perform the request. */
    private final DownloadManager downloadManager;

    /** The object we are getting. */
    private final GetObjectRequest getObjectRequest;

    /**
     * The size of the range to be read. In the case of end-only ranges ("bytes=-99"), only the
     * first rangeSize number of bytes will be read.
     */
    private final int rangeSize;

    /** The buffer we read into. */
    private final byte[] buffer;

    /** Used to synchronize {@link #run()} and {@link #read(byte[], int, int).} */
    private final Object lock;

    /** The amount of data we have to read. */
    private int objectSize;

    /**
     * The next point in {@link #buffer} that we will write to. This value is incremented by {@link
     * #run()} and {@link #lock} is notified whenever the value is incremented.
     */
    private volatile int writeTo;

    /**
     * If {@link #run()} fails this will be set to a non-null value. {@link #lock} is notified if
     * this value is set.
     */
    private volatile Throwable error;

    /**
     * The last point in {@link #buffer} we read from. This value is only read and written by {@link
     * #read(byte[], int, int)} while holding {@link #lock}.
     */
    private volatile int readFrom;

    /**
     * Set this to stop the async thread from running. The read thread will exit when it sees this
     * set.
     */
    private volatile boolean cancelRequested;

    /**
     * When the read thread stops because {@link #cancelRequested} is true it sets this to true and
     * notifies {@link #lock}.
     */
    private volatile boolean threadCancelled;

    public DownloadThread(
            DownloadManager downloadManager,
            GetObjectRequest getObjectRequest,
            byte[] buffer,
            int rangeSize) {
        assert rangeSize <= buffer.length;

        this.downloadManager = downloadManager;
        this.getObjectRequest = getObjectRequest;
        this.rangeSize = rangeSize;
        this.buffer = buffer;
        this.lock = new Object();
        this.writeTo = 0;
        this.readFrom = 0;
        this.error = null;
        // We will not know the object size until we do our read
        this.objectSize = Integer.MAX_VALUE;
    }

    /** Ask the background thread to stop running. */
    public void requestCancel() {
        this.cancelRequested = true;
    }

    /**
     * Start reading data into {@link #buffer} where it can be read by {@link #read(byte[], int,
     * int)}.
     */
    public byte[] run() throws IOException {
        LOG.debug(
                "Reading the first {} bytes from range '{}' from {}/{}/{}",
                this.rangeSize,
                this.getObjectRequest.getRange(),
                this.getObjectRequest.getNamespaceName(),
                this.getObjectRequest.getBucketName(),
                this.getObjectRequest.getObjectName());
        try {
            final GetObjectResponse getObjectResponse =
                    this.downloadManager.getObject_singleThreaded(this.getObjectRequest);
            try {
                LOG.debug(
                        "buffer.length = '{}', rangeSize = '{}', contentLength = '{}'",
                        this.buffer.length,
                        this.rangeSize,
                        getObjectResponse.getContentLength());
                this.objectSize =
                        Math.min(
                                Math.toIntExact(getObjectResponse.getContentLength()),
                                this.rangeSize);
                assert this.objectSize <= this.buffer.length;
                assert this.objectSize <= this.rangeSize;
                while (true) {
                    assert this.writeTo >= this.readFrom;
                    assert this.writeTo <= this.buffer.length;

                    // If the operation is cancelled we stop the thread.
                    if (this.cancelRequested) {
                        break;
                    }

                    final int dataRemaining = this.objectSize - this.writeTo;
                    if (dataRemaining <= 0) {
                        break;
                    }
                    final int bytesRead =
                            getObjectResponse
                                    .getInputStream()
                                    .read(this.buffer, this.writeTo, dataRemaining);
                    if (bytesRead < 0) {
                        LOG.error(
                                "Truncated download. Got {} from read (expected {} bytes remaining)",
                                bytesRead,
                                dataRemaining);
                        throw new IOException("Truncated read");
                    }
                    assert bytesRead > 0;
                    LOG.trace("Read {} bytes from response", bytesRead);
                    synchronized (this.lock) {
                        this.writeTo += bytesRead;
                        this.lock.notify();
                    }
                }
            } finally {
                getObjectResponse.getInputStream().close();
                if (this.cancelRequested) {
                    LOG.warn("Async read was cancelled");
                    synchronized (this.lock) {
                        this.threadCancelled = true;
                        this.lock.notify();
                    }
                }
            }
        } catch (Throwable t) {
            LOG.error("Asynchronous object read failed", t);
            synchronized (this.lock) {
                this.error = t;
                this.lock.notify();
            }
            throw t;
        }

        return this.buffer;
    }

    /** Returns true if all data has been read. */
    public boolean allDataRead() {
        return this.readFrom >= this.objectSize;
    }

    /**
     * Read data from {@link #buffer}. If there is no
     *
     * @param b
     * @param off
     * @param len
     * @return
     * @throws InterruptedException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }

        // Where in the buffer we should copy data from
        final int bufferIndex;

        // Where we should copy the data to
        final int dataLength;

        synchronized (this.lock) {
            // Wait until we are at the end of the buffer, we hit an error, or
            // there is something to read.
            while (!this.threadCancelled
                    && this.error == null
                    && this.readFrom < this.objectSize
                    && this.readFrom >= this.writeTo) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                    throw new IOException("wait() was interrupted", e);
                }
            }

            if (this.threadCancelled) {
                throw new InterruptedIOException("Async read was cancelled");
            }

            // Throw an exception if the background thread got an error.
            if (this.error != null) {
                throw new IOException("Asynchronous read failed", this.error);
            }

            // Nothing to read? Return -1.
            if (this.readFrom >= this.objectSize) {
                return -1;
            }

            // Copy out the data we have
            final int available = this.writeTo - this.readFrom;
            assert available > 0;
            dataLength = Math.min(len, available);
            bufferIndex = this.readFrom;
            this.readFrom += dataLength;
        }

        // We have some data to copy out
        System.arraycopy(this.buffer, bufferIndex, b, off, dataLength);
        LOG.trace("Got {} bytes from buffer", dataLength);
        return dataLength;
    }
}
