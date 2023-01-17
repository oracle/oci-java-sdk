/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

/**
 * Use the Notifications API to broadcast messages to distributed components by topic, using a
 * publish-subscribe pattern. For information about managing topics, subscriptions, and messages,
 * see [Notifications
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Notification/Concepts/notificationoverview.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface NotificationControlPlaneAsync extends AutoCloseable {

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
     * Moves a topic into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTopicCompartmentResponse> changeTopicCompartment(
            ChangeTopicCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTopicCompartmentRequest, ChangeTopicCompartmentResponse>
                    handler);

    /**
     * Creates a topic in the specified compartment. For general information about topics, see
     * [Managing Topics and
     * Subscriptions](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm).
     *
     * <p>For the purposes of access control, you must provide the OCID of the compartment where you
     * want the topic to reside. For information about access control and compartments, see
     * [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>You must specify a display name for the topic.
     *
     * <p>All Oracle Cloud Infrastructure resources, including topics, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find
     * its OCID in the response. You can also retrieve a resource's OCID by using a List API
     * operation on that resource type, or by viewing the resource in the Console. For more
     * information, see [Resource
     * Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * <p>Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTopicResponse> createTopic(
            CreateTopicRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTopicRequest, CreateTopicResponse> handler);

    /**
     * Deletes the specified topic.
     *
     * <p>Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTopicResponse> deleteTopic(
            DeleteTopicRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTopicRequest, DeleteTopicResponse> handler);

    /**
     * Gets the specified topic's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTopicResponse> getTopic(
            GetTopicRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTopicRequest, GetTopicResponse> handler);

    /**
     * Lists topics in the specified compartment.
     *
     * <p>Transactions Per Minute (TPM) per-tenancy limit for this operation: 120.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTopicsResponse> listTopics(
            ListTopicsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTopicsRequest, ListTopicsResponse> handler);

    /**
     * Updates the specified topic's configuration.
     *
     * <p>Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTopicResponse> updateTopic(
            UpdateTopicRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTopicRequest, UpdateTopicResponse> handler);
}
