/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.internal.ObjectStorageUtils;
import com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails;
import com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails;
import com.oracle.bmc.objectstorage.model.MultipartUpload;
import com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary;
import com.oracle.bmc.objectstorage.requests.AbortMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CommitMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.ListMultipartUploadPartsRequest;
import com.oracle.bmc.objectstorage.requests.ListMultipartUploadsRequest;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.AbortMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.CreateMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.ListMultipartUploadPartsResponse;
import com.oracle.bmc.objectstorage.responses.ListMultipartUploadsResponse;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartManifestImpl;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartTransferManager;
import com.oracle.bmc.objectstorage.transfer.internal.SimpleRetry;
import com.oracle.bmc.util.StreamUtils;

import com.oracle.bmc.util.internal.Consumer;
import lombok.Builder;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.Invocation;

/**
 * MultiPartObjectAssembler provides a simplified interaction with uploading large
 * objects using multi-part uploads.
 * <p>
 * An assembler can be used begin a new upload, or resume a previous one.  Parts are
 * be added to the assembler in order, and the assembler will handle all transfers and
 * part numbering.  Users can reference the returned manifest to watch/monitor updates
 * to the upload as new parts are added or parts complete.
 * <p>
 * Note, a new assembler instance should be used for every multi-part upload.  Once
 * initialized (or resumed), an assembler cannot be reused.
 */
@Slf4j
public class MultipartObjectAssembler {
    private static final int MAX_CLIENT_REQUEST_ID_LENGTH = 40;

    private final ObjectStorage service;
    private final String namespaceName;
    private final String bucketName;
    private final String objectName;
    private final Consumer<Invocation.Builder> invocationCallback;
    private final boolean allowOverwrite;
    private final ExecutorService executorService;

    private MultipartTransferManager transferManager;
    private MultipartManifestImpl manifest;
    private boolean initialized = false;

    /**
     * The opcClientRequestId to send for all requests related to this multi-part upload.
     */
    @Setter private String opcClientRequestId = null;

    /**
     * Creates a new assembler.
     *
     * @param service The object storage service
     * @param namespaceName The namespace to use
     * @param bucketName The bucket to use
     * @param objectName The final object name.
     * @param allowOverwrite Allow uploads to overwrite existing parts with the same part number
     * @param executorService The executor service to use
     * @deprecated use {@link #builder()} instead
     */
    @Deprecated
    public MultipartObjectAssembler(
            ObjectStorage service,
            String namespaceName,
            String bucketName,
            String objectName,
            boolean allowOverwrite,
            ExecutorService executorService) {
        this(
                service,
                namespaceName,
                bucketName,
                objectName,
                allowOverwrite,
                executorService,
                null /* opcClientRequestId */,
                null /* invocationCallback */);
    }

    @Builder
    private MultipartObjectAssembler(
            ObjectStorage service,
            String namespaceName,
            String bucketName,
            String objectName,
            boolean allowOverwrite,
            ExecutorService executorService,
            String opcClientRequestId,
            Consumer<Invocation.Builder> invocationCallback) {
        this.service = service;
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.allowOverwrite = allowOverwrite;
        this.executorService = executorService;
        this.opcClientRequestId = opcClientRequestId;
        this.invocationCallback = invocationCallback;
    }

    /**
     * Initialize a new multi-part upload request.
     *
     * @param contentType The content-type of the object, optional
     * @param contentLanguage The content-language of the object, optional
     * @param contentEncoding The content-encoding of the object, optional
     * @return A new manifest instance representing the object and it's progress.
     */
    public synchronized MultipartManifest newRequest(
            String contentType,
            String contentLanguage,
            String contentEncoding,
            Map<String, String> opcMeta) {
        checkInitialized();

        String ifNoneMatch = ObjectStorageUtils.getIfNoneMatchHeader(allowOverwrite);
        CreateMultipartUploadResponse createUploadResponse =
                service.createMultipartUpload(
                        CreateMultipartUploadRequest.builder()
                                .invocationCallback(invocationCallback)
                                .bucketName(bucketName)
                                .ifNoneMatch(ifNoneMatch)
                                .namespaceName(namespaceName)
                                .createMultipartUploadDetails(
                                        CreateMultipartUploadDetails.builder()
                                                .object(objectName)
                                                .contentEncoding(contentEncoding)
                                                .contentLanguage(contentLanguage)
                                                .contentType(contentType)
                                                .metadata(opcMeta)
                                                .build())
                                .opcClientRequestId(createClientRequestId("-create"))
                                .build());

        this.manifest =
                new MultipartManifestImpl(createUploadResponse.getMultipartUpload().getUploadId());
        this.transferManager =
                new MultipartTransferManager(
                        executorService, this.manifest, new SimpleRetry(service));

        this.initialized = true;
        return this.manifest;
    }

    /**
     * Resumes an existing multi-part upload using the upload ID.
     *
     * @param uploadId The upload ID.
     * @return A new manifest instance representing the object and it's progress.
     */
    public synchronized MultipartManifest resumeRequest(String uploadId) {
        checkInitialized();

        MultipartUpload existingUpload = find(uploadId);
        if (existingUpload == null) {
            throw new IllegalArgumentException(
                    "Could not find existing upload with ID "
                            + uploadId
                            + " in namespace/bucket "
                            + namespaceName
                            + "/"
                            + bucketName);
        }

        MultipartManifestImpl manifest = new MultipartManifestImpl(uploadId);
        String nextPageToken = null;
        do {
            ListMultipartUploadPartsResponse parts =
                    service.listMultipartUploadParts(
                            ListMultipartUploadPartsRequest.builder()
                                    .invocationCallback(invocationCallback)
                                    .namespaceName(namespaceName)
                                    .bucketName(bucketName)
                                    .objectName(objectName)
                                    .uploadId(uploadId)
                                    .opcClientRequestId(createClientRequestId("-list"))
                                    .limit(100)
                                    .page(nextPageToken)
                                    .build());
            for (MultipartUploadPartSummary part : parts.getItems()) {
                manifest.registerExisting(part);
            }
            nextPageToken = parts.getOpcNextPage();
        } while (nextPageToken != null);
        this.manifest = manifest;
        this.transferManager =
                new MultipartTransferManager(
                        executorService, this.manifest, new SimpleRetry(service));

        this.initialized = true;
        return manifest;
    }

    private void checkInitialized() {
        if (initialized) {
            throw new IllegalStateException("Assembler has already been initialized");
        }
    }

    /**
     * Add the next part to the upload.  Parts will be committed in the order
     * submitted.
     * <p>
     * Calling this will set the ifNoneMatch value and will not allow overwriting existing parts.
     *
     * @param file The file to upload as the next part
     * @param md5 The MD5 checksum of the file, optional
     * @return The part number assigned to this part
     */
    public int addPart(File file, String md5) {
        InputStream stream = StreamUtils.toInputStream(file);
        return addPart(stream, file.length(), md5);
    }

    /**
     * Add the next part to the upload.  Parts will be committed in the order
     * submitted.
     * <p>
     * Calling this will set the ifNoneMatch value and will not allow overwriting existing parts.
     *
     * @param stream The stream to upload as the next part
     * @param contentLength The content length of the part
     * @param md5 The MD5 checksum, optional
     * @return The part number assigned to this part
     */
    public int addPart(InputStream stream, long contentLength, String md5) {
        int nextPartNumber = manifest.nextPartNumber();
        return doUploadPart(stream, contentLength, md5, nextPartNumber, false);
    }

    /**
     * Adds a part to the upload.  The part will be ordered based on the part
     * number provided.
     * <p>
     * This is useful to retry a failed part, to explicitly control the part
     * numbering, or overwrite an existing part.
     * <p>
     * Calling this will not set the ifNoneMatch value and will allow overwriting existing parts.
     *
     * @param file The file to upload
     * @param md5 The MD5 checksum, optional
     * @param partNum The part number to to assign to the part
     */
    public void setPart(File file, String md5, int partNum) {
        InputStream stream = StreamUtils.toInputStream(file);
        setPart(stream, file.length(), md5, partNum);
    }

    /**
     * Adds a part to the upload.  The part will be ordered based on the part
     * number provided.
     * <p>
     * This is useful to retry a failed part, to explicitly control the part
     * numbering, or overwrite an existing part.
     * <p>
     * Calling this will not set the ifNoneMatch value and will allow overwriting existing parts.
     *
     * @param stream The stream to upload
     * @param contentLength The content length of the part
     * @param md5 The MD5 checksum, optional
     * @param partNum The part number to to assign to the part
     */
    public void setPart(InputStream stream, long contentLength, String md5, int partNum) {
        doUploadPart(stream, contentLength, md5, partNum, true);
    }

    private int doUploadPart(
            InputStream stream,
            long contentLength,
            String md5,
            int partNumber,
            boolean allowPartOverwrite) {
        validateState();
        String ifNoneMatch = ObjectStorageUtils.getIfNoneMatchHeader(allowPartOverwrite);
        UploadPartRequest request =
                UploadPartRequest.builder()
                        .invocationCallback(invocationCallback)
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .contentMD5(md5)
                        .contentLength(contentLength)
                        .uploadId(manifest.getUploadId())
                        .ifNoneMatch(ifNoneMatch)
                        .uploadPartNum(partNumber)
                        .uploadPartBody(stream)
                        .opcClientRequestId(createClientRequestId("-" + partNumber))
                        .build();
        transferManager.startTransfer(request);
        return partNumber;
    }

    /**
     * Aborts the current multi-part assembly and all uploads
     * that are currently in progress.
     * @return
     */
    public AbortMultipartUploadResponse abort() {
        // allow aborted calls to call abort again (in case the first call
        // failed)
        validateState(true);
        transferManager.abortAll();
        // always mark upload as aborted to prevent any more parts
        // from being added, even if the actual abort call fails
        manifest.markUploadAborted();
        return service.abortMultipartUpload(
                AbortMultipartUploadRequest.builder()
                        .invocationCallback(invocationCallback)
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .uploadId(manifest.getUploadId())
                        .opcClientRequestId(createClientRequestId("-abort"))
                        .build());
    }

    /**
     * Commits the multi-part upload after all in-progress uploads have
     * completed.
     * <p>
     * This is a blocking call, and throws IllegalStateException if you try to commit an upload
     * in which the Manifest reports it is not successful ({@link MultipartManifest#isUploadSuccessful}).
     * @return The commit response.
     */
    public CommitMultipartUploadResponse commit() {
        validateState();

        transferManager.awaitCompletion();
        if (!manifest.isUploadSuccessful()) {
            throw new IllegalStateException(
                    "One or more parts were have not completed upload successfully");
        }

        return service.commitMultipartUpload(
                CommitMultipartUploadRequest.builder()
                        .invocationCallback(invocationCallback)
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .uploadId(manifest.getUploadId())
                        .commitMultipartUploadDetails(
                                CommitMultipartUploadDetails.builder()
                                        .partsToCommit(manifest.listCompletedParts())
                                        .partsToExclude(
                                                new ArrayList<Integer>(0)) // nothing to exclude
                                        .build())
                        .opcClientRequestId(createClientRequestId("-commit"))
                        .build());
    }

    private MultipartUpload find(String uploadId) {
        String nextPageToken = null;
        do {
            ListMultipartUploadsResponse uploads =
                    service.listMultipartUploads(
                            ListMultipartUploadsRequest.builder()
                                    .invocationCallback(invocationCallback)
                                    .namespaceName(namespaceName)
                                    .bucketName(bucketName)
                                    .limit(100)
                                    .page(nextPageToken)
                                    .opcClientRequestId(createClientRequestId("-find"))
                                    .build());
            for (MultipartUpload upload : uploads.getItems()) {
                if (uploadId.equals(upload.getUploadId())) {
                    return upload;
                }
            }
            nextPageToken = uploads.getOpcNextPage();
        } while (nextPageToken != null);
        return null;
    }

    private synchronized void validateState(boolean allowAborted) {
        if (manifest == null) {
            throw new IllegalStateException(
                    "Assember has not been initialized, must call newRequest or resumeRequest first");
        }
        if (!allowAborted && manifest.isUploadAborted()) {
            throw new IllegalStateException(
                    "Cannot complete request, upload has already been aborted");
        }
    }

    private synchronized void validateState() {
        validateState(false);
    }

    // client request ID is limited to 40 chars
    private String createClientRequestId(String suffix) {
        if (opcClientRequestId == null) {
            return suffix;
        }
        if (opcClientRequestId.length() > MAX_CLIENT_REQUEST_ID_LENGTH) {
            String truncatedUserId = opcClientRequestId.substring(0, MAX_CLIENT_REQUEST_ID_LENGTH);
            LOG.debug(
                    "Client request ID too long, truncating to '{}' to avoid errors",
                    truncatedUserId);
            return truncatedUserId;
        }
        String newClientRequestId = opcClientRequestId + suffix;
        if (newClientRequestId.length() > MAX_CLIENT_REQUEST_ID_LENGTH) {
            newClientRequestId = newClientRequestId.substring(0, MAX_CLIENT_REQUEST_ID_LENGTH);
        }
        LOG.debug("Converted client request ID to '{}'", newClientRequestId);
        return newClientRequestId;
    }
}
