/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent;

import com.oracle.bmc.computeinstanceagent.requests.*;
import com.oracle.bmc.computeinstanceagent.responses.*;

/**
 * API for the Oracle Cloud Agent software running on compute instances. Oracle Cloud Agent is a
 * lightweight process that monitors and manages compute instances.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
public interface ComputeInstanceAgentAsync extends AutoCloseable {

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
     * Cancels a command that is scheduled to run on a compute instance that is managed by Oracle
     * Cloud Agent.
     *
     * <p>Canceling a command is a best-effort attempt. If the command has already completed, it
     * will not be canceled.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelInstanceAgentCommandResponse> cancelInstanceAgentCommand(
            CancelInstanceAgentCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelInstanceAgentCommandRequest, CancelInstanceAgentCommandResponse>
                    handler);

    /**
     * Creates a command or script to run on a compute instance that is managed by Oracle Cloud
     * Agent.
     *
     * <p>On Linux instances, the script runs in a bash shell. On Windows instances, the script runs
     * in a batch shell.
     *
     * <p>Commands that require administrator privileges will run only if Oracle Cloud Agent is
     * running with administrator privileges.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateInstanceAgentCommandResponse> createInstanceAgentCommand(
            CreateInstanceAgentCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateInstanceAgentCommandRequest, CreateInstanceAgentCommandResponse>
                    handler);

    /**
     * Gets information about an Oracle Cloud Agent command.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceAgentCommandResponse> getInstanceAgentCommand(
            GetInstanceAgentCommandRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceAgentCommandRequest, GetInstanceAgentCommandResponse>
                    handler);

    /**
     * Gets information about the status of specified instance agent commandId for the given
     * instanceId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceAgentCommandExecutionResponse>
            getInstanceAgentCommandExecution(
                    GetInstanceAgentCommandExecutionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetInstanceAgentCommandExecutionRequest,
                                    GetInstanceAgentCommandExecutionResponse>
                            handler);

    /**
     * Lists the execution details for Oracle Cloud Agent commands that run on the specified compute
     * instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceAgentCommandExecutionsResponse>
            listInstanceAgentCommandExecutions(
                    ListInstanceAgentCommandExecutionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceAgentCommandExecutionsRequest,
                                    ListInstanceAgentCommandExecutionsResponse>
                            handler);

    /**
     * Lists the Oracle Cloud Agent commands issued in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceAgentCommandsResponse> listInstanceAgentCommands(
            ListInstanceAgentCommandsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceAgentCommandsRequest, ListInstanceAgentCommandsResponse>
                    handler);
}
