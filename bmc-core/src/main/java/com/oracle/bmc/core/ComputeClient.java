/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
public class ComputeClient implements Compute {
    /**
     * Service instance for Compute.
     */
    public static final Service SERVICE = Services.create("COMPUTE", "iaas");

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);
    private final ComputeWaiters waiters;

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationProvider The authentication details provider, required.
     */
    public ComputeClient(AuthenticationDetailsProvider authenticationProvider) {
        this.client = newClientBuilder().build().create(SERVICE, authenticationProvider);

        this.waiters = new ComputeWaiters(executorService, this);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration) {
        this.client =
                newClientBuilder().build().create(SERVICE, authenticationProvider, configuration);

        this.waiters = new ComputeWaiters(executorService, this);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public ComputeClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this.client =
                newClientBuilder()
                        .clientConfigurator(clientConfigurator)
                        .build()
                        .create(SERVICE, authenticationProvider, configuration);

        this.waiters = new ComputeWaiters(executorService, this);
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
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        LOG.trace("Called attachVolume");
        Invocation.Builder ib = AttachVolumeConverter.fromRequest(client, request);
        Function<Response, AttachVolumeResponse> transformer = AttachVolumeConverter.fromResponse();

        Response response = client.post(ib, request.getAttachVolumeDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CaptureConsoleHistoryResponse captureConsoleHistory(
            CaptureConsoleHistoryRequest request) {
        LOG.trace("Called captureConsoleHistory");
        Invocation.Builder ib = CaptureConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, CaptureConsoleHistoryResponse> transformer =
                CaptureConsoleHistoryConverter.fromResponse();

        Response response = client.post(ib, request.getCaptureConsoleHistoryDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateImageResponse createImage(CreateImageRequest request) {
        LOG.trace("Called createImage");
        Invocation.Builder ib = CreateImageConverter.fromRequest(client, request);
        Function<Response, CreateImageResponse> transformer = CreateImageConverter.fromResponse();

        Response response = client.post(ib, request.getCreateImageDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request) {
        LOG.trace("Called deleteConsoleHistory");
        Invocation.Builder ib = DeleteConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, DeleteConsoleHistoryResponse> transformer =
                DeleteConsoleHistoryConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        LOG.trace("Called deleteImage");
        Invocation.Builder ib = DeleteImageConverter.fromRequest(client, request);
        Function<Response, DeleteImageResponse> transformer = DeleteImageConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DetachVolumeResponse detachVolume(DetachVolumeRequest request) {
        LOG.trace("Called detachVolume");
        Invocation.Builder ib = DetachVolumeConverter.fromRequest(client, request);
        Function<Response, DetachVolumeResponse> transformer = DetachVolumeConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request) {
        LOG.trace("Called getConsoleHistory");
        Invocation.Builder ib = GetConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, GetConsoleHistoryResponse> transformer =
                GetConsoleHistoryConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request) {
        LOG.trace("Called getConsoleHistoryContent");
        Invocation.Builder ib = GetConsoleHistoryContentConverter.fromRequest(client, request);
        Function<Response, GetConsoleHistoryContentResponse> transformer =
                GetConsoleHistoryContentConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetImageResponse getImage(GetImageRequest request) {
        LOG.trace("Called getImage");
        Invocation.Builder ib = GetImageConverter.fromRequest(client, request);
        Function<Response, GetImageResponse> transformer = GetImageConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetInstanceResponse getInstance(GetInstanceRequest request) {
        LOG.trace("Called getInstance");
        Invocation.Builder ib = GetInstanceConverter.fromRequest(client, request);
        Function<Response, GetInstanceResponse> transformer = GetInstanceConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request) {
        LOG.trace("Called getVolumeAttachment");
        Invocation.Builder ib = GetVolumeAttachmentConverter.fromRequest(client, request);
        Function<Response, GetVolumeAttachmentResponse> transformer =
                GetVolumeAttachmentConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public InstanceActionResponse instanceAction(InstanceActionRequest request) {
        LOG.trace("Called instanceAction");
        Invocation.Builder ib = InstanceActionConverter.fromRequest(client, request);
        Function<Response, InstanceActionResponse> transformer =
                InstanceActionConverter.fromResponse();

        Response response = client.post(ib, request);
        return transformer.apply(response);
    }

    @Override
    public LaunchInstanceResponse launchInstance(LaunchInstanceRequest request) {
        LOG.trace("Called launchInstance");
        Invocation.Builder ib = LaunchInstanceConverter.fromRequest(client, request);
        Function<Response, LaunchInstanceResponse> transformer =
                LaunchInstanceConverter.fromResponse();

        Response response = client.post(ib, request.getLaunchInstanceDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request) {
        LOG.trace("Called listConsoleHistories");
        Invocation.Builder ib = ListConsoleHistoriesConverter.fromRequest(client, request);
        Function<Response, ListConsoleHistoriesResponse> transformer =
                ListConsoleHistoriesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListImagesResponse listImages(ListImagesRequest request) {
        LOG.trace("Called listImages");
        Invocation.Builder ib = ListImagesConverter.fromRequest(client, request);
        Function<Response, ListImagesResponse> transformer = ListImagesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        LOG.trace("Called listInstances");
        Invocation.Builder ib = ListInstancesConverter.fromRequest(client, request);
        Function<Response, ListInstancesResponse> transformer =
                ListInstancesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListShapesResponse listShapes(ListShapesRequest request) {
        LOG.trace("Called listShapes");
        Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        Function<Response, ListShapesResponse> transformer = ListShapesConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request) {
        LOG.trace("Called listVnicAttachments");
        Invocation.Builder ib = ListVnicAttachmentsConverter.fromRequest(client, request);
        Function<Response, ListVnicAttachmentsResponse> transformer =
                ListVnicAttachmentsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListVolumeAttachmentsResponse listVolumeAttachments(
            ListVolumeAttachmentsRequest request) {
        LOG.trace("Called listVolumeAttachments");
        Invocation.Builder ib = ListVolumeAttachmentsConverter.fromRequest(client, request);
        Function<Response, ListVolumeAttachmentsResponse> transformer =
                ListVolumeAttachmentsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {
        LOG.trace("Called terminateInstance");
        Invocation.Builder ib = TerminateInstanceConverter.fromRequest(client, request);
        Function<Response, TerminateInstanceResponse> transformer =
                TerminateInstanceConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        LOG.trace("Called updateImage");
        Invocation.Builder ib = UpdateImageConverter.fromRequest(client, request);
        Function<Response, UpdateImageResponse> transformer = UpdateImageConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateImageDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        LOG.trace("Called updateInstance");
        Invocation.Builder ib = UpdateInstanceConverter.fromRequest(client, request);
        Function<Response, UpdateInstanceResponse> transformer =
                UpdateInstanceConverter.fromResponse();

        Response response = client.put(ib, request.getUpdateInstanceDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public ComputeWaiters getWaiters() {
        return waiters;
    }
}
