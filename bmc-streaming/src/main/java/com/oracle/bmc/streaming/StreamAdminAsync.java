/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * Use the Streaming API to produce and consume messages, create streams and stream pools, and manage related items. For more information, see [Streaming](https://docs.cloud.oracle.com/Content/Streaming/Concepts/streamingoverview.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface StreamAdminAsync extends AutoCloseable {

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
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeConnectHarnessCompartmentResponse>
            changeConnectHarnessCompartment(
                    ChangeConnectHarnessCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConnectHarnessCompartmentRequest,
                                    ChangeConnectHarnessCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment.
     * When provided, If-Match is checked against ETag values of the resource.
     * The stream will also be moved into the default stream pool in the destination compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeStreamCompartmentResponse> changeStreamCompartment(
            ChangeStreamCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeStreamCompartmentRequest, ChangeStreamCompartmentResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeStreamPoolCompartmentResponse> changeStreamPoolCompartment(
            ChangeStreamPoolCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeStreamPoolCompartmentRequest, ChangeStreamPoolCompartmentResponse>
                    handler);

    /**
     * Starts the provisioning of a new connect harness.
     * To track the progress of the provisioning, you can periodically call {@link ConnectHarness} object tells you its current state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectHarnessResponse> createConnectHarness(
            CreateConnectHarnessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectHarnessRequest, CreateConnectHarnessResponse>
                    handler);

    /**
     * Starts the provisioning of a new stream.
     * The stream will be created in the given compartment id or stream pool id, depending on which parameter is specified.
     * Compartment id and stream pool id cannot be specified at the same time.
     * To track the progress of the provisioning, you can periodically call {@link #getStream(GetStreamRequest, Consumer, Consumer) getStream}.
     * In the response, the `lifecycleState` parameter of the {@link Stream} object tells you its current state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStreamResponse> createStream(
            CreateStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateStreamRequest, CreateStreamResponse>
                    handler);

    /**
     * Starts the provisioning of a new stream pool.
     * To track the progress of the provisioning, you can periodically call GetStreamPool.
     * In the response, the `lifecycleState` parameter of the object tells you its current state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStreamPoolResponse> createStreamPool(
            CreateStreamPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateStreamPoolRequest, CreateStreamPoolResponse>
                    handler);

    /**
     * Deletes a connect harness and its content. Connect harness contents are deleted immediately. The service retains records of the connect harness itself for 90 days after deletion.
     * The `lifecycleState` parameter of the `ConnectHarness` object changes to `DELETING` and the connect harness becomes inaccessible for read or write operations.
     * To verify that a connect harness has been deleted, make a {@link #getConnectHarness(GetConnectHarnessRequest, Consumer, Consumer) getConnectHarness} request. If the call returns the connect harness's
     * lifecycle state as `DELETED`, then the connect harness has been deleted. If the call returns a \"404 Not Found\" error, that means all records of the
     * connect harness have been deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectHarnessResponse> deleteConnectHarness(
            DeleteConnectHarnessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectHarnessRequest, DeleteConnectHarnessResponse>
                    handler);

    /**
     * Deletes a stream and its content. Stream contents are deleted immediately. The service retains records of the stream itself for 90 days after deletion.
     * The `lifecycleState` parameter of the `Stream` object changes to `DELETING` and the stream becomes inaccessible for read or write operations.
     * To verify that a stream has been deleted, make a {@link #getStream(GetStreamRequest, Consumer, Consumer) getStream} request. If the call returns the stream's
     * lifecycle state as `DELETED`, then the stream has been deleted. If the call returns a \"404 Not Found\" error, that means all records of the
     * stream have been deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStreamResponse> deleteStream(
            DeleteStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteStreamRequest, DeleteStreamResponse>
                    handler);

    /**
     * Deletes a stream pool. All containing streams will also be deleted.
     * The default stream pool of a compartment cannot be deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStreamPoolResponse> deleteStreamPool(
            DeleteStreamPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteStreamPoolRequest, DeleteStreamPoolResponse>
                    handler);

    /**
     * Gets detailed information about a connect harness.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectHarnessResponse> getConnectHarness(
            GetConnectHarnessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConnectHarnessRequest, GetConnectHarnessResponse>
                    handler);

    /**
     * Gets detailed information about a stream, including the number of partitions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStreamResponse> getStream(
            GetStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStreamRequest, GetStreamResponse> handler);

    /**
     * Gets detailed information about the stream pool, such as Kafka settings.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStreamPoolResponse> getStreamPool(
            GetStreamPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStreamPoolRequest, GetStreamPoolResponse>
                    handler);

    /**
     * Lists the connectharness.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectHarnessesResponse> listConnectHarnesses(
            ListConnectHarnessesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConnectHarnessesRequest, ListConnectHarnessesResponse>
                    handler);

    /**
     * List the stream pools for a given compartment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStreamPoolsResponse> listStreamPools(
            ListStreamPoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStreamPoolsRequest, ListStreamPoolsResponse>
                    handler);

    /**
     * Lists the streams in the given compartment id.
     * If the compartment id is specified, it will list streams in the compartment, regardless of their stream pool.
     * If the stream pool id is specified, the action will be scoped to that stream pool.
     * The compartment id and stream pool id cannot be specified at the same time.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStreamsResponse> listStreams(
            ListStreamsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStreamsRequest, ListStreamsResponse> handler);

    /**
     * Updates the tags applied to the connect harness.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConnectHarnessResponse> updateConnectHarness(
            UpdateConnectHarnessRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectHarnessRequest, UpdateConnectHarnessResponse>
                    handler);

    /**
     * Updates the stream. Only specified values will be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStreamResponse> updateStream(
            UpdateStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateStreamRequest, UpdateStreamResponse>
                    handler);

    /**
     * Updates the specified stream pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStreamPoolResponse> updateStreamPool(
            UpdateStreamPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateStreamPoolRequest, UpdateStreamPoolResponse>
                    handler);
}
