/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox;

import com.oracle.bmc.generativeaisandbox.requests.*;
import com.oracle.bmc.generativeaisandbox.responses.*;

/**
 * API for managing sandbox resources and exchanging sandbox access tokens. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public interface GenerativeAiSandbox extends AutoCloseable {

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
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Requests cancellation of a running sandbox command.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/CancelSandboxCommandExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelSandboxCommand API.
     */
    CancelSandboxCommandResponse cancelSandboxCommand(CancelSandboxCommandRequest request);

    /**
     * Creates a sandbox resource and returns its initial state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/CreateSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSandbox API.
     */
    CreateSandboxResponse createSandbox(CreateSandboxRequest request);

    /**
     * Creates a sandbox snapshot resource and returns its initial state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/CreateSandboxSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSandboxSnapshot API.
     */
    CreateSandboxSnapshotResponse createSandboxSnapshot(CreateSandboxSnapshotRequest request);

    /**
     * Deletes a sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/DeleteSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSandbox API.
     */
    DeleteSandboxResponse deleteSandbox(DeleteSandboxRequest request);

    /**
     * Deletes a sandbox snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/DeleteSandboxSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSandboxSnapshot API.
     */
    DeleteSandboxSnapshotResponse deleteSandboxSnapshot(DeleteSandboxSnapshotRequest request);

    /**
     * Extends the duration of a sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ExtendSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExtendSandbox API.
     */
    ExtendSandboxResponse extendSandbox(ExtendSandboxRequest request);

    /**
     * Gets information about a sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/GetSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSandbox API.
     */
    GetSandboxResponse getSandbox(GetSandboxRequest request);

    /**
     * Gets command metadata for a sandbox command.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/GetSandboxCommandExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSandboxCommand
     *     API.
     */
    GetSandboxCommandResponse getSandboxCommand(GetSandboxCommandRequest request);

    /**
     * Gets captured output for a sandbox command starting from the requested event sequence.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/GetSandboxCommandOutputExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSandboxCommandOutput API.
     */
    GetSandboxCommandOutputResponse getSandboxCommandOutput(GetSandboxCommandOutputRequest request);

    /**
     * Gets information about a sandbox snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/GetSandboxSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSandboxSnapshot
     *     API.
     */
    GetSandboxSnapshotResponse getSandboxSnapshot(GetSandboxSnapshotRequest request);

    /**
     * Lists sandbox commands for a sandbox with optional pagination.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ListSandboxCommandExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSandboxCommand
     *     API.
     */
    ListSandboxCommandResponse listSandboxCommand(ListSandboxCommandRequest request);

    /**
     * Lists sandbox snapshot resources with optional filtering and pagination.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ListSandboxSnapshotsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSandboxSnapshots API.
     */
    ListSandboxSnapshotsResponse listSandboxSnapshots(ListSandboxSnapshotsRequest request);

    /**
     * Lists sandbox resources with optional filtering and pagination. Specify exactly one of
     * `projectId` or `compartmentId`. A compartment-scoped request returns sandboxes from
     * Generative AI projects directly contained in that compartment; child compartments are not
     * included.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ListSandboxesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSandboxes API.
     */
    ListSandboxesResponse listSandboxes(ListSandboxesRequest request);

    /**
     * Reads a file from a sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ReadSandboxFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReadSandboxFile
     *     API.
     */
    ReadSandboxFileResponse readSandboxFile(ReadSandboxFileRequest request);

    /**
     * Resumes a suspended sandbox by scaling its backing runtime back to one replica.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ResumeSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeSandbox API.
     */
    ResumeSandboxResponse resumeSandbox(ResumeSandboxRequest request);

    /**
     * Runs a command in a sandbox and returns the command identifier immediately.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/RunSandboxCommandExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RunSandboxCommand
     *     API.
     */
    RunSandboxCommandResponse runSandboxCommand(RunSandboxCommandRequest request);

    /**
     * Runs a command in a sandbox and streams command events as newline-delimited JSON. Each line
     * is a serialized SandboxCommandEvent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/RunSandboxCommandAndStreamExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RunSandboxCommandAndStream API.
     */
    RunSandboxCommandAndStreamResponse runSandboxCommandAndStream(
            RunSandboxCommandAndStreamRequest request);

    /**
     * Runs a command in a sandbox, blocks until command execution finishes, and returns the final
     * command metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/RunSandboxCommandAndWaitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RunSandboxCommandAndWait API.
     */
    RunSandboxCommandAndWaitResponse runSandboxCommandAndWait(
            RunSandboxCommandAndWaitRequest request);

    /**
     * Stops a running sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/StopSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopSandbox API.
     */
    StopSandboxResponse stopSandbox(StopSandboxRequest request);

    /**
     * Streams command events for an existing sandbox command from `fromSeq` through `untilSeq`
     * using Server-Sent Events. Each SSE `data` field contains a serialized SandboxCommandEvent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/StreamSandboxCommandEventsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StreamSandboxCommandEvents API.
     */
    StreamSandboxCommandEventsResponse streamSandboxCommandEvents(
            StreamSandboxCommandEventsRequest request);

    /**
     * Suspends a running sandbox by scaling its backing runtime to zero replicas while retaining
     * the workspace block volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/SuspendSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SuspendSandbox API.
     */
    SuspendSandboxResponse suspendSandbox(SuspendSandboxRequest request);

    /**
     * Updates a sandbox.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/UpdateSandboxExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSandbox API.
     */
    UpdateSandboxResponse updateSandbox(UpdateSandboxRequest request);

    /**
     * Writes a file in a sandbox and returns the resulting file resource.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/WriteSandboxFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use WriteSandboxFile
     *     API.
     */
    WriteSandboxFileResponse writeSandboxFile(WriteSandboxFileRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    GenerativeAiSandboxWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    GenerativeAiSandboxPaginators getPaginators();
}
