/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
                            "IllegalState - bytes read %d causes total bytes read(%d) > total bytes(%d)",
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
