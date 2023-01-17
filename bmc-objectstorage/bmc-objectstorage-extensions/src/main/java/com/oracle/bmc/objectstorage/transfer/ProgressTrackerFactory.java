/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import javax.annotation.concurrent.ThreadSafe;

abstract class ProgressTrackerFactory {
    private static final ProgressTrackerFactory DUMMY_PROGRESS_TRACKER_FACTORY =
            new ProgressTrackerFactory() {
                @Override
                ProgressTracker getProgressTracker() {
                    return null;
                }
            };

    static ProgressTrackerFactory createSingleUploadProgressTrackerFactory(
            final ProgressReporter progressReporter, final long totalBytes) {
        if (progressReporter == null) {
            return DUMMY_PROGRESS_TRACKER_FACTORY;
        }
        return new SingleUploadProgressTrackerFactory(progressReporter, totalBytes);
    }

    static ProgressTrackerFactory createMultiPartUploadProgressTrackerFactory(
            final ProgressReporter progressReporter, final long totalBytes) {
        if (progressReporter == null) {
            return DUMMY_PROGRESS_TRACKER_FACTORY;
        }
        return new MultiPartUploadProgressTrackerFactory(progressReporter, totalBytes);
    }

    abstract ProgressTracker getProgressTracker();

    private static class SingleUploadProgressTrackerFactory extends ProgressTrackerFactory {

        // This progress tracker is implicitly thread safe by definition since there is only a
        // single upload
        // going on (in a single upload thread).
        private final ProgressTracker progressTracker;

        private SingleUploadProgressTrackerFactory(
                final ProgressReporter progressReporter, final long totalBytes) {
            progressTracker = new ProgressTracker(progressReporter, totalBytes);
        }

        @Override
        ProgressTracker getProgressTracker() {
            return progressTracker;
        }
    }

    private static class MultiPartUploadProgressTrackerFactory extends ProgressTrackerFactory {
        private static final ProgressReporter DUMMY_PROGRESS_REPORTER =
                new ProgressReporter() {
                    @Override
                    public void onProgress(long completed, long total) {}
                };
        private final ProgressTracker rootProgressTracker;

        private MultiPartUploadProgressTrackerFactory(
                final ProgressReporter progressReporter, final long totalBytes) {
            rootProgressTracker = new ProgressTracker(progressReporter, totalBytes);
        }

        @Override
        ProgressTracker getProgressTracker() {
            return new SubProgressTracker();
        }

        /**
         * This progress tracker is thread-safe as updates to the aggregate root progress tracker is
         * synchronized.
         */
        @ThreadSafe
        private class SubProgressTracker extends ProgressTracker {
            private SubProgressTracker() {
                super(DUMMY_PROGRESS_REPORTER, Long.MAX_VALUE);
            }

            @Override
            void onBytesRead(final long bytesRead) {
                super.onBytesRead(bytesRead);
                synchronized (rootProgressTracker) {
                    rootProgressTracker.onBytesRead(bytesRead);
                }
            }

            @Override
            protected void invalidateBytesRead(long invalidByteCount) {
                super.invalidateBytesRead(invalidByteCount);
                synchronized (rootProgressTracker) {
                    rootProgressTracker.invalidateBytesRead(invalidByteCount);
                }
            }

            @Override
            ProgressTracker reset() {
                synchronized (rootProgressTracker) {
                    rootProgressTracker.invalidateBytesRead(getTotalBytesRead());
                }
                return super.reset();
            }
        }
    }
}
