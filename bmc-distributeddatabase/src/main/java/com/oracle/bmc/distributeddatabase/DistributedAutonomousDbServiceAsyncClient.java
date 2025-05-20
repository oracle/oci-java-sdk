/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.distributeddatabase.requests.*;
import com.oracle.bmc.distributeddatabase.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DistributedAutonomousDbService service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class DistributedAutonomousDbServiceAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DistributedAutonomousDbServiceAsync {
    /** Service instance for DistributedAutonomousDbService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISTRIBUTEDAUTONOMOUSDBSERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedAutonomousDbServiceAsyncClient.class);

    DistributedAutonomousDbServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DistributedAutonomousDbServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DistributedAutonomousDbServiceAsyncClient",
                            "downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest,generateDistributedAutonomousDatabaseWallet"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, DistributedAutonomousDbServiceAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "distributeddatabase";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DistributedAutonomousDbServiceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DistributedAutonomousDbServiceAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<AddDistributedAutonomousDatabaseGdsControlNodeResponse>
            addDistributedAutonomousDatabaseGdsControlNode(
                    AddDistributedAutonomousDatabaseGdsControlNodeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                                    AddDistributedAutonomousDatabaseGdsControlNodeResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getAddDistributedAutonomousDatabaseGdsControlNodeDetails(),
                "addDistributedAutonomousDatabaseGdsControlNodeDetails is required");

        return clientCall(request, AddDistributedAutonomousDatabaseGdsControlNodeResponse::builder)
                .logger(LOG, "addDistributedAutonomousDatabaseGdsControlNode")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "AddDistributedAutonomousDatabaseGdsControlNode",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/AddDistributedAutonomousDatabaseGdsControlNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDistributedAutonomousDatabaseGdsControlNodeRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("addGdsControlNode")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDistributedAutonomousDatabaseGdsControlNodeResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDistributedAutonomousDatabaseGdsControlNodeResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedAutonomousDatabaseCompartmentResponse>
            changeDistributedAutonomousDatabaseCompartment(
                    ChangeDistributedAutonomousDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedAutonomousDatabaseCompartmentRequest,
                                    ChangeDistributedAutonomousDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeDistributedAutonomousDatabaseCompartmentDetails(),
                "changeDistributedAutonomousDatabaseCompartmentDetails is required");

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, ChangeDistributedAutonomousDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeDistributedAutonomousDatabaseCompartment")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "ChangeDistributedAutonomousDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/ChangeDistributedAutonomousDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDistributedAutonomousDatabaseCompartmentRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedAutonomousDatabaseCompartmentResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedAutonomousDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseGsmsResponse>
            configureDistributedAutonomousDatabaseGsms(
                    ConfigureDistributedAutonomousDatabaseGsmsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseGsmsRequest,
                                    ConfigureDistributedAutonomousDatabaseGsmsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getConfigureDistributedAutonomousDatabaseGsmsDetails(),
                "configureDistributedAutonomousDatabaseGsmsDetails is required");

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, ConfigureDistributedAutonomousDatabaseGsmsResponse::builder)
                .logger(LOG, "configureDistributedAutonomousDatabaseGsms")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "ConfigureDistributedAutonomousDatabaseGsms",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/ConfigureDistributedAutonomousDatabaseGsms")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDistributedAutonomousDatabaseGsmsRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureGsms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedAutonomousDatabaseGsmsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedAutonomousDatabaseGsmsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseShardingResponse>
            configureDistributedAutonomousDatabaseSharding(
                    ConfigureDistributedAutonomousDatabaseShardingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseShardingRequest,
                                    ConfigureDistributedAutonomousDatabaseShardingResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, ConfigureDistributedAutonomousDatabaseShardingResponse::builder)
                .logger(LOG, "configureDistributedAutonomousDatabaseSharding")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "ConfigureDistributedAutonomousDatabaseSharding",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/ConfigureDistributedAutonomousDatabaseSharding")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDistributedAutonomousDatabaseShardingRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureSharding")
                .appendQueryParam("isRebalanceRequired", request.getIsRebalanceRequired())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedAutonomousDatabaseShardingResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedAutonomousDatabaseShardingResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributedAutonomousDatabaseResponse>
            createDistributedAutonomousDatabase(
                    CreateDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDistributedAutonomousDatabaseRequest,
                                    CreateDistributedAutonomousDatabaseResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateDistributedAutonomousDatabaseDetails(),
                "createDistributedAutonomousDatabaseDetails is required");

        return clientCall(request, CreateDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "createDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService", "CreateDistributedAutonomousDatabase", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedAutonomousDatabase
                                .class,
                        CreateDistributedAutonomousDatabaseResponse.Builder
                                ::distributedAutonomousDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDistributedAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDistributedAutonomousDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributedAutonomousDatabaseResponse>
            deleteDistributedAutonomousDatabase(
                    DeleteDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDistributedAutonomousDatabaseRequest,
                                    DeleteDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, DeleteDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "deleteDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "DeleteDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/DeleteDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDistributedAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(
                        request,
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                ::builder)
                .logger(LOG, "downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                                ::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("downloadGsmCertificateSigningRequest")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "etag",
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(request.getCaBundleId(), "caBundleId is required");

        return clientCall(
                        request,
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                ::builder)
                .logger(LOG, "generateDistributedAutonomousDatabaseGsmCertificateSigningRequest")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                                ::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateGsmCertificateSigningRequest")
                .appendQueryParam("caBundleId", request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse
                                        .Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDistributedAutonomousDatabaseWalletResponse>
            generateDistributedAutonomousDatabaseWallet(
                    GenerateDistributedAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseWalletRequest,
                                    GenerateDistributedAutonomousDatabaseWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getGenerateDistributedAutonomousDatabaseWalletDetails(),
                "generateDistributedAutonomousDatabaseWalletDetails is required");

        return clientCall(request, GenerateDistributedAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "generateDistributedAutonomousDatabaseWallet")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "GenerateDistributedAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/GenerateDistributedAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDistributedAutonomousDatabaseWalletRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateDistributedAutonomousDatabaseWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDistributedAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GenerateDistributedAutonomousDatabaseWalletResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateDistributedAutonomousDatabaseWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        GenerateDistributedAutonomousDatabaseWalletResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDistributedAutonomousDatabaseResponse>
            getDistributedAutonomousDatabase(
                    GetDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedAutonomousDatabaseRequest,
                                    GetDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, GetDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "getDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "GetDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/GetDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendQueryParam("metadata", request.getMetadata())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedAutonomousDatabase
                                .class,
                        GetDistributedAutonomousDatabaseResponse.Builder
                                ::distributedAutonomousDatabase)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetDistributedAutonomousDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDistributedAutonomousDatabasesResponse>
            listDistributedAutonomousDatabases(
                    ListDistributedAutonomousDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDistributedAutonomousDatabasesRequest,
                                    ListDistributedAutonomousDatabasesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDistributedAutonomousDatabasesResponse::builder)
                .logger(LOG, "listDistributedAutonomousDatabases")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "ListDistributedAutonomousDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabaseCollection/ListDistributedAutonomousDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDistributedAutonomousDatabasesRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("dbDeploymentType", request.getDbDeploymentType())
                .appendQueryParam("metadata", request.getMetadata())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model
                                .DistributedAutonomousDatabaseCollection.class,
                        ListDistributedAutonomousDatabasesResponse.Builder
                                ::distributedAutonomousDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDistributedAutonomousDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDistributedAutonomousDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDistributedAutonomousDatabaseResponse>
            patchDistributedAutonomousDatabase(
                    PatchDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchDistributedAutonomousDatabaseRequest,
                                    PatchDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getPatchDistributedAutonomousDatabaseDetails(),
                "patchDistributedAutonomousDatabaseDetails is required");

        return clientCall(request, PatchDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "patchDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "PatchDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/PatchDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchDistributedAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateDistributedAutonomousDatabasePasswordsResponse>
            rotateDistributedAutonomousDatabasePasswords(
                    RotateDistributedAutonomousDatabasePasswordsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedAutonomousDatabasePasswordsRequest,
                                    RotateDistributedAutonomousDatabasePasswordsResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, RotateDistributedAutonomousDatabasePasswordsResponse::builder)
                .logger(LOG, "rotateDistributedAutonomousDatabasePasswords")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "RotateDistributedAutonomousDatabasePasswords",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/RotateDistributedAutonomousDatabasePasswords")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateDistributedAutonomousDatabasePasswordsRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateDbPasswords")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateDistributedAutonomousDatabasePasswordsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateDistributedAutonomousDatabasePasswordsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartDistributedAutonomousDatabaseResponse>
            startDistributedAutonomousDatabase(
                    StartDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    StartDistributedAutonomousDatabaseRequest,
                                    StartDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, StartDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "startDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "StartDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/StartDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("startDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartDistributedAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        StartDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopDistributedAutonomousDatabaseResponse>
            stopDistributedAutonomousDatabase(
                    StopDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    StopDistributedAutonomousDatabaseRequest,
                                    StopDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, StopDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "stopDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "StopDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/StopDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stopDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopDistributedAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        StopDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributedAutonomousDatabaseResponse>
            updateDistributedAutonomousDatabase(
                    UpdateDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDistributedAutonomousDatabaseRequest,
                                    UpdateDistributedAutonomousDatabaseResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDistributedAutonomousDatabaseDetails(),
                "updateDistributedAutonomousDatabaseDetails is required");

        return clientCall(request, UpdateDistributedAutonomousDatabaseResponse::builder)
                .logger(LOG, "updateDistributedAutonomousDatabase")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "UpdateDistributedAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/UpdateDistributedAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDistributedAutonomousDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedAutonomousDatabase
                                .class,
                        UpdateDistributedAutonomousDatabaseResponse.Builder
                                ::distributedAutonomousDatabase)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDistributedAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateDistributedAutonomousDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request
                        .getUploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletDetails(),
                "uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletDetails is required");

        return clientCall(
                        request,
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse
                                ::builder)
                .logger(
                        LOG,
                        "uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest
                                ::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("uploadSignedCertificateAndGenerateWallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse
                                        .Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse
                                        .Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDistributedAutonomousDatabaseNetworkResponse>
            validateDistributedAutonomousDatabaseNetwork(
                    ValidateDistributedAutonomousDatabaseNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedAutonomousDatabaseNetworkRequest,
                                    ValidateDistributedAutonomousDatabaseNetworkResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        return clientCall(request, ValidateDistributedAutonomousDatabaseNetworkResponse::builder)
                .logger(LOG, "validateDistributedAutonomousDatabaseNetwork")
                .serviceDetails(
                        "DistributedAutonomousDbService",
                        "ValidateDistributedAutonomousDatabaseNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20250101/DistributedAutonomousDatabase/ValidateDistributedAutonomousDatabaseNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDistributedAutonomousDatabaseNetworkRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedAutonomousDatabases")
                .appendPathParam(request.getDistributedAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("validateNetwork")
                .appendQueryParam("isSurrogate", request.getIsSurrogate())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("shardGroup", request.getShardGroup())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateDistributedAutonomousDatabaseNetworkResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDistributedAutonomousDatabaseNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
