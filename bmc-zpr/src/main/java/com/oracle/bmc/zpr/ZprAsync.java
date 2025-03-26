/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.zpr;

import com.oracle.bmc.zpr.requests.*;
import com.oracle.bmc.zpr.responses.*;

/**
 * Use the Zero Trust Packet Routing Control Plane API to manage ZPR configuration and policy. See the [Zero Trust Packet Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/home.htm) documentation for more information.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public interface ZprAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Initiates the process to onboard ZPR
     * in a root compartment (the root compartment is the tenancy). It creates an object of ZPR configuration as part of onboarding.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConfigurationResponse> createConfiguration(
            CreateConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConfigurationRequest, CreateConfigurationResponse>
                    handler);

    /**
     * Creates a ZprPolicy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateZprPolicyResponse> createZprPolicy(
            CreateZprPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateZprPolicyRequest, CreateZprPolicyResponse>
                    handler);

    /**
     * Deletes a ZprPolicy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteZprPolicyResponse> deleteZprPolicy(
            DeleteZprPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteZprPolicyRequest, DeleteZprPolicyResponse>
                    handler);

    /**
     * Retrieves the ZPR configuration details for the root compartment (the root compartment is the tenancy).
     * Returns ZPR configuration for root compartment (the root compartment is the tenancy).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConfigurationRequest, GetConfigurationResponse>
                    handler);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetZprConfigurationWorkRequestResponse>
            getZprConfigurationWorkRequest(
                    GetZprConfigurationWorkRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetZprConfigurationWorkRequestRequest,
                                    GetZprConfigurationWorkRequestResponse>
                            handler);

    /**
     * Gets information about a ZprPolicy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetZprPolicyResponse> getZprPolicy(
            GetZprPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZprPolicyRequest, GetZprPolicyResponse>
                    handler);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetZprPolicyWorkRequestResponse> getZprPolicyWorkRequest(
            GetZprPolicyWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetZprPolicyWorkRequestRequest, GetZprPolicyWorkRequestResponse>
                    handler);

    /**
     * Lists the errors for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprConfigurationWorkRequestErrorsResponse>
            listZprConfigurationWorkRequestErrors(
                    ListZprConfigurationWorkRequestErrorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestErrorsRequest,
                                    ListZprConfigurationWorkRequestErrorsResponse>
                            handler);

    /**
     * Lists the logs for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprConfigurationWorkRequestLogsResponse>
            listZprConfigurationWorkRequestLogs(
                    ListZprConfigurationWorkRequestLogsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestLogsRequest,
                                    ListZprConfigurationWorkRequestLogsResponse>
                            handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprConfigurationWorkRequestsResponse>
            listZprConfigurationWorkRequests(
                    ListZprConfigurationWorkRequestsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListZprConfigurationWorkRequestsRequest,
                                    ListZprConfigurationWorkRequestsResponse>
                            handler);

    /**
     * Gets a list of ZprPolicies.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprPoliciesResponse> listZprPolicies(
            ListZprPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListZprPoliciesRequest, ListZprPoliciesResponse>
                    handler);

    /**
     * Lists the errors for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprPolicyWorkRequestErrorsResponse>
            listZprPolicyWorkRequestErrors(
                    ListZprPolicyWorkRequestErrorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListZprPolicyWorkRequestErrorsRequest,
                                    ListZprPolicyWorkRequestErrorsResponse>
                            handler);

    /**
     * Lists the logs for a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprPolicyWorkRequestLogsResponse> listZprPolicyWorkRequestLogs(
            ListZprPolicyWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListZprPolicyWorkRequestLogsRequest,
                            ListZprPolicyWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZprPolicyWorkRequestsResponse> listZprPolicyWorkRequests(
            ListZprPolicyWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListZprPolicyWorkRequestsRequest, ListZprPolicyWorkRequestsResponse>
                    handler);

    /**
     * Updates a specific ZprPolicy. If updating on statements, the entire list of policy statements is required, which will replace the existing policy statements associated with the policy ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateZprPolicyResponse> updateZprPolicy(
            UpdateZprPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateZprPolicyRequest, UpdateZprPolicyResponse>
                    handler);
}
