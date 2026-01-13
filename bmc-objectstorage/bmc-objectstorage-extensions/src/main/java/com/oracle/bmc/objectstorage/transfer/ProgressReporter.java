/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

public interface ProgressReporter {
    /**
     * Notification to indicate that progress was made during an upload operation.
     *
     * <p>Note that the {@code completed} value may decrease from one invocation to the next if any
     * part of the upload to to be retried.
     *
     * @param completed The number of bytes that have been already been uploaded for this operation.
     * @param total The total number of bytes to upload for this operation.
     */
    void onProgress(final long completed, final long total);
}
