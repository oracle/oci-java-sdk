/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.certificatesmanagement.internal.http.*;
import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;

/**
 * Async client implementation for CertificatesManagement service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.extern.slf4j.Slf4j
public class CertificatesManagementAsyncClient implements CertificatesManagementAsync {
    /**
     * Service instance for CertificatesManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CERTIFICATESMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://certificatesmanagement.{region}.oci.{secondLevelDomain}")
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
    public CertificatesManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
                    Builder, CertificatesManagementAsyncClient> {
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
        public CertificatesManagementAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new CertificatesManagementAsyncClient(
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
    public java.util.concurrent.Future<CancelCertificateAuthorityDeletionResponse>
            cancelCertificateAuthorityDeletion(
                    CancelCertificateAuthorityDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityDeletionRequest,
                                    CancelCertificateAuthorityDeletionResponse>
                            handler) {
        LOG.trace("Called async cancelCertificateAuthorityDeletion");
        final CancelCertificateAuthorityDeletionRequest interceptedRequest =
                CancelCertificateAuthorityDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelCertificateAuthorityDeletionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CancelCertificateAuthorityDeletionResponse>
                transformer = CancelCertificateAuthorityDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CancelCertificateAuthorityDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/CancelCertificateAuthorityDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        CancelCertificateAuthorityDeletionRequest,
                        CancelCertificateAuthorityDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelCertificateAuthorityDeletionRequest,
                                CancelCertificateAuthorityDeletionResponse>,
                        java.util.concurrent.Future<CancelCertificateAuthorityDeletionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelCertificateAuthorityDeletionRequest,
                    CancelCertificateAuthorityDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateAuthorityVersionDeletionResponse>
            cancelCertificateAuthorityVersionDeletion(
                    CancelCertificateAuthorityVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityVersionDeletionRequest,
                                    CancelCertificateAuthorityVersionDeletionResponse>
                            handler) {
        LOG.trace("Called async cancelCertificateAuthorityVersionDeletion");
        final CancelCertificateAuthorityVersionDeletionRequest interceptedRequest =
                CancelCertificateAuthorityVersionDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelCertificateAuthorityVersionDeletionConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        CancelCertificateAuthorityVersionDeletionResponse>
                transformer = CancelCertificateAuthorityVersionDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CancelCertificateAuthorityVersionDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/CancelCertificateAuthorityVersionDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        CancelCertificateAuthorityVersionDeletionRequest,
                        CancelCertificateAuthorityVersionDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelCertificateAuthorityVersionDeletionRequest,
                                CancelCertificateAuthorityVersionDeletionResponse>,
                        java.util.concurrent.Future<
                                CancelCertificateAuthorityVersionDeletionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelCertificateAuthorityVersionDeletionRequest,
                    CancelCertificateAuthorityVersionDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateDeletionResponse> cancelCertificateDeletion(
            CancelCertificateDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelCertificateDeletionRequest, CancelCertificateDeletionResponse>
                    handler) {
        LOG.trace("Called async cancelCertificateDeletion");
        final CancelCertificateDeletionRequest interceptedRequest =
                CancelCertificateDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelCertificateDeletionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CancelCertificateDeletionResponse>
                transformer = CancelCertificateDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CancelCertificateDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/CancelCertificateDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        CancelCertificateDeletionRequest, CancelCertificateDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelCertificateDeletionRequest,
                                CancelCertificateDeletionResponse>,
                        java.util.concurrent.Future<CancelCertificateDeletionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelCertificateDeletionRequest, CancelCertificateDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateVersionDeletionResponse>
            cancelCertificateVersionDeletion(
                    CancelCertificateVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateVersionDeletionRequest,
                                    CancelCertificateVersionDeletionResponse>
                            handler) {
        LOG.trace("Called async cancelCertificateVersionDeletion");
        final CancelCertificateVersionDeletionRequest interceptedRequest =
                CancelCertificateVersionDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelCertificateVersionDeletionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CancelCertificateVersionDeletionResponse>
                transformer = CancelCertificateVersionDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CancelCertificateVersionDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/CancelCertificateVersionDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        CancelCertificateVersionDeletionRequest,
                        CancelCertificateVersionDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelCertificateVersionDeletionRequest,
                                CancelCertificateVersionDeletionResponse>,
                        java.util.concurrent.Future<CancelCertificateVersionDeletionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelCertificateVersionDeletionRequest,
                    CancelCertificateVersionDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCaBundleCompartmentResponse> changeCaBundleCompartment(
            ChangeCaBundleCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCaBundleCompartmentRequest, ChangeCaBundleCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeCaBundleCompartment");
        final ChangeCaBundleCompartmentRequest interceptedRequest =
                ChangeCaBundleCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCaBundleCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCaBundleCompartmentResponse>
                transformer = ChangeCaBundleCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ChangeCaBundleCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/ChangeCaBundleCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCaBundleCompartmentRequest, ChangeCaBundleCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCaBundleCompartmentRequest,
                                ChangeCaBundleCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCaBundleCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCaBundleCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCaBundleCompartmentRequest, ChangeCaBundleCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCertificateAuthorityCompartmentResponse>
            changeCertificateAuthorityCompartment(
                    ChangeCertificateAuthorityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateAuthorityCompartmentRequest,
                                    ChangeCertificateAuthorityCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCertificateAuthorityCompartment");
        final ChangeCertificateAuthorityCompartmentRequest interceptedRequest =
                ChangeCertificateAuthorityCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCertificateAuthorityCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCertificateAuthorityCompartmentResponse>
                transformer = ChangeCertificateAuthorityCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ChangeCertificateAuthorityCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/ChangeCertificateAuthorityCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCertificateAuthorityCompartmentRequest,
                        ChangeCertificateAuthorityCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCertificateAuthorityCompartmentRequest,
                                ChangeCertificateAuthorityCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCertificateAuthorityCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeCertificateAuthorityCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCertificateAuthorityCompartmentRequest,
                    ChangeCertificateAuthorityCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCertificateCompartmentResponse>
            changeCertificateCompartment(
                    ChangeCertificateCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateCompartmentRequest,
                                    ChangeCertificateCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCertificateCompartment");
        final ChangeCertificateCompartmentRequest interceptedRequest =
                ChangeCertificateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCertificateCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCertificateCompartmentResponse>
                transformer = ChangeCertificateCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ChangeCertificateCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/ChangeCertificateCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCertificateCompartmentRequest, ChangeCertificateCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCertificateCompartmentRequest,
                                ChangeCertificateCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCertificateCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCertificateCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCertificateCompartmentRequest, ChangeCertificateCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCaBundleResponse> createCaBundle(
            CreateCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCaBundleRequest, CreateCaBundleResponse>
                    handler) {
        LOG.trace("Called async createCaBundle");
        final CreateCaBundleRequest interceptedRequest =
                CreateCaBundleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCaBundleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateCaBundleResponse>
                transformer = CreateCaBundleConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CreateCaBundle",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/CreateCaBundle");

        com.oracle.bmc.responses.AsyncHandler<CreateCaBundleRequest, CreateCaBundleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCaBundleRequest, CreateCaBundleResponse>,
                        java.util.concurrent.Future<CreateCaBundleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCaBundleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCaBundleRequest, CreateCaBundleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        LOG.trace("Called async createCertificate");
        final CreateCertificateRequest interceptedRequest =
                CreateCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer = CreateCertificateConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CreateCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/CreateCertificate");

        com.oracle.bmc.responses.AsyncHandler<CreateCertificateRequest, CreateCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCertificateRequest, CreateCertificateResponse>,
                        java.util.concurrent.Future<CreateCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCertificateRequest, CreateCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityResponse>
            createCertificateAuthority(
                    CreateCertificateAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCertificateAuthorityRequest,
                                    CreateCertificateAuthorityResponse>
                            handler) {
        LOG.trace("Called async createCertificateAuthority");
        final CreateCertificateAuthorityRequest interceptedRequest =
                CreateCertificateAuthorityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateAuthorityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCertificateAuthorityResponse>
                transformer = CreateCertificateAuthorityConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "CreateCertificateAuthority",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/CreateCertificateAuthority");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCertificateAuthorityRequest,
                                CreateCertificateAuthorityResponse>,
                        java.util.concurrent.Future<CreateCertificateAuthorityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCertificateAuthorityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCaBundleResponse> deleteCaBundle(
            DeleteCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCaBundleRequest, DeleteCaBundleResponse>
                    handler) {
        LOG.trace("Called async deleteCaBundle");
        final DeleteCaBundleRequest interceptedRequest =
                DeleteCaBundleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCaBundleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCaBundleResponse>
                transformer = DeleteCaBundleConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "DeleteCaBundle",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/DeleteCaBundle");

        com.oracle.bmc.responses.AsyncHandler<DeleteCaBundleRequest, DeleteCaBundleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCaBundleRequest, DeleteCaBundleResponse>,
                        java.util.concurrent.Future<DeleteCaBundleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCaBundleRequest, DeleteCaBundleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAssociationResponse> getAssociation(
            GetAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssociationRequest, GetAssociationResponse>
                    handler) {
        LOG.trace("Called async getAssociation");
        final GetAssociationRequest interceptedRequest =
                GetAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAssociationResponse>
                transformer = GetAssociationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetAssociation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Association/GetAssociation");

        com.oracle.bmc.responses.AsyncHandler<GetAssociationRequest, GetAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAssociationRequest, GetAssociationResponse>,
                        java.util.concurrent.Future<GetAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAssociationRequest, GetAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCaBundleResponse> getCaBundle(
            GetCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse>
                    handler) {
        LOG.trace("Called async getCaBundle");
        final GetCaBundleRequest interceptedRequest =
                GetCaBundleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCaBundleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCaBundleResponse>
                transformer = GetCaBundleConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetCaBundle",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/GetCaBundle");

        com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCaBundleRequest, GetCaBundleResponse>,
                        java.util.concurrent.Future<GetCaBundleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCaBundleRequest, GetCaBundleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResponse> getCertificate(
            GetCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateRequest, GetCertificateResponse>
                    handler) {
        LOG.trace("Called async getCertificate");
        final GetCertificateRequest interceptedRequest =
                GetCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCertificateResponse>
                transformer = GetCertificateConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/GetCertificate");

        com.oracle.bmc.responses.AsyncHandler<GetCertificateRequest, GetCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCertificateRequest, GetCertificateResponse>,
                        java.util.concurrent.Future<GetCertificateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCertificateRequest, GetCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityResponse> getCertificateAuthority(
            GetCertificateAuthorityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
                    handler) {
        LOG.trace("Called async getCertificateAuthority");
        final GetCertificateAuthorityRequest interceptedRequest =
                GetCertificateAuthorityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateAuthorityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCertificateAuthorityResponse>
                transformer = GetCertificateAuthorityConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetCertificateAuthority",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/GetCertificateAuthority");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>,
                        java.util.concurrent.Future<GetCertificateAuthorityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityVersionResponse>
            getCertificateAuthorityVersion(
                    GetCertificateAuthorityVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCertificateAuthorityVersionRequest,
                                    GetCertificateAuthorityVersionResponse>
                            handler) {
        LOG.trace("Called async getCertificateAuthorityVersion");
        final GetCertificateAuthorityVersionRequest interceptedRequest =
                GetCertificateAuthorityVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateAuthorityVersionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCertificateAuthorityVersionResponse>
                transformer = GetCertificateAuthorityVersionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetCertificateAuthorityVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/GetCertificateAuthorityVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCertificateAuthorityVersionRequest,
                        GetCertificateAuthorityVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCertificateAuthorityVersionRequest,
                                GetCertificateAuthorityVersionResponse>,
                        java.util.concurrent.Future<GetCertificateAuthorityVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCertificateAuthorityVersionRequest, GetCertificateAuthorityVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCertificateVersionResponse> getCertificateVersion(
            GetCertificateVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateVersionRequest, GetCertificateVersionResponse>
                    handler) {
        LOG.trace("Called async getCertificateVersion");
        final GetCertificateVersionRequest interceptedRequest =
                GetCertificateVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateVersionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCertificateVersionResponse>
                transformer = GetCertificateVersionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "GetCertificateVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/GetCertificateVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCertificateVersionRequest, GetCertificateVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCertificateVersionRequest, GetCertificateVersionResponse>,
                        java.util.concurrent.Future<GetCertificateVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCertificateVersionRequest, GetCertificateVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResponse> listAssociations(
            ListAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociationsRequest, ListAssociationsResponse>
                    handler) {
        LOG.trace("Called async listAssociations");
        final ListAssociationsRequest interceptedRequest =
                ListAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAssociationsResponse>
                transformer = ListAssociationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListAssociations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/AssociationSummary/ListAssociations");

        com.oracle.bmc.responses.AsyncHandler<ListAssociationsRequest, ListAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAssociationsRequest, ListAssociationsResponse>,
                        java.util.concurrent.Future<ListAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAssociationsRequest, ListAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCaBundlesResponse> listCaBundles(
            ListCaBundlesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCaBundlesRequest, ListCaBundlesResponse>
                    handler) {
        LOG.trace("Called async listCaBundles");
        final ListCaBundlesRequest interceptedRequest =
                ListCaBundlesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCaBundlesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCaBundlesResponse>
                transformer = ListCaBundlesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListCaBundles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundleSummary/ListCaBundles");

        com.oracle.bmc.responses.AsyncHandler<ListCaBundlesRequest, ListCaBundlesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCaBundlesRequest, ListCaBundlesResponse>,
                        java.util.concurrent.Future<ListCaBundlesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCaBundlesRequest, ListCaBundlesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthoritiesResponse>
            listCertificateAuthorities(
                    ListCertificateAuthoritiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthoritiesRequest,
                                    ListCertificateAuthoritiesResponse>
                            handler) {
        LOG.trace("Called async listCertificateAuthorities");
        final ListCertificateAuthoritiesRequest interceptedRequest =
                ListCertificateAuthoritiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificateAuthoritiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCertificateAuthoritiesResponse>
                transformer = ListCertificateAuthoritiesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListCertificateAuthorities",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthoritySummary/ListCertificateAuthorities");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificateAuthoritiesRequest,
                                ListCertificateAuthoritiesResponse>,
                        java.util.concurrent.Future<ListCertificateAuthoritiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthorityVersionsResponse>
            listCertificateAuthorityVersions(
                    ListCertificateAuthorityVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthorityVersionsRequest,
                                    ListCertificateAuthorityVersionsResponse>
                            handler) {
        LOG.trace("Called async listCertificateAuthorityVersions");
        final ListCertificateAuthorityVersionsRequest interceptedRequest =
                ListCertificateAuthorityVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificateAuthorityVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCertificateAuthorityVersionsResponse>
                transformer = ListCertificateAuthorityVersionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListCertificateAuthorityVersions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersionSummary/ListCertificateAuthorityVersions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCertificateAuthorityVersionsRequest,
                        ListCertificateAuthorityVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificateAuthorityVersionsRequest,
                                ListCertificateAuthorityVersionsResponse>,
                        java.util.concurrent.Future<ListCertificateAuthorityVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificateAuthorityVersionsRequest,
                    ListCertificateAuthorityVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCertificateVersionsResponse> listCertificateVersions(
            ListCertificateVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificateVersionsRequest, ListCertificateVersionsResponse>
                    handler) {
        LOG.trace("Called async listCertificateVersions");
        final ListCertificateVersionsRequest interceptedRequest =
                ListCertificateVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificateVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCertificateVersionsResponse>
                transformer = ListCertificateVersionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListCertificateVersions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersionSummary/ListCertificateVersions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCertificateVersionsRequest, ListCertificateVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificateVersionsRequest, ListCertificateVersionsResponse>,
                        java.util.concurrent.Future<ListCertificateVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificateVersionsRequest, ListCertificateVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {
        LOG.trace("Called async listCertificates");
        final ListCertificatesRequest interceptedRequest =
                ListCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer = ListCertificatesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ListCertificates",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateSummary/ListCertificates");

        com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificatesRequest, ListCertificatesResponse>,
                        java.util.concurrent.Future<ListCertificatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificatesRequest, ListCertificatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateAuthorityVersionResponse>
            revokeCertificateAuthorityVersion(
                    RevokeCertificateAuthorityVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RevokeCertificateAuthorityVersionRequest,
                                    RevokeCertificateAuthorityVersionResponse>
                            handler) {
        LOG.trace("Called async revokeCertificateAuthorityVersion");
        final RevokeCertificateAuthorityVersionRequest interceptedRequest =
                RevokeCertificateAuthorityVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RevokeCertificateAuthorityVersionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RevokeCertificateAuthorityVersionResponse>
                transformer = RevokeCertificateAuthorityVersionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "RevokeCertificateAuthorityVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/RevokeCertificateAuthorityVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        RevokeCertificateAuthorityVersionRequest,
                        RevokeCertificateAuthorityVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RevokeCertificateAuthorityVersionRequest,
                                RevokeCertificateAuthorityVersionResponse>,
                        java.util.concurrent.Future<RevokeCertificateAuthorityVersionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRevokeCertificateAuthorityVersionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RevokeCertificateAuthorityVersionRequest,
                    RevokeCertificateAuthorityVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateVersionResponse> revokeCertificateVersion(
            RevokeCertificateVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>
                    handler) {
        LOG.trace("Called async revokeCertificateVersion");
        final RevokeCertificateVersionRequest interceptedRequest =
                RevokeCertificateVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RevokeCertificateVersionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RevokeCertificateVersionResponse>
                transformer = RevokeCertificateVersionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "RevokeCertificateVersion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/RevokeCertificateVersion");

        com.oracle.bmc.responses.AsyncHandler<
                        RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>,
                        java.util.concurrent.Future<RevokeCertificateVersionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRevokeCertificateVersionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateAuthorityDeletionResponse>
            scheduleCertificateAuthorityDeletion(
                    ScheduleCertificateAuthorityDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityDeletionRequest,
                                    ScheduleCertificateAuthorityDeletionResponse>
                            handler) {
        LOG.trace("Called async scheduleCertificateAuthorityDeletion");
        final ScheduleCertificateAuthorityDeletionRequest interceptedRequest =
                ScheduleCertificateAuthorityDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScheduleCertificateAuthorityDeletionConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ScheduleCertificateAuthorityDeletionResponse>
                transformer = ScheduleCertificateAuthorityDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ScheduleCertificateAuthorityDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/ScheduleCertificateAuthorityDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        ScheduleCertificateAuthorityDeletionRequest,
                        ScheduleCertificateAuthorityDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScheduleCertificateAuthorityDeletionRequest,
                                ScheduleCertificateAuthorityDeletionResponse>,
                        java.util.concurrent.Future<ScheduleCertificateAuthorityDeletionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScheduleCertificateAuthorityDeletionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScheduleCertificateAuthorityDeletionRequest,
                    ScheduleCertificateAuthorityDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateAuthorityVersionDeletionResponse>
            scheduleCertificateAuthorityVersionDeletion(
                    ScheduleCertificateAuthorityVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityVersionDeletionRequest,
                                    ScheduleCertificateAuthorityVersionDeletionResponse>
                            handler) {
        LOG.trace("Called async scheduleCertificateAuthorityVersionDeletion");
        final ScheduleCertificateAuthorityVersionDeletionRequest interceptedRequest =
                ScheduleCertificateAuthorityVersionDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScheduleCertificateAuthorityVersionDeletionConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ScheduleCertificateAuthorityVersionDeletionResponse>
                transformer = ScheduleCertificateAuthorityVersionDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ScheduleCertificateAuthorityVersionDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/ScheduleCertificateAuthorityVersionDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        ScheduleCertificateAuthorityVersionDeletionRequest,
                        ScheduleCertificateAuthorityVersionDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScheduleCertificateAuthorityVersionDeletionRequest,
                                ScheduleCertificateAuthorityVersionDeletionResponse>,
                        java.util.concurrent.Future<
                                ScheduleCertificateAuthorityVersionDeletionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getScheduleCertificateAuthorityVersionDeletionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScheduleCertificateAuthorityVersionDeletionRequest,
                    ScheduleCertificateAuthorityVersionDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateDeletionResponse>
            scheduleCertificateDeletion(
                    ScheduleCertificateDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateDeletionRequest,
                                    ScheduleCertificateDeletionResponse>
                            handler) {
        LOG.trace("Called async scheduleCertificateDeletion");
        final ScheduleCertificateDeletionRequest interceptedRequest =
                ScheduleCertificateDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScheduleCertificateDeletionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ScheduleCertificateDeletionResponse>
                transformer = ScheduleCertificateDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ScheduleCertificateDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/ScheduleCertificateDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        ScheduleCertificateDeletionRequest, ScheduleCertificateDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScheduleCertificateDeletionRequest,
                                ScheduleCertificateDeletionResponse>,
                        java.util.concurrent.Future<ScheduleCertificateDeletionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScheduleCertificateDeletionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScheduleCertificateDeletionRequest, ScheduleCertificateDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateVersionDeletionResponse>
            scheduleCertificateVersionDeletion(
                    ScheduleCertificateVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateVersionDeletionRequest,
                                    ScheduleCertificateVersionDeletionResponse>
                            handler) {
        LOG.trace("Called async scheduleCertificateVersionDeletion");
        final ScheduleCertificateVersionDeletionRequest interceptedRequest =
                ScheduleCertificateVersionDeletionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScheduleCertificateVersionDeletionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ScheduleCertificateVersionDeletionResponse>
                transformer = ScheduleCertificateVersionDeletionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "ScheduleCertificateVersionDeletion",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/ScheduleCertificateVersionDeletion");

        com.oracle.bmc.responses.AsyncHandler<
                        ScheduleCertificateVersionDeletionRequest,
                        ScheduleCertificateVersionDeletionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScheduleCertificateVersionDeletionRequest,
                                ScheduleCertificateVersionDeletionResponse>,
                        java.util.concurrent.Future<ScheduleCertificateVersionDeletionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScheduleCertificateVersionDeletionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScheduleCertificateVersionDeletionRequest,
                    ScheduleCertificateVersionDeletionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCaBundleResponse> updateCaBundle(
            UpdateCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCaBundleRequest, UpdateCaBundleResponse>
                    handler) {
        LOG.trace("Called async updateCaBundle");
        final UpdateCaBundleRequest interceptedRequest =
                UpdateCaBundleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCaBundleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCaBundleResponse>
                transformer = UpdateCaBundleConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "UpdateCaBundle",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/UpdateCaBundle");

        com.oracle.bmc.responses.AsyncHandler<UpdateCaBundleRequest, UpdateCaBundleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCaBundleRequest, UpdateCaBundleResponse>,
                        java.util.concurrent.Future<UpdateCaBundleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCaBundleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCaBundleRequest, UpdateCaBundleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler) {
        LOG.trace("Called async updateCertificate");
        final UpdateCertificateRequest interceptedRequest =
                UpdateCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCertificateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCertificateResponse>
                transformer = UpdateCertificateConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "UpdateCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/UpdateCertificate");

        com.oracle.bmc.responses.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCertificateRequest, UpdateCertificateResponse>,
                        java.util.concurrent.Future<UpdateCertificateResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCertificateRequest, UpdateCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateAuthorityResponse>
            updateCertificateAuthority(
                    UpdateCertificateAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCertificateAuthorityRequest,
                                    UpdateCertificateAuthorityResponse>
                            handler) {
        LOG.trace("Called async updateCertificateAuthority");
        final UpdateCertificateAuthorityRequest interceptedRequest =
                UpdateCertificateAuthorityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCertificateAuthorityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCertificateAuthorityResponse>
                transformer = UpdateCertificateAuthorityConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "CertificatesManagement",
                "UpdateCertificateAuthority",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/UpdateCertificateAuthority");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCertificateAuthorityRequest,
                                UpdateCertificateAuthorityResponse>,
                        java.util.concurrent.Future<UpdateCertificateAuthorityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCertificateAuthorityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
