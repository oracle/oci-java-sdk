/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease;

import com.oracle.bmc.limitsincrease.requests.*;
import com.oracle.bmc.limitsincrease.responses.*;

/**
 * Use the Limits Increase API to work with limit increase requests.
 * For more information, see
 * [Working with Limit Increase Requests](https://docs.oracle.com/iaas/Content/General/service-limits/requests.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public interface LimitsIncreaseAsync extends AutoCloseable {

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
     * Withdraws the specified item from the limit increase request.
     * For more information, see
     * [Withdrawing an Item from a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/withdraw-item-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelLimitsIncreaseItemRequestResponse>
            cancelLimitsIncreaseItemRequest(
                    CancelLimitsIncreaseItemRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelLimitsIncreaseItemRequestRequest,
                                    CancelLimitsIncreaseItemRequestResponse>
                            handler);

    /**
     * Withdraws the specified limit increase request.
     * For more information, see
     * [Withdrawing a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/withdraw-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelLimitsIncreaseRequestResponse> cancelLimitsIncreaseRequest(
            CancelLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelLimitsIncreaseRequestRequest, CancelLimitsIncreaseRequestResponse>
                    handler);

    /**
     * Creates a limit increase request in the specified compartment.
     * For more information, see
     * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLimitsIncreaseRequestResponse> createLimitsIncreaseRequest(
            CreateLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLimitsIncreaseRequestRequest, CreateLimitsIncreaseRequestResponse>
                    handler);

    /**
     * Deletes the specified limit increase request.
     * For more information, see
     * [Deleting a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/delete-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLimitsIncreaseRequestResponse> deleteLimitsIncreaseRequest(
            DeleteLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLimitsIncreaseRequestRequest, DeleteLimitsIncreaseRequestResponse>
                    handler);

    /**
     * Gets the specified item from the limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLimitsIncreaseItemRequestResponse> getLimitsIncreaseItemRequest(
            GetLimitsIncreaseItemRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLimitsIncreaseItemRequestRequest,
                            GetLimitsIncreaseItemRequestResponse>
                    handler);

    /**
     * Gets the specified limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLimitsIncreaseRequestResponse> getLimitsIncreaseRequest(
            GetLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
                    handler);

    /**
     * Lists items in the specified limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitsIncreaseItemRequestsResponse>
            listLimitsIncreaseItemRequests(
                    ListLimitsIncreaseItemRequestsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListLimitsIncreaseItemRequestsRequest,
                                    ListLimitsIncreaseItemRequestsResponse>
                            handler);

    /**
     * Gets the fields for the specified service and limit name.
     * Service name is required if limit name is provided.
     * If limit name is not provided, returns all questions for the specified service.
     * If service name is not provided, returns all available questions.
     * For more information, see
     * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitsIncreaseQuestionsResponse> listLimitsIncreaseQuestions(
            ListLimitsIncreaseQuestionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLimitsIncreaseQuestionsRequest, ListLimitsIncreaseQuestionsResponse>
                    handler);

    /**
     * Lists limit increase requests in the specified compartment.
     * For more information, see
     * [Listing Limit Increase Requests](https://docs.oracle.com/iaas/Content/General/service-limits/list-requests.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitsIncreaseRequestsResponse> listLimitsIncreaseRequests(
            ListLimitsIncreaseRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLimitsIncreaseRequestsRequest, ListLimitsIncreaseRequestsResponse>
                    handler);

    /**
     * Adds one or more comments to the specified limit increase request.
     * For more information, see
     * [Adding Comments to a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/comment-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PatchLimitsIncreaseRequestResponse> patchLimitsIncreaseRequest(
            PatchLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchLimitsIncreaseRequestRequest, PatchLimitsIncreaseRequestResponse>
                    handler);

    /**
     * Updates the limit increase request.
     * For more information, see
     * [Updating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/update-request.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLimitsIncreaseRequestResponse> updateLimitsIncreaseRequest(
            UpdateLimitsIncreaseRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLimitsIncreaseRequestRequest, UpdateLimitsIncreaseRequestResponse>
                    handler);
}
