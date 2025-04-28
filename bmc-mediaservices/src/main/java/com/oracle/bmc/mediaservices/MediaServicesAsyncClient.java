/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

import java.util.Objects;

/**
 * Async client implementation for MediaServices service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MediaServicesAsync {
    /** Service instance for MediaServices. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MEDIASERVICES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://mediaservices.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MediaServicesAsyncClient.class);

    MediaServicesAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MediaServicesAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mediaservices";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MediaServicesAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MediaServicesAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddMediaAssetLockResponse> addMediaAssetLock(
            AddMediaAssetLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMediaAssetLockRequest, AddMediaAssetLockResponse>
                    handler) {
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        return clientCall(request, AddMediaAssetLockResponse::builder)
                .logger(LOG, "addMediaAssetLock")
                .serviceDetails(
                        "MediaServices",
                        "AddMediaAssetLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/AddMediaAssetLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMediaAssetLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAsset.class,
                        AddMediaAssetLockResponse.Builder::mediaAsset)
                .handleResponseHeaderString("etag", AddMediaAssetLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddMediaAssetLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMediaWorkflowConfigurationLockResponse>
            addMediaWorkflowConfigurationLock(
                    AddMediaWorkflowConfigurationLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddMediaWorkflowConfigurationLockRequest,
                                    AddMediaWorkflowConfigurationLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");

        return clientCall(request, AddMediaWorkflowConfigurationLockResponse::builder)
                .logger(LOG, "addMediaWorkflowConfigurationLock")
                .serviceDetails(
                        "MediaServices",
                        "AddMediaWorkflowConfigurationLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/AddMediaWorkflowConfigurationLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMediaWorkflowConfigurationLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.class,
                        AddMediaWorkflowConfigurationLockResponse.Builder
                                ::mediaWorkflowConfiguration)
                .handleResponseHeaderString(
                        "etag", AddMediaWorkflowConfigurationLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddMediaWorkflowConfigurationLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMediaWorkflowJobLockResponse> addMediaWorkflowJobLock(
            AddMediaWorkflowJobLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMediaWorkflowJobLockRequest, AddMediaWorkflowJobLockResponse>
                    handler) {
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, AddMediaWorkflowJobLockResponse::builder)
                .logger(LOG, "addMediaWorkflowJobLock")
                .serviceDetails(
                        "MediaServices",
                        "AddMediaWorkflowJobLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/AddMediaWorkflowJobLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMediaWorkflowJobLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJob.class,
                        AddMediaWorkflowJobLockResponse.Builder::mediaWorkflowJob)
                .handleResponseHeaderString("etag", AddMediaWorkflowJobLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddMediaWorkflowJobLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMediaWorkflowLockResponse> addMediaWorkflowLock(
            AddMediaWorkflowLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMediaWorkflowLockRequest, AddMediaWorkflowLockResponse>
                    handler) {
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");

        return clientCall(request, AddMediaWorkflowLockResponse::builder)
                .logger(LOG, "addMediaWorkflowLock")
                .serviceDetails(
                        "MediaServices",
                        "AddMediaWorkflowLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/AddMediaWorkflowLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMediaWorkflowLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflow.class,
                        AddMediaWorkflowLockResponse.Builder::mediaWorkflow)
                .handleResponseHeaderString("etag", AddMediaWorkflowLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddMediaWorkflowLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddStreamCdnConfigLockResponse> addStreamCdnConfigLock(
            AddStreamCdnConfigLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddStreamCdnConfigLockRequest, AddStreamCdnConfigLockResponse>
                    handler) {
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        Validate.notBlank(request.getStreamCdnConfigId(), "streamCdnConfigId must not be blank");

        return clientCall(request, AddStreamCdnConfigLockResponse::builder)
                .logger(LOG, "addStreamCdnConfigLock")
                .serviceDetails(
                        "MediaServices",
                        "AddStreamCdnConfigLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/AddStreamCdnConfigLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStreamCdnConfigLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendPathParam(request.getStreamCdnConfigId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfig.class,
                        AddStreamCdnConfigLockResponse.Builder::streamCdnConfig)
                .handleResponseHeaderString("etag", AddStreamCdnConfigLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddStreamCdnConfigLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddStreamDistributionChannelLockResponse>
            addStreamDistributionChannelLock(
                    AddStreamDistributionChannelLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddStreamDistributionChannelLockRequest,
                                    AddStreamDistributionChannelLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");

        return clientCall(request, AddStreamDistributionChannelLockResponse::builder)
                .logger(LOG, "addStreamDistributionChannelLock")
                .serviceDetails(
                        "MediaServices",
                        "AddStreamDistributionChannelLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/AddStreamDistributionChannelLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStreamDistributionChannelLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.class,
                        AddStreamDistributionChannelLockResponse.Builder::streamDistributionChannel)
                .handleResponseHeaderString(
                        "etag", AddStreamDistributionChannelLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStreamDistributionChannelLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddStreamPackagingConfigLockResponse>
            addStreamPackagingConfigLock(
                    AddStreamPackagingConfigLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddStreamPackagingConfigLockRequest,
                                    AddStreamPackagingConfigLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        Validate.notBlank(
                request.getStreamPackagingConfigId(), "streamPackagingConfigId must not be blank");

        return clientCall(request, AddStreamPackagingConfigLockResponse::builder)
                .logger(LOG, "addStreamPackagingConfigLock")
                .serviceDetails(
                        "MediaServices",
                        "AddStreamPackagingConfigLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/AddStreamPackagingConfigLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStreamPackagingConfigLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendPathParam(request.getStreamPackagingConfigId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfig.class,
                        AddStreamPackagingConfigLockResponse.Builder::streamPackagingConfig)
                .handleResponseHeaderString(
                        "etag", AddStreamPackagingConfigLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStreamPackagingConfigLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaAssetCompartmentResponse>
            changeMediaAssetCompartment(
                    ChangeMediaAssetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaAssetCompartmentRequest,
                                    ChangeMediaAssetCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMediaAssetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowCompartmentResponse>
            changeMediaWorkflowCompartment(
                    ChangeMediaWorkflowCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowCompartmentRequest,
                                    ChangeMediaWorkflowCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowConfigurationCompartmentResponse>
            changeMediaWorkflowConfigurationCompartment(
                    ChangeMediaWorkflowConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowConfigurationCompartmentRequest,
                                    ChangeMediaWorkflowConfigurationCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowConfigurationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowJobCompartmentResponse>
            changeMediaWorkflowJobCompartment(
                    ChangeMediaWorkflowJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowJobCompartmentRequest,
                                    ChangeMediaWorkflowJobCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMediaWorkflowJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamDistributionChannelCompartmentResponse>
            changeStreamDistributionChannelCompartment(
                    ChangeStreamDistributionChannelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamDistributionChannelCompartmentRequest,
                                    ChangeStreamDistributionChannelCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeStreamDistributionChannelCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaAssetResponse> createMediaAsset(
            CreateMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaAssetRequest, CreateMediaAssetResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowResponse> createMediaWorkflow(
            CreateMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowConfigurationResponse>
            createMediaWorkflowConfiguration(
                    CreateMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMediaWorkflowConfigurationRequest,
                                    CreateMediaWorkflowConfigurationResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowJobResponse> createMediaWorkflowJob(
            CreateMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamCdnConfigResponse> createStreamCdnConfig(
            CreateStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamDistributionChannelResponse>
            createStreamDistributionChannel(
                    CreateStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateStreamDistributionChannelRequest,
                                    CreateStreamDistributionChannelResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamPackagingConfigResponse>
            createStreamPackagingConfig(
                    CreateStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateStreamPackagingConfigRequest,
                                    CreateStreamPackagingConfigResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaAssetResponse> deleteMediaAsset(
            DeleteMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaAssetRequest, DeleteMediaAssetResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .appendEnumQueryParam("deleteMode", request.getDeleteMode())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaAssetDistributionChannelAttachmentResponse>
            deleteMediaAssetDistributionChannelAttachment(
                    DeleteMediaAssetDistributionChannelAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaAssetDistributionChannelAttachmentRequest,
                                    DeleteMediaAssetDistributionChannelAttachmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .appendQueryParam("version", request.getVersion())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMediaAssetDistributionChannelAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowResponse> deleteMediaWorkflow(
            DeleteMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaWorkflowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowConfigurationResponse>
            deleteMediaWorkflowConfiguration(
                    DeleteMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaWorkflowConfigurationRequest,
                                    DeleteMediaWorkflowConfigurationResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMediaWorkflowConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowJobResponse> deleteMediaWorkflowJob(
            DeleteMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMediaWorkflowJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamCdnConfigResponse> deleteStreamCdnConfig(
            DeleteStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamCdnConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamDistributionChannelResponse>
            deleteStreamDistributionChannel(
                    DeleteStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteStreamDistributionChannelRequest,
                                    DeleteStreamDistributionChannelResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteStreamDistributionChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamPackagingConfigResponse>
            deleteStreamPackagingConfig(
                    DeleteStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteStreamPackagingConfigRequest,
                                    DeleteStreamPackagingConfigResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamPackagingConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMediaAssetResponse> getMediaAsset(
            GetMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMediaAssetRequest, GetMediaAssetResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMediaAssetDistributionChannelAttachmentResponse>
            getMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaAssetDistributionChannelAttachmentRequest,
                                    GetMediaAssetDistributionChannelAttachmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowResponse> getMediaWorkflow(
            GetMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowRequest, GetMediaWorkflowResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowConfigurationResponse>
            getMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaWorkflowConfigurationRequest,
                                    GetMediaWorkflowConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowJobResponse> getMediaWorkflowJob(
            GetMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamCdnConfigResponse> getStreamCdnConfig(
            GetStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamDistributionChannelResponse>
            getStreamDistributionChannel(
                    GetStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetStreamDistributionChannelRequest,
                                    GetStreamDistributionChannelResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamPackagingConfigResponse> getStreamPackagingConfig(
            GetStreamPackagingConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IngestStreamDistributionChannelResponse>
            ingestStreamDistributionChannel(
                    IngestStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    IngestStreamDistributionChannelRequest,
                                    IngestStreamDistributionChannelResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaAssetDistributionChannelAttachmentsResponse>
            listMediaAssetDistributionChannelAttachments(
                    ListMediaAssetDistributionChannelAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaAssetDistributionChannelAttachmentsRequest,
                                    ListMediaAssetDistributionChannelAttachmentsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaAssetsResponse> listMediaAssets(
            ListMediaAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaAssetsRequest, ListMediaAssetsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowConfigurationsResponse>
            listMediaWorkflowConfigurations(
                    ListMediaWorkflowConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowConfigurationsRequest,
                                    ListMediaWorkflowConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowJobsResponse> listMediaWorkflowJobs(
            ListMediaWorkflowJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowTaskDeclarationsResponse>
            listMediaWorkflowTaskDeclarations(
                    ListMediaWorkflowTaskDeclarationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowTaskDeclarationsRequest,
                                    ListMediaWorkflowTaskDeclarationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowsResponse> listMediaWorkflows(
            ListMediaWorkflowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamCdnConfigsResponse> listStreamCdnConfigs(
            ListStreamCdnConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamDistributionChannelsResponse>
            listStreamDistributionChannels(
                    ListStreamDistributionChannelsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStreamDistributionChannelsRequest,
                                    ListStreamDistributionChannelsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamPackagingConfigsResponse>
            listStreamPackagingConfigs(
                    ListStreamPackagingConfigsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStreamPackagingConfigsRequest,
                                    ListStreamPackagingConfigsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSystemMediaWorkflowsResponse> listSystemMediaWorkflows(
            ListSystemMediaWorkflowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMediaAssetLockResponse> removeMediaAssetLock(
            RemoveMediaAssetLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveMediaAssetLockRequest, RemoveMediaAssetLockResponse>
                    handler) {
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        Validate.notBlank(request.getMediaAssetId(), "mediaAssetId must not be blank");

        return clientCall(request, RemoveMediaAssetLockResponse::builder)
                .logger(LOG, "removeMediaAssetLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveMediaAssetLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/RemoveMediaAssetLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMediaAssetLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaAssets")
                .appendPathParam(request.getMediaAssetId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaAsset.class,
                        RemoveMediaAssetLockResponse.Builder::mediaAsset)
                .handleResponseHeaderString("etag", RemoveMediaAssetLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMediaAssetLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMediaWorkflowConfigurationLockResponse>
            removeMediaWorkflowConfigurationLock(
                    RemoveMediaWorkflowConfigurationLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveMediaWorkflowConfigurationLockRequest,
                                    RemoveMediaWorkflowConfigurationLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        Validate.notBlank(
                request.getMediaWorkflowConfigurationId(),
                "mediaWorkflowConfigurationId must not be blank");

        return clientCall(request, RemoveMediaWorkflowConfigurationLockResponse::builder)
                .logger(LOG, "removeMediaWorkflowConfigurationLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveMediaWorkflowConfigurationLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/RemoveMediaWorkflowConfigurationLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMediaWorkflowConfigurationLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowConfigurations")
                .appendPathParam(request.getMediaWorkflowConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.class,
                        RemoveMediaWorkflowConfigurationLockResponse.Builder
                                ::mediaWorkflowConfiguration)
                .handleResponseHeaderString(
                        "etag", RemoveMediaWorkflowConfigurationLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveMediaWorkflowConfigurationLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMediaWorkflowJobLockResponse>
            removeMediaWorkflowJobLock(
                    RemoveMediaWorkflowJobLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveMediaWorkflowJobLockRequest,
                                    RemoveMediaWorkflowJobLockResponse>
                            handler) {
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        Validate.notBlank(request.getMediaWorkflowJobId(), "mediaWorkflowJobId must not be blank");

        return clientCall(request, RemoveMediaWorkflowJobLockResponse::builder)
                .logger(LOG, "removeMediaWorkflowJobLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveMediaWorkflowJobLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/RemoveMediaWorkflowJobLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMediaWorkflowJobLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflowJobs")
                .appendPathParam(request.getMediaWorkflowJobId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflowJob.class,
                        RemoveMediaWorkflowJobLockResponse.Builder::mediaWorkflowJob)
                .handleResponseHeaderString(
                        "etag", RemoveMediaWorkflowJobLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMediaWorkflowJobLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMediaWorkflowLockResponse> removeMediaWorkflowLock(
            RemoveMediaWorkflowLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveMediaWorkflowLockRequest, RemoveMediaWorkflowLockResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        Validate.notBlank(request.getMediaWorkflowId(), "mediaWorkflowId must not be blank");

        return clientCall(request, RemoveMediaWorkflowLockResponse::builder)
                .logger(LOG, "removeMediaWorkflowLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveMediaWorkflowLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/RemoveMediaWorkflowLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMediaWorkflowLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("mediaWorkflows")
                .appendPathParam(request.getMediaWorkflowId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.MediaWorkflow.class,
                        RemoveMediaWorkflowLockResponse.Builder::mediaWorkflow)
                .handleResponseHeaderString("etag", RemoveMediaWorkflowLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMediaWorkflowLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveStreamCdnConfigLockResponse> removeStreamCdnConfigLock(
            RemoveStreamCdnConfigLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveStreamCdnConfigLockRequest, RemoveStreamCdnConfigLockResponse>
                    handler) {
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        Validate.notBlank(request.getStreamCdnConfigId(), "streamCdnConfigId must not be blank");

        return clientCall(request, RemoveStreamCdnConfigLockResponse::builder)
                .logger(LOG, "removeStreamCdnConfigLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveStreamCdnConfigLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/RemoveStreamCdnConfigLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveStreamCdnConfigLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamCdnConfigs")
                .appendPathParam(request.getStreamCdnConfigId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamCdnConfig.class,
                        RemoveStreamCdnConfigLockResponse.Builder::streamCdnConfig)
                .handleResponseHeaderString("etag", RemoveStreamCdnConfigLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveStreamCdnConfigLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveStreamDistributionChannelLockResponse>
            removeStreamDistributionChannelLock(
                    RemoveStreamDistributionChannelLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveStreamDistributionChannelLockRequest,
                                    RemoveStreamDistributionChannelLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        Validate.notBlank(
                request.getStreamDistributionChannelId(),
                "streamDistributionChannelId must not be blank");

        return clientCall(request, RemoveStreamDistributionChannelLockResponse::builder)
                .logger(LOG, "removeStreamDistributionChannelLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveStreamDistributionChannelLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/RemoveStreamDistributionChannelLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveStreamDistributionChannelLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamDistributionChannels")
                .appendPathParam(request.getStreamDistributionChannelId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.class,
                        RemoveStreamDistributionChannelLockResponse.Builder
                                ::streamDistributionChannel)
                .handleResponseHeaderString(
                        "etag", RemoveStreamDistributionChannelLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveStreamDistributionChannelLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveStreamPackagingConfigLockResponse>
            removeStreamPackagingConfigLock(
                    RemoveStreamPackagingConfigLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveStreamPackagingConfigLockRequest,
                                    RemoveStreamPackagingConfigLockResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        Validate.notBlank(
                request.getStreamPackagingConfigId(), "streamPackagingConfigId must not be blank");

        return clientCall(request, RemoveStreamPackagingConfigLockResponse::builder)
                .logger(LOG, "removeStreamPackagingConfigLock")
                .serviceDetails(
                        "MediaServices",
                        "RemoveStreamPackagingConfigLock",
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/RemoveStreamPackagingConfigLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveStreamPackagingConfigLockRequest::builder)
                .basePath("/20211101")
                .appendPathParam("streamPackagingConfigs")
                .appendPathParam(request.getStreamPackagingConfigId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mediaservices.model.StreamPackagingConfig.class,
                        RemoveStreamPackagingConfigLockResponse.Builder::streamPackagingConfig)
                .handleResponseHeaderString(
                        "etag", RemoveStreamPackagingConfigLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveStreamPackagingConfigLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaAssetResponse> updateMediaAsset(
            UpdateMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaAssetRequest, UpdateMediaAssetResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowResponse> updateMediaWorkflow(
            UpdateMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowConfigurationResponse>
            updateMediaWorkflowConfiguration(
                    UpdateMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMediaWorkflowConfigurationRequest,
                                    UpdateMediaWorkflowConfigurationResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowJobResponse> updateMediaWorkflowJob(
            UpdateMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamCdnConfigResponse> updateStreamCdnConfig(
            UpdateStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamDistributionChannelResponse>
            updateStreamDistributionChannel(
                    UpdateStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateStreamDistributionChannelRequest,
                                    UpdateStreamDistributionChannelResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamPackagingConfigResponse>
            updateStreamPackagingConfig(
                    UpdateStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateStreamPackagingConfigRequest,
                                    UpdateStreamPackagingConfigResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                        "opc-request-id", UpdateStreamPackagingConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MediaServicesAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public MediaServicesAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public MediaServicesAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public MediaServicesAsyncClient(
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
                authenticationDetailsProvider);
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
    public MediaServicesAsyncClient(
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
                authenticationDetailsProvider);
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
    public MediaServicesAsyncClient(
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
                authenticationDetailsProvider);
    }
}
