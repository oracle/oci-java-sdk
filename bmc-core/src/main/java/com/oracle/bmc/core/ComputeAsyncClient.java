/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for Compute service. <br/>
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
@lombok.extern.slf4j.Slf4j
public class ComputeAsyncClient implements ComputeAsync {
    /**
     * Service instance for Compute.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTE")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
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
    public ComputeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
    public ComputeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputeAsyncClient> {
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
        public ComputeAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new ComputeAsyncClient(
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
    public java.util.concurrent.Future<AcceptShieldedIntegrityPolicyResponse>
            acceptShieldedIntegrityPolicy(
                    AcceptShieldedIntegrityPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AcceptShieldedIntegrityPolicyRequest,
                                    AcceptShieldedIntegrityPolicyResponse>
                            handler) {
        LOG.trace("Called async acceptShieldedIntegrityPolicy");
        final AcceptShieldedIntegrityPolicyRequest interceptedRequest =
                AcceptShieldedIntegrityPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AcceptShieldedIntegrityPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AcceptShieldedIntegrityPolicyResponse>
                transformer = AcceptShieldedIntegrityPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "AcceptShieldedIntegrityPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/AcceptShieldedIntegrityPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        AcceptShieldedIntegrityPolicyRequest, AcceptShieldedIntegrityPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AcceptShieldedIntegrityPolicyRequest,
                                AcceptShieldedIntegrityPolicyResponse>,
                        java.util.concurrent.Future<AcceptShieldedIntegrityPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AcceptShieldedIntegrityPolicyRequest, AcceptShieldedIntegrityPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>
            addImageShapeCompatibilityEntry(
                    AddImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddImageShapeCompatibilityEntryRequest,
                                    AddImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async addImageShapeCompatibilityEntry");
        final AddImageShapeCompatibilityEntryRequest interceptedRequest =
                AddImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddImageShapeCompatibilityEntryResponse>
                transformer = AddImageShapeCompatibilityEntryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "AddImageShapeCompatibilityEntry",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/AddImageShapeCompatibilityEntry");

        com.oracle.bmc.responses.AsyncHandler<
                        AddImageShapeCompatibilityEntryRequest,
                        AddImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddImageShapeCompatibilityEntryRequest,
                                AddImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddImageShapeCompatibilityEntryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddImageShapeCompatibilityEntryRequest,
                    AddImageShapeCompatibilityEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachBootVolumeResponse> attachBootVolume(
            AttachBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AttachBootVolumeRequest, AttachBootVolumeResponse>
                    handler) {
        LOG.trace("Called async attachBootVolume");
        final AttachBootVolumeRequest interceptedRequest =
                AttachBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AttachBootVolumeResponse>
                transformer = AttachBootVolumeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "AttachBootVolume",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/AttachBootVolume");

        com.oracle.bmc.responses.AsyncHandler<AttachBootVolumeRequest, AttachBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachBootVolumeRequest, AttachBootVolumeResponse>,
                        java.util.concurrent.Future<AttachBootVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachBootVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachBootVolumeRequest, AttachBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachVnicResponse> attachVnic(
            AttachVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse>
                    handler) {
        LOG.trace("Called async attachVnic");
        final AttachVnicRequest interceptedRequest = AttachVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVnicConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AttachVnicResponse>
                transformer = AttachVnicConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "AttachVnic",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/AttachVnic");

        com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachVnicRequest, AttachVnicResponse>,
                        java.util.concurrent.Future<AttachVnicResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachVnicDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachVnicRequest, AttachVnicResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                    handler) {
        LOG.trace("Called async attachVolume");
        final AttachVolumeRequest interceptedRequest =
                AttachVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AttachVolumeResponse>
                transformer = AttachVolumeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "AttachVolume",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/AttachVolume");

        com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachVolumeRequest, AttachVolumeResponse>,
                        java.util.concurrent.Future<AttachVolumeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachVolumeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachVolumeRequest, AttachVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async captureConsoleHistory");
        final CaptureConsoleHistoryRequest interceptedRequest =
                CaptureConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CaptureConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CaptureConsoleHistoryResponse>
                transformer = CaptureConsoleHistoryConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CaptureConsoleHistory",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/CaptureConsoleHistory");

        com.oracle.bmc.responses.AsyncHandler<
                        CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>,
                        java.util.concurrent.Future<CaptureConsoleHistoryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCaptureConsoleHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeComputeCapacityReservationCompartmentResponse>
            changeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeCapacityReservationCompartmentRequest,
                                    ChangeComputeCapacityReservationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeCapacityReservationCompartment");
        final ChangeComputeCapacityReservationCompartmentRequest interceptedRequest =
                ChangeComputeCapacityReservationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeCapacityReservationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeComputeCapacityReservationCompartmentResponse>
                transformer = ChangeComputeCapacityReservationCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ChangeComputeCapacityReservationCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ChangeComputeCapacityReservationCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeCapacityReservationCompartmentRequest,
                        ChangeComputeCapacityReservationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeCapacityReservationCompartmentRequest,
                                ChangeComputeCapacityReservationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeCapacityReservationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeCapacityReservationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeCapacityReservationCompartmentRequest,
                    ChangeComputeCapacityReservationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeComputeImageCapabilitySchemaCompartmentResponse>
            changeComputeImageCapabilitySchemaCompartment(
                    ChangeComputeImageCapabilitySchemaCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                                    ChangeComputeImageCapabilitySchemaCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeComputeImageCapabilitySchemaCompartment");
        final ChangeComputeImageCapabilitySchemaCompartmentRequest interceptedRequest =
                ChangeComputeImageCapabilitySchemaCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeComputeImageCapabilitySchemaCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeComputeImageCapabilitySchemaCompartmentResponse>
                transformer = ChangeComputeImageCapabilitySchemaCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ChangeComputeImageCapabilitySchemaCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/ChangeComputeImageCapabilitySchemaCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeComputeImageCapabilitySchemaCompartmentRequest,
                        ChangeComputeImageCapabilitySchemaCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeComputeImageCapabilitySchemaCompartmentRequest,
                                ChangeComputeImageCapabilitySchemaCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeComputeImageCapabilitySchemaCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeComputeImageCapabilitySchemaCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                    ChangeComputeImageCapabilitySchemaCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>
            changeDedicatedVmHostCompartment(
                    ChangeDedicatedVmHostCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedVmHostCompartmentRequest,
                                    ChangeDedicatedVmHostCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDedicatedVmHostCompartment");
        final ChangeDedicatedVmHostCompartmentRequest interceptedRequest =
                ChangeDedicatedVmHostCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDedicatedVmHostCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDedicatedVmHostCompartmentResponse>
                transformer = ChangeDedicatedVmHostCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ChangeDedicatedVmHostCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/ChangeDedicatedVmHostCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDedicatedVmHostCompartmentRequest,
                        ChangeDedicatedVmHostCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDedicatedVmHostCompartmentRequest,
                                ChangeDedicatedVmHostCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDedicatedVmHostCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDedicatedVmHostCompartmentRequest,
                    ChangeDedicatedVmHostCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeImageCompartmentResponse> changeImageCompartment(
            ChangeImageCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeImageCompartment");
        final ChangeImageCompartmentRequest interceptedRequest =
                ChangeImageCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeImageCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeImageCompartmentResponse>
                transformer = ChangeImageCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ChangeImageCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ChangeImageCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>,
                        java.util.concurrent.Future<ChangeImageCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeImageCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeInstanceCompartmentResponse> changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeInstanceCompartment");
        final ChangeInstanceCompartmentRequest interceptedRequest =
                ChangeInstanceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstanceCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeInstanceCompartmentResponse>
                transformer = ChangeInstanceCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ChangeInstanceCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ChangeInstanceCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstanceCompartmentRequest,
                                ChangeInstanceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstanceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeInstanceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse>
            createAppCatalogSubscription(
                    CreateAppCatalogSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAppCatalogSubscriptionRequest,
                                    CreateAppCatalogSubscriptionResponse>
                            handler) {
        LOG.trace("Called async createAppCatalogSubscription");
        final CreateAppCatalogSubscriptionRequest interceptedRequest =
                CreateAppCatalogSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppCatalogSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAppCatalogSubscriptionResponse>
                transformer = CreateAppCatalogSubscriptionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CreateAppCatalogSubscription",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscription/CreateAppCatalogSubscription");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAppCatalogSubscriptionRequest, CreateAppCatalogSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAppCatalogSubscriptionRequest,
                                CreateAppCatalogSubscriptionResponse>,
                        java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAppCatalogSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAppCatalogSubscriptionRequest, CreateAppCatalogSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateComputeCapacityReservationResponse>
            createComputeCapacityReservation(
                    CreateComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityReservationRequest,
                                    CreateComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async createComputeCapacityReservation");
        final CreateComputeCapacityReservationRequest interceptedRequest =
                CreateComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateComputeCapacityReservationResponse>
                transformer = CreateComputeCapacityReservationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute", "CreateComputeCapacityReservation", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeCapacityReservationRequest,
                        CreateComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeCapacityReservationRequest,
                                CreateComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<CreateComputeCapacityReservationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeCapacityReservationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeCapacityReservationRequest,
                    CreateComputeCapacityReservationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateComputeImageCapabilitySchemaResponse>
            createComputeImageCapabilitySchema(
                    CreateComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeImageCapabilitySchemaRequest,
                                    CreateComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async createComputeImageCapabilitySchema");
        final CreateComputeImageCapabilitySchemaRequest interceptedRequest =
                CreateComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateComputeImageCapabilitySchemaResponse>
                transformer = CreateComputeImageCapabilitySchemaConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CreateComputeImageCapabilitySchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/CreateComputeImageCapabilitySchema");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateComputeImageCapabilitySchemaRequest,
                        CreateComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateComputeImageCapabilitySchemaRequest,
                                CreateComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<CreateComputeImageCapabilitySchemaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateComputeImageCapabilitySchemaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateComputeImageCapabilitySchemaRequest,
                    CreateComputeImageCapabilitySchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDedicatedVmHostResponse> createDedicatedVmHost(
            CreateDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async createDedicatedVmHost");
        final CreateDedicatedVmHostRequest interceptedRequest =
                CreateDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDedicatedVmHostResponse>
                transformer = CreateDedicatedVmHostConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CreateDedicatedVmHost",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/CreateDedicatedVmHost");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>,
                        java.util.concurrent.Future<CreateDedicatedVmHostResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDedicatedVmHostDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse>
                    handler) {
        LOG.trace("Called async createImage");
        final CreateImageRequest interceptedRequest =
                CreateImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateImageResponse>
                transformer = CreateImageConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CreateImage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/CreateImage");

        com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateImageRequest, CreateImageResponse>,
                        java.util.concurrent.Future<CreateImageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateImageRequest, CreateImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>
            createInstanceConsoleConnection(
                    CreateInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConsoleConnectionRequest,
                                    CreateInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async createInstanceConsoleConnection");
        final CreateInstanceConsoleConnectionRequest interceptedRequest =
                CreateInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateInstanceConsoleConnectionResponse>
                transformer = CreateInstanceConsoleConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "CreateInstanceConsoleConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/CreateInstanceConsoleConnection");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateInstanceConsoleConnectionRequest,
                        CreateInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstanceConsoleConnectionRequest,
                                CreateInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateInstanceConsoleConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstanceConsoleConnectionRequest,
                    CreateInstanceConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse>
            deleteAppCatalogSubscription(
                    DeleteAppCatalogSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAppCatalogSubscriptionRequest,
                                    DeleteAppCatalogSubscriptionResponse>
                            handler) {
        LOG.trace("Called async deleteAppCatalogSubscription");
        final DeleteAppCatalogSubscriptionRequest interceptedRequest =
                DeleteAppCatalogSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppCatalogSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAppCatalogSubscriptionResponse>
                transformer = DeleteAppCatalogSubscriptionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute", "DeleteAppCatalogSubscription", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAppCatalogSubscriptionRequest, DeleteAppCatalogSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAppCatalogSubscriptionRequest,
                                DeleteAppCatalogSubscriptionResponse>,
                        java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAppCatalogSubscriptionRequest, DeleteAppCatalogSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeCapacityReservationResponse>
            deleteComputeCapacityReservation(
                    DeleteComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeCapacityReservationRequest,
                                    DeleteComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async deleteComputeCapacityReservation");
        final DeleteComputeCapacityReservationRequest interceptedRequest =
                DeleteComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteComputeCapacityReservationResponse>
                transformer = DeleteComputeCapacityReservationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DeleteComputeCapacityReservation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/DeleteComputeCapacityReservation");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeCapacityReservationRequest,
                        DeleteComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeCapacityReservationRequest,
                                DeleteComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<DeleteComputeCapacityReservationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeCapacityReservationRequest,
                    DeleteComputeCapacityReservationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeImageCapabilitySchemaResponse>
            deleteComputeImageCapabilitySchema(
                    DeleteComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeImageCapabilitySchemaRequest,
                                    DeleteComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async deleteComputeImageCapabilitySchema");
        final DeleteComputeImageCapabilitySchemaRequest interceptedRequest =
                DeleteComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteComputeImageCapabilitySchemaResponse>
                transformer = DeleteComputeImageCapabilitySchemaConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DeleteComputeImageCapabilitySchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/DeleteComputeImageCapabilitySchema");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteComputeImageCapabilitySchemaRequest,
                        DeleteComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteComputeImageCapabilitySchemaRequest,
                                DeleteComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<DeleteComputeImageCapabilitySchemaResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteComputeImageCapabilitySchemaRequest,
                    DeleteComputeImageCapabilitySchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async deleteConsoleHistory");
        final DeleteConsoleHistoryRequest interceptedRequest =
                DeleteConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteConsoleHistoryResponse>
                transformer = DeleteConsoleHistoryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DeleteConsoleHistory",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/DeleteConsoleHistory");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>,
                        java.util.concurrent.Future<DeleteConsoleHistoryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedVmHostResponse> deleteDedicatedVmHost(
            DeleteDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async deleteDedicatedVmHost");
        final DeleteDedicatedVmHostRequest interceptedRequest =
                DeleteDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDedicatedVmHostResponse>
                transformer = DeleteDedicatedVmHostConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DeleteDedicatedVmHost",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/DeleteDedicatedVmHost");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>,
                        java.util.concurrent.Future<DeleteDedicatedVmHostResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse>
                    handler) {
        LOG.trace("Called async deleteImage");
        final DeleteImageRequest interceptedRequest =
                DeleteImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteImageResponse>
                transformer = DeleteImageConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute", "DeleteImage", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteImageRequest, DeleteImageResponse>,
                        java.util.concurrent.Future<DeleteImageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteImageRequest, DeleteImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>
            deleteInstanceConsoleConnection(
                    DeleteInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConsoleConnectionRequest,
                                    DeleteInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async deleteInstanceConsoleConnection");
        final DeleteInstanceConsoleConnectionRequest interceptedRequest =
                DeleteInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConsoleConnectionResponse>
                transformer = DeleteInstanceConsoleConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DeleteInstanceConsoleConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/DeleteInstanceConsoleConnection");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteInstanceConsoleConnectionRequest,
                        DeleteInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteInstanceConsoleConnectionRequest,
                                DeleteInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteInstanceConsoleConnectionRequest,
                    DeleteInstanceConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachBootVolumeResponse> detachBootVolume(
            DetachBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetachBootVolumeRequest, DetachBootVolumeResponse>
                    handler) {
        LOG.trace("Called async detachBootVolume");
        final DetachBootVolumeRequest interceptedRequest =
                DetachBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DetachBootVolumeResponse>
                transformer = DetachBootVolumeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute", "DetachBootVolume", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<DetachBootVolumeRequest, DetachBootVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachBootVolumeRequest, DetachBootVolumeResponse>,
                        java.util.concurrent.Future<DetachBootVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachBootVolumeRequest, DetachBootVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachVnicResponse> detachVnic(
            DetachVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse>
                    handler) {
        LOG.trace("Called async detachVnic");
        final DetachVnicRequest interceptedRequest = DetachVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVnicConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DetachVnicResponse>
                transformer = DetachVnicConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DetachVnic",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/DetachVnic");

        com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachVnicRequest, DetachVnicResponse>,
                        java.util.concurrent.Future<DetachVnicResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachVnicRequest, DetachVnicResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                    handler) {
        LOG.trace("Called async detachVolume");
        final DetachVolumeRequest interceptedRequest =
                DetachVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DetachVolumeResponse>
                transformer = DetachVolumeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "DetachVolume",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/DetachVolume");

        com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachVolumeRequest, DetachVolumeResponse>,
                        java.util.concurrent.Future<DetachVolumeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachVolumeRequest, DetachVolumeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportImageResponse> exportImage(
            ExportImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse>
                    handler) {
        LOG.trace("Called async exportImage");
        final ExportImageRequest interceptedRequest =
                ExportImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ExportImageResponse>
                transformer = ExportImageConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ExportImage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ExportImage");

        com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportImageRequest, ExportImageResponse>,
                        java.util.concurrent.Future<ExportImageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportImageRequest, ExportImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAppCatalogListingResponse> getAppCatalogListing(
            GetAppCatalogListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                    handler) {
        LOG.trace("Called async getAppCatalogListing");
        final GetAppCatalogListingRequest interceptedRequest =
                GetAppCatalogListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAppCatalogListingResponse>
                transformer = GetAppCatalogListingConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetAppCatalogListing",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListing/GetAppCatalogListing");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingRequest, GetAppCatalogListingResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingRequest, GetAppCatalogListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>
            getAppCatalogListingAgreements(
                    GetAppCatalogListingAgreementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingAgreementsRequest,
                                    GetAppCatalogListingAgreementsResponse>
                            handler) {
        LOG.trace("Called async getAppCatalogListingAgreements");
        final GetAppCatalogListingAgreementsRequest interceptedRequest =
                GetAppCatalogListingAgreementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingAgreementsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAppCatalogListingAgreementsResponse>
                transformer = GetAppCatalogListingAgreementsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetAppCatalogListingAgreements",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingAgreementsRequest,
                        GetAppCatalogListingAgreementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingAgreementsRequest,
                                GetAppCatalogListingAgreementsResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingAgreementsRequest, GetAppCatalogListingAgreementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>
            getAppCatalogListingResourceVersion(
                    GetAppCatalogListingResourceVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingResourceVersionRequest,
                                    GetAppCatalogListingResourceVersionResponse>
                            handler) {
        LOG.trace("Called async getAppCatalogListingResourceVersion");
        final GetAppCatalogListingResourceVersionRequest interceptedRequest =
                GetAppCatalogListingResourceVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppCatalogListingResourceVersionConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAppCatalogListingResourceVersionResponse>
                transformer = GetAppCatalogListingResourceVersionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetAppCatalogListingResourceVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAppCatalogListingResourceVersionRequest,
                        GetAppCatalogListingResourceVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppCatalogListingResourceVersionRequest,
                                GetAppCatalogListingResourceVersionResponse>,
                        java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppCatalogListingResourceVersionRequest,
                    GetAppCatalogListingResourceVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeAttachmentResponse> getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async getBootVolumeAttachment");
        final GetBootVolumeAttachmentRequest interceptedRequest =
                GetBootVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetBootVolumeAttachmentResponse>
                transformer = GetBootVolumeAttachmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetBootVolumeAttachment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/GetBootVolumeAttachment");

        com.oracle.bmc.responses.AsyncHandler<
                        GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>,
                        java.util.concurrent.Future<GetBootVolumeAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetComputeCapacityReservationResponse>
            getComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeCapacityReservationRequest,
                                    GetComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async getComputeCapacityReservation");
        final GetComputeCapacityReservationRequest interceptedRequest =
                GetComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetComputeCapacityReservationResponse>
                transformer = GetComputeCapacityReservationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetComputeCapacityReservation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/GetComputeCapacityReservation");

        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeCapacityReservationRequest,
                                GetComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<GetComputeCapacityReservationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaResponse>
            getComputeGlobalImageCapabilitySchema(
                    GetComputeGlobalImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaRequest,
                                    GetComputeGlobalImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async getComputeGlobalImageCapabilitySchema");
        final GetComputeGlobalImageCapabilitySchemaRequest interceptedRequest =
                GetComputeGlobalImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGlobalImageCapabilitySchemaConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetComputeGlobalImageCapabilitySchemaResponse>
                transformer = GetComputeGlobalImageCapabilitySchemaConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetComputeGlobalImageCapabilitySchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchema/GetComputeGlobalImageCapabilitySchema");

        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGlobalImageCapabilitySchemaRequest,
                        GetComputeGlobalImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGlobalImageCapabilitySchemaRequest,
                                GetComputeGlobalImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGlobalImageCapabilitySchemaRequest,
                    GetComputeGlobalImageCapabilitySchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaVersionResponse>
            getComputeGlobalImageCapabilitySchemaVersion(
                    GetComputeGlobalImageCapabilitySchemaVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaVersionRequest,
                                    GetComputeGlobalImageCapabilitySchemaVersionResponse>
                            handler) {
        LOG.trace("Called async getComputeGlobalImageCapabilitySchemaVersion");
        final GetComputeGlobalImageCapabilitySchemaVersionRequest interceptedRequest =
                GetComputeGlobalImageCapabilitySchemaVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeGlobalImageCapabilitySchemaVersionConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        GetComputeGlobalImageCapabilitySchemaVersionResponse>
                transformer = GetComputeGlobalImageCapabilitySchemaVersionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetComputeGlobalImageCapabilitySchemaVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersion/GetComputeGlobalImageCapabilitySchemaVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeGlobalImageCapabilitySchemaVersionRequest,
                        GetComputeGlobalImageCapabilitySchemaVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeGlobalImageCapabilitySchemaVersionRequest,
                                GetComputeGlobalImageCapabilitySchemaVersionResponse>,
                        java.util.concurrent.Future<
                                GetComputeGlobalImageCapabilitySchemaVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeGlobalImageCapabilitySchemaVersionRequest,
                    GetComputeGlobalImageCapabilitySchemaVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetComputeImageCapabilitySchemaResponse>
            getComputeImageCapabilitySchema(
                    GetComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeImageCapabilitySchemaRequest,
                                    GetComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async getComputeImageCapabilitySchema");
        final GetComputeImageCapabilitySchemaRequest interceptedRequest =
                GetComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetComputeImageCapabilitySchemaResponse>
                transformer = GetComputeImageCapabilitySchemaConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetComputeImageCapabilitySchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/GetComputeImageCapabilitySchema");

        com.oracle.bmc.responses.AsyncHandler<
                        GetComputeImageCapabilitySchemaRequest,
                        GetComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetComputeImageCapabilitySchemaRequest,
                                GetComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<GetComputeImageCapabilitySchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetComputeImageCapabilitySchemaRequest,
                    GetComputeImageCapabilitySchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistory");
        final GetConsoleHistoryRequest interceptedRequest =
                GetConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryResponse>
                transformer = GetConsoleHistoryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetConsoleHistory",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistory");

        com.oracle.bmc.responses.AsyncHandler<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConsoleHistoryRequest, GetConsoleHistoryResponse>,
                        java.util.concurrent.Future<GetConsoleHistoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConsoleHistoryRequest, GetConsoleHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistoryContent");
        final GetConsoleHistoryContentRequest interceptedRequest =
                GetConsoleHistoryContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConsoleHistoryContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer = GetConsoleHistoryContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetConsoleHistoryContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/GetConsoleHistoryContent");

        com.oracle.bmc.responses.AsyncHandler<
                        GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>,
                        java.util.concurrent.Future<GetConsoleHistoryContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedVmHostResponse> getDedicatedVmHost(
            GetDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async getDedicatedVmHost");
        final GetDedicatedVmHostRequest interceptedRequest =
                GetDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDedicatedVmHostResponse>
                transformer = GetDedicatedVmHostConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetDedicatedVmHost",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/GetDedicatedVmHost");

        com.oracle.bmc.responses.AsyncHandler<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>,
                        java.util.concurrent.Future<GetDedicatedVmHostResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetImageResponse> getImage(
            GetImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse>
                    handler) {
        LOG.trace("Called async getImage");
        final GetImageRequest interceptedRequest = GetImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetImageResponse>
                transformer = GetImageConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetImage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/GetImage");

        com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse>,
                        java.util.concurrent.Future<GetImageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImageRequest, GetImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetImageShapeCompatibilityEntryResponse>
            getImageShapeCompatibilityEntry(
                    GetImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetImageShapeCompatibilityEntryRequest,
                                    GetImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async getImageShapeCompatibilityEntry");
        final GetImageShapeCompatibilityEntryRequest interceptedRequest =
                GetImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetImageShapeCompatibilityEntryResponse>
                transformer = GetImageShapeCompatibilityEntryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetImageShapeCompatibilityEntry",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/GetImageShapeCompatibilityEntry");

        com.oracle.bmc.responses.AsyncHandler<
                        GetImageShapeCompatibilityEntryRequest,
                        GetImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetImageShapeCompatibilityEntryRequest,
                                GetImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<GetImageShapeCompatibilityEntryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImageShapeCompatibilityEntryRequest,
                    GetImageShapeCompatibilityEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse>
                    handler) {
        LOG.trace("Called async getInstance");
        final GetInstanceRequest interceptedRequest =
                GetInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetInstanceResponse>
                transformer = GetInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/GetInstance");

        com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceRequest, GetInstanceResponse>,
                        java.util.concurrent.Future<GetInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceRequest, GetInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstanceConsoleConnectionResponse>
            getInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstanceConsoleConnectionRequest,
                                    GetInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async getInstanceConsoleConnection");
        final GetInstanceConsoleConnectionRequest interceptedRequest =
                GetInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetInstanceConsoleConnectionResponse>
                transformer = GetInstanceConsoleConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetInstanceConsoleConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/GetInstanceConsoleConnection");

        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceConsoleConnectionRequest,
                                GetInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<GetInstanceConsoleConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMeasuredBootReportResponse> getMeasuredBootReport(
            GetMeasuredBootReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>
                    handler) {
        LOG.trace("Called async getMeasuredBootReport");
        final GetMeasuredBootReportRequest interceptedRequest =
                GetMeasuredBootReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMeasuredBootReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetMeasuredBootReportResponse>
                transformer = GetMeasuredBootReportConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetMeasuredBootReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/MeasuredBootReport/GetMeasuredBootReport");

        com.oracle.bmc.responses.AsyncHandler<
                        GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>,
                        java.util.concurrent.Future<GetMeasuredBootReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVnicAttachmentResponse> getVnicAttachment(
            GetVnicAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVnicAttachment");
        final GetVnicAttachmentRequest interceptedRequest =
                GetVnicAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVnicAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVnicAttachmentResponse>
                transformer = GetVnicAttachmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetVnicAttachment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/GetVnicAttachment");

        com.oracle.bmc.responses.AsyncHandler<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVnicAttachmentRequest, GetVnicAttachmentResponse>,
                        java.util.concurrent.Future<GetVnicAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVnicAttachmentRequest, GetVnicAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVolumeAttachment");
        final GetVolumeAttachmentRequest interceptedRequest =
                GetVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVolumeAttachmentResponse>
                transformer = GetVolumeAttachmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetVolumeAttachment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/GetVolumeAttachment");

        com.oracle.bmc.responses.AsyncHandler<
                        GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>,
                        java.util.concurrent.Future<GetVolumeAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler) {
        LOG.trace("Called async getWindowsInstanceInitialCredentials");
        final GetWindowsInstanceInitialCredentialsRequest interceptedRequest =
                GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWindowsInstanceInitialCredentialsResponse>
                transformer = GetWindowsInstanceInitialCredentialsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "GetWindowsInstanceInitialCredentials",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceCredentials/GetWindowsInstanceInitialCredentials");

        com.oracle.bmc.responses.AsyncHandler<
                        GetWindowsInstanceInitialCredentialsRequest,
                        GetWindowsInstanceInitialCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWindowsInstanceInitialCredentialsRequest,
                                GetWindowsInstanceInitialCredentialsResponse>,
                        java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWindowsInstanceInitialCredentialsRequest,
                    GetWindowsInstanceInitialCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InstanceActionRequest, InstanceActionResponse>
                    handler) {
        LOG.trace("Called async instanceAction");
        final InstanceActionRequest interceptedRequest =
                InstanceActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstanceActionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, InstanceActionResponse>
                transformer = InstanceActionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "InstanceAction",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/InstanceAction");

        com.oracle.bmc.responses.AsyncHandler<InstanceActionRequest, InstanceActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstanceActionRequest, InstanceActionResponse>,
                        java.util.concurrent.Future<InstanceActionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstancePowerActionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstanceActionRequest, InstanceActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LaunchInstanceRequest, LaunchInstanceResponse>
                    handler) {
        LOG.trace("Called async launchInstance");
        final LaunchInstanceRequest interceptedRequest =
                LaunchInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, LaunchInstanceResponse>
                transformer = LaunchInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "LaunchInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/LaunchInstance");

        com.oracle.bmc.responses.AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchInstanceRequest, LaunchInstanceResponse>,
                        java.util.concurrent.Future<LaunchInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLaunchInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchInstanceRequest, LaunchInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>
            listAppCatalogListingResourceVersions(
                    ListAppCatalogListingResourceVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogListingResourceVersionsRequest,
                                    ListAppCatalogListingResourceVersionsResponse>
                            handler) {
        LOG.trace("Called async listAppCatalogListingResourceVersions");
        final ListAppCatalogListingResourceVersionsRequest interceptedRequest =
                ListAppCatalogListingResourceVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogListingResourceVersionsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAppCatalogListingResourceVersionsResponse>
                transformer = ListAppCatalogListingResourceVersionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListAppCatalogListingResourceVersions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingResourceVersionSummary/ListAppCatalogListingResourceVersions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogListingResourceVersionsRequest,
                        ListAppCatalogListingResourceVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogListingResourceVersionsRequest,
                                ListAppCatalogListingResourceVersionsResponse>,
                        java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogListingResourceVersionsRequest,
                    ListAppCatalogListingResourceVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAppCatalogListingsResponse> listAppCatalogListings(
            ListAppCatalogListingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                    handler) {
        LOG.trace("Called async listAppCatalogListings");
        final ListAppCatalogListingsRequest interceptedRequest =
                ListAppCatalogListingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogListingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAppCatalogListingsResponse>
                transformer = ListAppCatalogListingsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListAppCatalogListings",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogListingSummary/ListAppCatalogListings");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>,
                        java.util.concurrent.Future<ListAppCatalogListingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse>
            listAppCatalogSubscriptions(
                    ListAppCatalogSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogSubscriptionsRequest,
                                    ListAppCatalogSubscriptionsResponse>
                            handler) {
        LOG.trace("Called async listAppCatalogSubscriptions");
        final ListAppCatalogSubscriptionsRequest interceptedRequest =
                ListAppCatalogSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppCatalogSubscriptionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAppCatalogSubscriptionsResponse>
                transformer = ListAppCatalogSubscriptionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListAppCatalogSubscriptions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AppCatalogSubscriptionSummary/ListAppCatalogSubscriptions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppCatalogSubscriptionsRequest,
                                ListAppCatalogSubscriptionsResponse>,
                        java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBootVolumeAttachmentsResponse> listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listBootVolumeAttachments");
        final ListBootVolumeAttachmentsRequest interceptedRequest =
                ListBootVolumeAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumeAttachmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListBootVolumeAttachmentsResponse>
                transformer = ListBootVolumeAttachmentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListBootVolumeAttachments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/BootVolumeAttachment/ListBootVolumeAttachments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBootVolumeAttachmentsRequest,
                                ListBootVolumeAttachmentsResponse>,
                        java.util.concurrent.Future<ListBootVolumeAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeCapacityReservationInstanceShapesResponse>
            listComputeCapacityReservationInstanceShapes(
                    ListComputeCapacityReservationInstanceShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstanceShapesRequest,
                                    ListComputeCapacityReservationInstanceShapesResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservationInstanceShapes");
        final ListComputeCapacityReservationInstanceShapesRequest interceptedRequest =
                ListComputeCapacityReservationInstanceShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationInstanceShapesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListComputeCapacityReservationInstanceShapesResponse>
                transformer = ListComputeCapacityReservationInstanceShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeCapacityReservationInstanceShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservationInstanceShapeSummary/ListComputeCapacityReservationInstanceShapes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationInstanceShapesRequest,
                        ListComputeCapacityReservationInstanceShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationInstanceShapesRequest,
                                ListComputeCapacityReservationInstanceShapesResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityReservationInstanceShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationInstanceShapesRequest,
                    ListComputeCapacityReservationInstanceShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeCapacityReservationInstancesResponse>
            listComputeCapacityReservationInstances(
                    ListComputeCapacityReservationInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstancesRequest,
                                    ListComputeCapacityReservationInstancesResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservationInstances");
        final ListComputeCapacityReservationInstancesRequest interceptedRequest =
                ListComputeCapacityReservationInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationInstancesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListComputeCapacityReservationInstancesResponse>
                transformer = ListComputeCapacityReservationInstancesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeCapacityReservationInstances",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CapacityReservationInstanceSummary/ListComputeCapacityReservationInstances");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationInstancesRequest,
                        ListComputeCapacityReservationInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationInstancesRequest,
                                ListComputeCapacityReservationInstancesResponse>,
                        java.util.concurrent.Future<
                                ListComputeCapacityReservationInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationInstancesRequest,
                    ListComputeCapacityReservationInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeCapacityReservationsResponse>
            listComputeCapacityReservations(
                    ListComputeCapacityReservationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationsRequest,
                                    ListComputeCapacityReservationsResponse>
                            handler) {
        LOG.trace("Called async listComputeCapacityReservations");
        final ListComputeCapacityReservationsRequest interceptedRequest =
                ListComputeCapacityReservationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeCapacityReservationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListComputeCapacityReservationsResponse>
                transformer = ListComputeCapacityReservationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeCapacityReservations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/ListComputeCapacityReservations");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeCapacityReservationsRequest,
                        ListComputeCapacityReservationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeCapacityReservationsRequest,
                                ListComputeCapacityReservationsResponse>,
                        java.util.concurrent.Future<ListComputeCapacityReservationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeCapacityReservationsRequest,
                    ListComputeCapacityReservationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemaVersionsResponse>
            listComputeGlobalImageCapabilitySchemaVersions(
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                                    ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                            handler) {
        LOG.trace("Called async listComputeGlobalImageCapabilitySchemaVersions");
        final ListComputeGlobalImageCapabilitySchemaVersionsRequest interceptedRequest =
                ListComputeGlobalImageCapabilitySchemaVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGlobalImageCapabilitySchemaVersionsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                transformer =
                        ListComputeGlobalImageCapabilitySchemaVersionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeGlobalImageCapabilitySchemaVersions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaVersionSummary/ListComputeGlobalImageCapabilitySchemaVersions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                        ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                                ListComputeGlobalImageCapabilitySchemaVersionsResponse>,
                        java.util.concurrent.Future<
                                ListComputeGlobalImageCapabilitySchemaVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                    ListComputeGlobalImageCapabilitySchemaVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemasResponse>
            listComputeGlobalImageCapabilitySchemas(
                    ListComputeGlobalImageCapabilitySchemasRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemasRequest,
                                    ListComputeGlobalImageCapabilitySchemasResponse>
                            handler) {
        LOG.trace("Called async listComputeGlobalImageCapabilitySchemas");
        final ListComputeGlobalImageCapabilitySchemasRequest interceptedRequest =
                ListComputeGlobalImageCapabilitySchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeGlobalImageCapabilitySchemasConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListComputeGlobalImageCapabilitySchemasResponse>
                transformer = ListComputeGlobalImageCapabilitySchemasConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeGlobalImageCapabilitySchemas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeGlobalImageCapabilitySchemaSummary/ListComputeGlobalImageCapabilitySchemas");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeGlobalImageCapabilitySchemasRequest,
                        ListComputeGlobalImageCapabilitySchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeGlobalImageCapabilitySchemasRequest,
                                ListComputeGlobalImageCapabilitySchemasResponse>,
                        java.util.concurrent.Future<
                                ListComputeGlobalImageCapabilitySchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeGlobalImageCapabilitySchemasRequest,
                    ListComputeGlobalImageCapabilitySchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComputeImageCapabilitySchemasResponse>
            listComputeImageCapabilitySchemas(
                    ListComputeImageCapabilitySchemasRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeImageCapabilitySchemasRequest,
                                    ListComputeImageCapabilitySchemasResponse>
                            handler) {
        LOG.trace("Called async listComputeImageCapabilitySchemas");
        final ListComputeImageCapabilitySchemasRequest interceptedRequest =
                ListComputeImageCapabilitySchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComputeImageCapabilitySchemasConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListComputeImageCapabilitySchemasResponse>
                transformer = ListComputeImageCapabilitySchemasConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListComputeImageCapabilitySchemas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchemaSummary/ListComputeImageCapabilitySchemas");

        com.oracle.bmc.responses.AsyncHandler<
                        ListComputeImageCapabilitySchemasRequest,
                        ListComputeImageCapabilitySchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComputeImageCapabilitySchemasRequest,
                                ListComputeImageCapabilitySchemasResponse>,
                        java.util.concurrent.Future<ListComputeImageCapabilitySchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComputeImageCapabilitySchemasRequest,
                    ListComputeImageCapabilitySchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                    handler) {
        LOG.trace("Called async listConsoleHistories");
        final ListConsoleHistoriesRequest interceptedRequest =
                ListConsoleHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsoleHistoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConsoleHistoriesResponse>
                transformer = ListConsoleHistoriesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListConsoleHistories",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/ListConsoleHistories");

        com.oracle.bmc.responses.AsyncHandler<
                        ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>,
                        java.util.concurrent.Future<ListConsoleHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>
            listDedicatedVmHostInstanceShapes(
                    ListDedicatedVmHostInstanceShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstanceShapesRequest,
                                    ListDedicatedVmHostInstanceShapesResponse>
                            handler) {
        LOG.trace("Called async listDedicatedVmHostInstanceShapes");
        final ListDedicatedVmHostInstanceShapesRequest interceptedRequest =
                ListDedicatedVmHostInstanceShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostInstanceShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostInstanceShapesResponse>
                transformer = ListDedicatedVmHostInstanceShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListDedicatedVmHostInstanceShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceShapeSummary/ListDedicatedVmHostInstanceShapes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostInstanceShapesRequest,
                        ListDedicatedVmHostInstanceShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostInstanceShapesRequest,
                                ListDedicatedVmHostInstanceShapesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostInstanceShapesRequest,
                    ListDedicatedVmHostInstanceShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse>
            listDedicatedVmHostInstances(
                    ListDedicatedVmHostInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstancesRequest,
                                    ListDedicatedVmHostInstancesResponse>
                            handler) {
        LOG.trace("Called async listDedicatedVmHostInstances");
        final ListDedicatedVmHostInstancesRequest interceptedRequest =
                ListDedicatedVmHostInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostInstancesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostInstancesResponse>
                transformer = ListDedicatedVmHostInstancesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListDedicatedVmHostInstances",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostInstanceSummary/ListDedicatedVmHostInstances");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostInstancesRequest, ListDedicatedVmHostInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostInstancesRequest,
                                ListDedicatedVmHostInstancesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostInstancesRequest, ListDedicatedVmHostInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedVmHostShapesResponse> listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                    handler) {
        LOG.trace("Called async listDedicatedVmHostShapes");
        final ListDedicatedVmHostShapesRequest interceptedRequest =
                ListDedicatedVmHostShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostShapesResponse>
                transformer = ListDedicatedVmHostShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListDedicatedVmHostShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostShapeSummary/ListDedicatedVmHostShapes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostShapesRequest,
                                ListDedicatedVmHostShapesResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedVmHostsResponse> listDedicatedVmHosts(
            ListDedicatedVmHostsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                    handler) {
        LOG.trace("Called async listDedicatedVmHosts");
        final ListDedicatedVmHostsRequest interceptedRequest =
                ListDedicatedVmHostsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedVmHostsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDedicatedVmHostsResponse>
                transformer = ListDedicatedVmHostsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListDedicatedVmHosts",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHostSummary/ListDedicatedVmHosts");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>,
                        java.util.concurrent.Future<ListDedicatedVmHostsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImageShapeCompatibilityEntriesResponse>
            listImageShapeCompatibilityEntries(
                    ListImageShapeCompatibilityEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImageShapeCompatibilityEntriesRequest,
                                    ListImageShapeCompatibilityEntriesResponse>
                            handler) {
        LOG.trace("Called async listImageShapeCompatibilityEntries");
        final ListImageShapeCompatibilityEntriesRequest interceptedRequest =
                ListImageShapeCompatibilityEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImageShapeCompatibilityEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListImageShapeCompatibilityEntriesResponse>
                transformer = ListImageShapeCompatibilityEntriesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListImageShapeCompatibilityEntries",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/ListImageShapeCompatibilityEntries");

        com.oracle.bmc.responses.AsyncHandler<
                        ListImageShapeCompatibilityEntriesRequest,
                        ListImageShapeCompatibilityEntriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImageShapeCompatibilityEntriesRequest,
                                ListImageShapeCompatibilityEntriesResponse>,
                        java.util.concurrent.Future<ListImageShapeCompatibilityEntriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImageShapeCompatibilityEntriesRequest,
                    ListImageShapeCompatibilityEntriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse>
                    handler) {
        LOG.trace("Called async listImages");
        final ListImagesRequest interceptedRequest = ListImagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImagesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListImagesResponse>
                transformer = ListImagesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListImages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/ListImages");

        com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImagesRequest, ListImagesResponse>,
                        java.util.concurrent.Future<ListImagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImagesRequest, ListImagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>
            listInstanceConsoleConnections(
                    ListInstanceConsoleConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConsoleConnectionsRequest,
                                    ListInstanceConsoleConnectionsResponse>
                            handler) {
        LOG.trace("Called async listInstanceConsoleConnections");
        final ListInstanceConsoleConnectionsRequest interceptedRequest =
                ListInstanceConsoleConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConsoleConnectionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceConsoleConnectionsResponse>
                transformer = ListInstanceConsoleConnectionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListInstanceConsoleConnections",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/ListInstanceConsoleConnections");

        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceConsoleConnectionsRequest,
                        ListInstanceConsoleConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceConsoleConnectionsRequest,
                                ListInstanceConsoleConnectionsResponse>,
                        java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceConsoleConnectionsRequest, ListInstanceConsoleConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstanceDevicesResponse> listInstanceDevices(
            ListInstanceDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                    handler) {
        LOG.trace("Called async listInstanceDevices");
        final ListInstanceDevicesRequest interceptedRequest =
                ListInstanceDevicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceDevicesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceDevicesResponse>
                transformer = ListInstanceDevicesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListInstanceDevices",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Device/ListInstanceDevices");

        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceDevicesRequest, ListInstanceDevicesResponse>,
                        java.util.concurrent.Future<ListInstanceDevicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceDevicesRequest, ListInstanceDevicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                    handler) {
        LOG.trace("Called async listInstances");
        final ListInstancesRequest interceptedRequest =
                ListInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancesResponse>
                transformer = ListInstancesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListInstances",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/ListInstances");

        com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancesRequest, ListInstancesResponse>,
                        java.util.concurrent.Future<ListInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancesRequest, ListInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse>
                    handler) {
        LOG.trace("Called async listShapes");
        final ListShapesRequest interceptedRequest = ListShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse>
                transformer = ListShapesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListShapes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Shape/ListShapes");

        com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListShapesRequest, ListShapesResponse>,
                        java.util.concurrent.Future<ListShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListShapesRequest, ListShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVnicAttachments");
        final ListVnicAttachmentsRequest interceptedRequest =
                ListVnicAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVnicAttachmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVnicAttachmentsResponse>
                transformer = ListVnicAttachmentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListVnicAttachments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VnicAttachment/ListVnicAttachments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>,
                        java.util.concurrent.Future<ListVnicAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVolumeAttachments");
        final ListVolumeAttachmentsRequest interceptedRequest =
                ListVolumeAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeAttachmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVolumeAttachmentsResponse>
                transformer = ListVolumeAttachmentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "ListVolumeAttachments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/ListVolumeAttachments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>,
                        java.util.concurrent.Future<ListVolumeAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>
            removeImageShapeCompatibilityEntry(
                    RemoveImageShapeCompatibilityEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveImageShapeCompatibilityEntryRequest,
                                    RemoveImageShapeCompatibilityEntryResponse>
                            handler) {
        LOG.trace("Called async removeImageShapeCompatibilityEntry");
        final RemoveImageShapeCompatibilityEntryRequest interceptedRequest =
                RemoveImageShapeCompatibilityEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveImageShapeCompatibilityEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveImageShapeCompatibilityEntryResponse>
                transformer = RemoveImageShapeCompatibilityEntryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "RemoveImageShapeCompatibilityEntry",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ImageShapeCompatibilityEntry/RemoveImageShapeCompatibilityEntry");

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveImageShapeCompatibilityEntryRequest,
                        RemoveImageShapeCompatibilityEntryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveImageShapeCompatibilityEntryRequest,
                                RemoveImageShapeCompatibilityEntryResponse>,
                        java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveImageShapeCompatibilityEntryRequest,
                    RemoveImageShapeCompatibilityEntryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstanceRequest, TerminateInstanceResponse>
                    handler) {
        LOG.trace("Called async terminateInstance");
        final TerminateInstanceRequest interceptedRequest =
                TerminateInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TerminateInstanceResponse>
                transformer = TerminateInstanceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute", "TerminateInstance", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<TerminateInstanceRequest, TerminateInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateInstanceRequest, TerminateInstanceResponse>,
                        java.util.concurrent.Future<TerminateInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateInstanceRequest, TerminateInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeCapacityReservationResponse>
            updateComputeCapacityReservation(
                    UpdateComputeCapacityReservationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeCapacityReservationRequest,
                                    UpdateComputeCapacityReservationResponse>
                            handler) {
        LOG.trace("Called async updateComputeCapacityReservation");
        final UpdateComputeCapacityReservationRequest interceptedRequest =
                UpdateComputeCapacityReservationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeCapacityReservationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateComputeCapacityReservationResponse>
                transformer = UpdateComputeCapacityReservationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateComputeCapacityReservation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeCapacityReservation/UpdateComputeCapacityReservation");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeCapacityReservationRequest,
                        UpdateComputeCapacityReservationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeCapacityReservationRequest,
                                UpdateComputeCapacityReservationResponse>,
                        java.util.concurrent.Future<UpdateComputeCapacityReservationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeCapacityReservationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeCapacityReservationRequest,
                    UpdateComputeCapacityReservationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeImageCapabilitySchemaResponse>
            updateComputeImageCapabilitySchema(
                    UpdateComputeImageCapabilitySchemaRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeImageCapabilitySchemaRequest,
                                    UpdateComputeImageCapabilitySchemaResponse>
                            handler) {
        LOG.trace("Called async updateComputeImageCapabilitySchema");
        final UpdateComputeImageCapabilitySchemaRequest interceptedRequest =
                UpdateComputeImageCapabilitySchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateComputeImageCapabilitySchemaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateComputeImageCapabilitySchemaResponse>
                transformer = UpdateComputeImageCapabilitySchemaConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateComputeImageCapabilitySchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ComputeImageCapabilitySchema/UpdateComputeImageCapabilitySchema");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateComputeImageCapabilitySchemaRequest,
                        UpdateComputeImageCapabilitySchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateComputeImageCapabilitySchemaRequest,
                                UpdateComputeImageCapabilitySchemaResponse>,
                        java.util.concurrent.Future<UpdateComputeImageCapabilitySchemaResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateComputeImageCapabilitySchemaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateComputeImageCapabilitySchemaRequest,
                    UpdateComputeImageCapabilitySchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConsoleHistoryResponse> updateConsoleHistory(
            UpdateConsoleHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async updateConsoleHistory");
        final UpdateConsoleHistoryRequest interceptedRequest =
                UpdateConsoleHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConsoleHistoryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateConsoleHistoryResponse>
                transformer = UpdateConsoleHistoryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateConsoleHistory",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ConsoleHistory/UpdateConsoleHistory");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>,
                        java.util.concurrent.Future<UpdateConsoleHistoryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConsoleHistoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDedicatedVmHostResponse> updateDedicatedVmHost(
            UpdateDedicatedVmHostRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                    handler) {
        LOG.trace("Called async updateDedicatedVmHost");
        final UpdateDedicatedVmHostRequest interceptedRequest =
                UpdateDedicatedVmHostConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDedicatedVmHostConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDedicatedVmHostResponse>
                transformer = UpdateDedicatedVmHostConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateDedicatedVmHost",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DedicatedVmHost/UpdateDedicatedVmHost");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>,
                        java.util.concurrent.Future<UpdateDedicatedVmHostResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDedicatedVmHostDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse>
                    handler) {
        LOG.trace("Called async updateImage");
        final UpdateImageRequest interceptedRequest =
                UpdateImageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateImageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateImageResponse>
                transformer = UpdateImageConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateImage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Image/UpdateImage");

        com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateImageRequest, UpdateImageResponse>,
                        java.util.concurrent.Future<UpdateImageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateImageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateImageRequest, UpdateImageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstanceRequest, UpdateInstanceResponse>
                    handler) {
        LOG.trace("Called async updateInstance");
        final UpdateInstanceRequest interceptedRequest =
                UpdateInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstanceResponse>
                transformer = UpdateInstanceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/UpdateInstance");

        com.oracle.bmc.responses.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceRequest, UpdateInstanceResponse>,
                        java.util.concurrent.Future<UpdateInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceRequest, UpdateInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceConsoleConnectionResponse>
            updateInstanceConsoleConnection(
                    UpdateInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceConsoleConnectionRequest,
                                    UpdateInstanceConsoleConnectionResponse>
                            handler) {
        LOG.trace("Called async updateInstanceConsoleConnection");
        final UpdateInstanceConsoleConnectionRequest interceptedRequest =
                UpdateInstanceConsoleConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConsoleConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateInstanceConsoleConnectionResponse>
                transformer = UpdateInstanceConsoleConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateInstanceConsoleConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConsoleConnection/UpdateInstanceConsoleConnection");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInstanceConsoleConnectionRequest,
                        UpdateInstanceConsoleConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceConsoleConnectionRequest,
                                UpdateInstanceConsoleConnectionResponse>,
                        java.util.concurrent.Future<UpdateInstanceConsoleConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceConsoleConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceConsoleConnectionRequest,
                    UpdateInstanceConsoleConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeAttachmentResponse> updateVolumeAttachment(
            UpdateVolumeAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async updateVolumeAttachment");
        final UpdateVolumeAttachmentRequest interceptedRequest =
                UpdateVolumeAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeAttachmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVolumeAttachmentResponse>
                transformer = UpdateVolumeAttachmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Compute",
                "UpdateVolumeAttachment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VolumeAttachment/UpdateVolumeAttachment");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>,
                        java.util.concurrent.Future<UpdateVolumeAttachmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVolumeAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
