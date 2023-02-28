/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class TransferPackageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements TransferPackage {
    /** Service instance for TransferPackage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERPACKAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferPackageClient.class);

    private final TransferPackageWaiters waiters;

    private TransferPackageClient(
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
                                    .nameFormat("TransferPackage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new TransferPackageWaiters(executorService, this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TransferPackageClient> {
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
        public TransferPackageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferPackageClient(this, authenticationDetailsProvider, executorService);
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
    public AttachDevicesToTransferPackageResponse attachDevicesToTransferPackage(
            AttachDevicesToTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getAttachDevicesDetails(), "attachDevicesDetails is required");

        return clientCall(request, AttachDevicesToTransferPackageResponse::builder)
                .logger(LOG, "attachDevicesToTransferPackage")
                .serviceDetails("TransferPackage", "AttachDevicesToTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDevicesToTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .appendPathParam("actions")
                .appendPathParam("attachDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDevicesToTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AttachDevicesToTransferPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateTransferPackageResponse createTransferPackage(
            CreateTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, CreateTransferPackageResponse::builder)
                .logger(LOG, "createTransferPackage")
                .serviceDetails("TransferPackage", "CreateTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        CreateTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTransferPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteTransferPackageResponse deleteTransferPackage(
            DeleteTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");

        return clientCall(request, DeleteTransferPackageResponse::builder)
                .logger(LOG, "deleteTransferPackage")
                .serviceDetails("TransferPackage", "DeleteTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTransferPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachDevicesFromTransferPackageResponse detachDevicesFromTransferPackage(
            DetachDevicesFromTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getDetachDevicesDetails(), "detachDevicesDetails is required");

        return clientCall(request, DetachDevicesFromTransferPackageResponse::builder)
                .logger(LOG, "detachDevicesFromTransferPackage")
                .serviceDetails("TransferPackage", "DetachDevicesFromTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDevicesFromTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .appendPathParam("actions")
                .appendPathParam("detachDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDevicesFromTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", DetachDevicesFromTransferPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetTransferPackageResponse getTransferPackage(GetTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");

        return clientCall(request, GetTransferPackageResponse::builder)
                .logger(LOG, "getTransferPackage")
                .serviceDetails("TransferPackage", "GetTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        GetTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTransferPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListTransferPackagesResponse listTransferPackages(ListTransferPackagesRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ListTransferPackagesResponse::builder)
                .logger(LOG, "listTransferPackages")
                .serviceDetails("TransferPackage", "ListTransferPackages", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTransferPackagesRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.MultipleTransferPackages.class,
                        ListTransferPackagesResponse.Builder::multipleTransferPackages)
                .handleResponseHeaderString(
                        "opc-request-id", ListTransferPackagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTransferPackageResponse updateTransferPackage(
            UpdateTransferPackageRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferPackageLabel(), "transferPackageLabel must not be blank");
        Objects.requireNonNull(
                request.getUpdateTransferPackageDetails(),
                "updateTransferPackageDetails is required");

        return clientCall(request, UpdateTransferPackageResponse::builder)
                .logger(LOG, "updateTransferPackage")
                .serviceDetails("TransferPackage", "UpdateTransferPackage", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTransferPackageRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferPackages")
                .appendPathParam(request.getTransferPackageLabel())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferPackage.class,
                        UpdateTransferPackageResponse.Builder::transferPackage)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTransferPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTransferPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public TransferPackageWaiters getWaiters() {
        return waiters;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
    public TransferPackageClient(
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
