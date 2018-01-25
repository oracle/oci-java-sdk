/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import java.util.Locale;
import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class BlockstorageAsyncClient implements BlockstorageAsync {
    /**
     * Service instance for Blockstorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("BLOCKSTORAGE", "iaas");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public BlockstorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BlockstorageAsyncClient(
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
    public BlockstorageAsyncClient(
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
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public BlockstorageAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
            }
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
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
        regionId = regionId.toLowerCase(Locale.ENGLISH);
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
    public java.util.concurrent.Future<CreateVolumeResponse> createVolume(
            final CreateVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                    handler) {
        LOG.trace("Called async createVolume");
        final CreateVolumeRequest interceptedRequest =
                CreateVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeResponse>
                transformer = CreateVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            CreateVolumeRequest, CreateVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateVolumeDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, CreateVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeBackupResponse> createVolumeBackup(
            final CreateVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async createVolumeBackup");
        final CreateVolumeBackupRequest interceptedRequest =
                CreateVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVolumeBackupResponse>
                transformer = CreateVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            CreateVolumeBackupRequest, CreateVolumeBackupResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateVolumeBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateVolumeBackupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, CreateVolumeBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateVolumeBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBootVolumeResponse> deleteBootVolume(
            final DeleteBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                    handler) {
        LOG.trace("Called async deleteBootVolume");
        final DeleteBootVolumeRequest interceptedRequest =
                DeleteBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBootVolumeResponse>
                transformer = DeleteBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DeleteBootVolumeRequest, DeleteBootVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, DeleteBootVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResponse> deleteVolume(
            final DeleteVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                    handler) {
        LOG.trace("Called async deleteVolume");
        final DeleteVolumeRequest interceptedRequest =
                DeleteVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeResponse>
                transformer = DeleteVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DeleteVolumeRequest, DeleteVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, DeleteVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeBackupResponse> deleteVolumeBackup(
            final DeleteVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async deleteVolumeBackup");
        final DeleteVolumeBackupRequest interceptedRequest =
                DeleteVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeBackupResponse>
                transformer = DeleteVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, DeleteVolumeBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBootVolumeResponse> getBootVolume(
            final GetBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                    handler) {
        LOG.trace("Called async getBootVolume");
        final GetBootVolumeRequest interceptedRequest =
                GetBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBootVolumeResponse>
                transformer = GetBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetBootVolumeRequest, GetBootVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, GetBootVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeResponse> getVolume(
            final GetVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse>
                    handler) {
        LOG.trace("Called async getVolume");
        final GetVolumeRequest interceptedRequest = GetVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeResponse>
                transformer = GetVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetVolumeRequest, GetVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, GetVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVolumeBackupResponse> getVolumeBackup(
            final GetVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeBackupRequest, GetVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async getVolumeBackup");
        final GetVolumeBackupRequest interceptedRequest =
                GetVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeBackupResponse>
                transformer = GetVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetVolumeBackupRequest, GetVolumeBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetVolumeBackupRequest, GetVolumeBackupResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, GetVolumeBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBootVolumesResponse> listBootVolumes(
            final ListBootVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumesRequest, ListBootVolumesResponse>
                    handler) {
        LOG.trace("Called async listBootVolumes");
        final ListBootVolumesRequest interceptedRequest =
                ListBootVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBootVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBootVolumesResponse>
                transformer = ListBootVolumesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBootVolumesRequest, ListBootVolumesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListBootVolumesRequest, ListBootVolumesResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, ListBootVolumesResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumeBackupsResponse> listVolumeBackups(
            final ListVolumeBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                    handler) {
        LOG.trace("Called async listVolumeBackups");
        final ListVolumeBackupsRequest interceptedRequest =
                ListVolumeBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumeBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeBackupsResponse>
                transformer = ListVolumeBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListVolumeBackupsRequest, ListVolumeBackupsResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, ListVolumeBackupsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVolumesResponse> listVolumes(
            final ListVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse>
                    handler) {
        LOG.trace("Called async listVolumes");
        final ListVolumesRequest interceptedRequest =
                ListVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumesResponse>
                transformer = ListVolumesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListVolumesRequest, ListVolumesResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, ListVolumesResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBootVolumeResponse> updateBootVolume(
            final UpdateBootVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                    handler) {
        LOG.trace("Called async updateBootVolume");
        final UpdateBootVolumeRequest interceptedRequest =
                UpdateBootVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBootVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBootVolumeResponse>
                transformer = UpdateBootVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateBootVolumeRequest, UpdateBootVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateBootVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateBootVolumeDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateBootVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateBootVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResponse> updateVolume(
            final UpdateVolumeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                    handler) {
        LOG.trace("Called async updateVolume");
        final UpdateVolumeRequest interceptedRequest =
                UpdateVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeResponse>
                transformer = UpdateVolumeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateVolumeRequest, UpdateVolumeResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateVolumeDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateVolumeResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateVolumeDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeBackupResponse> updateVolumeBackup(
            final UpdateVolumeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                    handler) {
        LOG.trace("Called async updateVolumeBackup");
        final UpdateVolumeBackupRequest interceptedRequest =
                UpdateVolumeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVolumeBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateVolumeBackupResponse>
                transformer = UpdateVolumeBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>(
                            (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateVolumeBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateVolumeBackupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateVolumeBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateVolumeBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }
}
