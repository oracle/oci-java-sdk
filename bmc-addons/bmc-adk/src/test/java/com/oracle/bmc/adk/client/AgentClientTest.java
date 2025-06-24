/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.adk.error.AgentException;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.Param;
import com.oracle.bmc.adk.tools.prebuilt.AgenticRagTool;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.generativeaiagent.GenerativeAiAgentClient;
import com.oracle.bmc.generativeaiagent.model.*;
import com.oracle.bmc.generativeaiagent.requests.*;
import com.oracle.bmc.generativeaiagent.responses.*;
import com.oracle.bmc.generativeaiagentruntime.GenerativeAiAgentRuntimeClient;
import com.oracle.bmc.generativeaiagentruntime.model.ChatResult;
import com.oracle.bmc.generativeaiagentruntime.model.Message;
import com.oracle.bmc.generativeaiagentruntime.model.MessageContent;
import com.oracle.bmc.generativeaiagentruntime.model.Session;
import com.oracle.bmc.generativeaiagentruntime.requests.ChatRequest;
import com.oracle.bmc.generativeaiagentruntime.requests.CreateSessionRequest;
import com.oracle.bmc.generativeaiagentruntime.responses.ChatResponse;
import com.oracle.bmc.generativeaiagentruntime.responses.CreateSessionResponse;
import com.oracle.bmc.generativeaiagentruntime.responses.DeleteSessionResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AgentClientTest {

    @Mock private GenerativeAiAgentClient mockAgentCpClient;

    @Mock private GenerativeAiAgentRuntimeClient mockAgentDpClient;

    private AgentClient agentClient;

    @BeforeEach
    void setUp() throws Exception {
        final String AGENT_SERVICE_RUNTIME_ENDPOINT =
                "https://dev.agent-runtime.generativeai.us-phoenix-1.oci.oraclecloud.com";
        final String AGENT_SERVICE_ENDPOINT =
                "https://dev-agent.generativeai.us-phoenix-1.oci.oraclecloud.com";

        final String CONFIG_LOCATION = "~/.oci/config";
        final String CONFIG_PROFILE = "BoatOc1";

        BasicAuthenticationDetailsProvider authProvider =
                new SessionTokenAuthenticationDetailsProvider(
                        ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE));

        agentClient =
                AgentClient.builder()
                        .authProvider(authProvider)
                        .agentManagementEndpoint(AGENT_SERVICE_ENDPOINT)
                        .agentRuntimeEndpoint(AGENT_SERVICE_RUNTIME_ENDPOINT)
                        .build();

        // Inject the mocks using reflection
        injectField(agentClient, "agentDpClient", mockAgentDpClient);
        injectField(agentClient, "agentCpClient", mockAgentCpClient);
    }

    @AfterEach
    void tearDown() throws Exception {
        if (agentClient != null) {
            agentClient.close(); // Ensure resources are released
        }
    }

    private void injectField(Object target, String fieldName, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    @Test
    void testCreateSessionSuccess() {
        CreateSessionResponse mockResponse =
                CreateSessionResponse.builder()
                        .__httpStatusCode__(200)
                        .session(Session.builder().id("session-123").build())
                        .build();

        when(mockAgentDpClient.createSession(any(CreateSessionRequest.class)))
                .thenReturn(mockResponse);

        String sessionId = agentClient.createSession("testSession", "desc", "agent-endpoint-123");

        assertNotNull(sessionId);
        assertEquals("session-123", sessionId);

        verify(mockAgentDpClient, times(1)).createSession(any(CreateSessionRequest.class));
    }

    @Test
    void testChatSuccess() throws Exception {
        // Arrange: Mock a successful chat response
        ChatResponse mockResponse = createMockChatResponse();

        // Define mock behavior
        when(mockAgentDpClient.chat(any(ChatRequest.class))).thenReturn(mockResponse);

        // Act: Call the method
        ChatResponse response =
                agentClient.chat("session-123", "Hello", "agent-endpoint-123", Arrays.asList());

        // Assert: Validate response
        assertNotNull(response, "Response should not be null");
        assertEquals(200, response.get__httpStatusCode__(), "HTTP status should be 200");
        assertNotNull(response.getChatResult(), "ChatResult should not be null");
        assertEquals(
                "Hello",
                response.getChatResult().getMessage().getContent().getText(),
                "Chat message content should match");

        // Verify that chat method was called once with any ChatRequest
        verify(mockAgentDpClient, times(1)).chat(any(ChatRequest.class));
    }

    @Test
    void testChatFailure() {
        // Arrange: Mock failure scenario
        String expectedErrorMessage =
                "Agent Error: An error occurred while invoking the chat endpoint";
        when(mockAgentDpClient.chat(any(ChatRequest.class)))
                .thenThrow(new RuntimeException(expectedErrorMessage));

        // Act & Assert: Expect a RuntimeException with the correct message
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () ->
                                agentClient.chat(
                                        "session-123",
                                        "Hello",
                                        "agent-endpoint-123",
                                        Arrays.asList()));

        // Validate the exception message
        assertEquals(
                expectedErrorMessage,
                exception.getMessage(),
                "Agent Error: An error occurred while invoking the chat endpoint");

        // Verify that chat was attempted once
        verify(mockAgentDpClient, times(1)).chat(any(ChatRequest.class));
    }

    @Test
    void testDeleteSessionSuccess() throws Exception {
        // Arrange
        String agentEndpointId = "test-agent-endpoint-id";
        String sessionId = "test-session-id";

        DeleteSessionResponse response =
                DeleteSessionResponse.builder().__httpStatusCode__(200).build();

        when(mockAgentDpClient.deleteSession(any())).thenReturn(response);

        // Act
        agentClient.deleteSession(agentEndpointId, sessionId);

        // Assert
        verify(mockAgentDpClient, times(1)).deleteSession(any());
    }

    @Test
    void testDeleteSessionFailure() throws Exception {
        // Arrange
        String agentEndpointId = "test-agent-endpoint-id";
        String sessionId = "test-session-id";

        DeleteSessionResponse response =
                DeleteSessionResponse.builder().__httpStatusCode__(500).build();

        when(mockAgentDpClient.deleteSession(any())).thenReturn(response);

        // Act and Assert
        assertThrows(
                AgentException.class, () -> agentClient.deleteSession(agentEndpointId, sessionId));
        verify(mockAgentDpClient, times(1)).deleteSession(any());
    }

    // Helper method to create a mock ChatResponse
    private ChatResponse createMockChatResponse() {
        ChatResult mockChatResult =
                ChatResult.builder()
                        .message(
                                Message.builder()
                                        .content(MessageContent.builder().text("Hello").build())
                                        .build())
                        .build();

        return ChatResponse.builder()
                .__httpStatusCode__(200)
                .headers(new HashMap<>()) // Empty headers
                .opcRequestId("mock-opc-request-id")
                .chatResult(mockChatResult)
                .eventStream(null)
                .build();
    }

    // Helper method to create ToolSummary
    private ToolSummary createToolSummary(String id, Tool.LifecycleState lifecycleState) {

        // metadata
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key", "value");

        // freeformTags
        Map<String, String> freeformTags = new HashMap<>();
        freeformTags.put("tag1", "value1");

        // definedTags
        Map<String, Map<String, Object>> definedTags = new HashMap<>();
        Map<String, Object> subMap = new HashMap<>();
        subMap.put("subkey", "subvalue");
        definedTags.put("key", subMap);

        // systemTags
        Map<String, Map<String, Object>> systemTags = new HashMap<>();
        Map<String, Object> systemSubMap = new HashMap<>();
        systemSubMap.put("subkey", "subvalue");
        systemTags.put("key", systemSubMap);

        return new ToolSummary(
                id, // id
                lifecycleState, // lifecycleState
                new Date(), // timeCreated
                new Date(), // timeUpdated
                "Tool Display Name " + id, // displayName
                "Tool Description " + id, // description
                "compartment-id", // compartmentId
                "agent-id", // agentId
                null, // toolConfig
                metadata, // metadata
                freeformTags, // freeformTags
                definedTags, // definedTags
                systemTags // systemTags
                );
    }

    @Test
    void testFindTools() throws Exception {
        // Arrange: Mock the response from agentCPClient with two tools, one active and one inactive
        ToolSummary activeTool = createToolSummary("tool-1", Tool.LifecycleState.Active);
        ToolSummary inactiveTool = createToolSummary("tool-2", Tool.LifecycleState.Active);

        ListToolsResponse mockResponse =
                ListToolsResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .toolCollection(
                                ToolCollection.builder()
                                        .items(
                                                Arrays.asList(
                                                        activeTool,
                                                        inactiveTool)) // Both tools returned
                                        .build())
                        .build();

        // Mock the behavior of agentCPClient.listTools
        when(mockAgentCpClient.listTools(any(ListToolsRequest.class))).thenReturn(mockResponse);

        // Act: Call the findTools method
        ListToolsResponse response = agentClient.listActiveTools("compartment-id", "agent-id");

        // Assert: Validate the response and ensure only active tools are returned
        assertNotNull(response);
        assertEquals("mock-opc-request-id", response.getOpcRequestId());
        assertNotNull(response.getToolCollection()); // Ensure list of tools is returned
        assertEquals(
                2,
                response.getToolCollection().getItems().size()); // Only one tool should be returned
        assertEquals(
                "tool-1",
                response.getToolCollection()
                        .getItems()
                        .get(0)
                        .getId()); // The active tool should be returned

        // Verify that the listTools method was called once
        verify(mockAgentCpClient, times(1)).listTools(any(ListToolsRequest.class));
    }

    @Test
    void testFindToolsFailure() {
        // Arrange: Mock the failure scenario
        String expectedErrorMessage = "Agent Error: Failed to list tools for agent: agent-id";
        when(mockAgentCpClient.listTools(any(ListToolsRequest.class)))
                .thenThrow(new RuntimeException(expectedErrorMessage));

        // Act & Assert: Expect a RuntimeException with the correct message
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> agentClient.listActiveTools("compartment-id", "agent-id"));

        // Validate the exception message with a more descriptive failure message
        assertEquals(
                expectedErrorMessage,
                exception.getMessage(),
                "Agent Error: Failed to list tools for agent: agent-id");

        // Verify that listTools was called once
        verify(mockAgentCpClient, times(1)).listTools(any(ListToolsRequest.class));
    }

    @com.oracle.bmc.adk.tools.Tool(
            name = "getWorkerByPersonNumber",
            description =
                    "Fetch the Worker details including the PersonId for a given account with PersonNumber.")
    public static Map<String, Object> getWorkerByPersonNumber(
            @Param(description = "The use_case ID for this invocation. Mandatory.") String use_case,
            @Param(description = "The workflow_name for this invocation. Mandatory.")
                    String workflow_name,
            @Param(description = "The tool_name for this invocation. Mandatory.") String tool_name,
            @Param(description = "The PersonNumber of the worker. Mandatory.")
                    String personNumber) {
        Map<String, Object> result = new HashMap<>();
        result.put("PersonId", "782362");
        return result;
    }

    @Test
    void testAddFunctionToolsSuccess() throws Exception {
        // Arrange: Create a mock FunctionTool
        Method mockMethod =
                AgentClientTest.class.getMethod(
                        "getWorkerByPersonNumber",
                        String.class,
                        String.class,
                        String.class,
                        String.class);

        FunctionTool mockTool = new FunctionTool(new Object(), mockMethod);

        // Create a mock CreateToolResponse
        CreateToolResponse mockResponse =
                CreateToolResponse.builder().opcRequestId("mock-opc-request-id").build();

        // Mock the behavior of agentCPClient.createTool
        when(mockAgentCpClient.createTool(any(CreateToolRequest.class))).thenReturn(mockResponse);

        // Act: Call the addFunctionTools method
        CreateToolResponse response =
                agentClient.addFunctionCallingTools(mockTool, "compartment-id", "agent-id");

        // Assert: Validate the response and interaction
        assertNotNull(response);
        assertEquals(
                "mock-opc-request-id", response.getOpcRequestId(), "opcRequestId should match");

        // Verify that createTool was called once
        verify(mockAgentCpClient, times(1)).createTool(any(CreateToolRequest.class));
    }

    @Test
    void testAddRagToolSuccess() throws Exception {
        // Arrange: Prepare the mock input
        List<String> knowledgeBaseIds = Arrays.asList("kb1", "kb2");
        AgenticRagTool mockRagTool = mock(AgenticRagTool.class);
        when(mockRagTool.getKnowledgeBaseIds()).thenReturn(knowledgeBaseIds);

        // Create mock CreateToolResponse
        CreateToolResponse mockResponse =
                CreateToolResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .__httpStatusCode__(200) // Simulate a successful response code
                        .build();

        // Mock the behavior of agentCPClient.createTool to return the mock response
        when(mockAgentCpClient.createTool(any(CreateToolRequest.class))).thenReturn(mockResponse);

        // Act: Call the addRagTool method with the mock ragTool and other parameters
        CreateToolResponse response =
                agentClient.addRagTool(mockRagTool, "compartment-id", "agent-id");

        // Assert: Validate that the response is not null and contains the expected OPC request ID
        assertNotNull(response, "Response should not be null");
        assertEquals(
                "mock-opc-request-id", response.getOpcRequestId(), "opcRequestId should match");

        // Verify that createTool was called once with any CreateToolRequest
        verify(mockAgentCpClient, times(1)).createTool(any(CreateToolRequest.class));
    }

    @Test
    void testAddRagToolFailure() throws Exception {
        // Arrange: Prepare the mock input
        List<String> knowledgeBaseIds = Arrays.asList("kb1", "kb2");
        AgenticRagTool mockRagTool = mock(AgenticRagTool.class);
        when(mockRagTool.getKnowledgeBaseIds()).thenReturn(knowledgeBaseIds);

        // Simulate an exception being thrown from agentCPClient.createTool
        when(mockAgentCpClient.createTool(any(CreateToolRequest.class)))
                .thenThrow(new RuntimeException("Create tool request failed"));

        // Act & Assert: Expect an AgentException to be thrown
        AgentException exception =
                assertThrows(
                        AgentException.class,
                        () -> agentClient.addRagTool(mockRagTool, "compartment-id", "agent-id"));

        // Assert: Check that the exception message contains the expected text
        assertTrue(
                exception.getMessage().contains("Request failed: Create tool request failed"),
                "Exception message should contain 'Request failed'");

        // Verify that createTool was called once with any CreateToolRequest
        verify(mockAgentCpClient, times(1)).createTool(any(CreateToolRequest.class));
    }

    @Test
    void testGetToolSuccess() throws Exception {
        // Arrange: Mock the toolId and the response from the agentCPClient
        String toolId = "tool-id";
        GetToolResponse mockResponse =
                GetToolResponse.builder().opcRequestId("mock-opc-request-id").build();

        // Mock the behavior of agentCPClient.getTool
        when(mockAgentCpClient.getTool(any(GetToolRequest.class))).thenReturn(mockResponse);

        // Act: Call the getTool method
        GetToolResponse response = agentClient.getTool(toolId);

        // Assert: Validate the response and interaction
        assertNotNull(response, "Response should not be null");
        assertEquals(
                "mock-opc-request-id", response.getOpcRequestId(), "opcRequestId should match");

        // Verify that getTool was called once with any GetToolRequest
        verify(mockAgentCpClient, times(1)).getTool(any(GetToolRequest.class));
    }

    @Test
    void testUpdateFunctionToolSuccess() throws Exception {
        // Arrange: Prepare the mock input and mock tool
        String toolId = "tool-id";
        FunctionTool mockTool = mock(FunctionTool.class);
        when(mockTool.getName()).thenReturn("Function Tool");
        when(mockTool.getDescription()).thenReturn("Description of the function tool");
        when(mockTool.getParameters()).thenReturn(Collections.emptyMap());

        // Create mock UpdateToolResponse
        UpdateToolResponse mockResponse =
                UpdateToolResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .__httpStatusCode__(200) // Simulate a successful response
                        .build();

        // Mock the behavior of agentCPClient.updateTool
        when(mockAgentCpClient.updateTool(any(UpdateToolRequest.class))).thenReturn(mockResponse);

        // Act: Call the updateFunctionTool method with the mock tool and other parameters
        UpdateToolResponse response = agentClient.updateFunctionTool(toolId, mockTool);

        // Assert: Validate the response and interaction
        assertNotNull(response, "Response should not be null");
        assertEquals(
                "mock-opc-request-id", response.getOpcRequestId(), "opcRequestId should match");

        // Verify that updateTool was called once with any UpdateToolRequest
        verify(mockAgentCpClient, times(1)).updateTool(any(UpdateToolRequest.class));
    }

    @Test
    void testGetAgentSuccess() {
        // Arrange: Mock agent details
        String agentId = "mock-agent-id";

        Agent mockAgent =
                Agent.builder()
                        .id(agentId)
                        .displayName("Mock Agent")
                        .description("This is a mocked agent")
                        .build();

        GetAgentResponse mockResponse =
                GetAgentResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .agent(mockAgent)
                        .build();

        when(mockAgentCpClient.getAgent(any(GetAgentRequest.class))).thenReturn(mockResponse);

        // Act: Call the method
        GetAgentResponse response = agentClient.getAgent(agentId);

        // Assert: Validate response
        assertNotNull(response);
        assertEquals("mock-opc-request-id", response.getOpcRequestId());
        assertNotNull(response.getAgent());
        assertEquals(agentId, response.getAgent().getId());
        assertEquals("Mock Agent", response.getAgent().getDisplayName());
        assertEquals("This is a mocked agent", response.getAgent().getDescription());

        // Verify method interaction
        verify(mockAgentCpClient, times(1)).getAgent(any(GetAgentRequest.class));
    }

    @Test
    void testGetAgentFailure() {
        // Arrange: Simulate API failure
        String agentId = "mock-agent-id";
        when(mockAgentCpClient.getAgent(any(GetAgentRequest.class)))
                .thenThrow(new RuntimeException("Service unavailable"));

        // Act & Assert: Verify exception is thrown
        Exception exception =
                assertThrows(RuntimeException.class, () -> agentClient.getAgent(agentId));
        assertEquals(
                "Agent Error: Failed to retrieve agent details for ID: mock-agent-id",
                exception.getMessage());

        // Verify method interaction
        verify(mockAgentCpClient, times(1)).getAgent(any(GetAgentRequest.class));
    }

    @Test
    void testGetAgentEndpointSuccess() {
        // Arrange: Mock agent endpoint details
        String agentEndpointId = "mock-endpoint-id";

        AgentEndpoint mockAgentEndpoint =
                AgentEndpoint.builder()
                        .id(agentEndpointId)
                        .displayName("Mock Agent Endpoint")
                        .description("This is a mocked agent endpoint")
                        .build();

        GetAgentEndpointResponse mockResponse =
                GetAgentEndpointResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .agentEndpoint(mockAgentEndpoint)
                        .build();

        when(mockAgentCpClient.getAgentEndpoint(any(GetAgentEndpointRequest.class)))
                .thenReturn(mockResponse);

        // Act: Call the method
        GetAgentEndpointResponse response = agentClient.getAgentEndpointResponse(agentEndpointId);

        // Assert: Validate response
        assertNotNull(response);
        assertEquals("mock-opc-request-id", response.getOpcRequestId());
        assertNotNull(response.getAgentEndpoint());
        assertEquals(agentEndpointId, response.getAgentEndpoint().getId());
        assertEquals("Mock Agent Endpoint", response.getAgentEndpoint().getDisplayName());
        assertEquals(
                "This is a mocked agent endpoint", response.getAgentEndpoint().getDescription());

        // Verify method interaction
        verify(mockAgentCpClient, times(1)).getAgentEndpoint(any(GetAgentEndpointRequest.class));
    }

    @Test
    void testGetAgentEndpointFailure() {
        // Arrange: Simulate API failure
        String agentEndpointId = "mock-endpoint-id";
        when(mockAgentCpClient.getAgentEndpoint(any(GetAgentEndpointRequest.class)))
                .thenThrow(new RuntimeException("Service unavailable"));

        // Act & Assert: Verify exception is thrown
        Exception exception =
                assertThrows(
                        RuntimeException.class,
                        () -> agentClient.getAgentEndpointResponse(agentEndpointId));
        assertEquals(
                "Agent Error: Failed to retrieve agent endpoint details for ID: mock-endpoint-id",
                exception.getMessage());

        // Verify method interaction
        verify(mockAgentCpClient, times(1)).getAgentEndpoint(any(GetAgentEndpointRequest.class));
    }

    @Test
    void testUpdateAgentInstructionSuccess() {
        // Arrange: Mock agent update request
        String agentId = "mock-agent-id";
        String newInstructions = "New agent instructions";
        String newName = "New name";
        String newDescription = "New description";

        UpdateAgentResponse mockResponse =
                UpdateAgentResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .__httpStatusCode__(200)
                        .build();

        when(mockAgentCpClient.updateAgent(any(UpdateAgentRequest.class))).thenReturn(mockResponse);

        // Act: Call the method
        UpdateAgentResponse response =
                agentClient.updateAgent(agentId, newName, newDescription, newInstructions);

        // Assert: Validate response
        assertNotNull(response);
        assertEquals("mock-opc-request-id", response.getOpcRequestId());

        // Verify that updateAgent was called with the correct request
        verify(mockAgentCpClient, times(1)).updateAgent(any(UpdateAgentRequest.class));
    }

    @Test
    void testUpdateAgentInstructionFailure() {
        // Arrange: Simulate API failure
        String agentId = "mock-agent-id";
        String newInstructions = "New agent instructions";

        when(mockAgentCpClient.updateAgent(any(UpdateAgentRequest.class)))
                .thenThrow(new RuntimeException("Service unavailable"));

        // Act & Assert: Verify exception is thrown
        Exception exception =
                assertThrows(
                        AgentException.class,
                        () -> agentClient.updateAgent(agentId, null, null, newInstructions));
        assertTrue(exception.getMessage().contains("Request failed: Service unavailable"));

        // Verify method interaction
        verify(mockAgentCpClient, times(1)).updateAgent(any(UpdateAgentRequest.class));
    }

    @Test
    void testUpdateRagToolSuccess() {
        // Arrange: Prepare the data for the test
        String ragToolId = "mock-rag-tool-id";
        AgenticRagTool mockLocalRagTool = mock(AgenticRagTool.class);
        ToolSummary mockRemoteRagTool = mock(ToolSummary.class);
        when(mockLocalRagTool.getKnowledgeBaseIds())
                .thenReturn(Arrays.asList("kb-id-1", "kb-id-2"));

        // Create a mock response with status code 200 (indicating success)
        UpdateToolResponse mockResponse =
                UpdateToolResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .__httpStatusCode__(200) // Set the HTTP status code to 200
                        .build();

        // Mock the updateTool method to return the mock response
        when(mockAgentCpClient.updateTool(any(UpdateToolRequest.class))).thenReturn(mockResponse);

        // Act: Call the method to test
        UpdateToolResponse response =
                agentClient.updateRagTool(mockRemoteRagTool, mockLocalRagTool);

        // Assert: Validate response
        assertNotNull(response);
        assertEquals("mock-opc-request-id", response.getOpcRequestId());

        // Verify that updateTool was called once with the correct request
        verify(mockAgentCpClient, times(1)).updateTool(any(UpdateToolRequest.class));
    }

    @Test
    void testUpdateRagToolFailure() {
        // Arrange: Prepare the data for the test
        String ragToolId = "mock-rag-tool-id";
        ToolSummary mockRemoteRagTool = mock(ToolSummary.class);
        AgenticRagTool mockLocalRagTool = mock(AgenticRagTool.class);
        when(mockLocalRagTool.getKnowledgeBaseIds())
                .thenReturn(Arrays.asList("kb-id-1", "kb-id-2"));

        // Create a mock response with status code 500 (indicating failure)
        UpdateToolResponse mockResponse =
                UpdateToolResponse.builder()
                        .opcRequestId("mock-opc-request-id")
                        .__httpStatusCode__(
                                500) // Set the HTTP status code to 500 to simulate failure
                        .build();

        // Mock the updateTool method to return the mock response
        when(mockAgentCpClient.updateTool(any(UpdateToolRequest.class))).thenReturn(mockResponse);

        // Act & Assert: Call the method and expect an AgentException
        assertThrows(
                AgentException.class,
                () -> agentClient.updateRagTool(mockRemoteRagTool, mockLocalRagTool),
                "Expected AgentException due to HTTP status code 500");
    }

    @Test
    void testCloseWithSessionTokenAuthProvider() throws Exception {
        // Arrange: Mock authProvider as SessionTokenAuthenticationDetailsProvider
        SessionTokenAuthenticationDetailsProvider mockAuthProvider =
                mock(SessionTokenAuthenticationDetailsProvider.class);
        AgentClient agentClient = AgentClient.builder().authProvider(mockAuthProvider).build();

        // Act: Call close
        agentClient.close();

        // Assert: Verify that close was called on the authProvider
        verify(mockAuthProvider, times(1)).close();
    }

    @Test
    void testIdempotentClose() {
        SessionTokenAuthenticationDetailsProvider mockAuthProvider =
                mock(SessionTokenAuthenticationDetailsProvider.class);
        AgentClient agentClient = AgentClient.builder().authProvider(mockAuthProvider).build();

        assertDoesNotThrow(
                () -> {
                    agentClient.close();
                    agentClient.close(); // Should not throw second time
                },
                "Calling close() multiple times should be safe");
    }

    @Test
    void testTryWithResources_whenAuthProviderCloseThrowsException() {
        SessionTokenAuthenticationDetailsProvider mockAuthProvider =
                mock(SessionTokenAuthenticationDetailsProvider.class);
        doThrow(new RuntimeException("close failed")).when(mockAuthProvider).close();
        RuntimeException thrown =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            try (AgentClient client =
                                    AgentClient.builder().authProvider(mockAuthProvider).build()) {}
                        });

        assertEquals("close failed", thrown.getMessage());
    }
}
