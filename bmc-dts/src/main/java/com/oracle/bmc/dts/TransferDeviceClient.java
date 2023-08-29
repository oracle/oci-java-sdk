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
public class TransferDeviceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements TransferDevice {
    /** Service instance for TransferDevice. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERDEVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferDeviceClient.class);

    private final TransferDeviceWaiters waiters;

    TransferDeviceClient(
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
                                    .nameFormat("TransferDevice-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new TransferDeviceWaiters(executorService, this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TransferDeviceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dts";
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public TransferDeviceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferDeviceClient(this, authenticationDetailsProvider, executorService);
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
    public CreateTransferDeviceResponse createTransferDevice(CreateTransferDeviceRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");
        Objects.requireNonNull(
                request.getCreateTransferDeviceDetails(),
                "createTransferDeviceDetails is required");

        return clientCall(request, CreateTransferDeviceResponse::builder)
                .logger(LOG, "createTransferDevice")
                .serviceDetails("TransferDevice", "CreateTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.NewTransferDevice.class,
                        CreateTransferDeviceResponse.Builder::newTransferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTransferDeviceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteTransferDeviceResponse deleteTransferDevice(DeleteTransferDeviceRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");

        return clientCall(request, DeleteTransferDeviceResponse::builder)
                .logger(LOG, "deleteTransferDevice")
                .serviceDetails("TransferDevice", "DeleteTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTransferDeviceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTransferDeviceResponse getTransferDevice(GetTransferDeviceRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");

        return clientCall(request, GetTransferDeviceResponse::builder)
                .logger(LOG, "getTransferDevice")
                .serviceDetails("TransferDevice", "GetTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferDevice.class,
                        GetTransferDeviceResponse.Builder::transferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", GetTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTransferDeviceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListTransferDevicesResponse listTransferDevices(ListTransferDevicesRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ListTransferDevicesResponse::builder)
                .logger(LOG, "listTransferDevices")
                .serviceDetails("TransferDevice", "ListTransferDevices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTransferDevicesRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.MultipleTransferDevices.class,
                        ListTransferDevicesResponse.Builder::multipleTransferDevices)
                .handleResponseHeaderString(
                        "opc-request-id", ListTransferDevicesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTransferDeviceResponse updateTransferDevice(UpdateTransferDeviceRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferDeviceLabel(), "transferDeviceLabel must not be blank");
        Objects.requireNonNull(
                request.getUpdateTransferDeviceDetails(),
                "updateTransferDeviceDetails is required");

        return clientCall(request, UpdateTransferDeviceResponse::builder)
                .logger(LOG, "updateTransferDevice")
                .serviceDetails("TransferDevice", "UpdateTransferDevice", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTransferDeviceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferDevices")
                .appendPathParam(request.getTransferDeviceLabel())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferDevice.class,
                        UpdateTransferDeviceResponse.Builder::transferDevice)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTransferDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTransferDeviceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public TransferDeviceWaiters getWaiters() {
        return waiters;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
    public TransferDeviceClient(
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
