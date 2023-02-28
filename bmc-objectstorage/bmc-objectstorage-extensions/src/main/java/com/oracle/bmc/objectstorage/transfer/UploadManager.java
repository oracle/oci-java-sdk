/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.internal.ClientThreadFactory;
import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.internal.ObjectStorageUtils;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartUtils;
import com.oracle.bmc.objectstorage.transfer.internal.StreamChunkCreator;
import com.oracle.bmc.objectstorage.transfer.internal.StreamHelper;
import com.oracle.bmc.retrier.DefaultRetryCondition;
import com.oracle.bmc.retrier.RetryCondition;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import jakarta.annotation.Nonnull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
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
        if (MultipartUtils.shouldCalculateMd5(uploadConfiguration, putObjectRequest)) {
            MD5Calculation md5Calculation =
                    calculateMd5(
                            putObjectRequest.getPutObjectBody(),
                            putObjectRequest.getContentLength());
            putObjectRequest =
                    PutObjectRequest.builder()
                            .copy(putObjectRequest)
                            .contentMD5(md5Calculation.md5)
                            .putObjectBody(
                                    ProgressTrackingInputStreamFactory.create(
                                            md5Calculation.streamToUse,
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
        return new UploadResponse(
                response.getETag(),
                response.getOpcContentMd5(),
                null,
                response.getOpcRequestId(),
                response.getOpcClientRequestId());
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
                    MD5Calculation md5Calculation = calculateMd5(chunk, chunk.length());
                    assembler.addPart(
                            ProgressTrackingInputStreamFactory.create(
                                    md5Calculation.streamToUse,
                                    progressTrackerFactory.getProgressTracker()),
                            chunk.length(),
                            md5Calculation.md5);
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
            return new UploadResponse(
                    response.getETag(),
                    null,
                    response.getOpcMultipartMd5(),
                    response.getOpcRequestId(),
                    response.getOpcClientRequestId());
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

        return MultipartObjectAssembler.builder()
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
                .retryConfiguration(retryToUse)
                .build();
    }

    private static ExecutorService buildDefaultParallelExecutor() {
        return Executors.newFixedThreadPool(
                DEFAULT_NUM_MULTIPART_THREADS_PER_REQUEST,
                ClientThreadFactory.builder()
                        .nameFormat("multipart-upload-" + System.currentTimeMillis() + "-%d")
                        .isDaemon(true)
                        .build());
    }

    private static MD5Calculation calculateMd5(InputStream stream, Long contentLength) {
        String md5 = null;
        InputStream streamToReturn = null;

        if (stream instanceof DuplicatableInputStream) {
            md5 =
                    performMd5Calculation(
                            ((DuplicatableInputStream) stream).duplicate(),
                            new StreamHelper.NullOutputStream(),
                            contentLength);
            streamToReturn = stream;
        } else {
            LOG.info(
                    "About to copy object into memory to calculate MD5, may lead to OutOfMemory exceptions");
            if (contentLength.longValue() > Integer.MAX_VALUE) {
                throw new BmcException(
                        false,
                        "Cannot compute MD5 client-size as content length ("
                                + contentLength.longValue()
                                + ") is larger than max buffer.  Disable MD5 enforcement or provide a DuplicableInputStream to avoid this problem",
                        null,
                        null);
            }
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream(contentLength.intValue());
                md5 = performMd5Calculation(stream, baos, contentLength);
                streamToReturn = StreamUtils.createByteArrayInputStream(baos.toByteArray());
            } catch (OutOfMemoryError oom) {
                OutOfMemoryError newOom =
                        new OutOfMemoryError(
                                "Could not compute MD5.  Disable MD5 enforcement or provide a DuplicableInputStream to avoid this problem");
                newOom.initCause(oom);
                throw newOom;
            }
        }
        return new MD5Calculation(streamToReturn, md5);
    }

    private static String performMd5Calculation(
            InputStream stream, OutputStream outputStream, long contentLength) {
        DigestOutputStream digestOutputStream =
                StreamHelper.createMd5MessageOutputStream(outputStream);
        long bytesCopied;
        try {
            bytesCopied = StreamHelper.copy(stream, digestOutputStream);
        } catch (IOException e) {
            throw new BmcException(false, "Unable to calculate MD5", e, null);
        }
        if (bytesCopied != contentLength) {
            throw new BmcException(
                    false,
                    "Failed to read all bytes while calculating MD5: "
                            + bytesCopied
                            + ", "
                            + contentLength,
                    null,
                    null);
        }
        return StreamHelper.base64Encode(digestOutputStream.getMessageDigest());
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
            this.eTag = eTag;
            this.contentMd5 = contentMd5;
            this.multipartMd5 = multipartMd5;
            this.opcRequestId = opcRequestId;
            this.opcClientRequestId = opcClientRequestId;
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

        @java.lang.Override
        public java.lang.String toString() {
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
                    + ")";
        }
    }

    private static class MD5Calculation {
        private final InputStream streamToUse;
        private final String md5;

        @java.beans.ConstructorProperties({"streamToUse", "md5"})
        public MD5Calculation(final InputStream streamToUse, final String md5) {
            this.streamToUse = streamToUse;
            this.md5 = md5;
        }
    }

    @java.beans.ConstructorProperties({"objectStorage", "uploadConfiguration"})
    public UploadManager(
            final ObjectStorage objectStorage, final UploadConfiguration uploadConfiguration) {
        this.objectStorage = objectStorage;
        this.uploadConfiguration = uploadConfiguration;
    }
}
