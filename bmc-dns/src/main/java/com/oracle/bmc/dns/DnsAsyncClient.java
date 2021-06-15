/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.internal.http.*;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Async client implementation for Dns service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.extern.slf4j.Slf4j
public class DnsAsyncClient implements DnsAsync {
    /**
     * Service instance for Dns.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DNS")
                    .serviceEndpointPrefix("dns")
                    .serviceEndpointTemplate("https://dns.{region}.{secondLevelDomain}")
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
    public DnsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
    public DnsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DnsAsyncClient> {
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
        public DnsAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DnsAsyncClient(
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
    public java.util.concurrent.Future<ChangeResolverCompartmentResponse> changeResolverCompartment(
            ChangeResolverCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeResolverCompartmentRequest, ChangeResolverCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeResolverCompartment");
        final ChangeResolverCompartmentRequest interceptedRequest =
                ChangeResolverCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeResolverCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeResolverCompartmentResponse>
                transformer = ChangeResolverCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeResolverCompartmentRequest, ChangeResolverCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeResolverCompartmentRequest,
                                ChangeResolverCompartmentResponse>,
                        java.util.concurrent.Future<ChangeResolverCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeResolverCompartmentRequest, ChangeResolverCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSteeringPolicyCompartmentResponse>
            changeSteeringPolicyCompartment(
                    ChangeSteeringPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSteeringPolicyCompartmentRequest,
                                    ChangeSteeringPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSteeringPolicyCompartment");
        final ChangeSteeringPolicyCompartmentRequest interceptedRequest =
                ChangeSteeringPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSteeringPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSteeringPolicyCompartmentResponse>
                transformer = ChangeSteeringPolicyCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSteeringPolicyCompartmentRequest,
                        ChangeSteeringPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSteeringPolicyCompartmentRequest,
                                ChangeSteeringPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSteeringPolicyCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSteeringPolicyCompartmentRequest,
                    ChangeSteeringPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTsigKeyCompartmentResponse> changeTsigKeyCompartment(
            ChangeTsigKeyCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeTsigKeyCompartment");
        final ChangeTsigKeyCompartmentRequest interceptedRequest =
                ChangeTsigKeyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTsigKeyCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeTsigKeyCompartmentResponse>
                transformer = ChangeTsigKeyCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTsigKeyCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeViewCompartmentResponse> changeViewCompartment(
            ChangeViewCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeViewCompartment");
        final ChangeViewCompartmentRequest interceptedRequest =
                ChangeViewCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeViewCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeViewCompartmentResponse>
                transformer = ChangeViewCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>,
                        java.util.concurrent.Future<ChangeViewCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeZoneCompartmentResponse> changeZoneCompartment(
            ChangeZoneCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeZoneCompartment");
        final ChangeZoneCompartmentRequest interceptedRequest =
                ChangeZoneCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeZoneCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeZoneCompartmentResponse>
                transformer = ChangeZoneCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>,
                        java.util.concurrent.Future<ChangeZoneCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateResolverEndpointResponse> createResolverEndpoint(
            CreateResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateResolverEndpointRequest, CreateResolverEndpointResponse>
                    handler) {
        LOG.trace("Called async createResolverEndpoint");
        final CreateResolverEndpointRequest interceptedRequest =
                CreateResolverEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateResolverEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateResolverEndpointResponse>
                transformer = CreateResolverEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateResolverEndpointRequest, CreateResolverEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateResolverEndpointRequest, CreateResolverEndpointResponse>,
                        java.util.concurrent.Future<CreateResolverEndpointResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateResolverEndpointRequest, CreateResolverEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSteeringPolicyResponse> createSteeringPolicy(
            CreateSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>
                    handler) {
        LOG.trace("Called async createSteeringPolicy");
        final CreateSteeringPolicyRequest interceptedRequest =
                CreateSteeringPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSteeringPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSteeringPolicyResponse>
                transformer = CreateSteeringPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>,
                        java.util.concurrent.Future<CreateSteeringPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSteeringPolicyAttachmentResponse>
            createSteeringPolicyAttachment(
                    CreateSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSteeringPolicyAttachmentRequest,
                                    CreateSteeringPolicyAttachmentResponse>
                            handler) {
        LOG.trace("Called async createSteeringPolicyAttachment");
        final CreateSteeringPolicyAttachmentRequest interceptedRequest =
                CreateSteeringPolicyAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSteeringPolicyAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSteeringPolicyAttachmentResponse>
                transformer = CreateSteeringPolicyAttachmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSteeringPolicyAttachmentRequest,
                        CreateSteeringPolicyAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSteeringPolicyAttachmentRequest,
                                CreateSteeringPolicyAttachmentResponse>,
                        java.util.concurrent.Future<CreateSteeringPolicyAttachmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSteeringPolicyAttachmentRequest, CreateSteeringPolicyAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTsigKeyResponse> createTsigKey(
            CreateTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTsigKeyRequest, CreateTsigKeyResponse>
                    handler) {
        LOG.trace("Called async createTsigKey");
        final CreateTsigKeyRequest interceptedRequest =
                CreateTsigKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTsigKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTsigKeyResponse>
                transformer = CreateTsigKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateTsigKeyRequest, CreateTsigKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTsigKeyRequest, CreateTsigKeyResponse>,
                        java.util.concurrent.Future<CreateTsigKeyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTsigKeyRequest, CreateTsigKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateViewResponse> createView(
            CreateViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateViewRequest, CreateViewResponse>
                    handler) {
        LOG.trace("Called async createView");
        final CreateViewRequest interceptedRequest = CreateViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateViewConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateViewResponse>
                transformer = CreateViewConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateViewRequest, CreateViewResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateViewRequest, CreateViewResponse>,
                        java.util.concurrent.Future<CreateViewResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateViewRequest, CreateViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateZoneResponse> createZone(
            CreateZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateZoneRequest, CreateZoneResponse>
                    handler) {
        LOG.trace("Called async createZone");
        final CreateZoneRequest interceptedRequest = CreateZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateZoneConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateZoneResponse>
                transformer = CreateZoneConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateZoneRequest, CreateZoneResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateZoneRequest, CreateZoneResponse>,
                        java.util.concurrent.Future<CreateZoneResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateZoneRequest, CreateZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainRecordsResponse> deleteDomainRecords(
            DeleteDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>
                    handler) {
        LOG.trace("Called async deleteDomainRecords");
        final DeleteDomainRecordsRequest interceptedRequest =
                DeleteDomainRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDomainRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDomainRecordsResponse>
                transformer = DeleteDomainRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>,
                        java.util.concurrent.Future<DeleteDomainRecordsResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRRSetResponse> deleteRRSet(
            DeleteRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRRSetRequest, DeleteRRSetResponse>
                    handler) {
        LOG.trace("Called async deleteRRSet");
        final DeleteRRSetRequest interceptedRequest =
                DeleteRRSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRRSetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteRRSetResponse>
                transformer = DeleteRRSetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteRRSetRequest, DeleteRRSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRRSetRequest, DeleteRRSetResponse>,
                        java.util.concurrent.Future<DeleteRRSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRRSetRequest, DeleteRRSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverEndpointResponse> deleteResolverEndpoint(
            DeleteResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>
                    handler) {
        LOG.trace("Called async deleteResolverEndpoint");
        final DeleteResolverEndpointRequest interceptedRequest =
                DeleteResolverEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteResolverEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteResolverEndpointResponse>
                transformer = DeleteResolverEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>,
                        java.util.concurrent.Future<DeleteResolverEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSteeringPolicyResponse> deleteSteeringPolicy(
            DeleteSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteSteeringPolicy");
        final DeleteSteeringPolicyRequest interceptedRequest =
                DeleteSteeringPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSteeringPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSteeringPolicyResponse>
                transformer = DeleteSteeringPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>,
                        java.util.concurrent.Future<DeleteSteeringPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSteeringPolicyAttachmentResponse>
            deleteSteeringPolicyAttachment(
                    DeleteSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSteeringPolicyAttachmentRequest,
                                    DeleteSteeringPolicyAttachmentResponse>
                            handler) {
        LOG.trace("Called async deleteSteeringPolicyAttachment");
        final DeleteSteeringPolicyAttachmentRequest interceptedRequest =
                DeleteSteeringPolicyAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSteeringPolicyAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSteeringPolicyAttachmentResponse>
                transformer = DeleteSteeringPolicyAttachmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSteeringPolicyAttachmentRequest,
                        DeleteSteeringPolicyAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSteeringPolicyAttachmentRequest,
                                DeleteSteeringPolicyAttachmentResponse>,
                        java.util.concurrent.Future<DeleteSteeringPolicyAttachmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSteeringPolicyAttachmentRequest, DeleteSteeringPolicyAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTsigKeyResponse> deleteTsigKey(
            DeleteTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTsigKeyRequest, DeleteTsigKeyResponse>
                    handler) {
        LOG.trace("Called async deleteTsigKey");
        final DeleteTsigKeyRequest interceptedRequest =
                DeleteTsigKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTsigKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTsigKeyResponse>
                transformer = DeleteTsigKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteTsigKeyRequest, DeleteTsigKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTsigKeyRequest, DeleteTsigKeyResponse>,
                        java.util.concurrent.Future<DeleteTsigKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTsigKeyRequest, DeleteTsigKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteViewResponse> deleteView(
            DeleteViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteViewRequest, DeleteViewResponse>
                    handler) {
        LOG.trace("Called async deleteView");
        final DeleteViewRequest interceptedRequest = DeleteViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteViewConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteViewResponse>
                transformer = DeleteViewConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteViewRequest, DeleteViewResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteViewRequest, DeleteViewResponse>,
                        java.util.concurrent.Future<DeleteViewResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteViewRequest, DeleteViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteZoneResponse> deleteZone(
            DeleteZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteZoneRequest, DeleteZoneResponse>
                    handler) {
        LOG.trace("Called async deleteZone");
        final DeleteZoneRequest interceptedRequest = DeleteZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteZoneConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteZoneResponse>
                transformer = DeleteZoneConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteZoneRequest, DeleteZoneResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteZoneRequest, DeleteZoneResponse>,
                        java.util.concurrent.Future<DeleteZoneResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteZoneRequest, DeleteZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDomainRecordsResponse> getDomainRecords(
            GetDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDomainRecordsRequest, GetDomainRecordsResponse>
                    handler) {
        LOG.trace("Called async getDomainRecords");
        final GetDomainRecordsRequest interceptedRequest =
                GetDomainRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDomainRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDomainRecordsResponse>
                transformer = GetDomainRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDomainRecordsRequest, GetDomainRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDomainRecordsRequest, GetDomainRecordsResponse>,
                        java.util.concurrent.Future<GetDomainRecordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDomainRecordsRequest, GetDomainRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRRSetResponse> getRRSet(
            GetRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse>
                    handler) {
        LOG.trace("Called async getRRSet");
        final GetRRSetRequest interceptedRequest = GetRRSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRRSetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetRRSetResponse>
                transformer = GetRRSetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse>,
                        java.util.concurrent.Future<GetRRSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRRSetRequest, GetRRSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResolverResponse> getResolver(
            GetResolverRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetResolverRequest, GetResolverResponse>
                    handler) {
        LOG.trace("Called async getResolver");
        final GetResolverRequest interceptedRequest =
                GetResolverConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResolverConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetResolverResponse>
                transformer = GetResolverConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetResolverRequest, GetResolverResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResolverRequest, GetResolverResponse>,
                        java.util.concurrent.Future<GetResolverResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResolverRequest, GetResolverResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResolverEndpointResponse> getResolverEndpoint(
            GetResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResolverEndpointRequest, GetResolverEndpointResponse>
                    handler) {
        LOG.trace("Called async getResolverEndpoint");
        final GetResolverEndpointRequest interceptedRequest =
                GetResolverEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResolverEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetResolverEndpointResponse>
                transformer = GetResolverEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetResolverEndpointRequest, GetResolverEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResolverEndpointRequest, GetResolverEndpointResponse>,
                        java.util.concurrent.Future<GetResolverEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResolverEndpointRequest, GetResolverEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSteeringPolicyResponse> getSteeringPolicy(
            GetSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSteeringPolicyRequest, GetSteeringPolicyResponse>
                    handler) {
        LOG.trace("Called async getSteeringPolicy");
        final GetSteeringPolicyRequest interceptedRequest =
                GetSteeringPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSteeringPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSteeringPolicyResponse>
                transformer = GetSteeringPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSteeringPolicyRequest, GetSteeringPolicyResponse>,
                        java.util.concurrent.Future<GetSteeringPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSteeringPolicyRequest, GetSteeringPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSteeringPolicyAttachmentResponse>
            getSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSteeringPolicyAttachmentRequest,
                                    GetSteeringPolicyAttachmentResponse>
                            handler) {
        LOG.trace("Called async getSteeringPolicyAttachment");
        final GetSteeringPolicyAttachmentRequest interceptedRequest =
                GetSteeringPolicyAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSteeringPolicyAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSteeringPolicyAttachmentResponse>
                transformer = GetSteeringPolicyAttachmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSteeringPolicyAttachmentRequest,
                                GetSteeringPolicyAttachmentResponse>,
                        java.util.concurrent.Future<GetSteeringPolicyAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTsigKeyResponse> getTsigKey(
            GetTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTsigKeyRequest, GetTsigKeyResponse>
                    handler) {
        LOG.trace("Called async getTsigKey");
        final GetTsigKeyRequest interceptedRequest = GetTsigKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTsigKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTsigKeyResponse>
                transformer = GetTsigKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTsigKeyRequest, GetTsigKeyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTsigKeyRequest, GetTsigKeyResponse>,
                        java.util.concurrent.Future<GetTsigKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTsigKeyRequest, GetTsigKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetViewResponse> getView(
            GetViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse> handler) {
        LOG.trace("Called async getView");
        final GetViewRequest interceptedRequest = GetViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetViewConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetViewResponse>
                transformer = GetViewConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse>,
                        java.util.concurrent.Future<GetViewResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetViewRequest, GetViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetZoneResponse> getZone(
            GetZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse> handler) {
        LOG.trace("Called async getZone");
        final GetZoneRequest interceptedRequest = GetZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetZoneConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetZoneResponse>
                transformer = GetZoneConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse>,
                        java.util.concurrent.Future<GetZoneResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetZoneRequest, GetZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetZoneRecordsResponse> getZoneRecords(
            GetZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetZoneRecordsRequest, GetZoneRecordsResponse>
                    handler) {
        LOG.trace("Called async getZoneRecords");
        final GetZoneRecordsRequest interceptedRequest =
                GetZoneRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetZoneRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetZoneRecordsResponse>
                transformer = GetZoneRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetZoneRecordsRequest, GetZoneRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetZoneRecordsRequest, GetZoneRecordsResponse>,
                        java.util.concurrent.Future<GetZoneRecordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetZoneRecordsRequest, GetZoneRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResolverEndpointsResponse> listResolverEndpoints(
            ListResolverEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResolverEndpointsRequest, ListResolverEndpointsResponse>
                    handler) {
        LOG.trace("Called async listResolverEndpoints");
        final ListResolverEndpointsRequest interceptedRequest =
                ListResolverEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResolverEndpointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResolverEndpointsResponse>
                transformer = ListResolverEndpointsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResolverEndpointsRequest, ListResolverEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResolverEndpointsRequest, ListResolverEndpointsResponse>,
                        java.util.concurrent.Future<ListResolverEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResolverEndpointsRequest, ListResolverEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResolversResponse> listResolvers(
            ListResolversRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListResolversRequest, ListResolversResponse>
                    handler) {
        LOG.trace("Called async listResolvers");
        final ListResolversRequest interceptedRequest =
                ListResolversConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResolversConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListResolversResponse>
                transformer = ListResolversConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListResolversRequest, ListResolversResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResolversRequest, ListResolversResponse>,
                        java.util.concurrent.Future<ListResolversResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResolversRequest, ListResolversResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSteeringPoliciesResponse> listSteeringPolicies(
            ListSteeringPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>
                    handler) {
        LOG.trace("Called async listSteeringPolicies");
        final ListSteeringPoliciesRequest interceptedRequest =
                ListSteeringPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSteeringPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSteeringPoliciesResponse>
                transformer = ListSteeringPoliciesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>,
                        java.util.concurrent.Future<ListSteeringPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSteeringPolicyAttachmentsResponse>
            listSteeringPolicyAttachments(
                    ListSteeringPolicyAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSteeringPolicyAttachmentsRequest,
                                    ListSteeringPolicyAttachmentsResponse>
                            handler) {
        LOG.trace("Called async listSteeringPolicyAttachments");
        final ListSteeringPolicyAttachmentsRequest interceptedRequest =
                ListSteeringPolicyAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSteeringPolicyAttachmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSteeringPolicyAttachmentsResponse>
                transformer = ListSteeringPolicyAttachmentsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSteeringPolicyAttachmentsRequest, ListSteeringPolicyAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSteeringPolicyAttachmentsRequest,
                                ListSteeringPolicyAttachmentsResponse>,
                        java.util.concurrent.Future<ListSteeringPolicyAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSteeringPolicyAttachmentsRequest, ListSteeringPolicyAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTsigKeysResponse> listTsigKeys(
            ListTsigKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTsigKeysRequest, ListTsigKeysResponse>
                    handler) {
        LOG.trace("Called async listTsigKeys");
        final ListTsigKeysRequest interceptedRequest =
                ListTsigKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTsigKeysConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTsigKeysResponse>
                transformer = ListTsigKeysConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListTsigKeysRequest, ListTsigKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTsigKeysRequest, ListTsigKeysResponse>,
                        java.util.concurrent.Future<ListTsigKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTsigKeysRequest, ListTsigKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListViewsResponse> listViews(
            ListViewsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse>
                    handler) {
        LOG.trace("Called async listViews");
        final ListViewsRequest interceptedRequest = ListViewsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListViewsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListViewsResponse>
                transformer = ListViewsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse>,
                        java.util.concurrent.Future<ListViewsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListViewsRequest, ListViewsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListZonesResponse> listZones(
            ListZonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse>
                    handler) {
        LOG.trace("Called async listZones");
        final ListZonesRequest interceptedRequest = ListZonesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListZonesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListZonesResponse>
                transformer = ListZonesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse>,
                        java.util.concurrent.Future<ListZonesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListZonesRequest, ListZonesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchDomainRecordsResponse> patchDomainRecords(
            PatchDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDomainRecordsRequest, PatchDomainRecordsResponse>
                    handler) {
        LOG.trace("Called async patchDomainRecords");
        final PatchDomainRecordsRequest interceptedRequest =
                PatchDomainRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDomainRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PatchDomainRecordsResponse>
                transformer = PatchDomainRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<PatchDomainRecordsRequest, PatchDomainRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDomainRecordsRequest, PatchDomainRecordsResponse>,
                        java.util.concurrent.Future<PatchDomainRecordsResponse>>
                futureSupplier = client.patchFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDomainRecordsRequest, PatchDomainRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchRRSetResponse> patchRRSet(
            PatchRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchRRSetRequest, PatchRRSetResponse>
                    handler) {
        LOG.trace("Called async patchRRSet");
        final PatchRRSetRequest interceptedRequest = PatchRRSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchRRSetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PatchRRSetResponse>
                transformer = PatchRRSetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<PatchRRSetRequest, PatchRRSetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchRRSetRequest, PatchRRSetResponse>,
                        java.util.concurrent.Future<PatchRRSetResponse>>
                futureSupplier = client.patchFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchRRSetRequest, PatchRRSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchZoneRecordsResponse> patchZoneRecords(
            PatchZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchZoneRecordsRequest, PatchZoneRecordsResponse>
                    handler) {
        LOG.trace("Called async patchZoneRecords");
        final PatchZoneRecordsRequest interceptedRequest =
                PatchZoneRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchZoneRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PatchZoneRecordsResponse>
                transformer = PatchZoneRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<PatchZoneRecordsRequest, PatchZoneRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchZoneRecordsRequest, PatchZoneRecordsResponse>,
                        java.util.concurrent.Future<PatchZoneRecordsResponse>>
                futureSupplier = client.patchFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchZoneRecordsRequest, PatchZoneRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainRecordsResponse> updateDomainRecords(
            UpdateDomainRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>
                    handler) {
        LOG.trace("Called async updateDomainRecords");
        final UpdateDomainRecordsRequest interceptedRequest =
                UpdateDomainRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDomainRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDomainRecordsResponse>
                transformer = UpdateDomainRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>,
                        java.util.concurrent.Future<UpdateDomainRecordsResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRRSetResponse> updateRRSet(
            UpdateRRSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRRSetRequest, UpdateRRSetResponse>
                    handler) {
        LOG.trace("Called async updateRRSet");
        final UpdateRRSetRequest interceptedRequest =
                UpdateRRSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRRSetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateRRSetResponse>
                transformer = UpdateRRSetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateRRSetRequest, UpdateRRSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRRSetRequest, UpdateRRSetResponse>,
                        java.util.concurrent.Future<UpdateRRSetResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRRSetRequest, UpdateRRSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverResponse> updateResolver(
            UpdateResolverRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResolverRequest, UpdateResolverResponse>
                    handler) {
        LOG.trace("Called async updateResolver");
        final UpdateResolverRequest interceptedRequest =
                UpdateResolverConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResolverConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateResolverResponse>
                transformer = UpdateResolverConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateResolverRequest, UpdateResolverResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResolverRequest, UpdateResolverResponse>,
                        java.util.concurrent.Future<UpdateResolverResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResolverRequest, UpdateResolverResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverEndpointResponse> updateResolverEndpoint(
            UpdateResolverEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>
                    handler) {
        LOG.trace("Called async updateResolverEndpoint");
        final UpdateResolverEndpointRequest interceptedRequest =
                UpdateResolverEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResolverEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateResolverEndpointResponse>
                transformer = UpdateResolverEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>,
                        java.util.concurrent.Future<UpdateResolverEndpointResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSteeringPolicyResponse> updateSteeringPolicy(
            UpdateSteeringPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>
                    handler) {
        LOG.trace("Called async updateSteeringPolicy");
        final UpdateSteeringPolicyRequest interceptedRequest =
                UpdateSteeringPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSteeringPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSteeringPolicyResponse>
                transformer = UpdateSteeringPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>,
                        java.util.concurrent.Future<UpdateSteeringPolicyResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSteeringPolicyAttachmentResponse>
            updateSteeringPolicyAttachment(
                    UpdateSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSteeringPolicyAttachmentRequest,
                                    UpdateSteeringPolicyAttachmentResponse>
                            handler) {
        LOG.trace("Called async updateSteeringPolicyAttachment");
        final UpdateSteeringPolicyAttachmentRequest interceptedRequest =
                UpdateSteeringPolicyAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSteeringPolicyAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSteeringPolicyAttachmentResponse>
                transformer = UpdateSteeringPolicyAttachmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSteeringPolicyAttachmentRequest,
                        UpdateSteeringPolicyAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSteeringPolicyAttachmentRequest,
                                UpdateSteeringPolicyAttachmentResponse>,
                        java.util.concurrent.Future<UpdateSteeringPolicyAttachmentResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSteeringPolicyAttachmentRequest, UpdateSteeringPolicyAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTsigKeyResponse> updateTsigKey(
            UpdateTsigKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTsigKeyRequest, UpdateTsigKeyResponse>
                    handler) {
        LOG.trace("Called async updateTsigKey");
        final UpdateTsigKeyRequest interceptedRequest =
                UpdateTsigKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTsigKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTsigKeyResponse>
                transformer = UpdateTsigKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateTsigKeyRequest, UpdateTsigKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTsigKeyRequest, UpdateTsigKeyResponse>,
                        java.util.concurrent.Future<UpdateTsigKeyResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTsigKeyRequest, UpdateTsigKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateViewResponse> updateView(
            UpdateViewRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateViewRequest, UpdateViewResponse>
                    handler) {
        LOG.trace("Called async updateView");
        final UpdateViewRequest interceptedRequest = UpdateViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateViewConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateViewResponse>
                transformer = UpdateViewConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateViewRequest, UpdateViewResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateViewRequest, UpdateViewResponse>,
                        java.util.concurrent.Future<UpdateViewResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateViewRequest, UpdateViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateZoneResponse> updateZone(
            UpdateZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateZoneRequest, UpdateZoneResponse>
                    handler) {
        LOG.trace("Called async updateZone");
        final UpdateZoneRequest interceptedRequest = UpdateZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateZoneConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateZoneResponse>
                transformer = UpdateZoneConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateZoneRequest, UpdateZoneResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateZoneRequest, UpdateZoneResponse>,
                        java.util.concurrent.Future<UpdateZoneResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateZoneRequest, UpdateZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateZoneRecordsResponse> updateZoneRecords(
            UpdateZoneRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>
                    handler) {
        LOG.trace("Called async updateZoneRecords");
        final UpdateZoneRecordsRequest interceptedRequest =
                UpdateZoneRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateZoneRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateZoneRecordsResponse>
                transformer = UpdateZoneRecordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>,
                        java.util.concurrent.Future<UpdateZoneRecordsResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
