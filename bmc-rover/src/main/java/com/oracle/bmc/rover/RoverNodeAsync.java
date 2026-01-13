/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

/** A description of the RoverCloudService API. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public interface RoverNodeAsync extends AutoCloseable {

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
     * Moves a rover node into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRoverNodeCompartmentResponse> changeRoverNodeCompartment(
            ChangeRoverNodeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRoverNodeCompartmentRequest, ChangeRoverNodeCompartmentResponse>
                    handler);

    /**
     * Creates a new RoverNode.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRoverNodeResponse> createRoverNode(
            CreateRoverNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRoverNodeRequest, CreateRoverNodeResponse>
                    handler);

    /**
     * Deletes a RoverNode resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRoverNodeResponse> deleteRoverNode(
            DeleteRoverNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRoverNodeRequest, DeleteRoverNodeResponse>
                    handler);

    /**
     * Gets a RoverNode by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRoverNodeResponse> getRoverNode(
            GetRoverNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRoverNodeRequest, GetRoverNodeResponse>
                    handler);

    /**
     * Get the certificate for a rover node
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRoverNodeCertificateResponse> getRoverNodeCertificate(
            GetRoverNodeCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeCertificateRequest, GetRoverNodeCertificateResponse>
                    handler);

    /**
     * Get the data encryption key for a rover node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRoverNodeEncryptionKeyResponse> getRoverNodeEncryptionKey(
            GetRoverNodeEncryptionKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeEncryptionKeyRequest, GetRoverNodeEncryptionKeyResponse>
                    handler);

    /**
     * Get the resource principal token for a rover node
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRoverNodeGetRptResponse> getRoverNodeGetRpt(
            GetRoverNodeGetRptRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeGetRptRequest, GetRoverNodeGetRptResponse>
                    handler);

    /**
     * Returns a list of RoverNodes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRoverNodesResponse> listRoverNodes(
            ListRoverNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRoverNodesRequest, ListRoverNodesResponse>
                    handler);

    /**
     * Retrieve Ca Bundle for a rover node
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeActionRetrieveCaBundleResponse>
            roverNodeActionRetrieveCaBundle(
                    RoverNodeActionRetrieveCaBundleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeActionRetrieveCaBundleRequest,
                                    RoverNodeActionRetrieveCaBundleResponse>
                            handler);

    /**
     * Get the resource principal public key for a rover node
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeActionSetKeyResponse> roverNodeActionSetKey(
            RoverNodeActionSetKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RoverNodeActionSetKeyRequest, RoverNodeActionSetKeyResponse>
                    handler);

    /**
     * Request to generate certificate for a roverNode.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeGenerateCertificateResponse> roverNodeGenerateCertificate(
            RoverNodeGenerateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RoverNodeGenerateCertificateRequest,
                            RoverNodeGenerateCertificateResponse>
                    handler);

    /**
     * Request to renew certificate for a roverNode.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeRenewCertificateResponse> roverNodeRenewCertificate(
            RoverNodeRenewCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RoverNodeRenewCertificateRequest, RoverNodeRenewCertificateResponse>
                    handler);

    /**
     * Request to replace certificate authority for a roverNode.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeReplaceCertificateAuthorityResponse>
            roverNodeReplaceCertificateAuthority(
                    RoverNodeReplaceCertificateAuthorityRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeReplaceCertificateAuthorityRequest,
                                    RoverNodeReplaceCertificateAuthorityResponse>
                            handler);

    /**
     * Retrieve the leaf certificate info for a rover node
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RoverNodeRetrieveLeafCertificateResponse>
            roverNodeRetrieveLeafCertificate(
                    RoverNodeRetrieveLeafCertificateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeRetrieveLeafCertificateRequest,
                                    RoverNodeRetrieveLeafCertificateResponse>
                            handler);

    /**
     * Updates the RoverNode
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRoverNodeResponse> updateRoverNode(
            UpdateRoverNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRoverNodeRequest, UpdateRoverNodeResponse>
                    handler);
}
