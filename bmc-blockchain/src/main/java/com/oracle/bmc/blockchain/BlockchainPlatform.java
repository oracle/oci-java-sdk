/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain;

import com.oracle.bmc.blockchain.requests.*;
import com.oracle.bmc.blockchain.responses.*;

/**
 * Blockchain Platform Control Plane API
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public interface BlockchainPlatform extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ChangeBlockchainPlatformCompartmentExample.java.html">here</a> to see how to use ChangeBlockchainPlatformCompartment API.
     */
    ChangeBlockchainPlatformCompartmentResponse changeBlockchainPlatformCompartment(
            ChangeBlockchainPlatformCompartmentRequest request);

    /**
     * Creates a new Blockchain Platform.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/CreateBlockchainPlatformExample.java.html">here</a> to see how to use CreateBlockchainPlatform API.
     */
    CreateBlockchainPlatformResponse createBlockchainPlatform(
            CreateBlockchainPlatformRequest request);

    /**
     * Create Blockchain Platform Osn
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/CreateOsnExample.java.html">here</a> to see how to use CreateOsn API.
     */
    CreateOsnResponse createOsn(CreateOsnRequest request);

    /**
     * Create Blockchain Platform Peer
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/CreatePeerExample.java.html">here</a> to see how to use CreatePeer API.
     */
    CreatePeerResponse createPeer(CreatePeerRequest request);

    /**
     * Delete a particular of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/DeleteBlockchainPlatformExample.java.html">here</a> to see how to use DeleteBlockchainPlatform API.
     */
    DeleteBlockchainPlatformResponse deleteBlockchainPlatform(
            DeleteBlockchainPlatformRequest request);

    /**
     * Delete a particular OSN of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/DeleteOsnExample.java.html">here</a> to see how to use DeleteOsn API.
     */
    DeleteOsnResponse deleteOsn(DeleteOsnRequest request);

    /**
     * Delete a particular peer of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/DeletePeerExample.java.html">here</a> to see how to use DeletePeer API.
     */
    DeletePeerResponse deletePeer(DeletePeerRequest request);

    /**
     * Attempts to cancel the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/DeleteWorkRequestExample.java.html">here</a> to see how to use DeleteWorkRequest API.
     */
    DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request);

    /**
     * Gets information about a Blockchain Platform identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/GetBlockchainPlatformExample.java.html">here</a> to see how to use GetBlockchainPlatform API.
     */
    GetBlockchainPlatformResponse getBlockchainPlatform(GetBlockchainPlatformRequest request);

    /**
     * Gets information about an OSN identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/GetOsnExample.java.html">here</a> to see how to use GetOsn API.
     */
    GetOsnResponse getOsn(GetOsnRequest request);

    /**
     * Gets information about a peer identified by the specific id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/GetPeerExample.java.html">here</a> to see how to use GetPeer API.
     */
    GetPeerResponse getPeer(GetPeerRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/GetWorkRequestExample.java.html">here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list Blockchain Platform Instances in a compartment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListBlockchainPlatformsExample.java.html">here</a> to see how to use ListBlockchainPlatforms API.
     */
    ListBlockchainPlatformsResponse listBlockchainPlatforms(ListBlockchainPlatformsRequest request);

    /**
     * List Blockchain Platform OSNs
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListOsnsExample.java.html">here</a> to see how to use ListOsns API.
     */
    ListOsnsResponse listOsns(ListOsnsRequest request);

    /**
     * List Blockchain Platform Peers
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListPeersExample.java.html">here</a> to see how to use ListPeers API.
     */
    ListPeersResponse listPeers(ListPeersRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListWorkRequestErrorsExample.java.html">here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListWorkRequestLogsExample.java.html">here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ListWorkRequestsExample.java.html">here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Preview Scale Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/PreviewScaleBlockchainPlatformExample.java.html">here</a> to see how to use PreviewScaleBlockchainPlatform API.
     */
    PreviewScaleBlockchainPlatformResponse previewScaleBlockchainPlatform(
            PreviewScaleBlockchainPlatformRequest request);

    /**
     * Scale Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/ScaleBlockchainPlatformExample.java.html">here</a> to see how to use ScaleBlockchainPlatform API.
     */
    ScaleBlockchainPlatformResponse scaleBlockchainPlatform(ScaleBlockchainPlatformRequest request);

    /**
     * Start a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/StartBlockchainPlatformExample.java.html">here</a> to see how to use StartBlockchainPlatform API.
     */
    StartBlockchainPlatformResponse startBlockchainPlatform(StartBlockchainPlatformRequest request);

    /**
     * Stop a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/StopBlockchainPlatformExample.java.html">here</a> to see how to use StopBlockchainPlatform API.
     */
    StopBlockchainPlatformResponse stopBlockchainPlatform(StopBlockchainPlatformRequest request);

    /**
     * Update a particular of a Blockchain Platform
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/UpdateBlockchainPlatformExample.java.html">here</a> to see how to use UpdateBlockchainPlatform API.
     */
    UpdateBlockchainPlatformResponse updateBlockchainPlatform(
            UpdateBlockchainPlatformRequest request);

    /**
     * Update Blockchain Platform OSN
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/UpdateOsnExample.java.html">here</a> to see how to use UpdateOsn API.
     */
    UpdateOsnResponse updateOsn(UpdateOsnRequest request);

    /**
     * Update Blockchain Platform Peer
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/UpdatePeerExample.java.html">here</a> to see how to use UpdatePeer API.
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
