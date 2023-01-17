/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent;

import com.oracle.bmc.managementagent.requests.*;
import com.oracle.bmc.managementagent.responses.*;

/**
 * Use the Management Agent API to manage your infrastructure's management agents, including their plugins and install keys.
 * For more information, see [Management Agent](https://docs.cloud.oracle.com/iaas/management-agents/index.html).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public interface ManagementAgentAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * User creates a new install key as part of this API.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagementAgentInstallKeyResponse>
            createManagementAgentInstallKey(
                    CreateManagementAgentInstallKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagementAgentInstallKeyRequest,
                                    CreateManagementAgentInstallKeyResponse>
                            handler);

    /**
     * Deletes a Management Agent resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagementAgentResponse> deleteManagementAgent(
            DeleteManagementAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementAgentRequest, DeleteManagementAgentResponse>
                    handler);

    /**
     * Deletes a Management Agent install Key resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagementAgentInstallKeyResponse>
            deleteManagementAgentInstallKey(
                    DeleteManagementAgentInstallKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagementAgentInstallKeyRequest,
                                    DeleteManagementAgentInstallKeyResponse>
                            handler);

    /**
     * Cancel the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler);

    /**
     * Deploys Plugins to a given list of agentIds.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeployPluginsResponse> deployPlugins(
            DeployPluginsRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeployPluginsRequest, DeployPluginsResponse>
                    handler);

    /**
     * Get the AutoUpgradable configuration for all agents in a tenancy.
     * The supplied compartmentId must be a tenancy root.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutoUpgradableConfigResponse> getAutoUpgradableConfig(
            GetAutoUpgradableConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutoUpgradableConfigRequest, GetAutoUpgradableConfigResponse>
                    handler);

    /**
     * Gets complete details of the inventory of a given agent id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementAgentResponse> getManagementAgent(
            GetManagementAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagementAgentRequest, GetManagementAgentResponse>
                    handler);

    /**
     * Gets complete details of the Agent install Key for a given key id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementAgentInstallKeyResponse> getManagementAgentInstallKey(
            GetManagementAgentInstallKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagementAgentInstallKeyRequest,
                            GetManagementAgentInstallKeyResponse>
                    handler);

    /**
     * Returns a file with Management Agent install Key in it
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementAgentInstallKeyContentResponse>
            getManagementAgentInstallKeyContent(
                    GetManagementAgentInstallKeyContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetManagementAgentInstallKeyContentRequest,
                                    GetManagementAgentInstallKeyContentResponse>
                            handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists the availability history records of Management Agent
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailabilityHistoriesResponse> listAvailabilityHistories(
            ListAvailabilityHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityHistoriesRequest, ListAvailabilityHistoriesResponse>
                    handler);

    /**
     * Get supported agent image information
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementAgentImagesResponse> listManagementAgentImages(
            ListManagementAgentImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementAgentImagesRequest, ListManagementAgentImagesResponse>
                    handler);

    /**
     * Returns a list of Management Agent installed Keys.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementAgentInstallKeysResponse>
            listManagementAgentInstallKeys(
                    ListManagementAgentInstallKeysRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagementAgentInstallKeysRequest,
                                    ListManagementAgentInstallKeysResponse>
                            handler);

    /**
     * Returns a list of managementAgentPlugins.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementAgentPluginsResponse> listManagementAgentPlugins(
            ListManagementAgentPluginsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementAgentPluginsRequest, ListManagementAgentPluginsResponse>
                    handler);

    /**
     * Returns a list of Management Agents.
     * If no explicit page size limit is specified, it will default to 1000 when compartmentIdInSubtree is true and 5000 otherwise.
     * The response is limited to maximum 1000 records when compartmentIdInSubtree is true.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementAgentsResponse> listManagementAgents(
            ListManagementAgentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementAgentsRequest, ListManagementAgentsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Sets the AutoUpgradable configuration for all agents in a tenancy.
     * The supplied compartmentId must be a tenancy root.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetAutoUpgradableConfigResponse> setAutoUpgradableConfig(
            SetAutoUpgradableConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SetAutoUpgradableConfigRequest, SetAutoUpgradableConfigResponse>
                    handler);

    /**
     * Gets count of the inventory of agents for a given compartment id, group by, and isPluginDeployed parameters.
     * Supported groupBy parameters: availabilityStatus, platformType, version
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagementAgentCountsResponse>
            summarizeManagementAgentCounts(
                    SummarizeManagementAgentCountsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagementAgentCountsRequest,
                                    SummarizeManagementAgentCountsResponse>
                            handler);

    /**
     * Gets count of the inventory of management agent plugins for a given compartment id and group by parameter.
     * Supported groupBy parameter: pluginName
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagementAgentPluginCountsResponse>
            summarizeManagementAgentPluginCounts(
                    SummarizeManagementAgentPluginCountsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagementAgentPluginCountsRequest,
                                    SummarizeManagementAgentPluginCountsResponse>
                            handler);

    /**
     * API to update the console managed properties of the Management Agent.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagementAgentResponse> updateManagementAgent(
            UpdateManagementAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementAgentRequest, UpdateManagementAgentResponse>
                    handler);

    /**
     * API to update the modifiable properties of the Management Agent install key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagementAgentInstallKeyResponse>
            updateManagementAgentInstallKey(
                    UpdateManagementAgentInstallKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagementAgentInstallKeyRequest,
                                    UpdateManagementAgentInstallKeyResponse>
                            handler);
}
