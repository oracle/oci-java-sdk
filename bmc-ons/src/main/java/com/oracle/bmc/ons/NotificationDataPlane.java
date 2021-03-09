/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

/**
 * Use the Notifications API to broadcast messages to distributed components by topic, using a publish-subscribe pattern.
 * For information about managing topics, subscriptions, and messages, see [Notifications Overview](https://docs.cloud.oracle.com/iaas/Content/Notification/Concepts/notificationoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface NotificationDataPlane extends AutoCloseable {

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
     * Moves a subscription into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/ChangeSubscriptionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSubscriptionCompartment API.
     */
    ChangeSubscriptionCompartmentResponse changeSubscriptionCompartment(
            ChangeSubscriptionCompartmentRequest request);

    /**
     * Creates a subscription for the specified topic and sends a subscription confirmation URL to the endpoint. The subscription remains in \"Pending\" status until it has been confirmed.
     * For information about confirming subscriptions, see
     * [To confirm a subscription](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#confirmSub).
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/CreateSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSubscription API.
     */
    CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request);

    /**
     * Deletes the specified subscription.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/DeleteSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSubscription API.
     */
    DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request);

    /**
     * Gets the confirmation details for the specified subscription.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/GetConfirmSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConfirmSubscription API.
     */
    GetConfirmSubscriptionResponse getConfirmSubscription(GetConfirmSubscriptionRequest request);

    /**
     * Gets the specified subscription's configuration information.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/GetSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSubscription API.
     */
    GetSubscriptionResponse getSubscription(GetSubscriptionRequest request);

    /**
     * Unsubscribes the subscription from the topic.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/GetUnsubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUnsubscription API.
     */
    GetUnsubscriptionResponse getUnsubscription(GetUnsubscriptionRequest request);

    /**
     * Lists the subscriptions in the specified compartment or topic.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/ListSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSubscriptions API.
     */
    ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request);

    /**
     * Publishes a message to the specified topic.
     * <p>
     * The topic endpoint is required for this operation.
     * To get the topic endpoint, use {@link #getTopic(GetTopicRequest) getTopic}
     * and review the `apiEndpoint` value in the response ({@link NotificationTopic}).
     * <p>
     * Limits information follows.
     * <p>
     * Message size limit per request: 64KB.
     * <p>
     * Message delivery rate limit per endpoint: 60 messages per minute for HTTP-based protocols, 10 messages per minute for the `EMAIL` protocol.
     * HTTP-based protocols use URL endpoints that begin with \"http:\" or \"https:\".
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60 per topic. (This TPM limit represents messages per minute.)
     * <p>
     * For more information about publishing messages, see [Publishing Messages](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/publishingmessages.htm).
     * For steps to request a limit increase, see [Requesting a Service Limit Increase](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/servicelimits.htm#three).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/PublishMessageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PublishMessage API.
     */
    PublishMessageResponse publishMessage(PublishMessageRequest request);

    /**
     * Resends the confirmation details for the specified subscription.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/ResendSubscriptionConfirmationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResendSubscriptionConfirmation API.
     */
    ResendSubscriptionConfirmationResponse resendSubscriptionConfirmation(
            ResendSubscriptionConfirmationRequest request);

    /**
     * Updates the specified subscription's configuration.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/UpdateSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSubscription API.
     */
    UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    NotificationDataPlaneWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    NotificationDataPlanePaginators getPaginators();
}
