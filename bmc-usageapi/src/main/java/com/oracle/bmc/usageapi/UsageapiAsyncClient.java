/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.usageapi.internal.http.*;
import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;

/**
 * Async client implementation for Usageapi service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class UsageapiAsyncClient implements UsageapiAsync {
    /**
     * Service instance for Usageapi.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("USAGEAPI")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usageapi.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsageapiAsyncClient.class);

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
    public UsageapiAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
    public UsageapiAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, UsageapiAsyncClient> {
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
        public UsageapiAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new UsageapiAsyncClient(
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
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
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

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     * enable or disable the use of realm-specific endpoint template respectively
     */
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
    public java.util.concurrent.Future<CreateCustomTableResponse> createCustomTable(
            CreateCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomTableRequest, CreateCustomTableResponse>
                    handler) {
        LOG.trace("Called async createCustomTable");
        final CreateCustomTableRequest interceptedRequest =
                CreateCustomTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "CreateCustomTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/CreateCustomTable");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCustomTableResponse>
                transformer =
                        CreateCustomTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCustomTableRequest, CreateCustomTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCustomTableRequest, CreateCustomTableResponse>,
                        java.util.concurrent.Future<CreateCustomTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCustomTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCustomTableRequest, CreateCustomTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEmailRecipientsGroupResponse>
            createEmailRecipientsGroup(
                    CreateEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateEmailRecipientsGroupRequest,
                                    CreateEmailRecipientsGroupResponse>
                            handler) {
        LOG.trace("Called async createEmailRecipientsGroup");
        final CreateEmailRecipientsGroupRequest interceptedRequest =
                CreateEmailRecipientsGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEmailRecipientsGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "CreateEmailRecipientsGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/CreateEmailRecipientsGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateEmailRecipientsGroupResponse>
                transformer =
                        CreateEmailRecipientsGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateEmailRecipientsGroupRequest, CreateEmailRecipientsGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEmailRecipientsGroupRequest,
                                CreateEmailRecipientsGroupResponse>,
                        java.util.concurrent.Future<CreateEmailRecipientsGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEmailRecipientsGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEmailRecipientsGroupRequest, CreateEmailRecipientsGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateQueryResponse> createQuery(
            CreateQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateQueryRequest, CreateQueryResponse>
                    handler) {
        LOG.trace("Called async createQuery");
        final CreateQueryRequest interceptedRequest =
                CreateQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "CreateQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/CreateQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateQueryResponse>
                transformer =
                        CreateQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateQueryRequest, CreateQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateQueryRequest, CreateQueryResponse>,
                        java.util.concurrent.Future<CreateQueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateQueryRequest, CreateQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Usageapi",
                        "CreateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/CreateSchedule");
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
    public java.util.concurrent.Future<CreateUsageCarbonEmissionsQueryResponse>
            createUsageCarbonEmissionsQuery(
                    CreateUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateUsageCarbonEmissionsQueryRequest,
                                    CreateUsageCarbonEmissionsQueryResponse>
                            handler) {
        LOG.trace("Called async createUsageCarbonEmissionsQuery");
        final CreateUsageCarbonEmissionsQueryRequest interceptedRequest =
                CreateUsageCarbonEmissionsQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUsageCarbonEmissionsQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "CreateUsageCarbonEmissionsQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/CreateUsageCarbonEmissionsQuery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateUsageCarbonEmissionsQueryResponse>
                transformer =
                        CreateUsageCarbonEmissionsQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateUsageCarbonEmissionsQueryRequest,
                        CreateUsageCarbonEmissionsQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUsageCarbonEmissionsQueryRequest,
                                CreateUsageCarbonEmissionsQueryResponse>,
                        java.util.concurrent.Future<CreateUsageCarbonEmissionsQueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUsageCarbonEmissionsQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUsageCarbonEmissionsQueryRequest,
                    CreateUsageCarbonEmissionsQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomTableResponse> deleteCustomTable(
            DeleteCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomTableRequest, DeleteCustomTableResponse>
                    handler) {
        LOG.trace("Called async deleteCustomTable");
        final DeleteCustomTableRequest interceptedRequest =
                DeleteCustomTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "DeleteCustomTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/DeleteCustomTable");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCustomTableResponse>
                transformer =
                        DeleteCustomTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCustomTableRequest, DeleteCustomTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCustomTableRequest, DeleteCustomTableResponse>,
                        java.util.concurrent.Future<DeleteCustomTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCustomTableRequest, DeleteCustomTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailRecipientsGroupResponse>
            deleteEmailRecipientsGroup(
                    DeleteEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEmailRecipientsGroupRequest,
                                    DeleteEmailRecipientsGroupResponse>
                            handler) {
        LOG.trace("Called async deleteEmailRecipientsGroup");
        final DeleteEmailRecipientsGroupRequest interceptedRequest =
                DeleteEmailRecipientsGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEmailRecipientsGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "DeleteEmailRecipientsGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/DeleteEmailRecipientsGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteEmailRecipientsGroupResponse>
                transformer =
                        DeleteEmailRecipientsGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteEmailRecipientsGroupRequest, DeleteEmailRecipientsGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEmailRecipientsGroupRequest,
                                DeleteEmailRecipientsGroupResponse>,
                        java.util.concurrent.Future<DeleteEmailRecipientsGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEmailRecipientsGroupRequest, DeleteEmailRecipientsGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteQueryResponse> deleteQuery(
            DeleteQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteQueryRequest, DeleteQueryResponse>
                    handler) {
        LOG.trace("Called async deleteQuery");
        final DeleteQueryRequest interceptedRequest =
                DeleteQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "DeleteQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/DeleteQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteQueryResponse>
                transformer =
                        DeleteQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteQueryRequest, DeleteQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteQueryRequest, DeleteQueryResponse>,
                        java.util.concurrent.Future<DeleteQueryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteQueryRequest, DeleteQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Usageapi",
                        "DeleteSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/DeleteSchedule");
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
    public java.util.concurrent.Future<DeleteUsageCarbonEmissionsQueryResponse>
            deleteUsageCarbonEmissionsQuery(
                    DeleteUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUsageCarbonEmissionsQueryRequest,
                                    DeleteUsageCarbonEmissionsQueryResponse>
                            handler) {
        LOG.trace("Called async deleteUsageCarbonEmissionsQuery");
        final DeleteUsageCarbonEmissionsQueryRequest interceptedRequest =
                DeleteUsageCarbonEmissionsQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUsageCarbonEmissionsQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "DeleteUsageCarbonEmissionsQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/DeleteUsageCarbonEmissionsQuery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteUsageCarbonEmissionsQueryResponse>
                transformer =
                        DeleteUsageCarbonEmissionsQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUsageCarbonEmissionsQueryRequest,
                        DeleteUsageCarbonEmissionsQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUsageCarbonEmissionsQueryRequest,
                                DeleteUsageCarbonEmissionsQueryResponse>,
                        java.util.concurrent.Future<DeleteUsageCarbonEmissionsQueryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUsageCarbonEmissionsQueryRequest,
                    DeleteUsageCarbonEmissionsQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCustomTableResponse> getCustomTable(
            GetCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomTableRequest, GetCustomTableResponse>
                    handler) {
        LOG.trace("Called async getCustomTable");
        final GetCustomTableRequest interceptedRequest =
                GetCustomTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "GetCustomTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/GetCustomTable");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCustomTableResponse>
                transformer =
                        GetCustomTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCustomTableRequest, GetCustomTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCustomTableRequest, GetCustomTableResponse>,
                        java.util.concurrent.Future<GetCustomTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCustomTableRequest, GetCustomTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetEmailRecipientsGroupResponse> getEmailRecipientsGroup(
            GetEmailRecipientsGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>
                    handler) {
        LOG.trace("Called async getEmailRecipientsGroup");
        final GetEmailRecipientsGroupRequest interceptedRequest =
                GetEmailRecipientsGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEmailRecipientsGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "GetEmailRecipientsGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/GetEmailRecipientsGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetEmailRecipientsGroupResponse>
                transformer =
                        GetEmailRecipientsGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>,
                        java.util.concurrent.Future<GetEmailRecipientsGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEmailRecipientsGroupRequest, GetEmailRecipientsGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetQueryResponse> getQuery(
            GetQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetQueryRequest, GetQueryResponse>
                    handler) {
        LOG.trace("Called async getQuery");
        final GetQueryRequest interceptedRequest = GetQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "GetQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/GetQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, GetQueryResponse> transformer =
                GetQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetQueryRequest, GetQueryResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetQueryRequest, GetQueryResponse>,
                        java.util.concurrent.Future<GetQueryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetQueryRequest, GetQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Usageapi",
                        "GetSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/GetSchedule");
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
    public java.util.concurrent.Future<GetScheduledRunResponse> getScheduledRun(
            GetScheduledRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledRunRequest, GetScheduledRunResponse>
                    handler) {
        LOG.trace("Called async getScheduledRun");
        final GetScheduledRunRequest interceptedRequest =
                GetScheduledRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "GetScheduledRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/GetScheduledRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetScheduledRunResponse>
                transformer =
                        GetScheduledRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetScheduledRunRequest, GetScheduledRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduledRunRequest, GetScheduledRunResponse>,
                        java.util.concurrent.Future<GetScheduledRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduledRunRequest, GetScheduledRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUsageCarbonEmissionsQueryResponse>
            getUsageCarbonEmissionsQuery(
                    GetUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUsageCarbonEmissionsQueryRequest,
                                    GetUsageCarbonEmissionsQueryResponse>
                            handler) {
        LOG.trace("Called async getUsageCarbonEmissionsQuery");
        final GetUsageCarbonEmissionsQueryRequest interceptedRequest =
                GetUsageCarbonEmissionsQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUsageCarbonEmissionsQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "GetUsageCarbonEmissionsQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/GetUsageCarbonEmissionsQuery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetUsageCarbonEmissionsQueryResponse>
                transformer =
                        GetUsageCarbonEmissionsQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUsageCarbonEmissionsQueryRequest, GetUsageCarbonEmissionsQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUsageCarbonEmissionsQueryRequest,
                                GetUsageCarbonEmissionsQueryResponse>,
                        java.util.concurrent.Future<GetUsageCarbonEmissionsQueryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUsageCarbonEmissionsQueryRequest, GetUsageCarbonEmissionsQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCustomTablesResponse> listCustomTables(
            ListCustomTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomTablesRequest, ListCustomTablesResponse>
                    handler) {
        LOG.trace("Called async listCustomTables");
        final ListCustomTablesRequest interceptedRequest =
                ListCustomTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "ListCustomTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/ListCustomTables");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCustomTablesResponse>
                transformer =
                        ListCustomTablesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCustomTablesRequest, ListCustomTablesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCustomTablesRequest, ListCustomTablesResponse>,
                        java.util.concurrent.Future<ListCustomTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCustomTablesRequest, ListCustomTablesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEmailRecipientsGroupsResponse> listEmailRecipientsGroups(
            ListEmailRecipientsGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>
                    handler) {
        LOG.trace("Called async listEmailRecipientsGroups");
        final ListEmailRecipientsGroupsRequest interceptedRequest =
                ListEmailRecipientsGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEmailRecipientsGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "ListEmailRecipientsGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/ListEmailRecipientsGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListEmailRecipientsGroupsResponse>
                transformer =
                        ListEmailRecipientsGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEmailRecipientsGroupsRequest,
                                ListEmailRecipientsGroupsResponse>,
                        java.util.concurrent.Future<ListEmailRecipientsGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEmailRecipientsGroupsRequest, ListEmailRecipientsGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResponse> listQueries(
            ListQueriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListQueriesRequest, ListQueriesResponse>
                    handler) {
        LOG.trace("Called async listQueries");
        final ListQueriesRequest interceptedRequest =
                ListQueriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListQueriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "ListQueries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/ListQueries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListQueriesResponse>
                transformer =
                        ListQueriesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListQueriesRequest, ListQueriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListQueriesRequest, ListQueriesResponse>,
                        java.util.concurrent.Future<ListQueriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListQueriesRequest, ListQueriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListScheduledRunsResponse> listScheduledRuns(
            ListScheduledRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledRunsRequest, ListScheduledRunsResponse>
                    handler) {
        LOG.trace("Called async listScheduledRuns");
        final ListScheduledRunsRequest interceptedRequest =
                ListScheduledRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "ListScheduledRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/ListScheduledRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListScheduledRunsResponse>
                transformer =
                        ListScheduledRunsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListScheduledRunsRequest, ListScheduledRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScheduledRunsRequest, ListScheduledRunsResponse>,
                        java.util.concurrent.Future<ListScheduledRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScheduledRunsRequest, ListScheduledRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Usageapi",
                        "ListSchedules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/ListSchedules");
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
    public java.util.concurrent.Future<ListUsageCarbonEmissionsQueriesResponse>
            listUsageCarbonEmissionsQueries(
                    ListUsageCarbonEmissionsQueriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUsageCarbonEmissionsQueriesRequest,
                                    ListUsageCarbonEmissionsQueriesResponse>
                            handler) {
        LOG.trace("Called async listUsageCarbonEmissionsQueries");
        final ListUsageCarbonEmissionsQueriesRequest interceptedRequest =
                ListUsageCarbonEmissionsQueriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsageCarbonEmissionsQueriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "ListUsageCarbonEmissionsQueries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/ListUsageCarbonEmissionsQueries");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListUsageCarbonEmissionsQueriesResponse>
                transformer =
                        ListUsageCarbonEmissionsQueriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUsageCarbonEmissionsQueriesRequest,
                        ListUsageCarbonEmissionsQueriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUsageCarbonEmissionsQueriesRequest,
                                ListUsageCarbonEmissionsQueriesResponse>,
                        java.util.concurrent.Future<ListUsageCarbonEmissionsQueriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUsageCarbonEmissionsQueriesRequest,
                    ListUsageCarbonEmissionsQueriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestAverageCarbonEmissionResponse>
            requestAverageCarbonEmission(
                    RequestAverageCarbonEmissionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestAverageCarbonEmissionRequest,
                                    RequestAverageCarbonEmissionResponse>
                            handler) {
        LOG.trace("Called async requestAverageCarbonEmission");
        final RequestAverageCarbonEmissionRequest interceptedRequest =
                RequestAverageCarbonEmissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestAverageCarbonEmissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestAverageCarbonEmission",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/AverageCarbonEmission/RequestAverageCarbonEmission");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestAverageCarbonEmissionResponse>
                transformer =
                        RequestAverageCarbonEmissionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestAverageCarbonEmissionRequest, RequestAverageCarbonEmissionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestAverageCarbonEmissionRequest,
                                RequestAverageCarbonEmissionResponse>,
                        java.util.concurrent.Future<RequestAverageCarbonEmissionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestAverageCarbonEmissionRequest, RequestAverageCarbonEmissionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestCleanEnergyUsageResponse> requestCleanEnergyUsage(
            RequestCleanEnergyUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>
                    handler) {
        LOG.trace("Called async requestCleanEnergyUsage");
        final RequestCleanEnergyUsageRequest interceptedRequest =
                RequestCleanEnergyUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestCleanEnergyUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestCleanEnergyUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CleanEnergyUsage/RequestCleanEnergyUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestCleanEnergyUsageResponse>
                transformer =
                        RequestCleanEnergyUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>,
                        java.util.concurrent.Future<RequestCleanEnergyUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestCleanEnergyUsageRequest, RequestCleanEnergyUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedConfigurationsResponse>
            requestSummarizedConfigurations(
                    RequestSummarizedConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedConfigurationsRequest,
                                    RequestSummarizedConfigurationsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedConfigurations");
        final RequestSummarizedConfigurationsRequest interceptedRequest =
                RequestSummarizedConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestSummarizedConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestSummarizedConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedConfigurationsResponse>
                transformer =
                        RequestSummarizedConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedConfigurationsRequest,
                        RequestSummarizedConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedConfigurationsRequest,
                                RequestSummarizedConfigurationsResponse>,
                        java.util.concurrent.Future<RequestSummarizedConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedConfigurationsRequest,
                    RequestSummarizedConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedUsagesResponse> requestSummarizedUsages(
            RequestSummarizedUsagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>
                    handler) {
        LOG.trace("Called async requestSummarizedUsages");
        final RequestSummarizedUsagesRequest interceptedRequest =
                RequestSummarizedUsagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedUsagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestSummarizedUsages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageSummary/RequestSummarizedUsages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedUsagesResponse>
                transformer =
                        RequestSummarizedUsagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>,
                        java.util.concurrent.Future<RequestSummarizedUsagesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestSummarizedUsagesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedUsagesRequest, RequestSummarizedUsagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestUsageCarbonEmissionConfigResponse>
            requestUsageCarbonEmissionConfig(
                    RequestUsageCarbonEmissionConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestUsageCarbonEmissionConfigRequest,
                                    RequestUsageCarbonEmissionConfigResponse>
                            handler) {
        LOG.trace("Called async requestUsageCarbonEmissionConfig");
        final RequestUsageCarbonEmissionConfigRequest interceptedRequest =
                RequestUsageCarbonEmissionConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestUsageCarbonEmissionConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissionConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestUsageCarbonEmissionConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestUsageCarbonEmissionConfigResponse>
                transformer =
                        RequestUsageCarbonEmissionConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestUsageCarbonEmissionConfigRequest,
                        RequestUsageCarbonEmissionConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestUsageCarbonEmissionConfigRequest,
                                RequestUsageCarbonEmissionConfigResponse>,
                        java.util.concurrent.Future<RequestUsageCarbonEmissionConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestUsageCarbonEmissionConfigRequest,
                    RequestUsageCarbonEmissionConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestUsageCarbonEmissionsResponse>
            requestUsageCarbonEmissions(
                    RequestUsageCarbonEmissionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestUsageCarbonEmissionsRequest,
                                    RequestUsageCarbonEmissionsResponse>
                            handler) {
        LOG.trace("Called async requestUsageCarbonEmissions");
        final RequestUsageCarbonEmissionsRequest interceptedRequest =
                RequestUsageCarbonEmissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestUsageCarbonEmissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionSummary/RequestUsageCarbonEmissions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestUsageCarbonEmissionsResponse>
                transformer =
                        RequestUsageCarbonEmissionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestUsageCarbonEmissionsRequest, RequestUsageCarbonEmissionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestUsageCarbonEmissionsRequest,
                                RequestUsageCarbonEmissionsResponse>,
                        java.util.concurrent.Future<RequestUsageCarbonEmissionsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestUsageCarbonEmissionsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestUsageCarbonEmissionsRequest, RequestUsageCarbonEmissionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomTableResponse> updateCustomTable(
            UpdateCustomTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomTableRequest, UpdateCustomTableResponse>
                    handler) {
        LOG.trace("Called async updateCustomTable");
        final UpdateCustomTableRequest interceptedRequest =
                UpdateCustomTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "UpdateCustomTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/UpdateCustomTable");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCustomTableResponse>
                transformer =
                        UpdateCustomTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCustomTableRequest, UpdateCustomTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCustomTableRequest, UpdateCustomTableResponse>,
                        java.util.concurrent.Future<UpdateCustomTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCustomTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCustomTableRequest, UpdateCustomTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailRecipientsGroupResponse>
            updateEmailRecipientsGroup(
                    UpdateEmailRecipientsGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEmailRecipientsGroupRequest,
                                    UpdateEmailRecipientsGroupResponse>
                            handler) {
        LOG.trace("Called async updateEmailRecipientsGroup");
        final UpdateEmailRecipientsGroupRequest interceptedRequest =
                UpdateEmailRecipientsGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEmailRecipientsGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "UpdateEmailRecipientsGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/EmailRecipientsGroup/UpdateEmailRecipientsGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateEmailRecipientsGroupResponse>
                transformer =
                        UpdateEmailRecipientsGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateEmailRecipientsGroupRequest, UpdateEmailRecipientsGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateEmailRecipientsGroupRequest,
                                UpdateEmailRecipientsGroupResponse>,
                        java.util.concurrent.Future<UpdateEmailRecipientsGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateEmailRecipientsGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateEmailRecipientsGroupRequest, UpdateEmailRecipientsGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateQueryResponse> updateQuery(
            UpdateQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateQueryRequest, UpdateQueryResponse>
                    handler) {
        LOG.trace("Called async updateQuery");
        final UpdateQueryRequest interceptedRequest =
                UpdateQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "UpdateQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/UpdateQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateQueryResponse>
                transformer =
                        UpdateQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateQueryRequest, UpdateQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateQueryRequest, UpdateQueryResponse>,
                        java.util.concurrent.Future<UpdateQueryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateQueryRequest, UpdateQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Usageapi",
                        "UpdateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/UpdateSchedule");
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

    @Override
    public java.util.concurrent.Future<UpdateUsageCarbonEmissionsQueryResponse>
            updateUsageCarbonEmissionsQuery(
                    UpdateUsageCarbonEmissionsQueryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateUsageCarbonEmissionsQueryRequest,
                                    UpdateUsageCarbonEmissionsQueryResponse>
                            handler) {
        LOG.trace("Called async updateUsageCarbonEmissionsQuery");
        final UpdateUsageCarbonEmissionsQueryRequest interceptedRequest =
                UpdateUsageCarbonEmissionsQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUsageCarbonEmissionsQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Usageapi",
                        "UpdateUsageCarbonEmissionsQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/UpdateUsageCarbonEmissionsQuery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateUsageCarbonEmissionsQueryResponse>
                transformer =
                        UpdateUsageCarbonEmissionsQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateUsageCarbonEmissionsQueryRequest,
                        UpdateUsageCarbonEmissionsQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUsageCarbonEmissionsQueryRequest,
                                UpdateUsageCarbonEmissionsQueryResponse>,
                        java.util.concurrent.Future<UpdateUsageCarbonEmissionsQueryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUsageCarbonEmissionsQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUsageCarbonEmissionsQueryRequest,
                    UpdateUsageCarbonEmissionsQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
