/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;

/**
 * Use the Fusion Applications Environment Management API to manage the environments where your Fusion Applications run. For more information, see the [Fusion Applications Environment Management documentation](https://docs.cloud.oracle.com/iaas/Content/Identity/fusion-applications/home.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public interface FusionEnvironmentFamilyAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * Moves a FusionEnvironmentFamily into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFusionEnvironmentFamilyCompartmentResponse>
            changeFusionEnvironmentFamilyCompartment(
                    ChangeFusionEnvironmentFamilyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFusionEnvironmentFamilyCompartmentRequest,
                                    ChangeFusionEnvironmentFamilyCompartmentResponse>
                            handler);

    /**
     * Creates a new FusionEnvironmentFamily.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFusionEnvironmentFamilyResponse>
            createFusionEnvironmentFamily(
                    CreateFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateFusionEnvironmentFamilyRequest,
                                    CreateFusionEnvironmentFamilyResponse>
                            handler);

    /**
     * Deletes a FusionEnvironmentFamily resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFusionEnvironmentFamilyResponse>
            deleteFusionEnvironmentFamily(
                    DeleteFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFusionEnvironmentFamilyRequest,
                                    DeleteFusionEnvironmentFamilyResponse>
                            handler);

    /**
     * Retrieves a fusion environment family identified by its OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilyResponse> getFusionEnvironmentFamily(
            GetFusionEnvironmentFamilyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFusionEnvironmentFamilyRequest, GetFusionEnvironmentFamilyResponse>
                    handler);

    /**
     * Gets the number of environments (usage) of each type in the fusion environment family, as well as the limit that's allowed to be created based on the group's associated subscriptions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilyLimitsAndUsageResponse>
            getFusionEnvironmentFamilyLimitsAndUsage(
                    GetFusionEnvironmentFamilyLimitsAndUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilyLimitsAndUsageRequest,
                                    GetFusionEnvironmentFamilyLimitsAndUsageResponse>
                            handler);

    /**
     * Gets the subscription details of an fusion environment family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFusionEnvironmentFamilySubscriptionDetailResponse>
            getFusionEnvironmentFamilySubscriptionDetail(
                    GetFusionEnvironmentFamilySubscriptionDetailRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFusionEnvironmentFamilySubscriptionDetailRequest,
                                    GetFusionEnvironmentFamilySubscriptionDetailResponse>
                            handler);

    /**
     * Returns a list of FusionEnvironmentFamilies.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFusionEnvironmentFamiliesResponse>
            listFusionEnvironmentFamilies(
                    ListFusionEnvironmentFamiliesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListFusionEnvironmentFamiliesRequest,
                                    ListFusionEnvironmentFamiliesResponse>
                            handler);

    /**
     * Updates the FusionEnvironmentFamily
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFusionEnvironmentFamilyResponse>
            updateFusionEnvironmentFamily(
                    UpdateFusionEnvironmentFamilyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFusionEnvironmentFamilyRequest,
                                    UpdateFusionEnvironmentFamilyResponse>
                            handler);
}
