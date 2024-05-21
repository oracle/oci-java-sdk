/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery;

import com.oracle.bmc.disasterrecovery.internal.http.*;
import com.oracle.bmc.disasterrecovery.requests.*;
import com.oracle.bmc.disasterrecovery.responses.*;

/**
 * Async client implementation for DisasterRecovery service. <br/>
 * There are two ways to use async client:
 * 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
 * getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else,
 * because the stream will be closed right after the AsyncHandler is invoked. <br/>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
 * but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
 * is used, it is still safe to use the Future to determine whether or not the request was completed via
 * Future.isDone/isCancelled.<br/>
 * Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class DisasterRecoveryAsyncClient implements DisasterRecoveryAsync {
    /**
     * Service instance for DisasterRecovery.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISASTERRECOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://disaster-recovery.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DisasterRecoveryAsyncClient.class);

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;
    private final com.oracle.bmc.http.internal.RestClientFactory restClientFactory;
    private final com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory;
    private final java.util.Map<
                    com.oracle.bmc.http.signing.SigningStrategy,
                    com.oracle.bmc.http.signing.RequestSignerFactory>
            signingStrategyRequestSignerFactories;
    private final boolean isNonBufferingApacheClient;
    private final com.oracle.bmc.ClientConfiguration clientConfigurationToUse;
    private String regionId;

    /**
     * Used to synchronize any updates on the `this.client` object.
     */
    private final Object clientUpdate = new Object();

    /**
     * Stores the actual client object used to make the API calls.
     * Note: This object can get refreshed periodically, hence it's important to keep any updates synchronized.
     *       For any writes to the object, please synchronize on `this.clientUpdate`.
     */
    private volatile com.oracle.bmc.http.internal.RestClient client;

    /**
     * Keeps track of the last endpoint that was assigned to the client, which in turn can be used when the client is refreshed.
     * Note: Always synchronize on `this.clientUpdate` when reading/writing this field.
     */
    private volatile String overrideEndpoint = null;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DisasterRecoveryAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DisasterRecoveryAsyncClient(
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
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    public DisasterRecoveryAsyncClient(
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
            com.oracle.bmc.http.internal.RestClientFactoryBuilder restClientFactoryBuilder) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators =
                new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((com.oracle.bmc.auth.ProvidesClientConfigurators)
                                    this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators =
                new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        this.restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        this.isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.clientConfigurationToUse = configuration;

        this.refreshClient();

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.regionId = provider.getRegion().getRegionId();
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, DisasterRecoveryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DisasterRecoveryAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DisasterRecoveryAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    @Override
    public void refreshClient() {
        LOG.info("Refreshing client '{}'.", this.client != null ? this.client.getClass() : null);
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                this.defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);

        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        this.signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient =
                this.restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        this.clientConfigurationToUse,
                        this.isNonBufferingApacheClient);

        synchronized (clientUpdate) {
            if (this.overrideEndpoint != null) {
                refreshedClient.setEndpoint(this.overrideEndpoint);
            }

            this.client = refreshedClient;
        }

        LOG.info("Refreshed client '{}'.", this.client != null ? this.client.getClass() : null);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);

        synchronized (clientUpdate) {
            this.overrideEndpoint = endpoint;
            client.setEndpoint(endpoint);
        }
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        this.regionId = region.getRegionId();
        java.util.Optional<String> endpoint =
                com.oracle.bmc.internal.GuavaUtils.adaptFromGuava(region.getEndpoint(SERVICE));
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        this.regionId = regionId;
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     * enable or disable the use of realm-specific endpoint template respectively
     */
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        setEndpoint(
                com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils
                        .getRealmSpecificEndpointTemplate(
                                useOfRealmSpecificEndpointTemplateEnabled, this.regionId, SERVICE));
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AssociateDrProtectionGroupResponse>
            associateDrProtectionGroup(
                    AssociateDrProtectionGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AssociateDrProtectionGroupRequest,
                                    AssociateDrProtectionGroupResponse>
                            handler) {
        LOG.trace("Called async associateDrProtectionGroup");
        final AssociateDrProtectionGroupRequest interceptedRequest =
                AssociateDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AssociateDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "AssociateDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/AssociateDrProtectionGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AssociateDrProtectionGroupResponse>
                transformer =
                        AssociateDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AssociateDrProtectionGroupRequest, AssociateDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AssociateDrProtectionGroupRequest,
                                AssociateDrProtectionGroupResponse>,
                        java.util.concurrent.Future<AssociateDrProtectionGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAssociateDrProtectionGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AssociateDrProtectionGroupRequest, AssociateDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelDrPlanExecutionResponse> cancelDrPlanExecution(
            CancelDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async cancelDrPlanExecution");
        final CancelDrPlanExecutionRequest interceptedRequest =
                CancelDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "CancelDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/CancelDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelDrPlanExecutionResponse>
                transformer =
                        CancelDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>,
                        java.util.concurrent.Future<CancelDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCancelDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {
        LOG.trace("Called async cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/CancelWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer =
                        CancelWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelWorkRequestRequest, CancelWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelWorkRequestRequest, CancelWorkRequestResponse>,
                        java.util.concurrent.Future<CancelWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelWorkRequestRequest, CancelWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDrProtectionGroupCompartmentResponse>
            changeDrProtectionGroupCompartment(
                    ChangeDrProtectionGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDrProtectionGroupCompartmentRequest,
                                    ChangeDrProtectionGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDrProtectionGroupCompartment");
        final ChangeDrProtectionGroupCompartmentRequest interceptedRequest =
                ChangeDrProtectionGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDrProtectionGroupCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ChangeDrProtectionGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/ChangeDrProtectionGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDrProtectionGroupCompartmentResponse>
                transformer =
                        ChangeDrProtectionGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDrProtectionGroupCompartmentRequest,
                        ChangeDrProtectionGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDrProtectionGroupCompartmentRequest,
                                ChangeDrProtectionGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDrProtectionGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDrProtectionGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDrProtectionGroupCompartmentRequest,
                    ChangeDrProtectionGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrPlanResponse> createDrPlan(
            CreateDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDrPlanRequest, CreateDrPlanResponse>
                    handler) {
        LOG.trace("Called async createDrPlan");
        final CreateDrPlanRequest interceptedRequest =
                CreateDrPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrPlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "CreateDrPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/CreateDrPlan");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDrPlanResponse>
                transformer =
                        CreateDrPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDrPlanRequest, CreateDrPlanResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrPlanRequest, CreateDrPlanResponse>,
                        java.util.concurrent.Future<CreateDrPlanResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrPlanDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrPlanRequest, CreateDrPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrPlanExecutionResponse> createDrPlanExecution(
            CreateDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async createDrPlanExecution");
        final CreateDrPlanExecutionRequest interceptedRequest =
                CreateDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "CreateDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/CreateDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDrPlanExecutionResponse>
                transformer =
                        CreateDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>,
                        java.util.concurrent.Future<CreateDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrProtectionGroupResponse> createDrProtectionGroup(
            CreateDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>
                    handler) {
        LOG.trace("Called async createDrProtectionGroup");
        final CreateDrProtectionGroupRequest interceptedRequest =
                CreateDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "CreateDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/CreateDrProtectionGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDrProtectionGroupResponse>
                transformer =
                        CreateDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>,
                        java.util.concurrent.Future<CreateDrProtectionGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrProtectionGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrPlanResponse> deleteDrPlan(
            DeleteDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDrPlanRequest, DeleteDrPlanResponse>
                    handler) {
        LOG.trace("Called async deleteDrPlan");
        final DeleteDrPlanRequest interceptedRequest =
                DeleteDrPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrPlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "DeleteDrPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/DeleteDrPlan");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDrPlanResponse>
                transformer =
                        DeleteDrPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDrPlanRequest, DeleteDrPlanResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrPlanRequest, DeleteDrPlanResponse>,
                        java.util.concurrent.Future<DeleteDrPlanResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrPlanRequest, DeleteDrPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrPlanExecutionResponse> deleteDrPlanExecution(
            DeleteDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async deleteDrPlanExecution");
        final DeleteDrPlanExecutionRequest interceptedRequest =
                DeleteDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "DeleteDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/DeleteDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDrPlanExecutionResponse>
                transformer =
                        DeleteDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>,
                        java.util.concurrent.Future<DeleteDrPlanExecutionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrProtectionGroupResponse> deleteDrProtectionGroup(
            DeleteDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>
                    handler) {
        LOG.trace("Called async deleteDrProtectionGroup");
        final DeleteDrProtectionGroupRequest interceptedRequest =
                DeleteDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "DeleteDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/DeleteDrProtectionGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDrProtectionGroupResponse>
                transformer =
                        DeleteDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>,
                        java.util.concurrent.Future<DeleteDrProtectionGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisassociateDrProtectionGroupResponse>
            disassociateDrProtectionGroup(
                    DisassociateDrProtectionGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateDrProtectionGroupRequest,
                                    DisassociateDrProtectionGroupResponse>
                            handler) {
        LOG.trace("Called async disassociateDrProtectionGroup");
        final DisassociateDrProtectionGroupRequest interceptedRequest =
                DisassociateDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisassociateDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "DisassociateDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/DisassociateDrProtectionGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisassociateDrProtectionGroupResponse>
                transformer =
                        DisassociateDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisassociateDrProtectionGroupRequest, DisassociateDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisassociateDrProtectionGroupRequest,
                                DisassociateDrProtectionGroupResponse>,
                        java.util.concurrent.Future<DisassociateDrProtectionGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisassociateDrProtectionGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisassociateDrProtectionGroupRequest, DisassociateDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrPlanResponse> getDrPlan(
            GetDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDrPlanRequest, GetDrPlanResponse>
                    handler) {
        LOG.trace("Called async getDrPlan");
        final GetDrPlanRequest interceptedRequest = GetDrPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrPlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "GetDrPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/GetDrPlan");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrPlanResponse>
                transformer =
                        GetDrPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDrPlanRequest, GetDrPlanResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetDrPlanRequest, GetDrPlanResponse>,
                        java.util.concurrent.Future<GetDrPlanResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrPlanRequest, GetDrPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrPlanExecutionResponse> getDrPlanExecution(
            GetDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async getDrPlanExecution");
        final GetDrPlanExecutionRequest interceptedRequest =
                GetDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "GetDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/GetDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrPlanExecutionResponse>
                transformer =
                        GetDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>,
                        java.util.concurrent.Future<GetDrPlanExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrProtectionGroupResponse> getDrProtectionGroup(
            GetDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>
                    handler) {
        LOG.trace("Called async getDrProtectionGroup");
        final GetDrProtectionGroupRequest interceptedRequest =
                GetDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "GetDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/GetDrProtectionGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrProtectionGroupResponse>
                transformer =
                        GetDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>,
                        java.util.concurrent.Future<GetDrProtectionGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/GetWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer =
                        GetWorkRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWorkRequestRequest, GetWorkRequestResponse>,
                        java.util.concurrent.Future<GetWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWorkRequestRequest, GetWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IgnoreDrPlanExecutionResponse> ignoreDrPlanExecution(
            IgnoreDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async ignoreDrPlanExecution");
        final IgnoreDrPlanExecutionRequest interceptedRequest =
                IgnoreDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IgnoreDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "IgnoreDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/IgnoreDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, IgnoreDrPlanExecutionResponse>
                transformer =
                        IgnoreDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>,
                        java.util.concurrent.Future<IgnoreDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIgnoreDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrPlanExecutionsResponse> listDrPlanExecutions(
            ListDrPlanExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>
                    handler) {
        LOG.trace("Called async listDrPlanExecutions");
        final ListDrPlanExecutionsRequest interceptedRequest =
                ListDrPlanExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrPlanExecutionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListDrPlanExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/ListDrPlanExecutions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrPlanExecutionsResponse>
                transformer =
                        ListDrPlanExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>,
                        java.util.concurrent.Future<ListDrPlanExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrPlansResponse> listDrPlans(
            ListDrPlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDrPlansRequest, ListDrPlansResponse>
                    handler) {
        LOG.trace("Called async listDrPlans");
        final ListDrPlansRequest interceptedRequest =
                ListDrPlansConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrPlansConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListDrPlans",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/ListDrPlans");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrPlansResponse>
                transformer =
                        ListDrPlansConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDrPlansRequest, ListDrPlansResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrPlansRequest, ListDrPlansResponse>,
                        java.util.concurrent.Future<ListDrPlansResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrPlansRequest, ListDrPlansResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrProtectionGroupsResponse> listDrProtectionGroups(
            ListDrProtectionGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>
                    handler) {
        LOG.trace("Called async listDrProtectionGroups");
        final ListDrProtectionGroupsRequest interceptedRequest =
                ListDrProtectionGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrProtectionGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListDrProtectionGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/ListDrProtectionGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrProtectionGroupsResponse>
                transformer =
                        ListDrProtectionGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>,
                        java.util.concurrent.Future<ListDrProtectionGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequestError/ListWorkRequestErrors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequestLogEntry/ListWorkRequestLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/WorkRequest/ListWorkRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer =
                        ListWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestsRequest, ListWorkRequestsResponse>,
                        java.util.concurrent.Future<ListWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestsRequest, ListWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PauseDrPlanExecutionResponse> pauseDrPlanExecution(
            PauseDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async pauseDrPlanExecution");
        final PauseDrPlanExecutionRequest interceptedRequest =
                PauseDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PauseDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "PauseDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/PauseDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, PauseDrPlanExecutionResponse>
                transformer =
                        PauseDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>,
                        java.util.concurrent.Future<PauseDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPauseDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeDrPlanExecutionResponse> resumeDrPlanExecution(
            ResumeDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async resumeDrPlanExecution");
        final ResumeDrPlanExecutionRequest interceptedRequest =
                ResumeDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "ResumeDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/ResumeDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, ResumeDrPlanExecutionResponse>
                transformer =
                        ResumeDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>,
                        java.util.concurrent.Future<ResumeDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResumeDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RetryDrPlanExecutionResponse> retryDrPlanExecution(
            RetryDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async retryDrPlanExecution");
        final RetryDrPlanExecutionRequest interceptedRequest =
                RetryDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RetryDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "RetryDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/RetryDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, RetryDrPlanExecutionResponse>
                transformer =
                        RetryDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>,
                        java.util.concurrent.Future<RetryDrPlanExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRetryDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrPlanResponse> updateDrPlan(
            UpdateDrPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDrPlanRequest, UpdateDrPlanResponse>
                    handler) {
        LOG.trace("Called async updateDrPlan");
        final UpdateDrPlanRequest interceptedRequest =
                UpdateDrPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrPlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "UpdateDrPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlan/UpdateDrPlan");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrPlanResponse>
                transformer =
                        UpdateDrPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDrPlanRequest, UpdateDrPlanResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrPlanRequest, UpdateDrPlanResponse>,
                        java.util.concurrent.Future<UpdateDrPlanResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrPlanDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrPlanRequest, UpdateDrPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrPlanExecutionResponse> updateDrPlanExecution(
            UpdateDrPlanExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>
                    handler) {
        LOG.trace("Called async updateDrPlanExecution");
        final UpdateDrPlanExecutionRequest interceptedRequest =
                UpdateDrPlanExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrPlanExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "UpdateDrPlanExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrPlanExecution/UpdateDrPlanExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrPlanExecutionResponse>
                transformer =
                        UpdateDrPlanExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>,
                        java.util.concurrent.Future<UpdateDrPlanExecutionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrPlanExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrProtectionGroupResponse> updateDrProtectionGroup(
            UpdateDrProtectionGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>
                    handler) {
        LOG.trace("Called async updateDrProtectionGroup");
        final UpdateDrProtectionGroupRequest interceptedRequest =
                UpdateDrProtectionGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrProtectionGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "UpdateDrProtectionGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/UpdateDrProtectionGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDrProtectionGroupResponse>
                transformer =
                        UpdateDrProtectionGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>,
                        java.util.concurrent.Future<UpdateDrProtectionGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrProtectionGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrProtectionGroupRoleResponse>
            updateDrProtectionGroupRole(
                    UpdateDrProtectionGroupRoleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDrProtectionGroupRoleRequest,
                                    UpdateDrProtectionGroupRoleResponse>
                            handler) {
        LOG.trace("Called async updateDrProtectionGroupRole");
        final UpdateDrProtectionGroupRoleRequest interceptedRequest =
                UpdateDrProtectionGroupRoleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrProtectionGroupRoleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DisasterRecovery",
                        "UpdateDrProtectionGroupRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/disaster-recovery/20220125/DrProtectionGroup/UpdateDrProtectionGroupRole");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDrProtectionGroupRoleResponse>
                transformer =
                        UpdateDrProtectionGroupRoleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrProtectionGroupRoleRequest, UpdateDrProtectionGroupRoleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrProtectionGroupRoleRequest,
                                UpdateDrProtectionGroupRoleResponse>,
                        java.util.concurrent.Future<UpdateDrProtectionGroupRoleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrProtectionGroupRoleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrProtectionGroupRoleRequest, UpdateDrProtectionGroupRoleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
