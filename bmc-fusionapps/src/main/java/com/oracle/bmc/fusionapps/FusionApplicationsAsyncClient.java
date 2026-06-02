/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.fusionapps.internal.http.*;
import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for FusionApplications service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class FusionApplicationsAsyncClient implements FusionApplicationsAsync {
    /**
     * Service instance for FusionApplications.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(FusionApplicationsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fusionapps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FusionApplicationsAsyncClient.class);

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

    // This pattern matches substrings that are enclosed within curly braces {}
    private static final Pattern PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES =
            Pattern.compile("\\{([^}]+)\\}");

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
    public FusionApplicationsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
    public FusionApplicationsAsyncClient(
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
        java.util.List<com.oracle.bmc.internal.SpiClientConfigurator>
                additionalSpiClientConfigurators =
                        com.oracle.bmc.util.internal.SpiClientConfiguratorUtils
                                .getEnabledSpiClientConfigurators();
        allConfigurators.addAll(additionalSpiClientConfigurators);
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
                    Builder, FusionApplicationsAsyncClient> {
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
        public FusionApplicationsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new FusionApplicationsAsyncClient(
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
        String value = client.getEndpoint();
        if (value.contains("{")) {
            Matcher matcher = PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES.matcher(value);
            java.lang.StringBuilder params = new java.lang.StringBuilder();
            while (matcher.find()) {
                if (params.length() > 0) {
                    params.append(", ");
                }
                params.append("{").append(matcher.group(1)).append("}");
            }
            LOG.warn(
                    "Parameters like {} get replaced with appropriate values at request time.",
                    params.toString());
        }
        return client.getEndpoint();
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

    @Override
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
    public java.util.concurrent.Future<ChangeFusionEnvironmentCompartmentResponse>
            changeFusionEnvironmentCompartment(
                    ChangeFusionEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentCompartmentRequest,
                                    ChangeFusionEnvironmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFusionEnvironmentCompartment");
        final ChangeFusionEnvironmentCompartmentRequest interceptedRequest =
                ChangeFusionEnvironmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFusionEnvironmentCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ChangeFusionEnvironmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ChangeFusionEnvironmentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFusionEnvironmentCompartmentResponse>
                transformer =
                        ChangeFusionEnvironmentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFusionEnvironmentCompartmentRequest,
                        ChangeFusionEnvironmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFusionEnvironmentCompartmentRequest,
                                ChangeFusionEnvironmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFusionEnvironmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFusionEnvironmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFusionEnvironmentCompartmentRequest,
                    ChangeFusionEnvironmentCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeFusionEnvironmentFamilyCompartmentResponse>
            changeFusionEnvironmentFamilyCompartment(
                    ChangeFusionEnvironmentFamilyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentFamilyCompartmentRequest,
                                    ChangeFusionEnvironmentFamilyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFusionEnvironmentFamilyCompartment");
        final ChangeFusionEnvironmentFamilyCompartmentRequest interceptedRequest =
                ChangeFusionEnvironmentFamilyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFusionEnvironmentFamilyCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ChangeFusionEnvironmentFamilyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/ChangeFusionEnvironmentFamilyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFusionEnvironmentFamilyCompartmentResponse>
                transformer =
                        ChangeFusionEnvironmentFamilyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFusionEnvironmentFamilyCompartmentRequest,
                        ChangeFusionEnvironmentFamilyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFusionEnvironmentFamilyCompartmentRequest,
                                ChangeFusionEnvironmentFamilyCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeFusionEnvironmentFamilyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeFusionEnvironmentFamilyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFusionEnvironmentFamilyCompartmentRequest,
                    ChangeFusionEnvironmentFamilyCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateDataMaskingActivityResponse> createDataMaskingActivity(
            CreateDataMaskingActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskingActivityRequest, CreateDataMaskingActivityResponse>
                    handler) {
        LOG.trace("Called async createDataMaskingActivity");
        final CreateDataMaskingActivityRequest interceptedRequest =
                CreateDataMaskingActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataMaskingActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateDataMaskingActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/CreateDataMaskingActivity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDataMaskingActivityResponse>
                transformer =
                        CreateDataMaskingActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataMaskingActivityRequest, CreateDataMaskingActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataMaskingActivityRequest,
                                CreateDataMaskingActivityResponse>,
                        java.util.concurrent.Future<CreateDataMaskingActivityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataMaskingActivityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataMaskingActivityRequest, CreateDataMaskingActivityResponse>(
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
    public java.util.concurrent.Future<CreateEmailSubdomainResponse> createEmailSubdomain(
            CreateEmailSubdomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEmailSubdomainRequest, CreateEmailSubdomainResponse>
                    handler) {
        LOG.trace("Called async createEmailSubdomain");
        final CreateEmailSubdomainRequest interceptedRequest =
                CreateEmailSubdomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEmailSubdomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateEmailSubdomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/CreateEmailSubdomain");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateEmailSubdomainResponse>
                transformer =
                        CreateEmailSubdomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateEmailSubdomainRequest, CreateEmailSubdomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEmailSubdomainRequest, CreateEmailSubdomainResponse>,
                        java.util.concurrent.Future<CreateEmailSubdomainResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEmailSubdomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEmailSubdomainRequest, CreateEmailSubdomainResponse>(
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
    public java.util.concurrent.Future<CreateFusionEnvironmentResponse> createFusionEnvironment(
            CreateFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>
                    handler) {
        LOG.trace("Called async createFusionEnvironment");
        final CreateFusionEnvironmentRequest interceptedRequest =
                CreateFusionEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFusionEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/CreateFusionEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateFusionEnvironmentResponse>
                transformer =
                        CreateFusionEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>,
                        java.util.concurrent.Future<CreateFusionEnvironmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFusionEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFusionEnvironmentRequest, CreateFusionEnvironmentResponse>(
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
    public java.util.concurrent.Future<CreateFusionEnvironmentAdminUserResponse>
            createFusionEnvironmentAdminUser(
                    CreateFusionEnvironmentAdminUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentAdminUserRequest,
                                    CreateFusionEnvironmentAdminUserResponse>
                            handler) {
        LOG.trace("Called async createFusionEnvironmentAdminUser");
        final CreateFusionEnvironmentAdminUserRequest interceptedRequest =
                CreateFusionEnvironmentAdminUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFusionEnvironmentAdminUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironmentAdminUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/CreateFusionEnvironmentAdminUser");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateFusionEnvironmentAdminUserResponse>
                transformer =
                        CreateFusionEnvironmentAdminUserConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFusionEnvironmentAdminUserRequest,
                        CreateFusionEnvironmentAdminUserResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFusionEnvironmentAdminUserRequest,
                                CreateFusionEnvironmentAdminUserResponse>,
                        java.util.concurrent.Future<CreateFusionEnvironmentAdminUserResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFusionEnvironmentAdminUserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFusionEnvironmentAdminUserRequest,
                    CreateFusionEnvironmentAdminUserResponse>(
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
    public java.util.concurrent.Future<CreateFusionEnvironmentFamilyResponse>
            createFusionEnvironmentFamily(
                    CreateFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentFamilyRequest,
                                    CreateFusionEnvironmentFamilyResponse>
                            handler) {
        LOG.trace("Called async createFusionEnvironmentFamily");
        final CreateFusionEnvironmentFamilyRequest interceptedRequest =
                CreateFusionEnvironmentFamilyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFusionEnvironmentFamilyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateFusionEnvironmentFamily",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/CreateFusionEnvironmentFamily");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateFusionEnvironmentFamilyResponse>
                transformer =
                        CreateFusionEnvironmentFamilyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFusionEnvironmentFamilyRequest, CreateFusionEnvironmentFamilyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFusionEnvironmentFamilyRequest,
                                CreateFusionEnvironmentFamilyResponse>,
                        java.util.concurrent.Future<CreateFusionEnvironmentFamilyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFusionEnvironmentFamilyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFusionEnvironmentFamilyRequest, CreateFusionEnvironmentFamilyResponse>(
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
    public java.util.concurrent.Future<CreateMarketingBrandResponse> createMarketingBrand(
            CreateMarketingBrandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMarketingBrandRequest, CreateMarketingBrandResponse>
                    handler) {
        LOG.trace("Called async createMarketingBrand");
        final CreateMarketingBrandRequest interceptedRequest =
                CreateMarketingBrandConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMarketingBrandConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateMarketingBrand",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/MarketingBrand/CreateMarketingBrand");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMarketingBrandResponse>
                transformer =
                        CreateMarketingBrandConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMarketingBrandRequest, CreateMarketingBrandResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMarketingBrandRequest, CreateMarketingBrandResponse>,
                        java.util.concurrent.Future<CreateMarketingBrandResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMarketingBrandDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMarketingBrandRequest, CreateMarketingBrandResponse>(
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
    public java.util.concurrent.Future<CreateMicrositeResponse> createMicrosite(
            CreateMicrositeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMicrositeRequest, CreateMicrositeResponse>
                    handler) {
        LOG.trace("Called async createMicrosite");
        final CreateMicrositeRequest interceptedRequest =
                CreateMicrositeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMicrositeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateMicrosite",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/CreateMicrosite");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMicrositeResponse>
                transformer =
                        CreateMicrositeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMicrositeRequest, CreateMicrositeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMicrositeRequest, CreateMicrositeResponse>,
                        java.util.concurrent.Future<CreateMicrositeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMicrositeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMicrositeRequest, CreateMicrositeResponse>(
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
    public java.util.concurrent.Future<CreateRefreshActivityResponse> createRefreshActivity(
            CreateRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRefreshActivityRequest, CreateRefreshActivityResponse>
                    handler) {
        LOG.trace("Called async createRefreshActivity");
        final CreateRefreshActivityRequest interceptedRequest =
                CreateRefreshActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRefreshActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateRefreshActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/CreateRefreshActivityDetails/CreateRefreshActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRefreshActivityResponse>
                transformer =
                        CreateRefreshActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateRefreshActivityRequest, CreateRefreshActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRefreshActivityRequest, CreateRefreshActivityResponse>,
                        java.util.concurrent.Future<CreateRefreshActivityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRefreshActivityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRefreshActivityRequest, CreateRefreshActivityResponse>(
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
    public java.util.concurrent.Future<CreateServiceAttachmentResponse> createServiceAttachment(
            CreateServiceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceAttachmentRequest, CreateServiceAttachmentResponse>
                    handler) {
        LOG.trace("Called async createServiceAttachment");
        final CreateServiceAttachmentRequest interceptedRequest =
                CreateServiceAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateServiceAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/CreateServiceAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateServiceAttachmentResponse>
                transformer =
                        CreateServiceAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateServiceAttachmentRequest, CreateServiceAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateServiceAttachmentRequest, CreateServiceAttachmentResponse>,
                        java.util.concurrent.Future<CreateServiceAttachmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateServiceAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateServiceAttachmentRequest, CreateServiceAttachmentResponse>(
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
    public java.util.concurrent.Future<CreateVanityDomainResponse> createVanityDomain(
            CreateVanityDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVanityDomainRequest, CreateVanityDomainResponse>
                    handler) {
        LOG.trace("Called async createVanityDomain");
        final CreateVanityDomainRequest interceptedRequest =
                CreateVanityDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVanityDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateVanityDomain",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateVanityDomainResponse>
                transformer =
                        CreateVanityDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateVanityDomainRequest, CreateVanityDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVanityDomainRequest, CreateVanityDomainResponse>,
                        java.util.concurrent.Future<CreateVanityDomainResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVanityDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVanityDomainRequest, CreateVanityDomainResponse>(
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
    public java.util.concurrent.Future<CreateVanityDomainActivityResponse>
            createVanityDomainActivity(
                    CreateVanityDomainActivityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVanityDomainActivityRequest,
                                    CreateVanityDomainActivityResponse>
                            handler) {
        LOG.trace("Called async createVanityDomainActivity");
        final CreateVanityDomainActivityRequest interceptedRequest =
                CreateVanityDomainActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVanityDomainActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "CreateVanityDomainActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomainActivity/CreateVanityDomainActivity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateVanityDomainActivityResponse>
                transformer =
                        CreateVanityDomainActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVanityDomainActivityRequest, CreateVanityDomainActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVanityDomainActivityRequest,
                                CreateVanityDomainActivityResponse>,
                        java.util.concurrent.Future<CreateVanityDomainActivityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVanityDomainActivityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVanityDomainActivityRequest, CreateVanityDomainActivityResponse>(
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
    public java.util.concurrent.Future<DeleteEmailSubdomainResponse> deleteEmailSubdomain(
            DeleteEmailSubdomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmailSubdomainRequest, DeleteEmailSubdomainResponse>
                    handler) {
        LOG.trace("Called async deleteEmailSubdomain");
        final DeleteEmailSubdomainRequest interceptedRequest =
                DeleteEmailSubdomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEmailSubdomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteEmailSubdomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/DeleteEmailSubdomain");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteEmailSubdomainResponse>
                transformer =
                        DeleteEmailSubdomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteEmailSubdomainRequest, DeleteEmailSubdomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEmailSubdomainRequest, DeleteEmailSubdomainResponse>,
                        java.util.concurrent.Future<DeleteEmailSubdomainResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEmailSubdomainRequest, DeleteEmailSubdomainResponse>(
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
    public java.util.concurrent.Future<DeleteFusionEnvironmentResponse> deleteFusionEnvironment(
            DeleteFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>
                    handler) {
        LOG.trace("Called async deleteFusionEnvironment");
        final DeleteFusionEnvironmentRequest interceptedRequest =
                DeleteFusionEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFusionEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/DeleteFusionEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteFusionEnvironmentResponse>
                transformer =
                        DeleteFusionEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>,
                        java.util.concurrent.Future<DeleteFusionEnvironmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFusionEnvironmentRequest, DeleteFusionEnvironmentResponse>(
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
    public java.util.concurrent.Future<DeleteFusionEnvironmentAdminUserResponse>
            deleteFusionEnvironmentAdminUser(
                    DeleteFusionEnvironmentAdminUserRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentAdminUserRequest,
                                    DeleteFusionEnvironmentAdminUserResponse>
                            handler) {
        LOG.trace("Called async deleteFusionEnvironmentAdminUser");
        final DeleteFusionEnvironmentAdminUserRequest interceptedRequest =
                DeleteFusionEnvironmentAdminUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFusionEnvironmentAdminUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironmentAdminUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/DeleteFusionEnvironmentAdminUser");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteFusionEnvironmentAdminUserResponse>
                transformer =
                        DeleteFusionEnvironmentAdminUserConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFusionEnvironmentAdminUserRequest,
                        DeleteFusionEnvironmentAdminUserResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFusionEnvironmentAdminUserRequest,
                                DeleteFusionEnvironmentAdminUserResponse>,
                        java.util.concurrent.Future<DeleteFusionEnvironmentAdminUserResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFusionEnvironmentAdminUserRequest,
                    DeleteFusionEnvironmentAdminUserResponse>(
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
    public java.util.concurrent.Future<DeleteFusionEnvironmentFamilyResponse>
            deleteFusionEnvironmentFamily(
                    DeleteFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentFamilyRequest,
                                    DeleteFusionEnvironmentFamilyResponse>
                            handler) {
        LOG.trace("Called async deleteFusionEnvironmentFamily");
        final DeleteFusionEnvironmentFamilyRequest interceptedRequest =
                DeleteFusionEnvironmentFamilyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFusionEnvironmentFamilyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteFusionEnvironmentFamily",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/DeleteFusionEnvironmentFamily");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteFusionEnvironmentFamilyResponse>
                transformer =
                        DeleteFusionEnvironmentFamilyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFusionEnvironmentFamilyRequest, DeleteFusionEnvironmentFamilyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFusionEnvironmentFamilyRequest,
                                DeleteFusionEnvironmentFamilyResponse>,
                        java.util.concurrent.Future<DeleteFusionEnvironmentFamilyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFusionEnvironmentFamilyRequest, DeleteFusionEnvironmentFamilyResponse>(
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
    public java.util.concurrent.Future<DeleteMarketingBrandResponse> deleteMarketingBrand(
            DeleteMarketingBrandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMarketingBrandRequest, DeleteMarketingBrandResponse>
                    handler) {
        LOG.trace("Called async deleteMarketingBrand");
        final DeleteMarketingBrandRequest interceptedRequest =
                DeleteMarketingBrandConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMarketingBrandConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteMarketingBrand",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/MarketingBrand/DeleteMarketingBrand");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMarketingBrandResponse>
                transformer =
                        DeleteMarketingBrandConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMarketingBrandRequest, DeleteMarketingBrandResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMarketingBrandRequest, DeleteMarketingBrandResponse>,
                        java.util.concurrent.Future<DeleteMarketingBrandResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMarketingBrandRequest, DeleteMarketingBrandResponse>(
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
    public java.util.concurrent.Future<DeleteMicrositeResponse> deleteMicrosite(
            DeleteMicrositeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMicrositeRequest, DeleteMicrositeResponse>
                    handler) {
        LOG.trace("Called async deleteMicrosite");
        final DeleteMicrositeRequest interceptedRequest =
                DeleteMicrositeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMicrositeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteMicrosite",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/DeleteMicrosite");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMicrositeResponse>
                transformer =
                        DeleteMicrositeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMicrositeRequest, DeleteMicrositeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMicrositeRequest, DeleteMicrositeResponse>,
                        java.util.concurrent.Future<DeleteMicrositeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMicrositeRequest, DeleteMicrositeResponse>(
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
    public java.util.concurrent.Future<DeleteRefreshActivityResponse> deleteRefreshActivity(
            DeleteRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRefreshActivityRequest, DeleteRefreshActivityResponse>
                    handler) {
        LOG.trace("Called async deleteRefreshActivity");
        final DeleteRefreshActivityRequest interceptedRequest =
                DeleteRefreshActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRefreshActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteRefreshActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/DeleteRefreshActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRefreshActivityResponse>
                transformer =
                        DeleteRefreshActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteRefreshActivityRequest, DeleteRefreshActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRefreshActivityRequest, DeleteRefreshActivityResponse>,
                        java.util.concurrent.Future<DeleteRefreshActivityResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRefreshActivityRequest, DeleteRefreshActivityResponse>(
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
    public java.util.concurrent.Future<DeleteServiceAttachmentResponse> deleteServiceAttachment(
            DeleteServiceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceAttachmentRequest, DeleteServiceAttachmentResponse>
                    handler) {
        LOG.trace("Called async deleteServiceAttachment");
        final DeleteServiceAttachmentRequest interceptedRequest =
                DeleteServiceAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteServiceAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/DeleteServiceAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteServiceAttachmentResponse>
                transformer =
                        DeleteServiceAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteServiceAttachmentRequest, DeleteServiceAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteServiceAttachmentRequest, DeleteServiceAttachmentResponse>,
                        java.util.concurrent.Future<DeleteServiceAttachmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteServiceAttachmentRequest, DeleteServiceAttachmentResponse>(
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
    public java.util.concurrent.Future<DeleteVanityDomainActivityResponse>
            deleteVanityDomainActivity(
                    DeleteVanityDomainActivityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVanityDomainActivityRequest,
                                    DeleteVanityDomainActivityResponse>
                            handler) {
        LOG.trace("Called async deleteVanityDomainActivity");
        final DeleteVanityDomainActivityRequest interceptedRequest =
                DeleteVanityDomainActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVanityDomainActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "DeleteVanityDomainActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomainActivity/DeleteVanityDomainActivity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteVanityDomainActivityResponse>
                transformer =
                        DeleteVanityDomainActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVanityDomainActivityRequest, DeleteVanityDomainActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVanityDomainActivityRequest,
                                DeleteVanityDomainActivityResponse>,
                        java.util.concurrent.Future<DeleteVanityDomainActivityResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVanityDomainActivityRequest, DeleteVanityDomainActivityResponse>(
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
    public java.util.concurrent.Future<GenerateExtractDetailsResponse> generateExtractDetails(
            GenerateExtractDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateExtractDetailsRequest, GenerateExtractDetailsResponse>
                    handler) {
        LOG.trace("Called async generateExtractDetails");
        final GenerateExtractDetailsRequest interceptedRequest =
                GenerateExtractDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateExtractDetailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GenerateExtractDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/GenerateExtractDetails");
        final java.util.function.Function<javax.ws.rs.core.Response, GenerateExtractDetailsResponse>
                transformer =
                        GenerateExtractDetailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateExtractDetailsRequest, GenerateExtractDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateExtractDetailsRequest, GenerateExtractDetailsResponse>,
                        java.util.concurrent.Future<GenerateExtractDetailsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateExtractDetailsRequest, GenerateExtractDetailsResponse>(
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
    public java.util.concurrent.Future<GetDataMaskingActivityResponse> getDataMaskingActivity(
            GetDataMaskingActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>
                    handler) {
        LOG.trace("Called async getDataMaskingActivity");
        final GetDataMaskingActivityRequest interceptedRequest =
                GetDataMaskingActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataMaskingActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetDataMaskingActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/GetDataMaskingActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataMaskingActivityResponse>
                transformer =
                        GetDataMaskingActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>,
                        java.util.concurrent.Future<GetDataMaskingActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataMaskingActivityRequest, GetDataMaskingActivityResponse>(
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
    public java.util.concurrent.Future<GetEmailSubdomainResponse> getEmailSubdomain(
            GetEmailSubdomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailSubdomainRequest, GetEmailSubdomainResponse>
                    handler) {
        LOG.trace("Called async getEmailSubdomain");
        final GetEmailSubdomainRequest interceptedRequest =
                GetEmailSubdomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEmailSubdomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetEmailSubdomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/GetEmailSubdomain");
        final java.util.function.Function<javax.ws.rs.core.Response, GetEmailSubdomainResponse>
                transformer =
                        GetEmailSubdomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetEmailSubdomainRequest, GetEmailSubdomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEmailSubdomainRequest, GetEmailSubdomainResponse>,
                        java.util.concurrent.Future<GetEmailSubdomainResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEmailSubdomainRequest, GetEmailSubdomainResponse>(
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
    public java.util.concurrent.Future<GetEmailSubdomainCsrResponse> getEmailSubdomainCsr(
            GetEmailSubdomainCsrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailSubdomainCsrRequest, GetEmailSubdomainCsrResponse>
                    handler) {
        LOG.trace("Called async getEmailSubdomainCsr");
        final GetEmailSubdomainCsrRequest interceptedRequest =
                GetEmailSubdomainCsrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEmailSubdomainCsrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetEmailSubdomainCsr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/GetEmailSubdomainCsr");
        final java.util.function.Function<javax.ws.rs.core.Response, GetEmailSubdomainCsrResponse>
                transformer =
                        GetEmailSubdomainCsrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetEmailSubdomainCsrRequest, GetEmailSubdomainCsrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEmailSubdomainCsrRequest, GetEmailSubdomainCsrResponse>,
                        java.util.concurrent.Future<GetEmailSubdomainCsrResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEmailSubdomainCsrRequest, GetEmailSubdomainCsrResponse>(
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
    public java.util.concurrent.Future<GetEmailSubdomainDnsConfigResponse>
            getEmailSubdomainDnsConfig(
                    GetEmailSubdomainDnsConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetEmailSubdomainDnsConfigRequest,
                                    GetEmailSubdomainDnsConfigResponse>
                            handler) {
        LOG.trace("Called async getEmailSubdomainDnsConfig");
        final GetEmailSubdomainDnsConfigRequest interceptedRequest =
                GetEmailSubdomainDnsConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEmailSubdomainDnsConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetEmailSubdomainDnsConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/GetEmailSubdomainDnsConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetEmailSubdomainDnsConfigResponse>
                transformer =
                        GetEmailSubdomainDnsConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetEmailSubdomainDnsConfigRequest, GetEmailSubdomainDnsConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEmailSubdomainDnsConfigRequest,
                                GetEmailSubdomainDnsConfigResponse>,
                        java.util.concurrent.Future<GetEmailSubdomainDnsConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEmailSubdomainDnsConfigRequest, GetEmailSubdomainDnsConfigResponse>(
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
    public java.util.concurrent.Future<GetFusionEnvironmentResponse> getFusionEnvironment(
            GetFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>
                    handler) {
        LOG.trace("Called async getFusionEnvironment");
        final GetFusionEnvironmentRequest interceptedRequest =
                GetFusionEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFusionEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetFusionEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/GetFusionEnvironment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFusionEnvironmentResponse>
                transformer =
                        GetFusionEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>,
                        java.util.concurrent.Future<GetFusionEnvironmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFusionEnvironmentRequest, GetFusionEnvironmentResponse>(
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
    public java.util.concurrent.Future<GetFusionEnvironmentFamilyResponse>
            getFusionEnvironmentFamily(
                    GetFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyRequest,
                                    GetFusionEnvironmentFamilyResponse>
                            handler) {
        LOG.trace("Called async getFusionEnvironmentFamily");
        final GetFusionEnvironmentFamilyRequest interceptedRequest =
                GetFusionEnvironmentFamilyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFusionEnvironmentFamilyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamily",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/GetFusionEnvironmentFamily");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFusionEnvironmentFamilyResponse>
                transformer =
                        GetFusionEnvironmentFamilyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFusionEnvironmentFamilyRequest, GetFusionEnvironmentFamilyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFusionEnvironmentFamilyRequest,
                                GetFusionEnvironmentFamilyResponse>,
                        java.util.concurrent.Future<GetFusionEnvironmentFamilyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFusionEnvironmentFamilyRequest, GetFusionEnvironmentFamilyResponse>(
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
    public java.util.concurrent.Future<GetFusionEnvironmentFamilyLimitsAndUsageResponse>
            getFusionEnvironmentFamilyLimitsAndUsage(
                    GetFusionEnvironmentFamilyLimitsAndUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                                    GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                            handler) {
        LOG.trace("Called async getFusionEnvironmentFamilyLimitsAndUsage");
        final GetFusionEnvironmentFamilyLimitsAndUsageRequest interceptedRequest =
                GetFusionEnvironmentFamilyLimitsAndUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFusionEnvironmentFamilyLimitsAndUsageConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamilyLimitsAndUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamilyLimitsAndUsage/GetFusionEnvironmentFamilyLimitsAndUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                transformer =
                        GetFusionEnvironmentFamilyLimitsAndUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                        GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                                GetFusionEnvironmentFamilyLimitsAndUsageResponse>,
                        java.util.concurrent.Future<
                                GetFusionEnvironmentFamilyLimitsAndUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                    GetFusionEnvironmentFamilyLimitsAndUsageResponse>(
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
    public java.util.concurrent.Future<GetFusionEnvironmentFamilySubscriptionDetailResponse>
            getFusionEnvironmentFamilySubscriptionDetail(
                    GetFusionEnvironmentFamilySubscriptionDetailRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilySubscriptionDetailRequest,
                                    GetFusionEnvironmentFamilySubscriptionDetailResponse>
                            handler) {
        LOG.trace("Called async getFusionEnvironmentFamilySubscriptionDetail");
        final GetFusionEnvironmentFamilySubscriptionDetailRequest interceptedRequest =
                GetFusionEnvironmentFamilySubscriptionDetailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFusionEnvironmentFamilySubscriptionDetailConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentFamilySubscriptionDetail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/GetFusionEnvironmentFamilySubscriptionDetail");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetFusionEnvironmentFamilySubscriptionDetailResponse>
                transformer =
                        GetFusionEnvironmentFamilySubscriptionDetailConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFusionEnvironmentFamilySubscriptionDetailRequest,
                        GetFusionEnvironmentFamilySubscriptionDetailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFusionEnvironmentFamilySubscriptionDetailRequest,
                                GetFusionEnvironmentFamilySubscriptionDetailResponse>,
                        java.util.concurrent.Future<
                                GetFusionEnvironmentFamilySubscriptionDetailResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFusionEnvironmentFamilySubscriptionDetailRequest,
                    GetFusionEnvironmentFamilySubscriptionDetailResponse>(
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
    public java.util.concurrent.Future<GetFusionEnvironmentStatusResponse>
            getFusionEnvironmentStatus(
                    GetFusionEnvironmentStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentStatusRequest,
                                    GetFusionEnvironmentStatusResponse>
                            handler) {
        LOG.trace("Called async getFusionEnvironmentStatus");
        final GetFusionEnvironmentStatusRequest interceptedRequest =
                GetFusionEnvironmentStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFusionEnvironmentStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetFusionEnvironmentStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentStatus/GetFusionEnvironmentStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFusionEnvironmentStatusResponse>
                transformer =
                        GetFusionEnvironmentStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFusionEnvironmentStatusRequest, GetFusionEnvironmentStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFusionEnvironmentStatusRequest,
                                GetFusionEnvironmentStatusResponse>,
                        java.util.concurrent.Future<GetFusionEnvironmentStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFusionEnvironmentStatusRequest, GetFusionEnvironmentStatusResponse>(
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
    public java.util.concurrent.Future<GetMarketingBrandResponse> getMarketingBrand(
            GetMarketingBrandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMarketingBrandRequest, GetMarketingBrandResponse>
                    handler) {
        LOG.trace("Called async getMarketingBrand");
        final GetMarketingBrandRequest interceptedRequest =
                GetMarketingBrandConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMarketingBrandConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetMarketingBrand",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/MarketingBrand/GetMarketingBrand");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMarketingBrandResponse>
                transformer =
                        GetMarketingBrandConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMarketingBrandRequest, GetMarketingBrandResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMarketingBrandRequest, GetMarketingBrandResponse>,
                        java.util.concurrent.Future<GetMarketingBrandResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMarketingBrandRequest, GetMarketingBrandResponse>(
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
    public java.util.concurrent.Future<GetMicrositeResponse> getMicrosite(
            GetMicrositeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMicrositeRequest, GetMicrositeResponse>
                    handler) {
        LOG.trace("Called async getMicrosite");
        final GetMicrositeRequest interceptedRequest =
                GetMicrositeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMicrositeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetMicrosite",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/GetMicrosite");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMicrositeResponse>
                transformer =
                        GetMicrositeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMicrositeRequest, GetMicrositeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMicrositeRequest, GetMicrositeResponse>,
                        java.util.concurrent.Future<GetMicrositeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMicrositeRequest, GetMicrositeResponse>(
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
    public java.util.concurrent.Future<GetMicrositeDnsConfigResponse> getMicrositeDnsConfig(
            GetMicrositeDnsConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMicrositeDnsConfigRequest, GetMicrositeDnsConfigResponse>
                    handler) {
        LOG.trace("Called async getMicrositeDnsConfig");
        final GetMicrositeDnsConfigRequest interceptedRequest =
                GetMicrositeDnsConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMicrositeDnsConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetMicrositeDnsConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/GetMicrositeDnsConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMicrositeDnsConfigResponse>
                transformer =
                        GetMicrositeDnsConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMicrositeDnsConfigRequest, GetMicrositeDnsConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMicrositeDnsConfigRequest, GetMicrositeDnsConfigResponse>,
                        java.util.concurrent.Future<GetMicrositeDnsConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMicrositeDnsConfigRequest, GetMicrositeDnsConfigResponse>(
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
    public java.util.concurrent.Future<GetRefreshActivityResponse> getRefreshActivity(
            GetRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRefreshActivityRequest, GetRefreshActivityResponse>
                    handler) {
        LOG.trace("Called async getRefreshActivity");
        final GetRefreshActivityRequest interceptedRequest =
                GetRefreshActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRefreshActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetRefreshActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/GetRefreshActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRefreshActivityResponse>
                transformer =
                        GetRefreshActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRefreshActivityRequest, GetRefreshActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRefreshActivityRequest, GetRefreshActivityResponse>,
                        java.util.concurrent.Future<GetRefreshActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRefreshActivityRequest, GetRefreshActivityResponse>(
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
    public java.util.concurrent.Future<GetScheduledActivityResponse> getScheduledActivity(
            GetScheduledActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledActivityRequest, GetScheduledActivityResponse>
                    handler) {
        LOG.trace("Called async getScheduledActivity");
        final GetScheduledActivityRequest interceptedRequest =
                GetScheduledActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetScheduledActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ScheduledActivity/GetScheduledActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetScheduledActivityResponse>
                transformer =
                        GetScheduledActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetScheduledActivityRequest, GetScheduledActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduledActivityRequest, GetScheduledActivityResponse>,
                        java.util.concurrent.Future<GetScheduledActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduledActivityRequest, GetScheduledActivityResponse>(
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
    public java.util.concurrent.Future<GetServiceAttachmentResponse> getServiceAttachment(
            GetServiceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetServiceAttachmentRequest, GetServiceAttachmentResponse>
                    handler) {
        LOG.trace("Called async getServiceAttachment");
        final GetServiceAttachmentRequest interceptedRequest =
                GetServiceAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetServiceAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/GetServiceAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetServiceAttachmentResponse>
                transformer =
                        GetServiceAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetServiceAttachmentRequest, GetServiceAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetServiceAttachmentRequest, GetServiceAttachmentResponse>,
                        java.util.concurrent.Future<GetServiceAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetServiceAttachmentRequest, GetServiceAttachmentResponse>(
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
    public java.util.concurrent.Future<GetVanityDomainResponse> getVanityDomain(
            GetVanityDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVanityDomainRequest, GetVanityDomainResponse>
                    handler) {
        LOG.trace("Called async getVanityDomain");
        final GetVanityDomainRequest interceptedRequest =
                GetVanityDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVanityDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetVanityDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomain/GetVanityDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVanityDomainResponse>
                transformer =
                        GetVanityDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVanityDomainRequest, GetVanityDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVanityDomainRequest, GetVanityDomainResponse>,
                        java.util.concurrent.Future<GetVanityDomainResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVanityDomainRequest, GetVanityDomainResponse>(
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
    public java.util.concurrent.Future<GetVanityDomainActivityResponse> getVanityDomainActivity(
            GetVanityDomainActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVanityDomainActivityRequest, GetVanityDomainActivityResponse>
                    handler) {
        LOG.trace("Called async getVanityDomainActivity");
        final GetVanityDomainActivityRequest interceptedRequest =
                GetVanityDomainActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVanityDomainActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "GetVanityDomainActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomainActivity/GetVanityDomainActivity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetVanityDomainActivityResponse>
                transformer =
                        GetVanityDomainActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVanityDomainActivityRequest, GetVanityDomainActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVanityDomainActivityRequest, GetVanityDomainActivityResponse>,
                        java.util.concurrent.Future<GetVanityDomainActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVanityDomainActivityRequest, GetVanityDomainActivityResponse>(
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
                        "FusionApplications",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<InitiateExtractResponse> initiateExtract(
            InitiateExtractRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InitiateExtractRequest, InitiateExtractResponse>
                    handler) {
        LOG.trace("Called async initiateExtract");
        final InitiateExtractRequest interceptedRequest =
                InitiateExtractConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InitiateExtractConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "InitiateExtract",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/InitiateExtract");
        final java.util.function.Function<javax.ws.rs.core.Response, InitiateExtractResponse>
                transformer =
                        InitiateExtractConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<InitiateExtractRequest, InitiateExtractResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InitiateExtractRequest, InitiateExtractResponse>,
                        java.util.concurrent.Future<InitiateExtractResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InitiateExtractRequest, InitiateExtractResponse>(
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
    public java.util.concurrent.Future<ListAdminUsersResponse> listAdminUsers(
            ListAdminUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminUsersRequest, ListAdminUsersResponse>
                    handler) {
        LOG.trace("Called async listAdminUsers");
        final ListAdminUsersRequest interceptedRequest =
                ListAdminUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAdminUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListAdminUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ListAdminUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAdminUsersResponse>
                transformer =
                        ListAdminUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAdminUsersRequest, ListAdminUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAdminUsersRequest, ListAdminUsersResponse>,
                        java.util.concurrent.Future<ListAdminUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAdminUsersRequest, ListAdminUsersResponse>(
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
    public java.util.concurrent.Future<ListDataMaskingActivitiesResponse> listDataMaskingActivities(
            ListDataMaskingActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>
                    handler) {
        LOG.trace("Called async listDataMaskingActivities");
        final ListDataMaskingActivitiesRequest interceptedRequest =
                ListDataMaskingActivitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataMaskingActivitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListDataMaskingActivities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/DataMaskingActivity/ListDataMaskingActivities");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDataMaskingActivitiesResponse>
                transformer =
                        ListDataMaskingActivitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataMaskingActivitiesRequest,
                                ListDataMaskingActivitiesResponse>,
                        java.util.concurrent.Future<ListDataMaskingActivitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>(
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
    public java.util.concurrent.Future<ListEmailSubdomainsResponse> listEmailSubdomains(
            ListEmailSubdomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEmailSubdomainsRequest, ListEmailSubdomainsResponse>
                    handler) {
        LOG.trace("Called async listEmailSubdomains");
        final ListEmailSubdomainsRequest interceptedRequest =
                ListEmailSubdomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEmailSubdomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListEmailSubdomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/ListEmailSubdomains");
        final java.util.function.Function<javax.ws.rs.core.Response, ListEmailSubdomainsResponse>
                transformer =
                        ListEmailSubdomainsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListEmailSubdomainsRequest, ListEmailSubdomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEmailSubdomainsRequest, ListEmailSubdomainsResponse>,
                        java.util.concurrent.Future<ListEmailSubdomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEmailSubdomainsRequest, ListEmailSubdomainsResponse>(
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
    public java.util.concurrent.Future<ListFusionEnvironmentFamiliesResponse>
            listFusionEnvironmentFamilies(
                    ListFusionEnvironmentFamiliesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFusionEnvironmentFamiliesRequest,
                                    ListFusionEnvironmentFamiliesResponse>
                            handler) {
        LOG.trace("Called async listFusionEnvironmentFamilies");
        final ListFusionEnvironmentFamiliesRequest interceptedRequest =
                ListFusionEnvironmentFamiliesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFusionEnvironmentFamiliesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListFusionEnvironmentFamilies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/ListFusionEnvironmentFamilies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFusionEnvironmentFamiliesResponse>
                transformer =
                        ListFusionEnvironmentFamiliesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFusionEnvironmentFamiliesRequest, ListFusionEnvironmentFamiliesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFusionEnvironmentFamiliesRequest,
                                ListFusionEnvironmentFamiliesResponse>,
                        java.util.concurrent.Future<ListFusionEnvironmentFamiliesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFusionEnvironmentFamiliesRequest, ListFusionEnvironmentFamiliesResponse>(
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
    public java.util.concurrent.Future<ListFusionEnvironmentsResponse> listFusionEnvironments(
            ListFusionEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>
                    handler) {
        LOG.trace("Called async listFusionEnvironments");
        final ListFusionEnvironmentsRequest interceptedRequest =
                ListFusionEnvironmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFusionEnvironmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListFusionEnvironments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ListFusionEnvironments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFusionEnvironmentsResponse>
                transformer =
                        ListFusionEnvironmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>,
                        java.util.concurrent.Future<ListFusionEnvironmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>(
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
    public java.util.concurrent.Future<ListMarketingBrandsResponse> listMarketingBrands(
            ListMarketingBrandsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMarketingBrandsRequest, ListMarketingBrandsResponse>
                    handler) {
        LOG.trace("Called async listMarketingBrands");
        final ListMarketingBrandsRequest interceptedRequest =
                ListMarketingBrandsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMarketingBrandsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListMarketingBrands",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/MarketingBrand/ListMarketingBrands");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMarketingBrandsResponse>
                transformer =
                        ListMarketingBrandsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMarketingBrandsRequest, ListMarketingBrandsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMarketingBrandsRequest, ListMarketingBrandsResponse>,
                        java.util.concurrent.Future<ListMarketingBrandsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMarketingBrandsRequest, ListMarketingBrandsResponse>(
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
    public java.util.concurrent.Future<ListMicrositesResponse> listMicrosites(
            ListMicrositesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMicrositesRequest, ListMicrositesResponse>
                    handler) {
        LOG.trace("Called async listMicrosites");
        final ListMicrositesRequest interceptedRequest =
                ListMicrositesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMicrositesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListMicrosites",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/ListMicrosites");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMicrositesResponse>
                transformer =
                        ListMicrositesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMicrositesRequest, ListMicrositesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMicrositesRequest, ListMicrositesResponse>,
                        java.util.concurrent.Future<ListMicrositesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMicrositesRequest, ListMicrositesResponse>(
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
    public java.util.concurrent.Future<ListRefreshActivitiesResponse> listRefreshActivities(
            ListRefreshActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>
                    handler) {
        LOG.trace("Called async listRefreshActivities");
        final ListRefreshActivitiesRequest interceptedRequest =
                ListRefreshActivitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRefreshActivitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListRefreshActivities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/RefreshActivity/ListRefreshActivities");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRefreshActivitiesResponse>
                transformer =
                        ListRefreshActivitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>,
                        java.util.concurrent.Future<ListRefreshActivitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>(
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
    public java.util.concurrent.Future<ListScheduledActivitiesResponse> listScheduledActivities(
            ListScheduledActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>
                    handler) {
        LOG.trace("Called async listScheduledActivities");
        final ListScheduledActivitiesRequest interceptedRequest =
                ListScheduledActivitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledActivitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListScheduledActivities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ScheduledActivity/ListScheduledActivities");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListScheduledActivitiesResponse>
                transformer =
                        ListScheduledActivitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>,
                        java.util.concurrent.Future<ListScheduledActivitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>(
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
    public java.util.concurrent.Future<ListServiceAttachmentsResponse> listServiceAttachments(
            ListServiceAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listServiceAttachments");
        final ListServiceAttachmentsRequest interceptedRequest =
                ListServiceAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServiceAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListServiceAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/ListServiceAttachments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListServiceAttachmentsResponse>
                transformer =
                        ListServiceAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>,
                        java.util.concurrent.Future<ListServiceAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>(
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
    public java.util.concurrent.Future<ListTimeAvailableForRefreshesResponse>
            listTimeAvailableForRefreshes(
                    ListTimeAvailableForRefreshesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTimeAvailableForRefreshesRequest,
                                    ListTimeAvailableForRefreshesResponse>
                            handler) {
        LOG.trace("Called async listTimeAvailableForRefreshes");
        final ListTimeAvailableForRefreshesRequest interceptedRequest =
                ListTimeAvailableForRefreshesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTimeAvailableForRefreshesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListTimeAvailableForRefreshes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/TimeAvailableForRefresh/ListTimeAvailableForRefreshes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTimeAvailableForRefreshesResponse>
                transformer =
                        ListTimeAvailableForRefreshesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTimeAvailableForRefreshesRequest, ListTimeAvailableForRefreshesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTimeAvailableForRefreshesRequest,
                                ListTimeAvailableForRefreshesResponse>,
                        java.util.concurrent.Future<ListTimeAvailableForRefreshesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTimeAvailableForRefreshesRequest, ListTimeAvailableForRefreshesResponse>(
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
    public java.util.concurrent.Future<ListVanityDomainsResponse> listVanityDomains(
            ListVanityDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVanityDomainsRequest, ListVanityDomainsResponse>
                    handler) {
        LOG.trace("Called async listVanityDomains");
        final ListVanityDomainsRequest interceptedRequest =
                ListVanityDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVanityDomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ListVanityDomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomain/ListVanityDomains");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVanityDomainsResponse>
                transformer =
                        ListVanityDomainsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListVanityDomainsRequest, ListVanityDomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVanityDomainsRequest, ListVanityDomainsResponse>,
                        java.util.concurrent.Future<ListVanityDomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVanityDomainsRequest, ListVanityDomainsResponse>(
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
                        "FusionApplications",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequestError/ListWorkRequestErrors");
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
                        "FusionApplications",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "FusionApplications",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RequestEmailSubdomainCsrResponse> requestEmailSubdomainCsr(
            RequestEmailSubdomainCsrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestEmailSubdomainCsrRequest, RequestEmailSubdomainCsrResponse>
                    handler) {
        LOG.trace("Called async requestEmailSubdomainCsr");
        final RequestEmailSubdomainCsrRequest interceptedRequest =
                RequestEmailSubdomainCsrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestEmailSubdomainCsrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "RequestEmailSubdomainCsr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/RequestEmailSubdomainCsr");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestEmailSubdomainCsrResponse>
                transformer =
                        RequestEmailSubdomainCsrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestEmailSubdomainCsrRequest, RequestEmailSubdomainCsrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestEmailSubdomainCsrRequest, RequestEmailSubdomainCsrResponse>,
                        java.util.concurrent.Future<RequestEmailSubdomainCsrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestEmailSubdomainCsrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestEmailSubdomainCsrRequest, RequestEmailSubdomainCsrResponse>(
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
    public java.util.concurrent.Future<ResetFusionEnvironmentPasswordResponse>
            resetFusionEnvironmentPassword(
                    ResetFusionEnvironmentPasswordRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ResetFusionEnvironmentPasswordRequest,
                                    ResetFusionEnvironmentPasswordResponse>
                            handler) {
        LOG.trace("Called async resetFusionEnvironmentPassword");
        final ResetFusionEnvironmentPasswordRequest interceptedRequest =
                ResetFusionEnvironmentPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetFusionEnvironmentPasswordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ResetFusionEnvironmentPassword",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/ResetFusionEnvironmentPassword");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ResetFusionEnvironmentPasswordResponse>
                transformer =
                        ResetFusionEnvironmentPasswordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ResetFusionEnvironmentPasswordRequest,
                        ResetFusionEnvironmentPasswordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetFusionEnvironmentPasswordRequest,
                                ResetFusionEnvironmentPasswordResponse>,
                        java.util.concurrent.Future<ResetFusionEnvironmentPasswordResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResetFusionEnvironmentPasswordDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetFusionEnvironmentPasswordRequest, ResetFusionEnvironmentPasswordResponse>(
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
    public java.util.concurrent.Future<SubmitVanityDomainValidationResponse>
            submitVanityDomainValidation(
                    SubmitVanityDomainValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SubmitVanityDomainValidationRequest,
                                    SubmitVanityDomainValidationResponse>
                            handler) {
        LOG.trace("Called async submitVanityDomainValidation");
        final SubmitVanityDomainValidationRequest interceptedRequest =
                SubmitVanityDomainValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SubmitVanityDomainValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "SubmitVanityDomainValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomain/SubmitVanityDomainValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SubmitVanityDomainValidationResponse>
                transformer =
                        SubmitVanityDomainValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SubmitVanityDomainValidationRequest, SubmitVanityDomainValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SubmitVanityDomainValidationRequest,
                                SubmitVanityDomainValidationResponse>,
                        java.util.concurrent.Future<SubmitVanityDomainValidationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SubmitVanityDomainValidationRequest, SubmitVanityDomainValidationResponse>(
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
    public java.util.concurrent.Future<UpdateEmailSubdomainResponse> updateEmailSubdomain(
            UpdateEmailSubdomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmailSubdomainRequest, UpdateEmailSubdomainResponse>
                    handler) {
        LOG.trace("Called async updateEmailSubdomain");
        final UpdateEmailSubdomainRequest interceptedRequest =
                UpdateEmailSubdomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEmailSubdomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateEmailSubdomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/UpdateEmailSubdomain");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateEmailSubdomainResponse>
                transformer =
                        UpdateEmailSubdomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateEmailSubdomainRequest, UpdateEmailSubdomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateEmailSubdomainRequest, UpdateEmailSubdomainResponse>,
                        java.util.concurrent.Future<UpdateEmailSubdomainResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateEmailSubdomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateEmailSubdomainRequest, UpdateEmailSubdomainResponse>(
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
    public java.util.concurrent.Future<UpdateFusionEnvironmentResponse> updateFusionEnvironment(
            UpdateFusionEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>
                    handler) {
        LOG.trace("Called async updateFusionEnvironment");
        final UpdateFusionEnvironmentRequest interceptedRequest =
                UpdateFusionEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFusionEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateFusionEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironment/UpdateFusionEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateFusionEnvironmentResponse>
                transformer =
                        UpdateFusionEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>,
                        java.util.concurrent.Future<UpdateFusionEnvironmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFusionEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFusionEnvironmentRequest, UpdateFusionEnvironmentResponse>(
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
    public java.util.concurrent.Future<UpdateFusionEnvironmentFamilyResponse>
            updateFusionEnvironmentFamily(
                    UpdateFusionEnvironmentFamilyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFusionEnvironmentFamilyRequest,
                                    UpdateFusionEnvironmentFamilyResponse>
                            handler) {
        LOG.trace("Called async updateFusionEnvironmentFamily");
        final UpdateFusionEnvironmentFamilyRequest interceptedRequest =
                UpdateFusionEnvironmentFamilyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFusionEnvironmentFamilyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateFusionEnvironmentFamily",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/FusionEnvironmentFamily/UpdateFusionEnvironmentFamily");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateFusionEnvironmentFamilyResponse>
                transformer =
                        UpdateFusionEnvironmentFamilyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFusionEnvironmentFamilyRequest, UpdateFusionEnvironmentFamilyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFusionEnvironmentFamilyRequest,
                                UpdateFusionEnvironmentFamilyResponse>,
                        java.util.concurrent.Future<UpdateFusionEnvironmentFamilyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFusionEnvironmentFamilyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFusionEnvironmentFamilyRequest, UpdateFusionEnvironmentFamilyResponse>(
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
    public java.util.concurrent.Future<UpdateMarketingBrandResponse> updateMarketingBrand(
            UpdateMarketingBrandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMarketingBrandRequest, UpdateMarketingBrandResponse>
                    handler) {
        LOG.trace("Called async updateMarketingBrand");
        final UpdateMarketingBrandRequest interceptedRequest =
                UpdateMarketingBrandConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMarketingBrandConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateMarketingBrand",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/MarketingBrand/UpdateMarketingBrand");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMarketingBrandResponse>
                transformer =
                        UpdateMarketingBrandConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMarketingBrandRequest, UpdateMarketingBrandResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMarketingBrandRequest, UpdateMarketingBrandResponse>,
                        java.util.concurrent.Future<UpdateMarketingBrandResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMarketingBrandDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMarketingBrandRequest, UpdateMarketingBrandResponse>(
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
    public java.util.concurrent.Future<UpdateMicrositeResponse> updateMicrosite(
            UpdateMicrositeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMicrositeRequest, UpdateMicrositeResponse>
                    handler) {
        LOG.trace("Called async updateMicrosite");
        final UpdateMicrositeRequest interceptedRequest =
                UpdateMicrositeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMicrositeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateMicrosite",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/UpdateMicrosite");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMicrositeResponse>
                transformer =
                        UpdateMicrositeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateMicrositeRequest, UpdateMicrositeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMicrositeRequest, UpdateMicrositeResponse>,
                        java.util.concurrent.Future<UpdateMicrositeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMicrositeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMicrositeRequest, UpdateMicrositeResponse>(
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
    public java.util.concurrent.Future<UpdateRefreshActivityResponse> updateRefreshActivity(
            UpdateRefreshActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRefreshActivityRequest, UpdateRefreshActivityResponse>
                    handler) {
        LOG.trace("Called async updateRefreshActivity");
        final UpdateRefreshActivityRequest interceptedRequest =
                UpdateRefreshActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRefreshActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateRefreshActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/UpdateRefreshActivityDetails/UpdateRefreshActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRefreshActivityResponse>
                transformer =
                        UpdateRefreshActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateRefreshActivityRequest, UpdateRefreshActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRefreshActivityRequest, UpdateRefreshActivityResponse>,
                        java.util.concurrent.Future<UpdateRefreshActivityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRefreshActivityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRefreshActivityRequest, UpdateRefreshActivityResponse>(
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
    public java.util.concurrent.Future<UpdateVanityDomainResponse> updateVanityDomain(
            UpdateVanityDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVanityDomainRequest, UpdateVanityDomainResponse>
                    handler) {
        LOG.trace("Called async updateVanityDomain");
        final UpdateVanityDomainRequest interceptedRequest =
                UpdateVanityDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVanityDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateVanityDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomain/UpdateVanityDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVanityDomainResponse>
                transformer =
                        UpdateVanityDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateVanityDomainRequest, UpdateVanityDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVanityDomainRequest, UpdateVanityDomainResponse>,
                        java.util.concurrent.Future<UpdateVanityDomainResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVanityDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVanityDomainRequest, UpdateVanityDomainResponse>(
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
    public java.util.concurrent.Future<UpdateVanityDomainActivityResponse>
            updateVanityDomainActivity(
                    UpdateVanityDomainActivityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVanityDomainActivityRequest,
                                    UpdateVanityDomainActivityResponse>
                            handler) {
        LOG.trace("Called async updateVanityDomainActivity");
        final UpdateVanityDomainActivityRequest interceptedRequest =
                UpdateVanityDomainActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVanityDomainActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UpdateVanityDomainActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomainActivity/UpdateVanityDomainActivity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateVanityDomainActivityResponse>
                transformer =
                        UpdateVanityDomainActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVanityDomainActivityRequest, UpdateVanityDomainActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVanityDomainActivityRequest,
                                UpdateVanityDomainActivityResponse>,
                        java.util.concurrent.Future<UpdateVanityDomainActivityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVanityDomainActivityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVanityDomainActivityRequest, UpdateVanityDomainActivityResponse>(
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
    public java.util.concurrent.Future<UploadEmailSubdomainCertificateResponse>
            uploadEmailSubdomainCertificate(
                    UploadEmailSubdomainCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadEmailSubdomainCertificateRequest,
                                    UploadEmailSubdomainCertificateResponse>
                            handler) {
        LOG.trace("Called async uploadEmailSubdomainCertificate");
        final UploadEmailSubdomainCertificateRequest interceptedRequest =
                UploadEmailSubdomainCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadEmailSubdomainCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UploadEmailSubdomainCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/UploadEmailSubdomainCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UploadEmailSubdomainCertificateResponse>
                transformer =
                        UploadEmailSubdomainCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadEmailSubdomainCertificateRequest,
                        UploadEmailSubdomainCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadEmailSubdomainCertificateRequest,
                                UploadEmailSubdomainCertificateResponse>,
                        java.util.concurrent.Future<UploadEmailSubdomainCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadEmailSubdomainCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadEmailSubdomainCertificateRequest,
                    UploadEmailSubdomainCertificateResponse>(
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
    public java.util.concurrent.Future<UploadVanityDomainCertificateResponse>
            uploadVanityDomainCertificate(
                    UploadVanityDomainCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadVanityDomainCertificateRequest,
                                    UploadVanityDomainCertificateResponse>
                            handler) {
        LOG.trace("Called async uploadVanityDomainCertificate");
        final UploadVanityDomainCertificateRequest interceptedRequest =
                UploadVanityDomainCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadVanityDomainCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "UploadVanityDomainCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/VanityDomain/UploadVanityDomainCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UploadVanityDomainCertificateResponse>
                transformer =
                        UploadVanityDomainCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadVanityDomainCertificateRequest, UploadVanityDomainCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadVanityDomainCertificateRequest,
                                UploadVanityDomainCertificateResponse>,
                        java.util.concurrent.Future<UploadVanityDomainCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadVanityDomainCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadVanityDomainCertificateRequest, UploadVanityDomainCertificateResponse>(
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
    public java.util.concurrent.Future<ValidateAndConfigureEmailSubdomainCertificateResponse>
            validateAndConfigureEmailSubdomainCertificate(
                    ValidateAndConfigureEmailSubdomainCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAndConfigureEmailSubdomainCertificateRequest,
                                    ValidateAndConfigureEmailSubdomainCertificateResponse>
                            handler) {
        LOG.trace("Called async validateAndConfigureEmailSubdomainCertificate");
        final ValidateAndConfigureEmailSubdomainCertificateRequest interceptedRequest =
                ValidateAndConfigureEmailSubdomainCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAndConfigureEmailSubdomainCertificateConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ValidateAndConfigureEmailSubdomainCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/ValidateAndConfigureEmailSubdomainCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ValidateAndConfigureEmailSubdomainCertificateResponse>
                transformer =
                        ValidateAndConfigureEmailSubdomainCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateAndConfigureEmailSubdomainCertificateRequest,
                        ValidateAndConfigureEmailSubdomainCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateAndConfigureEmailSubdomainCertificateRequest,
                                ValidateAndConfigureEmailSubdomainCertificateResponse>,
                        java.util.concurrent.Future<
                                ValidateAndConfigureEmailSubdomainCertificateResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateAndConfigureEmailSubdomainCertificateRequest,
                    ValidateAndConfigureEmailSubdomainCertificateResponse>(
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
    public java.util.concurrent.Future<ValidateAndConfigureEmailSubdomainDnsResponse>
            validateAndConfigureEmailSubdomainDns(
                    ValidateAndConfigureEmailSubdomainDnsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAndConfigureEmailSubdomainDnsRequest,
                                    ValidateAndConfigureEmailSubdomainDnsResponse>
                            handler) {
        LOG.trace("Called async validateAndConfigureEmailSubdomainDns");
        final ValidateAndConfigureEmailSubdomainDnsRequest interceptedRequest =
                ValidateAndConfigureEmailSubdomainDnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAndConfigureEmailSubdomainDnsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ValidateAndConfigureEmailSubdomainDns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/EmailSubdomain/ValidateAndConfigureEmailSubdomainDns");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateAndConfigureEmailSubdomainDnsResponse>
                transformer =
                        ValidateAndConfigureEmailSubdomainDnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateAndConfigureEmailSubdomainDnsRequest,
                        ValidateAndConfigureEmailSubdomainDnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateAndConfigureEmailSubdomainDnsRequest,
                                ValidateAndConfigureEmailSubdomainDnsResponse>,
                        java.util.concurrent.Future<ValidateAndConfigureEmailSubdomainDnsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateAndConfigureEmailSubdomainDnsRequest,
                    ValidateAndConfigureEmailSubdomainDnsResponse>(
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
    public java.util.concurrent.Future<ValidateAndConfigureMicrositeDnsResponse>
            validateAndConfigureMicrositeDns(
                    ValidateAndConfigureMicrositeDnsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAndConfigureMicrositeDnsRequest,
                                    ValidateAndConfigureMicrositeDnsResponse>
                            handler) {
        LOG.trace("Called async validateAndConfigureMicrositeDns");
        final ValidateAndConfigureMicrositeDnsRequest interceptedRequest =
                ValidateAndConfigureMicrositeDnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAndConfigureMicrositeDnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "ValidateAndConfigureMicrositeDns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/Microsite/ValidateAndConfigureMicrositeDns");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateAndConfigureMicrositeDnsResponse>
                transformer =
                        ValidateAndConfigureMicrositeDnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateAndConfigureMicrositeDnsRequest,
                        ValidateAndConfigureMicrositeDnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateAndConfigureMicrositeDnsRequest,
                                ValidateAndConfigureMicrositeDnsResponse>,
                        java.util.concurrent.Future<ValidateAndConfigureMicrositeDnsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateAndConfigureMicrositeDnsRequest,
                    ValidateAndConfigureMicrositeDnsResponse>(
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
    public java.util.concurrent.Future<VerifyServiceAttachmentResponse> verifyServiceAttachment(
            VerifyServiceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            VerifyServiceAttachmentRequest, VerifyServiceAttachmentResponse>
                    handler) {
        LOG.trace("Called async verifyServiceAttachment");
        final VerifyServiceAttachmentRequest interceptedRequest =
                VerifyServiceAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                VerifyServiceAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FusionApplications",
                        "VerifyServiceAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fusion-applications/20211201/ServiceAttachment/VerifyServiceAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, VerifyServiceAttachmentResponse>
                transformer =
                        VerifyServiceAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        VerifyServiceAttachmentRequest, VerifyServiceAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                VerifyServiceAttachmentRequest, VerifyServiceAttachmentResponse>,
                        java.util.concurrent.Future<VerifyServiceAttachmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getVerifyServiceAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    VerifyServiceAttachmentRequest, VerifyServiceAttachmentResponse>(
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
