/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for Compute service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputeAsyncClient implements ComputeAsync {
    /**
     * Service instance for Compute.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTE")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeAsyncClient.class);

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
    public ComputeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputeAsyncClient> {
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
        public ComputeAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ComputeAsyncClient(
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
    public java.util.concurrent.Future<AcceptShieldedIntegrityPolicyResponse>
            acceptShieldedIntegrityPolicy(
                    AcceptShieldedIntegrityPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AcceptShieldedIntegrityPolicyRequest,
                                    AcceptShieldedIntegrityPolicyResponse>
                            handler) {
        LOG.trace("Called async acceptShieldedIntegrityPolicy");
        final AcceptShieldedIntegrityPolicyRequest interceptedRequest =
                AcceptShieldedIntegrityPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AcceptShieldedIntegrityPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "AcceptShieldedIntegrityPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/AcceptShieldedIntegrityPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AcceptShieldedIntegrityPolicyResponse>
                transformer =
                        AcceptShieldedIntegrityPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AcceptShieldedIntegrityPolicyRequest, AcceptShieldedIntegrityPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AcceptShieldedIntegrityPolicyRequest,
                                AcceptShieldedIntegrityPolicyResponse>,
                        java.util.concurrent.Future<AcceptShieldedIntegrityPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AcceptShieldedIntegrityPolicyRequest, AcceptShieldedIntegrityPolicyResponse>(
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
    public java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>
            addImageShapeCompatibilityEntry(
                    AddImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddImageShapeCompatibilityEntryRequest,
                                    AddImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async addImageShapeCompatibilityEntry");
        final AddImageShapeCompatibilityEntryRequest interceptedRequest =
                AddImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "AddImageShapeCompatibilityEntry",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/AddImageShapeCompatibilityEntry");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddImageShapeCompatibilityEntryResponse>
                transformer =
                        AddImageShapeCompatibilityEntryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddImageShapeCompatibilityEntryRequest,
                        AddImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddImageShapeCompatibilityEntryRequest,
                                AddImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddImageShapeCompatibilityEntryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddImageShapeCompatibilityEntryRequest,
                    AddImageShapeCompatibilityEntryResponse>(
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
    public java.util.concurrent.Future<AttachBootVolumeResponse> attachBootVolume(
            AttachBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AttachBootVolumeRequest, AttachBootVolumeResponse>
                    handler) {
        LOG.trace("Called async attachBootVolume");
        final AttachBootVolumeRequest interceptedRequest =
                AttachBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachBootVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "AttachBootVolume",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/AttachBootVolume");
        final java.util.function.Function<javax.ws.rs.core.Response, AttachBootVolumeResponse>
                transformer =
                        AttachBootVolumeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AttachBootVolumeRequest, AttachBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachBootVolumeRequest, AttachBootVolumeResponse>,
                        java.util.concurrent.Future<AttachBootVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachBootVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachBootVolumeRequest, AttachBootVolumeResponse>(
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
    public java.util.concurrent.Future<AttachVnicResponse> attachVnic(
            AttachVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse>
                    handler) {
        LOG.trace("Called async attachVnic");
        final AttachVnicRequest interceptedRequest = AttachVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVnicConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "AttachVnic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/AttachVnic");
        final java.util.function.Function<javax.ws.rs.core.Response, AttachVnicResponse>
                transformer =
                        AttachVnicConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachVnicRequest, AttachVnicResponse>,
                        java.util.concurrent.Future<AttachVnicResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachVnicDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachVnicRequest, AttachVnicResponse>(
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
    public java.util.concurrent.Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                    handler) {
        LOG.trace("Called async attachVolume");
        final AttachVolumeRequest interceptedRequest =
                AttachVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "AttachVolume",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/AttachVolume");
        final java.util.function.Function<javax.ws.rs.core.Response, AttachVolumeResponse>
                transformer =
                        AttachVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachVolumeRequest, AttachVolumeResponse>,
                        java.util.concurrent.Future<AttachVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachVolumeRequest, AttachVolumeResponse>(
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
    public java.util.concurrent.Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async captureConsoleHistory");
        final CaptureConsoleHistoryRequest interceptedRequest =
                CaptureConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CaptureConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CaptureConsoleHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/CaptureConsoleHistory");
        final java.util.function.Function<javax.ws.rs.core.Response, CaptureConsoleHistoryResponse>
                transformer =
                        CaptureConsoleHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>,
                        java.util.concurrent.Future<CaptureConsoleHistoryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCaptureConsoleHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>(
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
    public java.util.concurrent.Future<ChangeComputeCapacityReservationCompartmentResponse>
            changeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeCapacityReservationCompartmentRequest,
                                    ChangeComputeCapacityReservationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeCapacityReservationCompartment");
        final ChangeComputeCapacityReservationCompartmentRequest interceptedRequest =
                ChangeComputeCapacityReservationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeCapacityReservationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeCapacityReservationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ChangeComputeCapacityReservationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeComputeCapacityReservationCompartmentResponse>
                transformer =
                        ChangeComputeCapacityReservationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeCapacityReservationCompartmentRequest,
                        ChangeComputeCapacityReservationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeCapacityReservationCompartmentRequest,
                                ChangeComputeCapacityReservationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeCapacityReservationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeCapacityReservationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeCapacityReservationCompartmentRequest,
                    ChangeComputeCapacityReservationCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeCapacityTopologyCompartmentResponse>
            changeComputeCapacityTopologyCompartment(
                    ChangeComputeCapacityTopologyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeCapacityTopologyCompartmentRequest,
                                    ChangeComputeCapacityTopologyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeCapacityTopologyCompartment");
        final ChangeComputeCapacityTopologyCompartmentRequest interceptedRequest =
                ChangeComputeCapacityTopologyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeCapacityTopologyCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeCapacityTopologyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/ChangeComputeCapacityTopologyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeCapacityTopologyCompartmentResponse>
                transformer =
                        ChangeComputeCapacityTopologyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeCapacityTopologyCompartmentRequest,
                        ChangeComputeCapacityTopologyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeCapacityTopologyCompartmentRequest,
                                ChangeComputeCapacityTopologyCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeCapacityTopologyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeCapacityTopologyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeCapacityTopologyCompartmentRequest,
                    ChangeComputeCapacityTopologyCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeClusterCompartmentResponse>
            changeComputeClusterCompartment(
                    ChangeComputeClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeClusterCompartmentRequest,
                                    ChangeComputeClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeClusterCompartment");
        final ChangeComputeClusterCompartmentRequest interceptedRequest =
                ChangeComputeClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeClusterCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeClusterCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/ChangeComputeClusterCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeClusterCompartmentResponse>
                transformer =
                        ChangeComputeClusterCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeClusterCompartmentRequest,
                        ChangeComputeClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeClusterCompartmentRequest,
                                ChangeComputeClusterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeComputeClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeComputeClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeClusterCompartmentRequest,
                    ChangeComputeClusterCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeGpuMemoryClusterCompartmentResponse>
            changeComputeGpuMemoryClusterCompartment(
                    ChangeComputeGpuMemoryClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeGpuMemoryClusterCompartmentRequest,
                                    ChangeComputeGpuMemoryClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeGpuMemoryClusterCompartment");
        final ChangeComputeGpuMemoryClusterCompartmentRequest interceptedRequest =
                ChangeComputeGpuMemoryClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeGpuMemoryClusterCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeGpuMemoryClusterCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryCluster/ChangeComputeGpuMemoryClusterCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeGpuMemoryClusterCompartmentResponse>
                transformer =
                        ChangeComputeGpuMemoryClusterCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeGpuMemoryClusterCompartmentRequest,
                        ChangeComputeGpuMemoryClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeGpuMemoryClusterCompartmentRequest,
                                ChangeComputeGpuMemoryClusterCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeGpuMemoryClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeGpuMemoryClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeGpuMemoryClusterCompartmentRequest,
                    ChangeComputeGpuMemoryClusterCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeGpuMemoryFabricCompartmentResponse>
            changeComputeGpuMemoryFabricCompartment(
                    ChangeComputeGpuMemoryFabricCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeGpuMemoryFabricCompartmentRequest,
                                    ChangeComputeGpuMemoryFabricCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeGpuMemoryFabricCompartment");
        final ChangeComputeGpuMemoryFabricCompartmentRequest interceptedRequest =
                ChangeComputeGpuMemoryFabricCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeGpuMemoryFabricCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeGpuMemoryFabricCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryFabric/ChangeComputeGpuMemoryFabricCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeGpuMemoryFabricCompartmentResponse>
                transformer =
                        ChangeComputeGpuMemoryFabricCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeGpuMemoryFabricCompartmentRequest,
                        ChangeComputeGpuMemoryFabricCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeGpuMemoryFabricCompartmentRequest,
                                ChangeComputeGpuMemoryFabricCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeGpuMemoryFabricCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeGpuMemoryFabricCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeGpuMemoryFabricCompartmentRequest,
                    ChangeComputeGpuMemoryFabricCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeHostCompartmentResponse>
            changeComputeHostCompartment(
                    ChangeComputeHostCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeHostCompartmentRequest,
                                    ChangeComputeHostCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeHostCompartment");
        final ChangeComputeHostCompartmentRequest interceptedRequest =
                ChangeComputeHostCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeHostCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeHostCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHost/ChangeComputeHostCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeHostCompartmentResponse>
                transformer =
                        ChangeComputeHostCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeHostCompartmentRequest, ChangeComputeHostCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeHostCompartmentRequest,
                                ChangeComputeHostCompartmentResponse>,
                        java.util.concurrent.Future<ChangeComputeHostCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeComputeHostCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeHostCompartmentRequest, ChangeComputeHostCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeComputeImageCapabilitySchemaCompartmentResponse>
            changeComputeImageCapabilitySchemaCompartment(
                    ChangeComputeImageCapabilitySchemaCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                                    ChangeComputeImageCapabilitySchemaCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeImageCapabilitySchemaCompartment");
        final ChangeComputeImageCapabilitySchemaCompartmentRequest interceptedRequest =
                ChangeComputeImageCapabilitySchemaCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeImageCapabilitySchemaCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeComputeImageCapabilitySchemaCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/ChangeComputeImageCapabilitySchemaCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeComputeImageCapabilitySchemaCompartmentResponse>
                transformer =
                        ChangeComputeImageCapabilitySchemaCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeImageCapabilitySchemaCompartmentRequest,
                        ChangeComputeImageCapabilitySchemaCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeImageCapabilitySchemaCompartmentRequest,
                                ChangeComputeImageCapabilitySchemaCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeImageCapabilitySchemaCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeImageCapabilitySchemaCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                    ChangeComputeImageCapabilitySchemaCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>
            changeDedicatedVmHostCompartment(
                    ChangeDedicatedVmHostCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedVmHostCompartmentRequest,
                                    ChangeDedicatedVmHostCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDedicatedVmHostCompartment");
        final ChangeDedicatedVmHostCompartmentRequest interceptedRequest =
                ChangeDedicatedVmHostCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDedicatedVmHostCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeDedicatedVmHostCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/ChangeDedicatedVmHostCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDedicatedVmHostCompartmentResponse>
                transformer =
                        ChangeDedicatedVmHostCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDedicatedVmHostCompartmentRequest,
                        ChangeDedicatedVmHostCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDedicatedVmHostCompartmentRequest,
                                ChangeDedicatedVmHostCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDedicatedVmHostCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDedicatedVmHostCompartmentRequest,
                    ChangeDedicatedVmHostCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeImageCompartmentResponse> changeImageCompartment(
            ChangeImageCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeImageCompartment");
        final ChangeImageCompartmentRequest interceptedRequest =
                ChangeImageCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeImageCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeImageCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ChangeImageCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeImageCompartmentResponse>
                transformer =
                        ChangeImageCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>,
                        java.util.concurrent.Future<ChangeImageCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeImageCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeInstanceCompartmentResponse> changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeInstanceCompartment");
        final ChangeInstanceCompartmentRequest interceptedRequest =
                ChangeInstanceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstanceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ChangeInstanceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ChangeInstanceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeInstanceCompartmentResponse>
                transformer =
                        ChangeInstanceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstanceCompartmentRequest,
                                ChangeInstanceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstanceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeInstanceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse>
            createAppCatalogSubscription(
                    CreateAppCatalogSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAppCatalogSubscriptionRequest,
                                    CreateAppCatalogSubscriptionResponse>
                            handler) {
        LOG.trace("Called async createAppCatalogSubscription");
        final CreateAppCatalogSubscriptionRequest interceptedRequest =
                CreateAppCatalogSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppCatalogSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateAppCatalogSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscription/CreateAppCatalogSubscription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateAppCatalogSubscriptionResponse>
                transformer =
                        CreateAppCatalogSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateAppCatalogSubscriptionRequest, CreateAppCatalogSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAppCatalogSubscriptionRequest,
                                CreateAppCatalogSubscriptionResponse>,
                        java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAppCatalogSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAppCatalogSubscriptionRequest, CreateAppCatalogSubscriptionResponse>(
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
    public java.util.concurrent.Future<CreateComputeCapacityReportResponse>
            createComputeCapacityReport(
                    CreateComputeCapacityReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityReportRequest,
                                    CreateComputeCapacityReportResponse>
                            handler) {
        LOG.trace("Called async createComputeCapacityReport");
        final CreateComputeCapacityReportRequest interceptedRequest =
                CreateComputeCapacityReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeCapacityReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeCapacityReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReport/CreateComputeCapacityReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateComputeCapacityReportResponse>
                transformer =
                        CreateComputeCapacityReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeCapacityReportRequest, CreateComputeCapacityReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeCapacityReportRequest,
                                CreateComputeCapacityReportResponse>,
                        java.util.concurrent.Future<CreateComputeCapacityReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeCapacityReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeCapacityReportRequest, CreateComputeCapacityReportResponse>(
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
    public java.util.concurrent.Future<CreateComputeCapacityReservationResponse>
            createComputeCapacityReservation(
                    CreateComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityReservationRequest,
                                    CreateComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async createComputeCapacityReservation");
        final CreateComputeCapacityReservationRequest interceptedRequest =
                CreateComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeCapacityReservation",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateComputeCapacityReservationResponse>
                transformer =
                        CreateComputeCapacityReservationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeCapacityReservationRequest,
                        CreateComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeCapacityReservationRequest,
                                CreateComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<CreateComputeCapacityReservationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeCapacityReservationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeCapacityReservationRequest,
                    CreateComputeCapacityReservationResponse>(
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
    public java.util.concurrent.Future<CreateComputeCapacityTopologyResponse>
            createComputeCapacityTopology(
                    CreateComputeCapacityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityTopologyRequest,
                                    CreateComputeCapacityTopologyResponse>
                            handler) {
        LOG.trace("Called async createComputeCapacityTopology");
        final CreateComputeCapacityTopologyRequest interceptedRequest =
                CreateComputeCapacityTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeCapacityTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeCapacityTopology",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateComputeCapacityTopologyResponse>
                transformer =
                        CreateComputeCapacityTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeCapacityTopologyRequest, CreateComputeCapacityTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeCapacityTopologyRequest,
                                CreateComputeCapacityTopologyResponse>,
                        java.util.concurrent.Future<CreateComputeCapacityTopologyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeCapacityTopologyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeCapacityTopologyRequest, CreateComputeCapacityTopologyResponse>(
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
    public java.util.concurrent.Future<CreateComputeClusterResponse> createComputeCluster(
            CreateComputeClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateComputeClusterRequest, CreateComputeClusterResponse>
                    handler) {
        LOG.trace("Called async createComputeCluster");
        final CreateComputeClusterRequest interceptedRequest =
                CreateComputeClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/CreateComputeCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateComputeClusterResponse>
                transformer =
                        CreateComputeClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeClusterRequest, CreateComputeClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeClusterRequest, CreateComputeClusterResponse>,
                        java.util.concurrent.Future<CreateComputeClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeClusterRequest, CreateComputeClusterResponse>(
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
    public java.util.concurrent.Future<CreateComputeGpuMemoryClusterResponse>
            createComputeGpuMemoryCluster(
                    CreateComputeGpuMemoryClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeGpuMemoryClusterRequest,
                                    CreateComputeGpuMemoryClusterResponse>
                            handler) {
        LOG.trace("Called async createComputeGpuMemoryCluster");
        final CreateComputeGpuMemoryClusterRequest interceptedRequest =
                CreateComputeGpuMemoryClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeGpuMemoryClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeGpuMemoryCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryCluster/CreateComputeGpuMemoryCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateComputeGpuMemoryClusterResponse>
                transformer =
                        CreateComputeGpuMemoryClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeGpuMemoryClusterRequest, CreateComputeGpuMemoryClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeGpuMemoryClusterRequest,
                                CreateComputeGpuMemoryClusterResponse>,
                        java.util.concurrent.Future<CreateComputeGpuMemoryClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeGpuMemoryClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeGpuMemoryClusterRequest, CreateComputeGpuMemoryClusterResponse>(
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
    public java.util.concurrent.Future<CreateComputeImageCapabilitySchemaResponse>
            createComputeImageCapabilitySchema(
                    CreateComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeImageCapabilitySchemaRequest,
                                    CreateComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async createComputeImageCapabilitySchema");
        final CreateComputeImageCapabilitySchemaRequest interceptedRequest =
                CreateComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateComputeImageCapabilitySchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/CreateComputeImageCapabilitySchema");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateComputeImageCapabilitySchemaResponse>
                transformer =
                        CreateComputeImageCapabilitySchemaConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeImageCapabilitySchemaRequest,
                        CreateComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeImageCapabilitySchemaRequest,
                                CreateComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<CreateComputeImageCapabilitySchemaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeImageCapabilitySchemaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeImageCapabilitySchemaRequest,
                    CreateComputeImageCapabilitySchemaResponse>(
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
    public java.util.concurrent.Future<CreateDedicatedVmHostResponse> createDedicatedVmHost(
            CreateDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async createDedicatedVmHost");
        final CreateDedicatedVmHostRequest interceptedRequest =
                CreateDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateDedicatedVmHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/CreateDedicatedVmHost");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDedicatedVmHostResponse>
                transformer =
                        CreateDedicatedVmHostConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>,
                        java.util.concurrent.Future<CreateDedicatedVmHostResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDedicatedVmHostDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>(
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
    public java.util.concurrent.Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse>
                    handler) {
        LOG.trace("Called async createImage");
        final CreateImageRequest interceptedRequest =
                CreateImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateImageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateImage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/CreateImage");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateImageResponse>
                transformer =
                        CreateImageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateImageRequest, CreateImageResponse>,
                        java.util.concurrent.Future<CreateImageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateImageRequest, CreateImageResponse>(
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
    public java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>
            createInstanceConsoleConnection(
                    CreateInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConsoleConnectionRequest,
                                    CreateInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async createInstanceConsoleConnection");
        final CreateInstanceConsoleConnectionRequest interceptedRequest =
                CreateInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "CreateInstanceConsoleConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/CreateInstanceConsoleConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateInstanceConsoleConnectionResponse>
                transformer =
                        CreateInstanceConsoleConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateInstanceConsoleConnectionRequest,
                        CreateInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstanceConsoleConnectionRequest,
                                CreateInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateInstanceConsoleConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstanceConsoleConnectionRequest,
                    CreateInstanceConsoleConnectionResponse>(
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
    public java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse>
            deleteAppCatalogSubscription(
                    DeleteAppCatalogSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAppCatalogSubscriptionRequest,
                                    DeleteAppCatalogSubscriptionResponse>
                            handler) {
        LOG.trace("Called async deleteAppCatalogSubscription");
        final DeleteAppCatalogSubscriptionRequest interceptedRequest =
                DeleteAppCatalogSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppCatalogSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteAppCatalogSubscription",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteAppCatalogSubscriptionResponse>
                transformer =
                        DeleteAppCatalogSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAppCatalogSubscriptionRequest, DeleteAppCatalogSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAppCatalogSubscriptionRequest,
                                DeleteAppCatalogSubscriptionResponse>,
                        java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAppCatalogSubscriptionRequest, DeleteAppCatalogSubscriptionResponse>(
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
    public java.util.concurrent.Future<DeleteComputeCapacityReservationResponse>
            deleteComputeCapacityReservation(
                    DeleteComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeCapacityReservationRequest,
                                    DeleteComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async deleteComputeCapacityReservation");
        final DeleteComputeCapacityReservationRequest interceptedRequest =
                DeleteComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteComputeCapacityReservation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/DeleteComputeCapacityReservation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteComputeCapacityReservationResponse>
                transformer =
                        DeleteComputeCapacityReservationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeCapacityReservationRequest,
                        DeleteComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeCapacityReservationRequest,
                                DeleteComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<DeleteComputeCapacityReservationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeCapacityReservationRequest,
                    DeleteComputeCapacityReservationResponse>(
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
    public java.util.concurrent.Future<DeleteComputeCapacityTopologyResponse>
            deleteComputeCapacityTopology(
                    DeleteComputeCapacityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeCapacityTopologyRequest,
                                    DeleteComputeCapacityTopologyResponse>
                            handler) {
        LOG.trace("Called async deleteComputeCapacityTopology");
        final DeleteComputeCapacityTopologyRequest interceptedRequest =
                DeleteComputeCapacityTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeCapacityTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteComputeCapacityTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/DeleteComputeCapacityTopology");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteComputeCapacityTopologyResponse>
                transformer =
                        DeleteComputeCapacityTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeCapacityTopologyRequest, DeleteComputeCapacityTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeCapacityTopologyRequest,
                                DeleteComputeCapacityTopologyResponse>,
                        java.util.concurrent.Future<DeleteComputeCapacityTopologyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeCapacityTopologyRequest, DeleteComputeCapacityTopologyResponse>(
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
    public java.util.concurrent.Future<DeleteComputeClusterResponse> deleteComputeCluster(
            DeleteComputeClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteComputeClusterRequest, DeleteComputeClusterResponse>
                    handler) {
        LOG.trace("Called async deleteComputeCluster");
        final DeleteComputeClusterRequest interceptedRequest =
                DeleteComputeClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteComputeCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/DeleteComputeCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteComputeClusterResponse>
                transformer =
                        DeleteComputeClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeClusterRequest, DeleteComputeClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeClusterRequest, DeleteComputeClusterResponse>,
                        java.util.concurrent.Future<DeleteComputeClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeClusterRequest, DeleteComputeClusterResponse>(
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
    public java.util.concurrent.Future<DeleteComputeGpuMemoryClusterResponse>
            deleteComputeGpuMemoryCluster(
                    DeleteComputeGpuMemoryClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeGpuMemoryClusterRequest,
                                    DeleteComputeGpuMemoryClusterResponse>
                            handler) {
        LOG.trace("Called async deleteComputeGpuMemoryCluster");
        final DeleteComputeGpuMemoryClusterRequest interceptedRequest =
                DeleteComputeGpuMemoryClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeGpuMemoryClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteComputeGpuMemoryCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryCluster/DeleteComputeGpuMemoryCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteComputeGpuMemoryClusterResponse>
                transformer =
                        DeleteComputeGpuMemoryClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeGpuMemoryClusterRequest, DeleteComputeGpuMemoryClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeGpuMemoryClusterRequest,
                                DeleteComputeGpuMemoryClusterResponse>,
                        java.util.concurrent.Future<DeleteComputeGpuMemoryClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeGpuMemoryClusterRequest, DeleteComputeGpuMemoryClusterResponse>(
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
    public java.util.concurrent.Future<DeleteComputeImageCapabilitySchemaResponse>
            deleteComputeImageCapabilitySchema(
                    DeleteComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeImageCapabilitySchemaRequest,
                                    DeleteComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async deleteComputeImageCapabilitySchema");
        final DeleteComputeImageCapabilitySchemaRequest interceptedRequest =
                DeleteComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteComputeImageCapabilitySchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/DeleteComputeImageCapabilitySchema");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteComputeImageCapabilitySchemaResponse>
                transformer =
                        DeleteComputeImageCapabilitySchemaConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeImageCapabilitySchemaRequest,
                        DeleteComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeImageCapabilitySchemaRequest,
                                DeleteComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<DeleteComputeImageCapabilitySchemaResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeImageCapabilitySchemaRequest,
                    DeleteComputeImageCapabilitySchemaResponse>(
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
    public java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async deleteConsoleHistory");
        final DeleteConsoleHistoryRequest interceptedRequest =
                DeleteConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteConsoleHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/DeleteConsoleHistory");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteConsoleHistoryResponse>
                transformer =
                        DeleteConsoleHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>,
                        java.util.concurrent.Future<DeleteConsoleHistoryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>(
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
    public java.util.concurrent.Future<DeleteDedicatedVmHostResponse> deleteDedicatedVmHost(
            DeleteDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async deleteDedicatedVmHost");
        final DeleteDedicatedVmHostRequest interceptedRequest =
                DeleteDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteDedicatedVmHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/DeleteDedicatedVmHost");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDedicatedVmHostResponse>
                transformer =
                        DeleteDedicatedVmHostConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>,
                        java.util.concurrent.Future<DeleteDedicatedVmHostResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>(
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
    public java.util.concurrent.Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse>
                    handler) {
        LOG.trace("Called async deleteImage");
        final DeleteImageRequest interceptedRequest =
                DeleteImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteImageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute", "DeleteImage", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteImageResponse>
                transformer =
                        DeleteImageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteImageRequest, DeleteImageResponse>,
                        java.util.concurrent.Future<DeleteImageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteImageRequest, DeleteImageResponse>(
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
    public java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>
            deleteInstanceConsoleConnection(
                    DeleteInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConsoleConnectionRequest,
                                    DeleteInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async deleteInstanceConsoleConnection");
        final DeleteInstanceConsoleConnectionRequest interceptedRequest =
                DeleteInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DeleteInstanceConsoleConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/DeleteInstanceConsoleConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConsoleConnectionResponse>
                transformer =
                        DeleteInstanceConsoleConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteInstanceConsoleConnectionRequest,
                        DeleteInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteInstanceConsoleConnectionRequest,
                                DeleteInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteInstanceConsoleConnectionRequest,
                    DeleteInstanceConsoleConnectionResponse>(
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
    public java.util.concurrent.Future<DetachBootVolumeResponse> detachBootVolume(
            DetachBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetachBootVolumeRequest, DetachBootVolumeResponse>
                    handler) {
        LOG.trace("Called async detachBootVolume");
        final DetachBootVolumeRequest interceptedRequest =
                DetachBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachBootVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute", "DetachBootVolume", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DetachBootVolumeResponse>
                transformer =
                        DetachBootVolumeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DetachBootVolumeRequest, DetachBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachBootVolumeRequest, DetachBootVolumeResponse>,
                        java.util.concurrent.Future<DetachBootVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachBootVolumeRequest, DetachBootVolumeResponse>(
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
    public java.util.concurrent.Future<DetachVnicResponse> detachVnic(
            DetachVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse>
                    handler) {
        LOG.trace("Called async detachVnic");
        final DetachVnicRequest interceptedRequest = DetachVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVnicConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DetachVnic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/DetachVnic");
        final java.util.function.Function<javax.ws.rs.core.Response, DetachVnicResponse>
                transformer =
                        DetachVnicConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachVnicRequest, DetachVnicResponse>,
                        java.util.concurrent.Future<DetachVnicResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachVnicRequest, DetachVnicResponse>(
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
    public java.util.concurrent.Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                    handler) {
        LOG.trace("Called async detachVolume");
        final DetachVolumeRequest interceptedRequest =
                DetachVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "DetachVolume",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/DetachVolume");
        final java.util.function.Function<javax.ws.rs.core.Response, DetachVolumeResponse>
                transformer =
                        DetachVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachVolumeRequest, DetachVolumeResponse>,
                        java.util.concurrent.Future<DetachVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachVolumeRequest, DetachVolumeResponse>(
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
    public java.util.concurrent.Future<ExportImageResponse> exportImage(
            ExportImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse>
                    handler) {
        LOG.trace("Called async exportImage");
        final ExportImageRequest interceptedRequest =
                ExportImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportImageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ExportImage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ExportImage");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportImageResponse>
                transformer =
                        ExportImageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportImageRequest, ExportImageResponse>,
                        java.util.concurrent.Future<ExportImageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportImageRequest, ExportImageResponse>(
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
    public java.util.concurrent.Future<GetAppCatalogListingResponse> getAppCatalogListing(
            GetAppCatalogListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                    handler) {
        LOG.trace("Called async getAppCatalogListing");
        final GetAppCatalogListingRequest interceptedRequest =
                GetAppCatalogListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetAppCatalogListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListing/GetAppCatalogListing");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAppCatalogListingResponse>
                transformer =
                        GetAppCatalogListingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingRequest, GetAppCatalogListingResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingRequest, GetAppCatalogListingResponse>(
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
    public java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>
            getAppCatalogListingAgreements(
                    GetAppCatalogListingAgreementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingAgreementsRequest,
                                    GetAppCatalogListingAgreementsResponse>
                            handler) {
        LOG.trace("Called async getAppCatalogListingAgreements");
        final GetAppCatalogListingAgreementsRequest interceptedRequest =
                GetAppCatalogListingAgreementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingAgreementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetAppCatalogListingAgreements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAppCatalogListingAgreementsResponse>
                transformer =
                        GetAppCatalogListingAgreementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingAgreementsRequest,
                        GetAppCatalogListingAgreementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingAgreementsRequest,
                                GetAppCatalogListingAgreementsResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingAgreementsRequest, GetAppCatalogListingAgreementsResponse>(
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
    public java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>
            getAppCatalogListingResourceVersion(
                    GetAppCatalogListingResourceVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingResourceVersionRequest,
                                    GetAppCatalogListingResourceVersionResponse>
                            handler) {
        LOG.trace("Called async getAppCatalogListingResourceVersion");
        final GetAppCatalogListingResourceVersionRequest interceptedRequest =
                GetAppCatalogListingResourceVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingResourceVersionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetAppCatalogListingResourceVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAppCatalogListingResourceVersionResponse>
                transformer =
                        GetAppCatalogListingResourceVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingResourceVersionRequest,
                        GetAppCatalogListingResourceVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingResourceVersionRequest,
                                GetAppCatalogListingResourceVersionResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingResourceVersionRequest,
                    GetAppCatalogListingResourceVersionResponse>(
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
    public java.util.concurrent.Future<GetBootVolumeAttachmentResponse> getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async getBootVolumeAttachment");
        final GetBootVolumeAttachmentRequest interceptedRequest =
                GetBootVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetBootVolumeAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/GetBootVolumeAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetBootVolumeAttachmentResponse>
                transformer =
                        GetBootVolumeAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>,
                        java.util.concurrent.Future<GetBootVolumeAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>(
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
    public java.util.concurrent.Future<GetComputeCapacityReservationResponse>
            getComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeCapacityReservationRequest,
                                    GetComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async getComputeCapacityReservation");
        final GetComputeCapacityReservationRequest interceptedRequest =
                GetComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeCapacityReservation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/GetComputeCapacityReservation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeCapacityReservationResponse>
                transformer =
                        GetComputeCapacityReservationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeCapacityReservationRequest,
                                GetComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<GetComputeCapacityReservationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>(
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
    public java.util.concurrent.Future<GetComputeCapacityTopologyResponse>
            getComputeCapacityTopology(
                    GetComputeCapacityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeCapacityTopologyRequest,
                                    GetComputeCapacityTopologyResponse>
                            handler) {
        LOG.trace("Called async getComputeCapacityTopology");
        final GetComputeCapacityTopologyRequest interceptedRequest =
                GetComputeCapacityTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeCapacityTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeCapacityTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/GetComputeCapacityTopology");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeCapacityTopologyResponse>
                transformer =
                        GetComputeCapacityTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeCapacityTopologyRequest,
                                GetComputeCapacityTopologyResponse>,
                        java.util.concurrent.Future<GetComputeCapacityTopologyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>(
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
    public java.util.concurrent.Future<GetComputeClusterResponse> getComputeCluster(
            GetComputeClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetComputeClusterRequest, GetComputeClusterResponse>
                    handler) {
        LOG.trace("Called async getComputeCluster");
        final GetComputeClusterRequest interceptedRequest =
                GetComputeClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/GetComputeCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, GetComputeClusterResponse>
                transformer =
                        GetComputeClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetComputeClusterRequest, GetComputeClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeClusterRequest, GetComputeClusterResponse>,
                        java.util.concurrent.Future<GetComputeClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeClusterRequest, GetComputeClusterResponse>(
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
    public java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaResponse>
            getComputeGlobalImageCapabilitySchema(
                    GetComputeGlobalImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaRequest,
                                    GetComputeGlobalImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async getComputeGlobalImageCapabilitySchema");
        final GetComputeGlobalImageCapabilitySchemaRequest interceptedRequest =
                GetComputeGlobalImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGlobalImageCapabilitySchemaConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeGlobalImageCapabilitySchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchema/GetComputeGlobalImageCapabilitySchema");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeGlobalImageCapabilitySchemaResponse>
                transformer =
                        GetComputeGlobalImageCapabilitySchemaConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGlobalImageCapabilitySchemaRequest,
                        GetComputeGlobalImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGlobalImageCapabilitySchemaRequest,
                                GetComputeGlobalImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGlobalImageCapabilitySchemaRequest,
                    GetComputeGlobalImageCapabilitySchemaResponse>(
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
    public java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaVersionResponse>
            getComputeGlobalImageCapabilitySchemaVersion(
                    GetComputeGlobalImageCapabilitySchemaVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaVersionRequest,
                                    GetComputeGlobalImageCapabilitySchemaVersionResponse>
                            handler) {
        LOG.trace("Called async getComputeGlobalImageCapabilitySchemaVersion");
        final GetComputeGlobalImageCapabilitySchemaVersionRequest interceptedRequest =
                GetComputeGlobalImageCapabilitySchemaVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGlobalImageCapabilitySchemaVersionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeGlobalImageCapabilitySchemaVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersion/GetComputeGlobalImageCapabilitySchemaVersion");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetComputeGlobalImageCapabilitySchemaVersionResponse>
                transformer =
                        GetComputeGlobalImageCapabilitySchemaVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGlobalImageCapabilitySchemaVersionRequest,
                        GetComputeGlobalImageCapabilitySchemaVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGlobalImageCapabilitySchemaVersionRequest,
                                GetComputeGlobalImageCapabilitySchemaVersionResponse>,
                        java.util.concurrent.Future<
                                GetComputeGlobalImageCapabilitySchemaVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGlobalImageCapabilitySchemaVersionRequest,
                    GetComputeGlobalImageCapabilitySchemaVersionResponse>(
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
    public java.util.concurrent.Future<GetComputeGpuMemoryClusterResponse>
            getComputeGpuMemoryCluster(
                    GetComputeGpuMemoryClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGpuMemoryClusterRequest,
                                    GetComputeGpuMemoryClusterResponse>
                            handler) {
        LOG.trace("Called async getComputeGpuMemoryCluster");
        final GetComputeGpuMemoryClusterRequest interceptedRequest =
                GetComputeGpuMemoryClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGpuMemoryClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeGpuMemoryCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryCluster/GetComputeGpuMemoryCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeGpuMemoryClusterResponse>
                transformer =
                        GetComputeGpuMemoryClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGpuMemoryClusterRequest,
                                GetComputeGpuMemoryClusterResponse>,
                        java.util.concurrent.Future<GetComputeGpuMemoryClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>(
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
    public java.util.concurrent.Future<GetComputeGpuMemoryFabricResponse> getComputeGpuMemoryFabric(
            GetComputeGpuMemoryFabricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
                    handler) {
        LOG.trace("Called async getComputeGpuMemoryFabric");
        final GetComputeGpuMemoryFabricRequest interceptedRequest =
                GetComputeGpuMemoryFabricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGpuMemoryFabricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeGpuMemoryFabric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryFabric/GetComputeGpuMemoryFabric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeGpuMemoryFabricResponse>
                transformer =
                        GetComputeGpuMemoryFabricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGpuMemoryFabricRequest,
                                GetComputeGpuMemoryFabricResponse>,
                        java.util.concurrent.Future<GetComputeGpuMemoryFabricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>(
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
    public java.util.concurrent.Future<GetComputeHostResponse> getComputeHost(
            GetComputeHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetComputeHostRequest, GetComputeHostResponse>
                    handler) {
        LOG.trace("Called async getComputeHost");
        final GetComputeHostRequest interceptedRequest =
                GetComputeHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHost/GetComputeHost");
        final java.util.function.Function<javax.ws.rs.core.Response, GetComputeHostResponse>
                transformer =
                        GetComputeHostConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetComputeHostRequest, GetComputeHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeHostRequest, GetComputeHostResponse>,
                        java.util.concurrent.Future<GetComputeHostResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeHostRequest, GetComputeHostResponse>(
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
    public java.util.concurrent.Future<GetComputeImageCapabilitySchemaResponse>
            getComputeImageCapabilitySchema(
                    GetComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeImageCapabilitySchemaRequest,
                                    GetComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async getComputeImageCapabilitySchema");
        final GetComputeImageCapabilitySchemaRequest interceptedRequest =
                GetComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetComputeImageCapabilitySchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/GetComputeImageCapabilitySchema");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetComputeImageCapabilitySchemaResponse>
                transformer =
                        GetComputeImageCapabilitySchemaConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeImageCapabilitySchemaRequest,
                        GetComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeImageCapabilitySchemaRequest,
                                GetComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<GetComputeImageCapabilitySchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeImageCapabilitySchemaRequest,
                    GetComputeImageCapabilitySchemaResponse>(
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
    public java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistory");
        final GetConsoleHistoryRequest interceptedRequest =
                GetConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetConsoleHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistory");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConsoleHistoryResponse>
                transformer =
                        GetConsoleHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConsoleHistoryRequest, GetConsoleHistoryResponse>,
                        java.util.concurrent.Future<GetConsoleHistoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConsoleHistoryRequest, GetConsoleHistoryResponse>(
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
    public java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistoryContent");
        final GetConsoleHistoryContentRequest interceptedRequest =
                GetConsoleHistoryContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetConsoleHistoryContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistoryContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer =
                        GetConsoleHistoryContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>,
                        java.util.concurrent.Future<GetConsoleHistoryContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>(
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
    public java.util.concurrent.Future<GetDedicatedVmHostResponse> getDedicatedVmHost(
            GetDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async getDedicatedVmHost");
        final GetDedicatedVmHostRequest interceptedRequest =
                GetDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetDedicatedVmHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/GetDedicatedVmHost");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDedicatedVmHostResponse>
                transformer =
                        GetDedicatedVmHostConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>,
                        java.util.concurrent.Future<GetDedicatedVmHostResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>(
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
    public java.util.concurrent.Future<GetImageResponse> getImage(
            GetImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse>
                    handler) {
        LOG.trace("Called async getImage");
        final GetImageRequest interceptedRequest = GetImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetImage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/GetImage");
        final java.util.function.Function<javax.ws.rs.core.Response, GetImageResponse> transformer =
                GetImageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse>,
                        java.util.concurrent.Future<GetImageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImageRequest, GetImageResponse>(
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
    public java.util.concurrent.Future<GetImageShapeCompatibilityEntryResponse>
            getImageShapeCompatibilityEntry(
                    GetImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetImageShapeCompatibilityEntryRequest,
                                    GetImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async getImageShapeCompatibilityEntry");
        final GetImageShapeCompatibilityEntryRequest interceptedRequest =
                GetImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetImageShapeCompatibilityEntry",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/GetImageShapeCompatibilityEntry");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetImageShapeCompatibilityEntryResponse>
                transformer =
                        GetImageShapeCompatibilityEntryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetImageShapeCompatibilityEntryRequest,
                        GetImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetImageShapeCompatibilityEntryRequest,
                                GetImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<GetImageShapeCompatibilityEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImageShapeCompatibilityEntryRequest,
                    GetImageShapeCompatibilityEntryResponse>(
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
    public java.util.concurrent.Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse>
                    handler) {
        LOG.trace("Called async getInstance");
        final GetInstanceRequest interceptedRequest =
                GetInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/GetInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetInstanceResponse>
                transformer =
                        GetInstanceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceRequest, GetInstanceResponse>,
                        java.util.concurrent.Future<GetInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceRequest, GetInstanceResponse>(
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
    public java.util.concurrent.Future<GetInstanceConsoleConnectionResponse>
            getInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstanceConsoleConnectionRequest,
                                    GetInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async getInstanceConsoleConnection");
        final GetInstanceConsoleConnectionRequest interceptedRequest =
                GetInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetInstanceConsoleConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/GetInstanceConsoleConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstanceConsoleConnectionResponse>
                transformer =
                        GetInstanceConsoleConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceConsoleConnectionRequest,
                                GetInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<GetInstanceConsoleConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>(
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
    public java.util.concurrent.Future<GetInstanceMaintenanceEventResponse>
            getInstanceMaintenanceEvent(
                    GetInstanceMaintenanceEventRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstanceMaintenanceEventRequest,
                                    GetInstanceMaintenanceEventResponse>
                            handler) {
        LOG.trace("Called async getInstanceMaintenanceEvent");
        final GetInstanceMaintenanceEventRequest interceptedRequest =
                GetInstanceMaintenanceEventConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceMaintenanceEventConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetInstanceMaintenanceEvent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEvent/GetInstanceMaintenanceEvent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstanceMaintenanceEventResponse>
                transformer =
                        GetInstanceMaintenanceEventConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceMaintenanceEventRequest,
                                GetInstanceMaintenanceEventResponse>,
                        java.util.concurrent.Future<GetInstanceMaintenanceEventResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>(
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
    public java.util.concurrent.Future<GetInstanceMaintenanceRebootResponse>
            getInstanceMaintenanceReboot(
                    GetInstanceMaintenanceRebootRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstanceMaintenanceRebootRequest,
                                    GetInstanceMaintenanceRebootResponse>
                            handler) {
        LOG.trace("Called async getInstanceMaintenanceReboot");
        final GetInstanceMaintenanceRebootRequest interceptedRequest =
                GetInstanceMaintenanceRebootConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceMaintenanceRebootConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetInstanceMaintenanceReboot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceReboot/GetInstanceMaintenanceReboot");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstanceMaintenanceRebootResponse>
                transformer =
                        GetInstanceMaintenanceRebootConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceMaintenanceRebootRequest, GetInstanceMaintenanceRebootResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceMaintenanceRebootRequest,
                                GetInstanceMaintenanceRebootResponse>,
                        java.util.concurrent.Future<GetInstanceMaintenanceRebootResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceMaintenanceRebootRequest, GetInstanceMaintenanceRebootResponse>(
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
    public java.util.concurrent.Future<GetMeasuredBootReportResponse> getMeasuredBootReport(
            GetMeasuredBootReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>
                    handler) {
        LOG.trace("Called async getMeasuredBootReport");
        final GetMeasuredBootReportRequest interceptedRequest =
                GetMeasuredBootReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMeasuredBootReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetMeasuredBootReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/GetMeasuredBootReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMeasuredBootReportResponse>
                transformer =
                        GetMeasuredBootReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>,
                        java.util.concurrent.Future<GetMeasuredBootReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>(
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
    public java.util.concurrent.Future<GetVnicAttachmentResponse> getVnicAttachment(
            GetVnicAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVnicAttachment");
        final GetVnicAttachmentRequest interceptedRequest =
                GetVnicAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVnicAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetVnicAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/GetVnicAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVnicAttachmentResponse>
                transformer =
                        GetVnicAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVnicAttachmentRequest, GetVnicAttachmentResponse>,
                        java.util.concurrent.Future<GetVnicAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVnicAttachmentRequest, GetVnicAttachmentResponse>(
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
    public java.util.concurrent.Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVolumeAttachment");
        final GetVolumeAttachmentRequest interceptedRequest =
                GetVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetVolumeAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/GetVolumeAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVolumeAttachmentResponse>
                transformer =
                        GetVolumeAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>,
                        java.util.concurrent.Future<GetVolumeAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>(
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
    public java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler) {
        LOG.trace("Called async getWindowsInstanceInitialCredentials");
        final GetWindowsInstanceInitialCredentialsRequest interceptedRequest =
                GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "GetWindowsInstanceInitialCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceCredentials/GetWindowsInstanceInitialCredentials");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetWindowsInstanceInitialCredentialsResponse>
                transformer =
                        GetWindowsInstanceInitialCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetWindowsInstanceInitialCredentialsRequest,
                        GetWindowsInstanceInitialCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWindowsInstanceInitialCredentialsRequest,
                                GetWindowsInstanceInitialCredentialsResponse>,
                        java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWindowsInstanceInitialCredentialsRequest,
                    GetWindowsInstanceInitialCredentialsResponse>(
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
    public java.util.concurrent.Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InstanceActionRequest, InstanceActionResponse>
                    handler) {
        LOG.trace("Called async instanceAction");
        final InstanceActionRequest interceptedRequest =
                InstanceActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstanceActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "InstanceAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/InstanceAction");
        final java.util.function.Function<javax.ws.rs.core.Response, InstanceActionResponse>
                transformer =
                        InstanceActionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<InstanceActionRequest, InstanceActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstanceActionRequest, InstanceActionResponse>,
                        java.util.concurrent.Future<InstanceActionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstancePowerActionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstanceActionRequest, InstanceActionResponse>(
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
    public java.util.concurrent.Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LaunchInstanceRequest, LaunchInstanceResponse>
                    handler) {
        LOG.trace("Called async launchInstance");
        final LaunchInstanceRequest interceptedRequest =
                LaunchInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "LaunchInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/LaunchInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, LaunchInstanceResponse>
                transformer =
                        LaunchInstanceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchInstanceRequest, LaunchInstanceResponse>,
                        java.util.concurrent.Future<LaunchInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLaunchInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchInstanceRequest, LaunchInstanceResponse>(
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
    public java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>
            listAppCatalogListingResourceVersions(
                    ListAppCatalogListingResourceVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogListingResourceVersionsRequest,
                                    ListAppCatalogListingResourceVersionsResponse>
                            handler) {
        LOG.trace("Called async listAppCatalogListingResourceVersions");
        final ListAppCatalogListingResourceVersionsRequest interceptedRequest =
                ListAppCatalogListingResourceVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogListingResourceVersionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListAppCatalogListingResourceVersions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionSummary/ListAppCatalogListingResourceVersions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAppCatalogListingResourceVersionsResponse>
                transformer =
                        ListAppCatalogListingResourceVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogListingResourceVersionsRequest,
                        ListAppCatalogListingResourceVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogListingResourceVersionsRequest,
                                ListAppCatalogListingResourceVersionsResponse>,
                        java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogListingResourceVersionsRequest,
                    ListAppCatalogListingResourceVersionsResponse>(
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
    public java.util.concurrent.Future<ListAppCatalogListingsResponse> listAppCatalogListings(
            ListAppCatalogListingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                    handler) {
        LOG.trace("Called async listAppCatalogListings");
        final ListAppCatalogListingsRequest interceptedRequest =
                ListAppCatalogListingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogListingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListAppCatalogListings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingSummary/ListAppCatalogListings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAppCatalogListingsResponse>
                transformer =
                        ListAppCatalogListingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>,
                        java.util.concurrent.Future<ListAppCatalogListingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>(
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
    public java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse>
            listAppCatalogSubscriptions(
                    ListAppCatalogSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogSubscriptionsRequest,
                                    ListAppCatalogSubscriptionsResponse>
                            handler) {
        LOG.trace("Called async listAppCatalogSubscriptions");
        final ListAppCatalogSubscriptionsRequest interceptedRequest =
                ListAppCatalogSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogSubscriptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListAppCatalogSubscriptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscriptionSummary/ListAppCatalogSubscriptions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAppCatalogSubscriptionsResponse>
                transformer =
                        ListAppCatalogSubscriptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogSubscriptionsRequest,
                                ListAppCatalogSubscriptionsResponse>,
                        java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>(
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
    public java.util.concurrent.Future<ListBootVolumeAttachmentsResponse> listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listBootVolumeAttachments");
        final ListBootVolumeAttachmentsRequest interceptedRequest =
                ListBootVolumeAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumeAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListBootVolumeAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/ListBootVolumeAttachments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListBootVolumeAttachmentsResponse>
                transformer =
                        ListBootVolumeAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBootVolumeAttachmentsRequest,
                                ListBootVolumeAttachmentsResponse>,
                        java.util.concurrent.Future<ListBootVolumeAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityReservationInstanceShapesResponse>
            listComputeCapacityReservationInstanceShapes(
                    ListComputeCapacityReservationInstanceShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstanceShapesRequest,
                                    ListComputeCapacityReservationInstanceShapesResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservationInstanceShapes");
        final ListComputeCapacityReservationInstanceShapesRequest interceptedRequest =
                ListComputeCapacityReservationInstanceShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationInstanceShapesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityReservationInstanceShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservationInstanceShapeSummary/ListComputeCapacityReservationInstanceShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListComputeCapacityReservationInstanceShapesResponse>
                transformer =
                        ListComputeCapacityReservationInstanceShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationInstanceShapesRequest,
                        ListComputeCapacityReservationInstanceShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationInstanceShapesRequest,
                                ListComputeCapacityReservationInstanceShapesResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityReservationInstanceShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationInstanceShapesRequest,
                    ListComputeCapacityReservationInstanceShapesResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityReservationInstancesResponse>
            listComputeCapacityReservationInstances(
                    ListComputeCapacityReservationInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstancesRequest,
                                    ListComputeCapacityReservationInstancesResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservationInstances");
        final ListComputeCapacityReservationInstancesRequest interceptedRequest =
                ListComputeCapacityReservationInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationInstancesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityReservationInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CapacityReservationInstanceSummary/ListComputeCapacityReservationInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeCapacityReservationInstancesResponse>
                transformer =
                        ListComputeCapacityReservationInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationInstancesRequest,
                        ListComputeCapacityReservationInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationInstancesRequest,
                                ListComputeCapacityReservationInstancesResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityReservationInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationInstancesRequest,
                    ListComputeCapacityReservationInstancesResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityReservationsResponse>
            listComputeCapacityReservations(
                    ListComputeCapacityReservationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationsRequest,
                                    ListComputeCapacityReservationsResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservations");
        final ListComputeCapacityReservationsRequest interceptedRequest =
                ListComputeCapacityReservationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityReservations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ListComputeCapacityReservations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeCapacityReservationsResponse>
                transformer =
                        ListComputeCapacityReservationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationsRequest,
                        ListComputeCapacityReservationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationsRequest,
                                ListComputeCapacityReservationsResponse>,
                        java.util.concurrent.Future<ListComputeCapacityReservationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationsRequest,
                    ListComputeCapacityReservationsResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityTopologiesResponse>
            listComputeCapacityTopologies(
                    ListComputeCapacityTopologiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologiesRequest,
                                    ListComputeCapacityTopologiesResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityTopologies");
        final ListComputeCapacityTopologiesRequest interceptedRequest =
                ListComputeCapacityTopologiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityTopologiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityTopologies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/ListComputeCapacityTopologies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeCapacityTopologiesResponse>
                transformer =
                        ListComputeCapacityTopologiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityTopologiesRequest, ListComputeCapacityTopologiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityTopologiesRequest,
                                ListComputeCapacityTopologiesResponse>,
                        java.util.concurrent.Future<ListComputeCapacityTopologiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityTopologiesRequest, ListComputeCapacityTopologiesResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityTopologyComputeBareMetalHostsResponse>
            listComputeCapacityTopologyComputeBareMetalHosts(
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                                    ListComputeCapacityTopologyComputeBareMetalHostsResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityTopologyComputeBareMetalHosts");
        final ListComputeCapacityTopologyComputeBareMetalHostsRequest interceptedRequest =
                ListComputeCapacityTopologyComputeBareMetalHostsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityTopologyComputeBareMetalHostsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeBareMetalHosts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeBareMetalHost/ListComputeCapacityTopologyComputeBareMetalHosts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse>
                transformer =
                        ListComputeCapacityTopologyComputeBareMetalHostsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                        ListComputeCapacityTopologyComputeBareMetalHostsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                                ListComputeCapacityTopologyComputeBareMetalHostsResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityTopologyComputeBareMetalHostsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                    ListComputeCapacityTopologyComputeBareMetalHostsResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityTopologyComputeHpcIslandsResponse>
            listComputeCapacityTopologyComputeHpcIslands(
                    ListComputeCapacityTopologyComputeHpcIslandsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeHpcIslandsRequest,
                                    ListComputeCapacityTopologyComputeHpcIslandsResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityTopologyComputeHpcIslands");
        final ListComputeCapacityTopologyComputeHpcIslandsRequest interceptedRequest =
                ListComputeCapacityTopologyComputeHpcIslandsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityTopologyComputeHpcIslandsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeHpcIslands",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHpcIsland/ListComputeCapacityTopologyComputeHpcIslands");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListComputeCapacityTopologyComputeHpcIslandsResponse>
                transformer =
                        ListComputeCapacityTopologyComputeHpcIslandsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityTopologyComputeHpcIslandsRequest,
                        ListComputeCapacityTopologyComputeHpcIslandsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityTopologyComputeHpcIslandsRequest,
                                ListComputeCapacityTopologyComputeHpcIslandsResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityTopologyComputeHpcIslandsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityTopologyComputeHpcIslandsRequest,
                    ListComputeCapacityTopologyComputeHpcIslandsResponse>(
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
    public java.util.concurrent.Future<ListComputeCapacityTopologyComputeNetworkBlocksResponse>
            listComputeCapacityTopologyComputeNetworkBlocks(
                    ListComputeCapacityTopologyComputeNetworkBlocksRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                                    ListComputeCapacityTopologyComputeNetworkBlocksResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityTopologyComputeNetworkBlocks");
        final ListComputeCapacityTopologyComputeNetworkBlocksRequest interceptedRequest =
                ListComputeCapacityTopologyComputeNetworkBlocksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityTopologyComputeNetworkBlocksConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeCapacityTopologyComputeNetworkBlocks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeNetworkBlock/ListComputeCapacityTopologyComputeNetworkBlocks");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse>
                transformer =
                        ListComputeCapacityTopologyComputeNetworkBlocksConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                        ListComputeCapacityTopologyComputeNetworkBlocksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                                ListComputeCapacityTopologyComputeNetworkBlocksResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityTopologyComputeNetworkBlocksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                    ListComputeCapacityTopologyComputeNetworkBlocksResponse>(
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
    public java.util.concurrent.Future<ListComputeClustersResponse> listComputeClusters(
            ListComputeClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComputeClustersRequest, ListComputeClustersResponse>
                    handler) {
        LOG.trace("Called async listComputeClusters");
        final ListComputeClustersRequest interceptedRequest =
                ListComputeClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeClustersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeClusters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/ListComputeClusters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListComputeClustersResponse>
                transformer =
                        ListComputeClustersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeClustersRequest, ListComputeClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeClustersRequest, ListComputeClustersResponse>,
                        java.util.concurrent.Future<ListComputeClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeClustersRequest, ListComputeClustersResponse>(
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
    public java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemaVersionsResponse>
            listComputeGlobalImageCapabilitySchemaVersions(
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                                    ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                            handler) {
        LOG.trace("Called async listComputeGlobalImageCapabilitySchemaVersions");
        final ListComputeGlobalImageCapabilitySchemaVersionsRequest interceptedRequest =
                ListComputeGlobalImageCapabilitySchemaVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGlobalImageCapabilitySchemaVersionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeGlobalImageCapabilitySchemaVersions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersionSummary/ListComputeGlobalImageCapabilitySchemaVersions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                transformer =
                        ListComputeGlobalImageCapabilitySchemaVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                                ListComputeGlobalImageCapabilitySchemaVersionsResponse>,
                        java.util.concurrent.Future<
                                ListComputeGlobalImageCapabilitySchemaVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                    ListComputeGlobalImageCapabilitySchemaVersionsResponse>(
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
    public java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemasResponse>
            listComputeGlobalImageCapabilitySchemas(
                    ListComputeGlobalImageCapabilitySchemasRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemasRequest,
                                    ListComputeGlobalImageCapabilitySchemasResponse>
                            handler) {
        LOG.trace("Called async listComputeGlobalImageCapabilitySchemas");
        final ListComputeGlobalImageCapabilitySchemasRequest interceptedRequest =
                ListComputeGlobalImageCapabilitySchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGlobalImageCapabilitySchemasConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeGlobalImageCapabilitySchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaSummary/ListComputeGlobalImageCapabilitySchemas");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeGlobalImageCapabilitySchemasResponse>
                transformer =
                        ListComputeGlobalImageCapabilitySchemasConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGlobalImageCapabilitySchemasRequest,
                        ListComputeGlobalImageCapabilitySchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGlobalImageCapabilitySchemasRequest,
                                ListComputeGlobalImageCapabilitySchemasResponse>,
                        java.util.concurrent.Future<
                                ListComputeGlobalImageCapabilitySchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGlobalImageCapabilitySchemasRequest,
                    ListComputeGlobalImageCapabilitySchemasResponse>(
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
    public java.util.concurrent.Future<ListComputeGpuMemoryClusterInstancesResponse>
            listComputeGpuMemoryClusterInstances(
                    ListComputeGpuMemoryClusterInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGpuMemoryClusterInstancesRequest,
                                    ListComputeGpuMemoryClusterInstancesResponse>
                            handler) {
        LOG.trace("Called async listComputeGpuMemoryClusterInstances");
        final ListComputeGpuMemoryClusterInstancesRequest interceptedRequest =
                ListComputeGpuMemoryClusterInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGpuMemoryClusterInstancesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeGpuMemoryClusterInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryClusterInstanceSummary/ListComputeGpuMemoryClusterInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeGpuMemoryClusterInstancesResponse>
                transformer =
                        ListComputeGpuMemoryClusterInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGpuMemoryClusterInstancesRequest,
                        ListComputeGpuMemoryClusterInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGpuMemoryClusterInstancesRequest,
                                ListComputeGpuMemoryClusterInstancesResponse>,
                        java.util.concurrent.Future<ListComputeGpuMemoryClusterInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGpuMemoryClusterInstancesRequest,
                    ListComputeGpuMemoryClusterInstancesResponse>(
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
    public java.util.concurrent.Future<ListComputeGpuMemoryClustersResponse>
            listComputeGpuMemoryClusters(
                    ListComputeGpuMemoryClustersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGpuMemoryClustersRequest,
                                    ListComputeGpuMemoryClustersResponse>
                            handler) {
        LOG.trace("Called async listComputeGpuMemoryClusters");
        final ListComputeGpuMemoryClustersRequest interceptedRequest =
                ListComputeGpuMemoryClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGpuMemoryClustersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeGpuMemoryClusters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryClusterCollection/ListComputeGpuMemoryClusters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeGpuMemoryClustersResponse>
                transformer =
                        ListComputeGpuMemoryClustersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGpuMemoryClustersRequest, ListComputeGpuMemoryClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGpuMemoryClustersRequest,
                                ListComputeGpuMemoryClustersResponse>,
                        java.util.concurrent.Future<ListComputeGpuMemoryClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGpuMemoryClustersRequest, ListComputeGpuMemoryClustersResponse>(
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
    public java.util.concurrent.Future<ListComputeGpuMemoryFabricsResponse>
            listComputeGpuMemoryFabrics(
                    ListComputeGpuMemoryFabricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGpuMemoryFabricsRequest,
                                    ListComputeGpuMemoryFabricsResponse>
                            handler) {
        LOG.trace("Called async listComputeGpuMemoryFabrics");
        final ListComputeGpuMemoryFabricsRequest interceptedRequest =
                ListComputeGpuMemoryFabricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGpuMemoryFabricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeGpuMemoryFabrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryFabric/ListComputeGpuMemoryFabrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeGpuMemoryFabricsResponse>
                transformer =
                        ListComputeGpuMemoryFabricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGpuMemoryFabricsRequest, ListComputeGpuMemoryFabricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGpuMemoryFabricsRequest,
                                ListComputeGpuMemoryFabricsResponse>,
                        java.util.concurrent.Future<ListComputeGpuMemoryFabricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGpuMemoryFabricsRequest, ListComputeGpuMemoryFabricsResponse>(
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
    public java.util.concurrent.Future<ListComputeHostsResponse> listComputeHosts(
            ListComputeHostsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComputeHostsRequest, ListComputeHostsResponse>
                    handler) {
        LOG.trace("Called async listComputeHosts");
        final ListComputeHostsRequest interceptedRequest =
                ListComputeHostsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeHostsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeHosts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHost/ListComputeHosts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListComputeHostsResponse>
                transformer =
                        ListComputeHostsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListComputeHostsRequest, ListComputeHostsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeHostsRequest, ListComputeHostsResponse>,
                        java.util.concurrent.Future<ListComputeHostsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeHostsRequest, ListComputeHostsResponse>(
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
    public java.util.concurrent.Future<ListComputeImageCapabilitySchemasResponse>
            listComputeImageCapabilitySchemas(
                    ListComputeImageCapabilitySchemasRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeImageCapabilitySchemasRequest,
                                    ListComputeImageCapabilitySchemasResponse>
                            handler) {
        LOG.trace("Called async listComputeImageCapabilitySchemas");
        final ListComputeImageCapabilitySchemasRequest interceptedRequest =
                ListComputeImageCapabilitySchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeImageCapabilitySchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListComputeImageCapabilitySchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchemaSummary/ListComputeImageCapabilitySchemas");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeImageCapabilitySchemasResponse>
                transformer =
                        ListComputeImageCapabilitySchemasConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeImageCapabilitySchemasRequest,
                        ListComputeImageCapabilitySchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeImageCapabilitySchemasRequest,
                                ListComputeImageCapabilitySchemasResponse>,
                        java.util.concurrent.Future<ListComputeImageCapabilitySchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeImageCapabilitySchemasRequest,
                    ListComputeImageCapabilitySchemasResponse>(
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
    public java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                    handler) {
        LOG.trace("Called async listConsoleHistories");
        final ListConsoleHistoriesRequest interceptedRequest =
                ListConsoleHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsoleHistoriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListConsoleHistories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/ListConsoleHistories");
        final java.util.function.Function<javax.ws.rs.core.Response, ListConsoleHistoriesResponse>
                transformer =
                        ListConsoleHistoriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>,
                        java.util.concurrent.Future<ListConsoleHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>(
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
    public java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>
            listDedicatedVmHostInstanceShapes(
                    ListDedicatedVmHostInstanceShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstanceShapesRequest,
                                    ListDedicatedVmHostInstanceShapesResponse>
                            handler) {
        LOG.trace("Called async listDedicatedVmHostInstanceShapes");
        final ListDedicatedVmHostInstanceShapesRequest interceptedRequest =
                ListDedicatedVmHostInstanceShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostInstanceShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListDedicatedVmHostInstanceShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceShapeSummary/ListDedicatedVmHostInstanceShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostInstanceShapesResponse>
                transformer =
                        ListDedicatedVmHostInstanceShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostInstanceShapesRequest,
                        ListDedicatedVmHostInstanceShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostInstanceShapesRequest,
                                ListDedicatedVmHostInstanceShapesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostInstanceShapesRequest,
                    ListDedicatedVmHostInstanceShapesResponse>(
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
    public java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse>
            listDedicatedVmHostInstances(
                    ListDedicatedVmHostInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstancesRequest,
                                    ListDedicatedVmHostInstancesResponse>
                            handler) {
        LOG.trace("Called async listDedicatedVmHostInstances");
        final ListDedicatedVmHostInstancesRequest interceptedRequest =
                ListDedicatedVmHostInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListDedicatedVmHostInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceSummary/ListDedicatedVmHostInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostInstancesResponse>
                transformer =
                        ListDedicatedVmHostInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostInstancesRequest, ListDedicatedVmHostInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostInstancesRequest,
                                ListDedicatedVmHostInstancesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostInstancesRequest, ListDedicatedVmHostInstancesResponse>(
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
    public java.util.concurrent.Future<ListDedicatedVmHostShapesResponse> listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                    handler) {
        LOG.trace("Called async listDedicatedVmHostShapes");
        final ListDedicatedVmHostShapesRequest interceptedRequest =
                ListDedicatedVmHostShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListDedicatedVmHostShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostShapeSummary/ListDedicatedVmHostShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostShapesResponse>
                transformer =
                        ListDedicatedVmHostShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostShapesRequest,
                                ListDedicatedVmHostShapesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>(
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
    public java.util.concurrent.Future<ListDedicatedVmHostsResponse> listDedicatedVmHosts(
            ListDedicatedVmHostsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                    handler) {
        LOG.trace("Called async listDedicatedVmHosts");
        final ListDedicatedVmHostsRequest interceptedRequest =
                ListDedicatedVmHostsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListDedicatedVmHosts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostSummary/ListDedicatedVmHosts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDedicatedVmHostsResponse>
                transformer =
                        ListDedicatedVmHostsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>(
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
    public java.util.concurrent.Future<ListImageShapeCompatibilityEntriesResponse>
            listImageShapeCompatibilityEntries(
                    ListImageShapeCompatibilityEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImageShapeCompatibilityEntriesRequest,
                                    ListImageShapeCompatibilityEntriesResponse>
                            handler) {
        LOG.trace("Called async listImageShapeCompatibilityEntries");
        final ListImageShapeCompatibilityEntriesRequest interceptedRequest =
                ListImageShapeCompatibilityEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImageShapeCompatibilityEntriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListImageShapeCompatibilityEntries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/ListImageShapeCompatibilityEntries");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListImageShapeCompatibilityEntriesResponse>
                transformer =
                        ListImageShapeCompatibilityEntriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListImageShapeCompatibilityEntriesRequest,
                        ListImageShapeCompatibilityEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImageShapeCompatibilityEntriesRequest,
                                ListImageShapeCompatibilityEntriesResponse>,
                        java.util.concurrent.Future<ListImageShapeCompatibilityEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImageShapeCompatibilityEntriesRequest,
                    ListImageShapeCompatibilityEntriesResponse>(
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
    public java.util.concurrent.Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse>
                    handler) {
        LOG.trace("Called async listImages");
        final ListImagesRequest interceptedRequest = ListImagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListImages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ListImages");
        final java.util.function.Function<javax.ws.rs.core.Response, ListImagesResponse>
                transformer =
                        ListImagesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImagesRequest, ListImagesResponse>,
                        java.util.concurrent.Future<ListImagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImagesRequest, ListImagesResponse>(
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
    public java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>
            listInstanceConsoleConnections(
                    ListInstanceConsoleConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConsoleConnectionsRequest,
                                    ListInstanceConsoleConnectionsResponse>
                            handler) {
        LOG.trace("Called async listInstanceConsoleConnections");
        final ListInstanceConsoleConnectionsRequest interceptedRequest =
                ListInstanceConsoleConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConsoleConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListInstanceConsoleConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/ListInstanceConsoleConnections");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListInstanceConsoleConnectionsResponse>
                transformer =
                        ListInstanceConsoleConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceConsoleConnectionsRequest,
                        ListInstanceConsoleConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceConsoleConnectionsRequest,
                                ListInstanceConsoleConnectionsResponse>,
                        java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceConsoleConnectionsRequest, ListInstanceConsoleConnectionsResponse>(
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
    public java.util.concurrent.Future<ListInstanceDevicesResponse> listInstanceDevices(
            ListInstanceDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                    handler) {
        LOG.trace("Called async listInstanceDevices");
        final ListInstanceDevicesRequest interceptedRequest =
                ListInstanceDevicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceDevicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListInstanceDevices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Device/ListInstanceDevices");
        final java.util.function.Function<javax.ws.rs.core.Response, ListInstanceDevicesResponse>
                transformer =
                        ListInstanceDevicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceDevicesRequest, ListInstanceDevicesResponse>,
                        java.util.concurrent.Future<ListInstanceDevicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceDevicesRequest, ListInstanceDevicesResponse>(
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
    public java.util.concurrent.Future<ListInstanceMaintenanceEventsResponse>
            listInstanceMaintenanceEvents(
                    ListInstanceMaintenanceEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceMaintenanceEventsRequest,
                                    ListInstanceMaintenanceEventsResponse>
                            handler) {
        LOG.trace("Called async listInstanceMaintenanceEvents");
        final ListInstanceMaintenanceEventsRequest interceptedRequest =
                ListInstanceMaintenanceEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceMaintenanceEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListInstanceMaintenanceEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEventSummary/ListInstanceMaintenanceEvents");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListInstanceMaintenanceEventsResponse>
                transformer =
                        ListInstanceMaintenanceEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceMaintenanceEventsRequest, ListInstanceMaintenanceEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceMaintenanceEventsRequest,
                                ListInstanceMaintenanceEventsResponse>,
                        java.util.concurrent.Future<ListInstanceMaintenanceEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceMaintenanceEventsRequest, ListInstanceMaintenanceEventsResponse>(
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
    public java.util.concurrent.Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                    handler) {
        LOG.trace("Called async listInstances");
        final ListInstancesRequest interceptedRequest =
                ListInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ListInstances");
        final java.util.function.Function<javax.ws.rs.core.Response, ListInstancesResponse>
                transformer =
                        ListInstancesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancesRequest, ListInstancesResponse>,
                        java.util.concurrent.Future<ListInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancesRequest, ListInstancesResponse>(
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
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse>
                    handler) {
        LOG.trace("Called async listShapes");
        final ListShapesRequest interceptedRequest = ListShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Shape/ListShapes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListShapesResponse>
                transformer =
                        ListShapesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListShapesRequest, ListShapesResponse>,
                        java.util.concurrent.Future<ListShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListShapesRequest, ListShapesResponse>(
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
    public java.util.concurrent.Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVnicAttachments");
        final ListVnicAttachmentsRequest interceptedRequest =
                ListVnicAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVnicAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListVnicAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/ListVnicAttachments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVnicAttachmentsResponse>
                transformer =
                        ListVnicAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>,
                        java.util.concurrent.Future<ListVnicAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>(
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
    public java.util.concurrent.Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVolumeAttachments");
        final ListVolumeAttachmentsRequest interceptedRequest =
                ListVolumeAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "ListVolumeAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/ListVolumeAttachments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVolumeAttachmentsResponse>
                transformer =
                        ListVolumeAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>,
                        java.util.concurrent.Future<ListVolumeAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>(
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
    public java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>
            removeImageShapeCompatibilityEntry(
                    RemoveImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveImageShapeCompatibilityEntryRequest,
                                    RemoveImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async removeImageShapeCompatibilityEntry");
        final RemoveImageShapeCompatibilityEntryRequest interceptedRequest =
                RemoveImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "RemoveImageShapeCompatibilityEntry",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/RemoveImageShapeCompatibilityEntry");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveImageShapeCompatibilityEntryResponse>
                transformer =
                        RemoveImageShapeCompatibilityEntryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveImageShapeCompatibilityEntryRequest,
                        RemoveImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveImageShapeCompatibilityEntryRequest,
                                RemoveImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveImageShapeCompatibilityEntryRequest,
                    RemoveImageShapeCompatibilityEntryResponse>(
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
    public java.util.concurrent.Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstanceRequest, TerminateInstanceResponse>
                    handler) {
        LOG.trace("Called async terminateInstance");
        final TerminateInstanceRequest interceptedRequest =
                TerminateInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute", "TerminateInstance", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, TerminateInstanceResponse>
                transformer =
                        TerminateInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<TerminateInstanceRequest, TerminateInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateInstanceRequest, TerminateInstanceResponse>,
                        java.util.concurrent.Future<TerminateInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateInstanceRequest, TerminateInstanceResponse>(
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
    public java.util.concurrent.Future<UpdateComputeCapacityReservationResponse>
            updateComputeCapacityReservation(
                    UpdateComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeCapacityReservationRequest,
                                    UpdateComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async updateComputeCapacityReservation");
        final UpdateComputeCapacityReservationRequest interceptedRequest =
                UpdateComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeCapacityReservation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/UpdateComputeCapacityReservation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateComputeCapacityReservationResponse>
                transformer =
                        UpdateComputeCapacityReservationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeCapacityReservationRequest,
                        UpdateComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeCapacityReservationRequest,
                                UpdateComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<UpdateComputeCapacityReservationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeCapacityReservationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeCapacityReservationRequest,
                    UpdateComputeCapacityReservationResponse>(
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
    public java.util.concurrent.Future<UpdateComputeCapacityTopologyResponse>
            updateComputeCapacityTopology(
                    UpdateComputeCapacityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeCapacityTopologyRequest,
                                    UpdateComputeCapacityTopologyResponse>
                            handler) {
        LOG.trace("Called async updateComputeCapacityTopology");
        final UpdateComputeCapacityTopologyRequest interceptedRequest =
                UpdateComputeCapacityTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeCapacityTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeCapacityTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityTopology/UpdateComputeCapacityTopology");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateComputeCapacityTopologyResponse>
                transformer =
                        UpdateComputeCapacityTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeCapacityTopologyRequest, UpdateComputeCapacityTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeCapacityTopologyRequest,
                                UpdateComputeCapacityTopologyResponse>,
                        java.util.concurrent.Future<UpdateComputeCapacityTopologyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeCapacityTopologyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeCapacityTopologyRequest, UpdateComputeCapacityTopologyResponse>(
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
    public java.util.concurrent.Future<UpdateComputeClusterResponse> updateComputeCluster(
            UpdateComputeClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateComputeClusterRequest, UpdateComputeClusterResponse>
                    handler) {
        LOG.trace("Called async updateComputeCluster");
        final UpdateComputeClusterRequest interceptedRequest =
                UpdateComputeClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCluster/UpdateComputeCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateComputeClusterResponse>
                transformer =
                        UpdateComputeClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeClusterRequest, UpdateComputeClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeClusterRequest, UpdateComputeClusterResponse>,
                        java.util.concurrent.Future<UpdateComputeClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeClusterRequest, UpdateComputeClusterResponse>(
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
    public java.util.concurrent.Future<UpdateComputeGpuMemoryClusterResponse>
            updateComputeGpuMemoryCluster(
                    UpdateComputeGpuMemoryClusterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeGpuMemoryClusterRequest,
                                    UpdateComputeGpuMemoryClusterResponse>
                            handler) {
        LOG.trace("Called async updateComputeGpuMemoryCluster");
        final UpdateComputeGpuMemoryClusterRequest interceptedRequest =
                UpdateComputeGpuMemoryClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeGpuMemoryClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeGpuMemoryCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryCluster/UpdateComputeGpuMemoryCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateComputeGpuMemoryClusterResponse>
                transformer =
                        UpdateComputeGpuMemoryClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeGpuMemoryClusterRequest, UpdateComputeGpuMemoryClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeGpuMemoryClusterRequest,
                                UpdateComputeGpuMemoryClusterResponse>,
                        java.util.concurrent.Future<UpdateComputeGpuMemoryClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeGpuMemoryClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeGpuMemoryClusterRequest, UpdateComputeGpuMemoryClusterResponse>(
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
    public java.util.concurrent.Future<UpdateComputeGpuMemoryFabricResponse>
            updateComputeGpuMemoryFabric(
                    UpdateComputeGpuMemoryFabricRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeGpuMemoryFabricRequest,
                                    UpdateComputeGpuMemoryFabricResponse>
                            handler) {
        LOG.trace("Called async updateComputeGpuMemoryFabric");
        final UpdateComputeGpuMemoryFabricRequest interceptedRequest =
                UpdateComputeGpuMemoryFabricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeGpuMemoryFabricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeGpuMemoryFabric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGpuMemoryFabric/UpdateComputeGpuMemoryFabric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateComputeGpuMemoryFabricResponse>
                transformer =
                        UpdateComputeGpuMemoryFabricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeGpuMemoryFabricRequest, UpdateComputeGpuMemoryFabricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeGpuMemoryFabricRequest,
                                UpdateComputeGpuMemoryFabricResponse>,
                        java.util.concurrent.Future<UpdateComputeGpuMemoryFabricResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeGpuMemoryFabricDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeGpuMemoryFabricRequest, UpdateComputeGpuMemoryFabricResponse>(
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
    public java.util.concurrent.Future<UpdateComputeHostResponse> updateComputeHost(
            UpdateComputeHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateComputeHostRequest, UpdateComputeHostResponse>
                    handler) {
        LOG.trace("Called async updateComputeHost");
        final UpdateComputeHostRequest interceptedRequest =
                UpdateComputeHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeHost/UpdateComputeHost");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateComputeHostResponse>
                transformer =
                        UpdateComputeHostConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateComputeHostRequest, UpdateComputeHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeHostRequest, UpdateComputeHostResponse>,
                        java.util.concurrent.Future<UpdateComputeHostResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeHostDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeHostRequest, UpdateComputeHostResponse>(
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
    public java.util.concurrent.Future<UpdateComputeImageCapabilitySchemaResponse>
            updateComputeImageCapabilitySchema(
                    UpdateComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeImageCapabilitySchemaRequest,
                                    UpdateComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async updateComputeImageCapabilitySchema");
        final UpdateComputeImageCapabilitySchemaRequest interceptedRequest =
                UpdateComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateComputeImageCapabilitySchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/UpdateComputeImageCapabilitySchema");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateComputeImageCapabilitySchemaResponse>
                transformer =
                        UpdateComputeImageCapabilitySchemaConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeImageCapabilitySchemaRequest,
                        UpdateComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeImageCapabilitySchemaRequest,
                                UpdateComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<UpdateComputeImageCapabilitySchemaResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeImageCapabilitySchemaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeImageCapabilitySchemaRequest,
                    UpdateComputeImageCapabilitySchemaResponse>(
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
    public java.util.concurrent.Future<UpdateConsoleHistoryResponse> updateConsoleHistory(
            UpdateConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async updateConsoleHistory");
        final UpdateConsoleHistoryRequest interceptedRequest =
                UpdateConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateConsoleHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/UpdateConsoleHistory");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateConsoleHistoryResponse>
                transformer =
                        UpdateConsoleHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>,
                        java.util.concurrent.Future<UpdateConsoleHistoryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConsoleHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>(
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
    public java.util.concurrent.Future<UpdateDedicatedVmHostResponse> updateDedicatedVmHost(
            UpdateDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async updateDedicatedVmHost");
        final UpdateDedicatedVmHostRequest interceptedRequest =
                UpdateDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateDedicatedVmHost",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/UpdateDedicatedVmHost");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDedicatedVmHostResponse>
                transformer =
                        UpdateDedicatedVmHostConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>,
                        java.util.concurrent.Future<UpdateDedicatedVmHostResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDedicatedVmHostDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>(
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
    public java.util.concurrent.Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse>
                    handler) {
        LOG.trace("Called async updateImage");
        final UpdateImageRequest interceptedRequest =
                UpdateImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateImageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateImage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/UpdateImage");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateImageResponse>
                transformer =
                        UpdateImageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateImageRequest, UpdateImageResponse>,
                        java.util.concurrent.Future<UpdateImageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateImageRequest, UpdateImageResponse>(
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
    public java.util.concurrent.Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstanceRequest, UpdateInstanceResponse>
                    handler) {
        LOG.trace("Called async updateInstance");
        final UpdateInstanceRequest interceptedRequest =
                UpdateInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/UpdateInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateInstanceResponse>
                transformer =
                        UpdateInstanceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceRequest, UpdateInstanceResponse>,
                        java.util.concurrent.Future<UpdateInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceRequest, UpdateInstanceResponse>(
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
    public java.util.concurrent.Future<UpdateInstanceConsoleConnectionResponse>
            updateInstanceConsoleConnection(
                    UpdateInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceConsoleConnectionRequest,
                                    UpdateInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async updateInstanceConsoleConnection");
        final UpdateInstanceConsoleConnectionRequest interceptedRequest =
                UpdateInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateInstanceConsoleConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/UpdateInstanceConsoleConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateInstanceConsoleConnectionResponse>
                transformer =
                        UpdateInstanceConsoleConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInstanceConsoleConnectionRequest,
                        UpdateInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceConsoleConnectionRequest,
                                UpdateInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<UpdateInstanceConsoleConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceConsoleConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceConsoleConnectionRequest,
                    UpdateInstanceConsoleConnectionResponse>(
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
    public java.util.concurrent.Future<UpdateInstanceMaintenanceEventResponse>
            updateInstanceMaintenanceEvent(
                    UpdateInstanceMaintenanceEventRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceMaintenanceEventRequest,
                                    UpdateInstanceMaintenanceEventResponse>
                            handler) {
        LOG.trace("Called async updateInstanceMaintenanceEvent");
        final UpdateInstanceMaintenanceEventRequest interceptedRequest =
                UpdateInstanceMaintenanceEventConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceMaintenanceEventConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateInstanceMaintenanceEvent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceMaintenanceEvent/UpdateInstanceMaintenanceEvent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateInstanceMaintenanceEventResponse>
                transformer =
                        UpdateInstanceMaintenanceEventConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInstanceMaintenanceEventRequest,
                        UpdateInstanceMaintenanceEventResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceMaintenanceEventRequest,
                                UpdateInstanceMaintenanceEventResponse>,
                        java.util.concurrent.Future<UpdateInstanceMaintenanceEventResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceMaintenanceEventDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceMaintenanceEventRequest, UpdateInstanceMaintenanceEventResponse>(
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
    public java.util.concurrent.Future<UpdateVolumeAttachmentResponse> updateVolumeAttachment(
            UpdateVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async updateVolumeAttachment");
        final UpdateVolumeAttachmentRequest interceptedRequest =
                UpdateVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Compute",
                        "UpdateVolumeAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/UpdateVolumeAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVolumeAttachmentResponse>
                transformer =
                        UpdateVolumeAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>,
                        java.util.concurrent.Future<UpdateVolumeAttachmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>(
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
