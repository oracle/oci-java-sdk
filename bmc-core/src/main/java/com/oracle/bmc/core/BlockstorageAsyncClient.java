/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for Blockstorage service. <br/>
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
public class BlockstorageAsyncClient implements BlockstorageAsync {
    /**
     * Service instance for Blockstorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BLOCKSTORAGE")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
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
    public BlockstorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BlockstorageAsyncClient> {
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
        public BlockstorageAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new BlockstorageAsyncClient(
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
    public java.util.concurrent.Future<ChangeBootVolumeBackupCompartmentResponse>
            changeBootVolumeBackupCompartment(
                    ChangeBootVolumeBackupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBootVolumeBackupCompartmentRequest,
                                    ChangeBootVolumeBackupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBootVolumeBackupCompartment");
        final ChangeBootVolumeBackupCompartmentRequest interceptedRequest =
                ChangeBootVolumeBackupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBootVolumeBackupCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeBootVolumeBackupCompartmentResponse>
                transformer = ChangeBootVolumeBackupCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBootVolumeBackupCompartmentRequest,
                        ChangeBootVolumeBackupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBootVolumeBackupCompartmentRequest,
                                ChangeBootVolumeBackupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBootVolumeBackupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBootVolumeBackupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBootVolumeBackupCompartmentRequest,
                    ChangeBootVolumeBackupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBootVolumeCompartmentResponse>
            changeBootVolumeCompartment(
                    ChangeBootVolumeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBootVolumeCompartmentRequest,
                                    ChangeBootVolumeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBootVolumeCompartment");
        final ChangeBootVolumeCompartmentRequest interceptedRequest =
                ChangeBootVolumeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBootVolumeCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeBootVolumeCompartmentResponse>
                transformer = ChangeBootVolumeCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBootVolumeCompartmentRequest, ChangeBootVolumeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBootVolumeCompartmentRequest,
                                ChangeBootVolumeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBootVolumeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBootVolumeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBootVolumeCompartmentRequest, ChangeBootVolumeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVolumeBackupCompartmentResponse>
            changeVolumeBackupCompartment(
                    ChangeVolumeBackupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVolumeBackupCompartmentRequest,
                                    ChangeVolumeBackupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVolumeBackupCompartment");
        final ChangeVolumeBackupCompartmentRequest interceptedRequest =
                ChangeVolumeBackupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVolumeBackupCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVolumeBackupCompartmentResponse>
                transformer = ChangeVolumeBackupCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVolumeBackupCompartmentRequest, ChangeVolumeBackupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVolumeBackupCompartmentRequest,
                                ChangeVolumeBackupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVolumeBackupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVolumeBackupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVolumeBackupCompartmentRequest, ChangeVolumeBackupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVolumeCompartmentResponse> changeVolumeCompartment(
            ChangeVolumeCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeVolumeCompartmentRequest, ChangeVolumeCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeVolumeCompartment");
        final ChangeVolumeCompartmentRequest interceptedRequest =
                ChangeVolumeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVolumeCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVolumeCompartmentResponse>
                transformer = ChangeVolumeCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVolumeCompartmentRequest, ChangeVolumeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVolumeCompartmentRequest, ChangeVolumeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVolumeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVolumeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVolumeCompartmentRequest, ChangeVolumeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVolumeGroupBackupCompartmentResponse>
            changeVolumeGroupBackupCompartment(
                    ChangeVolumeGroupBackupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVolumeGroupBackupCompartmentRequest,
                                    ChangeVolumeGroupBackupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVolumeGroupBackupCompartment");
        final ChangeVolumeGroupBackupCompartmentRequest interceptedRequest =
                ChangeVolumeGroupBackupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVolumeGroupBackupCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVolumeGroupBackupCompartmentResponse>
                transformer = ChangeVolumeGroupBackupCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVolumeGroupBackupCompartmentRequest,
                        ChangeVolumeGroupBackupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVolumeGroupBackupCompartmentRequest,
                                ChangeVolumeGroupBackupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVolumeGroupBackupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVolumeGroupBackupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVolumeGroupBackupCompartmentRequest,
                    ChangeVolumeGroupBackupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVolumeGroupCompartmentResponse>
            changeVolumeGroupCompartment(
                    ChangeVolumeGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVolumeGroupCompartmentRequest,
                                    ChangeVolumeGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVolumeGroupCompartment");
        final ChangeVolumeGroupCompartmentRequest interceptedRequest =
                ChangeVolumeGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVolumeGroupCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVolumeGroupCompartmentResponse>
                transformer = ChangeVolumeGroupCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVolumeGroupCompartmentRequest, ChangeVolumeGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVolumeGroupCompartmentRequest,
                                ChangeVolumeGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVolumeGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVolumeGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVolumeGroupCompartmentRequest, ChangeVolumeGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CopyBootVolumeBackupResponse> copyBootVolumeBackup(
            CopyBootVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async copyBootVolumeBackup");
        final CopyBootVolumeBackupRequest interceptedRequest =
                CopyBootVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CopyBootVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CopyBootVolumeBackupResponse>
                transformer = CopyBootVolumeBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>,
                        java.util.concurrent.Future<CopyBootVolumeBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCopyBootVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CopyVolumeBackupResponse> copyVolumeBackup(
            CopyVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CopyVolumeBackupRequest, CopyVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async copyVolumeBackup");
        final CopyVolumeBackupRequest interceptedRequest =
                CopyVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CopyVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CopyVolumeBackupResponse>
                transformer = CopyVolumeBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CopyVolumeBackupRequest, CopyVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CopyVolumeBackupRequest, CopyVolumeBackupResponse>,
                        java.util.concurrent.Future<CopyVolumeBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCopyVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CopyVolumeBackupRequest, CopyVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBootVolumeResponse> createBootVolume(
            CreateBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBootVolumeRequest, CreateBootVolumeResponse>
                    handler) {
        LOG.trace("Called async createBootVolume");
        final CreateBootVolumeRequest interceptedRequest =
                CreateBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateBootVolumeResponse>
                transformer = CreateBootVolumeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateBootVolumeRequest, CreateBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBootVolumeRequest, CreateBootVolumeResponse>,
                        java.util.concurrent.Future<CreateBootVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBootVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBootVolumeRequest, CreateBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBootVolumeBackupResponse> createBootVolumeBackup(
            CreateBootVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBootVolumeBackupRequest, CreateBootVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async createBootVolumeBackup");
        final CreateBootVolumeBackupRequest interceptedRequest =
                CreateBootVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBootVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateBootVolumeBackupResponse>
                transformer = CreateBootVolumeBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateBootVolumeBackupRequest, CreateBootVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBootVolumeBackupRequest, CreateBootVolumeBackupResponse>,
                        java.util.concurrent.Future<CreateBootVolumeBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBootVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBootVolumeBackupRequest, CreateBootVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResponse> createVolume(
            CreateVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                    handler) {
        LOG.trace("Called async createVolume");
        final CreateVolumeRequest interceptedRequest =
                CreateVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeResponse>
                transformer = CreateVolumeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeRequest, CreateVolumeResponse>,
                        java.util.concurrent.Future<CreateVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeRequest, CreateVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeBackupResponse> createVolumeBackup(
            CreateVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async createVolumeBackup");
        final CreateVolumeBackupRequest interceptedRequest =
                CreateVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeBackupResponse>
                transformer = CreateVolumeBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeBackupRequest, CreateVolumeBackupResponse>,
                        java.util.concurrent.Future<CreateVolumeBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeBackupRequest, CreateVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeBackupPolicyResponse> createVolumeBackupPolicy(
            CreateVolumeBackupPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupPolicyRequest, CreateVolumeBackupPolicyResponse>
                    handler) {
        LOG.trace("Called async createVolumeBackupPolicy");
        final CreateVolumeBackupPolicyRequest interceptedRequest =
                CreateVolumeBackupPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVolumeBackupPolicyResponse>
                transformer = CreateVolumeBackupPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateVolumeBackupPolicyRequest, CreateVolumeBackupPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeBackupPolicyRequest, CreateVolumeBackupPolicyResponse>,
                        java.util.concurrent.Future<CreateVolumeBackupPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeBackupPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeBackupPolicyRequest, CreateVolumeBackupPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeBackupPolicyAssignmentResponse>
            createVolumeBackupPolicyAssignment(
                    CreateVolumeBackupPolicyAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVolumeBackupPolicyAssignmentRequest,
                                    CreateVolumeBackupPolicyAssignmentResponse>
                            handler) {
        LOG.trace("Called async createVolumeBackupPolicyAssignment");
        final CreateVolumeBackupPolicyAssignmentRequest interceptedRequest =
                CreateVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupPolicyAssignmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVolumeBackupPolicyAssignmentResponse>
                transformer = CreateVolumeBackupPolicyAssignmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateVolumeBackupPolicyAssignmentRequest,
                        CreateVolumeBackupPolicyAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeBackupPolicyAssignmentRequest,
                                CreateVolumeBackupPolicyAssignmentResponse>,
                        java.util.concurrent.Future<CreateVolumeBackupPolicyAssignmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeBackupPolicyAssignmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeBackupPolicyAssignmentRequest,
                    CreateVolumeBackupPolicyAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeGroupResponse> createVolumeGroup(
            CreateVolumeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeGroupRequest, CreateVolumeGroupResponse>
                    handler) {
        LOG.trace("Called async createVolumeGroup");
        final CreateVolumeGroupRequest interceptedRequest =
                CreateVolumeGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeGroupResponse>
                transformer = CreateVolumeGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateVolumeGroupRequest, CreateVolumeGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeGroupRequest, CreateVolumeGroupResponse>,
                        java.util.concurrent.Future<CreateVolumeGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeGroupRequest, CreateVolumeGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeGroupBackupResponse> createVolumeGroupBackup(
            CreateVolumeGroupBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeGroupBackupRequest, CreateVolumeGroupBackupResponse>
                    handler) {
        LOG.trace("Called async createVolumeGroupBackup");
        final CreateVolumeGroupBackupRequest interceptedRequest =
                CreateVolumeGroupBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeGroupBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVolumeGroupBackupResponse>
                transformer = CreateVolumeGroupBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateVolumeGroupBackupRequest, CreateVolumeGroupBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVolumeGroupBackupRequest, CreateVolumeGroupBackupResponse>,
                        java.util.concurrent.Future<CreateVolumeGroupBackupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVolumeGroupBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVolumeGroupBackupRequest, CreateVolumeGroupBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBootVolumeResponse> deleteBootVolume(
            DeleteBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                    handler) {
        LOG.trace("Called async deleteBootVolume");
        final DeleteBootVolumeRequest interceptedRequest =
                DeleteBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBootVolumeResponse>
                transformer = DeleteBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBootVolumeRequest, DeleteBootVolumeResponse>,
                        java.util.concurrent.Future<DeleteBootVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBootVolumeRequest, DeleteBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBootVolumeBackupResponse> deleteBootVolumeBackup(
            DeleteBootVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeBackupRequest, DeleteBootVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async deleteBootVolumeBackup");
        final DeleteBootVolumeBackupRequest interceptedRequest =
                DeleteBootVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBootVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteBootVolumeBackupResponse>
                transformer = DeleteBootVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBootVolumeBackupRequest, DeleteBootVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBootVolumeBackupRequest, DeleteBootVolumeBackupResponse>,
                        java.util.concurrent.Future<DeleteBootVolumeBackupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBootVolumeBackupRequest, DeleteBootVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBootVolumeKmsKeyResponse> deleteBootVolumeKmsKey(
            DeleteBootVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeKmsKeyRequest, DeleteBootVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async deleteBootVolumeKmsKey");
        final DeleteBootVolumeKmsKeyRequest interceptedRequest =
                DeleteBootVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBootVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteBootVolumeKmsKeyResponse>
                transformer = DeleteBootVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBootVolumeKmsKeyRequest, DeleteBootVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBootVolumeKmsKeyRequest, DeleteBootVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<DeleteBootVolumeKmsKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBootVolumeKmsKeyRequest, DeleteBootVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResponse> deleteVolume(
            DeleteVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                    handler) {
        LOG.trace("Called async deleteVolume");
        final DeleteVolumeRequest interceptedRequest =
                DeleteVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeResponse>
                transformer = DeleteVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeRequest, DeleteVolumeResponse>,
                        java.util.concurrent.Future<DeleteVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeRequest, DeleteVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeBackupResponse> deleteVolumeBackup(
            DeleteVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeBackup");
        final DeleteVolumeBackupRequest interceptedRequest =
                DeleteVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeBackupResponse>
                transformer = DeleteVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>,
                        java.util.concurrent.Future<DeleteVolumeBackupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeBackupPolicyResponse> deleteVolumeBackupPolicy(
            DeleteVolumeBackupPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupPolicyRequest, DeleteVolumeBackupPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeBackupPolicy");
        final DeleteVolumeBackupPolicyRequest interceptedRequest =
                DeleteVolumeBackupPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVolumeBackupPolicyResponse>
                transformer = DeleteVolumeBackupPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVolumeBackupPolicyRequest, DeleteVolumeBackupPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeBackupPolicyRequest, DeleteVolumeBackupPolicyResponse>,
                        java.util.concurrent.Future<DeleteVolumeBackupPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeBackupPolicyRequest, DeleteVolumeBackupPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeBackupPolicyAssignmentResponse>
            deleteVolumeBackupPolicyAssignment(
                    DeleteVolumeBackupPolicyAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVolumeBackupPolicyAssignmentRequest,
                                    DeleteVolumeBackupPolicyAssignmentResponse>
                            handler) {
        LOG.trace("Called async deleteVolumeBackupPolicyAssignment");
        final DeleteVolumeBackupPolicyAssignmentRequest interceptedRequest =
                DeleteVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupPolicyAssignmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVolumeBackupPolicyAssignmentResponse>
                transformer = DeleteVolumeBackupPolicyAssignmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVolumeBackupPolicyAssignmentRequest,
                        DeleteVolumeBackupPolicyAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeBackupPolicyAssignmentRequest,
                                DeleteVolumeBackupPolicyAssignmentResponse>,
                        java.util.concurrent.Future<DeleteVolumeBackupPolicyAssignmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeBackupPolicyAssignmentRequest,
                    DeleteVolumeBackupPolicyAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeGroupResponse> deleteVolumeGroup(
            DeleteVolumeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeGroupRequest, DeleteVolumeGroupResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeGroup");
        final DeleteVolumeGroupRequest interceptedRequest =
                DeleteVolumeGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeGroupResponse>
                transformer = DeleteVolumeGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeGroupRequest, DeleteVolumeGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeGroupRequest, DeleteVolumeGroupResponse>,
                        java.util.concurrent.Future<DeleteVolumeGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeGroupRequest, DeleteVolumeGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeGroupBackupResponse> deleteVolumeGroupBackup(
            DeleteVolumeGroupBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeGroupBackupRequest, DeleteVolumeGroupBackupResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeGroupBackup");
        final DeleteVolumeGroupBackupRequest interceptedRequest =
                DeleteVolumeGroupBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeGroupBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVolumeGroupBackupResponse>
                transformer = DeleteVolumeGroupBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVolumeGroupBackupRequest, DeleteVolumeGroupBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeGroupBackupRequest, DeleteVolumeGroupBackupResponse>,
                        java.util.concurrent.Future<DeleteVolumeGroupBackupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeGroupBackupRequest, DeleteVolumeGroupBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeKmsKeyResponse> deleteVolumeKmsKey(
            DeleteVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeKmsKeyRequest, DeleteVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeKmsKey");
        final DeleteVolumeKmsKeyRequest interceptedRequest =
                DeleteVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeKmsKeyResponse>
                transformer = DeleteVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeKmsKeyRequest, DeleteVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVolumeKmsKeyRequest, DeleteVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<DeleteVolumeKmsKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVolumeKmsKeyRequest, DeleteVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBlockVolumeReplicaResponse> getBlockVolumeReplica(
            GetBlockVolumeReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
                    handler) {
        LOG.trace("Called async getBlockVolumeReplica");
        final GetBlockVolumeReplicaRequest interceptedRequest =
                GetBlockVolumeReplicaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBlockVolumeReplicaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBlockVolumeReplicaResponse>
                transformer = GetBlockVolumeReplicaConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>,
                        java.util.concurrent.Future<GetBlockVolumeReplicaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeResponse> getBootVolume(
            GetBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                    handler) {
        LOG.trace("Called async getBootVolume");
        final GetBootVolumeRequest interceptedRequest =
                GetBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBootVolumeResponse>
                transformer = GetBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeRequest, GetBootVolumeResponse>,
                        java.util.concurrent.Future<GetBootVolumeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeRequest, GetBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeBackupResponse> getBootVolumeBackup(
            GetBootVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async getBootVolumeBackup");
        final GetBootVolumeBackupRequest interceptedRequest =
                GetBootVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBootVolumeBackupResponse>
                transformer = GetBootVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>,
                        java.util.concurrent.Future<GetBootVolumeBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeKmsKeyResponse> getBootVolumeKmsKey(
            GetBootVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeKmsKeyRequest, GetBootVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async getBootVolumeKmsKey");
        final GetBootVolumeKmsKeyRequest interceptedRequest =
                GetBootVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBootVolumeKmsKeyResponse>
                transformer = GetBootVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetBootVolumeKmsKeyRequest, GetBootVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeKmsKeyRequest, GetBootVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<GetBootVolumeKmsKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeKmsKeyRequest, GetBootVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeReplicaResponse> getBootVolumeReplica(
            GetBootVolumeReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
                    handler) {
        LOG.trace("Called async getBootVolumeReplica");
        final GetBootVolumeReplicaRequest interceptedRequest =
                GetBootVolumeReplicaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeReplicaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBootVolumeReplicaResponse>
                transformer = GetBootVolumeReplicaConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>,
                        java.util.concurrent.Future<GetBootVolumeReplicaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeResponse> getVolume(
            GetVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse>
                    handler) {
        LOG.trace("Called async getVolume");
        final GetVolumeRequest interceptedRequest = GetVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeResponse>
                transformer = GetVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse>,
                        java.util.concurrent.Future<GetVolumeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeRequest, GetVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeBackupResponse> getVolumeBackup(
            GetVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeBackupRequest, GetVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async getVolumeBackup");
        final GetVolumeBackupRequest interceptedRequest =
                GetVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeBackupResponse>
                transformer = GetVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeBackupRequest, GetVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeBackupRequest, GetVolumeBackupResponse>,
                        java.util.concurrent.Future<GetVolumeBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeBackupRequest, GetVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeBackupPolicyResponse> getVolumeBackupPolicy(
            GetVolumeBackupPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>
                    handler) {
        LOG.trace("Called async getVolumeBackupPolicy");
        final GetVolumeBackupPolicyRequest interceptedRequest =
                GetVolumeBackupPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeBackupPolicyResponse>
                transformer = GetVolumeBackupPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>,
                        java.util.concurrent.Future<GetVolumeBackupPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeBackupPolicyAssetAssignmentResponse>
            getVolumeBackupPolicyAssetAssignment(
                    GetVolumeBackupPolicyAssetAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssetAssignmentRequest,
                                    GetVolumeBackupPolicyAssetAssignmentResponse>
                            handler) {
        LOG.trace("Called async getVolumeBackupPolicyAssetAssignment");
        final GetVolumeBackupPolicyAssetAssignmentRequest interceptedRequest =
                GetVolumeBackupPolicyAssetAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyAssetAssignmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeBackupPolicyAssetAssignmentResponse>
                transformer = GetVolumeBackupPolicyAssetAssignmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeBackupPolicyAssetAssignmentRequest,
                        GetVolumeBackupPolicyAssetAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeBackupPolicyAssetAssignmentRequest,
                                GetVolumeBackupPolicyAssetAssignmentResponse>,
                        java.util.concurrent.Future<GetVolumeBackupPolicyAssetAssignmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeBackupPolicyAssetAssignmentRequest,
                    GetVolumeBackupPolicyAssetAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeBackupPolicyAssignmentResponse>
            getVolumeBackupPolicyAssignment(
                    GetVolumeBackupPolicyAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssignmentRequest,
                                    GetVolumeBackupPolicyAssignmentResponse>
                            handler) {
        LOG.trace("Called async getVolumeBackupPolicyAssignment");
        final GetVolumeBackupPolicyAssignmentRequest interceptedRequest =
                GetVolumeBackupPolicyAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupPolicyAssignmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeBackupPolicyAssignmentResponse>
                transformer = GetVolumeBackupPolicyAssignmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeBackupPolicyAssignmentRequest,
                        GetVolumeBackupPolicyAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeBackupPolicyAssignmentRequest,
                                GetVolumeBackupPolicyAssignmentResponse>,
                        java.util.concurrent.Future<GetVolumeBackupPolicyAssignmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeBackupPolicyAssignmentRequest,
                    GetVolumeBackupPolicyAssignmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeGroupResponse> getVolumeGroup(
            GetVolumeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeGroupRequest, GetVolumeGroupResponse>
                    handler) {
        LOG.trace("Called async getVolumeGroup");
        final GetVolumeGroupRequest interceptedRequest =
                GetVolumeGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeGroupResponse>
                transformer = GetVolumeGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeGroupRequest, GetVolumeGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeGroupRequest, GetVolumeGroupResponse>,
                        java.util.concurrent.Future<GetVolumeGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeGroupRequest, GetVolumeGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeGroupBackupResponse> getVolumeGroupBackup(
            GetVolumeGroupBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
                    handler) {
        LOG.trace("Called async getVolumeGroupBackup");
        final GetVolumeGroupBackupRequest interceptedRequest =
                GetVolumeGroupBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeGroupBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeGroupBackupResponse>
                transformer = GetVolumeGroupBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>,
                        java.util.concurrent.Future<GetVolumeGroupBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeKmsKeyResponse> getVolumeKmsKey(
            GetVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeKmsKeyRequest, GetVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async getVolumeKmsKey");
        final GetVolumeKmsKeyRequest interceptedRequest =
                GetVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeKmsKeyResponse>
                transformer = GetVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeKmsKeyRequest, GetVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeKmsKeyRequest, GetVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<GetVolumeKmsKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeKmsKeyRequest, GetVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBlockVolumeReplicasResponse> listBlockVolumeReplicas(
            ListBlockVolumeReplicasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>
                    handler) {
        LOG.trace("Called async listBlockVolumeReplicas");
        final ListBlockVolumeReplicasRequest interceptedRequest =
                ListBlockVolumeReplicasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBlockVolumeReplicasConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBlockVolumeReplicasResponse>
                transformer = ListBlockVolumeReplicasConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>,
                        java.util.concurrent.Future<ListBlockVolumeReplicasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBootVolumeBackupsResponse> listBootVolumeBackups(
            ListBootVolumeBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>
                    handler) {
        LOG.trace("Called async listBootVolumeBackups");
        final ListBootVolumeBackupsRequest interceptedRequest =
                ListBootVolumeBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumeBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBootVolumeBackupsResponse>
                transformer = ListBootVolumeBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>,
                        java.util.concurrent.Future<ListBootVolumeBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBootVolumeReplicasResponse> listBootVolumeReplicas(
            ListBootVolumeReplicasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>
                    handler) {
        LOG.trace("Called async listBootVolumeReplicas");
        final ListBootVolumeReplicasRequest interceptedRequest =
                ListBootVolumeReplicasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumeReplicasConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBootVolumeReplicasResponse>
                transformer = ListBootVolumeReplicasConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>,
                        java.util.concurrent.Future<ListBootVolumeReplicasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBootVolumesResponse> listBootVolumes(
            ListBootVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumesRequest, ListBootVolumesResponse>
                    handler) {
        LOG.trace("Called async listBootVolumes");
        final ListBootVolumesRequest interceptedRequest =
                ListBootVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBootVolumesResponse>
                transformer = ListBootVolumesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBootVolumesRequest, ListBootVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBootVolumesRequest, ListBootVolumesResponse>,
                        java.util.concurrent.Future<ListBootVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBootVolumesRequest, ListBootVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeBackupPoliciesResponse> listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>
                    handler) {
        LOG.trace("Called async listVolumeBackupPolicies");
        final ListVolumeBackupPoliciesRequest interceptedRequest =
                ListVolumeBackupPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeBackupPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVolumeBackupPoliciesResponse>
                transformer = ListVolumeBackupPoliciesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>,
                        java.util.concurrent.Future<ListVolumeBackupPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeBackupsResponse> listVolumeBackups(
            ListVolumeBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                    handler) {
        LOG.trace("Called async listVolumeBackups");
        final ListVolumeBackupsRequest interceptedRequest =
                ListVolumeBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeBackupsResponse>
                transformer = ListVolumeBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeBackupsRequest, ListVolumeBackupsResponse>,
                        java.util.concurrent.Future<ListVolumeBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeBackupsRequest, ListVolumeBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeGroupBackupsResponse> listVolumeGroupBackups(
            ListVolumeGroupBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>
                    handler) {
        LOG.trace("Called async listVolumeGroupBackups");
        final ListVolumeGroupBackupsRequest interceptedRequest =
                ListVolumeGroupBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeGroupBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVolumeGroupBackupsResponse>
                transformer = ListVolumeGroupBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>,
                        java.util.concurrent.Future<ListVolumeGroupBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeGroupsResponse> listVolumeGroups(
            ListVolumeGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeGroupsRequest, ListVolumeGroupsResponse>
                    handler) {
        LOG.trace("Called async listVolumeGroups");
        final ListVolumeGroupsRequest interceptedRequest =
                ListVolumeGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeGroupsResponse>
                transformer = ListVolumeGroupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVolumeGroupsRequest, ListVolumeGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeGroupsRequest, ListVolumeGroupsResponse>,
                        java.util.concurrent.Future<ListVolumeGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeGroupsRequest, ListVolumeGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumesResponse> listVolumes(
            ListVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse>
                    handler) {
        LOG.trace("Called async listVolumes");
        final ListVolumesRequest interceptedRequest =
                ListVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumesResponse>
                transformer = ListVolumesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumesRequest, ListVolumesResponse>,
                        java.util.concurrent.Future<ListVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumesRequest, ListVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBootVolumeResponse> updateBootVolume(
            UpdateBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                    handler) {
        LOG.trace("Called async updateBootVolume");
        final UpdateBootVolumeRequest interceptedRequest =
                UpdateBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBootVolumeResponse>
                transformer = UpdateBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBootVolumeRequest, UpdateBootVolumeResponse>,
                        java.util.concurrent.Future<UpdateBootVolumeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBootVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBootVolumeRequest, UpdateBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBootVolumeBackupResponse> updateBootVolumeBackup(
            UpdateBootVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeBackupRequest, UpdateBootVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async updateBootVolumeBackup");
        final UpdateBootVolumeBackupRequest interceptedRequest =
                UpdateBootVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBootVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateBootVolumeBackupResponse>
                transformer = UpdateBootVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBootVolumeBackupRequest, UpdateBootVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBootVolumeBackupRequest, UpdateBootVolumeBackupResponse>,
                        java.util.concurrent.Future<UpdateBootVolumeBackupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBootVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBootVolumeBackupRequest, UpdateBootVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBootVolumeKmsKeyResponse> updateBootVolumeKmsKey(
            UpdateBootVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeKmsKeyRequest, UpdateBootVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async updateBootVolumeKmsKey");
        final UpdateBootVolumeKmsKeyRequest interceptedRequest =
                UpdateBootVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBootVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateBootVolumeKmsKeyResponse>
                transformer = UpdateBootVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBootVolumeKmsKeyRequest, UpdateBootVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBootVolumeKmsKeyRequest, UpdateBootVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<UpdateBootVolumeKmsKeyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBootVolumeKmsKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBootVolumeKmsKeyRequest, UpdateBootVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResponse> updateVolume(
            UpdateVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                    handler) {
        LOG.trace("Called async updateVolume");
        final UpdateVolumeRequest interceptedRequest =
                UpdateVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeResponse>
                transformer = UpdateVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeRequest, UpdateVolumeResponse>,
                        java.util.concurrent.Future<UpdateVolumeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeRequest, UpdateVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeBackupResponse> updateVolumeBackup(
            UpdateVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async updateVolumeBackup");
        final UpdateVolumeBackupRequest interceptedRequest =
                UpdateVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeBackupResponse>
                transformer = UpdateVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>,
                        java.util.concurrent.Future<UpdateVolumeBackupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeBackupPolicyResponse> updateVolumeBackupPolicy(
            UpdateVolumeBackupPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupPolicyRequest, UpdateVolumeBackupPolicyResponse>
                    handler) {
        LOG.trace("Called async updateVolumeBackupPolicy");
        final UpdateVolumeBackupPolicyRequest interceptedRequest =
                UpdateVolumeBackupPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeBackupPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVolumeBackupPolicyResponse>
                transformer = UpdateVolumeBackupPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVolumeBackupPolicyRequest, UpdateVolumeBackupPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeBackupPolicyRequest, UpdateVolumeBackupPolicyResponse>,
                        java.util.concurrent.Future<UpdateVolumeBackupPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeBackupPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeBackupPolicyRequest, UpdateVolumeBackupPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeGroupResponse> updateVolumeGroup(
            UpdateVolumeGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeGroupRequest, UpdateVolumeGroupResponse>
                    handler) {
        LOG.trace("Called async updateVolumeGroup");
        final UpdateVolumeGroupRequest interceptedRequest =
                UpdateVolumeGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeGroupResponse>
                transformer = UpdateVolumeGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeGroupRequest, UpdateVolumeGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeGroupRequest, UpdateVolumeGroupResponse>,
                        java.util.concurrent.Future<UpdateVolumeGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeGroupRequest, UpdateVolumeGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeGroupBackupResponse> updateVolumeGroupBackup(
            UpdateVolumeGroupBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeGroupBackupRequest, UpdateVolumeGroupBackupResponse>
                    handler) {
        LOG.trace("Called async updateVolumeGroupBackup");
        final UpdateVolumeGroupBackupRequest interceptedRequest =
                UpdateVolumeGroupBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeGroupBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVolumeGroupBackupResponse>
                transformer = UpdateVolumeGroupBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVolumeGroupBackupRequest, UpdateVolumeGroupBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeGroupBackupRequest, UpdateVolumeGroupBackupResponse>,
                        java.util.concurrent.Future<UpdateVolumeGroupBackupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeGroupBackupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeGroupBackupRequest, UpdateVolumeGroupBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeKmsKeyResponse> updateVolumeKmsKey(
            UpdateVolumeKmsKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeKmsKeyRequest, UpdateVolumeKmsKeyResponse>
                    handler) {
        LOG.trace("Called async updateVolumeKmsKey");
        final UpdateVolumeKmsKeyRequest interceptedRequest =
                UpdateVolumeKmsKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeKmsKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeKmsKeyResponse>
                transformer = UpdateVolumeKmsKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeKmsKeyRequest, UpdateVolumeKmsKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeKmsKeyRequest, UpdateVolumeKmsKeyResponse>,
                        java.util.concurrent.Future<UpdateVolumeKmsKeyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeKmsKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeKmsKeyRequest, UpdateVolumeKmsKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
