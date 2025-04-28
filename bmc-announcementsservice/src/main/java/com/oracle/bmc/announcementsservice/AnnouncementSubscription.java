/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

/**
 * Manage Oracle Cloud Infrastructure console announcements. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public interface AnnouncementSubscription extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Moves the specified announcement subscription from one compartment to another compartment.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ChangeAnnouncementSubscriptionCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAnnouncementSubscriptionCompartment API.
     */
    ChangeAnnouncementSubscriptionCompartmentResponse changeAnnouncementSubscriptionCompartment(
            ChangeAnnouncementSubscriptionCompartmentRequest request);

    /**
     * Creates a new announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/CreateAnnouncementSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAnnouncementSubscription API.
     */
    CreateAnnouncementSubscriptionResponse createAnnouncementSubscription(
            CreateAnnouncementSubscriptionRequest request);

    /**
     * Creates a new filter group in the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/CreateFilterGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFilterGroup
     *     API.
     */
    CreateFilterGroupResponse createFilterGroup(CreateFilterGroupRequest request);

    /**
     * Deletes the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/DeleteAnnouncementSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAnnouncementSubscription API.
     */
    DeleteAnnouncementSubscriptionResponse deleteAnnouncementSubscription(
            DeleteAnnouncementSubscriptionRequest request);

    /**
     * Deletes a filter group in the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/DeleteFilterGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFilterGroup
     *     API.
     */
    DeleteFilterGroupResponse deleteFilterGroup(DeleteFilterGroupRequest request);

    /**
     * Gets the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/GetAnnouncementSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAnnouncementSubscription API.
     */
    GetAnnouncementSubscriptionResponse getAnnouncementSubscription(
            GetAnnouncementSubscriptionRequest request);

    /**
     * Gets a list of all announcement subscriptions in the specified compartment.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ListAnnouncementSubscriptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAnnouncementSubscriptions API.
     */
    ListAnnouncementSubscriptionsResponse listAnnouncementSubscriptions(
            ListAnnouncementSubscriptionsRequest request);

    /**
     * Updates the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/UpdateAnnouncementSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAnnouncementSubscription API.
     */
    UpdateAnnouncementSubscriptionResponse updateAnnouncementSubscription(
            UpdateAnnouncementSubscriptionRequest request);

    /**
     * Updates a filter group in the specified announcement subscription.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/UpdateFilterGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFilterGroup
     *     API.
     */
    UpdateFilterGroupResponse updateFilterGroup(UpdateFilterGroupRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    AnnouncementSubscriptionWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    AnnouncementSubscriptionPaginators getPaginators();
}
