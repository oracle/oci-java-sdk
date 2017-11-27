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
public class DatabaseClient implements Database {
    /**
     * Service instance for Database.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("DATABASE", "database");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final DatabaseWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DatabaseClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
        // up to 50 (core) threads, time out after 60s idle, all daemon
        java.util.concurrent.ThreadPoolExecutor executorService =
                new java.util.concurrent.ThreadPoolExecutor(
                        50,
                        50,
                        60L,
                        java.util.concurrent.TimeUnit.SECONDS,
                        new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                        new com.google.common.util.concurrent.ThreadFactoryBuilder()
                                .setDaemon(false)
                                .setNameFormat("Database-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new DatabaseWaiters(executorService, this);
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
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        LOG.trace("Called createBackup");
        request = CreateBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackupResponse>
                transformer = CreateBackupConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateBackupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateDataGuardAssociationResponse createDataGuardAssociation(
            CreateDataGuardAssociationRequest request) {
        LOG.trace("Called createDataGuardAssociation");
        request = CreateDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataGuardAssociationResponse>
                transformer = CreateDataGuardAssociationConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateDataGuardAssociationDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateDbHomeResponse createDbHome(CreateDbHomeRequest request) {
        LOG.trace("Called createDbHome");
        request = CreateDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbHomeResponse>
                transformer = CreateDbHomeConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateDbHomeWithDbSystemIdDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DbNodeActionResponse dbNodeAction(DbNodeActionRequest request) {
        LOG.trace("Called dbNodeAction");
        request = DbNodeActionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DbNodeActionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DbNodeActionResponse>
                transformer = DbNodeActionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.post(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        LOG.trace("Called deleteBackup");
        request = DeleteBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackupResponse>
                transformer = DeleteBackupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request) {
        LOG.trace("Called deleteDbHome");
        request = DeleteDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbHomeResponse>
                transformer = DeleteDbHomeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public FailoverDataGuardAssociationResponse failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request) {
        LOG.trace("Called failoverDataGuardAssociation");
        request = FailoverDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FailoverDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
                transformer = FailoverDataGuardAssociationConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getFailoverDataGuardAssociationDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public GetBackupResponse getBackup(GetBackupRequest request) {
        LOG.trace("Called getBackup");
        request = GetBackupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackupResponse> transformer =
                GetBackupConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDataGuardAssociationResponse getDataGuardAssociation(
            GetDataGuardAssociationRequest request) {
        LOG.trace("Called getDataGuardAssociation");
        request = GetDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataGuardAssociationResponse>
                transformer = GetDataGuardAssociationConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) {
        LOG.trace("Called getDatabase");
        request = GetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseResponse>
                transformer = GetDatabaseConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbHomeResponse getDbHome(GetDbHomeRequest request) {
        LOG.trace("Called getDbHome");
        request = GetDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomeResponse> transformer =
                GetDbHomeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbHomePatchResponse getDbHomePatch(GetDbHomePatchRequest request) {
        LOG.trace("Called getDbHomePatch");
        request = GetDbHomePatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbHomePatchResponse>
                transformer = GetDbHomePatchConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbHomePatchHistoryEntryResponse getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request) {
        LOG.trace("Called getDbHomePatchHistoryEntry");
        request = GetDbHomePatchHistoryEntryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbHomePatchHistoryEntryConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbHomePatchHistoryEntryResponse>
                transformer = GetDbHomePatchHistoryEntryConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbNodeResponse getDbNode(GetDbNodeRequest request) {
        LOG.trace("Called getDbNode");
        request = GetDbNodeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbNodeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbNodeResponse> transformer =
                GetDbNodeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbSystemResponse getDbSystem(GetDbSystemRequest request) {
        LOG.trace("Called getDbSystem");
        request = GetDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemResponse>
                transformer = GetDbSystemConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request) {
        LOG.trace("Called getDbSystemPatch");
        request = GetDbSystemPatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemPatchResponse>
                transformer = GetDbSystemPatchConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request) {
        LOG.trace("Called getDbSystemPatchHistoryEntry");
        request = GetDbSystemPatchHistoryEntryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemPatchHistoryEntryConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbSystemPatchHistoryEntryResponse>
                transformer = GetDbSystemPatchHistoryEntryConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public LaunchDbSystemResponse launchDbSystem(LaunchDbSystemRequest request) {
        LOG.trace("Called launchDbSystem");
        request = LaunchDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, LaunchDbSystemResponse>
                transformer = LaunchDbSystemConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getLaunchDbSystemDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        LOG.trace("Called listBackups");
        request = ListBackupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackupsResponse>
                transformer = ListBackupsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDataGuardAssociationsResponse listDataGuardAssociations(
            ListDataGuardAssociationsRequest request) {
        LOG.trace("Called listDataGuardAssociations");
        request = ListDataGuardAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataGuardAssociationsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataGuardAssociationsResponse>
                transformer = ListDataGuardAssociationsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        LOG.trace("Called listDatabases");
        request = ListDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabasesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDatabasesResponse>
                transformer = ListDatabasesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request) {
        LOG.trace("Called listDbHomePatchHistoryEntries");
        request = ListDbHomePatchHistoryEntriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchHistoryEntriesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbHomePatchHistoryEntriesResponse>
                transformer = ListDbHomePatchHistoryEntriesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request) {
        LOG.trace("Called listDbHomePatches");
        request = ListDbHomePatchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomePatchesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomePatchesResponse>
                transformer = ListDbHomePatchesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbHomesResponse listDbHomes(ListDbHomesRequest request) {
        LOG.trace("Called listDbHomes");
        request = ListDbHomesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbHomesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbHomesResponse>
                transformer = ListDbHomesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbNodesResponse listDbNodes(ListDbNodesRequest request) {
        LOG.trace("Called listDbNodes");
        request = ListDbNodesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbNodesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbNodesResponse>
                transformer = ListDbNodesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbSystemPatchHistoryEntriesResponse listDbSystemPatchHistoryEntries(
            ListDbSystemPatchHistoryEntriesRequest request) {
        LOG.trace("Called listDbSystemPatchHistoryEntries");
        request = ListDbSystemPatchHistoryEntriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchHistoryEntriesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbSystemPatchHistoryEntriesResponse>
                transformer = ListDbSystemPatchHistoryEntriesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbSystemPatchesResponse listDbSystemPatches(ListDbSystemPatchesRequest request) {
        LOG.trace("Called listDbSystemPatches");
        request = ListDbSystemPatchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemPatchesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemPatchesResponse>
                transformer = ListDbSystemPatchesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbSystemShapesResponse listDbSystemShapes(ListDbSystemShapesRequest request) {
        LOG.trace("Called listDbSystemShapes");
        request = ListDbSystemShapesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemShapesResponse>
                transformer = ListDbSystemShapesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request) {
        LOG.trace("Called listDbSystems");
        request = ListDbSystemsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemsResponse>
                transformer = ListDbSystemsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListDbVersionsResponse listDbVersions(ListDbVersionsRequest request) {
        LOG.trace("Called listDbVersions");
        request = ListDbVersionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbVersionsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDbVersionsResponse>
                transformer = ListDbVersionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ReinstateDataGuardAssociationResponse reinstateDataGuardAssociation(
            ReinstateDataGuardAssociationRequest request) {
        LOG.trace("Called reinstateDataGuardAssociation");
        request = ReinstateDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReinstateDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ReinstateDataGuardAssociationResponse>
                transformer = ReinstateDataGuardAssociationConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getReinstateDataGuardAssociationDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public RestoreDatabaseResponse restoreDatabase(RestoreDatabaseRequest request) {
        LOG.trace("Called restoreDatabase");
        request = RestoreDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RestoreDatabaseResponse>
                transformer = RestoreDatabaseConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getRestoreDatabaseDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public SwitchoverDataGuardAssociationResponse switchoverDataGuardAssociation(
            SwitchoverDataGuardAssociationRequest request) {
        LOG.trace("Called switchoverDataGuardAssociation");
        request = SwitchoverDataGuardAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SwitchoverDataGuardAssociationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SwitchoverDataGuardAssociationResponse>
                transformer = SwitchoverDataGuardAssociationConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getSwitchoverDataGuardAssociationDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public TerminateDbSystemResponse terminateDbSystem(TerminateDbSystemRequest request) {
        LOG.trace("Called terminateDbSystem");
        request = TerminateDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateDbSystemResponse>
                transformer = TerminateDbSystemConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        LOG.trace("Called updateDatabase");
        request = UpdateDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDatabaseResponse>
                transformer = UpdateDatabaseConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateDatabaseDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request) {
        LOG.trace("Called updateDbHome");
        request = UpdateDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbHomeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbHomeResponse>
                transformer = UpdateDbHomeConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateDbHomeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request) {
        LOG.trace("Called updateDbSystem");
        request = UpdateDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbSystemConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbSystemResponse>
                transformer = UpdateDbSystemConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateDbSystemDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DatabaseWaiters getWaiters() {
        return waiters;
    }
}
