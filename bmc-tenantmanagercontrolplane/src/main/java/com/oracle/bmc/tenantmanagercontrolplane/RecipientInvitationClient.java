/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class RecipientInvitationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements RecipientInvitation {
    /** Service instance for RecipientInvitation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("RECIPIENTINVITATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RecipientInvitationAsyncClient.class);

    private final RecipientInvitationWaiters waiters;

    private final RecipientInvitationPaginators paginators;

    private RecipientInvitationClient(
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
                                    .nameFormat("RecipientInvitation-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new RecipientInvitationWaiters(executorService, this);

        this.paginators = new RecipientInvitationPaginators(this);
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
                    Builder, RecipientInvitationClient> {
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
        public RecipientInvitationClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RecipientInvitationClient(
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
    public AcceptRecipientInvitationResponse acceptRecipientInvitation(
            AcceptRecipientInvitationRequest request) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, AcceptRecipientInvitationResponse::builder)
                .logger(LOG, "acceptRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "AcceptRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/AcceptRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AcceptRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .appendPathParam("actions")
                .appendPathParam("accept")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", AcceptRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AcceptRecipientInvitationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetRecipientInvitationResponse getRecipientInvitation(
            GetRecipientInvitationRequest request) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, GetRecipientInvitationResponse::builder)
                .logger(LOG, "getRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "GetRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/GetRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        GetRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRecipientInvitationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public IgnoreRecipientInvitationResponse ignoreRecipientInvitation(
            IgnoreRecipientInvitationRequest request) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, IgnoreRecipientInvitationResponse::builder)
                .logger(LOG, "ignoreRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "IgnoreRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/IgnoreRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IgnoreRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .appendPathParam("actions")
                .appendPathParam("ignore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        IgnoreRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", IgnoreRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IgnoreRecipientInvitationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListRecipientInvitationsResponse listRecipientInvitations(
            ListRecipientInvitationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRecipientInvitationsResponse::builder)
                .logger(LOG, "listRecipientInvitations")
                .serviceDetails(
                        "RecipientInvitation",
                        "ListRecipientInvitations",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/ListRecipientInvitations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecipientInvitationsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendQueryParam("senderTenancyId", request.getSenderTenancyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationCollection
                                .class,
                        ListRecipientInvitationsResponse.Builder::recipientInvitationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecipientInvitationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecipientInvitationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRecipientInvitationResponse updateRecipientInvitation(
            UpdateRecipientInvitationRequest request) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRecipientInvitationDetails(),
                "updateRecipientInvitationDetails is required");

        return clientCall(request, UpdateRecipientInvitationResponse::builder)
                .logger(LOG, "updateRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "UpdateRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/UpdateRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        UpdateRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateRecipientInvitationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RecipientInvitationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public RecipientInvitationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
    public RecipientInvitationClient(
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
