/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.internal.http.*;
import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for ApmSynthetic service. <br/>
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
public class ApmSyntheticAsyncClient implements ApmSyntheticAsync {
    /**
     * Service instance for ApmSynthetic.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APMSYNTHETIC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://apm-synthetic.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApmSyntheticAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ApmSyntheticAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
    public ApmSyntheticAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApmSyntheticAsyncClient> {
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
        public ApmSyntheticAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ApmSyntheticAsyncClient(
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
    public java.util.concurrent.Future<CreateDedicatedVantagePointResponse>
            createDedicatedVantagePoint(
                    CreateDedicatedVantagePointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDedicatedVantagePointRequest,
                                    CreateDedicatedVantagePointResponse>
                            handler) {
        LOG.trace("Called async createDedicatedVantagePoint");
        final CreateDedicatedVantagePointRequest interceptedRequest =
                CreateDedicatedVantagePointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDedicatedVantagePointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDedicatedVantagePointResponse>
                transformer = CreateDedicatedVantagePointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "CreateDedicatedVantagePoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/CreateDedicatedVantagePoint");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDedicatedVantagePointRequest, CreateDedicatedVantagePointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDedicatedVantagePointRequest,
                                CreateDedicatedVantagePointResponse>,
                        java.util.concurrent.Future<CreateDedicatedVantagePointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDedicatedVantagePointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDedicatedVantagePointRequest, CreateDedicatedVantagePointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResponse> createMonitor(
            CreateMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMonitorRequest, CreateMonitorResponse>
                    handler) {
        LOG.trace("Called async createMonitor");
        final CreateMonitorRequest interceptedRequest =
                CreateMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMonitorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateMonitorResponse>
                transformer = CreateMonitorConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "CreateMonitor",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/CreateMonitor");

        com.oracle.bmc.responses.AsyncHandler<CreateMonitorRequest, CreateMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMonitorRequest, CreateMonitorResponse>,
                        java.util.concurrent.Future<CreateMonitorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMonitorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMonitorRequest, CreateMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateScriptResponse> createScript(
            CreateScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateScriptRequest, CreateScriptResponse>
                    handler) {
        LOG.trace("Called async createScript");
        final CreateScriptRequest interceptedRequest =
                CreateScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateScriptResponse>
                transformer = CreateScriptConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "CreateScript",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/CreateScript");

        com.oracle.bmc.responses.AsyncHandler<CreateScriptRequest, CreateScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateScriptRequest, CreateScriptResponse>,
                        java.util.concurrent.Future<CreateScriptResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateScriptDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateScriptRequest, CreateScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedVantagePointResponse>
            deleteDedicatedVantagePoint(
                    DeleteDedicatedVantagePointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDedicatedVantagePointRequest,
                                    DeleteDedicatedVantagePointResponse>
                            handler) {
        LOG.trace("Called async deleteDedicatedVantagePoint");
        final DeleteDedicatedVantagePointRequest interceptedRequest =
                DeleteDedicatedVantagePointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDedicatedVantagePointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDedicatedVantagePointResponse>
                transformer = DeleteDedicatedVantagePointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "DeleteDedicatedVantagePoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/DeleteDedicatedVantagePoint");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDedicatedVantagePointRequest, DeleteDedicatedVantagePointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDedicatedVantagePointRequest,
                                DeleteDedicatedVantagePointResponse>,
                        java.util.concurrent.Future<DeleteDedicatedVantagePointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDedicatedVantagePointRequest, DeleteDedicatedVantagePointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResponse> deleteMonitor(
            DeleteMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResponse>
                    handler) {
        LOG.trace("Called async deleteMonitor");
        final DeleteMonitorRequest interceptedRequest =
                DeleteMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMonitorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteMonitorResponse>
                transformer = DeleteMonitorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "DeleteMonitor",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/DeleteMonitor");

        com.oracle.bmc.responses.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMonitorRequest, DeleteMonitorResponse>,
                        java.util.concurrent.Future<DeleteMonitorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMonitorRequest, DeleteMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteScriptResponse> deleteScript(
            DeleteScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteScriptRequest, DeleteScriptResponse>
                    handler) {
        LOG.trace("Called async deleteScript");
        final DeleteScriptRequest interceptedRequest =
                DeleteScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteScriptResponse>
                transformer = DeleteScriptConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "DeleteScript",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/DeleteScript");

        com.oracle.bmc.responses.AsyncHandler<DeleteScriptRequest, DeleteScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteScriptRequest, DeleteScriptResponse>,
                        java.util.concurrent.Future<DeleteScriptResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteScriptRequest, DeleteScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedVantagePointResponse> getDedicatedVantagePoint(
            GetDedicatedVantagePointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVantagePointRequest, GetDedicatedVantagePointResponse>
                    handler) {
        LOG.trace("Called async getDedicatedVantagePoint");
        final GetDedicatedVantagePointRequest interceptedRequest =
                GetDedicatedVantagePointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDedicatedVantagePointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDedicatedVantagePointResponse>
                transformer = GetDedicatedVantagePointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "GetDedicatedVantagePoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/GetDedicatedVantagePoint");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDedicatedVantagePointRequest, GetDedicatedVantagePointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDedicatedVantagePointRequest, GetDedicatedVantagePointResponse>,
                        java.util.concurrent.Future<GetDedicatedVantagePointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDedicatedVantagePointRequest, GetDedicatedVantagePointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResponse> getMonitor(
            GetMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMonitorRequest, GetMonitorResponse>
                    handler) {
        LOG.trace("Called async getMonitor");
        final GetMonitorRequest interceptedRequest = GetMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMonitorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMonitorResponse>
                transformer = GetMonitorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "GetMonitor",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/GetMonitor");

        com.oracle.bmc.responses.AsyncHandler<GetMonitorRequest, GetMonitorResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMonitorRequest, GetMonitorResponse>,
                        java.util.concurrent.Future<GetMonitorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMonitorRequest, GetMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResultResponse> getMonitorResult(
            GetMonitorResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitorResultRequest, GetMonitorResultResponse>
                    handler) {
        LOG.trace("Called async getMonitorResult");
        final GetMonitorResultRequest interceptedRequest =
                GetMonitorResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMonitorResultConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMonitorResultResponse>
                transformer = GetMonitorResultConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "GetMonitorResult",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/MonitorResult/GetMonitorResult");

        com.oracle.bmc.responses.AsyncHandler<GetMonitorResultRequest, GetMonitorResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMonitorResultRequest, GetMonitorResultResponse>,
                        java.util.concurrent.Future<GetMonitorResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMonitorResultRequest, GetMonitorResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetScriptResponse> getScript(
            GetScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetScriptRequest, GetScriptResponse>
                    handler) {
        LOG.trace("Called async getScript");
        final GetScriptRequest interceptedRequest = GetScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetScriptResponse>
                transformer = GetScriptConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "GetScript",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/GetScript");

        com.oracle.bmc.responses.AsyncHandler<GetScriptRequest, GetScriptResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetScriptRequest, GetScriptResponse>,
                        java.util.concurrent.Future<GetScriptResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScriptRequest, GetScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedVantagePointsResponse>
            listDedicatedVantagePoints(
                    ListDedicatedVantagePointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVantagePointsRequest,
                                    ListDedicatedVantagePointsResponse>
                            handler) {
        LOG.trace("Called async listDedicatedVantagePoints");
        final ListDedicatedVantagePointsRequest interceptedRequest =
                ListDedicatedVantagePointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVantagePointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDedicatedVantagePointsResponse>
                transformer = ListDedicatedVantagePointsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "ListDedicatedVantagePoints",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePointCollection/ListDedicatedVantagePoints");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVantagePointsRequest,
                                ListDedicatedVantagePointsResponse>,
                        java.util.concurrent.Future<ListDedicatedVantagePointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResponse> listMonitors(
            ListMonitorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMonitorsRequest, ListMonitorsResponse>
                    handler) {
        LOG.trace("Called async listMonitors");
        final ListMonitorsRequest interceptedRequest =
                ListMonitorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMonitorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMonitorsResponse>
                transformer = ListMonitorsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "ListMonitors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/MonitorCollection/ListMonitors");

        com.oracle.bmc.responses.AsyncHandler<ListMonitorsRequest, ListMonitorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMonitorsRequest, ListMonitorsResponse>,
                        java.util.concurrent.Future<ListMonitorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMonitorsRequest, ListMonitorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPublicVantagePointsResponse> listPublicVantagePoints(
            ListPublicVantagePointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>
                    handler) {
        LOG.trace("Called async listPublicVantagePoints");
        final ListPublicVantagePointsRequest interceptedRequest =
                ListPublicVantagePointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublicVantagePointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPublicVantagePointsResponse>
                transformer = ListPublicVantagePointsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "ListPublicVantagePoints",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/PublicVantagePointCollection/ListPublicVantagePoints");

        com.oracle.bmc.responses.AsyncHandler<
                        ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>,
                        java.util.concurrent.Future<ListPublicVantagePointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListScriptsResponse> listScripts(
            ListScriptsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListScriptsRequest, ListScriptsResponse>
                    handler) {
        LOG.trace("Called async listScripts");
        final ListScriptsRequest interceptedRequest =
                ListScriptsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScriptsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListScriptsResponse>
                transformer = ListScriptsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "ListScripts",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/ScriptCollection/ListScripts");

        com.oracle.bmc.responses.AsyncHandler<ListScriptsRequest, ListScriptsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScriptsRequest, ListScriptsResponse>,
                        java.util.concurrent.Future<ListScriptsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScriptsRequest, ListScriptsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDedicatedVantagePointResponse>
            updateDedicatedVantagePoint(
                    UpdateDedicatedVantagePointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDedicatedVantagePointRequest,
                                    UpdateDedicatedVantagePointResponse>
                            handler) {
        LOG.trace("Called async updateDedicatedVantagePoint");
        final UpdateDedicatedVantagePointRequest interceptedRequest =
                UpdateDedicatedVantagePointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDedicatedVantagePointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDedicatedVantagePointResponse>
                transformer = UpdateDedicatedVantagePointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "UpdateDedicatedVantagePoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/UpdateDedicatedVantagePoint");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDedicatedVantagePointRequest, UpdateDedicatedVantagePointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDedicatedVantagePointRequest,
                                UpdateDedicatedVantagePointResponse>,
                        java.util.concurrent.Future<UpdateDedicatedVantagePointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDedicatedVantagePointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDedicatedVantagePointRequest, UpdateDedicatedVantagePointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResponse> updateMonitor(
            UpdateMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResponse>
                    handler) {
        LOG.trace("Called async updateMonitor");
        final UpdateMonitorRequest interceptedRequest =
                UpdateMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMonitorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateMonitorResponse>
                transformer = UpdateMonitorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "UpdateMonitor",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/UpdateMonitor");

        com.oracle.bmc.responses.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMonitorRequest, UpdateMonitorResponse>,
                        java.util.concurrent.Future<UpdateMonitorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMonitorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMonitorRequest, UpdateMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateScriptResponse> updateScript(
            UpdateScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateScriptRequest, UpdateScriptResponse>
                    handler) {
        LOG.trace("Called async updateScript");
        final UpdateScriptRequest interceptedRequest =
                UpdateScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateScriptResponse>
                transformer = UpdateScriptConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "ApmSynthetic",
                "UpdateScript",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/UpdateScript");

        com.oracle.bmc.responses.AsyncHandler<UpdateScriptRequest, UpdateScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateScriptRequest, UpdateScriptResponse>,
                        java.util.concurrent.Future<UpdateScriptResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateScriptDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateScriptRequest, UpdateScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
