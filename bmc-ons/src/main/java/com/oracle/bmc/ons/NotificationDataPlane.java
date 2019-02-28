/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface NotificationDataPlane extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Creates a subscription for the specified topic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request);

    /**
     * Deletes the specified subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request);

    /**
     * Gets the confirmation details for the specified subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConfirmSubscriptionResponse getConfirmSubscription(GetConfirmSubscriptionRequest request);

    /**
     * Gets the specified subscription's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSubscriptionResponse getSubscription(GetSubscriptionRequest request);

    /**
     * Gets the unsubscription details for the specified subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUnsubscriptionResponse getUnsubscription(GetUnsubscriptionRequest request);

    /**
     * Lists the subscriptions in the specified compartment or topic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request);

    /**
     * Publishes a message to the specified topic. For more information about publishing messages, see [Publishing Messages](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Notification/Tasks/publishingmessages.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PublishMessageResponse publishMessage(PublishMessageRequest request);

    /**
     * Resends the confirmation details for the specified subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ResendSubscriptionConfirmationResponse resendSubscriptionConfirmation(
            ResendSubscriptionConfirmationRequest request);

    /**
     * Updates the specified subscription's configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
