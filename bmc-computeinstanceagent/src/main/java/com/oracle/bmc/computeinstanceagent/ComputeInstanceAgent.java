/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent;

import com.oracle.bmc.computeinstanceagent.requests.*;
import com.oracle.bmc.computeinstanceagent.responses.*;

/**
 * Instance Agent Service API
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
public interface ComputeInstanceAgent extends AutoCloseable {

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
     * Cancel a command. Cancel is best effort attempt. If the commmand has already completed it will skip cancel.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/CancelInstanceAgentCommandExample.java.html">here</a> to see how to use CancelInstanceAgentCommand API.
     */
    CancelInstanceAgentCommandResponse cancelInstanceAgentCommand(
            CancelInstanceAgentCommandRequest request);

    /**
     * Create command for one or more managed instances
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/CreateInstanceAgentCommandExample.java.html">here</a> to see how to use CreateInstanceAgentCommand API.
     */
    CreateInstanceAgentCommandResponse createInstanceAgentCommand(
            CreateInstanceAgentCommandRequest request);

    /**
     * Gets information about the specified instance agent commandId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/GetInstanceAgentCommandExample.java.html">here</a> to see how to use GetInstanceAgentCommand API.
     */
    GetInstanceAgentCommandResponse getInstanceAgentCommand(GetInstanceAgentCommandRequest request);

    /**
     * Gets information about the status of specified instance agent commandId for the given instanceId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/GetInstanceAgentCommandExecutionExample.java.html">here</a> to see how to use GetInstanceAgentCommandExecution API.
     */
    GetInstanceAgentCommandExecutionResponse getInstanceAgentCommandExecution(
            GetInstanceAgentCommandExecutionRequest request);

    /**
     * List all executions of a command, i.e return command execution results from all targeted instances batch by
     * batch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/ListInstanceAgentCommandExecutionsExample.java.html">here</a> to see how to use ListInstanceAgentCommandExecutions API.
     */
    ListInstanceAgentCommandExecutionsResponse listInstanceAgentCommandExecutions(
            ListInstanceAgentCommandExecutionsRequest request);

    /**
     * List Instance agent commands issued with the specified filter.
     * Additonally you can filter commands sent to a particular InstanceId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computeinstanceagent/ListInstanceAgentCommandsExample.java.html">here</a> to see how to use ListInstanceAgentCommands API.
     */
    ListInstanceAgentCommandsResponse listInstanceAgentCommands(
            ListInstanceAgentCommandsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ComputeInstanceAgentWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputeInstanceAgentPaginators getPaginators();
}
