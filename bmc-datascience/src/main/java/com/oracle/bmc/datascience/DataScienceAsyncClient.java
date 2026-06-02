/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.internal.http.*;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for DataScience service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataScienceAsyncClient implements DataScienceAsync {
    /**
     * Service instance for DataScience.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DataScienceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datascience.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataScienceAsyncClient.class);

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
    public DataScienceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                            "DataScienceAsyncClient",
                            "getJobArtifactContent,getMlApplicationHistoricalPackageContent,getMlApplicationPackageContent,getModelArtifactContent,getModelCustomMetadatumArtifactContent,getModelDefinedMetadatumArtifactContent,getModelGroupArtifactContent,getStepArtifactContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataScienceAsyncClient> {
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
        public DataScienceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DataScienceAsyncClient(
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
    public java.util.concurrent.Future<ActivateModelResponse> activateModel(
            ActivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                    handler) {
        LOG.trace("Called async activateModel");
        final ActivateModelRequest interceptedRequest =
                ActivateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ActivateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ActivateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, ActivateModelResponse>
                transformer =
                        ActivateModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateModelRequest, ActivateModelResponse>,
                        java.util.concurrent.Future<ActivateModelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateModelRequest, ActivateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateModelDeploymentResponse> activateModelDeployment(
            ActivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async activateModelDeployment");
        final ActivateModelDeploymentRequest interceptedRequest =
                ActivateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ActivateModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ActivateModelDeployment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ActivateModelDeploymentResponse>
                transformer =
                        ActivateModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>,
                        java.util.concurrent.Future<ActivateModelDeploymentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateModelGroupResponse> activateModelGroup(
            ActivateModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateModelGroupRequest, ActivateModelGroupResponse>
                    handler) {
        LOG.trace("Called async activateModelGroup");
        final ActivateModelGroupRequest interceptedRequest =
                ActivateModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ActivateModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/ActivateModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, ActivateModelGroupResponse>
                transformer =
                        ActivateModelGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ActivateModelGroupRequest, ActivateModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateModelGroupRequest, ActivateModelGroupResponse>,
                        java.util.concurrent.Future<ActivateModelGroupResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateModelGroupRequest, ActivateModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateNotebookSessionResponse> activateNotebookSession(
            ActivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async activateNotebookSession");
        final ActivateNotebookSessionRequest interceptedRequest =
                ActivateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ActivateNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ActivateNotebookSession");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ActivateNotebookSessionResponse>
                transformer =
                        ActivateNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>,
                        java.util.concurrent.Future<ActivateNotebookSessionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ActivateScheduleResponse> activateSchedule(
            ActivateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateScheduleRequest, ActivateScheduleResponse>
                    handler) {
        LOG.trace("Called async activateSchedule");
        final ActivateScheduleRequest interceptedRequest =
                ActivateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ActivateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ActivateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, ActivateScheduleResponse>
                transformer =
                        ActivateScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ActivateScheduleRequest, ActivateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateScheduleRequest, ActivateScheduleResponse>,
                        java.util.concurrent.Future<ActivateScheduleResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateScheduleRequest, ActivateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResponse> cancelJobRun(
            CancelJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                    handler) {
        LOG.trace("Called async cancelJobRun");
        final CancelJobRunRequest interceptedRequest =
                CancelJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CancelJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CancelJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelJobRunResponse>
                transformer =
                        CancelJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelJobRunRequest, CancelJobRunResponse>,
                        java.util.concurrent.Future<CancelJobRunResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelJobRunRequest, CancelJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelPipelineRunResponse> cancelPipelineRun(
            CancelPipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelPipelineRunRequest, CancelPipelineRunResponse>
                    handler) {
        LOG.trace("Called async cancelPipelineRun");
        final CancelPipelineRunRequest interceptedRequest =
                CancelPipelineRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelPipelineRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CancelPipelineRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/CancelPipelineRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelPipelineRunResponse>
                transformer =
                        CancelPipelineRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelPipelineRunRequest, CancelPipelineRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelPipelineRunRequest, CancelPipelineRunResponse>,
                        java.util.concurrent.Future<CancelPipelineRunResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelPipelineRunRequest, CancelPipelineRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {
        LOG.trace("Called async cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/CancelWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer =
                        CancelWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelWorkRequestRequest, CancelWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelWorkRequestRequest, CancelWorkRequestResponse>,
                        java.util.concurrent.Future<CancelWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelWorkRequestRequest, CancelWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeComputeTargetCompartmentResponse>
            changeComputeTargetCompartment(
                    ChangeComputeTargetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeTargetCompartmentRequest,
                                    ChangeComputeTargetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeTargetCompartment");
        final ChangeComputeTargetCompartmentRequest interceptedRequest =
                ChangeComputeTargetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeTargetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeComputeTargetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTarget/ChangeComputeTargetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeComputeTargetCompartmentResponse>
                transformer =
                        ChangeComputeTargetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeTargetCompartmentRequest,
                        ChangeComputeTargetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeTargetCompartmentRequest,
                                ChangeComputeTargetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeComputeTargetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeComputeTargetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeTargetCompartmentRequest, ChangeComputeTargetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSciencePrivateEndpointCompartmentResponse>
            changeDataSciencePrivateEndpointCompartment(
                    ChangeDataSciencePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSciencePrivateEndpointCompartmentRequest,
                                    ChangeDataSciencePrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDataSciencePrivateEndpointCompartment");
        final ChangeDataSciencePrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDataSciencePrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDataSciencePrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeDataSciencePrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/ChangeDataSciencePrivateEndpointCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDataSciencePrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDataSciencePrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDataSciencePrivateEndpointCompartmentRequest,
                        ChangeDataSciencePrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDataSciencePrivateEndpointCompartmentRequest,
                                ChangeDataSciencePrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDataSciencePrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDataSciencePrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDataSciencePrivateEndpointCompartmentRequest,
                    ChangeDataSciencePrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobCompartment");
        final ChangeJobCompartmentRequest interceptedRequest =
                ChangeJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/ChangeJobCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeJobCompartmentResponse>
                transformer =
                        ChangeJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobRunCompartmentResponse> changeJobRunCompartment(
            ChangeJobRunCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobRunCompartment");
        final ChangeJobRunCompartmentRequest interceptedRequest =
                ChangeJobRunCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobRunCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeJobRunCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/ChangeJobRunCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeJobRunCompartmentResponse>
                transformer =
                        ChangeJobRunCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobRunCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobRunCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMlApplicationCompartmentResponse>
            changeMlApplicationCompartment(
                    ChangeMlApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMlApplicationCompartmentRequest,
                                    ChangeMlApplicationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMlApplicationCompartment");
        final ChangeMlApplicationCompartmentRequest interceptedRequest =
                ChangeMlApplicationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMlApplicationCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeMlApplicationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/ChangeMlApplicationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMlApplicationCompartmentResponse>
                transformer =
                        ChangeMlApplicationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMlApplicationCompartmentRequest,
                        ChangeMlApplicationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMlApplicationCompartmentRequest,
                                ChangeMlApplicationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMlApplicationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMlApplicationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMlApplicationCompartmentRequest, ChangeMlApplicationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMlApplicationImplementationCompartmentResponse>
            changeMlApplicationImplementationCompartment(
                    ChangeMlApplicationImplementationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMlApplicationImplementationCompartmentRequest,
                                    ChangeMlApplicationImplementationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMlApplicationImplementationCompartment");
        final ChangeMlApplicationImplementationCompartmentRequest interceptedRequest =
                ChangeMlApplicationImplementationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMlApplicationImplementationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeMlApplicationImplementationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/ChangeMlApplicationImplementationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeMlApplicationImplementationCompartmentResponse>
                transformer =
                        ChangeMlApplicationImplementationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMlApplicationImplementationCompartmentRequest,
                        ChangeMlApplicationImplementationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMlApplicationImplementationCompartmentRequest,
                                ChangeMlApplicationImplementationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeMlApplicationImplementationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMlApplicationImplementationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMlApplicationImplementationCompartmentRequest,
                    ChangeMlApplicationImplementationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMlApplicationInstanceCompartmentResponse>
            changeMlApplicationInstanceCompartment(
                    ChangeMlApplicationInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMlApplicationInstanceCompartmentRequest,
                                    ChangeMlApplicationInstanceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMlApplicationInstanceCompartment");
        final ChangeMlApplicationInstanceCompartmentRequest interceptedRequest =
                ChangeMlApplicationInstanceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMlApplicationInstanceCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeMlApplicationInstanceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/ChangeMlApplicationInstanceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMlApplicationInstanceCompartmentResponse>
                transformer =
                        ChangeMlApplicationInstanceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMlApplicationInstanceCompartmentRequest,
                        ChangeMlApplicationInstanceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMlApplicationInstanceCompartmentRequest,
                                ChangeMlApplicationInstanceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMlApplicationInstanceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMlApplicationInstanceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMlApplicationInstanceCompartmentRequest,
                    ChangeMlApplicationInstanceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMlApplicationInstanceViewCompartmentResponse>
            changeMlApplicationInstanceViewCompartment(
                    ChangeMlApplicationInstanceViewCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMlApplicationInstanceViewCompartmentRequest,
                                    ChangeMlApplicationInstanceViewCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMlApplicationInstanceViewCompartment");
        final ChangeMlApplicationInstanceViewCompartmentRequest interceptedRequest =
                ChangeMlApplicationInstanceViewCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMlApplicationInstanceViewCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeMlApplicationInstanceViewCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/ChangeMlApplicationInstanceViewCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeMlApplicationInstanceViewCompartmentResponse>
                transformer =
                        ChangeMlApplicationInstanceViewCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMlApplicationInstanceViewCompartmentRequest,
                        ChangeMlApplicationInstanceViewCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMlApplicationInstanceViewCompartmentRequest,
                                ChangeMlApplicationInstanceViewCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeMlApplicationInstanceViewCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMlApplicationInstanceViewCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMlApplicationInstanceViewCompartmentRequest,
                    ChangeMlApplicationInstanceViewCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeModelCompartment");
        final ChangeModelCompartmentRequest interceptedRequest =
                ChangeModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeModelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ChangeModelCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeModelCompartmentResponse>
                transformer =
                        ChangeModelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>
            changeModelDeploymentCompartment(
                    ChangeModelDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelDeploymentCompartmentRequest,
                                    ChangeModelDeploymentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeModelDeploymentCompartment");
        final ChangeModelDeploymentCompartmentRequest interceptedRequest =
                ChangeModelDeploymentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelDeploymentCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeModelDeploymentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ChangeModelDeploymentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeModelDeploymentCompartmentResponse>
                transformer =
                        ChangeModelDeploymentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelDeploymentCompartmentRequest,
                        ChangeModelDeploymentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelDeploymentCompartmentRequest,
                                ChangeModelDeploymentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelDeploymentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelDeploymentCompartmentRequest,
                    ChangeModelDeploymentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelGroupCompartmentResponse>
            changeModelGroupCompartment(
                    ChangeModelGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelGroupCompartmentRequest,
                                    ChangeModelGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeModelGroupCompartment");
        final ChangeModelGroupCompartmentRequest interceptedRequest =
                ChangeModelGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelGroupCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeModelGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/ChangeModelGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeModelGroupCompartmentResponse>
                transformer =
                        ChangeModelGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelGroupCompartmentRequest, ChangeModelGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelGroupCompartmentRequest,
                                ChangeModelGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelGroupCompartmentRequest, ChangeModelGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelGroupVersionHistoryCompartmentResponse>
            changeModelGroupVersionHistoryCompartment(
                    ChangeModelGroupVersionHistoryCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelGroupVersionHistoryCompartmentRequest,
                                    ChangeModelGroupVersionHistoryCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeModelGroupVersionHistoryCompartment");
        final ChangeModelGroupVersionHistoryCompartmentRequest interceptedRequest =
                ChangeModelGroupVersionHistoryCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelGroupVersionHistoryCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeModelGroupVersionHistoryCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistory/ChangeModelGroupVersionHistoryCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeModelGroupVersionHistoryCompartmentResponse>
                transformer =
                        ChangeModelGroupVersionHistoryCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelGroupVersionHistoryCompartmentRequest,
                        ChangeModelGroupVersionHistoryCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelGroupVersionHistoryCompartmentRequest,
                                ChangeModelGroupVersionHistoryCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeModelGroupVersionHistoryCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeModelGroupVersionHistoryCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelGroupVersionHistoryCompartmentRequest,
                    ChangeModelGroupVersionHistoryCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelVersionSetCompartmentResponse>
            changeModelVersionSetCompartment(
                    ChangeModelVersionSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelVersionSetCompartmentRequest,
                                    ChangeModelVersionSetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeModelVersionSetCompartment");
        final ChangeModelVersionSetCompartmentRequest interceptedRequest =
                ChangeModelVersionSetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelVersionSetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeModelVersionSetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/ChangeModelVersionSetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeModelVersionSetCompartmentResponse>
                transformer =
                        ChangeModelVersionSetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelVersionSetCompartmentRequest,
                        ChangeModelVersionSetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelVersionSetCompartmentRequest,
                                ChangeModelVersionSetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelVersionSetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelVersionSetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelVersionSetCompartmentRequest,
                    ChangeModelVersionSetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>
            changeNotebookSessionCompartment(
                    ChangeNotebookSessionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNotebookSessionCompartmentRequest,
                                    ChangeNotebookSessionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNotebookSessionCompartment");
        final ChangeNotebookSessionCompartmentRequest interceptedRequest =
                ChangeNotebookSessionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNotebookSessionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeNotebookSessionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ChangeNotebookSessionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNotebookSessionCompartmentResponse>
                transformer =
                        ChangeNotebookSessionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNotebookSessionCompartmentRequest,
                        ChangeNotebookSessionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNotebookSessionCompartmentRequest,
                                ChangeNotebookSessionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNotebookSessionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNotebookSessionCompartmentRequest,
                    ChangeNotebookSessionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangePipelineCompartmentResponse> changePipelineCompartment(
            ChangePipelineCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePipelineCompartmentRequest, ChangePipelineCompartmentResponse>
                    handler) {
        LOG.trace("Called async changePipelineCompartment");
        final ChangePipelineCompartmentRequest interceptedRequest =
                ChangePipelineCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePipelineCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangePipelineCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/ChangePipelineCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangePipelineCompartmentResponse>
                transformer =
                        ChangePipelineCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangePipelineCompartmentRequest, ChangePipelineCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangePipelineCompartmentRequest,
                                ChangePipelineCompartmentResponse>,
                        java.util.concurrent.Future<ChangePipelineCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangePipelineCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangePipelineCompartmentRequest, ChangePipelineCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangePipelineRunCompartmentResponse>
            changePipelineRunCompartment(
                    ChangePipelineRunCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePipelineRunCompartmentRequest,
                                    ChangePipelineRunCompartmentResponse>
                            handler) {
        LOG.trace("Called async changePipelineRunCompartment");
        final ChangePipelineRunCompartmentRequest interceptedRequest =
                ChangePipelineRunCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePipelineRunCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangePipelineRunCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/ChangePipelineRunCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangePipelineRunCompartmentResponse>
                transformer =
                        ChangePipelineRunCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangePipelineRunCompartmentRequest, ChangePipelineRunCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangePipelineRunCompartmentRequest,
                                ChangePipelineRunCompartmentResponse>,
                        java.util.concurrent.Future<ChangePipelineRunCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangePipelineRunCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangePipelineRunCompartmentRequest, ChangePipelineRunCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "ChangeProjectCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/ChangeProjectCompartment");
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
    public java.util.concurrent.Future<ChangeScheduleCompartmentResponse> changeScheduleCompartment(
            ChangeScheduleCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeScheduleCompartmentRequest, ChangeScheduleCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeScheduleCompartment");
        final ChangeScheduleCompartmentRequest interceptedRequest =
                ChangeScheduleCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeScheduleCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ChangeScheduleCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ChangeScheduleCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeScheduleCompartmentResponse>
                transformer =
                        ChangeScheduleCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeScheduleCompartmentRequest, ChangeScheduleCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeScheduleCompartmentRequest,
                                ChangeScheduleCompartmentResponse>,
                        java.util.concurrent.Future<ChangeScheduleCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeScheduleCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeScheduleCompartmentRequest, ChangeScheduleCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateComputeTargetResponse> createComputeTarget(
            CreateComputeTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateComputeTargetRequest, CreateComputeTargetResponse>
                    handler) {
        LOG.trace("Called async createComputeTarget");
        final CreateComputeTargetRequest interceptedRequest =
                CreateComputeTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateComputeTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTarget/CreateComputeTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateComputeTargetResponse>
                transformer =
                        CreateComputeTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeTargetRequest, CreateComputeTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeTargetRequest, CreateComputeTargetResponse>,
                        java.util.concurrent.Future<CreateComputeTargetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeTargetRequest, CreateComputeTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataSciencePrivateEndpointResponse>
            createDataSciencePrivateEndpoint(
                    CreateDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSciencePrivateEndpointRequest,
                                    CreateDataSciencePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDataSciencePrivateEndpoint");
        final CreateDataSciencePrivateEndpointRequest interceptedRequest =
                CreateDataSciencePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataSciencePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateDataSciencePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDataSciencePrivateEndpointResponse>
                transformer =
                        CreateDataSciencePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataSciencePrivateEndpointRequest,
                        CreateDataSciencePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataSciencePrivateEndpointRequest,
                                CreateDataSciencePrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDataSciencePrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataSciencePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataSciencePrivateEndpointRequest,
                    CreateDataSciencePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
        LOG.trace("Called async createJob");
        final CreateJobRequest interceptedRequest = CreateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateJobResponse>
                transformer =
                        CreateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>,
                        java.util.concurrent.Future<CreateJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRequest, CreateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobArtifactResponse> createJobArtifact(
            CreateJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobArtifactRequest, CreateJobArtifactResponse>
                    handler) {
        LOG.trace("Called async createJobArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateJobArtifactRequest.builder());
        }
        final CreateJobArtifactRequest interceptedRequest =
                CreateJobArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateJobArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJobArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateJobArtifactResponse>
                transformer =
                        CreateJobArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateJobArtifactRequest, CreateJobArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobArtifactRequest, CreateJobArtifactResponse>,
                        java.util.concurrent.Future<CreateJobArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getJobArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobArtifactRequest, CreateJobArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getJobArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobRunResponse> createJobRun(
            CreateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                    handler) {
        LOG.trace("Called async createJobRun");
        final CreateJobRunRequest interceptedRequest =
                CreateJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CreateJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateJobRunResponse>
                transformer =
                        CreateJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobRunRequest, CreateJobRunResponse>,
                        java.util.concurrent.Future<CreateJobRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRunRequest, CreateJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMlApplicationResponse> createMlApplication(
            CreateMlApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMlApplicationRequest, CreateMlApplicationResponse>
                    handler) {
        LOG.trace("Called async createMlApplication");
        final CreateMlApplicationRequest interceptedRequest =
                CreateMlApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMlApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateMlApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/CreateMlApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMlApplicationResponse>
                transformer =
                        CreateMlApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMlApplicationRequest, CreateMlApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMlApplicationRequest, CreateMlApplicationResponse>,
                        java.util.concurrent.Future<CreateMlApplicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMlApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMlApplicationRequest, CreateMlApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMlApplicationImplementationResponse>
            createMlApplicationImplementation(
                    CreateMlApplicationImplementationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMlApplicationImplementationRequest,
                                    CreateMlApplicationImplementationResponse>
                            handler) {
        LOG.trace("Called async createMlApplicationImplementation");
        final CreateMlApplicationImplementationRequest interceptedRequest =
                CreateMlApplicationImplementationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMlApplicationImplementationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateMlApplicationImplementation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/CreateMlApplicationImplementation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMlApplicationImplementationResponse>
                transformer =
                        CreateMlApplicationImplementationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMlApplicationImplementationRequest,
                        CreateMlApplicationImplementationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMlApplicationImplementationRequest,
                                CreateMlApplicationImplementationResponse>,
                        java.util.concurrent.Future<CreateMlApplicationImplementationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMlApplicationImplementationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMlApplicationImplementationRequest,
                    CreateMlApplicationImplementationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMlApplicationInstanceResponse>
            createMlApplicationInstance(
                    CreateMlApplicationInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMlApplicationInstanceRequest,
                                    CreateMlApplicationInstanceResponse>
                            handler) {
        LOG.trace("Called async createMlApplicationInstance");
        final CreateMlApplicationInstanceRequest interceptedRequest =
                CreateMlApplicationInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMlApplicationInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateMlApplicationInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/CreateMlApplicationInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMlApplicationInstanceResponse>
                transformer =
                        CreateMlApplicationInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMlApplicationInstanceRequest, CreateMlApplicationInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMlApplicationInstanceRequest,
                                CreateMlApplicationInstanceResponse>,
                        java.util.concurrent.Future<CreateMlApplicationInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMlApplicationInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMlApplicationInstanceRequest, CreateMlApplicationInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                    handler) {
        LOG.trace("Called async createModel");
        final CreateModelRequest interceptedRequest =
                CreateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelResponse>
                transformer =
                        CreateModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelRequest, CreateModelResponse>,
                        java.util.concurrent.Future<CreateModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelRequest, CreateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelArtifactResponse> createModelArtifact(
            CreateModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelArtifactRequest, CreateModelArtifactResponse>
                    handler) {
        LOG.trace("Called async createModelArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateModelArtifactRequest.builder());
        }
        final CreateModelArtifactRequest interceptedRequest =
                CreateModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelArtifactResponse>
                transformer =
                        CreateModelArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelArtifactRequest, CreateModelArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelArtifactRequest, CreateModelArtifactResponse>,
                        java.util.concurrent.Future<CreateModelArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelArtifactRequest, CreateModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelCustomMetadatumArtifactResponse>
            createModelCustomMetadatumArtifact(
                    CreateModelCustomMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateModelCustomMetadatumArtifactRequest,
                                    CreateModelCustomMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async createModelCustomMetadatumArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateModelCustomMetadatumArtifactRequest.builder());
        }
        final CreateModelCustomMetadatumArtifactRequest interceptedRequest =
                CreateModelCustomMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelCustomMetadatumArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelCustomMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelCustomMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateModelCustomMetadatumArtifactResponse>
                transformer =
                        CreateModelCustomMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelCustomMetadatumArtifactRequest,
                        CreateModelCustomMetadatumArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelCustomMetadatumArtifactRequest,
                                CreateModelCustomMetadatumArtifactResponse>,
                        java.util.concurrent.Future<CreateModelCustomMetadatumArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelCustomMetadatumArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelCustomMetadatumArtifactRequest,
                    CreateModelCustomMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelCustomMetadatumArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelDefinedMetadatumArtifactResponse>
            createModelDefinedMetadatumArtifact(
                    CreateModelDefinedMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateModelDefinedMetadatumArtifactRequest,
                                    CreateModelDefinedMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async createModelDefinedMetadatumArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateModelDefinedMetadatumArtifactRequest.builder());
        }
        final CreateModelDefinedMetadatumArtifactRequest interceptedRequest =
                CreateModelDefinedMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelDefinedMetadatumArtifactConverter.fromRequest(
                        client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelDefinedMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelDefinedMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateModelDefinedMetadatumArtifactResponse>
                transformer =
                        CreateModelDefinedMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelDefinedMetadatumArtifactRequest,
                        CreateModelDefinedMetadatumArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelDefinedMetadatumArtifactRequest,
                                CreateModelDefinedMetadatumArtifactResponse>,
                        java.util.concurrent.Future<CreateModelDefinedMetadatumArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelDefinedMetadatumArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelDefinedMetadatumArtifactRequest,
                    CreateModelDefinedMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelDefinedMetadatumArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelDeploymentResponse> createModelDeployment(
            CreateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async createModelDeployment");
        final CreateModelDeploymentRequest interceptedRequest =
                CreateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/CreateModelDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelDeploymentResponse>
                transformer =
                        CreateModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelDeploymentRequest, CreateModelDeploymentResponse>,
                        java.util.concurrent.Future<CreateModelDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelDeploymentRequest, CreateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelGroupResponse> createModelGroup(
            CreateModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelGroupRequest, CreateModelGroupResponse>
                    handler) {
        LOG.trace("Called async createModelGroup");
        final CreateModelGroupRequest interceptedRequest =
                CreateModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/CreateModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelGroupResponse>
                transformer =
                        CreateModelGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateModelGroupRequest, CreateModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelGroupRequest, CreateModelGroupResponse>,
                        java.util.concurrent.Future<CreateModelGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBaseModelGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelGroupRequest, CreateModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelGroupArtifactResponse> createModelGroupArtifact(
            CreateModelGroupArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelGroupArtifactRequest, CreateModelGroupArtifactResponse>
                    handler) {
        LOG.trace("Called async createModelGroupArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateModelGroupArtifactRequest.builder());
        }
        final CreateModelGroupArtifactRequest interceptedRequest =
                CreateModelGroupArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelGroupArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelGroupArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/CreateModelGroupArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateModelGroupArtifactResponse>
                transformer =
                        CreateModelGroupArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelGroupArtifactRequest, CreateModelGroupArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelGroupArtifactRequest, CreateModelGroupArtifactResponse>,
                        java.util.concurrent.Future<CreateModelGroupArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelGroupArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelGroupArtifactRequest, CreateModelGroupArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelGroupArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelGroupVersionHistoryResponse>
            createModelGroupVersionHistory(
                    CreateModelGroupVersionHistoryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateModelGroupVersionHistoryRequest,
                                    CreateModelGroupVersionHistoryResponse>
                            handler) {
        LOG.trace("Called async createModelGroupVersionHistory");
        final CreateModelGroupVersionHistoryRequest interceptedRequest =
                CreateModelGroupVersionHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelGroupVersionHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelGroupVersionHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistory/CreateModelGroupVersionHistory");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateModelGroupVersionHistoryResponse>
                transformer =
                        CreateModelGroupVersionHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelGroupVersionHistoryRequest,
                        CreateModelGroupVersionHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelGroupVersionHistoryRequest,
                                CreateModelGroupVersionHistoryResponse>,
                        java.util.concurrent.Future<CreateModelGroupVersionHistoryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelGroupVersionHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelGroupVersionHistoryRequest, CreateModelGroupVersionHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelProvenanceResponse> createModelProvenance(
            CreateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async createModelProvenance");
        final CreateModelProvenanceRequest interceptedRequest =
                CreateModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelProvenanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelProvenance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelProvenance");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelProvenanceResponse>
                transformer =
                        CreateModelProvenanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelProvenanceRequest, CreateModelProvenanceResponse>,
                        java.util.concurrent.Future<CreateModelProvenanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelProvenanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelProvenanceRequest, CreateModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelVersionSetResponse> createModelVersionSet(
            CreateModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelVersionSetRequest, CreateModelVersionSetResponse>
                    handler) {
        LOG.trace("Called async createModelVersionSet");
        final CreateModelVersionSetRequest interceptedRequest =
                CreateModelVersionSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelVersionSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateModelVersionSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/CreateModelVersionSet");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelVersionSetResponse>
                transformer =
                        CreateModelVersionSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateModelVersionSetRequest, CreateModelVersionSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelVersionSetRequest, CreateModelVersionSetResponse>,
                        java.util.concurrent.Future<CreateModelVersionSetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelVersionSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelVersionSetRequest, CreateModelVersionSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookSessionResponse> createNotebookSession(
            CreateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async createNotebookSession");
        final CreateNotebookSessionRequest interceptedRequest =
                CreateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/CreateNotebookSession");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateNotebookSessionResponse>
                transformer =
                        CreateNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNotebookSessionRequest, CreateNotebookSessionResponse>,
                        java.util.concurrent.Future<CreateNotebookSessionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNotebookSessionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNotebookSessionRequest, CreateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRequest, CreatePipelineResponse>
                    handler) {
        LOG.trace("Called async createPipeline");
        final CreatePipelineRequest interceptedRequest =
                CreatePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreatePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/CreatePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePipelineResponse>
                transformer =
                        CreatePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePipelineRequest, CreatePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePipelineRequest, CreatePipelineResponse>,
                        java.util.concurrent.Future<CreatePipelineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePipelineRequest, CreatePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineRunResponse> createPipelineRun(
            CreatePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRunRequest, CreatePipelineRunResponse>
                    handler) {
        LOG.trace("Called async createPipelineRun");
        final CreatePipelineRunRequest interceptedRequest =
                CreatePipelineRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreatePipelineRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/CreatePipelineRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePipelineRunResponse>
                transformer =
                        CreatePipelineRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePipelineRunRequest, CreatePipelineRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePipelineRunRequest, CreatePipelineRunResponse>,
                        java.util.concurrent.Future<CreatePipelineRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePipelineRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePipelineRunRequest, CreatePipelineRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "CreateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/CreateProject");
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
    public java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduleRequest, CreateScheduleResponse>
                    handler) {
        LOG.trace("Called async createSchedule");
        final CreateScheduleRequest interceptedRequest =
                CreateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/CreateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateScheduleResponse>
                transformer =
                        CreateScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateScheduleRequest, CreateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateScheduleRequest, CreateScheduleResponse>,
                        java.util.concurrent.Future<CreateScheduleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateScheduleRequest, CreateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateStepArtifactResponse> createStepArtifact(
            CreateStepArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStepArtifactRequest, CreateStepArtifactResponse>
                    handler) {
        LOG.trace("Called async createStepArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateStepArtifactRequest.builder());
        }
        final CreateStepArtifactRequest interceptedRequest =
                CreateStepArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStepArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "CreateStepArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/CreateStepArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateStepArtifactResponse>
                transformer =
                        CreateStepArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateStepArtifactRequest, CreateStepArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateStepArtifactRequest, CreateStepArtifactResponse>,
                        java.util.concurrent.Future<CreateStepArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStepArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateStepArtifactRequest, CreateStepArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getStepArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelResponse> deactivateModel(
            DeactivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelRequest, DeactivateModelResponse>
                    handler) {
        LOG.trace("Called async deactivateModel");
        final DeactivateModelRequest interceptedRequest =
                DeactivateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeactivateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeactivateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeactivateModelResponse>
                transformer =
                        DeactivateModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeactivateModelRequest, DeactivateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateModelRequest, DeactivateModelResponse>,
                        java.util.concurrent.Future<DeactivateModelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateModelRequest, DeactivateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelDeploymentResponse> deactivateModelDeployment(
            DeactivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async deactivateModelDeployment");
        final DeactivateModelDeploymentRequest interceptedRequest =
                DeactivateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeactivateModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeactivateModelDeployment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeactivateModelDeploymentResponse>
                transformer =
                        DeactivateModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateModelDeploymentRequest,
                                DeactivateModelDeploymentResponse>,
                        java.util.concurrent.Future<DeactivateModelDeploymentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelGroupResponse> deactivateModelGroup(
            DeactivateModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelGroupRequest, DeactivateModelGroupResponse>
                    handler) {
        LOG.trace("Called async deactivateModelGroup");
        final DeactivateModelGroupRequest interceptedRequest =
                DeactivateModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeactivateModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/DeactivateModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, DeactivateModelGroupResponse>
                transformer =
                        DeactivateModelGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateModelGroupRequest, DeactivateModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateModelGroupRequest, DeactivateModelGroupResponse>,
                        java.util.concurrent.Future<DeactivateModelGroupResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateModelGroupRequest, DeactivateModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateNotebookSessionResponse> deactivateNotebookSession(
            DeactivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async deactivateNotebookSession");
        final DeactivateNotebookSessionRequest interceptedRequest =
                DeactivateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeactivateNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeactivateNotebookSession");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeactivateNotebookSessionResponse>
                transformer =
                        DeactivateNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateNotebookSessionRequest,
                                DeactivateNotebookSessionResponse>,
                        java.util.concurrent.Future<DeactivateNotebookSessionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateScheduleResponse> deactivateSchedule(
            DeactivateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateScheduleRequest, DeactivateScheduleResponse>
                    handler) {
        LOG.trace("Called async deactivateSchedule");
        final DeactivateScheduleRequest interceptedRequest =
                DeactivateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeactivateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/DeactivateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeactivateScheduleResponse>
                transformer =
                        DeactivateScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeactivateScheduleRequest, DeactivateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateScheduleRequest, DeactivateScheduleResponse>,
                        java.util.concurrent.Future<DeactivateScheduleResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateScheduleRequest, DeactivateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeTargetResponse> deleteComputeTarget(
            DeleteComputeTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteComputeTargetRequest, DeleteComputeTargetResponse>
                    handler) {
        LOG.trace("Called async deleteComputeTarget");
        final DeleteComputeTargetRequest interceptedRequest =
                DeleteComputeTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteComputeTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTarget/DeleteComputeTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteComputeTargetResponse>
                transformer =
                        DeleteComputeTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeTargetRequest, DeleteComputeTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeTargetRequest, DeleteComputeTargetResponse>,
                        java.util.concurrent.Future<DeleteComputeTargetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeTargetRequest, DeleteComputeTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSciencePrivateEndpointResponse>
            deleteDataSciencePrivateEndpoint(
                    DeleteDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSciencePrivateEndpointRequest,
                                    DeleteDataSciencePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDataSciencePrivateEndpoint");
        final DeleteDataSciencePrivateEndpointRequest interceptedRequest =
                DeleteDataSciencePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataSciencePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteDataSciencePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/DeleteDataSciencePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDataSciencePrivateEndpointResponse>
                transformer =
                        DeleteDataSciencePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDataSciencePrivateEndpointRequest,
                        DeleteDataSciencePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataSciencePrivateEndpointRequest,
                                DeleteDataSciencePrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDataSciencePrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataSciencePrivateEndpointRequest,
                    DeleteDataSciencePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {
        LOG.trace("Called async deleteJob");
        final DeleteJobRequest interceptedRequest = DeleteJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/DeleteJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteJobResponse>
                transformer =
                        DeleteJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>,
                        java.util.concurrent.Future<DeleteJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRequest, DeleteJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobRunResponse> deleteJobRun(
            DeleteJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                    handler) {
        LOG.trace("Called async deleteJobRun");
        final DeleteJobRunRequest interceptedRequest =
                DeleteJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/DeleteJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteJobRunResponse>
                transformer =
                        DeleteJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteJobRunRequest, DeleteJobRunResponse>,
                        java.util.concurrent.Future<DeleteJobRunResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRunRequest, DeleteJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMlApplicationResponse> deleteMlApplication(
            DeleteMlApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMlApplicationRequest, DeleteMlApplicationResponse>
                    handler) {
        LOG.trace("Called async deleteMlApplication");
        final DeleteMlApplicationRequest interceptedRequest =
                DeleteMlApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMlApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteMlApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/DeleteMlApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMlApplicationResponse>
                transformer =
                        DeleteMlApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMlApplicationRequest, DeleteMlApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMlApplicationRequest, DeleteMlApplicationResponse>,
                        java.util.concurrent.Future<DeleteMlApplicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMlApplicationRequest, DeleteMlApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMlApplicationImplementationResponse>
            deleteMlApplicationImplementation(
                    DeleteMlApplicationImplementationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMlApplicationImplementationRequest,
                                    DeleteMlApplicationImplementationResponse>
                            handler) {
        LOG.trace("Called async deleteMlApplicationImplementation");
        final DeleteMlApplicationImplementationRequest interceptedRequest =
                DeleteMlApplicationImplementationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMlApplicationImplementationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteMlApplicationImplementation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/DeleteMlApplicationImplementation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMlApplicationImplementationResponse>
                transformer =
                        DeleteMlApplicationImplementationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMlApplicationImplementationRequest,
                        DeleteMlApplicationImplementationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMlApplicationImplementationRequest,
                                DeleteMlApplicationImplementationResponse>,
                        java.util.concurrent.Future<DeleteMlApplicationImplementationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMlApplicationImplementationRequest,
                    DeleteMlApplicationImplementationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMlApplicationInstanceResponse>
            deleteMlApplicationInstance(
                    DeleteMlApplicationInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMlApplicationInstanceRequest,
                                    DeleteMlApplicationInstanceResponse>
                            handler) {
        LOG.trace("Called async deleteMlApplicationInstance");
        final DeleteMlApplicationInstanceRequest interceptedRequest =
                DeleteMlApplicationInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMlApplicationInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteMlApplicationInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/DeleteMlApplicationInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMlApplicationInstanceResponse>
                transformer =
                        DeleteMlApplicationInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMlApplicationInstanceRequest, DeleteMlApplicationInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMlApplicationInstanceRequest,
                                DeleteMlApplicationInstanceResponse>,
                        java.util.concurrent.Future<DeleteMlApplicationInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMlApplicationInstanceRequest, DeleteMlApplicationInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                    handler) {
        LOG.trace("Called async deleteModel");
        final DeleteModelRequest interceptedRequest =
                DeleteModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelResponse>
                transformer =
                        DeleteModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelRequest, DeleteModelResponse>,
                        java.util.concurrent.Future<DeleteModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelRequest, DeleteModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelCustomMetadatumArtifactResponse>
            deleteModelCustomMetadatumArtifact(
                    DeleteModelCustomMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteModelCustomMetadatumArtifactRequest,
                                    DeleteModelCustomMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async deleteModelCustomMetadatumArtifact");
        final DeleteModelCustomMetadatumArtifactRequest interceptedRequest =
                DeleteModelCustomMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelCustomMetadatumArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelCustomMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModelCustomMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteModelCustomMetadatumArtifactResponse>
                transformer =
                        DeleteModelCustomMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelCustomMetadatumArtifactRequest,
                        DeleteModelCustomMetadatumArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelCustomMetadatumArtifactRequest,
                                DeleteModelCustomMetadatumArtifactResponse>,
                        java.util.concurrent.Future<DeleteModelCustomMetadatumArtifactResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelCustomMetadatumArtifactRequest,
                    DeleteModelCustomMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelDefinedMetadatumArtifactResponse>
            deleteModelDefinedMetadatumArtifact(
                    DeleteModelDefinedMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteModelDefinedMetadatumArtifactRequest,
                                    DeleteModelDefinedMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async deleteModelDefinedMetadatumArtifact");
        final DeleteModelDefinedMetadatumArtifactRequest interceptedRequest =
                DeleteModelDefinedMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelDefinedMetadatumArtifactConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelDefinedMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModelDefinedMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteModelDefinedMetadatumArtifactResponse>
                transformer =
                        DeleteModelDefinedMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelDefinedMetadatumArtifactRequest,
                        DeleteModelDefinedMetadatumArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelDefinedMetadatumArtifactRequest,
                                DeleteModelDefinedMetadatumArtifactResponse>,
                        java.util.concurrent.Future<DeleteModelDefinedMetadatumArtifactResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelDefinedMetadatumArtifactRequest,
                    DeleteModelDefinedMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelDeploymentResponse> deleteModelDeployment(
            DeleteModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async deleteModelDeployment");
        final DeleteModelDeploymentRequest interceptedRequest =
                DeleteModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeleteModelDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelDeploymentResponse>
                transformer =
                        DeleteModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>,
                        java.util.concurrent.Future<DeleteModelDeploymentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelGroupResponse> deleteModelGroup(
            DeleteModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelGroupRequest, DeleteModelGroupResponse>
                    handler) {
        LOG.trace("Called async deleteModelGroup");
        final DeleteModelGroupRequest interceptedRequest =
                DeleteModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/DeleteModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelGroupResponse>
                transformer =
                        DeleteModelGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteModelGroupRequest, DeleteModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelGroupRequest, DeleteModelGroupResponse>,
                        java.util.concurrent.Future<DeleteModelGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelGroupRequest, DeleteModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelGroupVersionHistoryResponse>
            deleteModelGroupVersionHistory(
                    DeleteModelGroupVersionHistoryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteModelGroupVersionHistoryRequest,
                                    DeleteModelGroupVersionHistoryResponse>
                            handler) {
        LOG.trace("Called async deleteModelGroupVersionHistory");
        final DeleteModelGroupVersionHistoryRequest interceptedRequest =
                DeleteModelGroupVersionHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelGroupVersionHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelGroupVersionHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistory/DeleteModelGroupVersionHistory");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteModelGroupVersionHistoryResponse>
                transformer =
                        DeleteModelGroupVersionHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelGroupVersionHistoryRequest,
                        DeleteModelGroupVersionHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelGroupVersionHistoryRequest,
                                DeleteModelGroupVersionHistoryResponse>,
                        java.util.concurrent.Future<DeleteModelGroupVersionHistoryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelGroupVersionHistoryRequest, DeleteModelGroupVersionHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelVersionSetResponse> deleteModelVersionSet(
            DeleteModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>
                    handler) {
        LOG.trace("Called async deleteModelVersionSet");
        final DeleteModelVersionSetRequest interceptedRequest =
                DeleteModelVersionSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelVersionSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteModelVersionSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/DeleteModelVersionSet");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelVersionSetResponse>
                transformer =
                        DeleteModelVersionSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>,
                        java.util.concurrent.Future<DeleteModelVersionSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookSessionResponse> deleteNotebookSession(
            DeleteNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async deleteNotebookSession");
        final DeleteNotebookSessionRequest interceptedRequest =
                DeleteNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeleteNotebookSession");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNotebookSessionResponse>
                transformer =
                        DeleteNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>,
                        java.util.concurrent.Future<DeleteNotebookSessionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRequest, DeletePipelineResponse>
                    handler) {
        LOG.trace("Called async deletePipeline");
        final DeletePipelineRequest interceptedRequest =
                DeletePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeletePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/DeletePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePipelineResponse>
                transformer =
                        DeletePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePipelineRequest, DeletePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePipelineRequest, DeletePipelineResponse>,
                        java.util.concurrent.Future<DeletePipelineResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePipelineRequest, DeletePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineRunResponse> deletePipelineRun(
            DeletePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRunRequest, DeletePipelineRunResponse>
                    handler) {
        LOG.trace("Called async deletePipelineRun");
        final DeletePipelineRunRequest interceptedRequest =
                DeletePipelineRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeletePipelineRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/DeletePipelineRun");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePipelineRunResponse>
                transformer =
                        DeletePipelineRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePipelineRunRequest, DeletePipelineRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePipelineRunRequest, DeletePipelineRunResponse>,
                        java.util.concurrent.Future<DeletePipelineRunResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePipelineRunRequest, DeletePipelineRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "DeleteProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/DeleteProject");
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
    public java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduleRequest, DeleteScheduleResponse>
                    handler) {
        LOG.trace("Called async deleteSchedule");
        final DeleteScheduleRequest interceptedRequest =
                DeleteScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DeleteSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/DeleteSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteScheduleResponse>
                transformer =
                        DeleteScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteScheduleRequest, DeleteScheduleResponse>,
                        java.util.concurrent.Future<DeleteScheduleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteScheduleRequest, DeleteScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableMlApplicationInstanceViewTriggerResponse>
            disableMlApplicationInstanceViewTrigger(
                    DisableMlApplicationInstanceViewTriggerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableMlApplicationInstanceViewTriggerRequest,
                                    DisableMlApplicationInstanceViewTriggerResponse>
                            handler) {
        LOG.trace("Called async disableMlApplicationInstanceViewTrigger");
        final DisableMlApplicationInstanceViewTriggerRequest interceptedRequest =
                DisableMlApplicationInstanceViewTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableMlApplicationInstanceViewTriggerConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "DisableMlApplicationInstanceViewTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/DisableMlApplicationInstanceViewTrigger");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableMlApplicationInstanceViewTriggerResponse>
                transformer =
                        DisableMlApplicationInstanceViewTriggerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableMlApplicationInstanceViewTriggerRequest,
                        DisableMlApplicationInstanceViewTriggerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableMlApplicationInstanceViewTriggerRequest,
                                DisableMlApplicationInstanceViewTriggerResponse>,
                        java.util.concurrent.Future<
                                DisableMlApplicationInstanceViewTriggerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableMlApplicationInstanceViewTriggerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableMlApplicationInstanceViewTriggerRequest,
                    DisableMlApplicationInstanceViewTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableMlApplicationInstanceViewTriggerResponse>
            enableMlApplicationInstanceViewTrigger(
                    EnableMlApplicationInstanceViewTriggerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableMlApplicationInstanceViewTriggerRequest,
                                    EnableMlApplicationInstanceViewTriggerResponse>
                            handler) {
        LOG.trace("Called async enableMlApplicationInstanceViewTrigger");
        final EnableMlApplicationInstanceViewTriggerRequest interceptedRequest =
                EnableMlApplicationInstanceViewTriggerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableMlApplicationInstanceViewTriggerConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "EnableMlApplicationInstanceViewTrigger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/EnableMlApplicationInstanceViewTrigger");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableMlApplicationInstanceViewTriggerResponse>
                transformer =
                        EnableMlApplicationInstanceViewTriggerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableMlApplicationInstanceViewTriggerRequest,
                        EnableMlApplicationInstanceViewTriggerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableMlApplicationInstanceViewTriggerRequest,
                                EnableMlApplicationInstanceViewTriggerResponse>,
                        java.util.concurrent.Future<EnableMlApplicationInstanceViewTriggerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableMlApplicationInstanceViewTriggerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableMlApplicationInstanceViewTriggerRequest,
                    EnableMlApplicationInstanceViewTriggerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportModelArtifactResponse> exportModelArtifact(
            ExportModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportModelArtifactRequest, ExportModelArtifactResponse>
                    handler) {
        LOG.trace("Called async exportModelArtifact");
        final ExportModelArtifactRequest interceptedRequest =
                ExportModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportModelArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ExportModelArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ExportModelArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportModelArtifactResponse>
                transformer =
                        ExportModelArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExportModelArtifactRequest, ExportModelArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportModelArtifactRequest, ExportModelArtifactResponse>,
                        java.util.concurrent.Future<ExportModelArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportModelArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportModelArtifactRequest, ExportModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetComputeTargetResponse> getComputeTarget(
            GetComputeTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetComputeTargetRequest, GetComputeTargetResponse>
                    handler) {
        LOG.trace("Called async getComputeTarget");
        final GetComputeTargetRequest interceptedRequest =
                GetComputeTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetComputeTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTarget/GetComputeTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, GetComputeTargetResponse>
                transformer =
                        GetComputeTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetComputeTargetRequest, GetComputeTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeTargetRequest, GetComputeTargetResponse>,
                        java.util.concurrent.Future<GetComputeTargetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeTargetRequest, GetComputeTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSciencePrivateEndpointResponse>
            getDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSciencePrivateEndpointRequest,
                                    GetDataSciencePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDataSciencePrivateEndpoint");
        final GetDataSciencePrivateEndpointRequest interceptedRequest =
                GetDataSciencePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSciencePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetDataSciencePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/GetDataSciencePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDataSciencePrivateEndpointResponse>
                transformer =
                        GetDataSciencePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSciencePrivateEndpointRequest,
                                GetDataSciencePrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDataSciencePrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {
        LOG.trace("Called async getJob");
        final GetJobRequest interceptedRequest = GetJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobResponse> transformer =
                GetJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse>,
                        java.util.concurrent.Future<GetJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRequest, GetJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobArtifactContentResponse> getJobArtifactContent(
            GetJobArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                    handler) {
        LOG.trace("Called async getJobArtifactContent");
        final GetJobArtifactContentRequest interceptedRequest =
                GetJobArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobArtifactContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetJobArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJobArtifactContent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobArtifactContentResponse>
                transformer =
                        GetJobArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobArtifactContentRequest, GetJobArtifactContentResponse>,
                        java.util.concurrent.Future<GetJobArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobArtifactContentRequest, GetJobArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {
        LOG.trace("Called async getJobRun");
        final GetJobRunRequest interceptedRequest = GetJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/GetJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobRunResponse>
                transformer =
                        GetJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>,
                        java.util.concurrent.Future<GetJobRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRunRequest, GetJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationResponse> getMlApplication(
            GetMlApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMlApplicationRequest, GetMlApplicationResponse>
                    handler) {
        LOG.trace("Called async getMlApplication");
        final GetMlApplicationRequest interceptedRequest =
                GetMlApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/GetMlApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMlApplicationResponse>
                transformer =
                        GetMlApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMlApplicationRequest, GetMlApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationRequest, GetMlApplicationResponse>,
                        java.util.concurrent.Future<GetMlApplicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationRequest, GetMlApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationHistoricalPackageContentResponse>
            getMlApplicationHistoricalPackageContent(
                    GetMlApplicationHistoricalPackageContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMlApplicationHistoricalPackageContentRequest,
                                    GetMlApplicationHistoricalPackageContentResponse>
                            handler) {
        LOG.trace("Called async getMlApplicationHistoricalPackageContent");
        final GetMlApplicationHistoricalPackageContentRequest interceptedRequest =
                GetMlApplicationHistoricalPackageContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationHistoricalPackageContentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationHistoricalPackageContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/GetMlApplicationHistoricalPackageContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationHistoricalPackageContentResponse>
                transformer =
                        GetMlApplicationHistoricalPackageContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationHistoricalPackageContentRequest,
                        GetMlApplicationHistoricalPackageContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationHistoricalPackageContentRequest,
                                GetMlApplicationHistoricalPackageContentResponse>,
                        java.util.concurrent.Future<
                                GetMlApplicationHistoricalPackageContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationHistoricalPackageContentRequest,
                    GetMlApplicationHistoricalPackageContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationImplementationResponse>
            getMlApplicationImplementation(
                    GetMlApplicationImplementationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMlApplicationImplementationRequest,
                                    GetMlApplicationImplementationResponse>
                            handler) {
        LOG.trace("Called async getMlApplicationImplementation");
        final GetMlApplicationImplementationRequest interceptedRequest =
                GetMlApplicationImplementationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationImplementationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationImplementation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/GetMlApplicationImplementation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationImplementationResponse>
                transformer =
                        GetMlApplicationImplementationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationImplementationRequest,
                        GetMlApplicationImplementationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationImplementationRequest,
                                GetMlApplicationImplementationResponse>,
                        java.util.concurrent.Future<GetMlApplicationImplementationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationImplementationRequest, GetMlApplicationImplementationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationImplementationVersionResponse>
            getMlApplicationImplementationVersion(
                    GetMlApplicationImplementationVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMlApplicationImplementationVersionRequest,
                                    GetMlApplicationImplementationVersionResponse>
                            handler) {
        LOG.trace("Called async getMlApplicationImplementationVersion");
        final GetMlApplicationImplementationVersionRequest interceptedRequest =
                GetMlApplicationImplementationVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationImplementationVersionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationImplementationVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/GetMlApplicationImplementationVersion");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationImplementationVersionResponse>
                transformer =
                        GetMlApplicationImplementationVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationImplementationVersionRequest,
                        GetMlApplicationImplementationVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationImplementationVersionRequest,
                                GetMlApplicationImplementationVersionResponse>,
                        java.util.concurrent.Future<GetMlApplicationImplementationVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationImplementationVersionRequest,
                    GetMlApplicationImplementationVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationInstanceResponse> getMlApplicationInstance(
            GetMlApplicationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
                    handler) {
        LOG.trace("Called async getMlApplicationInstance");
        final GetMlApplicationInstanceRequest interceptedRequest =
                GetMlApplicationInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/GetMlApplicationInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationInstanceResponse>
                transformer =
                        GetMlApplicationInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>,
                        java.util.concurrent.Future<GetMlApplicationInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationInstanceViewResponse>
            getMlApplicationInstanceView(
                    GetMlApplicationInstanceViewRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMlApplicationInstanceViewRequest,
                                    GetMlApplicationInstanceViewResponse>
                            handler) {
        LOG.trace("Called async getMlApplicationInstanceView");
        final GetMlApplicationInstanceViewRequest interceptedRequest =
                GetMlApplicationInstanceViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationInstanceViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationInstanceView",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/GetMlApplicationInstanceView");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationInstanceViewResponse>
                transformer =
                        GetMlApplicationInstanceViewConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationInstanceViewRequest,
                                GetMlApplicationInstanceViewResponse>,
                        java.util.concurrent.Future<GetMlApplicationInstanceViewResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMlApplicationPackageContentResponse>
            getMlApplicationPackageContent(
                    GetMlApplicationPackageContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMlApplicationPackageContentRequest,
                                    GetMlApplicationPackageContentResponse>
                            handler) {
        LOG.trace("Called async getMlApplicationPackageContent");
        final GetMlApplicationPackageContentRequest interceptedRequest =
                GetMlApplicationPackageContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMlApplicationPackageContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetMlApplicationPackageContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/GetMlApplicationPackageContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMlApplicationPackageContentResponse>
                transformer =
                        GetMlApplicationPackageContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMlApplicationPackageContentRequest,
                        GetMlApplicationPackageContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMlApplicationPackageContentRequest,
                                GetMlApplicationPackageContentResponse>,
                        java.util.concurrent.Future<GetMlApplicationPackageContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMlApplicationPackageContentRequest, GetMlApplicationPackageContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>
                    handler) {
        LOG.trace("Called async getModel");
        final GetModelRequest interceptedRequest = GetModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelResponse> transformer =
                GetModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>,
                        java.util.concurrent.Future<GetModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelRequest, GetModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelArtifactContentResponse> getModelArtifactContent(
            GetModelArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                    handler) {
        LOG.trace("Called async getModelArtifactContent");
        final GetModelArtifactContentRequest interceptedRequest =
                GetModelArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelArtifactContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelArtifactContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetModelArtifactContentResponse>
                transformer =
                        GetModelArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelArtifactContentRequest, GetModelArtifactContentResponse>,
                        java.util.concurrent.Future<GetModelArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelArtifactContentRequest, GetModelArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelCustomMetadatumArtifactContentResponse>
            getModelCustomMetadatumArtifactContent(
                    GetModelCustomMetadatumArtifactContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetModelCustomMetadatumArtifactContentRequest,
                                    GetModelCustomMetadatumArtifactContentResponse>
                            handler) {
        LOG.trace("Called async getModelCustomMetadatumArtifactContent");
        final GetModelCustomMetadatumArtifactContentRequest interceptedRequest =
                GetModelCustomMetadatumArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelCustomMetadatumArtifactContentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelCustomMetadatumArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelCustomMetadatumArtifactContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetModelCustomMetadatumArtifactContentResponse>
                transformer =
                        GetModelCustomMetadatumArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModelCustomMetadatumArtifactContentRequest,
                        GetModelCustomMetadatumArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelCustomMetadatumArtifactContentRequest,
                                GetModelCustomMetadatumArtifactContentResponse>,
                        java.util.concurrent.Future<GetModelCustomMetadatumArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelCustomMetadatumArtifactContentRequest,
                    GetModelCustomMetadatumArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelDefinedMetadatumArtifactContentResponse>
            getModelDefinedMetadatumArtifactContent(
                    GetModelDefinedMetadatumArtifactContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetModelDefinedMetadatumArtifactContentRequest,
                                    GetModelDefinedMetadatumArtifactContentResponse>
                            handler) {
        LOG.trace("Called async getModelDefinedMetadatumArtifactContent");
        final GetModelDefinedMetadatumArtifactContentRequest interceptedRequest =
                GetModelDefinedMetadatumArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelDefinedMetadatumArtifactContentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelDefinedMetadatumArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelDefinedMetadatumArtifactContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetModelDefinedMetadatumArtifactContentResponse>
                transformer =
                        GetModelDefinedMetadatumArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModelDefinedMetadatumArtifactContentRequest,
                        GetModelDefinedMetadatumArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelDefinedMetadatumArtifactContentRequest,
                                GetModelDefinedMetadatumArtifactContentResponse>,
                        java.util.concurrent.Future<
                                GetModelDefinedMetadatumArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelDefinedMetadatumArtifactContentRequest,
                    GetModelDefinedMetadatumArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelDeploymentResponse> getModelDeployment(
            GetModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelDeploymentRequest, GetModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async getModelDeployment");
        final GetModelDeploymentRequest interceptedRequest =
                GetModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/GetModelDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelDeploymentResponse>
                transformer =
                        GetModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelDeploymentRequest, GetModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelDeploymentRequest, GetModelDeploymentResponse>,
                        java.util.concurrent.Future<GetModelDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelDeploymentRequest, GetModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelGroupResponse> getModelGroup(
            GetModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelGroupRequest, GetModelGroupResponse>
                    handler) {
        LOG.trace("Called async getModelGroup");
        final GetModelGroupRequest interceptedRequest =
                GetModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/GetModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelGroupResponse>
                transformer =
                        GetModelGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelGroupRequest, GetModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelGroupRequest, GetModelGroupResponse>,
                        java.util.concurrent.Future<GetModelGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelGroupRequest, GetModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelGroupArtifactContentResponse>
            getModelGroupArtifactContent(
                    GetModelGroupArtifactContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetModelGroupArtifactContentRequest,
                                    GetModelGroupArtifactContentResponse>
                            handler) {
        LOG.trace("Called async getModelGroupArtifactContent");
        final GetModelGroupArtifactContentRequest interceptedRequest =
                GetModelGroupArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelGroupArtifactContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelGroupArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/GetModelGroupArtifactContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetModelGroupArtifactContentResponse>
                transformer =
                        GetModelGroupArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModelGroupArtifactContentRequest, GetModelGroupArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelGroupArtifactContentRequest,
                                GetModelGroupArtifactContentResponse>,
                        java.util.concurrent.Future<GetModelGroupArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelGroupArtifactContentRequest, GetModelGroupArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelGroupVersionHistoryResponse>
            getModelGroupVersionHistory(
                    GetModelGroupVersionHistoryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetModelGroupVersionHistoryRequest,
                                    GetModelGroupVersionHistoryResponse>
                            handler) {
        LOG.trace("Called async getModelGroupVersionHistory");
        final GetModelGroupVersionHistoryRequest interceptedRequest =
                GetModelGroupVersionHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelGroupVersionHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelGroupVersionHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistory/GetModelGroupVersionHistory");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetModelGroupVersionHistoryResponse>
                transformer =
                        GetModelGroupVersionHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelGroupVersionHistoryRequest,
                                GetModelGroupVersionHistoryResponse>,
                        java.util.concurrent.Future<GetModelGroupVersionHistoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelProvenanceResponse> getModelProvenance(
            GetModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelProvenanceRequest, GetModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async getModelProvenance");
        final GetModelProvenanceRequest interceptedRequest =
                GetModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelProvenanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelProvenance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelProvenance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelProvenanceResponse>
                transformer =
                        GetModelProvenanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelProvenanceRequest, GetModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelProvenanceRequest, GetModelProvenanceResponse>,
                        java.util.concurrent.Future<GetModelProvenanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelProvenanceRequest, GetModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelVersionSetResponse> getModelVersionSet(
            GetModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelVersionSetRequest, GetModelVersionSetResponse>
                    handler) {
        LOG.trace("Called async getModelVersionSet");
        final GetModelVersionSetRequest interceptedRequest =
                GetModelVersionSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelVersionSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetModelVersionSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/GetModelVersionSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelVersionSetResponse>
                transformer =
                        GetModelVersionSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelVersionSetRequest, GetModelVersionSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModelVersionSetRequest, GetModelVersionSetResponse>,
                        java.util.concurrent.Future<GetModelVersionSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelVersionSetRequest, GetModelVersionSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNotebookSessionResponse> getNotebookSession(
            GetNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNotebookSessionRequest, GetNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async getNotebookSession");
        final GetNotebookSessionRequest interceptedRequest =
                GetNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/GetNotebookSession");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNotebookSessionResponse>
                transformer =
                        GetNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNotebookSessionRequest, GetNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNotebookSessionRequest, GetNotebookSessionResponse>,
                        java.util.concurrent.Future<GetNotebookSessionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNotebookSessionRequest, GetNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                    handler) {
        LOG.trace("Called async getPipeline");
        final GetPipelineRequest interceptedRequest =
                GetPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/GetPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPipelineResponse>
                transformer =
                        GetPipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPipelineRequest, GetPipelineResponse>,
                        java.util.concurrent.Future<GetPipelineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPipelineRequest, GetPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPipelineRunResponse> getPipelineRun(
            GetPipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPipelineRunRequest, GetPipelineRunResponse>
                    handler) {
        LOG.trace("Called async getPipelineRun");
        final GetPipelineRunRequest interceptedRequest =
                GetPipelineRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetPipelineRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/GetPipelineRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPipelineRunResponse>
                transformer =
                        GetPipelineRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPipelineRunRequest, GetPipelineRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPipelineRunRequest, GetPipelineRunResponse>,
                        java.util.concurrent.Future<GetPipelineRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPipelineRunRequest, GetPipelineRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "GetProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/GetProject");
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
    public java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                    handler) {
        LOG.trace("Called async getSchedule");
        final GetScheduleRequest interceptedRequest =
                GetScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/GetSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetScheduleResponse>
                transformer =
                        GetScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduleRequest, GetScheduleResponse>,
                        java.util.concurrent.Future<GetScheduleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduleRequest, GetScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStepArtifactContentResponse> getStepArtifactContent(
            GetStepArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStepArtifactContentRequest, GetStepArtifactContentResponse>
                    handler) {
        LOG.trace("Called async getStepArtifactContent");
        final GetStepArtifactContentRequest interceptedRequest =
                GetStepArtifactContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStepArtifactContentConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "GetStepArtifactContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/GetStepArtifactContent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetStepArtifactContentResponse>
                transformer =
                        GetStepArtifactContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetStepArtifactContentRequest, GetStepArtifactContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStepArtifactContentRequest, GetStepArtifactContentResponse>,
                        java.util.concurrent.Future<GetStepArtifactContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStepArtifactContentRequest, GetStepArtifactContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<HeadJobArtifactResponse> headJobArtifact(
            HeadJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadJobArtifactRequest, HeadJobArtifactResponse>
                    handler) {
        LOG.trace("Called async headJobArtifact");
        final HeadJobArtifactRequest interceptedRequest =
                HeadJobArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadJobArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadJobArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/HeadJobArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, HeadJobArtifactResponse>
                transformer =
                        HeadJobArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<HeadJobArtifactRequest, HeadJobArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadJobArtifactRequest, HeadJobArtifactResponse>,
                        java.util.concurrent.Future<HeadJobArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadJobArtifactRequest, HeadJobArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadModelArtifactResponse> headModelArtifact(
            HeadModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadModelArtifactRequest, HeadModelArtifactResponse>
                    handler) {
        LOG.trace("Called async headModelArtifact");
        final HeadModelArtifactRequest interceptedRequest =
                HeadModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadModelArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadModelArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, HeadModelArtifactResponse>
                transformer =
                        HeadModelArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<HeadModelArtifactRequest, HeadModelArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadModelArtifactRequest, HeadModelArtifactResponse>,
                        java.util.concurrent.Future<HeadModelArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadModelArtifactRequest, HeadModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadModelCustomMetadatumArtifactResponse>
            headModelCustomMetadatumArtifact(
                    HeadModelCustomMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    HeadModelCustomMetadatumArtifactRequest,
                                    HeadModelCustomMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async headModelCustomMetadatumArtifact");
        final HeadModelCustomMetadatumArtifactRequest interceptedRequest =
                HeadModelCustomMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadModelCustomMetadatumArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadModelCustomMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelCustomMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, HeadModelCustomMetadatumArtifactResponse>
                transformer =
                        HeadModelCustomMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        HeadModelCustomMetadatumArtifactRequest,
                        HeadModelCustomMetadatumArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadModelCustomMetadatumArtifactRequest,
                                HeadModelCustomMetadatumArtifactResponse>,
                        java.util.concurrent.Future<HeadModelCustomMetadatumArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadModelCustomMetadatumArtifactRequest,
                    HeadModelCustomMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadModelDefinedMetadatumArtifactResponse>
            headModelDefinedMetadatumArtifact(
                    HeadModelDefinedMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    HeadModelDefinedMetadatumArtifactRequest,
                                    HeadModelDefinedMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async headModelDefinedMetadatumArtifact");
        final HeadModelDefinedMetadatumArtifactRequest interceptedRequest =
                HeadModelDefinedMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadModelDefinedMetadatumArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadModelDefinedMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelDefinedMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, HeadModelDefinedMetadatumArtifactResponse>
                transformer =
                        HeadModelDefinedMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        HeadModelDefinedMetadatumArtifactRequest,
                        HeadModelDefinedMetadatumArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadModelDefinedMetadatumArtifactRequest,
                                HeadModelDefinedMetadatumArtifactResponse>,
                        java.util.concurrent.Future<HeadModelDefinedMetadatumArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadModelDefinedMetadatumArtifactRequest,
                    HeadModelDefinedMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadModelGroupArtifactResponse> headModelGroupArtifact(
            HeadModelGroupArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadModelGroupArtifactRequest, HeadModelGroupArtifactResponse>
                    handler) {
        LOG.trace("Called async headModelGroupArtifact");
        final HeadModelGroupArtifactRequest interceptedRequest =
                HeadModelGroupArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadModelGroupArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadModelGroupArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/HeadModelGroupArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, HeadModelGroupArtifactResponse>
                transformer =
                        HeadModelGroupArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        HeadModelGroupArtifactRequest, HeadModelGroupArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadModelGroupArtifactRequest, HeadModelGroupArtifactResponse>,
                        java.util.concurrent.Future<HeadModelGroupArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadModelGroupArtifactRequest, HeadModelGroupArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadStepArtifactResponse> headStepArtifact(
            HeadStepArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadStepArtifactRequest, HeadStepArtifactResponse>
                    handler) {
        LOG.trace("Called async headStepArtifact");
        final HeadStepArtifactRequest interceptedRequest =
                HeadStepArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadStepArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "HeadStepArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/HeadStepArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, HeadStepArtifactResponse>
                transformer =
                        HeadStepArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<HeadStepArtifactRequest, HeadStepArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadStepArtifactRequest, HeadStepArtifactResponse>,
                        java.util.concurrent.Future<HeadStepArtifactResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadStepArtifactRequest, HeadStepArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ImportModelArtifactResponse> importModelArtifact(
            ImportModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportModelArtifactRequest, ImportModelArtifactResponse>
                    handler) {
        LOG.trace("Called async importModelArtifact");
        final ImportModelArtifactRequest interceptedRequest =
                ImportModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportModelArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ImportModelArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ImportModelArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, ImportModelArtifactResponse>
                transformer =
                        ImportModelArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ImportModelArtifactRequest, ImportModelArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportModelArtifactRequest, ImportModelArtifactResponse>,
                        java.util.concurrent.Future<ImportModelArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportModelArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportModelArtifactRequest, ImportModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeTargetShapesResponse> listComputeTargetShapes(
            ListComputeTargetShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComputeTargetShapesRequest, ListComputeTargetShapesResponse>
                    handler) {
        LOG.trace("Called async listComputeTargetShapes");
        final ListComputeTargetShapesRequest interceptedRequest =
                ListComputeTargetShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeTargetShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListComputeTargetShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTargetShapeSummary/ListComputeTargetShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListComputeTargetShapesResponse>
                transformer =
                        ListComputeTargetShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeTargetShapesRequest, ListComputeTargetShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeTargetShapesRequest, ListComputeTargetShapesResponse>,
                        java.util.concurrent.Future<ListComputeTargetShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeTargetShapesRequest, ListComputeTargetShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeTargetsResponse> listComputeTargets(
            ListComputeTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComputeTargetsRequest, ListComputeTargetsResponse>
                    handler) {
        LOG.trace("Called async listComputeTargets");
        final ListComputeTargetsRequest interceptedRequest =
                ListComputeTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListComputeTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTargetSummary/ListComputeTargets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListComputeTargetsResponse>
                transformer =
                        ListComputeTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListComputeTargetsRequest, ListComputeTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeTargetsRequest, ListComputeTargetsResponse>,
                        java.util.concurrent.Future<ListComputeTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeTargetsRequest, ListComputeTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListContainersResponse> listContainers(
            ListContainersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListContainersRequest, ListContainersResponse>
                    handler) {
        LOG.trace("Called async listContainers");
        final ListContainersRequest interceptedRequest =
                ListContainersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListContainersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListContainers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ContainerSummary/ListContainers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListContainersResponse>
                transformer =
                        ListContainersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListContainersRequest, ListContainersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListContainersRequest, ListContainersResponse>,
                        java.util.concurrent.Future<ListContainersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListContainersRequest, ListContainersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataSciencePrivateEndpointsResponse>
            listDataSciencePrivateEndpoints(
                    ListDataSciencePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSciencePrivateEndpointsRequest,
                                    ListDataSciencePrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDataSciencePrivateEndpoints");
        final ListDataSciencePrivateEndpointsRequest interceptedRequest =
                ListDataSciencePrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSciencePrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListDataSciencePrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/ListDataSciencePrivateEndpoints");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDataSciencePrivateEndpointsResponse>
                transformer =
                        ListDataSciencePrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDataSciencePrivateEndpointsRequest,
                        ListDataSciencePrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataSciencePrivateEndpointsRequest,
                                ListDataSciencePrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDataSciencePrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataSciencePrivateEndpointsRequest,
                    ListDataSciencePrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFastLaunchJobConfigsResponse> listFastLaunchJobConfigs(
            ListFastLaunchJobConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                    handler) {
        LOG.trace("Called async listFastLaunchJobConfigs");
        final ListFastLaunchJobConfigsRequest interceptedRequest =
                ListFastLaunchJobConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFastLaunchJobConfigsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListFastLaunchJobConfigs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/FastLaunchJobConfigSummary/ListFastLaunchJobConfigs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFastLaunchJobConfigsResponse>
                transformer =
                        ListFastLaunchJobConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>,
                        java.util.concurrent.Future<ListFastLaunchJobConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
        LOG.trace("Called async listJobRuns");
        final ListJobRunsRequest interceptedRequest =
                ListJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListJobRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRunSummary/ListJobRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobRunsResponse>
                transformer =
                        ListJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobRunsRequest, ListJobRunsResponse>,
                        java.util.concurrent.Future<ListJobRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobRunsRequest, ListJobRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobShapesResponse> listJobShapes(
            ListJobShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                    handler) {
        LOG.trace("Called async listJobShapes");
        final ListJobShapesRequest interceptedRequest =
                ListJobShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListJobShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobShapeSummary/ListJobShapes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobShapesResponse>
                transformer =
                        ListJobShapesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobShapesRequest, ListJobShapesResponse>,
                        java.util.concurrent.Future<ListJobShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobShapesRequest, ListJobShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        LOG.trace("Called async listJobs");
        final ListJobsRequest interceptedRequest = ListJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobSummary/ListJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobsResponse> transformer =
                ListJobsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>,
                        java.util.concurrent.Future<ListJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobsRequest, ListJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMlApplicationImplementationVersionsResponse>
            listMlApplicationImplementationVersions(
                    ListMlApplicationImplementationVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMlApplicationImplementationVersionsRequest,
                                    ListMlApplicationImplementationVersionsResponse>
                            handler) {
        LOG.trace("Called async listMlApplicationImplementationVersions");
        final ListMlApplicationImplementationVersionsRequest interceptedRequest =
                ListMlApplicationImplementationVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMlApplicationImplementationVersionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListMlApplicationImplementationVersions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/ListMlApplicationImplementationVersions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMlApplicationImplementationVersionsResponse>
                transformer =
                        ListMlApplicationImplementationVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMlApplicationImplementationVersionsRequest,
                        ListMlApplicationImplementationVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMlApplicationImplementationVersionsRequest,
                                ListMlApplicationImplementationVersionsResponse>,
                        java.util.concurrent.Future<
                                ListMlApplicationImplementationVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMlApplicationImplementationVersionsRequest,
                    ListMlApplicationImplementationVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMlApplicationImplementationsResponse>
            listMlApplicationImplementations(
                    ListMlApplicationImplementationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMlApplicationImplementationsRequest,
                                    ListMlApplicationImplementationsResponse>
                            handler) {
        LOG.trace("Called async listMlApplicationImplementations");
        final ListMlApplicationImplementationsRequest interceptedRequest =
                ListMlApplicationImplementationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMlApplicationImplementationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListMlApplicationImplementations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/ListMlApplicationImplementations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMlApplicationImplementationsResponse>
                transformer =
                        ListMlApplicationImplementationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMlApplicationImplementationsRequest,
                        ListMlApplicationImplementationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMlApplicationImplementationsRequest,
                                ListMlApplicationImplementationsResponse>,
                        java.util.concurrent.Future<ListMlApplicationImplementationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMlApplicationImplementationsRequest,
                    ListMlApplicationImplementationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMlApplicationInstanceViewsResponse>
            listMlApplicationInstanceViews(
                    ListMlApplicationInstanceViewsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMlApplicationInstanceViewsRequest,
                                    ListMlApplicationInstanceViewsResponse>
                            handler) {
        LOG.trace("Called async listMlApplicationInstanceViews");
        final ListMlApplicationInstanceViewsRequest interceptedRequest =
                ListMlApplicationInstanceViewsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMlApplicationInstanceViewsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListMlApplicationInstanceViews",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/ListMlApplicationInstanceViews");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMlApplicationInstanceViewsResponse>
                transformer =
                        ListMlApplicationInstanceViewsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMlApplicationInstanceViewsRequest,
                        ListMlApplicationInstanceViewsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMlApplicationInstanceViewsRequest,
                                ListMlApplicationInstanceViewsResponse>,
                        java.util.concurrent.Future<ListMlApplicationInstanceViewsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMlApplicationInstanceViewsRequest, ListMlApplicationInstanceViewsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMlApplicationInstancesResponse>
            listMlApplicationInstances(
                    ListMlApplicationInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMlApplicationInstancesRequest,
                                    ListMlApplicationInstancesResponse>
                            handler) {
        LOG.trace("Called async listMlApplicationInstances");
        final ListMlApplicationInstancesRequest interceptedRequest =
                ListMlApplicationInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMlApplicationInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListMlApplicationInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/ListMlApplicationInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMlApplicationInstancesResponse>
                transformer =
                        ListMlApplicationInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMlApplicationInstancesRequest, ListMlApplicationInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMlApplicationInstancesRequest,
                                ListMlApplicationInstancesResponse>,
                        java.util.concurrent.Future<ListMlApplicationInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMlApplicationInstancesRequest, ListMlApplicationInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMlApplicationsResponse> listMlApplications(
            ListMlApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMlApplicationsRequest, ListMlApplicationsResponse>
                    handler) {
        LOG.trace("Called async listMlApplications");
        final ListMlApplicationsRequest interceptedRequest =
                ListMlApplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMlApplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListMlApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/ListMlApplications");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMlApplicationsResponse>
                transformer =
                        ListMlApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMlApplicationsRequest, ListMlApplicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMlApplicationsRequest, ListMlApplicationsResponse>,
                        java.util.concurrent.Future<ListMlApplicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMlApplicationsRequest, ListMlApplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentModelStatesResponse>
            listModelDeploymentModelStates(
                    ListModelDeploymentModelStatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModelDeploymentModelStatesRequest,
                                    ListModelDeploymentModelStatesResponse>
                            handler) {
        LOG.trace("Called async listModelDeploymentModelStates");
        final ListModelDeploymentModelStatesRequest interceptedRequest =
                ListModelDeploymentModelStatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelDeploymentModelStatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelDeploymentModelStates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentModelStateSummary/ListModelDeploymentModelStates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListModelDeploymentModelStatesResponse>
                transformer =
                        ListModelDeploymentModelStatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelDeploymentModelStatesRequest,
                        ListModelDeploymentModelStatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelDeploymentModelStatesRequest,
                                ListModelDeploymentModelStatesResponse>,
                        java.util.concurrent.Future<ListModelDeploymentModelStatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelDeploymentModelStatesRequest, ListModelDeploymentModelStatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentShapesResponse> listModelDeploymentShapes(
            ListModelDeploymentShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                    handler) {
        LOG.trace("Called async listModelDeploymentShapes");
        final ListModelDeploymentShapesRequest interceptedRequest =
                ListModelDeploymentShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelDeploymentShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelDeploymentShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentShapeSummary/ListModelDeploymentShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListModelDeploymentShapesResponse>
                transformer =
                        ListModelDeploymentShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelDeploymentShapesRequest,
                                ListModelDeploymentShapesResponse>,
                        java.util.concurrent.Future<ListModelDeploymentShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentsResponse> listModelDeployments(
            ListModelDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                    handler) {
        LOG.trace("Called async listModelDeployments");
        final ListModelDeploymentsRequest interceptedRequest =
                ListModelDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelDeploymentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelDeployments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentSummary/ListModelDeployments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelDeploymentsResponse>
                transformer =
                        ListModelDeploymentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelDeploymentsRequest, ListModelDeploymentsResponse>,
                        java.util.concurrent.Future<ListModelDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelDeploymentsRequest, ListModelDeploymentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelGroupModelsResponse> listModelGroupModels(
            ListModelGroupModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelGroupModelsRequest, ListModelGroupModelsResponse>
                    handler) {
        LOG.trace("Called async listModelGroupModels");
        final ListModelGroupModelsRequest interceptedRequest =
                ListModelGroupModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelGroupModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelGroupModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/ListModelGroupModels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelGroupModelsResponse>
                transformer =
                        ListModelGroupModelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelGroupModelsRequest, ListModelGroupModelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelGroupModelsRequest, ListModelGroupModelsResponse>,
                        java.util.concurrent.Future<ListModelGroupModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelGroupModelsRequest, ListModelGroupModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelGroupVersionHistoriesResponse>
            listModelGroupVersionHistories(
                    ListModelGroupVersionHistoriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListModelGroupVersionHistoriesRequest,
                                    ListModelGroupVersionHistoriesResponse>
                            handler) {
        LOG.trace("Called async listModelGroupVersionHistories");
        final ListModelGroupVersionHistoriesRequest interceptedRequest =
                ListModelGroupVersionHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelGroupVersionHistoriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelGroupVersionHistories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistorySummary/ListModelGroupVersionHistories");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListModelGroupVersionHistoriesResponse>
                transformer =
                        ListModelGroupVersionHistoriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelGroupVersionHistoriesRequest,
                        ListModelGroupVersionHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelGroupVersionHistoriesRequest,
                                ListModelGroupVersionHistoriesResponse>,
                        java.util.concurrent.Future<ListModelGroupVersionHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelGroupVersionHistoriesRequest, ListModelGroupVersionHistoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelGroupsResponse> listModelGroups(
            ListModelGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelGroupsRequest, ListModelGroupsResponse>
                    handler) {
        LOG.trace("Called async listModelGroups");
        final ListModelGroupsRequest interceptedRequest =
                ListModelGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupSummary/ListModelGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelGroupsResponse>
                transformer =
                        ListModelGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListModelGroupsRequest, ListModelGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelGroupsRequest, ListModelGroupsResponse>,
                        java.util.concurrent.Future<ListModelGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelGroupsRequest, ListModelGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelVersionSetsResponse> listModelVersionSets(
            ListModelVersionSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelVersionSetsRequest, ListModelVersionSetsResponse>
                    handler) {
        LOG.trace("Called async listModelVersionSets");
        final ListModelVersionSetsRequest interceptedRequest =
                ListModelVersionSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelVersionSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModelVersionSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSetSummary/ListModelVersionSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelVersionSetsResponse>
                transformer =
                        ListModelVersionSetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModelVersionSetsRequest, ListModelVersionSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelVersionSetsRequest, ListModelVersionSetsResponse>,
                        java.util.concurrent.Future<ListModelVersionSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelVersionSetsRequest, ListModelVersionSetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse>
                    handler) {
        LOG.trace("Called async listModels");
        final ListModelsRequest interceptedRequest = ListModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelSummary/ListModels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelsResponse>
                transformer =
                        ListModelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelsRequest, ListModelsResponse>,
                        java.util.concurrent.Future<ListModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelsRequest, ListModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionShapesResponse> listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                    handler) {
        LOG.trace("Called async listNotebookSessionShapes");
        final ListNotebookSessionShapesRequest interceptedRequest =
                ListNotebookSessionShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotebookSessionShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListNotebookSessionShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionShapeSummary/ListNotebookSessionShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNotebookSessionShapesResponse>
                transformer =
                        ListNotebookSessionShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNotebookSessionShapesRequest,
                                ListNotebookSessionShapesResponse>,
                        java.util.concurrent.Future<ListNotebookSessionShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionsResponse> listNotebookSessions(
            ListNotebookSessionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                    handler) {
        LOG.trace("Called async listNotebookSessions");
        final ListNotebookSessionsRequest interceptedRequest =
                ListNotebookSessionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotebookSessionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListNotebookSessions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionSummary/ListNotebookSessions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNotebookSessionsResponse>
                transformer =
                        ListNotebookSessionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNotebookSessionsRequest, ListNotebookSessionsResponse>,
                        java.util.concurrent.Future<ListNotebookSessionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNotebookSessionsRequest, ListNotebookSessionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPipelineRunsResponse> listPipelineRuns(
            ListPipelineRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPipelineRunsRequest, ListPipelineRunsResponse>
                    handler) {
        LOG.trace("Called async listPipelineRuns");
        final ListPipelineRunsRequest interceptedRequest =
                ListPipelineRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelineRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListPipelineRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/ListPipelineRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPipelineRunsResponse>
                transformer =
                        ListPipelineRunsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPipelineRunsRequest, ListPipelineRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPipelineRunsRequest, ListPipelineRunsResponse>,
                        java.util.concurrent.Future<ListPipelineRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPipelineRunsRequest, ListPipelineRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler) {
        LOG.trace("Called async listPipelines");
        final ListPipelinesRequest interceptedRequest =
                ListPipelinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListPipelines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/ListPipelines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPipelinesResponse>
                transformer =
                        ListPipelinesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPipelinesRequest, ListPipelinesResponse>,
                        java.util.concurrent.Future<ListPipelinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPipelinesRequest, ListPipelinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "ListProjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ProjectSummary/ListProjects");
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
    public java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler) {
        LOG.trace("Called async listSchedules");
        final ListSchedulesRequest interceptedRequest =
                ListSchedulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchedulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "ListSchedules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ListSchedules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchedulesResponse>
                transformer =
                        ListSchedulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchedulesRequest, ListSchedulesResponse>,
                        java.util.concurrent.Future<ListSchedulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchedulesRequest, ListSchedulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestErrors");
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
                        "DataScience",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestLogs");
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
                        "DataScience",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequestSummary/ListWorkRequests");
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
    public java.util.concurrent.Future<PutMlApplicationPackageResponse> putMlApplicationPackage(
            PutMlApplicationPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutMlApplicationPackageRequest, PutMlApplicationPackageResponse>
                    handler) {
        LOG.trace("Called async putMlApplicationPackage");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, PutMlApplicationPackageRequest.builder());
        }
        final PutMlApplicationPackageRequest interceptedRequest =
                PutMlApplicationPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMlApplicationPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "PutMlApplicationPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/PutMlApplicationPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutMlApplicationPackageResponse>
                transformer =
                        PutMlApplicationPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutMlApplicationPackageRequest, PutMlApplicationPackageResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutMlApplicationPackageRequest, PutMlApplicationPackageResponse>,
                        java.util.concurrent.Future<PutMlApplicationPackageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPutMlApplicationPackage(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutMlApplicationPackageRequest, PutMlApplicationPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getPutMlApplicationPackage(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecoverMlApplicationInstanceViewResponse>
            recoverMlApplicationInstanceView(
                    RecoverMlApplicationInstanceViewRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RecoverMlApplicationInstanceViewRequest,
                                    RecoverMlApplicationInstanceViewResponse>
                            handler) {
        LOG.trace("Called async recoverMlApplicationInstanceView");
        final RecoverMlApplicationInstanceViewRequest interceptedRequest =
                RecoverMlApplicationInstanceViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecoverMlApplicationInstanceViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "RecoverMlApplicationInstanceView",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/RecoverMlApplicationInstanceView");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RecoverMlApplicationInstanceViewResponse>
                transformer =
                        RecoverMlApplicationInstanceViewConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RecoverMlApplicationInstanceViewRequest,
                        RecoverMlApplicationInstanceViewResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecoverMlApplicationInstanceViewRequest,
                                RecoverMlApplicationInstanceViewResponse>,
                        java.util.concurrent.Future<RecoverMlApplicationInstanceViewResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecoverMlApplicationInstanceViewRequest,
                    RecoverMlApplicationInstanceViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RegisterModelArtifactReferenceResponse>
            registerModelArtifactReference(
                    RegisterModelArtifactReferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RegisterModelArtifactReferenceRequest,
                                    RegisterModelArtifactReferenceResponse>
                            handler) {
        LOG.trace("Called async registerModelArtifactReference");
        final RegisterModelArtifactReferenceRequest interceptedRequest =
                RegisterModelArtifactReferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RegisterModelArtifactReferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "RegisterModelArtifactReference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/RegisterModelArtifactReferenceDetails/RegisterModelArtifactReference");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RegisterModelArtifactReferenceResponse>
                transformer =
                        RegisterModelArtifactReferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RegisterModelArtifactReferenceRequest,
                        RegisterModelArtifactReferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RegisterModelArtifactReferenceRequest,
                                RegisterModelArtifactReferenceResponse>,
                        java.util.concurrent.Future<RegisterModelArtifactReferenceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRegisterModelArtifactReferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RegisterModelArtifactReferenceRequest, RegisterModelArtifactReferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestoreArchivedModelArtifactResponse>
            restoreArchivedModelArtifact(
                    RestoreArchivedModelArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestoreArchivedModelArtifactRequest,
                                    RestoreArchivedModelArtifactResponse>
                            handler) {
        LOG.trace("Called async restoreArchivedModelArtifact");
        final RestoreArchivedModelArtifactRequest interceptedRequest =
                RestoreArchivedModelArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreArchivedModelArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "RestoreArchivedModelArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/RestoreArchivedModelArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RestoreArchivedModelArtifactResponse>
                transformer =
                        RestoreArchivedModelArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RestoreArchivedModelArtifactRequest, RestoreArchivedModelArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestoreArchivedModelArtifactRequest,
                                RestoreArchivedModelArtifactResponse>,
                        java.util.concurrent.Future<RestoreArchivedModelArtifactResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestoreArchivedModelArtifactRequest, RestoreArchivedModelArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TriggerMlApplicationInstanceFlowResponse>
            triggerMlApplicationInstanceFlow(
                    TriggerMlApplicationInstanceFlowRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TriggerMlApplicationInstanceFlowRequest,
                                    TriggerMlApplicationInstanceFlowResponse>
                            handler) {
        LOG.trace("Called async triggerMlApplicationInstanceFlow");
        final TriggerMlApplicationInstanceFlowRequest interceptedRequest =
                TriggerMlApplicationInstanceFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TriggerMlApplicationInstanceFlowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "TriggerMlApplicationInstanceFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/TriggerMlApplicationInstanceFlow");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TriggerMlApplicationInstanceFlowResponse>
                transformer =
                        TriggerMlApplicationInstanceFlowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TriggerMlApplicationInstanceFlowRequest,
                        TriggerMlApplicationInstanceFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TriggerMlApplicationInstanceFlowRequest,
                                TriggerMlApplicationInstanceFlowResponse>,
                        java.util.concurrent.Future<TriggerMlApplicationInstanceFlowResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTriggerMlApplicationInstanceFlowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TriggerMlApplicationInstanceFlowRequest,
                    TriggerMlApplicationInstanceFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TriggerMlApplicationInstanceViewFlowResponse>
            triggerMlApplicationInstanceViewFlow(
                    TriggerMlApplicationInstanceViewFlowRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TriggerMlApplicationInstanceViewFlowRequest,
                                    TriggerMlApplicationInstanceViewFlowResponse>
                            handler) {
        LOG.trace("Called async triggerMlApplicationInstanceViewFlow");
        final TriggerMlApplicationInstanceViewFlowRequest interceptedRequest =
                TriggerMlApplicationInstanceViewFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TriggerMlApplicationInstanceViewFlowConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "TriggerMlApplicationInstanceViewFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/TriggerMlApplicationInstanceViewFlow");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TriggerMlApplicationInstanceViewFlowResponse>
                transformer =
                        TriggerMlApplicationInstanceViewFlowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TriggerMlApplicationInstanceViewFlowRequest,
                        TriggerMlApplicationInstanceViewFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TriggerMlApplicationInstanceViewFlowRequest,
                                TriggerMlApplicationInstanceViewFlowResponse>,
                        java.util.concurrent.Future<TriggerMlApplicationInstanceViewFlowResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTriggerMlApplicationInstanceViewFlowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TriggerMlApplicationInstanceViewFlowRequest,
                    TriggerMlApplicationInstanceViewFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeTargetResponse> updateComputeTarget(
            UpdateComputeTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateComputeTargetRequest, UpdateComputeTargetResponse>
                    handler) {
        LOG.trace("Called async updateComputeTarget");
        final UpdateComputeTargetRequest interceptedRequest =
                UpdateComputeTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateComputeTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ComputeTarget/UpdateComputeTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateComputeTargetResponse>
                transformer =
                        UpdateComputeTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeTargetRequest, UpdateComputeTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeTargetRequest, UpdateComputeTargetResponse>,
                        java.util.concurrent.Future<UpdateComputeTargetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeTargetRequest, UpdateComputeTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSciencePrivateEndpointResponse>
            updateDataSciencePrivateEndpoint(
                    UpdateDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSciencePrivateEndpointRequest,
                                    UpdateDataSciencePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDataSciencePrivateEndpoint");
        final UpdateDataSciencePrivateEndpointRequest interceptedRequest =
                UpdateDataSciencePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataSciencePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateDataSciencePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/UpdateDataSciencePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDataSciencePrivateEndpointResponse>
                transformer =
                        UpdateDataSciencePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDataSciencePrivateEndpointRequest,
                        UpdateDataSciencePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataSciencePrivateEndpointRequest,
                                UpdateDataSciencePrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDataSciencePrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataSciencePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataSciencePrivateEndpointRequest,
                    UpdateDataSciencePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {
        LOG.trace("Called async updateJob");
        final UpdateJobRequest interceptedRequest = UpdateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/UpdateJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateJobResponse>
                transformer =
                        UpdateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>,
                        java.util.concurrent.Future<UpdateJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRequest, UpdateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobRunResponse> updateJobRun(
            UpdateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                    handler) {
        LOG.trace("Called async updateJobRun");
        final UpdateJobRunRequest interceptedRequest =
                UpdateJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/UpdateJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateJobRunResponse>
                transformer =
                        UpdateJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateJobRunRequest, UpdateJobRunResponse>,
                        java.util.concurrent.Future<UpdateJobRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRunRequest, UpdateJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMlApplicationResponse> updateMlApplication(
            UpdateMlApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMlApplicationRequest, UpdateMlApplicationResponse>
                    handler) {
        LOG.trace("Called async updateMlApplication");
        final UpdateMlApplicationRequest interceptedRequest =
                UpdateMlApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMlApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateMlApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/UpdateMlApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMlApplicationResponse>
                transformer =
                        UpdateMlApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMlApplicationRequest, UpdateMlApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMlApplicationRequest, UpdateMlApplicationResponse>,
                        java.util.concurrent.Future<UpdateMlApplicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMlApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMlApplicationRequest, UpdateMlApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMlApplicationImplementationResponse>
            updateMlApplicationImplementation(
                    UpdateMlApplicationImplementationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMlApplicationImplementationRequest,
                                    UpdateMlApplicationImplementationResponse>
                            handler) {
        LOG.trace("Called async updateMlApplicationImplementation");
        final UpdateMlApplicationImplementationRequest interceptedRequest =
                UpdateMlApplicationImplementationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMlApplicationImplementationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateMlApplicationImplementation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/UpdateMlApplicationImplementation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMlApplicationImplementationResponse>
                transformer =
                        UpdateMlApplicationImplementationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMlApplicationImplementationRequest,
                        UpdateMlApplicationImplementationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMlApplicationImplementationRequest,
                                UpdateMlApplicationImplementationResponse>,
                        java.util.concurrent.Future<UpdateMlApplicationImplementationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMlApplicationImplementationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMlApplicationImplementationRequest,
                    UpdateMlApplicationImplementationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMlApplicationImplementationVersionResponse>
            updateMlApplicationImplementationVersion(
                    UpdateMlApplicationImplementationVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMlApplicationImplementationVersionRequest,
                                    UpdateMlApplicationImplementationVersionResponse>
                            handler) {
        LOG.trace("Called async updateMlApplicationImplementationVersion");
        final UpdateMlApplicationImplementationVersionRequest interceptedRequest =
                UpdateMlApplicationImplementationVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMlApplicationImplementationVersionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateMlApplicationImplementationVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/UpdateMlApplicationImplementationVersion");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMlApplicationImplementationVersionResponse>
                transformer =
                        UpdateMlApplicationImplementationVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMlApplicationImplementationVersionRequest,
                        UpdateMlApplicationImplementationVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMlApplicationImplementationVersionRequest,
                                UpdateMlApplicationImplementationVersionResponse>,
                        java.util.concurrent.Future<
                                UpdateMlApplicationImplementationVersionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateMlApplicationImplementationVersionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMlApplicationImplementationVersionRequest,
                    UpdateMlApplicationImplementationVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMlApplicationInstanceResponse>
            updateMlApplicationInstance(
                    UpdateMlApplicationInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMlApplicationInstanceRequest,
                                    UpdateMlApplicationInstanceResponse>
                            handler) {
        LOG.trace("Called async updateMlApplicationInstance");
        final UpdateMlApplicationInstanceRequest interceptedRequest =
                UpdateMlApplicationInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMlApplicationInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateMlApplicationInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/UpdateMlApplicationInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMlApplicationInstanceResponse>
                transformer =
                        UpdateMlApplicationInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMlApplicationInstanceRequest, UpdateMlApplicationInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMlApplicationInstanceRequest,
                                UpdateMlApplicationInstanceResponse>,
                        java.util.concurrent.Future<UpdateMlApplicationInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMlApplicationInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMlApplicationInstanceRequest, UpdateMlApplicationInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMlApplicationInstanceViewResponse>
            updateMlApplicationInstanceView(
                    UpdateMlApplicationInstanceViewRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMlApplicationInstanceViewRequest,
                                    UpdateMlApplicationInstanceViewResponse>
                            handler) {
        LOG.trace("Called async updateMlApplicationInstanceView");
        final UpdateMlApplicationInstanceViewRequest interceptedRequest =
                UpdateMlApplicationInstanceViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMlApplicationInstanceViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateMlApplicationInstanceView",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/UpdateMlApplicationInstanceView");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMlApplicationInstanceViewResponse>
                transformer =
                        UpdateMlApplicationInstanceViewConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMlApplicationInstanceViewRequest,
                        UpdateMlApplicationInstanceViewResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMlApplicationInstanceViewRequest,
                                UpdateMlApplicationInstanceViewResponse>,
                        java.util.concurrent.Future<UpdateMlApplicationInstanceViewResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMlApplicationInstanceViewDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMlApplicationInstanceViewRequest,
                    UpdateMlApplicationInstanceViewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                    handler) {
        LOG.trace("Called async updateModel");
        final UpdateModelRequest interceptedRequest =
                UpdateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelResponse>
                transformer =
                        UpdateModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelRequest, UpdateModelResponse>,
                        java.util.concurrent.Future<UpdateModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelRequest, UpdateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelCustomMetadatumArtifactResponse>
            updateModelCustomMetadatumArtifact(
                    UpdateModelCustomMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateModelCustomMetadatumArtifactRequest,
                                    UpdateModelCustomMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async updateModelCustomMetadatumArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateModelCustomMetadatumArtifactRequest.builder());
        }
        final UpdateModelCustomMetadatumArtifactRequest interceptedRequest =
                UpdateModelCustomMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelCustomMetadatumArtifactConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelCustomMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelCustomMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateModelCustomMetadatumArtifactResponse>
                transformer =
                        UpdateModelCustomMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelCustomMetadatumArtifactRequest,
                        UpdateModelCustomMetadatumArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelCustomMetadatumArtifactRequest,
                                UpdateModelCustomMetadatumArtifactResponse>,
                        java.util.concurrent.Future<UpdateModelCustomMetadatumArtifactResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelCustomMetadatumArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelCustomMetadatumArtifactRequest,
                    UpdateModelCustomMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelCustomMetadatumArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelDefinedMetadatumArtifactResponse>
            updateModelDefinedMetadatumArtifact(
                    UpdateModelDefinedMetadatumArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateModelDefinedMetadatumArtifactRequest,
                                    UpdateModelDefinedMetadatumArtifactResponse>
                            handler) {
        LOG.trace("Called async updateModelDefinedMetadatumArtifact");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateModelDefinedMetadatumArtifactRequest.builder());
        }
        final UpdateModelDefinedMetadatumArtifactRequest interceptedRequest =
                UpdateModelDefinedMetadatumArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelDefinedMetadatumArtifactConverter.fromRequest(
                        client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelDefinedMetadatumArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelDefinedMetadatumArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateModelDefinedMetadatumArtifactResponse>
                transformer =
                        UpdateModelDefinedMetadatumArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelDefinedMetadatumArtifactRequest,
                        UpdateModelDefinedMetadatumArtifactResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelDefinedMetadatumArtifactRequest,
                                UpdateModelDefinedMetadatumArtifactResponse>,
                        java.util.concurrent.Future<UpdateModelDefinedMetadatumArtifactResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModelDefinedMetadatumArtifact(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelDefinedMetadatumArtifactRequest,
                    UpdateModelDefinedMetadatumArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getModelDefinedMetadatumArtifact(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelDeploymentResponse> updateModelDeployment(
            UpdateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                    handler) {
        LOG.trace("Called async updateModelDeployment");
        final UpdateModelDeploymentRequest interceptedRequest =
                UpdateModelDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/UpdateModelDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelDeploymentResponse>
                transformer =
                        UpdateModelDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>,
                        java.util.concurrent.Future<UpdateModelDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelGroupResponse> updateModelGroup(
            UpdateModelGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelGroupRequest, UpdateModelGroupResponse>
                    handler) {
        LOG.trace("Called async updateModelGroup");
        final UpdateModelGroupRequest interceptedRequest =
                UpdateModelGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroup/UpdateModelGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelGroupResponse>
                transformer =
                        UpdateModelGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateModelGroupRequest, UpdateModelGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelGroupRequest, UpdateModelGroupResponse>,
                        java.util.concurrent.Future<UpdateModelGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelGroupRequest, UpdateModelGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelGroupVersionHistoryResponse>
            updateModelGroupVersionHistory(
                    UpdateModelGroupVersionHistoryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateModelGroupVersionHistoryRequest,
                                    UpdateModelGroupVersionHistoryResponse>
                            handler) {
        LOG.trace("Called async updateModelGroupVersionHistory");
        final UpdateModelGroupVersionHistoryRequest interceptedRequest =
                UpdateModelGroupVersionHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelGroupVersionHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelGroupVersionHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelGroupVersionHistory/UpdateModelGroupVersionHistory");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateModelGroupVersionHistoryResponse>
                transformer =
                        UpdateModelGroupVersionHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelGroupVersionHistoryRequest,
                        UpdateModelGroupVersionHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelGroupVersionHistoryRequest,
                                UpdateModelGroupVersionHistoryResponse>,
                        java.util.concurrent.Future<UpdateModelGroupVersionHistoryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelGroupVersionHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelGroupVersionHistoryRequest, UpdateModelGroupVersionHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelProvenanceResponse> updateModelProvenance(
            UpdateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                    handler) {
        LOG.trace("Called async updateModelProvenance");
        final UpdateModelProvenanceRequest interceptedRequest =
                UpdateModelProvenanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelProvenanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelProvenance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelProvenance");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelProvenanceResponse>
                transformer =
                        UpdateModelProvenanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>,
                        java.util.concurrent.Future<UpdateModelProvenanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelProvenanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionSetResponse> updateModelVersionSet(
            UpdateModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>
                    handler) {
        LOG.trace("Called async updateModelVersionSet");
        final UpdateModelVersionSetRequest interceptedRequest =
                UpdateModelVersionSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelVersionSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateModelVersionSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/UpdateModelVersionSet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelVersionSetResponse>
                transformer =
                        UpdateModelVersionSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>,
                        java.util.concurrent.Future<UpdateModelVersionSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelVersionSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookSessionResponse> updateNotebookSession(
            UpdateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                    handler) {
        LOG.trace("Called async updateNotebookSession");
        final UpdateNotebookSessionRequest interceptedRequest =
                UpdateNotebookSessionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNotebookSessionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateNotebookSession",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/UpdateNotebookSession");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateNotebookSessionResponse>
                transformer =
                        UpdateNotebookSessionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>,
                        java.util.concurrent.Future<UpdateNotebookSessionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNotebookSessionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRequest, UpdatePipelineResponse>
                    handler) {
        LOG.trace("Called async updatePipeline");
        final UpdatePipelineRequest interceptedRequest =
                UpdatePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdatePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/UpdatePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePipelineResponse>
                transformer =
                        UpdatePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePipelineRequest, UpdatePipelineResponse>,
                        java.util.concurrent.Future<UpdatePipelineResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePipelineRequest, UpdatePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineRunResponse> updatePipelineRun(
            UpdatePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRunRequest, UpdatePipelineRunResponse>
                    handler) {
        LOG.trace("Called async updatePipelineRun");
        final UpdatePipelineRunRequest interceptedRequest =
                UpdatePipelineRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePipelineRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdatePipelineRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/UpdatePipelineRun");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePipelineRunResponse>
                transformer =
                        UpdatePipelineRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePipelineRunRequest, UpdatePipelineRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePipelineRunRequest, UpdatePipelineRunResponse>,
                        java.util.concurrent.Future<UpdatePipelineRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePipelineRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePipelineRunRequest, UpdatePipelineRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataScience",
                        "UpdateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/UpdateProject");
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
    public java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduleRequest, UpdateScheduleResponse>
                    handler) {
        LOG.trace("Called async updateSchedule");
        final UpdateScheduleRequest interceptedRequest =
                UpdateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataScience",
                        "UpdateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/UpdateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateScheduleResponse>
                transformer =
                        UpdateScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateScheduleRequest, UpdateScheduleResponse>,
                        java.util.concurrent.Future<UpdateScheduleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateScheduleRequest, UpdateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
