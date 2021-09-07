/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.internal.http.*;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * Async client implementation for Database service. <br/>
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
@lombok.extern.slf4j.Slf4j
public class DatabaseAsyncClient implements DatabaseAsync {
    /**
     * Service instance for Database.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATABASE")
                    .serviceEndpointPrefix("database")
                    .serviceEndpointTemplate("https://database.{region}.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
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
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        configuration,
                        isNonBufferingApacheClient);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseAsyncClient> {
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
        public DatabaseAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DatabaseAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
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
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
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
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<ActivateExadataInfrastructureResponse>
            activateExadataInfrastructure(
                    ActivateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateExadataInfrastructureRequest,
                                    ActivateExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async activateExadataInfrastructure");
        final ActivateExadataInfrastructureRequest interceptedRequest =
                ActivateExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateExadataInfrastructureResponse>
                transformer = ActivateExadataInfrastructureConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ActivateExadataInfrastructureRequest, ActivateExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateExadataInfrastructureRequest,
                                ActivateExadataInfrastructureResponse>,
                        java.util.concurrent.Future<ActivateExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getActivateExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateExadataInfrastructureRequest, ActivateExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddStorageCapacityExadataInfrastructureResponse>
            addStorageCapacityExadataInfrastructure(
                    AddStorageCapacityExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddStorageCapacityExadataInfrastructureRequest,
                                    AddStorageCapacityExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async addStorageCapacityExadataInfrastructure");
        final AddStorageCapacityExadataInfrastructureRequest interceptedRequest =
                AddStorageCapacityExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddStorageCapacityExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddStorageCapacityExadataInfrastructureResponse>
                transformer = AddStorageCapacityExadataInfrastructureConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        AddStorageCapacityExadataInfrastructureRequest,
                        AddStorageCapacityExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddStorageCapacityExadataInfrastructureRequest,
                                AddStorageCapacityExadataInfrastructureResponse>,
                        java.util.concurrent.Future<
                                AddStorageCapacityExadataInfrastructureResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddStorageCapacityExadataInfrastructureRequest,
                    AddStorageCapacityExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AutonomousDatabaseManualRefreshResponse>
            autonomousDatabaseManualRefresh(
                    AutonomousDatabaseManualRefreshRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AutonomousDatabaseManualRefreshRequest,
                                    AutonomousDatabaseManualRefreshResponse>
                            handler) {
        LOG.trace("Called async autonomousDatabaseManualRefresh");
        final AutonomousDatabaseManualRefreshRequest interceptedRequest =
                AutonomousDatabaseManualRefreshConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AutonomousDatabaseManualRefreshConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AutonomousDatabaseManualRefreshResponse>
                transformer = AutonomousDatabaseManualRefreshConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        AutonomousDatabaseManualRefreshRequest,
                        AutonomousDatabaseManualRefreshResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AutonomousDatabaseManualRefreshRequest,
                                AutonomousDatabaseManualRefreshResponse>,
                        java.util.concurrent.Future<AutonomousDatabaseManualRefreshResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAutonomousDatabaseManualRefreshDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AutonomousDatabaseManualRefreshRequest,
                    AutonomousDatabaseManualRefreshResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousContainerDatabaseCompartmentResponse>
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                                    ChangeAutonomousContainerDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAutonomousContainerDatabaseCompartment");
        final ChangeAutonomousContainerDatabaseCompartmentRequest interceptedRequest =
                ChangeAutonomousContainerDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAutonomousContainerDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeAutonomousContainerDatabaseCompartmentResponse>
                transformer = ChangeAutonomousContainerDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAutonomousContainerDatabaseCompartmentRequest,
                        ChangeAutonomousContainerDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAutonomousContainerDatabaseCompartmentRequest,
                                ChangeAutonomousContainerDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeAutonomousContainerDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                    ChangeAutonomousContainerDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousDatabaseCompartmentResponse>
            changeAutonomousDatabaseCompartment(
                    ChangeAutonomousDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseCompartmentRequest,
                                    ChangeAutonomousDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAutonomousDatabaseCompartment");
        final ChangeAutonomousDatabaseCompartmentRequest interceptedRequest =
                ChangeAutonomousDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAutonomousDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAutonomousDatabaseCompartmentResponse>
                transformer = ChangeAutonomousDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAutonomousDatabaseCompartmentRequest,
                        ChangeAutonomousDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAutonomousDatabaseCompartmentRequest,
                                ChangeAutonomousDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAutonomousDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAutonomousDatabaseCompartmentRequest,
                    ChangeAutonomousDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousExadataInfrastructureCompartmentResponse>
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                                    ChangeAutonomousExadataInfrastructureCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAutonomousExadataInfrastructureCompartment");
        final ChangeAutonomousExadataInfrastructureCompartmentRequest interceptedRequest =
                ChangeAutonomousExadataInfrastructureCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAutonomousExadataInfrastructureCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeAutonomousExadataInfrastructureCompartmentResponse>
                transformer =
                        ChangeAutonomousExadataInfrastructureCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAutonomousExadataInfrastructureCompartmentRequest,
                        ChangeAutonomousExadataInfrastructureCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAutonomousExadataInfrastructureCompartmentRequest,
                                ChangeAutonomousExadataInfrastructureCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeAutonomousExadataInfrastructureCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                    ChangeAutonomousExadataInfrastructureCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAutonomousVmClusterCompartmentResponse>
            changeAutonomousVmClusterCompartment(
                    ChangeAutonomousVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousVmClusterCompartmentRequest,
                                    ChangeAutonomousVmClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAutonomousVmClusterCompartment");
        final ChangeAutonomousVmClusterCompartmentRequest interceptedRequest =
                ChangeAutonomousVmClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAutonomousVmClusterCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAutonomousVmClusterCompartmentResponse>
                transformer = ChangeAutonomousVmClusterCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAutonomousVmClusterCompartmentRequest,
                        ChangeAutonomousVmClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAutonomousVmClusterCompartmentRequest,
                                ChangeAutonomousVmClusterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAutonomousVmClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAutonomousVmClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAutonomousVmClusterCompartmentRequest,
                    ChangeAutonomousVmClusterCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBackupDestinationCompartmentResponse>
            changeBackupDestinationCompartment(
                    ChangeBackupDestinationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBackupDestinationCompartmentRequest,
                                    ChangeBackupDestinationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBackupDestinationCompartment");
        final ChangeBackupDestinationCompartmentRequest interceptedRequest =
                ChangeBackupDestinationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBackupDestinationCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeBackupDestinationCompartmentResponse>
                transformer = ChangeBackupDestinationCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBackupDestinationCompartmentRequest,
                        ChangeBackupDestinationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBackupDestinationCompartmentRequest,
                                ChangeBackupDestinationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBackupDestinationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBackupDestinationCompartmentRequest,
                    ChangeBackupDestinationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCloudExadataInfrastructureCompartmentResponse>
            changeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudExadataInfrastructureCompartmentRequest,
                                    ChangeCloudExadataInfrastructureCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCloudExadataInfrastructureCompartment");
        final ChangeCloudExadataInfrastructureCompartmentRequest interceptedRequest =
                ChangeCloudExadataInfrastructureCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCloudExadataInfrastructureCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeCloudExadataInfrastructureCompartmentResponse>
                transformer = ChangeCloudExadataInfrastructureCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCloudExadataInfrastructureCompartmentRequest,
                        ChangeCloudExadataInfrastructureCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCloudExadataInfrastructureCompartmentRequest,
                                ChangeCloudExadataInfrastructureCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeCloudExadataInfrastructureCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeCloudExadataInfrastructureCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCloudExadataInfrastructureCompartmentRequest,
                    ChangeCloudExadataInfrastructureCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCloudVmClusterCompartmentResponse>
            changeCloudVmClusterCompartment(
                    ChangeCloudVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudVmClusterCompartmentRequest,
                                    ChangeCloudVmClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCloudVmClusterCompartment");
        final ChangeCloudVmClusterCompartmentRequest interceptedRequest =
                ChangeCloudVmClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCloudVmClusterCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCloudVmClusterCompartmentResponse>
                transformer = ChangeCloudVmClusterCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCloudVmClusterCompartmentRequest,
                        ChangeCloudVmClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCloudVmClusterCompartmentRequest,
                                ChangeCloudVmClusterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCloudVmClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCloudVmClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCloudVmClusterCompartmentRequest,
                    ChangeCloudVmClusterCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseSoftwareImageCompartmentResponse>
            changeDatabaseSoftwareImageCompartment(
                    ChangeDatabaseSoftwareImageCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseSoftwareImageCompartmentRequest,
                                    ChangeDatabaseSoftwareImageCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseSoftwareImageCompartment");
        final ChangeDatabaseSoftwareImageCompartmentRequest interceptedRequest =
                ChangeDatabaseSoftwareImageCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseSoftwareImageCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseSoftwareImageCompartmentResponse>
                transformer = ChangeDatabaseSoftwareImageCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseSoftwareImageCompartmentRequest,
                        ChangeDatabaseSoftwareImageCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseSoftwareImageCompartmentRequest,
                                ChangeDatabaseSoftwareImageCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDatabaseSoftwareImageCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseSoftwareImageCompartmentRequest,
                    ChangeDatabaseSoftwareImageCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDbSystemCompartmentResponse> changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeDbSystemCompartment");
        final ChangeDbSystemCompartmentRequest interceptedRequest =
                ChangeDbSystemCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDbSystemCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDbSystemCompartmentResponse>
                transformer = ChangeDbSystemCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDbSystemCompartmentRequest,
                                ChangeDbSystemCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDbSystemCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExadataInfrastructureCompartmentResponse>
            changeExadataInfrastructureCompartment(
                    ChangeExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInfrastructureCompartmentRequest,
                                    ChangeExadataInfrastructureCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExadataInfrastructureCompartment");
        final ChangeExadataInfrastructureCompartmentRequest interceptedRequest =
                ChangeExadataInfrastructureCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExadataInfrastructureCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeExadataInfrastructureCompartmentResponse>
                transformer = ChangeExadataInfrastructureCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExadataInfrastructureCompartmentRequest,
                        ChangeExadataInfrastructureCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExadataInfrastructureCompartmentRequest,
                                ChangeExadataInfrastructureCompartmentResponse>,
                        java.util.concurrent.Future<ChangeExadataInfrastructureCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeExadataInfrastructureCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExadataInfrastructureCompartmentRequest,
                    ChangeExadataInfrastructureCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalContainerDatabaseCompartmentResponse>
            changeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalContainerDatabaseCompartmentRequest,
                                    ChangeExternalContainerDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExternalContainerDatabaseCompartment");
        final ChangeExternalContainerDatabaseCompartmentRequest interceptedRequest =
                ChangeExternalContainerDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalContainerDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeExternalContainerDatabaseCompartmentResponse>
                transformer = ChangeExternalContainerDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExternalContainerDatabaseCompartmentRequest,
                        ChangeExternalContainerDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExternalContainerDatabaseCompartmentRequest,
                                ChangeExternalContainerDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeExternalContainerDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExternalContainerDatabaseCompartmentRequest,
                    ChangeExternalContainerDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalNonContainerDatabaseCompartmentResponse>
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                                    ChangeExternalNonContainerDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExternalNonContainerDatabaseCompartment");
        final ChangeExternalNonContainerDatabaseCompartmentRequest interceptedRequest =
                ChangeExternalNonContainerDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalNonContainerDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeExternalNonContainerDatabaseCompartmentResponse>
                transformer = ChangeExternalNonContainerDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExternalNonContainerDatabaseCompartmentRequest,
                        ChangeExternalNonContainerDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExternalNonContainerDatabaseCompartmentRequest,
                                ChangeExternalNonContainerDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeExternalNonContainerDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                    ChangeExternalNonContainerDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalPluggableDatabaseCompartmentResponse>
            changeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalPluggableDatabaseCompartmentRequest,
                                    ChangeExternalPluggableDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExternalPluggableDatabaseCompartment");
        final ChangeExternalPluggableDatabaseCompartmentRequest interceptedRequest =
                ChangeExternalPluggableDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalPluggableDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeExternalPluggableDatabaseCompartmentResponse>
                transformer = ChangeExternalPluggableDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExternalPluggableDatabaseCompartmentRequest,
                        ChangeExternalPluggableDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExternalPluggableDatabaseCompartmentRequest,
                                ChangeExternalPluggableDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeExternalPluggableDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExternalPluggableDatabaseCompartmentRequest,
                    ChangeExternalPluggableDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeKeyStoreCompartmentResponse> changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeKeyStoreCompartment");
        final ChangeKeyStoreCompartmentRequest interceptedRequest =
                ChangeKeyStoreCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeKeyStoreCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeKeyStoreCompartmentResponse>
                transformer = ChangeKeyStoreCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeKeyStoreCompartmentRequest,
                                ChangeKeyStoreCompartmentResponse>,
                        java.util.concurrent.Future<ChangeKeyStoreCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeKeyStoreCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVmClusterCompartmentResponse>
            changeVmClusterCompartment(
                    ChangeVmClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVmClusterCompartmentRequest,
                                    ChangeVmClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVmClusterCompartment");
        final ChangeVmClusterCompartmentRequest interceptedRequest =
                ChangeVmClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVmClusterCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVmClusterCompartmentResponse>
                transformer = ChangeVmClusterCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVmClusterCompartmentRequest, ChangeVmClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVmClusterCompartmentRequest,
                                ChangeVmClusterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVmClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVmClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVmClusterCompartmentRequest, ChangeVmClusterCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CheckExternalDatabaseConnectorConnectionStatusResponse>
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                                    CheckExternalDatabaseConnectorConnectionStatusResponse>
                            handler) {
        LOG.trace("Called async checkExternalDatabaseConnectorConnectionStatus");
        final CheckExternalDatabaseConnectorConnectionStatusRequest interceptedRequest =
                CheckExternalDatabaseConnectorConnectionStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalDatabaseConnectorConnectionStatusConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        CheckExternalDatabaseConnectorConnectionStatusResponse>
                transformer =
                        CheckExternalDatabaseConnectorConnectionStatusConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CheckExternalDatabaseConnectorConnectionStatusRequest,
                        CheckExternalDatabaseConnectorConnectionStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CheckExternalDatabaseConnectorConnectionStatusRequest,
                                CheckExternalDatabaseConnectorConnectionStatusResponse>,
                        java.util.concurrent.Future<
                                CheckExternalDatabaseConnectorConnectionStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                    CheckExternalDatabaseConnectorConnectionStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompleteExternalBackupJobResponse> completeExternalBackupJob(
            CompleteExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
                    handler) {
        LOG.trace("Called async completeExternalBackupJob");
        final CompleteExternalBackupJobRequest interceptedRequest =
                CompleteExternalBackupJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompleteExternalBackupJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompleteExternalBackupJobResponse>
                transformer = CompleteExternalBackupJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompleteExternalBackupJobRequest,
                                CompleteExternalBackupJobResponse>,
                        java.util.concurrent.Future<CompleteExternalBackupJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompleteExternalBackupJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutonomousDatabaseVaultKeyResponse>
            configureAutonomousDatabaseVaultKey(
                    ConfigureAutonomousDatabaseVaultKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutonomousDatabaseVaultKeyRequest,
                                    ConfigureAutonomousDatabaseVaultKeyResponse>
                            handler) {
        LOG.trace("Called async configureAutonomousDatabaseVaultKey");
        final ConfigureAutonomousDatabaseVaultKeyRequest interceptedRequest =
                ConfigureAutonomousDatabaseVaultKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureAutonomousDatabaseVaultKeyConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ConfigureAutonomousDatabaseVaultKeyResponse>
                transformer = ConfigureAutonomousDatabaseVaultKeyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureAutonomousDatabaseVaultKeyRequest,
                        ConfigureAutonomousDatabaseVaultKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureAutonomousDatabaseVaultKeyRequest,
                                ConfigureAutonomousDatabaseVaultKeyResponse>,
                        java.util.concurrent.Future<ConfigureAutonomousDatabaseVaultKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureAutonomousDatabaseVaultKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureAutonomousDatabaseVaultKeyRequest,
                    ConfigureAutonomousDatabaseVaultKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousContainerDatabaseResponse>
            createAutonomousContainerDatabase(
                    CreateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousContainerDatabaseRequest,
                                    CreateAutonomousContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async createAutonomousContainerDatabase");
        final CreateAutonomousContainerDatabaseRequest interceptedRequest =
                CreateAutonomousContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAutonomousContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAutonomousContainerDatabaseResponse>
                transformer = CreateAutonomousContainerDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAutonomousContainerDatabaseRequest,
                        CreateAutonomousContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAutonomousContainerDatabaseRequest,
                                CreateAutonomousContainerDatabaseResponse>,
                        java.util.concurrent.Future<CreateAutonomousContainerDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAutonomousContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAutonomousContainerDatabaseRequest,
                    CreateAutonomousContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousDatabaseResponse> createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async createAutonomousDatabase");
        final CreateAutonomousDatabaseRequest interceptedRequest =
                CreateAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAutonomousDatabaseResponse>
                transformer = CreateAutonomousDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<CreateAutonomousDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousDatabaseBackupResponse>
            createAutonomousDatabaseBackup(
                    CreateAutonomousDatabaseBackupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousDatabaseBackupRequest,
                                    CreateAutonomousDatabaseBackupResponse>
                            handler) {
        LOG.trace("Called async createAutonomousDatabaseBackup");
        final CreateAutonomousDatabaseBackupRequest interceptedRequest =
                CreateAutonomousDatabaseBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAutonomousDatabaseBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAutonomousDatabaseBackupResponse>
                transformer = CreateAutonomousDatabaseBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAutonomousDatabaseBackupRequest,
                        CreateAutonomousDatabaseBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAutonomousDatabaseBackupRequest,
                                CreateAutonomousDatabaseBackupResponse>,
                        java.util.concurrent.Future<CreateAutonomousDatabaseBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAutonomousDatabaseBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAutonomousDatabaseBackupRequest, CreateAutonomousDatabaseBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAutonomousVmClusterResponse> createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
                    handler) {
        LOG.trace("Called async createAutonomousVmCluster");
        final CreateAutonomousVmClusterRequest interceptedRequest =
                CreateAutonomousVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAutonomousVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAutonomousVmClusterResponse>
                transformer = CreateAutonomousVmClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAutonomousVmClusterRequest,
                                CreateAutonomousVmClusterResponse>,
                        java.util.concurrent.Future<CreateAutonomousVmClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAutonomousVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResponse> createBackup(
            CreateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
        LOG.trace("Called async createBackup");
        final CreateBackupRequest interceptedRequest =
                CreateBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackupResponse>
                transformer = CreateBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBackupRequest, CreateBackupResponse>,
                        java.util.concurrent.Future<CreateBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBackupRequest, CreateBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBackupDestinationResponse> createBackupDestination(
            CreateBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBackupDestinationRequest, CreateBackupDestinationResponse>
                    handler) {
        LOG.trace("Called async createBackupDestination");
        final CreateBackupDestinationRequest interceptedRequest =
                CreateBackupDestinationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupDestinationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateBackupDestinationResponse>
                transformer = CreateBackupDestinationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateBackupDestinationRequest, CreateBackupDestinationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBackupDestinationRequest, CreateBackupDestinationResponse>,
                        java.util.concurrent.Future<CreateBackupDestinationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBackupDestinationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBackupDestinationRequest, CreateBackupDestinationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCloudExadataInfrastructureResponse>
            createCloudExadataInfrastructure(
                    CreateCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCloudExadataInfrastructureRequest,
                                    CreateCloudExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async createCloudExadataInfrastructure");
        final CreateCloudExadataInfrastructureRequest interceptedRequest =
                CreateCloudExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCloudExadataInfrastructureResponse>
                transformer = CreateCloudExadataInfrastructureConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCloudExadataInfrastructureRequest,
                        CreateCloudExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCloudExadataInfrastructureRequest,
                                CreateCloudExadataInfrastructureResponse>,
                        java.util.concurrent.Future<CreateCloudExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCloudExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCloudExadataInfrastructureRequest,
                    CreateCloudExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCloudVmClusterResponse> createCloudVmCluster(
            CreateCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
                    handler) {
        LOG.trace("Called async createCloudVmCluster");
        final CreateCloudVmClusterRequest interceptedRequest =
                CreateCloudVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCloudVmClusterResponse>
                transformer = CreateCloudVmClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>,
                        java.util.concurrent.Future<CreateCloudVmClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCloudVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConsoleConnectionResponse> createConsoleConnection(
            CreateConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>
                    handler) {
        LOG.trace("Called async createConsoleConnection");
        final CreateConsoleConnectionRequest interceptedRequest =
                CreateConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateConsoleConnectionResponse>
                transformer = CreateConsoleConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>,
                        java.util.concurrent.Future<CreateConsoleConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConsoleConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataGuardAssociationResponse>
            createDataGuardAssociation(
                    CreateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataGuardAssociationRequest,
                                    CreateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async createDataGuardAssociation");
        final CreateDataGuardAssociationRequest interceptedRequest =
                CreateDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataGuardAssociationResponse>
                transformer = CreateDataGuardAssociationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataGuardAssociationRequest,
                                CreateDataGuardAssociationResponse>,
                        java.util.concurrent.Future<CreateDataGuardAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataGuardAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResponse> createDatabase(
            CreateDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseRequest, CreateDatabaseResponse>
                    handler) {
        LOG.trace("Called async createDatabase");
        final CreateDatabaseRequest interceptedRequest =
                CreateDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDatabaseResponse>
                transformer = CreateDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseRequest, CreateDatabaseResponse>,
                        java.util.concurrent.Future<CreateDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNewDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseRequest, CreateDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseSoftwareImageResponse>
            createDatabaseSoftwareImage(
                    CreateDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseSoftwareImageRequest,
                                    CreateDatabaseSoftwareImageResponse>
                            handler) {
        LOG.trace("Called async createDatabaseSoftwareImage");
        final CreateDatabaseSoftwareImageRequest interceptedRequest =
                CreateDatabaseSoftwareImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseSoftwareImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDatabaseSoftwareImageResponse>
                transformer = CreateDatabaseSoftwareImageConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseSoftwareImageRequest, CreateDatabaseSoftwareImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseSoftwareImageRequest,
                                CreateDatabaseSoftwareImageResponse>,
                        java.util.concurrent.Future<CreateDatabaseSoftwareImageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseSoftwareImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseSoftwareImageRequest, CreateDatabaseSoftwareImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDbHomeResponse> createDbHome(
            CreateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                    handler) {
        LOG.trace("Called async createDbHome");
        final CreateDbHomeRequest interceptedRequest =
                CreateDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbHomeResponse>
                transformer = CreateDbHomeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDbHomeRequest, CreateDbHomeResponse>,
                        java.util.concurrent.Future<CreateDbHomeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDbHomeWithDbSystemIdDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDbHomeRequest, CreateDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExadataInfrastructureResponse>
            createExadataInfrastructure(
                    CreateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExadataInfrastructureRequest,
                                    CreateExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async createExadataInfrastructure");
        final CreateExadataInfrastructureRequest interceptedRequest =
                CreateExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExadataInfrastructureResponse>
                transformer = CreateExadataInfrastructureConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExadataInfrastructureRequest, CreateExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExadataInfrastructureRequest,
                                CreateExadataInfrastructureResponse>,
                        java.util.concurrent.Future<CreateExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExadataInfrastructureRequest, CreateExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalBackupJobResponse> createExternalBackupJob(
            CreateExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
                    handler) {
        LOG.trace("Called async createExternalBackupJob");
        final CreateExternalBackupJobRequest interceptedRequest =
                CreateExternalBackupJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalBackupJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalBackupJobResponse>
                transformer = CreateExternalBackupJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>,
                        java.util.concurrent.Future<CreateExternalBackupJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalBackupJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalContainerDatabaseResponse>
            createExternalContainerDatabase(
                    CreateExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalContainerDatabaseRequest,
                                    CreateExternalContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async createExternalContainerDatabase");
        final CreateExternalContainerDatabaseRequest interceptedRequest =
                CreateExternalContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalContainerDatabaseResponse>
                transformer = CreateExternalContainerDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalContainerDatabaseRequest,
                        CreateExternalContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalContainerDatabaseRequest,
                                CreateExternalContainerDatabaseResponse>,
                        java.util.concurrent.Future<CreateExternalContainerDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalContainerDatabaseRequest,
                    CreateExternalContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDatabaseConnectorResponse>
            createExternalDatabaseConnector(
                    CreateExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDatabaseConnectorRequest,
                                    CreateExternalDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async createExternalDatabaseConnector");
        final CreateExternalDatabaseConnectorRequest interceptedRequest =
                CreateExternalDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDatabaseConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalDatabaseConnectorResponse>
                transformer = CreateExternalDatabaseConnectorConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalDatabaseConnectorRequest,
                        CreateExternalDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalDatabaseConnectorRequest,
                                CreateExternalDatabaseConnectorResponse>,
                        java.util.concurrent.Future<CreateExternalDatabaseConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalDatabaseConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalDatabaseConnectorRequest,
                    CreateExternalDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalNonContainerDatabaseResponse>
            createExternalNonContainerDatabase(
                    CreateExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalNonContainerDatabaseRequest,
                                    CreateExternalNonContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async createExternalNonContainerDatabase");
        final CreateExternalNonContainerDatabaseRequest interceptedRequest =
                CreateExternalNonContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalNonContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalNonContainerDatabaseResponse>
                transformer = CreateExternalNonContainerDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalNonContainerDatabaseRequest,
                        CreateExternalNonContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalNonContainerDatabaseRequest,
                                CreateExternalNonContainerDatabaseResponse>,
                        java.util.concurrent.Future<CreateExternalNonContainerDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalNonContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalNonContainerDatabaseRequest,
                    CreateExternalNonContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPluggableDatabaseResponse>
            createExternalPluggableDatabase(
                    CreateExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPluggableDatabaseRequest,
                                    CreateExternalPluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async createExternalPluggableDatabase");
        final CreateExternalPluggableDatabaseRequest interceptedRequest =
                CreateExternalPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalPluggableDatabaseResponse>
                transformer = CreateExternalPluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalPluggableDatabaseRequest,
                        CreateExternalPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalPluggableDatabaseRequest,
                                CreateExternalPluggableDatabaseResponse>,
                        java.util.concurrent.Future<CreateExternalPluggableDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalPluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalPluggableDatabaseRequest,
                    CreateExternalPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateKeyStoreResponse> createKeyStore(
            CreateKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateKeyStoreRequest, CreateKeyStoreResponse>
                    handler) {
        LOG.trace("Called async createKeyStore");
        final CreateKeyStoreRequest interceptedRequest =
                CreateKeyStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateKeyStoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateKeyStoreResponse>
                transformer = CreateKeyStoreConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateKeyStoreRequest, CreateKeyStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateKeyStoreRequest, CreateKeyStoreResponse>,
                        java.util.concurrent.Future<CreateKeyStoreResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateKeyStoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateKeyStoreRequest, CreateKeyStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePluggableDatabaseResponse> createPluggableDatabase(
            CreatePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async createPluggableDatabase");
        final CreatePluggableDatabaseRequest interceptedRequest =
                CreatePluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreatePluggableDatabaseResponse>
                transformer = CreatePluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>,
                        java.util.concurrent.Future<CreatePluggableDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVmClusterResponse> createVmCluster(
            CreateVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVmClusterRequest, CreateVmClusterResponse>
                    handler) {
        LOG.trace("Called async createVmCluster");
        final CreateVmClusterRequest interceptedRequest =
                CreateVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVmClusterResponse>
                transformer = CreateVmClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateVmClusterRequest, CreateVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVmClusterRequest, CreateVmClusterResponse>,
                        java.util.concurrent.Future<CreateVmClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVmClusterRequest, CreateVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVmClusterNetworkResponse> createVmClusterNetwork(
            CreateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async createVmClusterNetwork");
        final CreateVmClusterNetworkRequest interceptedRequest =
                CreateVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVmClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVmClusterNetworkResponse>
                transformer = CreateVmClusterNetworkConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>,
                        java.util.concurrent.Future<CreateVmClusterNetworkResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getVmClusterNetworkDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DbNodeActionResponse> dbNodeAction(
            DbNodeActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                    handler) {
        LOG.trace("Called async dbNodeAction");
        final DbNodeActionRequest interceptedRequest =
                DbNodeActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DbNodeActionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DbNodeActionResponse>
                transformer = DbNodeActionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DbNodeActionRequest, DbNodeActionResponse>,
                        java.util.concurrent.Future<DbNodeActionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DbNodeActionRequest, DbNodeActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAutonomousDatabaseResponse> deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async deleteAutonomousDatabase");
        final DeleteAutonomousDatabaseRequest interceptedRequest =
                DeleteAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAutonomousDatabaseResponse>
                transformer = DeleteAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<DeleteAutonomousDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAutonomousVmClusterResponse> deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
                    handler) {
        LOG.trace("Called async deleteAutonomousVmCluster");
        final DeleteAutonomousVmClusterRequest interceptedRequest =
                DeleteAutonomousVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAutonomousVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAutonomousVmClusterResponse>
                transformer = DeleteAutonomousVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAutonomousVmClusterRequest,
                                DeleteAutonomousVmClusterResponse>,
                        java.util.concurrent.Future<DeleteAutonomousVmClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            DeleteBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {
        LOG.trace("Called async deleteBackup");
        final DeleteBackupRequest interceptedRequest =
                DeleteBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackupResponse>
                transformer = DeleteBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBackupRequest, DeleteBackupResponse>,
                        java.util.concurrent.Future<DeleteBackupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBackupRequest, DeleteBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupDestinationResponse> deleteBackupDestination(
            DeleteBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>
                    handler) {
        LOG.trace("Called async deleteBackupDestination");
        final DeleteBackupDestinationRequest interceptedRequest =
                DeleteBackupDestinationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupDestinationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteBackupDestinationResponse>
                transformer = DeleteBackupDestinationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>,
                        java.util.concurrent.Future<DeleteBackupDestinationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudExadataInfrastructureResponse>
            deleteCloudExadataInfrastructure(
                    DeleteCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCloudExadataInfrastructureRequest,
                                    DeleteCloudExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async deleteCloudExadataInfrastructure");
        final DeleteCloudExadataInfrastructureRequest interceptedRequest =
                DeleteCloudExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCloudExadataInfrastructureResponse>
                transformer = DeleteCloudExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCloudExadataInfrastructureRequest,
                        DeleteCloudExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCloudExadataInfrastructureRequest,
                                DeleteCloudExadataInfrastructureResponse>,
                        java.util.concurrent.Future<DeleteCloudExadataInfrastructureResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCloudExadataInfrastructureRequest,
                    DeleteCloudExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudVmClusterResponse> deleteCloudVmCluster(
            DeleteCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
                    handler) {
        LOG.trace("Called async deleteCloudVmCluster");
        final DeleteCloudVmClusterRequest interceptedRequest =
                DeleteCloudVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCloudVmClusterResponse>
                transformer = DeleteCloudVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>,
                        java.util.concurrent.Future<DeleteCloudVmClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConsoleConnectionResponse> deleteConsoleConnection(
            DeleteConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>
                    handler) {
        LOG.trace("Called async deleteConsoleConnection");
        final DeleteConsoleConnectionRequest interceptedRequest =
                DeleteConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteConsoleConnectionResponse>
                transformer = DeleteConsoleConnectionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>,
                        java.util.concurrent.Future<DeleteConsoleConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResponse> deleteDatabase(
            DeleteDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseRequest, DeleteDatabaseResponse>
                    handler) {
        LOG.trace("Called async deleteDatabase");
        final DeleteDatabaseRequest interceptedRequest =
                DeleteDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDatabaseResponse>
                transformer = DeleteDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseRequest, DeleteDatabaseResponse>,
                        java.util.concurrent.Future<DeleteDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseRequest, DeleteDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseSoftwareImageResponse>
            deleteDatabaseSoftwareImage(
                    DeleteDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseSoftwareImageRequest,
                                    DeleteDatabaseSoftwareImageResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseSoftwareImage");
        final DeleteDatabaseSoftwareImageRequest interceptedRequest =
                DeleteDatabaseSoftwareImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseSoftwareImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseSoftwareImageResponse>
                transformer = DeleteDatabaseSoftwareImageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseSoftwareImageRequest, DeleteDatabaseSoftwareImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseSoftwareImageRequest,
                                DeleteDatabaseSoftwareImageResponse>,
                        java.util.concurrent.Future<DeleteDatabaseSoftwareImageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseSoftwareImageRequest, DeleteDatabaseSoftwareImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDbHomeResponse> deleteDbHome(
            DeleteDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                    handler) {
        LOG.trace("Called async deleteDbHome");
        final DeleteDbHomeRequest interceptedRequest =
                DeleteDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbHomeResponse>
                transformer = DeleteDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDbHomeRequest, DeleteDbHomeResponse>,
                        java.util.concurrent.Future<DeleteDbHomeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDbHomeRequest, DeleteDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExadataInfrastructureResponse>
            deleteExadataInfrastructure(
                    DeleteExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExadataInfrastructureRequest,
                                    DeleteExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async deleteExadataInfrastructure");
        final DeleteExadataInfrastructureRequest interceptedRequest =
                DeleteExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExadataInfrastructureResponse>
                transformer = DeleteExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExadataInfrastructureRequest, DeleteExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExadataInfrastructureRequest,
                                DeleteExadataInfrastructureResponse>,
                        java.util.concurrent.Future<DeleteExadataInfrastructureResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExadataInfrastructureRequest, DeleteExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalContainerDatabaseResponse>
            deleteExternalContainerDatabase(
                    DeleteExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalContainerDatabaseRequest,
                                    DeleteExternalContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async deleteExternalContainerDatabase");
        final DeleteExternalContainerDatabaseRequest interceptedRequest =
                DeleteExternalContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalContainerDatabaseResponse>
                transformer = DeleteExternalContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalContainerDatabaseRequest,
                        DeleteExternalContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalContainerDatabaseRequest,
                                DeleteExternalContainerDatabaseResponse>,
                        java.util.concurrent.Future<DeleteExternalContainerDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalContainerDatabaseRequest,
                    DeleteExternalContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDatabaseConnectorResponse>
            deleteExternalDatabaseConnector(
                    DeleteExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDatabaseConnectorRequest,
                                    DeleteExternalDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteExternalDatabaseConnector");
        final DeleteExternalDatabaseConnectorRequest interceptedRequest =
                DeleteExternalDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDatabaseConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalDatabaseConnectorResponse>
                transformer = DeleteExternalDatabaseConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalDatabaseConnectorRequest,
                        DeleteExternalDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalDatabaseConnectorRequest,
                                DeleteExternalDatabaseConnectorResponse>,
                        java.util.concurrent.Future<DeleteExternalDatabaseConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalDatabaseConnectorRequest,
                    DeleteExternalDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalNonContainerDatabaseResponse>
            deleteExternalNonContainerDatabase(
                    DeleteExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalNonContainerDatabaseRequest,
                                    DeleteExternalNonContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async deleteExternalNonContainerDatabase");
        final DeleteExternalNonContainerDatabaseRequest interceptedRequest =
                DeleteExternalNonContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalNonContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalNonContainerDatabaseResponse>
                transformer = DeleteExternalNonContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalNonContainerDatabaseRequest,
                        DeleteExternalNonContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalNonContainerDatabaseRequest,
                                DeleteExternalNonContainerDatabaseResponse>,
                        java.util.concurrent.Future<DeleteExternalNonContainerDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalNonContainerDatabaseRequest,
                    DeleteExternalNonContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPluggableDatabaseResponse>
            deleteExternalPluggableDatabase(
                    DeleteExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPluggableDatabaseRequest,
                                    DeleteExternalPluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async deleteExternalPluggableDatabase");
        final DeleteExternalPluggableDatabaseRequest interceptedRequest =
                DeleteExternalPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalPluggableDatabaseResponse>
                transformer = DeleteExternalPluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalPluggableDatabaseRequest,
                        DeleteExternalPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalPluggableDatabaseRequest,
                                DeleteExternalPluggableDatabaseResponse>,
                        java.util.concurrent.Future<DeleteExternalPluggableDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalPluggableDatabaseRequest,
                    DeleteExternalPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyStoreResponse> deleteKeyStore(
            DeleteKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteKeyStoreRequest, DeleteKeyStoreResponse>
                    handler) {
        LOG.trace("Called async deleteKeyStore");
        final DeleteKeyStoreRequest interceptedRequest =
                DeleteKeyStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteKeyStoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteKeyStoreResponse>
                transformer = DeleteKeyStoreConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteKeyStoreRequest, DeleteKeyStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteKeyStoreRequest, DeleteKeyStoreResponse>,
                        java.util.concurrent.Future<DeleteKeyStoreResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteKeyStoreRequest, DeleteKeyStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePluggableDatabaseResponse> deletePluggableDatabase(
            DeletePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async deletePluggableDatabase");
        final DeletePluggableDatabaseRequest interceptedRequest =
                DeletePluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeletePluggableDatabaseResponse>
                transformer = DeletePluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>,
                        java.util.concurrent.Future<DeletePluggableDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVmClusterResponse> deleteVmCluster(
            DeleteVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVmClusterRequest, DeleteVmClusterResponse>
                    handler) {
        LOG.trace("Called async deleteVmCluster");
        final DeleteVmClusterRequest interceptedRequest =
                DeleteVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVmClusterResponse>
                transformer = DeleteVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVmClusterRequest, DeleteVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVmClusterRequest, DeleteVmClusterResponse>,
                        java.util.concurrent.Future<DeleteVmClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVmClusterRequest, DeleteVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVmClusterNetworkResponse> deleteVmClusterNetwork(
            DeleteVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async deleteVmClusterNetwork");
        final DeleteVmClusterNetworkRequest interceptedRequest =
                DeleteVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVmClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVmClusterNetworkResponse>
                transformer = DeleteVmClusterNetworkConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>,
                        java.util.concurrent.Future<DeleteVmClusterNetworkResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeregisterAutonomousDatabaseDataSafeResponse>
            deregisterAutonomousDatabaseDataSafe(
                    DeregisterAutonomousDatabaseDataSafeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeregisterAutonomousDatabaseDataSafeRequest,
                                    DeregisterAutonomousDatabaseDataSafeResponse>
                            handler) {
        LOG.trace("Called async deregisterAutonomousDatabaseDataSafe");
        final DeregisterAutonomousDatabaseDataSafeRequest interceptedRequest =
                DeregisterAutonomousDatabaseDataSafeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeregisterAutonomousDatabaseDataSafeConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeregisterAutonomousDatabaseDataSafeResponse>
                transformer = DeregisterAutonomousDatabaseDataSafeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeregisterAutonomousDatabaseDataSafeRequest,
                        DeregisterAutonomousDatabaseDataSafeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeregisterAutonomousDatabaseDataSafeRequest,
                                DeregisterAutonomousDatabaseDataSafeResponse>,
                        java.util.concurrent.Future<DeregisterAutonomousDatabaseDataSafeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDeregisterAutonomousDatabaseDataSafeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeregisterAutonomousDatabaseDataSafeRequest,
                    DeregisterAutonomousDatabaseDataSafeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableAutonomousDatabaseOperationsInsightsResponse>
            disableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseOperationsInsightsRequest,
                                    DisableAutonomousDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async disableAutonomousDatabaseOperationsInsights");
        final DisableAutonomousDatabaseOperationsInsightsRequest interceptedRequest =
                DisableAutonomousDatabaseOperationsInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutonomousDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableAutonomousDatabaseOperationsInsightsResponse>
                transformer = DisableAutonomousDatabaseOperationsInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DisableAutonomousDatabaseOperationsInsightsRequest,
                        DisableAutonomousDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableAutonomousDatabaseOperationsInsightsRequest,
                                DisableAutonomousDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                DisableAutonomousDatabaseOperationsInsightsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableAutonomousDatabaseOperationsInsightsRequest,
                    DisableAutonomousDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableDatabaseManagementResponse> disableDatabaseManagement(
            DisableDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
                    handler) {
        LOG.trace("Called async disableDatabaseManagement");
        final DisableDatabaseManagementRequest interceptedRequest =
                DisableDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableDatabaseManagementConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisableDatabaseManagementResponse>
                transformer = DisableDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableDatabaseManagementRequest,
                                DisableDatabaseManagementResponse>,
                        java.util.concurrent.Future<DisableDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalContainerDatabaseDatabaseManagementResponse>
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalContainerDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalContainerDatabaseDatabaseManagement");
        final DisableExternalContainerDatabaseDatabaseManagementRequest interceptedRequest =
                DisableExternalContainerDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalContainerDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalContainerDatabaseDatabaseManagementResponse>
                transformer =
                        DisableExternalContainerDatabaseDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalContainerDatabaseDatabaseManagementRequest,
                        DisableExternalContainerDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalContainerDatabaseDatabaseManagementRequest,
                                DisableExternalContainerDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                DisableExternalContainerDatabaseDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                    DisableExternalContainerDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalNonContainerDatabaseDatabaseManagement");
        final DisableExternalNonContainerDatabaseDatabaseManagementRequest interceptedRequest =
                DisableExternalNonContainerDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalNonContainerDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse>
                transformer =
                        DisableExternalNonContainerDatabaseDatabaseManagementConverter
                                .fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                                DisableExternalNonContainerDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                DisableExternalNonContainerDatabaseDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async disableExternalNonContainerDatabaseOperationsInsights");
        final DisableExternalNonContainerDatabaseOperationsInsightsRequest interceptedRequest =
                DisableExternalNonContainerDatabaseOperationsInsightsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalNonContainerDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse>
                transformer =
                        DisableExternalNonContainerDatabaseOperationsInsightsConverter
                                .fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                                DisableExternalNonContainerDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                DisableExternalNonContainerDatabaseOperationsInsightsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseDatabaseManagementResponse>
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                                    DisableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalPluggableDatabaseDatabaseManagement");
        final DisableExternalPluggableDatabaseDatabaseManagementRequest interceptedRequest =
                DisableExternalPluggableDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalPluggableDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalPluggableDatabaseDatabaseManagementResponse>
                transformer =
                        DisableExternalPluggableDatabaseDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalPluggableDatabaseDatabaseManagementRequest,
                        DisableExternalPluggableDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalPluggableDatabaseDatabaseManagementRequest,
                                DisableExternalPluggableDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                DisableExternalPluggableDatabaseDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                    DisableExternalPluggableDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseOperationsInsightsResponse>
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                                    DisableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async disableExternalPluggableDatabaseOperationsInsights");
        final DisableExternalPluggableDatabaseOperationsInsightsRequest interceptedRequest =
                DisableExternalPluggableDatabaseOperationsInsightsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalPluggableDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalPluggableDatabaseOperationsInsightsResponse>
                transformer =
                        DisableExternalPluggableDatabaseOperationsInsightsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalPluggableDatabaseOperationsInsightsRequest,
                        DisableExternalPluggableDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalPluggableDatabaseOperationsInsightsRequest,
                                DisableExternalPluggableDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                DisableExternalPluggableDatabaseOperationsInsightsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                    DisableExternalPluggableDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadExadataInfrastructureConfigFileResponse>
            downloadExadataInfrastructureConfigFile(
                    DownloadExadataInfrastructureConfigFileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadExadataInfrastructureConfigFileRequest,
                                    DownloadExadataInfrastructureConfigFileResponse>
                            handler) {
        LOG.trace("Called async downloadExadataInfrastructureConfigFile");
        if (this.apacheConnectionClosingStrategy != null) {
            LOG.warn(
                    "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                            + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                    this.apacheConnectionClosingStrategy);
        }
        final DownloadExadataInfrastructureConfigFileRequest interceptedRequest =
                DownloadExadataInfrastructureConfigFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadExadataInfrastructureConfigFileConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadExadataInfrastructureConfigFileResponse>
                transformer = DownloadExadataInfrastructureConfigFileConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadExadataInfrastructureConfigFileRequest,
                        DownloadExadataInfrastructureConfigFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadExadataInfrastructureConfigFileRequest,
                                DownloadExadataInfrastructureConfigFileResponse>,
                        java.util.concurrent.Future<
                                DownloadExadataInfrastructureConfigFileResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadExadataInfrastructureConfigFileRequest,
                    DownloadExadataInfrastructureConfigFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadValidationReportResponse> downloadValidationReport(
            DownloadValidationReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadValidationReportRequest, DownloadValidationReportResponse>
                    handler) {
        LOG.trace("Called async downloadValidationReport");
        if (this.apacheConnectionClosingStrategy != null) {
            LOG.warn(
                    "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                            + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                    this.apacheConnectionClosingStrategy);
        }
        final DownloadValidationReportRequest interceptedRequest =
                DownloadValidationReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadValidationReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadValidationReportResponse>
                transformer = DownloadValidationReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadValidationReportRequest, DownloadValidationReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadValidationReportRequest, DownloadValidationReportResponse>,
                        java.util.concurrent.Future<DownloadValidationReportResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadValidationReportRequest, DownloadValidationReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadVmClusterNetworkConfigFileResponse>
            downloadVmClusterNetworkConfigFile(
                    DownloadVmClusterNetworkConfigFileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadVmClusterNetworkConfigFileRequest,
                                    DownloadVmClusterNetworkConfigFileResponse>
                            handler) {
        LOG.trace("Called async downloadVmClusterNetworkConfigFile");
        if (this.apacheConnectionClosingStrategy != null) {
            LOG.warn(
                    "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                            + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                    this.apacheConnectionClosingStrategy);
        }
        final DownloadVmClusterNetworkConfigFileRequest interceptedRequest =
                DownloadVmClusterNetworkConfigFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadVmClusterNetworkConfigFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadVmClusterNetworkConfigFileResponse>
                transformer = DownloadVmClusterNetworkConfigFileConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadVmClusterNetworkConfigFileRequest,
                        DownloadVmClusterNetworkConfigFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadVmClusterNetworkConfigFileRequest,
                                DownloadVmClusterNetworkConfigFileResponse>,
                        java.util.concurrent.Future<DownloadVmClusterNetworkConfigFileResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadVmClusterNetworkConfigFileRequest,
                    DownloadVmClusterNetworkConfigFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableAutonomousDatabaseOperationsInsightsResponse>
            enableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseOperationsInsightsRequest,
                                    EnableAutonomousDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async enableAutonomousDatabaseOperationsInsights");
        final EnableAutonomousDatabaseOperationsInsightsRequest interceptedRequest =
                EnableAutonomousDatabaseOperationsInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutonomousDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableAutonomousDatabaseOperationsInsightsResponse>
                transformer = EnableAutonomousDatabaseOperationsInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        EnableAutonomousDatabaseOperationsInsightsRequest,
                        EnableAutonomousDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableAutonomousDatabaseOperationsInsightsRequest,
                                EnableAutonomousDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                EnableAutonomousDatabaseOperationsInsightsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableAutonomousDatabaseOperationsInsightsRequest,
                    EnableAutonomousDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableDatabaseManagementResponse> enableDatabaseManagement(
            EnableDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
                    handler) {
        LOG.trace("Called async enableDatabaseManagement");
        final EnableDatabaseManagementRequest interceptedRequest =
                EnableDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDatabaseManagementConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableDatabaseManagementResponse>
                transformer = EnableDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>,
                        java.util.concurrent.Future<EnableDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalContainerDatabaseDatabaseManagementResponse>
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalContainerDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalContainerDatabaseDatabaseManagement");
        final EnableExternalContainerDatabaseDatabaseManagementRequest interceptedRequest =
                EnableExternalContainerDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalContainerDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalContainerDatabaseDatabaseManagementResponse>
                transformer =
                        EnableExternalContainerDatabaseDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalContainerDatabaseDatabaseManagementRequest,
                        EnableExternalContainerDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalContainerDatabaseDatabaseManagementRequest,
                                EnableExternalContainerDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                EnableExternalContainerDatabaseDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalContainerDatabaseDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                    EnableExternalContainerDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseDatabaseManagementResponse>
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalNonContainerDatabaseDatabaseManagement");
        final EnableExternalNonContainerDatabaseDatabaseManagementRequest interceptedRequest =
                EnableExternalNonContainerDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalNonContainerDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse>
                transformer =
                        EnableExternalNonContainerDatabaseDatabaseManagementConverter
                                .fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                                EnableExternalNonContainerDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                EnableExternalNonContainerDatabaseDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalNonContainerDatabaseDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseOperationsInsightsResponse>
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async enableExternalNonContainerDatabaseOperationsInsights");
        final EnableExternalNonContainerDatabaseOperationsInsightsRequest interceptedRequest =
                EnableExternalNonContainerDatabaseOperationsInsightsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalNonContainerDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse>
                transformer =
                        EnableExternalNonContainerDatabaseOperationsInsightsConverter
                                .fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                                EnableExternalNonContainerDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                EnableExternalNonContainerDatabaseOperationsInsightsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalNonContainerDatabaseOperationsInsightsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseDatabaseManagementResponse>
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                                    EnableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalPluggableDatabaseDatabaseManagement");
        final EnableExternalPluggableDatabaseDatabaseManagementRequest interceptedRequest =
                EnableExternalPluggableDatabaseDatabaseManagementConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalPluggableDatabaseDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalPluggableDatabaseDatabaseManagementResponse>
                transformer =
                        EnableExternalPluggableDatabaseDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalPluggableDatabaseDatabaseManagementRequest,
                        EnableExternalPluggableDatabaseDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalPluggableDatabaseDatabaseManagementRequest,
                                EnableExternalPluggableDatabaseDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                EnableExternalPluggableDatabaseDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalPluggableDatabaseDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                    EnableExternalPluggableDatabaseDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseOperationsInsightsResponse>
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                                    EnableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler) {
        LOG.trace("Called async enableExternalPluggableDatabaseOperationsInsights");
        final EnableExternalPluggableDatabaseOperationsInsightsRequest interceptedRequest =
                EnableExternalPluggableDatabaseOperationsInsightsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalPluggableDatabaseOperationsInsightsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalPluggableDatabaseOperationsInsightsResponse>
                transformer =
                        EnableExternalPluggableDatabaseOperationsInsightsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalPluggableDatabaseOperationsInsightsRequest,
                        EnableExternalPluggableDatabaseOperationsInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalPluggableDatabaseOperationsInsightsRequest,
                                EnableExternalPluggableDatabaseOperationsInsightsResponse>,
                        java.util.concurrent.Future<
                                EnableExternalPluggableDatabaseOperationsInsightsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalPluggableDatabaseOperationsInsightsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                    EnableExternalPluggableDatabaseOperationsInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<FailOverAutonomousDatabaseResponse>
            failOverAutonomousDatabase(
                    FailOverAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailOverAutonomousDatabaseRequest,
                                    FailOverAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async failOverAutonomousDatabase");
        final FailOverAutonomousDatabaseRequest interceptedRequest =
                FailOverAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailOverAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailOverAutonomousDatabaseResponse>
                transformer = FailOverAutonomousDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        FailOverAutonomousDatabaseRequest, FailOverAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                FailOverAutonomousDatabaseRequest,
                                FailOverAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<FailOverAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    FailOverAutonomousDatabaseRequest, FailOverAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {
        LOG.trace("Called async failoverAutonomousContainerDatabaseDataguardAssociation");
        final FailoverAutonomousContainerDatabaseDataguardAssociationRequest interceptedRequest =
                FailoverAutonomousContainerDatabaseDataguardAssociationConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailoverAutonomousContainerDatabaseDataguardAssociationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
                transformer =
                        FailoverAutonomousContainerDatabaseDataguardAssociationConverter
                                .fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                FailoverAutonomousContainerDatabaseDataguardAssociationResponse>,
                        java.util.concurrent.Future<
                                FailoverAutonomousContainerDatabaseDataguardAssociationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<FailoverDataGuardAssociationResponse>
            failoverDataGuardAssociation(
                    FailoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailoverDataGuardAssociationRequest,
                                    FailoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async failoverDataGuardAssociation");
        final FailoverDataGuardAssociationRequest interceptedRequest =
                FailoverDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailoverDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
                transformer = FailoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        FailoverDataGuardAssociationRequest, FailoverDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                FailoverDataGuardAssociationRequest,
                                FailoverDataGuardAssociationResponse>,
                        java.util.concurrent.Future<FailoverDataGuardAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getFailoverDataGuardAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    FailoverDataGuardAssociationRequest, FailoverDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAutonomousDatabaseWalletResponse>
            generateAutonomousDatabaseWallet(
                    GenerateAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAutonomousDatabaseWalletRequest,
                                    GenerateAutonomousDatabaseWalletResponse>
                            handler) {
        LOG.trace("Called async generateAutonomousDatabaseWallet");
        if (this.apacheConnectionClosingStrategy != null) {
            LOG.warn(
                    "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                            + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                    this.apacheConnectionClosingStrategy);
        }
        final GenerateAutonomousDatabaseWalletRequest interceptedRequest =
                GenerateAutonomousDatabaseWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAutonomousDatabaseWalletConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateAutonomousDatabaseWalletResponse>
                transformer = GenerateAutonomousDatabaseWalletConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateAutonomousDatabaseWalletRequest,
                        GenerateAutonomousDatabaseWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateAutonomousDatabaseWalletRequest,
                                GenerateAutonomousDatabaseWalletResponse>,
                        java.util.concurrent.Future<GenerateAutonomousDatabaseWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateAutonomousDatabaseWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateAutonomousDatabaseWalletRequest,
                    GenerateAutonomousDatabaseWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateRecommendedVmClusterNetworkResponse>
            generateRecommendedVmClusterNetwork(
                    GenerateRecommendedVmClusterNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateRecommendedVmClusterNetworkRequest,
                                    GenerateRecommendedVmClusterNetworkResponse>
                            handler) {
        LOG.trace("Called async generateRecommendedVmClusterNetwork");
        final GenerateRecommendedVmClusterNetworkRequest interceptedRequest =
                GenerateRecommendedVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateRecommendedVmClusterNetworkConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateRecommendedVmClusterNetworkResponse>
                transformer = GenerateRecommendedVmClusterNetworkConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateRecommendedVmClusterNetworkRequest,
                        GenerateRecommendedVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateRecommendedVmClusterNetworkRequest,
                                GenerateRecommendedVmClusterNetworkResponse>,
                        java.util.concurrent.Future<GenerateRecommendedVmClusterNetworkResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateRecommendedNetworkDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateRecommendedVmClusterNetworkRequest,
                    GenerateRecommendedVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousContainerDatabaseResponse>
            getAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseRequest,
                                    GetAutonomousContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async getAutonomousContainerDatabase");
        final GetAutonomousContainerDatabaseRequest interceptedRequest =
                GetAutonomousContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousContainerDatabaseResponse>
                transformer = GetAutonomousContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousContainerDatabaseRequest,
                        GetAutonomousContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousContainerDatabaseRequest,
                                GetAutonomousContainerDatabaseResponse>,
                        java.util.concurrent.Future<GetAutonomousContainerDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousContainerDatabaseRequest, GetAutonomousContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousContainerDatabaseDataguardAssociationResponse>
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {
        LOG.trace("Called async getAutonomousContainerDatabaseDataguardAssociation");
        final GetAutonomousContainerDatabaseDataguardAssociationRequest interceptedRequest =
                GetAutonomousContainerDatabaseDataguardAssociationConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousContainerDatabaseDataguardAssociationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse>
                transformer =
                        GetAutonomousContainerDatabaseDataguardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousContainerDatabaseDataguardAssociationRequest,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousContainerDatabaseDataguardAssociationRequest,
                                GetAutonomousContainerDatabaseDataguardAssociationResponse>,
                        java.util.concurrent.Future<
                                GetAutonomousContainerDatabaseDataguardAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                    GetAutonomousContainerDatabaseDataguardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseResponse> getAutonomousDatabase(
            GetAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async getAutonomousDatabase");
        final GetAutonomousDatabaseRequest interceptedRequest =
                GetAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousDatabaseResponse>
                transformer = GetAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<GetAutonomousDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseBackupResponse>
            getAutonomousDatabaseBackup(
                    GetAutonomousDatabaseBackupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseBackupRequest,
                                    GetAutonomousDatabaseBackupResponse>
                            handler) {
        LOG.trace("Called async getAutonomousDatabaseBackup");
        final GetAutonomousDatabaseBackupRequest interceptedRequest =
                GetAutonomousDatabaseBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousDatabaseBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousDatabaseBackupResponse>
                transformer = GetAutonomousDatabaseBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousDatabaseBackupRequest,
                                GetAutonomousDatabaseBackupResponse>,
                        java.util.concurrent.Future<GetAutonomousDatabaseBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseDataguardAssociationResponse>
            getAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseDataguardAssociationRequest,
                                    GetAutonomousDatabaseDataguardAssociationResponse>
                            handler) {
        LOG.trace("Called async getAutonomousDatabaseDataguardAssociation");
        final GetAutonomousDatabaseDataguardAssociationRequest interceptedRequest =
                GetAutonomousDatabaseDataguardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousDatabaseDataguardAssociationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        GetAutonomousDatabaseDataguardAssociationResponse>
                transformer = GetAutonomousDatabaseDataguardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousDatabaseDataguardAssociationRequest,
                        GetAutonomousDatabaseDataguardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousDatabaseDataguardAssociationRequest,
                                GetAutonomousDatabaseDataguardAssociationResponse>,
                        java.util.concurrent.Future<
                                GetAutonomousDatabaseDataguardAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousDatabaseDataguardAssociationRequest,
                    GetAutonomousDatabaseDataguardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseRegionalWalletResponse>
            getAutonomousDatabaseRegionalWallet(
                    GetAutonomousDatabaseRegionalWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseRegionalWalletRequest,
                                    GetAutonomousDatabaseRegionalWalletResponse>
                            handler) {
        LOG.trace("Called async getAutonomousDatabaseRegionalWallet");
        final GetAutonomousDatabaseRegionalWalletRequest interceptedRequest =
                GetAutonomousDatabaseRegionalWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousDatabaseRegionalWalletConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousDatabaseRegionalWalletResponse>
                transformer = GetAutonomousDatabaseRegionalWalletConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousDatabaseRegionalWalletRequest,
                        GetAutonomousDatabaseRegionalWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousDatabaseRegionalWalletRequest,
                                GetAutonomousDatabaseRegionalWalletResponse>,
                        java.util.concurrent.Future<GetAutonomousDatabaseRegionalWalletResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousDatabaseRegionalWalletRequest,
                    GetAutonomousDatabaseRegionalWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousDatabaseWalletResponse>
            getAutonomousDatabaseWallet(
                    GetAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseWalletRequest,
                                    GetAutonomousDatabaseWalletResponse>
                            handler) {
        LOG.trace("Called async getAutonomousDatabaseWallet");
        final GetAutonomousDatabaseWalletRequest interceptedRequest =
                GetAutonomousDatabaseWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousDatabaseWalletConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousDatabaseWalletResponse>
                transformer = GetAutonomousDatabaseWalletConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousDatabaseWalletRequest,
                                GetAutonomousDatabaseWalletResponse>,
                        java.util.concurrent.Future<GetAutonomousDatabaseWalletResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousExadataInfrastructureResponse>
            getAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousExadataInfrastructureRequest,
                                    GetAutonomousExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async getAutonomousExadataInfrastructure");
        final GetAutonomousExadataInfrastructureRequest interceptedRequest =
                GetAutonomousExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousExadataInfrastructureResponse>
                transformer = GetAutonomousExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousExadataInfrastructureRequest,
                        GetAutonomousExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousExadataInfrastructureRequest,
                                GetAutonomousExadataInfrastructureResponse>,
                        java.util.concurrent.Future<GetAutonomousExadataInfrastructureResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousPatchResponse> getAutonomousPatch(
            GetAutonomousPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousPatchRequest, GetAutonomousPatchResponse>
                    handler) {
        LOG.trace("Called async getAutonomousPatch");
        final GetAutonomousPatchRequest interceptedRequest =
                GetAutonomousPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousPatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAutonomousPatchResponse>
                transformer = GetAutonomousPatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetAutonomousPatchRequest, GetAutonomousPatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousPatchRequest, GetAutonomousPatchResponse>,
                        java.util.concurrent.Future<GetAutonomousPatchResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousPatchRequest, GetAutonomousPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutonomousVmClusterResponse> getAutonomousVmCluster(
            GetAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
                    handler) {
        LOG.trace("Called async getAutonomousVmCluster");
        final GetAutonomousVmClusterRequest interceptedRequest =
                GetAutonomousVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutonomousVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAutonomousVmClusterResponse>
                transformer = GetAutonomousVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>,
                        java.util.concurrent.Future<GetAutonomousVmClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            GetBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>
                    handler) {
        LOG.trace("Called async getBackup");
        final GetBackupRequest interceptedRequest = GetBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBackupResponse>
                transformer = GetBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>,
                        java.util.concurrent.Future<GetBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackupRequest, GetBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackupDestinationResponse> getBackupDestination(
            GetBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackupDestinationRequest, GetBackupDestinationResponse>
                    handler) {
        LOG.trace("Called async getBackupDestination");
        final GetBackupDestinationRequest interceptedRequest =
                GetBackupDestinationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupDestinationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBackupDestinationResponse>
                transformer = GetBackupDestinationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetBackupDestinationRequest, GetBackupDestinationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackupDestinationRequest, GetBackupDestinationResponse>,
                        java.util.concurrent.Future<GetBackupDestinationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackupDestinationRequest, GetBackupDestinationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCloudExadataInfrastructureResponse>
            getCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudExadataInfrastructureRequest,
                                    GetCloudExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async getCloudExadataInfrastructure");
        final GetCloudExadataInfrastructureRequest interceptedRequest =
                GetCloudExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCloudExadataInfrastructureResponse>
                transformer = GetCloudExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudExadataInfrastructureRequest,
                                GetCloudExadataInfrastructureResponse>,
                        java.util.concurrent.Future<GetCloudExadataInfrastructureResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterResponse> getCloudVmCluster(
            GetCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterRequest, GetCloudVmClusterResponse>
                    handler) {
        LOG.trace("Called async getCloudVmCluster");
        final GetCloudVmClusterRequest interceptedRequest =
                GetCloudVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCloudVmClusterResponse>
                transformer = GetCloudVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetCloudVmClusterRequest, GetCloudVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudVmClusterRequest, GetCloudVmClusterResponse>,
                        java.util.concurrent.Future<GetCloudVmClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudVmClusterRequest, GetCloudVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterIormConfigResponse>
            getCloudVmClusterIormConfig(
                    GetCloudVmClusterIormConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudVmClusterIormConfigRequest,
                                    GetCloudVmClusterIormConfigResponse>
                            handler) {
        LOG.trace("Called async getCloudVmClusterIormConfig");
        final GetCloudVmClusterIormConfigRequest interceptedRequest =
                GetCloudVmClusterIormConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudVmClusterIormConfigConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCloudVmClusterIormConfigResponse>
                transformer = GetCloudVmClusterIormConfigConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetCloudVmClusterIormConfigRequest, GetCloudVmClusterIormConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudVmClusterIormConfigRequest,
                                GetCloudVmClusterIormConfigResponse>,
                        java.util.concurrent.Future<GetCloudVmClusterIormConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudVmClusterIormConfigRequest, GetCloudVmClusterIormConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterUpdateResponse> getCloudVmClusterUpdate(
            GetCloudVmClusterUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>
                    handler) {
        LOG.trace("Called async getCloudVmClusterUpdate");
        final GetCloudVmClusterUpdateRequest interceptedRequest =
                GetCloudVmClusterUpdateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudVmClusterUpdateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCloudVmClusterUpdateResponse>
                transformer = GetCloudVmClusterUpdateConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>,
                        java.util.concurrent.Future<GetCloudVmClusterUpdateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCloudVmClusterUpdateHistoryEntryResponse>
            getCloudVmClusterUpdateHistoryEntry(
                    GetCloudVmClusterUpdateHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudVmClusterUpdateHistoryEntryRequest,
                                    GetCloudVmClusterUpdateHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getCloudVmClusterUpdateHistoryEntry");
        final GetCloudVmClusterUpdateHistoryEntryRequest interceptedRequest =
                GetCloudVmClusterUpdateHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudVmClusterUpdateHistoryEntryConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCloudVmClusterUpdateHistoryEntryResponse>
                transformer = GetCloudVmClusterUpdateHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetCloudVmClusterUpdateHistoryEntryRequest,
                        GetCloudVmClusterUpdateHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudVmClusterUpdateHistoryEntryRequest,
                                GetCloudVmClusterUpdateHistoryEntryResponse>,
                        java.util.concurrent.Future<GetCloudVmClusterUpdateHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudVmClusterUpdateHistoryEntryRequest,
                    GetCloudVmClusterUpdateHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConsoleConnectionResponse> getConsoleConnection(
            GetConsoleConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleConnectionRequest, GetConsoleConnectionResponse>
                    handler) {
        LOG.trace("Called async getConsoleConnection");
        final GetConsoleConnectionRequest interceptedRequest =
                GetConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetConsoleConnectionResponse>
                transformer = GetConsoleConnectionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetConsoleConnectionRequest, GetConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConsoleConnectionRequest, GetConsoleConnectionResponse>,
                        java.util.concurrent.Future<GetConsoleConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConsoleConnectionRequest, GetConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataGuardAssociationResponse> getDataGuardAssociation(
            GetDataGuardAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                    handler) {
        LOG.trace("Called async getDataGuardAssociation");
        final GetDataGuardAssociationRequest interceptedRequest =
                GetDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataGuardAssociationResponse>
                transformer = GetDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>,
                        java.util.concurrent.Future<GetDataGuardAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResponse> getDatabase(
            GetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getDatabase");
        final GetDatabaseRequest interceptedRequest =
                GetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseResponse>
                transformer = GetDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseRequest, GetDatabaseResponse>,
                        java.util.concurrent.Future<GetDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseRequest, GetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseSoftwareImageResponse> getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
                    handler) {
        LOG.trace("Called async getDatabaseSoftwareImage");
        final GetDatabaseSoftwareImageRequest interceptedRequest =
                GetDatabaseSoftwareImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseSoftwareImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDatabaseSoftwareImageResponse>
                transformer = GetDatabaseSoftwareImageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>,
                        java.util.concurrent.Future<GetDatabaseSoftwareImageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseUpgradeHistoryEntryResponse>
            getDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseUpgradeHistoryEntryRequest,
                                    GetDatabaseUpgradeHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDatabaseUpgradeHistoryEntry");
        final GetDatabaseUpgradeHistoryEntryRequest interceptedRequest =
                GetDatabaseUpgradeHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseUpgradeHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDatabaseUpgradeHistoryEntryResponse>
                transformer = GetDatabaseUpgradeHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseUpgradeHistoryEntryRequest,
                        GetDatabaseUpgradeHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseUpgradeHistoryEntryRequest,
                                GetDatabaseUpgradeHistoryEntryResponse>,
                        java.util.concurrent.Future<GetDatabaseUpgradeHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseUpgradeHistoryEntryRequest, GetDatabaseUpgradeHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbHomeResponse> getDbHome(
            GetDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse>
                    handler) {
        LOG.trace("Called async getDbHome");
        final GetDbHomeRequest interceptedRequest = GetDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomeResponse>
                transformer = GetDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse>,
                        java.util.concurrent.Future<GetDbHomeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbHomeRequest, GetDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchResponse> getDbHomePatch(
            GetDbHomePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbHomePatchRequest, GetDbHomePatchResponse>
                    handler) {
        LOG.trace("Called async getDbHomePatch");
        final GetDbHomePatchRequest interceptedRequest =
                GetDbHomePatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomePatchResponse>
                transformer = GetDbHomePatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbHomePatchRequest, GetDbHomePatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbHomePatchRequest, GetDbHomePatchResponse>,
                        java.util.concurrent.Future<GetDbHomePatchResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbHomePatchRequest, GetDbHomePatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse>
            getDbHomePatchHistoryEntry(
                    GetDbHomePatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbHomePatchHistoryEntryRequest,
                                    GetDbHomePatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbHomePatchHistoryEntry");
        final GetDbHomePatchHistoryEntryRequest interceptedRequest =
                GetDbHomePatchHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbHomePatchHistoryEntryResponse>
                transformer = GetDbHomePatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDbHomePatchHistoryEntryRequest, GetDbHomePatchHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbHomePatchHistoryEntryRequest,
                                GetDbHomePatchHistoryEntryResponse>,
                        java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbHomePatchHistoryEntryRequest, GetDbHomePatchHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbNodeResponse> getDbNode(
            GetDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse>
                    handler) {
        LOG.trace("Called async getDbNode");
        final GetDbNodeRequest interceptedRequest = GetDbNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbNodeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbNodeResponse>
                transformer = GetDbNodeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse>,
                        java.util.concurrent.Future<GetDbNodeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbNodeRequest, GetDbNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {
        LOG.trace("Called async getDbSystem");
        final GetDbSystemRequest interceptedRequest =
                GetDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemResponse>
                transformer = GetDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbSystemRequest, GetDbSystemResponse>,
                        java.util.concurrent.Future<GetDbSystemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbSystemRequest, GetDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchResponse> getDbSystemPatch(
            GetDbSystemPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                    handler) {
        LOG.trace("Called async getDbSystemPatch");
        final GetDbSystemPatchRequest interceptedRequest =
                GetDbSystemPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemPatchResponse>
                transformer = GetDbSystemPatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbSystemPatchRequest, GetDbSystemPatchResponse>,
                        java.util.concurrent.Future<GetDbSystemPatchResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbSystemPatchRequest, GetDbSystemPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse>
            getDbSystemPatchHistoryEntry(
                    GetDbSystemPatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemPatchHistoryEntryRequest,
                                    GetDbSystemPatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbSystemPatchHistoryEntry");
        final GetDbSystemPatchHistoryEntryRequest interceptedRequest =
                GetDbSystemPatchHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbSystemPatchHistoryEntryResponse>
                transformer = GetDbSystemPatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDbSystemPatchHistoryEntryRequest, GetDbSystemPatchHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbSystemPatchHistoryEntryRequest,
                                GetDbSystemPatchHistoryEntryResponse>,
                        java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbSystemPatchHistoryEntryRequest, GetDbSystemPatchHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExadataInfrastructureResponse> getExadataInfrastructure(
            GetExadataInfrastructureRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
                    handler) {
        LOG.trace("Called async getExadataInfrastructure");
        final GetExadataInfrastructureRequest interceptedRequest =
                GetExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExadataInfrastructureResponse>
                transformer = GetExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>,
                        java.util.concurrent.Future<GetExadataInfrastructureResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExadataInfrastructureOcpusResponse>
            getExadataInfrastructureOcpus(
                    GetExadataInfrastructureOcpusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExadataInfrastructureOcpusRequest,
                                    GetExadataInfrastructureOcpusResponse>
                            handler) {
        LOG.trace("Called async getExadataInfrastructureOcpus");
        final GetExadataInfrastructureOcpusRequest interceptedRequest =
                GetExadataInfrastructureOcpusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExadataInfrastructureOcpusConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExadataInfrastructureOcpusResponse>
                transformer = GetExadataInfrastructureOcpusConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExadataInfrastructureOcpusRequest, GetExadataInfrastructureOcpusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExadataInfrastructureOcpusRequest,
                                GetExadataInfrastructureOcpusResponse>,
                        java.util.concurrent.Future<GetExadataInfrastructureOcpusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExadataInfrastructureOcpusRequest, GetExadataInfrastructureOcpusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExadataIormConfigResponse> getExadataIormConfig(
            GetExadataIormConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExadataIormConfigRequest, GetExadataIormConfigResponse>
                    handler) {
        LOG.trace("Called async getExadataIormConfig");
        final GetExadataIormConfigRequest interceptedRequest =
                GetExadataIormConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExadataIormConfigConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExadataIormConfigResponse>
                transformer = GetExadataIormConfigConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExadataIormConfigRequest, GetExadataIormConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExadataIormConfigRequest, GetExadataIormConfigResponse>,
                        java.util.concurrent.Future<GetExadataIormConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExadataIormConfigRequest, GetExadataIormConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalBackupJobResponse> getExternalBackupJob(
            GetExternalBackupJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalBackupJobRequest, GetExternalBackupJobResponse>
                    handler) {
        LOG.trace("Called async getExternalBackupJob");
        final GetExternalBackupJobRequest interceptedRequest =
                GetExternalBackupJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalBackupJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalBackupJobResponse>
                transformer = GetExternalBackupJobConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalBackupJobRequest, GetExternalBackupJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalBackupJobRequest, GetExternalBackupJobResponse>,
                        java.util.concurrent.Future<GetExternalBackupJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalBackupJobRequest, GetExternalBackupJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalContainerDatabaseResponse>
            getExternalContainerDatabase(
                    GetExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalContainerDatabaseRequest,
                                    GetExternalContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async getExternalContainerDatabase");
        final GetExternalContainerDatabaseRequest interceptedRequest =
                GetExternalContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalContainerDatabaseResponse>
                transformer = GetExternalContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalContainerDatabaseRequest,
                                GetExternalContainerDatabaseResponse>,
                        java.util.concurrent.Future<GetExternalContainerDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDatabaseConnectorResponse>
            getExternalDatabaseConnector(
                    GetExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDatabaseConnectorRequest,
                                    GetExternalDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async getExternalDatabaseConnector");
        final GetExternalDatabaseConnectorRequest interceptedRequest =
                GetExternalDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDatabaseConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalDatabaseConnectorResponse>
                transformer = GetExternalDatabaseConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDatabaseConnectorRequest,
                                GetExternalDatabaseConnectorResponse>,
                        java.util.concurrent.Future<GetExternalDatabaseConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalNonContainerDatabaseResponse>
            getExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalNonContainerDatabaseRequest,
                                    GetExternalNonContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async getExternalNonContainerDatabase");
        final GetExternalNonContainerDatabaseRequest interceptedRequest =
                GetExternalNonContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalNonContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalNonContainerDatabaseResponse>
                transformer = GetExternalNonContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalNonContainerDatabaseRequest,
                        GetExternalNonContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalNonContainerDatabaseRequest,
                                GetExternalNonContainerDatabaseResponse>,
                        java.util.concurrent.Future<GetExternalNonContainerDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalNonContainerDatabaseRequest,
                    GetExternalNonContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalPluggableDatabaseResponse>
            getExternalPluggableDatabase(
                    GetExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalPluggableDatabaseRequest,
                                    GetExternalPluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async getExternalPluggableDatabase");
        final GetExternalPluggableDatabaseRequest interceptedRequest =
                GetExternalPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalPluggableDatabaseResponse>
                transformer = GetExternalPluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalPluggableDatabaseRequest,
                                GetExternalPluggableDatabaseResponse>,
                        java.util.concurrent.Future<GetExternalPluggableDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetKeyStoreResponse> getKeyStore(
            GetKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetKeyStoreRequest, GetKeyStoreResponse>
                    handler) {
        LOG.trace("Called async getKeyStore");
        final GetKeyStoreRequest interceptedRequest =
                GetKeyStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetKeyStoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetKeyStoreResponse>
                transformer = GetKeyStoreConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetKeyStoreRequest, GetKeyStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetKeyStoreRequest, GetKeyStoreResponse>,
                        java.util.concurrent.Future<GetKeyStoreResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetKeyStoreRequest, GetKeyStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceRunResponse> getMaintenanceRun(
            GetMaintenanceRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceRunRequest, GetMaintenanceRunResponse>
                    handler) {
        LOG.trace("Called async getMaintenanceRun");
        final GetMaintenanceRunRequest interceptedRequest =
                GetMaintenanceRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaintenanceRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMaintenanceRunResponse>
                transformer = GetMaintenanceRunConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaintenanceRunRequest, GetMaintenanceRunResponse>,
                        java.util.concurrent.Future<GetMaintenanceRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaintenanceRunRequest, GetMaintenanceRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPluggableDatabaseResponse> getPluggableDatabase(
            GetPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async getPluggableDatabase");
        final GetPluggableDatabaseRequest interceptedRequest =
                GetPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetPluggableDatabaseResponse>
                transformer = GetPluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>,
                        java.util.concurrent.Future<GetPluggableDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterResponse> getVmCluster(
            GetVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVmClusterRequest, GetVmClusterResponse>
                    handler) {
        LOG.trace("Called async getVmCluster");
        final GetVmClusterRequest interceptedRequest =
                GetVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVmClusterResponse>
                transformer = GetVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVmClusterRequest, GetVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterRequest, GetVmClusterResponse>,
                        java.util.concurrent.Future<GetVmClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterRequest, GetVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterNetworkResponse> getVmClusterNetwork(
            GetVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async getVmClusterNetwork");
        final GetVmClusterNetworkRequest interceptedRequest =
                GetVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVmClusterNetworkResponse>
                transformer = GetVmClusterNetworkConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>,
                        java.util.concurrent.Future<GetVmClusterNetworkResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterPatchResponse> getVmClusterPatch(
            GetVmClusterPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterPatchRequest, GetVmClusterPatchResponse>
                    handler) {
        LOG.trace("Called async getVmClusterPatch");
        final GetVmClusterPatchRequest interceptedRequest =
                GetVmClusterPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterPatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVmClusterPatchResponse>
                transformer = GetVmClusterPatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVmClusterPatchRequest, GetVmClusterPatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterPatchRequest, GetVmClusterPatchResponse>,
                        java.util.concurrent.Future<GetVmClusterPatchResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterPatchRequest, GetVmClusterPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterPatchHistoryEntryResponse>
            getVmClusterPatchHistoryEntry(
                    GetVmClusterPatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterPatchHistoryEntryRequest,
                                    GetVmClusterPatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getVmClusterPatchHistoryEntry");
        final GetVmClusterPatchHistoryEntryRequest interceptedRequest =
                GetVmClusterPatchHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterPatchHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVmClusterPatchHistoryEntryResponse>
                transformer = GetVmClusterPatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVmClusterPatchHistoryEntryRequest, GetVmClusterPatchHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterPatchHistoryEntryRequest,
                                GetVmClusterPatchHistoryEntryResponse>,
                        java.util.concurrent.Future<GetVmClusterPatchHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterPatchHistoryEntryRequest, GetVmClusterPatchHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterUpdateResponse> getVmClusterUpdate(
            GetVmClusterUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
                    handler) {
        LOG.trace("Called async getVmClusterUpdate");
        final GetVmClusterUpdateRequest interceptedRequest =
                GetVmClusterUpdateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterUpdateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVmClusterUpdateResponse>
                transformer = GetVmClusterUpdateConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>,
                        java.util.concurrent.Future<GetVmClusterUpdateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVmClusterUpdateHistoryEntryResponse>
            getVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterUpdateHistoryEntryRequest,
                                    GetVmClusterUpdateHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getVmClusterUpdateHistoryEntry");
        final GetVmClusterUpdateHistoryEntryRequest interceptedRequest =
                GetVmClusterUpdateHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVmClusterUpdateHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVmClusterUpdateHistoryEntryResponse>
                transformer = GetVmClusterUpdateHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVmClusterUpdateHistoryEntryRequest,
                        GetVmClusterUpdateHistoryEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVmClusterUpdateHistoryEntryRequest,
                                GetVmClusterUpdateHistoryEntryResponse>,
                        java.util.concurrent.Future<GetVmClusterUpdateHistoryEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVmClusterUpdateHistoryEntryRequest, GetVmClusterUpdateHistoryEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LaunchAutonomousExadataInfrastructureResponse>
            launchAutonomousExadataInfrastructure(
                    LaunchAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LaunchAutonomousExadataInfrastructureRequest,
                                    LaunchAutonomousExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async launchAutonomousExadataInfrastructure");
        final LaunchAutonomousExadataInfrastructureRequest interceptedRequest =
                LaunchAutonomousExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchAutonomousExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, LaunchAutonomousExadataInfrastructureResponse>
                transformer = LaunchAutonomousExadataInfrastructureConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        LaunchAutonomousExadataInfrastructureRequest,
                        LaunchAutonomousExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchAutonomousExadataInfrastructureRequest,
                                LaunchAutonomousExadataInfrastructureResponse>,
                        java.util.concurrent.Future<LaunchAutonomousExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getLaunchAutonomousExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchAutonomousExadataInfrastructureRequest,
                    LaunchAutonomousExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LaunchDbSystemResponse> launchDbSystem(
            LaunchDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LaunchDbSystemRequest, LaunchDbSystemResponse>
                    handler) {
        LOG.trace("Called async launchDbSystem");
        final LaunchDbSystemRequest interceptedRequest =
                LaunchDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, LaunchDbSystemResponse>
                transformer = LaunchDbSystemConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<LaunchDbSystemRequest, LaunchDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchDbSystemRequest, LaunchDbSystemResponse>,
                        java.util.concurrent.Future<LaunchDbSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLaunchDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchDbSystemRequest, LaunchDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousContainerDatabaseDataguardAssociationsResponse>
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                                    ListAutonomousContainerDatabaseDataguardAssociationsResponse>
                            handler) {
        LOG.trace("Called async listAutonomousContainerDatabaseDataguardAssociations");
        final ListAutonomousContainerDatabaseDataguardAssociationsRequest interceptedRequest =
                ListAutonomousContainerDatabaseDataguardAssociationsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousContainerDatabaseDataguardAssociationsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse>
                transformer =
                        ListAutonomousContainerDatabaseDataguardAssociationsConverter
                                .fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                                ListAutonomousContainerDatabaseDataguardAssociationsResponse>,
                        java.util.concurrent.Future<
                                ListAutonomousContainerDatabaseDataguardAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                    ListAutonomousContainerDatabaseDataguardAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousContainerDatabasesResponse>
            listAutonomousContainerDatabases(
                    ListAutonomousContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabasesRequest,
                                    ListAutonomousContainerDatabasesResponse>
                            handler) {
        LOG.trace("Called async listAutonomousContainerDatabases");
        final ListAutonomousContainerDatabasesRequest interceptedRequest =
                ListAutonomousContainerDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousContainerDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousContainerDatabasesResponse>
                transformer = ListAutonomousContainerDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousContainerDatabasesRequest,
                        ListAutonomousContainerDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousContainerDatabasesRequest,
                                ListAutonomousContainerDatabasesResponse>,
                        java.util.concurrent.Future<ListAutonomousContainerDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousContainerDatabasesRequest,
                    ListAutonomousContainerDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseBackupsResponse>
            listAutonomousDatabaseBackups(
                    ListAutonomousDatabaseBackupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseBackupsRequest,
                                    ListAutonomousDatabaseBackupsResponse>
                            handler) {
        LOG.trace("Called async listAutonomousDatabaseBackups");
        final ListAutonomousDatabaseBackupsRequest interceptedRequest =
                ListAutonomousDatabaseBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDatabaseBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousDatabaseBackupsResponse>
                transformer = ListAutonomousDatabaseBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDatabaseBackupsRequest, ListAutonomousDatabaseBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDatabaseBackupsRequest,
                                ListAutonomousDatabaseBackupsResponse>,
                        java.util.concurrent.Future<ListAutonomousDatabaseBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDatabaseBackupsRequest, ListAutonomousDatabaseBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseClonesResponse>
            listAutonomousDatabaseClones(
                    ListAutonomousDatabaseClonesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseClonesRequest,
                                    ListAutonomousDatabaseClonesResponse>
                            handler) {
        LOG.trace("Called async listAutonomousDatabaseClones");
        final ListAutonomousDatabaseClonesRequest interceptedRequest =
                ListAutonomousDatabaseClonesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDatabaseClonesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousDatabaseClonesResponse>
                transformer = ListAutonomousDatabaseClonesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDatabaseClonesRequest, ListAutonomousDatabaseClonesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDatabaseClonesRequest,
                                ListAutonomousDatabaseClonesResponse>,
                        java.util.concurrent.Future<ListAutonomousDatabaseClonesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDatabaseClonesRequest, ListAutonomousDatabaseClonesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabaseDataguardAssociationsResponse>
            listAutonomousDatabaseDataguardAssociations(
                    ListAutonomousDatabaseDataguardAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseDataguardAssociationsRequest,
                                    ListAutonomousDatabaseDataguardAssociationsResponse>
                            handler) {
        LOG.trace("Called async listAutonomousDatabaseDataguardAssociations");
        final ListAutonomousDatabaseDataguardAssociationsRequest interceptedRequest =
                ListAutonomousDatabaseDataguardAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDatabaseDataguardAssociationsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAutonomousDatabaseDataguardAssociationsResponse>
                transformer = ListAutonomousDatabaseDataguardAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDatabaseDataguardAssociationsRequest,
                        ListAutonomousDatabaseDataguardAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDatabaseDataguardAssociationsRequest,
                                ListAutonomousDatabaseDataguardAssociationsResponse>,
                        java.util.concurrent.Future<
                                ListAutonomousDatabaseDataguardAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDatabaseDataguardAssociationsRequest,
                    ListAutonomousDatabaseDataguardAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDatabasesResponse> listAutonomousDatabases(
            ListAutonomousDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>
                    handler) {
        LOG.trace("Called async listAutonomousDatabases");
        final ListAutonomousDatabasesRequest interceptedRequest =
                ListAutonomousDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousDatabasesResponse>
                transformer = ListAutonomousDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>,
                        java.util.concurrent.Future<ListAutonomousDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDbPreviewVersionsResponse>
            listAutonomousDbPreviewVersions(
                    ListAutonomousDbPreviewVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDbPreviewVersionsRequest,
                                    ListAutonomousDbPreviewVersionsResponse>
                            handler) {
        LOG.trace("Called async listAutonomousDbPreviewVersions");
        final ListAutonomousDbPreviewVersionsRequest interceptedRequest =
                ListAutonomousDbPreviewVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDbPreviewVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousDbPreviewVersionsResponse>
                transformer = ListAutonomousDbPreviewVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDbPreviewVersionsRequest,
                        ListAutonomousDbPreviewVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDbPreviewVersionsRequest,
                                ListAutonomousDbPreviewVersionsResponse>,
                        java.util.concurrent.Future<ListAutonomousDbPreviewVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDbPreviewVersionsRequest,
                    ListAutonomousDbPreviewVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousDbVersionsResponse> listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>
                    handler) {
        LOG.trace("Called async listAutonomousDbVersions");
        final ListAutonomousDbVersionsRequest interceptedRequest =
                ListAutonomousDbVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousDbVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousDbVersionsResponse>
                transformer = ListAutonomousDbVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>,
                        java.util.concurrent.Future<ListAutonomousDbVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousExadataInfrastructureShapesResponse>
            listAutonomousExadataInfrastructureShapes(
                    ListAutonomousExadataInfrastructureShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructureShapesRequest,
                                    ListAutonomousExadataInfrastructureShapesResponse>
                            handler) {
        LOG.trace("Called async listAutonomousExadataInfrastructureShapes");
        final ListAutonomousExadataInfrastructureShapesRequest interceptedRequest =
                ListAutonomousExadataInfrastructureShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousExadataInfrastructureShapesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAutonomousExadataInfrastructureShapesResponse>
                transformer = ListAutonomousExadataInfrastructureShapesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousExadataInfrastructureShapesRequest,
                        ListAutonomousExadataInfrastructureShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousExadataInfrastructureShapesRequest,
                                ListAutonomousExadataInfrastructureShapesResponse>,
                        java.util.concurrent.Future<
                                ListAutonomousExadataInfrastructureShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousExadataInfrastructureShapesRequest,
                    ListAutonomousExadataInfrastructureShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousExadataInfrastructuresResponse>
            listAutonomousExadataInfrastructures(
                    ListAutonomousExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructuresRequest,
                                    ListAutonomousExadataInfrastructuresResponse>
                            handler) {
        LOG.trace("Called async listAutonomousExadataInfrastructures");
        final ListAutonomousExadataInfrastructuresRequest interceptedRequest =
                ListAutonomousExadataInfrastructuresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousExadataInfrastructuresConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousExadataInfrastructuresResponse>
                transformer = ListAutonomousExadataInfrastructuresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousExadataInfrastructuresRequest,
                        ListAutonomousExadataInfrastructuresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousExadataInfrastructuresRequest,
                                ListAutonomousExadataInfrastructuresResponse>,
                        java.util.concurrent.Future<ListAutonomousExadataInfrastructuresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousExadataInfrastructuresRequest,
                    ListAutonomousExadataInfrastructuresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutonomousVmClustersResponse> listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>
                    handler) {
        LOG.trace("Called async listAutonomousVmClusters");
        final ListAutonomousVmClustersRequest interceptedRequest =
                ListAutonomousVmClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutonomousVmClustersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutonomousVmClustersResponse>
                transformer = ListAutonomousVmClustersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>,
                        java.util.concurrent.Future<ListAutonomousVmClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBackupDestinationResponse> listBackupDestination(
            ListBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBackupDestinationRequest, ListBackupDestinationResponse>
                    handler) {
        LOG.trace("Called async listBackupDestination");
        final ListBackupDestinationRequest interceptedRequest =
                ListBackupDestinationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupDestinationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBackupDestinationResponse>
                transformer = ListBackupDestinationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListBackupDestinationRequest, ListBackupDestinationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBackupDestinationRequest, ListBackupDestinationResponse>,
                        java.util.concurrent.Future<ListBackupDestinationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBackupDestinationRequest, ListBackupDestinationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {
        LOG.trace("Called async listBackups");
        final ListBackupsRequest interceptedRequest =
                ListBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBackupsResponse>
                transformer = ListBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBackupsRequest, ListBackupsResponse>,
                        java.util.concurrent.Future<ListBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBackupsRequest, ListBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCloudExadataInfrastructuresResponse>
            listCloudExadataInfrastructures(
                    ListCloudExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudExadataInfrastructuresRequest,
                                    ListCloudExadataInfrastructuresResponse>
                            handler) {
        LOG.trace("Called async listCloudExadataInfrastructures");
        final ListCloudExadataInfrastructuresRequest interceptedRequest =
                ListCloudExadataInfrastructuresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudExadataInfrastructuresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCloudExadataInfrastructuresResponse>
                transformer = ListCloudExadataInfrastructuresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudExadataInfrastructuresRequest,
                        ListCloudExadataInfrastructuresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudExadataInfrastructuresRequest,
                                ListCloudExadataInfrastructuresResponse>,
                        java.util.concurrent.Future<ListCloudExadataInfrastructuresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudExadataInfrastructuresRequest,
                    ListCloudExadataInfrastructuresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClusterUpdateHistoryEntriesResponse>
            listCloudVmClusterUpdateHistoryEntries(
                    ListCloudVmClusterUpdateHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudVmClusterUpdateHistoryEntriesRequest,
                                    ListCloudVmClusterUpdateHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listCloudVmClusterUpdateHistoryEntries");
        final ListCloudVmClusterUpdateHistoryEntriesRequest interceptedRequest =
                ListCloudVmClusterUpdateHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudVmClusterUpdateHistoryEntriesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCloudVmClusterUpdateHistoryEntriesResponse>
                transformer = ListCloudVmClusterUpdateHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudVmClusterUpdateHistoryEntriesRequest,
                        ListCloudVmClusterUpdateHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudVmClusterUpdateHistoryEntriesRequest,
                                ListCloudVmClusterUpdateHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListCloudVmClusterUpdateHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudVmClusterUpdateHistoryEntriesRequest,
                    ListCloudVmClusterUpdateHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClusterUpdatesResponse> listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>
                    handler) {
        LOG.trace("Called async listCloudVmClusterUpdates");
        final ListCloudVmClusterUpdatesRequest interceptedRequest =
                ListCloudVmClusterUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudVmClusterUpdatesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCloudVmClusterUpdatesResponse>
                transformer = ListCloudVmClusterUpdatesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudVmClusterUpdatesRequest,
                                ListCloudVmClusterUpdatesResponse>,
                        java.util.concurrent.Future<ListCloudVmClusterUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCloudVmClustersResponse> listCloudVmClusters(
            ListCloudVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClustersRequest, ListCloudVmClustersResponse>
                    handler) {
        LOG.trace("Called async listCloudVmClusters");
        final ListCloudVmClustersRequest interceptedRequest =
                ListCloudVmClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudVmClustersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCloudVmClustersResponse>
                transformer = ListCloudVmClustersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudVmClustersRequest, ListCloudVmClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudVmClustersRequest, ListCloudVmClustersResponse>,
                        java.util.concurrent.Future<ListCloudVmClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudVmClustersRequest, ListCloudVmClustersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConsoleConnectionsResponse> listConsoleConnections(
            ListConsoleConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>
                    handler) {
        LOG.trace("Called async listConsoleConnections");
        final ListConsoleConnectionsRequest interceptedRequest =
                ListConsoleConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsoleConnectionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConsoleConnectionsResponse>
                transformer = ListConsoleConnectionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>,
                        java.util.concurrent.Future<ListConsoleConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListContainerDatabasePatchesResponse>
            listContainerDatabasePatches(
                    ListContainerDatabasePatchesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListContainerDatabasePatchesRequest,
                                    ListContainerDatabasePatchesResponse>
                            handler) {
        LOG.trace("Called async listContainerDatabasePatches");
        final ListContainerDatabasePatchesRequest interceptedRequest =
                ListContainerDatabasePatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListContainerDatabasePatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListContainerDatabasePatchesResponse>
                transformer = ListContainerDatabasePatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListContainerDatabasePatchesRequest, ListContainerDatabasePatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListContainerDatabasePatchesRequest,
                                ListContainerDatabasePatchesResponse>,
                        java.util.concurrent.Future<ListContainerDatabasePatchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListContainerDatabasePatchesRequest, ListContainerDatabasePatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataGuardAssociationsResponse> listDataGuardAssociations(
            ListDataGuardAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                    handler) {
        LOG.trace("Called async listDataGuardAssociations");
        final ListDataGuardAssociationsRequest interceptedRequest =
                ListDataGuardAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataGuardAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataGuardAssociationsResponse>
                transformer = ListDataGuardAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataGuardAssociationsRequest,
                                ListDataGuardAssociationsResponse>,
                        java.util.concurrent.Future<ListDataGuardAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseSoftwareImagesResponse>
            listDatabaseSoftwareImages(
                    ListDatabaseSoftwareImagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseSoftwareImagesRequest,
                                    ListDatabaseSoftwareImagesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseSoftwareImages");
        final ListDatabaseSoftwareImagesRequest interceptedRequest =
                ListDatabaseSoftwareImagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseSoftwareImagesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseSoftwareImagesResponse>
                transformer = ListDatabaseSoftwareImagesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseSoftwareImagesRequest, ListDatabaseSoftwareImagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseSoftwareImagesRequest,
                                ListDatabaseSoftwareImagesResponse>,
                        java.util.concurrent.Future<ListDatabaseSoftwareImagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseSoftwareImagesRequest, ListDatabaseSoftwareImagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseUpgradeHistoryEntriesResponse>
            listDatabaseUpgradeHistoryEntries(
                    ListDatabaseUpgradeHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseUpgradeHistoryEntriesRequest,
                                    ListDatabaseUpgradeHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseUpgradeHistoryEntries");
        final ListDatabaseUpgradeHistoryEntriesRequest interceptedRequest =
                ListDatabaseUpgradeHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseUpgradeHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseUpgradeHistoryEntriesResponse>
                transformer = ListDatabaseUpgradeHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseUpgradeHistoryEntriesRequest,
                        ListDatabaseUpgradeHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseUpgradeHistoryEntriesRequest,
                                ListDatabaseUpgradeHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListDatabaseUpgradeHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseUpgradeHistoryEntriesRequest,
                    ListDatabaseUpgradeHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            ListDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler) {
        LOG.trace("Called async listDatabases");
        final ListDatabasesRequest interceptedRequest =
                ListDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDatabasesResponse>
                transformer = ListDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabasesRequest, ListDatabasesResponse>,
                        java.util.concurrent.Future<ListDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabasesRequest, ListDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntries(
                    ListDbHomePatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbHomePatchHistoryEntriesRequest,
                                    ListDbHomePatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbHomePatchHistoryEntries");
        final ListDbHomePatchHistoryEntriesRequest interceptedRequest =
                ListDbHomePatchHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbHomePatchHistoryEntriesResponse>
                transformer = ListDbHomePatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbHomePatchHistoryEntriesRequest, ListDbHomePatchHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbHomePatchHistoryEntriesRequest,
                                ListDbHomePatchHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbHomePatchHistoryEntriesRequest, ListDbHomePatchHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchesResponse> listDbHomePatches(
            ListDbHomePatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                    handler) {
        LOG.trace("Called async listDbHomePatches");
        final ListDbHomePatchesRequest interceptedRequest =
                ListDbHomePatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomePatchesResponse>
                transformer = ListDbHomePatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbHomePatchesRequest, ListDbHomePatchesResponse>,
                        java.util.concurrent.Future<ListDbHomePatchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbHomePatchesRequest, ListDbHomePatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbHomesResponse> listDbHomes(
            ListDbHomesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                    handler) {
        LOG.trace("Called async listDbHomes");
        final ListDbHomesRequest interceptedRequest =
                ListDbHomesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomesResponse>
                transformer = ListDbHomesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbHomesRequest, ListDbHomesResponse>,
                        java.util.concurrent.Future<ListDbHomesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbHomesRequest, ListDbHomesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbNodesResponse> listDbNodes(
            ListDbNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                    handler) {
        LOG.trace("Called async listDbNodes");
        final ListDbNodesRequest interceptedRequest =
                ListDbNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbNodesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbNodesResponse>
                transformer = ListDbNodesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbNodesRequest, ListDbNodesResponse>,
                        java.util.concurrent.Future<ListDbNodesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbNodesRequest, ListDbNodesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntries(
                    ListDbSystemPatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemPatchHistoryEntriesRequest,
                                    ListDbSystemPatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbSystemPatchHistoryEntries");
        final ListDbSystemPatchHistoryEntriesRequest interceptedRequest =
                ListDbSystemPatchHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchHistoryEntriesResponse>
                transformer = ListDbSystemPatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbSystemPatchHistoryEntriesRequest,
                                ListDbSystemPatchHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbSystemPatchHistoryEntriesRequest,
                    ListDbSystemPatchHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchesResponse> listDbSystemPatches(
            ListDbSystemPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemPatches");
        final ListDbSystemPatchesRequest interceptedRequest =
                ListDbSystemPatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchesResponse>
                transformer = ListDbSystemPatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>,
                        java.util.concurrent.Future<ListDbSystemPatchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemShapesResponse> listDbSystemShapes(
            ListDbSystemShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemShapes");
        final ListDbSystemShapesRequest interceptedRequest =
                ListDbSystemShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemShapesResponse>
                transformer = ListDbSystemShapesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbSystemShapesRequest, ListDbSystemShapesResponse>,
                        java.util.concurrent.Future<ListDbSystemShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbSystemShapesRequest, ListDbSystemShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
        LOG.trace("Called async listDbSystems");
        final ListDbSystemsRequest interceptedRequest =
                ListDbSystemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemsResponse>
                transformer = ListDbSystemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbSystemsRequest, ListDbSystemsResponse>,
                        java.util.concurrent.Future<ListDbSystemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbSystemsRequest, ListDbSystemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbVersionsResponse> listDbVersions(
            ListDbVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbVersionsRequest, ListDbVersionsResponse>
                    handler) {
        LOG.trace("Called async listDbVersions");
        final ListDbVersionsRequest interceptedRequest =
                ListDbVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbVersionsResponse>
                transformer = ListDbVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbVersionsRequest, ListDbVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbVersionsRequest, ListDbVersionsResponse>,
                        java.util.concurrent.Future<ListDbVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbVersionsRequest, ListDbVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExadataInfrastructuresResponse>
            listExadataInfrastructures(
                    ListExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExadataInfrastructuresRequest,
                                    ListExadataInfrastructuresResponse>
                            handler) {
        LOG.trace("Called async listExadataInfrastructures");
        final ListExadataInfrastructuresRequest interceptedRequest =
                ListExadataInfrastructuresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExadataInfrastructuresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExadataInfrastructuresResponse>
                transformer = ListExadataInfrastructuresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExadataInfrastructuresRequest,
                                ListExadataInfrastructuresResponse>,
                        java.util.concurrent.Future<ListExadataInfrastructuresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalContainerDatabasesResponse>
            listExternalContainerDatabases(
                    ListExternalContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalContainerDatabasesRequest,
                                    ListExternalContainerDatabasesResponse>
                            handler) {
        LOG.trace("Called async listExternalContainerDatabases");
        final ListExternalContainerDatabasesRequest interceptedRequest =
                ListExternalContainerDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalContainerDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExternalContainerDatabasesResponse>
                transformer = ListExternalContainerDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalContainerDatabasesRequest,
                        ListExternalContainerDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalContainerDatabasesRequest,
                                ListExternalContainerDatabasesResponse>,
                        java.util.concurrent.Future<ListExternalContainerDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalContainerDatabasesRequest, ListExternalContainerDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDatabaseConnectorsResponse>
            listExternalDatabaseConnectors(
                    ListExternalDatabaseConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDatabaseConnectorsRequest,
                                    ListExternalDatabaseConnectorsResponse>
                            handler) {
        LOG.trace("Called async listExternalDatabaseConnectors");
        final ListExternalDatabaseConnectorsRequest interceptedRequest =
                ListExternalDatabaseConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDatabaseConnectorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExternalDatabaseConnectorsResponse>
                transformer = ListExternalDatabaseConnectorsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDatabaseConnectorsRequest,
                        ListExternalDatabaseConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDatabaseConnectorsRequest,
                                ListExternalDatabaseConnectorsResponse>,
                        java.util.concurrent.Future<ListExternalDatabaseConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDatabaseConnectorsRequest, ListExternalDatabaseConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalNonContainerDatabasesResponse>
            listExternalNonContainerDatabases(
                    ListExternalNonContainerDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalNonContainerDatabasesRequest,
                                    ListExternalNonContainerDatabasesResponse>
                            handler) {
        LOG.trace("Called async listExternalNonContainerDatabases");
        final ListExternalNonContainerDatabasesRequest interceptedRequest =
                ListExternalNonContainerDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalNonContainerDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExternalNonContainerDatabasesResponse>
                transformer = ListExternalNonContainerDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalNonContainerDatabasesRequest,
                        ListExternalNonContainerDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalNonContainerDatabasesRequest,
                                ListExternalNonContainerDatabasesResponse>,
                        java.util.concurrent.Future<ListExternalNonContainerDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalNonContainerDatabasesRequest,
                    ListExternalNonContainerDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalPluggableDatabasesResponse>
            listExternalPluggableDatabases(
                    ListExternalPluggableDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPluggableDatabasesRequest,
                                    ListExternalPluggableDatabasesResponse>
                            handler) {
        LOG.trace("Called async listExternalPluggableDatabases");
        final ListExternalPluggableDatabasesRequest interceptedRequest =
                ListExternalPluggableDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalPluggableDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExternalPluggableDatabasesResponse>
                transformer = ListExternalPluggableDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalPluggableDatabasesRequest,
                        ListExternalPluggableDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalPluggableDatabasesRequest,
                                ListExternalPluggableDatabasesResponse>,
                        java.util.concurrent.Future<ListExternalPluggableDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalPluggableDatabasesRequest, ListExternalPluggableDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFlexComponentsResponse> listFlexComponents(
            ListFlexComponentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFlexComponentsRequest, ListFlexComponentsResponse>
                    handler) {
        LOG.trace("Called async listFlexComponents");
        final ListFlexComponentsRequest interceptedRequest =
                ListFlexComponentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFlexComponentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFlexComponentsResponse>
                transformer = ListFlexComponentsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListFlexComponentsRequest, ListFlexComponentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFlexComponentsRequest, ListFlexComponentsResponse>,
                        java.util.concurrent.Future<ListFlexComponentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFlexComponentsRequest, ListFlexComponentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGiVersionsResponse> listGiVersions(
            ListGiVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGiVersionsRequest, ListGiVersionsResponse>
                    handler) {
        LOG.trace("Called async listGiVersions");
        final ListGiVersionsRequest interceptedRequest =
                ListGiVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGiVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGiVersionsResponse>
                transformer = ListGiVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListGiVersionsRequest, ListGiVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGiVersionsRequest, ListGiVersionsResponse>,
                        java.util.concurrent.Future<ListGiVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGiVersionsRequest, ListGiVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListKeyStoresResponse> listKeyStores(
            ListKeyStoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListKeyStoresRequest, ListKeyStoresResponse>
                    handler) {
        LOG.trace("Called async listKeyStores");
        final ListKeyStoresRequest interceptedRequest =
                ListKeyStoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListKeyStoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListKeyStoresResponse>
                transformer = ListKeyStoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListKeyStoresRequest, ListKeyStoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListKeyStoresRequest, ListKeyStoresResponse>,
                        java.util.concurrent.Future<ListKeyStoresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListKeyStoresRequest, ListKeyStoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaintenanceRunsResponse> listMaintenanceRuns(
            ListMaintenanceRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>
                    handler) {
        LOG.trace("Called async listMaintenanceRuns");
        final ListMaintenanceRunsRequest interceptedRequest =
                ListMaintenanceRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaintenanceRunsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMaintenanceRunsResponse>
                transformer = ListMaintenanceRunsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>,
                        java.util.concurrent.Future<ListMaintenanceRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPluggableDatabasesResponse> listPluggableDatabases(
            ListPluggableDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>
                    handler) {
        LOG.trace("Called async listPluggableDatabases");
        final ListPluggableDatabasesRequest interceptedRequest =
                ListPluggableDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPluggableDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPluggableDatabasesResponse>
                transformer = ListPluggableDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>,
                        java.util.concurrent.Future<ListPluggableDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterNetworksResponse> listVmClusterNetworks(
            ListVmClusterNetworksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>
                    handler) {
        LOG.trace("Called async listVmClusterNetworks");
        final ListVmClusterNetworksRequest interceptedRequest =
                ListVmClusterNetworksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClusterNetworksConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVmClusterNetworksResponse>
                transformer = ListVmClusterNetworksConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>,
                        java.util.concurrent.Future<ListVmClusterNetworksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterPatchHistoryEntriesResponse>
            listVmClusterPatchHistoryEntries(
                    ListVmClusterPatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterPatchHistoryEntriesRequest,
                                    ListVmClusterPatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listVmClusterPatchHistoryEntries");
        final ListVmClusterPatchHistoryEntriesRequest interceptedRequest =
                ListVmClusterPatchHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClusterPatchHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVmClusterPatchHistoryEntriesResponse>
                transformer = ListVmClusterPatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVmClusterPatchHistoryEntriesRequest,
                        ListVmClusterPatchHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClusterPatchHistoryEntriesRequest,
                                ListVmClusterPatchHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListVmClusterPatchHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClusterPatchHistoryEntriesRequest,
                    ListVmClusterPatchHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterPatchesResponse> listVmClusterPatches(
            ListVmClusterPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>
                    handler) {
        LOG.trace("Called async listVmClusterPatches");
        final ListVmClusterPatchesRequest interceptedRequest =
                ListVmClusterPatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClusterPatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVmClusterPatchesResponse>
                transformer = ListVmClusterPatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>,
                        java.util.concurrent.Future<ListVmClusterPatchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterUpdateHistoryEntriesResponse>
            listVmClusterUpdateHistoryEntries(
                    ListVmClusterUpdateHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterUpdateHistoryEntriesRequest,
                                    ListVmClusterUpdateHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listVmClusterUpdateHistoryEntries");
        final ListVmClusterUpdateHistoryEntriesRequest interceptedRequest =
                ListVmClusterUpdateHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClusterUpdateHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVmClusterUpdateHistoryEntriesResponse>
                transformer = ListVmClusterUpdateHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVmClusterUpdateHistoryEntriesRequest,
                        ListVmClusterUpdateHistoryEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClusterUpdateHistoryEntriesRequest,
                                ListVmClusterUpdateHistoryEntriesResponse>,
                        java.util.concurrent.Future<ListVmClusterUpdateHistoryEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClusterUpdateHistoryEntriesRequest,
                    ListVmClusterUpdateHistoryEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClusterUpdatesResponse> listVmClusterUpdates(
            ListVmClusterUpdatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>
                    handler) {
        LOG.trace("Called async listVmClusterUpdates");
        final ListVmClusterUpdatesRequest interceptedRequest =
                ListVmClusterUpdatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClusterUpdatesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVmClusterUpdatesResponse>
                transformer = ListVmClusterUpdatesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>,
                        java.util.concurrent.Future<ListVmClusterUpdatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVmClustersResponse> listVmClusters(
            ListVmClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVmClustersRequest, ListVmClustersResponse>
                    handler) {
        LOG.trace("Called async listVmClusters");
        final ListVmClustersRequest interceptedRequest =
                ListVmClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVmClustersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVmClustersResponse>
                transformer = ListVmClustersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVmClustersRequest, ListVmClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVmClustersRequest, ListVmClustersResponse>,
                        java.util.concurrent.Future<ListVmClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVmClustersRequest, ListVmClustersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LocalClonePluggableDatabaseResponse>
            localClonePluggableDatabase(
                    LocalClonePluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LocalClonePluggableDatabaseRequest,
                                    LocalClonePluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async localClonePluggableDatabase");
        final LocalClonePluggableDatabaseRequest interceptedRequest =
                LocalClonePluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LocalClonePluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, LocalClonePluggableDatabaseResponse>
                transformer = LocalClonePluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        LocalClonePluggableDatabaseRequest, LocalClonePluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LocalClonePluggableDatabaseRequest,
                                LocalClonePluggableDatabaseResponse>,
                        java.util.concurrent.Future<LocalClonePluggableDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLocalClonePluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LocalClonePluggableDatabaseRequest, LocalClonePluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<MigrateExadataDbSystemResourceModelResponse>
            migrateExadataDbSystemResourceModel(
                    MigrateExadataDbSystemResourceModelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MigrateExadataDbSystemResourceModelRequest,
                                    MigrateExadataDbSystemResourceModelResponse>
                            handler) {
        LOG.trace("Called async migrateExadataDbSystemResourceModel");
        final MigrateExadataDbSystemResourceModelRequest interceptedRequest =
                MigrateExadataDbSystemResourceModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MigrateExadataDbSystemResourceModelConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, MigrateExadataDbSystemResourceModelResponse>
                transformer = MigrateExadataDbSystemResourceModelConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        MigrateExadataDbSystemResourceModelRequest,
                        MigrateExadataDbSystemResourceModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MigrateExadataDbSystemResourceModelRequest,
                                MigrateExadataDbSystemResourceModelResponse>,
                        java.util.concurrent.Future<MigrateExadataDbSystemResourceModelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MigrateExadataDbSystemResourceModelRequest,
                    MigrateExadataDbSystemResourceModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<MigrateVaultKeyResponse> migrateVaultKey(
            MigrateVaultKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MigrateVaultKeyRequest, MigrateVaultKeyResponse>
                    handler) {
        LOG.trace("Called async migrateVaultKey");
        final MigrateVaultKeyRequest interceptedRequest =
                MigrateVaultKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MigrateVaultKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, MigrateVaultKeyResponse>
                transformer = MigrateVaultKeyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<MigrateVaultKeyRequest, MigrateVaultKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MigrateVaultKeyRequest, MigrateVaultKeyResponse>,
                        java.util.concurrent.Future<MigrateVaultKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMigrateVaultKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MigrateVaultKeyRequest, MigrateVaultKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyDatabaseManagementResponse> modifyDatabaseManagement(
            ModifyDatabaseManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
                    handler) {
        LOG.trace("Called async modifyDatabaseManagement");
        final ModifyDatabaseManagementRequest interceptedRequest =
                ModifyDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyDatabaseManagementConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ModifyDatabaseManagementResponse>
                transformer = ModifyDatabaseManagementConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>,
                        java.util.concurrent.Future<ModifyDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModifyDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RegisterAutonomousDatabaseDataSafeResponse>
            registerAutonomousDatabaseDataSafe(
                    RegisterAutonomousDatabaseDataSafeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RegisterAutonomousDatabaseDataSafeRequest,
                                    RegisterAutonomousDatabaseDataSafeResponse>
                            handler) {
        LOG.trace("Called async registerAutonomousDatabaseDataSafe");
        final RegisterAutonomousDatabaseDataSafeRequest interceptedRequest =
                RegisterAutonomousDatabaseDataSafeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RegisterAutonomousDatabaseDataSafeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RegisterAutonomousDatabaseDataSafeResponse>
                transformer = RegisterAutonomousDatabaseDataSafeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RegisterAutonomousDatabaseDataSafeRequest,
                        RegisterAutonomousDatabaseDataSafeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RegisterAutonomousDatabaseDataSafeRequest,
                                RegisterAutonomousDatabaseDataSafeResponse>,
                        java.util.concurrent.Future<RegisterAutonomousDatabaseDataSafeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRegisterAutonomousDatabaseDataSafeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RegisterAutonomousDatabaseDataSafeRequest,
                    RegisterAutonomousDatabaseDataSafeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {
        LOG.trace("Called async reinstateAutonomousContainerDatabaseDataguardAssociation");
        final ReinstateAutonomousContainerDatabaseDataguardAssociationRequest interceptedRequest =
                ReinstateAutonomousContainerDatabaseDataguardAssociationConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReinstateAutonomousContainerDatabaseDataguardAssociationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
                transformer =
                        ReinstateAutonomousContainerDatabaseDataguardAssociationConverter
                                .fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                                ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>,
                        java.util.concurrent.Future<
                                ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>
            reinstateDataGuardAssociation(
                    ReinstateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateDataGuardAssociationRequest,
                                    ReinstateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async reinstateDataGuardAssociation");
        final ReinstateDataGuardAssociationRequest interceptedRequest =
                ReinstateDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReinstateDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ReinstateDataGuardAssociationResponse>
                transformer = ReinstateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ReinstateDataGuardAssociationRequest, ReinstateDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReinstateDataGuardAssociationRequest,
                                ReinstateDataGuardAssociationResponse>,
                        java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getReinstateDataGuardAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReinstateDataGuardAssociationRequest, ReinstateDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoteClonePluggableDatabaseResponse>
            remoteClonePluggableDatabase(
                    RemoteClonePluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoteClonePluggableDatabaseRequest,
                                    RemoteClonePluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async remoteClonePluggableDatabase");
        final RemoteClonePluggableDatabaseRequest interceptedRequest =
                RemoteClonePluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoteClonePluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoteClonePluggableDatabaseResponse>
                transformer = RemoteClonePluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RemoteClonePluggableDatabaseRequest, RemoteClonePluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoteClonePluggableDatabaseRequest,
                                RemoteClonePluggableDatabaseResponse>,
                        java.util.concurrent.Future<RemoteClonePluggableDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoteClonePluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoteClonePluggableDatabaseRequest, RemoteClonePluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartAutonomousContainerDatabaseResponse>
            restartAutonomousContainerDatabase(
                    RestartAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestartAutonomousContainerDatabaseRequest,
                                    RestartAutonomousContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async restartAutonomousContainerDatabase");
        final RestartAutonomousContainerDatabaseRequest interceptedRequest =
                RestartAutonomousContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartAutonomousContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RestartAutonomousContainerDatabaseResponse>
                transformer = RestartAutonomousContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RestartAutonomousContainerDatabaseRequest,
                        RestartAutonomousContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartAutonomousContainerDatabaseRequest,
                                RestartAutonomousContainerDatabaseResponse>,
                        java.util.concurrent.Future<RestartAutonomousContainerDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartAutonomousContainerDatabaseRequest,
                    RestartAutonomousContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartAutonomousDatabaseResponse> restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async restartAutonomousDatabase");
        final RestartAutonomousDatabaseRequest interceptedRequest =
                RestartAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RestartAutonomousDatabaseResponse>
                transformer = RestartAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartAutonomousDatabaseRequest,
                                RestartAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<RestartAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestoreAutonomousDatabaseResponse> restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async restoreAutonomousDatabase");
        final RestoreAutonomousDatabaseRequest interceptedRequest =
                RestoreAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RestoreAutonomousDatabaseResponse>
                transformer = RestoreAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestoreAutonomousDatabaseRequest,
                                RestoreAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<RestoreAutonomousDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRestoreAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestoreDatabaseResponse> restoreDatabase(
            RestoreDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreDatabaseRequest, RestoreDatabaseResponse>
                    handler) {
        LOG.trace("Called async restoreDatabase");
        final RestoreDatabaseRequest interceptedRequest =
                RestoreDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RestoreDatabaseResponse>
                transformer = RestoreDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<RestoreDatabaseRequest, RestoreDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestoreDatabaseRequest, RestoreDatabaseResponse>,
                        java.util.concurrent.Future<RestoreDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRestoreDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestoreDatabaseRequest, RestoreDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateAutonomousContainerDatabaseEncryptionKeyResponse>
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>
                            handler) {
        LOG.trace("Called async rotateAutonomousContainerDatabaseEncryptionKey");
        final RotateAutonomousContainerDatabaseEncryptionKeyRequest interceptedRequest =
                RotateAutonomousContainerDatabaseEncryptionKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateAutonomousContainerDatabaseEncryptionKeyConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse>
                transformer =
                        RotateAutonomousContainerDatabaseEncryptionKeyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                                RotateAutonomousContainerDatabaseEncryptionKeyResponse>,
                        java.util.concurrent.Future<
                                RotateAutonomousContainerDatabaseEncryptionKeyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateAutonomousDatabaseEncryptionKeyResponse>
            rotateAutonomousDatabaseEncryptionKey(
                    RotateAutonomousDatabaseEncryptionKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousDatabaseEncryptionKeyRequest,
                                    RotateAutonomousDatabaseEncryptionKeyResponse>
                            handler) {
        LOG.trace("Called async rotateAutonomousDatabaseEncryptionKey");
        final RotateAutonomousDatabaseEncryptionKeyRequest interceptedRequest =
                RotateAutonomousDatabaseEncryptionKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateAutonomousDatabaseEncryptionKeyConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RotateAutonomousDatabaseEncryptionKeyResponse>
                transformer = RotateAutonomousDatabaseEncryptionKeyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RotateAutonomousDatabaseEncryptionKeyRequest,
                        RotateAutonomousDatabaseEncryptionKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateAutonomousDatabaseEncryptionKeyRequest,
                                RotateAutonomousDatabaseEncryptionKeyResponse>,
                        java.util.concurrent.Future<RotateAutonomousDatabaseEncryptionKeyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateAutonomousDatabaseEncryptionKeyRequest,
                    RotateAutonomousDatabaseEncryptionKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateOrdsCertsResponse> rotateOrdsCerts(
            RotateOrdsCertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateOrdsCertsRequest, RotateOrdsCertsResponse>
                    handler) {
        LOG.trace("Called async rotateOrdsCerts");
        final RotateOrdsCertsRequest interceptedRequest =
                RotateOrdsCertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateOrdsCertsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RotateOrdsCertsResponse>
                transformer = RotateOrdsCertsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RotateOrdsCertsRequest, RotateOrdsCertsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateOrdsCertsRequest, RotateOrdsCertsResponse>,
                        java.util.concurrent.Future<RotateOrdsCertsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateOrdsCertsRequest, RotateOrdsCertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateSslCertsResponse> rotateSslCerts(
            RotateSslCertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateSslCertsRequest, RotateSslCertsResponse>
                    handler) {
        LOG.trace("Called async rotateSslCerts");
        final RotateSslCertsRequest interceptedRequest =
                RotateSslCertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateSslCertsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RotateSslCertsResponse>
                transformer = RotateSslCertsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RotateSslCertsRequest, RotateSslCertsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateSslCertsRequest, RotateSslCertsResponse>,
                        java.util.concurrent.Future<RotateSslCertsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateSslCertsRequest, RotateSslCertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateVaultKeyResponse> rotateVaultKey(
            RotateVaultKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateVaultKeyRequest, RotateVaultKeyResponse>
                    handler) {
        LOG.trace("Called async rotateVaultKey");
        final RotateVaultKeyRequest interceptedRequest =
                RotateVaultKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateVaultKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RotateVaultKeyResponse>
                transformer = RotateVaultKeyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RotateVaultKeyRequest, RotateVaultKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateVaultKeyRequest, RotateVaultKeyResponse>,
                        java.util.concurrent.Future<RotateVaultKeyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateVaultKeyRequest, RotateVaultKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScanExternalContainerDatabasePluggableDatabasesResponse>
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                                    ScanExternalContainerDatabasePluggableDatabasesResponse>
                            handler) {
        LOG.trace("Called async scanExternalContainerDatabasePluggableDatabases");
        final ScanExternalContainerDatabasePluggableDatabasesRequest interceptedRequest =
                ScanExternalContainerDatabasePluggableDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScanExternalContainerDatabasePluggableDatabasesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ScanExternalContainerDatabasePluggableDatabasesResponse>
                transformer =
                        ScanExternalContainerDatabasePluggableDatabasesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ScanExternalContainerDatabasePluggableDatabasesRequest,
                        ScanExternalContainerDatabasePluggableDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScanExternalContainerDatabasePluggableDatabasesRequest,
                                ScanExternalContainerDatabasePluggableDatabasesResponse>,
                        java.util.concurrent.Future<
                                ScanExternalContainerDatabasePluggableDatabasesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                    ScanExternalContainerDatabasePluggableDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartAutonomousDatabaseResponse> startAutonomousDatabase(
            StartAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async startAutonomousDatabase");
        final StartAutonomousDatabaseRequest interceptedRequest =
                StartAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StartAutonomousDatabaseResponse>
                transformer = StartAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<StartAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartPluggableDatabaseResponse> startPluggableDatabase(
            StartPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async startPluggableDatabase");
        final StartPluggableDatabaseRequest interceptedRequest =
                StartPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StartPluggableDatabaseResponse>
                transformer = StartPluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>,
                        java.util.concurrent.Future<StartPluggableDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopAutonomousDatabaseResponse> stopAutonomousDatabase(
            StopAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async stopAutonomousDatabase");
        final StopAutonomousDatabaseRequest interceptedRequest =
                StopAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StopAutonomousDatabaseResponse>
                transformer = StopAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<StopAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopPluggableDatabaseResponse> stopPluggableDatabase(
            StopPluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async stopPluggableDatabase");
        final StopPluggableDatabaseRequest interceptedRequest =
                StopPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StopPluggableDatabaseResponse>
                transformer = StopPluggableDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>,
                        java.util.concurrent.Future<StopPluggableDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler) {
        LOG.trace("Called async switchoverAutonomousContainerDatabaseDataguardAssociation");
        final SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest interceptedRequest =
                SwitchoverAutonomousContainerDatabaseDataguardAssociationConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverAutonomousContainerDatabaseDataguardAssociationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
                transformer =
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationConverter
                                .fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>,
                        java.util.concurrent.Future<
                                SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SwitchoverAutonomousDatabaseResponse>
            switchoverAutonomousDatabase(
                    SwitchoverAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverAutonomousDatabaseRequest,
                                    SwitchoverAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async switchoverAutonomousDatabase");
        final SwitchoverAutonomousDatabaseRequest interceptedRequest =
                SwitchoverAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchoverAutonomousDatabaseResponse>
                transformer = SwitchoverAutonomousDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        SwitchoverAutonomousDatabaseRequest, SwitchoverAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SwitchoverAutonomousDatabaseRequest,
                                SwitchoverAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<SwitchoverAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SwitchoverAutonomousDatabaseRequest, SwitchoverAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>
            switchoverDataGuardAssociation(
                    SwitchoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverDataGuardAssociationRequest,
                                    SwitchoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async switchoverDataGuardAssociation");
        final SwitchoverDataGuardAssociationRequest interceptedRequest =
                SwitchoverDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchoverDataGuardAssociationResponse>
                transformer = SwitchoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SwitchoverDataGuardAssociationRequest,
                        SwitchoverDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SwitchoverDataGuardAssociationRequest,
                                SwitchoverDataGuardAssociationResponse>,
                        java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSwitchoverDataGuardAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SwitchoverDataGuardAssociationRequest, SwitchoverDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateAutonomousContainerDatabaseResponse>
            terminateAutonomousContainerDatabase(
                    TerminateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousContainerDatabaseRequest,
                                    TerminateAutonomousContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async terminateAutonomousContainerDatabase");
        final TerminateAutonomousContainerDatabaseRequest interceptedRequest =
                TerminateAutonomousContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateAutonomousContainerDatabaseConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, TerminateAutonomousContainerDatabaseResponse>
                transformer = TerminateAutonomousContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        TerminateAutonomousContainerDatabaseRequest,
                        TerminateAutonomousContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateAutonomousContainerDatabaseRequest,
                                TerminateAutonomousContainerDatabaseResponse>,
                        java.util.concurrent.Future<TerminateAutonomousContainerDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateAutonomousContainerDatabaseRequest,
                    TerminateAutonomousContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateAutonomousExadataInfrastructureResponse>
            terminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousExadataInfrastructureRequest,
                                    TerminateAutonomousExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async terminateAutonomousExadataInfrastructure");
        final TerminateAutonomousExadataInfrastructureRequest interceptedRequest =
                TerminateAutonomousExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateAutonomousExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, TerminateAutonomousExadataInfrastructureResponse>
                transformer = TerminateAutonomousExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        TerminateAutonomousExadataInfrastructureRequest,
                        TerminateAutonomousExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateAutonomousExadataInfrastructureRequest,
                                TerminateAutonomousExadataInfrastructureResponse>,
                        java.util.concurrent.Future<
                                TerminateAutonomousExadataInfrastructureResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateAutonomousExadataInfrastructureRequest,
                    TerminateAutonomousExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateDbSystemResponse> terminateDbSystem(
            TerminateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>
                    handler) {
        LOG.trace("Called async terminateDbSystem");
        final TerminateDbSystemRequest interceptedRequest =
                TerminateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TerminateDbSystemResponse>
                transformer = TerminateDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<TerminateDbSystemRequest, TerminateDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateDbSystemRequest, TerminateDbSystemResponse>,
                        java.util.concurrent.Future<TerminateDbSystemResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateDbSystemRequest, TerminateDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousContainerDatabaseResponse>
            updateAutonomousContainerDatabase(
                    UpdateAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousContainerDatabaseRequest,
                                    UpdateAutonomousContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateAutonomousContainerDatabase");
        final UpdateAutonomousContainerDatabaseRequest interceptedRequest =
                UpdateAutonomousContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousContainerDatabaseResponse>
                transformer = UpdateAutonomousContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousContainerDatabaseRequest,
                        UpdateAutonomousContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousContainerDatabaseRequest,
                                UpdateAutonomousContainerDatabaseResponse>,
                        java.util.concurrent.Future<UpdateAutonomousContainerDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutonomousContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousContainerDatabaseRequest,
                    UpdateAutonomousContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseResponse> updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateAutonomousDatabase");
        final UpdateAutonomousDatabaseRequest interceptedRequest =
                UpdateAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousDatabaseResponse>
                transformer = UpdateAutonomousDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<UpdateAutonomousDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseRegionalWalletResponse>
            updateAutonomousDatabaseRegionalWallet(
                    UpdateAutonomousDatabaseRegionalWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseRegionalWalletRequest,
                                    UpdateAutonomousDatabaseRegionalWalletResponse>
                            handler) {
        LOG.trace("Called async updateAutonomousDatabaseRegionalWallet");
        final UpdateAutonomousDatabaseRegionalWalletRequest interceptedRequest =
                UpdateAutonomousDatabaseRegionalWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousDatabaseRegionalWalletConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousDatabaseRegionalWalletResponse>
                transformer = UpdateAutonomousDatabaseRegionalWalletConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousDatabaseRegionalWalletRequest,
                        UpdateAutonomousDatabaseRegionalWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousDatabaseRegionalWalletRequest,
                                UpdateAutonomousDatabaseRegionalWalletResponse>,
                        java.util.concurrent.Future<UpdateAutonomousDatabaseRegionalWalletResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutonomousDatabaseWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousDatabaseRegionalWalletRequest,
                    UpdateAutonomousDatabaseRegionalWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousDatabaseWalletResponse>
            updateAutonomousDatabaseWallet(
                    UpdateAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseWalletRequest,
                                    UpdateAutonomousDatabaseWalletResponse>
                            handler) {
        LOG.trace("Called async updateAutonomousDatabaseWallet");
        final UpdateAutonomousDatabaseWalletRequest interceptedRequest =
                UpdateAutonomousDatabaseWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousDatabaseWalletConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousDatabaseWalletResponse>
                transformer = UpdateAutonomousDatabaseWalletConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousDatabaseWalletRequest,
                        UpdateAutonomousDatabaseWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousDatabaseWalletRequest,
                                UpdateAutonomousDatabaseWalletResponse>,
                        java.util.concurrent.Future<UpdateAutonomousDatabaseWalletResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutonomousDatabaseWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousDatabaseWalletRequest, UpdateAutonomousDatabaseWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousExadataInfrastructureResponse>
            updateAutonomousExadataInfrastructure(
                    UpdateAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousExadataInfrastructureRequest,
                                    UpdateAutonomousExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async updateAutonomousExadataInfrastructure");
        final UpdateAutonomousExadataInfrastructureRequest interceptedRequest =
                UpdateAutonomousExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousExadataInfrastructureResponse>
                transformer = UpdateAutonomousExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousExadataInfrastructureRequest,
                        UpdateAutonomousExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousExadataInfrastructureRequest,
                                UpdateAutonomousExadataInfrastructureResponse>,
                        java.util.concurrent.Future<UpdateAutonomousExadataInfrastructureResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateAutonomousExadataInfrastructuresDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousExadataInfrastructureRequest,
                    UpdateAutonomousExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutonomousVmClusterResponse> updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
                    handler) {
        LOG.trace("Called async updateAutonomousVmCluster");
        final UpdateAutonomousVmClusterRequest interceptedRequest =
                UpdateAutonomousVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutonomousVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAutonomousVmClusterResponse>
                transformer = UpdateAutonomousVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutonomousVmClusterRequest,
                                UpdateAutonomousVmClusterResponse>,
                        java.util.concurrent.Future<UpdateAutonomousVmClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutonomousVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupDestinationResponse> updateBackupDestination(
            UpdateBackupDestinationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>
                    handler) {
        LOG.trace("Called async updateBackupDestination");
        final UpdateBackupDestinationRequest interceptedRequest =
                UpdateBackupDestinationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackupDestinationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateBackupDestinationResponse>
                transformer = UpdateBackupDestinationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>,
                        java.util.concurrent.Future<UpdateBackupDestinationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBackupDestinationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudExadataInfrastructureResponse>
            updateCloudExadataInfrastructure(
                    UpdateCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudExadataInfrastructureRequest,
                                    UpdateCloudExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async updateCloudExadataInfrastructure");
        final UpdateCloudExadataInfrastructureRequest interceptedRequest =
                UpdateCloudExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCloudExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCloudExadataInfrastructureResponse>
                transformer = UpdateCloudExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCloudExadataInfrastructureRequest,
                        UpdateCloudExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCloudExadataInfrastructureRequest,
                                UpdateCloudExadataInfrastructureResponse>,
                        java.util.concurrent.Future<UpdateCloudExadataInfrastructureResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCloudExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCloudExadataInfrastructureRequest,
                    UpdateCloudExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudVmClusterResponse> updateCloudVmCluster(
            UpdateCloudVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
                    handler) {
        LOG.trace("Called async updateCloudVmCluster");
        final UpdateCloudVmClusterRequest interceptedRequest =
                UpdateCloudVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCloudVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCloudVmClusterResponse>
                transformer = UpdateCloudVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>,
                        java.util.concurrent.Future<UpdateCloudVmClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCloudVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudVmClusterIormConfigResponse>
            updateCloudVmClusterIormConfig(
                    UpdateCloudVmClusterIormConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudVmClusterIormConfigRequest,
                                    UpdateCloudVmClusterIormConfigResponse>
                            handler) {
        LOG.trace("Called async updateCloudVmClusterIormConfig");
        final UpdateCloudVmClusterIormConfigRequest interceptedRequest =
                UpdateCloudVmClusterIormConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCloudVmClusterIormConfigConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCloudVmClusterIormConfigResponse>
                transformer = UpdateCloudVmClusterIormConfigConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCloudVmClusterIormConfigRequest,
                        UpdateCloudVmClusterIormConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCloudVmClusterIormConfigRequest,
                                UpdateCloudVmClusterIormConfigResponse>,
                        java.util.concurrent.Future<UpdateCloudVmClusterIormConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudVmClusterIormConfigUpdateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCloudVmClusterIormConfigRequest, UpdateCloudVmClusterIormConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataGuardAssociationResponse>
            updateDataGuardAssociation(
                    UpdateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataGuardAssociationRequest,
                                    UpdateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async updateDataGuardAssociation");
        final UpdateDataGuardAssociationRequest interceptedRequest =
                UpdateDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDataGuardAssociationResponse>
                transformer = UpdateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDataGuardAssociationRequest, UpdateDataGuardAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataGuardAssociationRequest,
                                UpdateDataGuardAssociationResponse>,
                        java.util.concurrent.Future<UpdateDataGuardAssociationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataGuardAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataGuardAssociationRequest, UpdateDataGuardAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResponse> updateDatabase(
            UpdateDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseRequest, UpdateDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateDatabase");
        final UpdateDatabaseRequest interceptedRequest =
                UpdateDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDatabaseResponse>
                transformer = UpdateDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseRequest, UpdateDatabaseResponse>,
                        java.util.concurrent.Future<UpdateDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseRequest, UpdateDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseSoftwareImageResponse>
            updateDatabaseSoftwareImage(
                    UpdateDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseSoftwareImageRequest,
                                    UpdateDatabaseSoftwareImageResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseSoftwareImage");
        final UpdateDatabaseSoftwareImageRequest interceptedRequest =
                UpdateDatabaseSoftwareImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseSoftwareImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseSoftwareImageResponse>
                transformer = UpdateDatabaseSoftwareImageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseSoftwareImageRequest, UpdateDatabaseSoftwareImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseSoftwareImageRequest,
                                UpdateDatabaseSoftwareImageResponse>,
                        java.util.concurrent.Future<UpdateDatabaseSoftwareImageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseSoftwareImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseSoftwareImageRequest, UpdateDatabaseSoftwareImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDbHomeResponse> updateDbHome(
            UpdateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                    handler) {
        LOG.trace("Called async updateDbHome");
        final UpdateDbHomeRequest interceptedRequest =
                UpdateDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbHomeResponse>
                transformer = UpdateDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDbHomeRequest, UpdateDbHomeResponse>,
                        java.util.concurrent.Future<UpdateDbHomeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDbHomeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDbHomeRequest, UpdateDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {
        LOG.trace("Called async updateDbSystem");
        final UpdateDbSystemRequest interceptedRequest =
                UpdateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbSystemResponse>
                transformer = UpdateDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDbSystemRequest, UpdateDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDbSystemRequest, UpdateDbSystemResponse>,
                        java.util.concurrent.Future<UpdateDbSystemResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDbSystemRequest, UpdateDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExadataInfrastructureResponse>
            updateExadataInfrastructure(
                    UpdateExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExadataInfrastructureRequest,
                                    UpdateExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async updateExadataInfrastructure");
        final UpdateExadataInfrastructureRequest interceptedRequest =
                UpdateExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExadataInfrastructureResponse>
                transformer = UpdateExadataInfrastructureConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExadataInfrastructureRequest, UpdateExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExadataInfrastructureRequest,
                                UpdateExadataInfrastructureResponse>,
                        java.util.concurrent.Future<UpdateExadataInfrastructureResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExadataInfrastructureRequest, UpdateExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExadataIormConfigResponse> updateExadataIormConfig(
            UpdateExadataIormConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
                    handler) {
        LOG.trace("Called async updateExadataIormConfig");
        final UpdateExadataIormConfigRequest interceptedRequest =
                UpdateExadataIormConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExadataIormConfigConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExadataIormConfigResponse>
                transformer = UpdateExadataIormConfigConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>,
                        java.util.concurrent.Future<UpdateExadataIormConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExadataIormConfigUpdateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalContainerDatabaseResponse>
            updateExternalContainerDatabase(
                    UpdateExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalContainerDatabaseRequest,
                                    UpdateExternalContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateExternalContainerDatabase");
        final UpdateExternalContainerDatabaseRequest interceptedRequest =
                UpdateExternalContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExternalContainerDatabaseResponse>
                transformer = UpdateExternalContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalContainerDatabaseRequest,
                        UpdateExternalContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalContainerDatabaseRequest,
                                UpdateExternalContainerDatabaseResponse>,
                        java.util.concurrent.Future<UpdateExternalContainerDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalContainerDatabaseRequest,
                    UpdateExternalContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDatabaseConnectorResponse>
            updateExternalDatabaseConnector(
                    UpdateExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDatabaseConnectorRequest,
                                    UpdateExternalDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async updateExternalDatabaseConnector");
        final UpdateExternalDatabaseConnectorRequest interceptedRequest =
                UpdateExternalDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDatabaseConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExternalDatabaseConnectorResponse>
                transformer = UpdateExternalDatabaseConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDatabaseConnectorRequest,
                        UpdateExternalDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDatabaseConnectorRequest,
                                UpdateExternalDatabaseConnectorResponse>,
                        java.util.concurrent.Future<UpdateExternalDatabaseConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDatabaseConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDatabaseConnectorRequest,
                    UpdateExternalDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalNonContainerDatabaseResponse>
            updateExternalNonContainerDatabase(
                    UpdateExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalNonContainerDatabaseRequest,
                                    UpdateExternalNonContainerDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateExternalNonContainerDatabase");
        final UpdateExternalNonContainerDatabaseRequest interceptedRequest =
                UpdateExternalNonContainerDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalNonContainerDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExternalNonContainerDatabaseResponse>
                transformer = UpdateExternalNonContainerDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalNonContainerDatabaseRequest,
                        UpdateExternalNonContainerDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalNonContainerDatabaseRequest,
                                UpdateExternalNonContainerDatabaseResponse>,
                        java.util.concurrent.Future<UpdateExternalNonContainerDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalNonContainerDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalNonContainerDatabaseRequest,
                    UpdateExternalNonContainerDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalPluggableDatabaseResponse>
            updateExternalPluggableDatabase(
                    UpdateExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalPluggableDatabaseRequest,
                                    UpdateExternalPluggableDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateExternalPluggableDatabase");
        final UpdateExternalPluggableDatabaseRequest interceptedRequest =
                UpdateExternalPluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalPluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExternalPluggableDatabaseResponse>
                transformer = UpdateExternalPluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalPluggableDatabaseRequest,
                        UpdateExternalPluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalPluggableDatabaseRequest,
                                UpdateExternalPluggableDatabaseResponse>,
                        java.util.concurrent.Future<UpdateExternalPluggableDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalPluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalPluggableDatabaseRequest,
                    UpdateExternalPluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyStoreResponse> updateKeyStore(
            UpdateKeyStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateKeyStoreRequest, UpdateKeyStoreResponse>
                    handler) {
        LOG.trace("Called async updateKeyStore");
        final UpdateKeyStoreRequest interceptedRequest =
                UpdateKeyStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateKeyStoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateKeyStoreResponse>
                transformer = UpdateKeyStoreConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateKeyStoreRequest, UpdateKeyStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateKeyStoreRequest, UpdateKeyStoreResponse>,
                        java.util.concurrent.Future<UpdateKeyStoreResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateKeyStoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateKeyStoreRequest, UpdateKeyStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceRunResponse> updateMaintenanceRun(
            UpdateMaintenanceRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>
                    handler) {
        LOG.trace("Called async updateMaintenanceRun");
        final UpdateMaintenanceRunRequest interceptedRequest =
                UpdateMaintenanceRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaintenanceRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateMaintenanceRunResponse>
                transformer = UpdateMaintenanceRunConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>,
                        java.util.concurrent.Future<UpdateMaintenanceRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMaintenanceRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePluggableDatabaseResponse> updatePluggableDatabase(
            UpdatePluggableDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
                    handler) {
        LOG.trace("Called async updatePluggableDatabase");
        final UpdatePluggableDatabaseRequest interceptedRequest =
                UpdatePluggableDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePluggableDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdatePluggableDatabaseResponse>
                transformer = UpdatePluggableDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>,
                        java.util.concurrent.Future<UpdatePluggableDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePluggableDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVmClusterResponse> updateVmCluster(
            UpdateVmClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVmClusterRequest, UpdateVmClusterResponse>
                    handler) {
        LOG.trace("Called async updateVmCluster");
        final UpdateVmClusterRequest interceptedRequest =
                UpdateVmClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVmClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVmClusterResponse>
                transformer = UpdateVmClusterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVmClusterRequest, UpdateVmClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVmClusterRequest, UpdateVmClusterResponse>,
                        java.util.concurrent.Future<UpdateVmClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVmClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVmClusterRequest, UpdateVmClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVmClusterNetworkResponse> updateVmClusterNetwork(
            UpdateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async updateVmClusterNetwork");
        final UpdateVmClusterNetworkRequest interceptedRequest =
                UpdateVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVmClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVmClusterNetworkResponse>
                transformer = UpdateVmClusterNetworkConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>,
                        java.util.concurrent.Future<UpdateVmClusterNetworkResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVmClusterNetworkDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpgradeDatabaseResponse> upgradeDatabase(
            UpgradeDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpgradeDatabaseRequest, UpgradeDatabaseResponse>
                    handler) {
        LOG.trace("Called async upgradeDatabase");
        final UpgradeDatabaseRequest interceptedRequest =
                UpgradeDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpgradeDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpgradeDatabaseResponse>
                transformer = UpgradeDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpgradeDatabaseRequest, UpgradeDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpgradeDatabaseRequest, UpgradeDatabaseResponse>,
                        java.util.concurrent.Future<UpgradeDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpgradeDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpgradeDatabaseRequest, UpgradeDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateVmClusterNetworkResponse> validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async validateVmClusterNetwork");
        final ValidateVmClusterNetworkRequest interceptedRequest =
                ValidateVmClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateVmClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ValidateVmClusterNetworkResponse>
                transformer = ValidateVmClusterNetworkConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>,
                        java.util.concurrent.Future<ValidateVmClusterNetworkResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
