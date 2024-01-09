/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Operator Access Control enables you to control the time duration and the actions an Oracle
 * operator can perform on your Exadata Cloud@Customer infrastructure. Using logging service, you
 * can view a near real-time audit report of all actions performed by an Oracle operator.
 *
 * <p>Use the table of contents and search tool to explore the OperatorAccessControl API.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface OperatorControlAsync extends AutoCloseable {

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
     * Moves the Operator Control resource into a different compartment. When provided, 'If-Match'
     * is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOperatorControlCompartmentResponse>
            changeOperatorControlCompartment(
                    ChangeOperatorControlCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperatorControlCompartmentRequest,
                                    ChangeOperatorControlCompartmentResponse>
                            handler);

    /**
     * Creates an Operator Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperatorControlResponse> createOperatorControl(
            CreateOperatorControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOperatorControlRequest, CreateOperatorControlResponse>
                    handler);

    /**
     * Deletes an Operator Control. You cannot delete an Operator Control if it is assigned to
     * govern any target resource currently or in the future. In that case, first, delete all of the
     * current and future assignments before deleting the Operator Control. An Operator Control that
     * was previously assigned to a target resource is marked as DELETED following a successful
     * deletion. However, it is not completely deleted from the system. This is to ensure auditing
     * information for the accesses done under the Operator Control is preserved for future needs.
     * The system purges the deleted Operator Control only when all of the audit data associated
     * with the Operator Control are also deleted. Therefore, you cannot reuse the name of the
     * deleted Operator Control until the system purges the Operator Control.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperatorControlResponse> deleteOperatorControl(
            DeleteOperatorControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOperatorControlRequest, DeleteOperatorControlResponse>
                    handler);

    /**
     * Gets the Operator Control associated with the specified Operator Control ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperatorControlResponse> getOperatorControl(
            GetOperatorControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOperatorControlRequest, GetOperatorControlResponse>
                    handler);

    /**
     * Lists the operator controls in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperatorControlsResponse> listOperatorControls(
            ListOperatorControlsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOperatorControlsRequest, ListOperatorControlsResponse>
                    handler);

    /**
     * Modifies the existing OperatorControl for a given operator control id except the operator
     * control id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperatorControlResponse> updateOperatorControl(
            UpdateOperatorControlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOperatorControlRequest, UpdateOperatorControlResponse>
                    handler);
}
