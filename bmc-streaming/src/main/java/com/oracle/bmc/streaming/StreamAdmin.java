/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public interface StreamAdmin extends AutoCloseable {

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
     * Starts the provisioning of a new stream.
     * To track the progress of the provisioning, you can periodically call {@link #getStream(GetStreamRequest) getStream}.
     * In the response, the `lifecycleState` parameter of the {@link Stream} object tells you its current state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateStreamResponse createStream(CreateStreamRequest request);

    /**
     * Deletes a stream and its content. Stream contents are deleted immediately. The service retains records of the stream itself for 90 days after deletion.
     * The `lifeCycleState` parameter of the `Stream` object changes to `DELETING` and the stream becomes inaccessible for read or write operations.
     * To verify that a stream has been deleted, make a {@link #getStream(GetStreamRequest) getStream} request. If the call returns the stream's
     * lifecycle state as `DELETED`, then the stream has been deleted. If the call returns a \"404 Not Found\" error, that means all records of the
     * stream have been deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteStreamResponse deleteStream(DeleteStreamRequest request);

    /**
     * Gets detailed information about a stream, including the number of partitions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStreamResponse getStream(GetStreamRequest request);

    /**
     * Lists the streams.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListStreamsResponse listStreams(ListStreamsRequest request);

    /**
     * Updates the tags applied to the stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateStreamResponse updateStream(UpdateStreamRequest request);

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
