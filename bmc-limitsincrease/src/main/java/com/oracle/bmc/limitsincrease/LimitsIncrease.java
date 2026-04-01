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
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public interface LimitsIncrease extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/CancelLimitsIncreaseItemRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelLimitsIncreaseItemRequest API.
     */
    CancelLimitsIncreaseItemRequestResponse cancelLimitsIncreaseItemRequest(
            CancelLimitsIncreaseItemRequestRequest request);

    /**
     * Withdraws the specified limit increase request.
     * For more information, see
     * [Withdrawing a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/withdraw-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/CancelLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelLimitsIncreaseRequest API.
     */
    CancelLimitsIncreaseRequestResponse cancelLimitsIncreaseRequest(
            CancelLimitsIncreaseRequestRequest request);

    /**
     * Creates a limit increase request in the specified compartment.
     * For more information, see
     * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/CreateLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateLimitsIncreaseRequest API.
     */
    CreateLimitsIncreaseRequestResponse createLimitsIncreaseRequest(
            CreateLimitsIncreaseRequestRequest request);

    /**
     * Deletes the specified limit increase request.
     * For more information, see
     * [Deleting a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/delete-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/DeleteLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteLimitsIncreaseRequest API.
     */
    DeleteLimitsIncreaseRequestResponse deleteLimitsIncreaseRequest(
            DeleteLimitsIncreaseRequestRequest request);

    /**
     * Gets the specified item from the limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/GetLimitsIncreaseItemRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetLimitsIncreaseItemRequest API.
     */
    GetLimitsIncreaseItemRequestResponse getLimitsIncreaseItemRequest(
            GetLimitsIncreaseItemRequestRequest request);

    /**
     * Gets the specified limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/GetLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetLimitsIncreaseRequest API.
     */
    GetLimitsIncreaseRequestResponse getLimitsIncreaseRequest(
            GetLimitsIncreaseRequestRequest request);

    /**
     * Lists items in the specified limit increase request.
     * For more information, see
     * [Getting Details for a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/get-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/ListLimitsIncreaseItemRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListLimitsIncreaseItemRequests API.
     */
    ListLimitsIncreaseItemRequestsResponse listLimitsIncreaseItemRequests(
            ListLimitsIncreaseItemRequestsRequest request);

    /**
     * Gets the fields for the specified service and limit name.
     * Service name is required if limit name is provided.
     * If limit name is not provided, returns all questions for the specified service.
     * If service name is not provided, returns all available questions.
     * For more information, see
     * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/ListLimitsIncreaseQuestionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListLimitsIncreaseQuestions API.
     */
    ListLimitsIncreaseQuestionsResponse listLimitsIncreaseQuestions(
            ListLimitsIncreaseQuestionsRequest request);

    /**
     * Lists limit increase requests in the specified compartment.
     * For more information, see
     * [Listing Limit Increase Requests](https://docs.oracle.com/iaas/Content/General/service-limits/list-requests.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/ListLimitsIncreaseRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListLimitsIncreaseRequests API.
     */
    ListLimitsIncreaseRequestsResponse listLimitsIncreaseRequests(
            ListLimitsIncreaseRequestsRequest request);

    /**
     * Adds one or more comments to the specified limit increase request.
     * For more information, see
     * [Adding Comments to a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/comment-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/PatchLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchLimitsIncreaseRequest API.
     */
    PatchLimitsIncreaseRequestResponse patchLimitsIncreaseRequest(
            PatchLimitsIncreaseRequestRequest request);

    /**
     * Updates the limit increase request.
     * For more information, see
     * [Updating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/update-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/UpdateLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateLimitsIncreaseRequest API.
     */
    UpdateLimitsIncreaseRequestResponse updateLimitsIncreaseRequest(
            UpdateLimitsIncreaseRequestRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    LimitsIncreaseWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    LimitsIncreasePaginators getPaginators();
}
