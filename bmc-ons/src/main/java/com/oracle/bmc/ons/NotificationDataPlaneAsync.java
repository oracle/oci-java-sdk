/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
public interface NotificationDataPlaneAsync extends AutoCloseable {

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
     * Moves a subscription into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSubscriptionCompartmentResponse>
            changeSubscriptionCompartment(
                    ChangeSubscriptionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSubscriptionCompartmentRequest,
                                    ChangeSubscriptionCompartmentResponse>
                            handler);

    /**
     * Creates a subscription for the specified topic and sends a subscription confirmation URL to the endpoint. The subscription remains in \"Pending\" status until it has been confirmed.
     * For information about confirming subscriptions, see
     * [To confirm a subscription](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#confirmSub).
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * Unsubscribes the subscription from the topic.
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * Publishes a message to the specified topic.
     * <p>
     * The topic endpoint is required for this operation.
     * To get the topic endpoint, use {@link #getTopic(GetTopicRequest, Consumer, Consumer) getTopic}
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
     * <p>
     * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
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
