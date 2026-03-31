/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot;

import com.oracle.bmc.iot.internal.http.*;
import com.oracle.bmc.iot.requests.*;
import com.oracle.bmc.iot.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for Iot service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class IotAsyncClient implements IotAsync {
    /**
     * Service instance for Iot.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(IotClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iot.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IotAsyncClient.class);

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
    public IotAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IotAsyncClient(
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
    public IotAsyncClient(
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
    public IotAsyncClient(
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
    public IotAsyncClient(
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
    public IotAsyncClient(
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
    public IotAsyncClient(
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
    public IotAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IotAsyncClient> {
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
        public IotAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new IotAsyncClient(
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
    public java.util.concurrent.Future<ChangeIotDomainCompartmentResponse>
            changeIotDomainCompartment(
                    ChangeIotDomainCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainCompartmentRequest,
                                    ChangeIotDomainCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeIotDomainCompartment");
        final ChangeIotDomainCompartmentRequest interceptedRequest =
                ChangeIotDomainCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIotDomainCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ChangeIotDomainCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ChangeIotDomainCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeIotDomainCompartmentResponse>
                transformer =
                        ChangeIotDomainCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIotDomainCompartmentRequest, ChangeIotDomainCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIotDomainCompartmentRequest,
                                ChangeIotDomainCompartmentResponse>,
                        java.util.concurrent.Future<ChangeIotDomainCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeIotDomainCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIotDomainCompartmentRequest, ChangeIotDomainCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeIotDomainDataRetentionPeriodResponse>
            changeIotDomainDataRetentionPeriod(
                    ChangeIotDomainDataRetentionPeriodRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainDataRetentionPeriodRequest,
                                    ChangeIotDomainDataRetentionPeriodResponse>
                            handler) {
        LOG.trace("Called async changeIotDomainDataRetentionPeriod");
        final ChangeIotDomainDataRetentionPeriodRequest interceptedRequest =
                ChangeIotDomainDataRetentionPeriodConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIotDomainDataRetentionPeriodConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ChangeIotDomainDataRetentionPeriod",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ChangeIotDomainDataRetentionPeriod");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeIotDomainDataRetentionPeriodResponse>
                transformer =
                        ChangeIotDomainDataRetentionPeriodConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIotDomainDataRetentionPeriodRequest,
                        ChangeIotDomainDataRetentionPeriodResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIotDomainDataRetentionPeriodRequest,
                                ChangeIotDomainDataRetentionPeriodResponse>,
                        java.util.concurrent.Future<ChangeIotDomainDataRetentionPeriodResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeIotDomainDataRetentionPeriodDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIotDomainDataRetentionPeriodRequest,
                    ChangeIotDomainDataRetentionPeriodResponse>(
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
    public java.util.concurrent.Future<ChangeIotDomainGroupCompartmentResponse>
            changeIotDomainGroupCompartment(
                    ChangeIotDomainGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainGroupCompartmentRequest,
                                    ChangeIotDomainGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeIotDomainGroupCompartment");
        final ChangeIotDomainGroupCompartmentRequest interceptedRequest =
                ChangeIotDomainGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIotDomainGroupCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ChangeIotDomainGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ChangeIotDomainGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeIotDomainGroupCompartmentResponse>
                transformer =
                        ChangeIotDomainGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIotDomainGroupCompartmentRequest,
                        ChangeIotDomainGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIotDomainGroupCompartmentRequest,
                                ChangeIotDomainGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeIotDomainGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeIotDomainGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIotDomainGroupCompartmentRequest,
                    ChangeIotDomainGroupCompartmentResponse>(
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
    public java.util.concurrent.Future<ConfigureIotDomainDataAccessResponse>
            configureIotDomainDataAccess(
                    ConfigureIotDomainDataAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureIotDomainDataAccessRequest,
                                    ConfigureIotDomainDataAccessResponse>
                            handler) {
        LOG.trace("Called async configureIotDomainDataAccess");
        final ConfigureIotDomainDataAccessRequest interceptedRequest =
                ConfigureIotDomainDataAccessConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureIotDomainDataAccessConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ConfigureIotDomainDataAccess",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ConfigureIotDomainDataAccess");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureIotDomainDataAccessResponse>
                transformer =
                        ConfigureIotDomainDataAccessConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureIotDomainDataAccessRequest, ConfigureIotDomainDataAccessResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureIotDomainDataAccessRequest,
                                ConfigureIotDomainDataAccessResponse>,
                        java.util.concurrent.Future<ConfigureIotDomainDataAccessResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureIotDomainDataAccessDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureIotDomainDataAccessRequest, ConfigureIotDomainDataAccessResponse>(
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
    public java.util.concurrent.Future<ConfigureIotDomainGroupDataAccessResponse>
            configureIotDomainGroupDataAccess(
                    ConfigureIotDomainGroupDataAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureIotDomainGroupDataAccessRequest,
                                    ConfigureIotDomainGroupDataAccessResponse>
                            handler) {
        LOG.trace("Called async configureIotDomainGroupDataAccess");
        final ConfigureIotDomainGroupDataAccessRequest interceptedRequest =
                ConfigureIotDomainGroupDataAccessConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureIotDomainGroupDataAccessConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ConfigureIotDomainGroupDataAccess",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ConfigureIotDomainGroupDataAccess");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureIotDomainGroupDataAccessResponse>
                transformer =
                        ConfigureIotDomainGroupDataAccessConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureIotDomainGroupDataAccessRequest,
                        ConfigureIotDomainGroupDataAccessResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureIotDomainGroupDataAccessRequest,
                                ConfigureIotDomainGroupDataAccessResponse>,
                        java.util.concurrent.Future<ConfigureIotDomainGroupDataAccessResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureIotDomainGroupDataAccessDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureIotDomainGroupDataAccessRequest,
                    ConfigureIotDomainGroupDataAccessResponse>(
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
    public java.util.concurrent.Future<CreateDigitalTwinAdapterResponse> createDigitalTwinAdapter(
            CreateDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>
                    handler) {
        LOG.trace("Called async createDigitalTwinAdapter");
        final CreateDigitalTwinAdapterRequest interceptedRequest =
                CreateDigitalTwinAdapterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDigitalTwinAdapterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateDigitalTwinAdapter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/CreateDigitalTwinAdapter");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDigitalTwinAdapterResponse>
                transformer =
                        CreateDigitalTwinAdapterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>,
                        java.util.concurrent.Future<CreateDigitalTwinAdapterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDigitalTwinAdapterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>(
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
    public java.util.concurrent.Future<CreateDigitalTwinInstanceResponse> createDigitalTwinInstance(
            CreateDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinInstanceRequest, CreateDigitalTwinInstanceResponse>
                    handler) {
        LOG.trace("Called async createDigitalTwinInstance");
        final CreateDigitalTwinInstanceRequest interceptedRequest =
                CreateDigitalTwinInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDigitalTwinInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateDigitalTwinInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/CreateDigitalTwinInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDigitalTwinInstanceResponse>
                transformer =
                        CreateDigitalTwinInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDigitalTwinInstanceRequest, CreateDigitalTwinInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDigitalTwinInstanceRequest,
                                CreateDigitalTwinInstanceResponse>,
                        java.util.concurrent.Future<CreateDigitalTwinInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDigitalTwinInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDigitalTwinInstanceRequest, CreateDigitalTwinInstanceResponse>(
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
    public java.util.concurrent.Future<CreateDigitalTwinModelResponse> createDigitalTwinModel(
            CreateDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>
                    handler) {
        LOG.trace("Called async createDigitalTwinModel");
        final CreateDigitalTwinModelRequest interceptedRequest =
                CreateDigitalTwinModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDigitalTwinModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateDigitalTwinModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/CreateDigitalTwinModel");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDigitalTwinModelResponse>
                transformer =
                        CreateDigitalTwinModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>,
                        java.util.concurrent.Future<CreateDigitalTwinModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDigitalTwinModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>(
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
    public java.util.concurrent.Future<CreateDigitalTwinRelationshipResponse>
            createDigitalTwinRelationship(
                    CreateDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDigitalTwinRelationshipRequest,
                                    CreateDigitalTwinRelationshipResponse>
                            handler) {
        LOG.trace("Called async createDigitalTwinRelationship");
        final CreateDigitalTwinRelationshipRequest interceptedRequest =
                CreateDigitalTwinRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDigitalTwinRelationshipConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateDigitalTwinRelationship",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/CreateDigitalTwinRelationship");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDigitalTwinRelationshipResponse>
                transformer =
                        CreateDigitalTwinRelationshipConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDigitalTwinRelationshipRequest, CreateDigitalTwinRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDigitalTwinRelationshipRequest,
                                CreateDigitalTwinRelationshipResponse>,
                        java.util.concurrent.Future<CreateDigitalTwinRelationshipResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDigitalTwinRelationshipDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDigitalTwinRelationshipRequest, CreateDigitalTwinRelationshipResponse>(
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
    public java.util.concurrent.Future<CreateIotDomainResponse> createIotDomain(
            CreateIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIotDomainRequest, CreateIotDomainResponse>
                    handler) {
        LOG.trace("Called async createIotDomain");
        final CreateIotDomainRequest interceptedRequest =
                CreateIotDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIotDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateIotDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/CreateIotDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIotDomainResponse>
                transformer =
                        CreateIotDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateIotDomainRequest, CreateIotDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIotDomainRequest, CreateIotDomainResponse>,
                        java.util.concurrent.Future<CreateIotDomainResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIotDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIotDomainRequest, CreateIotDomainResponse>(
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
    public java.util.concurrent.Future<CreateIotDomainGroupResponse> createIotDomainGroup(
            CreateIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>
                    handler) {
        LOG.trace("Called async createIotDomainGroup");
        final CreateIotDomainGroupRequest interceptedRequest =
                CreateIotDomainGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIotDomainGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "CreateIotDomainGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/CreateIotDomainGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIotDomainGroupResponse>
                transformer =
                        CreateIotDomainGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>,
                        java.util.concurrent.Future<CreateIotDomainGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIotDomainGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>(
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
    public java.util.concurrent.Future<DeleteDigitalTwinAdapterResponse> deleteDigitalTwinAdapter(
            DeleteDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>
                    handler) {
        LOG.trace("Called async deleteDigitalTwinAdapter");
        final DeleteDigitalTwinAdapterRequest interceptedRequest =
                DeleteDigitalTwinAdapterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDigitalTwinAdapterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteDigitalTwinAdapter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/DeleteDigitalTwinAdapter");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDigitalTwinAdapterResponse>
                transformer =
                        DeleteDigitalTwinAdapterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>,
                        java.util.concurrent.Future<DeleteDigitalTwinAdapterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>(
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
    public java.util.concurrent.Future<DeleteDigitalTwinInstanceResponse> deleteDigitalTwinInstance(
            DeleteDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinInstanceRequest, DeleteDigitalTwinInstanceResponse>
                    handler) {
        LOG.trace("Called async deleteDigitalTwinInstance");
        final DeleteDigitalTwinInstanceRequest interceptedRequest =
                DeleteDigitalTwinInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDigitalTwinInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteDigitalTwinInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/DeleteDigitalTwinInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDigitalTwinInstanceResponse>
                transformer =
                        DeleteDigitalTwinInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDigitalTwinInstanceRequest, DeleteDigitalTwinInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDigitalTwinInstanceRequest,
                                DeleteDigitalTwinInstanceResponse>,
                        java.util.concurrent.Future<DeleteDigitalTwinInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDigitalTwinInstanceRequest, DeleteDigitalTwinInstanceResponse>(
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
    public java.util.concurrent.Future<DeleteDigitalTwinModelResponse> deleteDigitalTwinModel(
            DeleteDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>
                    handler) {
        LOG.trace("Called async deleteDigitalTwinModel");
        final DeleteDigitalTwinModelRequest interceptedRequest =
                DeleteDigitalTwinModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDigitalTwinModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteDigitalTwinModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/DeleteDigitalTwinModel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDigitalTwinModelResponse>
                transformer =
                        DeleteDigitalTwinModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>,
                        java.util.concurrent.Future<DeleteDigitalTwinModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>(
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
    public java.util.concurrent.Future<DeleteDigitalTwinRelationshipResponse>
            deleteDigitalTwinRelationship(
                    DeleteDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDigitalTwinRelationshipRequest,
                                    DeleteDigitalTwinRelationshipResponse>
                            handler) {
        LOG.trace("Called async deleteDigitalTwinRelationship");
        final DeleteDigitalTwinRelationshipRequest interceptedRequest =
                DeleteDigitalTwinRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDigitalTwinRelationshipConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteDigitalTwinRelationship",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/DeleteDigitalTwinRelationship");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDigitalTwinRelationshipResponse>
                transformer =
                        DeleteDigitalTwinRelationshipConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDigitalTwinRelationshipRequest, DeleteDigitalTwinRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDigitalTwinRelationshipRequest,
                                DeleteDigitalTwinRelationshipResponse>,
                        java.util.concurrent.Future<DeleteDigitalTwinRelationshipResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDigitalTwinRelationshipRequest, DeleteDigitalTwinRelationshipResponse>(
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
    public java.util.concurrent.Future<DeleteIotDomainResponse> deleteIotDomain(
            DeleteIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIotDomainRequest, DeleteIotDomainResponse>
                    handler) {
        LOG.trace("Called async deleteIotDomain");
        final DeleteIotDomainRequest interceptedRequest =
                DeleteIotDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIotDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteIotDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/DeleteIotDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIotDomainResponse>
                transformer =
                        DeleteIotDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteIotDomainRequest, DeleteIotDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIotDomainRequest, DeleteIotDomainResponse>,
                        java.util.concurrent.Future<DeleteIotDomainResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIotDomainRequest, DeleteIotDomainResponse>(
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
    public java.util.concurrent.Future<DeleteIotDomainGroupResponse> deleteIotDomainGroup(
            DeleteIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>
                    handler) {
        LOG.trace("Called async deleteIotDomainGroup");
        final DeleteIotDomainGroupRequest interceptedRequest =
                DeleteIotDomainGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIotDomainGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "DeleteIotDomainGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/DeleteIotDomainGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIotDomainGroupResponse>
                transformer =
                        DeleteIotDomainGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>,
                        java.util.concurrent.Future<DeleteIotDomainGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinAdapterResponse> getDigitalTwinAdapter(
            GetDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>
                    handler) {
        LOG.trace("Called async getDigitalTwinAdapter");
        final GetDigitalTwinAdapterRequest interceptedRequest =
                GetDigitalTwinAdapterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinAdapterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinAdapter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/GetDigitalTwinAdapter");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDigitalTwinAdapterResponse>
                transformer =
                        GetDigitalTwinAdapterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>,
                        java.util.concurrent.Future<GetDigitalTwinAdapterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinInstanceResponse> getDigitalTwinInstance(
            GetDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>
                    handler) {
        LOG.trace("Called async getDigitalTwinInstance");
        final GetDigitalTwinInstanceRequest interceptedRequest =
                GetDigitalTwinInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/GetDigitalTwinInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDigitalTwinInstanceResponse>
                transformer =
                        GetDigitalTwinInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>,
                        java.util.concurrent.Future<GetDigitalTwinInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinInstanceContentResponse>
            getDigitalTwinInstanceContent(
                    GetDigitalTwinInstanceContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalTwinInstanceContentRequest,
                                    GetDigitalTwinInstanceContentResponse>
                            handler) {
        LOG.trace("Called async getDigitalTwinInstanceContent");
        final GetDigitalTwinInstanceContentRequest interceptedRequest =
                GetDigitalTwinInstanceContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinInstanceContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinInstanceContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/GetDigitalTwinInstanceContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDigitalTwinInstanceContentResponse>
                transformer =
                        GetDigitalTwinInstanceContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinInstanceContentRequest, GetDigitalTwinInstanceContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinInstanceContentRequest,
                                GetDigitalTwinInstanceContentResponse>,
                        java.util.concurrent.Future<GetDigitalTwinInstanceContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinInstanceContentRequest, GetDigitalTwinInstanceContentResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinModelResponse> getDigitalTwinModel(
            GetDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>
                    handler) {
        LOG.trace("Called async getDigitalTwinModel");
        final GetDigitalTwinModelRequest interceptedRequest =
                GetDigitalTwinModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/GetDigitalTwinModel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDigitalTwinModelResponse>
                transformer =
                        GetDigitalTwinModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>,
                        java.util.concurrent.Future<GetDigitalTwinModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinModelSpecResponse> getDigitalTwinModelSpec(
            GetDigitalTwinModelSpecRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>
                    handler) {
        LOG.trace("Called async getDigitalTwinModelSpec");
        final GetDigitalTwinModelSpecRequest interceptedRequest =
                GetDigitalTwinModelSpecConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinModelSpecConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinModelSpec",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/GetDigitalTwinModelSpec");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDigitalTwinModelSpecResponse>
                transformer =
                        GetDigitalTwinModelSpecConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>,
                        java.util.concurrent.Future<GetDigitalTwinModelSpecResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>(
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
    public java.util.concurrent.Future<GetDigitalTwinRelationshipResponse>
            getDigitalTwinRelationship(
                    GetDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalTwinRelationshipRequest,
                                    GetDigitalTwinRelationshipResponse>
                            handler) {
        LOG.trace("Called async getDigitalTwinRelationship");
        final GetDigitalTwinRelationshipRequest interceptedRequest =
                GetDigitalTwinRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalTwinRelationshipConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetDigitalTwinRelationship",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/GetDigitalTwinRelationship");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDigitalTwinRelationshipResponse>
                transformer =
                        GetDigitalTwinRelationshipConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalTwinRelationshipRequest, GetDigitalTwinRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalTwinRelationshipRequest,
                                GetDigitalTwinRelationshipResponse>,
                        java.util.concurrent.Future<GetDigitalTwinRelationshipResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalTwinRelationshipRequest, GetDigitalTwinRelationshipResponse>(
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
    public java.util.concurrent.Future<GetIotDomainResponse> getIotDomain(
            GetIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIotDomainRequest, GetIotDomainResponse>
                    handler) {
        LOG.trace("Called async getIotDomain");
        final GetIotDomainRequest interceptedRequest =
                GetIotDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIotDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetIotDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/GetIotDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIotDomainResponse>
                transformer =
                        GetIotDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIotDomainRequest, GetIotDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIotDomainRequest, GetIotDomainResponse>,
                        java.util.concurrent.Future<GetIotDomainResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIotDomainRequest, GetIotDomainResponse>(
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
    public java.util.concurrent.Future<GetIotDomainGroupResponse> getIotDomainGroup(
            GetIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIotDomainGroupRequest, GetIotDomainGroupResponse>
                    handler) {
        LOG.trace("Called async getIotDomainGroup");
        final GetIotDomainGroupRequest interceptedRequest =
                GetIotDomainGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIotDomainGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "GetIotDomainGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/GetIotDomainGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIotDomainGroupResponse>
                transformer =
                        GetIotDomainGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIotDomainGroupRequest, GetIotDomainGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIotDomainGroupRequest, GetIotDomainGroupResponse>,
                        java.util.concurrent.Future<GetIotDomainGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIotDomainGroupRequest, GetIotDomainGroupResponse>(
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
                        "Iot",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<InvokeRawCommandResponse> invokeRawCommand(
            InvokeRawCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InvokeRawCommandRequest, InvokeRawCommandResponse>
                    handler) {
        LOG.trace("Called async invokeRawCommand");
        final InvokeRawCommandRequest interceptedRequest =
                InvokeRawCommandConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InvokeRawCommandConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "InvokeRawCommand",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/InvokeRawCommand");
        final java.util.function.Function<javax.ws.rs.core.Response, InvokeRawCommandResponse>
                transformer =
                        InvokeRawCommandConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<InvokeRawCommandRequest, InvokeRawCommandResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InvokeRawCommandRequest, InvokeRawCommandResponse>,
                        java.util.concurrent.Future<InvokeRawCommandResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInvokeRawCommandDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InvokeRawCommandRequest, InvokeRawCommandResponse>(
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
    public java.util.concurrent.Future<ListDigitalTwinAdaptersResponse> listDigitalTwinAdapters(
            ListDigitalTwinAdaptersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>
                    handler) {
        LOG.trace("Called async listDigitalTwinAdapters");
        final ListDigitalTwinAdaptersRequest interceptedRequest =
                ListDigitalTwinAdaptersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalTwinAdaptersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListDigitalTwinAdapters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/ListDigitalTwinAdapters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDigitalTwinAdaptersResponse>
                transformer =
                        ListDigitalTwinAdaptersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>,
                        java.util.concurrent.Future<ListDigitalTwinAdaptersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>(
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
    public java.util.concurrent.Future<ListDigitalTwinInstancesResponse> listDigitalTwinInstances(
            ListDigitalTwinInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>
                    handler) {
        LOG.trace("Called async listDigitalTwinInstances");
        final ListDigitalTwinInstancesRequest interceptedRequest =
                ListDigitalTwinInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalTwinInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListDigitalTwinInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/ListDigitalTwinInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDigitalTwinInstancesResponse>
                transformer =
                        ListDigitalTwinInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>,
                        java.util.concurrent.Future<ListDigitalTwinInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>(
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
    public java.util.concurrent.Future<ListDigitalTwinModelsResponse> listDigitalTwinModels(
            ListDigitalTwinModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>
                    handler) {
        LOG.trace("Called async listDigitalTwinModels");
        final ListDigitalTwinModelsRequest interceptedRequest =
                ListDigitalTwinModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalTwinModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListDigitalTwinModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/ListDigitalTwinModels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDigitalTwinModelsResponse>
                transformer =
                        ListDigitalTwinModelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>,
                        java.util.concurrent.Future<ListDigitalTwinModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>(
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
    public java.util.concurrent.Future<ListDigitalTwinRelationshipsResponse>
            listDigitalTwinRelationships(
                    ListDigitalTwinRelationshipsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDigitalTwinRelationshipsRequest,
                                    ListDigitalTwinRelationshipsResponse>
                            handler) {
        LOG.trace("Called async listDigitalTwinRelationships");
        final ListDigitalTwinRelationshipsRequest interceptedRequest =
                ListDigitalTwinRelationshipsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalTwinRelationshipsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListDigitalTwinRelationships",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/ListDigitalTwinRelationships");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDigitalTwinRelationshipsResponse>
                transformer =
                        ListDigitalTwinRelationshipsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalTwinRelationshipsRequest, ListDigitalTwinRelationshipsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalTwinRelationshipsRequest,
                                ListDigitalTwinRelationshipsResponse>,
                        java.util.concurrent.Future<ListDigitalTwinRelationshipsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalTwinRelationshipsRequest, ListDigitalTwinRelationshipsResponse>(
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
    public java.util.concurrent.Future<ListIotDomainGroupsResponse> listIotDomainGroups(
            ListIotDomainGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>
                    handler) {
        LOG.trace("Called async listIotDomainGroups");
        final ListIotDomainGroupsRequest interceptedRequest =
                ListIotDomainGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIotDomainGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListIotDomainGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ListIotDomainGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIotDomainGroupsResponse>
                transformer =
                        ListIotDomainGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>,
                        java.util.concurrent.Future<ListIotDomainGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>(
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
    public java.util.concurrent.Future<ListIotDomainsResponse> listIotDomains(
            ListIotDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIotDomainsRequest, ListIotDomainsResponse>
                    handler) {
        LOG.trace("Called async listIotDomains");
        final ListIotDomainsRequest interceptedRequest =
                ListIotDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIotDomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "ListIotDomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ListIotDomains");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIotDomainsResponse>
                transformer =
                        ListIotDomainsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListIotDomainsRequest, ListIotDomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIotDomainsRequest, ListIotDomainsResponse>,
                        java.util.concurrent.Future<ListIotDomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIotDomainsRequest, ListIotDomainsResponse>(
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
                        "Iot",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequestErrors");
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
                        "Iot",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequestLogs");
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
                        "Iot",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<UpdateDigitalTwinAdapterResponse> updateDigitalTwinAdapter(
            UpdateDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>
                    handler) {
        LOG.trace("Called async updateDigitalTwinAdapter");
        final UpdateDigitalTwinAdapterRequest interceptedRequest =
                UpdateDigitalTwinAdapterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalTwinAdapterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateDigitalTwinAdapter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/UpdateDigitalTwinAdapter");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDigitalTwinAdapterResponse>
                transformer =
                        UpdateDigitalTwinAdapterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>,
                        java.util.concurrent.Future<UpdateDigitalTwinAdapterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalTwinAdapterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>(
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
    public java.util.concurrent.Future<UpdateDigitalTwinInstanceResponse> updateDigitalTwinInstance(
            UpdateDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinInstanceRequest, UpdateDigitalTwinInstanceResponse>
                    handler) {
        LOG.trace("Called async updateDigitalTwinInstance");
        final UpdateDigitalTwinInstanceRequest interceptedRequest =
                UpdateDigitalTwinInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalTwinInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateDigitalTwinInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/UpdateDigitalTwinInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDigitalTwinInstanceResponse>
                transformer =
                        UpdateDigitalTwinInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalTwinInstanceRequest, UpdateDigitalTwinInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalTwinInstanceRequest,
                                UpdateDigitalTwinInstanceResponse>,
                        java.util.concurrent.Future<UpdateDigitalTwinInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalTwinInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalTwinInstanceRequest, UpdateDigitalTwinInstanceResponse>(
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
    public java.util.concurrent.Future<UpdateDigitalTwinModelResponse> updateDigitalTwinModel(
            UpdateDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>
                    handler) {
        LOG.trace("Called async updateDigitalTwinModel");
        final UpdateDigitalTwinModelRequest interceptedRequest =
                UpdateDigitalTwinModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalTwinModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateDigitalTwinModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/UpdateDigitalTwinModel");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDigitalTwinModelResponse>
                transformer =
                        UpdateDigitalTwinModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>,
                        java.util.concurrent.Future<UpdateDigitalTwinModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalTwinModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>(
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
    public java.util.concurrent.Future<UpdateDigitalTwinRelationshipResponse>
            updateDigitalTwinRelationship(
                    UpdateDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalTwinRelationshipRequest,
                                    UpdateDigitalTwinRelationshipResponse>
                            handler) {
        LOG.trace("Called async updateDigitalTwinRelationship");
        final UpdateDigitalTwinRelationshipRequest interceptedRequest =
                UpdateDigitalTwinRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalTwinRelationshipConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateDigitalTwinRelationship",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/UpdateDigitalTwinRelationship");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDigitalTwinRelationshipResponse>
                transformer =
                        UpdateDigitalTwinRelationshipConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalTwinRelationshipRequest, UpdateDigitalTwinRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalTwinRelationshipRequest,
                                UpdateDigitalTwinRelationshipResponse>,
                        java.util.concurrent.Future<UpdateDigitalTwinRelationshipResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalTwinRelationshipDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalTwinRelationshipRequest, UpdateDigitalTwinRelationshipResponse>(
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
    public java.util.concurrent.Future<UpdateIotDomainResponse> updateIotDomain(
            UpdateIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIotDomainRequest, UpdateIotDomainResponse>
                    handler) {
        LOG.trace("Called async updateIotDomain");
        final UpdateIotDomainRequest interceptedRequest =
                UpdateIotDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIotDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateIotDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/UpdateIotDomain");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateIotDomainResponse>
                transformer =
                        UpdateIotDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateIotDomainRequest, UpdateIotDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIotDomainRequest, UpdateIotDomainResponse>,
                        java.util.concurrent.Future<UpdateIotDomainResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIotDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIotDomainRequest, UpdateIotDomainResponse>(
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
    public java.util.concurrent.Future<UpdateIotDomainGroupResponse> updateIotDomainGroup(
            UpdateIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>
                    handler) {
        LOG.trace("Called async updateIotDomainGroup");
        final UpdateIotDomainGroupRequest interceptedRequest =
                UpdateIotDomainGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIotDomainGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Iot",
                        "UpdateIotDomainGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/UpdateIotDomainGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateIotDomainGroupResponse>
                transformer =
                        UpdateIotDomainGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>,
                        java.util.concurrent.Future<UpdateIotDomainGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIotDomainGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>(
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
