/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa;

import com.oracle.bmc.psa.requests.*;
import com.oracle.bmc.psa.responses.*;

/** Use the PrivateServiceAccess Control Plane API to manage privateServiceAccess. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public interface PrivateServiceAccessAsync extends AutoCloseable {

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
     * Cancels a PrivateServiceAccess work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelPsaWorkRequestResponse> cancelPsaWorkRequest(
            CancelPsaWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelPsaWorkRequestRequest, CancelPsaWorkRequestResponse>
                    handler);

    /**
     * Moves a PrivateServiceAccess into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateServiceAccessCompartmentResponse>
            changePrivateServiceAccessCompartment(
                    ChangePrivateServiceAccessCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateServiceAccessCompartmentRequest,
                                    ChangePrivateServiceAccessCompartmentResponse>
                            handler);

    /**
     * Creates a private service access in the specified subnet (in the consumer's VCN) and the
     * specified compartment for a particular service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateServiceAccessResponse> createPrivateServiceAccess(
            CreatePrivateServiceAccessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateServiceAccessRequest, CreatePrivateServiceAccessResponse>
                    handler);

    /**
     * Deletes a PrivateServiceAccess.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateServiceAccessResponse> deletePrivateServiceAccess(
            DeletePrivateServiceAccessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateServiceAccessRequest, DeletePrivateServiceAccessResponse>
                    handler);

    /**
     * Gets information about a PrivateServiceAccess.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateServiceAccessResponse> getPrivateServiceAccess(
            GetPrivateServiceAccessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateServiceAccessRequest, GetPrivateServiceAccessResponse>
                    handler);

    /**
     * Gets the details of a PrivateServiceAccess work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPsaWorkRequestResponse> getPsaWorkRequest(
            GetPsaWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPsaWorkRequestRequest, GetPsaWorkRequestResponse>
                    handler);

    /**
     * List the private service accesses in the specified compartment. You can optionally filter the
     * list by specifying the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a subnet in
     * the cunsumer's VCN.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateServiceAccessesResponse> listPrivateServiceAccesses(
            ListPrivateServiceAccessesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateServiceAccessesRequest, ListPrivateServiceAccessesResponse>
                    handler);

    /**
     * List the OCI services available for Private Service Access catalog in the region, sorted by
     * service name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPsaServicesResponse> listPsaServices(
            ListPsaServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPsaServicesRequest, ListPsaServicesResponse>
                    handler);

    /**
     * Lists the errors for a PrivateServiceAccess work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPsaWorkRequestErrorsResponse> listPsaWorkRequestErrors(
            ListPsaWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestErrorsRequest, ListPsaWorkRequestErrorsResponse>
                    handler);

    /**
     * Lists the logs for a PrivateServiceAccess work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPsaWorkRequestLogsResponse> listPsaWorkRequestLogs(
            ListPsaWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestLogsRequest, ListPsaWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the PrivateServiceAccess work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPsaWorkRequestsResponse> listPsaWorkRequests(
            ListPsaWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestsRequest, ListPsaWorkRequestsResponse>
                    handler);

    /**
     * Updates a PrivateServiceAccess.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateServiceAccessResponse> updatePrivateServiceAccess(
            UpdatePrivateServiceAccessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateServiceAccessRequest, UpdatePrivateServiceAccessResponse>
                    handler);
}
