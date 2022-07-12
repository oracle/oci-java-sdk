/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.devops.internal.http.*;
import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;

/**
 * Async client implementation for Devops service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class DevopsAsyncClient implements DevopsAsync {
    /**
     * Service instance for Devops.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DEVOPS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://devops.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DevopsAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DevopsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DevopsAsyncClient> {
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
        public DevopsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DevopsAsyncClient(
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
    public java.util.concurrent.Future<ApproveDeploymentResponse> approveDeployment(
            ApproveDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApproveDeploymentRequest, ApproveDeploymentResponse>
                    handler) {
        LOG.trace("Called async approveDeployment");
        final ApproveDeploymentRequest interceptedRequest =
                ApproveDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApproveDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ApproveDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/ApproveDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, ApproveDeploymentResponse>
                transformer =
                        ApproveDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ApproveDeploymentRequest, ApproveDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ApproveDeploymentRequest, ApproveDeploymentResponse>,
                        java.util.concurrent.Future<ApproveDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApproveDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ApproveDeploymentRequest, ApproveDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelBuildRunResponse> cancelBuildRun(
            CancelBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelBuildRunRequest, CancelBuildRunResponse>
                    handler) {
        LOG.trace("Called async cancelBuildRun");
        final CancelBuildRunRequest interceptedRequest =
                CancelBuildRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelBuildRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CancelBuildRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/CancelBuildRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelBuildRunResponse>
                transformer =
                        CancelBuildRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelBuildRunRequest, CancelBuildRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelBuildRunRequest, CancelBuildRunResponse>,
                        java.util.concurrent.Future<CancelBuildRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCancelBuildRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelBuildRunRequest, CancelBuildRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentResponse> cancelDeployment(
            CancelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDeploymentRequest, CancelDeploymentResponse>
                    handler) {
        LOG.trace("Called async cancelDeployment");
        final CancelDeploymentRequest interceptedRequest =
                CancelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CancelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/CancelDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelDeploymentResponse>
                transformer =
                        CancelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelDeploymentRequest, CancelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelDeploymentRequest, CancelDeploymentResponse>,
                        java.util.concurrent.Future<CancelDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCancelDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelDeploymentRequest, CancelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeProjectCompartment");
        final ChangeProjectCompartmentRequest interceptedRequest =
                ChangeProjectCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeProjectCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ChangeProjectCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/ChangeProjectCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeProjectCompartmentResponse>
                transformer =
                        ChangeProjectCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>,
                        java.util.concurrent.Future<ChangeProjectCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeProjectCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBuildPipelineResponse> createBuildPipeline(
            CreateBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineRequest, CreateBuildPipelineResponse>
                    handler) {
        LOG.trace("Called async createBuildPipeline");
        final CreateBuildPipelineRequest interceptedRequest =
                CreateBuildPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBuildPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateBuildPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/CreateBuildPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBuildPipelineResponse>
                transformer =
                        CreateBuildPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBuildPipelineRequest, CreateBuildPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBuildPipelineRequest, CreateBuildPipelineResponse>,
                        java.util.concurrent.Future<CreateBuildPipelineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBuildPipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBuildPipelineRequest, CreateBuildPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBuildPipelineStageResponse> createBuildPipelineStage(
            CreateBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>
                    handler) {
        LOG.trace("Called async createBuildPipelineStage");
        final CreateBuildPipelineStageRequest interceptedRequest =
                CreateBuildPipelineStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBuildPipelineStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateBuildPipelineStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/CreateBuildPipelineStage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateBuildPipelineStageResponse>
                transformer =
                        CreateBuildPipelineStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>,
                        java.util.concurrent.Future<CreateBuildPipelineStageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBuildPipelineStageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBuildRunResponse> createBuildRun(
            CreateBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildRunRequest, CreateBuildRunResponse>
                    handler) {
        LOG.trace("Called async createBuildRun");
        final CreateBuildRunRequest interceptedRequest =
                CreateBuildRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBuildRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateBuildRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/CreateBuildRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBuildRunResponse>
                transformer =
                        CreateBuildRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBuildRunRequest, CreateBuildRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBuildRunRequest, CreateBuildRunResponse>,
                        java.util.concurrent.Future<CreateBuildRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBuildRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBuildRunRequest, CreateBuildRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {
        LOG.trace("Called async createConnection");
        final CreateConnectionRequest interceptedRequest =
                CreateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/CreateConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateConnectionResponse>
                transformer =
                        CreateConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConnectionRequest, CreateConnectionResponse>,
                        java.util.concurrent.Future<CreateConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConnectionRequest, CreateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDeployArtifactResponse> createDeployArtifact(
            CreateDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployArtifactRequest, CreateDeployArtifactResponse>
                    handler) {
        LOG.trace("Called async createDeployArtifact");
        final CreateDeployArtifactRequest interceptedRequest =
                CreateDeployArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDeployArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateDeployArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/CreateDeployArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDeployArtifactResponse>
                transformer =
                        CreateDeployArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDeployArtifactRequest, CreateDeployArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDeployArtifactRequest, CreateDeployArtifactResponse>,
                        java.util.concurrent.Future<CreateDeployArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDeployArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDeployArtifactRequest, CreateDeployArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDeployEnvironmentResponse> createDeployEnvironment(
            CreateDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>
                    handler) {
        LOG.trace("Called async createDeployEnvironment");
        final CreateDeployEnvironmentRequest interceptedRequest =
                CreateDeployEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDeployEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateDeployEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/CreateDeployEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDeployEnvironmentResponse>
                transformer =
                        CreateDeployEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>,
                        java.util.concurrent.Future<CreateDeployEnvironmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDeployEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDeployPipelineResponse> createDeployPipeline(
            CreateDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployPipelineRequest, CreateDeployPipelineResponse>
                    handler) {
        LOG.trace("Called async createDeployPipeline");
        final CreateDeployPipelineRequest interceptedRequest =
                CreateDeployPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDeployPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateDeployPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/CreateDeployPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDeployPipelineResponse>
                transformer =
                        CreateDeployPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDeployPipelineRequest, CreateDeployPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDeployPipelineRequest, CreateDeployPipelineResponse>,
                        java.util.concurrent.Future<CreateDeployPipelineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDeployPipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDeployPipelineRequest, CreateDeployPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDeployStageResponse> createDeployStage(
            CreateDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployStageRequest, CreateDeployStageResponse>
                    handler) {
        LOG.trace("Called async createDeployStage");
        final CreateDeployStageRequest interceptedRequest =
                CreateDeployStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDeployStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateDeployStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/CreateDeployStage");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDeployStageResponse>
                transformer =
                        CreateDeployStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDeployStageRequest, CreateDeployStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDeployStageRequest, CreateDeployStageResponse>,
                        java.util.concurrent.Future<CreateDeployStageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDeployStageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDeployStageRequest, CreateDeployStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResponse> createDeployment(
            CreateDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeploymentRequest, CreateDeploymentResponse>
                    handler) {
        LOG.trace("Called async createDeployment");
        final CreateDeploymentRequest interceptedRequest =
                CreateDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/CreateDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDeploymentResponse>
                transformer =
                        CreateDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDeploymentRequest, CreateDeploymentResponse>,
                        java.util.concurrent.Future<CreateDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDeploymentRequest, CreateDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {
        LOG.trace("Called async createProject");
        final CreateProjectRequest interceptedRequest =
                CreateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/CreateProject");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateProjectResponse>
                transformer =
                        CreateProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateProjectRequest, CreateProjectResponse>,
                        java.util.concurrent.Future<CreateProjectResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateProjectRequest, CreateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResponse> createRepository(
            CreateRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRepositoryRequest, CreateRepositoryResponse>
                    handler) {
        LOG.trace("Called async createRepository");
        final CreateRepositoryRequest interceptedRequest =
                CreateRepositoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRepositoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateRepository",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/CreateRepository");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRepositoryResponse>
                transformer =
                        CreateRepositoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRepositoryRequest, CreateRepositoryResponse>,
                        java.util.concurrent.Future<CreateRepositoryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRepositoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRepositoryRequest, CreateRepositoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTriggerResponse> createTrigger(
            CreateTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTriggerRequest, CreateTriggerResponse>
                    handler) {
        LOG.trace("Called async createTrigger");
        final CreateTriggerRequest interceptedRequest =
                CreateTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTriggerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "CreateTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/CreateTrigger");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTriggerResponse>
                transformer =
                        CreateTriggerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTriggerRequest, CreateTriggerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTriggerRequest, CreateTriggerResponse>,
                        java.util.concurrent.Future<CreateTriggerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTriggerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTriggerRequest, CreateTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildPipelineResponse> deleteBuildPipeline(
            DeleteBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>
                    handler) {
        LOG.trace("Called async deleteBuildPipeline");
        final DeleteBuildPipelineRequest interceptedRequest =
                DeleteBuildPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBuildPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteBuildPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/DeleteBuildPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBuildPipelineResponse>
                transformer =
                        DeleteBuildPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>,
                        java.util.concurrent.Future<DeleteBuildPipelineResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildPipelineStageResponse> deleteBuildPipelineStage(
            DeleteBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>
                    handler) {
        LOG.trace("Called async deleteBuildPipelineStage");
        final DeleteBuildPipelineStageRequest interceptedRequest =
                DeleteBuildPipelineStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBuildPipelineStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteBuildPipelineStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/DeleteBuildPipelineStage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteBuildPipelineStageResponse>
                transformer =
                        DeleteBuildPipelineStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>,
                        java.util.concurrent.Future<DeleteBuildPipelineStageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {
        LOG.trace("Called async deleteConnection");
        final DeleteConnectionRequest interceptedRequest =
                DeleteConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/DeleteConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteConnectionResponse>
                transformer =
                        DeleteConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConnectionRequest, DeleteConnectionResponse>,
                        java.util.concurrent.Future<DeleteConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConnectionRequest, DeleteConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployArtifactResponse> deleteDeployArtifact(
            DeleteDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>
                    handler) {
        LOG.trace("Called async deleteDeployArtifact");
        final DeleteDeployArtifactRequest interceptedRequest =
                DeleteDeployArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDeployArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteDeployArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/DeleteDeployArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDeployArtifactResponse>
                transformer =
                        DeleteDeployArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>,
                        java.util.concurrent.Future<DeleteDeployArtifactResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployEnvironmentResponse> deleteDeployEnvironment(
            DeleteDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>
                    handler) {
        LOG.trace("Called async deleteDeployEnvironment");
        final DeleteDeployEnvironmentRequest interceptedRequest =
                DeleteDeployEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDeployEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteDeployEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/DeleteDeployEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDeployEnvironmentResponse>
                transformer =
                        DeleteDeployEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>,
                        java.util.concurrent.Future<DeleteDeployEnvironmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployPipelineResponse> deleteDeployPipeline(
            DeleteDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>
                    handler) {
        LOG.trace("Called async deleteDeployPipeline");
        final DeleteDeployPipelineRequest interceptedRequest =
                DeleteDeployPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDeployPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteDeployPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/DeleteDeployPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDeployPipelineResponse>
                transformer =
                        DeleteDeployPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>,
                        java.util.concurrent.Future<DeleteDeployPipelineResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployStageResponse> deleteDeployStage(
            DeleteDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployStageRequest, DeleteDeployStageResponse>
                    handler) {
        LOG.trace("Called async deleteDeployStage");
        final DeleteDeployStageRequest interceptedRequest =
                DeleteDeployStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDeployStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteDeployStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/DeleteDeployStage");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDeployStageResponse>
                transformer =
                        DeleteDeployStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDeployStageRequest, DeleteDeployStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDeployStageRequest, DeleteDeployStageResponse>,
                        java.util.concurrent.Future<DeleteDeployStageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDeployStageRequest, DeleteDeployStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {
        LOG.trace("Called async deleteProject");
        final DeleteProjectRequest interceptedRequest =
                DeleteProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/DeleteProject");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteProjectResponse>
                transformer =
                        DeleteProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteProjectRequest, DeleteProjectResponse>,
                        java.util.concurrent.Future<DeleteProjectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteProjectRequest, DeleteProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRefResponse> deleteRef(
            DeleteRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRefRequest, DeleteRefResponse>
                    handler) {
        LOG.trace("Called async deleteRef");
        final DeleteRefRequest interceptedRequest = DeleteRefConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRefConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteRef",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/DeleteRef");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRefResponse>
                transformer =
                        DeleteRefConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRefRequest, DeleteRefResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteRefRequest, DeleteRefResponse>,
                        java.util.concurrent.Future<DeleteRefResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRefRequest, DeleteRefResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResponse> deleteRepository(
            DeleteRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRepositoryRequest, DeleteRepositoryResponse>
                    handler) {
        LOG.trace("Called async deleteRepository");
        final DeleteRepositoryRequest interceptedRequest =
                DeleteRepositoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRepositoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteRepository",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/DeleteRepository");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRepositoryResponse>
                transformer =
                        DeleteRepositoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRepositoryRequest, DeleteRepositoryResponse>,
                        java.util.concurrent.Future<DeleteRepositoryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRepositoryRequest, DeleteRepositoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTriggerResponse> deleteTrigger(
            DeleteTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResponse>
                    handler) {
        LOG.trace("Called async deleteTrigger");
        final DeleteTriggerRequest interceptedRequest =
                DeleteTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTriggerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "DeleteTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/DeleteTrigger");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTriggerResponse>
                transformer =
                        DeleteTriggerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTriggerRequest, DeleteTriggerResponse>,
                        java.util.concurrent.Future<DeleteTriggerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTriggerRequest, DeleteTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBuildPipelineResponse> getBuildPipeline(
            GetBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBuildPipelineRequest, GetBuildPipelineResponse>
                    handler) {
        LOG.trace("Called async getBuildPipeline");
        final GetBuildPipelineRequest interceptedRequest =
                GetBuildPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBuildPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetBuildPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/GetBuildPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBuildPipelineResponse>
                transformer =
                        GetBuildPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBuildPipelineRequest, GetBuildPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBuildPipelineRequest, GetBuildPipelineResponse>,
                        java.util.concurrent.Future<GetBuildPipelineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBuildPipelineRequest, GetBuildPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBuildPipelineStageResponse> getBuildPipelineStage(
            GetBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>
                    handler) {
        LOG.trace("Called async getBuildPipelineStage");
        final GetBuildPipelineStageRequest interceptedRequest =
                GetBuildPipelineStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBuildPipelineStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetBuildPipelineStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/GetBuildPipelineStage");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBuildPipelineStageResponse>
                transformer =
                        GetBuildPipelineStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>,
                        java.util.concurrent.Future<GetBuildPipelineStageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBuildRunResponse> getBuildRun(
            GetBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBuildRunRequest, GetBuildRunResponse>
                    handler) {
        LOG.trace("Called async getBuildRun");
        final GetBuildRunRequest interceptedRequest =
                GetBuildRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBuildRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetBuildRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/GetBuildRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBuildRunResponse>
                transformer =
                        GetBuildRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBuildRunRequest, GetBuildRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBuildRunRequest, GetBuildRunResponse>,
                        java.util.concurrent.Future<GetBuildRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBuildRunRequest, GetBuildRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCommitResponse> getCommit(
            GetCommitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCommitRequest, GetCommitResponse>
                    handler) {
        LOG.trace("Called async getCommit");
        final GetCommitRequest interceptedRequest = GetCommitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCommitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetCommit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetCommit");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCommitResponse>
                transformer =
                        GetCommitConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCommitRequest, GetCommitResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetCommitRequest, GetCommitResponse>,
                        java.util.concurrent.Future<GetCommitResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCommitRequest, GetCommitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCommitDiffResponse> getCommitDiff(
            GetCommitDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCommitDiffRequest, GetCommitDiffResponse>
                    handler) {
        LOG.trace("Called async getCommitDiff");
        final GetCommitDiffRequest interceptedRequest =
                GetCommitDiffConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCommitDiffConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetCommitDiff",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetCommitDiff");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCommitDiffResponse>
                transformer =
                        GetCommitDiffConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCommitDiffRequest, GetCommitDiffResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCommitDiffRequest, GetCommitDiffResponse>,
                        java.util.concurrent.Future<GetCommitDiffResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCommitDiffRequest, GetCommitDiffResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {
        LOG.trace("Called async getConnection");
        final GetConnectionRequest interceptedRequest =
                GetConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/GetConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConnectionResponse>
                transformer =
                        GetConnectionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConnectionRequest, GetConnectionResponse>,
                        java.util.concurrent.Future<GetConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConnectionRequest, GetConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDeployArtifactResponse> getDeployArtifact(
            GetDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployArtifactRequest, GetDeployArtifactResponse>
                    handler) {
        LOG.trace("Called async getDeployArtifact");
        final GetDeployArtifactRequest interceptedRequest =
                GetDeployArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeployArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetDeployArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/GetDeployArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDeployArtifactResponse>
                transformer =
                        GetDeployArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDeployArtifactRequest, GetDeployArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeployArtifactRequest, GetDeployArtifactResponse>,
                        java.util.concurrent.Future<GetDeployArtifactResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeployArtifactRequest, GetDeployArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDeployEnvironmentResponse> getDeployEnvironment(
            GetDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>
                    handler) {
        LOG.trace("Called async getDeployEnvironment");
        final GetDeployEnvironmentRequest interceptedRequest =
                GetDeployEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeployEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetDeployEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/GetDeployEnvironment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDeployEnvironmentResponse>
                transformer =
                        GetDeployEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>,
                        java.util.concurrent.Future<GetDeployEnvironmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDeployPipelineResponse> getDeployPipeline(
            GetDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployPipelineRequest, GetDeployPipelineResponse>
                    handler) {
        LOG.trace("Called async getDeployPipeline");
        final GetDeployPipelineRequest interceptedRequest =
                GetDeployPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeployPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetDeployPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/GetDeployPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDeployPipelineResponse>
                transformer =
                        GetDeployPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDeployPipelineRequest, GetDeployPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeployPipelineRequest, GetDeployPipelineResponse>,
                        java.util.concurrent.Future<GetDeployPipelineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeployPipelineRequest, GetDeployPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDeployStageResponse> getDeployStage(
            GetDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployStageRequest, GetDeployStageResponse>
                    handler) {
        LOG.trace("Called async getDeployStage");
        final GetDeployStageRequest interceptedRequest =
                GetDeployStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeployStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetDeployStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/GetDeployStage");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDeployStageResponse>
                transformer =
                        GetDeployStageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDeployStageRequest, GetDeployStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeployStageRequest, GetDeployStageResponse>,
                        java.util.concurrent.Future<GetDeployStageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeployStageRequest, GetDeployStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResponse> getDeployment(
            GetDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDeploymentRequest, GetDeploymentResponse>
                    handler) {
        LOG.trace("Called async getDeployment");
        final GetDeploymentRequest interceptedRequest =
                GetDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/GetDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDeploymentResponse>
                transformer =
                        GetDeploymentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDeploymentRequest, GetDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDeploymentRequest, GetDeploymentResponse>,
                        java.util.concurrent.Future<GetDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDeploymentRequest, GetDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFileDiffResponse> getFileDiff(
            GetFileDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFileDiffRequest, GetFileDiffResponse>
                    handler) {
        LOG.trace("Called async getFileDiff");
        final GetFileDiffRequest interceptedRequest =
                GetFileDiffConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFileDiffConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetFileDiff",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetFileDiff");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFileDiffResponse>
                transformer =
                        GetFileDiffConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFileDiffRequest, GetFileDiffResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFileDiffRequest, GetFileDiffResponse>,
                        java.util.concurrent.Future<GetFileDiffResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFileDiffRequest, GetFileDiffResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMirrorRecordResponse> getMirrorRecord(
            GetMirrorRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMirrorRecordRequest, GetMirrorRecordResponse>
                    handler) {
        LOG.trace("Called async getMirrorRecord");
        final GetMirrorRecordRequest interceptedRequest =
                GetMirrorRecordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMirrorRecordConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetMirrorRecord",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetMirrorRecord");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMirrorRecordResponse>
                transformer =
                        GetMirrorRecordConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMirrorRecordRequest, GetMirrorRecordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMirrorRecordRequest, GetMirrorRecordResponse>,
                        java.util.concurrent.Future<GetMirrorRecordResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMirrorRecordRequest, GetMirrorRecordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse>
                    handler) {
        LOG.trace("Called async getObject");
        final GetObjectRequest interceptedRequest = GetObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetObject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryObject/GetObject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetObjectResponse>
                transformer =
                        GetObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse>,
                        java.util.concurrent.Future<GetObjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetObjectRequest, GetObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetObjectContentResponse> getObjectContent(
            GetObjectContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetObjectContentRequest, GetObjectContentResponse>
                    handler) {
        LOG.trace("Called async getObjectContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getObjectContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetObjectContentRequest interceptedRequest =
                GetObjectContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetObjectContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetObjectContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetObjectContent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetObjectContentResponse>
                transformer =
                        GetObjectContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetObjectContentRequest, GetObjectContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetObjectContentRequest, GetObjectContentResponse>,
                        java.util.concurrent.Future<GetObjectContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetObjectContentRequest, GetObjectContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {
        LOG.trace("Called async getProject");
        final GetProjectRequest interceptedRequest = GetProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/GetProject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProjectResponse>
                transformer =
                        GetProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProjectRequest, GetProjectResponse>,
                        java.util.concurrent.Future<GetProjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProjectRequest, GetProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRefResponse> getRef(
            GetRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRefRequest, GetRefResponse> handler) {
        LOG.trace("Called async getRef");
        final GetRefRequest interceptedRequest = GetRefConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRefConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRef",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRef");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRefResponse> transformer =
                GetRefConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRefRequest, GetRefResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetRefRequest, GetRefResponse>,
                        java.util.concurrent.Future<GetRefResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRefRequest, GetRefResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRepoFileDiffResponse> getRepoFileDiff(
            GetRepoFileDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepoFileDiffRequest, GetRepoFileDiffResponse>
                    handler) {
        LOG.trace("Called async getRepoFileDiff");
        final GetRepoFileDiffRequest interceptedRequest =
                GetRepoFileDiffConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRepoFileDiffConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRepoFileDiff",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepoFileDiff");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRepoFileDiffResponse>
                transformer =
                        GetRepoFileDiffConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRepoFileDiffRequest, GetRepoFileDiffResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRepoFileDiffRequest, GetRepoFileDiffResponse>,
                        java.util.concurrent.Future<GetRepoFileDiffResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRepoFileDiffRequest, GetRepoFileDiffResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRepoFileLinesResponse> getRepoFileLines(
            GetRepoFileLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepoFileLinesRequest, GetRepoFileLinesResponse>
                    handler) {
        LOG.trace("Called async getRepoFileLines");
        final GetRepoFileLinesRequest interceptedRequest =
                GetRepoFileLinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRepoFileLinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRepoFileLines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepoFileLines");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRepoFileLinesResponse>
                transformer =
                        GetRepoFileLinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRepoFileLinesRequest, GetRepoFileLinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRepoFileLinesRequest, GetRepoFileLinesResponse>,
                        java.util.concurrent.Future<GetRepoFileLinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRepoFileLinesRequest, GetRepoFileLinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResponse> getRepository(
            GetRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRepositoryRequest, GetRepositoryResponse>
                    handler) {
        LOG.trace("Called async getRepository");
        final GetRepositoryRequest interceptedRequest =
                GetRepositoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRepositoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRepository",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepository");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRepositoryResponse>
                transformer =
                        GetRepositoryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRepositoryRequest, GetRepositoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRepositoryRequest, GetRepositoryResponse>,
                        java.util.concurrent.Future<GetRepositoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRepositoryRequest, GetRepositoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryArchiveContentResponse>
            getRepositoryArchiveContent(
                    GetRepositoryArchiveContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetRepositoryArchiveContentRequest,
                                    GetRepositoryArchiveContentResponse>
                            handler) {
        LOG.trace("Called async getRepositoryArchiveContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getRepositoryArchiveContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetRepositoryArchiveContentRequest interceptedRequest =
                GetRepositoryArchiveContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRepositoryArchiveContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRepositoryArchiveContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepositoryArchiveContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetRepositoryArchiveContentResponse>
                transformer =
                        GetRepositoryArchiveContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetRepositoryArchiveContentRequest, GetRepositoryArchiveContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRepositoryArchiveContentRequest,
                                GetRepositoryArchiveContentResponse>,
                        java.util.concurrent.Future<GetRepositoryArchiveContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRepositoryArchiveContentRequest, GetRepositoryArchiveContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryFileLinesResponse> getRepositoryFileLines(
            GetRepositoryFileLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>
                    handler) {
        LOG.trace("Called async getRepositoryFileLines");
        final GetRepositoryFileLinesRequest interceptedRequest =
                GetRepositoryFileLinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRepositoryFileLinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetRepositoryFileLines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepositoryFileLines");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRepositoryFileLinesResponse>
                transformer =
                        GetRepositoryFileLinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>,
                        java.util.concurrent.Future<GetRepositoryFileLinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTriggerResponse> getTrigger(
            GetTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTriggerRequest, GetTriggerResponse>
                    handler) {
        LOG.trace("Called async getTrigger");
        final GetTriggerRequest interceptedRequest = GetTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTriggerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "GetTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/GetTrigger");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTriggerResponse>
                transformer =
                        GetTriggerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTriggerRequest, GetTriggerResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTriggerRequest, GetTriggerResponse>,
                        java.util.concurrent.Future<GetTriggerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTriggerRequest, GetTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Devops",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequest/GetWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
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
    public java.util.concurrent.Future<ListAuthorsResponse> listAuthors(
            ListAuthorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAuthorsRequest, ListAuthorsResponse>
                    handler) {
        LOG.trace("Called async listAuthors");
        final ListAuthorsRequest interceptedRequest =
                ListAuthorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListAuthors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListAuthors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuthorsResponse>
                transformer =
                        ListAuthorsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuthorsRequest, ListAuthorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuthorsRequest, ListAuthorsResponse>,
                        java.util.concurrent.Future<ListAuthorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuthorsRequest, ListAuthorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBuildPipelineStagesResponse> listBuildPipelineStages(
            ListBuildPipelineStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>
                    handler) {
        LOG.trace("Called async listBuildPipelineStages");
        final ListBuildPipelineStagesRequest interceptedRequest =
                ListBuildPipelineStagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBuildPipelineStagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListBuildPipelineStages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStageSummary/ListBuildPipelineStages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListBuildPipelineStagesResponse>
                transformer =
                        ListBuildPipelineStagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>,
                        java.util.concurrent.Future<ListBuildPipelineStagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBuildPipelinesResponse> listBuildPipelines(
            ListBuildPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelinesRequest, ListBuildPipelinesResponse>
                    handler) {
        LOG.trace("Called async listBuildPipelines");
        final ListBuildPipelinesRequest interceptedRequest =
                ListBuildPipelinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBuildPipelinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListBuildPipelines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineCollection/ListBuildPipelines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBuildPipelinesResponse>
                transformer =
                        ListBuildPipelinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBuildPipelinesRequest, ListBuildPipelinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBuildPipelinesRequest, ListBuildPipelinesResponse>,
                        java.util.concurrent.Future<ListBuildPipelinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBuildPipelinesRequest, ListBuildPipelinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBuildRunsResponse> listBuildRuns(
            ListBuildRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBuildRunsRequest, ListBuildRunsResponse>
                    handler) {
        LOG.trace("Called async listBuildRuns");
        final ListBuildRunsRequest interceptedRequest =
                ListBuildRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBuildRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListBuildRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRunSummary/ListBuildRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBuildRunsResponse>
                transformer =
                        ListBuildRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBuildRunsRequest, ListBuildRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBuildRunsRequest, ListBuildRunsResponse>,
                        java.util.concurrent.Future<ListBuildRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBuildRunsRequest, ListBuildRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCommitDiffsResponse> listCommitDiffs(
            ListCommitDiffsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCommitDiffsRequest, ListCommitDiffsResponse>
                    handler) {
        LOG.trace("Called async listCommitDiffs");
        final ListCommitDiffsRequest interceptedRequest =
                ListCommitDiffsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCommitDiffsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListCommitDiffs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListCommitDiffs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCommitDiffsResponse>
                transformer =
                        ListCommitDiffsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCommitDiffsRequest, ListCommitDiffsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCommitDiffsRequest, ListCommitDiffsResponse>,
                        java.util.concurrent.Future<ListCommitDiffsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCommitDiffsRequest, ListCommitDiffsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCommitsResponse> listCommits(
            ListCommitsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCommitsRequest, ListCommitsResponse>
                    handler) {
        LOG.trace("Called async listCommits");
        final ListCommitsRequest interceptedRequest =
                ListCommitsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCommitsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListCommits",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryCommit/ListCommits");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCommitsResponse>
                transformer =
                        ListCommitsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCommitsRequest, ListCommitsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCommitsRequest, ListCommitsResponse>,
                        java.util.concurrent.Future<ListCommitsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCommitsRequest, ListCommitsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {
        LOG.trace("Called async listConnections");
        final ListConnectionsRequest interceptedRequest =
                ListConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ConnectionCollection/ListConnections");
        final java.util.function.Function<javax.ws.rs.core.Response, ListConnectionsResponse>
                transformer =
                        ListConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConnectionsRequest, ListConnectionsResponse>,
                        java.util.concurrent.Future<ListConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConnectionsRequest, ListConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDeployArtifactsResponse> listDeployArtifacts(
            ListDeployArtifactsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployArtifactsRequest, ListDeployArtifactsResponse>
                    handler) {
        LOG.trace("Called async listDeployArtifacts");
        final ListDeployArtifactsRequest interceptedRequest =
                ListDeployArtifactsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDeployArtifactsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListDeployArtifacts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifactSummary/ListDeployArtifacts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDeployArtifactsResponse>
                transformer =
                        ListDeployArtifactsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDeployArtifactsRequest, ListDeployArtifactsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDeployArtifactsRequest, ListDeployArtifactsResponse>,
                        java.util.concurrent.Future<ListDeployArtifactsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDeployArtifactsRequest, ListDeployArtifactsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDeployEnvironmentsResponse> listDeployEnvironments(
            ListDeployEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>
                    handler) {
        LOG.trace("Called async listDeployEnvironments");
        final ListDeployEnvironmentsRequest interceptedRequest =
                ListDeployEnvironmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDeployEnvironmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListDeployEnvironments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironmentSummary/ListDeployEnvironments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDeployEnvironmentsResponse>
                transformer =
                        ListDeployEnvironmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>,
                        java.util.concurrent.Future<ListDeployEnvironmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDeployPipelinesResponse> listDeployPipelines(
            ListDeployPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployPipelinesRequest, ListDeployPipelinesResponse>
                    handler) {
        LOG.trace("Called async listDeployPipelines");
        final ListDeployPipelinesRequest interceptedRequest =
                ListDeployPipelinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDeployPipelinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListDeployPipelines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipelineSummary/ListDeployPipelines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDeployPipelinesResponse>
                transformer =
                        ListDeployPipelinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDeployPipelinesRequest, ListDeployPipelinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDeployPipelinesRequest, ListDeployPipelinesResponse>,
                        java.util.concurrent.Future<ListDeployPipelinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDeployPipelinesRequest, ListDeployPipelinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDeployStagesResponse> listDeployStages(
            ListDeployStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployStagesRequest, ListDeployStagesResponse>
                    handler) {
        LOG.trace("Called async listDeployStages");
        final ListDeployStagesRequest interceptedRequest =
                ListDeployStagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDeployStagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListDeployStages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStageSummary/ListDeployStages");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDeployStagesResponse>
                transformer =
                        ListDeployStagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDeployStagesRequest, ListDeployStagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDeployStagesRequest, ListDeployStagesResponse>,
                        java.util.concurrent.Future<ListDeployStagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDeployStagesRequest, ListDeployStagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResponse> listDeployments(
            ListDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentsRequest, ListDeploymentsResponse>
                    handler) {
        LOG.trace("Called async listDeployments");
        final ListDeploymentsRequest interceptedRequest =
                ListDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDeploymentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListDeployments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeploymentSummary/ListDeployments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDeploymentsResponse>
                transformer =
                        ListDeploymentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDeploymentsRequest, ListDeploymentsResponse>,
                        java.util.concurrent.Future<ListDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDeploymentsRequest, ListDeploymentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMirrorRecordsResponse> listMirrorRecords(
            ListMirrorRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMirrorRecordsRequest, ListMirrorRecordsResponse>
                    handler) {
        LOG.trace("Called async listMirrorRecords");
        final ListMirrorRecordsRequest interceptedRequest =
                ListMirrorRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMirrorRecordsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListMirrorRecords",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListMirrorRecords");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMirrorRecordsResponse>
                transformer =
                        ListMirrorRecordsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMirrorRecordsRequest, ListMirrorRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMirrorRecordsRequest, ListMirrorRecordsResponse>,
                        java.util.concurrent.Future<ListMirrorRecordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMirrorRecordsRequest, ListMirrorRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPathsResponse> listPaths(
            ListPathsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPathsRequest, ListPathsResponse>
                    handler) {
        LOG.trace("Called async listPaths");
        final ListPathsRequest interceptedRequest = ListPathsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPathsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListPaths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryPathSummary/ListPaths");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPathsResponse>
                transformer =
                        ListPathsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPathsRequest, ListPathsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListPathsRequest, ListPathsResponse>,
                        java.util.concurrent.Future<ListPathsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPathsRequest, ListPathsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {
        LOG.trace("Called async listProjects");
        final ListProjectsRequest interceptedRequest =
                ListProjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListProjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectSummary/ListProjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProjectsResponse>
                transformer =
                        ListProjectsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProjectsRequest, ListProjectsResponse>,
                        java.util.concurrent.Future<ListProjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProjectsRequest, ListProjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRefsResponse> listRefs(
            ListRefsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRefsRequest, ListRefsResponse>
                    handler) {
        LOG.trace("Called async listRefs");
        final ListRefsRequest interceptedRequest = ListRefsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRefsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListRefs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryRef/ListRefs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRefsResponse> transformer =
                ListRefsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRefsRequest, ListRefsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRefsRequest, ListRefsResponse>,
                        java.util.concurrent.Future<ListRefsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRefsRequest, ListRefsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResponse> listRepositories(
            ListRepositoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRepositoriesRequest, ListRepositoriesResponse>
                    handler) {
        LOG.trace("Called async listRepositories");
        final ListRepositoriesRequest interceptedRequest =
                ListRepositoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRepositoriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListRepositories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListRepositories");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRepositoriesResponse>
                transformer =
                        ListRepositoriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRepositoriesRequest, ListRepositoriesResponse>,
                        java.util.concurrent.Future<ListRepositoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRepositoriesRequest, ListRepositoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTriggersResponse> listTriggers(
            ListTriggersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTriggersRequest, ListTriggersResponse>
                    handler) {
        LOG.trace("Called async listTriggers");
        final ListTriggersRequest interceptedRequest =
                ListTriggersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTriggersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListTriggers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/TriggerCollection/ListTriggers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTriggersResponse>
                transformer =
                        ListTriggersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTriggersRequest, ListTriggersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTriggersRequest, ListTriggersResponse>,
                        java.util.concurrent.Future<ListTriggersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTriggersRequest, ListTriggersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequestError/ListWorkRequestErrors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequestLogEntry/ListWorkRequestLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Devops",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequest/ListWorkRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
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
    public java.util.concurrent.Future<MirrorRepositoryResponse> mirrorRepository(
            MirrorRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MirrorRepositoryRequest, MirrorRepositoryResponse>
                    handler) {
        LOG.trace("Called async mirrorRepository");
        final MirrorRepositoryRequest interceptedRequest =
                MirrorRepositoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MirrorRepositoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "MirrorRepository",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/MirrorRepository");
        final java.util.function.Function<javax.ws.rs.core.Response, MirrorRepositoryResponse>
                transformer =
                        MirrorRepositoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<MirrorRepositoryRequest, MirrorRepositoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MirrorRepositoryRequest, MirrorRepositoryResponse>,
                        java.util.concurrent.Future<MirrorRepositoryResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MirrorRepositoryRequest, MirrorRepositoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryRefResponse> putRepositoryRef(
            PutRepositoryRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutRepositoryRefRequest, PutRepositoryRefResponse>
                    handler) {
        LOG.trace("Called async putRepositoryRef");
        final PutRepositoryRefRequest interceptedRequest =
                PutRepositoryRefConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutRepositoryRefConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "PutRepositoryRef",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/PutRepositoryRef");
        final java.util.function.Function<javax.ws.rs.core.Response, PutRepositoryRefResponse>
                transformer =
                        PutRepositoryRefConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutRepositoryRefRequest, PutRepositoryRefResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutRepositoryRefRequest, PutRepositoryRefResponse>,
                        java.util.concurrent.Future<PutRepositoryRefResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPutRepositoryRefDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutRepositoryRefRequest, PutRepositoryRefResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildPipelineResponse> updateBuildPipeline(
            UpdateBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>
                    handler) {
        LOG.trace("Called async updateBuildPipeline");
        final UpdateBuildPipelineRequest interceptedRequest =
                UpdateBuildPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBuildPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateBuildPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/UpdateBuildPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBuildPipelineResponse>
                transformer =
                        UpdateBuildPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>,
                        java.util.concurrent.Future<UpdateBuildPipelineResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBuildPipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildPipelineStageResponse> updateBuildPipelineStage(
            UpdateBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>
                    handler) {
        LOG.trace("Called async updateBuildPipelineStage");
        final UpdateBuildPipelineStageRequest interceptedRequest =
                UpdateBuildPipelineStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBuildPipelineStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateBuildPipelineStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/UpdateBuildPipelineStage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateBuildPipelineStageResponse>
                transformer =
                        UpdateBuildPipelineStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>,
                        java.util.concurrent.Future<UpdateBuildPipelineStageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBuildPipelineStageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildRunResponse> updateBuildRun(
            UpdateBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildRunRequest, UpdateBuildRunResponse>
                    handler) {
        LOG.trace("Called async updateBuildRun");
        final UpdateBuildRunRequest interceptedRequest =
                UpdateBuildRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBuildRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateBuildRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/UpdateBuildRun");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBuildRunResponse>
                transformer =
                        UpdateBuildRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBuildRunRequest, UpdateBuildRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBuildRunRequest, UpdateBuildRunResponse>,
                        java.util.concurrent.Future<UpdateBuildRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBuildRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBuildRunRequest, UpdateBuildRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {
        LOG.trace("Called async updateConnection");
        final UpdateConnectionRequest interceptedRequest =
                UpdateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/UpdateConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateConnectionResponse>
                transformer =
                        UpdateConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConnectionRequest, UpdateConnectionResponse>,
                        java.util.concurrent.Future<UpdateConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConnectionRequest, UpdateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployArtifactResponse> updateDeployArtifact(
            UpdateDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>
                    handler) {
        LOG.trace("Called async updateDeployArtifact");
        final UpdateDeployArtifactRequest interceptedRequest =
                UpdateDeployArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeployArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateDeployArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/UpdateDeployArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDeployArtifactResponse>
                transformer =
                        UpdateDeployArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>,
                        java.util.concurrent.Future<UpdateDeployArtifactResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeployArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployEnvironmentResponse> updateDeployEnvironment(
            UpdateDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>
                    handler) {
        LOG.trace("Called async updateDeployEnvironment");
        final UpdateDeployEnvironmentRequest interceptedRequest =
                UpdateDeployEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeployEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateDeployEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/UpdateDeployEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDeployEnvironmentResponse>
                transformer =
                        UpdateDeployEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>,
                        java.util.concurrent.Future<UpdateDeployEnvironmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeployEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployPipelineResponse> updateDeployPipeline(
            UpdateDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>
                    handler) {
        LOG.trace("Called async updateDeployPipeline");
        final UpdateDeployPipelineRequest interceptedRequest =
                UpdateDeployPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeployPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateDeployPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/UpdateDeployPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDeployPipelineResponse>
                transformer =
                        UpdateDeployPipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>,
                        java.util.concurrent.Future<UpdateDeployPipelineResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeployPipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployStageResponse> updateDeployStage(
            UpdateDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployStageRequest, UpdateDeployStageResponse>
                    handler) {
        LOG.trace("Called async updateDeployStage");
        final UpdateDeployStageRequest interceptedRequest =
                UpdateDeployStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeployStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateDeployStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/UpdateDeployStage");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDeployStageResponse>
                transformer =
                        UpdateDeployStageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDeployStageRequest, UpdateDeployStageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeployStageRequest, UpdateDeployStageResponse>,
                        java.util.concurrent.Future<UpdateDeployStageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeployStageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeployStageRequest, UpdateDeployStageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResponse> updateDeployment(
            UpdateDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeploymentRequest, UpdateDeploymentResponse>
                    handler) {
        LOG.trace("Called async updateDeployment");
        final UpdateDeploymentRequest interceptedRequest =
                UpdateDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/UpdateDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDeploymentResponse>
                transformer =
                        UpdateDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDeploymentRequest, UpdateDeploymentResponse>,
                        java.util.concurrent.Future<UpdateDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDeploymentRequest, UpdateDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {
        LOG.trace("Called async updateProject");
        final UpdateProjectRequest interceptedRequest =
                UpdateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/UpdateProject");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateProjectResponse>
                transformer =
                        UpdateProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProjectRequest, UpdateProjectResponse>,
                        java.util.concurrent.Future<UpdateProjectResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProjectRequest, UpdateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryResponse> updateRepository(
            UpdateRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRepositoryRequest, UpdateRepositoryResponse>
                    handler) {
        LOG.trace("Called async updateRepository");
        final UpdateRepositoryRequest interceptedRequest =
                UpdateRepositoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRepositoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateRepository",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/UpdateRepository");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRepositoryResponse>
                transformer =
                        UpdateRepositoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRepositoryRequest, UpdateRepositoryResponse>,
                        java.util.concurrent.Future<UpdateRepositoryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRepositoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRepositoryRequest, UpdateRepositoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTriggerResponse> updateTrigger(
            UpdateTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResponse>
                    handler) {
        LOG.trace("Called async updateTrigger");
        final UpdateTriggerRequest interceptedRequest =
                UpdateTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTriggerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Devops",
                        "UpdateTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/UpdateTrigger");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTriggerResponse>
                transformer =
                        UpdateTriggerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTriggerRequest, UpdateTriggerResponse>,
                        java.util.concurrent.Future<UpdateTriggerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTriggerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTriggerRequest, UpdateTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
