/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration;

import com.oracle.bmc.integration.requests.*;
import com.oracle.bmc.integration.responses.*;

/** Oracle Integration API. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
public interface IntegrationInstanceAsync extends AutoCloseable {

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
     * Enable Oracle Managed Custom Endpoint for given integration instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddOracleManagedCustomEndpointResponse>
            addOracleManagedCustomEndpoint(
                    AddOracleManagedCustomEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddOracleManagedCustomEndpointRequest,
                                    AddOracleManagedCustomEndpointResponse>
                            handler);

    /**
     * Change the compartment for an integration instance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIntegrationInstanceCompartmentResponse>
            changeIntegrationInstanceCompartment(
                    ChangeIntegrationInstanceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIntegrationInstanceCompartmentRequest,
                                    ChangeIntegrationInstanceCompartmentResponse>
                            handler);

    /**
     * Change an Integration instance network endpoint. The operation is long-running and creates a
     * new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIntegrationInstanceNetworkEndpointResponse>
            changeIntegrationInstanceNetworkEndpoint(
                    ChangeIntegrationInstanceNetworkEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIntegrationInstanceNetworkEndpointRequest,
                                    ChangeIntegrationInstanceNetworkEndpointResponse>
                            handler);

    /**
     * Change private endpoint outbound connection for given Integration instance. The operation is
     * long-running and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateEndpointOutboundConnectionResponse>
            changePrivateEndpointOutboundConnection(
                    ChangePrivateEndpointOutboundConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointOutboundConnectionRequest,
                                    ChangePrivateEndpointOutboundConnectionResponse>
                            handler);

    /**
     * Creates a new Integration Instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIntegrationInstanceResponse> createIntegrationInstance(
            CreateIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIntegrationInstanceRequest, CreateIntegrationInstanceResponse>
                    handler);

    /**
     * Deletes an Integration Instance resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIntegrationInstanceResponse> deleteIntegrationInstance(
            DeleteIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIntegrationInstanceRequest, DeleteIntegrationInstanceResponse>
                    handler);

    /**
     * Allows failover for disaster recovery. Called in the context of integration instance in that
     * region. Upon calling the failover api in the region where given instance was created, the
     * intigration instance if primary will be switched to standby and crossRegion integration
     * instance will be switched to primary and vice-versa.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisasterRecoveryFailoverResponse> disasterRecoveryFailover(
            DisasterRecoveryFailoverRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisasterRecoveryFailoverRequest, DisasterRecoveryFailoverResponse>
                    handler);

    /**
     * Enable Process Automation for given Integration Instance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableProcessAutomationResponse> enableProcessAutomation(
            EnableProcessAutomationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableProcessAutomationRequest, EnableProcessAutomationResponse>
                    handler);

    /**
     * Extend Data Retention period for given Integration Instance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExtendDataRetentionResponse> extendDataRetention(
            ExtendDataRetentionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExtendDataRetentionRequest, ExtendDataRetentionResponse>
                    handler);

    /**
     * Gets a IntegrationInstance by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIntegrationInstanceResponse> getIntegrationInstance(
            GetIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIntegrationInstanceRequest, GetIntegrationInstanceResponse>
                    handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns a list of Integration Instances.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIntegrationInstancesResponse> listIntegrationInstances(
            ListIntegrationInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIntegrationInstancesRequest, ListIntegrationInstancesResponse>
                    handler);

    /**
     * Get the errors of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Get the logs of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Remove Oracle Managed Custom Endpoint for given integration instance that was previously
     * enabled.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveOracleManagedCustomEndpointResponse>
            removeOracleManagedCustomEndpoint(
                    RemoveOracleManagedCustomEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveOracleManagedCustomEndpointRequest,
                                    RemoveOracleManagedCustomEndpointResponse>
                            handler);

    /**
     * Start an integration instance that was previously in an INACTIVE state
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartIntegrationInstanceResponse> startIntegrationInstance(
            StartIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartIntegrationInstanceRequest, StartIntegrationInstanceResponse>
                    handler);

    /**
     * Stop an integration instance that was previously in an ACTIVE state
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopIntegrationInstanceResponse> stopIntegrationInstance(
            StopIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopIntegrationInstanceRequest, StopIntegrationInstanceResponse>
                    handler);

    /**
     * Updates the Integration Instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIntegrationInstanceResponse> updateIntegrationInstance(
            UpdateIntegrationInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIntegrationInstanceRequest, UpdateIntegrationInstanceResponse>
                    handler);
}
