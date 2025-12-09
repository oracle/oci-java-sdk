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
 * Async client implementation for DistributedDbService service. <br>
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
public class DistributedDbServiceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DistributedDbServiceAsync {
    /** Service instance for DistributedDbService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DistributedDbServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedDbServiceAsyncClient.class);

    DistributedDbServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DistributedDbServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DistributedDbServiceAsyncClient",
                            "downloadDistributedDatabaseGsmCertificateSigningRequest,generateDistributedDatabaseWallet"));
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
                    Builder, DistributedDbServiceAsyncClient> {
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
        public DistributedDbServiceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DistributedDbServiceAsyncClient(
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
    public java.util.concurrent.Future<AddDistributedDatabaseGdsControlNodeResponse>
            addDistributedDatabaseGdsControlNode(
                    AddDistributedDatabaseGdsControlNodeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedDatabaseGdsControlNodeRequest,
                                    AddDistributedDatabaseGdsControlNodeResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getAddDistributedDatabaseGdsControlNodeDetails(),
                "addDistributedDatabaseGdsControlNodeDetails is required");

        return clientCall(request, AddDistributedDatabaseGdsControlNodeResponse::builder)
                .logger(LOG, "addDistributedDatabaseGdsControlNode")
                .serviceDetails(
                        "DistributedDbService",
                        "AddDistributedDatabaseGdsControlNode",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/AddDistributedDatabaseGdsControlNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDistributedDatabaseGdsControlNodeRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("addGdsControlNode")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDistributedDatabaseGdsControlNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDistributedDatabaseGdsControlNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedDatabaseCompartmentResponse>
            changeDistributedDatabaseCompartment(
                    ChangeDistributedDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDatabaseCompartmentRequest,
                                    ChangeDistributedDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeDistributedDatabaseCompartmentDetails(),
                "changeDistributedDatabaseCompartmentDetails is required");

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, ChangeDistributedDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeDistributedDatabaseCompartment")
                .serviceDetails(
                        "DistributedDbService",
                        "ChangeDistributedDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ChangeDistributedDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDistributedDatabaseCompartmentRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedDatabaseCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedDbBackupConfigResponse>
            changeDistributedDbBackupConfig(
                    ChangeDistributedDbBackupConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDbBackupConfigRequest,
                                    ChangeDistributedDbBackupConfigResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeDistributedDbBackupConfigDetails(),
                "changeDistributedDbBackupConfigDetails is required");

        return clientCall(request, ChangeDistributedDbBackupConfigResponse::builder)
                .logger(LOG, "changeDistributedDbBackupConfig")
                .serviceDetails(
                        "DistributedDbService",
                        "ChangeDistributedDbBackupConfig",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ChangeDistributedDbBackupConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDistributedDbBackupConfigRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeDbBackupConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedDbBackupConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedDbBackupConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedDatabaseGsmsResponse>
            configureDistributedDatabaseGsms(
                    ConfigureDistributedDatabaseGsmsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseGsmsRequest,
                                    ConfigureDistributedDatabaseGsmsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getConfigureDistributedDatabaseGsmsDetails(),
                "configureDistributedDatabaseGsmsDetails is required");

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, ConfigureDistributedDatabaseGsmsResponse::builder)
                .logger(LOG, "configureDistributedDatabaseGsms")
                .serviceDetails(
                        "DistributedDbService",
                        "ConfigureDistributedDatabaseGsms",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ConfigureDistributedDatabaseGsms")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDistributedDatabaseGsmsRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureGsms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedDatabaseGsmsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedDatabaseGsmsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedDatabaseShardingResponse>
            configureDistributedDatabaseSharding(
                    ConfigureDistributedDatabaseShardingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseShardingRequest,
                                    ConfigureDistributedDatabaseShardingResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, ConfigureDistributedDatabaseShardingResponse::builder)
                .logger(LOG, "configureDistributedDatabaseSharding")
                .serviceDetails(
                        "DistributedDbService",
                        "ConfigureDistributedDatabaseSharding",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ConfigureDistributedDatabaseSharding")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDistributedDatabaseShardingRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureSharding")
                .appendQueryParam("isRebalanceRequired", request.getIsRebalanceRequired())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedDatabaseShardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedDatabaseShardingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributedDatabaseResponse> createDistributedDatabase(
            CreateDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDistributedDatabaseRequest, CreateDistributedDatabaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDistributedDatabaseDetails(),
                "createDistributedDatabaseDetails is required");

        return clientCall(request, CreateDistributedDatabaseResponse::builder)
                .logger(LOG, "createDistributedDatabase")
                .serviceDetails("DistributedDbService", "CreateDistributedDatabase", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabase.class,
                        CreateDistributedDatabaseResponse.Builder::distributedDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDistributedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDistributedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributedDatabaseResponse> deleteDistributedDatabase(
            DeleteDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDistributedDatabaseRequest, DeleteDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, DeleteDistributedDatabaseResponse::builder)
                .logger(LOG, "deleteDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "DeleteDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/DeleteDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDistributedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(
                        request,
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse::builder)
                .logger(LOG, "downloadDistributedDatabaseGsmCertificateSigningRequest")
                .serviceDetails(
                        "DistributedDbService",
                        "DownloadDistributedDatabaseGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/DownloadDistributedDatabaseGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DownloadDistributedDatabaseGsmCertificateSigningRequestRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("downloadGsmCertificateSigningRequest")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "etag",
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(request.getCaBundleId(), "caBundleId is required");

        return clientCall(
                        request,
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse::builder)
                .logger(LOG, "generateDistributedDatabaseGsmCertificateSigningRequest")
                .serviceDetails(
                        "DistributedDbService",
                        "GenerateDistributedDatabaseGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GenerateDistributedDatabaseGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        GenerateDistributedDatabaseGsmCertificateSigningRequestRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateGsmCertificateSigningRequest")
                .appendQueryParam("caBundleId", request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDistributedDatabaseWalletResponse>
            generateDistributedDatabaseWallet(
                    GenerateDistributedDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseWalletRequest,
                                    GenerateDistributedDatabaseWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getGenerateDistributedDatabaseWalletDetails(),
                "generateDistributedDatabaseWalletDetails is required");

        return clientCall(request, GenerateDistributedDatabaseWalletResponse::builder)
                .logger(LOG, "generateDistributedDatabaseWallet")
                .serviceDetails(
                        "DistributedDbService",
                        "GenerateDistributedDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GenerateDistributedDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDistributedDatabaseWalletRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateDistributedDatabaseWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDistributedDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GenerateDistributedDatabaseWalletResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateDistributedDatabaseWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        GenerateDistributedDatabaseWalletResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDistributedDatabaseResponse> getDistributedDatabase(
            GetDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, GetDistributedDatabaseResponse::builder)
                .logger(LOG, "getDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "GetDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GetDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendQueryParam("metadata", request.getMetadata())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabase.class,
                        GetDistributedDatabaseResponse.Builder::distributedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", GetDistributedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDistributedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDistributedDatabasesResponse> listDistributedDatabases(
            ListDistributedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDistributedDatabasesResponse::builder)
                .logger(LOG, "listDistributedDatabases")
                .serviceDetails(
                        "DistributedDbService",
                        "ListDistributedDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabaseCollection/ListDistributedDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDistributedDatabasesRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
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
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabaseCollection
                                .class,
                        ListDistributedDatabasesResponse.Builder::distributedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDistributedDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDistributedDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDistributedDatabaseResponse> patchDistributedDatabase(
            PatchDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getPatchDistributedDatabaseDetails(),
                "patchDistributedDatabaseDetails is required");

        return clientCall(request, PatchDistributedDatabaseResponse::builder)
                .logger(LOG, "patchDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "PatchDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/PatchDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDistributedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateDistributedDatabasePasswordsResponse>
            rotateDistributedDatabasePasswords(
                    RotateDistributedDatabasePasswordsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedDatabasePasswordsRequest,
                                    RotateDistributedDatabasePasswordsResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, RotateDistributedDatabasePasswordsResponse::builder)
                .logger(LOG, "rotateDistributedDatabasePasswords")
                .serviceDetails(
                        "DistributedDbService",
                        "RotateDistributedDatabasePasswords",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/RotateDistributedDatabasePasswords")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateDistributedDatabasePasswordsRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateDbPasswords")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateDistributedDatabasePasswordsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateDistributedDatabasePasswordsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartDistributedDatabaseResponse> startDistributedDatabase(
            StartDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, StartDistributedDatabaseResponse::builder)
                .logger(LOG, "startDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "StartDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/StartDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("startDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartDistributedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopDistributedDatabaseResponse> stopDistributedDatabase(
            StopDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, StopDistributedDatabaseResponse::builder)
                .logger(LOG, "stopDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "StopDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/StopDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stopDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopDistributedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributedDatabaseResponse> updateDistributedDatabase(
            UpdateDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDistributedDatabaseRequest, UpdateDistributedDatabaseResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDistributedDatabaseDetails(),
                "updateDistributedDatabaseDetails is required");

        return clientCall(request, UpdateDistributedDatabaseResponse::builder)
                .logger(LOG, "updateDistributedDatabase")
                .serviceDetails(
                        "DistributedDbService",
                        "UpdateDistributedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/UpdateDistributedDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDistributedDatabaseRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabase.class,
                        UpdateDistributedDatabaseResponse.Builder::distributedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDistributedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDistributedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails(),
                "uploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails is required");

        return clientCall(
                        request,
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse
                                ::builder)
                .logger(LOG, "uploadDistributedDatabaseSignedCertificateAndGenerateWallet")
                .serviceDetails(
                        "DistributedDbService",
                        "UploadDistributedDatabaseSignedCertificateAndGenerateWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/UploadDistributedDatabaseSignedCertificateAndGenerateWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("uploadSignedCertificateAndGenerateWallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDistributedDatabaseNetworkResponse>
            validateDistributedDatabaseNetwork(
                    ValidateDistributedDatabaseNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedDatabaseNetworkRequest,
                                    ValidateDistributedDatabaseNetworkResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabaseId(), "distributedDatabaseId must not be blank");

        return clientCall(request, ValidateDistributedDatabaseNetworkResponse::builder)
                .logger(LOG, "validateDistributedDatabaseNetwork")
                .serviceDetails(
                        "DistributedDbService",
                        "ValidateDistributedDatabaseNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ValidateDistributedDatabaseNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDistributedDatabaseNetworkRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabases")
                .appendPathParam(request.getDistributedDatabaseId())
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
                        ValidateDistributedDatabaseNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDistributedDatabaseNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
