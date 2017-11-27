/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
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
            CreateBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
        LOG.trace("Called async createBackup");
        request = CreateBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackupResponse>
                transformer = CreateBackupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateBackupDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateDataGuardAssociationResponse>
            createDataGuardAssociation(
                    CreateDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataGuardAssociationRequest,
                                    CreateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async createDataGuardAssociation");
        request = CreateDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataGuardAssociationResponse>
                transformer = CreateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getCreateDataGuardAssociationDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateDbHomeResponse> createDbHome(
            CreateDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                    handler) {
        LOG.trace("Called async createDbHome");
        request = CreateDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbHomeResponse>
                transformer = CreateDbHomeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getCreateDbHomeWithDbSystemIdDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DbNodeActionResponse> dbNodeAction(
            DbNodeActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                    handler) {
        LOG.trace("Called async dbNodeAction");
        request = DbNodeActionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DbNodeActionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DbNodeActionResponse>
                transformer = DbNodeActionConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            DeleteBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {
        LOG.trace("Called async deleteBackup");
        request = DeleteBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackupResponse>
                transformer = DeleteBackupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbHomeResponse> deleteDbHome(
            DeleteDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                    handler) {
        LOG.trace("Called async deleteDbHome");
        request = DeleteDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbHomeResponse>
                transformer = DeleteDbHomeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<FailoverDataGuardAssociationResponse>
            failoverDataGuardAssociation(
                    FailoverDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    FailoverDataGuardAssociationRequest,
                                    FailoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async failoverDataGuardAssociation");
        request = FailoverDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailoverDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
                transformer = FailoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getFailoverDataGuardAssociationDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            GetBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse> handler) {
        LOG.trace("Called async getBackup");
        request = GetBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackupResponse> transformer =
                GetBackupConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDataGuardAssociationResponse> getDataGuardAssociation(
            GetDataGuardAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                    handler) {
        LOG.trace("Called async getDataGuardAssociation");
        request = GetDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataGuardAssociationResponse>
                transformer = GetDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseResponse> getDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getDatabase");
        request = GetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseResponse>
                transformer = GetDatabaseConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomeResponse> getDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse> handler) {
        LOG.trace("Called async getDbHome");
        request = GetDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomeResponse> transformer =
                GetDbHomeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchResponse> getDbHomePatch(
            GetDbHomePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbHomePatchRequest, GetDbHomePatchResponse>
                    handler) {
        LOG.trace("Called async getDbHomePatch");
        request = GetDbHomePatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomePatchResponse>
                transformer = GetDbHomePatchConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse>
            getDbHomePatchHistoryEntry(
                    GetDbHomePatchHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDbHomePatchHistoryEntryRequest,
                                    GetDbHomePatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbHomePatchHistoryEntry");
        request = GetDbHomePatchHistoryEntryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchHistoryEntryConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbHomePatchHistoryEntryResponse>
                transformer = GetDbHomePatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbNodeResponse> getDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse> handler) {
        LOG.trace("Called async getDbNode");
        request = GetDbNodeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbNodeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbNodeResponse> transformer =
                GetDbNodeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {
        LOG.trace("Called async getDbSystem");
        request = GetDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemResponse>
                transformer = GetDbSystemConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchResponse> getDbSystemPatch(
            GetDbSystemPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                    handler) {
        LOG.trace("Called async getDbSystemPatch");
        request = GetDbSystemPatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemPatchResponse>
                transformer = GetDbSystemPatchConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse>
            getDbSystemPatchHistoryEntry(
                    GetDbSystemPatchHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemPatchHistoryEntryRequest,
                                    GetDbSystemPatchHistoryEntryResponse>
                            handler) {
        LOG.trace("Called async getDbSystemPatchHistoryEntry");
        request = GetDbSystemPatchHistoryEntryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchHistoryEntryConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbSystemPatchHistoryEntryResponse>
                transformer = GetDbSystemPatchHistoryEntryConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<LaunchDbSystemResponse> launchDbSystem(
            LaunchDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<LaunchDbSystemRequest, LaunchDbSystemResponse>
                    handler) {
        LOG.trace("Called async launchDbSystem");
        request = LaunchDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, LaunchDbSystemResponse>
                transformer = LaunchDbSystemConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getLaunchDbSystemDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {
        LOG.trace("Called async listBackups");
        request = ListBackupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackupsResponse>
                transformer = ListBackupsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDataGuardAssociationsResponse> listDataGuardAssociations(
            ListDataGuardAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                    handler) {
        LOG.trace("Called async listDataGuardAssociations");
        request = ListDataGuardAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataGuardAssociationsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataGuardAssociationsResponse>
                transformer = ListDataGuardAssociationsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            ListDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler) {
        LOG.trace("Called async listDatabases");
        request = ListDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabasesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDatabasesResponse>
                transformer = ListDatabasesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntries(
                    ListDbHomePatchHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbHomePatchHistoryEntriesRequest,
                                    ListDbHomePatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbHomePatchHistoryEntries");
        request = ListDbHomePatchHistoryEntriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchHistoryEntriesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbHomePatchHistoryEntriesResponse>
                transformer = ListDbHomePatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomePatchesResponse> listDbHomePatches(
            ListDbHomePatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                    handler) {
        LOG.trace("Called async listDbHomePatches");
        request = ListDbHomePatchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomePatchesResponse>
                transformer = ListDbHomePatchesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbHomesResponse> listDbHomes(
            ListDbHomesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse>
                    handler) {
        LOG.trace("Called async listDbHomes");
        request = ListDbHomesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomesResponse>
                transformer = ListDbHomesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbNodesResponse> listDbNodes(
            ListDbNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse>
                    handler) {
        LOG.trace("Called async listDbNodes");
        request = ListDbNodesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbNodesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbNodesResponse>
                transformer = ListDbNodesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntries(
                    ListDbSystemPatchHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemPatchHistoryEntriesRequest,
                                    ListDbSystemPatchHistoryEntriesResponse>
                            handler) {
        LOG.trace("Called async listDbSystemPatchHistoryEntries");
        request = ListDbSystemPatchHistoryEntriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchHistoryEntriesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchHistoryEntriesResponse>
                transformer = ListDbSystemPatchHistoryEntriesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemPatchesResponse> listDbSystemPatches(
            ListDbSystemPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemPatches");
        request = ListDbSystemPatchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemPatchesResponse>
                transformer = ListDbSystemPatchesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemShapesResponse> listDbSystemShapes(
            ListDbSystemShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                    handler) {
        LOG.trace("Called async listDbSystemShapes");
        request = ListDbSystemShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemShapesResponse>
                transformer = ListDbSystemShapesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
        LOG.trace("Called async listDbSystems");
        request = ListDbSystemsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemsResponse>
                transformer = ListDbSystemsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListDbVersionsResponse> listDbVersions(
            ListDbVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbVersionsRequest, ListDbVersionsResponse>
                    handler) {
        LOG.trace("Called async listDbVersions");
        request = ListDbVersionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbVersionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbVersionsResponse>
                transformer = ListDbVersionsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>
            reinstateDataGuardAssociation(
                    ReinstateDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateDataGuardAssociationRequest,
                                    ReinstateDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async reinstateDataGuardAssociation");
        request = ReinstateDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReinstateDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ReinstateDataGuardAssociationResponse>
                transformer = ReinstateDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getReinstateDataGuardAssociationDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<RestoreDatabaseResponse> restoreDatabase(
            RestoreDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestoreDatabaseRequest, RestoreDatabaseResponse>
                    handler) {
        LOG.trace("Called async restoreDatabase");
        request = RestoreDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RestoreDatabaseResponse>
                transformer = RestoreDatabaseConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getRestoreDatabaseDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>
            switchoverDataGuardAssociation(
                    SwitchoverDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverDataGuardAssociationRequest,
                                    SwitchoverDataGuardAssociationResponse>
                            handler) {
        LOG.trace("Called async switchoverDataGuardAssociation");
        request = SwitchoverDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchoverDataGuardAssociationResponse>
                transformer = SwitchoverDataGuardAssociationConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getSwitchoverDataGuardAssociationDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<TerminateDbSystemResponse> terminateDbSystem(
            TerminateDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>
                    handler) {
        LOG.trace("Called async terminateDbSystem");
        request = TerminateDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateDbSystemResponse>
                transformer = TerminateDbSystemConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResponse> updateDatabase(
            UpdateDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateDatabase");
        request = UpdateDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDatabaseResponse>
                transformer = UpdateDatabaseConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateDatabaseDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbHomeResponse> updateDbHome(
            UpdateDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                    handler) {
        LOG.trace("Called async updateDbHome");
        request = UpdateDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbHomeResponse>
                transformer = UpdateDbHomeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateDbHomeDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {
        LOG.trace("Called async updateDbSystem");
        request = UpdateDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbSystemResponse>
                transformer = UpdateDbSystemConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateDbSystemDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
