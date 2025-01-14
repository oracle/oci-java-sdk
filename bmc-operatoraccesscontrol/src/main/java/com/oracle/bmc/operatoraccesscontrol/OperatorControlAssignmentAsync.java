/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public interface OperatorControlAssignmentAsync extends AutoCloseable {

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
     * Changes the compartment of the specified Operator Control assignment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOperatorControlAssignmentCompartmentResponse>
            changeOperatorControlAssignmentCompartment(
                    ChangeOperatorControlAssignmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperatorControlAssignmentCompartmentRequest,
                                    ChangeOperatorControlAssignmentCompartmentResponse>
                            handler);

    /**
     * Creates an Operator Control Assignment resource. In effect, this brings the target resource
     * under the governance of the Operator Control for specified time duration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperatorControlAssignmentResponse>
            createOperatorControlAssignment(
                    CreateOperatorControlAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperatorControlAssignmentRequest,
                                    CreateOperatorControlAssignmentResponse>
                            handler);

    /**
     * Deletes the specified Operator Control Assignment. This has the effect of unassigning the
     * specific Operator Control from the target resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperatorControlAssignmentResponse>
            deleteOperatorControlAssignment(
                    DeleteOperatorControlAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperatorControlAssignmentRequest,
                                    DeleteOperatorControlAssignmentResponse>
                            handler);

    /**
     * Returns the status of assignment validation associated with the assignmentId and the
     * executionId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAssignmentValidationStatusResponse>
            getAssignmentValidationStatus(
                    GetAssignmentValidationStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAssignmentValidationStatusRequest,
                                    GetAssignmentValidationStatusResponse>
                            handler);

    /**
     * Gets the details of an Operator Control Assignment of the specified ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperatorControlAssignmentResponse> getOperatorControlAssignment(
            GetOperatorControlAssignmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOperatorControlAssignmentRequest,
                            GetOperatorControlAssignmentResponse>
                    handler);

    /**
     * Lists all Operator Control Assignments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperatorControlAssignmentsResponse>
            listOperatorControlAssignments(
                    ListOperatorControlAssignmentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperatorControlAssignmentsRequest,
                                    ListOperatorControlAssignmentsResponse>
                            handler);

    /**
     * Modifies the existing Operator Control assignment of the specified Operator Control
     * assignment ID. Modifying the assignment does not change the Operator Control assignment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperatorControlAssignmentResponse>
            updateOperatorControlAssignment(
                    UpdateOperatorControlAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperatorControlAssignmentRequest,
                                    UpdateOperatorControlAssignmentResponse>
                            handler);

    /**
     * Validates the assignment for the specified Operator Control Assignment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateOperatorAssignmentResponse> validateOperatorAssignment(
            ValidateOperatorAssignmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateOperatorAssignmentRequest, ValidateOperatorAssignmentResponse>
                    handler);
}
