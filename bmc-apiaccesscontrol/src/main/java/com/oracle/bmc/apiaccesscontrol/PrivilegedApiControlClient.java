/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apiaccesscontrol.requests.*;
import com.oracle.bmc.apiaccesscontrol.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
public class PrivilegedApiControlClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements PrivilegedApiControl {
    /** Service instance for PrivilegedApiControl. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("PRIVILEGEDAPICONTROL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://pactl.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivilegedApiControlClient.class);

    private final PrivilegedApiControlWaiters waiters;

    private final PrivilegedApiControlPaginators paginators;

    PrivilegedApiControlClient(
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
                                    .nameFormat("PrivilegedApiControl-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new PrivilegedApiControlWaiters(executorService, this);

        this.paginators = new PrivilegedApiControlPaginators(this);
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
                    Builder, PrivilegedApiControlClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apiaccesscontrol";
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
        public PrivilegedApiControlClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivilegedApiControlClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangePrivilegedApiControlCompartmentResponse changePrivilegedApiControlCompartment(
            ChangePrivilegedApiControlCompartmentRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivilegedApiControlCompartmentDetails(),
                "changePrivilegedApiControlCompartmentDetails is required");

        return clientCall(request, ChangePrivilegedApiControlCompartmentResponse::builder)
                .logger(LOG, "changePrivilegedApiControlCompartment")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "ChangePrivilegedApiControlCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControl/ChangePrivilegedApiControlCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivilegedApiControlCompartmentRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
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
                        ChangePrivilegedApiControlCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivilegedApiControlCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePrivilegedApiControlResponse createPrivilegedApiControl(
            CreatePrivilegedApiControlRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivilegedApiControlDetails(),
                "createPrivilegedApiControlDetails is required");

        return clientCall(request, CreatePrivilegedApiControlResponse::builder)
                .logger(LOG, "createPrivilegedApiControl")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "CreatePrivilegedApiControl",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControl/CreatePrivilegedApiControl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControl.class,
                        CreatePrivilegedApiControlResponse.Builder::privilegedApiControl)
                .handleResponseHeaderString(
                        "location", CreatePrivilegedApiControlResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivilegedApiControlResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivilegedApiControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivilegedApiControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePrivilegedApiControlResponse deletePrivilegedApiControl(
            DeletePrivilegedApiControlRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");

        return clientCall(request, DeletePrivilegedApiControlResponse::builder)
                .logger(LOG, "deletePrivilegedApiControl")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "DeletePrivilegedApiControl",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControl/DeletePrivilegedApiControl")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivilegedApiControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivilegedApiControlResponse getPrivilegedApiControl(
            GetPrivilegedApiControlRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");

        return clientCall(request, GetPrivilegedApiControlResponse::builder)
                .logger(LOG, "getPrivilegedApiControl")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "GetPrivilegedApiControl",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControl/GetPrivilegedApiControl")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControl.class,
                        GetPrivilegedApiControlResponse.Builder::privilegedApiControl)
                .handleResponseHeaderString("etag", GetPrivilegedApiControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivilegedApiControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPrivilegedApiControlsResponse listPrivilegedApiControls(
            ListPrivilegedApiControlsRequest request) {

        return clientCall(request, ListPrivilegedApiControlsResponse::builder)
                .logger(LOG, "listPrivilegedApiControls")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "ListPrivilegedApiControls",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControlCollection/ListPrivilegedApiControls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivilegedApiControlsRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControlCollection.class,
                        ListPrivilegedApiControlsResponse.Builder::privilegedApiControlCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivilegedApiControlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivilegedApiControlsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdatePrivilegedApiControlResponse updatePrivilegedApiControl(
            UpdatePrivilegedApiControlRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivilegedApiControlDetails(),
                "updatePrivilegedApiControlDetails is required");

        return clientCall(request, UpdatePrivilegedApiControlResponse::builder)
                .logger(LOG, "updatePrivilegedApiControl")
                .serviceDetails(
                        "PrivilegedApiControl",
                        "UpdatePrivilegedApiControl",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiControl/UpdatePrivilegedApiControl")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivilegedApiControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PrivilegedApiControlWaiters getWaiters() {
        return waiters;
    }

    @Override
    public PrivilegedApiControlPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
    public PrivilegedApiControlClient(
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
