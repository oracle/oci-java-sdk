/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.internal.http.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

/**
 * Async client implementation for ObjectStorage service. <br/>
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
public class ObjectStorageAsyncClient implements ObjectStorageAsync {
    /**
     * Service instance for ObjectStorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OBJECTSTORAGE")
                    .serviceEndpointPrefix("objectstorage")
                    .serviceEndpointTemplate("https://objectstorage.{region}.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ObjectStorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .defaultConfigurator(
                                new com.oracle.bmc.http.DefaultConfigurator.NonBuffering())
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
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
        this.client = restClientFactory.create(defaultRequestSigner, requestSigners, configuration);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ObjectStorageAsyncClient> {
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
        public ObjectStorageAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new ObjectStorageAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
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
    public java.util.concurrent.Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AbortMultipartUploadRequest, AbortMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async abortMultipartUpload");
        final AbortMultipartUploadRequest interceptedRequest =
                AbortMultipartUploadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AbortMultipartUploadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AbortMultipartUploadResponse>
                transformer = AbortMultipartUploadConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        AbortMultipartUploadRequest, AbortMultipartUploadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AbortMultipartUploadRequest, AbortMultipartUploadResponse>,
                        java.util.concurrent.Future<AbortMultipartUploadResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AbortMultipartUploadRequest, AbortMultipartUploadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer = CancelWorkRequestConverter.fromResponse();

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
    public java.util.concurrent.Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CommitMultipartUploadRequest, CommitMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async commitMultipartUpload");
        final CommitMultipartUploadRequest interceptedRequest =
                CommitMultipartUploadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CommitMultipartUploadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CommitMultipartUploadResponse>
                transformer = CommitMultipartUploadConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CommitMultipartUploadRequest, CommitMultipartUploadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CommitMultipartUploadRequest, CommitMultipartUploadResponse>,
                        java.util.concurrent.Future<CommitMultipartUploadResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CommitMultipartUploadRequest, CommitMultipartUploadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CopyObjectResponse> copyObject(
            CopyObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CopyObjectRequest, CopyObjectResponse>
                    handler) {
        LOG.trace("Called async copyObject");
        final CopyObjectRequest interceptedRequest = CopyObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CopyObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CopyObjectResponse>
                transformer = CopyObjectConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CopyObjectRequest, CopyObjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CopyObjectRequest, CopyObjectResponse>,
                        java.util.concurrent.Future<CopyObjectResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CopyObjectRequest, CopyObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBucketRequest, CreateBucketResponse>
                    handler) {
        LOG.trace("Called async createBucket");
        final CreateBucketRequest interceptedRequest =
                CreateBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateBucketResponse>
                transformer = CreateBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateBucketRequest, CreateBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBucketRequest, CreateBucketResponse>,
                        java.util.concurrent.Future<CreateBucketResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBucketRequest, CreateBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMultipartUploadRequest, CreateMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async createMultipartUpload");
        final CreateMultipartUploadRequest interceptedRequest =
                CreateMultipartUploadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMultipartUploadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateMultipartUploadResponse>
                transformer = CreateMultipartUploadConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateMultipartUploadRequest, CreateMultipartUploadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMultipartUploadRequest, CreateMultipartUploadResponse>,
                        java.util.concurrent.Future<CreateMultipartUploadResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMultipartUploadRequest, CreateMultipartUploadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePreauthenticatedRequestResponse>
            createPreauthenticatedRequest(
                    CreatePreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePreauthenticatedRequestRequest,
                                    CreatePreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async createPreauthenticatedRequest");
        final CreatePreauthenticatedRequestRequest interceptedRequest =
                CreatePreauthenticatedRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePreauthenticatedRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreatePreauthenticatedRequestResponse>
                transformer = CreatePreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreatePreauthenticatedRequestRequest, CreatePreauthenticatedRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePreauthenticatedRequestRequest,
                                CreatePreauthenticatedRequestResponse>,
                        java.util.concurrent.Future<CreatePreauthenticatedRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePreauthenticatedRequestRequest, CreatePreauthenticatedRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationPolicyResponse> createReplicationPolicy(
            CreateReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>
                    handler) {
        LOG.trace("Called async createReplicationPolicy");
        final CreateReplicationPolicyRequest interceptedRequest =
                CreateReplicationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReplicationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateReplicationPolicyResponse>
                transformer = CreateReplicationPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>,
                        java.util.concurrent.Future<CreateReplicationPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRetentionRuleResponse> createRetentionRule(
            CreateRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRetentionRuleRequest, CreateRetentionRuleResponse>
                    handler) {
        LOG.trace("Called async createRetentionRule");
        final CreateRetentionRuleRequest interceptedRequest =
                CreateRetentionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRetentionRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateRetentionRuleResponse>
                transformer = CreateRetentionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateRetentionRuleRequest, CreateRetentionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRetentionRuleRequest, CreateRetentionRuleResponse>,
                        java.util.concurrent.Future<CreateRetentionRuleResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRetentionRuleRequest, CreateRetentionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBucketRequest, DeleteBucketResponse>
                    handler) {
        LOG.trace("Called async deleteBucket");
        final DeleteBucketRequest interceptedRequest =
                DeleteBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBucketResponse>
                transformer = DeleteBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBucketRequest, DeleteBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBucketRequest, DeleteBucketResponse>,
                        java.util.concurrent.Future<DeleteBucketResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBucketRequest, DeleteBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteObjectRequest, DeleteObjectResponse>
                    handler) {
        LOG.trace("Called async deleteObject");
        final DeleteObjectRequest interceptedRequest =
                DeleteObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteObjectResponse>
                transformer = DeleteObjectConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteObjectRequest, DeleteObjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteObjectRequest, DeleteObjectResponse>,
                        java.util.concurrent.Future<DeleteObjectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteObjectRequest, DeleteObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectLifecyclePolicyResponse>
            deleteObjectLifecyclePolicy(
                    DeleteObjectLifecyclePolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteObjectLifecyclePolicyRequest,
                                    DeleteObjectLifecyclePolicyResponse>
                            handler) {
        LOG.trace("Called async deleteObjectLifecyclePolicy");
        final DeleteObjectLifecyclePolicyRequest interceptedRequest =
                DeleteObjectLifecyclePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteObjectLifecyclePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteObjectLifecyclePolicyResponse>
                transformer = DeleteObjectLifecyclePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteObjectLifecyclePolicyRequest, DeleteObjectLifecyclePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteObjectLifecyclePolicyRequest,
                                DeleteObjectLifecyclePolicyResponse>,
                        java.util.concurrent.Future<DeleteObjectLifecyclePolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteObjectLifecyclePolicyRequest, DeleteObjectLifecyclePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePreauthenticatedRequestResponse>
            deletePreauthenticatedRequest(
                    DeletePreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePreauthenticatedRequestRequest,
                                    DeletePreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async deletePreauthenticatedRequest");
        final DeletePreauthenticatedRequestRequest interceptedRequest =
                DeletePreauthenticatedRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePreauthenticatedRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeletePreauthenticatedRequestResponse>
                transformer = DeletePreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeletePreauthenticatedRequestRequest, DeletePreauthenticatedRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePreauthenticatedRequestRequest,
                                DeletePreauthenticatedRequestResponse>,
                        java.util.concurrent.Future<DeletePreauthenticatedRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePreauthenticatedRequestRequest, DeletePreauthenticatedRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationPolicyResponse> deleteReplicationPolicy(
            DeleteReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteReplicationPolicy");
        final DeleteReplicationPolicyRequest interceptedRequest =
                DeleteReplicationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReplicationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteReplicationPolicyResponse>
                transformer = DeleteReplicationPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>,
                        java.util.concurrent.Future<DeleteReplicationPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionRuleResponse> deleteRetentionRule(
            DeleteRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>
                    handler) {
        LOG.trace("Called async deleteRetentionRule");
        final DeleteRetentionRuleRequest interceptedRequest =
                DeleteRetentionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRetentionRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteRetentionRuleResponse>
                transformer = DeleteRetentionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>,
                        java.util.concurrent.Future<DeleteRetentionRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBucketResponse> getBucket(
            GetBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse>
                    handler) {
        LOG.trace("Called async getBucket");
        final GetBucketRequest interceptedRequest = GetBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBucketResponse>
                transformer = GetBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse>,
                        java.util.concurrent.Future<GetBucketResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBucketRequest, GetBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {
        LOG.trace("Called async getNamespace");
        final GetNamespaceRequest interceptedRequest =
                GetNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
                transformer = GetNamespaceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNamespaceRequest, GetNamespaceResponse>,
                        java.util.concurrent.Future<GetNamespaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNamespaceRequest, GetNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceMetadataResponse> getNamespaceMetadata(
            GetNamespaceMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>
                    handler) {
        LOG.trace("Called async getNamespaceMetadata");
        final GetNamespaceMetadataRequest interceptedRequest =
                GetNamespaceMetadataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceMetadataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetNamespaceMetadataResponse>
                transformer = GetNamespaceMetadataConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>,
                        java.util.concurrent.Future<GetNamespaceMetadataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetObjectResponse>
                transformer = GetObjectConverter.fromResponse();

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
    public java.util.concurrent.Future<GetObjectLifecyclePolicyResponse> getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>
                    handler) {
        LOG.trace("Called async getObjectLifecyclePolicy");
        final GetObjectLifecyclePolicyRequest interceptedRequest =
                GetObjectLifecyclePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetObjectLifecyclePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetObjectLifecyclePolicyResponse>
                transformer = GetObjectLifecyclePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>,
                        java.util.concurrent.Future<GetObjectLifecyclePolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPreauthenticatedRequestResponse>
            getPreauthenticatedRequest(
                    GetPreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPreauthenticatedRequestRequest,
                                    GetPreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async getPreauthenticatedRequest");
        final GetPreauthenticatedRequestRequest interceptedRequest =
                GetPreauthenticatedRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreauthenticatedRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetPreauthenticatedRequestResponse>
                transformer = GetPreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetPreauthenticatedRequestRequest, GetPreauthenticatedRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPreauthenticatedRequestRequest,
                                GetPreauthenticatedRequestResponse>,
                        java.util.concurrent.Future<GetPreauthenticatedRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPreauthenticatedRequestRequest, GetPreauthenticatedRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReplicationPolicyResponse> getReplicationPolicy(
            GetReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationPolicyRequest, GetReplicationPolicyResponse>
                    handler) {
        LOG.trace("Called async getReplicationPolicy");
        final GetReplicationPolicyRequest interceptedRequest =
                GetReplicationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReplicationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetReplicationPolicyResponse>
                transformer = GetReplicationPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetReplicationPolicyRequest, GetReplicationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReplicationPolicyRequest, GetReplicationPolicyResponse>,
                        java.util.concurrent.Future<GetReplicationPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReplicationPolicyRequest, GetReplicationPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRetentionRuleResponse> getRetentionRule(
            GetRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRetentionRuleRequest, GetRetentionRuleResponse>
                    handler) {
        LOG.trace("Called async getRetentionRule");
        final GetRetentionRuleRequest interceptedRequest =
                GetRetentionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRetentionRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetRetentionRuleResponse>
                transformer = GetRetentionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetRetentionRuleRequest, GetRetentionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRetentionRuleRequest, GetRetentionRuleResponse>,
                        java.util.concurrent.Future<GetRetentionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRetentionRuleRequest, GetRetentionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
    public java.util.concurrent.Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<HeadBucketRequest, HeadBucketResponse>
                    handler) {
        LOG.trace("Called async headBucket");
        final HeadBucketRequest interceptedRequest = HeadBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, HeadBucketResponse>
                transformer = HeadBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<HeadBucketRequest, HeadBucketResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadBucketRequest, HeadBucketResponse>,
                        java.util.concurrent.Future<HeadBucketResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadBucketRequest, HeadBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<HeadObjectResponse> headObject(
            HeadObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<HeadObjectRequest, HeadObjectResponse>
                    handler) {
        LOG.trace("Called async headObject");
        final HeadObjectRequest interceptedRequest = HeadObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, HeadObjectResponse>
                transformer = HeadObjectConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<HeadObjectRequest, HeadObjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                HeadObjectRequest, HeadObjectResponse>,
                        java.util.concurrent.Future<HeadObjectResponse>>
                futureSupplier = client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    HeadObjectRequest, HeadObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBucketsRequest, ListBucketsResponse>
                    handler) {
        LOG.trace("Called async listBuckets");
        final ListBucketsRequest interceptedRequest =
                ListBucketsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBucketsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBucketsResponse>
                transformer = ListBucketsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBucketsRequest, ListBucketsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBucketsRequest, ListBucketsResponse>,
                        java.util.concurrent.Future<ListBucketsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBucketsRequest, ListBucketsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler) {
        LOG.trace("Called async listMultipartUploadParts");
        final ListMultipartUploadPartsRequest interceptedRequest =
                ListMultipartUploadPartsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadPartsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMultipartUploadPartsResponse>
                transformer = ListMultipartUploadPartsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>,
                        java.util.concurrent.Future<ListMultipartUploadPartsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadsRequest, ListMultipartUploadsResponse>
                    handler) {
        LOG.trace("Called async listMultipartUploads");
        final ListMultipartUploadsRequest interceptedRequest =
                ListMultipartUploadsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMultipartUploadsResponse>
                transformer = ListMultipartUploadsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListMultipartUploadsRequest, ListMultipartUploadsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMultipartUploadsRequest, ListMultipartUploadsResponse>,
                        java.util.concurrent.Future<ListMultipartUploadsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMultipartUploadsRequest, ListMultipartUploadsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListObjectVersionsResponse> listObjectVersions(
            ListObjectVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectVersionsRequest, ListObjectVersionsResponse>
                    handler) {
        LOG.trace("Called async listObjectVersions");
        final ListObjectVersionsRequest interceptedRequest =
                ListObjectVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectVersionsResponse>
                transformer = ListObjectVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListObjectVersionsRequest, ListObjectVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListObjectVersionsRequest, ListObjectVersionsResponse>,
                        java.util.concurrent.Future<ListObjectVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListObjectVersionsRequest, ListObjectVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListObjectsRequest, ListObjectsResponse>
                    handler) {
        LOG.trace("Called async listObjects");
        final ListObjectsRequest interceptedRequest =
                ListObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectsResponse>
                transformer = ListObjectsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListObjectsRequest, ListObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListObjectsRequest, ListObjectsResponse>,
                        java.util.concurrent.Future<ListObjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListObjectsRequest, ListObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPreauthenticatedRequestsResponse>
            listPreauthenticatedRequests(
                    ListPreauthenticatedRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPreauthenticatedRequestsRequest,
                                    ListPreauthenticatedRequestsResponse>
                            handler) {
        LOG.trace("Called async listPreauthenticatedRequests");
        final ListPreauthenticatedRequestsRequest interceptedRequest =
                ListPreauthenticatedRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPreauthenticatedRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPreauthenticatedRequestsResponse>
                transformer = ListPreauthenticatedRequestsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListPreauthenticatedRequestsRequest, ListPreauthenticatedRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPreauthenticatedRequestsRequest,
                                ListPreauthenticatedRequestsResponse>,
                        java.util.concurrent.Future<ListPreauthenticatedRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPreauthenticatedRequestsRequest, ListPreauthenticatedRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReplicationPoliciesResponse> listReplicationPolicies(
            ListReplicationPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>
                    handler) {
        LOG.trace("Called async listReplicationPolicies");
        final ListReplicationPoliciesRequest interceptedRequest =
                ListReplicationPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReplicationPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListReplicationPoliciesResponse>
                transformer = ListReplicationPoliciesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>,
                        java.util.concurrent.Future<ListReplicationPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReplicationSourcesResponse> listReplicationSources(
            ListReplicationSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationSourcesRequest, ListReplicationSourcesResponse>
                    handler) {
        LOG.trace("Called async listReplicationSources");
        final ListReplicationSourcesRequest interceptedRequest =
                ListReplicationSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReplicationSourcesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListReplicationSourcesResponse>
                transformer = ListReplicationSourcesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListReplicationSourcesRequest, ListReplicationSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReplicationSourcesRequest, ListReplicationSourcesResponse>,
                        java.util.concurrent.Future<ListReplicationSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReplicationSourcesRequest, ListReplicationSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRetentionRulesResponse> listRetentionRules(
            ListRetentionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRetentionRulesRequest, ListRetentionRulesResponse>
                    handler) {
        LOG.trace("Called async listRetentionRules");
        final ListRetentionRulesRequest interceptedRequest =
                ListRetentionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRetentionRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRetentionRulesResponse>
                transformer = ListRetentionRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListRetentionRulesRequest, ListRetentionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRetentionRulesRequest, ListRetentionRulesResponse>,
                        java.util.concurrent.Future<ListRetentionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRetentionRulesRequest, ListRetentionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
    public java.util.concurrent.Future<MakeBucketWritableResponse> makeBucketWritable(
            MakeBucketWritableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MakeBucketWritableRequest, MakeBucketWritableResponse>
                    handler) {
        LOG.trace("Called async makeBucketWritable");
        final MakeBucketWritableRequest interceptedRequest =
                MakeBucketWritableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MakeBucketWritableConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, MakeBucketWritableResponse>
                transformer = MakeBucketWritableConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<MakeBucketWritableRequest, MakeBucketWritableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MakeBucketWritableRequest, MakeBucketWritableResponse>,
                        java.util.concurrent.Future<MakeBucketWritableResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MakeBucketWritableRequest, MakeBucketWritableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PutObjectResponse> putObject(
            PutObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse>
                    handler) {
        LOG.trace("Called async putObject");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, PutObjectRequest.builder());
        }
        final PutObjectRequest interceptedRequest = PutObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PutObjectResponse>
                transformer = PutObjectConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);

        com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse> handlerToUse =
                new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse>,
                        java.util.concurrent.Future<PutObjectResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutObjectRequest, PutObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getPutObjectBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PutObjectLifecyclePolicyResponse> putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>
                    handler) {
        LOG.trace("Called async putObjectLifecyclePolicy");
        final PutObjectLifecyclePolicyRequest interceptedRequest =
                PutObjectLifecyclePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutObjectLifecyclePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PutObjectLifecyclePolicyResponse>
                transformer = PutObjectLifecyclePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>,
                        java.util.concurrent.Future<PutObjectLifecyclePolicyResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ReencryptBucketResponse> reencryptBucket(
            ReencryptBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReencryptBucketRequest, ReencryptBucketResponse>
                    handler) {
        LOG.trace("Called async reencryptBucket");
        final ReencryptBucketRequest interceptedRequest =
                ReencryptBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReencryptBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ReencryptBucketResponse>
                transformer = ReencryptBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ReencryptBucketRequest, ReencryptBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReencryptBucketRequest, ReencryptBucketResponse>,
                        java.util.concurrent.Future<ReencryptBucketResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReencryptBucketRequest, ReencryptBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ReencryptObjectResponse> reencryptObject(
            ReencryptObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReencryptObjectRequest, ReencryptObjectResponse>
                    handler) {
        LOG.trace("Called async reencryptObject");
        final ReencryptObjectRequest interceptedRequest =
                ReencryptObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReencryptObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ReencryptObjectResponse>
                transformer = ReencryptObjectConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ReencryptObjectRequest, ReencryptObjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReencryptObjectRequest, ReencryptObjectResponse>,
                        java.util.concurrent.Future<ReencryptObjectResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReencryptObjectRequest, ReencryptObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RenameObjectResponse> renameObject(
            RenameObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RenameObjectRequest, RenameObjectResponse>
                    handler) {
        LOG.trace("Called async renameObject");
        final RenameObjectRequest interceptedRequest =
                RenameObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RenameObjectConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RenameObjectResponse>
                transformer = RenameObjectConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<RenameObjectRequest, RenameObjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RenameObjectRequest, RenameObjectResponse>,
                        java.util.concurrent.Future<RenameObjectResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RenameObjectRequest, RenameObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestoreObjectsResponse> restoreObjects(
            RestoreObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreObjectsRequest, RestoreObjectsResponse>
                    handler) {
        LOG.trace("Called async restoreObjects");
        final RestoreObjectsRequest interceptedRequest =
                RestoreObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreObjectsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RestoreObjectsResponse>
                transformer = RestoreObjectsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<RestoreObjectsRequest, RestoreObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestoreObjectsRequest, RestoreObjectsResponse>,
                        java.util.concurrent.Future<RestoreObjectsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestoreObjectsRequest, RestoreObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBucketRequest, UpdateBucketResponse>
                    handler) {
        LOG.trace("Called async updateBucket");
        final UpdateBucketRequest interceptedRequest =
                UpdateBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBucketResponse>
                transformer = UpdateBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateBucketRequest, UpdateBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBucketRequest, UpdateBucketResponse>,
                        java.util.concurrent.Future<UpdateBucketResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBucketRequest, UpdateBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceMetadataResponse> updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>
                    handler) {
        LOG.trace("Called async updateNamespaceMetadata");
        final UpdateNamespaceMetadataRequest interceptedRequest =
                UpdateNamespaceMetadataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamespaceMetadataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNamespaceMetadataResponse>
                transformer = UpdateNamespaceMetadataConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>,
                        java.util.concurrent.Future<UpdateNamespaceMetadataResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRetentionRuleResponse> updateRetentionRule(
            UpdateRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>
                    handler) {
        LOG.trace("Called async updateRetentionRule");
        final UpdateRetentionRuleRequest interceptedRequest =
                UpdateRetentionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRetentionRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateRetentionRuleResponse>
                transformer = UpdateRetentionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>,
                        java.util.concurrent.Future<UpdateRetentionRuleResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadPartResponse> uploadPart(
            UploadPartRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadPartRequest, UploadPartResponse>
                    handler) {
        LOG.trace("Called async uploadPart");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadPartRequest.builder());
        }
        final UploadPartRequest interceptedRequest = UploadPartConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadPartConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UploadPartResponse>
                transformer = UploadPartConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);

        com.oracle.bmc.responses.AsyncHandler<UploadPartRequest, UploadPartResponse> handlerToUse =
                new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadPartRequest, UploadPartResponse>,
                        java.util.concurrent.Future<UploadPartResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadPartRequest, UploadPartResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadPartBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
