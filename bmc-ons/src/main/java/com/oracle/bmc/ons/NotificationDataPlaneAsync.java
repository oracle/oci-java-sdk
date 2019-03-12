/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface NotificationDataPlaneAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Creates a subscription for the specified topic.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSubscriptionResponse> createSubscription(
            CreateSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSubscriptionRequest, CreateSubscriptionResponse>
                    handler);

    /**
     * Deletes the specified subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSubscriptionResponse> deleteSubscription(
            DeleteSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSubscriptionRequest, DeleteSubscriptionResponse>
                    handler);

    /**
     * Gets the confirmation details for the specified subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConfirmSubscriptionResponse> getConfirmSubscription(
            GetConfirmSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConfirmSubscriptionRequest, GetConfirmSubscriptionResponse>
                    handler);

    /**
     * Gets the specified subscription's configuration information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSubscriptionResponse> getSubscription(
            GetSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSubscriptionRequest, GetSubscriptionResponse>
                    handler);

    /**
     * Gets the unsubscription details for the specified subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUnsubscriptionResponse> getUnsubscription(
            GetUnsubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUnsubscriptionRequest, GetUnsubscriptionResponse>
                    handler);

    /**
     * Lists the subscriptions in the specified compartment or topic.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSubscriptionsResponse> listSubscriptions(
            ListSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionsRequest, ListSubscriptionsResponse>
                    handler);

    /**
     * Publishes a message to the specified topic. For more information about publishing messages, see [Publishing Messages](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/publishingmessages.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PublishMessageResponse> publishMessage(
            PublishMessageRequest request,
            com.oracle.bmc.responses.AsyncHandler<PublishMessageRequest, PublishMessageResponse>
                    handler);

    /**
     * Resends the confirmation details for the specified subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResendSubscriptionConfirmationResponse>
            resendSubscriptionConfirmation(
                    ResendSubscriptionConfirmationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ResendSubscriptionConfirmationRequest,
                                    ResendSubscriptionConfirmationResponse>
                            handler);

    /**
     * Updates the specified subscription's configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSubscriptionResponse> updateSubscription(
            UpdateSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSubscriptionRequest, UpdateSubscriptionResponse>
                    handler);
}
