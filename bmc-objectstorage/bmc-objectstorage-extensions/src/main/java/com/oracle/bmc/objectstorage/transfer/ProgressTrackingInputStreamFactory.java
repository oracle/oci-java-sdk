/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import jakarta.annotation.Nonnull;
import java.io.IOException;
import java.io.InputStream;

class ProgressTrackingInputStreamFactory {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ProgressTrackingInputStreamFactory.class);

    static InputStream create(final InputStream source, final ProgressTracker progressTracker) {
        if (progressTracker == null) {
            return source;
        }
        if (source instanceof DuplicatableInputStream) {
            return new DuplicatableProgressTrackingInputStream(source, progressTracker);
        }
        return new ProgressTrackingInputStream(source, progressTracker);
    }

    private static class ProgressTrackingInputStream extends InputStream {
        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProgressTrackingInputStream.class);
        private final InputStream source;
        @Nonnull private final ProgressTracker progressTracker;

        private long bytesReadSinceReset = 0L;

        @Override
        public long skip(long n) throws IOException {
            return source.skip(n);
        }

        @Override
        public int available() throws IOException {
            return source.available();
        }

        @Override
        public void mark(int readlimit) {
            source.mark(readlimit);
        }

        @Override
        public void reset() throws IOException {
            source.reset();
            progressTracker.invalidateBytesRead(bytesReadSinceReset);
            LOG.trace("Invalidated {} bytes", bytesReadSinceReset);
            bytesReadSinceReset = 0;
        }

        @Override
        public boolean markSupported() {
            return source.markSupported();
        }

        @Override
        public int read() throws IOException {
            final int data = source.read();
            if (data != -1) {
                checkAndReportBytesRead(1);
            }
            return data;
        }

        @Override
        public int read(@Nonnull byte[] b, int off, int len) throws IOException {
            if (b == null) {
                throw new RuntimeException("b is marked non-null but is null");
            }
            final int bytesRead = source.read(b, off, len);
            checkAndReportBytesRead(bytesRead);
            return bytesRead;
        }

        @Override
        public int read(@Nonnull byte[] b) throws IOException {
            if (b == null) {
                throw new RuntimeException("b is marked non-null but is null");
            }
            final int bytesRead = source.read(b);
            checkAndReportBytesRead(bytesRead);
            return bytesRead;
        }

        @Override
        public void close() throws IOException {
            source.close();
        }

        private void checkAndReportBytesRead(final int bytesRead) {
            if (bytesRead != -1) {
                bytesReadSinceReset += bytesRead;
                LOG.trace("Read {} bytes for a total of {}", bytesRead, bytesReadSinceReset);
                progressTracker.onBytesRead(bytesRead);
            }
        }

        @java.beans.ConstructorProperties({"source", "progressTracker"})
        protected ProgressTrackingInputStream(
                final InputStream source, @Nonnull final ProgressTracker progressTracker) {
            if (progressTracker == null) {
                throw new java.lang.NullPointerException(
                        "progressTracker is marked non-null but is null");
            }
            this.source = source;
            this.progressTracker = progressTracker;
        }

        protected InputStream getSource() {
            return this.source;
        }

        @Nonnull
        protected ProgressTracker getProgressTracker() {
            return this.progressTracker;
        }
    }

    private static final class DuplicatableProgressTrackingInputStream
            extends ProgressTrackingInputStream implements DuplicatableInputStream {

        private DuplicatableProgressTrackingInputStream(
                final InputStream source, final ProgressTracker progressTracker) {
            super(source, progressTracker);

            if (!(source instanceof DuplicatableInputStream)) {
                throw new IllegalStateException("Source MUST be a DuplicatableInputStream");
            }
        }

        /**
         * The progress tracking input stream resulting from this call will re-use the progress
         * tracker from the parent progress tracking input stream after resetting it, thus
         * invalidating the progress tracked by the parent stream until now. To ensure correctness
         * of the progress tracking functionality, do NOT read from the parent stream after
         * duplicating from it.
         *
         * @return The duplicated progress tracking input stream.
         */
        @Override
        public InputStream duplicate() {
            return ProgressTrackingInputStreamFactory.create(
                    ((DuplicatableInputStream) getSource()).duplicate(),
                    getProgressTracker().reset());
        }
    }
}
