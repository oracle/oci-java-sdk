/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * The API for the Streaming Service.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface StreamAsync extends AutoCloseable {

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
     * Provides a mechanism to manually commit offsets, if not using commit-on-get consumer semantics.
     * This commits offsets assicated with the provided cursor, extends the timeout on each of the affected partitions, and returns an updated cursor.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConsumerCommitResponse> consumerCommit(
            ConsumerCommitRequest request,
            com.oracle.bmc.responses.AsyncHandler<ConsumerCommitRequest, ConsumerCommitResponse>
                    handler);

    /**
     * Allows long-running processes to extend the timeout on partitions reserved by a consumer instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConsumerHeartbeatResponse> consumerHeartbeat(
            ConsumerHeartbeatRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConsumerHeartbeatRequest, ConsumerHeartbeatResponse>
                    handler);

    /**
     * Creates a cursor. Cursors are used to consume a stream, starting from a specific point in the partition and going forward from there.
     * You can create a cursor based on an offset, a time, the trim horizon, or the most recent message in the stream. As the oldest message
     * inside the retention period boundary, using the trim horizon effectively lets you consume all messages in the stream. A cursor based
     * on the most recent message allows consumption of only messages that are added to the stream after you create the cursor. Cursors expire
     * five minutes after you receive them from the service.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCursorResponse> createCursor(
            CreateCursorRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateCursorRequest, CreateCursorResponse>
                    handler);

    /**
     * Creates a group-cursor.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGroupCursorResponse> createGroupCursor(
            CreateGroupCursorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateGroupCursorRequest, CreateGroupCursorResponse>
                    handler);

    /**
     * Returns the current state of a consumer group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handler);

    /**
     * Returns messages from the specified stream using the specified cursor as the starting point for consumption. By default, the number of messages returned is undefined, but the service returns as many as possible.
     * To get messages, you must first obtain a cursor using the {@link #createCursor(CreateCursorRequest, Consumer, Consumer) createCursor} operation.
     * In the response, retrieve the value of the 'opc-next-cursor' header to pass as a parameter to get the next batch of messages in the stream.
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
     * Emits messages to a stream. There's no limit to the number of messages in a request, but the total size of a message or request must be 1 MiB or less.
     * The service calculates the partition ID from the message key and stores messages that share a key on the same partition.
     * If a message does not contain a key or if the key is null, the service generates a message key for you.
     * The partition ID cannot be passed as a parameter.
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
     * Forcefully changes the current location of a group as a whole; reseting processing location of all consumers to a particular location in the stream.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse> handler);
}
