/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue;

import com.oracle.bmc.queue.requests.*;
import com.oracle.bmc.queue.responses.*;

/**
 * Use the Queue API to produce and consume messages, create queues, and manage related items. For more information, see [Queue](https://docs.cloud.oracle.com/iaas/Content/queue/overview.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public interface QueueAsync extends AutoCloseable {

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
     * Deletes the message represented by the receipt from the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to delete messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMessageResponse> deleteMessage(
            DeleteMessageRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMessageRequest, DeleteMessageResponse>
                    handler);

    /**
     * Deletes multiple messages from the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to delete messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMessagesResponse> deleteMessages(
            DeleteMessagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMessagesRequest, DeleteMessagesResponse>
                    handler);

    /**
     * Consumes messages from the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to consume messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     * GetMessages accepts optional channelFilter query parameter that can filter source channels of the messages.
     * When channelFilter is present, service will return available messages from the channel which ID exactly matched the filter.
     * When filter is not specified, messages will be returned from a random non-empty channel within a queue.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMessagesResponse> getMessages(
            GetMessagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMessagesRequest, GetMessagesResponse> handler);

    /**
     * Gets the statistics for the queue and its dead letter queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to get a queue's statistics.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStatsResponse> getStats(
            GetStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStatsRequest, GetStatsResponse> handler);

    /**
     * Gets the list of IDs of non-empty channels.
     * It will return an approximate list of IDs of non-empty channels. That information is based on the queue level statistics.
     * API supports optional channelFilter parameter which will filter the returned results according to the specified filter.
     * List of channel IDs is approximate, because statistics is refreshed once per-second, and that list represents a snapshot of the past information. API is paginated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListChannelsResponse> listChannels(
            ListChannelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                    handler);

    /**
     * Puts messages into the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to produce messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PutMessagesResponse> putMessages(
            PutMessagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<PutMessagesRequest, PutMessagesResponse> handler);

    /**
     * Updates the visibility of the message represented by the receipt.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to update messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMessageResponse> updateMessage(
            UpdateMessageRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMessageRequest, UpdateMessageResponse>
                    handler);

    /**
     * Updates multiple messages in the queue.
     * You must use the [messages endpoint](https://docs.cloud.oracle.com/iaas/Content/queue/messages.htm#messages__messages-endpoint) to update messages.
     * The messages endpoint may be different for different queues. Use {@link #getQueue(GetQueueRequest, Consumer, Consumer) getQueue} to find the queue's `messagesEndpoint`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMessagesResponse> updateMessages(
            UpdateMessagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMessagesRequest, UpdateMessagesResponse>
                    handler);
}
