/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

/**
 * Media Services (includes Media Flow and Media Streams) is a fully managed service for processing media (video) source content. Use Media Flow and Media Streams to transcode and package digital video using configurable workflows and stream video outputs.
 *
 * Use the Media Services API to configure media workflows and run Media Flow jobs, create distribution channels, ingest assets, create Preview URLs and play assets. For more information, see [Media Flow](https://docs.cloud.oracle.com/iaas/Content/dms-mediaflow/home.htm) and [Media Streams](https://docs.cloud.oracle.com/iaas/Content/dms-mediastream/home.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public interface MediaServicesAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Add a lock to an MediaAsset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddMediaAssetLockResponse> addMediaAssetLock(
            AddMediaAssetLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddMediaAssetLockRequest, AddMediaAssetLockResponse>
                    handler);

    /**
     * Add a lock to a MediaWorkflowConfiguration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddMediaWorkflowConfigurationLockResponse>
            addMediaWorkflowConfigurationLock(
                    AddMediaWorkflowConfigurationLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddMediaWorkflowConfigurationLockRequest,
                                    AddMediaWorkflowConfigurationLockResponse>
                            handler);

    /**
     * Add a lock to a MediaWorkflowJob.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddMediaWorkflowJobLockResponse> addMediaWorkflowJobLock(
            AddMediaWorkflowJobLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddMediaWorkflowJobLockRequest, AddMediaWorkflowJobLockResponse>
                    handler);

    /**
     * Add a lock to a MediaWorkflow.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddMediaWorkflowLockResponse> addMediaWorkflowLock(
            AddMediaWorkflowLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddMediaWorkflowLockRequest, AddMediaWorkflowLockResponse>
                    handler);

    /**
     * Add a lock to a StreamCdnConfig.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddStreamCdnConfigLockResponse> addStreamCdnConfigLock(
            AddStreamCdnConfigLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddStreamCdnConfigLockRequest, AddStreamCdnConfigLockResponse>
                    handler);

    /**
     * Add a lock to a StreamDistributionChannel.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddStreamDistributionChannelLockResponse>
            addStreamDistributionChannelLock(
                    AddStreamDistributionChannelLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddStreamDistributionChannelLockRequest,
                                    AddStreamDistributionChannelLockResponse>
                            handler);

    /**
     * Add a lock to a StreamPackagingConfig.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddStreamPackagingConfigLockResponse> addStreamPackagingConfigLock(
            AddStreamPackagingConfigLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddStreamPackagingConfigLockRequest,
                            AddStreamPackagingConfigLockResponse>
                    handler);

    /**
     * Moves a MediaAsset resource from one compartment identifier to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMediaAssetCompartmentResponse> changeMediaAssetCompartment(
            ChangeMediaAssetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMediaAssetCompartmentRequest, ChangeMediaAssetCompartmentResponse>
                    handler);

    /**
     * Moves a MediaWorkflow resource from one compartment identifier to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMediaWorkflowCompartmentResponse>
            changeMediaWorkflowCompartment(
                    ChangeMediaWorkflowCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowCompartmentRequest,
                                    ChangeMediaWorkflowCompartmentResponse>
                            handler);

    /**
     * Moves a MediaWorkflowConfiguration resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMediaWorkflowConfigurationCompartmentResponse>
            changeMediaWorkflowConfigurationCompartment(
                    ChangeMediaWorkflowConfigurationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowConfigurationCompartmentRequest,
                                    ChangeMediaWorkflowConfigurationCompartmentResponse>
                            handler);

    /**
     * Moves a MediaWorkflowJob resource from one compartment identifier to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMediaWorkflowJobCompartmentResponse>
            changeMediaWorkflowJobCompartment(
                    ChangeMediaWorkflowJobCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowJobCompartmentRequest,
                                    ChangeMediaWorkflowJobCompartmentResponse>
                            handler);

    /**
     * Moves a Stream Distribution Channel resource from one compartment identifier to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeStreamDistributionChannelCompartmentResponse>
            changeStreamDistributionChannelCompartment(
                    ChangeStreamDistributionChannelCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamDistributionChannelCompartmentRequest,
                                    ChangeStreamDistributionChannelCompartmentResponse>
                            handler);

    /**
     * Creates a new MediaAsset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMediaAssetResponse> createMediaAsset(
            CreateMediaAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMediaAssetRequest, CreateMediaAssetResponse>
                    handler);

    /**
     * Creates a new MediaWorkflow.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMediaWorkflowResponse> createMediaWorkflow(
            CreateMediaWorkflowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>
                    handler);

    /**
     * Creates a new MediaWorkflowConfiguration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMediaWorkflowConfigurationResponse>
            createMediaWorkflowConfiguration(
                    CreateMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateMediaWorkflowConfigurationRequest,
                                    CreateMediaWorkflowConfigurationResponse>
                            handler);

    /**
     * Run the MediaWorkflow according to the given mediaWorkflow definition and configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMediaWorkflowJobResponse> createMediaWorkflowJob(
            CreateMediaWorkflowJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>
                    handler);

    /**
     * Creates a new CDN Configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStreamCdnConfigResponse> createStreamCdnConfig(
            CreateStreamCdnConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>
                    handler);

    /**
     * Creates a new Stream Distribution Channel.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStreamDistributionChannelResponse>
            createStreamDistributionChannel(
                    CreateStreamDistributionChannelRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateStreamDistributionChannelRequest,
                                    CreateStreamDistributionChannelResponse>
                            handler);

    /**
     * Creates a new Packaging Configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStreamPackagingConfigResponse> createStreamPackagingConfig(
            CreateStreamPackagingConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamPackagingConfigRequest, CreateStreamPackagingConfigResponse>
                    handler);

    /**
     * Deletes a MediaAsset resource by identifier. If DeleteChildren is passed in as the mode, all the assets with the parentMediaAssetId matching the ID will be deleted. If DeleteDerivatives is set as the mode, all the assets with the masterMediaAssetId matching the ID will be deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMediaAssetResponse> deleteMediaAsset(
            DeleteMediaAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMediaAssetRequest, DeleteMediaAssetResponse>
                    handler);

    /**
     * Deletes a MediaAsset from the DistributionChannel by identifiers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMediaAssetDistributionChannelAttachmentResponse>
            deleteMediaAssetDistributionChannelAttachment(
                    DeleteMediaAssetDistributionChannelAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaAssetDistributionChannelAttachmentRequest,
                                    DeleteMediaAssetDistributionChannelAttachmentResponse>
                            handler);

    /**
     * The MediaWorkflow lifecycleState will change to DELETED.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMediaWorkflowResponse> deleteMediaWorkflow(
            DeleteMediaWorkflowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>
                    handler);

    /**
     * Deletes a MediaWorkflowConfiguration resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMediaWorkflowConfigurationResponse>
            deleteMediaWorkflowConfiguration(
                    DeleteMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaWorkflowConfigurationRequest,
                                    DeleteMediaWorkflowConfigurationResponse>
                            handler);

    /**
     * This is an asynchronous operation. The MediaWorkflowJob lifecycleState will change to CANCELING temporarily until the job is completely CANCELED.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMediaWorkflowJobResponse> deleteMediaWorkflowJob(
            DeleteMediaWorkflowJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>
                    handler);

    /**
     * The StreamCdnConfig lifecycleState will change to DELETED.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStreamCdnConfigResponse> deleteStreamCdnConfig(
            DeleteStreamCdnConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>
                    handler);

    /**
     * The Stream Distribution Channel lifecycleState will change to DELETED.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStreamDistributionChannelResponse>
            deleteStreamDistributionChannel(
                    DeleteStreamDistributionChannelRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteStreamDistributionChannelRequest,
                                    DeleteStreamDistributionChannelResponse>
                            handler);

    /**
     * The Stream Packaging Configuration lifecycleState will change to DELETED.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStreamPackagingConfigResponse> deleteStreamPackagingConfig(
            DeleteStreamPackagingConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamPackagingConfigRequest, DeleteStreamPackagingConfigResponse>
                    handler);

    /**
     * Gets a MediaAsset by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMediaAssetResponse> getMediaAsset(
            GetMediaAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMediaAssetRequest, GetMediaAssetResponse>
                    handler);

    /**
     * Gets a MediaAssetDistributionChannelAttachment for a MediaAsset by identifiers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMediaAssetDistributionChannelAttachmentResponse>
            getMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaAssetDistributionChannelAttachmentRequest,
                                    GetMediaAssetDistributionChannelAttachmentResponse>
                            handler);

    /**
     * Gets a MediaWorkflow by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMediaWorkflowResponse> getMediaWorkflow(
            GetMediaWorkflowRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
                    handler);

    /**
     * Gets a MediaWorkflowConfiguration by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMediaWorkflowConfigurationResponse>
            getMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaWorkflowConfigurationRequest,
                                    GetMediaWorkflowConfigurationResponse>
                            handler);

    /**
     * Gets the MediaWorkflowJob.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMediaWorkflowJobResponse> getMediaWorkflowJob(
            GetMediaWorkflowJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
                    handler);

    /**
     * Gets a StreamCdnConfig by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStreamCdnConfigResponse> getStreamCdnConfig(
            GetStreamCdnConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
                    handler);

    /**
     * Gets a Stream Distribution Channel by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStreamDistributionChannelResponse> getStreamDistributionChannel(
            GetStreamDistributionChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStreamDistributionChannelRequest,
                            GetStreamDistributionChannelResponse>
                    handler);

    /**
     * Gets a Stream Packaging Configuration by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStreamPackagingConfigResponse> getStreamPackagingConfig(
            GetStreamPackagingConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
                    handler);

    /**
     * Ingests an Asset into a Distribution Channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestStreamDistributionChannelResponse>
            ingestStreamDistributionChannel(
                    IngestStreamDistributionChannelRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    IngestStreamDistributionChannelRequest,
                                    IngestStreamDistributionChannelResponse>
                            handler);

    /**
     * Lists the MediaAssetDistributionChannelAttachments for a MediaAsset by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaAssetDistributionChannelAttachmentsResponse>
            listMediaAssetDistributionChannelAttachments(
                    ListMediaAssetDistributionChannelAttachmentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaAssetDistributionChannelAttachmentsRequest,
                                    ListMediaAssetDistributionChannelAttachmentsResponse>
                            handler);

    /**
     * Returns a list of MediaAssetSummary.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaAssetsResponse> listMediaAssets(
            ListMediaAssetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMediaAssetsRequest, ListMediaAssetsResponse>
                    handler);

    /**
     * Returns a list of MediaWorkflowConfigurations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaWorkflowConfigurationsResponse>
            listMediaWorkflowConfigurations(
                    ListMediaWorkflowConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowConfigurationsRequest,
                                    ListMediaWorkflowConfigurationsResponse>
                            handler);

    /**
     * Lists the MediaWorkflowJobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaWorkflowJobsResponse> listMediaWorkflowJobs(
            ListMediaWorkflowJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>
                    handler);

    /**
     * Returns a list of MediaWorkflowTaskDeclarations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaWorkflowTaskDeclarationsResponse>
            listMediaWorkflowTaskDeclarations(
                    ListMediaWorkflowTaskDeclarationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowTaskDeclarationsRequest,
                                    ListMediaWorkflowTaskDeclarationsResponse>
                            handler);

    /**
     * Lists the MediaWorkflows.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMediaWorkflowsResponse> listMediaWorkflows(
            ListMediaWorkflowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>
                    handler);

    /**
     * Lists the StreamCdnConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStreamCdnConfigsResponse> listStreamCdnConfigs(
            ListStreamCdnConfigsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>
                    handler);

    /**
     * Lists the Stream Distribution Channels.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStreamDistributionChannelsResponse>
            listStreamDistributionChannels(
                    ListStreamDistributionChannelsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListStreamDistributionChannelsRequest,
                                    ListStreamDistributionChannelsResponse>
                            handler);

    /**
     * Lists the Stream Packaging Configurations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStreamPackagingConfigsResponse> listStreamPackagingConfigs(
            ListStreamPackagingConfigsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStreamPackagingConfigsRequest, ListStreamPackagingConfigsResponse>
                    handler);

    /**
     * Lists the SystemMediaWorkflows that can be used to run a job by name or as a template to create a MediaWorkflow.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSystemMediaWorkflowsResponse> listSystemMediaWorkflows(
            ListSystemMediaWorkflowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>
                    handler);

    /**
     * Remove a lock to an MediaAsset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveMediaAssetLockResponse> removeMediaAssetLock(
            RemoveMediaAssetLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveMediaAssetLockRequest, RemoveMediaAssetLockResponse>
                    handler);

    /**
     * Remove a lock from a MediaWorkflowConfiguration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveMediaWorkflowConfigurationLockResponse>
            removeMediaWorkflowConfigurationLock(
                    RemoveMediaWorkflowConfigurationLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveMediaWorkflowConfigurationLockRequest,
                                    RemoveMediaWorkflowConfigurationLockResponse>
                            handler);

    /**
     * Remove a lock from a MediaWorkflowJob.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveMediaWorkflowJobLockResponse> removeMediaWorkflowJobLock(
            RemoveMediaWorkflowJobLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveMediaWorkflowJobLockRequest, RemoveMediaWorkflowJobLockResponse>
                    handler);

    /**
     * Remove a lock from a MediaWorkflow.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveMediaWorkflowLockResponse> removeMediaWorkflowLock(
            RemoveMediaWorkflowLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveMediaWorkflowLockRequest, RemoveMediaWorkflowLockResponse>
                    handler);

    /**
     * Remove a lock from a StreamCdnConfig.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveStreamCdnConfigLockResponse> removeStreamCdnConfigLock(
            RemoveStreamCdnConfigLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveStreamCdnConfigLockRequest, RemoveStreamCdnConfigLockResponse>
                    handler);

    /**
     * Remove a lock to a StreamDistributionChannel.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveStreamDistributionChannelLockResponse>
            removeStreamDistributionChannelLock(
                    RemoveStreamDistributionChannelLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveStreamDistributionChannelLockRequest,
                                    RemoveStreamDistributionChannelLockResponse>
                            handler);

    /**
     * Remove a lock from a StreamPackagingConfig.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveStreamPackagingConfigLockResponse>
            removeStreamPackagingConfigLock(
                    RemoveStreamPackagingConfigLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveStreamPackagingConfigLockRequest,
                                    RemoveStreamPackagingConfigLockResponse>
                            handler);

    /**
     * Updates the MediaAsset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMediaAssetResponse> updateMediaAsset(
            UpdateMediaAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMediaAssetRequest, UpdateMediaAssetResponse>
                    handler);

    /**
     * Updates the MediaWorkflow.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMediaWorkflowResponse> updateMediaWorkflow(
            UpdateMediaWorkflowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>
                    handler);

    /**
     * Updates the MediaWorkflowConfiguration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMediaWorkflowConfigurationResponse>
            updateMediaWorkflowConfiguration(
                    UpdateMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMediaWorkflowConfigurationRequest,
                                    UpdateMediaWorkflowConfigurationResponse>
                            handler);

    /**
     * Updates the MediaWorkflowJob.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMediaWorkflowJobResponse> updateMediaWorkflowJob(
            UpdateMediaWorkflowJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>
                    handler);

    /**
     * Updates the StreamCdnConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStreamCdnConfigResponse> updateStreamCdnConfig(
            UpdateStreamCdnConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>
                    handler);

    /**
     * Updates the Stream Distribution Channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStreamDistributionChannelResponse>
            updateStreamDistributionChannel(
                    UpdateStreamDistributionChannelRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateStreamDistributionChannelRequest,
                                    UpdateStreamDistributionChannelResponse>
                            handler);

    /**
     * Updates the Stream Packaging Configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStreamPackagingConfigResponse> updateStreamPackagingConfig(
            UpdateStreamPackagingConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamPackagingConfigRequest, UpdateStreamPackagingConfigResponse>
                    handler);
}
