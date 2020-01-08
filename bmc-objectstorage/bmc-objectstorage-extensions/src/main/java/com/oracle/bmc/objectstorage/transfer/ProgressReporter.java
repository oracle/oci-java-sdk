/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

public interface ProgressReporter {
    /**
     * Notification to indicate that progress was made during an upload operation.
     *
     * @param completed The number of bytes that have been already been uploaded for this operation.
     * @param total The total number of bytes to upload for this operation.
     */
    void onProgress(final long completed, final long total);
}
