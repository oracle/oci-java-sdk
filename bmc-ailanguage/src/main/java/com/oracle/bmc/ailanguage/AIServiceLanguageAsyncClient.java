/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage;

import com.oracle.bmc.ailanguage.internal.http.*;
import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for AIServiceLanguage service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class AIServiceLanguageAsyncClient implements AIServiceLanguageAsync {
    /**
     * Service instance for AIServiceLanguage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AISERVICELANGUAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://language.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AIServiceLanguageAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public AIServiceLanguageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
                    Builder, AIServiceLanguageAsyncClient> {
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
        public AIServiceLanguageAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new AIServiceLanguageAsyncClient(
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
    public java.util.concurrent.Future<BatchDetectDominantLanguageResponse>
            batchDetectDominantLanguage(
                    BatchDetectDominantLanguageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectDominantLanguageRequest,
                                    BatchDetectDominantLanguageResponse>
                            handler) {
        LOG.trace("Called async batchDetectDominantLanguage");
        final BatchDetectDominantLanguageRequest interceptedRequest =
                BatchDetectDominantLanguageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchDetectDominantLanguageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "BatchDetectDominantLanguage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/BatchDetectDominantLanguage/BatchDetectDominantLanguage");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BatchDetectDominantLanguageResponse>
                transformer =
                        BatchDetectDominantLanguageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchDetectDominantLanguageRequest,
                                BatchDetectDominantLanguageResponse>,
                        java.util.concurrent.Future<BatchDetectDominantLanguageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBatchDetectDominantLanguageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageEntitiesResponse>
            batchDetectLanguageEntities(
                    BatchDetectLanguageEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageEntitiesRequest,
                                    BatchDetectLanguageEntitiesResponse>
                            handler) {
        LOG.trace("Called async batchDetectLanguageEntities");
        final BatchDetectLanguageEntitiesRequest interceptedRequest =
                BatchDetectLanguageEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchDetectLanguageEntitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/BatchDetectLanguageEntities/BatchDetectLanguageEntities");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BatchDetectLanguageEntitiesResponse>
                transformer =
                        BatchDetectLanguageEntitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BatchDetectLanguageEntitiesRequest, BatchDetectLanguageEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchDetectLanguageEntitiesRequest,
                                BatchDetectLanguageEntitiesResponse>,
                        java.util.concurrent.Future<BatchDetectLanguageEntitiesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBatchDetectLanguageEntitiesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchDetectLanguageEntitiesRequest, BatchDetectLanguageEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageKeyPhrasesResponse>
            batchDetectLanguageKeyPhrases(
                    BatchDetectLanguageKeyPhrasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageKeyPhrasesRequest,
                                    BatchDetectLanguageKeyPhrasesResponse>
                            handler) {
        LOG.trace("Called async batchDetectLanguageKeyPhrases");
        final BatchDetectLanguageKeyPhrasesRequest interceptedRequest =
                BatchDetectLanguageKeyPhrasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchDetectLanguageKeyPhrasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageKeyPhrases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/BatchDetectLanguageKeyPhrases/BatchDetectLanguageKeyPhrases");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BatchDetectLanguageKeyPhrasesResponse>
                transformer =
                        BatchDetectLanguageKeyPhrasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BatchDetectLanguageKeyPhrasesRequest, BatchDetectLanguageKeyPhrasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchDetectLanguageKeyPhrasesRequest,
                                BatchDetectLanguageKeyPhrasesResponse>,
                        java.util.concurrent.Future<BatchDetectLanguageKeyPhrasesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBatchDetectLanguageKeyPhrasesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchDetectLanguageKeyPhrasesRequest, BatchDetectLanguageKeyPhrasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageSentimentsResponse>
            batchDetectLanguageSentiments(
                    BatchDetectLanguageSentimentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageSentimentsRequest,
                                    BatchDetectLanguageSentimentsResponse>
                            handler) {
        LOG.trace("Called async batchDetectLanguageSentiments");
        final BatchDetectLanguageSentimentsRequest interceptedRequest =
                BatchDetectLanguageSentimentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchDetectLanguageSentimentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageSentiments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/BatchDetectLanguageSentiments/BatchDetectLanguageSentiments");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BatchDetectLanguageSentimentsResponse>
                transformer =
                        BatchDetectLanguageSentimentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BatchDetectLanguageSentimentsRequest, BatchDetectLanguageSentimentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchDetectLanguageSentimentsRequest,
                                BatchDetectLanguageSentimentsResponse>,
                        java.util.concurrent.Future<BatchDetectLanguageSentimentsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBatchDetectLanguageSentimentsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchDetectLanguageSentimentsRequest, BatchDetectLanguageSentimentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageTextClassificationResponse>
            batchDetectLanguageTextClassification(
                    BatchDetectLanguageTextClassificationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageTextClassificationRequest,
                                    BatchDetectLanguageTextClassificationResponse>
                            handler) {
        LOG.trace("Called async batchDetectLanguageTextClassification");
        final BatchDetectLanguageTextClassificationRequest interceptedRequest =
                BatchDetectLanguageTextClassificationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchDetectLanguageTextClassificationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageTextClassification",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/BatchDetectLanguageTextClassification/BatchDetectLanguageTextClassification");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BatchDetectLanguageTextClassificationResponse>
                transformer =
                        BatchDetectLanguageTextClassificationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BatchDetectLanguageTextClassificationRequest,
                        BatchDetectLanguageTextClassificationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchDetectLanguageTextClassificationRequest,
                                BatchDetectLanguageTextClassificationResponse>,
                        java.util.concurrent.Future<BatchDetectLanguageTextClassificationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getBatchDetectLanguageTextClassificationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchDetectLanguageTextClassificationRequest,
                    BatchDetectLanguageTextClassificationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetectDominantLanguageResponse> detectDominantLanguage(
            DetectDominantLanguageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectDominantLanguageRequest, DetectDominantLanguageResponse>
                    handler) {
        LOG.trace("Called async detectDominantLanguage");
        final DetectDominantLanguageRequest interceptedRequest =
                DetectDominantLanguageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetectDominantLanguageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "DetectDominantLanguage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/DetectDominantLanguage/DetectDominantLanguage");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetectDominantLanguageResponse>
                transformer =
                        DetectDominantLanguageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetectDominantLanguageRequest, DetectDominantLanguageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetectDominantLanguageRequest, DetectDominantLanguageResponse>,
                        java.util.concurrent.Future<DetectDominantLanguageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetectDominantLanguageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetectDominantLanguageRequest, DetectDominantLanguageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageEntitiesResponse> detectLanguageEntities(
            DetectLanguageEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>
                    handler) {
        LOG.trace("Called async detectLanguageEntities");
        final DetectLanguageEntitiesRequest interceptedRequest =
                DetectLanguageEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetectLanguageEntitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/DetectLanguageEntities/DetectLanguageEntities");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetectLanguageEntitiesResponse>
                transformer =
                        DetectLanguageEntitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>,
                        java.util.concurrent.Future<DetectLanguageEntitiesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetectLanguageEntitiesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageKeyPhrasesResponse> detectLanguageKeyPhrases(
            DetectLanguageKeyPhrasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>
                    handler) {
        LOG.trace("Called async detectLanguageKeyPhrases");
        final DetectLanguageKeyPhrasesRequest interceptedRequest =
                DetectLanguageKeyPhrasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetectLanguageKeyPhrasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageKeyPhrases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/DetectLanguageKeyPhrases/DetectLanguageKeyPhrases");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetectLanguageKeyPhrasesResponse>
                transformer =
                        DetectLanguageKeyPhrasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>,
                        java.util.concurrent.Future<DetectLanguageKeyPhrasesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetectLanguageKeyPhrasesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageSentimentsResponse> detectLanguageSentiments(
            DetectLanguageSentimentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>
                    handler) {
        LOG.trace("Called async detectLanguageSentiments");
        final DetectLanguageSentimentsRequest interceptedRequest =
                DetectLanguageSentimentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetectLanguageSentimentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageSentiments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/DetectLanguageSentiments/DetectLanguageSentiments");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetectLanguageSentimentsResponse>
                transformer =
                        DetectLanguageSentimentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>,
                        java.util.concurrent.Future<DetectLanguageSentimentsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetectLanguageSentimentsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageTextClassificationResponse>
            detectLanguageTextClassification(
                    DetectLanguageTextClassificationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetectLanguageTextClassificationRequest,
                                    DetectLanguageTextClassificationResponse>
                            handler) {
        LOG.trace("Called async detectLanguageTextClassification");
        final DetectLanguageTextClassificationRequest interceptedRequest =
                DetectLanguageTextClassificationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetectLanguageTextClassificationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageTextClassification",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/language/20210101/DetectLanguageTextClassification/DetectLanguageTextClassification");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetectLanguageTextClassificationResponse>
                transformer =
                        DetectLanguageTextClassificationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetectLanguageTextClassificationRequest,
                        DetectLanguageTextClassificationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetectLanguageTextClassificationRequest,
                                DetectLanguageTextClassificationResponse>,
                        java.util.concurrent.Future<DetectLanguageTextClassificationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetectLanguageTextClassificationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetectLanguageTextClassificationRequest,
                    DetectLanguageTextClassificationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
