/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements MediaServices {
    /** Service instance for MediaServices. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MEDIASERVICES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://mediaservices.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MediaServicesClient.class);

    private final MediaServicesWaiters waiters;

    private final MediaServicesPaginators paginators;

    MediaServicesClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("MediaServices-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MediaServicesWaiters(executorService, this);

        this.paginators = new MediaServicesPaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MediaServicesClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MediaServicesClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MediaServicesClient(this, authenticationDetailsProvider, executorService);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public ChangeMediaAssetCompartmentResponse changeMediaAssetCompartment(
            ChangeMediaAssetCompartmentRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");
        Objects.requireNonNull(
                request.getChangeMediaAssetCompartmentDetails(),
                "changeMediaAssetCompartmentDetails is required");

        return clientCall(request, ChangeMediaAssetCompartmentResponse::builder)
                .logger(LOG, "changeMediaAssetCompartment")
                .serviceDetails(
                        "MediaServices",
                        "ChangeMediaAssetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/ChangeMediaAssetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMediaAssetCompartmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMediaAssetCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMediaWorkflowCompartmentResponse changeMediaWorkflowCompartment(
            ChangeMediaWorkflowCompartmentRequest request) {

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");
        Objects.requireNonNull(
                request.getChangeMediaWorkflowCompartmentDetails(),
                "changeMediaWorkflowCompartmentDetails is required");

        return clientCall(request, ChangeMediaWorkflowCompartmentResponse::builder)
                .logger(LOG, "changeMediaWorkflowCompartment")
                .serviceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ChangeMediaWorkflowCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMediaWorkflowCompartmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMediaWorkflowCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMediaWorkflowConfigurationCompartmentResponse
            changeMediaWorkflowConfigurationCompartment(
                    ChangeMediaWorkflowConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeMediaWorkflowConfigurationCompartmentDetails(),
                "changeMediaWorkflowConfigurationCompartmentDetails is required");

        return clientCall(request, ChangeMediaWorkflowConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeMediaWorkflowConfigurationCompartment")
                .serviceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/ChangeMediaWorkflowConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMediaWorkflowConfigurationCompartmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMediaWorkflowConfigurationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowConfigurationCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMediaWorkflowJobCompartmentResponse changeMediaWorkflowJobCompartment(
            ChangeMediaWorkflowJobCompartmentRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeMediaWorkflowJobCompartmentDetails(),
                "changeMediaWorkflowJobCompartmentDetails is required");

        return clientCall(request, ChangeMediaWorkflowJobCompartmentResponse::builder)
                .logger(LOG, "changeMediaWorkflowJobCompartment")
                .serviceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/ChangeMediaWorkflowJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMediaWorkflowJobCompartmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMediaWorkflowJobCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowJobCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeStreamDistributionChannelCompartmentResponse
            changeStreamDistributionChannelCompartment(
                    ChangeStreamDistributionChannelCompartmentRequest request) {

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamDistributionChannelCompartmentDetails(),
                "changeStreamDistributionChannelCompartmentDetails is required");

        return clientCall(request, ChangeStreamDistributionChannelCompartmentResponse::builder)
                .logger(LOG, "changeStreamDistributionChannelCompartment")
                .serviceDetails(
                        "MediaServices",
                        "ChangeStreamDistributionChannelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/ChangeStreamDistributionChannelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamDistributionChannelCompartmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeStreamDistributionChannelCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeStreamDistributionChannelCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMediaAssetResponse createMediaAsset(CreateMediaAssetRequest request) {
        Objects.requireNonNull(
                request.getCreateMediaAssetDetails(), "createMediaAssetDetails is required");

        return clientCall(request, CreateMediaAssetResponse::builder)
                .logger(LOG, "createMediaAsset")
                .serviceDetails(
                        "MediaServices",
                        "CreateMediaAsset",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/CreateMediaAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMediaAssetRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAsset.class,
                        CreateMediaAssetResponse.Builder::mediaAsset)
                .handleResponseHeaderString("etag", CreateMediaAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMediaAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMediaWorkflowResponse createMediaWorkflow(CreateMediaWorkflowRequest request) {
        Objects.requireNonNull(
                request.getCreateMediaWorkflowDetails(), "createMediaWorkflowDetails is required");

        return clientCall(request, CreateMediaWorkflowResponse::builder)
                .logger(LOG, "createMediaWorkflow")
                .serviceDetails(
                        "MediaServices",
                        "CreateMediaWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/CreateMediaWorkflow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMediaWorkflowRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflow.class,
                        CreateMediaWorkflowResponse.Builder::mediaWorkflow)
                .handleResponseHeaderString("etag", CreateMediaWorkflowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMediaWorkflowResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMediaWorkflowConfigurationResponse createMediaWorkflowConfiguration(
            CreateMediaWorkflowConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateMediaWorkflowConfigurationDetails(),
                "createMediaWorkflowConfigurationDetails is required");

        return clientCall(request, CreateMediaWorkflowConfigurationResponse::builder)
                .logger(LOG, "createMediaWorkflowConfiguration")
                .serviceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/CreateMediaWorkflowConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMediaWorkflowConfigurationRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.class,
                        CreateMediaWorkflowConfigurationResponse.Builder
                                ::mediaWorkflowConfiguration)
                .handleResponseHeaderString(
                        "etag", CreateMediaWorkflowConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMediaWorkflowConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMediaWorkflowJobResponse createMediaWorkflowJob(
            CreateMediaWorkflowJobRequest request) {
        Objects.requireNonNull(
                request.getCreateMediaWorkflowJobDetails(),
                "createMediaWorkflowJobDetails is required");

        return clientCall(request, CreateMediaWorkflowJobResponse::builder)
                .logger(LOG, "createMediaWorkflowJob")
                .serviceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowJob",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/CreateMediaWorkflowJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMediaWorkflowJobRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJob.class,
                        CreateMediaWorkflowJobResponse.Builder::mediaWorkflowJob)
                .handleResponseHeaderString("etag", CreateMediaWorkflowJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMediaWorkflowJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateStreamCdnConfigResponse createStreamCdnConfig(
            CreateStreamCdnConfigRequest request) {
        Objects.requireNonNull(
                request.getCreateStreamCdnConfigDetails(),
                "createStreamCdnConfigDetails is required");

        return clientCall(request, CreateStreamCdnConfigResponse::builder)
                .logger(LOG, "createStreamCdnConfig")
                .serviceDetails(
                        "MediaServices",
                        "CreateStreamCdnConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/CreateStreamCdnConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamCdnConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfig.class,
                        CreateStreamCdnConfigResponse.Builder::streamCdnConfig)
                .handleResponseHeaderString("etag", CreateStreamCdnConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamCdnConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateStreamDistributionChannelResponse createStreamDistributionChannel(
            CreateStreamDistributionChannelRequest request) {
        Objects.requireNonNull(
                request.getCreateStreamDistributionChannelDetails(),
                "createStreamDistributionChannelDetails is required");

        return clientCall(request, CreateStreamDistributionChannelResponse::builder)
                .logger(LOG, "createStreamDistributionChannel")
                .serviceDetails(
                        "MediaServices",
                        "CreateStreamDistributionChannel",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/CreateStreamDistributionChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamDistributionChannelRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.class,
                        CreateStreamDistributionChannelResponse.Builder::streamDistributionChannel)
                .handleResponseHeaderString(
                        "etag", CreateStreamDistributionChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateStreamDistributionChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateStreamPackagingConfigResponse createStreamPackagingConfig(
            CreateStreamPackagingConfigRequest request) {
        Objects.requireNonNull(
                request.getCreateStreamPackagingConfigDetails(),
                "createStreamPackagingConfigDetails is required");

        return clientCall(request, CreateStreamPackagingConfigResponse::builder)
                .logger(LOG, "createStreamPackagingConfig")
                .serviceDetails(
                        "MediaServices",
                        "CreateStreamPackagingConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/CreateStreamPackagingConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamPackagingConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfig.class,
                        CreateStreamPackagingConfigResponse.Builder::streamPackagingConfig)
                .handleResponseHeaderString(
                        "etag", CreateStreamPackagingConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamPackagingConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMediaAssetResponse deleteMediaAsset(DeleteMediaAssetRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        return clientCall(request, DeleteMediaAssetResponse::builder)
                .logger(LOG, "deleteMediaAsset")
                .serviceDetails(
                        "MediaServices",
                        "DeleteMediaAsset",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/DeleteMediaAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMediaAssetRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendEnumQueryParam("deleteMode", request.getDeleteMode())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMediaAssetDistributionChannelAttachmentResponse
            deleteMediaAssetDistributionChannelAttachment(
                    DeleteMediaAssetDistributionChannelAttachmentRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        Validate.notBlank(
                request.getDistributionChannelId(), "distributionChannelId must not be blank");

        return clientCall(request, DeleteMediaAssetDistributionChannelAttachmentResponse::builder)
                .logger(LOG, "deleteMediaAssetDistributionChannelAttachment")
                .serviceDetails(
                        "MediaServices",
                        "DeleteMediaAssetDistributionChannelAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachment/DeleteMediaAssetDistributionChannelAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMediaAssetDistributionChannelAttachmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("distributionChannelAttachments")
                .appendPathParam(request.getDistributionChannelId())
                .appendQueryParam("version", request.getVersion())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMediaAssetDistributionChannelAttachmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMediaWorkflowResponse deleteMediaWorkflow(DeleteMediaWorkflowRequest request) {

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");

        return clientCall(request, DeleteMediaWorkflowResponse::builder)
                .logger(LOG, "deleteMediaWorkflow")
                .serviceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/DeleteMediaWorkflow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMediaWorkflowRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaWorkflowResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMediaWorkflowConfigurationResponse deleteMediaWorkflowConfiguration(
            DeleteMediaWorkflowConfigurationRequest request) {

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");

        return clientCall(request, DeleteMediaWorkflowConfigurationResponse::builder)
                .logger(LOG, "deleteMediaWorkflowConfiguration")
                .serviceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/DeleteMediaWorkflowConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMediaWorkflowConfigurationRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMediaWorkflowConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMediaWorkflowConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMediaWorkflowJobResponse deleteMediaWorkflowJob(
            DeleteMediaWorkflowJobRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, DeleteMediaWorkflowJobResponse::builder)
                .logger(LOG, "deleteMediaWorkflowJob")
                .serviceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowJob",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/DeleteMediaWorkflowJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMediaWorkflowJobRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMediaWorkflowJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaWorkflowJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteStreamCdnConfigResponse deleteStreamCdnConfig(
            DeleteStreamCdnConfigRequest request) {

        Validate.notBlank(request.getStreamCdnConfigId(), "streamCdnConfigId must not be blank");

        return clientCall(request, DeleteStreamCdnConfigResponse::builder)
                .logger(LOG, "deleteStreamCdnConfig")
                .serviceDetails(
                        "MediaServices",
                        "DeleteStreamCdnConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/DeleteStreamCdnConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamCdnConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendPathParam(request.getStreamCdnConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamCdnConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteStreamDistributionChannelResponse deleteStreamDistributionChannel(
            DeleteStreamDistributionChannelRequest request) {

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");

        return clientCall(request, DeleteStreamDistributionChannelResponse::builder)
                .logger(LOG, "deleteStreamDistributionChannel")
                .serviceDetails(
                        "MediaServices",
                        "DeleteStreamDistributionChannel",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/DeleteStreamDistributionChannel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamDistributionChannelRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteStreamDistributionChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteStreamPackagingConfigResponse deleteStreamPackagingConfig(
            DeleteStreamPackagingConfigRequest request) {

        Validate.notBlank(
                request.getStreamPackagingConfigId(), "streamPackagingConfigId must not be blank");

        return clientCall(request, DeleteStreamPackagingConfigResponse::builder)
                .logger(LOG, "deleteStreamPackagingConfig")
                .serviceDetails(
                        "MediaServices",
                        "DeleteStreamPackagingConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/DeleteStreamPackagingConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamPackagingConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendPathParam(request.getStreamPackagingConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamPackagingConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaAssetResponse getMediaAsset(GetMediaAssetRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        return clientCall(request, GetMediaAssetResponse::builder)
                .logger(LOG, "getMediaAsset")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaAsset",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/GetMediaAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaAssetRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAsset.class,
                        GetMediaAssetResponse.Builder::mediaAsset)
                .handleResponseHeaderString("etag", GetMediaAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMediaAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaAssetDistributionChannelAttachmentResponse
            getMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        Validate.notBlank(
                request.getDistributionChannelId(), "distributionChannelId must not be blank");

        return clientCall(request, GetMediaAssetDistributionChannelAttachmentResponse::builder)
                .logger(LOG, "getMediaAssetDistributionChannelAttachment")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaAssetDistributionChannelAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachment/GetMediaAssetDistributionChannelAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaAssetDistributionChannelAttachmentRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("distributionChannelAttachments")
                .appendPathParam(request.getDistributionChannelId())
                .appendQueryParam("version", request.getVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                .class,
                        GetMediaAssetDistributionChannelAttachmentResponse.Builder
                                ::mediaAssetDistributionChannelAttachment)
                .handleResponseHeaderString(
                        "etag", GetMediaAssetDistributionChannelAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMediaAssetDistributionChannelAttachmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaWorkflowResponse getMediaWorkflow(GetMediaWorkflowRequest request) {

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");

        return clientCall(request, GetMediaWorkflowResponse::builder)
                .logger(LOG, "getMediaWorkflow")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/GetMediaWorkflow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaWorkflowRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflow.class,
                        GetMediaWorkflowResponse.Builder::mediaWorkflow)
                .handleResponseHeaderString("etag", GetMediaWorkflowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMediaWorkflowResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaWorkflowConfigurationResponse getMediaWorkflowConfiguration(
            GetMediaWorkflowConfigurationRequest request) {

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");

        return clientCall(request, GetMediaWorkflowConfigurationResponse::builder)
                .logger(LOG, "getMediaWorkflowConfiguration")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaWorkflowConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/GetMediaWorkflowConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaWorkflowConfigurationRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.class,
                        GetMediaWorkflowConfigurationResponse.Builder::mediaWorkflowConfiguration)
                .handleResponseHeaderString(
                        "etag", GetMediaWorkflowConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMediaWorkflowConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaWorkflowJobResponse getMediaWorkflowJob(GetMediaWorkflowJobRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, GetMediaWorkflowJobResponse::builder)
                .logger(LOG, "getMediaWorkflowJob")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaWorkflowJob",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/GetMediaWorkflowJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaWorkflowJobRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJob.class,
                        GetMediaWorkflowJobResponse.Builder::mediaWorkflowJob)
                .handleResponseHeaderString("etag", GetMediaWorkflowJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMediaWorkflowJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMediaWorkflowJobFactResponse getMediaWorkflowJobFact(
            GetMediaWorkflowJobFactRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, GetMediaWorkflowJobFactResponse::builder)
                .logger(LOG, "getMediaWorkflowJobFact")
                .serviceDetails(
                        "MediaServices",
                        "GetMediaWorkflowJobFact",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJobFact/GetMediaWorkflowJobFact")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMediaWorkflowJobFactRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .appendPathParam("facts")
                .appendPathParam(request.getKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJobFact.class,
                        GetMediaWorkflowJobFactResponse.Builder::mediaWorkflowJobFact)
                .handleResponseHeaderString("etag", GetMediaWorkflowJobFactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMediaWorkflowJobFactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStreamCdnConfigResponse getStreamCdnConfig(GetStreamCdnConfigRequest request) {

        Validate.notBlank(request.getStreamCdnConfigId(), "streamCdnConfigId must not be blank");

        return clientCall(request, GetStreamCdnConfigResponse::builder)
                .logger(LOG, "getStreamCdnConfig")
                .serviceDetails(
                        "MediaServices",
                        "GetStreamCdnConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/GetStreamCdnConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamCdnConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendPathParam(request.getStreamCdnConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfig.class,
                        GetStreamCdnConfigResponse.Builder::streamCdnConfig)
                .handleResponseHeaderString("etag", GetStreamCdnConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamCdnConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStreamDistributionChannelResponse getStreamDistributionChannel(
            GetStreamDistributionChannelRequest request) {

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");

        return clientCall(request, GetStreamDistributionChannelResponse::builder)
                .logger(LOG, "getStreamDistributionChannel")
                .serviceDetails(
                        "MediaServices",
                        "GetStreamDistributionChannel",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/GetStreamDistributionChannel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamDistributionChannelRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.class,
                        GetStreamDistributionChannelResponse.Builder::streamDistributionChannel)
                .handleResponseHeaderString(
                        "etag", GetStreamDistributionChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetStreamDistributionChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStreamPackagingConfigResponse getStreamPackagingConfig(
            GetStreamPackagingConfigRequest request) {

        Validate.notBlank(
                request.getStreamPackagingConfigId(), "streamPackagingConfigId must not be blank");

        return clientCall(request, GetStreamPackagingConfigResponse::builder)
                .logger(LOG, "getStreamPackagingConfig")
                .serviceDetails(
                        "MediaServices",
                        "GetStreamPackagingConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/GetStreamPackagingConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamPackagingConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendPathParam(request.getStreamPackagingConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfig.class,
                        GetStreamPackagingConfigResponse.Builder::streamPackagingConfig)
                .handleResponseHeaderString("etag", GetStreamPackagingConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamPackagingConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public IngestStreamDistributionChannelResponse ingestStreamDistributionChannel(
            IngestStreamDistributionChannelRequest request) {

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");
        Objects.requireNonNull(
                request.getIngestStreamDistributionChannelDetails(),
                "ingestStreamDistributionChannelDetails is required");

        return clientCall(request, IngestStreamDistributionChannelResponse::builder)
                .logger(LOG, "ingestStreamDistributionChannel")
                .serviceDetails(
                        "MediaServices",
                        "IngestStreamDistributionChannel",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/IngestStreamDistributionChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IngestStreamDistributionChannelRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .appendPathParam("actions")
                .appendPathParam("ingest")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.IngestStreamDistributionChannelResult
                                .class,
                        IngestStreamDistributionChannelResponse.Builder
                                ::ingestStreamDistributionChannelResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        IngestStreamDistributionChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaAssetDistributionChannelAttachmentsResponse
            listMediaAssetDistributionChannelAttachments(
                    ListMediaAssetDistributionChannelAttachmentsRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        return clientCall(request, ListMediaAssetDistributionChannelAttachmentsResponse::builder)
                .logger(LOG, "listMediaAssetDistributionChannelAttachments")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaAssetDistributionChannelAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachmentCollection/ListMediaAssetDistributionChannelAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaAssetDistributionChannelAttachmentsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("distributionChannelAttachments")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("distributionChannelId", request.getDistributionChannelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model
                                .MediaAssetDistributionChannelAttachmentCollection.class,
                        ListMediaAssetDistributionChannelAttachmentsResponse.Builder
                                ::mediaAssetDistributionChannelAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMediaAssetDistributionChannelAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMediaAssetDistributionChannelAttachmentsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaAssetsResponse listMediaAssets(ListMediaAssetsRequest request) {

        return clientCall(request, ListMediaAssetsResponse::builder)
                .logger(LOG, "listMediaAssets")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaAssets",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/ListMediaAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaAssetsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("distributionChannelId", request.getDistributionChannelId())
                .appendQueryParam("parentMediaAssetId", request.getParentMediaAssetId())
                .appendQueryParam("masterMediaAssetId", request.getMasterMediaAssetId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("bucketName", request.getBucketName())
                .appendQueryParam("objectName", request.getObjectName())
                .appendQueryParam("mediaWorkflowJobId", request.getMediaWorkflowJobId())
                .appendQueryParam("sourceMediaWorkflowId", request.getSourceMediaWorkflowId())
                .appendQueryParam(
                        "sourceMediaWorkflowVersion", request.getSourceMediaWorkflowVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAssetCollection.class,
                        ListMediaAssetsResponse.Builder::mediaAssetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMediaAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMediaAssetsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaWorkflowConfigurationsResponse listMediaWorkflowConfigurations(
            ListMediaWorkflowConfigurationsRequest request) {

        return clientCall(request, ListMediaWorkflowConfigurationsResponse::builder)
                .logger(LOG, "listMediaWorkflowConfigurations")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaWorkflowConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfigurationCollection/ListMediaWorkflowConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaWorkflowConfigurationsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfigurationCollection
                                .class,
                        ListMediaWorkflowConfigurationsResponse.Builder
                                ::mediaWorkflowConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMediaWorkflowConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMediaWorkflowConfigurationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaWorkflowJobFactsResponse listMediaWorkflowJobFacts(
            ListMediaWorkflowJobFactsRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, ListMediaWorkflowJobFactsResponse::builder)
                .logger(LOG, "listMediaWorkflowJobFacts")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobFacts",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJobFact/ListMediaWorkflowJobFacts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaWorkflowJobFactsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .appendPathParam("facts")
                .appendQueryParam("key", request.getKey())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactCollection.class,
                        ListMediaWorkflowJobFactsResponse.Builder::mediaWorkflowJobFactCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMediaWorkflowJobFactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMediaWorkflowJobFactsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaWorkflowJobsResponse listMediaWorkflowJobs(
            ListMediaWorkflowJobsRequest request) {

        return clientCall(request, ListMediaWorkflowJobsResponse::builder)
                .logger(LOG, "listMediaWorkflowJobs")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobs",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/ListMediaWorkflowJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaWorkflowJobsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("mediaWorkflowId", request.getMediaWorkflowId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJobCollection.class,
                        ListMediaWorkflowJobsResponse.Builder::mediaWorkflowJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMediaWorkflowJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMediaWorkflowJobsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaWorkflowTaskDeclarationsResponse listMediaWorkflowTaskDeclarations(
            ListMediaWorkflowTaskDeclarationsRequest request) {

        return clientCall(request, ListMediaWorkflowTaskDeclarationsResponse::builder)
                .logger(LOG, "listMediaWorkflowTaskDeclarations")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaWorkflowTaskDeclarations",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowTaskDeclarationCollection/ListMediaWorkflowTaskDeclarations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaWorkflowTaskDeclarationsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowTaskDeclarations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("isCurrent", request.getIsCurrent())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclarationCollection
                                .class,
                        ListMediaWorkflowTaskDeclarationsResponse.Builder
                                ::mediaWorkflowTaskDeclarationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMediaWorkflowTaskDeclarationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMediaWorkflowTaskDeclarationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMediaWorkflowsResponse listMediaWorkflows(ListMediaWorkflowsRequest request) {

        return clientCall(request, ListMediaWorkflowsResponse::builder)
                .logger(LOG, "listMediaWorkflows")
                .serviceDetails(
                        "MediaServices",
                        "ListMediaWorkflows",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ListMediaWorkflows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMediaWorkflowsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowCollection.class,
                        ListMediaWorkflowsResponse.Builder::mediaWorkflowCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMediaWorkflowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMediaWorkflowsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStreamCdnConfigsResponse listStreamCdnConfigs(ListStreamCdnConfigsRequest request) {
        Objects.requireNonNull(
                request.getDistributionChannelId(), "distributionChannelId is required");

        return clientCall(request, ListStreamCdnConfigsResponse::builder)
                .logger(LOG, "listStreamCdnConfigs")
                .serviceDetails(
                        "MediaServices",
                        "ListStreamCdnConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/ListStreamCdnConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamCdnConfigsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendQueryParam("distributionChannelId", request.getDistributionChannelId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfigCollection.class,
                        ListStreamCdnConfigsResponse.Builder::streamCdnConfigCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamCdnConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamCdnConfigsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStreamDistributionChannelsResponse listStreamDistributionChannels(
            ListStreamDistributionChannelsRequest request) {

        return clientCall(request, ListStreamDistributionChannelsResponse::builder)
                .logger(LOG, "listStreamDistributionChannels")
                .serviceDetails(
                        "MediaServices",
                        "ListStreamDistributionChannels",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/ListStreamDistributionChannels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamDistributionChannelsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannelCollection
                                .class,
                        ListStreamDistributionChannelsResponse.Builder
                                ::streamDistributionChannelCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListStreamDistributionChannelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListStreamDistributionChannelsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStreamPackagingConfigsResponse listStreamPackagingConfigs(
            ListStreamPackagingConfigsRequest request) {
        Objects.requireNonNull(
                request.getDistributionChannelId(), "distributionChannelId is required");

        return clientCall(request, ListStreamPackagingConfigsResponse::builder)
                .logger(LOG, "listStreamPackagingConfigs")
                .serviceDetails(
                        "MediaServices",
                        "ListStreamPackagingConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/ListStreamPackagingConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamPackagingConfigsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendQueryParam("distributionChannelId", request.getDistributionChannelId())
                .appendQueryParam("streamPackagingConfigId", request.getStreamPackagingConfigId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfigCollection.class,
                        ListStreamPackagingConfigsResponse.Builder::streamPackagingConfigCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamPackagingConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamPackagingConfigsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSystemMediaWorkflowsResponse listSystemMediaWorkflows(
            ListSystemMediaWorkflowsRequest request) {

        return clientCall(request, ListSystemMediaWorkflowsResponse::builder)
                .logger(LOG, "listSystemMediaWorkflows")
                .serviceDetails(
                        "MediaServices",
                        "ListSystemMediaWorkflows",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ListSystemMediaWorkflows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSystemMediaWorkflowsRequest::builder)
                .basePath("/20211101")
                .appendPathParam("systemMediaWorkflows")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mediaservices.model.SystemMediaWorkflowCollection.class,
                        ListSystemMediaWorkflowsResponse.Builder::systemMediaWorkflowCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSystemMediaWorkflowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSystemMediaWorkflowsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMediaAssetResponse updateMediaAsset(UpdateMediaAssetRequest request) {

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMediaAssetDetails(), "updateMediaAssetDetails is required");

        return clientCall(request, UpdateMediaAssetResponse::builder)
                .logger(LOG, "updateMediaAsset")
                .serviceDetails(
                        "MediaServices",
                        "UpdateMediaAsset",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/UpdateMediaAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMediaAssetRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAsset.class,
                        UpdateMediaAssetResponse.Builder::mediaAsset)
                .handleResponseHeaderString("etag", UpdateMediaAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMediaAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMediaWorkflowResponse updateMediaWorkflow(UpdateMediaWorkflowRequest request) {

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMediaWorkflowDetails(), "updateMediaWorkflowDetails is required");

        return clientCall(request, UpdateMediaWorkflowResponse::builder)
                .logger(LOG, "updateMediaWorkflow")
                .serviceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/UpdateMediaWorkflow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMediaWorkflowRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflow.class,
                        UpdateMediaWorkflowResponse.Builder::mediaWorkflow)
                .handleResponseHeaderString("etag", UpdateMediaWorkflowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMediaWorkflowResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMediaWorkflowConfigurationResponse updateMediaWorkflowConfiguration(
            UpdateMediaWorkflowConfigurationRequest request) {

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMediaWorkflowConfigurationDetails(),
                "updateMediaWorkflowConfigurationDetails is required");

        return clientCall(request, UpdateMediaWorkflowConfigurationResponse::builder)
                .logger(LOG, "updateMediaWorkflowConfiguration")
                .serviceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/UpdateMediaWorkflowConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMediaWorkflowConfigurationRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.class,
                        UpdateMediaWorkflowConfigurationResponse.Builder
                                ::mediaWorkflowConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateMediaWorkflowConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMediaWorkflowConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMediaWorkflowJobResponse updateMediaWorkflowJob(
            UpdateMediaWorkflowJobRequest request) {

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMediaWorkflowJobDetails(),
                "updateMediaWorkflowJobDetails is required");

        return clientCall(request, UpdateMediaWorkflowJobResponse::builder)
                .logger(LOG, "updateMediaWorkflowJob")
                .serviceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowJob",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/UpdateMediaWorkflowJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMediaWorkflowJobRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJob.class,
                        UpdateMediaWorkflowJobResponse.Builder::mediaWorkflowJob)
                .handleResponseHeaderString("etag", UpdateMediaWorkflowJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMediaWorkflowJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateStreamCdnConfigResponse updateStreamCdnConfig(
            UpdateStreamCdnConfigRequest request) {

        Validate.notBlank(request.getStreamCdnConfigId(), "streamCdnConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamCdnConfigDetails(),
                "updateStreamCdnConfigDetails is required");

        return clientCall(request, UpdateStreamCdnConfigResponse::builder)
                .logger(LOG, "updateStreamCdnConfig")
                .serviceDetails(
                        "MediaServices",
                        "UpdateStreamCdnConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/UpdateStreamCdnConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamCdnConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendPathParam(request.getStreamCdnConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfig.class,
                        UpdateStreamCdnConfigResponse.Builder::streamCdnConfig)
                .handleResponseHeaderString("etag", UpdateStreamCdnConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamCdnConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateStreamDistributionChannelResponse updateStreamDistributionChannel(
            UpdateStreamDistributionChannelRequest request) {

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamDistributionChannelDetails(),
                "updateStreamDistributionChannelDetails is required");

        return clientCall(request, UpdateStreamDistributionChannelResponse::builder)
                .logger(LOG, "updateStreamDistributionChannel")
                .serviceDetails(
                        "MediaServices",
                        "UpdateStreamDistributionChannel",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/UpdateStreamDistributionChannel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamDistributionChannelRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.class,
                        UpdateStreamDistributionChannelResponse.Builder::streamDistributionChannel)
                .handleResponseHeaderString(
                        "etag", UpdateStreamDistributionChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateStreamDistributionChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateStreamPackagingConfigResponse updateStreamPackagingConfig(
            UpdateStreamPackagingConfigRequest request) {

        Validate.notBlank(
                request.getStreamPackagingConfigId(), "streamPackagingConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamPackagingConfigDetails(),
                "updateStreamPackagingConfigDetails is required");

        return clientCall(request, UpdateStreamPackagingConfigResponse::builder)
                .logger(LOG, "updateStreamPackagingConfig")
                .serviceDetails(
                        "MediaServices",
                        "UpdateStreamPackagingConfig",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/UpdateStreamPackagingConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamPackagingConfigRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendPathParam(request.getStreamPackagingConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfig.class,
                        UpdateStreamPackagingConfigResponse.Builder::streamPackagingConfig)
                .handleResponseHeaderString(
                        "etag", UpdateStreamPackagingConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateStreamPackagingConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamPackagingConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public MediaServicesWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MediaServicesPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
