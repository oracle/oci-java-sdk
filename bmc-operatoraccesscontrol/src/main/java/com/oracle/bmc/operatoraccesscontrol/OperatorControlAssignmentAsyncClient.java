/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.internal.http.*;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Async client implementation for OperatorControlAssignment service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlAssignmentAsyncClient implements OperatorControlAssignmentAsync {
    /**
     * Service instance for OperatorControlAssignment.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATORCONTROLASSIGNMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperatorControlAssignmentAsyncClient.class);

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
    public OperatorControlAssignmentAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
                    Builder, OperatorControlAssignmentAsyncClient> {
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
        public OperatorControlAssignmentAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new OperatorControlAssignmentAsyncClient(
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
    public java.util.concurrent.Future<ChangeOperatorControlAssignmentCompartmentResponse>
            changeOperatorControlAssignmentCompartment(
                    ChangeOperatorControlAssignmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperatorControlAssignmentCompartmentRequest,
                                    ChangeOperatorControlAssignmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeOperatorControlAssignmentCompartment");
        final ChangeOperatorControlAssignmentCompartmentRequest interceptedRequest =
                ChangeOperatorControlAssignmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOperatorControlAssignmentCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "ChangeOperatorControlAssignmentCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeOperatorControlAssignmentCompartmentResponse>
                transformer =
                        ChangeOperatorControlAssignmentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeOperatorControlAssignmentCompartmentRequest,
                        ChangeOperatorControlAssignmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeOperatorControlAssignmentCompartmentRequest,
                                ChangeOperatorControlAssignmentCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeOperatorControlAssignmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeOperatorControlAssignmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeOperatorControlAssignmentCompartmentRequest,
                    ChangeOperatorControlAssignmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOperatorControlAssignmentResponse>
            createOperatorControlAssignment(
                    CreateOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperatorControlAssignmentRequest,
                                    CreateOperatorControlAssignmentResponse>
                            handler) {
        LOG.trace("Called async createOperatorControlAssignment");
        final CreateOperatorControlAssignmentRequest interceptedRequest =
                CreateOperatorControlAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOperatorControlAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "CreateOperatorControlAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOperatorControlAssignmentResponse>
                transformer =
                        CreateOperatorControlAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOperatorControlAssignmentRequest,
                        CreateOperatorControlAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOperatorControlAssignmentRequest,
                                CreateOperatorControlAssignmentResponse>,
                        java.util.concurrent.Future<CreateOperatorControlAssignmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOperatorControlAssignmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOperatorControlAssignmentRequest,
                    CreateOperatorControlAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOperatorControlAssignmentResponse>
            deleteOperatorControlAssignment(
                    DeleteOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperatorControlAssignmentRequest,
                                    DeleteOperatorControlAssignmentResponse>
                            handler) {
        LOG.trace("Called async deleteOperatorControlAssignment");
        final DeleteOperatorControlAssignmentRequest interceptedRequest =
                DeleteOperatorControlAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOperatorControlAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "DeleteOperatorControlAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOperatorControlAssignmentResponse>
                transformer =
                        DeleteOperatorControlAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOperatorControlAssignmentRequest,
                        DeleteOperatorControlAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOperatorControlAssignmentRequest,
                                DeleteOperatorControlAssignmentResponse>,
                        java.util.concurrent.Future<DeleteOperatorControlAssignmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOperatorControlAssignmentRequest,
                    DeleteOperatorControlAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentValidationStatusResponse>
            getAssignmentValidationStatus(
                    GetAssignmentValidationStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAssignmentValidationStatusRequest,
                                    GetAssignmentValidationStatusResponse>
                            handler) {
        LOG.trace("Called async getAssignmentValidationStatus");
        final GetAssignmentValidationStatusRequest interceptedRequest =
                GetAssignmentValidationStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAssignmentValidationStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "GetAssignmentValidationStatus",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAssignmentValidationStatusResponse>
                transformer =
                        GetAssignmentValidationStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAssignmentValidationStatusRequest, GetAssignmentValidationStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAssignmentValidationStatusRequest,
                                GetAssignmentValidationStatusResponse>,
                        java.util.concurrent.Future<GetAssignmentValidationStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAssignmentValidationStatusRequest, GetAssignmentValidationStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOperatorControlAssignmentResponse>
            getOperatorControlAssignment(
                    GetOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOperatorControlAssignmentRequest,
                                    GetOperatorControlAssignmentResponse>
                            handler) {
        LOG.trace("Called async getOperatorControlAssignment");
        final GetOperatorControlAssignmentRequest interceptedRequest =
                GetOperatorControlAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOperatorControlAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "GetOperatorControlAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOperatorControlAssignmentResponse>
                transformer =
                        GetOperatorControlAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOperatorControlAssignmentRequest, GetOperatorControlAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOperatorControlAssignmentRequest,
                                GetOperatorControlAssignmentResponse>,
                        java.util.concurrent.Future<GetOperatorControlAssignmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOperatorControlAssignmentRequest, GetOperatorControlAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOperatorControlAssignmentsResponse>
            listOperatorControlAssignments(
                    ListOperatorControlAssignmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOperatorControlAssignmentsRequest,
                                    ListOperatorControlAssignmentsResponse>
                            handler) {
        LOG.trace("Called async listOperatorControlAssignments");
        final ListOperatorControlAssignmentsRequest interceptedRequest =
                ListOperatorControlAssignmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOperatorControlAssignmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "ListOperatorControlAssignments",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOperatorControlAssignmentsResponse>
                transformer =
                        ListOperatorControlAssignmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOperatorControlAssignmentsRequest,
                        ListOperatorControlAssignmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOperatorControlAssignmentsRequest,
                                ListOperatorControlAssignmentsResponse>,
                        java.util.concurrent.Future<ListOperatorControlAssignmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOperatorControlAssignmentsRequest, ListOperatorControlAssignmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOperatorControlAssignmentResponse>
            updateOperatorControlAssignment(
                    UpdateOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperatorControlAssignmentRequest,
                                    UpdateOperatorControlAssignmentResponse>
                            handler) {
        LOG.trace("Called async updateOperatorControlAssignment");
        final UpdateOperatorControlAssignmentRequest interceptedRequest =
                UpdateOperatorControlAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOperatorControlAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "UpdateOperatorControlAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateOperatorControlAssignmentResponse>
                transformer =
                        UpdateOperatorControlAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOperatorControlAssignmentRequest,
                        UpdateOperatorControlAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOperatorControlAssignmentRequest,
                                UpdateOperatorControlAssignmentResponse>,
                        java.util.concurrent.Future<UpdateOperatorControlAssignmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOperatorControlAssignmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOperatorControlAssignmentRequest,
                    UpdateOperatorControlAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateOperatorAssignmentResponse>
            validateOperatorAssignment(
                    ValidateOperatorAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateOperatorAssignmentRequest,
                                    ValidateOperatorAssignmentResponse>
                            handler) {
        LOG.trace("Called async validateOperatorAssignment");
        final ValidateOperatorAssignmentRequest interceptedRequest =
                ValidateOperatorAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateOperatorAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperatorControlAssignment",
                        "ValidateOperatorAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateOperatorAssignmentResponse>
                transformer =
                        ValidateOperatorAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateOperatorAssignmentRequest, ValidateOperatorAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateOperatorAssignmentRequest,
                                ValidateOperatorAssignmentResponse>,
                        java.util.concurrent.Future<ValidateOperatorAssignmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getValidateOperatorAssignmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateOperatorAssignmentRequest, ValidateOperatorAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
