/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.adk.client.mcp.McpClientBase;
import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.tools.FunctionTool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class McpClientBaseTest {

    // Test subclass exposes protected for testing
    static class TestMcpClient extends McpClientBase {
        private McpSchema.JsonRpcResponse sendResponse;
        private McpException sendRequestException;

        public TestMcpClient(String name) {
            super(name);
        }

        @Override
        public void connect() {
            initialized.set(true);
        }

        @Override
        public void close() {
            cleanedUp = true;
        }

        @Override
        protected McpSchema.JsonRpcResponse sendRequestAndWaitForResponse(
                McpSchema.JsonRpcRequest request) throws McpException {
            if (sendRequestException != null) throw sendRequestException;
            return sendResponse;
        }

        @Override
        protected void sendNotification(McpSchema.JsonRpcNotification notification) {}

        public <T> CompletableFuture<T> callRunIfInitialized(
                Supplier<CompletableFuture<T>> supplier) {
            return runIfInitialized(supplier);
        }

        public void setToolsList(List<McpSchema.Tool> list) {
            this.toolList = list;
        }

        public void setSendResponse(McpSchema.JsonRpcResponse resp) {
            this.sendResponse = resp;
        }

        public void setSendRequestException(McpException ex) {
            this.sendRequestException = ex;
        }

        public boolean isCleanedUp() {
            return this.cleanedUp;
        }

        public void setCleanedUp(boolean cleanedUp) {
            this.cleanedUp = cleanedUp;
        }
    }

    private TestMcpClient client;

    @BeforeEach
    void setupClient() {
        client = new TestMcpClient("demo");
    }

    @Test
    void testGetNameReturnsCorrectValue() {
        assertEquals("demo", client.getName());
    }

    @Test
    void testConnectAndRunIfInitializedWorks() throws Exception {
        client.connect();
        CompletableFuture<String> future =
                client.callRunIfInitialized(() -> CompletableFuture.completedFuture("ok"));
        assertEquals("ok", future.get());
    }

    @Test
    void testRunIfInitializedReturnsErrorWhenNotConnected() {
        assertThrows(
                McpException.class,
                () -> client.callRunIfInitialized(() -> CompletableFuture.completedFuture("fail")));
    }

    @Test
    void testCleanupIsIdempotent() {
        assertFalse(client.isCleanedUp());
        client.close();
        assertTrue(client.isCleanedUp());
        client.close();
        assertTrue(client.isCleanedUp());
    }

    @Test
    void testCloseCallsCleanup() {
        client.setCleanedUp(false);
        client.close();
        assertTrue(client.isCleanedUp());
    }

    @Test
    void testListToolsReturnsToolList() throws Exception {
        client.connect();
        ObjectMapper mapper = new ObjectMapper();
        String schemaJson = "{\"type\":\"object\",\"properties\":{\"foo\":{\"type\":\"string\"}}}";
        JsonNode expectedSchema = mapper.readTree(schemaJson);
        McpSchema.Tool tool = new McpSchema.Tool("toolX", "descX", expectedSchema);
        McpSchema.ListToolsResult res =
                new McpSchema.ListToolsResult(Collections.singletonList(tool));
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.result = res;

        client.setSendResponse(response);
        List<McpSchema.Tool> got = client.listTools();
        assertEquals(1, got.size());
        assertEquals("toolX", got.get(0).name());
        assertEquals("toolX", client.getToolList().get(0).name());
        assertEquals(expectedSchema, got.get(0).inputSchema());
    }

    @Test
    void testListToolsReturnsEmptyWhenNull() throws Exception {
        client.connect();
        McpSchema.ListToolsResult res = new McpSchema.ListToolsResult(null);
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.result = res;
        client.setSendResponse(response);
        List<McpSchema.Tool> got = client.listTools();
        assertNotNull(got);
        assertTrue(got.isEmpty());
    }

    @Test
    void testListToolsThrowsOnServerError() {
        client.connect();
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.error = new McpSchema.JsonRpcError(-1, "fail", null);
        client.setSendResponse(response);
        McpException ex = assertThrows(McpException.class, () -> client.listTools());
        assertTrue(ex.getMessage().contains("List tools failed"));
    }

    @Test
    void testListToolsThrowsOnRequestException() {
        client.connect();
        client.setSendRequestException(new McpException("test-exception"));
        McpException ex = assertThrows(McpException.class, () -> client.listTools());
        assertTrue(ex.getMessage().contains("test-exception"));
    }

    @Test
    void testCallToolReturnsResult() throws Exception {
        client.connect();
        McpSchema.CallToolResult toolResult =
                new McpSchema.CallToolResult(Collections.emptyList(), false);

        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.result = toolResult;
        client.setSendResponse(response);

        Map<String, Object> params = new HashMap<>();
        params.put("k1", "v1");

        McpSchema.CallToolResult result = client.callTool("my tool", params);
        assertNotNull(result);
        assertNotEquals(Boolean.TRUE, result.isError());
    }

    @Test
    void testCallToolThrowsOnErrorResponse() {
        client.connect();
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.error = new McpSchema.JsonRpcError(1, "bad arg", null);
        client.setSendResponse(response); // Only error, no result
        Map<String, Object> params = new HashMap<>();
        params.put("foo", "bar");
        McpException ex =
                assertThrows(McpException.class, () -> client.callTool("fail tool", params));
        assertTrue(ex.getMessage().contains("Call tool failed"));
    }

    @Test
    void testCallToolThrowsOnRequestException() {
        client.connect();
        client.setSendRequestException(new McpException("faked-exception"));
        Map<String, Object> params = Collections.singletonMap("foo", "bar");
        McpException ex =
                assertThrows(McpException.class, () -> client.callTool("err tool", params));
        assertTrue(ex.getMessage().contains("faked-exception"));
    }

    @Test
    void testCallToolThrowsOnNullParams() {
        client.connect();
        assertThrows(NullPointerException.class, () -> client.callTool(null, new HashMap<>()));
        assertThrows(NullPointerException.class, () -> client.callTool("tool", null));
    }

    @Test
    void testAsToolsConvertsToFunctionTools() throws Exception {
        client.connect();
        ObjectMapper mapper = new ObjectMapper();
        String schemaJson = "{\"type\":\"object\",\"properties\":{\"foo\":{\"type\":\"string\"}}}";
        JsonNode expectedSchema = mapper.readTree(schemaJson);
        McpSchema.Tool tool = new McpSchema.Tool("toolF", "descF", expectedSchema);
        McpSchema.ListToolsResult res =
                new McpSchema.ListToolsResult(Collections.singletonList(tool));
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.result = res;
        client.setSendResponse(response);
        List<FunctionTool> out = client.asTools();
        assertEquals(1, out.size());
        assertEquals("toolF", out.get(0).getName());
        assertEquals("descF", out.get(0).getDescription());
        assertEquals("object", out.get(0).getParameters().get("type"));
        assertEquals(
                "{\"foo\":{\"type\":\"string\"}}", out.get(0).getParameters().get("properties"));
    }

    @Test
    void testGetToolsListReturnsNullOrUnmodifiable() {
        assertNull(client.getToolList());
        List<McpSchema.Tool> tools = new ArrayList<>();
        client.setToolsList(tools);
        List<McpSchema.Tool> fromGetter = client.getToolList();
        assertThrows(
                UnsupportedOperationException.class, () -> fromGetter.add(new McpSchema.Tool()));
    }
}
