/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.google.gson.Gson;
import com.oracle.bmc.adk.client.AgentClient;
import com.oracle.bmc.adk.error.AgentException;
import com.oracle.bmc.adk.error.UserException;
import com.oracle.bmc.adk.run.RunResponse;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.Toolkit;
import com.oracle.bmc.adk.tools.prebuilt.AgenticRagTool;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.Constants;
import com.oracle.bmc.generativeaiagent.model.AgentEndpoint;
import com.oracle.bmc.generativeaiagent.model.Function;
import com.oracle.bmc.generativeaiagent.model.FunctionCallingToolConfig;
import com.oracle.bmc.generativeaiagent.model.KnowledgeBaseConfig;
import com.oracle.bmc.generativeaiagent.model.LlmConfig;
import com.oracle.bmc.generativeaiagent.model.RagToolConfig;
import com.oracle.bmc.generativeaiagent.model.ToolSummary;
import com.oracle.bmc.generativeaiagent.responses.CreateToolResponse;
import com.oracle.bmc.generativeaiagent.responses.GetAgentResponse;
import com.oracle.bmc.generativeaiagent.responses.GetToolResponse;
import com.oracle.bmc.generativeaiagentruntime.model.FunctionCall;
import com.oracle.bmc.generativeaiagentruntime.model.FunctionCallingPerformedAction;
import com.oracle.bmc.generativeaiagentruntime.model.FunctionCallingRequiredAction;
import com.oracle.bmc.generativeaiagentruntime.model.PerformedAction;
import com.oracle.bmc.generativeaiagentruntime.model.RequiredAction;
import com.oracle.bmc.generativeaiagentruntime.responses.ChatResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * Represents an AI agent capable of executing tasks using provided tools and instructions. The
 * Agent class manages synchronization between local and remote tools, handles function execution,
 * and controls the interaction loop with the AI.
 */
public class Agent {
    private final AgentClient client;
    private final String agentEndpointId;
    private final String instructions;
    private final String description;
    private final String name;
    private final List<Object> tools;
    private final List<FunctionTool> localFunctionTools;
    private final AgenticRagTool localRagTool;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Constructor to initialize Agent with basic parameters only. Internal fields (like handler
     * functions, rag tools, and endpoint) are not initialized.
     *
     * @param client the agent client (non-null)
     * @param agentEndpointId the agent endpoint ID (non-null)
     * @param instructions the instructions (nullable)
     * @param name the agent name (nullable)
     * @param tools list of tools (nullable)
     */
    private Agent(
            AgentClient client,
            String agentEndpointId,
            String instructions,
            String name,
            String description,
            List<Object> tools) {
        this.client = Objects.requireNonNull(client, "client must not be null");
        this.agentEndpointId =
                Objects.requireNonNull(agentEndpointId, "agentEndpointId must not be null");
        this.instructions = instructions;
        this.description = description;
        this.name = name;
        this.tools = tools != null ? tools : new ArrayList<>();

        this.localFunctionTools = processFunctionTools();
        this.localRagTool = processRagTools();
    }

    /**
     * Retrieves the {@link AgentClient} instance associated with this agent.
     *
     * @return the {@link AgentClient} instance used for interacting with the Generative AI agent
     *     services
     */
    public AgentClient getClient() {
        return client;
    }

    /**
     * Retrieves the ID of the agent endpoint associated with agent.
     *
     * @return the ID of the agent endpoint
     */
    public String getAgentEndpointId() {
        return agentEndpointId;
    }

    /**
     * Retrieves the instructions associated with this agent.
     *
     * @return the instructions for the agent, or {@code null} if no instructions are set
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Retrieves the description associated with this agent.
     *
     * @return the description for the agent, or {@code null} if no description is set
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the name associated with this {@link FunctionTool}.
     *
     * @return the name of the function tool
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the list of tools associated with this agent.
     *
     * @return a list of tools, which can be of various types (e.g., {@link FunctionTool}, {@link
     *     AgenticRagTool})
     */
    public List<Object> getTools() {
        return tools;
    }

    /**
     * Retrieves the list of local function tools associated with this agent.
     *
     * @return a list of {@link FunctionTool} objects representing the local function tools
     */
    public List<FunctionTool> getLocalFunctionTools() {
        return localFunctionTools;
    }

    /**
     * Retrieves the local Retrieval-Augmented Generation (RAG) tool associated with this agent.
     *
     * @return the {@link AgenticRagTool} object representing the local RAG tool, or {@code null} if
     *     no local RAG tool is set
     */
    public AgenticRagTool getLocalRagTool() {
        return localRagTool;
    }

    public static class AgentBuilder {
        private AgentClient client;
        private String agentEndpointId;
        private String instructions;
        private String name;
        private String description;
        private List<Object> tools;

        public AgentBuilder client(AgentClient client) {
            this.client = client;
            return this;
        }

        public AgentBuilder agentEndpointId(String agentEndpointId) {
            this.agentEndpointId = agentEndpointId;
            return this;
        }

        public AgentBuilder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        public AgentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AgentBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AgentBuilder tools(List<Object> tools) {
            this.tools = tools;
            return this;
        }

        public Agent build() {
            // You can also do null checks here if you want (recommended)
            if (client == null) {
                throw new NullPointerException("client must not be null");
            }
            if (agentEndpointId == null) {
                throw new NullPointerException("agentEndpointId must not be null");
            }

            return new Agent(client, agentEndpointId, instructions, name, description, tools);
        }
    }

    /**
     * Creates a new {@link AgentBuilder} instance to construct an {@link Agent} object.
     *
     * @return a new {@link AgentBuilder} instance
     */
    // Static builder method (like Lombok)
    public static AgentBuilder builder() {
        return new AgentBuilder();
    }

    /**
     * Initializes the agent by performing the following steps:
     *
     * <ol>
     *   <li>Checks the integrity of agent details.
     *   <li>Synchronizes instructions to the remote system.
     *   <li>Synchronizes local function tools and function remote tools.
     *   <li>Synchronizes local rag tools and remote rag tools.
     * </ol>
     */
    public void setup() {
        AgentEndpoint agentEndpoint =
                this.client.getAgentEndpointResponse(this.agentEndpointId).getAgentEndpoint();
        checkAgentIntegrity(agentEndpoint);
        syncAgentToRemote(agentEndpoint);
        syncFunctionToolsToRemote(agentEndpoint);
        syncRagToolToRemote(agentEndpoint);
    }

    /**
     * Converts this agent into a FunctionTool that other agents can use.
     *
     * @param toolName Nullable custom name for the tool. If null, fall back to the agent's name,
     *     and still null, fall back to "run_sub_agent".
     * @param toolDescription Nullable custom description. Defaults to the agent's instructions or a
     *     default string.
     * @return A FunctionTool representing this agent.
     */
    public FunctionTool asTool(String toolName, String toolDescription, Integer maxSteps) {
        String finalName =
                Optional.ofNullable(toolName)
                        .orElse(this.name != null ? this.name : "run_sub_agent");
        String finalDescription =
                Optional.ofNullable(toolDescription)
                        .orElse(this.description != null ? this.description : "");

        if (maxSteps == null) {
            maxSteps = Constants.DEFAULT_MAX_STEP;
        }

        final RunOptions runOptions = RunOptions.builder().maxSteps(maxSteps).build();

        // Create a lambda that wraps the agent's run() method.
        FunctionTool.ToolExecutor executor =
                (input, params) -> {
                    // Here you could merge parameters if needed.
                    RunResponse response = this.run(input, runOptions);
                    return response.getData();
                };

        // Return a new FunctionTool with the lambda executor.
        return new FunctionTool(finalName, finalDescription, executor);
    }

    public FunctionTool asTool() {
        return asTool(null, null, null);
    }

    /**
     * Runs the agent with the provided input and options.
     *
     * <p>This method initiates a conversation with the agent, sending the provided input and
     * handling any required actions returned in the response. It continues to exchange messages
     * with the agent until either no further actions are required or the maximum number of steps is
     * reached.
     *
     * @param input The initial input to send to the agent.
     * @param runOptions Options controlling the run behavior, such as session settings and
     *     callbacks.
     * @return A RunResponse object containing the final response from the agent and the session ID.
     */
    public RunResponse run(String input, RunOptions runOptions) {
        if (input == null) {
            throw new NullPointerException("input must not be null");
        }
        if (runOptions == null) {
            throw new NullPointerException("runOptions must not be null");
        }
        final String sessionName = runOptions.getSessionName();
        final String sessionDescription = runOptions.getSessionDescription();
        final String sessionId = runOptions.getSessionId();
        final Integer maxSteps = runOptions.getMaxSteps();
        final BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction =
                runOptions.getOnFulfilledRequiredAction();
        final BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService =
                runOptions.getOnInvokedRemoteService();
        final boolean deleteSession = runOptions.getDeleteSession();

        String chatSessionId;
        if (sessionId == null) {
            chatSessionId = client.createSession(sessionName, sessionDescription, agentEndpointId);
        } else {
            chatSessionId = sessionId;
        }

        try {
            ChatResponse response = handleChat(input, chatSessionId, null, onInvokedRemoteService);
            int stepCount = 0;
            while (hasRequiredActions(response) && stepCount < maxSteps) {
                List<PerformedAction> performedActions =
                        handleRequiredActions(response, onFulfilledRequiredAction);
                response =
                        handleChat(input, chatSessionId, performedActions, onInvokedRemoteService);
                stepCount++;
                logChatRequestAndResponse(
                        chatSessionId, input, performedActions, response, stepCount);
            }
            return new RunResponse(responseToMap(response), chatSessionId);
        } finally {
            if (deleteSession) {
                client.deleteSession(agentEndpointId, chatSessionId);
            }
        }
    }

    public RunResponse run(String input) {
        if (input == null) {
            throw new NullPointerException("input must not be null");
        }
        return run(input, RunOptions.builder().build());
    }

    /**
     * Delete a session.
     *
     * <p>Wrapper method for client.deleteSession. When to use: - When you want to explicitly delete
     * a session after the run is complete - When the number of sessions exceeds the maximum allowed
     * for the agent endpoint
     *
     * @param sessionId the session ID to delete
     */
    public void deleteSession(String sessionId) {
        if (sessionId == null) {
            throw new NullPointerException("sessionId must not be null");
        }
        client.deleteSession(agentEndpointId, sessionId);
    }

    /**
     * Converts all tools to the FunctionTool format.
     *
     * @return A list of processed FunctionTool objects.
     */
    private List<FunctionTool> processFunctionTools() {
        List<FunctionTool> availableFunctions = new ArrayList<>();

        for (Object tool : tools) {
            Console.debug(Console.Color.WHITE, "LocalToolHandler: " + tool.getClass().getName());
            if (tool instanceof FunctionTool) {
                Console.debug(
                        Console.Color.WHITE,
                        "Add " + ((FunctionTool) tool).getName() + " to localToolHandler");
                availableFunctions.add((FunctionTool) tool);
            } else if (tool instanceof Toolkit) {
                availableFunctions.addAll(((Toolkit) tool).getFunctions().values());
            }
        }
        return availableFunctions;
    }

    /**
     * Converts all tools to the AgenticRagTool format.
     *
     * @return A list of processed AgenticRagTool objects.
     */
    private AgenticRagTool processRagTools() {
        List<AgenticRagTool> availableAgenticRagTools = new ArrayList<>();

        if (tools != null) {
            for (Object tool : tools) {
                if (tool instanceof AgenticRagTool) {
                    availableAgenticRagTools.add((AgenticRagTool) tool);
                }
            }
        }

        if (availableAgenticRagTools.isEmpty()) {
            return null;
        }
        return availableAgenticRagTools.get(0);
    }

    /** Check the integrity of the agent details. */
    private void checkAgentIntegrity(AgentEndpoint agentEndpoint) {
        Console.log(Console.Color.WHITE, "Checking integrity of agent details...");
        String agentId = agentEndpoint.getAgentId();
        String agentEndpointState =
                agentEndpoint.getLifecycleState() != null
                        ? agentEndpoint.getLifecycleState().getValue()
                        : null;

        if (!"ACTIVE".equals(agentEndpointState)) {
            throw new UserException(
                    "AgentEndpoint must be in an ACTIVE state! Current state: "
                            + agentEndpointState);
        }

        GetAgentResponse agentResponse = client.getAgent(agentId);
        if (agentResponse == null || agentResponse.getAgent() == null) {
            throw new UserException("Failed to retrieve agent: Response or Agent object is null.");
        }

        String agentState =
                agentResponse.getAgent().getLifecycleState() != null
                        ? agentResponse.getAgent().getLifecycleState().getValue()
                        : null;

        if (!"ACTIVE".equals(agentState)) {
            throw new UserException(
                    "Agent must be in an ACTIVE state! Current state: " + agentState);
        }
    }

    /**
     * Synchronizes the instructions to the remote agent.
     *
     * <p>This method checks if the local agent settings (name, description, instructions) differ
     * from the remote agent settings. If differences are found, it updates the remote agent
     * settings to match the local ones.
     *
     * @param agentEndpoint the AgentEndpoint object containing the agent ID and other relevant
     *     details
     */
    private void syncAgentToRemote(AgentEndpoint agentEndpoint) {
        Console.log(
                Console.Color.WHITE,
                "Checking synchronization of local and remote agent settings...");

        if (this.name == null && this.description == null && this.instructions == null) {
            Console.log(
                    Console.Color.WHITE, "No changes to synchronize. Skipping synchronization.");
            return;
        }

        String agentId = agentEndpoint.getAgentId();
        com.oracle.bmc.generativeaiagent.model.Agent agent = client.getAgent(agentId).getAgent();

        String remoteName = agent.getDisplayName();
        String remoteDescription = agent.getDescription();

        String remoteInstructions = "";
        LlmConfig llmConfig = agent.getLlmConfig();
        if (llmConfig != null && llmConfig.getRoutingLlmCustomization() != null) {
            remoteInstructions = llmConfig.getRoutingLlmCustomization().getInstruction();
        }

        boolean instructionsDiffer =
                (this.instructions != null && !this.instructions.equals(remoteInstructions));
        boolean nameDiffer = (this.name != null && !this.name.equals(remoteName));
        boolean descriptionDiffer =
                (this.description != null && !this.description.equals(remoteDescription));

        if (instructionsDiffer || nameDiffer || descriptionDiffer) {
            Console.log(
                    Console.Color.WHITE,
                    "Agent settings are not synchronized. Updating remote agent settings.");
            client.updateAgent(agentId, this.name, this.description, this.instructions);
            waitAgentActive(agentId);
        }
    }

    /**
     * Synchronizes local and remote function tools.
     *
     * <p>Local tools are considered the source of truth. This method will:
     *
     * <ul>
     *   <li>Remove remote tools that don't exist locally
     *   <li>Add local tools that don't exist remotely
     * </ul>
     */
    private void syncFunctionToolsToRemote(AgentEndpoint agentEndpoint) {
        Console.log(
                Console.Color.WHITE,
                "Checking synchronization of local and remote function tools...");
        String compartmentId = agentEndpoint.getCompartmentId();
        String agentId = agentEndpoint.getAgentId();
        List<ToolSummary> remoteFunctionTools =
                client.listActiveTools(compartmentId, agentId).getToolCollection().getItems();

        // Filter for active RAG tools
        List<ToolSummary> activeRemoteFunctionTools = new ArrayList<>();
        for (ToolSummary tool : remoteFunctionTools) {
            if (tool.getToolConfig() instanceof FunctionCallingToolConfig) {
                activeRemoteFunctionTools.add(tool);
            }
        }

        List<Map<String, Object>> localToolSpecs = new ArrayList<>();
        Map<FunctionTool, Map<String, Object>> localToolToSpecMap = new HashMap<>();

        for (FunctionTool localTool : localFunctionTools) {
            Map<String, Object> localToolSpec = new HashMap<>();
            localToolSpec.put("name", localTool.getName());
            localToolSpec.put("description", localTool.getDescription());
            localToolSpec.put("parameters", localTool.getParameters());
            localToolSpecs.add(localToolSpec);
            localToolToSpecMap.put(localTool, localToolSpec);
        }

        List<Map<String, Object>> remoteToolSpecs = new ArrayList<>();
        Map<ToolSummary, Map<String, Object>> remoteToolToSpecMap = new HashMap<>();
        for (ToolSummary remoteFunctionTool : activeRemoteFunctionTools) {
            Map<String, Object> remoteToolSpec = new HashMap<>();
            remoteToolSpec.put("name", remoteFunctionTool.getDisplayName());
            remoteToolSpec.put("description", remoteFunctionTool.getDescription());
            remoteToolSpec.put(
                    "parameters",
                    ((FunctionCallingToolConfig) remoteFunctionTool.getToolConfig())
                            .getFunction()
                            .getParameters());
            remoteToolSpecs.add(remoteToolSpec);
            remoteToolToSpecMap.put(remoteFunctionTool, remoteToolSpec);
        }

        // Delete remote tools that aren't in local tools
        for (ToolSummary remoteFunctionTool : activeRemoteFunctionTools) {
            Map<String, Object> remoteFunctionToolSpec =
                    remoteToolToSpecMap.get(remoteFunctionTool);
            if (!localToolSpecs.contains(remoteFunctionToolSpec)) {
                Console.log(
                        Console.Color.WHITE,
                        "Deleting remote tool: " + remoteFunctionToolSpec.get("name"));
                String toolToBeDeleted = remoteFunctionTool.getId();
                client.deleteTools(toolToBeDeleted);
                waitToolDeleted(toolToBeDeleted);
            }
        }

        // Add local tools to remote that don't exist
        for (FunctionTool localFunctionTool : localFunctionTools) {
            Map<String, Object> localFunctionToolSpec = localToolToSpecMap.get(localFunctionTool);
            if (!remoteToolSpecs.contains(localFunctionToolSpec)) {
                Console.log(
                        Console.Color.WHITE,
                        "Adding local tool to remote: " + localFunctionToolSpec.get("name"));
                CreateToolResponse newTool =
                        client.addFunctionCallingTools(localFunctionTool, compartmentId, agentId);
                String newToolId = newTool.getTool().getId();
                if (newToolId != null) {
                    waitToolActive(newToolId);
                }
            }
        }
    }

    /**
     * Synchronizes local and remote Agentic RAG tools. Only adds RAG tools that do not already
     * exist in the remote.
     */
    private void syncRagToolToRemote(AgentEndpoint agentEndpoint) {
        Console.log(
                Console.Color.WHITE, "Checking synchronization of local and remote RAG tools...");

        // Get all active tools
        List<ToolSummary> remoteTools =
                client.listActiveTools(agentEndpoint.getCompartmentId(), agentEndpoint.getAgentId())
                        .getToolCollection()
                        .getItems();

        // Filter for active RAG tools created by ADK
        List<ToolSummary> activeRemoteRagToolsCreatedByAdk = new ArrayList<>();
        for (ToolSummary tool : remoteTools) {
            Map<String, String> freeFormTags = new HashMap<>();
            if (freeFormTags != null) {
                Boolean isCreatedByAdk =
                        freeFormTags.keySet().contains(Constants.FREEFORM_TAGS.keySet());
                if ((tool.getToolConfig() instanceof RagToolConfig) && isCreatedByAdk) {
                    activeRemoteRagToolsCreatedByAdk.add(tool);
                }
            }
        }

        // If no remote RAG tool created by ADK exists, and local RAG tool is not defined, do
        // nothing
        if (activeRemoteRagToolsCreatedByAdk.isEmpty() && localRagTool == null) {
            Console.log(
                    Console.Color.WHITE,
                    "No active remote RAG tools found. No local RAG tools to add.");
            return;
        }

        // If no remote RAG tool created by ADK exists, but local one is defined, add it
        if (activeRemoteRagToolsCreatedByAdk.isEmpty() && localRagTool != null) {
            Console.log(
                    Console.Color.WHITE,
                    "No active remote RAG tools found. A local RAG tool is defined. "
                            + "Adding local RAG tool to remote agent...");

            String newToolId =
                    client.addRagTool(
                                    localRagTool,
                                    agentEndpoint.getCompartmentId(),
                                    agentEndpoint.getAgentId())
                            .getTool()
                            .getId();

            waitToolActive(newToolId);
            return;
        }

        ToolSummary remoteRagToolCreatedByAdk = activeRemoteRagToolsCreatedByAdk.get(0);

        // If local RAG tool is not defined, delete the remote RAG tool
        if (localRagTool == null) {
            Console.log(
                    Console.Color.WHITE,
                    "Local RAG tool is not defined. Deleting the remote RAG tool...");
            String toolIdToBeDeleted = remoteRagToolCreatedByAdk.getId();
            client.deleteTools(toolIdToBeDeleted);
            waitToolDeleted(toolIdToBeDeleted);
            return;
        }

        // Now we have exactly one remote RAG tool and one local RAG tool
        // Check if the remote RAG tool is using the same KB IDs as local
        RagToolConfig remoteRagToolConfig =
                (RagToolConfig) remoteRagToolCreatedByAdk.getToolConfig();
        List<KnowledgeBaseConfig> remoteKbConfig = remoteRagToolConfig.getKnowledgeBaseConfigs();
        List<String> remoteKbIds =
                remoteKbConfig.stream()
                        .map(kbConfig -> kbConfig.getKnowledgeBaseId())
                        .collect(Collectors.toList());
        List<String> localKbIds = localRagTool.getKnowledgeBaseIds();

        Collections.sort(localKbIds);
        Collections.sort(remoteKbIds);
        if ((!remoteKbIds.equals(localKbIds))
                || !localRagTool.getName().equals(remoteRagToolCreatedByAdk.getDisplayName())
                || !localRagTool
                        .getDescription()
                        .equals(remoteRagToolCreatedByAdk.getDescription())) {
            Console.log(
                    Console.Color.WHITE,
                    "Remote RAG tool is not using the same knowledge base IDs as local. "
                            + "Updating remote RAG tool with the updated knowledge base IDs...");

            client.updateRagTool(remoteRagToolCreatedByAdk, localRagTool);
            waitToolActive(remoteRagToolCreatedByAdk.getId());
        } else {
            Console.debug(
                    Console.Color.WHITE,
                    "Remote RAG tool is already using the same KB IDs as local. No need to update.");
        }
    }

    /** Waits for the tool to become active. */
    public void waitToolActive(String toolId) {
        long startTime = System.currentTimeMillis();
        long timeout = Constants.DEFAULT_TIMEOUT_IN_MILLIS; // 100 seconds in milliseconds

        // Define terminal states where we should stop waiting
        Set<String> terminalStates = new HashSet<>(Arrays.asList("FAILED", "DELETED", "DELETING"));
        try {
            while (true) {
                // Check if we've exceeded the timeout
                if (System.currentTimeMillis() - startTime > timeout) {
                    throw new AgentException(
                            "Timeout exceeded while waiting for tool activation (20 seconds).");
                }

                // Get the tool lifecycle state
                GetToolResponse toolResponse = client.getTool(toolId);
                if (toolResponse == null
                        || toolResponse.getTool() == null
                        || toolResponse.getTool().getLifecycleState() == null) {
                    throw new AgentException(
                            "Failed to retrieve tool lifecycle state for toolId: " + toolId);
                }

                String toolState = toolResponse.getTool().getLifecycleState().getValue();

                // Stop waiting if tool is in a terminal state
                if (terminalStates.contains(toolState)) {
                    throw new AgentException("Tool is in an unrecoverable state: " + toolState);
                }

                // If tool is active, exit loop
                if ("ACTIVE".equals(toolState)) {
                    return;
                }

                Console.log(Console.Color.WHITE, "Waiting for tool to be active...");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new UserException("Thread was interrupted while waiting for tool activation.", e);
        } catch (Exception e) {
            throw new AgentException("Unexpected error while waiting for tool activation.", e);
        }
    }

    /** Waits for the tool to be deleted. */
    public void waitToolDeleted(String toolId) {
        long startTime = System.currentTimeMillis();
        long timeout = Constants.DEFAULT_TIMEOUT_IN_MILLIS; // 100 seconds in milliseconds

        // Define terminal states where we should stop waiting
        Set<String> terminalStates = new HashSet<>(Arrays.asList("FAILED"));
        try {
            while (true) {
                // Check if we've exceeded the timeout
                if (System.currentTimeMillis() - startTime > timeout) {
                    throw new AgentException(
                            "Timeout exceeded while waiting for tool activation (20 seconds).");
                }

                // Get the tool lifecycle state
                GetToolResponse toolResponse = client.getTool(toolId);
                if (toolResponse == null
                        || toolResponse.getTool() == null
                        || toolResponse.getTool().getLifecycleState() == null) {
                    throw new AgentException(
                            "Failed to retrieve tool lifecycle state for toolId: " + toolId);
                }

                String toolState = toolResponse.getTool().getLifecycleState().getValue();

                // Stop waiting if tool is in a terminal state
                if (terminalStates.contains(toolState)) {
                    throw new AgentException("Tool is in an unrecoverable state: " + toolState);
                }

                // If tool is deleted, exit loop
                if ("DELETED".equals(toolState)) {
                    return;
                }

                Console.log(Console.Color.WHITE, "Waiting for tool to be deleted...");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new UserException(
                    "Thread was interrupted while waiting for tool to be deleted.", e);
        } catch (Exception e) {
            throw new AgentException("Unexpected error while waiting for tool to be deleted.", e);
        }
    }

    /** Waits for the agent to become active. */
    private void waitAgentActive(String agentId) {
        long startTime = System.currentTimeMillis();
        long timeout = Constants.DEFAULT_TIMEOUT_IN_MILLIS; // 100 seconds in milliseconds
        // Define terminal states where we should stop waiting
        Set<String> terminalStates = new HashSet<>(Arrays.asList("FAILED", "DELETED", "DELETING"));

        try {
            while (true) {
                // Check if we've exceeded the timeout
                if (System.currentTimeMillis() - startTime > timeout) {
                    throw new AgentException(
                            "Timeout exceeded while waiting for agent activation (20 seconds).");
                }

                GetAgentResponse agentResponse = client.getAgent(agentId);
                if (agentResponse == null
                        || agentResponse.getAgent() == null
                        || agentResponse.getAgent().getLifecycleState() == null) {
                    throw new AgentException(
                            "Failed to retrieve agent lifecycle state for agentId: " + agentId);
                }

                String agentState = agentResponse.getAgent().getLifecycleState().getValue();

                // Stop waiting if agent is in a terminal state
                if (terminalStates.contains(agentState)) {
                    throw new AgentException("Agent is in an unrecoverable state: " + agentState);
                }

                if ("ACTIVE".equals(agentState)) {
                    return; // Agent is active, exit loop
                }

                Console.log(Console.Color.WHITE, "Waiting for agent to be active...");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AgentException("Thread interrupted while waiting for agent activation", e);
        } catch (Exception e) {
            throw new AgentException("Unexpected error while waiting for agent activation", e);
        }
    }

    /**
     * Handles a chat request.
     *
     * @param userMessage The user message to display.
     * @param sessionId The session ID.
     * @param performedActions The performed actions.
     * @param onInvokedRemoteService Optional callback function to handle invoked remote services.
     * @return The response from the agent.
     */
    private ChatResponse handleChat(
            String userMessage,
            String sessionId,
            List<PerformedAction> performedActions,
            BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService) {
        ChatResponse response =
                client.chat(sessionId, userMessage, agentEndpointId, performedActions);

        if (onInvokedRemoteService != null) {
            Map<String, Object> requestPayload = new HashMap<>();
            requestPayload.put("user_message", userMessage);
            requestPayload.put("performed_actions", performedActions);
            onInvokedRemoteService.accept(requestPayload, response);
        }
        return response;
    }

    /** Print Chat request and response */
    private void logChatRequestAndResponse(
            String sessionId,
            String userMessage,
            List<PerformedAction> performedActions,
            ChatResponse response,
            int stepCount) {
        Console.log(Console.Color.BLUE, "--------- Chat request to remote agent ---------");
        Console.log(Console.Color.WHITE, "Round " + stepCount);
        Console.log(Console.Color.WHITE, "(Local --> Remote)\n");
        Console.log(Console.Color.WHITE, "User message:");
        Console.log(Console.Color.GREEN, userMessage + "\n");
        Console.log(Console.Color.WHITE, "Performed actions by client:");
        if (performedActions == null) {
            Console.log(Console.Color.PURPLE, "Null");
        } else {
            performedActions.forEach(
                    performedAction ->
                            Console.log(Console.Color.PURPLE, new Gson().toJson(performedAction)));
        }
        Console.log(Console.Color.WHITE, "\n");
        Console.log(Console.Color.WHITE, "Session id:");
        Console.log(Console.Color.CYAN, sessionId);
        Console.log(Console.Color.BLUE, "------------------------------------------------");

        Console.log(Console.Color.BLUE, "--------- Chat response from remote agent ---------");
        Console.log(Console.Color.WHITE, "(Local <-- Remote)\n");
        Console.log(Console.Color.WHITE, "Response message:");
        Console.log(
                Console.Color.GREEN,
                new Gson().toJson(response.getChatResult().getMessage()) + "\n");
        Console.log(Console.Color.WHITE, "Required actions for client to take:");
        if (response.getChatResult().getRequiredActions() == null) {
            Console.log(Console.Color.PURPLE, "Null");
        } else {
            response.getChatResult()
                    .getRequiredActions()
                    .forEach(
                            action -> Console.log(Console.Color.PURPLE, new Gson().toJson(action)));
        }
        Console.log(Console.Color.BLUE, "---------------------------------------------------");
    }

    /**
     * Checks if the response contains required actions.
     *
     * @return {@code true} if the response contains required actions, {@code false} otherwise.
     */
    private boolean hasRequiredActions(ChatResponse response) {
        return response.getChatResult().getRequiredActions() != null
                && !response.getChatResult().getRequiredActions().isEmpty();
    }

    /**
     * Processes and executes required actions from the response.
     *
     * @param response The response containing required actions.
     * @param onFulfilledRequiredAction An optional callback function that will be called with
     *     performed actions.
     * @return A list of performed actions.
     */
    private List<PerformedAction> handleRequiredActions(
            ChatResponse response,
            BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction) {
        List<PerformedAction> performedActions = new ArrayList<>();
        List<RequiredAction> requiredActions = response.getChatResult().getRequiredActions();

        if (requiredActions != null && !requiredActions.isEmpty()) {
            for (RequiredAction action : requiredActions) {
                if (action instanceof FunctionCallingRequiredAction) {
                    PerformedAction performedAction =
                            executeFunctionCall((FunctionCallingRequiredAction) action);
                    Console.log(
                            Console.Color.WHITE,
                            "PerformedActions in this round: " + performedAction);
                    if (performedAction != null) {
                        performedActions.add(performedAction);
                    }
                    if (onFulfilledRequiredAction != null
                            && action != null
                            && performedAction != null) {
                        onFulfilledRequiredAction.accept(action, performedAction);
                    }
                }
            }
        }
        return performedActions;
    }

    /**
     * Executes a single function call action.
     *
     * @param action The required action of Function Calling.
     * @return A {@code Map} containing the performed action details, or {@code null} if execution
     *     failed.
     */
    private FunctionCallingPerformedAction executeFunctionCall(
            FunctionCallingRequiredAction action) {
        try {
            // Extract function call details
            FunctionCall functionCall = action.getFunctionCall();
            String functionName = functionCall.getName();
            String functionArgsObj = functionCall.getArguments();

            Map<String, Object> functionArgs =
                    objectMapper.readValue((String) functionArgsObj, Map.class);

            // Find the appropriate function handler
            FunctionTool handler = null;
            for (FunctionTool f : localFunctionTools) {
                if (f.getName().equals(functionName)) {
                    handler = f;
                    break;
                }
            }

            // If no handler is found, log an error and return null
            if (handler == null) {
                Console.log(
                        Console.Color.RED,
                        String.format(
                                "No local handler found for function: %s, arguments: %s",
                                functionName, functionArgs));
                return null;
            }
            // Execute the function
            logFunctionExecutionStart(functionName, functionArgs, handler);
            Object result = handler.execute(functionArgs);
            // Log the result
            logFunctionExecutionResult(result);

            // Return the performed action details
            return FunctionCallingPerformedAction.builder()
                    .actionId(action.getActionId())
                    .functionCallOutput(objectMapper.writeValueAsString(result))
                    .build();

        } catch (JsonProcessingException e) {
            throw new AgentException("Error parsing JSON function arguments", e);
        } catch (Exception e) {
            throw new AgentException("Unexpected error during executeFunctionCall", e);
        }
    }

    /**
     * Compares the local function tool specification with the remote tool summary to determine if
     * they differ. The comparison is based on the name, description, and parameters of the tool.
     *
     * @param localTool the local {@link FunctionTool} instance that holds the specification.
     * @param remoteTool the remote {@link ToolSummary} instance representing the tool details
     *     received from the remote source.
     * @return {@code true} if there are differences between the local tool specification and the
     *     remote tool specification, otherwise {@code false}.
     */
    private boolean diffLocalAndRemoteTool(FunctionTool localTool, ToolSummary remoteTool) {
        Map<String, Object> localToolFunctionJsonSpec = new HashMap<>();
        localToolFunctionJsonSpec.put("name", localTool.getName());
        localToolFunctionJsonSpec.put("description", localTool.getDescription());
        localToolFunctionJsonSpec.put("parameters", localTool.getParameters());

        Map<String, Object> remoteToolFunctionJsonSpec = new HashMap<>();
        if (remoteTool.getToolConfig() instanceof FunctionCallingToolConfig) {
            Function function =
                    ((FunctionCallingToolConfig) remoteTool.getToolConfig()).getFunction();
            remoteToolFunctionJsonSpec.put("name", function.getName());
            remoteToolFunctionJsonSpec.put("description", function.getDescription());
            remoteToolFunctionJsonSpec.put("parameters", function.getParameters());
        }
        return !localToolFunctionJsonSpec.equals(remoteToolFunctionJsonSpec);
    }

    /**
     * Logs the start of a function execution.
     *
     * @param functionName The name of the function tool being executed.
     * @param functionArgs The arguments passed to the function.
     * @param handler The name of the callable function.
     */
    private void logFunctionExecutionStart(
            String functionName, Map<String, Object> functionArgs, FunctionTool handler) {
        Console.log(
                Console.Color.YELLOW,
                "---- Function call requested by agent and mapped local handler function ----");
        Console.log(Console.Color.WHITE, "Agent function tool name:");
        Console.log(Console.Color.CYAN, functionName + "\n");
        Console.log(Console.Color.WHITE, "Agent function tool call arguments:");
        Console.log(Console.Color.GREEN, functionArgs + "\n");
        Console.log(Console.Color.WHITE, "Mapped local handler function name:");
        Console.log(Console.Color.CYAN, handler.getName());
        Console.log(
                Console.Color.YELLOW,
                "----------------------------------------------------------------------------");
    }

    /**
     * Logs the result of a function execution.
     *
     * @param result The result returned by the function.
     */
    private void logFunctionExecutionResult(Object result) {
        Console.log(Console.Color.YELLOW, "---- Obtained local function execution result ----");
        Console.log(Console.Color.GREEN, new Gson().toJson(result));
        Console.log(Console.Color.YELLOW, "--------------------------------------------------");
    }

    /**
     * Convert the chat response to the format of Map.
     *
     * @param response The result of chat response.
     * @return The chat response to the format of Map.
     */
    private Map<String, Object> responseToMap(ChatResponse response) {
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("explicitlySetFilter", SimpleBeanPropertyFilter.serializeAll());

        objectMapper.setFilterProvider(filterProvider);
        return objectMapper.convertValue(response, Map.class);
    }
}
