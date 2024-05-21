/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.internal.http.*;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Async client implementation for ManagedInstance service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ManagedInstanceAsyncClient implements ManagedInstanceAsync {
    /**
     * Service instance for ManagedInstance.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEDINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedInstanceAsyncClient.class);

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
    public ManagedInstanceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
    public ManagedInstanceAsyncClient(
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
                    Builder, ManagedInstanceAsyncClient> {
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
        public ManagedInstanceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ManagedInstanceAsyncClient(
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
    public java.util.concurrent.Future<AttachProfileToManagedInstanceResponse>
            attachProfileToManagedInstance(
                    AttachProfileToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachProfileToManagedInstanceRequest,
                                    AttachProfileToManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async attachProfileToManagedInstance");
        final AttachProfileToManagedInstanceRequest interceptedRequest =
                AttachProfileToManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachProfileToManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "AttachProfileToManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/AttachProfileToManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AttachProfileToManagedInstanceResponse>
                transformer =
                        AttachProfileToManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AttachProfileToManagedInstanceRequest,
                        AttachProfileToManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachProfileToManagedInstanceRequest,
                                AttachProfileToManagedInstanceResponse>,
                        java.util.concurrent.Future<AttachProfileToManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachProfileToManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachProfileToManagedInstanceRequest, AttachProfileToManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceResponse>
            attachSoftwareSourcesToManagedInstance(
                    AttachSoftwareSourcesToManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToManagedInstanceRequest,
                                    AttachSoftwareSourcesToManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async attachSoftwareSourcesToManagedInstance");
        final AttachSoftwareSourcesToManagedInstanceRequest interceptedRequest =
                AttachSoftwareSourcesToManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachSoftwareSourcesToManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "AttachSoftwareSourcesToManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/AttachSoftwareSourcesToManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AttachSoftwareSourcesToManagedInstanceResponse>
                transformer =
                        AttachSoftwareSourcesToManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AttachSoftwareSourcesToManagedInstanceRequest,
                        AttachSoftwareSourcesToManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachSoftwareSourcesToManagedInstanceRequest,
                                AttachSoftwareSourcesToManagedInstanceResponse>,
                        java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAttachSoftwareSourcesToManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachSoftwareSourcesToManagedInstanceRequest,
                    AttachSoftwareSourcesToManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedInstanceResponse> deleteManagedInstance(
            DeleteManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedInstanceRequest, DeleteManagedInstanceResponse>
                    handler) {
        LOG.trace("Called async deleteManagedInstance");
        final DeleteManagedInstanceRequest interceptedRequest =
                DeleteManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "DeleteManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DeleteManagedInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteManagedInstanceResponse>
                transformer =
                        DeleteManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteManagedInstanceRequest, DeleteManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedInstanceRequest, DeleteManagedInstanceResponse>,
                        java.util.concurrent.Future<DeleteManagedInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedInstanceRequest, DeleteManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachProfileFromManagedInstanceResponse>
            detachProfileFromManagedInstance(
                    DetachProfileFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachProfileFromManagedInstanceRequest,
                                    DetachProfileFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async detachProfileFromManagedInstance");
        final DetachProfileFromManagedInstanceRequest interceptedRequest =
                DetachProfileFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachProfileFromManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "DetachProfileFromManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DetachProfileFromManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DetachProfileFromManagedInstanceResponse>
                transformer =
                        DetachProfileFromManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetachProfileFromManagedInstanceRequest,
                        DetachProfileFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachProfileFromManagedInstanceRequest,
                                DetachProfileFromManagedInstanceResponse>,
                        java.util.concurrent.Future<DetachProfileFromManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachProfileFromManagedInstanceRequest,
                    DetachProfileFromManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachSoftwareSourcesFromManagedInstanceResponse>
            detachSoftwareSourcesFromManagedInstance(
                    DetachSoftwareSourcesFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromManagedInstanceRequest,
                                    DetachSoftwareSourcesFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async detachSoftwareSourcesFromManagedInstance");
        final DetachSoftwareSourcesFromManagedInstanceRequest interceptedRequest =
                DetachSoftwareSourcesFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachSoftwareSourcesFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "DetachSoftwareSourcesFromManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DetachSoftwareSourcesFromManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DetachSoftwareSourcesFromManagedInstanceResponse>
                transformer =
                        DetachSoftwareSourcesFromManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetachSoftwareSourcesFromManagedInstanceRequest,
                        DetachSoftwareSourcesFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachSoftwareSourcesFromManagedInstanceRequest,
                                DetachSoftwareSourcesFromManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                DetachSoftwareSourcesFromManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDetachSoftwareSourcesFromManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachSoftwareSourcesFromManagedInstanceRequest,
                    DetachSoftwareSourcesFromManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>
            disableModuleStreamOnManagedInstance(
                    DisableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceRequest,
                                    DisableModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async disableModuleStreamOnManagedInstance");
        final DisableModuleStreamOnManagedInstanceRequest interceptedRequest =
                DisableModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "DisableModuleStreamOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DisableModuleStreamOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableModuleStreamOnManagedInstanceResponse>
                transformer =
                        DisableModuleStreamOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableModuleStreamOnManagedInstanceRequest,
                        DisableModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableModuleStreamOnManagedInstanceRequest,
                                DisableModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableModuleStreamOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableModuleStreamOnManagedInstanceRequest,
                    DisableModuleStreamOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>
            enableModuleStreamOnManagedInstance(
                    EnableModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceRequest,
                                    EnableModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async enableModuleStreamOnManagedInstance");
        final EnableModuleStreamOnManagedInstanceRequest interceptedRequest =
                EnableModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "EnableModuleStreamOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/EnableModuleStreamOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableModuleStreamOnManagedInstanceResponse>
                transformer =
                        EnableModuleStreamOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableModuleStreamOnManagedInstanceRequest,
                        EnableModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableModuleStreamOnManagedInstanceRequest,
                                EnableModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableModuleStreamOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableModuleStreamOnManagedInstanceRequest,
                    EnableModuleStreamOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler) {
        LOG.trace("Called async getManagedInstance");
        final GetManagedInstanceRequest interceptedRequest =
                GetManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "GetManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/GetManagedInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetManagedInstanceResponse>
                transformer =
                        GetManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetManagedInstanceRequest, GetManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedInstanceRequest, GetManagedInstanceResponse>,
                        java.util.concurrent.Future<GetManagedInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedInstanceRequest, GetManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWindowsUpdateResponse> getWindowsUpdate(
            GetWindowsUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                    handler) {
        LOG.trace("Called async getWindowsUpdate");
        final GetWindowsUpdateRequest interceptedRequest =
                GetWindowsUpdateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsUpdateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "GetWindowsUpdate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/WindowsUpdate/GetWindowsUpdate");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWindowsUpdateResponse>
                transformer =
                        GetWindowsUpdateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWindowsUpdateRequest, GetWindowsUpdateResponse>,
                        java.util.concurrent.Future<GetWindowsUpdateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWindowsUpdateRequest, GetWindowsUpdateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
            installAllWindowsUpdatesOnManagedInstancesInCompartment(
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest,
                                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
                            handler) {
        LOG.trace("Called async installAllWindowsUpdatesOnManagedInstancesInCompartment");
        final InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest interceptedRequest =
                InstallAllWindowsUpdatesOnManagedInstancesInCompartmentConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllWindowsUpdatesOnManagedInstancesInCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "InstallAllWindowsUpdatesOnManagedInstancesInCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallAllWindowsUpdatesOnManagedInstancesInCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
                transformer =
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest,
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest,
                                InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>,
                        java.util.concurrent.Future<
                                InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getInstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest,
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceResponse>
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceRequest,
                                    InstallModuleStreamProfileOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installModuleStreamProfileOnManagedInstance");
        final InstallModuleStreamProfileOnManagedInstanceRequest interceptedRequest =
                InstallModuleStreamProfileOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallModuleStreamProfileOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "InstallModuleStreamProfileOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallModuleStreamProfileOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        InstallModuleStreamProfileOnManagedInstanceResponse>
                transformer =
                        InstallModuleStreamProfileOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        InstallModuleStreamProfileOnManagedInstanceRequest,
                        InstallModuleStreamProfileOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallModuleStreamProfileOnManagedInstanceRequest,
                                InstallModuleStreamProfileOnManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                InstallModuleStreamProfileOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getInstallModuleStreamProfileOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallModuleStreamProfileOnManagedInstanceRequest,
                    InstallModuleStreamProfileOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<InstallPackagesOnManagedInstanceResponse>
            installPackagesOnManagedInstance(
                    InstallPackagesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackagesOnManagedInstanceRequest,
                                    InstallPackagesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installPackagesOnManagedInstance");
        final InstallPackagesOnManagedInstanceRequest interceptedRequest =
                InstallPackagesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPackagesOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "InstallPackagesOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallPackagesOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, InstallPackagesOnManagedInstanceResponse>
                transformer =
                        InstallPackagesOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        InstallPackagesOnManagedInstanceRequest,
                        InstallPackagesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallPackagesOnManagedInstanceRequest,
                                InstallPackagesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<InstallPackagesOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstallPackagesOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallPackagesOnManagedInstanceRequest,
                    InstallPackagesOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<InstallWindowsUpdatesOnManagedInstanceResponse>
            installWindowsUpdatesOnManagedInstance(
                    InstallWindowsUpdatesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdatesOnManagedInstanceRequest,
                                    InstallWindowsUpdatesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async installWindowsUpdatesOnManagedInstance");
        final InstallWindowsUpdatesOnManagedInstanceRequest interceptedRequest =
                InstallWindowsUpdatesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallWindowsUpdatesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "InstallWindowsUpdatesOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallWindowsUpdatesOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, InstallWindowsUpdatesOnManagedInstanceResponse>
                transformer =
                        InstallWindowsUpdatesOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        InstallWindowsUpdatesOnManagedInstanceRequest,
                        InstallWindowsUpdatesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallWindowsUpdatesOnManagedInstanceRequest,
                                InstallWindowsUpdatesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<InstallWindowsUpdatesOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getInstallWindowsUpdatesOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallWindowsUpdatesOnManagedInstanceRequest,
                    InstallWindowsUpdatesOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceAvailablePackagesResponse>
            listManagedInstanceAvailablePackages(
                    ListManagedInstanceAvailablePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailablePackagesRequest,
                                    ListManagedInstanceAvailablePackagesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceAvailablePackages");
        final ListManagedInstanceAvailablePackagesRequest interceptedRequest =
                ListManagedInstanceAvailablePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceAvailablePackagesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailablePackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailablePackages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceAvailablePackagesResponse>
                transformer =
                        ListManagedInstanceAvailablePackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceAvailablePackagesRequest,
                        ListManagedInstanceAvailablePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceAvailablePackagesRequest,
                                ListManagedInstanceAvailablePackagesResponse>,
                        java.util.concurrent.Future<ListManagedInstanceAvailablePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceAvailablePackagesRequest,
                    ListManagedInstanceAvailablePackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceAvailableSoftwareSourcesResponse>
            listManagedInstanceAvailableSoftwareSources(
                    ListManagedInstanceAvailableSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailableSoftwareSourcesRequest,
                                    ListManagedInstanceAvailableSoftwareSourcesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceAvailableSoftwareSources");
        final ListManagedInstanceAvailableSoftwareSourcesRequest interceptedRequest =
                ListManagedInstanceAvailableSoftwareSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceAvailableSoftwareSourcesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailableSoftwareSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailableSoftwareSources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListManagedInstanceAvailableSoftwareSourcesResponse>
                transformer =
                        ListManagedInstanceAvailableSoftwareSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceAvailableSoftwareSourcesRequest,
                        ListManagedInstanceAvailableSoftwareSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceAvailableSoftwareSourcesRequest,
                                ListManagedInstanceAvailableSoftwareSourcesResponse>,
                        java.util.concurrent.Future<
                                ListManagedInstanceAvailableSoftwareSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceAvailableSoftwareSourcesRequest,
                    ListManagedInstanceAvailableSoftwareSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceAvailableWindowsUpdatesResponse>
            listManagedInstanceAvailableWindowsUpdates(
                    ListManagedInstanceAvailableWindowsUpdatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailableWindowsUpdatesRequest,
                                    ListManagedInstanceAvailableWindowsUpdatesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceAvailableWindowsUpdates");
        final ListManagedInstanceAvailableWindowsUpdatesRequest interceptedRequest =
                ListManagedInstanceAvailableWindowsUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceAvailableWindowsUpdatesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailableWindowsUpdates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailableWindowsUpdates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListManagedInstanceAvailableWindowsUpdatesResponse>
                transformer =
                        ListManagedInstanceAvailableWindowsUpdatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceAvailableWindowsUpdatesRequest,
                        ListManagedInstanceAvailableWindowsUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceAvailableWindowsUpdatesRequest,
                                ListManagedInstanceAvailableWindowsUpdatesResponse>,
                        java.util.concurrent.Future<
                                ListManagedInstanceAvailableWindowsUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceAvailableWindowsUpdatesRequest,
                    ListManagedInstanceAvailableWindowsUpdatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceErrataResponse> listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                    handler) {
        LOG.trace("Called async listManagedInstanceErrata");
        final ListManagedInstanceErrataRequest interceptedRequest =
                ListManagedInstanceErrataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceErrataConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceErrata",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceErrata");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceErrataResponse>
                transformer =
                        ListManagedInstanceErrataConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceErrataRequest,
                                ListManagedInstanceErrataResponse>,
                        java.util.concurrent.Future<ListManagedInstanceErrataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceInstalledPackagesResponse>
            listManagedInstanceInstalledPackages(
                    ListManagedInstanceInstalledPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceInstalledPackagesRequest,
                                    ListManagedInstanceInstalledPackagesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceInstalledPackages");
        final ListManagedInstanceInstalledPackagesRequest interceptedRequest =
                ListManagedInstanceInstalledPackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceInstalledPackagesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceInstalledPackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceInstalledPackages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceInstalledPackagesResponse>
                transformer =
                        ListManagedInstanceInstalledPackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceInstalledPackagesRequest,
                        ListManagedInstanceInstalledPackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceInstalledPackagesRequest,
                                ListManagedInstanceInstalledPackagesResponse>,
                        java.util.concurrent.Future<ListManagedInstanceInstalledPackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceInstalledPackagesRequest,
                    ListManagedInstanceInstalledPackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceInstalledWindowsUpdatesResponse>
            listManagedInstanceInstalledWindowsUpdates(
                    ListManagedInstanceInstalledWindowsUpdatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceInstalledWindowsUpdatesRequest,
                                    ListManagedInstanceInstalledWindowsUpdatesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceInstalledWindowsUpdates");
        final ListManagedInstanceInstalledWindowsUpdatesRequest interceptedRequest =
                ListManagedInstanceInstalledWindowsUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceInstalledWindowsUpdatesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceInstalledWindowsUpdates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceInstalledWindowsUpdates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListManagedInstanceInstalledWindowsUpdatesResponse>
                transformer =
                        ListManagedInstanceInstalledWindowsUpdatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceInstalledWindowsUpdatesRequest,
                        ListManagedInstanceInstalledWindowsUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceInstalledWindowsUpdatesRequest,
                                ListManagedInstanceInstalledWindowsUpdatesResponse>,
                        java.util.concurrent.Future<
                                ListManagedInstanceInstalledWindowsUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceInstalledWindowsUpdatesRequest,
                    ListManagedInstanceInstalledWindowsUpdatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceModulesResponse>
            listManagedInstanceModules(
                    ListManagedInstanceModulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceModulesRequest,
                                    ListManagedInstanceModulesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceModules");
        final ListManagedInstanceModulesRequest interceptedRequest =
                ListManagedInstanceModulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceModulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceModules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceModules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceModulesResponse>
                transformer =
                        ListManagedInstanceModulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceModulesRequest, ListManagedInstanceModulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceModulesRequest,
                                ListManagedInstanceModulesResponse>,
                        java.util.concurrent.Future<ListManagedInstanceModulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceModulesRequest, ListManagedInstanceModulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstanceUpdatablePackagesResponse>
            listManagedInstanceUpdatablePackages(
                    ListManagedInstanceUpdatablePackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceUpdatablePackagesRequest,
                                    ListManagedInstanceUpdatablePackagesResponse>
                            handler) {
        LOG.trace("Called async listManagedInstanceUpdatablePackages");
        final ListManagedInstanceUpdatablePackagesRequest interceptedRequest =
                ListManagedInstanceUpdatablePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceUpdatablePackagesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceUpdatablePackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceUpdatablePackages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceUpdatablePackagesResponse>
                transformer =
                        ListManagedInstanceUpdatablePackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstanceUpdatablePackagesRequest,
                        ListManagedInstanceUpdatablePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstanceUpdatablePackagesRequest,
                                ListManagedInstanceUpdatablePackagesResponse>,
                        java.util.concurrent.Future<ListManagedInstanceUpdatablePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstanceUpdatablePackagesRequest,
                    ListManagedInstanceUpdatablePackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler) {
        LOG.trace("Called async listManagedInstances");
        final ListManagedInstancesRequest interceptedRequest =
                ListManagedInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListManagedInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstances");
        final java.util.function.Function<javax.ws.rs.core.Response, ListManagedInstancesResponse>
                transformer =
                        ListManagedInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedInstancesRequest, ListManagedInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedInstancesRequest, ListManagedInstancesResponse>,
                        java.util.concurrent.Future<ListManagedInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedInstancesRequest, ListManagedInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWindowsUpdatesResponse> listWindowsUpdates(
            ListWindowsUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                    handler) {
        LOG.trace("Called async listWindowsUpdates");
        final ListWindowsUpdatesRequest interceptedRequest =
                ListWindowsUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWindowsUpdatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ListWindowsUpdates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/WindowsUpdateCollection/ListWindowsUpdates");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWindowsUpdatesResponse>
                transformer =
                        ListWindowsUpdatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>,
                        java.util.concurrent.Future<ListWindowsUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>
            manageModuleStreamsOnManagedInstance(
                    ManageModuleStreamsOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceRequest,
                                    ManageModuleStreamsOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async manageModuleStreamsOnManagedInstance");
        final ManageModuleStreamsOnManagedInstanceRequest interceptedRequest =
                ManageModuleStreamsOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ManageModuleStreamsOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "ManageModuleStreamsOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ManageModuleStreamsOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ManageModuleStreamsOnManagedInstanceResponse>
                transformer =
                        ManageModuleStreamsOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ManageModuleStreamsOnManagedInstanceRequest,
                        ManageModuleStreamsOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ManageModuleStreamsOnManagedInstanceRequest,
                                ManageModuleStreamsOnManagedInstanceResponse>,
                        java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getManageModuleStreamsOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ManageModuleStreamsOnManagedInstanceRequest,
                    ManageModuleStreamsOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshSoftwareOnManagedInstanceResponse>
            refreshSoftwareOnManagedInstance(
                    RefreshSoftwareOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshSoftwareOnManagedInstanceRequest,
                                    RefreshSoftwareOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async refreshSoftwareOnManagedInstance");
        final RefreshSoftwareOnManagedInstanceRequest interceptedRequest =
                RefreshSoftwareOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshSoftwareOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "RefreshSoftwareOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RefreshSoftwareOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshSoftwareOnManagedInstanceResponse>
                transformer =
                        RefreshSoftwareOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshSoftwareOnManagedInstanceRequest,
                        RefreshSoftwareOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshSoftwareOnManagedInstanceRequest,
                                RefreshSoftwareOnManagedInstanceResponse>,
                        java.util.concurrent.Future<RefreshSoftwareOnManagedInstanceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshSoftwareOnManagedInstanceRequest,
                    RefreshSoftwareOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceResponse>
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async removeModuleStreamProfileFromManagedInstance");
        final RemoveModuleStreamProfileFromManagedInstanceRequest interceptedRequest =
                RemoveModuleStreamProfileFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveModuleStreamProfileFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "RemoveModuleStreamProfileFromManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RemoveModuleStreamProfileFromManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RemoveModuleStreamProfileFromManagedInstanceResponse>
                transformer =
                        RemoveModuleStreamProfileFromManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveModuleStreamProfileFromManagedInstanceRequest,
                        RemoveModuleStreamProfileFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveModuleStreamProfileFromManagedInstanceRequest,
                                RemoveModuleStreamProfileFromManagedInstanceResponse>,
                        java.util.concurrent.Future<
                                RemoveModuleStreamProfileFromManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRemoveModuleStreamProfileFromManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                    RemoveModuleStreamProfileFromManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemovePackagesFromManagedInstanceResponse>
            removePackagesFromManagedInstance(
                    RemovePackagesFromManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromManagedInstanceRequest,
                                    RemovePackagesFromManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async removePackagesFromManagedInstance");
        final RemovePackagesFromManagedInstanceRequest interceptedRequest =
                RemovePackagesFromManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePackagesFromManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "RemovePackagesFromManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RemovePackagesFromManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemovePackagesFromManagedInstanceResponse>
                transformer =
                        RemovePackagesFromManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemovePackagesFromManagedInstanceRequest,
                        RemovePackagesFromManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemovePackagesFromManagedInstanceRequest,
                                RemovePackagesFromManagedInstanceResponse>,
                        java.util.concurrent.Future<RemovePackagesFromManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemovePackagesFromManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemovePackagesFromManagedInstanceRequest,
                    RemovePackagesFromManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>
            switchModuleStreamOnManagedInstance(
                    SwitchModuleStreamOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceRequest,
                                    SwitchModuleStreamOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async switchModuleStreamOnManagedInstance");
        final SwitchModuleStreamOnManagedInstanceRequest interceptedRequest =
                SwitchModuleStreamOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchModuleStreamOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "SwitchModuleStreamOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/SwitchModuleStreamOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SwitchModuleStreamOnManagedInstanceResponse>
                transformer =
                        SwitchModuleStreamOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SwitchModuleStreamOnManagedInstanceRequest,
                        SwitchModuleStreamOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SwitchModuleStreamOnManagedInstanceRequest,
                                SwitchModuleStreamOnManagedInstanceResponse>,
                        java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSwitchModuleStreamOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SwitchModuleStreamOnManagedInstanceRequest,
                    SwitchModuleStreamOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
            updateAllPackagesOnManagedInstancesInCompartment(
                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest,
                                    UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
                            handler) {
        LOG.trace("Called async updateAllPackagesOnManagedInstancesInCompartment");
        final UpdateAllPackagesOnManagedInstancesInCompartmentRequest interceptedRequest =
                UpdateAllPackagesOnManagedInstancesInCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAllPackagesOnManagedInstancesInCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "UpdateAllPackagesOnManagedInstancesInCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdateAllPackagesOnManagedInstancesInCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
                transformer =
                        UpdateAllPackagesOnManagedInstancesInCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAllPackagesOnManagedInstancesInCompartmentRequest,
                        UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAllPackagesOnManagedInstancesInCompartmentRequest,
                                UpdateAllPackagesOnManagedInstancesInCompartmentResponse>,
                        java.util.concurrent.Future<
                                UpdateAllPackagesOnManagedInstancesInCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateAllPackagesOnManagedInstancesInCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest,
                    UpdateAllPackagesOnManagedInstancesInCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler) {
        LOG.trace("Called async updateManagedInstance");
        final UpdateManagedInstanceRequest interceptedRequest =
                UpdateManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "UpdateManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdateManagedInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateManagedInstanceResponse>
                transformer =
                        UpdateManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>,
                        java.util.concurrent.Future<UpdateManagedInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePackagesOnManagedInstanceResponse>
            updatePackagesOnManagedInstance(
                    UpdatePackagesOnManagedInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePackagesOnManagedInstanceRequest,
                                    UpdatePackagesOnManagedInstanceResponse>
                            handler) {
        LOG.trace("Called async updatePackagesOnManagedInstance");
        final UpdatePackagesOnManagedInstanceRequest interceptedRequest =
                UpdatePackagesOnManagedInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePackagesOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ManagedInstance",
                        "UpdatePackagesOnManagedInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdatePackagesOnManagedInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdatePackagesOnManagedInstanceResponse>
                transformer =
                        UpdatePackagesOnManagedInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdatePackagesOnManagedInstanceRequest,
                        UpdatePackagesOnManagedInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePackagesOnManagedInstanceRequest,
                                UpdatePackagesOnManagedInstanceResponse>,
                        java.util.concurrent.Future<UpdatePackagesOnManagedInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePackagesOnManagedInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePackagesOnManagedInstanceRequest,
                    UpdatePackagesOnManagedInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
