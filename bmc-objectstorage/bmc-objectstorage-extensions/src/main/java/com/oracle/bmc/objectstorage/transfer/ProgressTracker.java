/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class ProgressTracker {
    @NonNull private final ProgressReporter progressReporter;
    private final long totalBytes;

    @Getter(value = AccessLevel.PROTECTED)
    private long totalBytesRead = 0;

    void onBytesRead(final long bytesRead) {
        totalBytesRead += bytesRead;
        if (totalBytesRead < 0 || totalBytesRead > totalBytes) {
            throw new IllegalStateException(
                    String.format(
                            "IllegalState - bytes read %d causes total bytes read(%d)/total bytes(%d)",
                            bytesRead,
                            totalBytesRead,
                            totalBytes));
        }
        progressReporter.onProgress(totalBytesRead, totalBytes);
    }

    ProgressTracker reset() {
        totalBytesRead = 0;
        return this;
    }

    protected void invalidateBytesRead(long invalidByteCount) {
        if (invalidByteCount > totalBytesRead) {
            throw new IllegalStateException(
                    String.format(
                            "Cannot invalidate %d bytes when total read bytes is %d",
                            invalidByteCount,
                            totalBytesRead));
        }
        totalBytesRead -= invalidByteCount;
    }
}
