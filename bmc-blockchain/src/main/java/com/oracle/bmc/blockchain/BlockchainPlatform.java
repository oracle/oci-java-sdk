/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain;

import com.oracle.bmc.blockchain.requests.*;
import com.oracle.bmc.blockchain.responses.*;

/**
 * Blockchain Platform Plane API
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public interface BlockchainPlatform extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Change Blockchain Platform Compartment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeBlockchainPlatformCompartmentResponse changeBlockchainPlatformCompartment(
            ChangeBlockchainPlatformCompartmentRequest request);

    /**
     * Creates a new Blockchain Platform.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBlockchainPlatformResponse createBlockchainPlatform(
            CreateBlockchainPlatformRequest request);

    /**
     * Create Blockchain Platform Osn
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateOsnResponse createOsn(CreateOsnRequest request);

    /**
     * Create Blockchain Platform Peer
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePeerResponse createPeer(CreatePeerRequest request);

    /**
     * Delete a particular of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBlockchainPlatformResponse deleteBlockchainPlatform(
            DeleteBlockchainPlatformRequest request);

    /**
     * Delete a particular OSN of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteOsnResponse deleteOsn(DeleteOsnRequest request);

    /**
     * Delete a particular peer of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePeerResponse deletePeer(DeletePeerRequest request);

    /**
     * Attempts to cancel the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request);

    /**
     * Gets information about a Blockchain Platform identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBlockchainPlatformResponse getBlockchainPlatform(GetBlockchainPlatformRequest request);

    /**
     * Gets information about an OSN identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetOsnResponse getOsn(GetOsnRequest request);

    /**
     * Gets information about a peer identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPeerResponse getPeer(GetPeerRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list Blockchain Platform Instances in a compartment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBlockchainPlatformsResponse listBlockchainPlatforms(ListBlockchainPlatformsRequest request);

    /**
     * List Blockchain Platform OSNs
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListOsnsResponse listOsns(ListOsnsRequest request);

    /**
     * List Blockchain Platform Peers
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPeersResponse listPeers(ListPeersRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Preview Scale Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PreviewScaleBlockchainPlatformResponse previewScaleBlockchainPlatform(
            PreviewScaleBlockchainPlatformRequest request);

    /**
     * Scale Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ScaleBlockchainPlatformResponse scaleBlockchainPlatform(ScaleBlockchainPlatformRequest request);

    /**
     * Start a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartBlockchainPlatformResponse startBlockchainPlatform(StartBlockchainPlatformRequest request);

    /**
     * Stop a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopBlockchainPlatformResponse stopBlockchainPlatform(StopBlockchainPlatformRequest request);

    /**
     * Update a particular of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBlockchainPlatformResponse updateBlockchainPlatform(
            UpdateBlockchainPlatformRequest request);

    /**
     * Update Blockchain Platform OSN
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateOsnResponse updateOsn(UpdateOsnRequest request);

    /**
     * Update Blockchain Platform Peer
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePeerResponse updatePeer(UpdatePeerRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    BlockchainPlatformWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BlockchainPlatformPaginators getPaginators();
}
