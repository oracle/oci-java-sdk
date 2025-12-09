/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for KmsHsmCluster service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsHsmClusterAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements KmsHsmClusterAsync {
    /** Service instance for KmsHsmCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(KmsHsmClusterClient.class.getName())
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsHsmClusterAsyncClient.class);

    KmsHsmClusterAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, KmsHsmClusterAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "keymanagement";
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
        public KmsHsmClusterAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new KmsHsmClusterAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelHsmClusterDeletionResponse> cancelHsmClusterDeletion(
            CancelHsmClusterDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelHsmClusterDeletionRequest, CancelHsmClusterDeletionResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        return clientCall(request, CancelHsmClusterDeletionResponse::builder)
                .logger(LOG, "cancelHsmClusterDeletion")
                .serviceDetails(
                        "KmsHsmCluster",
                        "CancelHsmClusterDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/CancelHsmClusterDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelHsmClusterDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmCluster.class,
                        CancelHsmClusterDeletionResponse.Builder::hsmCluster)
                .handleResponseHeaderString("etag", CancelHsmClusterDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelHsmClusterDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeHsmClusterCompartmentResponse>
            changeHsmClusterCompartment(
                    ChangeHsmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHsmClusterCompartmentRequest,
                                    ChangeHsmClusterCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeHsmClusterCompartmentDetails(),
                "changeHsmClusterCompartmentDetails is required");

        return clientCall(request, ChangeHsmClusterCompartmentResponse::builder)
                .logger(LOG, "changeHsmClusterCompartment")
                .serviceDetails(
                        "KmsHsmCluster",
                        "ChangeHsmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/ChangeHsmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHsmClusterCompartmentRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeHsmClusterCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeHsmClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateHsmClusterResponse> createHsmCluster(
            CreateHsmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHsmClusterRequest, CreateHsmClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateHsmClusterDetails(), "createHsmClusterDetails is required");

        return clientCall(request, CreateHsmClusterResponse::builder)
                .logger(LOG, "createHsmCluster")
                .serviceDetails(
                        "KmsHsmCluster",
                        "CreateHsmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/CreateHsmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHsmClusterRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmCluster.class,
                        CreateHsmClusterResponse.Builder::hsmCluster)
                .handleResponseHeaderString("etag", CreateHsmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHsmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadCertificateSigningRequestResponse>
            downloadCertificateSigningRequest(
                    DownloadCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadCertificateSigningRequestRequest,
                                    DownloadCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        return clientCall(request, DownloadCertificateSigningRequestResponse::builder)
                .logger(LOG, "downloadCertificateSigningRequest")
                .serviceDetails(
                        "KmsHsmCluster",
                        "DownloadCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/DownloadCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadCertificateSigningRequestRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("actions")
                .appendPathParam("downloadCertificateSigningRequest")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(String.class, DownloadCertificateSigningRequestResponse.Builder::value)
                .handleResponseHeaderString(
                        "etag", DownloadCertificateSigningRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadCertificateSigningRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHsmClusterResponse> getHsmCluster(
            GetHsmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetHsmClusterRequest, GetHsmClusterResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        return clientCall(request, GetHsmClusterResponse::builder)
                .logger(LOG, "getHsmCluster")
                .serviceDetails(
                        "KmsHsmCluster",
                        "GetHsmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/GetHsmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHsmClusterRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmCluster.class,
                        GetHsmClusterResponse.Builder::hsmCluster)
                .handleResponseHeaderString("etag", GetHsmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHsmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHsmPartitionResponse> getHsmPartition(
            GetHsmPartitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHsmPartitionRequest, GetHsmPartitionResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        Validate.notBlank(request.getHsmPartitionId(), "hsmPartitionId must not be blank");

        return clientCall(request, GetHsmPartitionResponse::builder)
                .logger(LOG, "getHsmPartition")
                .serviceDetails(
                        "KmsHsmCluster",
                        "GetHsmPartition",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmPartition/GetHsmPartition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHsmPartitionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("hsmPartitions")
                .appendPathParam(request.getHsmPartitionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmPartition.class,
                        GetHsmPartitionResponse.Builder::hsmPartition)
                .handleResponseHeaderString("etag", GetHsmPartitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHsmPartitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPreCoUserCredentialsResponse> getPreCoUserCredentials(
            GetPreCoUserCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPreCoUserCredentialsRequest, GetPreCoUserCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        return clientCall(request, GetPreCoUserCredentialsResponse::builder)
                .logger(LOG, "getPreCoUserCredentials")
                .serviceDetails(
                        "KmsHsmCluster",
                        "GetPreCoUserCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/GetPreCoUserCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPreCoUserCredentialsRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("preCoUserCredentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.PreCoUserCredentials.class,
                        GetPreCoUserCredentialsResponse.Builder::preCoUserCredentials)
                .handleResponseHeaderString("etag", GetPreCoUserCredentialsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPreCoUserCredentialsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHsmClustersResponse> listHsmClusters(
            ListHsmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHsmClustersRequest, ListHsmClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListHsmClustersResponse::builder)
                .logger(LOG, "listHsmClusters")
                .serviceDetails(
                        "KmsHsmCluster",
                        "ListHsmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/ListHsmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHsmClustersRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmClusterCollection.class,
                        ListHsmClustersResponse.Builder::hsmClusterCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListHsmClustersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListHsmClustersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHsmPartitionsResponse> listHsmPartitions(
            ListHsmPartitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHsmPartitionsRequest, ListHsmPartitionsResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");

        return clientCall(request, ListHsmPartitionsResponse::builder)
                .logger(LOG, "listHsmPartitions")
                .serviceDetails(
                        "KmsHsmCluster",
                        "ListHsmPartitions",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmPartition/ListHsmPartitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHsmPartitionsRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("hsmPartitions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmPartitionCollection.class,
                        ListHsmPartitionsResponse.Builder::hsmPartitionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListHsmPartitionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListHsmPartitionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleHsmClusterDeletionResponse>
            scheduleHsmClusterDeletion(
                    ScheduleHsmClusterDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleHsmClusterDeletionRequest,
                                    ScheduleHsmClusterDeletionResponse>
                            handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");
        Objects.requireNonNull(
                request.getScheduleHsmClusterDeletionDetails(),
                "scheduleHsmClusterDeletionDetails is required");

        return clientCall(request, ScheduleHsmClusterDeletionResponse::builder)
                .logger(LOG, "scheduleHsmClusterDeletion")
                .serviceDetails(
                        "KmsHsmCluster",
                        "ScheduleHsmClusterDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/ScheduleHsmClusterDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleHsmClusterDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmCluster.class,
                        ScheduleHsmClusterDeletionResponse.Builder::hsmCluster)
                .handleResponseHeaderString(
                        "etag", ScheduleHsmClusterDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleHsmClusterDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHsmClusterResponse> updateHsmCluster(
            UpdateHsmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHsmClusterRequest, UpdateHsmClusterResponse>
                    handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHsmClusterDetails(), "updateHsmClusterDetails is required");

        return clientCall(request, UpdateHsmClusterResponse::builder)
                .logger(LOG, "updateHsmCluster")
                .serviceDetails(
                        "KmsHsmCluster",
                        "UpdateHsmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/UpdateHsmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHsmClusterRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.HsmCluster.class,
                        UpdateHsmClusterResponse.Builder::hsmCluster)
                .handleResponseHeaderString("etag", UpdateHsmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHsmClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadPartitionCertificatesResponse>
            uploadPartitionCertificates(
                    UploadPartitionCertificatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadPartitionCertificatesRequest,
                                    UploadPartitionCertificatesResponse>
                            handler) {

        Validate.notBlank(request.getHsmClusterId(), "hsmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUploadPartitionCertificatesDetails(),
                "uploadPartitionCertificatesDetails is required");

        return clientCall(request, UploadPartitionCertificatesResponse::builder)
                .logger(LOG, "uploadPartitionCertificates")
                .serviceDetails(
                        "KmsHsmCluster",
                        "UploadPartitionCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/HsmCluster/UploadPartitionCertificates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadPartitionCertificatesRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("hsmClusters")
                .appendPathParam(request.getHsmClusterId())
                .appendPathParam("actions")
                .appendPathParam("uploadPartitionCertificates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", UploadPartitionCertificatesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UploadPartitionCertificatesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
    public KmsHsmClusterAsyncClient(
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
