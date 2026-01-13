/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client;

import com.oracle.bmc.adk.error.AgentException;
import com.oracle.bmc.adk.module.AgentModule;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.prebuilt.AgenticRagTool;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.Constants;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.generativeaiagent.GenerativeAiAgentClient;
import com.oracle.bmc.generativeaiagent.model.CreateToolDetails;
import com.oracle.bmc.generativeaiagent.model.Function;
import com.oracle.bmc.generativeaiagent.model.FunctionCallingToolConfig;
import com.oracle.bmc.generativeaiagent.model.KnowledgeBaseConfig;
import com.oracle.bmc.generativeaiagent.model.LlmConfig;
import com.oracle.bmc.generativeaiagent.model.LlmCustomization;
import com.oracle.bmc.generativeaiagent.model.RagToolConfig;
import com.oracle.bmc.generativeaiagent.model.Tool;
import com.oracle.bmc.generativeaiagent.model.ToolSummary;
import com.oracle.bmc.generativeaiagent.model.UpdateAgentDetails;
import com.oracle.bmc.generativeaiagent.model.UpdateToolDetails;
import com.oracle.bmc.generativeaiagent.requests.CreateToolRequest;
import com.oracle.bmc.generativeaiagent.requests.DeleteToolRequest;
import com.oracle.bmc.generativeaiagent.requests.GetAgentEndpointRequest;
import com.oracle.bmc.generativeaiagent.requests.GetAgentRequest;
import com.oracle.bmc.generativeaiagent.requests.GetToolRequest;
import com.oracle.bmc.generativeaiagent.requests.ListToolsRequest;
import com.oracle.bmc.generativeaiagent.requests.UpdateAgentRequest;
import com.oracle.bmc.generativeaiagent.requests.UpdateToolRequest;
import com.oracle.bmc.generativeaiagent.responses.CreateToolResponse;
import com.oracle.bmc.generativeaiagent.responses.DeleteToolResponse;
import com.oracle.bmc.generativeaiagent.responses.GetAgentEndpointResponse;
import com.oracle.bmc.generativeaiagent.responses.GetAgentResponse;
import com.oracle.bmc.generativeaiagent.responses.GetToolResponse;
import com.oracle.bmc.generativeaiagent.responses.ListToolsResponse;
import com.oracle.bmc.generativeaiagent.responses.UpdateAgentResponse;
import com.oracle.bmc.generativeaiagent.responses.UpdateToolResponse;
import com.oracle.bmc.generativeaiagentruntime.GenerativeAiAgentRuntimeClient;
import com.oracle.bmc.generativeaiagentruntime.model.ChatDetails;
import com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails;
import com.oracle.bmc.generativeaiagentruntime.model.FunctionCallingPerformedAction;
import com.oracle.bmc.generativeaiagentruntime.model.PerformedAction;
import com.oracle.bmc.generativeaiagentruntime.requests.ChatRequest;
import com.oracle.bmc.generativeaiagentruntime.requests.CreateSessionRequest;
import com.oracle.bmc.generativeaiagentruntime.requests.DeleteSessionRequest;
import com.oracle.bmc.generativeaiagentruntime.responses.ChatResponse;
import com.oracle.bmc.generativeaiagentruntime.responses.CreateSessionResponse;
import com.oracle.bmc.generativeaiagentruntime.responses.DeleteSessionResponse;
import com.oracle.bmc.http.ClientConfigurator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The AgentClient class provides functionality to interact with the Generative AI agent for both
 * runtime and management operations.
 */
public class AgentClient implements AutoCloseable {
    private final String agentManagementEndpoint;
    private final String agentRuntimeEndpoint;
    private final BasicAuthenticationDetailsProvider authProvider;
    private final String region;
    private final String logLevel;
    private final ClientConfigurator additionalClientConfiguration;

    private final GenerativeAiAgentRuntimeClient agentDpClient;
    private final GenerativeAiAgentClient agentCpClient;

    /**
     * Creates a new instance of the AgentClient using the provided configuration.
     *
     * @param agentManagementEndpoint the endpoint for the agent management service
     * @param agentRuntimeEndpoint the endpoint for the agent runtime service
     * @param authProvider the authentication details provider for the client
     * @param region the region where the agent is deployed (optional)
     * @param logLevel the log level for the client (optional, defaults to INFO if invalid)
     * @param additionalClientConfiguration additional configuration for the client (optional)
     */
    private AgentClient(
            String agentManagementEndpoint,
            String agentRuntimeEndpoint,
            BasicAuthenticationDetailsProvider authProvider,
            String region,
            String logLevel,
            ClientConfigurator additionalClientConfiguration) {

        if (region == null) {
            if (agentManagementEndpoint == null) {
                throw new IllegalArgumentException(
                        "At least one of 'agentManagementEndpoint' or 'region' must be non-null");
            }
            if (agentRuntimeEndpoint == null) {
                throw new IllegalArgumentException(
                        "At least one of 'agentRuntimeEndpoint' or 'region' must be non-null");
            }
        }

        if (authProvider == null) {
            throw new IllegalArgumentException("authProvider must not be null.");
        }

        this.agentManagementEndpoint = agentManagementEndpoint;
        this.agentRuntimeEndpoint = agentRuntimeEndpoint;
        this.authProvider = authProvider;
        this.region = region;
        this.additionalClientConfiguration = additionalClientConfiguration;
        this.agentDpClient =
                AgentModule.getGenerativeAiAgentRuntimeClient(
                        authProvider, region, agentRuntimeEndpoint, additionalClientConfiguration);
        this.agentCpClient =
                AgentModule.getGenerativeAiAgentManagementClient(
                        authProvider,
                        region,
                        agentManagementEndpoint,
                        additionalClientConfiguration);
        this.logLevel = logLevel;
        setLogLevel(logLevel);
    }

    /**
     * Returns the endpoint URL for the agent management service.
     *
     * @return the agent management endpoint URL
     */
    public String getAgentManagementEndpoint() {
        return agentManagementEndpoint;
    }

    /**
     * Returns the endpoint URL for the agent runtime service.
     *
     * @return the agent runtime endpoint URL
     */
    public String getAgentRuntimeEndpoint() {
        return agentRuntimeEndpoint;
    }

    /**
     * Returns the authentication details provider used for authenticating with the Generative AI
     * agent services.
     *
     * @return the BasicAuthenticationDetailsProvider instance used for authentication
     */
    public BasicAuthenticationDetailsProvider getAuthProvider() {
        return authProvider;
    }

    /**
     * Returns the region where the agent is deployed.
     *
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Returns the log level currently configured for this client.
     *
     * @return the current log level as a {@link String} enum value
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * Returns the additional client configuration used for customizing the client behavior.
     *
     * @return the ClientConfigurator instance used for additional client configuration
     */
    public ClientConfigurator getAdditionalClientConfiguration() {
        return additionalClientConfiguration;
    }

    /**
     * Returns the Generative AI Agent Runtime Client instance used for interacting with the agent's
     * runtime services. This client is responsible for handling runtime operations such as creating
     * sessions, deleting sessions, and invoking chat endpoints.
     *
     * @return the GenerativeAiAgentRuntimeClient instance
     */
    public GenerativeAiAgentRuntimeClient getAgentDpClient() {
        return agentDpClient;
    }

    /**
     * Returns the Generative AI Agent Client instance used for interacting with the agent's control
     * plane services. This client is responsible for handling management operations such as
     * creating, updating, and deleting agents, tools, and other related resources.
     *
     * @return the GenerativeAiAgentClient instance
     */
    public GenerativeAiAgentClient getAgentCpClient() {
        return agentCpClient;
    }

    public static class Builder {
        private String agentManagementEndpoint;
        private String agentRuntimeEndpoint;
        private BasicAuthenticationDetailsProvider authProvider;
        private String region;
        private String logLevel;
        private ClientConfigurator additionalClientConfiguration;

        public Builder agentManagementEndpoint(String endpoint) {
            this.agentManagementEndpoint = endpoint;
            return this;
        }

        public Builder agentRuntimeEndpoint(String endpoint) {
            this.agentRuntimeEndpoint = endpoint;
            return this;
        }

        public Builder authProvider(BasicAuthenticationDetailsProvider provider) {
            this.authProvider = provider;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder logLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder additionalClientConfiguration(ClientConfigurator config) {
            this.additionalClientConfiguration = config;
            return this;
        }

        public AgentClient build() {
            return new AgentClient(
                    agentManagementEndpoint,
                    agentRuntimeEndpoint,
                    authProvider,
                    region,
                    logLevel,
                    additionalClientConfiguration);
        }
    }

    /**
     * Returns a new instance of the {@link Builder} class, which is used to construct an {@link
     * AgentClient} object with the desired configuration.
     *
     * @return a new {@link Builder} instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Closes the authentication provider if it is an instance of {@link
     * SessionTokenAuthenticationDetailsProvider}. This method is used to release any resources held
     * by the authentication provider.
     */
    @Override
    public void close() {
        // Close auth provider if it's an instance of SessionTokenAuthenticationDetailsProvider
        if (authProvider != null
                && authProvider instanceof SessionTokenAuthenticationDetailsProvider) {
            try {
                ((SessionTokenAuthenticationDetailsProvider) authProvider).close();
            } catch (Exception e) {
                throw new AgentException("Failed to close session token auth provider", e);
            }
        }
    }

    /**
     * Create a new agent session.
     *
     * @param sessionName name for the session
     * @param sessionDescription description for the session
     * @param agentEndpointId the agent endpoint id
     * @return CreateSessionResponse
     */
    public String createSession(
            String sessionName, String sessionDescription, String agentEndpointId) {
        if (sessionName == null) {
            throw new IllegalArgumentException("sessionName must not be null");
        }
        if (sessionDescription == null) {
            throw new IllegalArgumentException("sessionDescription must not be null");
        }
        if (agentEndpointId == null) {
            throw new IllegalArgumentException("agentEndpointId must not be null");
        }
        CreateSessionRequest request =
                CreateSessionRequest.builder()
                        .agentEndpointId(agentEndpointId)
                        .createSessionDetails(
                                CreateSessionDetails.builder()
                                        .displayName(sessionName)
                                        .description(sessionDescription)
                                        .build())
                        .build();

        Console.debug(
                Console.Color.WHITE, String.format("Creating session with data: %s", request));

        try {
            CreateSessionResponse createSessionResponse = agentDpClient.createSession(request);
            if (createSessionRequestFailed(createSessionResponse)) {
                throw new AgentException("Failed to create session: " + createSessionResponse);
            }
            return createSessionResponse.getSession().getId();
        } catch (Exception e) {
            throw new AgentException(e);
        }
    }

    /**
     * Delete an existing agent session.
     *
     * @param agentEndpointId the agent endpoint id
     * @param sessionId the session ID to delete
     * @throws AgentException if session deletion fails
     */
    public void deleteSession(String agentEndpointId, String sessionId) {
        if (agentEndpointId == null) {
            throw new IllegalArgumentException("agentEndpointId must not be null");
        }
        if (sessionId == null) {
            throw new IllegalArgumentException("sessionId must not be null");
        }
        Console.debug(Console.Color.WHITE, String.format("Deleting session: %s", sessionId));

        DeleteSessionRequest request =
                DeleteSessionRequest.builder()
                        .agentEndpointId(agentEndpointId)
                        .sessionId(sessionId)
                        .build();

        try {
            DeleteSessionResponse response = agentDpClient.deleteSession(request);
            if (deleteSessionRequestFailed(response)) {
                throw new AgentException("Failed to delete session: " + response);
            }
            Console.log(Console.Color.WHITE, "Session deletion succeeded");
        } catch (Exception e) {
            throw new AgentException("Failed to delete session", e);
        }
    }

    /**
     * Invoke a chat session with the agent.
     *
     * @param sessionId The session ID to use for the chat
     * @param input The message from the user
     * @param agentEndpointId The agent endpoint id
     * @performed_actions Actions that have been performed
     * @return The chat response
     */
    public ChatResponse chat(
            String sessionId,
            String input,
            String agentEndpointId,
            List<PerformedAction> performedActions) {
        if (sessionId == null) {
            throw new IllegalArgumentException("sessionId must not be null");
        }
        if (input == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        if (agentEndpointId == null) {
            throw new IllegalArgumentException("agentEndpointId must not be null");
        }
        List<PerformedAction> functionCallingPerformedActions = null;
        if (performedActions != null && !performedActions.isEmpty()) {
            functionCallingPerformedActions =
                    performedActions.stream()
                            .filter(action -> action != null) // filter out null actions
                            .map(
                                    action ->
                                            FunctionCallingPerformedAction.builder()
                                                    .actionId(action.getActionId())
                                                    .functionCallOutput(
                                                            ((FunctionCallingPerformedAction)
                                                                            action)
                                                                    .getFunctionCallOutput())
                                                    .build())
                            .collect(Collectors.toList());
        }
        ChatRequest request =
                ChatRequest.builder()
                        .agentEndpointId(agentEndpointId)
                        .chatDetails(
                                ChatDetails.builder()
                                        .sessionId(sessionId)
                                        .userMessage(input)
                                        .shouldStream(false)
                                        .performedActions(functionCallingPerformedActions)
                                        .build())
                        .build();

        Console.debug(
                Console.Color.WHITE, String.format("Invoke chat endpoint with data: %s", request));

        try {
            ChatResponse chatResponse = agentDpClient.chat(request);
            Console.log(
                    Console.Color.WHITE,
                    String.format(
                            "chat response status code: %s", chatResponse.get__httpStatusCode__()));
            if (chatRequestFailed(chatResponse)) {
                throw new AgentException("Failed to invoke chat endpoint: " + chatResponse);
            }
            return chatResponse;
        } catch (Exception e) {
            Console.error(Console.Color.RED, String.format("Chat request failed: %s", e));
            throw new AgentException("An error occurred while invoking the chat endpoint", e);
        }
    }

    /**
     * Invoke a chat session with the agent using the provided session ID, user message, and agent
     * endpoint ID. This method allows you to interact with the Generative AI agent.
     *
     * @param sessionId The session ID to use for the chat.
     * @param input The message from the user.
     * @param agentEndpointId The agent endpoint ID.
     * @return The chat response.
     */
    public ChatResponse chat(String sessionId, String input, String agentEndpointId) {
        if (sessionId == null) {
            throw new IllegalArgumentException("sessionId must not be null");
        }
        if (input == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        if (agentEndpointId == null) {
            throw new IllegalArgumentException("agentEndpointId must not be null");
        }

        return chat(sessionId, input, agentEndpointId, null); // Default: performedActions = null
    }

    /**
     * Retrieve a list of tools associated with the specified agent.
     *
     * @param compartmentId The compartment ID in which to search for tools.
     * @param agentId The ID of the agent for which to list tools.
     * @return A {@link ListToolsResponse} containing a list of tools associated with the agent.
     * @throws AgentException If an error occurs while attempting to list the tools.
     */
    /**
     * Find tools associated with the agent.
     *
     * @return List of the tools
     */
    public ListToolsResponse listActiveTools(String compartmentId, String agentId) {
        if (compartmentId == null) {
            throw new IllegalArgumentException("compartmentId must not be null");
        }
        if (agentId == null) {
            throw new IllegalArgumentException("agentId must not be null");
        }
        ListToolsRequest request =
                ListToolsRequest.builder()
                        .compartmentId(compartmentId)
                        .agentId(agentId)
                        .lifecycleState(Tool.LifecycleState.Active)
                        .build();

        Console.debug(Console.Color.WHITE, String.format("List tools for agent id %s", agentId));

        try {
            ListToolsResponse response = agentCpClient.listTools(request);
            Console.debug(
                    Console.Color.WHITE,
                    String.format(
                            "ListTools response succeeded. opcRequestId: %s",
                            response.getOpcRequestId()));
            return response;
        } catch (Exception e) {
            Console.error(Console.Color.RED, String.format("ListTools request failed: %s", e));
            throw new AgentException("Failed to list tools for agent: " + agentId, e);
        }
    }

    /**
     * Creates and adds a new function tool to the specified agent.
     *
     * @param tool The {@link FunctionTool} object representing the tool to be added.
     * @param compartmentId The ID of the compartment in which to create the tool.
     * @param agentId The ID of the agent to which the tool will be added.
     * @return The {@link CreateToolResponse} returned from the API upon successful creation of the
     *     tool.
     * @throws AgentException If there is an error during the tool creation process.
     */
    /**
     * Create a tool
     *
     * @return The response from the API
     */
    public CreateToolResponse addFunctionCallingTools(
            FunctionTool tool, String compartmentId, String agentId) {

        if (tool == null) {
            throw new IllegalArgumentException("tool must not be null");
        }
        if (compartmentId == null) {
            throw new IllegalArgumentException("compartmentId must not be null");
        }
        if (agentId == null) {
            throw new IllegalArgumentException("agentId must not be null");
        }

        Function function =
                Function.builder()
                        .name(tool.getName())
                        .description(tool.getDescription())
                        .parameters((tool.getParameters()))
                        .build();

        FunctionCallingToolConfig toolConfig =
                FunctionCallingToolConfig.builder().function(function).build();

        CreateToolDetails createToolDetails =
                CreateToolDetails.builder()
                        .agentId(agentId)
                        .toolConfig(toolConfig)
                        .compartmentId(compartmentId)
                        .displayName(tool.getName())
                        .description(
                                tool.getDescription() == null || tool.getDescription().isEmpty()
                                        ? "Function description."
                                        : tool.getDescription()) // Tool description is required.
                        // Agent description is
                        // optional.
                        .freeformTags(Constants.FREEFORM_TAGS)
                        .definedTags(new HashMap<>())
                        .build();

        CreateToolRequest request =
                CreateToolRequest.builder().createToolDetails(createToolDetails).build();

        try {
            CreateToolResponse response = agentCpClient.createTool(request);
            Console.debug(
                    Console.Color.WHITE,
                    String.format(
                            "CreateTool response succeeded. opcRequestId: %s",
                            response.getOpcRequestId()));
            return response;
        } catch (Exception e) {
            Console.error(Console.Color.RED, String.format("CreateTool request failed: %s", e));
            throw new AgentException("Failed to create tool for agent: " + agentId, e);
        }
    }

    /**
     * Creates and adds a new Retrieval-Augmented Generation (RAG) tool to the specified agent.
     *
     * @param ragTool The {@link AgenticRagTool} object representing the RAG tool to be added. This
     *     tool must contain one or more knowledge base IDs.
     * @param compartmentId The ID of the compartment in which to create the tool.
     * @param agentId The ID of the agent to which the tool will be added.
     * @return The {@link CreateToolResponse} returned from the API upon successful creation of the
     *     tool.
     * @throws AgentException If there is an error during the tool creation process.
     */
    public CreateToolResponse addRagTool(
            AgenticRagTool ragTool, String compartmentId, String agentId) {

        if (ragTool == null) {
            throw new IllegalArgumentException("ragTool must not be null");
        }
        if (compartmentId == null) {
            throw new IllegalArgumentException("compartmentId must not be null");
        }
        if (agentId == null) {
            throw new IllegalArgumentException("agentId must not be null");
        }

        List<KnowledgeBaseConfig> knowledgeBaseConfigs =
                ragTool.getKnowledgeBaseIds().stream()
                        .map(kbId -> KnowledgeBaseConfig.builder().knowledgeBaseId(kbId).build())
                        .collect(Collectors.toList());

        RagToolConfig toolConfig =
                RagToolConfig.builder().knowledgeBaseConfigs(knowledgeBaseConfigs).build();

        // Create Tool Details
        CreateToolDetails createToolDetails =
                CreateToolDetails.builder()
                        .compartmentId(compartmentId)
                        .agentId(agentId)
                        .displayName("rag")
                        .description("rag tool created by ADK")
                        .toolConfig(toolConfig)
                        .freeformTags(Constants.FREEFORM_TAGS)
                        .build();

        CreateToolRequest createToolRequest =
                CreateToolRequest.builder().createToolDetails(createToolDetails).build();

        try {
            CreateToolResponse createToolResponse = agentCpClient.createTool(createToolRequest);

            if (createToolRequestFailed(createToolResponse)) {
                throw new AgentException("Failed to add tool" + createToolResponse);
            }

            return createToolResponse;

        } catch (Exception e) {
            throw new AgentException("Request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Retrieves the details of a specific tool by its ID.
     *
     * @param toolId The ID of the tool to retrieve.
     * @return The {@link GetToolResponse} containing the details of the requested tool.
     * @throws AgentException If an error occurs while attempting to retrieve the tool.
     */
    public GetToolResponse getTool(String toolId) {
        if (toolId == null) {
            throw new IllegalArgumentException("toolId must not be null");
        }

        GetToolRequest request = GetToolRequest.builder().toolId(toolId).build();
        try {
            GetToolResponse response = agentCpClient.getTool(request);
            Console.debug(
                    Console.Color.RED,
                    String.format(
                            "Getools response succeeded. opcRequestId: %s",
                            response.getOpcRequestId()));
            return response;
        } catch (Exception e) {
            Console.error(Console.Color.RED, String.format("GetTools request failed: %s", e));
            throw new AgentException("Failed to fetch tool with ID: " + toolId, e);
        }
    }

    /**
     * Updates a function tool with the specified ID by replacing its details with those of the
     * provided {@link FunctionTool} object.
     *
     * @param toolId The ID of the function tool to be updated.
     * @param tool The {@link FunctionTool} object containing the new details for the tool.
     * @return The {@link UpdateToolResponse} returned from the API upon successful update of the
     *     tool.
     * @throws AgentException If there is an error during the tool update process.
     */
    public UpdateToolResponse updateFunctionTool(String toolId, FunctionTool tool) {
        if (toolId == null) {
            throw new IllegalArgumentException("toolId must not be null");
        }
        if (tool == null) {
            throw new IllegalArgumentException("tool must not be null");
        }

        FunctionCallingToolConfig functionCallingToolConfig =
                FunctionCallingToolConfig.builder()
                        .function(
                                Function.builder()
                                        .name(tool.getName())
                                        .description(tool.getDescription())
                                        .parameters(tool.getParameters())
                                        .build())
                        .build();

        UpdateToolDetails updateToolDetails =
                UpdateToolDetails.builder()
                        .displayName(tool.getName())
                        .description(tool.getDescription())
                        .toolConfig(functionCallingToolConfig)
                        .freeformTags(Constants.FREEFORM_TAGS)
                        .build();

        UpdateToolRequest updateToolRequest =
                UpdateToolRequest.builder()
                        .toolId(toolId)
                        .updateToolDetails(updateToolDetails)
                        .build();

        try {
            UpdateToolResponse updateToolResponse = agentCpClient.updateTool(updateToolRequest);

            if (updateToolRequestFailed(updateToolResponse)) {
                throw new AgentException("Failed to update tool" + updateToolResponse);
            }

            return updateToolResponse;

        } catch (IllegalArgumentException e) {
            throw new AgentException("Request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Deletes a tool by its ID.
     *
     * @param toolId The ID of the tool to delete.
     * @return The {@link DeleteToolResponse} containing the response from the API after attempting
     *     to delete the tool.
     * @throws AgentException If an error occurs while attempting to delete the tool.
     */
    /**
     * Delete a tool by ID.
     *
     * @param toolId The ID of the tool to delete
     * @return The response from the API
     */
    public DeleteToolResponse deleteTools(String toolId) {

        if (toolId == null) {
            throw new IllegalArgumentException("toolId must not be null");
        }
        DeleteToolRequest request = DeleteToolRequest.builder().toolId(toolId).build();

        Console.debug(Console.Color.WHITE, String.format("Deleting tool with tool ID: %s", toolId));

        try {
            DeleteToolResponse response = agentCpClient.deleteTool(request);

            Console.debug(
                    Console.Color.WHITE,
                    String.format(
                            "DeleteTool response succeeded. opcRequestId: %s",
                            response.getOpcRequestId()));

            return response;
        } catch (Exception e) {
            Console.log(Console.Color.RED, String.format("DeleteTool request failed: %s", e));
            throw new AgentException("Failed to delete tool with ID: " + toolId, e);
        }
    }

    /**
     * Retrieves the details of a specific agent by its ID. This method sends a request to the agent
     * management client to fetch details about the agent. It handles any exceptions that occur
     * during the process and logs appropriate messages.
     *
     * @param agentId The ID of the agent to retrieve.
     * @return The {@link GetAgentResponse} containing the details of the requested agent.
     * @throws AgentException If an error occurs while attempting to retrieve the agent.
     */
    public GetAgentResponse getAgent(String agentId) {
        if (agentId == null) {
            throw new IllegalArgumentException("agentId must not be null");
        }
        GetAgentRequest request = GetAgentRequest.builder().agentId(agentId).build();

        Console.debug(
                Console.Color.WHITE, String.format("Get agent details for agent id %s", agentId));
        try {
            GetAgentResponse response = agentCpClient.getAgent(request);

            Console.debug(
                    Console.Color.WHITE,
                    String.format(
                            "GetAgent response succeeded. opcRequestId: %s Agent: %s",
                            response.getOpcRequestId(), response.getAgent()));

            return response;
        } catch (Exception e) {
            Console.error(Console.Color.RED, String.format("GgetAgent request failed: %s", e));
            throw new AgentException("Failed to retrieve agent details for ID: " + agentId, e);
        }
    }

    /**
     * Retrieves the details of a specific agent endpoint by its ID. This method sends a request to
     * the agent management client to fetch details about the agent endpoint. It handles any
     * exceptions that occur during the process and logs appropriate messages.
     *
     * @param agentEndpointId The ID of the agent endpoint to retrieve.
     * @return The {@link GetAgentEndpointResponse} containing the details of the requested agent
     *     endpoint.
     * @throws AgentException If an error occurs while attempting to retrieve the agent endpoint.
     */
    /** Get the agent details. */
    public GetAgentEndpointResponse getAgentEndpointResponse(String agentEndpointId) {
        if (agentEndpointId == null) {
            throw new IllegalArgumentException("agentEndpointId must not be null");
        }
        GetAgentEndpointRequest request =
                GetAgentEndpointRequest.builder().agentEndpointId(agentEndpointId).build();

        Console.debug(
                Console.Color.WHITE,
                String.format("Get agent endpoint details for agent endpoint %s", agentEndpointId));

        try {
            GetAgentEndpointResponse response = agentCpClient.getAgentEndpoint(request);

            Console.debug(
                    Console.Color.WHITE,
                    String.format(
                            "GetAgentEndpoint response succeeded. opcRequestId: %s AgentEndpoint: %s",
                            response.getOpcRequestId(), response.getAgentEndpoint()));

            return response;
        } catch (Exception e) {
            Console.error(
                    Console.Color.RED, String.format("GetAgentEndpoint request failed: %s", e));
            throw new AgentException(
                    "Failed to retrieve agent endpoint details for ID: " + agentEndpointId, e);
        }
    }

    /**
     * Updates an existing agent with the specified ID by modifying its details.
     *
     * @param agentId the ID of the agent to be updated
     * @param name the new display name for the agent (optional)
     * @param description the new description for the agent (optional)
     * @param instructions the new instructions for the agent (optional)
     * @return the UpdateAgentResponse containing the result of the update operation
     * @throws AgentException if an error occurs during the update process
     */
    public UpdateAgentResponse updateAgent(
            String agentId, String name, String description, String instructions) {

        if (agentId == null) {
            throw new IllegalArgumentException("agentId must not be null");
        }
        UpdateAgentDetails.Builder updateBuilder =
                UpdateAgentDetails.builder().freeformTags(Constants.FREEFORM_TAGS);

        if (name != null) {
            updateBuilder.displayName(name);
        }

        if (description != null) {
            updateBuilder.description(description);
        }

        if (instructions != null) {
            LlmCustomization llmCustomization =
                    LlmCustomization.builder().instruction(instructions).build();

            LlmConfig llmConfig =
                    LlmConfig.builder().routingLlmCustomization(llmCustomization).build();

            updateBuilder.llmConfig(llmConfig);
        }

        UpdateAgentDetails updateAgentDetails = updateBuilder.build();

        UpdateAgentRequest request =
                UpdateAgentRequest.builder()
                        .agentId(agentId)
                        .updateAgentDetails(updateAgentDetails)
                        .build();

        try {
            UpdateAgentResponse updateAgentResponse = agentCpClient.updateAgent(request);

            if (updateAgentRequestFailed(updateAgentResponse)) {
                throw new AgentException(
                        "Failed to update agent instructions " + updateAgentResponse);
            }

            Console.debug(
                    Console.Color.WHITE,
                    String.format("Update agent instructions response: " + updateAgentResponse));

            return updateAgentResponse;
        } catch (Exception e) {
            throw new AgentException("Request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Updates an existing Retrieval-Augmented Generation (RAG) tool identified by the given tool ID
     * with new knowledge base IDs provided in the {@link AgenticRagTool} object.
     *
     * @param ragToolId The ID of the RAG tool to be updated.
     * @param localRagTool The {@link AgenticRagTool} object containing the new knowledge base IDs.
     * @return The {@link UpdateToolResponse} response from the API after attempting to update the
     *     tool.
     * @throws AgentException If there is an error during the tool update process.
     */
    public UpdateToolResponse updateRagTool(
            ToolSummary remoteRagTool, AgenticRagTool localRagTool) {
        if (remoteRagTool == null) {
            throw new IllegalArgumentException("Remote rag tool must not be null");
        }
        if (localRagTool == null) {
            throw new IllegalArgumentException("Local rag tool must not be null");
        }
        List<KnowledgeBaseConfig> knowledgeBaseConfigs =
                localRagTool.getKnowledgeBaseIds().stream()
                        .map(kbId -> KnowledgeBaseConfig.builder().knowledgeBaseId(kbId).build())
                        .collect(Collectors.toList());

        RagToolConfig toolConfig =
                RagToolConfig.builder().knowledgeBaseConfigs(knowledgeBaseConfigs).build();

        UpdateToolDetails updateToolDetails =
                UpdateToolDetails.builder()
                        .displayName(localRagTool.getName())
                        .description(localRagTool.getDescription())
                        .toolConfig(toolConfig)
                        .freeformTags(Constants.FREEFORM_TAGS)
                        .build();

        UpdateToolRequest updateToolRequest =
                UpdateToolRequest.builder()
                        .toolId(remoteRagTool.getId())
                        .updateToolDetails(updateToolDetails)
                        .build();

        try {
            // Call the management client to update the tool
            UpdateToolResponse updateToolResponse = agentCpClient.updateTool(updateToolRequest);

            // Check if the response status is 200 or 202
            if (updateToolRequestFailed((updateToolResponse))) {
                throw new AgentException("Failed to update tool" + updateToolResponse);
            }

            return updateToolResponse;

        } catch (Exception e) {
            throw new AgentException("Request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Checks if the HTTP response status code indicates a failed request.
     *
     * @param statusCode the HTTP status code to evaluate
     * @return {@code true} if the status code is neither 200 (OK) nor 202 (Accepted), {@code false}
     *     otherwise
     */
    private boolean requestFailed(int statusCode) {
        return statusCode != 200 && statusCode != 202;
    }

    /**
     * Determines if the ChatResponse indicates a failed request.
     *
     * @param response the ChatResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean chatRequestFailed(ChatResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    /**
     * Determines if the CreateToolResponse indicates a failed request.
     *
     * @param response the CreateToolResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean createToolRequestFailed(CreateToolResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    /**
     * Determines if the CreateSessionResponse indicates a failed request.
     *
     * @param response the CreateSessionResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean createSessionRequestFailed(CreateSessionResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    /**
     * Determines if the UpdateToolResponse indicates a failed request.
     *
     * @param response the UpdateToolResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean updateToolRequestFailed(UpdateToolResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    /**
     * Determines if the UpdateAgentResponse indicates a failed request.
     *
     * @param response the UpdateAgentResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean updateAgentRequestFailed(UpdateAgentResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    /**
     * Determines if the deleteSessionRequestFailed indicates a failed request.
     *
     * @param response the DeleteSessionResponse object to evaluate
     * @return {@code true} if the HTTP status code is neither 200 nor 202, {@code false} otherwise
     */
    private boolean deleteSessionRequestFailed(DeleteSessionResponse response) {
        return requestFailed(response.get__httpStatusCode__());
    }

    private static void setLogLevel(String logLevel) {
        if (logLevel != null) {
            System.setProperty("org.slf4j.simpleLogger.log.com.oracle.bmc.adk", logLevel);
            Console.log(Console.Color.WHITE, "Log level set to: " + logLevel);
        }
    }
}
