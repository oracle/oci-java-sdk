/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamChunkCreator {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamChunkCreator.class);
    private final InputStream source;
    private final long chunkLength;
    private final long sourceLength;

    private long startPosition = 0;
    private long endPosition = 0;

    public StreamChunkCreator(InputStream stream, long contentLength, long chunkLength) {
        this.source = stream;
        this.sourceLength = contentLength;
        this.chunkLength = chunkLength;
    }

    /**
     * Test for whether or not the input stream can be read in parallel. If this returns true, then
     * streams returned by {@link #next()} are safe to be read from in parallel. If this returns
     * false, then streams returned by {@link #next()} must be read from serially.
     *
     * @return true if parallel reads could be enabled, false if they could not.
     */
    public boolean supportsParallelReads() {
        return isSrcStreamDuplicable();
    }

    private boolean isSrcStreamDuplicable() {
        return source instanceof DuplicatableInputStream;
    }

    /**
     * Test for whether or not there are any more chunks that can be created.
     *
     * @return true if there are additional chunks, false if all done
     */
    public boolean hasMore() {
        return startPosition < sourceLength;
    }

    /**
     * Returns the next chunk as a new stream. Returned streams must be consumed in order unless
     * {@link #supportsParallelReads()} returned true, in which case the returned streams can be
     * read out of order.
     *
     * <p>Users should call {@link #hasMore()} before calling this.
     *
     * @return The next chunk.
     */
    public SubRangeInputStream next() {
        if (!hasMore()) {
            throw new IllegalStateException("No more chunks can be created");
        }

        // subtract to avoid overflow
        if (sourceLength - chunkLength > startPosition) {
            endPosition += chunkLength;
        } else {
            endPosition = sourceLength;
        }

        SubRangeInputStream rangeInputStream = null;

        // always use duplicated stream when possible, even if parallel reads not enabled
        if (isSrcStreamDuplicable()) {
            rangeInputStream =
                    new DuplicatedSubRangeInputStream(
                            (DuplicatableInputStream) source, startPosition, endPosition);
        } else {
            // 1) the start will be whatever the previous end was
            // 2) the stream should not be closed, the caller is responsible for closing the
            // original stream when
            // it is done with all of the chunks.
            rangeInputStream =
                    new SubRangeInputStream(
                            source, startPosition, endPosition, startPosition, false);
        }

        startPosition = endPosition;
        return rangeInputStream;
    }

    /**
     * Creates a new duplicated SubRangeInputStream. This individual sub range can be duplicated
     * multiple times (ex, for retries).
     *
     * <p>This class should be used in place of {@link SubRangeInputStream} directly when the
     * underlying input stream itself is a DuplicatableInputStream. This class will always duplicate
     * the underlying stream while maintaining the desired start and end positions.
     *
     * <p>Because this stream can be duplicated for each thread, it will support {@link
     * InputStream#mark(int)} and {@link InputStream#reset()} whenever the source stream does so,
     * because only one thread will reset it, and the threads will not interfere with each other.
     */
    public static class DuplicatedSubRangeInputStream extends SubRangeInputStream
            implements DuplicatableInputStream {
        private final long desiredStartPositionInSource;
        private final long desiredEndPositionInSource;
        private final DuplicatableInputStream duplicatableInputStream;
        private long markPosition;

        /*
         * Creates a new stream.  The given source stream will be duplicated by this constructor, callers should
         * not duplicate the stream themselves
         */
        public DuplicatedSubRangeInputStream(
                DuplicatableInputStream source,
                long desiredStartPositionInSource,
                long desiredEndPositionInSource) {
            // last 2 args are fixed
            // 1) duplicated streams always start at 0 (must skip to the desired start)
            // 2) duplicated streams should always be closed
            super(
                    source.duplicate(),
                    desiredStartPositionInSource,
                    desiredEndPositionInSource,
                    0,
                    true);
            this.markPosition = currentStartPositionInSource;
            this.duplicatableInputStream = source;
            this.desiredStartPositionInSource = desiredStartPositionInSource;
            this.desiredEndPositionInSource = desiredEndPositionInSource;
        }

        @Override
        public boolean markSupported() {
            return source.markSupported();
        }

        @Override
        public synchronized void mark(int readlimit) {
            source.mark(readlimit);
            markPosition = currentStartPositionInSource;
        }

        @Override
        public synchronized void reset() throws IOException {
            source.reset();
            currentStartPositionInSource = markPosition;
        }

        @Override
        public InputStream duplicate() {
            LOG.info("Creating a duplicate");
            return new DuplicatedSubRangeInputStream(
                    duplicatableInputStream,
                    desiredStartPositionInSource,
                    desiredEndPositionInSource);
        }
    }

    /**
     * Creates a new SubRangeInputStream that represents a sub-range of bytes from another
     * InputStream. It's assumed the sub range stream can only be read once, and a sub range of
     * bytes from another input stream.
     *
     * <p>Note: The behavior is a bit strange. A {@link SubRangeInputStream} doesn't guarantee that,
     * if you read the chunks out of order, it will actually read the designated subrange. All it
     * guarantees is that if you read all of the subranges, you have the entire source stream.
     *
     * <p>For example, if you have the stream "AABB" with a chunk size of 2. chunk1 corresponds to
     * [0,1) and chunk2 corresponds to [2,3). If you read chunk2 first, you will get "AA" and not
     * "BB". But if you read both chunks, in any order, and you concatenate the results, you will
     * get "AABB".
     *
     * <p>Because this stream cannot be duplicated for each thread, it does not support {@link
     * InputStream#mark(int)} and {@link InputStream#reset()}, even if the source stream does. This
     * is because all threads share the same stream, and resetting the stream in one thread would
     * interfere with another thread reading from the stream.
     */
    public static class SubRangeInputStream extends InputStream {
        // used to advance the start offset to the desired offset.
        private static final int MAX_SKIP_ATTEMPTS = 50;

        protected final InputStream source;
        private final long desiredStartPositionInSource;
        private final long desiredEndPositionInSource;
        private final boolean closeSource;

        protected long currentStartPositionInSource;

        private long totalBytesRead = 0;

        public SubRangeInputStream(
                InputStream source,
                long desiredStartPositionInSource,
                long desiredEndPositionInSource,
                long currentStartPositionInSource,
                boolean closeSource) {
            this.source = source;
            this.desiredStartPositionInSource = desiredStartPositionInSource;
            this.desiredEndPositionInSource = desiredEndPositionInSource;
            this.currentStartPositionInSource = currentStartPositionInSource;
            this.closeSource = closeSource;
        }

        @Override
        public int read() throws IOException {
            byte[] bytes = new byte[1];
            int bytesRead = read(bytes, 0, 1);

            if (bytesRead == -1) {
                return bytesRead;
            }
            return bytes[0];
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            // lazy forward to the desired offset, avoid infinite loop
            // by limiting how many skips we can attempt
            int remainingSkipAttempts = MAX_SKIP_ATTEMPTS;
            while (currentStartPositionInSource < desiredStartPositionInSource) {
                long bytesSkipped =
                        source.skip(desiredStartPositionInSource - currentStartPositionInSource);
                if (bytesSkipped == 0) {
                    if (--remainingSkipAttempts == 0) {
                        throw new IllegalStateException(
                                "Could not set stream to start byte of "
                                        + desiredStartPositionInSource);
                    }
                }
                currentStartPositionInSource += bytesSkipped;
            }

            long bytesRemaining = desiredEndPositionInSource - currentStartPositionInSource;
            if (bytesRemaining <= 0) {
                return -1;
            }

            if (bytesRemaining < len) {
                len = (int) bytesRemaining;
            }
            int bytesRead = source.read(b, off, len);
            currentStartPositionInSource += bytesRead;
            totalBytesRead += bytesRead;

            return bytesRead;
        }

        /**
         * Returns the length of this stream.
         *
         * @return The length in bytes.
         */
        public long length() {
            return desiredEndPositionInSource - desiredStartPositionInSource;
        }

        @Override
        public int available() throws IOException {
            if (currentStartPositionInSource < desiredEndPositionInSource) {
                long diff = desiredEndPositionInSource - currentStartPositionInSource;
                if (diff > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                return (int) (diff);
            }
            return 0;
        }

        @Override
        public void close() throws IOException {
            LOG.debug("Total bytes read {}, expected bytes {}", totalBytesRead, length());
            if (closeSource) {
                source.close();
            }
        }
    }
}
