/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.internal.http.*;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

/**
 * Async client implementation for TransferAppliance service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class TransferApplianceAsyncClient implements TransferApplianceAsync {
    /**
     * Service instance for TransferAppliance.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERAPPLIANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferApplianceAsyncClient.class);

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
    public TransferApplianceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
                    Builder, TransferApplianceAsyncClient> {
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
        public TransferApplianceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new TransferApplianceAsyncClient(
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
    public java.util.concurrent.Future<CreateTransferApplianceResponse> createTransferAppliance(
            CreateTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferApplianceRequest, CreateTransferApplianceResponse>
                    handler) {
        LOG.trace("Called async createTransferAppliance");
        final CreateTransferApplianceRequest interceptedRequest =
                CreateTransferApplianceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTransferApplianceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "CreateTransferAppliance",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTransferApplianceResponse>
                transformer =
                        CreateTransferApplianceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTransferApplianceRequest, CreateTransferApplianceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTransferApplianceRequest, CreateTransferApplianceResponse>,
                        java.util.concurrent.Future<CreateTransferApplianceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTransferApplianceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTransferApplianceRequest, CreateTransferApplianceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTransferApplianceAdminCredentialsResponse>
            createTransferApplianceAdminCredentials(
                    CreateTransferApplianceAdminCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTransferApplianceAdminCredentialsRequest,
                                    CreateTransferApplianceAdminCredentialsResponse>
                            handler) {
        LOG.trace("Called async createTransferApplianceAdminCredentials");
        final CreateTransferApplianceAdminCredentialsRequest interceptedRequest =
                CreateTransferApplianceAdminCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTransferApplianceAdminCredentialsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "CreateTransferApplianceAdminCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTransferApplianceAdminCredentialsResponse>
                transformer =
                        CreateTransferApplianceAdminCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTransferApplianceAdminCredentialsRequest,
                        CreateTransferApplianceAdminCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTransferApplianceAdminCredentialsRequest,
                                CreateTransferApplianceAdminCredentialsResponse>,
                        java.util.concurrent.Future<
                                CreateTransferApplianceAdminCredentialsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAdminPublicKey(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTransferApplianceAdminCredentialsRequest,
                    CreateTransferApplianceAdminCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTransferApplianceResponse> deleteTransferAppliance(
            DeleteTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>
                    handler) {
        LOG.trace("Called async deleteTransferAppliance");
        final DeleteTransferApplianceRequest interceptedRequest =
                DeleteTransferApplianceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTransferApplianceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "DeleteTransferAppliance",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteTransferApplianceResponse>
                transformer =
                        DeleteTransferApplianceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>,
                        java.util.concurrent.Future<DeleteTransferApplianceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceResponse> getTransferAppliance(
            GetTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTransferApplianceRequest, GetTransferApplianceResponse>
                    handler) {
        LOG.trace("Called async getTransferAppliance");
        final GetTransferApplianceRequest interceptedRequest =
                GetTransferApplianceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTransferApplianceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "GetTransferAppliance",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTransferApplianceResponse>
                transformer =
                        GetTransferApplianceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTransferApplianceRequest, GetTransferApplianceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTransferApplianceRequest, GetTransferApplianceResponse>,
                        java.util.concurrent.Future<GetTransferApplianceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTransferApplianceRequest, GetTransferApplianceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceCertificateAuthorityCertificateResponse>
            getTransferApplianceCertificateAuthorityCertificate(
                    GetTransferApplianceCertificateAuthorityCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceCertificateAuthorityCertificateRequest,
                                    GetTransferApplianceCertificateAuthorityCertificateResponse>
                            handler) {
        LOG.trace("Called async getTransferApplianceCertificateAuthorityCertificate");
        final GetTransferApplianceCertificateAuthorityCertificateRequest interceptedRequest =
                GetTransferApplianceCertificateAuthorityCertificateConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTransferApplianceCertificateAuthorityCertificateConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "GetTransferApplianceCertificateAuthorityCertificate",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetTransferApplianceCertificateAuthorityCertificateResponse>
                transformer =
                        GetTransferApplianceCertificateAuthorityCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTransferApplianceCertificateAuthorityCertificateRequest,
                        GetTransferApplianceCertificateAuthorityCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTransferApplianceCertificateAuthorityCertificateRequest,
                                GetTransferApplianceCertificateAuthorityCertificateResponse>,
                        java.util.concurrent.Future<
                                GetTransferApplianceCertificateAuthorityCertificateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTransferApplianceCertificateAuthorityCertificateRequest,
                    GetTransferApplianceCertificateAuthorityCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceEncryptionPassphraseResponse>
            getTransferApplianceEncryptionPassphrase(
                    GetTransferApplianceEncryptionPassphraseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceEncryptionPassphraseRequest,
                                    GetTransferApplianceEncryptionPassphraseResponse>
                            handler) {
        LOG.trace("Called async getTransferApplianceEncryptionPassphrase");
        final GetTransferApplianceEncryptionPassphraseRequest interceptedRequest =
                GetTransferApplianceEncryptionPassphraseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTransferApplianceEncryptionPassphraseConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "GetTransferApplianceEncryptionPassphrase",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTransferApplianceEncryptionPassphraseResponse>
                transformer =
                        GetTransferApplianceEncryptionPassphraseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTransferApplianceEncryptionPassphraseRequest,
                        GetTransferApplianceEncryptionPassphraseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTransferApplianceEncryptionPassphraseRequest,
                                GetTransferApplianceEncryptionPassphraseResponse>,
                        java.util.concurrent.Future<
                                GetTransferApplianceEncryptionPassphraseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTransferApplianceEncryptionPassphraseRequest,
                    GetTransferApplianceEncryptionPassphraseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTransferAppliancesResponse> listTransferAppliances(
            ListTransferAppliancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTransferAppliancesRequest, ListTransferAppliancesResponse>
                    handler) {
        LOG.trace("Called async listTransferAppliances");
        final ListTransferAppliancesRequest interceptedRequest =
                ListTransferAppliancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTransferAppliancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "ListTransferAppliances",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTransferAppliancesResponse>
                transformer =
                        ListTransferAppliancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTransferAppliancesRequest, ListTransferAppliancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTransferAppliancesRequest, ListTransferAppliancesResponse>,
                        java.util.concurrent.Future<ListTransferAppliancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTransferAppliancesRequest, ListTransferAppliancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTransferApplianceResponse> updateTransferAppliance(
            UpdateTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>
                    handler) {
        LOG.trace("Called async updateTransferAppliance");
        final UpdateTransferApplianceRequest interceptedRequest =
                UpdateTransferApplianceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTransferApplianceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "TransferAppliance",
                        "UpdateTransferAppliance",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTransferApplianceResponse>
                transformer =
                        UpdateTransferApplianceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>,
                        java.util.concurrent.Future<UpdateTransferApplianceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTransferApplianceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
