/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.distributeddatabase.requests.*;
import com.oracle.bmc.distributeddatabase.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class DistributedDbServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DistributedDbService {
    /** Service instance for DistributedDbService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISTRIBUTEDDBSERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedDbServiceClient.class);

    private final DistributedDbServiceWaiters waiters;

    private final DistributedDbServicePaginators paginators;

    DistributedDbServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DistributedDbServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("DistributedDbService-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DistributedDbServiceWaiters(executorService, this);

        this.paginators = new DistributedDbServicePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DistributedDbServiceClient",
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
                    Builder, DistributedDbServiceClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "distributeddatabase";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public DistributedDbServiceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DistributedDbServiceClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public AddDistributedDatabaseGdsControlNodeResponse addDistributedDatabaseGdsControlNode(
            AddDistributedDatabaseGdsControlNodeRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDistributedDatabaseGdsControlNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDistributedDatabaseGdsControlNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDistributedDatabaseCompartmentResponse changeDistributedDatabaseCompartment(
            ChangeDistributedDatabaseCompartmentRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedDatabaseCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeDistributedDbBackupConfigResponse changeDistributedDbBackupConfig(
            ChangeDistributedDbBackupConfigRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedDbBackupConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedDbBackupConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureDistributedDatabaseGsmsResponse configureDistributedDatabaseGsms(
            ConfigureDistributedDatabaseGsmsRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedDatabaseGsmsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedDatabaseGsmsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureDistributedDatabaseShardingResponse configureDistributedDatabaseSharding(
            ConfigureDistributedDatabaseShardingRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureDistributedDatabaseShardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDistributedDatabaseShardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDistributedDatabaseResponse createDistributedDatabase(
            CreateDistributedDatabaseRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeleteDistributedDatabaseResponse deleteDistributedDatabase(
            DeleteDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDistributedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DownloadDistributedDatabaseGsmCertificateSigningRequestResponse
            downloadDistributedDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GenerateDistributedDatabaseGsmCertificateSigningRequestResponse
            generateDistributedDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateDistributedDatabaseWalletResponse generateDistributedDatabaseWallet(
            GenerateDistributedDatabaseWalletRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetDistributedDatabaseResponse getDistributedDatabase(
            GetDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabase.class,
                        GetDistributedDatabaseResponse.Builder::distributedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", GetDistributedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDistributedDatabaseResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListDistributedDatabasesResponse listDistributedDatabases(
            ListDistributedDatabasesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabaseCollection
                                .class,
                        ListDistributedDatabasesResponse.Builder::distributedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDistributedDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDistributedDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchDistributedDatabaseResponse patchDistributedDatabase(
            PatchDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDistributedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateDistributedDatabasePasswordsResponse rotateDistributedDatabasePasswords(
            RotateDistributedDatabasePasswordsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateDistributedDatabasePasswordsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateDistributedDatabasePasswordsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartDistributedDatabaseResponse startDistributedDatabase(
            StartDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartDistributedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopDistributedDatabaseResponse stopDistributedDatabase(
            StopDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopDistributedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopDistributedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDistributedDatabaseResponse updateDistributedDatabase(
            UpdateDistributedDatabaseRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabase.class,
                        UpdateDistributedDatabaseResponse.Builder::distributedDatabase)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDistributedDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDistributedDatabaseResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse
            uploadDistributedDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateDistributedDatabaseNetworkResponse validateDistributedDatabaseNetwork(
            ValidateDistributedDatabaseNetworkRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateDistributedDatabaseNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDistributedDatabaseNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DistributedDbServiceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DistributedDbServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
    public DistributedDbServiceClient(
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
