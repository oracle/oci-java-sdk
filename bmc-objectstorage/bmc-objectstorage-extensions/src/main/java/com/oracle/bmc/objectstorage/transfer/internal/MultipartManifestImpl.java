/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import com.oracle.bmc.objectstorage.model.CommitMultipartUploadPartDetails;
import com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;
import com.oracle.bmc.objectstorage.transfer.MultipartManifest;

/** Manifest impl that provides thread-safe access to an ongoing manifest upload. */
public class MultipartManifestImpl implements MultipartManifest {
    private final String uploadId;

    private final Map<Integer, PartAndStatus> parts = new HashMap<>();
    private final AtomicInteger nextPartNumber = new AtomicInteger(1);
    private final Map<PartAndStatus, Exception> partFailureDetails = new HashMap<>();

    private boolean isAborted = false;

    /**
     * Register a part that will will be uploaded using the given part number.
     *
     * @param partNumber The part number that will be uploaded.
     */
    public synchronized void registerTransfer(int partNumber) {
        PartAndStatus partAndStatus = parts.get(partNumber);
        if (partAndStatus == null) {
            partAndStatus = new PartAndStatus();
            parts.put(partNumber, partAndStatus);
        }
    }

    /**
     * Register a successful upload.
     *
     * <p>Must have called {@link #registerTransfer(int)} first.
     *
     * @param partNumber The part number of the successful upload
     * @param part
     */
    public synchronized void registerSuccess(int partNumber, UploadPartResponse part) {
        PartAndStatus partAndStatus = parts.get(partNumber);
        partAndStatus.details =
                CommitMultipartUploadPartDetails.builder()
                        .etag(part.getETag())
                        .partNum(partNumber)
                        .build();
        partAndStatus.complete = true;
        if (nextPartNumber.get() <= partNumber) {
            nextPartNumber.set(partNumber + 1);
        }
    }

    /**
     * Register a upload that was previously completed (ie, to backfill previously completed parts).
     *
     * <p>Do not have to call {@link #registerTransfer(int)} first.
     *
     * @param part
     */
    public synchronized void registerExisting(MultipartUploadPartSummary part) {
        PartAndStatus partAndStatus =
                new PartAndStatus(
                        CommitMultipartUploadPartDetails.builder()
                                .etag(part.getEtag())
                                .partNum(part.getPartNumber())
                                .build(),
                        true);
        parts.put(part.getPartNumber(), partAndStatus);
        if (nextPartNumber.get() <= part.getPartNumber()) {
            nextPartNumber.set(part.getPartNumber() + 1);
        }
    }

    /**
     * Register a failed upload.
     *
     * <p>Must have called {@link #registerTransfer(int)} first.
     *
     * @param partNumber The failed part number
     */
    public synchronized void registerFailure(int partNumber) {
        registerFailure(partNumber, null);
    }

    /**
     * Register a failed upload and the failure cause.
     *
     * <p>Must have called {@link #registerTransfer(int)} first.
     *
     * @param partNumber The failed part number
     */
    public synchronized void registerFailure(int partNumber, Exception failureException) {
        PartAndStatus partAndStatus = parts.get(partNumber);
        partAndStatus.complete = true;
        partFailureDetails.put(partAndStatus, failureException);
    }

    @Override
    public synchronized boolean isUploadComplete() {
        for (PartAndStatus part : parts.values()) {
            if (!part.complete) {
                return false;
            }
        }
        return true;
    }

    @Override
    public synchronized boolean isUploadSuccessful() {
        for (PartAndStatus part : parts.values()) {
            if (!part.complete || part.details == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public synchronized List<CommitMultipartUploadPartDetails> listCompletedParts() {
        List<CommitMultipartUploadPartDetails> completedParts = new ArrayList<>(parts.size());
        for (PartAndStatus part : parts.values()) {
            if (part.details != null) {
                completedParts.add(part.details);
            }
        }
        return completedParts;
    }

    @Override
    public synchronized List<Integer> listFailedParts() {
        List<Integer> failedParts = new ArrayList<>(parts.size());
        for (Entry<Integer, PartAndStatus> part : parts.entrySet()) {
            if (part.getValue().complete && part.getValue().details == null) {
                failedParts.add(part.getKey());
            }
        }
        return failedParts;
    }

    @Override
    public synchronized List<Integer> listInProgressParts() {
        List<Integer> todoParts = new ArrayList<>(parts.size());
        for (Entry<Integer, PartAndStatus> part : parts.entrySet()) {
            if (!part.getValue().complete) {
                todoParts.add(part.getKey());
            }
        }
        return todoParts;
    }

    @Override
    public synchronized List<MultipartUploadFailedPartDetails> listFailedPartsDetails() {
        List<MultipartUploadFailedPartDetails> failedPartsDetails = new ArrayList<>(parts.size());
        for (Entry<Integer, PartAndStatus> part : parts.entrySet()) {
            if (part.getValue().complete
                    && part.getValue().details == null
                    && partFailureDetails.get(part.getValue()) != null) {
                failedPartsDetails.add(
                        new MultipartUploadFailedPartDetails(
                                part.getKey(), partFailureDetails.get(part.getValue())));
            }
        }
        return failedPartsDetails;
    }

    @Override
    public synchronized boolean isUploadAborted() {
        return isAborted;
    }

    public synchronized void markUploadAborted() {
        isAborted = true;
    }

    /**
     * Gets the next part number that should be assigned to an upload part.
     *
     * <p>The returned part number will not be assigned again by this manifest.
     *
     * @return The next part number to assign.
     */
    public Integer nextPartNumber() {
        // always increment to avoid vending duplicate part numbers
        return nextPartNumber.getAndIncrement();
    }

    private static final class PartAndStatus {
        private CommitMultipartUploadPartDetails details;
        private boolean complete = false;

        public PartAndStatus() {}

        @java.beans.ConstructorProperties({"details", "complete"})
        public PartAndStatus(
                final CommitMultipartUploadPartDetails details, final boolean complete) {
            this.details = details;
            this.complete = complete;
        }
    }

    @java.beans.ConstructorProperties({"uploadId"})
    public MultipartManifestImpl(final String uploadId) {
        this.uploadId = uploadId;
    }

    @Override
    public String getUploadId() {
        return this.uploadId;
    }
}
