/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.internal.http.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Async client implementation for DataSafe service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public class DataSafeAsyncClient implements DataSafeAsync {
    /**
     * Service instance for DataSafe.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASAFE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
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
    public DataSafeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeAsyncClient> {
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
        public DataSafeAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DataSafeAsyncClient(
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
    public java.util.concurrent.Future<ActivateTargetDatabaseResponse> activateTargetDatabase(
            ActivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async activateTargetDatabase");
        final ActivateTargetDatabaseRequest interceptedRequest =
                ActivateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateTargetDatabaseResponse>
                transformer = ActivateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>,
                        java.util.concurrent.Future<ActivateTargetDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getActivateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSafePrivateEndpointCompartmentResponse>
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSafePrivateEndpointCompartmentRequest,
                                    ChangeDataSafePrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDataSafePrivateEndpointCompartment");
        final ChangeDataSafePrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDataSafePrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDataSafePrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDataSafePrivateEndpointCompartmentResponse>
                transformer = ChangeDataSafePrivateEndpointCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDataSafePrivateEndpointCompartmentRequest,
                        ChangeDataSafePrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDataSafePrivateEndpointCompartmentRequest,
                                ChangeDataSafePrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDataSafePrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDataSafePrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDataSafePrivateEndpointCompartmentRequest,
                    ChangeDataSafePrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>
            changeOnPremConnectorCompartment(
                    ChangeOnPremConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOnPremConnectorCompartmentRequest,
                                    ChangeOnPremConnectorCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeOnPremConnectorCompartment");
        final ChangeOnPremConnectorCompartmentRequest interceptedRequest =
                ChangeOnPremConnectorCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOnPremConnectorCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeOnPremConnectorCompartmentResponse>
                transformer = ChangeOnPremConnectorCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeOnPremConnectorCompartmentRequest,
                        ChangeOnPremConnectorCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeOnPremConnectorCompartmentRequest,
                                ChangeOnPremConnectorCompartmentResponse>,
                        java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeOnPremConnectorCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeOnPremConnectorCompartmentRequest,
                    ChangeOnPremConnectorCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>
            changeSecurityAssessmentCompartment(
                    ChangeSecurityAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAssessmentCompartmentRequest,
                                    ChangeSecurityAssessmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityAssessmentCompartment");
        final ChangeSecurityAssessmentCompartmentRequest interceptedRequest =
                ChangeSecurityAssessmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityAssessmentCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSecurityAssessmentCompartmentResponse>
                transformer = ChangeSecurityAssessmentCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityAssessmentCompartmentRequest,
                        ChangeSecurityAssessmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityAssessmentCompartmentRequest,
                                ChangeSecurityAssessmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityAssessmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityAssessmentCompartmentRequest,
                    ChangeSecurityAssessmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>
            changeTargetDatabaseCompartment(
                    ChangeTargetDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetDatabaseCompartmentRequest,
                                    ChangeTargetDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeTargetDatabaseCompartment");
        final ChangeTargetDatabaseCompartmentRequest interceptedRequest =
                ChangeTargetDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetDatabaseCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeTargetDatabaseCompartmentResponse>
                transformer = ChangeTargetDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTargetDatabaseCompartmentRequest,
                        ChangeTargetDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTargetDatabaseCompartmentRequest,
                                ChangeTargetDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeTargetDatabaseCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTargetDatabaseCompartmentRequest,
                    ChangeTargetDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>
            changeUserAssessmentCompartment(
                    ChangeUserAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUserAssessmentCompartmentRequest,
                                    ChangeUserAssessmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeUserAssessmentCompartment");
        final ChangeUserAssessmentCompartmentRequest interceptedRequest =
                ChangeUserAssessmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeUserAssessmentCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeUserAssessmentCompartmentResponse>
                transformer = ChangeUserAssessmentCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeUserAssessmentCompartmentRequest,
                        ChangeUserAssessmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeUserAssessmentCompartmentRequest,
                                ChangeUserAssessmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeUserAssessmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeUserAssessmentCompartmentRequest,
                    ChangeUserAssessmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompareSecurityAssessmentResponse> compareSecurityAssessment(
            CompareSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async compareSecurityAssessment");
        final CompareSecurityAssessmentRequest interceptedRequest =
                CompareSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompareSecurityAssessmentResponse>
                transformer = CompareSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompareSecurityAssessmentRequest,
                                CompareSecurityAssessmentResponse>,
                        java.util.concurrent.Future<CompareSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompareSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompareUserAssessmentResponse> compareUserAssessment(
            CompareUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async compareUserAssessment");
        final CompareUserAssessmentRequest interceptedRequest =
                CompareUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompareUserAssessmentResponse>
                transformer = CompareUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompareUserAssessmentRequest, CompareUserAssessmentResponse>,
                        java.util.concurrent.Future<CompareUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompareUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompareUserAssessmentRequest, CompareUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>
            createDataSafePrivateEndpoint(
                    CreateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSafePrivateEndpointRequest,
                                    CreateDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDataSafePrivateEndpoint");
        final CreateDataSafePrivateEndpointRequest interceptedRequest =
                CreateDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataSafePrivateEndpointResponse>
                transformer = CreateDataSafePrivateEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataSafePrivateEndpointRequest, CreateDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataSafePrivateEndpointRequest,
                                CreateDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataSafePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataSafePrivateEndpointRequest, CreateDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOnPremConnectorResponse> createOnPremConnector(
            CreateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async createOnPremConnector");
        final CreateOnPremConnectorRequest interceptedRequest =
                CreateOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOnPremConnectorResponse>
                transformer = CreateOnPremConnectorConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>,
                        java.util.concurrent.Future<CreateOnPremConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOnPremConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityAssessmentResponse> createSecurityAssessment(
            CreateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async createSecurityAssessment");
        final CreateSecurityAssessmentRequest interceptedRequest =
                CreateSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSecurityAssessmentResponse>
                transformer = CreateSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>,
                        java.util.concurrent.Future<CreateSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDatabaseResponse> createTargetDatabase(
            CreateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async createTargetDatabase");
        final CreateTargetDatabaseRequest interceptedRequest =
                CreateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetDatabaseResponse>
                transformer = CreateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>,
                        java.util.concurrent.Future<CreateTargetDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserAssessmentResponse> createUserAssessment(
            CreateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async createUserAssessment");
        final CreateUserAssessmentRequest interceptedRequest =
                CreateUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateUserAssessmentResponse>
                transformer = CreateUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserAssessmentRequest, CreateUserAssessmentResponse>,
                        java.util.concurrent.Future<CreateUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserAssessmentRequest, CreateUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateTargetDatabaseResponse> deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async deactivateTargetDatabase");
        final DeactivateTargetDatabaseRequest interceptedRequest =
                DeactivateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeactivateTargetDatabaseResponse>
                transformer = DeactivateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>,
                        java.util.concurrent.Future<DeactivateTargetDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>
            deleteDataSafePrivateEndpoint(
                    DeleteDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSafePrivateEndpointRequest,
                                    DeleteDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDataSafePrivateEndpoint");
        final DeleteDataSafePrivateEndpointRequest interceptedRequest =
                DeleteDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDataSafePrivateEndpointResponse>
                transformer = DeleteDataSafePrivateEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDataSafePrivateEndpointRequest, DeleteDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataSafePrivateEndpointRequest,
                                DeleteDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataSafePrivateEndpointRequest, DeleteDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOnPremConnectorResponse> deleteOnPremConnector(
            DeleteOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async deleteOnPremConnector");
        final DeleteOnPremConnectorRequest interceptedRequest =
                DeleteOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOnPremConnectorResponse>
                transformer = DeleteOnPremConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>,
                        java.util.concurrent.Future<DeleteOnPremConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityAssessmentResponse> deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityAssessment");
        final DeleteSecurityAssessmentRequest interceptedRequest =
                DeleteSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSecurityAssessmentResponse>
                transformer = DeleteSecurityAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>,
                        java.util.concurrent.Future<DeleteSecurityAssessmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDatabaseResponse> deleteTargetDatabase(
            DeleteTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async deleteTargetDatabase");
        final DeleteTargetDatabaseRequest interceptedRequest =
                DeleteTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetDatabaseResponse>
                transformer = DeleteTargetDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>,
                        java.util.concurrent.Future<DeleteTargetDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAssessmentResponse> deleteUserAssessment(
            DeleteUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async deleteUserAssessment");
        final DeleteUserAssessmentRequest interceptedRequest =
                DeleteUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteUserAssessmentResponse>
                transformer = DeleteUserAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>,
                        java.util.concurrent.Future<DeleteUserAssessmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadPrivilegeScriptResponse> downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                    handler) {
        LOG.trace("Called async downloadPrivilegeScript");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadPrivilegeScript returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadPrivilegeScriptRequest interceptedRequest =
                DownloadPrivilegeScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadPrivilegeScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadPrivilegeScriptResponse>
                transformer = DownloadPrivilegeScriptConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>,
                        java.util.concurrent.Future<DownloadPrivilegeScriptResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>
            downloadSecurityAssessmentReport(
                    DownloadSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSecurityAssessmentReportRequest,
                                    DownloadSecurityAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async downloadSecurityAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadSecurityAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadSecurityAssessmentReportRequest interceptedRequest =
                DownloadSecurityAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadSecurityAssessmentReportResponse>
                transformer = DownloadSecurityAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadSecurityAssessmentReportRequest,
                        DownloadSecurityAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadSecurityAssessmentReportRequest,
                                DownloadSecurityAssessmentReportResponse>,
                        java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadSecurityAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadSecurityAssessmentReportRequest,
                    DownloadSecurityAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadUserAssessmentReportResponse>
            downloadUserAssessmentReport(
                    DownloadUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadUserAssessmentReportRequest,
                                    DownloadUserAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async downloadUserAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadUserAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadUserAssessmentReportRequest interceptedRequest =
                DownloadUserAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadUserAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadUserAssessmentReportResponse>
                transformer = DownloadUserAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadUserAssessmentReportRequest, DownloadUserAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadUserAssessmentReportRequest,
                                DownloadUserAssessmentReportResponse>,
                        java.util.concurrent.Future<DownloadUserAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadUserAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadUserAssessmentReportRequest, DownloadUserAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableDataSafeConfigurationResponse>
            enableDataSafeConfiguration(
                    EnableDataSafeConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableDataSafeConfigurationRequest,
                                    EnableDataSafeConfigurationResponse>
                            handler) {
        LOG.trace("Called async enableDataSafeConfiguration");
        final EnableDataSafeConfigurationRequest interceptedRequest =
                EnableDataSafeConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableDataSafeConfigurationResponse>
                transformer = EnableDataSafeConfigurationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        EnableDataSafeConfigurationRequest, EnableDataSafeConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableDataSafeConfigurationRequest,
                                EnableDataSafeConfigurationResponse>,
                        java.util.concurrent.Future<EnableDataSafeConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableDataSafeConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableDataSafeConfigurationRequest, EnableDataSafeConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>
            generateOnPremConnectorConfiguration(
                    GenerateOnPremConnectorConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateOnPremConnectorConfigurationRequest,
                                    GenerateOnPremConnectorConfigurationResponse>
                            handler) {
        LOG.trace("Called async generateOnPremConnectorConfiguration");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "generateOnPremConnectorConfiguration returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GenerateOnPremConnectorConfigurationRequest interceptedRequest =
                GenerateOnPremConnectorConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateOnPremConnectorConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateOnPremConnectorConfigurationResponse>
                transformer = GenerateOnPremConnectorConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateOnPremConnectorConfigurationRequest,
                        GenerateOnPremConnectorConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateOnPremConnectorConfigurationRequest,
                                GenerateOnPremConnectorConfigurationResponse>,
                        java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateOnPremConnectorConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateOnPremConnectorConfigurationRequest,
                    GenerateOnPremConnectorConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>
            generateSecurityAssessmentReport(
                    GenerateSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSecurityAssessmentReportRequest,
                                    GenerateSecurityAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async generateSecurityAssessmentReport");
        final GenerateSecurityAssessmentReportRequest interceptedRequest =
                GenerateSecurityAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateSecurityAssessmentReportResponse>
                transformer = GenerateSecurityAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateSecurityAssessmentReportRequest,
                        GenerateSecurityAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateSecurityAssessmentReportRequest,
                                GenerateSecurityAssessmentReportResponse>,
                        java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateSecurityAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateSecurityAssessmentReportRequest,
                    GenerateSecurityAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateUserAssessmentReportResponse>
            generateUserAssessmentReport(
                    GenerateUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateUserAssessmentReportRequest,
                                    GenerateUserAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async generateUserAssessmentReport");
        final GenerateUserAssessmentReportRequest interceptedRequest =
                GenerateUserAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateUserAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateUserAssessmentReportResponse>
                transformer = GenerateUserAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateUserAssessmentReportRequest, GenerateUserAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateUserAssessmentReportRequest,
                                GenerateUserAssessmentReportResponse>,
                        java.util.concurrent.Future<GenerateUserAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateUserAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateUserAssessmentReportRequest, GenerateUserAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSafeConfigurationResponse> getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                    handler) {
        LOG.trace("Called async getDataSafeConfiguration");
        final GetDataSafeConfigurationRequest interceptedRequest =
                GetDataSafeConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataSafeConfigurationResponse>
                transformer = GetDataSafeConfigurationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>,
                        java.util.concurrent.Future<GetDataSafeConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSafePrivateEndpointResponse>
            getDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSafePrivateEndpointRequest,
                                    GetDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDataSafePrivateEndpoint");
        final GetDataSafePrivateEndpointRequest interceptedRequest =
                GetDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataSafePrivateEndpointResponse>
                transformer = GetDataSafePrivateEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSafePrivateEndpointRequest,
                                GetDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDataSafePrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOnPremConnectorResponse> getOnPremConnector(
            GetOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async getOnPremConnector");
        final GetOnPremConnectorRequest interceptedRequest =
                GetOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetOnPremConnectorResponse>
                transformer = GetOnPremConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOnPremConnectorRequest, GetOnPremConnectorResponse>,
                        java.util.concurrent.Future<GetOnPremConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOnPremConnectorRequest, GetOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentResponse> getSecurityAssessment(
            GetSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async getSecurityAssessment");
        final GetSecurityAssessmentRequest interceptedRequest =
                GetSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentResponse>
                transformer = GetSecurityAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>,
                        java.util.concurrent.Future<GetSecurityAssessmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>
            getSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAssessmentComparisonRequest,
                                    GetSecurityAssessmentComparisonResponse>
                            handler) {
        LOG.trace("Called async getSecurityAssessmentComparison");
        final GetSecurityAssessmentComparisonRequest interceptedRequest =
                GetSecurityAssessmentComparisonConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentComparisonConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentComparisonResponse>
                transformer = GetSecurityAssessmentComparisonConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityAssessmentComparisonRequest,
                        GetSecurityAssessmentComparisonResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityAssessmentComparisonRequest,
                                GetSecurityAssessmentComparisonResponse>,
                        java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityAssessmentComparisonRequest,
                    GetSecurityAssessmentComparisonResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetDatabaseResponse> getTargetDatabase(
            GetTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getTargetDatabase");
        final GetTargetDatabaseRequest interceptedRequest =
                GetTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTargetDatabaseResponse>
                transformer = GetTargetDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDatabaseRequest, GetTargetDatabaseResponse>,
                        java.util.concurrent.Future<GetTargetDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDatabaseRequest, GetTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentResponse> getUserAssessment(
            GetUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserAssessmentRequest, GetUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async getUserAssessment");
        final GetUserAssessmentRequest interceptedRequest =
                GetUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUserAssessmentResponse>
                transformer = GetUserAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetUserAssessmentRequest, GetUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserAssessmentRequest, GetUserAssessmentResponse>,
                        java.util.concurrent.Future<GetUserAssessmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserAssessmentRequest, GetUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentComparisonResponse>
            getUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserAssessmentComparisonRequest,
                                    GetUserAssessmentComparisonResponse>
                            handler) {
        LOG.trace("Called async getUserAssessmentComparison");
        final GetUserAssessmentComparisonRequest interceptedRequest =
                GetUserAssessmentComparisonConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentComparisonConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserAssessmentComparisonResponse>
                transformer = GetUserAssessmentComparisonConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserAssessmentComparisonRequest,
                                GetUserAssessmentComparisonResponse>,
                        java.util.concurrent.Future<GetUserAssessmentComparisonResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

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
    public java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpoints(
                    ListDataSafePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSafePrivateEndpointsRequest,
                                    ListDataSafePrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDataSafePrivateEndpoints");
        final ListDataSafePrivateEndpointsRequest interceptedRequest =
                ListDataSafePrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSafePrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataSafePrivateEndpointsResponse>
                transformer = ListDataSafePrivateEndpointsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDataSafePrivateEndpointsRequest, ListDataSafePrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataSafePrivateEndpointsRequest,
                                ListDataSafePrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataSafePrivateEndpointsRequest, ListDataSafePrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResponse> listFindings(
            ListFindingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                    handler) {
        LOG.trace("Called async listFindings");
        final ListFindingsRequest interceptedRequest =
                ListFindingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFindingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFindingsResponse>
                transformer = ListFindingsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFindingsRequest, ListFindingsResponse>,
                        java.util.concurrent.Future<ListFindingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFindingsRequest, ListFindingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResponse> listGrants(
            ListGrantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse>
                    handler) {
        LOG.trace("Called async listGrants");
        final ListGrantsRequest interceptedRequest = ListGrantsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGrantsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGrantsResponse>
                transformer = ListGrantsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGrantsRequest, ListGrantsResponse>,
                        java.util.concurrent.Future<ListGrantsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGrantsRequest, ListGrantsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOnPremConnectorsResponse> listOnPremConnectors(
            ListOnPremConnectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                    handler) {
        LOG.trace("Called async listOnPremConnectors");
        final ListOnPremConnectorsRequest interceptedRequest =
                ListOnPremConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOnPremConnectorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOnPremConnectorsResponse>
                transformer = ListOnPremConnectorsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>,
                        java.util.concurrent.Future<ListOnPremConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAssessmentsResponse> listSecurityAssessments(
            ListSecurityAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                    handler) {
        LOG.trace("Called async listSecurityAssessments");
        final ListSecurityAssessmentsRequest interceptedRequest =
                ListSecurityAssessmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityAssessmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSecurityAssessmentsResponse>
                transformer = ListSecurityAssessmentsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>,
                        java.util.concurrent.Future<ListSecurityAssessmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetDatabasesResponse> listTargetDatabases(
            ListTargetDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                    handler) {
        LOG.trace("Called async listTargetDatabases");
        final ListTargetDatabasesRequest interceptedRequest =
                ListTargetDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetDatabasesResponse>
                transformer = ListTargetDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDatabasesRequest, ListTargetDatabasesResponse>,
                        java.util.concurrent.Future<ListTargetDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDatabasesRequest, ListTargetDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserAnalyticsResponse> listUserAnalytics(
            ListUserAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listUserAnalytics");
        final ListUserAnalyticsRequest interceptedRequest =
                ListUserAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUserAnalyticsResponse>
                transformer = ListUserAnalyticsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAnalyticsRequest, ListUserAnalyticsResponse>,
                        java.util.concurrent.Future<ListUserAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAnalyticsRequest, ListUserAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserAssessmentsResponse> listUserAssessments(
            ListUserAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                    handler) {
        LOG.trace("Called async listUserAssessments");
        final ListUserAssessmentsRequest interceptedRequest =
                ListUserAssessmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAssessmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserAssessmentsResponse>
                transformer = ListUserAssessmentsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAssessmentsRequest, ListUserAssessmentsResponse>,
                        java.util.concurrent.Future<ListUserAssessmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAssessmentsRequest, ListUserAssessmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer = ListUsersConverter.fromResponse();

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
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();

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
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();

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
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

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
    public java.util.concurrent.Future<RefreshSecurityAssessmentResponse> refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async refreshSecurityAssessment");
        final RefreshSecurityAssessmentRequest interceptedRequest =
                RefreshSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RefreshSecurityAssessmentResponse>
                transformer = RefreshSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshSecurityAssessmentRequest,
                                RefreshSecurityAssessmentResponse>,
                        java.util.concurrent.Future<RefreshSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshUserAssessmentResponse> refreshUserAssessment(
            RefreshUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async refreshUserAssessment");
        final RefreshUserAssessmentRequest interceptedRequest =
                RefreshUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RefreshUserAssessmentResponse>
                transformer = RefreshUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>,
                        java.util.concurrent.Future<RefreshUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>
            setSecurityAssessmentBaseline(
                    SetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SetSecurityAssessmentBaselineRequest,
                                    SetSecurityAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async setSecurityAssessmentBaseline");
        final SetSecurityAssessmentBaselineRequest interceptedRequest =
                SetSecurityAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetSecurityAssessmentBaselineResponse>
                transformer = SetSecurityAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        SetSecurityAssessmentBaselineRequest, SetSecurityAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetSecurityAssessmentBaselineRequest,
                                SetSecurityAssessmentBaselineResponse>,
                        java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBaseLineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetSecurityAssessmentBaselineRequest, SetSecurityAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetUserAssessmentBaselineResponse> setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                    handler) {
        LOG.trace("Called async setUserAssessmentBaseline");
        final SetUserAssessmentBaselineRequest interceptedRequest =
                SetUserAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetUserAssessmentBaselineResponse>
                transformer = SetUserAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetUserAssessmentBaselineRequest,
                                SetUserAssessmentBaselineResponse>,
                        java.util.concurrent.Future<SetUserAssessmentBaselineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBaseLineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>
            unsetSecurityAssessmentBaseline(
                    UnsetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetSecurityAssessmentBaselineRequest,
                                    UnsetSecurityAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async unsetSecurityAssessmentBaseline");
        final UnsetSecurityAssessmentBaselineRequest interceptedRequest =
                UnsetSecurityAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetSecurityAssessmentBaselineResponse>
                transformer = UnsetSecurityAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UnsetSecurityAssessmentBaselineRequest,
                        UnsetSecurityAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnsetSecurityAssessmentBaselineRequest,
                                UnsetSecurityAssessmentBaselineResponse>,
                        java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnsetSecurityAssessmentBaselineRequest,
                    UnsetSecurityAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse>
            unsetUserAssessmentBaseline(
                    UnsetUserAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetUserAssessmentBaselineRequest,
                                    UnsetUserAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async unsetUserAssessmentBaseline");
        final UnsetUserAssessmentBaselineRequest interceptedRequest =
                UnsetUserAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetUserAssessmentBaselineResponse>
                transformer = UnsetUserAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UnsetUserAssessmentBaselineRequest, UnsetUserAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnsetUserAssessmentBaselineRequest,
                                UnsetUserAssessmentBaselineResponse>,
                        java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnsetUserAssessmentBaselineRequest, UnsetUserAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>
            updateDataSafePrivateEndpoint(
                    UpdateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSafePrivateEndpointRequest,
                                    UpdateDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDataSafePrivateEndpoint");
        final UpdateDataSafePrivateEndpointRequest interceptedRequest =
                UpdateDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDataSafePrivateEndpointResponse>
                transformer = UpdateDataSafePrivateEndpointConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDataSafePrivateEndpointRequest, UpdateDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataSafePrivateEndpointRequest,
                                UpdateDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataSafePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataSafePrivateEndpointRequest, UpdateDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorResponse> updateOnPremConnector(
            UpdateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async updateOnPremConnector");
        final UpdateOnPremConnectorRequest interceptedRequest =
                UpdateOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorResponse>
                transformer = UpdateOnPremConnectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>,
                        java.util.concurrent.Future<UpdateOnPremConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOnPremConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse>
            updateOnPremConnectorWallet(
                    UpdateOnPremConnectorWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOnPremConnectorWalletRequest,
                                    UpdateOnPremConnectorWalletResponse>
                            handler) {
        LOG.trace("Called async updateOnPremConnectorWallet");
        final UpdateOnPremConnectorWalletRequest interceptedRequest =
                UpdateOnPremConnectorWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorWalletConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorWalletResponse>
                transformer = UpdateOnPremConnectorWalletConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOnPremConnectorWalletRequest, UpdateOnPremConnectorWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOnPremConnectorWalletRequest,
                                UpdateOnPremConnectorWalletResponse>,
                        java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOnPremConnectorWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOnPremConnectorWalletRequest, UpdateOnPremConnectorWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityAssessmentResponse> updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async updateSecurityAssessment");
        final UpdateSecurityAssessmentRequest interceptedRequest =
                UpdateSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSecurityAssessmentResponse>
                transformer = UpdateSecurityAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>,
                        java.util.concurrent.Future<UpdateSecurityAssessmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDatabaseResponse> updateTargetDatabase(
            UpdateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateTargetDatabase");
        final UpdateTargetDatabaseRequest interceptedRequest =
                UpdateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetDatabaseResponse>
                transformer = UpdateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>,
                        java.util.concurrent.Future<UpdateTargetDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAssessmentResponse> updateUserAssessment(
            UpdateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async updateUserAssessment");
        final UpdateUserAssessmentRequest interceptedRequest =
                UpdateUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateUserAssessmentResponse>
                transformer = UpdateUserAssessmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>,
                        java.util.concurrent.Future<UpdateUserAssessmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
