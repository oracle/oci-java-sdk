/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer;

import com.oracle.bmc.computecloudatcustomer.requests.*;
import com.oracle.bmc.computecloudatcustomer.responses.*;

/**
 * Use the Compute Cloud@Customer API to manage Compute Cloud@Customer infrastructures and upgrade
 * schedules. For more information see [Compute Cloud@Customer
 * documentation](https://docs.oracle.com/iaas/compute-cloud-at-customer/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public interface ComputeCloudAtCustomerAsync extends AutoCloseable {

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
     * Moves a Compute Cloud@Customer infrastructure resource from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCccInfrastructureCompartmentResponse>
            changeCccInfrastructureCompartment(
                    ChangeCccInfrastructureCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCccInfrastructureCompartmentRequest,
                                    ChangeCccInfrastructureCompartmentResponse>
                            handler);

    /**
     * Moves a Compute Cloud@Customer upgrade schedule from one compartment to another using the
     * specified [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCccUpgradeScheduleCompartmentResponse>
            changeCccUpgradeScheduleCompartment(
                    ChangeCccUpgradeScheduleCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCccUpgradeScheduleCompartmentRequest,
                                    ChangeCccUpgradeScheduleCompartmentResponse>
                            handler);

    /**
     * Creates a Compute Cloud@Customer infrastructure. Once created, Oracle Services must connect
     * the rack in the data center to this Oracle Cloud Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCccInfrastructureResponse> createCccInfrastructure(
            CreateCccInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCccInfrastructureRequest, CreateCccInfrastructureResponse>
                    handler);

    /**
     * Creates a new Compute Cloud@Customer upgrade schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCccUpgradeScheduleResponse> createCccUpgradeSchedule(
            CreateCccUpgradeScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCccUpgradeScheduleRequest, CreateCccUpgradeScheduleResponse>
                    handler);

    /**
     * Deletes a Compute Cloud@Customer infrastructure resource specified by the resource
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCccInfrastructureResponse> deleteCccInfrastructure(
            DeleteCccInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCccInfrastructureRequest, DeleteCccInfrastructureResponse>
                    handler);

    /**
     * Deletes a Compute Cloud@Customer upgrade schedule by the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCccUpgradeScheduleResponse> deleteCccUpgradeSchedule(
            DeleteCccUpgradeScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCccUpgradeScheduleRequest, DeleteCccUpgradeScheduleResponse>
                    handler);

    /**
     * Gets a Compute Cloud@Customer infrastructure using the infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCccInfrastructureResponse> getCccInfrastructure(
            GetCccInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCccInfrastructureRequest, GetCccInfrastructureResponse>
                    handler);

    /**
     * Gets a Compute Cloud@Customer upgrade schedule by the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCccUpgradeScheduleResponse> getCccUpgradeSchedule(
            GetCccUpgradeScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCccUpgradeScheduleRequest, GetCccUpgradeScheduleResponse>
                    handler);

    /**
     * Returns a list of Compute Cloud@Customer infrastructures.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCccInfrastructuresResponse> listCccInfrastructures(
            ListCccInfrastructuresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCccInfrastructuresRequest, ListCccInfrastructuresResponse>
                    handler);

    /**
     * Returns a list of Compute Cloud@Customer upgrade schedules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCccUpgradeSchedulesResponse> listCccUpgradeSchedules(
            ListCccUpgradeSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCccUpgradeSchedulesRequest, ListCccUpgradeSchedulesResponse>
                    handler);

    /**
     * Updates Compute Cloud@Customer infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCccInfrastructureResponse> updateCccInfrastructure(
            UpdateCccInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCccInfrastructureRequest, UpdateCccInfrastructureResponse>
                    handler);

    /**
     * Updates the Compute Cloud@Customer upgrade schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCccUpgradeScheduleResponse> updateCccUpgradeSchedule(
            UpdateCccUpgradeScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCccUpgradeScheduleRequest, UpdateCccUpgradeScheduleResponse>
                    handler);
}
