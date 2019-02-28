/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface NotificationControlPlane extends AutoCloseable {

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
     * Creates a topic in the specified compartment. For general information about topics, see
     * [Managing Topics and Subscriptions](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the topic to reside.
     * For information about access control and compartments, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify a display name for the topic.
     * <p>
     * All Oracle Cloud Infrastructure resources, including topics, get an Oracle-assigned, unique ID called an
     * Oracle Cloud Identifier (OCID). When you create a resource, you can find its OCID in the response. You can also
     * retrieve a resource's OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console. Fore more information, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTopicResponse createTopic(CreateTopicRequest request);

    /**
     * Deletes the specified topic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTopicResponse deleteTopic(DeleteTopicRequest request);

    /**
     * Gets the specified topic's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTopicResponse getTopic(GetTopicRequest request);

    /**
     * Lists topics in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTopicsResponse listTopics(ListTopicsRequest request);

    /**
     * Updates the specified topic's configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTopicResponse updateTopic(UpdateTopicRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    NotificationControlPlanePaginators getPaginators();
}
