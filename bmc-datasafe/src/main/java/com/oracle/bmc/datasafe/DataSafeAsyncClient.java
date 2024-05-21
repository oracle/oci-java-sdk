/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSafeAsyncClient.class);

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
                            "DataSafeAsyncClient",
                            "downloadDiscoveryReport,downloadMaskingLog,downloadMaskingPolicy,downloadMaskingReport,downloadPrivilegeScript,downloadSecurityAssessmentReport,downloadSensitiveDataModel,downloadUserAssessmentReport,generateOnPremConnectorConfiguration,getReportContent"));
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
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ActivateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ActivateTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, ActivateTargetDatabaseResponse>
                transformer =
                        ActivateTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse> addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                    handler) {
        LOG.trace("Called async addMaskingColumnsFromSdm");
        final AddMaskingColumnsFromSdmRequest interceptedRequest =
                AddMaskingColumnsFromSdmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddMaskingColumnsFromSdmConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "AddMaskingColumnsFromSdm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/AddMaskingColumnsFromSdm");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddMaskingColumnsFromSdmResponse>
                transformer =
                        AddMaskingColumnsFromSdmConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>,
                        java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AlertsUpdateResponse> alertsUpdate(
            AlertsUpdateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AlertsUpdateRequest, AlertsUpdateResponse>
                    handler) {
        LOG.trace("Called async alertsUpdate");
        final AlertsUpdateRequest interceptedRequest =
                AlertsUpdateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AlertsUpdateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "AlertsUpdate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/AlertsUpdate");
        final java.util.function.Function<javax.ws.rs.core.Response, AlertsUpdateResponse>
                transformer =
                        AlertsUpdateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AlertsUpdateRequest, AlertsUpdateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AlertsUpdateRequest, AlertsUpdateResponse>,
                        java.util.concurrent.Future<AlertsUpdateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAlertsUpdateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AlertsUpdateRequest, AlertsUpdateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse> applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async applyDiscoveryJobResults");
        final ApplyDiscoveryJobResultsRequest interceptedRequest =
                ApplyDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplyDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ApplyDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ApplyDiscoveryJobResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ApplyDiscoveryJobResultsResponse>
                transformer =
                        ApplyDiscoveryJobResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApplyDiscoveryJobResultsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ApplySdmMaskingPolicyDifferenceResponse>
            applySdmMaskingPolicyDifference(
                    ApplySdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApplySdmMaskingPolicyDifferenceRequest,
                                    ApplySdmMaskingPolicyDifferenceResponse>
                            handler) {
        LOG.trace("Called async applySdmMaskingPolicyDifference");
        final ApplySdmMaskingPolicyDifferenceRequest interceptedRequest =
                ApplySdmMaskingPolicyDifferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplySdmMaskingPolicyDifferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ApplySdmMaskingPolicyDifference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ApplySdmMaskingPolicyDifference");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ApplySdmMaskingPolicyDifferenceResponse>
                transformer =
                        ApplySdmMaskingPolicyDifferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ApplySdmMaskingPolicyDifferenceRequest,
                        ApplySdmMaskingPolicyDifferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ApplySdmMaskingPolicyDifferenceRequest,
                                ApplySdmMaskingPolicyDifferenceResponse>,
                        java.util.concurrent.Future<ApplySdmMaskingPolicyDifferenceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApplySdmMaskingPolicyDifferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ApplySdmMaskingPolicyDifferenceRequest,
                    ApplySdmMaskingPolicyDifferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>
            calculateAuditVolumeAvailable(
                    CalculateAuditVolumeAvailableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeAvailableRequest,
                                    CalculateAuditVolumeAvailableResponse>
                            handler) {
        LOG.trace("Called async calculateAuditVolumeAvailable");
        final CalculateAuditVolumeAvailableRequest interceptedRequest =
                CalculateAuditVolumeAvailableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeAvailableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeAvailable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeAvailable");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeAvailableResponse>
                transformer =
                        CalculateAuditVolumeAvailableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CalculateAuditVolumeAvailableRequest, CalculateAuditVolumeAvailableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CalculateAuditVolumeAvailableRequest,
                                CalculateAuditVolumeAvailableResponse>,
                        java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCalculateAuditVolumeAvailableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CalculateAuditVolumeAvailableRequest, CalculateAuditVolumeAvailableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>
            calculateAuditVolumeCollected(
                    CalculateAuditVolumeCollectedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeCollectedRequest,
                                    CalculateAuditVolumeCollectedResponse>
                            handler) {
        LOG.trace("Called async calculateAuditVolumeCollected");
        final CalculateAuditVolumeCollectedRequest interceptedRequest =
                CalculateAuditVolumeCollectedConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeCollectedConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeCollected",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeCollected");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeCollectedResponse>
                transformer =
                        CalculateAuditVolumeCollectedConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CalculateAuditVolumeCollectedRequest, CalculateAuditVolumeCollectedResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CalculateAuditVolumeCollectedRequest,
                                CalculateAuditVolumeCollectedResponse>,
                        java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCalculateAuditVolumeCollectedDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CalculateAuditVolumeCollectedRequest, CalculateAuditVolumeCollectedResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/CancelWorkRequest");
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
    public java.util.concurrent.Future<ChangeAlertCompartmentResponse> changeAlertCompartment(
            ChangeAlertCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeAlertCompartment");
        final ChangeAlertCompartmentRequest interceptedRequest =
                ChangeAlertCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAlertCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAlertCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/ChangeAlertCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeAlertCompartmentResponse>
                transformer =
                        ChangeAlertCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAlertCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAlertCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>
            changeAuditArchiveRetrievalCompartment(
                    ChangeAuditArchiveRetrievalCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditArchiveRetrievalCompartmentRequest,
                                    ChangeAuditArchiveRetrievalCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditArchiveRetrievalCompartment");
        final ChangeAuditArchiveRetrievalCompartmentRequest interceptedRequest =
                ChangeAuditArchiveRetrievalCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditArchiveRetrievalCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditArchiveRetrievalCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ChangeAuditArchiveRetrievalCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeAuditArchiveRetrievalCompartmentResponse>
                transformer =
                        ChangeAuditArchiveRetrievalCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditArchiveRetrievalCompartmentRequest,
                        ChangeAuditArchiveRetrievalCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditArchiveRetrievalCompartmentRequest,
                                ChangeAuditArchiveRetrievalCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeAuditArchiveRetrievalCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditArchiveRetrievalCompartmentRequest,
                    ChangeAuditArchiveRetrievalCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse>
            changeAuditPolicyCompartment(
                    ChangeAuditPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditPolicyCompartmentRequest,
                                    ChangeAuditPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditPolicyCompartment");
        final ChangeAuditPolicyCompartmentRequest interceptedRequest =
                ChangeAuditPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ChangeAuditPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeAuditPolicyCompartmentResponse>
                transformer =
                        ChangeAuditPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditPolicyCompartmentRequest, ChangeAuditPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditPolicyCompartmentRequest,
                                ChangeAuditPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAuditPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditPolicyCompartmentRequest, ChangeAuditPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>
            changeAuditProfileCompartment(
                    ChangeAuditProfileCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditProfileCompartmentRequest,
                                    ChangeAuditProfileCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditProfileCompartment");
        final ChangeAuditProfileCompartmentRequest interceptedRequest =
                ChangeAuditProfileCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditProfileCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditProfileCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeAuditProfileCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeAuditProfileCompartmentResponse>
                transformer =
                        ChangeAuditProfileCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditProfileCompartmentRequest, ChangeAuditProfileCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditProfileCompartmentRequest,
                                ChangeAuditProfileCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAuditProfileCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditProfileCompartmentRequest, ChangeAuditProfileCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeDataSafePrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/ChangeDataSafePrivateEndpointCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDataSafePrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDataSafePrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ChangeDatabaseSecurityConfigCompartmentResponse>
            changeDatabaseSecurityConfigCompartment(
                    ChangeDatabaseSecurityConfigCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseSecurityConfigCompartmentRequest,
                                    ChangeDatabaseSecurityConfigCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseSecurityConfigCompartment");
        final ChangeDatabaseSecurityConfigCompartmentRequest interceptedRequest =
                ChangeDatabaseSecurityConfigCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseSecurityConfigCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeDatabaseSecurityConfigCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/ChangeDatabaseSecurityConfigCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseSecurityConfigCompartmentResponse>
                transformer =
                        ChangeDatabaseSecurityConfigCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseSecurityConfigCompartmentRequest,
                        ChangeDatabaseSecurityConfigCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseSecurityConfigCompartmentRequest,
                                ChangeDatabaseSecurityConfigCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseSecurityConfigCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseSecurityConfigCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseSecurityConfigCompartmentRequest,
                    ChangeDatabaseSecurityConfigCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>
            changeDiscoveryJobCompartment(
                    ChangeDiscoveryJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryJobCompartmentRequest,
                                    ChangeDiscoveryJobCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDiscoveryJobCompartment");
        final ChangeDiscoveryJobCompartmentRequest interceptedRequest =
                ChangeDiscoveryJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDiscoveryJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeDiscoveryJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ChangeDiscoveryJobCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDiscoveryJobCompartmentResponse>
                transformer =
                        ChangeDiscoveryJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDiscoveryJobCompartmentRequest, ChangeDiscoveryJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDiscoveryJobCompartmentRequest,
                                ChangeDiscoveryJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDiscoveryJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDiscoveryJobCompartmentRequest, ChangeDiscoveryJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>
            changeLibraryMaskingFormatCompartment(
                    ChangeLibraryMaskingFormatCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLibraryMaskingFormatCompartmentRequest,
                                    ChangeLibraryMaskingFormatCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLibraryMaskingFormatCompartment");
        final ChangeLibraryMaskingFormatCompartmentRequest interceptedRequest =
                ChangeLibraryMaskingFormatCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLibraryMaskingFormatCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeLibraryMaskingFormatCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/ChangeLibraryMaskingFormatCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLibraryMaskingFormatCompartmentResponse>
                transformer =
                        ChangeLibraryMaskingFormatCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLibraryMaskingFormatCompartmentRequest,
                        ChangeLibraryMaskingFormatCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLibraryMaskingFormatCompartmentRequest,
                                ChangeLibraryMaskingFormatCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeLibraryMaskingFormatCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLibraryMaskingFormatCompartmentRequest,
                    ChangeLibraryMaskingFormatCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>
            changeMaskingPolicyCompartment(
                    ChangeMaskingPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyCompartmentRequest,
                                    ChangeMaskingPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMaskingPolicyCompartment");
        final ChangeMaskingPolicyCompartmentRequest interceptedRequest =
                ChangeMaskingPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMaskingPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeMaskingPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ChangeMaskingPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMaskingPolicyCompartmentResponse>
                transformer =
                        ChangeMaskingPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMaskingPolicyCompartmentRequest,
                        ChangeMaskingPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMaskingPolicyCompartmentRequest,
                                ChangeMaskingPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMaskingPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMaskingPolicyCompartmentRequest, ChangeMaskingPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMaskingPolicyHealthReportCompartmentResponse>
            changeMaskingPolicyHealthReportCompartment(
                    ChangeMaskingPolicyHealthReportCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyHealthReportCompartmentRequest,
                                    ChangeMaskingPolicyHealthReportCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMaskingPolicyHealthReportCompartment");
        final ChangeMaskingPolicyHealthReportCompartmentRequest interceptedRequest =
                ChangeMaskingPolicyHealthReportCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMaskingPolicyHealthReportCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeMaskingPolicyHealthReportCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ChangeMaskingPolicyHealthReportCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeMaskingPolicyHealthReportCompartmentResponse>
                transformer =
                        ChangeMaskingPolicyHealthReportCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMaskingPolicyHealthReportCompartmentRequest,
                        ChangeMaskingPolicyHealthReportCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMaskingPolicyHealthReportCompartmentRequest,
                                ChangeMaskingPolicyHealthReportCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeMaskingPolicyHealthReportCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMaskingPolicyHealthReportCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMaskingPolicyHealthReportCompartmentRequest,
                    ChangeMaskingPolicyHealthReportCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeOnPremConnectorCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/ChangeOnPremConnectorCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeOnPremConnectorCompartmentResponse>
                transformer =
                        ChangeOnPremConnectorCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ChangeReportCompartmentResponse> changeReportCompartment(
            ChangeReportCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeReportCompartment");
        final ChangeReportCompartmentRequest interceptedRequest =
                ChangeReportCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeReportCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/ChangeReportCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeReportCompartmentResponse>
                transformer =
                        ChangeReportCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>,
                        java.util.concurrent.Future<ChangeReportCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeReportCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>
            changeReportDefinitionCompartment(
                    ChangeReportDefinitionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReportDefinitionCompartmentRequest,
                                    ChangeReportDefinitionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeReportDefinitionCompartment");
        final ChangeReportDefinitionCompartmentRequest interceptedRequest =
                ChangeReportDefinitionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportDefinitionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeReportDefinitionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ChangeReportDefinitionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeReportDefinitionCompartmentResponse>
                transformer =
                        ChangeReportDefinitionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeReportDefinitionCompartmentRequest,
                        ChangeReportDefinitionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeReportDefinitionCompartmentRequest,
                                ChangeReportDefinitionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeReportDefinitionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeReportDefinitionCompartmentRequest,
                    ChangeReportDefinitionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeRetentionResponse> changeRetention(
            ChangeRetentionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeRetentionRequest, ChangeRetentionResponse>
                    handler) {
        LOG.trace("Called async changeRetention");
        final ChangeRetentionRequest interceptedRequest =
                ChangeRetentionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRetentionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeRetention",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeRetention");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeRetentionResponse>
                transformer =
                        ChangeRetentionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ChangeRetentionRequest, ChangeRetentionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeRetentionRequest, ChangeRetentionResponse>,
                        java.util.concurrent.Future<ChangeRetentionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeRetentionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeRetentionRequest, ChangeRetentionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
            changeSdmMaskingPolicyDifferenceCompartment(
                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest,
                                    ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSdmMaskingPolicyDifferenceCompartment");
        final ChangeSdmMaskingPolicyDifferenceCompartmentRequest interceptedRequest =
                ChangeSdmMaskingPolicyDifferenceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSdmMaskingPolicyDifferenceCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSdmMaskingPolicyDifferenceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ChangeSdmMaskingPolicyDifferenceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
                transformer =
                        ChangeSdmMaskingPolicyDifferenceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSdmMaskingPolicyDifferenceCompartmentRequest,
                        ChangeSdmMaskingPolicyDifferenceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSdmMaskingPolicyDifferenceCompartmentRequest,
                                ChangeSdmMaskingPolicyDifferenceCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeSdmMaskingPolicyDifferenceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeSdmMaskingPolicyDifferenceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSdmMaskingPolicyDifferenceCompartmentRequest,
                    ChangeSdmMaskingPolicyDifferenceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSecurityAssessmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ChangeSecurityAssessmentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSecurityAssessmentCompartmentResponse>
                transformer =
                        ChangeSecurityAssessmentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ChangeSecurityPolicyCompartmentResponse>
            changeSecurityPolicyCompartment(
                    ChangeSecurityPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityPolicyCompartmentRequest,
                                    ChangeSecurityPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityPolicyCompartment");
        final ChangeSecurityPolicyCompartmentRequest interceptedRequest =
                ChangeSecurityPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSecurityPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/ChangeSecurityPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSecurityPolicyCompartmentResponse>
                transformer =
                        ChangeSecurityPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityPolicyCompartmentRequest,
                        ChangeSecurityPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityPolicyCompartmentRequest,
                                ChangeSecurityPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityPolicyCompartmentRequest,
                    ChangeSecurityPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityPolicyDeploymentCompartmentResponse>
            changeSecurityPolicyDeploymentCompartment(
                    ChangeSecurityPolicyDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityPolicyDeploymentCompartmentRequest,
                                    ChangeSecurityPolicyDeploymentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityPolicyDeploymentCompartment");
        final ChangeSecurityPolicyDeploymentCompartmentRequest interceptedRequest =
                ChangeSecurityPolicyDeploymentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityPolicyDeploymentCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSecurityPolicyDeploymentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/ChangeSecurityPolicyDeploymentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeSecurityPolicyDeploymentCompartmentResponse>
                transformer =
                        ChangeSecurityPolicyDeploymentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityPolicyDeploymentCompartmentRequest,
                        ChangeSecurityPolicyDeploymentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityPolicyDeploymentCompartmentRequest,
                                ChangeSecurityPolicyDeploymentCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeSecurityPolicyDeploymentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeSecurityPolicyDeploymentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityPolicyDeploymentCompartmentRequest,
                    ChangeSecurityPolicyDeploymentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>
            changeSensitiveDataModelCompartment(
                    ChangeSensitiveDataModelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveDataModelCompartmentRequest,
                                    ChangeSensitiveDataModelCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSensitiveDataModelCompartment");
        final ChangeSensitiveDataModelCompartmentRequest interceptedRequest =
                ChangeSensitiveDataModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveDataModelCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSensitiveDataModelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ChangeSensitiveDataModelCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveDataModelCompartmentResponse>
                transformer =
                        ChangeSensitiveDataModelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSensitiveDataModelCompartmentRequest,
                        ChangeSensitiveDataModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSensitiveDataModelCompartmentRequest,
                                ChangeSensitiveDataModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSensitiveDataModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSensitiveDataModelCompartmentRequest,
                    ChangeSensitiveDataModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>
            changeSensitiveTypeCompartment(
                    ChangeSensitiveTypeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypeCompartmentRequest,
                                    ChangeSensitiveTypeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSensitiveTypeCompartment");
        final ChangeSensitiveTypeCompartmentRequest interceptedRequest =
                ChangeSensitiveTypeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveTypeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSensitiveTypeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ChangeSensitiveTypeCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveTypeCompartmentResponse>
                transformer =
                        ChangeSensitiveTypeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSensitiveTypeCompartmentRequest,
                        ChangeSensitiveTypeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSensitiveTypeCompartmentRequest,
                                ChangeSensitiveTypeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSensitiveTypeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSensitiveTypeCompartmentRequest, ChangeSensitiveTypeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlCollectionCompartmentResponse>
            changeSqlCollectionCompartment(
                    ChangeSqlCollectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlCollectionCompartmentRequest,
                                    ChangeSqlCollectionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSqlCollectionCompartment");
        final ChangeSqlCollectionCompartmentRequest interceptedRequest =
                ChangeSqlCollectionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSqlCollectionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSqlCollectionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/ChangeSqlCollectionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSqlCollectionCompartmentResponse>
                transformer =
                        ChangeSqlCollectionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSqlCollectionCompartmentRequest,
                        ChangeSqlCollectionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSqlCollectionCompartmentRequest,
                                ChangeSqlCollectionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSqlCollectionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSqlCollectionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSqlCollectionCompartmentRequest, ChangeSqlCollectionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlFirewallPolicyCompartmentResponse>
            changeSqlFirewallPolicyCompartment(
                    ChangeSqlFirewallPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlFirewallPolicyCompartmentRequest,
                                    ChangeSqlFirewallPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSqlFirewallPolicyCompartment");
        final ChangeSqlFirewallPolicyCompartmentRequest interceptedRequest =
                ChangeSqlFirewallPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSqlFirewallPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSqlFirewallPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/ChangeSqlFirewallPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSqlFirewallPolicyCompartmentResponse>
                transformer =
                        ChangeSqlFirewallPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSqlFirewallPolicyCompartmentRequest,
                        ChangeSqlFirewallPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSqlFirewallPolicyCompartmentRequest,
                                ChangeSqlFirewallPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSqlFirewallPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSqlFirewallPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSqlFirewallPolicyCompartmentRequest,
                    ChangeSqlFirewallPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetAlertPolicyAssociationCompartmentResponse>
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                    ChangeTargetAlertPolicyAssociationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeTargetAlertPolicyAssociationCompartment");
        final ChangeTargetAlertPolicyAssociationCompartmentRequest interceptedRequest =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeTargetAlertPolicyAssociationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/ChangeTargetAlertPolicyAssociationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeTargetAlertPolicyAssociationCompartmentResponse>
                transformer =
                        ChangeTargetAlertPolicyAssociationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTargetAlertPolicyAssociationCompartmentRequest,
                        ChangeTargetAlertPolicyAssociationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                ChangeTargetAlertPolicyAssociationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeTargetAlertPolicyAssociationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeTargetAlertPolicyAssociationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                    ChangeTargetAlertPolicyAssociationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeTargetDatabaseCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ChangeTargetDatabaseCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeTargetDatabaseCompartmentResponse>
                transformer =
                        ChangeTargetDatabaseCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeUserAssessmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ChangeUserAssessmentCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeUserAssessmentCompartmentResponse>
                transformer =
                        ChangeUserAssessmentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CompareSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CompareSecurityAssessment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CompareSecurityAssessmentResponse>
                transformer =
                        CompareSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CompareUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CompareUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, CompareUserAssessmentResponse>
                transformer =
                        CompareUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse>
            createAuditArchiveRetrieval(
                    CreateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuditArchiveRetrievalRequest,
                                    CreateAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async createAuditArchiveRetrieval");
        final CreateAuditArchiveRetrievalRequest interceptedRequest =
                CreateAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateAuditArchiveRetrievalResponse>
                transformer =
                        CreateAuditArchiveRetrievalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateAuditArchiveRetrievalRequest, CreateAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuditArchiveRetrievalRequest,
                                CreateAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAuditArchiveRetrievalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuditArchiveRetrievalRequest, CreateAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/CreateDataSafePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDataSafePrivateEndpointResponse>
                transformer =
                        CreateDataSafePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async createDiscoveryJob");
        final CreateDiscoveryJobRequest interceptedRequest =
                CreateDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe", "CreateDiscoveryJob", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDiscoveryJobResponse>
                transformer =
                        CreateDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>,
                        java.util.concurrent.Future<CreateDiscoveryJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDiscoveryJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLibraryMaskingFormatResponse>
            createLibraryMaskingFormat(
                    CreateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLibraryMaskingFormatRequest,
                                    CreateLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async createLibraryMaskingFormat");
        final CreateLibraryMaskingFormatRequest interceptedRequest =
                CreateLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/CreateLibraryMaskingFormat");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateLibraryMaskingFormatResponse>
                transformer =
                        CreateLibraryMaskingFormatConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateLibraryMaskingFormatRequest, CreateLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLibraryMaskingFormatRequest,
                                CreateLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<CreateLibraryMaskingFormatResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLibraryMaskingFormatDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLibraryMaskingFormatRequest, CreateLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingColumnResponse> createMaskingColumn(
            CreateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async createMaskingColumn");
        final CreateMaskingColumnRequest interceptedRequest =
                CreateMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/CreateMaskingColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMaskingColumnResponse>
                transformer =
                        CreateMaskingColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMaskingColumnRequest, CreateMaskingColumnResponse>,
                        java.util.concurrent.Future<CreateMaskingColumnResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMaskingColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMaskingColumnRequest, CreateMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingPolicyResponse> createMaskingPolicy(
            CreateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async createMaskingPolicy");
        final CreateMaskingPolicyRequest interceptedRequest =
                CreateMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/CreateMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMaskingPolicyResponse>
                transformer =
                        CreateMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>,
                        java.util.concurrent.Future<CreateMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/CreateOnPremConnector");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateOnPremConnectorResponse>
                transformer =
                        CreateOnPremConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreatePeerTargetDatabaseResponse> createPeerTargetDatabase(
            CreatePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePeerTargetDatabaseRequest, CreatePeerTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async createPeerTargetDatabase");
        final CreatePeerTargetDatabaseRequest interceptedRequest =
                CreatePeerTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePeerTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreatePeerTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/CreatePeerTargetDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreatePeerTargetDatabaseResponse>
                transformer =
                        CreatePeerTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreatePeerTargetDatabaseRequest, CreatePeerTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePeerTargetDatabaseRequest, CreatePeerTargetDatabaseResponse>,
                        java.util.concurrent.Future<CreatePeerTargetDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePeerTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePeerTargetDatabaseRequest, CreatePeerTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateReportDefinitionResponse> createReportDefinition(
            CreateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async createReportDefinition");
        final CreateReportDefinitionRequest interceptedRequest =
                CreateReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReportDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/CreateReportDefinition");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateReportDefinitionResponse>
                transformer =
                        CreateReportDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateReportDefinitionRequest, CreateReportDefinitionResponse>,
                        java.util.concurrent.Future<CreateReportDefinitionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateReportDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateReportDefinitionRequest, CreateReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSdmMaskingPolicyDifferenceResponse>
            createSdmMaskingPolicyDifference(
                    CreateSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSdmMaskingPolicyDifferenceRequest,
                                    CreateSdmMaskingPolicyDifferenceResponse>
                            handler) {
        LOG.trace("Called async createSdmMaskingPolicyDifference");
        final CreateSdmMaskingPolicyDifferenceRequest interceptedRequest =
                CreateSdmMaskingPolicyDifferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSdmMaskingPolicyDifferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSdmMaskingPolicyDifference",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSdmMaskingPolicyDifferenceResponse>
                transformer =
                        CreateSdmMaskingPolicyDifferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSdmMaskingPolicyDifferenceRequest,
                        CreateSdmMaskingPolicyDifferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSdmMaskingPolicyDifferenceRequest,
                                CreateSdmMaskingPolicyDifferenceResponse>,
                        java.util.concurrent.Future<CreateSdmMaskingPolicyDifferenceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSdmMaskingPolicyDifferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSdmMaskingPolicyDifferenceRequest,
                    CreateSdmMaskingPolicyDifferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CreateSecurityAssessment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSecurityAssessmentResponse>
                transformer =
                        CreateSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreateSensitiveColumnResponse> createSensitiveColumn(
            CreateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async createSensitiveColumn");
        final CreateSensitiveColumnRequest interceptedRequest =
                CreateSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/CreateSensitiveColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSensitiveColumnResponse>
                transformer =
                        CreateSensitiveColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>,
                        java.util.concurrent.Future<CreateSensitiveColumnResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveDataModelResponse> createSensitiveDataModel(
            CreateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async createSensitiveDataModel");
        final CreateSensitiveDataModelRequest interceptedRequest =
                CreateSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/CreateSensitiveDataModel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSensitiveDataModelResponse>
                transformer =
                        CreateSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>,
                        java.util.concurrent.Future<CreateSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveTypeResponse> createSensitiveType(
            CreateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async createSensitiveType");
        final CreateSensitiveTypeRequest interceptedRequest =
                CreateSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe", "CreateSensitiveType", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSensitiveTypeResponse>
                transformer =
                        CreateSensitiveTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>,
                        java.util.concurrent.Future<CreateSensitiveTypeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSqlCollectionResponse> createSqlCollection(
            CreateSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSqlCollectionRequest, CreateSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async createSqlCollection");
        final CreateSqlCollectionRequest interceptedRequest =
                CreateSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/CreateSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSqlCollectionResponse>
                transformer =
                        CreateSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSqlCollectionRequest, CreateSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSqlCollectionRequest, CreateSqlCollectionResponse>,
                        java.util.concurrent.Future<CreateSqlCollectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSqlCollectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSqlCollectionRequest, CreateSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>
            createTargetAlertPolicyAssociation(
                    CreateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetAlertPolicyAssociationRequest,
                                    CreateTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async createTargetAlertPolicyAssociation");
        final CreateTargetAlertPolicyAssociationRequest interceptedRequest =
                CreateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/CreateTargetAlertPolicyAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTargetAlertPolicyAssociationResponse>
                transformer =
                        CreateTargetAlertPolicyAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetAlertPolicyAssociationRequest,
                        CreateTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetAlertPolicyAssociationRequest,
                                CreateTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTargetAlertPolicyAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetAlertPolicyAssociationRequest,
                    CreateTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/CreateTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTargetDatabaseResponse>
                transformer =
                        CreateTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CreateUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateUserAssessmentResponse>
                transformer =
                        CreateUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeactivateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeactivateTargetDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeactivateTargetDatabaseResponse>
                transformer =
                        DeactivateTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse>
            deleteAuditArchiveRetrieval(
                    DeleteAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAuditArchiveRetrievalRequest,
                                    DeleteAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async deleteAuditArchiveRetrieval");
        final DeleteAuditArchiveRetrievalRequest interceptedRequest =
                DeleteAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/DeleteAuditArchiveRetrieval");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteAuditArchiveRetrievalResponse>
                transformer =
                        DeleteAuditArchiveRetrievalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAuditArchiveRetrievalRequest, DeleteAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuditArchiveRetrievalRequest,
                                DeleteAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuditArchiveRetrievalRequest, DeleteAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditTrailResponse> deleteAuditTrail(
            DeleteAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                    handler) {
        LOG.trace("Called async deleteAuditTrail");
        final DeleteAuditTrailRequest interceptedRequest =
                DeleteAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/DeleteAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAuditTrailResponse>
                transformer =
                        DeleteAuditTrailConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuditTrailRequest, DeleteAuditTrailResponse>,
                        java.util.concurrent.Future<DeleteAuditTrailResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuditTrailRequest, DeleteAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/DeleteDataSafePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDataSafePrivateEndpointResponse>
                transformer =
                        DeleteDataSafePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async deleteDiscoveryJob");
        final DeleteDiscoveryJobRequest interceptedRequest =
                DeleteDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/DeleteDiscoveryJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDiscoveryJobResponse>
                transformer =
                        DeleteDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>,
                        java.util.concurrent.Future<DeleteDiscoveryJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResultResponse> deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                    handler) {
        LOG.trace("Called async deleteDiscoveryJobResult");
        final DeleteDiscoveryJobResultRequest interceptedRequest =
                DeleteDiscoveryJobResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJobResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/DeleteDiscoveryJobResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDiscoveryJobResultResponse>
                transformer =
                        DeleteDiscoveryJobResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>,
                        java.util.concurrent.Future<DeleteDiscoveryJobResultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse>
            deleteLibraryMaskingFormat(
                    DeleteLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLibraryMaskingFormatRequest,
                                    DeleteLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async deleteLibraryMaskingFormat");
        final DeleteLibraryMaskingFormatRequest interceptedRequest =
                DeleteLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/DeleteLibraryMaskingFormat");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteLibraryMaskingFormatResponse>
                transformer =
                        DeleteLibraryMaskingFormatConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLibraryMaskingFormatRequest, DeleteLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLibraryMaskingFormatRequest,
                                DeleteLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLibraryMaskingFormatRequest, DeleteLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingColumnResponse> deleteMaskingColumn(
            DeleteMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async deleteMaskingColumn");
        final DeleteMaskingColumnRequest interceptedRequest =
                DeleteMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/DeleteMaskingColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMaskingColumnResponse>
                transformer =
                        DeleteMaskingColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>,
                        java.util.concurrent.Future<DeleteMaskingColumnResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingPolicyResponse> deleteMaskingPolicy(
            DeleteMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteMaskingPolicy");
        final DeleteMaskingPolicyRequest interceptedRequest =
                DeleteMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DeleteMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMaskingPolicyResponse>
                transformer =
                        DeleteMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>,
                        java.util.concurrent.Future<DeleteMaskingPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingPolicyHealthReportResponse>
            deleteMaskingPolicyHealthReport(
                    DeleteMaskingPolicyHealthReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMaskingPolicyHealthReportRequest,
                                    DeleteMaskingPolicyHealthReportResponse>
                            handler) {
        LOG.trace("Called async deleteMaskingPolicyHealthReport");
        final DeleteMaskingPolicyHealthReportRequest interceptedRequest =
                DeleteMaskingPolicyHealthReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingPolicyHealthReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteMaskingPolicyHealthReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/DeleteMaskingPolicyHealthReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMaskingPolicyHealthReportResponse>
                transformer =
                        DeleteMaskingPolicyHealthReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMaskingPolicyHealthReportRequest,
                        DeleteMaskingPolicyHealthReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMaskingPolicyHealthReportRequest,
                                DeleteMaskingPolicyHealthReportResponse>,
                        java.util.concurrent.Future<DeleteMaskingPolicyHealthReportResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMaskingPolicyHealthReportRequest,
                    DeleteMaskingPolicyHealthReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/DeleteOnPremConnector");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteOnPremConnectorResponse>
                transformer =
                        DeleteOnPremConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeletePeerTargetDatabaseResponse> deletePeerTargetDatabase(
            DeletePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePeerTargetDatabaseRequest, DeletePeerTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async deletePeerTargetDatabase");
        final DeletePeerTargetDatabaseRequest interceptedRequest =
                DeletePeerTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePeerTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeletePeerTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/DeletePeerTargetDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeletePeerTargetDatabaseResponse>
                transformer =
                        DeletePeerTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePeerTargetDatabaseRequest, DeletePeerTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePeerTargetDatabaseRequest, DeletePeerTargetDatabaseResponse>,
                        java.util.concurrent.Future<DeletePeerTargetDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePeerTargetDatabaseRequest, DeletePeerTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResponse> deleteReportDefinition(
            DeleteReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async deleteReportDefinition");
        final DeleteReportDefinitionRequest interceptedRequest =
                DeleteReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReportDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/DeleteReportDefinition");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteReportDefinitionResponse>
                transformer =
                        DeleteReportDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>,
                        java.util.concurrent.Future<DeleteReportDefinitionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSdmMaskingPolicyDifferenceResponse>
            deleteSdmMaskingPolicyDifference(
                    DeleteSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSdmMaskingPolicyDifferenceRequest,
                                    DeleteSdmMaskingPolicyDifferenceResponse>
                            handler) {
        LOG.trace("Called async deleteSdmMaskingPolicyDifference");
        final DeleteSdmMaskingPolicyDifferenceRequest interceptedRequest =
                DeleteSdmMaskingPolicyDifferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSdmMaskingPolicyDifferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSdmMaskingPolicyDifference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/DeleteSdmMaskingPolicyDifference");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSdmMaskingPolicyDifferenceResponse>
                transformer =
                        DeleteSdmMaskingPolicyDifferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSdmMaskingPolicyDifferenceRequest,
                        DeleteSdmMaskingPolicyDifferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSdmMaskingPolicyDifferenceRequest,
                                DeleteSdmMaskingPolicyDifferenceResponse>,
                        java.util.concurrent.Future<DeleteSdmMaskingPolicyDifferenceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSdmMaskingPolicyDifferenceRequest,
                    DeleteSdmMaskingPolicyDifferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DeleteSecurityAssessment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSecurityAssessmentResponse>
                transformer =
                        DeleteSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeleteSensitiveColumnResponse> deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveColumn");
        final DeleteSensitiveColumnRequest interceptedRequest =
                DeleteSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/DeleteSensitiveColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSensitiveColumnResponse>
                transformer =
                        DeleteSensitiveColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>,
                        java.util.concurrent.Future<DeleteSensitiveColumnResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveDataModelResponse> deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveDataModel");
        final DeleteSensitiveDataModelRequest interceptedRequest =
                DeleteSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DeleteSensitiveDataModel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSensitiveDataModelResponse>
                transformer =
                        DeleteSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>,
                        java.util.concurrent.Future<DeleteSensitiveDataModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveTypeResponse> deleteSensitiveType(
            DeleteSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveType");
        final DeleteSensitiveTypeRequest interceptedRequest =
                DeleteSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/DeleteSensitiveType");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSensitiveTypeResponse>
                transformer =
                        DeleteSensitiveTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>,
                        java.util.concurrent.Future<DeleteSensitiveTypeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlCollectionResponse> deleteSqlCollection(
            DeleteSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlCollectionRequest, DeleteSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async deleteSqlCollection");
        final DeleteSqlCollectionRequest interceptedRequest =
                DeleteSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/DeleteSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSqlCollectionResponse>
                transformer =
                        DeleteSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSqlCollectionRequest, DeleteSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSqlCollectionRequest, DeleteSqlCollectionResponse>,
                        java.util.concurrent.Future<DeleteSqlCollectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSqlCollectionRequest, DeleteSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlFirewallPolicyResponse> deleteSqlFirewallPolicy(
            DeleteSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlFirewallPolicyRequest, DeleteSqlFirewallPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteSqlFirewallPolicy");
        final DeleteSqlFirewallPolicyRequest interceptedRequest =
                DeleteSqlFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSqlFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSqlFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/DeleteSqlFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSqlFirewallPolicyResponse>
                transformer =
                        DeleteSqlFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSqlFirewallPolicyRequest, DeleteSqlFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSqlFirewallPolicyRequest, DeleteSqlFirewallPolicyResponse>,
                        java.util.concurrent.Future<DeleteSqlFirewallPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSqlFirewallPolicyRequest, DeleteSqlFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>
            deleteTargetAlertPolicyAssociation(
                    DeleteTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetAlertPolicyAssociationRequest,
                                    DeleteTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async deleteTargetAlertPolicyAssociation");
        final DeleteTargetAlertPolicyAssociationRequest interceptedRequest =
                DeleteTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/DeleteTargetAlertPolicyAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteTargetAlertPolicyAssociationResponse>
                transformer =
                        DeleteTargetAlertPolicyAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetAlertPolicyAssociationRequest,
                        DeleteTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetAlertPolicyAssociationRequest,
                                DeleteTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetAlertPolicyAssociationRequest,
                    DeleteTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeleteTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTargetDatabaseResponse>
                transformer =
                        DeleteTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DeleteUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteUserAssessmentResponse>
                transformer =
                        DeleteUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DiscoverAuditTrailsResponse> discoverAuditTrails(
            DiscoverAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                    handler) {
        LOG.trace("Called async discoverAuditTrails");
        final DiscoverAuditTrailsRequest interceptedRequest =
                DiscoverAuditTrailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DiscoverAuditTrailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DiscoverAuditTrails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/DiscoverAuditTrails");
        final java.util.function.Function<javax.ws.rs.core.Response, DiscoverAuditTrailsResponse>
                transformer =
                        DiscoverAuditTrailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>,
                        java.util.concurrent.Future<DiscoverAuditTrailsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadDiscoveryReportResponse> downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                    handler) {
        LOG.trace("Called async downloadDiscoveryReport");
        final DownloadDiscoveryReportRequest interceptedRequest =
                DownloadDiscoveryReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadDiscoveryReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadDiscoveryReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadDiscoveryReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DownloadDiscoveryReportResponse>
                transformer =
                        DownloadDiscoveryReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>,
                        java.util.concurrent.Future<DownloadDiscoveryReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadDiscoveryReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingLogResponse> downloadMaskingLog(
            DownloadMaskingLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingLog");
        final DownloadMaskingLogRequest interceptedRequest =
                DownloadMaskingLogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingLogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingLog",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingLog");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadMaskingLogResponse>
                transformer =
                        DownloadMaskingLogConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingLogRequest, DownloadMaskingLogResponse>,
                        java.util.concurrent.Future<DownloadMaskingLogResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingLogDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingLogRequest, DownloadMaskingLogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingPolicyResponse> downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingPolicy");
        final DownloadMaskingPolicyRequest interceptedRequest =
                DownloadMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadMaskingPolicyResponse>
                transformer =
                        DownloadMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>,
                        java.util.concurrent.Future<DownloadMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingReportResponse> downloadMaskingReport(
            DownloadMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingReport");
        final DownloadMaskingReportRequest interceptedRequest =
                DownloadMaskingReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingReport");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadMaskingReportResponse>
                transformer =
                        DownloadMaskingReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingReportRequest, DownloadMaskingReportResponse>,
                        java.util.concurrent.Future<DownloadMaskingReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingReportRequest, DownloadMaskingReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final DownloadPrivilegeScriptRequest interceptedRequest =
                DownloadPrivilegeScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadPrivilegeScriptConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadPrivilegeScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DownloadPrivilegeScript");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DownloadPrivilegeScriptResponse>
                transformer =
                        DownloadPrivilegeScriptConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        final DownloadSecurityAssessmentReportRequest interceptedRequest =
                DownloadSecurityAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadSecurityAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DownloadSecurityAssessmentReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DownloadSecurityAssessmentReportResponse>
                transformer =
                        DownloadSecurityAssessmentReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DownloadSensitiveDataModelResponse>
            downloadSensitiveDataModel(
                    DownloadSensitiveDataModelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSensitiveDataModelRequest,
                                    DownloadSensitiveDataModelResponse>
                            handler) {
        LOG.trace("Called async downloadSensitiveDataModel");
        final DownloadSensitiveDataModelRequest interceptedRequest =
                DownloadSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadSensitiveDataModel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DownloadSensitiveDataModelResponse>
                transformer =
                        DownloadSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadSensitiveDataModelRequest, DownloadSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadSensitiveDataModelRequest,
                                DownloadSensitiveDataModelResponse>,
                        java.util.concurrent.Future<DownloadSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadSensitiveDataModelRequest, DownloadSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final DownloadUserAssessmentReportRequest interceptedRequest =
                DownloadUserAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadUserAssessmentReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadUserAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DownloadUserAssessmentReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DownloadUserAssessmentReportResponse>
                transformer =
                        DownloadUserAssessmentReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "EnableDataSafeConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/EnableDataSafeConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableDataSafeConfigurationResponse>
                transformer =
                        EnableDataSafeConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>
            generateDiscoveryReportForDownload(
                    GenerateDiscoveryReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDiscoveryReportForDownloadRequest,
                                    GenerateDiscoveryReportForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateDiscoveryReportForDownload");
        final GenerateDiscoveryReportForDownloadRequest interceptedRequest =
                GenerateDiscoveryReportForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDiscoveryReportForDownloadConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateDiscoveryReportForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateDiscoveryReportForDownload");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateDiscoveryReportForDownloadResponse>
                transformer =
                        GenerateDiscoveryReportForDownloadConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDiscoveryReportForDownloadRequest,
                        GenerateDiscoveryReportForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDiscoveryReportForDownloadRequest,
                                GenerateDiscoveryReportForDownloadResponse>,
                        java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateDiscoveryReportForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDiscoveryReportForDownloadRequest,
                    GenerateDiscoveryReportForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateHealthReportResponse> generateHealthReport(
            GenerateHealthReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateHealthReportRequest, GenerateHealthReportResponse>
                    handler) {
        LOG.trace("Called async generateHealthReport");
        final GenerateHealthReportRequest interceptedRequest =
                GenerateHealthReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateHealthReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateHealthReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/GenerateHealthReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GenerateHealthReportResponse>
                transformer =
                        GenerateHealthReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateHealthReportRequest, GenerateHealthReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateHealthReportRequest, GenerateHealthReportResponse>,
                        java.util.concurrent.Future<GenerateHealthReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateHealthReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateHealthReportRequest, GenerateHealthReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>
            generateMaskingPolicyForDownload(
                    GenerateMaskingPolicyForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingPolicyForDownloadRequest,
                                    GenerateMaskingPolicyForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateMaskingPolicyForDownload");
        final GenerateMaskingPolicyForDownloadRequest interceptedRequest =
                GenerateMaskingPolicyForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingPolicyForDownloadConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateMaskingPolicyForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingPolicyForDownload");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateMaskingPolicyForDownloadResponse>
                transformer =
                        GenerateMaskingPolicyForDownloadConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateMaskingPolicyForDownloadRequest,
                        GenerateMaskingPolicyForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateMaskingPolicyForDownloadRequest,
                                GenerateMaskingPolicyForDownloadResponse>,
                        java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateMaskingPolicyForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateMaskingPolicyForDownloadRequest,
                    GenerateMaskingPolicyForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>
            generateMaskingReportForDownload(
                    GenerateMaskingReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingReportForDownloadRequest,
                                    GenerateMaskingReportForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateMaskingReportForDownload");
        final GenerateMaskingReportForDownloadRequest interceptedRequest =
                GenerateMaskingReportForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingReportForDownloadConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateMaskingReportForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingReportForDownload");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateMaskingReportForDownloadResponse>
                transformer =
                        GenerateMaskingReportForDownloadConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateMaskingReportForDownloadRequest,
                        GenerateMaskingReportForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateMaskingReportForDownloadRequest,
                                GenerateMaskingReportForDownloadResponse>,
                        java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateMaskingReportForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateMaskingReportForDownloadRequest,
                    GenerateMaskingReportForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final GenerateOnPremConnectorConfigurationRequest interceptedRequest =
                GenerateOnPremConnectorConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateOnPremConnectorConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateOnPremConnectorConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GenerateOnPremConnectorConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateOnPremConnectorConfigurationResponse>
                transformer =
                        GenerateOnPremConnectorConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GenerateReportResponse> generateReport(
            GenerateReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateReportRequest, GenerateReportResponse>
                    handler) {
        LOG.trace("Called async generateReport");
        final GenerateReportRequest interceptedRequest =
                GenerateReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GenerateReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GenerateReportResponse>
                transformer =
                        GenerateReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GenerateReportRequest, GenerateReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateReportRequest, GenerateReportResponse>,
                        java.util.concurrent.Future<GenerateReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateReportRequest, GenerateReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateSecurityAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GenerateSecurityAssessmentReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateSecurityAssessmentReportResponse>
                transformer =
                        GenerateSecurityAssessmentReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>
            generateSensitiveDataModelForDownload(
                    GenerateSensitiveDataModelForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSensitiveDataModelForDownloadRequest,
                                    GenerateSensitiveDataModelForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateSensitiveDataModelForDownload");
        final GenerateSensitiveDataModelForDownloadRequest interceptedRequest =
                GenerateSensitiveDataModelForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSensitiveDataModelForDownloadConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateSensitiveDataModelForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateSensitiveDataModelForDownload");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateSensitiveDataModelForDownloadResponse>
                transformer =
                        GenerateSensitiveDataModelForDownloadConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateSensitiveDataModelForDownloadRequest,
                        GenerateSensitiveDataModelForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateSensitiveDataModelForDownloadRequest,
                                GenerateSensitiveDataModelForDownloadResponse>,
                        java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getGenerateSensitiveDataModelForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateSensitiveDataModelForDownloadRequest,
                    GenerateSensitiveDataModelForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateSqlFirewallPolicyResponse> generateSqlFirewallPolicy(
            GenerateSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateSqlFirewallPolicyRequest, GenerateSqlFirewallPolicyResponse>
                    handler) {
        LOG.trace("Called async generateSqlFirewallPolicy");
        final GenerateSqlFirewallPolicyRequest interceptedRequest =
                GenerateSqlFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSqlFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateSqlFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/GenerateSqlFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateSqlFirewallPolicyResponse>
                transformer =
                        GenerateSqlFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateSqlFirewallPolicyRequest, GenerateSqlFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateSqlFirewallPolicyRequest,
                                GenerateSqlFirewallPolicyResponse>,
                        java.util.concurrent.Future<GenerateSqlFirewallPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateSqlFirewallPolicyRequest, GenerateSqlFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateUserAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GenerateUserAssessmentReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateUserAssessmentReportResponse>
                transformer =
                        GenerateUserAssessmentReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetAlertResponse> getAlert(
            GetAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse>
                    handler) {
        LOG.trace("Called async getAlert");
        final GetAlertRequest interceptedRequest = GetAlertConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAlert",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/GetAlert");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAlertResponse> transformer =
                GetAlertConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse>,
                        java.util.concurrent.Future<GetAlertResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAlertRequest, GetAlertResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAlertPolicyResponse> getAlertPolicy(
            GetAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlertPolicyRequest, GetAlertPolicyResponse>
                    handler) {
        LOG.trace("Called async getAlertPolicy");
        final GetAlertPolicyRequest interceptedRequest =
                GetAlertPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAlertPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/GetAlertPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAlertPolicyResponse>
                transformer =
                        GetAlertPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAlertPolicyRequest, GetAlertPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAlertPolicyRequest, GetAlertPolicyResponse>,
                        java.util.concurrent.Future<GetAlertPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAlertPolicyRequest, GetAlertPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditArchiveRetrievalResponse> getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                    handler) {
        LOG.trace("Called async getAuditArchiveRetrieval");
        final GetAuditArchiveRetrievalRequest interceptedRequest =
                GetAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/GetAuditArchiveRetrieval");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAuditArchiveRetrievalResponse>
                transformer =
                        GetAuditArchiveRetrievalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<GetAuditArchiveRetrievalResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditPolicyResponse> getAuditPolicy(
            GetAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditPolicyRequest, GetAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async getAuditPolicy");
        final GetAuditPolicyRequest interceptedRequest =
                GetAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/GetAuditPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAuditPolicyResponse>
                transformer =
                        GetAuditPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAuditPolicyRequest, GetAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditPolicyRequest, GetAuditPolicyResponse>,
                        java.util.concurrent.Future<GetAuditPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditPolicyRequest, GetAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditProfileResponse> getAuditProfile(
            GetAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditProfileRequest, GetAuditProfileResponse>
                    handler) {
        LOG.trace("Called async getAuditProfile");
        final GetAuditProfileRequest interceptedRequest =
                GetAuditProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/GetAuditProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAuditProfileResponse>
                transformer =
                        GetAuditProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAuditProfileRequest, GetAuditProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditProfileRequest, GetAuditProfileResponse>,
                        java.util.concurrent.Future<GetAuditProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditProfileRequest, GetAuditProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditTrailResponse> getAuditTrail(
            GetAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                    handler) {
        LOG.trace("Called async getAuditTrail");
        final GetAuditTrailRequest interceptedRequest =
                GetAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/GetAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAuditTrailResponse>
                transformer =
                        GetAuditTrailConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditTrailRequest, GetAuditTrailResponse>,
                        java.util.concurrent.Future<GetAuditTrailResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditTrailRequest, GetAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>
            getCompatibleFormatsForDataTypes(
                    GetCompatibleFormatsForDataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForDataTypesRequest,
                                    GetCompatibleFormatsForDataTypesResponse>
                            handler) {
        LOG.trace("Called async getCompatibleFormatsForDataTypes");
        final GetCompatibleFormatsForDataTypesRequest interceptedRequest =
                GetCompatibleFormatsForDataTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForDataTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForDataTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForDataTypes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForDataTypesResponse>
                transformer =
                        GetCompatibleFormatsForDataTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCompatibleFormatsForDataTypesRequest,
                        GetCompatibleFormatsForDataTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompatibleFormatsForDataTypesRequest,
                                GetCompatibleFormatsForDataTypesResponse>,
                        java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompatibleFormatsForDataTypesRequest,
                    GetCompatibleFormatsForDataTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>
            getCompatibleFormatsForSensitiveTypes(
                    GetCompatibleFormatsForSensitiveTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForSensitiveTypesRequest,
                                    GetCompatibleFormatsForSensitiveTypesResponse>
                            handler) {
        LOG.trace("Called async getCompatibleFormatsForSensitiveTypes");
        final GetCompatibleFormatsForSensitiveTypesRequest interceptedRequest =
                GetCompatibleFormatsForSensitiveTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForSensitiveTypesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForSensitiveTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForSensitiveTypes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForSensitiveTypesResponse>
                transformer =
                        GetCompatibleFormatsForSensitiveTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCompatibleFormatsForSensitiveTypesRequest,
                        GetCompatibleFormatsForSensitiveTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompatibleFormatsForSensitiveTypesRequest,
                                GetCompatibleFormatsForSensitiveTypesResponse>,
                        java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompatibleFormatsForSensitiveTypesRequest,
                    GetCompatibleFormatsForSensitiveTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDataSafeConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/GetDataSafeConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDataSafeConfigurationResponse>
                transformer =
                        GetDataSafeConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/GetDataSafePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDataSafePrivateEndpointResponse>
                transformer =
                        GetDataSafePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetDatabaseSecurityConfigResponse> getDatabaseSecurityConfig(
            GetDatabaseSecurityConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseSecurityConfigRequest, GetDatabaseSecurityConfigResponse>
                    handler) {
        LOG.trace("Called async getDatabaseSecurityConfig");
        final GetDatabaseSecurityConfigRequest interceptedRequest =
                GetDatabaseSecurityConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseSecurityConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDatabaseSecurityConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/GetDatabaseSecurityConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseSecurityConfigResponse>
                transformer =
                        GetDatabaseSecurityConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseSecurityConfigRequest, GetDatabaseSecurityConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseSecurityConfigRequest,
                                GetDatabaseSecurityConfigResponse>,
                        java.util.concurrent.Future<GetDatabaseSecurityConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseSecurityConfigRequest, GetDatabaseSecurityConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseTableAccessEntryResponse>
            getDatabaseTableAccessEntry(
                    GetDatabaseTableAccessEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseTableAccessEntryRequest,
                                    GetDatabaseTableAccessEntryResponse>
                            handler) {
        LOG.trace("Called async getDatabaseTableAccessEntry");
        final GetDatabaseTableAccessEntryRequest interceptedRequest =
                GetDatabaseTableAccessEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseTableAccessEntryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDatabaseTableAccessEntry",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseTableAccessEntry/GetDatabaseTableAccessEntry");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseTableAccessEntryResponse>
                transformer =
                        GetDatabaseTableAccessEntryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseTableAccessEntryRequest, GetDatabaseTableAccessEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseTableAccessEntryRequest,
                                GetDatabaseTableAccessEntryResponse>,
                        java.util.concurrent.Future<GetDatabaseTableAccessEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseTableAccessEntryRequest, GetDatabaseTableAccessEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseViewAccessEntryResponse>
            getDatabaseViewAccessEntry(
                    GetDatabaseViewAccessEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseViewAccessEntryRequest,
                                    GetDatabaseViewAccessEntryResponse>
                            handler) {
        LOG.trace("Called async getDatabaseViewAccessEntry");
        final GetDatabaseViewAccessEntryRequest interceptedRequest =
                GetDatabaseViewAccessEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseViewAccessEntryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDatabaseViewAccessEntry",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseViewAccessEntry/GetDatabaseViewAccessEntry");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseViewAccessEntryResponse>
                transformer =
                        GetDatabaseViewAccessEntryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseViewAccessEntryRequest, GetDatabaseViewAccessEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseViewAccessEntryRequest,
                                GetDatabaseViewAccessEntryResponse>,
                        java.util.concurrent.Future<GetDatabaseViewAccessEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseViewAccessEntryRequest, GetDatabaseViewAccessEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDifferenceColumnResponse> getDifferenceColumn(
            GetDifferenceColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDifferenceColumnRequest, GetDifferenceColumnResponse>
                    handler) {
        LOG.trace("Called async getDifferenceColumn");
        final GetDifferenceColumnRequest interceptedRequest =
                GetDifferenceColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDifferenceColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDifferenceColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DifferenceColumn/GetDifferenceColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDifferenceColumnResponse>
                transformer =
                        GetDifferenceColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDifferenceColumnRequest, GetDifferenceColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDifferenceColumnRequest, GetDifferenceColumnResponse>,
                        java.util.concurrent.Future<GetDifferenceColumnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDifferenceColumnRequest, GetDifferenceColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async getDiscoveryJob");
        final GetDiscoveryJobRequest interceptedRequest =
                GetDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/GetDiscoveryJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDiscoveryJobResponse>
                transformer =
                        GetDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDiscoveryJobRequest, GetDiscoveryJobResponse>,
                        java.util.concurrent.Future<GetDiscoveryJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDiscoveryJobRequest, GetDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResultResponse> getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                    handler) {
        LOG.trace("Called async getDiscoveryJobResult");
        final GetDiscoveryJobResultRequest interceptedRequest =
                GetDiscoveryJobResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDiscoveryJobResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/GetDiscoveryJobResult");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDiscoveryJobResultResponse>
                transformer =
                        GetDiscoveryJobResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>,
                        java.util.concurrent.Future<GetDiscoveryJobResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLibraryMaskingFormatResponse> getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                    handler) {
        LOG.trace("Called async getLibraryMaskingFormat");
        final GetLibraryMaskingFormatRequest interceptedRequest =
                GetLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/GetLibraryMaskingFormat");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetLibraryMaskingFormatResponse>
                transformer =
                        GetLibraryMaskingFormatConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<GetLibraryMaskingFormatResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingColumnResponse> getMaskingColumn(
            GetMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingColumnRequest, GetMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async getMaskingColumn");
        final GetMaskingColumnRequest interceptedRequest =
                GetMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetMaskingColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMaskingColumnResponse>
                transformer =
                        GetMaskingColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMaskingColumnRequest, GetMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingColumnRequest, GetMaskingColumnResponse>,
                        java.util.concurrent.Future<GetMaskingColumnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingColumnRequest, GetMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingPolicyResponse> getMaskingPolicy(
            GetMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async getMaskingPolicy");
        final GetMaskingPolicyRequest interceptedRequest =
                GetMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GetMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMaskingPolicyResponse>
                transformer =
                        GetMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingPolicyRequest, GetMaskingPolicyResponse>,
                        java.util.concurrent.Future<GetMaskingPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingPolicyRequest, GetMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingPolicyHealthReportResponse>
            getMaskingPolicyHealthReport(
                    GetMaskingPolicyHealthReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMaskingPolicyHealthReportRequest,
                                    GetMaskingPolicyHealthReportResponse>
                            handler) {
        LOG.trace("Called async getMaskingPolicyHealthReport");
        final GetMaskingPolicyHealthReportRequest interceptedRequest =
                GetMaskingPolicyHealthReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingPolicyHealthReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingPolicyHealthReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/GetMaskingPolicyHealthReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMaskingPolicyHealthReportResponse>
                transformer =
                        GetMaskingPolicyHealthReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMaskingPolicyHealthReportRequest, GetMaskingPolicyHealthReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingPolicyHealthReportRequest,
                                GetMaskingPolicyHealthReportResponse>,
                        java.util.concurrent.Future<GetMaskingPolicyHealthReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingPolicyHealthReportRequest, GetMaskingPolicyHealthReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingReportResponse> getMaskingReport(
            GetMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingReportRequest, GetMaskingReportResponse>
                    handler) {
        LOG.trace("Called async getMaskingReport");
        final GetMaskingReportRequest interceptedRequest =
                GetMaskingReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingReport/GetMaskingReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMaskingReportResponse>
                transformer =
                        GetMaskingReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMaskingReportRequest, GetMaskingReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingReportRequest, GetMaskingReportResponse>,
                        java.util.concurrent.Future<GetMaskingReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingReportRequest, GetMaskingReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GetOnPremConnector");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOnPremConnectorResponse>
                transformer =
                        GetOnPremConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetPeerTargetDatabaseResponse> getPeerTargetDatabase(
            GetPeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPeerTargetDatabaseRequest, GetPeerTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getPeerTargetDatabase");
        final GetPeerTargetDatabaseRequest interceptedRequest =
                GetPeerTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPeerTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetPeerTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/GetPeerTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPeerTargetDatabaseResponse>
                transformer =
                        GetPeerTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPeerTargetDatabaseRequest, GetPeerTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPeerTargetDatabaseRequest, GetPeerTargetDatabaseResponse>,
                        java.util.concurrent.Future<GetPeerTargetDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPeerTargetDatabaseRequest, GetPeerTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProfileResponse> getProfile(
            GetProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProfileRequest, GetProfileResponse>
                    handler) {
        LOG.trace("Called async getProfile");
        final GetProfileRequest interceptedRequest = GetProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProfileResponse>
                transformer =
                        GetProfileConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProfileRequest, GetProfileResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProfileRequest, GetProfileResponse>,
                        java.util.concurrent.Future<GetProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProfileRequest, GetProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportResponse> getReport(
            GetReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse>
                    handler) {
        LOG.trace("Called async getReport");
        final GetReportRequest interceptedRequest = GetReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReportResponse>
                transformer =
                        GetReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse>,
                        java.util.concurrent.Future<GetReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportRequest, GetReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportContentResponse> getReportContent(
            GetReportContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportContentRequest, GetReportContentResponse>
                    handler) {
        LOG.trace("Called async getReportContent");
        final GetReportContentRequest interceptedRequest =
                GetReportContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReportContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReportContent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReportContentResponse>
                transformer =
                        GetReportContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetReportContentRequest, GetReportContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReportContentRequest, GetReportContentResponse>,
                        java.util.concurrent.Future<GetReportContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportContentRequest, GetReportContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResponse> getReportDefinition(
            GetReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportDefinitionRequest, GetReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async getReportDefinition");
        final GetReportDefinitionRequest interceptedRequest =
                GetReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GetReportDefinition");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReportDefinitionResponse>
                transformer =
                        GetReportDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetReportDefinitionRequest, GetReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReportDefinitionRequest, GetReportDefinitionResponse>,
                        java.util.concurrent.Future<GetReportDefinitionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportDefinitionRequest, GetReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSdmMaskingPolicyDifferenceResponse>
            getSdmMaskingPolicyDifference(
                    GetSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSdmMaskingPolicyDifferenceRequest,
                                    GetSdmMaskingPolicyDifferenceResponse>
                            handler) {
        LOG.trace("Called async getSdmMaskingPolicyDifference");
        final GetSdmMaskingPolicyDifferenceRequest interceptedRequest =
                GetSdmMaskingPolicyDifferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSdmMaskingPolicyDifferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSdmMaskingPolicyDifference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/GetSdmMaskingPolicyDifference");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSdmMaskingPolicyDifferenceResponse>
                transformer =
                        GetSdmMaskingPolicyDifferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSdmMaskingPolicyDifferenceRequest,
                                GetSdmMaskingPolicyDifferenceResponse>,
                        java.util.concurrent.Future<GetSdmMaskingPolicyDifferenceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityAssessmentResponse>
                transformer =
                        GetSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityAssessmentComparison",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessmentComparison");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentComparisonResponse>
                transformer =
                        GetSecurityAssessmentComparisonConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetSecurityPolicyResponse> getSecurityPolicy(
            GetSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                    handler) {
        LOG.trace("Called async getSecurityPolicy");
        final GetSecurityPolicyRequest interceptedRequest =
                GetSecurityPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/GetSecurityPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityPolicyResponse>
                transformer =
                        GetSecurityPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityPolicyRequest, GetSecurityPolicyResponse>,
                        java.util.concurrent.Future<GetSecurityPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityPolicyRequest, GetSecurityPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyDeploymentResponse>
            getSecurityPolicyDeployment(
                    GetSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityPolicyDeploymentRequest,
                                    GetSecurityPolicyDeploymentResponse>
                            handler) {
        LOG.trace("Called async getSecurityPolicyDeployment");
        final GetSecurityPolicyDeploymentRequest interceptedRequest =
                GetSecurityPolicyDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityPolicyDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityPolicyDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/GetSecurityPolicyDeployment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSecurityPolicyDeploymentResponse>
                transformer =
                        GetSecurityPolicyDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityPolicyDeploymentRequest, GetSecurityPolicyDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityPolicyDeploymentRequest,
                                GetSecurityPolicyDeploymentResponse>,
                        java.util.concurrent.Future<GetSecurityPolicyDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityPolicyDeploymentRequest, GetSecurityPolicyDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyEntryStateResponse>
            getSecurityPolicyEntryState(
                    GetSecurityPolicyEntryStateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityPolicyEntryStateRequest,
                                    GetSecurityPolicyEntryStateResponse>
                            handler) {
        LOG.trace("Called async getSecurityPolicyEntryState");
        final GetSecurityPolicyEntryStateRequest interceptedRequest =
                GetSecurityPolicyEntryStateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityPolicyEntryStateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityPolicyEntryState",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyEntryState/GetSecurityPolicyEntryState");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSecurityPolicyEntryStateResponse>
                transformer =
                        GetSecurityPolicyEntryStateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityPolicyEntryStateRequest, GetSecurityPolicyEntryStateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityPolicyEntryStateRequest,
                                GetSecurityPolicyEntryStateResponse>,
                        java.util.concurrent.Future<GetSecurityPolicyEntryStateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityPolicyEntryStateRequest, GetSecurityPolicyEntryStateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyReportResponse> getSecurityPolicyReport(
            GetSecurityPolicyReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyReportRequest, GetSecurityPolicyReportResponse>
                    handler) {
        LOG.trace("Called async getSecurityPolicyReport");
        final GetSecurityPolicyReportRequest interceptedRequest =
                GetSecurityPolicyReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityPolicyReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityPolicyReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyReport/GetSecurityPolicyReport");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSecurityPolicyReportResponse>
                transformer =
                        GetSecurityPolicyReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityPolicyReportRequest, GetSecurityPolicyReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityPolicyReportRequest, GetSecurityPolicyReportResponse>,
                        java.util.concurrent.Future<GetSecurityPolicyReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityPolicyReportRequest, GetSecurityPolicyReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveColumnResponse> getSensitiveColumn(
            GetSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async getSensitiveColumn");
        final GetSensitiveColumnRequest interceptedRequest =
                GetSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/GetSensitiveColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSensitiveColumnResponse>
                transformer =
                        GetSensitiveColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveColumnRequest, GetSensitiveColumnResponse>,
                        java.util.concurrent.Future<GetSensitiveColumnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveColumnRequest, GetSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveDataModelResponse> getSensitiveDataModel(
            GetSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async getSensitiveDataModel");
        final GetSensitiveDataModelRequest interceptedRequest =
                GetSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GetSensitiveDataModel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSensitiveDataModelResponse>
                transformer =
                        GetSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>,
                        java.util.concurrent.Future<GetSensitiveDataModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveTypeResponse> getSensitiveType(
            GetSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async getSensitiveType");
        final GetSensitiveTypeRequest interceptedRequest =
                GetSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/GetSensitiveType");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSensitiveTypeResponse>
                transformer =
                        GetSensitiveTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveTypeRequest, GetSensitiveTypeResponse>,
                        java.util.concurrent.Future<GetSensitiveTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveTypeRequest, GetSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSqlCollectionResponse> getSqlCollection(
            GetSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlCollectionRequest, GetSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async getSqlCollection");
        final GetSqlCollectionRequest interceptedRequest =
                GetSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/GetSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSqlCollectionResponse>
                transformer =
                        GetSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSqlCollectionRequest, GetSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSqlCollectionRequest, GetSqlCollectionResponse>,
                        java.util.concurrent.Future<GetSqlCollectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSqlCollectionRequest, GetSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSqlFirewallPolicyResponse> getSqlFirewallPolicy(
            GetSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlFirewallPolicyRequest, GetSqlFirewallPolicyResponse>
                    handler) {
        LOG.trace("Called async getSqlFirewallPolicy");
        final GetSqlFirewallPolicyRequest interceptedRequest =
                GetSqlFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSqlFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/GetSqlFirewallPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSqlFirewallPolicyResponse>
                transformer =
                        GetSqlFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSqlFirewallPolicyRequest, GetSqlFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSqlFirewallPolicyRequest, GetSqlFirewallPolicyResponse>,
                        java.util.concurrent.Future<GetSqlFirewallPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSqlFirewallPolicyRequest, GetSqlFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>
            getTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetAlertPolicyAssociationRequest,
                                    GetTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async getTargetAlertPolicyAssociation");
        final GetTargetAlertPolicyAssociationRequest interceptedRequest =
                GetTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/GetTargetAlertPolicyAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTargetAlertPolicyAssociationResponse>
                transformer =
                        GetTargetAlertPolicyAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetAlertPolicyAssociationRequest,
                        GetTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetAlertPolicyAssociationRequest,
                                GetTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetAlertPolicyAssociationRequest,
                    GetTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/GetTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTargetDatabaseResponse>
                transformer =
                        GetTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserAssessmentResponse>
                transformer =
                        GetUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetUserAssessmentComparison",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessmentComparison");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetUserAssessmentComparisonResponse>
                transformer =
                        GetUserAssessmentComparisonConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListAlertAnalyticsResponse> listAlertAnalytics(
            ListAlertAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAlertAnalytics");
        final ListAlertAnalyticsRequest interceptedRequest =
                ListAlertAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlertAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAlertAnalyticsResponse>
                transformer =
                        ListAlertAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>,
                        java.util.concurrent.Future<ListAlertAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertPoliciesResponse> listAlertPolicies(
            ListAlertPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                    handler) {
        LOG.trace("Called async listAlertPolicies");
        final ListAlertPoliciesRequest interceptedRequest =
                ListAlertPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAlertPoliciesResponse>
                transformer =
                        ListAlertPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertPoliciesRequest, ListAlertPoliciesResponse>,
                        java.util.concurrent.Future<ListAlertPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertPoliciesRequest, ListAlertPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertPolicyRulesResponse> listAlertPolicyRules(
            ListAlertPolicyRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                    handler) {
        LOG.trace("Called async listAlertPolicyRules");
        final ListAlertPolicyRulesRequest interceptedRequest =
                ListAlertPolicyRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPolicyRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertPolicyRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicyRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAlertPolicyRulesResponse>
                transformer =
                        ListAlertPolicyRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>,
                        java.util.concurrent.Future<ListAlertPolicyRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResponse> listAlerts(
            ListAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse>
                    handler) {
        LOG.trace("Called async listAlerts");
        final ListAlertsRequest interceptedRequest = ListAlertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlerts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlerts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAlertsResponse>
                transformer =
                        ListAlertsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertsRequest, ListAlertsResponse>,
                        java.util.concurrent.Future<ListAlertsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertsRequest, ListAlertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse>
            listAuditArchiveRetrievals(
                    ListAuditArchiveRetrievalsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuditArchiveRetrievalsRequest,
                                    ListAuditArchiveRetrievalsResponse>
                            handler) {
        LOG.trace("Called async listAuditArchiveRetrievals");
        final ListAuditArchiveRetrievalsRequest interceptedRequest =
                ListAuditArchiveRetrievalsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditArchiveRetrievalsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditArchiveRetrievals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ListAuditArchiveRetrievals");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuditArchiveRetrievalsResponse>
                transformer =
                        ListAuditArchiveRetrievalsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditArchiveRetrievalsRequest,
                                ListAuditArchiveRetrievalsResponse>,
                        java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventAnalyticsResponse> listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditEventAnalytics");
        final ListAuditEventAnalyticsRequest interceptedRequest =
                ListAuditEventAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditEventAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEventAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuditEventAnalyticsResponse>
                transformer =
                        ListAuditEventAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditEventAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventsResponse> listAuditEvents(
            ListAuditEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventsRequest, ListAuditEventsResponse>
                    handler) {
        LOG.trace("Called async listAuditEvents");
        final ListAuditEventsRequest interceptedRequest =
                ListAuditEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEvents");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuditEventsResponse>
                transformer =
                        ListAuditEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuditEventsRequest, ListAuditEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditEventsRequest, ListAuditEventsResponse>,
                        java.util.concurrent.Future<ListAuditEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditEventsRequest, ListAuditEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditPoliciesResponse> listAuditPolicies(
            ListAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                    handler) {
        LOG.trace("Called async listAuditPolicies");
        final ListAuditPoliciesRequest interceptedRequest =
                ListAuditPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyCollection/ListAuditPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuditPoliciesResponse>
                transformer =
                        ListAuditPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditPoliciesRequest, ListAuditPoliciesResponse>,
                        java.util.concurrent.Future<ListAuditPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditPoliciesRequest, ListAuditPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditPolicyAnalyticsResponse> listAuditPolicyAnalytics(
            ListAuditPolicyAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditPolicyAnalytics");
        final ListAuditPolicyAnalyticsRequest interceptedRequest =
                ListAuditPolicyAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditPolicyAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditPolicyAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyAnalyticCollection/ListAuditPolicyAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuditPolicyAnalyticsResponse>
                transformer =
                        ListAuditPolicyAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditPolicyAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditPolicyAnalyticsRequest, ListAuditPolicyAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfileAnalyticsResponse> listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditProfileAnalytics");
        final ListAuditProfileAnalyticsRequest interceptedRequest =
                ListAuditProfileAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfileAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditProfileAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfileAnalyticCollection/ListAuditProfileAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuditProfileAnalyticsResponse>
                transformer =
                        ListAuditProfileAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditProfileAnalyticsRequest,
                                ListAuditProfileAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditProfileAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfilesResponse> listAuditProfiles(
            ListAuditProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfilesRequest, ListAuditProfilesResponse>
                    handler) {
        LOG.trace("Called async listAuditProfiles");
        final ListAuditProfilesRequest interceptedRequest =
                ListAuditProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAuditProfiles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuditProfilesResponse>
                transformer =
                        ListAuditProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuditProfilesRequest, ListAuditProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditProfilesRequest, ListAuditProfilesResponse>,
                        java.util.concurrent.Future<ListAuditProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditProfilesRequest, ListAuditProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailAnalyticsResponse> listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditTrailAnalytics");
        final ListAuditTrailAnalyticsRequest interceptedRequest =
                ListAuditTrailAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditTrailAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrailAnalyticCollection/ListAuditTrailAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuditTrailAnalyticsResponse>
                transformer =
                        ListAuditTrailAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditTrailAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailsResponse> listAuditTrails(
            ListAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailsRequest, ListAuditTrailsResponse>
                    handler) {
        LOG.trace("Called async listAuditTrails");
        final ListAuditTrailsRequest interceptedRequest =
                ListAuditTrailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditTrails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ListAuditTrails");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuditTrailsResponse>
                transformer =
                        ListAuditTrailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuditTrailsRequest, ListAuditTrailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditTrailsRequest, ListAuditTrailsResponse>,
                        java.util.concurrent.Future<ListAuditTrailsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditTrailsRequest, ListAuditTrailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAvailableAuditVolumesResponse> listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                    handler) {
        LOG.trace("Called async listAvailableAuditVolumes");
        final ListAvailableAuditVolumesRequest interceptedRequest =
                ListAvailableAuditVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableAuditVolumesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAvailableAuditVolumes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAvailableAuditVolumes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAvailableAuditVolumesResponse>
                transformer =
                        ListAvailableAuditVolumesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailableAuditVolumesRequest,
                                ListAvailableAuditVolumesResponse>,
                        java.util.concurrent.Future<ListAvailableAuditVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCollectedAuditVolumesResponse> listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                    handler) {
        LOG.trace("Called async listCollectedAuditVolumes");
        final ListCollectedAuditVolumesRequest interceptedRequest =
                ListCollectedAuditVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCollectedAuditVolumesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListCollectedAuditVolumes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListCollectedAuditVolumes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCollectedAuditVolumesResponse>
                transformer =
                        ListCollectedAuditVolumesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCollectedAuditVolumesRequest,
                                ListCollectedAuditVolumesResponse>,
                        java.util.concurrent.Future<ListCollectedAuditVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListColumnsResponse> listColumns(
            ListColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse>
                    handler) {
        LOG.trace("Called async listColumns");
        final ListColumnsRequest interceptedRequest =
                ListColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListColumnsResponse>
                transformer =
                        ListColumnsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListColumnsRequest, ListColumnsResponse>,
                        java.util.concurrent.Future<ListColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListColumnsRequest, ListColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDataSafePrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpointSummary/ListDataSafePrivateEndpoints");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDataSafePrivateEndpointsResponse>
                transformer =
                        ListDataSafePrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListDatabaseSecurityConfigsResponse>
            listDatabaseSecurityConfigs(
                    ListDatabaseSecurityConfigsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseSecurityConfigsRequest,
                                    ListDatabaseSecurityConfigsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseSecurityConfigs");
        final ListDatabaseSecurityConfigsRequest interceptedRequest =
                ListDatabaseSecurityConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseSecurityConfigsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDatabaseSecurityConfigs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfigCollection/ListDatabaseSecurityConfigs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseSecurityConfigsResponse>
                transformer =
                        ListDatabaseSecurityConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseSecurityConfigsRequest, ListDatabaseSecurityConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseSecurityConfigsRequest,
                                ListDatabaseSecurityConfigsResponse>,
                        java.util.concurrent.Future<ListDatabaseSecurityConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseSecurityConfigsRequest, ListDatabaseSecurityConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseTableAccessEntriesResponse>
            listDatabaseTableAccessEntries(
                    ListDatabaseTableAccessEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseTableAccessEntriesRequest,
                                    ListDatabaseTableAccessEntriesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseTableAccessEntries");
        final ListDatabaseTableAccessEntriesRequest interceptedRequest =
                ListDatabaseTableAccessEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseTableAccessEntriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDatabaseTableAccessEntries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseTableAccessEntryCollection/ListDatabaseTableAccessEntries");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseTableAccessEntriesResponse>
                transformer =
                        ListDatabaseTableAccessEntriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseTableAccessEntriesRequest,
                        ListDatabaseTableAccessEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseTableAccessEntriesRequest,
                                ListDatabaseTableAccessEntriesResponse>,
                        java.util.concurrent.Future<ListDatabaseTableAccessEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseTableAccessEntriesRequest, ListDatabaseTableAccessEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseViewAccessEntriesResponse>
            listDatabaseViewAccessEntries(
                    ListDatabaseViewAccessEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseViewAccessEntriesRequest,
                                    ListDatabaseViewAccessEntriesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseViewAccessEntries");
        final ListDatabaseViewAccessEntriesRequest interceptedRequest =
                ListDatabaseViewAccessEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseViewAccessEntriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDatabaseViewAccessEntries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseViewAccessEntryCollection/ListDatabaseViewAccessEntries");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseViewAccessEntriesResponse>
                transformer =
                        ListDatabaseViewAccessEntriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseViewAccessEntriesRequest, ListDatabaseViewAccessEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseViewAccessEntriesRequest,
                                ListDatabaseViewAccessEntriesResponse>,
                        java.util.concurrent.Future<ListDatabaseViewAccessEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseViewAccessEntriesRequest, ListDatabaseViewAccessEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDifferenceColumnsResponse> listDifferenceColumns(
            ListDifferenceColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>
                    handler) {
        LOG.trace("Called async listDifferenceColumns");
        final ListDifferenceColumnsRequest interceptedRequest =
                ListDifferenceColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDifferenceColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDifferenceColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ListDifferenceColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDifferenceColumnsResponse>
                transformer =
                        ListDifferenceColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>,
                        java.util.concurrent.Future<ListDifferenceColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDifferenceColumnsRequest, ListDifferenceColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryAnalyticsResponse> listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryAnalytics");
        final ListDiscoveryAnalyticsRequest interceptedRequest =
                ListDiscoveryAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListDiscoveryAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDiscoveryAnalyticsResponse>
                transformer =
                        ListDiscoveryAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>,
                        java.util.concurrent.Future<ListDiscoveryAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobResultsResponse> listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobResults");
        final ListDiscoveryJobResultsRequest interceptedRequest =
                ListDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDiscoveryJobResultsResponse>
                transformer =
                        ListDiscoveryJobResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobs");
        final ListDiscoveryJobsRequest interceptedRequest =
                ListDiscoveryJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDiscoveryJobsResponse>
                transformer =
                        ListDiscoveryJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFindingAnalyticsResponse> listFindingAnalytics(
            ListFindingAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFindingAnalyticsRequest, ListFindingAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listFindingAnalytics");
        final ListFindingAnalyticsRequest interceptedRequest =
                ListFindingAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFindingAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListFindingAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindingAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFindingAnalyticsResponse>
                transformer =
                        ListFindingAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFindingAnalyticsRequest, ListFindingAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFindingAnalyticsRequest, ListFindingAnalyticsResponse>,
                        java.util.concurrent.Future<ListFindingAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFindingAnalyticsRequest, ListFindingAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListFindings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFindingsResponse>
                transformer =
                        ListFindingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListFindingsChangeAuditLogsResponse>
            listFindingsChangeAuditLogs(
                    ListFindingsChangeAuditLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFindingsChangeAuditLogsRequest,
                                    ListFindingsChangeAuditLogsResponse>
                            handler) {
        LOG.trace("Called async listFindingsChangeAuditLogs");
        final ListFindingsChangeAuditLogsRequest interceptedRequest =
                ListFindingsChangeAuditLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFindingsChangeAuditLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListFindingsChangeAuditLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindingsChangeAuditLogs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFindingsChangeAuditLogsResponse>
                transformer =
                        ListFindingsChangeAuditLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFindingsChangeAuditLogsRequest, ListFindingsChangeAuditLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFindingsChangeAuditLogsRequest,
                                ListFindingsChangeAuditLogsResponse>,
                        java.util.concurrent.Future<ListFindingsChangeAuditLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFindingsChangeAuditLogsRequest, ListFindingsChangeAuditLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListGrants");
        final java.util.function.Function<javax.ws.rs.core.Response, ListGrantsResponse>
                transformer =
                        ListGrantsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                    handler) {
        LOG.trace("Called async listLibraryMaskingFormats");
        final ListLibraryMaskingFormatsRequest interceptedRequest =
                ListLibraryMaskingFormatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLibraryMaskingFormatsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListLibraryMaskingFormats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormatSummary/ListLibraryMaskingFormats");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListLibraryMaskingFormatsResponse>
                transformer =
                        ListLibraryMaskingFormatsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLibraryMaskingFormatsRequest,
                                ListLibraryMaskingFormatsResponse>,
                        java.util.concurrent.Future<ListLibraryMaskingFormatsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskedColumnsResponse> listMaskedColumns(
            ListMaskedColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                    handler) {
        LOG.trace("Called async listMaskedColumns");
        final ListMaskedColumnsRequest interceptedRequest =
                ListMaskedColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskedColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskedColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskedColumnSummary/ListMaskedColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskedColumnsResponse>
                transformer =
                        ListMaskedColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskedColumnsRequest, ListMaskedColumnsResponse>,
                        java.util.concurrent.Future<ListMaskedColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskedColumnsRequest, ListMaskedColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingAnalyticsResponse> listMaskingAnalytics(
            ListMaskingAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listMaskingAnalytics");
        final ListMaskingAnalyticsRequest interceptedRequest =
                ListMaskingAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingAnalyticsResponse>
                transformer =
                        ListMaskingAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>,
                        java.util.concurrent.Future<ListMaskingAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingColumnsResponse> listMaskingColumns(
            ListMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                    handler) {
        LOG.trace("Called async listMaskingColumns");
        final ListMaskingColumnsRequest interceptedRequest =
                ListMaskingColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/ListMaskingColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingColumnsResponse>
                transformer =
                        ListMaskingColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingColumnsRequest, ListMaskingColumnsResponse>,
                        java.util.concurrent.Future<ListMaskingColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingColumnsRequest, ListMaskingColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingObjectsResponse> listMaskingObjects(
            ListMaskingObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingObjectsRequest, ListMaskingObjectsResponse>
                    handler) {
        LOG.trace("Called async listMaskingObjects");
        final ListMaskingObjectsRequest interceptedRequest =
                ListMaskingObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingObjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingObjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingObjectCollection/ListMaskingObjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingObjectsResponse>
                transformer =
                        ListMaskingObjectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMaskingObjectsRequest, ListMaskingObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingObjectsRequest, ListMaskingObjectsResponse>,
                        java.util.concurrent.Future<ListMaskingObjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingObjectsRequest, ListMaskingObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPoliciesResponse> listMaskingPolicies(
            ListMaskingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                    handler) {
        LOG.trace("Called async listMaskingPolicies");
        final ListMaskingPoliciesRequest interceptedRequest =
                ListMaskingPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingPoliciesResponse>
                transformer =
                        ListMaskingPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>,
                        java.util.concurrent.Future<ListMaskingPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPolicyHealthReportLogsResponse>
            listMaskingPolicyHealthReportLogs(
                    ListMaskingPolicyHealthReportLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMaskingPolicyHealthReportLogsRequest,
                                    ListMaskingPolicyHealthReportLogsResponse>
                            handler) {
        LOG.trace("Called async listMaskingPolicyHealthReportLogs");
        final ListMaskingPolicyHealthReportLogsRequest interceptedRequest =
                ListMaskingPolicyHealthReportLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingPolicyHealthReportLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingPolicyHealthReportLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ListMaskingPolicyHealthReportLogs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMaskingPolicyHealthReportLogsResponse>
                transformer =
                        ListMaskingPolicyHealthReportLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingPolicyHealthReportLogsRequest,
                        ListMaskingPolicyHealthReportLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingPolicyHealthReportLogsRequest,
                                ListMaskingPolicyHealthReportLogsResponse>,
                        java.util.concurrent.Future<ListMaskingPolicyHealthReportLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingPolicyHealthReportLogsRequest,
                    ListMaskingPolicyHealthReportLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPolicyHealthReportsResponse>
            listMaskingPolicyHealthReports(
                    ListMaskingPolicyHealthReportsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMaskingPolicyHealthReportsRequest,
                                    ListMaskingPolicyHealthReportsResponse>
                            handler) {
        LOG.trace("Called async listMaskingPolicyHealthReports");
        final ListMaskingPolicyHealthReportsRequest interceptedRequest =
                ListMaskingPolicyHealthReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingPolicyHealthReportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingPolicyHealthReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicyHealthReport/ListMaskingPolicyHealthReports");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMaskingPolicyHealthReportsResponse>
                transformer =
                        ListMaskingPolicyHealthReportsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingPolicyHealthReportsRequest,
                        ListMaskingPolicyHealthReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingPolicyHealthReportsRequest,
                                ListMaskingPolicyHealthReportsResponse>,
                        java.util.concurrent.Future<ListMaskingPolicyHealthReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingPolicyHealthReportsRequest, ListMaskingPolicyHealthReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingReportsResponse> listMaskingReports(
            ListMaskingReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingReportsRequest, ListMaskingReportsResponse>
                    handler) {
        LOG.trace("Called async listMaskingReports");
        final ListMaskingReportsRequest interceptedRequest =
                ListMaskingReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingReportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingReports");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingReportsResponse>
                transformer =
                        ListMaskingReportsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMaskingReportsRequest, ListMaskingReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingReportsRequest, ListMaskingReportsResponse>,
                        java.util.concurrent.Future<ListMaskingReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingReportsRequest, ListMaskingReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingSchemasResponse> listMaskingSchemas(
            ListMaskingSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingSchemasRequest, ListMaskingSchemasResponse>
                    handler) {
        LOG.trace("Called async listMaskingSchemas");
        final ListMaskingSchemasRequest interceptedRequest =
                ListMaskingSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingSchemaCollection/ListMaskingSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMaskingSchemasResponse>
                transformer =
                        ListMaskingSchemasConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMaskingSchemasRequest, ListMaskingSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingSchemasRequest, ListMaskingSchemasResponse>,
                        java.util.concurrent.Future<ListMaskingSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingSchemasRequest, ListMaskingSchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListOnPremConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnectorSummary/ListOnPremConnectors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListOnPremConnectorsResponse>
                transformer =
                        ListOnPremConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListPeerTargetDatabasesResponse> listPeerTargetDatabases(
            ListPeerTargetDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPeerTargetDatabasesRequest, ListPeerTargetDatabasesResponse>
                    handler) {
        LOG.trace("Called async listPeerTargetDatabases");
        final ListPeerTargetDatabasesRequest interceptedRequest =
                ListPeerTargetDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPeerTargetDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListPeerTargetDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/ListPeerTargetDatabases");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListPeerTargetDatabasesResponse>
                transformer =
                        ListPeerTargetDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPeerTargetDatabasesRequest, ListPeerTargetDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPeerTargetDatabasesRequest, ListPeerTargetDatabasesResponse>,
                        java.util.concurrent.Future<ListPeerTargetDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPeerTargetDatabasesRequest, ListPeerTargetDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProfileAnalyticsResponse> listProfileAnalytics(
            ListProfileAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listProfileAnalytics");
        final ListProfileAnalyticsRequest interceptedRequest =
                ListProfileAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProfileAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListProfileAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Profile/ListProfileAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProfileAnalyticsResponse>
                transformer =
                        ListProfileAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>,
                        java.util.concurrent.Future<ListProfileAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProfileAnalyticsRequest, ListProfileAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProfileSummariesResponse> listProfileSummaries(
            ListProfileSummariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProfileSummariesRequest, ListProfileSummariesResponse>
                    handler) {
        LOG.trace("Called async listProfileSummaries");
        final ListProfileSummariesRequest interceptedRequest =
                ListProfileSummariesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProfileSummariesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListProfileSummaries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListProfileSummaries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProfileSummariesResponse>
                transformer =
                        ListProfileSummariesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProfileSummariesRequest, ListProfileSummariesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProfileSummariesRequest, ListProfileSummariesResponse>,
                        java.util.concurrent.Future<ListProfileSummariesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProfileSummariesRequest, ListProfileSummariesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResponse> listReportDefinitions(
            ListReportDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                    handler) {
        LOG.trace("Called async listReportDefinitions");
        final ListReportDefinitionsRequest interceptedRequest =
                ListReportDefinitionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportDefinitionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListReportDefinitions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ListReportDefinitions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListReportDefinitionsResponse>
                transformer =
                        ListReportDefinitionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReportDefinitionsRequest, ListReportDefinitionsResponse>,
                        java.util.concurrent.Future<ListReportDefinitionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReportDefinitionsRequest, ListReportDefinitionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                    handler) {
        LOG.trace("Called async listReports");
        final ListReportsRequest interceptedRequest =
                ListReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportSummary/ListReports");
        final java.util.function.Function<javax.ws.rs.core.Response, ListReportsResponse>
                transformer =
                        ListReportsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReportsRequest, ListReportsResponse>,
                        java.util.concurrent.Future<ListReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReportsRequest, ListReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRoleGrantPathsResponse> listRoleGrantPaths(
            ListRoleGrantPathsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoleGrantPathsRequest, ListRoleGrantPathsResponse>
                    handler) {
        LOG.trace("Called async listRoleGrantPaths");
        final ListRoleGrantPathsRequest interceptedRequest =
                ListRoleGrantPathsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRoleGrantPathsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListRoleGrantPaths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/RoleGrantPathCollection/ListRoleGrantPaths");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRoleGrantPathsResponse>
                transformer =
                        ListRoleGrantPathsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRoleGrantPathsRequest, ListRoleGrantPathsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRoleGrantPathsRequest, ListRoleGrantPathsResponse>,
                        java.util.concurrent.Future<ListRoleGrantPathsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRoleGrantPathsRequest, ListRoleGrantPathsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>
                    handler) {
        LOG.trace("Called async listRoles");
        final ListRolesRequest interceptedRequest = ListRolesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRolesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListRoles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRolesResponse>
                transformer =
                        ListRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>,
                        java.util.concurrent.Future<ListRolesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRolesRequest, ListRolesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {
        LOG.trace("Called async listSchemas");
        final ListSchemasRequest interceptedRequest =
                ListSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer =
                        ListSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchemasRequest, ListSchemasResponse>,
                        java.util.concurrent.Future<ListSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchemasRequest, ListSchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSdmMaskingPolicyDifferencesResponse>
            listSdmMaskingPolicyDifferences(
                    ListSdmMaskingPolicyDifferencesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSdmMaskingPolicyDifferencesRequest,
                                    ListSdmMaskingPolicyDifferencesResponse>
                            handler) {
        LOG.trace("Called async listSdmMaskingPolicyDifferences");
        final ListSdmMaskingPolicyDifferencesRequest interceptedRequest =
                ListSdmMaskingPolicyDifferencesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSdmMaskingPolicyDifferencesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSdmMaskingPolicyDifferences",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/ListSdmMaskingPolicyDifferences");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSdmMaskingPolicyDifferencesResponse>
                transformer =
                        ListSdmMaskingPolicyDifferencesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSdmMaskingPolicyDifferencesRequest,
                        ListSdmMaskingPolicyDifferencesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSdmMaskingPolicyDifferencesRequest,
                                ListSdmMaskingPolicyDifferencesResponse>,
                        java.util.concurrent.Future<ListSdmMaskingPolicyDifferencesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSdmMaskingPolicyDifferencesRequest,
                    ListSdmMaskingPolicyDifferencesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityAssessments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessmentSummary/ListSecurityAssessments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityAssessmentsResponse>
                transformer =
                        ListSecurityAssessmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListSecurityFeatureAnalyticsResponse>
            listSecurityFeatureAnalytics(
                    ListSecurityFeatureAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityFeatureAnalyticsRequest,
                                    ListSecurityFeatureAnalyticsResponse>
                            handler) {
        LOG.trace("Called async listSecurityFeatureAnalytics");
        final ListSecurityFeatureAnalyticsRequest interceptedRequest =
                ListSecurityFeatureAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityFeatureAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityFeatureAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListSecurityFeatureAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityFeatureAnalyticsResponse>
                transformer =
                        ListSecurityFeatureAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityFeatureAnalyticsRequest, ListSecurityFeatureAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityFeatureAnalyticsRequest,
                                ListSecurityFeatureAnalyticsResponse>,
                        java.util.concurrent.Future<ListSecurityFeatureAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityFeatureAnalyticsRequest, ListSecurityFeatureAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityFeaturesResponse> listSecurityFeatures(
            ListSecurityFeaturesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityFeaturesRequest, ListSecurityFeaturesResponse>
                    handler) {
        LOG.trace("Called async listSecurityFeatures");
        final ListSecurityFeaturesRequest interceptedRequest =
                ListSecurityFeaturesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityFeaturesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityFeatures",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListSecurityFeatures");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityFeaturesResponse>
                transformer =
                        ListSecurityFeaturesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityFeaturesRequest, ListSecurityFeaturesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityFeaturesRequest, ListSecurityFeaturesResponse>,
                        java.util.concurrent.Future<ListSecurityFeaturesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityFeaturesRequest, ListSecurityFeaturesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResponse> listSecurityPolicies(
            ListSecurityPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                    handler) {
        LOG.trace("Called async listSecurityPolicies");
        final ListSecurityPoliciesRequest interceptedRequest =
                ListSecurityPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyCollection/ListSecurityPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityPoliciesResponse>
                transformer =
                        ListSecurityPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>,
                        java.util.concurrent.Future<ListSecurityPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyDeploymentsResponse>
            listSecurityPolicyDeployments(
                    ListSecurityPolicyDeploymentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityPolicyDeploymentsRequest,
                                    ListSecurityPolicyDeploymentsResponse>
                            handler) {
        LOG.trace("Called async listSecurityPolicyDeployments");
        final ListSecurityPolicyDeploymentsRequest interceptedRequest =
                ListSecurityPolicyDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityPolicyDeploymentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityPolicyDeployments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeploymentCollection/ListSecurityPolicyDeployments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityPolicyDeploymentsResponse>
                transformer =
                        ListSecurityPolicyDeploymentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityPolicyDeploymentsRequest, ListSecurityPolicyDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityPolicyDeploymentsRequest,
                                ListSecurityPolicyDeploymentsResponse>,
                        java.util.concurrent.Future<ListSecurityPolicyDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityPolicyDeploymentsRequest, ListSecurityPolicyDeploymentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyEntryStatesResponse>
            listSecurityPolicyEntryStates(
                    ListSecurityPolicyEntryStatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityPolicyEntryStatesRequest,
                                    ListSecurityPolicyEntryStatesResponse>
                            handler) {
        LOG.trace("Called async listSecurityPolicyEntryStates");
        final ListSecurityPolicyEntryStatesRequest interceptedRequest =
                ListSecurityPolicyEntryStatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityPolicyEntryStatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityPolicyEntryStates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyEntryStateCollection/ListSecurityPolicyEntryStates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityPolicyEntryStatesResponse>
                transformer =
                        ListSecurityPolicyEntryStatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityPolicyEntryStatesRequest, ListSecurityPolicyEntryStatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityPolicyEntryStatesRequest,
                                ListSecurityPolicyEntryStatesResponse>,
                        java.util.concurrent.Future<ListSecurityPolicyEntryStatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityPolicyEntryStatesRequest, ListSecurityPolicyEntryStatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPolicyReportsResponse> listSecurityPolicyReports(
            ListSecurityPolicyReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPolicyReportsRequest, ListSecurityPolicyReportsResponse>
                    handler) {
        LOG.trace("Called async listSecurityPolicyReports");
        final ListSecurityPolicyReportsRequest interceptedRequest =
                ListSecurityPolicyReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityPolicyReportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityPolicyReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyReportCollection/ListSecurityPolicyReports");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityPolicyReportsResponse>
                transformer =
                        ListSecurityPolicyReportsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityPolicyReportsRequest, ListSecurityPolicyReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityPolicyReportsRequest,
                                ListSecurityPolicyReportsResponse>,
                        java.util.concurrent.Future<ListSecurityPolicyReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityPolicyReportsRequest, ListSecurityPolicyReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveColumnsResponse> listSensitiveColumns(
            ListSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                    handler) {
        LOG.trace("Called async listSensitiveColumns");
        final ListSensitiveColumnsRequest interceptedRequest =
                ListSensitiveColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/ListSensitiveColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSensitiveColumnsResponse>
                transformer =
                        ListSensitiveColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>,
                        java.util.concurrent.Future<ListSensitiveColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveDataModelsResponse> listSensitiveDataModels(
            ListSensitiveDataModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                    handler) {
        LOG.trace("Called async listSensitiveDataModels");
        final ListSensitiveDataModelsRequest interceptedRequest =
                ListSensitiveDataModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveDataModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveDataModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListSensitiveDataModels");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSensitiveDataModelsResponse>
                transformer =
                        ListSensitiveDataModelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>,
                        java.util.concurrent.Future<ListSensitiveDataModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveObjectsResponse> listSensitiveObjects(
            ListSensitiveObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>
                    handler) {
        LOG.trace("Called async listSensitiveObjects");
        final ListSensitiveObjectsRequest interceptedRequest =
                ListSensitiveObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveObjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveObjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveObjectCollection/ListSensitiveObjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSensitiveObjectsResponse>
                transformer =
                        ListSensitiveObjectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>,
                        java.util.concurrent.Future<ListSensitiveObjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveObjectsRequest, ListSensitiveObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveSchemasResponse> listSensitiveSchemas(
            ListSensitiveSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>
                    handler) {
        LOG.trace("Called async listSensitiveSchemas");
        final ListSensitiveSchemasRequest interceptedRequest =
                ListSensitiveSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveSchemaCollection/ListSensitiveSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSensitiveSchemasResponse>
                transformer =
                        ListSensitiveSchemasConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>,
                        java.util.concurrent.Future<ListSensitiveSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveSchemasRequest, ListSensitiveSchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveTypesResponse> listSensitiveTypes(
            ListSensitiveTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                    handler) {
        LOG.trace("Called async listSensitiveTypes");
        final ListSensitiveTypesRequest interceptedRequest =
                ListSensitiveTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ListSensitiveTypes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSensitiveTypesResponse>
                transformer =
                        ListSensitiveTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveTypesRequest, ListSensitiveTypesResponse>,
                        java.util.concurrent.Future<ListSensitiveTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveTypesRequest, ListSensitiveTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionAnalyticsResponse>
            listSqlCollectionAnalytics(
                    ListSqlCollectionAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlCollectionAnalyticsRequest,
                                    ListSqlCollectionAnalyticsResponse>
                            handler) {
        LOG.trace("Called async listSqlCollectionAnalytics");
        final ListSqlCollectionAnalyticsRequest interceptedRequest =
                ListSqlCollectionAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlCollectionAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlCollectionAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionAnalyticsCollection/ListSqlCollectionAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlCollectionAnalyticsResponse>
                transformer =
                        ListSqlCollectionAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlCollectionAnalyticsRequest, ListSqlCollectionAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlCollectionAnalyticsRequest,
                                ListSqlCollectionAnalyticsResponse>,
                        java.util.concurrent.Future<ListSqlCollectionAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlCollectionAnalyticsRequest, ListSqlCollectionAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionLogInsightsResponse>
            listSqlCollectionLogInsights(
                    ListSqlCollectionLogInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlCollectionLogInsightsRequest,
                                    ListSqlCollectionLogInsightsResponse>
                            handler) {
        LOG.trace("Called async listSqlCollectionLogInsights");
        final ListSqlCollectionLogInsightsRequest interceptedRequest =
                ListSqlCollectionLogInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlCollectionLogInsightsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlCollectionLogInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionLogInsightsCollection/ListSqlCollectionLogInsights");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlCollectionLogInsightsResponse>
                transformer =
                        ListSqlCollectionLogInsightsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlCollectionLogInsightsRequest, ListSqlCollectionLogInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlCollectionLogInsightsRequest,
                                ListSqlCollectionLogInsightsResponse>,
                        java.util.concurrent.Future<ListSqlCollectionLogInsightsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlCollectionLogInsightsRequest, ListSqlCollectionLogInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlCollectionsResponse> listSqlCollections(
            ListSqlCollectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlCollectionsRequest, ListSqlCollectionsResponse>
                    handler) {
        LOG.trace("Called async listSqlCollections");
        final ListSqlCollectionsRequest interceptedRequest =
                ListSqlCollectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlCollectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlCollections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollectionCollection/ListSqlCollections");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSqlCollectionsResponse>
                transformer =
                        ListSqlCollectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSqlCollectionsRequest, ListSqlCollectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlCollectionsRequest, ListSqlCollectionsResponse>,
                        java.util.concurrent.Future<ListSqlCollectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlCollectionsRequest, ListSqlCollectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallAllowedSqlAnalyticsResponse>
            listSqlFirewallAllowedSqlAnalytics(
                    ListSqlFirewallAllowedSqlAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallAllowedSqlAnalyticsRequest,
                                    ListSqlFirewallAllowedSqlAnalyticsResponse>
                            handler) {
        LOG.trace("Called async listSqlFirewallAllowedSqlAnalytics");
        final ListSqlFirewallAllowedSqlAnalyticsRequest interceptedRequest =
                ListSqlFirewallAllowedSqlAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallAllowedSqlAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallAllowedSqlAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSqlAnalyticsCollection/ListSqlFirewallAllowedSqlAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallAllowedSqlAnalyticsResponse>
                transformer =
                        ListSqlFirewallAllowedSqlAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallAllowedSqlAnalyticsRequest,
                        ListSqlFirewallAllowedSqlAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallAllowedSqlAnalyticsRequest,
                                ListSqlFirewallAllowedSqlAnalyticsResponse>,
                        java.util.concurrent.Future<ListSqlFirewallAllowedSqlAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallAllowedSqlAnalyticsRequest,
                    ListSqlFirewallAllowedSqlAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallAllowedSqlsResponse>
            listSqlFirewallAllowedSqls(
                    ListSqlFirewallAllowedSqlsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallAllowedSqlsRequest,
                                    ListSqlFirewallAllowedSqlsResponse>
                            handler) {
        LOG.trace("Called async listSqlFirewallAllowedSqls");
        final ListSqlFirewallAllowedSqlsRequest interceptedRequest =
                ListSqlFirewallAllowedSqlsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallAllowedSqlsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallAllowedSqls",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallAllowedSqlCollection/ListSqlFirewallAllowedSqls");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallAllowedSqlsResponse>
                transformer =
                        ListSqlFirewallAllowedSqlsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallAllowedSqlsRequest, ListSqlFirewallAllowedSqlsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallAllowedSqlsRequest,
                                ListSqlFirewallAllowedSqlsResponse>,
                        java.util.concurrent.Future<ListSqlFirewallAllowedSqlsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallAllowedSqlsRequest, ListSqlFirewallAllowedSqlsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallPoliciesResponse> listSqlFirewallPolicies(
            ListSqlFirewallPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>
                    handler) {
        LOG.trace("Called async listSqlFirewallPolicies");
        final ListSqlFirewallPoliciesRequest interceptedRequest =
                ListSqlFirewallPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicyCollection/ListSqlFirewallPolicies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallPoliciesResponse>
                transformer =
                        ListSqlFirewallPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>,
                        java.util.concurrent.Future<ListSqlFirewallPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallPoliciesRequest, ListSqlFirewallPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallPolicyAnalyticsResponse>
            listSqlFirewallPolicyAnalytics(
                    ListSqlFirewallPolicyAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallPolicyAnalyticsRequest,
                                    ListSqlFirewallPolicyAnalyticsResponse>
                            handler) {
        LOG.trace("Called async listSqlFirewallPolicyAnalytics");
        final ListSqlFirewallPolicyAnalyticsRequest interceptedRequest =
                ListSqlFirewallPolicyAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallPolicyAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallPolicyAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicyAnalyticsCollection/ListSqlFirewallPolicyAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallPolicyAnalyticsResponse>
                transformer =
                        ListSqlFirewallPolicyAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallPolicyAnalyticsRequest,
                        ListSqlFirewallPolicyAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallPolicyAnalyticsRequest,
                                ListSqlFirewallPolicyAnalyticsResponse>,
                        java.util.concurrent.Future<ListSqlFirewallPolicyAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallPolicyAnalyticsRequest, ListSqlFirewallPolicyAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallViolationAnalyticsResponse>
            listSqlFirewallViolationAnalytics(
                    ListSqlFirewallViolationAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlFirewallViolationAnalyticsRequest,
                                    ListSqlFirewallViolationAnalyticsResponse>
                            handler) {
        LOG.trace("Called async listSqlFirewallViolationAnalytics");
        final ListSqlFirewallViolationAnalyticsRequest interceptedRequest =
                ListSqlFirewallViolationAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallViolationAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallViolationAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallViolationSummary/ListSqlFirewallViolationAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallViolationAnalyticsResponse>
                transformer =
                        ListSqlFirewallViolationAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallViolationAnalyticsRequest,
                        ListSqlFirewallViolationAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallViolationAnalyticsRequest,
                                ListSqlFirewallViolationAnalyticsResponse>,
                        java.util.concurrent.Future<ListSqlFirewallViolationAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallViolationAnalyticsRequest,
                    ListSqlFirewallViolationAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlFirewallViolationsResponse> listSqlFirewallViolations(
            ListSqlFirewallViolationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>
                    handler) {
        LOG.trace("Called async listSqlFirewallViolations");
        final ListSqlFirewallViolationsRequest interceptedRequest =
                ListSqlFirewallViolationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlFirewallViolationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSqlFirewallViolations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallViolationSummary/ListSqlFirewallViolations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlFirewallViolationsResponse>
                transformer =
                        ListSqlFirewallViolationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlFirewallViolationsRequest,
                                ListSqlFirewallViolationsResponse>,
                        java.util.concurrent.Future<ListSqlFirewallViolationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlFirewallViolationsRequest, ListSqlFirewallViolationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTablesResponse> listTables(
            ListTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse>
                    handler) {
        LOG.trace("Called async listTables");
        final ListTablesRequest interceptedRequest = ListTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListTables");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTablesResponse>
                transformer =
                        ListTablesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTablesRequest, ListTablesResponse>,
                        java.util.concurrent.Future<ListTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTablesRequest, ListTablesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociations(
                    ListTargetAlertPolicyAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetAlertPolicyAssociationsRequest,
                                    ListTargetAlertPolicyAssociationsResponse>
                            handler) {
        LOG.trace("Called async listTargetAlertPolicyAssociations");
        final ListTargetAlertPolicyAssociationsRequest interceptedRequest =
                ListTargetAlertPolicyAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetAlertPolicyAssociationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTargetAlertPolicyAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociationSummary/ListTargetAlertPolicyAssociations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTargetAlertPolicyAssociationsResponse>
                transformer =
                        ListTargetAlertPolicyAssociationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetAlertPolicyAssociationsRequest,
                                ListTargetAlertPolicyAssociationsResponse>,
                        java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetAlertPolicyAssociationsRequest,
                    ListTargetAlertPolicyAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTargetDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseSummary/ListTargetDatabases");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTargetDatabasesResponse>
                transformer =
                        ListTargetDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListUserAccessAnalyticsResponse> listUserAccessAnalytics(
            ListUserAccessAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAccessAnalyticsRequest, ListUserAccessAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listUserAccessAnalytics");
        final ListUserAccessAnalyticsRequest interceptedRequest =
                ListUserAccessAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAccessAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUserAccessAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAccessAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListUserAccessAnalyticsResponse>
                transformer =
                        ListUserAccessAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserAccessAnalyticsRequest, ListUserAccessAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAccessAnalyticsRequest, ListUserAccessAnalyticsResponse>,
                        java.util.concurrent.Future<ListUserAccessAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAccessAnalyticsRequest, ListUserAccessAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUserAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAnalytics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUserAnalyticsResponse>
                transformer =
                        ListUserAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUserAssessments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessmentSummary/ListUserAssessments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUserAssessmentsResponse>
                transformer =
                        ListUserAssessmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUsersResponse>
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
                        "DataSafe",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestError/ListWorkRequestErrors");
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
                        "DataSafe",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "DataSafe",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestSummary/ListWorkRequests");
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
    public java.util.concurrent.Future<MaskDataResponse> maskData(
            MaskDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse>
                    handler) {
        LOG.trace("Called async maskData");
        final MaskDataRequest interceptedRequest = MaskDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MaskDataConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "MaskData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/MaskData");
        final java.util.function.Function<javax.ws.rs.core.Response, MaskDataResponse> transformer =
                MaskDataConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse>,
                        java.util.concurrent.Future<MaskDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMaskDataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MaskDataRequest, MaskDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyGlobalSettingsResponse> modifyGlobalSettings(
            ModifyGlobalSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                    handler) {
        LOG.trace("Called async modifyGlobalSettings");
        final ModifyGlobalSettingsRequest interceptedRequest =
                ModifyGlobalSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyGlobalSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ModifyGlobalSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/ModifyGlobalSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, ModifyGlobalSettingsResponse>
                transformer =
                        ModifyGlobalSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>,
                        java.util.concurrent.Future<ModifyGlobalSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModifyGlobalSettingsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchAlertsResponse> patchAlerts(
            PatchAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse>
                    handler) {
        LOG.trace("Called async patchAlerts");
        final PatchAlertsRequest interceptedRequest =
                PatchAlertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAlertsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchAlerts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/PatchAlerts");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchAlertsResponse>
                transformer =
                        PatchAlertsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchAlertsRequest, PatchAlertsResponse>,
                        java.util.concurrent.Future<PatchAlertsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchAlertsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAlertsRequest, PatchAlertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchDiscoveryJobResultsResponse> patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async patchDiscoveryJobResults");
        final PatchDiscoveryJobResultsRequest interceptedRequest =
                PatchDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/PatchDiscoveryJobResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchDiscoveryJobResultsResponse>
                transformer =
                        PatchDiscoveryJobResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<PatchDiscoveryJobResultsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchDiscoveryJobResultDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchMaskingColumnsResponse> patchMaskingColumns(
            PatchMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                    handler) {
        LOG.trace("Called async patchMaskingColumns");
        final PatchMaskingColumnsRequest interceptedRequest =
                PatchMaskingColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMaskingColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchMaskingColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/PatchMaskingColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMaskingColumnsResponse>
                transformer =
                        PatchMaskingColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>,
                        java.util.concurrent.Future<PatchMaskingColumnsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchMaskingColumnsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchSdmMaskingPolicyDifferenceColumnsResponse>
            patchSdmMaskingPolicyDifferenceColumns(
                    PatchSdmMaskingPolicyDifferenceColumnsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSdmMaskingPolicyDifferenceColumnsRequest,
                                    PatchSdmMaskingPolicyDifferenceColumnsResponse>
                            handler) {
        LOG.trace("Called async patchSdmMaskingPolicyDifferenceColumns");
        final PatchSdmMaskingPolicyDifferenceColumnsRequest interceptedRequest =
                PatchSdmMaskingPolicyDifferenceColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSdmMaskingPolicyDifferenceColumnsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchSdmMaskingPolicyDifferenceColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/PatchSdmMaskingPolicyDifferenceColumns");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchSdmMaskingPolicyDifferenceColumnsResponse>
                transformer =
                        PatchSdmMaskingPolicyDifferenceColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSdmMaskingPolicyDifferenceColumnsRequest,
                        PatchSdmMaskingPolicyDifferenceColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSdmMaskingPolicyDifferenceColumnsRequest,
                                PatchSdmMaskingPolicyDifferenceColumnsResponse>,
                        java.util.concurrent.Future<PatchSdmMaskingPolicyDifferenceColumnsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getPatchSdmMaskingPolicyDifferenceColumnsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSdmMaskingPolicyDifferenceColumnsRequest,
                    PatchSdmMaskingPolicyDifferenceColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchSensitiveColumnsResponse> patchSensitiveColumns(
            PatchSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                    handler) {
        LOG.trace("Called async patchSensitiveColumns");
        final PatchSensitiveColumnsRequest interceptedRequest =
                PatchSensitiveColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSensitiveColumnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchSensitiveColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/PatchSensitiveColumns");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchSensitiveColumnsResponse>
                transformer =
                        PatchSensitiveColumnsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>,
                        java.util.concurrent.Future<PatchSensitiveColumnsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchTargetAlertPolicyAssociationResponse>
            patchTargetAlertPolicyAssociation(
                    PatchTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchTargetAlertPolicyAssociationRequest,
                                    PatchTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async patchTargetAlertPolicyAssociation");
        final PatchTargetAlertPolicyAssociationRequest interceptedRequest =
                PatchTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/PatchTargetAlertPolicyAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchTargetAlertPolicyAssociationResponse>
                transformer =
                        PatchTargetAlertPolicyAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchTargetAlertPolicyAssociationRequest,
                        PatchTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchTargetAlertPolicyAssociationRequest,
                                PatchTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<PatchTargetAlertPolicyAssociationResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchTargetAlertPolicyAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchTargetAlertPolicyAssociationRequest,
                    PatchTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ProvisionAuditPolicyResponse> provisionAuditPolicy(
            ProvisionAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async provisionAuditPolicy");
        final ProvisionAuditPolicyRequest interceptedRequest =
                ProvisionAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ProvisionAuditPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ProvisionAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ProvisionAuditPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, ProvisionAuditPolicyResponse>
                transformer =
                        ProvisionAuditPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>,
                        java.util.concurrent.Future<ProvisionAuditPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getProvisionAuditPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PurgeSqlCollectionLogsResponse> purgeSqlCollectionLogs(
            PurgeSqlCollectionLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PurgeSqlCollectionLogsRequest, PurgeSqlCollectionLogsResponse>
                    handler) {
        LOG.trace("Called async purgeSqlCollectionLogs");
        final PurgeSqlCollectionLogsRequest interceptedRequest =
                PurgeSqlCollectionLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeSqlCollectionLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PurgeSqlCollectionLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/PurgeSqlCollectionLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, PurgeSqlCollectionLogsResponse>
                transformer =
                        PurgeSqlCollectionLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PurgeSqlCollectionLogsRequest, PurgeSqlCollectionLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PurgeSqlCollectionLogsRequest, PurgeSqlCollectionLogsResponse>,
                        java.util.concurrent.Future<PurgeSqlCollectionLogsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PurgeSqlCollectionLogsRequest, PurgeSqlCollectionLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshDatabaseSecurityConfigurationResponse>
            refreshDatabaseSecurityConfiguration(
                    RefreshDatabaseSecurityConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshDatabaseSecurityConfigurationRequest,
                                    RefreshDatabaseSecurityConfigurationResponse>
                            handler) {
        LOG.trace("Called async refreshDatabaseSecurityConfiguration");
        final RefreshDatabaseSecurityConfigurationRequest interceptedRequest =
                RefreshDatabaseSecurityConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshDatabaseSecurityConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshDatabaseSecurityConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/RefreshDatabaseSecurityConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshDatabaseSecurityConfigurationResponse>
                transformer =
                        RefreshDatabaseSecurityConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshDatabaseSecurityConfigurationRequest,
                        RefreshDatabaseSecurityConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshDatabaseSecurityConfigurationRequest,
                                RefreshDatabaseSecurityConfigurationResponse>,
                        java.util.concurrent.Future<RefreshDatabaseSecurityConfigurationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshDatabaseSecurityConfigurationRequest,
                    RefreshDatabaseSecurityConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/RefreshSecurityAssessment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshSecurityAssessmentResponse>
                transformer =
                        RefreshSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<RefreshSqlCollectionLogInsightsResponse>
            refreshSqlCollectionLogInsights(
                    RefreshSqlCollectionLogInsightsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshSqlCollectionLogInsightsRequest,
                                    RefreshSqlCollectionLogInsightsResponse>
                            handler) {
        LOG.trace("Called async refreshSqlCollectionLogInsights");
        final RefreshSqlCollectionLogInsightsRequest interceptedRequest =
                RefreshSqlCollectionLogInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshSqlCollectionLogInsightsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshSqlCollectionLogInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/RefreshSqlCollectionLogInsights");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshSqlCollectionLogInsightsResponse>
                transformer =
                        RefreshSqlCollectionLogInsightsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshSqlCollectionLogInsightsRequest,
                        RefreshSqlCollectionLogInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshSqlCollectionLogInsightsRequest,
                                RefreshSqlCollectionLogInsightsResponse>,
                        java.util.concurrent.Future<RefreshSqlCollectionLogInsightsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshSqlCollectionLogInsightsRequest,
                    RefreshSqlCollectionLogInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshTargetDatabaseResponse> refreshTargetDatabase(
            RefreshTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshTargetDatabaseRequest, RefreshTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async refreshTargetDatabase");
        final RefreshTargetDatabaseRequest interceptedRequest =
                RefreshTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/RefreshTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, RefreshTargetDatabaseResponse>
                transformer =
                        RefreshTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshTargetDatabaseRequest, RefreshTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshTargetDatabaseRequest, RefreshTargetDatabaseResponse>,
                        java.util.concurrent.Future<RefreshTargetDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshTargetDatabaseRequest, RefreshTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/RefreshUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, RefreshUserAssessmentResponse>
                transformer =
                        RefreshUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<RemoveScheduleReportResponse> removeScheduleReport(
            RemoveScheduleReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveScheduleReportRequest, RemoveScheduleReportResponse>
                    handler) {
        LOG.trace("Called async removeScheduleReport");
        final RemoveScheduleReportRequest interceptedRequest =
                RemoveScheduleReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveScheduleReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RemoveScheduleReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/RemoveScheduleReport");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveScheduleReportResponse>
                transformer =
                        RemoveScheduleReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveScheduleReportRequest, RemoveScheduleReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveScheduleReportRequest, RemoveScheduleReportResponse>,
                        java.util.concurrent.Future<RemoveScheduleReportResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveScheduleReportRequest, RemoveScheduleReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeAuditTrailResponse> resumeAuditTrail(
            ResumeAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                    handler) {
        LOG.trace("Called async resumeAuditTrail");
        final ResumeAuditTrailRequest interceptedRequest =
                ResumeAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ResumeAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ResumeAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, ResumeAuditTrailResponse>
                transformer =
                        ResumeAuditTrailConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeAuditTrailRequest, ResumeAuditTrailResponse>,
                        java.util.concurrent.Future<ResumeAuditTrailResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeAuditTrailRequest, ResumeAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeWorkRequestResponse> resumeWorkRequest(
            ResumeWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                    handler) {
        LOG.trace("Called async resumeWorkRequest");
        final ResumeWorkRequestRequest interceptedRequest =
                ResumeWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ResumeWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/ResumeWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, ResumeWorkRequestResponse>
                transformer =
                        ResumeWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeWorkRequestRequest, ResumeWorkRequestResponse>,
                        java.util.concurrent.Future<ResumeWorkRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeWorkRequestRequest, ResumeWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RetrieveAuditPoliciesResponse> retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                    handler) {
        LOG.trace("Called async retrieveAuditPolicies");
        final RetrieveAuditPoliciesRequest interceptedRequest =
                RetrieveAuditPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RetrieveAuditPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RetrieveAuditPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/RetrieveAuditPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, RetrieveAuditPoliciesResponse>
                transformer =
                        RetrieveAuditPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>,
                        java.util.concurrent.Future<RetrieveAuditPoliciesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScheduleReportResponse> scheduleReport(
            ScheduleReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScheduleReportRequest, ScheduleReportResponse>
                    handler) {
        LOG.trace("Called async scheduleReport");
        final ScheduleReportRequest interceptedRequest =
                ScheduleReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScheduleReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ScheduleReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ScheduleReport");
        final java.util.function.Function<javax.ws.rs.core.Response, ScheduleReportResponse>
                transformer =
                        ScheduleReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ScheduleReportRequest, ScheduleReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScheduleReportRequest, ScheduleReportResponse>,
                        java.util.concurrent.Future<ScheduleReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScheduleReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScheduleReportRequest, ScheduleReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SetSecurityAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/SetSecurityAssessmentBaseline");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SetSecurityAssessmentBaselineResponse>
                transformer =
                        SetSecurityAssessmentBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SetUserAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/SetUserAssessmentBaseline");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SetUserAssessmentBaselineResponse>
                transformer =
                        SetUserAssessmentBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<StartAuditTrailResponse> startAuditTrail(
            StartAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAuditTrailRequest, StartAuditTrailResponse>
                    handler) {
        LOG.trace("Called async startAuditTrail");
        final StartAuditTrailRequest interceptedRequest =
                StartAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StartAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StartAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, StartAuditTrailResponse>
                transformer =
                        StartAuditTrailConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartAuditTrailRequest, StartAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartAuditTrailRequest, StartAuditTrailResponse>,
                        java.util.concurrent.Future<StartAuditTrailResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStartAuditTrailDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartAuditTrailRequest, StartAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartSqlCollectionResponse> startSqlCollection(
            StartSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartSqlCollectionRequest, StartSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async startSqlCollection");
        final StartSqlCollectionRequest interceptedRequest =
                StartSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StartSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/sqlCollection/StartSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, StartSqlCollectionResponse>
                transformer =
                        StartSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartSqlCollectionRequest, StartSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartSqlCollectionRequest, StartSqlCollectionResponse>,
                        java.util.concurrent.Future<StartSqlCollectionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartSqlCollectionRequest, StartSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopAuditTrailResponse> stopAuditTrail(
            StopAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAuditTrailRequest, StopAuditTrailResponse>
                    handler) {
        LOG.trace("Called async stopAuditTrail");
        final StopAuditTrailRequest interceptedRequest =
                StopAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StopAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StopAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, StopAuditTrailResponse>
                transformer =
                        StopAuditTrailConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopAuditTrailRequest, StopAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopAuditTrailRequest, StopAuditTrailResponse>,
                        java.util.concurrent.Future<StopAuditTrailResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopAuditTrailRequest, StopAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopSqlCollectionResponse> stopSqlCollection(
            StopSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopSqlCollectionRequest, StopSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async stopSqlCollection");
        final StopSqlCollectionRequest interceptedRequest =
                StopSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StopSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/StopSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, StopSqlCollectionResponse>
                transformer =
                        StopSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopSqlCollectionRequest, StopSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopSqlCollectionRequest, StopSqlCollectionResponse>,
                        java.util.concurrent.Future<StopSqlCollectionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopSqlCollectionRequest, StopSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SuspendWorkRequestResponse> suspendWorkRequest(
            SuspendWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                    handler) {
        LOG.trace("Called async suspendWorkRequest");
        final SuspendWorkRequestRequest interceptedRequest =
                SuspendWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuspendWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SuspendWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/SuspendWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, SuspendWorkRequestResponse>
                transformer =
                        SuspendWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SuspendWorkRequestRequest, SuspendWorkRequestResponse>,
                        java.util.concurrent.Future<SuspendWorkRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SuspendWorkRequestRequest, SuspendWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UnsetSecurityAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UnsetSecurityAssessmentBaseline");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UnsetSecurityAssessmentBaselineResponse>
                transformer =
                        UnsetSecurityAssessmentBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UnsetUserAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UnsetUserAssessmentBaseline");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UnsetUserAssessmentBaselineResponse>
                transformer =
                        UnsetUserAssessmentBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdateAlertResponse> updateAlert(
            UpdateAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse>
                    handler) {
        LOG.trace("Called async updateAlert");
        final UpdateAlertRequest interceptedRequest =
                UpdateAlertConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAlertConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAlert",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/UpdateAlert");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAlertResponse>
                transformer =
                        UpdateAlertConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAlertRequest, UpdateAlertResponse>,
                        java.util.concurrent.Future<UpdateAlertResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAlertDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAlertRequest, UpdateAlertResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse>
            updateAuditArchiveRetrieval(
                    UpdateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuditArchiveRetrievalRequest,
                                    UpdateAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async updateAuditArchiveRetrieval");
        final UpdateAuditArchiveRetrievalRequest interceptedRequest =
                UpdateAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/UpdateAuditArchiveRetrieval");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateAuditArchiveRetrievalResponse>
                transformer =
                        UpdateAuditArchiveRetrievalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAuditArchiveRetrievalRequest, UpdateAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditArchiveRetrievalRequest,
                                UpdateAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditArchiveRetrievalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditArchiveRetrievalRequest, UpdateAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditPolicyResponse> updateAuditPolicy(
            UpdateAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async updateAuditPolicy");
        final UpdateAuditPolicyRequest interceptedRequest =
                UpdateAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/UpdateAuditPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAuditPolicyResponse>
                transformer =
                        UpdateAuditPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>,
                        java.util.concurrent.Future<UpdateAuditPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditProfileResponse> updateAuditProfile(
            UpdateAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                    handler) {
        LOG.trace("Called async updateAuditProfile");
        final UpdateAuditProfileRequest interceptedRequest =
                UpdateAuditProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/UpdateAuditProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAuditProfileResponse>
                transformer =
                        UpdateAuditProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditProfileRequest, UpdateAuditProfileResponse>,
                        java.util.concurrent.Future<UpdateAuditProfileResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditProfileRequest, UpdateAuditProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditTrailResponse> updateAuditTrail(
            UpdateAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                    handler) {
        LOG.trace("Called async updateAuditTrail");
        final UpdateAuditTrailRequest interceptedRequest =
                UpdateAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditTrailConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/UpdateAuditTrail");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAuditTrailResponse>
                transformer =
                        UpdateAuditTrailConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditTrailRequest, UpdateAuditTrailResponse>,
                        java.util.concurrent.Future<UpdateAuditTrailResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditTrailDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditTrailRequest, UpdateAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/UpdateDataSafePrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDataSafePrivateEndpointResponse>
                transformer =
                        UpdateDataSafePrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdateDatabaseSecurityConfigResponse>
            updateDatabaseSecurityConfig(
                    UpdateDatabaseSecurityConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseSecurityConfigRequest,
                                    UpdateDatabaseSecurityConfigResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseSecurityConfig");
        final UpdateDatabaseSecurityConfigRequest interceptedRequest =
                UpdateDatabaseSecurityConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseSecurityConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateDatabaseSecurityConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DatabaseSecurityConfig/UpdateDatabaseSecurityConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseSecurityConfigResponse>
                transformer =
                        UpdateDatabaseSecurityConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseSecurityConfigRequest, UpdateDatabaseSecurityConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseSecurityConfigRequest,
                                UpdateDatabaseSecurityConfigResponse>,
                        java.util.concurrent.Future<UpdateDatabaseSecurityConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseSecurityConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseSecurityConfigRequest, UpdateDatabaseSecurityConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingResponse> updateFinding(
            UpdateFindingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFindingRequest, UpdateFindingResponse>
                    handler) {
        LOG.trace("Called async updateFinding");
        final UpdateFindingRequest interceptedRequest =
                UpdateFindingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFindingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateFinding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Finding/UpdateFinding");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFindingResponse>
                transformer =
                        UpdateFindingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFindingRequest, UpdateFindingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFindingRequest, UpdateFindingResponse>,
                        java.util.concurrent.Future<UpdateFindingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFindingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFindingRequest, UpdateFindingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse>
            updateLibraryMaskingFormat(
                    UpdateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLibraryMaskingFormatRequest,
                                    UpdateLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async updateLibraryMaskingFormat");
        final UpdateLibraryMaskingFormatRequest interceptedRequest =
                UpdateLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/UpdateLibraryMaskingFormat");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateLibraryMaskingFormatResponse>
                transformer =
                        UpdateLibraryMaskingFormatConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLibraryMaskingFormatRequest, UpdateLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLibraryMaskingFormatRequest,
                                UpdateLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLibraryMaskingFormatDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLibraryMaskingFormatRequest, UpdateLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingColumnResponse> updateMaskingColumn(
            UpdateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async updateMaskingColumn");
        final UpdateMaskingColumnRequest interceptedRequest =
                UpdateMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/UpdateMaskingColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMaskingColumnResponse>
                transformer =
                        UpdateMaskingColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>,
                        java.util.concurrent.Future<UpdateMaskingColumnResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMaskingColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingPolicyResponse> updateMaskingPolicy(
            UpdateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async updateMaskingPolicy");
        final UpdateMaskingPolicyRequest interceptedRequest =
                UpdateMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UpdateMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMaskingPolicyResponse>
                transformer =
                        UpdateMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>,
                        java.util.concurrent.Future<UpdateMaskingPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnector");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateOnPremConnectorResponse>
                transformer =
                        UpdateOnPremConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateOnPremConnectorWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnectorWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorWalletResponse>
                transformer =
                        UpdateOnPremConnectorWalletConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdatePeerTargetDatabaseResponse> updatePeerTargetDatabase(
            UpdatePeerTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePeerTargetDatabaseRequest, UpdatePeerTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async updatePeerTargetDatabase");
        final UpdatePeerTargetDatabaseRequest interceptedRequest =
                UpdatePeerTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePeerTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdatePeerTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/PeerTargetDatabase/UpdatePeerTargetDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdatePeerTargetDatabaseResponse>
                transformer =
                        UpdatePeerTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdatePeerTargetDatabaseRequest, UpdatePeerTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePeerTargetDatabaseRequest, UpdatePeerTargetDatabaseResponse>,
                        java.util.concurrent.Future<UpdatePeerTargetDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePeerTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePeerTargetDatabaseRequest, UpdatePeerTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateReportResponse> updateReport(
            UpdateReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateReportRequest, UpdateReportResponse>
                    handler) {
        LOG.trace("Called async updateReport");
        final UpdateReportRequest interceptedRequest =
                UpdateReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/UpdateReport");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateReportResponse>
                transformer =
                        UpdateReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateReportRequest, UpdateReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateReportRequest, UpdateReportResponse>,
                        java.util.concurrent.Future<UpdateReportResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateReportRequest, UpdateReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResponse> updateReportDefinition(
            UpdateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async updateReportDefinition");
        final UpdateReportDefinitionRequest interceptedRequest =
                UpdateReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReportDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/UpdateReportDefinition");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateReportDefinitionResponse>
                transformer =
                        UpdateReportDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>,
                        java.util.concurrent.Future<UpdateReportDefinitionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateReportDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSdmMaskingPolicyDifferenceResponse>
            updateSdmMaskingPolicyDifference(
                    UpdateSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSdmMaskingPolicyDifferenceRequest,
                                    UpdateSdmMaskingPolicyDifferenceResponse>
                            handler) {
        LOG.trace("Called async updateSdmMaskingPolicyDifference");
        final UpdateSdmMaskingPolicyDifferenceRequest interceptedRequest =
                UpdateSdmMaskingPolicyDifferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSdmMaskingPolicyDifferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSdmMaskingPolicyDifference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SdmMaskingPolicyDifference/UpdateSdmMaskingPolicyDifference");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSdmMaskingPolicyDifferenceResponse>
                transformer =
                        UpdateSdmMaskingPolicyDifferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSdmMaskingPolicyDifferenceRequest,
                        UpdateSdmMaskingPolicyDifferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSdmMaskingPolicyDifferenceRequest,
                                UpdateSdmMaskingPolicyDifferenceResponse>,
                        java.util.concurrent.Future<UpdateSdmMaskingPolicyDifferenceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSdmMaskingPolicyDifferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSdmMaskingPolicyDifferenceRequest,
                    UpdateSdmMaskingPolicyDifferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UpdateSecurityAssessment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSecurityAssessmentResponse>
                transformer =
                        UpdateSecurityAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdateSecurityPolicyResponse> updateSecurityPolicy(
            UpdateSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
                    handler) {
        LOG.trace("Called async updateSecurityPolicy");
        final UpdateSecurityPolicyRequest interceptedRequest =
                UpdateSecurityPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSecurityPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicy/UpdateSecurityPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityPolicyResponse>
                transformer =
                        UpdateSecurityPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>,
                        java.util.concurrent.Future<UpdateSecurityPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyDeploymentResponse>
            updateSecurityPolicyDeployment(
                    UpdateSecurityPolicyDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSecurityPolicyDeploymentRequest,
                                    UpdateSecurityPolicyDeploymentResponse>
                            handler) {
        LOG.trace("Called async updateSecurityPolicyDeployment");
        final UpdateSecurityPolicyDeploymentRequest interceptedRequest =
                UpdateSecurityPolicyDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityPolicyDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSecurityPolicyDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityPolicyDeployment/UpdateSecurityPolicyDeployment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSecurityPolicyDeploymentResponse>
                transformer =
                        UpdateSecurityPolicyDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSecurityPolicyDeploymentRequest,
                        UpdateSecurityPolicyDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityPolicyDeploymentRequest,
                                UpdateSecurityPolicyDeploymentResponse>,
                        java.util.concurrent.Future<UpdateSecurityPolicyDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityPolicyDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityPolicyDeploymentRequest, UpdateSecurityPolicyDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveColumnResponse> updateSensitiveColumn(
            UpdateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveColumn");
        final UpdateSensitiveColumnRequest interceptedRequest =
                UpdateSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/UpdateSensitiveColumn");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSensitiveColumnResponse>
                transformer =
                        UpdateSensitiveColumnConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>,
                        java.util.concurrent.Future<UpdateSensitiveColumnResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveDataModelResponse> updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveDataModel");
        final UpdateSensitiveDataModelRequest interceptedRequest =
                UpdateSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UpdateSensitiveDataModel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSensitiveDataModelResponse>
                transformer =
                        UpdateSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>,
                        java.util.concurrent.Future<UpdateSensitiveDataModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveTypeResponse> updateSensitiveType(
            UpdateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveType");
        final UpdateSensitiveTypeRequest interceptedRequest =
                UpdateSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/UpdateSensitiveType");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSensitiveTypeResponse>
                transformer =
                        UpdateSensitiveTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>,
                        java.util.concurrent.Future<UpdateSensitiveTypeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlCollectionResponse> updateSqlCollection(
            UpdateSqlCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlCollectionRequest, UpdateSqlCollectionResponse>
                    handler) {
        LOG.trace("Called async updateSqlCollection");
        final UpdateSqlCollectionRequest interceptedRequest =
                UpdateSqlCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSqlCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSqlCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlCollection/UpdateSqlCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSqlCollectionResponse>
                transformer =
                        UpdateSqlCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSqlCollectionRequest, UpdateSqlCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSqlCollectionRequest, UpdateSqlCollectionResponse>,
                        java.util.concurrent.Future<UpdateSqlCollectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSqlCollectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSqlCollectionRequest, UpdateSqlCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlFirewallPolicyResponse> updateSqlFirewallPolicy(
            UpdateSqlFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlFirewallPolicyRequest, UpdateSqlFirewallPolicyResponse>
                    handler) {
        LOG.trace("Called async updateSqlFirewallPolicy");
        final UpdateSqlFirewallPolicyRequest interceptedRequest =
                UpdateSqlFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSqlFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSqlFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SqlFirewallPolicy/UpdateSqlFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSqlFirewallPolicyResponse>
                transformer =
                        UpdateSqlFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSqlFirewallPolicyRequest, UpdateSqlFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSqlFirewallPolicyRequest, UpdateSqlFirewallPolicyResponse>,
                        java.util.concurrent.Future<UpdateSqlFirewallPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSqlFirewallPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSqlFirewallPolicyRequest, UpdateSqlFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>
            updateTargetAlertPolicyAssociation(
                    UpdateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetAlertPolicyAssociationRequest,
                                    UpdateTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async updateTargetAlertPolicyAssociation");
        final UpdateTargetAlertPolicyAssociationRequest interceptedRequest =
                UpdateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/UpdateTargetAlertPolicyAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTargetAlertPolicyAssociationResponse>
                transformer =
                        UpdateTargetAlertPolicyAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetAlertPolicyAssociationRequest,
                        UpdateTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetAlertPolicyAssociationRequest,
                                UpdateTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetAlertPolicyAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetAlertPolicyAssociationRequest,
                    UpdateTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/UpdateTargetDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTargetDatabaseResponse>
                transformer =
                        UpdateTargetDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UpdateUserAssessment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateUserAssessmentResponse>
                transformer =
                        UpdateUserAssessmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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

    @Override
    public java.util.concurrent.Future<UploadMaskingPolicyResponse> uploadMaskingPolicy(
            UploadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async uploadMaskingPolicy");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadMaskingPolicyRequest.builder());
        }
        final UploadMaskingPolicyRequest interceptedRequest =
                UploadMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UploadMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UploadMaskingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, UploadMaskingPolicyResponse>
                transformer =
                        UploadMaskingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>,
                        java.util.concurrent.Future<UploadMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadMaskingPolicyDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadSensitiveDataModelResponse> uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async uploadSensitiveDataModel");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadSensitiveDataModelRequest.builder());
        }
        final UploadSensitiveDataModelRequest interceptedRequest =
                UploadSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UploadSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UploadSensitiveDataModel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UploadSensitiveDataModelResponse>
                transformer =
                        UploadSensitiveDataModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>,
                        java.util.concurrent.Future<UploadSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadSensitiveDataModelDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
