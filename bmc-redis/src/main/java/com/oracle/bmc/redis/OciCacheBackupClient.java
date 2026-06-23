/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheBackupClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OciCacheBackup {
    /** Service instance for OciCacheBackup. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OciCacheBackupClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://redis.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCacheBackupClient.class);

    private final OciCacheBackupWaiters waiters;

    private final OciCacheBackupPaginators paginators;

    OciCacheBackupClient(
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
                                    .nameFormat("OciCacheBackup-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OciCacheBackupWaiters(executorService, this);

        this.paginators = new OciCacheBackupPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OciCacheBackupClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "redis";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public OciCacheBackupClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OciCacheBackupClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeOciCacheBackupCompartmentResponse changeOciCacheBackupCompartment(
            ChangeOciCacheBackupCompartmentRequest request) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeOciCacheBackupCompartmentDetails(),
                "changeOciCacheBackupCompartmentDetails is required");

        return clientCall(request, ChangeOciCacheBackupCompartmentResponse::builder)
                .logger(LOG, "changeOciCacheBackupCompartment")
                .serviceDetails(
                        "OciCacheBackup",
                        "ChangeOciCacheBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/ChangeOciCacheBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOciCacheBackupCompartmentRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOciCacheBackupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOciCacheBackupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOciCacheBackupResponse createOciCacheBackup(CreateOciCacheBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateOciCacheBackupDetails(),
                "createOciCacheBackupDetails is required");

        return clientCall(request, CreateOciCacheBackupResponse::builder)
                .logger(LOG, "createOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "CreateOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/CreateOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        CreateOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", CreateOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOciCacheBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOciCacheBackupResponse deleteOciCacheBackup(DeleteOciCacheBackupRequest request) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");

        return clientCall(request, DeleteOciCacheBackupResponse::builder)
                .logger(LOG, "deleteOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "DeleteOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/DeleteOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOciCacheBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportOciCacheBackupToObjectStorageResponse exportOciCacheBackupToObjectStorage(
            ExportOciCacheBackupToObjectStorageRequest request) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getExportOciCacheBackupToObjectStorageDetails(),
                "exportOciCacheBackupToObjectStorageDetails is required");

        return clientCall(request, ExportOciCacheBackupToObjectStorageResponse::builder)
                .logger(LOG, "exportOciCacheBackupToObjectStorage")
                .serviceDetails(
                        "OciCacheBackup",
                        "ExportOciCacheBackupToObjectStorage",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/ExportOciCacheBackupToObjectStorage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportOciCacheBackupToObjectStorageRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .appendPathParam("actions")
                .appendPathParam("exportToObjectStorage")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportOciCacheBackupToObjectStorageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ExportOciCacheBackupToObjectStorageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOciCacheBackupResponse getOciCacheBackup(GetOciCacheBackupRequest request) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");

        return clientCall(request, GetOciCacheBackupResponse::builder)
                .logger(LOG, "getOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "GetOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/GetOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        GetOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", GetOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOciCacheBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOciCacheBackupsResponse listOciCacheBackups(ListOciCacheBackupsRequest request) {

        return clientCall(request, ListOciCacheBackupsResponse::builder)
                .logger(LOG, "listOciCacheBackups")
                .serviceDetails(
                        "OciCacheBackup",
                        "ListOciCacheBackups",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackupSummary/ListOciCacheBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciCacheBackupsRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("ociCacheBackupId", request.getOciCacheBackupId())
                .appendQueryParam("sourceClusterId", request.getSourceClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackupCollection.class,
                        ListOciCacheBackupsResponse.Builder::ociCacheBackupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOciCacheBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOciCacheBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOciCacheBackupResponse updateOciCacheBackup(UpdateOciCacheBackupRequest request) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOciCacheBackupDetails(),
                "updateOciCacheBackupDetails is required");

        return clientCall(request, UpdateOciCacheBackupResponse::builder)
                .logger(LOG, "updateOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "UpdateOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/UpdateOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        UpdateOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", UpdateOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOciCacheBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OciCacheBackupWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OciCacheBackupPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
    public OciCacheBackupClient(
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
