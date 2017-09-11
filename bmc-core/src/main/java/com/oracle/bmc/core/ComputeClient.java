/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ComputeClient implements Compute {
    /**
     * Service instance for Compute.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("COMPUTE", "iaas");

    private final java.util.concurrent.ExecutorService executorService =
            java.util.concurrent.Executors.newFixedThreadPool(50);
    private final ComputeWaiters waiters;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeClient(
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
    public ComputeClient(
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
    public ComputeClient(
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
                                .setNameFormat("Compute-waiters-%d")
                                .build());
        executorService.allowCoreThreadTimeOut(true);

        this.waiters = new ComputeWaiters(executorService, this);
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
        regionId = regionId.toLowerCase();
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
    public AttachVnicResponse attachVnic(AttachVnicRequest request) {
        LOG.trace("Called attachVnic");
        request = AttachVnicConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = AttachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVnicResponse> transformer =
                AttachVnicConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getAttachVnicDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        LOG.trace("Called attachVolume");
        request = AttachVolumeConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                AttachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVolumeResponse>
                transformer = AttachVolumeConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getAttachVolumeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CaptureConsoleHistoryResponse captureConsoleHistory(
            CaptureConsoleHistoryRequest request) {
        LOG.trace("Called captureConsoleHistory");
        request = CaptureConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CaptureConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CaptureConsoleHistoryResponse>
                transformer = CaptureConsoleHistoryConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCaptureConsoleHistoryDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateImageResponse createImage(CreateImageRequest request) {
        LOG.trace("Called createImage");
        request = CreateImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateImageResponse>
                transformer = CreateImageConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateImageDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request) {
        LOG.trace("Called createInstanceConsoleConnection");
        request = CreateInstanceConsoleConnectionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateInstanceConsoleConnectionResponse>
                transformer = CreateInstanceConsoleConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateInstanceConsoleConnectionDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request) {
        LOG.trace("Called deleteConsoleHistory");
        request = DeleteConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteConsoleHistoryResponse>
                transformer = DeleteConsoleHistoryConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        LOG.trace("Called deleteImage");
        request = DeleteImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteImageResponse>
                transformer = DeleteImageConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteInstanceConsoleConnectionResponse deleteInstanceConsoleConnection(
            DeleteInstanceConsoleConnectionRequest request) {
        LOG.trace("Called deleteInstanceConsoleConnection");
        request = DeleteInstanceConsoleConnectionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConsoleConnectionResponse>
                transformer = DeleteInstanceConsoleConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DetachVnicResponse detachVnic(DetachVnicRequest request) {
        LOG.trace("Called detachVnic");
        request = DetachVnicConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = DetachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVnicResponse> transformer =
                DetachVnicConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DetachVolumeResponse detachVolume(DetachVolumeRequest request) {
        LOG.trace("Called detachVolume");
        request = DetachVolumeConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DetachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVolumeResponse>
                transformer = DetachVolumeConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ExportImageResponse exportImage(ExportImageRequest request) {
        LOG.trace("Called exportImage");
        request = ExportImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ExportImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ExportImageResponse>
                transformer = ExportImageConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getExportImageDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request) {
        LOG.trace("Called getConsoleHistory");
        request = GetConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryResponse>
                transformer = GetConsoleHistoryConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request) {
        LOG.trace("Called getConsoleHistoryContent");
        request = GetConsoleHistoryContentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetConsoleHistoryContentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer = GetConsoleHistoryContentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetImageResponse getImage(GetImageRequest request) {
        LOG.trace("Called getImage");
        request = GetImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetImageResponse> transformer =
                GetImageConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetInstanceResponse getInstance(GetInstanceRequest request) {
        LOG.trace("Called getInstance");
        request = GetInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInstanceResponse>
                transformer = GetInstanceConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetInstanceConsoleConnectionResponse getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request) {
        LOG.trace("Called getInstanceConsoleConnection");
        request = GetInstanceConsoleConnectionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetInstanceConsoleConnectionConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetInstanceConsoleConnectionResponse>
                transformer = GetInstanceConsoleConnectionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVnicAttachmentResponse getVnicAttachment(GetVnicAttachmentRequest request) {
        LOG.trace("Called getVnicAttachment");
        request = GetVnicAttachmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetVnicAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVnicAttachmentResponse>
                transformer = GetVnicAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request) {
        LOG.trace("Called getVolumeAttachment");
        request = GetVolumeAttachmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetVolumeAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeAttachmentResponse>
                transformer = GetVolumeAttachmentConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request) {
        LOG.trace("Called getWindowsInstanceInitialCredentials");
        request = GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWindowsInstanceInitialCredentialsResponse>
                transformer = GetWindowsInstanceInitialCredentialsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public InstanceActionResponse instanceAction(InstanceActionRequest request) {
        LOG.trace("Called instanceAction");
        request = InstanceActionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                InstanceActionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, InstanceActionResponse>
                transformer = InstanceActionConverter.fromResponse();

        javax.ws.rs.core.Response response = client.post(ib, request);
        return transformer.apply(response);
    }

    @Override
    public LaunchInstanceResponse launchInstance(LaunchInstanceRequest request) {
        LOG.trace("Called launchInstance");
        request = LaunchInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                LaunchInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, LaunchInstanceResponse>
                transformer = LaunchInstanceConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getLaunchInstanceDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request) {
        LOG.trace("Called listConsoleHistories");
        request = ListConsoleHistoriesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListConsoleHistoriesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListConsoleHistoriesResponse>
                transformer = ListConsoleHistoriesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListImagesResponse listImages(ListImagesRequest request) {
        LOG.trace("Called listImages");
        request = ListImagesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListImagesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListImagesResponse> transformer =
                ListImagesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request) {
        LOG.trace("Called listInstanceConsoleConnections");
        request = ListInstanceConsoleConnectionsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListInstanceConsoleConnectionsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceConsoleConnectionsResponse>
                transformer = ListInstanceConsoleConnectionsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        LOG.trace("Called listInstances");
        request = ListInstancesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListInstancesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancesResponse>
                transformer = ListInstancesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListShapesResponse listShapes(ListShapesRequest request) {
        LOG.trace("Called listShapes");
        request = ListShapesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse> transformer =
                ListShapesConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request) {
        LOG.trace("Called listVnicAttachments");
        request = ListVnicAttachmentsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListVnicAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVnicAttachmentsResponse>
                transformer = ListVnicAttachmentsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVolumeAttachmentsResponse listVolumeAttachments(
            ListVolumeAttachmentsRequest request) {
        LOG.trace("Called listVolumeAttachments");
        request = ListVolumeAttachmentsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListVolumeAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeAttachmentsResponse>
                transformer = ListVolumeAttachmentsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {
        LOG.trace("Called terminateInstance");
        request = TerminateInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                TerminateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateInstanceResponse>
                transformer = TerminateInstanceConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        LOG.trace("Called updateImage");
        request = UpdateImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateImageResponse>
                transformer = UpdateImageConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateImageDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        LOG.trace("Called updateInstance");
        request = UpdateInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstanceResponse>
                transformer = UpdateInstanceConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateInstanceDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public ComputeWaiters getWaiters() {
        return waiters;
    }
}
