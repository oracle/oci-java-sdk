/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.internal.http.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

/**
 * Async client implementation for Waas service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class WaasAsyncClient implements WaasAsync {
    /**
     * Service instance for Waas.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAAS")
                    .serviceEndpointPrefix("waas")
                    .serviceEndpointTemplate("https://waas.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WaasAsyncClient.class);

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
    public WaasAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
    public WaasAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaasAsyncClient> {
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
        public WaasAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new WaasAsyncClient(
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
    public java.util.concurrent.Future<AcceptRecommendationsResponse> acceptRecommendations(
            AcceptRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AcceptRecommendationsRequest, AcceptRecommendationsResponse>
                    handler) {
        LOG.trace("Called async acceptRecommendations");
        final AcceptRecommendationsRequest interceptedRequest =
                AcceptRecommendationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AcceptRecommendationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "AcceptRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/AcceptRecommendations");
        final java.util.function.Function<javax.ws.rs.core.Response, AcceptRecommendationsResponse>
                transformer =
                        AcceptRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AcceptRecommendationsRequest, AcceptRecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AcceptRecommendationsRequest, AcceptRecommendationsResponse>,
                        java.util.concurrent.Future<AcceptRecommendationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getProtectionRuleKeys(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AcceptRecommendationsRequest, AcceptRecommendationsResponse>(
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/CancelWorkRequest");
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
    public java.util.concurrent.Future<ChangeAddressListCompartmentResponse>
            changeAddressListCompartment(
                    ChangeAddressListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAddressListCompartmentRequest,
                                    ChangeAddressListCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAddressListCompartment");
        final ChangeAddressListCompartmentRequest interceptedRequest =
                ChangeAddressListCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAddressListCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ChangeAddressListCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ChangeAddressListCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeAddressListCompartmentResponse>
                transformer =
                        ChangeAddressListCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAddressListCompartmentRequest, ChangeAddressListCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAddressListCompartmentRequest,
                                ChangeAddressListCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAddressListCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAddressListCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAddressListCompartmentRequest, ChangeAddressListCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeCertificateCompartmentResponse>
            changeCertificateCompartment(
                    ChangeCertificateCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateCompartmentRequest,
                                    ChangeCertificateCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCertificateCompartment");
        final ChangeCertificateCompartmentRequest interceptedRequest =
                ChangeCertificateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCertificateCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ChangeCertificateCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/ChangeCertificateCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeCertificateCompartmentResponse>
                transformer =
                        ChangeCertificateCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCertificateCompartmentRequest, ChangeCertificateCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCertificateCompartmentRequest,
                                ChangeCertificateCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCertificateCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCertificateCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCertificateCompartmentRequest, ChangeCertificateCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeCustomProtectionRuleCompartmentResponse>
            changeCustomProtectionRuleCompartment(
                    ChangeCustomProtectionRuleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCustomProtectionRuleCompartmentRequest,
                                    ChangeCustomProtectionRuleCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCustomProtectionRuleCompartment");
        final ChangeCustomProtectionRuleCompartmentRequest interceptedRequest =
                ChangeCustomProtectionRuleCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCustomProtectionRuleCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ChangeCustomProtectionRuleCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ChangeCustomProtectionRuleCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeCustomProtectionRuleCompartmentResponse>
                transformer =
                        ChangeCustomProtectionRuleCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCustomProtectionRuleCompartmentRequest,
                        ChangeCustomProtectionRuleCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCustomProtectionRuleCompartmentRequest,
                                ChangeCustomProtectionRuleCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCustomProtectionRuleCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeCustomProtectionRuleCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCustomProtectionRuleCompartmentRequest,
                    ChangeCustomProtectionRuleCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeWaasPolicyCompartmentResponse>
            changeWaasPolicyCompartment(
                    ChangeWaasPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWaasPolicyCompartmentRequest,
                                    ChangeWaasPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeWaasPolicyCompartment");
        final ChangeWaasPolicyCompartmentRequest interceptedRequest =
                ChangeWaasPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeWaasPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ChangeWaasPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ChangeWaasPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeWaasPolicyCompartmentResponse>
                transformer =
                        ChangeWaasPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeWaasPolicyCompartmentRequest, ChangeWaasPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeWaasPolicyCompartmentRequest,
                                ChangeWaasPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeWaasPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeWaasPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeWaasPolicyCompartmentRequest, ChangeWaasPolicyCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateAddressListResponse> createAddressList(
            CreateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAddressListRequest, CreateAddressListResponse>
                    handler) {
        LOG.trace("Called async createAddressList");
        final CreateAddressListRequest interceptedRequest =
                CreateAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "CreateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/CreateAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAddressListResponse>
                transformer =
                        CreateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAddressListRequest, CreateAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAddressListRequest, CreateAddressListResponse>,
                        java.util.concurrent.Future<CreateAddressListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAddressListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAddressListRequest, CreateAddressListResponse>(
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
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        LOG.trace("Called async createCertificate");
        final CreateCertificateRequest interceptedRequest =
                CreateCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "CreateCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/CreateCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer =
                        CreateCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCertificateRequest, CreateCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCertificateRequest, CreateCertificateResponse>,
                        java.util.concurrent.Future<CreateCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCertificateRequest, CreateCertificateResponse>(
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
    public java.util.concurrent.Future<CreateCustomProtectionRuleResponse>
            createCustomProtectionRule(
                    CreateCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCustomProtectionRuleRequest,
                                    CreateCustomProtectionRuleResponse>
                            handler) {
        LOG.trace("Called async createCustomProtectionRule");
        final CreateCustomProtectionRuleRequest interceptedRequest =
                CreateCustomProtectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "CreateCustomProtectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/CreateCustomProtectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCustomProtectionRuleResponse>
                transformer =
                        CreateCustomProtectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCustomProtectionRuleRequest, CreateCustomProtectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCustomProtectionRuleRequest,
                                CreateCustomProtectionRuleResponse>,
                        java.util.concurrent.Future<CreateCustomProtectionRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCustomProtectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCustomProtectionRuleRequest, CreateCustomProtectionRuleResponse>(
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
    public java.util.concurrent.Future<CreateWaasPolicyResponse> createWaasPolicy(
            CreateWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWaasPolicyRequest, CreateWaasPolicyResponse>
                    handler) {
        LOG.trace("Called async createWaasPolicy");
        final CreateWaasPolicyRequest interceptedRequest =
                CreateWaasPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "CreateWaasPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/CreateWaasPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateWaasPolicyResponse>
                transformer =
                        CreateWaasPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateWaasPolicyRequest, CreateWaasPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateWaasPolicyRequest, CreateWaasPolicyResponse>,
                        java.util.concurrent.Future<CreateWaasPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateWaasPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateWaasPolicyRequest, CreateWaasPolicyResponse>(
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
    public java.util.concurrent.Future<DeleteAddressListResponse> deleteAddressList(
            DeleteAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAddressListRequest, DeleteAddressListResponse>
                    handler) {
        LOG.trace("Called async deleteAddressList");
        final DeleteAddressListRequest interceptedRequest =
                DeleteAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "DeleteAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/DeleteAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAddressListResponse>
                transformer =
                        DeleteAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAddressListRequest, DeleteAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAddressListRequest, DeleteAddressListResponse>,
                        java.util.concurrent.Future<DeleteAddressListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAddressListRequest, DeleteAddressListResponse>(
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
    public java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler) {
        LOG.trace("Called async deleteCertificate");
        final DeleteCertificateRequest interceptedRequest =
                DeleteCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "DeleteCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/DeleteCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer =
                        DeleteCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCertificateRequest, DeleteCertificateResponse>,
                        java.util.concurrent.Future<DeleteCertificateResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCertificateRequest, DeleteCertificateResponse>(
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
    public java.util.concurrent.Future<DeleteCustomProtectionRuleResponse>
            deleteCustomProtectionRule(
                    DeleteCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCustomProtectionRuleRequest,
                                    DeleteCustomProtectionRuleResponse>
                            handler) {
        LOG.trace("Called async deleteCustomProtectionRule");
        final DeleteCustomProtectionRuleRequest interceptedRequest =
                DeleteCustomProtectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "DeleteCustomProtectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/DeleteCustomProtectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCustomProtectionRuleResponse>
                transformer =
                        DeleteCustomProtectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCustomProtectionRuleRequest, DeleteCustomProtectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCustomProtectionRuleRequest,
                                DeleteCustomProtectionRuleResponse>,
                        java.util.concurrent.Future<DeleteCustomProtectionRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCustomProtectionRuleRequest, DeleteCustomProtectionRuleResponse>(
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
    public java.util.concurrent.Future<DeleteWaasPolicyResponse> deleteWaasPolicy(
            DeleteWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWaasPolicyRequest, DeleteWaasPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteWaasPolicy");
        final DeleteWaasPolicyRequest interceptedRequest =
                DeleteWaasPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "DeleteWaasPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/DeleteWaasPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteWaasPolicyResponse>
                transformer =
                        DeleteWaasPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteWaasPolicyRequest, DeleteWaasPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWaasPolicyRequest, DeleteWaasPolicyResponse>,
                        java.util.concurrent.Future<DeleteWaasPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWaasPolicyRequest, DeleteWaasPolicyResponse>(
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
    public java.util.concurrent.Future<GetAddressListResponse> getAddressList(
            GetAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAddressListRequest, GetAddressListResponse>
                    handler) {
        LOG.trace("Called async getAddressList");
        final GetAddressListRequest interceptedRequest =
                GetAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/GetAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAddressListResponse>
                transformer =
                        GetAddressListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAddressListRequest, GetAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAddressListRequest, GetAddressListResponse>,
                        java.util.concurrent.Future<GetAddressListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAddressListRequest, GetAddressListResponse>(
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
    public java.util.concurrent.Future<GetCertificateResponse> getCertificate(
            GetCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateRequest, GetCertificateResponse>
                    handler) {
        LOG.trace("Called async getCertificate");
        final GetCertificateRequest interceptedRequest =
                GetCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/GetCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCertificateResponse>
                transformer =
                        GetCertificateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCertificateRequest, GetCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCertificateRequest, GetCertificateResponse>,
                        java.util.concurrent.Future<GetCertificateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCertificateRequest, GetCertificateResponse>(
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
    public java.util.concurrent.Future<GetCustomProtectionRuleResponse> getCustomProtectionRule(
            GetCustomProtectionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomProtectionRuleRequest, GetCustomProtectionRuleResponse>
                    handler) {
        LOG.trace("Called async getCustomProtectionRule");
        final GetCustomProtectionRuleRequest interceptedRequest =
                GetCustomProtectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetCustomProtectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/GetCustomProtectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCustomProtectionRuleResponse>
                transformer =
                        GetCustomProtectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCustomProtectionRuleRequest, GetCustomProtectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCustomProtectionRuleRequest, GetCustomProtectionRuleResponse>,
                        java.util.concurrent.Future<GetCustomProtectionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCustomProtectionRuleRequest, GetCustomProtectionRuleResponse>(
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
    public java.util.concurrent.Future<GetDeviceFingerprintChallengeResponse>
            getDeviceFingerprintChallenge(
                    GetDeviceFingerprintChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDeviceFingerprintChallengeRequest,
                                    GetDeviceFingerprintChallengeResponse>
                            handler) {
        LOG.trace("Called async getDeviceFingerprintChallenge");
        final GetDeviceFingerprintChallengeRequest interceptedRequest =
                GetDeviceFingerprintChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeviceFingerprintChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetDeviceFingerprintChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/GetDeviceFingerprintChallenge");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDeviceFingerprintChallengeResponse>
                transformer =
                        GetDeviceFingerprintChallengeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDeviceFingerprintChallengeRequest, GetDeviceFingerprintChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeviceFingerprintChallengeRequest,
                                GetDeviceFingerprintChallengeResponse>,
                        java.util.concurrent.Future<GetDeviceFingerprintChallengeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeviceFingerprintChallengeRequest, GetDeviceFingerprintChallengeResponse>(
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
    public java.util.concurrent.Future<GetHumanInteractionChallengeResponse>
            getHumanInteractionChallenge(
                    GetHumanInteractionChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetHumanInteractionChallengeRequest,
                                    GetHumanInteractionChallengeResponse>
                            handler) {
        LOG.trace("Called async getHumanInteractionChallenge");
        final GetHumanInteractionChallengeRequest interceptedRequest =
                GetHumanInteractionChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHumanInteractionChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetHumanInteractionChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/GetHumanInteractionChallenge");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetHumanInteractionChallengeResponse>
                transformer =
                        GetHumanInteractionChallengeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetHumanInteractionChallengeRequest, GetHumanInteractionChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHumanInteractionChallengeRequest,
                                GetHumanInteractionChallengeResponse>,
                        java.util.concurrent.Future<GetHumanInteractionChallengeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHumanInteractionChallengeRequest, GetHumanInteractionChallengeResponse>(
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
    public java.util.concurrent.Future<GetJsChallengeResponse> getJsChallenge(
            GetJsChallengeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJsChallengeRequest, GetJsChallengeResponse>
                    handler) {
        LOG.trace("Called async getJsChallenge");
        final GetJsChallengeRequest interceptedRequest =
                GetJsChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJsChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetJsChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/GetJsChallenge");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJsChallengeResponse>
                transformer =
                        GetJsChallengeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJsChallengeRequest, GetJsChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJsChallengeRequest, GetJsChallengeResponse>,
                        java.util.concurrent.Future<GetJsChallengeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJsChallengeRequest, GetJsChallengeResponse>(
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
    public java.util.concurrent.Future<GetPolicyConfigResponse> getPolicyConfig(
            GetPolicyConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPolicyConfigRequest, GetPolicyConfigResponse>
                    handler) {
        LOG.trace("Called async getPolicyConfig");
        final GetPolicyConfigRequest interceptedRequest =
                GetPolicyConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetPolicyConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/GetPolicyConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPolicyConfigResponse>
                transformer =
                        GetPolicyConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPolicyConfigRequest, GetPolicyConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPolicyConfigRequest, GetPolicyConfigResponse>,
                        java.util.concurrent.Future<GetPolicyConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPolicyConfigRequest, GetPolicyConfigResponse>(
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
    public java.util.concurrent.Future<GetProtectionRuleResponse> getProtectionRule(
            GetProtectionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProtectionRuleRequest, GetProtectionRuleResponse>
                    handler) {
        LOG.trace("Called async getProtectionRule");
        final GetProtectionRuleRequest interceptedRequest =
                GetProtectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetProtectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/GetProtectionRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProtectionRuleResponse>
                transformer =
                        GetProtectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProtectionRuleRequest, GetProtectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProtectionRuleRequest, GetProtectionRuleResponse>,
                        java.util.concurrent.Future<GetProtectionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProtectionRuleRequest, GetProtectionRuleResponse>(
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
    public java.util.concurrent.Future<GetProtectionSettingsResponse> getProtectionSettings(
            GetProtectionSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProtectionSettingsRequest, GetProtectionSettingsResponse>
                    handler) {
        LOG.trace("Called async getProtectionSettings");
        final GetProtectionSettingsRequest interceptedRequest =
                GetProtectionSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetProtectionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/GetProtectionSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProtectionSettingsResponse>
                transformer =
                        GetProtectionSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetProtectionSettingsRequest, GetProtectionSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProtectionSettingsRequest, GetProtectionSettingsResponse>,
                        java.util.concurrent.Future<GetProtectionSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProtectionSettingsRequest, GetProtectionSettingsResponse>(
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
    public java.util.concurrent.Future<GetWaasPolicyResponse> getWaasPolicy(
            GetWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWaasPolicyRequest, GetWaasPolicyResponse>
                    handler) {
        LOG.trace("Called async getWaasPolicy");
        final GetWaasPolicyRequest interceptedRequest =
                GetWaasPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetWaasPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/GetWaasPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWaasPolicyResponse>
                transformer =
                        GetWaasPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWaasPolicyRequest, GetWaasPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWaasPolicyRequest, GetWaasPolicyResponse>,
                        java.util.concurrent.Future<GetWaasPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWaasPolicyRequest, GetWaasPolicyResponse>(
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
    public java.util.concurrent.Future<GetWafAddressRateLimitingResponse> getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWafAddressRateLimitingRequest, GetWafAddressRateLimitingResponse>
                    handler) {
        LOG.trace("Called async getWafAddressRateLimiting");
        final GetWafAddressRateLimitingRequest interceptedRequest =
                GetWafAddressRateLimitingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafAddressRateLimitingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetWafAddressRateLimiting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/GetWafAddressRateLimiting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetWafAddressRateLimitingResponse>
                transformer =
                        GetWafAddressRateLimitingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetWafAddressRateLimitingRequest, GetWafAddressRateLimitingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWafAddressRateLimitingRequest,
                                GetWafAddressRateLimitingResponse>,
                        java.util.concurrent.Future<GetWafAddressRateLimitingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWafAddressRateLimitingRequest, GetWafAddressRateLimitingResponse>(
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
    public java.util.concurrent.Future<GetWafConfigResponse> getWafConfig(
            GetWafConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWafConfigRequest, GetWafConfigResponse>
                    handler) {
        LOG.trace("Called async getWafConfig");
        final GetWafConfigRequest interceptedRequest =
                GetWafConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "GetWafConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/GetWafConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWafConfigResponse>
                transformer =
                        GetWafConfigConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWafConfigRequest, GetWafConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWafConfigRequest, GetWafConfigResponse>,
                        java.util.concurrent.Future<GetWafConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWafConfigRequest, GetWafConfigResponse>(
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
                        "Waas",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListAccessRulesResponse> listAccessRules(
            ListAccessRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRulesRequest, ListAccessRulesResponse>
                    handler) {
        LOG.trace("Called async listAccessRules");
        final ListAccessRulesRequest interceptedRequest =
                ListAccessRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccessRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListAccessRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/ListAccessRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAccessRulesResponse>
                transformer =
                        ListAccessRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAccessRulesRequest, ListAccessRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAccessRulesRequest, ListAccessRulesResponse>,
                        java.util.concurrent.Future<ListAccessRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAccessRulesRequest, ListAccessRulesResponse>(
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
    public java.util.concurrent.Future<ListAddressListsResponse> listAddressLists(
            ListAddressListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAddressListsRequest, ListAddressListsResponse>
                    handler) {
        LOG.trace("Called async listAddressLists");
        final ListAddressListsRequest interceptedRequest =
                ListAddressListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAddressListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListAddressLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ListAddressLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAddressListsResponse>
                transformer =
                        ListAddressListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAddressListsRequest, ListAddressListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAddressListsRequest, ListAddressListsResponse>,
                        java.util.concurrent.Future<ListAddressListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAddressListsRequest, ListAddressListsResponse>(
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
    public java.util.concurrent.Future<ListCachingRulesResponse> listCachingRules(
            ListCachingRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCachingRulesRequest, ListCachingRulesResponse>
                    handler) {
        LOG.trace("Called async listCachingRules");
        final ListCachingRulesRequest interceptedRequest =
                ListCachingRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCachingRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListCachingRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRuleSummary/ListCachingRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCachingRulesResponse>
                transformer =
                        ListCachingRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCachingRulesRequest, ListCachingRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCachingRulesRequest, ListCachingRulesResponse>,
                        java.util.concurrent.Future<ListCachingRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCachingRulesRequest, ListCachingRulesResponse>(
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
    public java.util.concurrent.Future<ListCaptchasResponse> listCaptchas(
            ListCaptchasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCaptchasRequest, ListCaptchasResponse>
                    handler) {
        LOG.trace("Called async listCaptchas");
        final ListCaptchasRequest interceptedRequest =
                ListCaptchasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCaptchasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListCaptchas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/ListCaptchas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCaptchasResponse>
                transformer =
                        ListCaptchasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCaptchasRequest, ListCaptchasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCaptchasRequest, ListCaptchasResponse>,
                        java.util.concurrent.Future<ListCaptchasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCaptchasRequest, ListCaptchasResponse>(
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
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {
        LOG.trace("Called async listCertificates");
        final ListCertificatesRequest interceptedRequest =
                ListCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CertificateSummary/ListCertificates");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer =
                        ListCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificatesRequest, ListCertificatesResponse>,
                        java.util.concurrent.Future<ListCertificatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificatesRequest, ListCertificatesResponse>(
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
    public java.util.concurrent.Future<ListCustomProtectionRulesResponse> listCustomProtectionRules(
            ListCustomProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>
                    handler) {
        LOG.trace("Called async listCustomProtectionRules");
        final ListCustomProtectionRulesRequest interceptedRequest =
                ListCustomProtectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListCustomProtectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListCustomProtectionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCustomProtectionRulesResponse>
                transformer =
                        ListCustomProtectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCustomProtectionRulesRequest,
                                ListCustomProtectionRulesResponse>,
                        java.util.concurrent.Future<ListCustomProtectionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>(
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
    public java.util.concurrent.Future<ListEdgeSubnetsResponse> listEdgeSubnets(
            ListEdgeSubnetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>
                    handler) {
        LOG.trace("Called async listEdgeSubnets");
        final ListEdgeSubnetsRequest interceptedRequest =
                ListEdgeSubnetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEdgeSubnetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListEdgeSubnets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/EdgeSubnet/ListEdgeSubnets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListEdgeSubnetsResponse>
                transformer =
                        ListEdgeSubnetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>,
                        java.util.concurrent.Future<ListEdgeSubnetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>(
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
    public java.util.concurrent.Future<ListGoodBotsResponse> listGoodBots(
            ListGoodBotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGoodBotsRequest, ListGoodBotsResponse>
                    handler) {
        LOG.trace("Called async listGoodBots");
        final ListGoodBotsRequest interceptedRequest =
                ListGoodBotsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGoodBotsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListGoodBots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/ListGoodBots");
        final java.util.function.Function<javax.ws.rs.core.Response, ListGoodBotsResponse>
                transformer =
                        ListGoodBotsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListGoodBotsRequest, ListGoodBotsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGoodBotsRequest, ListGoodBotsResponse>,
                        java.util.concurrent.Future<ListGoodBotsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGoodBotsRequest, ListGoodBotsResponse>(
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
    public java.util.concurrent.Future<ListProtectionRulesResponse> listProtectionRules(
            ListProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProtectionRulesRequest, ListProtectionRulesResponse>
                    handler) {
        LOG.trace("Called async listProtectionRules");
        final ListProtectionRulesRequest interceptedRequest =
                ListProtectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListProtectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/ListProtectionRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProtectionRulesResponse>
                transformer =
                        ListProtectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProtectionRulesRequest, ListProtectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProtectionRulesRequest, ListProtectionRulesResponse>,
                        java.util.concurrent.Future<ListProtectionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProtectionRulesRequest, ListProtectionRulesResponse>(
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
    public java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler) {
        LOG.trace("Called async listRecommendations");
        final ListRecommendationsRequest interceptedRequest =
                ListRecommendationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecommendationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/ListRecommendations");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRecommendationsResponse>
                transformer =
                        ListRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRecommendationsRequest, ListRecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRecommendationsRequest, ListRecommendationsResponse>,
                        java.util.concurrent.Future<ListRecommendationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRecommendationsRequest, ListRecommendationsResponse>(
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
    public java.util.concurrent.Future<ListThreatFeedsResponse> listThreatFeeds(
            ListThreatFeedsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListThreatFeedsRequest, ListThreatFeedsResponse>
                    handler) {
        LOG.trace("Called async listThreatFeeds");
        final ListThreatFeedsRequest interceptedRequest =
                ListThreatFeedsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListThreatFeedsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListThreatFeeds",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/ListThreatFeeds");
        final java.util.function.Function<javax.ws.rs.core.Response, ListThreatFeedsResponse>
                transformer =
                        ListThreatFeedsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListThreatFeedsRequest, ListThreatFeedsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListThreatFeedsRequest, ListThreatFeedsResponse>,
                        java.util.concurrent.Future<ListThreatFeedsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListThreatFeedsRequest, ListThreatFeedsResponse>(
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
    public java.util.concurrent.Future<ListWaasPoliciesResponse> listWaasPolicies(
            ListWaasPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWaasPoliciesRequest, ListWaasPoliciesResponse>
                    handler) {
        LOG.trace("Called async listWaasPolicies");
        final ListWaasPoliciesRequest interceptedRequest =
                ListWaasPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWaasPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWaasPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ListWaasPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWaasPoliciesResponse>
                transformer =
                        ListWaasPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWaasPoliciesRequest, ListWaasPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWaasPoliciesRequest, ListWaasPoliciesResponse>,
                        java.util.concurrent.Future<ListWaasPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWaasPoliciesRequest, ListWaasPoliciesResponse>(
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
    public java.util.concurrent.Future<ListWaasPolicyCustomProtectionRulesResponse>
            listWaasPolicyCustomProtectionRules(
                    ListWaasPolicyCustomProtectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWaasPolicyCustomProtectionRulesRequest,
                                    ListWaasPolicyCustomProtectionRulesResponse>
                            handler) {
        LOG.trace("Called async listWaasPolicyCustomProtectionRules");
        final ListWaasPolicyCustomProtectionRulesRequest interceptedRequest =
                ListWaasPolicyCustomProtectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWaasPolicyCustomProtectionRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWaasPolicyCustomProtectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListWaasPolicyCustomProtectionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListWaasPolicyCustomProtectionRulesResponse>
                transformer =
                        ListWaasPolicyCustomProtectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWaasPolicyCustomProtectionRulesRequest,
                        ListWaasPolicyCustomProtectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWaasPolicyCustomProtectionRulesRequest,
                                ListWaasPolicyCustomProtectionRulesResponse>,
                        java.util.concurrent.Future<ListWaasPolicyCustomProtectionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWaasPolicyCustomProtectionRulesRequest,
                    ListWaasPolicyCustomProtectionRulesResponse>(
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
    public java.util.concurrent.Future<ListWafBlockedRequestsResponse> listWafBlockedRequests(
            ListWafBlockedRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>
                    handler) {
        LOG.trace("Called async listWafBlockedRequests");
        final ListWafBlockedRequestsRequest interceptedRequest =
                ListWafBlockedRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafBlockedRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWafBlockedRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafBlockedRequest/ListWafBlockedRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWafBlockedRequestsResponse>
                transformer =
                        ListWafBlockedRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>,
                        java.util.concurrent.Future<ListWafBlockedRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>(
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
    public java.util.concurrent.Future<ListWafLogsResponse> listWafLogs(
            ListWafLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWafLogsRequest, ListWafLogsResponse>
                    handler) {
        LOG.trace("Called async listWafLogs");
        final ListWafLogsRequest interceptedRequest =
                ListWafLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWafLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafLog/ListWafLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWafLogsResponse>
                transformer =
                        ListWafLogsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWafLogsRequest, ListWafLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWafLogsRequest, ListWafLogsResponse>,
                        java.util.concurrent.Future<ListWafLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWafLogsRequest, ListWafLogsResponse>(
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
    public java.util.concurrent.Future<ListWafRequestsResponse> listWafRequests(
            ListWafRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafRequestsRequest, ListWafRequestsResponse>
                    handler) {
        LOG.trace("Called async listWafRequests");
        final ListWafRequestsRequest interceptedRequest =
                ListWafRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWafRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafRequest/ListWafRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWafRequestsResponse>
                transformer =
                        ListWafRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWafRequestsRequest, ListWafRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWafRequestsRequest, ListWafRequestsResponse>,
                        java.util.concurrent.Future<ListWafRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWafRequestsRequest, ListWafRequestsResponse>(
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
    public java.util.concurrent.Future<ListWafTrafficResponse> listWafTraffic(
            ListWafTrafficRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWafTrafficRequest, ListWafTrafficResponse>
                    handler) {
        LOG.trace("Called async listWafTraffic");
        final ListWafTrafficRequest interceptedRequest =
                ListWafTrafficConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafTrafficConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWafTraffic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafTrafficDatum/ListWafTraffic");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWafTrafficResponse>
                transformer =
                        ListWafTrafficConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWafTrafficRequest, ListWafTrafficResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWafTrafficRequest, ListWafTrafficResponse>,
                        java.util.concurrent.Future<ListWafTrafficResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWafTrafficRequest, ListWafTrafficResponse>(
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
    public java.util.concurrent.Future<ListWhitelistsResponse> listWhitelists(
            ListWhitelistsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWhitelistsRequest, ListWhitelistsResponse>
                    handler) {
        LOG.trace("Called async listWhitelists");
        final ListWhitelistsRequest interceptedRequest =
                ListWhitelistsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWhitelistsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "ListWhitelists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/ListWhitelists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWhitelistsResponse>
                transformer =
                        ListWhitelistsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWhitelistsRequest, ListWhitelistsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWhitelistsRequest, ListWhitelistsResponse>,
                        java.util.concurrent.Future<ListWhitelistsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWhitelistsRequest, ListWhitelistsResponse>(
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
                        "Waas",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequestSummary/ListWorkRequests");
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
    public java.util.concurrent.Future<PurgeCacheResponse> purgeCache(
            PurgeCacheRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PurgeCacheRequest, PurgeCacheResponse>
                    handler) {
        LOG.trace("Called async purgeCache");
        final PurgeCacheRequest interceptedRequest = PurgeCacheConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeCacheConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "PurgeCache",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PurgeCache/PurgeCache");
        final java.util.function.Function<javax.ws.rs.core.Response, PurgeCacheResponse>
                transformer =
                        PurgeCacheConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PurgeCacheRequest, PurgeCacheResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PurgeCacheRequest, PurgeCacheResponse>,
                        java.util.concurrent.Future<PurgeCacheResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPurgeCache(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PurgeCacheRequest, PurgeCacheResponse>(
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
    public java.util.concurrent.Future<UpdateAccessRulesResponse> updateAccessRules(
            UpdateAccessRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAccessRulesRequest, UpdateAccessRulesResponse>
                    handler) {
        LOG.trace("Called async updateAccessRules");
        final UpdateAccessRulesRequest interceptedRequest =
                UpdateAccessRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAccessRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateAccessRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/UpdateAccessRules");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAccessRulesResponse>
                transformer =
                        UpdateAccessRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAccessRulesRequest, UpdateAccessRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAccessRulesRequest, UpdateAccessRulesResponse>,
                        java.util.concurrent.Future<UpdateAccessRulesResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAccessRules(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAccessRulesRequest, UpdateAccessRulesResponse>(
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
    public java.util.concurrent.Future<UpdateAddressListResponse> updateAddressList(
            UpdateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAddressListRequest, UpdateAddressListResponse>
                    handler) {
        LOG.trace("Called async updateAddressList");
        final UpdateAddressListRequest interceptedRequest =
                UpdateAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/UpdateAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAddressListResponse>
                transformer =
                        UpdateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAddressListRequest, UpdateAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAddressListRequest, UpdateAddressListResponse>,
                        java.util.concurrent.Future<UpdateAddressListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAddressListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAddressListRequest, UpdateAddressListResponse>(
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
    public java.util.concurrent.Future<UpdateCachingRulesResponse> updateCachingRules(
            UpdateCachingRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCachingRulesRequest, UpdateCachingRulesResponse>
                    handler) {
        LOG.trace("Called async updateCachingRules");
        final UpdateCachingRulesRequest interceptedRequest =
                UpdateCachingRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCachingRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateCachingRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRule/UpdateCachingRules");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCachingRulesResponse>
                transformer =
                        UpdateCachingRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCachingRulesRequest, UpdateCachingRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCachingRulesRequest, UpdateCachingRulesResponse>,
                        java.util.concurrent.Future<UpdateCachingRulesResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCachingRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCachingRulesRequest, UpdateCachingRulesResponse>(
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
    public java.util.concurrent.Future<UpdateCaptchasResponse> updateCaptchas(
            UpdateCaptchasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCaptchasRequest, UpdateCaptchasResponse>
                    handler) {
        LOG.trace("Called async updateCaptchas");
        final UpdateCaptchasRequest interceptedRequest =
                UpdateCaptchasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCaptchasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateCaptchas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/UpdateCaptchas");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCaptchasResponse>
                transformer =
                        UpdateCaptchasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCaptchasRequest, UpdateCaptchasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCaptchasRequest, UpdateCaptchasResponse>,
                        java.util.concurrent.Future<UpdateCaptchasResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCaptchas(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCaptchasRequest, UpdateCaptchasResponse>(
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
    public java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler) {
        LOG.trace("Called async updateCertificate");
        final UpdateCertificateRequest interceptedRequest =
                UpdateCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/UpdateCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCertificateResponse>
                transformer =
                        UpdateCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCertificateRequest, UpdateCertificateResponse>,
                        java.util.concurrent.Future<UpdateCertificateResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCertificateRequest, UpdateCertificateResponse>(
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
    public java.util.concurrent.Future<UpdateCustomProtectionRuleResponse>
            updateCustomProtectionRule(
                    UpdateCustomProtectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCustomProtectionRuleRequest,
                                    UpdateCustomProtectionRuleResponse>
                            handler) {
        LOG.trace("Called async updateCustomProtectionRule");
        final UpdateCustomProtectionRuleRequest interceptedRequest =
                UpdateCustomProtectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateCustomProtectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateCustomProtectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCustomProtectionRuleResponse>
                transformer =
                        UpdateCustomProtectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCustomProtectionRuleRequest, UpdateCustomProtectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCustomProtectionRuleRequest,
                                UpdateCustomProtectionRuleResponse>,
                        java.util.concurrent.Future<UpdateCustomProtectionRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCustomProtectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCustomProtectionRuleRequest, UpdateCustomProtectionRuleResponse>(
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
    public java.util.concurrent.Future<UpdateDeviceFingerprintChallengeResponse>
            updateDeviceFingerprintChallenge(
                    UpdateDeviceFingerprintChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDeviceFingerprintChallengeRequest,
                                    UpdateDeviceFingerprintChallengeResponse>
                            handler) {
        LOG.trace("Called async updateDeviceFingerprintChallenge");
        final UpdateDeviceFingerprintChallengeRequest interceptedRequest =
                UpdateDeviceFingerprintChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeviceFingerprintChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateDeviceFingerprintChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/UpdateDeviceFingerprintChallenge");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDeviceFingerprintChallengeResponse>
                transformer =
                        UpdateDeviceFingerprintChallengeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDeviceFingerprintChallengeRequest,
                        UpdateDeviceFingerprintChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeviceFingerprintChallengeRequest,
                                UpdateDeviceFingerprintChallengeResponse>,
                        java.util.concurrent.Future<UpdateDeviceFingerprintChallengeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeviceFingerprintChallengeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeviceFingerprintChallengeRequest,
                    UpdateDeviceFingerprintChallengeResponse>(
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
    public java.util.concurrent.Future<UpdateGoodBotsResponse> updateGoodBots(
            UpdateGoodBotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGoodBotsRequest, UpdateGoodBotsResponse>
                    handler) {
        LOG.trace("Called async updateGoodBots");
        final UpdateGoodBotsRequest interceptedRequest =
                UpdateGoodBotsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGoodBotsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateGoodBots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/UpdateGoodBots");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateGoodBotsResponse>
                transformer =
                        UpdateGoodBotsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateGoodBotsRequest, UpdateGoodBotsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGoodBotsRequest, UpdateGoodBotsResponse>,
                        java.util.concurrent.Future<UpdateGoodBotsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGoodBots(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGoodBotsRequest, UpdateGoodBotsResponse>(
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
    public java.util.concurrent.Future<UpdateHumanInteractionChallengeResponse>
            updateHumanInteractionChallenge(
                    UpdateHumanInteractionChallengeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateHumanInteractionChallengeRequest,
                                    UpdateHumanInteractionChallengeResponse>
                            handler) {
        LOG.trace("Called async updateHumanInteractionChallenge");
        final UpdateHumanInteractionChallengeRequest interceptedRequest =
                UpdateHumanInteractionChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHumanInteractionChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateHumanInteractionChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/UpdateHumanInteractionChallenge");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateHumanInteractionChallengeResponse>
                transformer =
                        UpdateHumanInteractionChallengeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateHumanInteractionChallengeRequest,
                        UpdateHumanInteractionChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHumanInteractionChallengeRequest,
                                UpdateHumanInteractionChallengeResponse>,
                        java.util.concurrent.Future<UpdateHumanInteractionChallengeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHumanInteractionChallengeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHumanInteractionChallengeRequest,
                    UpdateHumanInteractionChallengeResponse>(
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
    public java.util.concurrent.Future<UpdateJsChallengeResponse> updateJsChallenge(
            UpdateJsChallengeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateJsChallengeRequest, UpdateJsChallengeResponse>
                    handler) {
        LOG.trace("Called async updateJsChallenge");
        final UpdateJsChallengeRequest interceptedRequest =
                UpdateJsChallengeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJsChallengeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateJsChallenge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/UpdateJsChallenge");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateJsChallengeResponse>
                transformer =
                        UpdateJsChallengeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateJsChallengeRequest, UpdateJsChallengeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateJsChallengeRequest, UpdateJsChallengeResponse>,
                        java.util.concurrent.Future<UpdateJsChallengeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJsChallengeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJsChallengeRequest, UpdateJsChallengeResponse>(
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
    public java.util.concurrent.Future<UpdatePolicyConfigResponse> updatePolicyConfig(
            UpdatePolicyConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePolicyConfigRequest, UpdatePolicyConfigResponse>
                    handler) {
        LOG.trace("Called async updatePolicyConfig");
        final UpdatePolicyConfigRequest interceptedRequest =
                UpdatePolicyConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdatePolicyConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/UpdatePolicyConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePolicyConfigResponse>
                transformer =
                        UpdatePolicyConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePolicyConfigRequest, UpdatePolicyConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePolicyConfigRequest, UpdatePolicyConfigResponse>,
                        java.util.concurrent.Future<UpdatePolicyConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePolicyConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePolicyConfigRequest, UpdatePolicyConfigResponse>(
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
    public java.util.concurrent.Future<UpdateProtectionRulesResponse> updateProtectionRules(
            UpdateProtectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectionRulesRequest, UpdateProtectionRulesResponse>
                    handler) {
        LOG.trace("Called async updateProtectionRules");
        final UpdateProtectionRulesRequest interceptedRequest =
                UpdateProtectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateProtectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/UpdateProtectionRules");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateProtectionRulesResponse>
                transformer =
                        UpdateProtectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateProtectionRulesRequest, UpdateProtectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProtectionRulesRequest, UpdateProtectionRulesResponse>,
                        java.util.concurrent.Future<UpdateProtectionRulesResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getProtectionRules(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProtectionRulesRequest, UpdateProtectionRulesResponse>(
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
    public java.util.concurrent.Future<UpdateProtectionSettingsResponse> updateProtectionSettings(
            UpdateProtectionSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectionSettingsRequest, UpdateProtectionSettingsResponse>
                    handler) {
        LOG.trace("Called async updateProtectionSettings");
        final UpdateProtectionSettingsRequest interceptedRequest =
                UpdateProtectionSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateProtectionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/UpdateProtectionSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateProtectionSettingsResponse>
                transformer =
                        UpdateProtectionSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateProtectionSettingsRequest, UpdateProtectionSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProtectionSettingsRequest, UpdateProtectionSettingsResponse>,
                        java.util.concurrent.Future<UpdateProtectionSettingsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProtectionSettingsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProtectionSettingsRequest, UpdateProtectionSettingsResponse>(
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
    public java.util.concurrent.Future<UpdateThreatFeedsResponse> updateThreatFeeds(
            UpdateThreatFeedsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateThreatFeedsRequest, UpdateThreatFeedsResponse>
                    handler) {
        LOG.trace("Called async updateThreatFeeds");
        final UpdateThreatFeedsRequest interceptedRequest =
                UpdateThreatFeedsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateThreatFeedsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateThreatFeeds",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/UpdateThreatFeeds");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateThreatFeedsResponse>
                transformer =
                        UpdateThreatFeedsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateThreatFeedsRequest, UpdateThreatFeedsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateThreatFeedsRequest, UpdateThreatFeedsResponse>,
                        java.util.concurrent.Future<UpdateThreatFeedsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getThreatFeeds(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateThreatFeedsRequest, UpdateThreatFeedsResponse>(
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
    public java.util.concurrent.Future<UpdateWaasPolicyResponse> updateWaasPolicy(
            UpdateWaasPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWaasPolicyRequest, UpdateWaasPolicyResponse>
                    handler) {
        LOG.trace("Called async updateWaasPolicy");
        final UpdateWaasPolicyRequest interceptedRequest =
                UpdateWaasPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateWaasPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/UpdateWaasPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateWaasPolicyResponse>
                transformer =
                        UpdateWaasPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateWaasPolicyRequest, UpdateWaasPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWaasPolicyRequest, UpdateWaasPolicyResponse>,
                        java.util.concurrent.Future<UpdateWaasPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWaasPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWaasPolicyRequest, UpdateWaasPolicyResponse>(
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
    public java.util.concurrent.Future<UpdateWaasPolicyCustomProtectionRulesResponse>
            updateWaasPolicyCustomProtectionRules(
                    UpdateWaasPolicyCustomProtectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWaasPolicyCustomProtectionRulesRequest,
                                    UpdateWaasPolicyCustomProtectionRulesResponse>
                            handler) {
        LOG.trace("Called async updateWaasPolicyCustomProtectionRules");
        final UpdateWaasPolicyCustomProtectionRulesRequest interceptedRequest =
                UpdateWaasPolicyCustomProtectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWaasPolicyCustomProtectionRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateWaasPolicyCustomProtectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateWaasPolicyCustomProtectionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateWaasPolicyCustomProtectionRulesResponse>
                transformer =
                        UpdateWaasPolicyCustomProtectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateWaasPolicyCustomProtectionRulesRequest,
                        UpdateWaasPolicyCustomProtectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWaasPolicyCustomProtectionRulesRequest,
                                UpdateWaasPolicyCustomProtectionRulesResponse>,
                        java.util.concurrent.Future<UpdateWaasPolicyCustomProtectionRulesResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCustomProtectionRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWaasPolicyCustomProtectionRulesRequest,
                    UpdateWaasPolicyCustomProtectionRulesResponse>(
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
    public java.util.concurrent.Future<UpdateWafAddressRateLimitingResponse>
            updateWafAddressRateLimiting(
                    UpdateWafAddressRateLimitingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWafAddressRateLimitingRequest,
                                    UpdateWafAddressRateLimitingResponse>
                            handler) {
        LOG.trace("Called async updateWafAddressRateLimiting");
        final UpdateWafAddressRateLimitingRequest interceptedRequest =
                UpdateWafAddressRateLimitingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafAddressRateLimitingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateWafAddressRateLimiting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/UpdateWafAddressRateLimiting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateWafAddressRateLimitingResponse>
                transformer =
                        UpdateWafAddressRateLimitingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateWafAddressRateLimitingRequest, UpdateWafAddressRateLimitingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWafAddressRateLimitingRequest,
                                UpdateWafAddressRateLimitingResponse>,
                        java.util.concurrent.Future<UpdateWafAddressRateLimitingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWafAddressRateLimitingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWafAddressRateLimitingRequest, UpdateWafAddressRateLimitingResponse>(
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
    public java.util.concurrent.Future<UpdateWafConfigResponse> updateWafConfig(
            UpdateWafConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWafConfigRequest, UpdateWafConfigResponse>
                    handler) {
        LOG.trace("Called async updateWafConfig");
        final UpdateWafConfigRequest interceptedRequest =
                UpdateWafConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateWafConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/UpdateWafConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateWafConfigResponse>
                transformer =
                        UpdateWafConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateWafConfigRequest, UpdateWafConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWafConfigRequest, UpdateWafConfigResponse>,
                        java.util.concurrent.Future<UpdateWafConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWafConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWafConfigRequest, UpdateWafConfigResponse>(
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
    public java.util.concurrent.Future<UpdateWhitelistsResponse> updateWhitelists(
            UpdateWhitelistsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWhitelistsRequest, UpdateWhitelistsResponse>
                    handler) {
        LOG.trace("Called async updateWhitelists");
        final UpdateWhitelistsRequest interceptedRequest =
                UpdateWhitelistsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWhitelistsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Waas",
                        "UpdateWhitelists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/UpdateWhitelists");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateWhitelistsResponse>
                transformer =
                        UpdateWhitelistsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateWhitelistsRequest, UpdateWhitelistsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWhitelistsRequest, UpdateWhitelistsResponse>,
                        java.util.concurrent.Future<UpdateWhitelistsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getWhitelists(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWhitelistsRequest, UpdateWhitelistsResponse>(
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
