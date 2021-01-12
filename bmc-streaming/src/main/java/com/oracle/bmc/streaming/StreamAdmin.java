/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * The API for the Streaming Service.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface StreamAdmin extends AutoCloseable {

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
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ChangeConnectHarnessCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeConnectHarnessCompartment API.
     */
    ChangeConnectHarnessCompartmentResponse changeConnectHarnessCompartment(
            ChangeConnectHarnessCompartmentRequest request);

    /**
     * Moves a resource into a different compartment.
     * When provided, If-Match is checked against ETag values of the resource.
     * The stream will also be moved into the default stream pool in the destination compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ChangeStreamCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeStreamCompartment API.
     */
    ChangeStreamCompartmentResponse changeStreamCompartment(ChangeStreamCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ChangeStreamPoolCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeStreamPoolCompartment API.
     */
    ChangeStreamPoolCompartmentResponse changeStreamPoolCompartment(
            ChangeStreamPoolCompartmentRequest request);

    /**
     * Starts the provisioning of a new connect harness.
     * To track the progress of the provisioning, you can periodically call {@link ConnectHarness} object tells you its current state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateConnectHarnessExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateConnectHarness API.
     */
    CreateConnectHarnessResponse createConnectHarness(CreateConnectHarnessRequest request);

    /**
     * Starts the provisioning of a new stream.
     * The stream will be created in the given compartment id or stream pool id, depending on which parameter is specified.
     * Compartment id and stream pool id cannot be specified at the same time.
     * To track the progress of the provisioning, you can periodically call {@link #getStream(GetStreamRequest) getStream}.
     * In the response, the `lifecycleState` parameter of the {@link Stream} object tells you its current state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateStreamExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateStream API.
     */
    CreateStreamResponse createStream(CreateStreamRequest request);

    /**
     * Starts the provisioning of a new stream pool.
     * To track the progress of the provisioning, you can periodically call GetStreamPool.
     * In the response, the `lifecycleState` parameter of the object tells you its current state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateStreamPoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateStreamPool API.
     */
    CreateStreamPoolResponse createStreamPool(CreateStreamPoolRequest request);

    /**
     * Deletes a connect harness and its content. Connect harness contents are deleted immediately. The service retains records of the connect harness itself for 90 days after deletion.
     * The `lifecycleState` parameter of the `ConnectHarness` object changes to `DELETING` and the connect harness becomes inaccessible for read or write operations.
     * To verify that a connect harness has been deleted, make a {@link #getConnectHarness(GetConnectHarnessRequest) getConnectHarness} request. If the call returns the connect harness's
     * lifecycle state as `DELETED`, then the connect harness has been deleted. If the call returns a \"404 Not Found\" error, that means all records of the
     * connect harness have been deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/DeleteConnectHarnessExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteConnectHarness API.
     */
    DeleteConnectHarnessResponse deleteConnectHarness(DeleteConnectHarnessRequest request);

    /**
     * Deletes a stream and its content. Stream contents are deleted immediately. The service retains records of the stream itself for 90 days after deletion.
     * The `lifecycleState` parameter of the `Stream` object changes to `DELETING` and the stream becomes inaccessible for read or write operations.
     * To verify that a stream has been deleted, make a {@link #getStream(GetStreamRequest) getStream} request. If the call returns the stream's
     * lifecycle state as `DELETED`, then the stream has been deleted. If the call returns a \"404 Not Found\" error, that means all records of the
     * stream have been deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/DeleteStreamExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteStream API.
     */
    DeleteStreamResponse deleteStream(DeleteStreamRequest request);

    /**
     * Deletes a stream pool. All containing streams will also be deleted.
     * The default stream pool of a compartment cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/DeleteStreamPoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteStreamPool API.
     */
    DeleteStreamPoolResponse deleteStreamPool(DeleteStreamPoolRequest request);

    /**
     * Gets detailed information about a connect harness.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetConnectHarnessExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConnectHarness API.
     */
    GetConnectHarnessResponse getConnectHarness(GetConnectHarnessRequest request);

    /**
     * Gets detailed information about a stream, including the number of partitions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetStreamExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStream API.
     */
    GetStreamResponse getStream(GetStreamRequest request);

    /**
     * Gets detailed information about the stream pool, such as Kafka settings.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetStreamPoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStreamPool API.
     */
    GetStreamPoolResponse getStreamPool(GetStreamPoolRequest request);

    /**
     * Lists the connectharness.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ListConnectHarnessesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConnectHarnesses API.
     */
    ListConnectHarnessesResponse listConnectHarnesses(ListConnectHarnessesRequest request);

    /**
     * List the stream pools for a given compartment ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ListStreamPoolsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStreamPools API.
     */
    ListStreamPoolsResponse listStreamPools(ListStreamPoolsRequest request);

    /**
     * Lists the streams in the given compartment id.
     * If the compartment id is specified, it will list streams in the compartment, regardless of their stream pool.
     * If the stream pool id is specified, the action will be scoped to that stream pool.
     * The compartment id and stream pool id cannot be specified at the same time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ListStreamsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStreams API.
     */
    ListStreamsResponse listStreams(ListStreamsRequest request);

    /**
     * Updates the tags applied to the connect harness.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateConnectHarnessExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConnectHarness API.
     */
    UpdateConnectHarnessResponse updateConnectHarness(UpdateConnectHarnessRequest request);

    /**
     * Updates the stream. Only specified values will be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateStreamExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateStream API.
     */
    UpdateStreamResponse updateStream(UpdateStreamRequest request);

    /**
     * Updates the specified stream pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateStreamPoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateStreamPool API.
     */
    UpdateStreamPoolResponse updateStreamPool(UpdateStreamPoolRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    StreamAdminWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    StreamAdminPaginators getPaginators();
}
