/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.announcementsservice.internal.http.*;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

/**
 * Async client implementation for AnnouncementSubscription service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.extern.slf4j.Slf4j
public class AnnouncementSubscriptionAsyncClient implements AnnouncementSubscriptionAsync {
    /**
     * Service instance for AnnouncementSubscription.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANNOUNCEMENTSUBSCRIPTION")
                    .serviceEndpointPrefix("announcements")
                    .serviceEndpointTemplate(
                            "https://announcements.{region}.oci.{secondLevelDomain}")
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
    public AnnouncementSubscriptionAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, AnnouncementSubscriptionAsyncClient> {
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
        public AnnouncementSubscriptionAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new AnnouncementSubscriptionAsyncClient(
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
    public java.util.concurrent.Future<ChangeAnnouncementSubscriptionCompartmentResponse>
            changeAnnouncementSubscriptionCompartment(
                    ChangeAnnouncementSubscriptionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAnnouncementSubscriptionCompartmentRequest,
                                    ChangeAnnouncementSubscriptionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAnnouncementSubscriptionCompartment");
        final ChangeAnnouncementSubscriptionCompartmentRequest interceptedRequest =
                ChangeAnnouncementSubscriptionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAnnouncementSubscriptionCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeAnnouncementSubscriptionCompartmentResponse>
                transformer = ChangeAnnouncementSubscriptionCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "ChangeAnnouncementSubscriptionCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/ChangeAnnouncementSubscriptionCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAnnouncementSubscriptionCompartmentRequest,
                        ChangeAnnouncementSubscriptionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAnnouncementSubscriptionCompartmentRequest,
                                ChangeAnnouncementSubscriptionCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeAnnouncementSubscriptionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeAnnouncementSubscriptionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAnnouncementSubscriptionCompartmentRequest,
                    ChangeAnnouncementSubscriptionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAnnouncementSubscriptionResponse>
            createAnnouncementSubscription(
                    CreateAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAnnouncementSubscriptionRequest,
                                    CreateAnnouncementSubscriptionResponse>
                            handler) {
        LOG.trace("Called async createAnnouncementSubscription");
        final CreateAnnouncementSubscriptionRequest interceptedRequest =
                CreateAnnouncementSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAnnouncementSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAnnouncementSubscriptionResponse>
                transformer = CreateAnnouncementSubscriptionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "CreateAnnouncementSubscription",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/CreateAnnouncementSubscription");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAnnouncementSubscriptionRequest,
                        CreateAnnouncementSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAnnouncementSubscriptionRequest,
                                CreateAnnouncementSubscriptionResponse>,
                        java.util.concurrent.Future<CreateAnnouncementSubscriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAnnouncementSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAnnouncementSubscriptionRequest, CreateAnnouncementSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFilterGroupResponse> createFilterGroup(
            CreateFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFilterGroupRequest, CreateFilterGroupResponse>
                    handler) {
        LOG.trace("Called async createFilterGroup");
        final CreateFilterGroupRequest interceptedRequest =
                CreateFilterGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFilterGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateFilterGroupResponse>
                transformer = CreateFilterGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "CreateFilterGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/CreateFilterGroup");

        com.oracle.bmc.responses.AsyncHandler<CreateFilterGroupRequest, CreateFilterGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFilterGroupRequest, CreateFilterGroupResponse>,
                        java.util.concurrent.Future<CreateFilterGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFilterGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFilterGroupRequest, CreateFilterGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnouncementSubscriptionResponse>
            deleteAnnouncementSubscription(
                    DeleteAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAnnouncementSubscriptionRequest,
                                    DeleteAnnouncementSubscriptionResponse>
                            handler) {
        LOG.trace("Called async deleteAnnouncementSubscription");
        final DeleteAnnouncementSubscriptionRequest interceptedRequest =
                DeleteAnnouncementSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAnnouncementSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAnnouncementSubscriptionResponse>
                transformer = DeleteAnnouncementSubscriptionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "DeleteAnnouncementSubscription",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/DeleteAnnouncementSubscription");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAnnouncementSubscriptionRequest,
                        DeleteAnnouncementSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAnnouncementSubscriptionRequest,
                                DeleteAnnouncementSubscriptionResponse>,
                        java.util.concurrent.Future<DeleteAnnouncementSubscriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAnnouncementSubscriptionRequest, DeleteAnnouncementSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterGroupResponse> deleteFilterGroup(
            DeleteFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFilterGroupRequest, DeleteFilterGroupResponse>
                    handler) {
        LOG.trace("Called async deleteFilterGroup");
        final DeleteFilterGroupRequest interceptedRequest =
                DeleteFilterGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFilterGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFilterGroupResponse>
                transformer = DeleteFilterGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "DeleteFilterGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/DeleteFilterGroup");

        com.oracle.bmc.responses.AsyncHandler<DeleteFilterGroupRequest, DeleteFilterGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFilterGroupRequest, DeleteFilterGroupResponse>,
                        java.util.concurrent.Future<DeleteFilterGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFilterGroupRequest, DeleteFilterGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAnnouncementSubscriptionResponse>
            getAnnouncementSubscription(
                    GetAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAnnouncementSubscriptionRequest,
                                    GetAnnouncementSubscriptionResponse>
                            handler) {
        LOG.trace("Called async getAnnouncementSubscription");
        final GetAnnouncementSubscriptionRequest interceptedRequest =
                GetAnnouncementSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAnnouncementSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAnnouncementSubscriptionResponse>
                transformer = GetAnnouncementSubscriptionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "GetAnnouncementSubscription",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/GetAnnouncementSubscription");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAnnouncementSubscriptionRequest, GetAnnouncementSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAnnouncementSubscriptionRequest,
                                GetAnnouncementSubscriptionResponse>,
                        java.util.concurrent.Future<GetAnnouncementSubscriptionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAnnouncementSubscriptionRequest, GetAnnouncementSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAnnouncementSubscriptionsResponse>
            listAnnouncementSubscriptions(
                    ListAnnouncementSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAnnouncementSubscriptionsRequest,
                                    ListAnnouncementSubscriptionsResponse>
                            handler) {
        LOG.trace("Called async listAnnouncementSubscriptions");
        final ListAnnouncementSubscriptionsRequest interceptedRequest =
                ListAnnouncementSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAnnouncementSubscriptionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAnnouncementSubscriptionsResponse>
                transformer = ListAnnouncementSubscriptionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "ListAnnouncementSubscriptions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscriptionCollection/ListAnnouncementSubscriptions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAnnouncementSubscriptionsRequest, ListAnnouncementSubscriptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAnnouncementSubscriptionsRequest,
                                ListAnnouncementSubscriptionsResponse>,
                        java.util.concurrent.Future<ListAnnouncementSubscriptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAnnouncementSubscriptionsRequest, ListAnnouncementSubscriptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnouncementSubscriptionResponse>
            updateAnnouncementSubscription(
                    UpdateAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAnnouncementSubscriptionRequest,
                                    UpdateAnnouncementSubscriptionResponse>
                            handler) {
        LOG.trace("Called async updateAnnouncementSubscription");
        final UpdateAnnouncementSubscriptionRequest interceptedRequest =
                UpdateAnnouncementSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAnnouncementSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAnnouncementSubscriptionResponse>
                transformer = UpdateAnnouncementSubscriptionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "UpdateAnnouncementSubscription",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/UpdateAnnouncementSubscription");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAnnouncementSubscriptionRequest,
                        UpdateAnnouncementSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAnnouncementSubscriptionRequest,
                                UpdateAnnouncementSubscriptionResponse>,
                        java.util.concurrent.Future<UpdateAnnouncementSubscriptionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAnnouncementSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAnnouncementSubscriptionRequest, UpdateAnnouncementSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterGroupResponse> updateFilterGroup(
            UpdateFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFilterGroupRequest, UpdateFilterGroupResponse>
                    handler) {
        LOG.trace("Called async updateFilterGroup");
        final UpdateFilterGroupRequest interceptedRequest =
                UpdateFilterGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFilterGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateFilterGroupResponse>
                transformer = UpdateFilterGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "AnnouncementSubscription",
                "UpdateFilterGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/UpdateFilterGroup");

        com.oracle.bmc.responses.AsyncHandler<UpdateFilterGroupRequest, UpdateFilterGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFilterGroupRequest, UpdateFilterGroupResponse>,
                        java.util.concurrent.Future<UpdateFilterGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFilterGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFilterGroupRequest, UpdateFilterGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
