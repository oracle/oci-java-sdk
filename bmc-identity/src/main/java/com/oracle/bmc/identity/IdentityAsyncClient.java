/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.internal.http.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for Identity service. <br/>
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
public class IdentityAsyncClient implements IdentityAsync {
    /**
     * Service instance for Identity.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITY")
                    .serviceEndpointPrefix("identity")
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IdentityAsyncClient> {
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
        public IdentityAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new IdentityAsyncClient(
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
    public java.util.concurrent.Future<ActivateDomainResponse> activateDomain(
            ActivateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateDomainRequest, ActivateDomainResponse>
                    handler) {
        LOG.trace("Called async activateDomain");
        final ActivateDomainRequest interceptedRequest =
                ActivateDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ActivateDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ActivateDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ActivateDomainResponse>
                transformer =
                        ActivateDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ActivateDomainRequest, ActivateDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateDomainRequest, ActivateDomainResponse>,
                        java.util.concurrent.Future<ActivateDomainResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateDomainRequest, ActivateDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateMfaTotpDeviceResponse> activateMfaTotpDevice(
            ActivateMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>
                    handler) {
        LOG.trace("Called async activateMfaTotpDevice");
        final ActivateMfaTotpDeviceRequest interceptedRequest =
                ActivateMfaTotpDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateMfaTotpDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ActivateMfaTotpDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/ActivateMfaTotpDevice");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateMfaTotpDeviceResponse>
                transformer =
                        ActivateMfaTotpDeviceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>,
                        java.util.concurrent.Future<ActivateMfaTotpDeviceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMfaTotpToken(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateMfaTotpDeviceRequest, ActivateMfaTotpDeviceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddTagDefaultLockResponse> addTagDefaultLock(
            AddTagDefaultLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddTagDefaultLockRequest, AddTagDefaultLockResponse>
                    handler) {
        LOG.trace("Called async addTagDefaultLock");
        final AddTagDefaultLockRequest interceptedRequest =
                AddTagDefaultLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddTagDefaultLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "AddTagDefaultLock",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/AddTagDefaultLock");
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddTagDefaultLockResponse>
                transformer =
                        AddTagDefaultLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddTagDefaultLockRequest, AddTagDefaultLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddTagDefaultLockRequest, AddTagDefaultLockResponse>,
                        java.util.concurrent.Future<AddTagDefaultLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddTagDefaultLockRequest, AddTagDefaultLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddTagNamespaceLockResponse> addTagNamespaceLock(
            AddTagNamespaceLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>
                    handler) {
        LOG.trace("Called async addTagNamespaceLock");
        final AddTagNamespaceLockRequest interceptedRequest =
                AddTagNamespaceLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddTagNamespaceLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "AddTagNamespaceLock",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/AddTagNamespaceLock");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddTagNamespaceLockResponse>
                transformer =
                        AddTagNamespaceLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>,
                        java.util.concurrent.Future<AddTagNamespaceLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddTagNamespaceLockRequest, AddTagNamespaceLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            AddUserToGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddUserToGroupRequest, AddUserToGroupResponse>
                    handler) {
        LOG.trace("Called async addUserToGroup");
        final AddUserToGroupRequest interceptedRequest =
                AddUserToGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddUserToGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "AddUserToGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/AddUserToGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddUserToGroupResponse>
                transformer =
                        AddUserToGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddUserToGroupRequest, AddUserToGroupResponse>,
                        java.util.concurrent.Future<AddUserToGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddUserToGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddUserToGroupRequest, AddUserToGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AssembleEffectiveTagSetResponse> assembleEffectiveTagSet(
            AssembleEffectiveTagSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>
                    handler) {
        LOG.trace("Called async assembleEffectiveTagSet");
        final AssembleEffectiveTagSetRequest interceptedRequest =
                AssembleEffectiveTagSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AssembleEffectiveTagSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "AssembleEffectiveTagSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/AssembleEffectiveTagSet");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AssembleEffectiveTagSetResponse>
                transformer =
                        AssembleEffectiveTagSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>,
                        java.util.concurrent.Future<AssembleEffectiveTagSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AssembleEffectiveTagSetRequest, AssembleEffectiveTagSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteResourcesResponse> bulkDeleteResources(
            BulkDeleteResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>
                    handler) {
        LOG.trace("Called async bulkDeleteResources");
        final BulkDeleteResourcesRequest interceptedRequest =
                BulkDeleteResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkDeleteResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "BulkDeleteResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/BulkDeleteResources");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BulkDeleteResourcesResponse>
                transformer =
                        BulkDeleteResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>,
                        java.util.concurrent.Future<BulkDeleteResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkDeleteResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkDeleteResourcesRequest, BulkDeleteResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteTagsResponse> bulkDeleteTags(
            BulkDeleteTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkDeleteTagsRequest, BulkDeleteTagsResponse>
                    handler) {
        LOG.trace("Called async bulkDeleteTags");
        final BulkDeleteTagsRequest interceptedRequest =
                BulkDeleteTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkDeleteTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "BulkDeleteTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/BulkDeleteTags");
        final com.google.common.base.Function<javax.ws.rs.core.Response, BulkDeleteTagsResponse>
                transformer =
                        BulkDeleteTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BulkDeleteTagsRequest, BulkDeleteTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkDeleteTagsRequest, BulkDeleteTagsResponse>,
                        java.util.concurrent.Future<BulkDeleteTagsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkDeleteTagsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkDeleteTagsRequest, BulkDeleteTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkEditTagsResponse> bulkEditTags(
            BulkEditTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BulkEditTagsRequest, BulkEditTagsResponse>
                    handler) {
        LOG.trace("Called async bulkEditTags");
        final BulkEditTagsRequest interceptedRequest =
                BulkEditTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkEditTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "BulkEditTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/BulkEditTags");
        final com.google.common.base.Function<javax.ws.rs.core.Response, BulkEditTagsResponse>
                transformer =
                        BulkEditTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BulkEditTagsRequest, BulkEditTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkEditTagsRequest, BulkEditTagsResponse>,
                        java.util.concurrent.Future<BulkEditTagsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkEditTagsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkEditTagsRequest, BulkEditTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkMoveResourcesResponse> bulkMoveResources(
            BulkMoveResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkMoveResourcesRequest, BulkMoveResourcesResponse>
                    handler) {
        LOG.trace("Called async bulkMoveResources");
        final BulkMoveResourcesRequest interceptedRequest =
                BulkMoveResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkMoveResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "BulkMoveResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/BulkMoveResources");
        final com.google.common.base.Function<javax.ws.rs.core.Response, BulkMoveResourcesResponse>
                transformer =
                        BulkMoveResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BulkMoveResourcesRequest, BulkMoveResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkMoveResourcesRequest, BulkMoveResourcesResponse>,
                        java.util.concurrent.Future<BulkMoveResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkMoveResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkMoveResourcesRequest, BulkMoveResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CascadeDeleteTagNamespaceResponse> cascadeDeleteTagNamespace(
            CascadeDeleteTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CascadeDeleteTagNamespaceRequest, CascadeDeleteTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async cascadeDeleteTagNamespace");
        final CascadeDeleteTagNamespaceRequest interceptedRequest =
                CascadeDeleteTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadeDeleteTagNamespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CascadeDeleteTagNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/CascadeDeleteTagNamespace");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CascadeDeleteTagNamespaceResponse>
                transformer =
                        CascadeDeleteTagNamespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CascadeDeleteTagNamespaceRequest, CascadeDeleteTagNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CascadeDeleteTagNamespaceRequest,
                                CascadeDeleteTagNamespaceResponse>,
                        java.util.concurrent.Future<CascadeDeleteTagNamespaceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CascadeDeleteTagNamespaceRequest, CascadeDeleteTagNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDomainCompartmentResponse> changeDomainCompartment(
            ChangeDomainCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeDomainCompartment");
        final ChangeDomainCompartmentRequest interceptedRequest =
                ChangeDomainCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDomainCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ChangeDomainCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ChangeDomainCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDomainCompartmentResponse>
                transformer =
                        ChangeDomainCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDomainCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDomainCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDomainCompartmentRequest, ChangeDomainCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDomainLicenseTypeResponse> changeDomainLicenseType(
            ChangeDomainLicenseTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>
                    handler) {
        LOG.trace("Called async changeDomainLicenseType");
        final ChangeDomainLicenseTypeRequest interceptedRequest =
                ChangeDomainLicenseTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDomainLicenseTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ChangeDomainLicenseType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ChangeDomainLicenseType");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDomainLicenseTypeResponse>
                transformer =
                        ChangeDomainLicenseTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>,
                        java.util.concurrent.Future<ChangeDomainLicenseTypeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDomainLicenseTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDomainLicenseTypeRequest, ChangeDomainLicenseTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTagNamespaceCompartmentResponse>
            changeTagNamespaceCompartment(
                    ChangeTagNamespaceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTagNamespaceCompartmentRequest,
                                    ChangeTagNamespaceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeTagNamespaceCompartment");
        final ChangeTagNamespaceCompartmentRequest interceptedRequest =
                ChangeTagNamespaceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTagNamespaceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ChangeTagNamespaceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/ChangeTagNamespaceCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeTagNamespaceCompartmentResponse>
                transformer =
                        ChangeTagNamespaceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTagNamespaceCompartmentRequest, ChangeTagNamespaceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTagNamespaceCompartmentRequest,
                                ChangeTagNamespaceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTagNamespaceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeTagNamespaceCompartmentDetail(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTagNamespaceCompartmentRequest, ChangeTagNamespaceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler) {
        LOG.trace("Called async createAuthToken");
        final CreateAuthTokenRequest interceptedRequest =
                CreateAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/CreateAuthToken");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAuthTokenResponse>
                transformer =
                        CreateAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAuthTokenRequest, CreateAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuthTokenRequest, CreateAuthTokenResponse>,
                        java.util.concurrent.Future<CreateAuthTokenResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAuthTokenDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuthTokenRequest, CreateAuthTokenResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            CreateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler) {
        LOG.trace("Called async createCompartment");
        final CreateCompartmentRequest interceptedRequest =
                CreateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/CreateCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateCompartmentResponse>
                transformer =
                        CreateCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCompartmentRequest, CreateCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCompartmentRequest, CreateCompartmentResponse>,
                        java.util.concurrent.Future<CreateCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCompartmentRequest, CreateCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async createCustomerSecretKey");
        final CreateCustomerSecretKeyRequest interceptedRequest =
                CreateCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKey/CreateCustomerSecretKey");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>
                transformer =
                        CreateCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<CreateCustomerSecretKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCustomerSecretKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDbCredentialResponse> createDbCredential(
            CreateDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDbCredentialRequest, CreateDbCredentialResponse>
                    handler) {
        LOG.trace("Called async createDbCredential");
        final CreateDbCredentialRequest interceptedRequest =
                CreateDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateDbCredential");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbCredentialResponse>
                transformer =
                        CreateDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDbCredentialRequest, CreateDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDbCredentialRequest, CreateDbCredentialResponse>,
                        java.util.concurrent.Future<CreateDbCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDbCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDbCredentialRequest, CreateDbCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResponse> createDomain(
            CreateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDomainRequest, CreateDomainResponse>
                    handler) {
        LOG.trace("Called async createDomain");
        final CreateDomainRequest interceptedRequest =
                CreateDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/CreateDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDomainResponse>
                transformer =
                        CreateDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDomainRequest, CreateDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDomainRequest, CreateDomainResponse>,
                        java.util.concurrent.Future<CreateDomainResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDomainRequest, CreateDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDynamicGroupResponse> createDynamicGroup(
            CreateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async createDynamicGroup");
        final CreateDynamicGroupRequest interceptedRequest =
                CreateDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDynamicGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateDynamicGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/CreateDynamicGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDynamicGroupResponse>
                transformer =
                        CreateDynamicGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDynamicGroupRequest, CreateDynamicGroupResponse>,
                        java.util.concurrent.Future<CreateDynamicGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDynamicGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDynamicGroupRequest, CreateDynamicGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {
        LOG.trace("Called async createGroup");
        final CreateGroupRequest interceptedRequest =
                CreateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/CreateGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer =
                        CreateGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGroupRequest, CreateGroupResponse>,
                        java.util.concurrent.Future<CreateGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGroupRequest, CreateGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async createIdentityProvider");
        final CreateIdentityProviderRequest interceptedRequest =
                CreateIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/CreateIdentityProvider");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer =
                        CreateIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIdentityProviderRequest, CreateIdentityProviderResponse>,
                        java.util.concurrent.Future<CreateIdentityProviderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIdentityProviderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIdentityProviderRequest, CreateIdentityProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            CreateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async createIdpGroupMapping");
        final CreateIdpGroupMappingRequest interceptedRequest =
                CreateIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateIdpGroupMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/CreateIdpGroupMapping");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIdpGroupMappingResponse>
                transformer =
                        CreateIdpGroupMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>,
                        java.util.concurrent.Future<CreateIdpGroupMappingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIdpGroupMappingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMfaTotpDeviceResponse> createMfaTotpDevice(
            CreateMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>
                    handler) {
        LOG.trace("Called async createMfaTotpDevice");
        final CreateMfaTotpDeviceRequest interceptedRequest =
                CreateMfaTotpDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMfaTotpDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateMfaTotpDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/CreateMfaTotpDevice");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateMfaTotpDeviceResponse>
                transformer =
                        CreateMfaTotpDeviceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>,
                        java.util.concurrent.Future<CreateMfaTotpDeviceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMfaTotpDeviceRequest, CreateMfaTotpDeviceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSourceResponse> createNetworkSource(
            CreateNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkSourceRequest, CreateNetworkSourceResponse>
                    handler) {
        LOG.trace("Called async createNetworkSource");
        final CreateNetworkSourceRequest interceptedRequest =
                CreateNetworkSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateNetworkSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/CreateNetworkSource");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateNetworkSourceResponse>
                transformer =
                        CreateNetworkSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkSourceRequest, CreateNetworkSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkSourceRequest, CreateNetworkSourceResponse>,
                        java.util.concurrent.Future<CreateNetworkSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNetworkSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkSourceRequest, CreateNetworkSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOAuthClientCredentialResponse>
            createOAuthClientCredential(
                    CreateOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuthClientCredentialRequest,
                                    CreateOAuthClientCredentialResponse>
                            handler) {
        LOG.trace("Called async createOAuthClientCredential");
        final CreateOAuthClientCredentialRequest interceptedRequest =
                CreateOAuthClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuthClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateOAuthClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateOAuthClientCredential");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOAuthClientCredentialResponse>
                transformer =
                        CreateOAuthClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOAuthClientCredentialRequest, CreateOAuthClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOAuthClientCredentialRequest,
                                CreateOAuthClientCredentialResponse>,
                        java.util.concurrent.Future<CreateOAuthClientCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOAuth2ClientCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOAuthClientCredentialRequest, CreateOAuthClientCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            CreateOrResetUIPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler) {
        LOG.trace("Called async createOrResetUIPassword");
        final CreateOrResetUIPasswordRequest interceptedRequest =
                CreateOrResetUIPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOrResetUIPasswordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateOrResetUIPassword",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UIPassword/CreateOrResetUIPassword");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOrResetUIPasswordResponse>
                transformer =
                        CreateOrResetUIPasswordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>,
                        java.util.concurrent.Future<CreateOrResetUIPasswordResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler) {
        LOG.trace("Called async createPolicy");
        final CreatePolicyRequest interceptedRequest =
                CreatePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreatePolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/CreatePolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer =
                        CreatePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePolicyRequest, CreatePolicyResponse>,
                        java.util.concurrent.Future<CreatePolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePolicyRequest, CreatePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            CreateRegionSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler) {
        LOG.trace("Called async createRegionSubscription");
        final CreateRegionSubscriptionRequest interceptedRequest =
                CreateRegionSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRegionSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateRegionSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/RegionSubscription/CreateRegionSubscription");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateRegionSubscriptionResponse>
                transformer =
                        CreateRegionSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>,
                        java.util.concurrent.Future<CreateRegionSubscriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRegionSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async createSmtpCredential");
        final CreateSmtpCredentialRequest interceptedRequest =
                CreateSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredential/CreateSmtpCredential");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSmtpCredentialResponse>
                transformer =
                        CreateSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>,
                        java.util.concurrent.Future<CreateSmtpCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSmtpCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            CreateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async createSwiftPassword");
        final CreateSwiftPasswordRequest interceptedRequest =
                CreateSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateSwiftPassword",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/CreateSwiftPassword");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer =
                        CreateSwiftPasswordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>,
                        java.util.concurrent.Future<CreateSwiftPasswordResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSwiftPasswordDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTagResponse> createTag(
            CreateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse>
                    handler) {
        LOG.trace("Called async createTag");
        final CreateTagRequest interceptedRequest = CreateTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateTag",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/CreateTag");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagResponse>
                transformer =
                        CreateTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse>,
                        java.util.concurrent.Future<CreateTagResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTagRequest, CreateTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTagDefaultResponse> createTagDefault(
            CreateTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTagDefaultRequest, CreateTagDefaultResponse>
                    handler) {
        LOG.trace("Called async createTagDefault");
        final CreateTagDefaultRequest interceptedRequest =
                CreateTagDefaultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagDefaultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateTagDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/CreateTagDefault");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagDefaultResponse>
                transformer =
                        CreateTagDefaultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTagDefaultRequest, CreateTagDefaultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTagDefaultRequest, CreateTagDefaultResponse>,
                        java.util.concurrent.Future<CreateTagDefaultResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTagDefaultDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTagDefaultRequest, CreateTagDefaultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTagNamespaceResponse> createTagNamespace(
            CreateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async createTagNamespace");
        final CreateTagNamespaceRequest interceptedRequest =
                CreateTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagNamespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateTagNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/CreateTagNamespace");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagNamespaceResponse>
                transformer =
                        CreateTagNamespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTagNamespaceRequest, CreateTagNamespaceResponse>,
                        java.util.concurrent.Future<CreateTagNamespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTagNamespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTagNamespaceRequest, CreateTagNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse>
                    handler) {
        LOG.trace("Called async createUser");
        final CreateUserRequest interceptedRequest = CreateUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "CreateUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/CreateUser");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserResponse>
                transformer =
                        CreateUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserRequest, CreateUserResponse>,
                        java.util.concurrent.Future<CreateUserResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserRequest, CreateUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateDomainResponse> deactivateDomain(
            DeactivateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateDomainRequest, DeactivateDomainResponse>
                    handler) {
        LOG.trace("Called async deactivateDomain");
        final DeactivateDomainRequest interceptedRequest =
                DeactivateDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeactivateDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/DeactivateDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeactivateDomainResponse>
                transformer =
                        DeactivateDomainConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeactivateDomainRequest, DeactivateDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateDomainRequest, DeactivateDomainResponse>,
                        java.util.concurrent.Future<DeactivateDomainResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateDomainRequest, DeactivateDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteApiKey");
        final DeleteApiKeyRequest interceptedRequest =
                DeleteApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteApiKey", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer =
                        DeleteApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApiKeyRequest, DeleteApiKeyResponse>,
                        java.util.concurrent.Future<DeleteApiKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApiKeyRequest, DeleteApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler) {
        LOG.trace("Called async deleteAuthToken");
        final DeleteAuthTokenRequest interceptedRequest =
                DeleteAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteAuthToken", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAuthTokenResponse>
                transformer =
                        DeleteAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuthTokenRequest, DeleteAuthTokenResponse>,
                        java.util.concurrent.Future<DeleteAuthTokenResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuthTokenRequest, DeleteAuthTokenResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCompartmentResponse> deleteCompartment(
            DeleteCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCompartmentRequest, DeleteCompartmentResponse>
                    handler) {
        LOG.trace("Called async deleteCompartment");
        final DeleteCompartmentRequest interceptedRequest =
                DeleteCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/DeleteCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCompartmentResponse>
                transformer =
                        DeleteCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCompartmentRequest, DeleteCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCompartmentRequest, DeleteCompartmentResponse>,
                        java.util.concurrent.Future<DeleteCompartmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCompartmentRequest, DeleteCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async deleteCustomerSecretKey");
        final DeleteCustomerSecretKeyRequest interceptedRequest =
                DeleteCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteCustomerSecretKey", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>
                transformer =
                        DeleteCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<DeleteCustomerSecretKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDbCredentialResponse> deleteDbCredential(
            DeleteDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDbCredentialRequest, DeleteDbCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteDbCredential");
        final DeleteDbCredentialRequest interceptedRequest =
                DeleteDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/DeleteDbCredential");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbCredentialResponse>
                transformer =
                        DeleteDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDbCredentialRequest, DeleteDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDbCredentialRequest, DeleteDbCredentialResponse>,
                        java.util.concurrent.Future<DeleteDbCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDbCredentialRequest, DeleteDbCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResponse> deleteDomain(
            DeleteDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDomainRequest, DeleteDomainResponse>
                    handler) {
        LOG.trace("Called async deleteDomain");
        final DeleteDomainRequest interceptedRequest =
                DeleteDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/DeleteDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDomainResponse>
                transformer =
                        DeleteDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDomainRequest, DeleteDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDomainRequest, DeleteDomainResponse>,
                        java.util.concurrent.Future<DeleteDomainResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDomainRequest, DeleteDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDynamicGroupResponse> deleteDynamicGroup(
            DeleteDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async deleteDynamicGroup");
        final DeleteDynamicGroupRequest interceptedRequest =
                DeleteDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDynamicGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteDynamicGroup", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDynamicGroupResponse>
                transformer =
                        DeleteDynamicGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>,
                        java.util.concurrent.Future<DeleteDynamicGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {
        LOG.trace("Called async deleteGroup");
        final DeleteGroupRequest interceptedRequest =
                DeleteGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteGroup", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer =
                        DeleteGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGroupRequest, DeleteGroupResponse>,
                        java.util.concurrent.Future<DeleteGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGroupRequest, DeleteGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async deleteIdentityProvider");
        final DeleteIdentityProviderRequest interceptedRequest =
                DeleteIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteIdentityProvider", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer =
                        DeleteIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>,
                        java.util.concurrent.Future<DeleteIdentityProviderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            DeleteIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async deleteIdpGroupMapping");
        final DeleteIdpGroupMappingRequest interceptedRequest =
                DeleteIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteIdpGroupMapping", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIdpGroupMappingResponse>
                transformer =
                        DeleteIdpGroupMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>,
                        java.util.concurrent.Future<DeleteIdpGroupMappingResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMfaTotpDeviceResponse> deleteMfaTotpDevice(
            DeleteMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>
                    handler) {
        LOG.trace("Called async deleteMfaTotpDevice");
        final DeleteMfaTotpDeviceRequest interceptedRequest =
                DeleteMfaTotpDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMfaTotpDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteMfaTotpDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/DeleteMfaTotpDevice");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteMfaTotpDeviceResponse>
                transformer =
                        DeleteMfaTotpDeviceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>,
                        java.util.concurrent.Future<DeleteMfaTotpDeviceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMfaTotpDeviceRequest, DeleteMfaTotpDeviceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSourceResponse> deleteNetworkSource(
            DeleteNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>
                    handler) {
        LOG.trace("Called async deleteNetworkSource");
        final DeleteNetworkSourceRequest interceptedRequest =
                DeleteNetworkSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteNetworkSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/DeleteNetworkSource");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteNetworkSourceResponse>
                transformer =
                        DeleteNetworkSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>,
                        java.util.concurrent.Future<DeleteNetworkSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkSourceRequest, DeleteNetworkSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOAuthClientCredentialResponse>
            deleteOAuthClientCredential(
                    DeleteOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuthClientCredentialRequest,
                                    DeleteOAuthClientCredentialResponse>
                            handler) {
        LOG.trace("Called async deleteOAuthClientCredential");
        final DeleteOAuthClientCredentialRequest interceptedRequest =
                DeleteOAuthClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuthClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteOAuthClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/DeleteOAuthClientCredential");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOAuthClientCredentialResponse>
                transformer =
                        DeleteOAuthClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOAuthClientCredentialRequest, DeleteOAuthClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOAuthClientCredentialRequest,
                                DeleteOAuthClientCredentialResponse>,
                        java.util.concurrent.Future<DeleteOAuthClientCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOAuthClientCredentialRequest, DeleteOAuthClientCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler) {
        LOG.trace("Called async deletePolicy");
        final DeletePolicyRequest interceptedRequest =
                DeletePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeletePolicy", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer =
                        DeletePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePolicyRequest, DeletePolicyResponse>,
                        java.util.concurrent.Future<DeletePolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePolicyRequest, DeletePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteSmtpCredential");
        final DeleteSmtpCredentialRequest interceptedRequest =
                DeleteSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteSmtpCredential", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>
                transformer =
                        DeleteSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>,
                        java.util.concurrent.Future<DeleteSmtpCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            DeleteSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async deleteSwiftPassword");
        final DeleteSwiftPasswordRequest interceptedRequest =
                DeleteSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteSwiftPassword", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>
                transformer =
                        DeleteSwiftPasswordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>,
                        java.util.concurrent.Future<DeleteSwiftPasswordResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTagResponse> deleteTag(
            DeleteTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTagRequest, DeleteTagResponse>
                    handler) {
        LOG.trace("Called async deleteTag");
        final DeleteTagRequest interceptedRequest = DeleteTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteTag",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/DeleteTag");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTagResponse>
                transformer =
                        DeleteTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTagRequest, DeleteTagResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteTagRequest, DeleteTagResponse>,
                        java.util.concurrent.Future<DeleteTagResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTagRequest, DeleteTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTagDefaultResponse> deleteTagDefault(
            DeleteTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTagDefaultRequest, DeleteTagDefaultResponse>
                    handler) {
        LOG.trace("Called async deleteTagDefault");
        final DeleteTagDefaultRequest interceptedRequest =
                DeleteTagDefaultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTagDefaultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteTagDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/DeleteTagDefault");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTagDefaultResponse>
                transformer =
                        DeleteTagDefaultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTagDefaultRequest, DeleteTagDefaultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTagDefaultRequest, DeleteTagDefaultResponse>,
                        java.util.concurrent.Future<DeleteTagDefaultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTagDefaultRequest, DeleteTagDefaultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTagNamespaceResponse> deleteTagNamespace(
            DeleteTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async deleteTagNamespace");
        final DeleteTagNamespaceRequest interceptedRequest =
                DeleteTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTagNamespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "DeleteTagNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/DeleteTagNamespace");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTagNamespaceResponse>
                transformer =
                        DeleteTagNamespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>,
                        java.util.concurrent.Future<DeleteTagNamespaceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTagNamespaceRequest, DeleteTagNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse>
                    handler) {
        LOG.trace("Called async deleteUser");
        final DeleteUserRequest interceptedRequest = DeleteUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity", "DeleteUser", ib.getRequestUri().toString(), "");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserResponse>
                transformer =
                        DeleteUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserRequest, DeleteUserResponse>,
                        java.util.concurrent.Future<DeleteUserResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserRequest, DeleteUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableReplicationToRegionResponse> enableReplicationToRegion(
            EnableReplicationToRegionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableReplicationToRegionRequest, EnableReplicationToRegionResponse>
                    handler) {
        LOG.trace("Called async enableReplicationToRegion");
        final EnableReplicationToRegionRequest interceptedRequest =
                EnableReplicationToRegionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableReplicationToRegionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "EnableReplicationToRegion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/EnableReplicationToRegion");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableReplicationToRegionResponse>
                transformer =
                        EnableReplicationToRegionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableReplicationToRegionRequest, EnableReplicationToRegionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableReplicationToRegionRequest,
                                EnableReplicationToRegionResponse>,
                        java.util.concurrent.Future<EnableReplicationToRegionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableReplicationToRegionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableReplicationToRegionRequest, EnableReplicationToRegionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateTotpSeedResponse> generateTotpSeed(
            GenerateTotpSeedRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateTotpSeedRequest, GenerateTotpSeedResponse>
                    handler) {
        LOG.trace("Called async generateTotpSeed");
        final GenerateTotpSeedRequest interceptedRequest =
                GenerateTotpSeedConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateTotpSeedConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GenerateTotpSeed",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDevice/GenerateTotpSeed");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GenerateTotpSeedResponse>
                transformer =
                        GenerateTotpSeedConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GenerateTotpSeedRequest, GenerateTotpSeedResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateTotpSeedRequest, GenerateTotpSeedResponse>,
                        java.util.concurrent.Future<GenerateTotpSeedResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateTotpSeedRequest, GenerateTotpSeedResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuthenticationPolicyResponse> getAuthenticationPolicy(
            GetAuthenticationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>
                    handler) {
        LOG.trace("Called async getAuthenticationPolicy");
        final GetAuthenticationPolicyRequest interceptedRequest =
                GetAuthenticationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthenticationPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetAuthenticationPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthenticationPolicy/GetAuthenticationPolicy");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAuthenticationPolicyResponse>
                transformer =
                        GetAuthenticationPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>,
                        java.util.concurrent.Future<GetAuthenticationPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuthenticationPolicyRequest, GetAuthenticationPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            GetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompartmentRequest, GetCompartmentResponse>
                    handler) {
        LOG.trace("Called async getCompartment");
        final GetCompartmentRequest interceptedRequest =
                GetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/GetCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCompartmentResponse>
                transformer =
                        GetCompartmentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCompartmentRequest, GetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompartmentRequest, GetCompartmentResponse>,
                        java.util.concurrent.Future<GetCompartmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompartmentRequest, GetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDomainResponse> getDomain(
            GetDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDomainRequest, GetDomainResponse>
                    handler) {
        LOG.trace("Called async getDomain");
        final GetDomainRequest interceptedRequest = GetDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/GetDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDomainResponse>
                transformer =
                        GetDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDomainRequest, GetDomainResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetDomainRequest, GetDomainResponse>,
                        java.util.concurrent.Future<GetDomainResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDomainRequest, GetDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDynamicGroupResponse> getDynamicGroup(
            GetDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDynamicGroupRequest, GetDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async getDynamicGroup");
        final GetDynamicGroupRequest interceptedRequest =
                GetDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDynamicGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetDynamicGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/GetDynamicGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDynamicGroupResponse>
                transformer =
                        GetDynamicGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDynamicGroupRequest, GetDynamicGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDynamicGroupRequest, GetDynamicGroupResponse>,
                        java.util.concurrent.Future<GetDynamicGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDynamicGroupRequest, GetDynamicGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>
                    handler) {
        LOG.trace("Called async getGroup");
        final GetGroupRequest interceptedRequest = GetGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/GetGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetGroupResponse>
                transformer = GetGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>,
                        java.util.concurrent.Future<GetGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGroupRequest, GetGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIamWorkRequestResponse> getIamWorkRequest(
            GetIamWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIamWorkRequestRequest, GetIamWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getIamWorkRequest");
        final GetIamWorkRequestRequest interceptedRequest =
                GetIamWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIamWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetIamWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequest/GetIamWorkRequest");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetIamWorkRequestResponse>
                transformer =
                        GetIamWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIamWorkRequestRequest, GetIamWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIamWorkRequestRequest, GetIamWorkRequestResponse>,
                        java.util.concurrent.Future<GetIamWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIamWorkRequestRequest, GetIamWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async getIdentityProvider");
        final GetIdentityProviderRequest interceptedRequest =
                GetIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/GetIdentityProvider");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer =
                        GetIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIdentityProviderRequest, GetIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIdentityProviderRequest, GetIdentityProviderResponse>,
                        java.util.concurrent.Future<GetIdentityProviderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIdentityProviderRequest, GetIdentityProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            GetIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async getIdpGroupMapping");
        final GetIdpGroupMappingRequest interceptedRequest =
                GetIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetIdpGroupMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/GetIdpGroupMapping");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer =
                        GetIdpGroupMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>,
                        java.util.concurrent.Future<GetIdpGroupMappingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMfaTotpDeviceResponse> getMfaTotpDevice(
            GetMfaTotpDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>
                    handler) {
        LOG.trace("Called async getMfaTotpDevice");
        final GetMfaTotpDeviceRequest interceptedRequest =
                GetMfaTotpDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMfaTotpDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetMfaTotpDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/GetMfaTotpDevice");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMfaTotpDeviceResponse>
                transformer =
                        GetMfaTotpDeviceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>,
                        java.util.concurrent.Future<GetMfaTotpDeviceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMfaTotpDeviceRequest, GetMfaTotpDeviceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSourceResponse> getNetworkSource(
            GetNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkSourceRequest, GetNetworkSourceResponse>
                    handler) {
        LOG.trace("Called async getNetworkSource");
        final GetNetworkSourceRequest interceptedRequest =
                GetNetworkSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetNetworkSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/GetNetworkSource");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetNetworkSourceResponse>
                transformer =
                        GetNetworkSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNetworkSourceRequest, GetNetworkSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkSourceRequest, GetNetworkSourceResponse>,
                        java.util.concurrent.Future<GetNetworkSourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkSourceRequest, GetNetworkSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>
                    handler) {
        LOG.trace("Called async getPolicy");
        final GetPolicyRequest interceptedRequest = GetPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/GetPolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyResponse>
                transformer =
                        GetPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>,
                        java.util.concurrent.Future<GetPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPolicyRequest, GetPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStandardTagTemplateResponse> getStandardTagTemplate(
            GetStandardTagTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>
                    handler) {
        LOG.trace("Called async getStandardTagTemplate");
        final GetStandardTagTemplateRequest interceptedRequest =
                GetStandardTagTemplateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStandardTagTemplateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetStandardTagTemplate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/StandardTagNamespaceTemplate/GetStandardTagTemplate");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetStandardTagTemplateResponse>
                transformer =
                        GetStandardTagTemplateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>,
                        java.util.concurrent.Future<GetStandardTagTemplateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStandardTagTemplateRequest, GetStandardTagTemplateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTagResponse> getTag(
            GetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handler) {
        LOG.trace("Called async getTag");
        final GetTagRequest interceptedRequest = GetTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetTag",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/GetTag");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTagResponse>
                transformer = GetTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse>,
                        java.util.concurrent.Future<GetTagResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTagRequest, GetTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTagDefaultResponse> getTagDefault(
            GetTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTagDefaultRequest, GetTagDefaultResponse>
                    handler) {
        LOG.trace("Called async getTagDefault");
        final GetTagDefaultRequest interceptedRequest =
                GetTagDefaultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagDefaultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetTagDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/GetTagDefault");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTagDefaultResponse>
                transformer =
                        GetTagDefaultConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTagDefaultRequest, GetTagDefaultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTagDefaultRequest, GetTagDefaultResponse>,
                        java.util.concurrent.Future<GetTagDefaultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTagDefaultRequest, GetTagDefaultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTagNamespaceResponse> getTagNamespace(
            GetTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTagNamespaceRequest, GetTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async getTagNamespace");
        final GetTagNamespaceRequest interceptedRequest =
                GetTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagNamespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetTagNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/GetTagNamespace");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTagNamespaceResponse>
                transformer =
                        GetTagNamespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTagNamespaceRequest, GetTagNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTagNamespaceRequest, GetTagNamespaceResponse>,
                        java.util.concurrent.Future<GetTagNamespaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTagNamespaceRequest, GetTagNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTaggingWorkRequestResponse> getTaggingWorkRequest(
            GetTaggingWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getTaggingWorkRequest");
        final GetTaggingWorkRequestRequest interceptedRequest =
                GetTaggingWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaggingWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetTaggingWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequest/GetTaggingWorkRequest");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTaggingWorkRequestResponse>
                transformer =
                        GetTaggingWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>,
                        java.util.concurrent.Future<GetTaggingWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTaggingWorkRequestRequest, GetTaggingWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            GetTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse>
                    handler) {
        LOG.trace("Called async getTenancy");
        final GetTenancyRequest interceptedRequest = GetTenancyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTenancyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetTenancy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tenancy/GetTenancy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTenancyResponse>
                transformer =
                        GetTenancyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTenancyRequest, GetTenancyResponse>,
                        java.util.concurrent.Future<GetTenancyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTenancyRequest, GetTenancyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/GetUser");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse>
                transformer = GetUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse>,
                        java.util.concurrent.Future<GetUserResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserRequest, GetUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            GetUserGroupMembershipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler) {
        LOG.trace("Called async getUserGroupMembership");
        final GetUserGroupMembershipRequest interceptedRequest =
                GetUserGroupMembershipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserGroupMembershipConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetUserGroupMembership",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/GetUserGroupMembership");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserGroupMembershipResponse>
                transformer =
                        GetUserGroupMembershipConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>,
                        java.util.concurrent.Future<GetUserGroupMembershipResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserUIPasswordInformationResponse>
            getUserUIPasswordInformation(
                    GetUserUIPasswordInformationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserUIPasswordInformationRequest,
                                    GetUserUIPasswordInformationResponse>
                            handler) {
        LOG.trace("Called async getUserUIPasswordInformation");
        final GetUserUIPasswordInformationRequest interceptedRequest =
                GetUserUIPasswordInformationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserUIPasswordInformationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "GetUserUIPasswordInformation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UIPasswordInformation/GetUserUIPasswordInformation");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserUIPasswordInformationResponse>
                transformer =
                        GetUserUIPasswordInformationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserUIPasswordInformationRequest, GetUserUIPasswordInformationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserUIPasswordInformationRequest,
                                GetUserUIPasswordInformationResponse>,
                        java.util.concurrent.Future<GetUserUIPasswordInformationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserUIPasswordInformationRequest, GetUserUIPasswordInformationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Identity",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/WorkRequest/GetWorkRequest");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
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
    public java.util.concurrent.Future<ImportStandardTagsResponse> importStandardTags(
            ImportStandardTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportStandardTagsRequest, ImportStandardTagsResponse>
                    handler) {
        LOG.trace("Called async importStandardTags");
        final ImportStandardTagsRequest interceptedRequest =
                ImportStandardTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportStandardTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ImportStandardTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/ImportStandardTags");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ImportStandardTagsResponse>
                transformer =
                        ImportStandardTagsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ImportStandardTagsRequest, ImportStandardTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportStandardTagsRequest, ImportStandardTagsResponse>,
                        java.util.concurrent.Future<ImportStandardTagsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportStandardTagsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportStandardTagsRequest, ImportStandardTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAllowedDomainLicenseTypesResponse>
            listAllowedDomainLicenseTypes(
                    ListAllowedDomainLicenseTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAllowedDomainLicenseTypesRequest,
                                    ListAllowedDomainLicenseTypesResponse>
                            handler) {
        LOG.trace("Called async listAllowedDomainLicenseTypes");
        final ListAllowedDomainLicenseTypesRequest interceptedRequest =
                ListAllowedDomainLicenseTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAllowedDomainLicenseTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListAllowedDomainLicenseTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/ListAllowedDomainLicenseTypes");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAllowedDomainLicenseTypesResponse>
                transformer =
                        ListAllowedDomainLicenseTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAllowedDomainLicenseTypesRequest, ListAllowedDomainLicenseTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAllowedDomainLicenseTypesRequest,
                                ListAllowedDomainLicenseTypesResponse>,
                        java.util.concurrent.Future<ListAllowedDomainLicenseTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAllowedDomainLicenseTypesRequest, ListAllowedDomainLicenseTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {
        LOG.trace("Called async listApiKeys");
        final ListApiKeysRequest interceptedRequest =
                ListApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ApiKey/ListApiKeys");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer =
                        ListApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApiKeysRequest, ListApiKeysResponse>,
                        java.util.concurrent.Future<ListApiKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApiKeysRequest, ListApiKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>
                    handler) {
        LOG.trace("Called async listAuthTokens");
        final ListAuthTokensRequest interceptedRequest =
                ListAuthTokensConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthTokensConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/ListAuthTokens");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuthTokensResponse>
                transformer =
                        ListAuthTokensConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuthTokensRequest, ListAuthTokensResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuthTokensRequest, ListAuthTokensResponse>,
                        java.util.concurrent.Future<ListAuthTokensResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuthTokensRequest, ListAuthTokensResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            ListAvailabilityDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler) {
        LOG.trace("Called async listAvailabilityDomains");
        final ListAvailabilityDomainsRequest interceptedRequest =
                ListAvailabilityDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailabilityDomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListAvailabilityDomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AvailabilityDomain/ListAvailabilityDomains");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailabilityDomainsResponse>
                transformer =
                        ListAvailabilityDomainsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>,
                        java.util.concurrent.Future<ListAvailabilityDomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBulkActionResourceTypesResponse>
            listBulkActionResourceTypes(
                    ListBulkActionResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBulkActionResourceTypesRequest,
                                    ListBulkActionResourceTypesResponse>
                            handler) {
        LOG.trace("Called async listBulkActionResourceTypes");
        final ListBulkActionResourceTypesRequest interceptedRequest =
                ListBulkActionResourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBulkActionResourceTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListBulkActionResourceTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/BulkActionResourceTypeCollection/ListBulkActionResourceTypes");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBulkActionResourceTypesResponse>
                transformer =
                        ListBulkActionResourceTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBulkActionResourceTypesRequest, ListBulkActionResourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBulkActionResourceTypesRequest,
                                ListBulkActionResourceTypesResponse>,
                        java.util.concurrent.Future<ListBulkActionResourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBulkActionResourceTypesRequest, ListBulkActionResourceTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBulkEditTagsResourceTypesResponse>
            listBulkEditTagsResourceTypes(
                    ListBulkEditTagsResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBulkEditTagsResourceTypesRequest,
                                    ListBulkEditTagsResourceTypesResponse>
                            handler) {
        LOG.trace("Called async listBulkEditTagsResourceTypes");
        final ListBulkEditTagsResourceTypesRequest interceptedRequest =
                ListBulkEditTagsResourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBulkEditTagsResourceTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListBulkEditTagsResourceTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/BulkEditTagsResourceTypeCollection/ListBulkEditTagsResourceTypes");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBulkEditTagsResourceTypesResponse>
                transformer =
                        ListBulkEditTagsResourceTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBulkEditTagsResourceTypesRequest, ListBulkEditTagsResourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBulkEditTagsResourceTypesRequest,
                                ListBulkEditTagsResourceTypesResponse>,
                        java.util.concurrent.Future<ListBulkEditTagsResourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBulkEditTagsResourceTypesRequest, ListBulkEditTagsResourceTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            ListCompartmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCompartmentsRequest, ListCompartmentsResponse>
                    handler) {
        LOG.trace("Called async listCompartments");
        final ListCompartmentsRequest interceptedRequest =
                ListCompartmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompartmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListCompartments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/ListCompartments");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCompartmentsResponse>
                transformer =
                        ListCompartmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCompartmentsRequest, ListCompartmentsResponse>,
                        java.util.concurrent.Future<ListCompartmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCompartmentsRequest, ListCompartmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCostTrackingTagsResponse> listCostTrackingTags(
            ListCostTrackingTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>
                    handler) {
        LOG.trace("Called async listCostTrackingTags");
        final ListCostTrackingTagsRequest interceptedRequest =
                ListCostTrackingTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCostTrackingTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListCostTrackingTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/ListCostTrackingTags");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCostTrackingTagsResponse>
                transformer =
                        ListCostTrackingTagsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>,
                        java.util.concurrent.Future<ListCostTrackingTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler) {
        LOG.trace("Called async listCustomerSecretKeys");
        final ListCustomerSecretKeysRequest interceptedRequest =
                ListCustomerSecretKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKeySummary/ListCustomerSecretKeys");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>
                transformer =
                        ListCustomerSecretKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>,
                        java.util.concurrent.Future<ListCustomerSecretKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbCredentialsResponse> listDbCredentials(
            ListDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbCredentialsRequest, ListDbCredentialsResponse>
                    handler) {
        LOG.trace("Called async listDbCredentials");
        final ListDbCredentialsRequest interceptedRequest =
                ListDbCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListDbCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListDbCredentials");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbCredentialsResponse>
                transformer =
                        ListDbCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDbCredentialsRequest, ListDbCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbCredentialsRequest, ListDbCredentialsResponse>,
                        java.util.concurrent.Future<ListDbCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbCredentialsRequest, ListDbCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResponse> listDomains(
            ListDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDomainsRequest, ListDomainsResponse>
                    handler) {
        LOG.trace("Called async listDomains");
        final ListDomainsRequest interceptedRequest =
                ListDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListDomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DomainSummary/ListDomains");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDomainsResponse>
                transformer =
                        ListDomainsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDomainsRequest, ListDomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDomainsRequest, ListDomainsResponse>,
                        java.util.concurrent.Future<ListDomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDomainsRequest, ListDomainsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDynamicGroupsResponse> listDynamicGroups(
            ListDynamicGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                    handler) {
        LOG.trace("Called async listDynamicGroups");
        final ListDynamicGroupsRequest interceptedRequest =
                ListDynamicGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDynamicGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListDynamicGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/ListDynamicGroups");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDynamicGroupsResponse>
                transformer =
                        ListDynamicGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDynamicGroupsRequest, ListDynamicGroupsResponse>,
                        java.util.concurrent.Future<ListDynamicGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDynamicGroupsRequest, ListDynamicGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFaultDomainsResponse> listFaultDomains(
            ListFaultDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFaultDomainsRequest, ListFaultDomainsResponse>
                    handler) {
        LOG.trace("Called async listFaultDomains");
        final ListFaultDomainsRequest interceptedRequest =
                ListFaultDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFaultDomainsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListFaultDomains",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/FaultDomain/ListFaultDomains");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFaultDomainsResponse>
                transformer =
                        ListFaultDomainsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFaultDomainsRequest, ListFaultDomainsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFaultDomainsRequest, ListFaultDomainsResponse>,
                        java.util.concurrent.Future<ListFaultDomainsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFaultDomainsRequest, ListFaultDomainsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse>
                    handler) {
        LOG.trace("Called async listGroups");
        final ListGroupsRequest interceptedRequest = ListGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/ListGroups");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGroupsResponse>
                transformer =
                        ListGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGroupsRequest, ListGroupsResponse>,
                        java.util.concurrent.Future<ListGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGroupsRequest, ListGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestErrorsResponse> listIamWorkRequestErrors(
            ListIamWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listIamWorkRequestErrors");
        final ListIamWorkRequestErrorsRequest interceptedRequest =
                ListIamWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIamWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIamWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequest/ListIamWorkRequestErrors");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIamWorkRequestErrorsResponse>
                transformer =
                        ListIamWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListIamWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestLogsResponse> listIamWorkRequestLogs(
            ListIamWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listIamWorkRequestLogs");
        final ListIamWorkRequestLogsRequest interceptedRequest =
                ListIamWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIamWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIamWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequestLogSummary/ListIamWorkRequestLogs");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIamWorkRequestLogsResponse>
                transformer =
                        ListIamWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListIamWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIamWorkRequestsResponse> listIamWorkRequests(
            ListIamWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listIamWorkRequests");
        final ListIamWorkRequestsRequest interceptedRequest =
                ListIamWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIamWorkRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIamWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IamWorkRequestSummary/ListIamWorkRequests");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIamWorkRequestsResponse>
                transformer =
                        ListIamWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>,
                        java.util.concurrent.Future<ListIamWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProviderGroupsResponse>
            listIdentityProviderGroups(
                    ListIdentityProviderGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIdentityProviderGroupsRequest,
                                    ListIdentityProviderGroupsResponse>
                            handler) {
        LOG.trace("Called async listIdentityProviderGroups");
        final ListIdentityProviderGroupsRequest interceptedRequest =
                ListIdentityProviderGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProviderGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIdentityProviderGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProviderGroupSummary/ListIdentityProviderGroups");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdentityProviderGroupsResponse>
                transformer =
                        ListIdentityProviderGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdentityProviderGroupsRequest,
                                ListIdentityProviderGroupsResponse>,
                        java.util.concurrent.Future<ListIdentityProviderGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {
        LOG.trace("Called async listIdentityProviders");
        final ListIdentityProvidersRequest interceptedRequest =
                ListIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/ListIdentityProviders");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer =
                        ListIdentityProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdentityProvidersRequest, ListIdentityProvidersResponse>,
                        java.util.concurrent.Future<ListIdentityProvidersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdentityProvidersRequest, ListIdentityProvidersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            ListIdpGroupMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler) {
        LOG.trace("Called async listIdpGroupMappings");
        final ListIdpGroupMappingsRequest interceptedRequest =
                ListIdpGroupMappingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdpGroupMappingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListIdpGroupMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/ListIdpGroupMappings");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>
                transformer =
                        ListIdpGroupMappingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>,
                        java.util.concurrent.Future<ListIdpGroupMappingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMfaTotpDevicesResponse> listMfaTotpDevices(
            ListMfaTotpDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>
                    handler) {
        LOG.trace("Called async listMfaTotpDevices");
        final ListMfaTotpDevicesRequest interceptedRequest =
                ListMfaTotpDevicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMfaTotpDevicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListMfaTotpDevices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/MfaTotpDeviceSummary/ListMfaTotpDevices");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMfaTotpDevicesResponse>
                transformer =
                        ListMfaTotpDevicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>,
                        java.util.concurrent.Future<ListMfaTotpDevicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSourcesResponse> listNetworkSources(
            ListNetworkSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkSourcesRequest, ListNetworkSourcesResponse>
                    handler) {
        LOG.trace("Called async listNetworkSources");
        final ListNetworkSourcesRequest interceptedRequest =
                ListNetworkSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkSourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListNetworkSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSourcesSummary/ListNetworkSources");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListNetworkSourcesResponse>
                transformer =
                        ListNetworkSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListNetworkSourcesRequest, ListNetworkSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkSourcesRequest, ListNetworkSourcesResponse>,
                        java.util.concurrent.Future<ListNetworkSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkSourcesRequest, ListNetworkSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOAuthClientCredentialsResponse>
            listOAuthClientCredentials(
                    ListOAuthClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuthClientCredentialsRequest,
                                    ListOAuthClientCredentialsResponse>
                            handler) {
        LOG.trace("Called async listOAuthClientCredentials");
        final ListOAuthClientCredentialsRequest interceptedRequest =
                ListOAuthClientCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuthClientCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListOAuthClientCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListOAuthClientCredentials");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOAuthClientCredentialsResponse>
                transformer =
                        ListOAuthClientCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOAuthClientCredentialsRequest, ListOAuthClientCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOAuthClientCredentialsRequest,
                                ListOAuthClientCredentialsResponse>,
                        java.util.concurrent.Future<ListOAuthClientCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOAuthClientCredentialsRequest, ListOAuthClientCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/ListPolicies");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer =
                        ListPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPoliciesRequest, ListPoliciesResponse>,
                        java.util.concurrent.Future<ListPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPoliciesRequest, ListPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRegionSubscriptionsResponse> listRegionSubscriptions(
            ListRegionSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                    handler) {
        LOG.trace("Called async listRegionSubscriptions");
        final ListRegionSubscriptionsRequest interceptedRequest =
                ListRegionSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionSubscriptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListRegionSubscriptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/RegionSubscription/ListRegionSubscriptions");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListRegionSubscriptionsResponse>
                transformer =
                        ListRegionSubscriptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>,
                        java.util.concurrent.Future<ListRegionSubscriptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResponse> listRegions(
            ListRegionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                    handler) {
        LOG.trace("Called async listRegions");
        final ListRegionsRequest interceptedRequest =
                ListRegionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListRegions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Region/ListRegions");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer =
                        ListRegionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRegionsRequest, ListRegionsResponse>,
                        java.util.concurrent.Future<ListRegionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRegionsRequest, ListRegionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler) {
        LOG.trace("Called async listSmtpCredentials");
        final ListSmtpCredentialsRequest interceptedRequest =
                ListSmtpCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSmtpCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListSmtpCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredentialSummary/ListSmtpCredentials");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSmtpCredentialsResponse>
                transformer =
                        ListSmtpCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>,
                        java.util.concurrent.Future<ListSmtpCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStandardTagNamespacesResponse> listStandardTagNamespaces(
            ListStandardTagNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>
                    handler) {
        LOG.trace("Called async listStandardTagNamespaces");
        final ListStandardTagNamespacesRequest interceptedRequest =
                ListStandardTagNamespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStandardTagNamespacesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListStandardTagNamespaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/StandardTagNamespaceTemplateSummary/ListStandardTagNamespaces");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListStandardTagNamespacesResponse>
                transformer =
                        ListStandardTagNamespacesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStandardTagNamespacesRequest,
                                ListStandardTagNamespacesResponse>,
                        java.util.concurrent.Future<ListStandardTagNamespacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            ListSwiftPasswordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler) {
        LOG.trace("Called async listSwiftPasswords");
        final ListSwiftPasswordsRequest interceptedRequest =
                ListSwiftPasswordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSwiftPasswordsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListSwiftPasswords",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/ListSwiftPasswords");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSwiftPasswordsResponse>
                transformer =
                        ListSwiftPasswordsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>,
                        java.util.concurrent.Future<ListSwiftPasswordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagDefaultsResponse> listTagDefaults(
            ListTagDefaultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTagDefaultsRequest, ListTagDefaultsResponse>
                    handler) {
        LOG.trace("Called async listTagDefaults");
        final ListTagDefaultsRequest interceptedRequest =
                ListTagDefaultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagDefaultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTagDefaults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefaultSummary/ListTagDefaults");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagDefaultsResponse>
                transformer =
                        ListTagDefaultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTagDefaultsRequest, ListTagDefaultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTagDefaultsRequest, ListTagDefaultsResponse>,
                        java.util.concurrent.Future<ListTagDefaultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTagDefaultsRequest, ListTagDefaultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagNamespacesResponse> listTagNamespaces(
            ListTagNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>
                    handler) {
        LOG.trace("Called async listTagNamespaces");
        final ListTagNamespacesRequest interceptedRequest =
                ListTagNamespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagNamespacesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTagNamespaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespaceSummary/ListTagNamespaces");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagNamespacesResponse>
                transformer =
                        ListTagNamespacesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTagNamespacesRequest, ListTagNamespacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTagNamespacesRequest, ListTagNamespacesResponse>,
                        java.util.concurrent.Future<ListTagNamespacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTagNamespacesRequest, ListTagNamespacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestErrorsResponse>
            listTaggingWorkRequestErrors(
                    ListTaggingWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTaggingWorkRequestErrorsRequest,
                                    ListTaggingWorkRequestErrorsResponse>
                            handler) {
        LOG.trace("Called async listTaggingWorkRequestErrors");
        final ListTaggingWorkRequestErrorsRequest interceptedRequest =
                ListTaggingWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaggingWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTaggingWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestErrorSummary/ListTaggingWorkRequestErrors");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTaggingWorkRequestErrorsResponse>
                transformer =
                        ListTaggingWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTaggingWorkRequestErrorsRequest, ListTaggingWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaggingWorkRequestErrorsRequest,
                                ListTaggingWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListTaggingWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaggingWorkRequestErrorsRequest, ListTaggingWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestLogsResponse>
            listTaggingWorkRequestLogs(
                    ListTaggingWorkRequestLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTaggingWorkRequestLogsRequest,
                                    ListTaggingWorkRequestLogsResponse>
                            handler) {
        LOG.trace("Called async listTaggingWorkRequestLogs");
        final ListTaggingWorkRequestLogsRequest interceptedRequest =
                ListTaggingWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaggingWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTaggingWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestLogSummary/ListTaggingWorkRequestLogs");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTaggingWorkRequestLogsResponse>
                transformer =
                        ListTaggingWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTaggingWorkRequestLogsRequest, ListTaggingWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaggingWorkRequestLogsRequest,
                                ListTaggingWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListTaggingWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaggingWorkRequestLogsRequest, ListTaggingWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaggingWorkRequestsResponse> listTaggingWorkRequests(
            ListTaggingWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listTaggingWorkRequests");
        final ListTaggingWorkRequestsRequest interceptedRequest =
                ListTaggingWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaggingWorkRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTaggingWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TaggingWorkRequestSummary/ListTaggingWorkRequests");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTaggingWorkRequestsResponse>
                transformer =
                        ListTaggingWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>,
                        java.util.concurrent.Future<ListTaggingWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>
                    handler) {
        LOG.trace("Called async listTags");
        final ListTagsRequest interceptedRequest = ListTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagSummary/ListTags");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagsResponse>
                transformer = ListTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>,
                        java.util.concurrent.Future<ListTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTagsRequest, ListTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            ListUserGroupMembershipsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler) {
        LOG.trace("Called async listUserGroupMemberships");
        final ListUserGroupMembershipsRequest interceptedRequest =
                ListUserGroupMembershipsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserGroupMembershipsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListUserGroupMemberships",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/ListUserGroupMemberships");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
                transformer =
                        ListUserGroupMembershipsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>,
                        java.util.concurrent.Future<ListUserGroupMembershipsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        LOG.trace("Called async listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/ListUsers");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer =
                        ListUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>,
                        java.util.concurrent.Future<ListUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUsersRequest, ListUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Identity",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/WorkRequestSummary/ListWorkRequests");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
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
    public java.util.concurrent.Future<MoveCompartmentResponse> moveCompartment(
            MoveCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MoveCompartmentRequest, MoveCompartmentResponse>
                    handler) {
        LOG.trace("Called async moveCompartment");
        final MoveCompartmentRequest interceptedRequest =
                MoveCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MoveCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "MoveCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/MoveCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, MoveCompartmentResponse>
                transformer =
                        MoveCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<MoveCompartmentRequest, MoveCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MoveCompartmentRequest, MoveCompartmentResponse>,
                        java.util.concurrent.Future<MoveCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMoveCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MoveCompartmentRequest, MoveCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecoverCompartmentResponse> recoverCompartment(
            RecoverCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecoverCompartmentRequest, RecoverCompartmentResponse>
                    handler) {
        LOG.trace("Called async recoverCompartment");
        final RecoverCompartmentRequest interceptedRequest =
                RecoverCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecoverCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "RecoverCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/RecoverCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, RecoverCompartmentResponse>
                transformer =
                        RecoverCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RecoverCompartmentRequest, RecoverCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecoverCompartmentRequest, RecoverCompartmentResponse>,
                        java.util.concurrent.Future<RecoverCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecoverCompartmentRequest, RecoverCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveTagDefaultLockResponse> removeTagDefaultLock(
            RemoveTagDefaultLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>
                    handler) {
        LOG.trace("Called async removeTagDefaultLock");
        final RemoveTagDefaultLockRequest interceptedRequest =
                RemoveTagDefaultLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveTagDefaultLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "RemoveTagDefaultLock",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/RemoveTagDefaultLock");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveTagDefaultLockResponse>
                transformer =
                        RemoveTagDefaultLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>,
                        java.util.concurrent.Future<RemoveTagDefaultLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveTagDefaultLockRequest, RemoveTagDefaultLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveTagNamespaceLockResponse> removeTagNamespaceLock(
            RemoveTagNamespaceLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>
                    handler) {
        LOG.trace("Called async removeTagNamespaceLock");
        final RemoveTagNamespaceLockRequest interceptedRequest =
                RemoveTagNamespaceLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveTagNamespaceLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "RemoveTagNamespaceLock",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/RemoveTagNamespaceLock");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveTagNamespaceLockResponse>
                transformer =
                        RemoveTagNamespaceLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>,
                        java.util.concurrent.Future<RemoveTagNamespaceLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveTagNamespaceLockRequest, RemoveTagNamespaceLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            RemoveUserFromGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler) {
        LOG.trace("Called async removeUserFromGroup");
        final RemoveUserFromGroupRequest interceptedRequest =
                RemoveUserFromGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveUserFromGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "RemoveUserFromGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/UserGroupMembership/RemoveUserFromGroup");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveUserFromGroupResponse>
                transformer =
                        RemoveUserFromGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>,
                        java.util.concurrent.Future<RemoveUserFromGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResetIdpScimClientResponse> resetIdpScimClient(
            ResetIdpScimClientRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetIdpScimClientRequest, ResetIdpScimClientResponse>
                    handler) {
        LOG.trace("Called async resetIdpScimClient");
        final ResetIdpScimClientRequest interceptedRequest =
                ResetIdpScimClientConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetIdpScimClientConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "ResetIdpScimClient",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ScimClientCredentials/ResetIdpScimClient");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ResetIdpScimClientResponse>
                transformer =
                        ResetIdpScimClientConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResetIdpScimClientRequest, ResetIdpScimClientResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetIdpScimClientRequest, ResetIdpScimClientResponse>,
                        java.util.concurrent.Future<ResetIdpScimClientResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetIdpScimClientRequest, ResetIdpScimClientResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthTokenResponse> updateAuthToken(
            UpdateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                    handler) {
        LOG.trace("Called async updateAuthToken");
        final UpdateAuthTokenRequest interceptedRequest =
                UpdateAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthToken/UpdateAuthToken");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuthTokenResponse>
                transformer =
                        UpdateAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuthTokenRequest, UpdateAuthTokenResponse>,
                        java.util.concurrent.Future<UpdateAuthTokenResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuthTokenDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuthTokenRequest, UpdateAuthTokenResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthenticationPolicyResponse>
            updateAuthenticationPolicy(
                    UpdateAuthenticationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuthenticationPolicyRequest,
                                    UpdateAuthenticationPolicyResponse>
                            handler) {
        LOG.trace("Called async updateAuthenticationPolicy");
        final UpdateAuthenticationPolicyRequest interceptedRequest =
                UpdateAuthenticationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuthenticationPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateAuthenticationPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/AuthenticationPolicy/UpdateAuthenticationPolicy");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAuthenticationPolicyResponse>
                transformer =
                        UpdateAuthenticationPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAuthenticationPolicyRequest, UpdateAuthenticationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuthenticationPolicyRequest,
                                UpdateAuthenticationPolicyResponse>,
                        java.util.concurrent.Future<UpdateAuthenticationPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuthenticationPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuthenticationPolicyRequest, UpdateAuthenticationPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            UpdateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler) {
        LOG.trace("Called async updateCompartment");
        final UpdateCompartmentRequest interceptedRequest =
                UpdateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Compartment/UpdateCompartment");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCompartmentResponse>
                transformer =
                        UpdateCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCompartmentRequest, UpdateCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCompartmentRequest, UpdateCompartmentResponse>,
                        java.util.concurrent.Future<UpdateCompartmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCompartmentRequest, UpdateCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomerSecretKeyResponse> updateCustomerSecretKey(
            UpdateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async updateCustomerSecretKey");
        final UpdateCustomerSecretKeyRequest interceptedRequest =
                UpdateCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/CustomerSecretKeySummary/UpdateCustomerSecretKey");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCustomerSecretKeyResponse>
                transformer =
                        UpdateCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<UpdateCustomerSecretKeyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCustomerSecretKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResponse> updateDomain(
            UpdateDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDomainRequest, UpdateDomainResponse>
                    handler) {
        LOG.trace("Called async updateDomain");
        final UpdateDomainRequest interceptedRequest =
                UpdateDomainConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDomainConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateDomain",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Domain/UpdateDomain");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDomainResponse>
                transformer =
                        UpdateDomainConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDomainRequest, UpdateDomainResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDomainRequest, UpdateDomainResponse>,
                        java.util.concurrent.Future<UpdateDomainResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDomainDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDomainRequest, UpdateDomainResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDynamicGroupResponse> updateDynamicGroup(
            UpdateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async updateDynamicGroup");
        final UpdateDynamicGroupRequest interceptedRequest =
                UpdateDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDynamicGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateDynamicGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/DynamicGroup/UpdateDynamicGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDynamicGroupResponse>
                transformer =
                        UpdateDynamicGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>,
                        java.util.concurrent.Future<UpdateDynamicGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDynamicGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                    handler) {
        LOG.trace("Called async updateGroup");
        final UpdateGroupRequest interceptedRequest =
                UpdateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Group/UpdateGroup");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer =
                        UpdateGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGroupRequest, UpdateGroupResponse>,
                        java.util.concurrent.Future<UpdateGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGroupRequest, UpdateGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            UpdateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async updateIdentityProvider");
        final UpdateIdentityProviderRequest interceptedRequest =
                UpdateIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdentityProvider/UpdateIdentityProvider");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIdentityProviderResponse>
                transformer =
                        UpdateIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>,
                        java.util.concurrent.Future<UpdateIdentityProviderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIdentityProviderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            UpdateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async updateIdpGroupMapping");
        final UpdateIdpGroupMappingRequest interceptedRequest =
                UpdateIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateIdpGroupMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/IdpGroupMapping/UpdateIdpGroupMapping");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIdpGroupMappingResponse>
                transformer =
                        UpdateIdpGroupMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>,
                        java.util.concurrent.Future<UpdateIdpGroupMappingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIdpGroupMappingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSourceResponse> updateNetworkSource(
            UpdateNetworkSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>
                    handler) {
        LOG.trace("Called async updateNetworkSource");
        final UpdateNetworkSourceRequest interceptedRequest =
                UpdateNetworkSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateNetworkSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/NetworkSources/UpdateNetworkSource");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSourceResponse>
                transformer =
                        UpdateNetworkSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>,
                        java.util.concurrent.Future<UpdateNetworkSourceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkSourceRequest, UpdateNetworkSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOAuthClientCredentialResponse>
            updateOAuthClientCredential(
                    UpdateOAuthClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOAuthClientCredentialRequest,
                                    UpdateOAuthClientCredentialResponse>
                            handler) {
        LOG.trace("Called async updateOAuthClientCredential");
        final UpdateOAuthClientCredentialRequest interceptedRequest =
                UpdateOAuthClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOAuthClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateOAuthClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateOAuthClientCredential");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOAuthClientCredentialResponse>
                transformer =
                        UpdateOAuthClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOAuthClientCredentialRequest, UpdateOAuthClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOAuthClientCredentialRequest,
                                UpdateOAuthClientCredentialResponse>,
                        java.util.concurrent.Future<UpdateOAuthClientCredentialResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOAuth2ClientCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOAuthClientCredentialRequest, UpdateOAuthClientCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            UpdatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler) {
        LOG.trace("Called async updatePolicy");
        final UpdatePolicyRequest interceptedRequest =
                UpdatePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdatePolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Policy/UpdatePolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyResponse>
                transformer =
                        UpdatePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePolicyRequest, UpdatePolicyResponse>,
                        java.util.concurrent.Future<UpdatePolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePolicyRequest, UpdatePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSmtpCredentialResponse> updateSmtpCredential(
            UpdateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async updateSmtpCredential");
        final UpdateSmtpCredentialRequest interceptedRequest =
                UpdateSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SmtpCredentialSummary/UpdateSmtpCredential");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSmtpCredentialResponse>
                transformer =
                        UpdateSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>,
                        java.util.concurrent.Future<UpdateSmtpCredentialResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSmtpCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            UpdateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async updateSwiftPassword");
        final UpdateSwiftPasswordRequest interceptedRequest =
                UpdateSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateSwiftPassword",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/SwiftPassword/UpdateSwiftPassword");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>
                transformer =
                        UpdateSwiftPasswordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>,
                        java.util.concurrent.Future<UpdateSwiftPasswordResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSwiftPasswordDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTagResponse> updateTag(
            UpdateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse>
                    handler) {
        LOG.trace("Called async updateTag");
        final UpdateTagRequest interceptedRequest = UpdateTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateTag",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/Tag/UpdateTag");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagResponse>
                transformer =
                        UpdateTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse>,
                        java.util.concurrent.Future<UpdateTagResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTagRequest, UpdateTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTagDefaultResponse> updateTagDefault(
            UpdateTagDefaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagDefaultRequest, UpdateTagDefaultResponse>
                    handler) {
        LOG.trace("Called async updateTagDefault");
        final UpdateTagDefaultRequest interceptedRequest =
                UpdateTagDefaultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagDefaultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateTagDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagDefault/UpdateTagDefault");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagDefaultResponse>
                transformer =
                        UpdateTagDefaultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTagDefaultRequest, UpdateTagDefaultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTagDefaultRequest, UpdateTagDefaultResponse>,
                        java.util.concurrent.Future<UpdateTagDefaultResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTagDefaultDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTagDefaultRequest, UpdateTagDefaultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTagNamespaceResponse> updateTagNamespace(
            UpdateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async updateTagNamespace");
        final UpdateTagNamespaceRequest interceptedRequest =
                UpdateTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagNamespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateTagNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/TagNamespace/UpdateTagNamespace");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagNamespaceResponse>
                transformer =
                        UpdateTagNamespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>,
                        java.util.concurrent.Future<UpdateTagNamespaceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTagNamespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResponse> updateUser(
            UpdateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse>
                    handler) {
        LOG.trace("Called async updateUser");
        final UpdateUserRequest interceptedRequest = UpdateUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUser");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserResponse>
                transformer =
                        UpdateUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserRequest, UpdateUserResponse>,
                        java.util.concurrent.Future<UpdateUserResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserRequest, UpdateUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserCapabilitiesResponse> updateUserCapabilities(
            UpdateUserCapabilitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>
                    handler) {
        LOG.trace("Called async updateUserCapabilities");
        final UpdateUserCapabilitiesRequest interceptedRequest =
                UpdateUserCapabilitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserCapabilitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateUserCapabilities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUserCapabilities");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateUserCapabilitiesResponse>
                transformer =
                        UpdateUserCapabilitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>,
                        java.util.concurrent.Future<UpdateUserCapabilitiesResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUserCapabilitiesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserCapabilitiesRequest, UpdateUserCapabilitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            UpdateUserStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserStateRequest, UpdateUserStateResponse>
                    handler) {
        LOG.trace("Called async updateUserState");
        final UpdateUserStateRequest interceptedRequest =
                UpdateUserStateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserStateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UpdateUserState",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/User/UpdateUserState");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserStateResponse>
                transformer =
                        UpdateUserStateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserStateRequest, UpdateUserStateResponse>,
                        java.util.concurrent.Future<UpdateUserStateResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateStateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserStateRequest, UpdateUserStateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            UploadApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler) {
        LOG.trace("Called async uploadApiKey");
        final UploadApiKeyRequest interceptedRequest =
                UploadApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Identity",
                        "UploadApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity/20160918/ApiKey/UploadApiKey");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UploadApiKeyResponse>
                transformer =
                        UploadApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadApiKeyRequest, UploadApiKeyResponse>,
                        java.util.concurrent.Future<UploadApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateApiKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadApiKeyRequest, UploadApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
