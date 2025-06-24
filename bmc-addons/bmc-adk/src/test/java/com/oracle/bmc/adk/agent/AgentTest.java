/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.adk.client.AgentClient;
import com.oracle.bmc.adk.run.RunResponse;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.prebuilt.AgenticRagTool;
import com.oracle.bmc.generativeaiagent.model.*;
import com.oracle.bmc.generativeaiagent.responses.*;
import com.oracle.bmc.generativeaiagentruntime.model.*;
import com.oracle.bmc.generativeaiagentruntime.responses.ChatResponse;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class AgentTest {

    private AgentClient mockClient;
    private FunctionTool functionTool;
    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() throws Exception {
        // Initialize the mock client
        mockClient = Mockito.mock(AgentClient.class);

        // Configure default responses for common methods
        when(mockClient.getAgentEndpointResponse(any()))
                .thenReturn(
                        GetAgentEndpointResponse.builder()
                                .agentEndpoint(
                                        AgentEndpoint.builder()
                                                .id("test_endpoint_id")
                                                .agentId("test_agent_id")
                                                .compartmentId("test_compartment_id")
                                                .lifecycleState(
                                                        AgentEndpoint.LifecycleState.valueOf(
                                                                "Active"))
                                                .shouldEnableSession(true)
                                                .build())
                                .build());

        when(mockClient.getAgent(any()))
                .thenReturn(
                        (GetAgentResponse.builder()
                                .agent(
                                        com.oracle.bmc.generativeaiagent.model.Agent.builder()
                                                .id("test_agent_id")
                                                .lifecycleState(
                                                        com.oracle.bmc.generativeaiagent.model.Agent
                                                                .LifecycleState.Active)
                                                .llmConfig(
                                                        LlmConfig.builder()
                                                                .routingLlmCustomization(
                                                                        LlmCustomization.builder()
                                                                                .instruction(
                                                                                        "Test instructions")
                                                                                .build())
                                                                .build())
                                                .build())
                                .build()));

        // Create a test function tool
        // Create the inner "x" and "y" type maps
        Map<String, String> xMap = new HashMap<>();
        xMap.put("type", "double");

        Map<String, String> yMap = new HashMap<>();
        yMap.put("type", "double");

        // Combine them into the "properties" map
        Map<String, Object> propertiesMap = new HashMap<>();
        propertiesMap.put("x", xMap);
        propertiesMap.put("y", yMap);

        // Serialize "properties" and "required" as strings
        String propertiesJson = objectMapper.writeValueAsString(propertiesMap);
        String requiredJson = objectMapper.writeValueAsString(Arrays.asList("x", "y"));

        // Create the top-level parameters map (String, String)
        Map<String, String> parameters = new HashMap<>();
        parameters.put("type", "object");
        parameters.put("properties", propertiesJson);
        parameters.put("required", requiredJson);

        // Build the FunctionTool
        functionTool =
                FunctionTool.builder()
                        .name("test_function")
                        .description("test_function")
                        .parameters(parameters)
                        .method(
                                TestFunctionCall.class.getDeclaredMethod(
                                        "add", double.class, double.class))
                        .instance(null)
                        .build();
    }

    @Test
    void testAgentInitialization() {
        // Initialize the agent with the mock client and the function tool
        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(new ArrayList<>(Arrays.asList(functionTool)))
                        .name("name")
                        .build();

        assertEquals(mockClient, agent.getClient());
        assertEquals("Test instructions", agent.getInstructions());
        assertEquals(1, agent.getTools().size());
        assertEquals(1, agent.getLocalFunctionTools().size());
        assertEquals("test_function", agent.getLocalFunctionTools().get(0).getName());
    }

    @Test
    void testSyncFunctionToolsToRemote() throws Exception {
        ToolSummary remoteTool1 =
                ToolSummary.builder()
                        .id("1")
                        .lifecycleState(Tool.LifecycleState.Active)
                        .toolConfig(
                                FunctionCallingToolConfig.builder()
                                        .function(Function.builder().name("remote_tool").build())
                                        .build())
                        .build();

        ToolSummary remoteTool2 =
                ToolSummary.builder()
                        .id("2")
                        .displayName("local_tool")
                        .lifecycleState(Tool.LifecycleState.Active)
                        .toolConfig(
                                FunctionCallingToolConfig.builder()
                                        .function(
                                                Function.builder()
                                                        .name("local_tool")
                                                        .description("Old description")
                                                        .parameters(new HashMap<>())
                                                        .build())
                                        .build())
                        .build();

        // Mock remote tools
        List<ToolSummary> remoteTools = new ArrayList<>(Arrays.asList(remoteTool1, remoteTool2));

        when(mockClient.listActiveTools(any(), any()))
                .thenReturn(
                        ListToolsResponse.builder()
                                .toolCollection(ToolCollection.builder().items(remoteTools).build())
                                .build());
        when(mockClient.addFunctionCallingTools(any(), any(), any()))
                .thenReturn(
                        CreateToolResponse.builder()
                                .tool(
                                        Tool.builder()
                                                .id("3")
                                                .lifecycleState(Tool.LifecycleState.Active)
                                                .build())
                                .build());
        when(mockClient.getTool(any()))
                .thenReturn(
                        GetToolResponse.builder()
                                .tool(
                                        Tool.builder()
                                                .id("3")
                                                .lifecycleState(Tool.LifecycleState.Active)
                                                .toolConfig(
                                                        FunctionCallingToolConfig.builder()
                                                                .function(
                                                                        Function.builder()
                                                                                .name("local_tool")
                                                                                .build())
                                                                .build())
                                                .build())
                                .build());

        when(mockClient.deleteTools(anyString()))
                .thenReturn(DeleteToolResponse.builder().__httpStatusCode__(200).build());

        // Initialize local tools
        FunctionTool localTool =
                FunctionTool.builder()
                        .name("local_tool")
                        .description("New description")
                        .method(null)
                        .parameters(new HashMap<>())
                        .build();

        FunctionTool newLocalTool =
                FunctionTool.builder()
                        .name("new_local_tool")
                        .description("A new local tool")
                        .method(null)
                        .parameters(new HashMap<>())
                        .build();

        Agent agent =
                spy(
                        Agent.builder()
                                .client(mockClient)
                                .agentEndpointId("test_endpoint_id")
                                .instructions("Test instructions")
                                .tools(Arrays.asList(localTool, newLocalTool))
                                .build());

        AgentEndpoint agentEndpoint =
                AgentEndpoint.builder()
                        .agentId("test_agent_id")
                        .id("test_endpoint_id")
                        .compartmentId("test_compartment_id")
                        .build();

        doNothing().when(agent).waitToolDeleted(anyString());

        // Call setup to trigger tool synchronization
        agent.setup();

        // Verify remote tool that doesn't exist locally was deleted
        verify(mockClient, times(1)).deleteTools("1");
        verify(mockClient, times(2)).addFunctionCallingTools(any(), any(), any());
        ArgumentCaptor<FunctionTool> argumentCaptor = ArgumentCaptor.forClass(FunctionTool.class);
        verify(mockClient, atLeastOnce())
                .addFunctionCallingTools(argumentCaptor.capture(), any(), any());
        FunctionTool capturedArgument = argumentCaptor.getValue();
        assertEquals("new_local_tool", capturedArgument.getName());
    }

    @Test
    void testDeleteSessionSuccess() {
        // Arrange
        String sessionId = UUID.randomUUID().toString();
        doNothing().when(mockClient).deleteSession(anyString(), anyString());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();

        // Act and Assert
        assertDoesNotThrow(() -> agent.deleteSession(sessionId));
        verify(mockClient).deleteSession(agent.getAgentEndpointId(), sessionId);
    }

    @Test
    void testDeleteSessionFailure() {
        // Arrange
        String sessionId = UUID.randomUUID().toString();
        doThrow(new RuntimeException("Mocked exception"))
                .when(mockClient)
                .deleteSession(anyString(), anyString());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();
        // Act and Assert
        assertThrows(RuntimeException.class, () -> agent.deleteSession(sessionId));
        verify(mockClient).deleteSession(agent.getAgentEndpointId(), sessionId);
    }

    @Test
    void testSyncRagToolToRemoteNoLocalNoRemote() throws Exception {
        when(mockClient.listActiveTools(any(), any()))
                .thenReturn(
                        ListToolsResponse.builder()
                                .toolCollection(
                                        ToolCollection.builder().items(new ArrayList<>()).build())
                                .build());
        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Collections.emptyList())
                        .build();

        AgentEndpoint agentEndpoint =
                AgentEndpoint.builder()
                        .agentId("test_agent")
                        .id("test_endpoint_id")
                        .compartmentId("test_compartment")
                        .build();

        agent.setup();

        verify(mockClient, never()).addRagTool(any(), anyString(), anyString());
        verify(mockClient, never()).updateRagTool(any(), any());
    }

    @Test
    void testSyncRagToolToRemoteNoRemote() throws Exception {
        when(mockClient.listActiveTools(any(), any()))
                .thenReturn(
                        ListToolsResponse.builder()
                                .toolCollection(
                                        ToolCollection.builder().items(new ArrayList<>()).build())
                                .build());

        when(mockClient.addRagTool(any(), anyString(), anyString()))
                .thenReturn(
                        CreateToolResponse.builder()
                                .tool(
                                        Tool.builder()
                                                .id("new_tool_id")
                                                .lifecycleState(Tool.LifecycleState.Active)
                                                .build())
                                .build());

        when(mockClient.getTool(any()))
                .thenReturn(
                        GetToolResponse.builder()
                                .tool(
                                        Tool.builder()
                                                .lifecycleState(Tool.LifecycleState.Active)
                                                .build())
                                .build());

        AgenticRagTool localRagTool =
                AgenticRagTool.builder().knowledgeBaseIds(Arrays.asList("kb1", "kb2")).build();

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(localRagTool))
                        .build();

        agent.setup();

        ArgumentCaptor<AgenticRagTool> ragToolCaptor =
                ArgumentCaptor.forClass(AgenticRagTool.class);
        verify(mockClient)
                .addRagTool(
                        ragToolCaptor.capture(), eq("test_compartment_id"), eq("test_agent_id"));
        assertEquals(localRagTool, ragToolCaptor.getValue());
    }

    @Test
    void testSyncRagToolToRemoteWithDifferentKnowledgeBaseIds() throws Exception {
        KnowledgeBaseConfig knowledgeBaseConfig1 =
                KnowledgeBaseConfig.builder().knowledgeBaseId("kb3").build();
        KnowledgeBaseConfig knowledgeBaseConfig2 =
                KnowledgeBaseConfig.builder().knowledgeBaseId("kb4").build();
        ToolSummary toolSummary =
                ToolSummary.builder()
                        .id("existing_tool_id")
                        .lifecycleState(Tool.LifecycleState.Active)
                        .toolConfig(
                                RagToolConfig.builder()
                                        .knowledgeBaseConfigs(
                                                new ArrayList<>(
                                                        Arrays.asList(
                                                                knowledgeBaseConfig1,
                                                                knowledgeBaseConfig2)))
                                        .build())
                        .build();

        ListToolsResponse listToolsResponse =
                ListToolsResponse.builder()
                        .toolCollection(
                                ToolCollection.builder()
                                        .items(new ArrayList<>(Arrays.asList(toolSummary)))
                                        .build())
                        .build();

        Tool existingTool =
                Tool.builder()
                        .id("existing_tool_id")
                        .lifecycleState(Tool.LifecycleState.Active)
                        .toolConfig(
                                RagToolConfig.builder()
                                        .knowledgeBaseConfigs(
                                                new ArrayList<>(
                                                        Arrays.asList(
                                                                knowledgeBaseConfig1,
                                                                knowledgeBaseConfig2)))
                                        .build())
                        .build();
        when(mockClient.listActiveTools(any(), any())).thenReturn(listToolsResponse);
        when(mockClient.getTool("existing_tool_id"))
                .thenReturn(GetToolResponse.builder().tool(existingTool).build());
        when(mockClient.addRagTool(any(), anyString(), anyString()))
                .thenReturn(
                        CreateToolResponse.builder()
                                .tool(
                                        Tool.builder()
                                                .id("existing_tool_id")
                                                .lifecycleState(Tool.LifecycleState.Active)
                                                .build())
                                .build());

        AgenticRagTool localRagTool =
                AgenticRagTool.builder().knowledgeBaseIds(Arrays.asList("kb1", "kb2")).build();

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(localRagTool))
                        .build();

        agent.setup();

        verify(mockClient, times(1)).addRagTool(any(), any(), any());
    }

    @Test
    void testRunWithNoActions() throws Exception {
        when(mockClient.createSession(any(), any(), any())).thenReturn("session_123");
        when(mockClient.chat(anyString(), anyString(), anyString(), any()))
                .thenReturn(
                        ChatResponse.builder()
                                .chatResult(
                                        ChatResult.builder()
                                                .message(
                                                        Message.builder()
                                                                .content(
                                                                        MessageContent.builder()
                                                                                .text("Done")
                                                                                .build())
                                                                .build())
                                                .build())
                                .build());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();

        // Execute the run method
        RunOptions runOptions = RunOptions.builder().maxSteps(3).build();
        RunResponse response = agent.run("hello", runOptions);

        // Assert the response type and content
        assertNotNull(response);
        Map<String, Object> chatResult = (Map<String, Object>) response.getData().get("chatResult");
        Map<String, Object> message = (Map<String, Object>) chatResult.get("message");
        Map<String, Object> content = (Map<String, Object>) message.get("content");
        assertEquals("Done", content.get("text"));

        // Verify createSession was called once with specific arguments
        verify(mockClient, times(1))
                .createSession(eq("Session"), eq("Session created by ADK"), eq("test_endpoint_id"));

        // Capture the arguments passed to chat method
        ArgumentCaptor<String> sessionIdCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> agentEndpointIdCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> userMessageCaptor = ArgumentCaptor.forClass(String.class);

        verify(mockClient, times(1))
                .chat(
                        sessionIdCaptor.capture(),
                        userMessageCaptor.capture(),
                        agentEndpointIdCaptor.capture(),
                        eq(null));

        // Assert the captured arguments
        assertEquals("session_123", sessionIdCaptor.getValue());
        assertEquals("test_endpoint_id", agentEndpointIdCaptor.getValue());
        assertEquals("hello", userMessageCaptor.getValue());
    }

    @Test
    void testRunWithFunctionActions() throws Exception {
        when(mockClient.createSession(any(), any(), any())).thenReturn("session_123");
        when(mockClient.chat(anyString(), anyString(), anyString(), any()))
                .thenReturn(
                        ChatResponse.builder()
                                .chatResult(
                                        ChatResult.builder()
                                                .requiredActions(
                                                        Arrays.asList(
                                                                FunctionCallingRequiredAction
                                                                        .builder()
                                                                        .actionId("action1")
                                                                        .functionCall(
                                                                                FunctionCall
                                                                                        .builder()
                                                                                        .name(
                                                                                                "test_function")
                                                                                        .arguments(
                                                                                                objectMapper
                                                                                                        .writeValueAsString(
                                                                                                                new HashMap<
                                                                                                                        String,
                                                                                                                        Object>() {
                                                                                                                    {
                                                                                                                        put(
                                                                                                                                "x",
                                                                                                                                2);
                                                                                                                        put(
                                                                                                                                "y",
                                                                                                                                3);
                                                                                                                    }
                                                                                                                }))
                                                                                        .build())
                                                                        .build()))
                                                .message(
                                                        Message.builder()
                                                                .content(
                                                                        MessageContent.builder()
                                                                                .text("Done")
                                                                                .build())
                                                                .build())
                                                .build())
                                .build());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();

        // Execute the run method
        RunOptions runOptions = RunOptions.builder().maxSteps(3).build();
        RunResponse response = agent.run("Run test function", runOptions);

        // Assertions
        assertNotNull(response);
        Map<String, Object> chatResult = (Map<String, Object>) response.getData().get("chatResult");
        Map<String, Object> message = (Map<String, Object>) chatResult.get("message");
        Map<String, Object> content = (Map<String, Object>) message.get("content");
        assertEquals("Done", content.get("text"));

        verify(mockClient, times(4)).chat(anyString(), anyString(), anyString(), any());

        // Verify session creation
        verify(mockClient).createSession("Session", "Session created by ADK", "test_endpoint_id");

        // Verify performed actions
        ArgumentCaptor<List<PerformedAction>> captor =
                (ArgumentCaptor<List<PerformedAction>>)
                        (ArgumentCaptor<?>) ArgumentCaptor.forClass(List.class);
        verify(mockClient, times(4)).chat(anyString(), anyString(), anyString(), captor.capture());
        List<PerformedAction> performedActions = captor.getAllValues().get(1);
        FunctionCallingPerformedAction performedAction =
                (FunctionCallingPerformedAction) performedActions.get(0);

        assertEquals(1, performedActions.size());
        assertEquals("action1", performedAction.getActionId());
        assertTrue(performedAction.getFunctionCallOutput().toString().contains("5"));
    }

    @Test
    void testWaitToolActive() throws Exception {
        Iterator<GetToolResponse> toolStates =
                Arrays.asList(
                                GetToolResponse.builder()
                                        .tool(
                                                Tool.builder()
                                                        .lifecycleState(
                                                                Tool.LifecycleState.Creating)
                                                        .build())
                                        .build(),
                                GetToolResponse.builder()
                                        .tool(
                                                Tool.builder()
                                                        .lifecycleState(
                                                                Tool.LifecycleState.Creating)
                                                        .build())
                                        .build(),
                                GetToolResponse.builder()
                                        .tool(
                                                Tool.builder()
                                                        .lifecycleState(Tool.LifecycleState.Active)
                                                        .build())
                                        .build())
                        .iterator();

        when(mockClient.getTool("test-tool-id")).thenAnswer(invocation -> toolStates.next());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList())
                        .name("name")
                        .build();
        agent.waitToolActive("test-tool-id");
        verify(mockClient, times(3)).getTool("test-tool-id");
    }

    @Test
    void testClientProperty() {
        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();
        assertEquals(mockClient, agent.getClient());
    }

    @Test
    void testSessionNameAndDescription() throws Exception {
        when(mockClient.createSession(any(), any(), any())).thenReturn("session_with_custom_name");
        when(mockClient.chat(anyString(), anyString(), anyString(), any()))
                .thenReturn(
                        ChatResponse.builder()
                                .chatResult(
                                        ChatResult.builder()
                                                .requiredActions(null)
                                                .message(
                                                        Message.builder()
                                                                .content(
                                                                        MessageContent.builder()
                                                                                .text("Done")
                                                                                .build())
                                                                .build())
                                                .build())
                                .build());

        com.oracle.bmc.adk.agent.Agent agent =
                com.oracle.bmc.adk.agent.Agent.builder()
                        .client(mockClient)
                        .agentEndpointId("test_endpoint_id")
                        .instructions("Test instructions")
                        .tools(Arrays.asList(functionTool))
                        .name("name")
                        .build();

        RunOptions runOptions = RunOptions.builder().maxSteps(3).build();
        RunResponse response = agent.run("Test message", runOptions);

        // Verify that createSession was called with expected parameters
        verify(mockClient).createSession("Session", "Session created by ADK", "test_endpoint_id");
        verify(mockClient).chat(any(), any(), any(), any());
    }
}
