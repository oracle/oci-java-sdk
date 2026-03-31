/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.batch.internal.http.*;
import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for BatchComputing service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class BatchComputingAsyncClient implements BatchComputingAsync {
    /**
     * Service instance for BatchComputing.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BatchComputingClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://batch.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BatchComputingAsyncClient.class);

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

    // This pattern matches substrings that are enclosed within curly braces {}
    private static final Pattern PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES =
            Pattern.compile("\\{([^}]+)\\}");

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
    public BatchComputingAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
    public BatchComputingAsyncClient(
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
        java.util.List<com.oracle.bmc.internal.SpiClientConfigurator>
                additionalSpiClientConfigurators =
                        com.oracle.bmc.util.internal.SpiClientConfiguratorUtils
                                .getEnabledSpiClientConfigurators();
        allConfigurators.addAll(additionalSpiClientConfigurators);
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
                    Builder, BatchComputingAsyncClient> {
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
        public BatchComputingAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new BatchComputingAsyncClient(
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
        String value = client.getEndpoint();
        if (value.contains("{")) {
            Matcher matcher = PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES.matcher(value);
            java.lang.StringBuilder params = new java.lang.StringBuilder();
            while (matcher.find()) {
                if (params.length() > 0) {
                    params.append(", ");
                }
                params.append("{").append(matcher.group(1)).append("}");
            }
            LOG.warn(
                    "Parameters like {} get replaced with appropriate values at request time.",
                    params.toString());
        }
        return client.getEndpoint();
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

    @Override
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
    public java.util.concurrent.Future<CancelBatchJobResponse> cancelBatchJob(
            CancelBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelBatchJobRequest, CancelBatchJobResponse>
                    handler) {
        LOG.trace("Called async cancelBatchJob");
        final CancelBatchJobRequest interceptedRequest =
                CancelBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CancelBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/CancelBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelBatchJobResponse>
                transformer =
                        CancelBatchJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelBatchJobRequest, CancelBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelBatchJobRequest, CancelBatchJobResponse>,
                        java.util.concurrent.Future<CancelBatchJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelBatchJobRequest, CancelBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchContextCompartmentResponse>
            changeBatchContextCompartment(
                    ChangeBatchContextCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchContextCompartmentRequest,
                                    ChangeBatchContextCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBatchContextCompartment");
        final ChangeBatchContextCompartmentRequest interceptedRequest =
                ChangeBatchContextCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBatchContextCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ChangeBatchContextCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/ChangeBatchContextCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBatchContextCompartmentResponse>
                transformer =
                        ChangeBatchContextCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBatchContextCompartmentRequest, ChangeBatchContextCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBatchContextCompartmentRequest,
                                ChangeBatchContextCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBatchContextCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBatchContextCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBatchContextCompartmentRequest, ChangeBatchContextCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchJobCompartmentResponse> changeBatchJobCompartment(
            ChangeBatchJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeBatchJobCompartmentRequest, ChangeBatchJobCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeBatchJobCompartment");
        final ChangeBatchJobCompartmentRequest interceptedRequest =
                ChangeBatchJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBatchJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ChangeBatchJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/ChangeBatchJobCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBatchJobCompartmentResponse>
                transformer =
                        ChangeBatchJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBatchJobCompartmentRequest, ChangeBatchJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBatchJobCompartmentRequest,
                                ChangeBatchJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBatchJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBatchJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBatchJobCompartmentRequest, ChangeBatchJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchJobPoolCompartmentResponse>
            changeBatchJobPoolCompartment(
                    ChangeBatchJobPoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchJobPoolCompartmentRequest,
                                    ChangeBatchJobPoolCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBatchJobPoolCompartment");
        final ChangeBatchJobPoolCompartmentRequest interceptedRequest =
                ChangeBatchJobPoolCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBatchJobPoolCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ChangeBatchJobPoolCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/ChangeBatchJobPoolCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBatchJobPoolCompartmentResponse>
                transformer =
                        ChangeBatchJobPoolCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBatchJobPoolCompartmentRequest, ChangeBatchJobPoolCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBatchJobPoolCompartmentRequest,
                                ChangeBatchJobPoolCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBatchJobPoolCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBatchJobPoolCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBatchJobPoolCompartmentRequest, ChangeBatchJobPoolCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchTaskEnvironmentCompartmentResponse>
            changeBatchTaskEnvironmentCompartment(
                    ChangeBatchTaskEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskEnvironmentCompartmentRequest,
                                    ChangeBatchTaskEnvironmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBatchTaskEnvironmentCompartment");
        final ChangeBatchTaskEnvironmentCompartmentRequest interceptedRequest =
                ChangeBatchTaskEnvironmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBatchTaskEnvironmentCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ChangeBatchTaskEnvironmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironment/ChangeBatchTaskEnvironmentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBatchTaskEnvironmentCompartmentResponse>
                transformer =
                        ChangeBatchTaskEnvironmentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBatchTaskEnvironmentCompartmentRequest,
                        ChangeBatchTaskEnvironmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBatchTaskEnvironmentCompartmentRequest,
                                ChangeBatchTaskEnvironmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBatchTaskEnvironmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeBatchTaskEnvironmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBatchTaskEnvironmentCompartmentRequest,
                    ChangeBatchTaskEnvironmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBatchTaskProfileCompartmentResponse>
            changeBatchTaskProfileCompartment(
                    ChangeBatchTaskProfileCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskProfileCompartmentRequest,
                                    ChangeBatchTaskProfileCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBatchTaskProfileCompartment");
        final ChangeBatchTaskProfileCompartmentRequest interceptedRequest =
                ChangeBatchTaskProfileCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBatchTaskProfileCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ChangeBatchTaskProfileCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfile/ChangeBatchTaskProfileCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBatchTaskProfileCompartmentResponse>
                transformer =
                        ChangeBatchTaskProfileCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBatchTaskProfileCompartmentRequest,
                        ChangeBatchTaskProfileCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBatchTaskProfileCompartmentRequest,
                                ChangeBatchTaskProfileCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBatchTaskProfileCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBatchTaskProfileCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBatchTaskProfileCompartmentRequest,
                    ChangeBatchTaskProfileCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBatchContextResponse> createBatchContext(
            CreateBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchContextRequest, CreateBatchContextResponse>
                    handler) {
        LOG.trace("Called async createBatchContext");
        final CreateBatchContextRequest interceptedRequest =
                CreateBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CreateBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/CreateBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBatchContextResponse>
                transformer =
                        CreateBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBatchContextRequest, CreateBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBatchContextRequest, CreateBatchContextResponse>,
                        java.util.concurrent.Future<CreateBatchContextResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBatchContextDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBatchContextRequest, CreateBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBatchJobResponse> createBatchJob(
            CreateBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchJobRequest, CreateBatchJobResponse>
                    handler) {
        LOG.trace("Called async createBatchJob");
        final CreateBatchJobRequest interceptedRequest =
                CreateBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CreateBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/CreateBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBatchJobResponse>
                transformer =
                        CreateBatchJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBatchJobRequest, CreateBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBatchJobRequest, CreateBatchJobResponse>,
                        java.util.concurrent.Future<CreateBatchJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBatchJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBatchJobRequest, CreateBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBatchJobPoolResponse> createBatchJobPool(
            CreateBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async createBatchJobPool");
        final CreateBatchJobPoolRequest interceptedRequest =
                CreateBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CreateBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/CreateBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBatchJobPoolResponse>
                transformer =
                        CreateBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>,
                        java.util.concurrent.Future<CreateBatchJobPoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBatchJobPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBatchTaskEnvironmentResponse>
            createBatchTaskEnvironment(
                    CreateBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateBatchTaskEnvironmentRequest,
                                    CreateBatchTaskEnvironmentResponse>
                            handler) {
        LOG.trace("Called async createBatchTaskEnvironment");
        final CreateBatchTaskEnvironmentRequest interceptedRequest =
                CreateBatchTaskEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBatchTaskEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CreateBatchTaskEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironment/CreateBatchTaskEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateBatchTaskEnvironmentResponse>
                transformer =
                        CreateBatchTaskEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBatchTaskEnvironmentRequest, CreateBatchTaskEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBatchTaskEnvironmentRequest,
                                CreateBatchTaskEnvironmentResponse>,
                        java.util.concurrent.Future<CreateBatchTaskEnvironmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBatchTaskEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBatchTaskEnvironmentRequest, CreateBatchTaskEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBatchTaskProfileResponse> createBatchTaskProfile(
            CreateBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>
                    handler) {
        LOG.trace("Called async createBatchTaskProfile");
        final CreateBatchTaskProfileRequest interceptedRequest =
                CreateBatchTaskProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBatchTaskProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "CreateBatchTaskProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfile/CreateBatchTaskProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBatchTaskProfileResponse>
                transformer =
                        CreateBatchTaskProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>,
                        java.util.concurrent.Future<CreateBatchTaskProfileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBatchTaskProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchContextResponse> deleteBatchContext(
            DeleteBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchContextRequest, DeleteBatchContextResponse>
                    handler) {
        LOG.trace("Called async deleteBatchContext");
        final DeleteBatchContextRequest interceptedRequest =
                DeleteBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "DeleteBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/DeleteBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBatchContextResponse>
                transformer =
                        DeleteBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBatchContextRequest, DeleteBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBatchContextRequest, DeleteBatchContextResponse>,
                        java.util.concurrent.Future<DeleteBatchContextResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBatchContextRequest, DeleteBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchJobPoolResponse> deleteBatchJobPool(
            DeleteBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async deleteBatchJobPool");
        final DeleteBatchJobPoolRequest interceptedRequest =
                DeleteBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "DeleteBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/DeleteBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBatchJobPoolResponse>
                transformer =
                        DeleteBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>,
                        java.util.concurrent.Future<DeleteBatchJobPoolResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchTaskEnvironmentResponse>
            deleteBatchTaskEnvironment(
                    DeleteBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteBatchTaskEnvironmentRequest,
                                    DeleteBatchTaskEnvironmentResponse>
                            handler) {
        LOG.trace("Called async deleteBatchTaskEnvironment");
        final DeleteBatchTaskEnvironmentRequest interceptedRequest =
                DeleteBatchTaskEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBatchTaskEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "DeleteBatchTaskEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironment/DeleteBatchTaskEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteBatchTaskEnvironmentResponse>
                transformer =
                        DeleteBatchTaskEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBatchTaskEnvironmentRequest, DeleteBatchTaskEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBatchTaskEnvironmentRequest,
                                DeleteBatchTaskEnvironmentResponse>,
                        java.util.concurrent.Future<DeleteBatchTaskEnvironmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBatchTaskEnvironmentRequest, DeleteBatchTaskEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchTaskProfileResponse> deleteBatchTaskProfile(
            DeleteBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>
                    handler) {
        LOG.trace("Called async deleteBatchTaskProfile");
        final DeleteBatchTaskProfileRequest interceptedRequest =
                DeleteBatchTaskProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBatchTaskProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "DeleteBatchTaskProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfile/DeleteBatchTaskProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBatchTaskProfileResponse>
                transformer =
                        DeleteBatchTaskProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>,
                        java.util.concurrent.Future<DeleteBatchTaskProfileResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchContextResponse> getBatchContext(
            GetBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchContextRequest, GetBatchContextResponse>
                    handler) {
        LOG.trace("Called async getBatchContext");
        final GetBatchContextRequest interceptedRequest =
                GetBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/GetBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBatchContextResponse>
                transformer =
                        GetBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBatchContextRequest, GetBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchContextRequest, GetBatchContextResponse>,
                        java.util.concurrent.Future<GetBatchContextResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchContextRequest, GetBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchJobResponse> getBatchJob(
            GetBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBatchJobRequest, GetBatchJobResponse>
                    handler) {
        LOG.trace("Called async getBatchJob");
        final GetBatchJobRequest interceptedRequest =
                GetBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/GetBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBatchJobResponse>
                transformer =
                        GetBatchJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBatchJobRequest, GetBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchJobRequest, GetBatchJobResponse>,
                        java.util.concurrent.Future<GetBatchJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchJobRequest, GetBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchJobPoolResponse> getBatchJobPool(
            GetBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchJobPoolRequest, GetBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async getBatchJobPool");
        final GetBatchJobPoolRequest interceptedRequest =
                GetBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/GetBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBatchJobPoolResponse>
                transformer =
                        GetBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBatchJobPoolRequest, GetBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchJobPoolRequest, GetBatchJobPoolResponse>,
                        java.util.concurrent.Future<GetBatchJobPoolResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchJobPoolRequest, GetBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskResponse> getBatchTask(
            GetBatchTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBatchTaskRequest, GetBatchTaskResponse>
                    handler) {
        LOG.trace("Called async getBatchTask");
        final GetBatchTaskRequest interceptedRequest =
                GetBatchTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTask/GetBatchTask");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBatchTaskResponse>
                transformer =
                        GetBatchTaskConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBatchTaskRequest, GetBatchTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchTaskRequest, GetBatchTaskResponse>,
                        java.util.concurrent.Future<GetBatchTaskResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchTaskRequest, GetBatchTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskEnvironmentResponse> getBatchTaskEnvironment(
            GetBatchTaskEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>
                    handler) {
        LOG.trace("Called async getBatchTaskEnvironment");
        final GetBatchTaskEnvironmentRequest interceptedRequest =
                GetBatchTaskEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchTaskEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchTaskEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironment/GetBatchTaskEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetBatchTaskEnvironmentResponse>
                transformer =
                        GetBatchTaskEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>,
                        java.util.concurrent.Future<GetBatchTaskEnvironmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBatchTaskProfileResponse> getBatchTaskProfile(
            GetBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>
                    handler) {
        LOG.trace("Called async getBatchTaskProfile");
        final GetBatchTaskProfileRequest interceptedRequest =
                GetBatchTaskProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBatchTaskProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "GetBatchTaskProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfile/GetBatchTaskProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBatchTaskProfileResponse>
                transformer =
                        GetBatchTaskProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>,
                        java.util.concurrent.Future<GetBatchTaskProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "BatchComputing",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListBatchContextShapesResponse> listBatchContextShapes(
            ListBatchContextShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextShapesRequest, ListBatchContextShapesResponse>
                    handler) {
        LOG.trace("Called async listBatchContextShapes");
        final ListBatchContextShapesRequest interceptedRequest =
                ListBatchContextShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchContextShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchContextShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContextShapeCollection/ListBatchContextShapes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchContextShapesResponse>
                transformer =
                        ListBatchContextShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBatchContextShapesRequest, ListBatchContextShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchContextShapesRequest, ListBatchContextShapesResponse>,
                        java.util.concurrent.Future<ListBatchContextShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchContextShapesRequest, ListBatchContextShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchContextsResponse> listBatchContexts(
            ListBatchContextsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextsRequest, ListBatchContextsResponse>
                    handler) {
        LOG.trace("Called async listBatchContexts");
        final ListBatchContextsRequest interceptedRequest =
                ListBatchContextsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchContextsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchContexts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContextCollection/ListBatchContexts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchContextsResponse>
                transformer =
                        ListBatchContextsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBatchContextsRequest, ListBatchContextsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchContextsRequest, ListBatchContextsResponse>,
                        java.util.concurrent.Future<ListBatchContextsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchContextsRequest, ListBatchContextsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobPoolsResponse> listBatchJobPools(
            ListBatchJobPoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>
                    handler) {
        LOG.trace("Called async listBatchJobPools");
        final ListBatchJobPoolsRequest interceptedRequest =
                ListBatchJobPoolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchJobPoolsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchJobPools",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPoolCollection/ListBatchJobPools");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchJobPoolsResponse>
                transformer =
                        ListBatchJobPoolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>,
                        java.util.concurrent.Future<ListBatchJobPoolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobTasksResponse> listBatchJobTasks(
            ListBatchJobTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobTasksRequest, ListBatchJobTasksResponse>
                    handler) {
        LOG.trace("Called async listBatchJobTasks");
        final ListBatchJobTasksRequest interceptedRequest =
                ListBatchJobTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchJobTasksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchJobTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskCollection/ListBatchJobTasks");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchJobTasksResponse>
                transformer =
                        ListBatchJobTasksConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBatchJobTasksRequest, ListBatchJobTasksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchJobTasksRequest, ListBatchJobTasksResponse>,
                        java.util.concurrent.Future<ListBatchJobTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchJobTasksRequest, ListBatchJobTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobsResponse> listBatchJobs(
            ListBatchJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBatchJobsRequest, ListBatchJobsResponse>
                    handler) {
        LOG.trace("Called async listBatchJobs");
        final ListBatchJobsRequest interceptedRequest =
                ListBatchJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobCollection/ListBatchJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchJobsResponse>
                transformer =
                        ListBatchJobsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBatchJobsRequest, ListBatchJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchJobsRequest, ListBatchJobsResponse>,
                        java.util.concurrent.Future<ListBatchJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchJobsRequest, ListBatchJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchTaskEnvironmentsResponse> listBatchTaskEnvironments(
            ListBatchTaskEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>
                    handler) {
        LOG.trace("Called async listBatchTaskEnvironments");
        final ListBatchTaskEnvironmentsRequest interceptedRequest =
                ListBatchTaskEnvironmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchTaskEnvironmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchTaskEnvironments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironmentCollection/ListBatchTaskEnvironments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListBatchTaskEnvironmentsResponse>
                transformer =
                        ListBatchTaskEnvironmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchTaskEnvironmentsRequest,
                                ListBatchTaskEnvironmentsResponse>,
                        java.util.concurrent.Future<ListBatchTaskEnvironmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchTaskProfilesResponse> listBatchTaskProfiles(
            ListBatchTaskProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>
                    handler) {
        LOG.trace("Called async listBatchTaskProfiles");
        final ListBatchTaskProfilesRequest interceptedRequest =
                ListBatchTaskProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchTaskProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchTaskProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfileCollection/ListBatchTaskProfiles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchTaskProfilesResponse>
                transformer =
                        ListBatchTaskProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>,
                        java.util.concurrent.Future<ListBatchTaskProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBatchTasksResponse> listBatchTasks(
            ListBatchTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTasksRequest, ListBatchTasksResponse>
                    handler) {
        LOG.trace("Called async listBatchTasks");
        final ListBatchTasksRequest interceptedRequest =
                ListBatchTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBatchTasksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "ListBatchTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskCollection/ListBatchTasks");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBatchTasksResponse>
                transformer =
                        ListBatchTasksConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBatchTasksRequest, ListBatchTasksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBatchTasksRequest, ListBatchTasksResponse>,
                        java.util.concurrent.Future<ListBatchTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBatchTasksRequest, ListBatchTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "BatchComputing",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/WorkRequestError/ListWorkRequestErrors");
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
                        "BatchComputing",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "BatchComputing",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<PauseBatchJobResponse> pauseBatchJob(
            PauseBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PauseBatchJobRequest, PauseBatchJobResponse>
                    handler) {
        LOG.trace("Called async pauseBatchJob");
        final PauseBatchJobRequest interceptedRequest =
                PauseBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PauseBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "PauseBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/PauseBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, PauseBatchJobResponse>
                transformer =
                        PauseBatchJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PauseBatchJobRequest, PauseBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PauseBatchJobRequest, PauseBatchJobResponse>,
                        java.util.concurrent.Future<PauseBatchJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPauseBatchJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PauseBatchJobRequest, PauseBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartBatchContextResponse> startBatchContext(
            StartBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBatchContextRequest, StartBatchContextResponse>
                    handler) {
        LOG.trace("Called async startBatchContext");
        final StartBatchContextRequest interceptedRequest =
                StartBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "StartBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/StartBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, StartBatchContextResponse>
                transformer =
                        StartBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartBatchContextRequest, StartBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartBatchContextRequest, StartBatchContextResponse>,
                        java.util.concurrent.Future<StartBatchContextResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStartBatchContextDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartBatchContextRequest, StartBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartBatchJobPoolResponse> startBatchJobPool(
            StartBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBatchJobPoolRequest, StartBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async startBatchJobPool");
        final StartBatchJobPoolRequest interceptedRequest =
                StartBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "StartBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/StartBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, StartBatchJobPoolResponse>
                transformer =
                        StartBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartBatchJobPoolRequest, StartBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartBatchJobPoolRequest, StartBatchJobPoolResponse>,
                        java.util.concurrent.Future<StartBatchJobPoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStartBatchJobPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartBatchJobPoolRequest, StartBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopBatchContextResponse> stopBatchContext(
            StopBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBatchContextRequest, StopBatchContextResponse>
                    handler) {
        LOG.trace("Called async stopBatchContext");
        final StopBatchContextRequest interceptedRequest =
                StopBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "StopBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/StopBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, StopBatchContextResponse>
                transformer =
                        StopBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopBatchContextRequest, StopBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopBatchContextRequest, StopBatchContextResponse>,
                        java.util.concurrent.Future<StopBatchContextResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStopBatchContextDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopBatchContextRequest, StopBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopBatchJobPoolResponse> stopBatchJobPool(
            StopBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBatchJobPoolRequest, StopBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async stopBatchJobPool");
        final StopBatchJobPoolRequest interceptedRequest =
                StopBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "StopBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/StopBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, StopBatchJobPoolResponse>
                transformer =
                        StopBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopBatchJobPoolRequest, StopBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopBatchJobPoolRequest, StopBatchJobPoolResponse>,
                        java.util.concurrent.Future<StopBatchJobPoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStopBatchJobPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopBatchJobPoolRequest, StopBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnpauseBatchJobResponse> unpauseBatchJob(
            UnpauseBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnpauseBatchJobRequest, UnpauseBatchJobResponse>
                    handler) {
        LOG.trace("Called async unpauseBatchJob");
        final UnpauseBatchJobRequest interceptedRequest =
                UnpauseBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnpauseBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UnpauseBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/UnpauseBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UnpauseBatchJobResponse>
                transformer =
                        UnpauseBatchJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UnpauseBatchJobRequest, UnpauseBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnpauseBatchJobRequest, UnpauseBatchJobResponse>,
                        java.util.concurrent.Future<UnpauseBatchJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUnpauseBatchJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnpauseBatchJobRequest, UnpauseBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchContextResponse> updateBatchContext(
            UpdateBatchContextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchContextRequest, UpdateBatchContextResponse>
                    handler) {
        LOG.trace("Called async updateBatchContext");
        final UpdateBatchContextRequest interceptedRequest =
                UpdateBatchContextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBatchContextConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UpdateBatchContext",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchContext/UpdateBatchContext");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBatchContextResponse>
                transformer =
                        UpdateBatchContextConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBatchContextRequest, UpdateBatchContextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBatchContextRequest, UpdateBatchContextResponse>,
                        java.util.concurrent.Future<UpdateBatchContextResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBatchContextDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBatchContextRequest, UpdateBatchContextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchJobResponse> updateBatchJob(
            UpdateBatchJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchJobRequest, UpdateBatchJobResponse>
                    handler) {
        LOG.trace("Called async updateBatchJob");
        final UpdateBatchJobRequest interceptedRequest =
                UpdateBatchJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBatchJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UpdateBatchJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJob/UpdateBatchJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBatchJobResponse>
                transformer =
                        UpdateBatchJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBatchJobRequest, UpdateBatchJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBatchJobRequest, UpdateBatchJobResponse>,
                        java.util.concurrent.Future<UpdateBatchJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBatchJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBatchJobRequest, UpdateBatchJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchJobPoolResponse> updateBatchJobPool(
            UpdateBatchJobPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>
                    handler) {
        LOG.trace("Called async updateBatchJobPool");
        final UpdateBatchJobPoolRequest interceptedRequest =
                UpdateBatchJobPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBatchJobPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UpdateBatchJobPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchJobPool/UpdateBatchJobPool");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBatchJobPoolResponse>
                transformer =
                        UpdateBatchJobPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>,
                        java.util.concurrent.Future<UpdateBatchJobPoolResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBatchJobPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchTaskEnvironmentResponse>
            updateBatchTaskEnvironment(
                    UpdateBatchTaskEnvironmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateBatchTaskEnvironmentRequest,
                                    UpdateBatchTaskEnvironmentResponse>
                            handler) {
        LOG.trace("Called async updateBatchTaskEnvironment");
        final UpdateBatchTaskEnvironmentRequest interceptedRequest =
                UpdateBatchTaskEnvironmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBatchTaskEnvironmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UpdateBatchTaskEnvironment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskEnvironment/UpdateBatchTaskEnvironment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateBatchTaskEnvironmentResponse>
                transformer =
                        UpdateBatchTaskEnvironmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBatchTaskEnvironmentRequest, UpdateBatchTaskEnvironmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBatchTaskEnvironmentRequest,
                                UpdateBatchTaskEnvironmentResponse>,
                        java.util.concurrent.Future<UpdateBatchTaskEnvironmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBatchTaskEnvironmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBatchTaskEnvironmentRequest, UpdateBatchTaskEnvironmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchTaskProfileResponse> updateBatchTaskProfile(
            UpdateBatchTaskProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>
                    handler) {
        LOG.trace("Called async updateBatchTaskProfile");
        final UpdateBatchTaskProfileRequest interceptedRequest =
                UpdateBatchTaskProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBatchTaskProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "BatchComputing",
                        "UpdateBatchTaskProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/batch/20251031/BatchTaskProfile/UpdateBatchTaskProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBatchTaskProfileResponse>
                transformer =
                        UpdateBatchTaskProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>,
                        java.util.concurrent.Future<UpdateBatchTaskProfileResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBatchTaskProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
