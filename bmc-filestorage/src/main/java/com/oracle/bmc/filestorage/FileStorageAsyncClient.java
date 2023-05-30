/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.internal.http.*;
import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Async client implementation for FileStorage service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class FileStorageAsyncClient implements FileStorageAsync {
    /**
     * Service instance for FileStorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FILESTORAGE")
                    .serviceEndpointPrefix("filestorage")
                    .serviceEndpointTemplate("https://filestorage.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FileStorageAsyncClient.class);

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
    public FileStorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
    public FileStorageAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, FileStorageAsyncClient> {
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
        public FileStorageAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new FileStorageAsyncClient(
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
    public java.util.concurrent.Future<ChangeFileSystemCompartmentResponse>
            changeFileSystemCompartment(
                    ChangeFileSystemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFileSystemCompartmentRequest,
                                    ChangeFileSystemCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFileSystemCompartment");
        final ChangeFileSystemCompartmentRequest interceptedRequest =
                ChangeFileSystemCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFileSystemCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ChangeFileSystemCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/ChangeFileSystemCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFileSystemCompartmentResponse>
                transformer =
                        ChangeFileSystemCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFileSystemCompartmentRequest, ChangeFileSystemCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFileSystemCompartmentRequest,
                                ChangeFileSystemCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFileSystemCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFileSystemCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFileSystemCompartmentRequest, ChangeFileSystemCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeFilesystemSnapshotPolicyCompartmentResponse>
            changeFilesystemSnapshotPolicyCompartment(
                    ChangeFilesystemSnapshotPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFilesystemSnapshotPolicyCompartmentRequest,
                                    ChangeFilesystemSnapshotPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFilesystemSnapshotPolicyCompartment");
        final ChangeFilesystemSnapshotPolicyCompartmentRequest interceptedRequest =
                ChangeFilesystemSnapshotPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFilesystemSnapshotPolicyCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ChangeFilesystemSnapshotPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/ChangeFilesystemSnapshotPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeFilesystemSnapshotPolicyCompartmentResponse>
                transformer =
                        ChangeFilesystemSnapshotPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFilesystemSnapshotPolicyCompartmentRequest,
                        ChangeFilesystemSnapshotPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFilesystemSnapshotPolicyCompartmentRequest,
                                ChangeFilesystemSnapshotPolicyCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeFilesystemSnapshotPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeFilesystemSnapshotPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFilesystemSnapshotPolicyCompartmentRequest,
                    ChangeFilesystemSnapshotPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMountTargetCompartmentResponse>
            changeMountTargetCompartment(
                    ChangeMountTargetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMountTargetCompartmentRequest,
                                    ChangeMountTargetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMountTargetCompartment");
        final ChangeMountTargetCompartmentRequest interceptedRequest =
                ChangeMountTargetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMountTargetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ChangeMountTargetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/ChangeMountTargetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMountTargetCompartmentResponse>
                transformer =
                        ChangeMountTargetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMountTargetCompartmentRequest, ChangeMountTargetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMountTargetCompartmentRequest,
                                ChangeMountTargetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMountTargetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMountTargetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMountTargetCompartmentRequest, ChangeMountTargetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeReplicationCompartmentResponse>
            changeReplicationCompartment(
                    ChangeReplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReplicationCompartmentRequest,
                                    ChangeReplicationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeReplicationCompartment");
        final ChangeReplicationCompartmentRequest interceptedRequest =
                ChangeReplicationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReplicationCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ChangeReplicationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/ChangeReplicationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeReplicationCompartmentResponse>
                transformer =
                        ChangeReplicationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeReplicationCompartmentRequest, ChangeReplicationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeReplicationCompartmentRequest,
                                ChangeReplicationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeReplicationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeReplicationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeReplicationCompartmentRequest, ChangeReplicationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExportResponse> createExport(
            CreateExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateExportRequest, CreateExportResponse>
                    handler) {
        LOG.trace("Called async createExport");
        final CreateExportRequest interceptedRequest =
                CreateExportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateExport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/CreateExport");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateExportResponse>
                transformer =
                        CreateExportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateExportRequest, CreateExportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExportRequest, CreateExportResponse>,
                        java.util.concurrent.Future<CreateExportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExportRequest, CreateExportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResponse> createFileSystem(
            CreateFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFileSystemRequest, CreateFileSystemResponse>
                    handler) {
        LOG.trace("Called async createFileSystem");
        final CreateFileSystemRequest interceptedRequest =
                CreateFileSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFileSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateFileSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/CreateFileSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFileSystemResponse>
                transformer =
                        CreateFileSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFileSystemRequest, CreateFileSystemResponse>,
                        java.util.concurrent.Future<CreateFileSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFileSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFileSystemRequest, CreateFileSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFilesystemSnapshotPolicyResponse>
            createFilesystemSnapshotPolicy(
                    CreateFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateFilesystemSnapshotPolicyRequest,
                                    CreateFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async createFilesystemSnapshotPolicy");
        final CreateFilesystemSnapshotPolicyRequest interceptedRequest =
                CreateFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/CreateFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateFilesystemSnapshotPolicyResponse>
                transformer =
                        CreateFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFilesystemSnapshotPolicyRequest,
                        CreateFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFilesystemSnapshotPolicyRequest,
                                CreateFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<CreateFilesystemSnapshotPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFilesystemSnapshotPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFilesystemSnapshotPolicyRequest, CreateFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResponse> createMountTarget(
            CreateMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMountTargetRequest, CreateMountTargetResponse>
                    handler) {
        LOG.trace("Called async createMountTarget");
        final CreateMountTargetRequest interceptedRequest =
                CreateMountTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMountTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateMountTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/CreateMountTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMountTargetResponse>
                transformer =
                        CreateMountTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMountTargetRequest, CreateMountTargetResponse>,
                        java.util.concurrent.Future<CreateMountTargetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMountTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMountTargetRequest, CreateMountTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationResponse> createReplication(
            CreateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationRequest, CreateReplicationResponse>
                    handler) {
        LOG.trace("Called async createReplication");
        final CreateReplicationRequest interceptedRequest =
                CreateReplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateReplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/CreateReplication");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateReplicationResponse>
                transformer =
                        CreateReplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateReplicationRequest, CreateReplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateReplicationRequest, CreateReplicationResponse>,
                        java.util.concurrent.Future<CreateReplicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateReplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateReplicationRequest, CreateReplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResponse> createSnapshot(
            CreateSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSnapshotRequest, CreateSnapshotResponse>
                    handler) {
        LOG.trace("Called async createSnapshot");
        final CreateSnapshotRequest interceptedRequest =
                CreateSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSnapshotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "CreateSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/CreateSnapshot");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSnapshotResponse>
                transformer =
                        CreateSnapshotConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSnapshotRequest, CreateSnapshotResponse>,
                        java.util.concurrent.Future<CreateSnapshotResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSnapshotDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSnapshotRequest, CreateSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResponse> deleteExport(
            DeleteExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteExportRequest, DeleteExportResponse>
                    handler) {
        LOG.trace("Called async deleteExport");
        final DeleteExportRequest interceptedRequest =
                DeleteExportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteExport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/DeleteExport");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExportResponse>
                transformer =
                        DeleteExportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteExportRequest, DeleteExportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExportRequest, DeleteExportResponse>,
                        java.util.concurrent.Future<DeleteExportResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExportRequest, DeleteExportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResponse> deleteFileSystem(
            DeleteFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFileSystemRequest, DeleteFileSystemResponse>
                    handler) {
        LOG.trace("Called async deleteFileSystem");
        final DeleteFileSystemRequest interceptedRequest =
                DeleteFileSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFileSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteFileSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/DeleteFileSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFileSystemResponse>
                transformer =
                        DeleteFileSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFileSystemRequest, DeleteFileSystemResponse>,
                        java.util.concurrent.Future<DeleteFileSystemResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFileSystemRequest, DeleteFileSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFilesystemSnapshotPolicyResponse>
            deleteFilesystemSnapshotPolicy(
                    DeleteFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFilesystemSnapshotPolicyRequest,
                                    DeleteFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async deleteFilesystemSnapshotPolicy");
        final DeleteFilesystemSnapshotPolicyRequest interceptedRequest =
                DeleteFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/DeleteFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteFilesystemSnapshotPolicyResponse>
                transformer =
                        DeleteFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFilesystemSnapshotPolicyRequest,
                        DeleteFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFilesystemSnapshotPolicyRequest,
                                DeleteFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<DeleteFilesystemSnapshotPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFilesystemSnapshotPolicyRequest, DeleteFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMountTargetResponse> deleteMountTarget(
            DeleteMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMountTargetRequest, DeleteMountTargetResponse>
                    handler) {
        LOG.trace("Called async deleteMountTarget");
        final DeleteMountTargetRequest interceptedRequest =
                DeleteMountTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMountTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteMountTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/DeleteMountTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMountTargetResponse>
                transformer =
                        DeleteMountTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMountTargetRequest, DeleteMountTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMountTargetRequest, DeleteMountTargetResponse>,
                        java.util.concurrent.Future<DeleteMountTargetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMountTargetRequest, DeleteMountTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationResponse> deleteReplication(
            DeleteReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationRequest, DeleteReplicationResponse>
                    handler) {
        LOG.trace("Called async deleteReplication");
        final DeleteReplicationRequest interceptedRequest =
                DeleteReplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteReplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/DeleteReplication");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteReplicationResponse>
                transformer =
                        DeleteReplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteReplicationRequest, DeleteReplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReplicationRequest, DeleteReplicationResponse>,
                        java.util.concurrent.Future<DeleteReplicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReplicationRequest, DeleteReplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTargetResponse> deleteReplicationTarget(
            DeleteReplicationTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>
                    handler) {
        LOG.trace("Called async deleteReplicationTarget");
        final DeleteReplicationTargetRequest interceptedRequest =
                DeleteReplicationTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReplicationTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteReplicationTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTarget/DeleteReplicationTarget");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteReplicationTargetResponse>
                transformer =
                        DeleteReplicationTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>,
                        java.util.concurrent.Future<DeleteReplicationTargetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResponse> deleteSnapshot(
            DeleteSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSnapshotRequest, DeleteSnapshotResponse>
                    handler) {
        LOG.trace("Called async deleteSnapshot");
        final DeleteSnapshotRequest interceptedRequest =
                DeleteSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSnapshotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "DeleteSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/DeleteSnapshot");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSnapshotResponse>
                transformer =
                        DeleteSnapshotConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSnapshotRequest, DeleteSnapshotResponse>,
                        java.util.concurrent.Future<DeleteSnapshotResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSnapshotRequest, DeleteSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EstimateReplicationResponse> estimateReplication(
            EstimateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateReplicationRequest, EstimateReplicationResponse>
                    handler) {
        LOG.trace("Called async estimateReplication");
        final EstimateReplicationRequest interceptedRequest =
                EstimateReplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimateReplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "EstimateReplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/EstimateReplication");
        final java.util.function.Function<javax.ws.rs.core.Response, EstimateReplicationResponse>
                transformer =
                        EstimateReplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EstimateReplicationRequest, EstimateReplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EstimateReplicationRequest, EstimateReplicationResponse>,
                        java.util.concurrent.Future<EstimateReplicationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EstimateReplicationRequest, EstimateReplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExportResponse> getExport(
            GetExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse>
                    handler) {
        LOG.trace("Called async getExport");
        final GetExportRequest interceptedRequest = GetExportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetExport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/GetExport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExportResponse>
                transformer =
                        GetExportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse>,
                        java.util.concurrent.Future<GetExportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExportRequest, GetExportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExportSetResponse> getExportSet(
            GetExportSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExportSetRequest, GetExportSetResponse>
                    handler) {
        LOG.trace("Called async getExportSet");
        final GetExportSetRequest interceptedRequest =
                GetExportSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExportSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetExportSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSet/GetExportSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExportSetResponse>
                transformer =
                        GetExportSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExportSetRequest, GetExportSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExportSetRequest, GetExportSetResponse>,
                        java.util.concurrent.Future<GetExportSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExportSetRequest, GetExportSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFileSystemResponse> getFileSystem(
            GetFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFileSystemRequest, GetFileSystemResponse>
                    handler) {
        LOG.trace("Called async getFileSystem");
        final GetFileSystemRequest interceptedRequest =
                GetFileSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFileSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetFileSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/GetFileSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFileSystemResponse>
                transformer =
                        GetFileSystemConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFileSystemRequest, GetFileSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFileSystemRequest, GetFileSystemResponse>,
                        java.util.concurrent.Future<GetFileSystemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFileSystemRequest, GetFileSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFilesystemSnapshotPolicyResponse>
            getFilesystemSnapshotPolicy(
                    GetFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFilesystemSnapshotPolicyRequest,
                                    GetFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async getFilesystemSnapshotPolicy");
        final GetFilesystemSnapshotPolicyRequest interceptedRequest =
                GetFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/GetFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFilesystemSnapshotPolicyResponse>
                transformer =
                        GetFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFilesystemSnapshotPolicyRequest, GetFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFilesystemSnapshotPolicyRequest,
                                GetFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<GetFilesystemSnapshotPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFilesystemSnapshotPolicyRequest, GetFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMountTargetResponse> getMountTarget(
            GetMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMountTargetRequest, GetMountTargetResponse>
                    handler) {
        LOG.trace("Called async getMountTarget");
        final GetMountTargetRequest interceptedRequest =
                GetMountTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMountTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetMountTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/GetMountTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMountTargetResponse>
                transformer =
                        GetMountTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMountTargetRequest, GetMountTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMountTargetRequest, GetMountTargetResponse>,
                        java.util.concurrent.Future<GetMountTargetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMountTargetRequest, GetMountTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReplicationResponse> getReplication(
            GetReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationRequest, GetReplicationResponse>
                    handler) {
        LOG.trace("Called async getReplication");
        final GetReplicationRequest interceptedRequest =
                GetReplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetReplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/GetReplication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReplicationResponse>
                transformer =
                        GetReplicationConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetReplicationRequest, GetReplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReplicationRequest, GetReplicationResponse>,
                        java.util.concurrent.Future<GetReplicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReplicationRequest, GetReplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReplicationTargetResponse> getReplicationTarget(
            GetReplicationTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationTargetRequest, GetReplicationTargetResponse>
                    handler) {
        LOG.trace("Called async getReplicationTarget");
        final GetReplicationTargetRequest interceptedRequest =
                GetReplicationTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReplicationTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetReplicationTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTarget/GetReplicationTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReplicationTargetResponse>
                transformer =
                        GetReplicationTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetReplicationTargetRequest, GetReplicationTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReplicationTargetRequest, GetReplicationTargetResponse>,
                        java.util.concurrent.Future<GetReplicationTargetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReplicationTargetRequest, GetReplicationTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotResponse> getSnapshot(
            GetSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSnapshotRequest, GetSnapshotResponse>
                    handler) {
        LOG.trace("Called async getSnapshot");
        final GetSnapshotRequest interceptedRequest =
                GetSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSnapshotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "GetSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/GetSnapshot");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSnapshotResponse>
                transformer =
                        GetSnapshotConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSnapshotRequest, GetSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSnapshotRequest, GetSnapshotResponse>,
                        java.util.concurrent.Future<GetSnapshotResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSnapshotRequest, GetSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExportSetsResponse> listExportSets(
            ListExportSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExportSetsRequest, ListExportSetsResponse>
                    handler) {
        LOG.trace("Called async listExportSets");
        final ListExportSetsRequest interceptedRequest =
                ListExportSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExportSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListExportSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSetSummary/ListExportSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExportSetsResponse>
                transformer =
                        ListExportSetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListExportSetsRequest, ListExportSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExportSetsRequest, ListExportSetsResponse>,
                        java.util.concurrent.Future<ListExportSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExportSetsRequest, ListExportSetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExportsResponse> listExports(
            ListExportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListExportsRequest, ListExportsResponse>
                    handler) {
        LOG.trace("Called async listExports");
        final ListExportsRequest interceptedRequest =
                ListExportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListExports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSummary/ListExports");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExportsResponse>
                transformer =
                        ListExportsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListExportsRequest, ListExportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExportsRequest, ListExportsResponse>,
                        java.util.concurrent.Future<ListExportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExportsRequest, ListExportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFileSystemsResponse> listFileSystems(
            ListFileSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFileSystemsRequest, ListFileSystemsResponse>
                    handler) {
        LOG.trace("Called async listFileSystems");
        final ListFileSystemsRequest interceptedRequest =
                ListFileSystemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFileSystemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListFileSystems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystemSummary/ListFileSystems");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFileSystemsResponse>
                transformer =
                        ListFileSystemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFileSystemsRequest, ListFileSystemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFileSystemsRequest, ListFileSystemsResponse>,
                        java.util.concurrent.Future<ListFileSystemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFileSystemsRequest, ListFileSystemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFilesystemSnapshotPoliciesResponse>
            listFilesystemSnapshotPolicies(
                    ListFilesystemSnapshotPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFilesystemSnapshotPoliciesRequest,
                                    ListFilesystemSnapshotPoliciesResponse>
                            handler) {
        LOG.trace("Called async listFilesystemSnapshotPolicies");
        final ListFilesystemSnapshotPoliciesRequest interceptedRequest =
                ListFilesystemSnapshotPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFilesystemSnapshotPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListFilesystemSnapshotPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicySummary/ListFilesystemSnapshotPolicies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFilesystemSnapshotPoliciesResponse>
                transformer =
                        ListFilesystemSnapshotPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFilesystemSnapshotPoliciesRequest,
                        ListFilesystemSnapshotPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFilesystemSnapshotPoliciesRequest,
                                ListFilesystemSnapshotPoliciesResponse>,
                        java.util.concurrent.Future<ListFilesystemSnapshotPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFilesystemSnapshotPoliciesRequest, ListFilesystemSnapshotPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMountTargetsResponse> listMountTargets(
            ListMountTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMountTargetsRequest, ListMountTargetsResponse>
                    handler) {
        LOG.trace("Called async listMountTargets");
        final ListMountTargetsRequest interceptedRequest =
                ListMountTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMountTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListMountTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTargetSummary/ListMountTargets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMountTargetsResponse>
                transformer =
                        ListMountTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMountTargetsRequest, ListMountTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMountTargetsRequest, ListMountTargetsResponse>,
                        java.util.concurrent.Future<ListMountTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMountTargetsRequest, ListMountTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReplicationTargetsResponse> listReplicationTargets(
            ListReplicationTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationTargetsRequest, ListReplicationTargetsResponse>
                    handler) {
        LOG.trace("Called async listReplicationTargets");
        final ListReplicationTargetsRequest interceptedRequest =
                ListReplicationTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReplicationTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListReplicationTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationTargetSummary/ListReplicationTargets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListReplicationTargetsResponse>
                transformer =
                        ListReplicationTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListReplicationTargetsRequest, ListReplicationTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReplicationTargetsRequest, ListReplicationTargetsResponse>,
                        java.util.concurrent.Future<ListReplicationTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReplicationTargetsRequest, ListReplicationTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReplicationsResponse> listReplications(
            ListReplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationsRequest, ListReplicationsResponse>
                    handler) {
        LOG.trace("Called async listReplications");
        final ListReplicationsRequest interceptedRequest =
                ListReplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListReplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ReplicationSummary/ListReplications");
        final java.util.function.Function<javax.ws.rs.core.Response, ListReplicationsResponse>
                transformer =
                        ListReplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListReplicationsRequest, ListReplicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReplicationsRequest, ListReplicationsResponse>,
                        java.util.concurrent.Future<ListReplicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReplicationsRequest, ListReplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotsResponse> listSnapshots(
            ListSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResponse>
                    handler) {
        LOG.trace("Called async listSnapshots");
        final ListSnapshotsRequest interceptedRequest =
                ListSnapshotsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSnapshotsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "ListSnapshots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/SnapshotSummary/ListSnapshots");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSnapshotsResponse>
                transformer =
                        ListSnapshotsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSnapshotsRequest, ListSnapshotsResponse>,
                        java.util.concurrent.Future<ListSnapshotsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSnapshotsRequest, ListSnapshotsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PauseFilesystemSnapshotPolicyResponse>
            pauseFilesystemSnapshotPolicy(
                    PauseFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PauseFilesystemSnapshotPolicyRequest,
                                    PauseFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async pauseFilesystemSnapshotPolicy");
        final PauseFilesystemSnapshotPolicyRequest interceptedRequest =
                PauseFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PauseFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "PauseFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/PauseFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PauseFilesystemSnapshotPolicyResponse>
                transformer =
                        PauseFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PauseFilesystemSnapshotPolicyRequest, PauseFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PauseFilesystemSnapshotPolicyRequest,
                                PauseFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<PauseFilesystemSnapshotPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PauseFilesystemSnapshotPolicyRequest, PauseFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnpauseFilesystemSnapshotPolicyResponse>
            unpauseFilesystemSnapshotPolicy(
                    UnpauseFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnpauseFilesystemSnapshotPolicyRequest,
                                    UnpauseFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async unpauseFilesystemSnapshotPolicy");
        final UnpauseFilesystemSnapshotPolicyRequest interceptedRequest =
                UnpauseFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnpauseFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UnpauseFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/UnpauseFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UnpauseFilesystemSnapshotPolicyResponse>
                transformer =
                        UnpauseFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UnpauseFilesystemSnapshotPolicyRequest,
                        UnpauseFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnpauseFilesystemSnapshotPolicyRequest,
                                UnpauseFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<UnpauseFilesystemSnapshotPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnpauseFilesystemSnapshotPolicyRequest,
                    UnpauseFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExportResponse> updateExport(
            UpdateExportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateExportRequest, UpdateExportResponse>
                    handler) {
        LOG.trace("Called async updateExport");
        final UpdateExportRequest interceptedRequest =
                UpdateExportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateExport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Export/UpdateExport");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExportResponse>
                transformer =
                        UpdateExportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateExportRequest, UpdateExportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExportRequest, UpdateExportResponse>,
                        java.util.concurrent.Future<UpdateExportResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExportRequest, UpdateExportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExportSetResponse> updateExportSet(
            UpdateExportSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportSetRequest, UpdateExportSetResponse>
                    handler) {
        LOG.trace("Called async updateExportSet");
        final UpdateExportSetRequest interceptedRequest =
                UpdateExportSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExportSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateExportSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/ExportSet/UpdateExportSet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExportSetResponse>
                transformer =
                        UpdateExportSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateExportSetRequest, UpdateExportSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExportSetRequest, UpdateExportSetResponse>,
                        java.util.concurrent.Future<UpdateExportSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExportSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExportSetRequest, UpdateExportSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResponse> updateFileSystem(
            UpdateFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFileSystemRequest, UpdateFileSystemResponse>
                    handler) {
        LOG.trace("Called async updateFileSystem");
        final UpdateFileSystemRequest interceptedRequest =
                UpdateFileSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFileSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateFileSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FileSystem/UpdateFileSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFileSystemResponse>
                transformer =
                        UpdateFileSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFileSystemRequest, UpdateFileSystemResponse>,
                        java.util.concurrent.Future<UpdateFileSystemResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFileSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFileSystemRequest, UpdateFileSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFilesystemSnapshotPolicyResponse>
            updateFilesystemSnapshotPolicy(
                    UpdateFilesystemSnapshotPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFilesystemSnapshotPolicyRequest,
                                    UpdateFilesystemSnapshotPolicyResponse>
                            handler) {
        LOG.trace("Called async updateFilesystemSnapshotPolicy");
        final UpdateFilesystemSnapshotPolicyRequest interceptedRequest =
                UpdateFilesystemSnapshotPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFilesystemSnapshotPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateFilesystemSnapshotPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/FilesystemSnapshotPolicy/UpdateFilesystemSnapshotPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateFilesystemSnapshotPolicyResponse>
                transformer =
                        UpdateFilesystemSnapshotPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFilesystemSnapshotPolicyRequest,
                        UpdateFilesystemSnapshotPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFilesystemSnapshotPolicyRequest,
                                UpdateFilesystemSnapshotPolicyResponse>,
                        java.util.concurrent.Future<UpdateFilesystemSnapshotPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFilesystemSnapshotPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFilesystemSnapshotPolicyRequest, UpdateFilesystemSnapshotPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMountTargetResponse> updateMountTarget(
            UpdateMountTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMountTargetRequest, UpdateMountTargetResponse>
                    handler) {
        LOG.trace("Called async updateMountTarget");
        final UpdateMountTargetRequest interceptedRequest =
                UpdateMountTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMountTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateMountTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/MountTarget/UpdateMountTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMountTargetResponse>
                transformer =
                        UpdateMountTargetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateMountTargetRequest, UpdateMountTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMountTargetRequest, UpdateMountTargetResponse>,
                        java.util.concurrent.Future<UpdateMountTargetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMountTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMountTargetRequest, UpdateMountTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationResponse> updateReplication(
            UpdateReplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReplicationRequest, UpdateReplicationResponse>
                    handler) {
        LOG.trace("Called async updateReplication");
        final UpdateReplicationRequest interceptedRequest =
                UpdateReplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateReplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Replication/UpdateReplication");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateReplicationResponse>
                transformer =
                        UpdateReplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateReplicationRequest, UpdateReplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateReplicationRequest, UpdateReplicationResponse>,
                        java.util.concurrent.Future<UpdateReplicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateReplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateReplicationRequest, UpdateReplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResponse> updateSnapshot(
            UpdateSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSnapshotRequest, UpdateSnapshotResponse>
                    handler) {
        LOG.trace("Called async updateSnapshot");
        final UpdateSnapshotRequest interceptedRequest =
                UpdateSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSnapshotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FileStorage",
                        "UpdateSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/filestorage/20171215/Snapshot/UpdateSnapshot");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSnapshotResponse>
                transformer =
                        UpdateSnapshotConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSnapshotRequest, UpdateSnapshotResponse>,
                        java.util.concurrent.Future<UpdateSnapshotResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSnapshotDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSnapshotRequest, UpdateSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
