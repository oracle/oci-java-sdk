/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import java.util.List;

import com.oracle.bmc.objectstorage.model.CommitMultipartUploadPartDetails;

public interface MultipartManifest {

    /**
     * Gets the upload ID associated with the multi-part upload.
     * @return The upload ID.
     */
    String getUploadId();

    /**
     * Check to see whether all parts have completed (successfully or unsuccessfully).
     * @return true if complete, false otherwise
     */
    boolean isUploadComplete();

    /**
     * Check to see whether all parts have completed successfully.
     * @return true if all parts completed successfully, false otherwise
     */
    boolean isUploadSuccessful();

    /**
     * Check to see if abort has been called on the upload.  Once aborted,
     * the upload cannot have anymore parts added to it.
     *
     * @return true if the upload was aborted, false if not.
     */
    boolean isUploadAborted();

    /**
     * Lists all currently parts that have completed upload so far.
     * @return The list of completed parts.
     */
    List<CommitMultipartUploadPartDetails> listCompletedParts();

    /**
     * Lists the part numbers for all parts that have failed to upload so far.
     * @return The list of failed part numbers.
     */
    List<Integer> listFailedParts();

    /**
     * Lists the part numbers for all parts that have currently not been uploaded or
     * are in progress.
     * <p>
     * In the event that an upload is aborted, parts that have not been started yet
     * will show up as in-progress in the manifest.
     *
     * @return The list of part numbers still in progress.
     */
    List<Integer> listInProgressParts();
}
