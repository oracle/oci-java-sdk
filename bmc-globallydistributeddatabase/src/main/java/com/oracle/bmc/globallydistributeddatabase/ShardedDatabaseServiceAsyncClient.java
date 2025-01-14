/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.globallydistributeddatabase.requests.*;
import com.oracle.bmc.globallydistributeddatabase.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ShardedDatabaseService service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class ShardedDatabaseServiceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ShardedDatabaseServiceAsync {
    /** Service instance for ShardedDatabaseService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SHARDEDDATABASESERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ShardedDatabaseServiceAsyncClient.class);

    ShardedDatabaseServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ShardedDatabaseServiceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ShardedDatabaseServiceAsyncClient",
                            "downloadGsmCertificateSigningRequest,generateWallet"));
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
                    Builder, ShardedDatabaseServiceAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "globallydistributeddatabase";
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
        public ShardedDatabaseServiceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ShardedDatabaseServiceAsyncClient(
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
    public java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangePrivateEndpointCompartmentDetails(),
                "changePrivateEndpointCompartmentDetails is required");

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, ChangePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changePrivateEndpointCompartment")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ChangePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpoint/ChangePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateEndpointCompartmentRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeShardedDatabaseCompartmentResponse>
            changeShardedDatabaseCompartment(
                    ChangeShardedDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeShardedDatabaseCompartmentRequest,
                                    ChangeShardedDatabaseCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeShardedDatabaseCompartmentDetails(),
                "changeShardedDatabaseCompartmentDetails is required");

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, ChangeShardedDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeShardedDatabaseCompartment")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ChangeShardedDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/ChangeShardedDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeShardedDatabaseCompartmentRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeShardedDatabaseCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeShardedDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureShardedDatabaseGsmsResponse>
            configureShardedDatabaseGsms(
                    ConfigureShardedDatabaseGsmsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureShardedDatabaseGsmsRequest,
                                    ConfigureShardedDatabaseGsmsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getConfigureShardedDatabaseGsmsDetails(),
                "configureShardedDatabaseGsmsDetails is required");

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, ConfigureShardedDatabaseGsmsResponse::builder)
                .logger(LOG, "configureShardedDatabaseGsms")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ConfigureShardedDatabaseGsms",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/ConfigureShardedDatabaseGsms")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureShardedDatabaseGsmsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureGsms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureShardedDatabaseGsmsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureShardedDatabaseGsmsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureShardingResponse> configureSharding(
            ConfigureShardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConfigureShardingRequest, ConfigureShardingResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, ConfigureShardingResponse::builder)
                .logger(LOG, "configureSharding")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ConfigureSharding",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/ConfigureSharding")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureShardingRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureSharding")
                .appendQueryParam("isRebalanceRequired", request.getIsRebalanceRequired())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", ConfigureShardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ConfigureShardingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePrivateEndpointDetails(),
                "createPrivateEndpointDetails is required");

        return clientCall(request, CreatePrivateEndpointResponse::builder)
                .logger(LOG, "createPrivateEndpoint")
                .serviceDetails("ShardedDatabaseService", "CreatePrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateEndpointRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.PrivateEndpoint.class,
                        CreatePrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateShardedDatabaseResponse> createShardedDatabase(
            CreateShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateShardedDatabaseRequest, CreateShardedDatabaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateShardedDatabaseDetails(),
                "createShardedDatabaseDetails is required");

        return clientCall(request, CreateShardedDatabaseResponse::builder)
                .logger(LOG, "createShardedDatabase")
                .serviceDetails("ShardedDatabaseService", "CreateShardedDatabase", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.ShardedDatabase.class,
                        CreateShardedDatabaseResponse.Builder::shardedDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateShardedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateShardedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateShardedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, DeletePrivateEndpointResponse::builder)
                .logger(LOG, "deletePrivateEndpoint")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "DeletePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpoint/DeletePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateEndpointRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteShardedDatabaseResponse> deleteShardedDatabase(
            DeleteShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteShardedDatabaseRequest, DeleteShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, DeleteShardedDatabaseResponse::builder)
                .logger(LOG, "deleteShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "DeleteShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/DeleteShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteShardedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteShardedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DownloadGsmCertificateSigningRequestResponse>
            downloadGsmCertificateSigningRequest(
                    DownloadGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadGsmCertificateSigningRequestRequest,
                                    DownloadGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, DownloadGsmCertificateSigningRequestResponse::builder)
                .logger(LOG, "downloadGsmCertificateSigningRequest")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "DownloadGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/DownloadGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadGsmCertificateSigningRequestRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("downloadGsmCertificateSigningRequest")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadGsmCertificateSigningRequestResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadGsmCertificateSigningRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DownloadGsmCertificateSigningRequestResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadGsmCertificateSigningRequestResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadGsmCertificateSigningRequestResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FetchConnectionStringResponse> fetchConnectionString(
            FetchConnectionStringRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            FetchConnectionStringRequest, FetchConnectionStringResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, FetchConnectionStringResponse::builder)
                .logger(LOG, "fetchConnectionString")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "FetchConnectionString",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/FetchConnectionString")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FetchConnectionStringRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("getConnectionString")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.ConnectionString.class,
                        FetchConnectionStringResponse.Builder::connectionString)
                .handleResponseHeaderString(
                        "opc-request-id", FetchConnectionStringResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", FetchConnectionStringResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FetchShardableCloudAutonomousVmClustersResponse>
            fetchShardableCloudAutonomousVmClusters(
                    FetchShardableCloudAutonomousVmClustersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FetchShardableCloudAutonomousVmClustersRequest,
                                    FetchShardableCloudAutonomousVmClustersResponse>
                            handler) {
        Objects.requireNonNull(
                request.getFetchShardableCloudAutonomousVmClustersDetails(),
                "fetchShardableCloudAutonomousVmClustersDetails is required");

        return clientCall(request, FetchShardableCloudAutonomousVmClustersResponse::builder)
                .logger(LOG, "fetchShardableCloudAutonomousVmClusters")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "FetchShardableCloudAutonomousVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/FetchShardableCloudAutonomousVmClusters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FetchShardableCloudAutonomousVmClustersRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam("actions")
                .appendPathParam("listShardableCloudAutonomousVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model
                                .ShardableCloudAutonomousVmClusters.class,
                        FetchShardableCloudAutonomousVmClustersResponse.Builder
                                ::shardableCloudAutonomousVmClusters)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FetchShardableCloudAutonomousVmClustersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateGsmCertificateSigningRequestResponse>
            generateGsmCertificateSigningRequest(
                    GenerateGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateGsmCertificateSigningRequestRequest,
                                    GenerateGsmCertificateSigningRequestResponse>
                            handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, GenerateGsmCertificateSigningRequestResponse::builder)
                .logger(LOG, "generateGsmCertificateSigningRequest")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "GenerateGsmCertificateSigningRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/GenerateGsmCertificateSigningRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateGsmCertificateSigningRequestRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateGsmCertificateSigningRequest")
                .appendQueryParam("caBundleId", request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateGsmCertificateSigningRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateGsmCertificateSigningRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateWalletResponse> generateWallet(
            GenerateWalletRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateWalletRequest, GenerateWalletResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getGenerateWalletDetails(), "generateWalletDetails is required");

        return clientCall(request, GenerateWalletResponse::builder)
                .logger(LOG, "generateWallet")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "GenerateWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/GenerateWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateWalletRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(java.io.InputStream.class, GenerateWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GenerateWalletResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length", GenerateWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified", GenerateWalletResponse.Builder::lastModified)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, GetPrivateEndpointResponse::builder)
                .logger(LOG, "getPrivateEndpoint")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "GetPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpoint/GetPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateEndpointRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.PrivateEndpoint.class,
                        GetPrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetShardedDatabaseResponse> getShardedDatabase(
            GetShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetShardedDatabaseRequest, GetShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, GetShardedDatabaseResponse::builder)
                .logger(LOG, "getShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "GetShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/GetShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendQueryParam("metadata", request.getMetadata())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.ShardedDatabase.class,
                        GetShardedDatabaseResponse.Builder::shardedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", GetShardedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetShardedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230301")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPrivateEndpointsResponse::builder)
                .logger(LOG, "listPrivateEndpoints")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ListPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpointCollection/ListPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateEndpointsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.PrivateEndpointCollection
                                .class,
                        ListPrivateEndpointsResponse.Builder::privateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListShardedDatabasesResponse> listShardedDatabases(
            ListShardedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListShardedDatabasesRequest, ListShardedDatabasesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListShardedDatabasesResponse::builder)
                .logger(LOG, "listShardedDatabases")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ListShardedDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabaseCollection/ListShardedDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListShardedDatabasesRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.ShardedDatabaseCollection
                                .class,
                        ListShardedDatabasesResponse.Builder::shardedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListShardedDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListShardedDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.WorkRequestErrorCollection
                                .class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model
                                .WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model
                                .WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchShardedDatabaseResponse> patchShardedDatabase(
            PatchShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchShardedDatabaseRequest, PatchShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getPatchShardedDatabaseDetails(),
                "patchShardedDatabaseDetails is required");

        return clientCall(request, PatchShardedDatabaseResponse::builder)
                .logger(LOG, "patchShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "PatchShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/PatchShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchShardedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchShardedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PrevalidateShardedDatabaseResponse>
            prevalidateShardedDatabase(
                    PrevalidateShardedDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PrevalidateShardedDatabaseRequest,
                                    PrevalidateShardedDatabaseResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getPrevalidateShardedDatabaseDetails(),
                "prevalidateShardedDatabaseDetails is required");

        return clientCall(request, PrevalidateShardedDatabaseResponse::builder)
                .logger(LOG, "prevalidateShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "PrevalidateShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/PrevalidateShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PrevalidateShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam("actions")
                .appendPathParam("prevalidate")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model
                                .PrevalidateShardedDatabaseResult.class,
                        PrevalidateShardedDatabaseResponse.Builder
                                ::prevalidateShardedDatabaseResult)
                .handleResponseHeaderString(
                        "opc-request-id", PrevalidateShardedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReinstateProxyInstanceResponse> reinstateProxyInstance(
            ReinstateProxyInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReinstateProxyInstanceRequest, ReinstateProxyInstanceResponse>
                    handler) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, ReinstateProxyInstanceResponse::builder)
                .logger(LOG, "reinstateProxyInstance")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ReinstateProxyInstance",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpoint/ReinstateProxyInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReinstateProxyInstanceRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("reinstateProxyInstance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateProxyInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReinstateProxyInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartShardedDatabaseResponse> startShardedDatabase(
            StartShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartShardedDatabaseRequest, StartShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, StartShardedDatabaseResponse::builder)
                .logger(LOG, "startShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "StartShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/StartShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("startDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartShardedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartShardedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopShardedDatabaseResponse> stopShardedDatabase(
            StopShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopShardedDatabaseRequest, StopShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, StopShardedDatabaseResponse::builder)
                .logger(LOG, "stopShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "StopShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/StopShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stopDatabase")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopShardedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopShardedDatabaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateEndpointDetails(),
                "updatePrivateEndpointDetails is required");

        return clientCall(request, UpdatePrivateEndpointResponse::builder)
                .logger(LOG, "updatePrivateEndpoint")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "UpdatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/PrivateEndpoint/UpdatePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateEndpointRequest::builder)
                .basePath("/20230301")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.PrivateEndpoint.class,
                        UpdatePrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdatePrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateShardedDatabaseResponse> updateShardedDatabase(
            UpdateShardedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateShardedDatabaseRequest, UpdateShardedDatabaseResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateShardedDatabaseDetails(),
                "updateShardedDatabaseDetails is required");

        return clientCall(request, UpdateShardedDatabaseResponse::builder)
                .logger(LOG, "updateShardedDatabase")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "UpdateShardedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/UpdateShardedDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateShardedDatabaseRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.globallydistributeddatabase.model.ShardedDatabase.class,
                        UpdateShardedDatabaseResponse.Builder::shardedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateShardedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateShardedDatabaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadSignedCertificateAndGenerateWalletResponse>
            uploadSignedCertificateAndGenerateWallet(
                    UploadSignedCertificateAndGenerateWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadSignedCertificateAndGenerateWalletRequest,
                                    UploadSignedCertificateAndGenerateWalletResponse>
                            handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUploadSignedCertificateAndGenerateWalletDetails(),
                "uploadSignedCertificateAndGenerateWalletDetails is required");

        return clientCall(request, UploadSignedCertificateAndGenerateWalletResponse::builder)
                .logger(LOG, "uploadSignedCertificateAndGenerateWallet")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "UploadSignedCertificateAndGenerateWallet",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/UploadSignedCertificateAndGenerateWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadSignedCertificateAndGenerateWalletRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("uploadSignedCertificateAndGenerateWallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadSignedCertificateAndGenerateWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UploadSignedCertificateAndGenerateWalletResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateNetworkResponse> validateNetwork(
            ValidateNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateNetworkRequest, ValidateNetworkResponse>
                    handler) {

        Validate.notBlank(request.getShardedDatabaseId(), "shardedDatabaseId must not be blank");

        return clientCall(request, ValidateNetworkResponse::builder)
                .logger(LOG, "validateNetwork")
                .serviceDetails(
                        "ShardedDatabaseService",
                        "ValidateNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-autonomous-database/20230301/ShardedDatabase/ValidateNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateNetworkRequest::builder)
                .basePath("/20230301")
                .appendPathParam("shardedDatabases")
                .appendPathParam(request.getShardedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("validateNetwork")
                .appendQueryParam("isSurrogate", request.getIsSurrogate())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("isPrimary", request.getIsPrimary())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", ValidateNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateNetworkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
    public ShardedDatabaseServiceAsyncClient(
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
