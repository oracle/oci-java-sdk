/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.accessgovernancecp;

import com.oracle.bmc.accessgovernancecp.requests.*;
import com.oracle.bmc.accessgovernancecp.responses.*;

/** Use the Oracle Access Governance API to create, view, and manage GovernanceInstances. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220518")
public interface AccessGovernanceCPAsync extends AutoCloseable {

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
     * Moves a GovernanceInstance resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeGovernanceInstanceCompartmentResponse>
            changeGovernanceInstanceCompartment(
                    ChangeGovernanceInstanceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGovernanceInstanceCompartmentRequest,
                                    ChangeGovernanceInstanceCompartmentResponse>
                            handler);

    /**
     * Creates a new GovernanceInstance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateGovernanceInstanceResponse> createGovernanceInstance(
            CreateGovernanceInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateGovernanceInstanceRequest, CreateGovernanceInstanceResponse>
                    handler);

    /**
     * Deletes an existing GovernanceInstance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGovernanceInstanceResponse> deleteGovernanceInstance(
            DeleteGovernanceInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteGovernanceInstanceRequest, DeleteGovernanceInstanceResponse>
                    handler);

    /**
     * Gets a GovernanceInstance by OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetGovernanceInstanceResponse> getGovernanceInstance(
            GetGovernanceInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetGovernanceInstanceRequest, GetGovernanceInstanceResponse>
                    handler);

    /**
     * Gets the tenancy-wide configuration for GovernanceInstances
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetGovernanceInstanceConfigurationResponse>
            getGovernanceInstanceConfiguration(
                    GetGovernanceInstanceConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetGovernanceInstanceConfigurationRequest,
                                    GetGovernanceInstanceConfigurationResponse>
                            handler);

    /**
     * Returns a list of Governance Instances.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListGovernanceInstancesResponse> listGovernanceInstances(
            ListGovernanceInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListGovernanceInstancesRequest, ListGovernanceInstancesResponse>
                    handler);

    /**
     * Updates the GovernanceInstance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGovernanceInstanceResponse> updateGovernanceInstance(
            UpdateGovernanceInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateGovernanceInstanceRequest, UpdateGovernanceInstanceResponse>
                    handler);

    /**
     * Updates the tenancy-wide configuration for GovernanceInstances
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGovernanceInstanceConfigurationResponse>
            updateGovernanceInstanceConfiguration(
                    UpdateGovernanceInstanceConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateGovernanceInstanceConfigurationRequest,
                                    UpdateGovernanceInstanceConfigurationResponse>
                            handler);
}
