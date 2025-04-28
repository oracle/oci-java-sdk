/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;

/**
 * Use the Exadata Fleet Update service to patch large collections of components directly, as a
 * single entity, orchestrating the maintenance actions to update all chosen components in the stack
 * in a single cycle.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public interface FleetSoftwareUpdateAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Aborts Exadata Fleet Update Discovery in progress.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AbortFsuDiscoveryResponse> abortFsuDiscovery(
            AbortFsuDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>
                    handler);

    /**
     * Adds targets to an existing Exadata Fleet Update Collection. Targets that are already part of
     * a different Collection with an active Fleet Software Update Cycle cannot be added. This
     * operation can only be performed on Collections that do not have an Action executing under an
     * active Fleet Software Update Cycle. Additionally, during an active Fleet Software Update
     * Cycle, targets can be added only prior to executing an Apply Action. This will require
     * running a new Stage Action for the active Cycle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddFsuCollectionTargetsResponse> addFsuCollectionTargets(
            AddFsuCollectionTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>
                    handler);

    /**
     * Cancels a scheduled Action. Only applicable for Actions that have not started executing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelFsuActionResponse> cancelFsuAction(
            CancelFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelFsuActionRequest, CancelFsuActionResponse>
                    handler);

    /**
     * Moves a Exadata Fleet Update Action resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFsuActionCompartmentResponse> changeFsuActionCompartment(
            ChangeFsuActionCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeFsuActionCompartmentRequest, ChangeFsuActionCompartmentResponse>
                    handler);

    /**
     * Moves a Exadata Fleet Update Collection resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFsuCollectionCompartmentResponse>
            changeFsuCollectionCompartment(
                    ChangeFsuCollectionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuCollectionCompartmentRequest,
                                    ChangeFsuCollectionCompartmentResponse>
                            handler);

    /**
     * Moves a Exadata Fleet Update Cycle resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFsuCycleCompartmentResponse> changeFsuCycleCompartment(
            ChangeFsuCycleCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeFsuCycleCompartmentRequest, ChangeFsuCycleCompartmentResponse>
                    handler);

    /**
     * Moves a Exadata Fleet Update Discovery resource from one compartment identifier to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFsuDiscoveryCompartmentResponse>
            changeFsuDiscoveryCompartment(
                    ChangeFsuDiscoveryCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuDiscoveryCompartmentRequest,
                                    ChangeFsuDiscoveryCompartmentResponse>
                            handler);

    /**
     * Clones existing Exadata Fleet Update Cycle details into a new Exadata Fleet Update Cycle
     * resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CloneFsuCycleResponse> cloneFsuCycle(
            CloneFsuCycleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CloneFsuCycleRequest, CloneFsuCycleResponse>
                    handler);

    /**
     * Creates a new Exadata Fleet Update Action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFsuActionResponse> createFsuAction(
            CreateFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFsuActionRequest, CreateFsuActionResponse>
                    handler);

    /**
     * Creates a new Exadata Fleet Update Collection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFsuCollectionResponse> createFsuCollection(
            CreateFsuCollectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuCollectionRequest, CreateFsuCollectionResponse>
                    handler);

    /**
     * Creates a new Exadata Fleet Update Cycle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFsuCycleResponse> createFsuCycle(
            CreateFsuCycleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFsuCycleRequest, CreateFsuCycleResponse>
                    handler);

    /**
     * Creates a new Exadata Fleet Update Discovery.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFsuDiscoveryResponse> createFsuDiscovery(
            CreateFsuDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>
                    handler);

    /**
     * Deletes a Exadata Fleet Update Action resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuActionResponse> deleteFsuAction(
            DeleteFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFsuActionRequest, DeleteFsuActionResponse>
                    handler);

    /**
     * Deletes a Exadata Fleet Update Collection resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuCollectionResponse> deleteFsuCollection(
            DeleteFsuCollectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>
                    handler);

    /**
     * Removes a target from an existing Exadata Fleet Update Collection. This operation can only be
     * performed on Collections that do not have an Action executing under an active Fleet Software
     * Update Cycle. Additionally, during an active Fleet Software Update Cycle, a target can be
     * removed only prior to executing an Apply Action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuCollectionTargetResponse> deleteFsuCollectionTarget(
            DeleteFsuCollectionTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCollectionTargetRequest, DeleteFsuCollectionTargetResponse>
                    handler);

    /**
     * Deletes a Exadata Fleet Update Cycle resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuCycleResponse> deleteFsuCycle(
            DeleteFsuCycleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFsuCycleRequest, DeleteFsuCycleResponse>
                    handler);

    /**
     * Deletes a Exadata Fleet Update Discovery resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuDiscoveryResponse> deleteFsuDiscovery(
            DeleteFsuDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>
                    handler);

    /**
     * Deletes the Exadata Fleet Update Job resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFsuJobResponse> deleteFsuJob(
            DeleteFsuJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFsuJobRequest, DeleteFsuJobResponse>
                    handler);

    /**
     * Gets a Exadata Fleet Update Action by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuActionResponse> getFsuAction(
            GetFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFsuActionRequest, GetFsuActionResponse>
                    handler);

    /**
     * Gets the Exadata Fleet Update Action Output content as a binary file (string). This will only
     * include the output from FAILED Exadata Fleet Update Jobs. No content in case there are no
     * FAILED jobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuActionOutputContentResponse> getFsuActionOutputContent(
            GetFsuActionOutputContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFsuActionOutputContentRequest, GetFsuActionOutputContentResponse>
                    handler);

    /**
     * Gets a Exadata Fleet Update Collection by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuCollectionResponse> getFsuCollection(
            GetFsuCollectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFsuCollectionRequest, GetFsuCollectionResponse>
                    handler);

    /**
     * Gets a Exadata Fleet Update Collection Target by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuCollectionTargetResponse> getFsuCollectionTarget(
            GetFsuCollectionTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFsuCollectionTargetRequest, GetFsuCollectionTargetResponse>
                    handler);

    /**
     * Gets a Exadata Fleet Update Cycle by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuCycleResponse> getFsuCycle(
            GetFsuCycleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFsuCycleRequest, GetFsuCycleResponse> handler);

    /**
     * Gets a Exadata Fleet Update Discovery by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuDiscoveryResponse> getFsuDiscovery(
            GetFsuDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>
                    handler);

    /**
     * Gets a Exadata Fleet Update Job by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuJobResponse> getFsuJob(
            GetFsuJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFsuJobRequest, GetFsuJobResponse> handler);

    /**
     * Get the Exadata Fleet Update Job Output content as a binary file (string).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFsuJobOutputContentResponse> getFsuJobOutputContent(
            GetFsuJobOutputContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>
                    handler);

    /**
     * Gets the status of the work request with the specified ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Gets a list of all Exadata Fleet Update Actions in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuActionsResponse> listFsuActions(
            ListFsuActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFsuActionsRequest, ListFsuActionsResponse>
                    handler);

    /**
     * Gets a list of all Targets that are members of a specific Exadata Fleet Update Collection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuCollectionTargetsResponse> listFsuCollectionTargets(
            ListFsuCollectionTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>
                    handler);

    /**
     * Gets a list of all Exadata Fleet Update Collections in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuCollectionsResponse> listFsuCollections(
            ListFsuCollectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionsRequest, ListFsuCollectionsResponse>
                    handler);

    /**
     * Gets a list of all Exadata Fleet Update Cycles in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuCyclesResponse> listFsuCycles(
            ListFsuCyclesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFsuCyclesRequest, ListFsuCyclesResponse>
                    handler);

    /**
     * Returns a list of Exadata Fleet Update Discoveries resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuDiscoveriesResponse> listFsuDiscoveries(
            ListFsuDiscoveriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>
                    handler);

    /**
     * Gets a list of all Targets in the results of a Exadata Fleet Update Discovery.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuDiscoveryTargetsResponse> listFsuDiscoveryTargets(
            ListFsuDiscoveryTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>
                    handler);

    /**
     * Lists the Exadata Fleet Update Job Output messages, if any.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuJobOutputsResponse> listFsuJobOutputs(
            ListFsuJobOutputsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>
                    handler);

    /**
     * Lists all the Exadata Fleet Update Jobs associated to the specified Exadata Fleet Update
     * Action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFsuJobsResponse> listFsuJobs(
            ListFsuJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFsuJobsRequest, ListFsuJobsResponse> handler);

    /**
     * Returns a paginated list of errors for a specified Work Request..
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for a specified Work Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Removes targets from an existing Exadata Fleet Update Collection. This operation can only be
     * performed on Collections that do not have an Action executing under an active Fleet Software
     * Update Cycle. Additionally, during an active Fleet Software Update Cycle, targets can be
     * removed only prior to executing an Apply Action.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveFsuCollectionTargetsResponse> removeFsuCollectionTargets(
            RemoveFsuCollectionTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveFsuCollectionTargetsRequest, RemoveFsuCollectionTargetsResponse>
                    handler);

    /**
     * Resumes an Action that has batches of targets waiting to execute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResumeFsuActionResponse> resumeFsuAction(
            ResumeFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<ResumeFsuActionRequest, ResumeFsuActionResponse>
                    handler);

    /**
     * Retry a failed Job, only while the current Action is being executed. After the Action reaches
     * a terminal state, a new Action of the same kind is required to retry on failed targets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetryFsuJobResponse> retryFsuJob(
            RetryFsuJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<RetryFsuJobRequest, RetryFsuJobResponse> handler);

    /**
     * Updates the Exadata Fleet Update Action identified by the ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFsuActionResponse> updateFsuAction(
            UpdateFsuActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFsuActionRequest, UpdateFsuActionResponse>
                    handler);

    /**
     * Updates the Exadata Fleet Update Collection identified by the ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFsuCollectionResponse> updateFsuCollection(
            UpdateFsuCollectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>
                    handler);

    /**
     * Updates the Exadata Fleet Update Cycle identified by the ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFsuCycleResponse> updateFsuCycle(
            UpdateFsuCycleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFsuCycleRequest, UpdateFsuCycleResponse>
                    handler);

    /**
     * Updates the Exadata Fleet Update Discovery identified by the ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFsuDiscoveryResponse> updateFsuDiscovery(
            UpdateFsuDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>
                    handler);

    /**
     * Updates Exadata Fleet Update Job resource details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFsuJobResponse> updateFsuJob(
            UpdateFsuJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFsuJobRequest, UpdateFsuJobResponse>
                    handler);
}
