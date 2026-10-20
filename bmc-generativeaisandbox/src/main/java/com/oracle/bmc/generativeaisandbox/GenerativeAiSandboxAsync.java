/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox;

import com.oracle.bmc.generativeaisandbox.requests.*;
import com.oracle.bmc.generativeaisandbox.responses.*;

/** API for managing sandbox resources and exchanging sandbox access tokens. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public interface GenerativeAiSandboxAsync extends AutoCloseable {

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
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelSandboxCommandResponse> cancelSandboxCommand(
            CancelSandboxCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelSandboxCommandRequest, CancelSandboxCommandResponse>
                    handler);

    /**
     * Creates a sandbox resource and returns its initial state.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSandboxResponse> createSandbox(
            CreateSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSandboxRequest, CreateSandboxResponse>
                    handler);

    /**
     * Creates a sandbox snapshot resource and returns its initial state.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSandboxSnapshotResponse> createSandboxSnapshot(
            CreateSandboxSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSandboxSnapshotRequest, CreateSandboxSnapshotResponse>
                    handler);

    /**
     * Deletes a sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSandboxResponse> deleteSandbox(
            DeleteSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSandboxRequest, DeleteSandboxResponse>
                    handler);

    /**
     * Deletes a sandbox snapshot.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSandboxSnapshotResponse> deleteSandboxSnapshot(
            DeleteSandboxSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSandboxSnapshotRequest, DeleteSandboxSnapshotResponse>
                    handler);

    /**
     * Extends the duration of a sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExtendSandboxResponse> extendSandbox(
            ExtendSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExtendSandboxRequest, ExtendSandboxResponse>
                    handler);

    /**
     * Gets information about a sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSandboxResponse> getSandbox(
            GetSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSandboxRequest, GetSandboxResponse> handler);

    /**
     * Gets command metadata for a sandbox command.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSandboxCommandResponse> getSandboxCommand(
            GetSandboxCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxCommandRequest, GetSandboxCommandResponse>
                    handler);

    /**
     * Gets captured output for a sandbox command starting from the requested event sequence.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSandboxCommandOutputResponse> getSandboxCommandOutput(
            GetSandboxCommandOutputRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxCommandOutputRequest, GetSandboxCommandOutputResponse>
                    handler);

    /**
     * Gets information about a sandbox snapshot.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSandboxSnapshotResponse> getSandboxSnapshot(
            GetSandboxSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSandboxSnapshotRequest, GetSandboxSnapshotResponse>
                    handler);

    /**
     * Lists sandbox commands for a sandbox with optional pagination.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSandboxCommandResponse> listSandboxCommand(
            ListSandboxCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSandboxCommandRequest, ListSandboxCommandResponse>
                    handler);

    /**
     * Lists sandbox snapshot resources with optional filtering and pagination.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSandboxSnapshotsResponse> listSandboxSnapshots(
            ListSandboxSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSandboxSnapshotsRequest, ListSandboxSnapshotsResponse>
                    handler);

    /**
     * Lists sandbox resources with optional filtering and pagination. Specify exactly one of
     * `projectId` or `compartmentId`. A compartment-scoped request returns sandboxes from
     * Generative AI projects directly contained in that compartment; child compartments are not
     * included.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSandboxesResponse> listSandboxes(
            ListSandboxesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSandboxesRequest, ListSandboxesResponse>
                    handler);

    /**
     * Reads a file from a sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReadSandboxFileResponse> readSandboxFile(
            ReadSandboxFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<ReadSandboxFileRequest, ReadSandboxFileResponse>
                    handler);

    /**
     * Resumes a suspended sandbox by scaling its backing runtime back to one replica.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResumeSandboxResponse> resumeSandbox(
            ResumeSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<ResumeSandboxRequest, ResumeSandboxResponse>
                    handler);

    /**
     * Runs a command in a sandbox and returns the command identifier immediately.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RunSandboxCommandResponse> runSandboxCommand(
            RunSandboxCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RunSandboxCommandRequest, RunSandboxCommandResponse>
                    handler);

    /**
     * Runs a command in a sandbox and streams command events as newline-delimited JSON. Each line
     * is a serialized SandboxCommandEvent.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RunSandboxCommandAndStreamResponse> runSandboxCommandAndStream(
            RunSandboxCommandAndStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RunSandboxCommandAndStreamRequest, RunSandboxCommandAndStreamResponse>
                    handler);

    /**
     * Runs a command in a sandbox, blocks until command execution finishes, and returns the final
     * command metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RunSandboxCommandAndWaitResponse> runSandboxCommandAndWait(
            RunSandboxCommandAndWaitRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RunSandboxCommandAndWaitRequest, RunSandboxCommandAndWaitResponse>
                    handler);

    /**
     * Stops a running sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopSandboxResponse> stopSandbox(
            StopSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopSandboxRequest, StopSandboxResponse> handler);

    /**
     * Streams command events for an existing sandbox command from `fromSeq` through `untilSeq`
     * using Server-Sent Events. Each SSE `data` field contains a serialized SandboxCommandEvent.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StreamSandboxCommandEventsResponse> streamSandboxCommandEvents(
            StreamSandboxCommandEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StreamSandboxCommandEventsRequest, StreamSandboxCommandEventsResponse>
                    handler);

    /**
     * Suspends a running sandbox by scaling its backing runtime to zero replicas while retaining
     * the workspace block volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SuspendSandboxResponse> suspendSandbox(
            SuspendSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<SuspendSandboxRequest, SuspendSandboxResponse>
                    handler);

    /**
     * Updates a sandbox.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSandboxResponse> updateSandbox(
            UpdateSandboxRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSandboxRequest, UpdateSandboxResponse>
                    handler);

    /**
     * Writes a file in a sandbox and returns the resulting file resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<WriteSandboxFileResponse> writeSandboxFile(
            WriteSandboxFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<WriteSandboxFileRequest, WriteSandboxFileResponse>
                    handler);
}
