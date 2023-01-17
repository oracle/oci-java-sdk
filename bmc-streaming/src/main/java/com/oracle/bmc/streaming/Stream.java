/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * Use the Streaming API to produce and consume messages, create streams and stream pools, and
 * manage related items. For more information, see
 * [Streaming](https://docs.cloud.oracle.com/Content/Streaming/Concepts/streamingoverview.htm). This
 * service client does not use circuit breakers by default if the user has not defined a circuit
 * breaker configuration.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface Stream extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Provides a mechanism to manually commit offsets, if not using commit-on-get consumer
     * semantics. This commits offsets assicated with the provided cursor, extends the timeout on
     * each of the affected partitions, and returns an updated cursor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ConsumerCommitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConsumerCommit API.
     */
    ConsumerCommitResponse consumerCommit(ConsumerCommitRequest request);

    /**
     * Allows long-running processes to extend the timeout on partitions reserved by a consumer
     * instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ConsumerHeartbeatExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConsumerHeartbeat
     *     API.
     */
    ConsumerHeartbeatResponse consumerHeartbeat(ConsumerHeartbeatRequest request);

    /**
     * Creates a cursor. Cursors are used to consume a stream, starting from a specific point in the
     * partition and going forward from there. You can create a cursor based on an offset, a time,
     * the trim horizon, or the most recent message in the stream. As the oldest message inside the
     * retention period boundary, using the trim horizon effectively lets you consume all messages
     * in the stream. A cursor based on the most recent message allows consumption of only messages
     * that are added to the stream after you create the cursor. Cursors expire five minutes after
     * you receive them from the service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateCursorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCursor API.
     */
    CreateCursorResponse createCursor(CreateCursorRequest request);

    /**
     * Creates a group-cursor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateGroupCursorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGroupCursor
     *     API.
     */
    CreateGroupCursorResponse createGroupCursor(CreateGroupCursorRequest request);

    /**
     * Returns the current state of a consumer group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGroup API.
     */
    GetGroupResponse getGroup(GetGroupRequest request);

    /**
     * Returns messages from the specified stream using the specified cursor as the starting point
     * for consumption. By default, the number of messages returned is undefined, but the service
     * returns as many as possible. To get messages, you must first obtain a cursor using the {@link
     * #createCursor(CreateCursorRequest) createCursor} operation. In the response, retrieve the
     * value of the 'opc-next-cursor' header to pass as a parameter to get the next batch of
     * messages in the stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetMessagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMessages API.
     */
    GetMessagesResponse getMessages(GetMessagesRequest request);

    /**
     * Emits messages to a stream. There's no limit to the number of messages in a request, but the
     * total size of a message or request must be 1 MiB or less. The service calculates the
     * partition ID from the message key and stores messages that share a key on the same partition.
     * If a message does not contain a key or if the key is null, the service generates a message
     * key for you. The partition ID cannot be passed as a parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/PutMessagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutMessages API.
     */
    PutMessagesResponse putMessages(PutMessagesRequest request);

    /**
     * Forcefully changes the current location of a group as a whole; reseting processing location
     * of all consumers to a particular location in the stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGroup API.
     */
    UpdateGroupResponse updateGroup(UpdateGroupRequest request);
}
