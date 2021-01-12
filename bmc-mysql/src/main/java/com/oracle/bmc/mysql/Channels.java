/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

/**
 * The API for the MySQL Database Service
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public interface Channels extends AutoCloseable {

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
     * Creates a Channel to establish replication from a source to a target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/CreateChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateChannel API.
     */
    CreateChannelResponse createChannel(CreateChannelRequest request);

    /**
     * Deletes the specified Channel.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/DeleteChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteChannel API.
     */
    DeleteChannelResponse deleteChannel(DeleteChannelRequest request);

    /**
     * Gets the full details of the specified Channel, including the user-specified
     * configuration parameters (passwords are omitted), as well as information about
     * the state of the Channel, its sources and targets.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GetChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetChannel API.
     */
    GetChannelResponse getChannel(GetChannelRequest request);

    /**
     * Lists all the Channels that match the specified filters.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ListChannelsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListChannels API.
     */
    ListChannelsResponse listChannels(ListChannelsRequest request);

    /**
     * Resets the specified Channel by purging its cached information, leaving the Channel
     * as if it had just been created. This operation is only accepted in Inactive Channels.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ResetChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetChannel API.
     */
    ResetChannelResponse resetChannel(ResetChannelRequest request);

    /**
     * Resumes an enabled Channel that has become Inactive due to an error. The resume operation
     * requires that the error that cause the Channel to become Inactive has already been fixed,
     * otherwise the operation may fail.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ResumeChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResumeChannel API.
     */
    ResumeChannelResponse resumeChannel(ResumeChannelRequest request);

    /**
     * Updates the properties of the specified Channel.
     * If the Channel is Active the Update operation will asynchronously apply the new configuration
     * parameters to the Channel and the Channel may become temporarily unavailable. Otherwise, the
     * new configuration will be applied the next time the Channel becomes Active.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/UpdateChannelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateChannel API.
     */
    UpdateChannelResponse updateChannel(UpdateChannelRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ChannelsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ChannelsPaginators getPaginators();
}
