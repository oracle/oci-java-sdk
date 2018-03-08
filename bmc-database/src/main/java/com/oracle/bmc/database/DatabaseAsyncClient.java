/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database;

import java.util.Locale;
import com.oracle.bmc.database.internal.http.*;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class DatabaseAsyncClient implements DatabaseAsync {
    /**
     * Service instance for Database.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("DATABASE", "database");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
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
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
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
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public DatabaseAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
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

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder {
        protected com.oracle.bmc.ClientConfiguration configuration;
        protected com.oracle.bmc.http.ClientConfigurator clientConfigurator;
        protected java.util.List<com.oracle.bmc.http.ClientConfigurator>
                additionalClientConfigurators = new java.util.ArrayList<>();
        protected com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory =
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD);

        private Builder() {}

        private Builder(
                com.oracle.bmc.ClientConfiguration configuration,
                com.oracle.bmc.http.ClientConfigurator clientConfigurator,
                java.util.List<com.oracle.bmc.http.ClientConfigurator>
                        additionalClientConfigurators,
                com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
            this.configuration = configuration;
            this.clientConfigurator = clientConfigurator;
            this.additionalClientConfigurators = additionalClientConfigurators;
        }

        /**
         * Set the configuration. May be null.
         * @param configuration configuration. May be null.
         * @return this builder
         */
        public Builder configuration(com.oracle.bmc.ClientConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Set the client configurator. May be null.
         * @param clientConfigurator client configurator. May be null.
         * @return this builder
         */
        public Builder clientConfigurator(
                com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
            this.clientConfigurator = clientConfigurator;
            return this;
        }

        /**
         * Add an additional client configurator to be run after the primary configurator.
         * @param additionalClientConfigurator the additional client configurator
         * @return this builder
         */
        public Builder additionalClientConfigurator(
                @lombok.NonNull
                com.oracle.bmc.http.ClientConfigurator additionalClientConfigurator) {
            this.additionalClientConfigurators.add(additionalClientConfigurator);
            return this;
        }

        /**
         * Set the request signer factory. May be null.
         * @param requestSignerFactory request signer factory. May be null.
         * @return this builder
         */
        public Builder requestSignerFactory(
                com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
            if (requestSignerFactory == null) {
                this.requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
            } else {
                this.requestSignerFactory = requestSignerFactory;
            }
            return this;
        }

        /**
         * Build the client, with the authentication details provider.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DatabaseAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DatabaseAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    additionalClientConfigurators);
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
    public java.util.concurrent.Future<CreateBackupResponse> createBackup(
            final CreateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
        LOG.trace("Called async createBackup");
        final CreateBackupRequest interceptedRequest =
                CreateBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackupResponse>
                transformer = CreateBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            CreateBackupRequest, CreateBackupResponse>(
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
                                    interceptedRequest.getCreateBackupDetails(),
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
                        interceptedRequest.getCreateBackupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, CreateBackupResponse>(
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
                                    interceptedRequest.getCreateBackupDetails(),
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
    public java.util.concurrent.Future<CreateDataGuardAssociationResponse>
            createDataGuardAssociation(
                    final CreateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataGuardAssociationRequest,
                                    CreateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async createDataGuardAssociation");
        final CreateDataGuardAssociationRequest interceptedRequest =
                CreateDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataGuardAssociationResponse>
                transformer = CreateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>(
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
                                    interceptedRequest.getCreateDataGuardAssociationDetails(),
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
                        interceptedRequest.getCreateDataGuardAssociationDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, CreateDataGuardAssociationResponse>(
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
                                    interceptedRequest.getCreateDataGuardAssociationDetails(),
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
    public java.util.concurrent.Future<CreateDbHomeResponse> createDbHome(
            final CreateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                    handler) {
        LOG.trace("Called async createDbHome");
        final CreateDbHomeRequest interceptedRequest =
                CreateDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbHomeResponse>
                transformer = CreateDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            CreateDbHomeRequest, CreateDbHomeResponse>(
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
                                    interceptedRequest.getCreateDbHomeWithDbSystemIdDetails(),
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
                        interceptedRequest.getCreateDbHomeWithDbSystemIdDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, CreateDbHomeResponse>(
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
                                    interceptedRequest.getCreateDbHomeWithDbSystemIdDetails(),
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
    public java.util.concurrent.Future<DbNodeActionResponse> dbNodeAction(
            final DbNodeActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                    handler) {
        LOG.trace("Called async dbNodeAction");
        final DbNodeActionRequest interceptedRequest =
                DbNodeActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DbNodeActionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DbNodeActionResponse>
                transformer = DbNodeActionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DbNodeActionRequest, DbNodeActionResponse>(
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
                            client.post(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, DbNodeActionResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            final DeleteBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {
        LOG.trace("Called async deleteBackup");
        final DeleteBackupRequest interceptedRequest =
                DeleteBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackupResponse>
                transformer = DeleteBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DeleteBackupRequest, DeleteBackupResponse>(
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
                    javax.ws.rs.core.Response, DeleteBackupResponse>(
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
    public java.util.concurrent.Future<DeleteDbHomeResponse> deleteDbHome(
            final DeleteDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                    handler) {
        LOG.trace("Called async deleteDbHome");
        final DeleteDbHomeRequest interceptedRequest =
                DeleteDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbHomeResponse>
                transformer = DeleteDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            DeleteDbHomeRequest, DeleteDbHomeResponse>(
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
                    javax.ws.rs.core.Response, DeleteDbHomeResponse>(
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
    public java.util.concurrent.Future<FailoverDataGuardAssociationResponse>
            failoverDataGuardAssociation(
                    final FailoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    FailoverDataGuardAssociationRequest,
                                    FailoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async failoverDataGuardAssociation");
        final FailoverDataGuardAssociationRequest interceptedRequest =
                FailoverDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailoverDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
                transformer = FailoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        FailoverDataGuardAssociationRequest, FailoverDataGuardAssociationResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            FailoverDataGuardAssociationRequest,
                            FailoverDataGuardAssociationResponse>(
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
                                    interceptedRequest.getFailoverDataGuardAssociationDetails(),
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
                        interceptedRequest.getFailoverDataGuardAssociationDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>(
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
                                    interceptedRequest.getFailoverDataGuardAssociationDetails(),
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
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            final GetBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>
                    handler) {
        LOG.trace("Called async getBackup");
        final GetBackupRequest interceptedRequest = GetBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBackupResponse>
                transformer = GetBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetBackupRequest, GetBackupResponse>(
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
                    javax.ws.rs.core.Response, GetBackupResponse>(
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
    public java.util.concurrent.Future<GetDataGuardAssociationResponse> getDataGuardAssociation(
            final GetDataGuardAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                    handler) {
        LOG.trace("Called async getDataGuardAssociation");
        final GetDataGuardAssociationRequest interceptedRequest =
                GetDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataGuardAssociationResponse>
                transformer = GetDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>(
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
                    javax.ws.rs.core.Response, GetDataGuardAssociationResponse>(
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
    public java.util.concurrent.Future<GetDatabaseResponse> getDatabase(
            final GetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getDatabase");
        final GetDatabaseRequest interceptedRequest =
                GetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseResponse>
                transformer = GetDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDatabaseRequest, GetDatabaseResponse>(
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
                    javax.ws.rs.core.Response, GetDatabaseResponse>(
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
    public java.util.concurrent.Future<GetDbHomeResponse> getDbHome(
            final GetDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse>
                    handler) {
        LOG.trace("Called async getDbHome");
        final GetDbHomeRequest interceptedRequest = GetDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomeResponse>
                transformer = GetDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbHomeRequest, GetDbHomeResponse>(
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
                    javax.ws.rs.core.Response, GetDbHomeResponse>(
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
    public java.util.concurrent.Future<GetDbHomePatchResponse> getDbHomePatch(
            final GetDbHomePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbHomePatchRequest, GetDbHomePatchResponse>
                    handler) {
        LOG.trace("Called async getDbHomePatch");
        final GetDbHomePatchRequest interceptedRequest =
                GetDbHomePatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomePatchResponse>
                transformer = GetDbHomePatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbHomePatchRequest, GetDbHomePatchResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbHomePatchRequest, GetDbHomePatchResponse>(
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
                    javax.ws.rs.core.Response, GetDbHomePatchResponse>(
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
    public java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse>
            getDbHomePatchHistoryEntry(
                    final GetDbHomePatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbHomePatchHistoryEntryRequest,
                                    GetDbHomePatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbHomePatchHistoryEntry");
        final GetDbHomePatchHistoryEntryRequest interceptedRequest =
                GetDbHomePatchHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbHomePatchHistoryEntryResponse>
                transformer = GetDbHomePatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDbHomePatchHistoryEntryRequest, GetDbHomePatchHistoryEntryResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbHomePatchHistoryEntryRequest, GetDbHomePatchHistoryEntryResponse>(
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
                    javax.ws.rs.core.Response, GetDbHomePatchHistoryEntryResponse>(
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
    public java.util.concurrent.Future<GetDbNodeResponse> getDbNode(
            final GetDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse>
                    handler) {
        LOG.trace("Called async getDbNode");
        final GetDbNodeRequest interceptedRequest = GetDbNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbNodeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbNodeResponse>
                transformer = GetDbNodeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbNodeRequest, GetDbNodeResponse>(
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
                    javax.ws.rs.core.Response, GetDbNodeResponse>(
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
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            final GetDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {
        LOG.trace("Called async getDbSystem");
        final GetDbSystemRequest interceptedRequest =
                GetDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemResponse>
                transformer = GetDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbSystemRequest, GetDbSystemResponse>(
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
                    javax.ws.rs.core.Response, GetDbSystemResponse>(
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
    public java.util.concurrent.Future<GetDbSystemPatchResponse> getDbSystemPatch(
            final GetDbSystemPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                    handler) {
        LOG.trace("Called async getDbSystemPatch");
        final GetDbSystemPatchRequest interceptedRequest =
                GetDbSystemPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemPatchResponse>
                transformer = GetDbSystemPatchConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbSystemPatchRequest, GetDbSystemPatchResponse>(
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
                    javax.ws.rs.core.Response, GetDbSystemPatchResponse>(
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
    public java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse>
            getDbSystemPatchHistoryEntry(
                    final GetDbSystemPatchHistoryEntryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemPatchHistoryEntryRequest,
                                    GetDbSystemPatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbSystemPatchHistoryEntry");
        final GetDbSystemPatchHistoryEntryRequest interceptedRequest =
                GetDbSystemPatchHistoryEntryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchHistoryEntryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbSystemPatchHistoryEntryResponse>
                transformer = GetDbSystemPatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDbSystemPatchHistoryEntryRequest, GetDbSystemPatchHistoryEntryResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            GetDbSystemPatchHistoryEntryRequest,
                            GetDbSystemPatchHistoryEntryResponse>(
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
                    javax.ws.rs.core.Response, GetDbSystemPatchHistoryEntryResponse>(
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
    public java.util.concurrent.Future<LaunchDbSystemResponse> launchDbSystem(
            final LaunchDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LaunchDbSystemRequest, LaunchDbSystemResponse>
                    handler) {
        LOG.trace("Called async launchDbSystem");
        final LaunchDbSystemRequest interceptedRequest =
                LaunchDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, LaunchDbSystemResponse>
                transformer = LaunchDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<LaunchDbSystemRequest, LaunchDbSystemResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            LaunchDbSystemRequest, LaunchDbSystemResponse>(
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
                                    interceptedRequest.getLaunchDbSystemDetails(),
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
                        interceptedRequest.getLaunchDbSystemDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, LaunchDbSystemResponse>(
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
                                    interceptedRequest.getLaunchDbSystemDetails(),
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
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            final ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {
        LOG.trace("Called async listBackups");
        final ListBackupsRequest interceptedRequest =
                ListBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBackupsResponse>
                transformer = ListBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListBackupsRequest, ListBackupsResponse>(
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
                    javax.ws.rs.core.Response, ListBackupsResponse>(
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
    public java.util.concurrent.Future<ListDataGuardAssociationsResponse> listDataGuardAssociations(
            final ListDataGuardAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                    handler) {
        LOG.trace("Called async listDataGuardAssociations");
        final ListDataGuardAssociationsRequest interceptedRequest =
                ListDataGuardAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataGuardAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataGuardAssociationsResponse>
                transformer = ListDataGuardAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>(
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
                    javax.ws.rs.core.Response, ListDataGuardAssociationsResponse>(
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
    public java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            final ListDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler) {
        LOG.trace("Called async listDatabases");
        final ListDatabasesRequest interceptedRequest =
                ListDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDatabasesResponse>
                transformer = ListDatabasesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDatabasesRequest, ListDatabasesResponse>(
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
                    javax.ws.rs.core.Response, ListDatabasesResponse>(
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
    public java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntries(
                    final ListDbHomePatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbHomePatchHistoryEntriesRequest,
                                    ListDbHomePatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbHomePatchHistoryEntries");
        final ListDbHomePatchHistoryEntriesRequest interceptedRequest =
                ListDbHomePatchHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbHomePatchHistoryEntriesResponse>
                transformer = ListDbHomePatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbHomePatchHistoryEntriesRequest, ListDbHomePatchHistoryEntriesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbHomePatchHistoryEntriesRequest,
                            ListDbHomePatchHistoryEntriesResponse>(
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
                    javax.ws.rs.core.Response, ListDbHomePatchHistoryEntriesResponse>(
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
    public java.util.concurrent.Future<ListDbHomePatchesResponse> listDbHomePatches(
            final ListDbHomePatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                    handler) {
        LOG.trace("Called async listDbHomePatches");
        final ListDbHomePatchesRequest interceptedRequest =
                ListDbHomePatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomePatchesResponse>
                transformer = ListDbHomePatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>(
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
                    javax.ws.rs.core.Response, ListDbHomePatchesResponse>(
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
    public java.util.concurrent.Future<ListDbHomesResponse> listDbHomes(
            final ListDbHomesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                    handler) {
        LOG.trace("Called async listDbHomes");
        final ListDbHomesRequest interceptedRequest =
                ListDbHomesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomesResponse>
                transformer = ListDbHomesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbHomesRequest, ListDbHomesResponse>(
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
                    javax.ws.rs.core.Response, ListDbHomesResponse>(
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
    public java.util.concurrent.Future<ListDbNodesResponse> listDbNodes(
            final ListDbNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                    handler) {
        LOG.trace("Called async listDbNodes");
        final ListDbNodesRequest interceptedRequest =
                ListDbNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbNodesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbNodesResponse>
                transformer = ListDbNodesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbNodesRequest, ListDbNodesResponse>(
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
                    javax.ws.rs.core.Response, ListDbNodesResponse>(
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
    public java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntries(
                    final ListDbSystemPatchHistoryEntriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemPatchHistoryEntriesRequest,
                                    ListDbSystemPatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbSystemPatchHistoryEntries");
        final ListDbSystemPatchHistoryEntriesRequest interceptedRequest =
                ListDbSystemPatchHistoryEntriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchHistoryEntriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchHistoryEntriesResponse>
                transformer = ListDbSystemPatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbSystemPatchHistoryEntriesRequest,
                            ListDbSystemPatchHistoryEntriesResponse>(
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
                    javax.ws.rs.core.Response, ListDbSystemPatchHistoryEntriesResponse>(
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
    public java.util.concurrent.Future<ListDbSystemPatchesResponse> listDbSystemPatches(
            final ListDbSystemPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemPatches");
        final ListDbSystemPatchesRequest interceptedRequest =
                ListDbSystemPatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchesResponse>
                transformer = ListDbSystemPatchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>(
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
                    javax.ws.rs.core.Response, ListDbSystemPatchesResponse>(
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
    public java.util.concurrent.Future<ListDbSystemShapesResponse> listDbSystemShapes(
            final ListDbSystemShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemShapes");
        final ListDbSystemShapesRequest interceptedRequest =
                ListDbSystemShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemShapesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemShapesResponse>
                transformer = ListDbSystemShapesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>(
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
                    javax.ws.rs.core.Response, ListDbSystemShapesResponse>(
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
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            final ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
        LOG.trace("Called async listDbSystems");
        final ListDbSystemsRequest interceptedRequest =
                ListDbSystemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemsResponse>
                transformer = ListDbSystemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbSystemsRequest, ListDbSystemsResponse>(
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
                    javax.ws.rs.core.Response, ListDbSystemsResponse>(
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
    public java.util.concurrent.Future<ListDbVersionsResponse> listDbVersions(
            final ListDbVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDbVersionsRequest, ListDbVersionsResponse>
                    handler) {
        LOG.trace("Called async listDbVersions");
        final ListDbVersionsRequest interceptedRequest =
                ListDbVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbVersionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbVersionsResponse>
                transformer = ListDbVersionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDbVersionsRequest, ListDbVersionsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ListDbVersionsRequest, ListDbVersionsResponse>(
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
                    javax.ws.rs.core.Response, ListDbVersionsResponse>(
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
    public java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>
            reinstateDataGuardAssociation(
                    final ReinstateDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateDataGuardAssociationRequest,
                                    ReinstateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async reinstateDataGuardAssociation");
        final ReinstateDataGuardAssociationRequest interceptedRequest =
                ReinstateDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReinstateDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ReinstateDataGuardAssociationResponse>
                transformer = ReinstateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ReinstateDataGuardAssociationRequest, ReinstateDataGuardAssociationResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            ReinstateDataGuardAssociationRequest,
                            ReinstateDataGuardAssociationResponse>(
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
                                    interceptedRequest.getReinstateDataGuardAssociationDetails(),
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
                        interceptedRequest.getReinstateDataGuardAssociationDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, ReinstateDataGuardAssociationResponse>(
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
                                    interceptedRequest.getReinstateDataGuardAssociationDetails(),
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
    public java.util.concurrent.Future<RestoreDatabaseResponse> restoreDatabase(
            final RestoreDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreDatabaseRequest, RestoreDatabaseResponse>
                    handler) {
        LOG.trace("Called async restoreDatabase");
        final RestoreDatabaseRequest interceptedRequest =
                RestoreDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RestoreDatabaseResponse>
                transformer = RestoreDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<RestoreDatabaseRequest, RestoreDatabaseResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            RestoreDatabaseRequest, RestoreDatabaseResponse>(
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
                                    interceptedRequest.getRestoreDatabaseDetails(),
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
                        interceptedRequest.getRestoreDatabaseDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, RestoreDatabaseResponse>(
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
                                    interceptedRequest.getRestoreDatabaseDetails(),
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
    public java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>
            switchoverDataGuardAssociation(
                    final SwitchoverDataGuardAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverDataGuardAssociationRequest,
                                    SwitchoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async switchoverDataGuardAssociation");
        final SwitchoverDataGuardAssociationRequest interceptedRequest =
                SwitchoverDataGuardAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverDataGuardAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchoverDataGuardAssociationResponse>
                transformer = SwitchoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SwitchoverDataGuardAssociationRequest,
                        SwitchoverDataGuardAssociationResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            SwitchoverDataGuardAssociationRequest,
                            SwitchoverDataGuardAssociationResponse>(
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
                                    interceptedRequest.getSwitchoverDataGuardAssociationDetails(),
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
                        interceptedRequest.getSwitchoverDataGuardAssociationDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, SwitchoverDataGuardAssociationResponse>(
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
                                    interceptedRequest.getSwitchoverDataGuardAssociationDetails(),
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
    public java.util.concurrent.Future<TerminateDbSystemResponse> terminateDbSystem(
            final TerminateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>
                    handler) {
        LOG.trace("Called async terminateDbSystem");
        final TerminateDbSystemRequest interceptedRequest =
                TerminateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TerminateDbSystemResponse>
                transformer = TerminateDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<TerminateDbSystemRequest, TerminateDbSystemResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>(
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
                    javax.ws.rs.core.Response, TerminateDbSystemResponse>(
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
    public java.util.concurrent.Future<UpdateDatabaseResponse> updateDatabase(
            final UpdateDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseRequest, UpdateDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateDatabase");
        final UpdateDatabaseRequest interceptedRequest =
                UpdateDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDatabaseResponse>
                transformer = UpdateDatabaseConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateDatabaseRequest, UpdateDatabaseResponse>(
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
                                    interceptedRequest.getUpdateDatabaseDetails(),
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
                        interceptedRequest.getUpdateDatabaseDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateDatabaseResponse>(
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
                                    interceptedRequest.getUpdateDatabaseDetails(),
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
    public java.util.concurrent.Future<UpdateDbHomeResponse> updateDbHome(
            final UpdateDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                    handler) {
        LOG.trace("Called async updateDbHome");
        final UpdateDbHomeRequest interceptedRequest =
                UpdateDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbHomeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbHomeResponse>
                transformer = UpdateDbHomeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateDbHomeRequest, UpdateDbHomeResponse>(
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
                                    interceptedRequest.getUpdateDbHomeDetails(),
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
                        interceptedRequest.getUpdateDbHomeDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateDbHomeResponse>(
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
                                    interceptedRequest.getUpdateDbHomeDetails(),
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
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            final UpdateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {
        LOG.trace("Called async updateDbSystem");
        final UpdateDbSystemRequest interceptedRequest =
                UpdateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbSystemResponse>
                transformer = UpdateDbSystemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDbSystemRequest, UpdateDbSystemResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof
                        com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.InstancePrincipalsWrappingAsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>(
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
                                    interceptedRequest.getUpdateDbSystemDetails(),
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
                        interceptedRequest.getUpdateDbSystemDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider) {
            return new com.oracle.bmc.util.internal.InstancePrincipalsBasedTransformingFuture<
                    javax.ws.rs.core.Response, UpdateDbSystemResponse>(
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
                                    interceptedRequest.getUpdateDbSystemDetails(),
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
