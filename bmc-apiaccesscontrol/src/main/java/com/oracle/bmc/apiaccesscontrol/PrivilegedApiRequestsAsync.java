/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol;

import com.oracle.bmc.apiaccesscontrol.requests.*;
import com.oracle.bmc.apiaccesscontrol.responses.*;

/**
 * This service is used to restrict the control plane service apis; so that everybody won't be able
 * to access those apis. There are two main resouces defined as a part of this service 1.
 * PrivilegedApiControl: This is created by the customer which defines which service apis are
 * controlled and who can access it. 2. PrivilegedApiRequest: This is a request object again created
 * by the customer operators who seek access to those privileged apis. After a request is obtained
 * based on the PrivilegedAccessControl for which the api belongs to, either it can be approved so
 * that the requested person can execute the service apis or it will wait for the customer to
 * approve it.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
public interface PrivilegedApiRequestsAsync extends AutoCloseable {

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
     * Approves privilegedApi request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApprovePrivilegedApiRequestResponse> approvePrivilegedApiRequest(
            ApprovePrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApprovePrivilegedApiRequestRequest, ApprovePrivilegedApiRequestResponse>
                    handler);

    /**
     * Closes privilegedApi request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ClosePrivilegedApiRequestResponse> closePrivilegedApiRequest(
            ClosePrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ClosePrivilegedApiRequestRequest, ClosePrivilegedApiRequestResponse>
                    handler);

    /**
     * Creates a PrivilegedApiRequest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivilegedApiRequestResponse> createPrivilegedApiRequest(
            CreatePrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivilegedApiRequestRequest, CreatePrivilegedApiRequestResponse>
                    handler);

    /**
     * Gets information about a PrivilegedApiRequest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivilegedApiRequestResponse> getPrivilegedApiRequest(
            GetPrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivilegedApiRequestRequest, GetPrivilegedApiRequestResponse>
                    handler);

    /**
     * Lists all privilegedApi requests in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivilegedApiRequestsResponse> listPrivilegedApiRequests(
            ListPrivilegedApiRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivilegedApiRequestsRequest, ListPrivilegedApiRequestsResponse>
                    handler);

    /**
     * Rejects privilegedApi request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RejectPrivilegedApiRequestResponse> rejectPrivilegedApiRequest(
            RejectPrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RejectPrivilegedApiRequestRequest, RejectPrivilegedApiRequestResponse>
                    handler);

    /**
     * Revokes an already approved privilegedApi request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RevokePrivilegedApiRequestResponse> revokePrivilegedApiRequest(
            RevokePrivilegedApiRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RevokePrivilegedApiRequestRequest, RevokePrivilegedApiRequestResponse>
                    handler);
}
