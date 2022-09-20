/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * API for Oracle Cloud Bridge service.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public interface OcbAgentSvcAsync extends AutoCloseable {

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
     * Add a dependency to the environment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddAgentDependencyResponse> addAgentDependency(
            AddAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddAgentDependencyRequest, AddAgentDependencyResponse>
                    handler);

    /**
     * Moves an Agent resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAgentCompartmentResponse> changeAgentCompartment(
            ChangeAgentCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeAgentCompartmentRequest, ChangeAgentCompartmentResponse>
                    handler);

    /**
     * Moves a AgentDependency resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAgentDependencyCompartmentResponse>
            changeAgentDependencyCompartment(
                    ChangeAgentDependencyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAgentDependencyCompartmentRequest,
                                    ChangeAgentDependencyCompartmentResponse>
                            handler);

    /**
     * Moves a source environment resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEnvironmentCompartmentResponse> changeEnvironmentCompartment(
            ChangeEnvironmentCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeEnvironmentCompartmentRequest,
                            ChangeEnvironmentCompartmentResponse>
                    handler);

    /**
     * Creates an Agent.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAgentResponse> createAgent(
            CreateAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAgentRequest, CreateAgentResponse> handler);

    /**
     * Creates an AgentDependency.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAgentDependencyResponse> createAgentDependency(
            CreateAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAgentDependencyRequest, CreateAgentDependencyResponse>
                    handler);

    /**
     * Creates a source environment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEnvironmentResponse> createEnvironment(
            CreateEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEnvironmentRequest, CreateEnvironmentResponse>
                    handler);

    /**
     * Deletes an Agent resource identified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAgentResponse> deleteAgent(
            DeleteAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAgentRequest, DeleteAgentResponse> handler);

    /**
     * Deletes the AgentDependency resource based on an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAgentDependencyResponse> deleteAgentDependency(
            DeleteAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAgentDependencyRequest, DeleteAgentDependencyResponse>
                    handler);

    /**
     * Deletes a the source environment resource identified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEnvironmentResponse> deleteEnvironment(
            DeleteEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteEnvironmentRequest, DeleteEnvironmentResponse>
                    handler);

    /**
     * Gets an Agent by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAgentResponse> getAgent(
            GetAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAgentRequest, GetAgentResponse> handler);

    /**
     * Gets an AgentDependency by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAgentDependencyResponse> getAgentDependency(
            GetAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAgentDependencyRequest, GetAgentDependencyResponse>
                    handler);

    /**
     * Gets a source environment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEnvironmentResponse> getEnvironment(
            GetEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResponse>
                    handler);

    /**
     * Gets a plugin by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPluginResponse> getPlugin(
            GetPluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPluginRequest, GetPluginResponse> handler);

    /**
     * Returns a list of AgentDependencies such as AgentDependencyCollection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAgentDependenciesResponse> listAgentDependencies(
            ListAgentDependenciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAgentDependenciesRequest, ListAgentDependenciesResponse>
                    handler);

    /**
     * Returns a list of Agents.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAgentsResponse> listAgents(
            ListAgentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAgentsRequest, ListAgentsResponse> handler);

    /**
     * Returns a list of Appliance Images.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApplianceImagesResponse> listApplianceImages(
            ListApplianceImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListApplianceImagesRequest, ListApplianceImagesResponse>
                    handler);

    /**
     * Returns a list of source environments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEnvironmentsResponse> listEnvironments(
            ListEnvironmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResponse>
                    handler);

    /**
     * Adds a dependency to the source environment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveAgentDependencyResponse> removeAgentDependency(
            RemoveAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveAgentDependencyRequest, RemoveAgentDependencyResponse>
                    handler);

    /**
     * Updates the Agent.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAgentResponse> updateAgent(
            UpdateAgentRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAgentRequest, UpdateAgentResponse> handler);

    /**
     * Updates the AgentDependency.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAgentDependencyResponse> updateAgentDependency(
            UpdateAgentDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAgentDependencyRequest, UpdateAgentDependencyResponse>
                    handler);

    /**
     * Updates the source environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEnvironmentResponse> updateEnvironment(
            UpdateEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateEnvironmentRequest, UpdateEnvironmentResponse>
                    handler);

    /**
     * Updates the plugin.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePluginResponse> updatePlugin(
            UpdatePluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePluginRequest, UpdatePluginResponse>
                    handler);
}
