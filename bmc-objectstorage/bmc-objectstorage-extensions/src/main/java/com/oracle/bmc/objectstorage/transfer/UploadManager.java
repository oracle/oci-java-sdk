/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import com.oracle.bmc.objectstorage.transfer.internal.ChecksumUtils;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.internal.ClientThreadFactory;
import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.internal.ObjectStorageUtils;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartUtils;
import com.oracle.bmc.objectstorage.transfer.internal.StreamChunkCreator;
import com.oracle.bmc.retrier.DefaultRetryCondition;
import com.oracle.bmc.retrier.RetryCondition;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import jakarta.annotation.Nonnull;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * UploadManager simplifies interaction with the Object Storage service by abstracting away the
 * method used to upload objects. Depending on the configuration parameters, UploadManager may
 * choose to do a single PutObject request, or break up the upload into multiple parts and utilize
 * multi-part uploads.
 *
 * <p>An advantage of using multi-part uploads is the ability to retry individual failed parts, as
 * well as being able to upload parts in parallel to reduce upload time.
 *
 * <p>Callers still have full control over how the UploadManager decides to perform the upload using
 * {@link UploadConfiguration}. Callers who want even more control, or need to combine multiple
 * files should look at using {@link MultipartObjectAssembler} directly.
 */
public class UploadManager {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadManager.class);

    private static final int DEFAULT_NUM_MULTIPART_THREADS_PER_REQUEST = 3;
    private static final String UPLOAD_MANAGER_DEBUG_INFORMATION_LOG =
            String.format(
                    "\nClient Version: %s, OS Version: %s\nSee https://docs.oracle.com/iaas/Content/API/Concepts/sdk_troubleshooting.htm for common issues and steps to resolve them.\nIf you need to contact support, or file a GitHub issue, please include this full error message.",
                    ClientRuntime.getRuntime().getClientInfo(), System.getProperty("os.version"));

    /** Default retry condition, but added timeout, -1, and 409 "ConcurrentObjectUpdate". */
    private static final RetryCondition RETRY_CONDITION =
            new DefaultRetryCondition() {
                @Override
                public boolean shouldBeRetried(@Nonnull BmcException e) {
                    if (e == null) {
                        throw new java.lang.NullPointerException(
                                "e is marked non-null but is null");
                    }
                    return super.shouldBeRetried(e)
                            || e.getStatusCode() == -1
                            || (e.getStatusCode() == 409
                                    && "ConcurrentObjectUpdate".equals(e.getServiceCode()));
                }
            };

    static final RetryConfiguration RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(5))
                    .delayStrategy(new ExponentialBackoffDelayStrategy(100))
                    .retryCondition(exception -> RETRY_CONDITION.shouldBeRetried(exception))
                    .build();

    private final ObjectStorage objectStorage;
    private final UploadConfiguration uploadConfiguration;

    /**
     * Initiates a new upload request. The upload manager will decide whether to use a single
     * PutObject call or multi-part uploads depending on the {@link UploadConfiguration} specified.
     *
     * <p>Note, if multi-part is used, no MD5 will be returned in the response. Also, if a
     * multi-part upload attempt fails, the UploadManager will attempt to abort the upload to avoid
     * leaving partially complete uploads and parts (unless explicitly disabled via
     * UploadConfiguration).
     *
     * @param uploadDetails The upload request.
     * @return The response.
     * @throws BmcException if the upload fails for any reason.
     */
    public UploadResponse upload(UploadRequest uploadDetails) {
        if (MultipartUtils.shouldUseMultipart(
                uploadConfiguration, uploadDetails.putObjectRequest.getContentLength())) {
            return multipartUpload(uploadDetails);
        }

        return singleUpload(uploadDetails, uploadDetails.putObjectRequest.getContentLength());
    }

    private UploadResponse singleUpload(UploadRequest uploadRequest, long contentLength) {
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        uploadRequest.progressReporter, contentLength);
        PutObjectRequest putObjectRequest = uploadRequest.putObjectRequest;
        ChecksumAlgorithm algorithm = uploadConfiguration.getAdditionalChecksumAlgorithm();
        ChecksumAlgorithm enforceAlgoChecksum =
                uploadConfiguration.getEnforceAdditionalChecksumBeforeUpload();

        if (MultipartUtils.shouldCalculateMd5(uploadConfiguration, putObjectRequest)) {
            ChecksumUtils.MD5Calculation md5Calculation =
                    ChecksumUtils.calculateMd5(
                            putObjectRequest.getPutObjectBody(),
                            putObjectRequest.getContentLength());
            putObjectRequest =
                    PutObjectRequest.builder()
                            .copy(putObjectRequest)
                            .contentMD5(md5Calculation.getMd5())
                            .putObjectBody(
                                    ProgressTrackingInputStreamFactory.create(
                                            md5Calculation.getStreamToUse(),
                                            progressTrackerFactory.getProgressTracker()))
                            .build();
        } else if (MultipartUtils.shouldCalculateAdditionalChecksum(
                uploadConfiguration, putObjectRequest)) {
            putObjectRequest =
                    updateRequestWithChecksum(
                            putObjectRequest, enforceAlgoChecksum, progressTrackerFactory);
        } else if (MultipartUtils.shouldSetAdditionalChecksum(
                uploadConfiguration, putObjectRequest)) {
            putObjectRequest =
                    PutObjectRequest.builder()
                            .copy(putObjectRequest)
                            .opcChecksumAlgorithm(algorithm)
                            .putObjectBody(
                                    ProgressTrackingInputStreamFactory.create(
                                            putObjectRequest.getPutObjectBody(),
                                            progressTrackerFactory.getProgressTracker()))
                            .build();
        } else {
            putObjectRequest =
                    PutObjectRequest.builder()
                            .copy(putObjectRequest)
                            .putObjectBody(
                                    ProgressTrackingInputStreamFactory.create(
                                            putObjectRequest.getPutObjectBody(),
                                            progressTrackerFactory.getProgressTracker()))
                            .build();
        }

        /* RetryConfiguration used should either be the one set on this UploadRequest or a default */
        putObjectRequest.setRetryConfiguration(
                getRetryToUse(putObjectRequest.getRetryConfiguration()));

        PutObjectResponse response = objectStorage.putObject(putObjectRequest);

        return buildUploadResponse(
                response,
                algorithm,
                enforceAlgoChecksum,
                putObjectRequest.getOpcChecksumAlgorithm(),
                false);
    }

    private UploadResponse multipartUpload(UploadRequest uploadRequest) {
        PutObjectRequest request = uploadRequest.putObjectRequest;
        ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(
                        uploadRequest.progressReporter, request.getContentLength());

        long sizePerPart =
                MultipartUtils.calculatePartSize(uploadConfiguration, request.getContentLength());
        StreamChunkCreator chunkCreator =
                new StreamChunkCreator(
                        request.getPutObjectBody(), request.getContentLength(), sizePerPart);

        final ExecutorService executorServiceToUse;
        final boolean shutdownExecutor;
        ChecksumAlgorithm algorithm = uploadConfiguration.getAdditionalChecksumAlgorithm();
        ChecksumAlgorithm enforceAlgoChecksum =
                uploadConfiguration.getEnforceAdditionalChecksumBeforeMultipartUpload();

        if (uploadConfiguration.isAllowParallelUploads() && chunkCreator.supportsParallelReads()) {
            if (uploadRequest.parallelUploadExecutorService != null) {
                executorServiceToUse = uploadRequest.parallelUploadExecutorService;
                shutdownExecutor = false;
            } else {
                executorServiceToUse = buildDefaultParallelExecutor();
                shutdownExecutor = true;
            }
        } else {
            // chunks must be processed in order, use a
            // new single thread executor per upload request
            executorServiceToUse = Executors.newSingleThreadExecutor();
            shutdownExecutor = true;
        }

        MultipartObjectAssembler assembler =
                createAssembler(request, uploadRequest, executorServiceToUse);
        MultipartManifest manifest = null;
        try {
            manifest =
                    assembler.newRequest(
                            request.getContentType(),
                            request.getContentLanguage(),
                            request.getContentEncoding(),
                            request.getOpcMeta());
            int partCount = 0;
            while (chunkCreator.hasMore()) {
                LOG.trace("Creating part {}", ++partCount);
                StreamChunkCreator.SubRangeInputStream chunk = chunkCreator.next();
                if (uploadConfiguration.isEnforceMd5BeforeMultipartUpload()) {
                    ChecksumUtils.MD5Calculation md5Calculation =
                            ChecksumUtils.calculateMd5(chunk, chunk.length());
                    assembler.addPart(
                            ProgressTrackingInputStreamFactory.create(
                                    md5Calculation.getStreamToUse(),
                                    progressTrackerFactory.getProgressTracker()),
                            chunk.length(),
                            md5Calculation.getMd5());
                } else if (uploadConfiguration.getEnforceAdditionalChecksumBeforeMultipartUpload()
                        != null) {
                    addPartWithChecksum(
                            assembler, chunk, enforceAlgoChecksum, progressTrackerFactory);
                } else if (MultipartUtils.shouldSetAdditionalChecksum(
                        uploadConfiguration, request)) {
                    assembler.addPart(
                            ProgressTrackingInputStreamFactory.create(
                                    chunk, progressTrackerFactory.getProgressTracker()),
                            chunk.length(),
                            null,
                            algorithm.getValue());
                } else if (request.getOpcChecksumAlgorithm() != null) {
                    assembler.addPart(
                            ProgressTrackingInputStreamFactory.create(
                                    chunk, progressTrackerFactory.getProgressTracker()),
                            chunk.length(),
                            null,
                            request.getOpcChecksumAlgorithm().getValue());
                } else {
                    assembler.addPart(
                            ProgressTrackingInputStreamFactory.create(
                                    chunk, progressTrackerFactory.getProgressTracker()),
                            chunk.length(),
                            null);
                }
            }
            LOG.debug("Created {} parts", partCount);
            CommitMultipartUploadResponse response = assembler.commit();

            return buildUploadResponse(
                    response,
                    algorithm,
                    enforceAlgoChecksum,
                    request.getOpcChecksumAlgorithm(),
                    true);
        } catch (Exception e) {
            if (manifest != null) {
                LOG.error(
                        "Failed to upload object using multi-part uploads. Failed part numbers = '{}'. Successful parts = '{}'. {}",
                        manifest.listFailedParts(),
                        manifest.listCompletedParts(),
                        UPLOAD_MANAGER_DEBUG_INFORMATION_LOG);

                // try to abort uploads that failed to avoid creating lots of lingering uploads and
                // parts.
                if (uploadConfiguration.isDisableAutoAbort()) {
                    LOG.info(
                            "Not aborting failed multipart upload {} per configuration, client must manually abort it",
                            manifest.getUploadId());
                } else {
                    try {
                        assembler.abort();
                    } catch (Exception e2) {
                        LOG.warn(
                                "Failed to abort multipart upload {} after failure to upload object. {}",
                                manifest.getUploadId(),
                                UPLOAD_MANAGER_DEBUG_INFORMATION_LOG,
                                e2);
                    }
                }
            }

            if (e instanceof BmcException) {
                throw e;
            }
            throw new BmcException(
                    false, "Failed to upload object using multi-part uploads", e, null);
        } finally {
            // always close the source stream at this point
            StreamUtils.closeQuietly(uploadRequest.putObjectRequest.getPutObjectBody());

            if (shutdownExecutor) {
                executorServiceToUse.shutdownNow();
            }
        }
    }

    private UploadResponse buildUploadResponse(
            BmcResponse response,
            ChecksumAlgorithm algorithm,
            ChecksumAlgorithm enforceAlgoChecksum,
            ChecksumAlgorithm requestAlgorithm,
            boolean isMultipart) {
        UploadResponse.Builder responseBuilder = new UploadResponse.Builder();

        if (response instanceof PutObjectResponse) {
            PutObjectResponse putObjectResponse = (PutObjectResponse) response;
            responseBuilder
                    .eTag(putObjectResponse.getETag())
                    .opcRequestId(putObjectResponse.getOpcRequestId())
                    .opcClientRequestId(putObjectResponse.getOpcClientRequestId())
                    .contentMd5(putObjectResponse.getOpcContentMd5());
        } else if (response instanceof CommitMultipartUploadResponse) {
            CommitMultipartUploadResponse commitResponse = (CommitMultipartUploadResponse) response;
            responseBuilder
                    .eTag(commitResponse.getETag())
                    .opcRequestId(commitResponse.getOpcRequestId())
                    .opcClientRequestId(commitResponse.getOpcClientRequestId())
                    .multipartMd5(commitResponse.getOpcMultipartMd5());
        } else {
            throw new IllegalArgumentException(
                    "Unsupported response type: " + response.getClass().getName());
        }

        ChecksumAlgorithm checksumAlgorithm =
                algorithm != null
                        ? algorithm
                        : enforceAlgoChecksum != null ? enforceAlgoChecksum : requestAlgorithm;

        if (checksumAlgorithm != null) {
            String responseChecksum =
                    ChecksumUtils.getResponseChecksum(response, checksumAlgorithm, isMultipart);
            if (responseChecksum != null) {
                switch (checksumAlgorithm) {
                    case Crc32C:
                        responseBuilder.contentCrc32c(responseChecksum);
                        break;
                    case Sha256:
                        if (isMultipart) {
                            responseBuilder.multipartSha256(responseChecksum);
                        } else {
                            responseBuilder.contentSha256(responseChecksum);
                        }
                        break;
                    case Sha384:
                        if (isMultipart) {
                            responseBuilder.multipartSha384(responseChecksum);
                        } else {
                            responseBuilder.contentSha384(responseChecksum);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException(
                                "Unsupported checksum algorithm: " + checksumAlgorithm);
                }
            }
        }

        return responseBuilder.build();
    }

    private PutObjectRequest updateRequestWithChecksum(
            PutObjectRequest putObjectRequest,
            ChecksumAlgorithm algorithm,
            ProgressTrackerFactory progressTrackerFactory) {

        InputStream streamToUse;
        String checksum;
        PutObjectRequest.Builder requestBuilder =
                PutObjectRequest.builder().copy(putObjectRequest).opcChecksumAlgorithm(algorithm);

        switch (algorithm) {
            case Crc32C:
                ChecksumUtils.CRC32CCalculation crc32CCalculation =
                        ChecksumUtils.calculateCrc32c(
                                putObjectRequest.getPutObjectBody(),
                                putObjectRequest.getContentLength());
                streamToUse = crc32CCalculation.getStreamToUse();
                checksum = crc32CCalculation.getCrc32c();
                requestBuilder.opcContentCrc32c(checksum);
                break;
            case Sha256:
                ChecksumUtils.SHA256Calculation sha256Calculation =
                        ChecksumUtils.calculateSha256(
                                putObjectRequest.getPutObjectBody(),
                                putObjectRequest.getContentLength());
                streamToUse = sha256Calculation.getStreamToUse();
                checksum = sha256Calculation.getSha256();
                requestBuilder.opcContentSha256(checksum);
                break;
            case Sha384:
                ChecksumUtils.SHA384Calculation sha384Calculation =
                        ChecksumUtils.calculateSha384(
                                putObjectRequest.getPutObjectBody(),
                                putObjectRequest.getContentLength());
                streamToUse = sha384Calculation.getStreamToUse();
                checksum = sha384Calculation.getSha384();
                requestBuilder.opcContentSha384(checksum);
                break;
            default:
                throw new IllegalArgumentException("Unsupported checksum algorithm: " + algorithm);
        }

        return requestBuilder
                .putObjectBody(
                        ProgressTrackingInputStreamFactory.create(
                                streamToUse, progressTrackerFactory.getProgressTracker()))
                .build();
    }

    private void addPartWithChecksum(
            MultipartObjectAssembler assembler,
            StreamChunkCreator.SubRangeInputStream chunk,
            ChecksumAlgorithm algorithm,
            ProgressTrackerFactory progressTrackerFactory) {

        InputStream streamToUse;
        String checksum;

        switch (algorithm) {
            case Crc32C:
                ChecksumUtils.CRC32CCalculation crc32CCalculation =
                        ChecksumUtils.calculateCrc32c(chunk, chunk.length());
                streamToUse = crc32CCalculation.getStreamToUse();
                checksum = crc32CCalculation.getCrc32c();
                assembler.addPart(
                        ProgressTrackingInputStreamFactory.create(
                                streamToUse, progressTrackerFactory.getProgressTracker()),
                        chunk.length(),
                        checksum,
                        algorithm.getValue());
                break;
            case Sha256:
                ChecksumUtils.SHA256Calculation sha256Calculation =
                        ChecksumUtils.calculateSha256(chunk, chunk.length());
                streamToUse = sha256Calculation.getStreamToUse();
                checksum = sha256Calculation.getSha256();
                assembler.addPart(
                        ProgressTrackingInputStreamFactory.create(
                                streamToUse, progressTrackerFactory.getProgressTracker()),
                        chunk.length(),
                        checksum,
                        algorithm.getValue());
                break;
            case Sha384:
                ChecksumUtils.SHA384Calculation sha384Calculation =
                        ChecksumUtils.calculateSha384(chunk, chunk.length());
                streamToUse = sha384Calculation.getStreamToUse();
                checksum = sha384Calculation.getSha384();
                assembler.addPart(
                        ProgressTrackingInputStreamFactory.create(
                                streamToUse, progressTrackerFactory.getProgressTracker()),
                        chunk.length(),
                        checksum,
                        algorithm.getValue());
                break;
            default:
                throw new UnsupportedOperationException(
                        "Unsupported checksum algorithm: " + algorithm);
        }
    }

    /**
     * Determines the first non-null RetryConfiguration 1 -> RetryConfiguration set on
     * UploadConfiguration 2 -> Default static RetryConfiguration for UploadManager
     *
     * @return RetryConfiguration first non-null condition or UploadManager default
     */
    private static RetryConfiguration getRetryToUse(RetryConfiguration... configs) {
        for (RetryConfiguration cfg : configs) {
            if (cfg != null) return cfg;
        }

        return UploadManager.RETRY_CONFIGURATION;
    }

    @VisibleForTesting
    protected MultipartObjectAssembler createAssembler(
            PutObjectRequest request,
            UploadRequest uploadRequest,
            ExecutorService executorService) {

        // in case request != uploadRequest.putObjectRequest then choose the correct
        // RetryConfiguration
        RetryConfiguration retryToUse =
                getRetryToUse(
                        uploadRequest.putObjectRequest.getRetryConfiguration(),
                        request.getRetryConfiguration());

        MultipartObjectAssembler.MultipartObjectAssemblerBuilder assemblerBuilder =
                MultipartObjectAssembler.builder()
                        .allowOverwrite(uploadRequest.allowOverwrite)
                        .bucketName(request.getBucketName())
                        .executorService(executorService)
                        .invocationCallback(request.getInvocationCallback())
                        .namespaceName(request.getNamespaceName())
                        .objectName(request.getObjectName())
                        .storageTier(request.getStorageTier())
                        .opcClientRequestId(request.getOpcClientRequestId())
                        .service(objectStorage)
                        .cacheControl(request.getCacheControl())
                        .contentDisposition(request.getContentDisposition())
                        .retryConfiguration(retryToUse);

        if (uploadConfiguration.getAdditionalChecksumAlgorithm() != null) {
            assemblerBuilder.additionalChecksumAlgorithm(
                    uploadConfiguration.getAdditionalChecksumAlgorithm());
        } else if (request.getOpcChecksumAlgorithm() != null) {
            assemblerBuilder.additionalChecksumAlgorithm(request.getOpcChecksumAlgorithm());
        }

        return assemblerBuilder.build();
    }

    private static ExecutorService buildDefaultParallelExecutor() {
        return Executors.newFixedThreadPool(
                DEFAULT_NUM_MULTIPART_THREADS_PER_REQUEST,
                ClientThreadFactory.builder()
                        .nameFormat("multipart-upload-" + System.currentTimeMillis() + "-%d")
                        .isDaemon(true)
                        .build());
    }

    public static class UploadRequest {
        private final PutObjectRequest putObjectRequest;
        private final ExecutorService parallelUploadExecutorService;
        private final boolean allowOverwrite;
        private final ProgressReporter progressReporter;

        /**
         * Creates a new {@link UploadRequestBuilder} using the given stream and content length. The
         * stream and length will be used to create the final put object request.
         *
         * <p>Note, when providing an InputStream, callers can use {@link StreamUtils} to help
         * create streams that can be read from in parallel (if multi-part upload is used), which
         * should decrease the time to upload the entire object.
         *
         * @param stream The stream that should be uploaded.
         * @param contentLength The content length of the object.
         * @return a new UploadRequestBuilder instance.
         */
        public static UploadRequestBuilder builder(InputStream stream, long contentLength) {
            return new UploadRequestBuilder(stream, contentLength);
        }

        /**
         * Creates a new {@link UploadRequestBuilder} using the given file. The file and length
         * (derived from {@link File#length()}) will be used to create the final put object request.
         *
         * @param file The file that should be uploaded.
         * @return a new UploadRequestBuilder instance.
         */
        public static UploadRequestBuilder builder(File file) {
            InputStream stream = StreamUtils.toInputStream(file);
            try {
                return new UploadRequestBuilder(stream, file.length());
            } catch (Exception e) {
                StreamUtils.closeQuietly(stream);
                throw e;
            }
        }

        public static class UploadRequestBuilder {
            private final InputStream inputStream;
            private final long contentLength;

            // always allow objects to be overwritten unless explicitly disabled
            private boolean allowOverwrite = true;
            private ExecutorService parallelUploadExecutorService;
            private ProgressReporter progressReporter;

            /**
             * Configures whether or not the if-none-match header will be used to prevent overwrites
             * on PUT. If this is disabled, the ifNoneMatch value in the PutObjectRequest builder
             * will be overwritten with "*".
             *
             * <p>The default value is 'true'.
             *
             * @param allowOverwrite true to allow objects to be overwritten, false if not.
             * @return This builder instance
             */
            public UploadRequestBuilder allowOverwrite(boolean allowOverwrite) {
                this.allowOverwrite = allowOverwrite;
                return this;
            }

            /**
             * Sets the executor service that should be used if the upload being made uses
             * multi-part uploads. If none is provided, the UploadManager will create a new Executor
             * <i>per upload request</i>. If the caller prefers to have a shared executor, one can
             * be created by the caller and set on every UploadRequest through this method.
             *
             * @param parallelUploadExecutorService The executor to use.
             * @return This builder instance
             */
            public UploadRequestBuilder parallelUploadExecutorService(
                    ExecutorService parallelUploadExecutorService) {
                this.parallelUploadExecutorService = parallelUploadExecutorService;
                return this;
            }

            /**
             * Sets the progress reporter that is used to notify of updates during the upload. If
             * none is provided, then no progress updates shall be reported.
             *
             * @param progressReporter The progress reporter to use.
             * @return This builder instance
             */
            public UploadRequestBuilder progressReporter(ProgressReporter progressReporter) {
                this.progressReporter = progressReporter;
                return this;
            }

            /**
             * Builds a new UploadRequest instance. The body and content length will be set on the
             * given request based on the original values provided when creating the builder.
             *
             * @param request The request containing all param except the body and content length.
             * @return A new request instance.
             */
            public UploadRequest build(PutObjectRequest request) {
                String ifNoneMatch = ObjectStorageUtils.getIfNoneMatchHeader(allowOverwrite);
                return new UploadRequest(
                        PutObjectRequest.builder()
                                .copy(request)
                                .putObjectBody(inputStream)
                                .contentLength(contentLength)
                                .ifNoneMatch(ifNoneMatch)
                                .build(),
                        parallelUploadExecutorService,
                        allowOverwrite,
                        progressReporter);
            }

            @java.beans.ConstructorProperties({"inputStream", "contentLength"})
            public UploadRequestBuilder(final InputStream inputStream, final long contentLength) {
                this.inputStream = inputStream;
                this.contentLength = contentLength;
            }
        }

        @java.beans.ConstructorProperties({
            "putObjectRequest",
            "parallelUploadExecutorService",
            "allowOverwrite",
            "progressReporter"
        })
        public UploadRequest(
                final PutObjectRequest putObjectRequest,
                final ExecutorService parallelUploadExecutorService,
                final boolean allowOverwrite,
                final ProgressReporter progressReporter) {
            this.putObjectRequest = putObjectRequest;
            this.parallelUploadExecutorService = parallelUploadExecutorService;
            this.allowOverwrite = allowOverwrite;
            this.progressReporter = progressReporter;
        }
    }

    /** The result referencing the uploaded object. */
    public static class UploadResponse {
        /** The etag of the object uploaded. */
        private final String eTag;
        /**
         * The MD5 of the object uploaded.
         *
         * <p>Will be null if the object was uploaded using multi-part. See {@link
         * #getMultipartMd5()} instead.
         */
        private final String contentMd5;
        /**
         * The multipart MD5 of the object uploaded.
         *
         * <p>Will be null if the object was uploaded using standard put-object. See {@link
         * #getContentMd5()} instead.
         */
        private final String multipartMd5;
        /**
         * The opc-request-id associated with either the PutObject call or the final
         * CommitMultipartUpload call (if multi-part upload was used).
         */
        private final String opcRequestId;
        /** The opc-client-request-id sent with every request, if provided. */
        private final String opcClientRequestId;
        /** The CRC32C of the single or multipart object uploaded. */
        private final String contentCrc32c;
        /** The SHA256 of the object uploaded. */
        private final String contentSha256;
        /** The SHA384 of the object uploaded. */
        private final String contentSha384;
        /** The SHA256 of the multipart object uploaded. */
        private final String multipartSha256;
        /** The SHA384 of the multipart object uploaded. */
        private final String multipartSha384;

        @java.beans.ConstructorProperties({
            "eTag",
            "contentMd5",
            "multipartMd5",
            "opcRequestId",
            "opcClientRequestId"
        })
        public UploadResponse(
                final String eTag,
                final String contentMd5,
                final String multipartMd5,
                final String opcRequestId,
                final String opcClientRequestId) {
            this(
                    eTag,
                    contentMd5,
                    multipartMd5,
                    opcRequestId,
                    opcClientRequestId,
                    null,
                    null,
                    null,
                    null,
                    null);
        }

        @java.beans.ConstructorProperties({
            "eTag",
            "contentMd5",
            "multipartMd5",
            "opcRequestId",
            "opcClientRequestId",
            "contentCrc32c",
            "contentSha256",
            "contentSha384",
            "multipartSha256",
            "multipartSha384"
        })
        public UploadResponse(
                final String eTag,
                final String contentMd5,
                final String multipartMd5,
                final String opcRequestId,
                final String opcClientRequestId,
                final String contentCrc32c,
                final String contentSha256,
                final String contentSha384,
                final String multipartSha256,
                final String multipartSha384) {
            this.eTag = eTag;
            this.contentMd5 = contentMd5;
            this.multipartMd5 = multipartMd5;
            this.opcRequestId = opcRequestId;
            this.opcClientRequestId = opcClientRequestId;
            this.contentCrc32c = contentCrc32c;
            this.contentSha256 = contentSha256;
            this.contentSha384 = contentSha384;
            this.multipartSha256 = multipartSha256;
            this.multipartSha384 = multipartSha384;
        }

        private UploadResponse(Builder builder) {
            this.eTag = builder.eTag;
            this.contentMd5 = builder.contentMd5;
            this.multipartMd5 = builder.multipartMd5;
            this.opcRequestId = builder.opcRequestId;
            this.opcClientRequestId = builder.opcClientRequestId;
            this.contentCrc32c = builder.contentCrc32c;
            this.contentSha256 = builder.contentSha256;
            this.contentSha384 = builder.contentSha384;
            this.multipartSha256 = builder.multipartSha256;
            this.multipartSha384 = builder.multipartSha384;
        }

        /** The etag of the object uploaded. */
        public String getETag() {
            return this.eTag;
        }

        /**
         * The MD5 of the object uploaded.
         *
         * <p>Will be null if the object was uploaded using multi-part. See {@link
         * #getMultipartMd5()} instead.
         */
        public String getContentMd5() {
            return this.contentMd5;
        }

        /**
         * The multipart MD5 of the object uploaded.
         *
         * <p>Will be null if the object was uploaded using standard put-object. See {@link
         * #getContentMd5()} instead.
         */
        public String getMultipartMd5() {
            return this.multipartMd5;
        }

        /**
         * The opc-request-id associated with either the PutObject call or the final
         * CommitMultipartUpload call (if multi-part upload was used).
         */
        public String getOpcRequestId() {
            return this.opcRequestId;
        }

        /** The opc-client-request-id sent with every request, if provided. */
        public String getOpcClientRequestId() {
            return this.opcClientRequestId;
        }

        /** The CRC32C of the single or multipart object uploaded. */
        public String getContentCrc32c() {
            return this.contentCrc32c;
        }

        /** The SHA256 of the object uploaded. */
        public String getContentSha256() {
            return this.contentSha256;
        }

        /** The SHA384 of the object uploaded. */
        public String getContentSha384() {
            return this.contentSha384;
        }

        /** The SHA256 of the multipart object uploaded. */
        public String getMultipartSha256() {
            return this.multipartSha256;
        }

        /** The SHA384 of the multipart object uploaded. */
        public String getMultipartSha384() {
            return this.multipartSha384;
        }

        @Override
        public String toString() {
            return "UploadManager.UploadResponse(eTag="
                    + this.getETag()
                    + ", contentMd5="
                    + this.getContentMd5()
                    + ", multipartMd5="
                    + this.getMultipartMd5()
                    + ", opcRequestId="
                    + this.getOpcRequestId()
                    + ", opcClientRequestId="
                    + this.getOpcClientRequestId()
                    + ", contentCrc32c="
                    + this.getContentCrc32c()
                    + ", contentSha256="
                    + this.getContentSha256()
                    + ", contentSha384="
                    + this.getContentSha384()
                    + ", multipartSha256="
                    + this.getMultipartSha256()
                    + ", multipartSha384="
                    + this.getMultipartSha384()
                    + ")";
        }

        public static class Builder {
            private String eTag;
            private String contentMd5;
            private String multipartMd5;
            private String opcRequestId;
            private String opcClientRequestId;
            private String contentCrc32c;
            private String contentSha256;
            private String contentSha384;
            private String multipartSha256;
            private String multipartSha384;

            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            public Builder contentMd5(String contentMd5) {
                this.contentMd5 = contentMd5;
                return this;
            }

            public Builder multipartMd5(String multipartMd5) {
                this.multipartMd5 = multipartMd5;
                return this;
            }

            public Builder opcRequestId(String opcRequestId) {
                this.opcRequestId = opcRequestId;
                return this;
            }

            public Builder opcClientRequestId(String opcClientRequestId) {
                this.opcClientRequestId = opcClientRequestId;
                return this;
            }

            public Builder contentCrc32c(String contentCrc32c) {
                this.contentCrc32c = contentCrc32c;
                return this;
            }

            public Builder contentSha256(String contentSha256) {
                this.contentSha256 = contentSha256;
                return this;
            }

            public Builder contentSha384(String contentSha384) {
                this.contentSha384 = contentSha384;
                return this;
            }

            public Builder multipartSha256(String multipartSha256) {
                this.multipartSha256 = multipartSha256;
                return this;
            }

            public Builder multipartSha384(String multipartSha384) {
                this.multipartSha384 = multipartSha384;
                return this;
            }

            public UploadResponse build() {
                return new UploadResponse(this);
            }
        }
    }

    @java.beans.ConstructorProperties({"objectStorage", "uploadConfiguration"})
    public UploadManager(
            final ObjectStorage objectStorage, final UploadConfiguration uploadConfiguration) {
        this.objectStorage = objectStorage;
        this.uploadConfiguration = uploadConfiguration;
    }
}
