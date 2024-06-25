/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue;

import com.oracle.bmc.queue.requests.*;
import com.oracle.bmc.queue.responses.*;

/**
 * Use the Queue API to produce and consume messages, create queues, and manage related items. For more information, see [Queue](https://docs.cloud.oracle.com/iaas/Content/queue/overview.htm).
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public interface Queue extends AutoCloseable {

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
     * Deletes the message represented by the receipt from the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to delete messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/DeleteMessageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMessage API.
     */
    DeleteMessageResponse deleteMessage(DeleteMessageRequest request);

    /**
     * Deletes multiple messages from the queue or the consumer group. Only messages from the same queue/consumer group can be deleted at once.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to delete messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/DeleteMessagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMessages API.
     */
    DeleteMessagesResponse deleteMessages(DeleteMessagesRequest request);

    /**
     * Consumes messages from the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to consume messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     * GetMessages accepts optional channelFilter query parameter that can filter source channels of the messages.
     * When channelFilter is present, service will return available messages from the channel which ID exactly matched the filter.
     * When filter is not specified, messages will be returned from a random non-empty channel within a queue.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/GetMessagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMessages API.
     */
    GetMessagesResponse getMessages(GetMessagesRequest request);

    /**
     * Gets the statistics for the queue and its dead letter queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to get a queue's statistics.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/GetStatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStats API.
     */
    GetStatsResponse getStats(GetStatsRequest request);

    /**
     * Gets the list of IDs of non-empty channels.
     * It will return an approximate list of IDs of non-empty channels. That information is based on the queue level statistics.
     * API supports optional channelFilter parameter which will filter the returned results according to the specified filter.
     * List of channel IDs is approximate, because statistics is refreshed once per-second, and that list represents a snapshot of the past information. API is paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/ListChannelsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListChannels API.
     */
    ListChannelsResponse listChannels(ListChannelsRequest request);

    /**
     * Puts messages into the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to produce messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/PutMessagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutMessages API.
     */
    PutMessagesResponse putMessages(PutMessagesRequest request);

    /**
     * Updates the visibility of the message represented by the receipt.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to update messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/UpdateMessageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMessage API.
     */
    UpdateMessageResponse updateMessage(UpdateMessageRequest request);

    /**
     * Updates multiple messages in the queue or the consumer group. Only messages from the same queue/consumer group can be updated at once.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to update messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest) getQueue} to find the queue's `messagesEndpoint`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/UpdateMessagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMessages API.
     */
    UpdateMessagesResponse updateMessages(UpdateMessagesRequest request);
}
