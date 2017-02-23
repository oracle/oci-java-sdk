/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class BlockstorageClient implements Blockstorage {
    /**
     * Service instance for Blockstorage.
     */
    public static final Service SERVICE = Services.create("BLOCKSTORAGE", "iaas");

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);
    private final BlockstorageWaiters waiters;

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationProvider The authentication details provider, required.
     */
    public BlockstorageClient(AuthenticationDetailsProvider authenticationProvider) {
        this.client = newClientBuilder().build().create(SERVICE, authenticationProvider);

        this.waiters = new BlockstorageWaiters(executorService, this);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BlockstorageClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration) {
        this.client =
                newClientBuilder().build().create(SERVICE, authenticationProvider, configuration);

        this.waiters = new BlockstorageWaiters(executorService, this);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public BlockstorageClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this.client =
                newClientBuilder()
                        .clientConfigurator(clientConfigurator)
                        .build()
                        .create(SERVICE, authenticationProvider, configuration);

        this.waiters = new BlockstorageWaiters(executorService, this);
    }

    private static RestClientFactoryBuilder newClientBuilder() {
        RestClientFactoryBuilder builder = RestClientFactoryBuilder.builder();

        return builder;
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(Region region) {
        Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        LOG.trace("Called createVolume");
        Invocation.Builder ib = CreateVolumeConverter.fromRequest(client, request);
        Function<Response, CreateVolumeResponse> transformer = CreateVolumeConverter.fromResponse();

        Response response = client.post(ib, request.getCreateVolumeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateVolumeBackupResponse createVolumeBackup(CreateVolumeBackupRequest request) {
        LOG.trace("Called createVolumeBackup");
        Invocation.Builder ib = CreateVolumeBackupConverter.fromRequest(client, request);
        Function<Response, CreateVolumeBackupResponse> transformer =
                CreateVolumeBackupConverter.fromResponse();

        Response response = client.post(ib, request.getCreateVolumeBackupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        LOG.trace("Called deleteVolume");
        Invocation.Builder ib = DeleteVolumeConverter.fromRequest(client, request);
        Function<Response, DeleteVolumeResponse> transformer = DeleteVolumeConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteVolumeBackupResponse deleteVolumeBackup(DeleteVolumeBackupRequest request) {
        LOG.trace("Called deleteVolumeBackup");
        Invocation.Builder ib = DeleteVolumeBackupConverter.fromRequest(client, request);
        Function<Response, DeleteVolumeBackupResponse> transformer =
                DeleteVolumeBackupConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVolumeResponse getVolume(GetVolumeRequest request) {
        LOG.trace("Called getVolume");
        Invocation.Builder ib = GetVolumeConverter.fromRequest(client, request);
        Function<Response, GetVolumeResponse> transformer = GetVolumeConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVolumeBackupResponse getVolumeBackup(GetVolumeBackupRequest request) {
        LOG.trace("Called getVolumeBackup");
        Invocation.Builder ib = GetVolumeBackupConverter.fromRequest(client, request);
        Function<Response, GetVolumeBackupResponse> transformer =
                GetVolumeBackupConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVolumeBackupsResponse listVolumeBackups(ListVolumeBackupsRequest request) {
        LOG.trace("Called listVolumeBackups");
        Invocation.Builder ib = ListVolumeBackupsConverter.fromRequest(client, request);
        Function<Response, ListVolumeBackupsResponse> transformer =
                ListVolumeBackupsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        LOG.trace("Called listVolumes");
        Invocation.Builder ib = ListVolumesConverter.fromRequest(client, request);
        Function<Response, ListVolumesResponse> transformer = ListVolumesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        LOG.trace("Called updateVolume");
        Invocation.Builder ib = UpdateVolumeConverter.fromRequest(client, request);
        Function<Response, UpdateVolumeResponse> transformer = UpdateVolumeConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateVolumeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateVolumeBackupResponse updateVolumeBackup(UpdateVolumeBackupRequest request) {
        LOG.trace("Called updateVolumeBackup");
        Invocation.Builder ib = UpdateVolumeBackupConverter.fromRequest(client, request);
        Function<Response, UpdateVolumeBackupResponse> transformer =
                UpdateVolumeBackupConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateVolumeBackupDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public BlockstorageWaiters getWaiters() {
        return waiters;
    }
}
