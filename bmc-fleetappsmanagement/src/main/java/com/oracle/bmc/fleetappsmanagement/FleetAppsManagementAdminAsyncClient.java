/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.internal.http.*;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Async client implementation for FleetAppsManagementAdmin service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementAdminAsyncClient implements FleetAppsManagementAdminAsync {
    /**
     * Service instance for FleetAppsManagementAdmin.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTADMIN")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementAdminAsyncClient.class);

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
    public FleetAppsManagementAdminAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
                    Builder, FleetAppsManagementAdminAsyncClient> {
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
        public FleetAppsManagementAdminAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new FleetAppsManagementAdminAsyncClient(
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
    public java.util.concurrent.Future<CreateCompliancePolicyRuleResponse>
            createCompliancePolicyRule(
                    CreateCompliancePolicyRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCompliancePolicyRuleRequest,
                                    CreateCompliancePolicyRuleResponse>
                            handler) {
        LOG.trace("Called async createCompliancePolicyRule");
        final CreateCompliancePolicyRuleRequest interceptedRequest =
                CreateCompliancePolicyRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCompliancePolicyRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateCompliancePolicyRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyRule/CreateCompliancePolicyRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCompliancePolicyRuleResponse>
                transformer =
                        CreateCompliancePolicyRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCompliancePolicyRuleRequest, CreateCompliancePolicyRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCompliancePolicyRuleRequest,
                                CreateCompliancePolicyRuleResponse>,
                        java.util.concurrent.Future<CreateCompliancePolicyRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCompliancePolicyRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCompliancePolicyRuleRequest, CreateCompliancePolicyRuleResponse>(
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
    public java.util.concurrent.Future<CreateOnboardingResponse> createOnboarding(
            CreateOnboardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOnboardingRequest, CreateOnboardingResponse>
                    handler) {
        LOG.trace("Called async createOnboarding");
        final CreateOnboardingRequest interceptedRequest =
                CreateOnboardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOnboardingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateOnboarding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/CreateOnboarding");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateOnboardingResponse>
                transformer =
                        CreateOnboardingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateOnboardingRequest, CreateOnboardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOnboardingRequest, CreateOnboardingResponse>,
                        java.util.concurrent.Future<CreateOnboardingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOnboardingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOnboardingRequest, CreateOnboardingResponse>(
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
    public java.util.concurrent.Future<CreatePlatformConfigurationResponse>
            createPlatformConfiguration(
                    CreatePlatformConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePlatformConfigurationRequest,
                                    CreatePlatformConfigurationResponse>
                            handler) {
        LOG.trace("Called async createPlatformConfiguration");
        final CreatePlatformConfigurationRequest interceptedRequest =
                CreatePlatformConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePlatformConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "CreatePlatformConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PlatformConfiguration/CreatePlatformConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreatePlatformConfigurationResponse>
                transformer =
                        CreatePlatformConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreatePlatformConfigurationRequest, CreatePlatformConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePlatformConfigurationRequest,
                                CreatePlatformConfigurationResponse>,
                        java.util.concurrent.Future<CreatePlatformConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePlatformConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePlatformConfigurationRequest, CreatePlatformConfigurationResponse>(
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
    public java.util.concurrent.Future<CreatePropertyResponse> createProperty(
            CreatePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePropertyRequest, CreatePropertyResponse>
                    handler) {
        LOG.trace("Called async createProperty");
        final CreatePropertyRequest interceptedRequest =
                CreatePropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePropertyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateProperty",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/CreateProperty");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePropertyResponse>
                transformer =
                        CreatePropertyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePropertyRequest, CreatePropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePropertyRequest, CreatePropertyResponse>,
                        java.util.concurrent.Future<CreatePropertyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePropertyRequest, CreatePropertyResponse>(
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
    public java.util.concurrent.Future<DeleteCompliancePolicyRuleResponse>
            deleteCompliancePolicyRule(
                    DeleteCompliancePolicyRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCompliancePolicyRuleRequest,
                                    DeleteCompliancePolicyRuleResponse>
                            handler) {
        LOG.trace("Called async deleteCompliancePolicyRule");
        final DeleteCompliancePolicyRuleRequest interceptedRequest =
                DeleteCompliancePolicyRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCompliancePolicyRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteCompliancePolicyRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyRule/DeleteCompliancePolicyRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCompliancePolicyRuleResponse>
                transformer =
                        DeleteCompliancePolicyRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCompliancePolicyRuleRequest, DeleteCompliancePolicyRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCompliancePolicyRuleRequest,
                                DeleteCompliancePolicyRuleResponse>,
                        java.util.concurrent.Future<DeleteCompliancePolicyRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCompliancePolicyRuleRequest, DeleteCompliancePolicyRuleResponse>(
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
    public java.util.concurrent.Future<DeleteOnboardingResponse> deleteOnboarding(
            DeleteOnboardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnboardingRequest, DeleteOnboardingResponse>
                    handler) {
        LOG.trace("Called async deleteOnboarding");
        final DeleteOnboardingRequest interceptedRequest =
                DeleteOnboardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOnboardingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteOnboarding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/DeleteOnboarding");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteOnboardingResponse>
                transformer =
                        DeleteOnboardingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteOnboardingRequest, DeleteOnboardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOnboardingRequest, DeleteOnboardingResponse>,
                        java.util.concurrent.Future<DeleteOnboardingResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOnboardingRequest, DeleteOnboardingResponse>(
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
    public java.util.concurrent.Future<DeletePlatformConfigurationResponse>
            deletePlatformConfiguration(
                    DeletePlatformConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePlatformConfigurationRequest,
                                    DeletePlatformConfigurationResponse>
                            handler) {
        LOG.trace("Called async deletePlatformConfiguration");
        final DeletePlatformConfigurationRequest interceptedRequest =
                DeletePlatformConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePlatformConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "DeletePlatformConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PlatformConfiguration/DeletePlatformConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeletePlatformConfigurationResponse>
                transformer =
                        DeletePlatformConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePlatformConfigurationRequest, DeletePlatformConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePlatformConfigurationRequest,
                                DeletePlatformConfigurationResponse>,
                        java.util.concurrent.Future<DeletePlatformConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePlatformConfigurationRequest, DeletePlatformConfigurationResponse>(
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
    public java.util.concurrent.Future<DeletePropertyResponse> deleteProperty(
            DeletePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePropertyRequest, DeletePropertyResponse>
                    handler) {
        LOG.trace("Called async deleteProperty");
        final DeletePropertyRequest interceptedRequest =
                DeletePropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePropertyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteProperty",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/DeleteProperty");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePropertyResponse>
                transformer =
                        DeletePropertyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePropertyRequest, DeletePropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePropertyRequest, DeletePropertyResponse>,
                        java.util.concurrent.Future<DeletePropertyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePropertyRequest, DeletePropertyResponse>(
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
    public java.util.concurrent.Future<EnableLatestPolicyResponse> enableLatestPolicy(
            EnableLatestPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableLatestPolicyRequest, EnableLatestPolicyResponse>
                    handler) {
        LOG.trace("Called async enableLatestPolicy");
        final EnableLatestPolicyRequest interceptedRequest =
                EnableLatestPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableLatestPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "EnableLatestPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/EnableLatestPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, EnableLatestPolicyResponse>
                transformer =
                        EnableLatestPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<EnableLatestPolicyRequest, EnableLatestPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableLatestPolicyRequest, EnableLatestPolicyResponse>,
                        java.util.concurrent.Future<EnableLatestPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableLatestPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableLatestPolicyRequest, EnableLatestPolicyResponse>(
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
    public java.util.concurrent.Future<GetCompliancePolicyResponse> getCompliancePolicy(
            GetCompliancePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompliancePolicyRequest, GetCompliancePolicyResponse>
                    handler) {
        LOG.trace("Called async getCompliancePolicy");
        final GetCompliancePolicyRequest interceptedRequest =
                GetCompliancePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompliancePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "GetCompliancePolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicy/GetCompliancePolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCompliancePolicyResponse>
                transformer =
                        GetCompliancePolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCompliancePolicyRequest, GetCompliancePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompliancePolicyRequest, GetCompliancePolicyResponse>,
                        java.util.concurrent.Future<GetCompliancePolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompliancePolicyRequest, GetCompliancePolicyResponse>(
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
    public java.util.concurrent.Future<GetCompliancePolicyRuleResponse> getCompliancePolicyRule(
            GetCompliancePolicyRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
                    handler) {
        LOG.trace("Called async getCompliancePolicyRule");
        final GetCompliancePolicyRuleRequest interceptedRequest =
                GetCompliancePolicyRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompliancePolicyRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "GetCompliancePolicyRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyRule/GetCompliancePolicyRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCompliancePolicyRuleResponse>
                transformer =
                        GetCompliancePolicyRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>,
                        java.util.concurrent.Future<GetCompliancePolicyRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>(
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
    public java.util.concurrent.Future<GetOnboardingResponse> getOnboarding(
            GetOnboardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetOnboardingRequest, GetOnboardingResponse>
                    handler) {
        LOG.trace("Called async getOnboarding");
        final GetOnboardingRequest interceptedRequest =
                GetOnboardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOnboardingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "GetOnboarding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/GetOnboarding");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOnboardingResponse>
                transformer =
                        GetOnboardingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetOnboardingRequest, GetOnboardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOnboardingRequest, GetOnboardingResponse>,
                        java.util.concurrent.Future<GetOnboardingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOnboardingRequest, GetOnboardingResponse>(
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
    public java.util.concurrent.Future<GetPlatformConfigurationResponse> getPlatformConfiguration(
            GetPlatformConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
                    handler) {
        LOG.trace("Called async getPlatformConfiguration");
        final GetPlatformConfigurationRequest interceptedRequest =
                GetPlatformConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPlatformConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "GetPlatformConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PlatformConfiguration/GetPlatformConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetPlatformConfigurationResponse>
                transformer =
                        GetPlatformConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>,
                        java.util.concurrent.Future<GetPlatformConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>(
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
    public java.util.concurrent.Future<GetPropertyResponse> getProperty(
            GetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPropertyRequest, GetPropertyResponse>
                    handler) {
        LOG.trace("Called async getProperty");
        final GetPropertyRequest interceptedRequest =
                GetPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPropertyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "GetProperty",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/GetProperty");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPropertyResponse>
                transformer =
                        GetPropertyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPropertyRequest, GetPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPropertyRequest, GetPropertyResponse>,
                        java.util.concurrent.Future<GetPropertyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPropertyRequest, GetPropertyResponse>(
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
    public java.util.concurrent.Future<ListCompliancePoliciesResponse> listCompliancePolicies(
            ListCompliancePoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCompliancePoliciesRequest, ListCompliancePoliciesResponse>
                    handler) {
        LOG.trace("Called async listCompliancePolicies");
        final ListCompliancePoliciesRequest interceptedRequest =
                ListCompliancePoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompliancePoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListCompliancePolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyCollection/ListCompliancePolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCompliancePoliciesResponse>
                transformer =
                        ListCompliancePoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCompliancePoliciesRequest, ListCompliancePoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCompliancePoliciesRequest, ListCompliancePoliciesResponse>,
                        java.util.concurrent.Future<ListCompliancePoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCompliancePoliciesRequest, ListCompliancePoliciesResponse>(
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
    public java.util.concurrent.Future<ListCompliancePolicyRulesResponse> listCompliancePolicyRules(
            ListCompliancePolicyRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCompliancePolicyRulesRequest, ListCompliancePolicyRulesResponse>
                    handler) {
        LOG.trace("Called async listCompliancePolicyRules");
        final ListCompliancePolicyRulesRequest interceptedRequest =
                ListCompliancePolicyRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompliancePolicyRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListCompliancePolicyRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyRuleCollection/ListCompliancePolicyRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCompliancePolicyRulesResponse>
                transformer =
                        ListCompliancePolicyRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCompliancePolicyRulesRequest, ListCompliancePolicyRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCompliancePolicyRulesRequest,
                                ListCompliancePolicyRulesResponse>,
                        java.util.concurrent.Future<ListCompliancePolicyRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCompliancePolicyRulesRequest, ListCompliancePolicyRulesResponse>(
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
    public java.util.concurrent.Future<ListOnboardingPoliciesResponse> listOnboardingPolicies(
            ListOnboardingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>
                    handler) {
        LOG.trace("Called async listOnboardingPolicies");
        final ListOnboardingPoliciesRequest interceptedRequest =
                ListOnboardingPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOnboardingPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardingPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/OnboardingPolicyCollection/ListOnboardingPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListOnboardingPoliciesResponse>
                transformer =
                        ListOnboardingPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>,
                        java.util.concurrent.Future<ListOnboardingPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>(
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
    public java.util.concurrent.Future<ListOnboardingsResponse> listOnboardings(
            ListOnboardingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnboardingsRequest, ListOnboardingsResponse>
                    handler) {
        LOG.trace("Called async listOnboardings");
        final ListOnboardingsRequest interceptedRequest =
                ListOnboardingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOnboardingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/OnboardingCollection/ListOnboardings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListOnboardingsResponse>
                transformer =
                        ListOnboardingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListOnboardingsRequest, ListOnboardingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOnboardingsRequest, ListOnboardingsResponse>,
                        java.util.concurrent.Future<ListOnboardingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOnboardingsRequest, ListOnboardingsResponse>(
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
    public java.util.concurrent.Future<ListPlatformConfigurationsResponse>
            listPlatformConfigurations(
                    ListPlatformConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPlatformConfigurationsRequest,
                                    ListPlatformConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listPlatformConfigurations");
        final ListPlatformConfigurationsRequest interceptedRequest =
                ListPlatformConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPlatformConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListPlatformConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PlatformConfigurationCollection/ListPlatformConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListPlatformConfigurationsResponse>
                transformer =
                        ListPlatformConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPlatformConfigurationsRequest, ListPlatformConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPlatformConfigurationsRequest,
                                ListPlatformConfigurationsResponse>,
                        java.util.concurrent.Future<ListPlatformConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPlatformConfigurationsRequest, ListPlatformConfigurationsResponse>(
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
    public java.util.concurrent.Future<ListPropertiesResponse> listProperties(
            ListPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPropertiesRequest, ListPropertiesResponse>
                    handler) {
        LOG.trace("Called async listProperties");
        final ListPropertiesRequest interceptedRequest =
                ListPropertiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPropertiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ListProperties",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PropertyCollection/ListProperties");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPropertiesResponse>
                transformer =
                        ListPropertiesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPropertiesRequest, ListPropertiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPropertiesRequest, ListPropertiesResponse>,
                        java.util.concurrent.Future<ListPropertiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPropertiesRequest, ListPropertiesResponse>(
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
    public java.util.concurrent.Future<ManageSettingsResponse> manageSettings(
            ManageSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ManageSettingsRequest, ManageSettingsResponse>
                    handler) {
        LOG.trace("Called async manageSettings");
        final ManageSettingsRequest interceptedRequest =
                ManageSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ManageSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "ManageSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/ManageSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageSettingsResponse>
                transformer =
                        ManageSettingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ManageSettingsRequest, ManageSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ManageSettingsRequest, ManageSettingsResponse>,
                        java.util.concurrent.Future<ManageSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getManageSettingsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ManageSettingsRequest, ManageSettingsResponse>(
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
    public java.util.concurrent.Future<UpdateCompliancePolicyRuleResponse>
            updateCompliancePolicyRule(
                    UpdateCompliancePolicyRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCompliancePolicyRuleRequest,
                                    UpdateCompliancePolicyRuleResponse>
                            handler) {
        LOG.trace("Called async updateCompliancePolicyRule");
        final UpdateCompliancePolicyRuleRequest interceptedRequest =
                UpdateCompliancePolicyRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCompliancePolicyRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateCompliancePolicyRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/CompliancePolicyRule/UpdateCompliancePolicyRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCompliancePolicyRuleResponse>
                transformer =
                        UpdateCompliancePolicyRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCompliancePolicyRuleRequest, UpdateCompliancePolicyRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCompliancePolicyRuleRequest,
                                UpdateCompliancePolicyRuleResponse>,
                        java.util.concurrent.Future<UpdateCompliancePolicyRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCompliancePolicyRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCompliancePolicyRuleRequest, UpdateCompliancePolicyRuleResponse>(
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
    public java.util.concurrent.Future<UpdateOnboardingResponse> updateOnboarding(
            UpdateOnboardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnboardingRequest, UpdateOnboardingResponse>
                    handler) {
        LOG.trace("Called async updateOnboarding");
        final UpdateOnboardingRequest interceptedRequest =
                UpdateOnboardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnboardingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateOnboarding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/UpdateOnboarding");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateOnboardingResponse>
                transformer =
                        UpdateOnboardingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateOnboardingRequest, UpdateOnboardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOnboardingRequest, UpdateOnboardingResponse>,
                        java.util.concurrent.Future<UpdateOnboardingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOnboardingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOnboardingRequest, UpdateOnboardingResponse>(
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
    public java.util.concurrent.Future<UpdatePlatformConfigurationResponse>
            updatePlatformConfiguration(
                    UpdatePlatformConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePlatformConfigurationRequest,
                                    UpdatePlatformConfigurationResponse>
                            handler) {
        LOG.trace("Called async updatePlatformConfiguration");
        final UpdatePlatformConfigurationRequest interceptedRequest =
                UpdatePlatformConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePlatformConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdatePlatformConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PlatformConfiguration/UpdatePlatformConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdatePlatformConfigurationResponse>
                transformer =
                        UpdatePlatformConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdatePlatformConfigurationRequest, UpdatePlatformConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePlatformConfigurationRequest,
                                UpdatePlatformConfigurationResponse>,
                        java.util.concurrent.Future<UpdatePlatformConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePlatformConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePlatformConfigurationRequest, UpdatePlatformConfigurationResponse>(
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
    public java.util.concurrent.Future<UpdatePropertyResponse> updateProperty(
            UpdatePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePropertyRequest, UpdatePropertyResponse>
                    handler) {
        LOG.trace("Called async updateProperty");
        final UpdatePropertyRequest interceptedRequest =
                UpdatePropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePropertyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateProperty",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/UpdateProperty");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePropertyResponse>
                transformer =
                        UpdatePropertyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePropertyRequest, UpdatePropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePropertyRequest, UpdatePropertyResponse>,
                        java.util.concurrent.Future<UpdatePropertyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePropertyRequest, UpdatePropertyResponse>(
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
