/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface Stream extends AutoCloseable {

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
     * Provides a mechanism to manually commit offsets, if not using commit-on-get consumer semantics.
     * This commits offsets assicated with the provided cursor, extends the timeout on each of the affected partitions, and returns an updated cursor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ConsumerCommitResponse consumerCommit(ConsumerCommitRequest request);

    /**
     * Allows long-running processes to extend the timeout on partitions reserved by a consumer instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ConsumerHeartbeatResponse consumerHeartbeat(ConsumerHeartbeatRequest request);

    /**
     * Creates a cursor. Cursors are used to consume a stream, starting from a specific point in the partition and going forward from there.
     * You can create a cursor based on an offset, a time, the trim horizon, or the most recent message in the stream. As the oldest message
     * inside the retention period boundary, using the trim horizon effectively lets you consume all messages in the stream. A cursor based
     * on the most recent message allows consumption of only messages that are added to the stream after you create the cursor. Cursors expire
     * five minutes after you receive them from the service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCursorResponse createCursor(CreateCursorRequest request);

    /**
     * Creates a group-cursor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateGroupCursorResponse createGroupCursor(CreateGroupCursorRequest request);

    /**
     * Returns the current state of a consumer group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetGroupResponse getGroup(GetGroupRequest request);

    /**
     * Returns messages from the specified stream using the specified cursor as the starting point for consumption. By default, the number of messages returned is undefined, but the service returns as many as possible.
     * To get messages, you must first obtain a cursor using the {@link #createCursor(CreateCursorRequest) createCursor} operation.
     * In the response, retrieve the value of the 'opc-next-cursor' header to pass as a parameter to get the next batch of messages in the stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetMessagesResponse getMessages(GetMessagesRequest request);

    /**
     * Emits messages to a stream. There's no limit to the number of messages in a request, but the total size of a message or request must be 1 MiB or less.
     * The service calculates the partition ID from the message key and stores messages that share a key on the same partition.
     * If a message does not contain a key or if the key is null, the service generates a message key for you.
     * The partition ID cannot be passed as a parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PutMessagesResponse putMessages(PutMessagesRequest request);

    /**
     * Forcefully changes the current location of a group as a whole; reseting processing location of all consumers to a particular location in the stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateGroupResponse updateGroup(UpdateGroupRequest request);
}
