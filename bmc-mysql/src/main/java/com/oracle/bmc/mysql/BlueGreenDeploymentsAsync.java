/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

/** The API for the MySQL Database Service */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public interface BlueGreenDeploymentsAsync extends AutoCloseable {

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
     * Moves only the blue/green deployment wrapper resource into a different compartment. This
     * operation does not move the source DB system, target DB system, or replication channel
     * referenced by the deployment. When provided, If-Match is checked against ETag values of the
     * blue/green deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBlueGreenDeploymentCompartmentResponse>
            changeBlueGreenDeploymentCompartment(
                    ChangeBlueGreenDeploymentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBlueGreenDeploymentCompartmentRequest,
                                    ChangeBlueGreenDeploymentCompartmentResponse>
                            handler);

    /**
     * Creates a blue/green deployment resource and its replication channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBlueGreenDeploymentResponse> createBlueGreenDeployment(
            CreateBlueGreenDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBlueGreenDeploymentRequest, CreateBlueGreenDeploymentResponse>
                    handler);

    /**
     * Deletes only the blue/green deployment wrapper resource. This operation does not delete the
     * source DB system, target DB system, or replication channel associated with the deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBlueGreenDeploymentResponse> deleteBlueGreenDeployment(
            DeleteBlueGreenDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBlueGreenDeploymentRequest, DeleteBlueGreenDeploymentResponse>
                    handler);

    /**
     * Gets a blue/green deployment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBlueGreenDeploymentResponse> getBlueGreenDeployment(
            GetBlueGreenDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBlueGreenDeploymentRequest, GetBlueGreenDeploymentResponse>
                    handler);

    /**
     * Lists blue/green deployments in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBlueGreenDeploymentsResponse> listBlueGreenDeployments(
            ListBlueGreenDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBlueGreenDeploymentsRequest, ListBlueGreenDeploymentsResponse>
                    handler);

    /**
     * Initiates switchover for a blue/green deployment.
     *
     * <p>This action is asynchronous and supports idempotent retry only when the same
     * `opc-retry-token` is reused for an equivalent switchover request on the same blue/green
     * deployment. Equivalent request identity includes materially equivalent request parameters
     * after applying defaults and preconditions, including the effective `waitTimeInSeconds` from
     * the request body and the same `If-Match` value when provided. An empty switchover details
     * body and a body that explicitly passes the default `waitTimeInSeconds=300` are equivalent.
     *
     * <p>Requests that change `If-Match` or other material preconditions are treated as new
     * requests and follow normal conflict (`409`) or precondition (`412`) handling instead of
     * ordinary retry reuse.
     *
     * <p>Switchover outcome and partial/failure conditions are surfaced through `lifecycleState`,
     * `lifecycleDetails`, `switchoverStatus`, and `activeDbSystemId` in the blue/green deployment
     * resource.
     *
     * <p>When `waitTimeInSeconds` is omitted from the request body, the default wait time applies.
     * The effective wait time provides upper bound guidance for waiting while the target DB System
     * applies remaining replication changes during switchover processing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SwitchoverBlueGreenDeploymentResponse>
            switchoverBlueGreenDeployment(
                    SwitchoverBlueGreenDeploymentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverBlueGreenDeploymentRequest,
                                    SwitchoverBlueGreenDeploymentResponse>
                            handler);

    /**
     * Updates mutable metadata for a blue/green deployment. Currently only `displayName`,
     * `freeformTags`, and `definedTags` can be changed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBlueGreenDeploymentResponse> updateBlueGreenDeployment(
            UpdateBlueGreenDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBlueGreenDeploymentRequest, UpdateBlueGreenDeploymentResponse>
                    handler);
}
