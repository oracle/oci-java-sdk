/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.io.DuplicatableInputStream;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class StreamChunkCreator {
    private final InputStream source;
    private final long chunkLength;
    private final long sourceLength;

    private boolean canDuplicate = false;
    private long startPosition = 0;
    private long endPosition = 0;

    public StreamChunkCreator(InputStream stream, long contentLength, long chunkLength) {
        this.source = stream;
        this.sourceLength = contentLength;
        this.chunkLength = chunkLength;
    }

    /**
     * Attempt to enable parallel reads from the underlying stream.  If this returns true,
     * then streams returned by {@link #next()} are safe to be read from in parallel.  If this
     * returns false, then streams returned by {@link #next()} must be read from serially.
     *
     * @return true if parallel reads could be enabled, false if they could not.
     */
    public boolean enableParallelReads() {
        if (source instanceof DuplicatableInputStream) {
            canDuplicate = true;
        }
        return canDuplicate;
    }

    private boolean isSrcStreamDuplicable() {
        return source instanceof DuplicatableInputStream;
    }

    /**
     * Test for whether or not there are any more chunks that can be created.
     * @return true if there are additional chunks, false if all done
     */
    public boolean hasMore() {
        return startPosition < sourceLength;
    }

    /**
     * Returns the next chunk as a new stream.  Returned streams must be
     * consumed in order unless {@link #enableParallelReads()} was called and
     * returned true, in which case the returned streams can be read out of order.
     * <p>
     * Users should call {@link #hasMore()} before calling this.
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

        if (isSrcStreamDuplicable()) {
            rangeInputStream =
                    new DuplicatedSubRangeInputStream(
                            (DuplicatableInputStream) source, startPosition, endPosition);
        } else {
            // 1) the start will be whatever the previous end was
            // 2) the stream should not be closed, the caller is responsible for closing the original stream when
            // it is done with all of the chunks.
            rangeInputStream =
                    new SubRangeInputStream(
                            source, startPosition, endPosition, startPosition, false);
        }

        startPosition = endPosition;
        return rangeInputStream;
    }

    /**
     * Creates a new duplicated SubRangeInputStream.  This individual sub range can be duplicated multiple times
     * (ex, for retries).
     * <p>
     * This class should be used in place of {@link SubRangeInputStream} directly when the underlying input stream itself
     * is a DuplicatableInputStream.  This class will always duplicate the underlying stream while maintaining the desired
     * start and end positions.
     */
    public static class DuplicatedSubRangeInputStream extends SubRangeInputStream
            implements DuplicatableInputStream {
        private final long desiredStartPositionInSource;
        private final long desiredEndPositionInSource;
        private final DuplicatableInputStream duplicatableInputStream;

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
            this.duplicatableInputStream = source;
            this.desiredStartPositionInSource = desiredStartPositionInSource;
            this.desiredEndPositionInSource = desiredEndPositionInSource;
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
     * Creates a new SubRangeInputStream that represents a sub-range of bytes from another InputStream.
     * It's assumed the sub range stream can only be read once, and a sub range of bytes from another input stream.
     */
    public static class SubRangeInputStream extends InputStream {
        // used to advance the start offset to the desired offset.
        private static final int MAX_SKIP_ATTEMPTS = 50;

        private final InputStream source;
        private final long desiredStartPositionInSource;
        private final long desiredEndPositionInSource;
        private final boolean closeSource;

        private long currentStartPositionInSource;
        private long markPosition;

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
            this.markPosition = currentStartPositionInSource;
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
         * @return The length in bytes.
         */
        public long length() {
            return desiredEndPositionInSource - desiredStartPositionInSource;
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
