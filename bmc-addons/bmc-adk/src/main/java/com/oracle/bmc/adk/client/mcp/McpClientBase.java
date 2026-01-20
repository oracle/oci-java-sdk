/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client.mcp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.Toolkit;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.JsonUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Abstract base class for McpClient implementations.
 *
 * <p>Provides shared state and utility methods for tool management, request counters, connection
 * lifecycle, and JSON-RPC handling.
 */
public abstract class McpClientBase implements McpClient {

    /** Counter for request IDs. */
    protected final AtomicInteger requestId = new AtomicInteger(0);

    /** Indicates if the client is initialized. */
    protected final AtomicBoolean initialized = new AtomicBoolean(false);

    /** Display name of the client/server. */
    protected final String name;

    /** List of tools retrieved from the server. */
    protected volatile List<McpSchema.Tool> toolList;

    /** Indicates if cleanup has been performed. */
    protected volatile boolean cleanedUp = false;

    /**
     * Constructs McpClientBase with the given name.
     *
     * @param name Display name
     */
    protected McpClientBase(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Connects to the MCP server and performs handshake. Must be implemented by subclasses.
     *
     * @throws McpException if a connection error occurs
     */
    @Override
    public abstract void connect() throws McpException;

    /** Closes the client and releases resources. */
    @Override
    public abstract void close();

    /**
     * Retrieves the list of available tools from the remote MCP server, and updates the internal
     * tool list.
     *
     * @return a list of tools
     */
    @Override
    public List<McpSchema.Tool> listTools() {
        return runIfInitialized(
                () -> {
                    McpSchema.JsonRpcRequest request =
                            new McpSchema.JsonRpcRequest(
                                    requestId.getAndIncrement(), "tools/list", null);
                    McpSchema.JsonRpcResponse response;
                    response = sendRequestAndWaitForResponse(request);
                    if (response.error != null) {
                        throw new McpException("List tools failed: " + response.error.message);
                    }
                    McpSchema.ListToolsResult result =
                            JsonUtils.OBJECT_MAPPER.convertValue(
                                    response.result, McpSchema.ListToolsResult.class);
                    this.toolList = result.tools();
                    return toolList == null ? Collections.emptyList() : new ArrayList<>(toolList);
                });
    }

    /**
     * Calls a specified tool on the server with arguments.
     *
     * @param toolName tool name
     * @param args arguments
     * @return the call result
     * @throws McpException if the call fails
     */
    @Override
    public McpSchema.CallToolResult callTool(String toolName, Map<String, Object> args)
            throws McpException {
        Objects.requireNonNull(toolName, "toolName must not be null");
        Objects.requireNonNull(args, "args must not be null");
        return runIfInitialized(
                () -> {
                    McpSchema.CallToolRequest callToolRequest =
                            new McpSchema.CallToolRequest(
                                    toolName, Collections.unmodifiableMap(args));
                    McpSchema.JsonRpcRequest request =
                            new McpSchema.JsonRpcRequest(
                                    requestId.getAndIncrement(), "tools/call", callToolRequest);
                    McpSchema.JsonRpcResponse response;
                    response = sendRequestAndWaitForResponse(request);
                    if (response.error != null) {
                        throw new McpException("Call tool failed: " + response.error.message);
                    }
                    return JsonUtils.OBJECT_MAPPER.convertValue(
                            response.result, McpSchema.CallToolResult.class);
                });
    }

    /**
     * Converts all registered tools into a list of FunctionTool wrappers.
     *
     * @return list of FunctionTool objects
     */
    @Override
    public List<FunctionTool> asTools() {
        return listTools().stream().map(this::toFunctionTool).collect(Collectors.toList());
    }

    /**
     * Converts the MCP client into a {@link Toolkit} representation, wrapping the client's tools as
     * {@link FunctionTool} instances. This allows the MCP client's tools to be used in contexts
     * that expect a {@link Toolkit}. The resulting {@link Toolkit} is initialized with the provided
     * {@code toolkitName}.
     *
     * @param toolkitName the name to be used for the resulting {@link Toolkit}
     * @return a {@link Toolkit} representation of the MCP client's tools, with the specified name
     */
    @Override
    public Toolkit asToolkit(String toolkitName) {
        return new Toolkit(
                toolkitName,
                listTools().stream()
                        .collect(Collectors.toMap(McpSchema.Tool::name, this::toFunctionTool)));
    }

    /**
     * Converts a Tool to a FunctionTool wrapper.
     *
     * @param tool the MCP tool
     * @return the FunctionTool wrapper
     */
    protected FunctionTool toFunctionTool(McpSchema.Tool tool) {
        try {
            Method method = this.getClass().getMethod("callTool", String.class, Map.class);
            FunctionTool functionTool =
                    new FunctionTool(
                            tool.name,
                            tool.description,
                            this,
                            convertJsonSchemaNode(tool.inputSchema()),
                            method);
            Console.debug(Console.Color.GREEN, "MCP tool name:         " + tool.name());
            Console.debug(Console.Color.CYAN, "MCP tool description:  " + tool.description());
            Console.debug(Console.Color.CYAN, "MCP tool inputSchema:  " + tool.inputSchema());
            return functionTool;
        } catch (NoSuchMethodException | JsonProcessingException e) {
            throw new McpException("Unable to convert to Function Tool", e);
        }
    }

    private static Map<String, String> convertJsonSchemaNode(JsonNode rootNode)
            throws JsonProcessingException {
        Map<String, String> result = new HashMap<>();

        Optional.ofNullable(rootNode.get("type"))
                .map(JsonNode::asText)
                .ifPresent(type -> result.put("type", type));

        Optional.ofNullable(rootNode.get("properties"))
                .filter(JsonNode::isObject)
                .ifPresent(
                        propertiesNode -> {
                            String propertiesJson = propertiesNode.toString();
                            result.put("properties", propertiesJson);
                            List<String> requiredKeys = new ArrayList<>();
                            propertiesNode.fieldNames().forEachRemaining(requiredKeys::add);
                            try {
                                String requiredJson =
                                        JsonUtils.OBJECT_MAPPER.writeValueAsString(requiredKeys);
                                result.put("required", requiredJson);
                            } catch (JsonProcessingException e) {
                                throw new RuntimeException(e);
                            }
                        });

        return result;
    }

    /**
     * Ensures the client is initialized before running logic.
     *
     * @param action logic to execute
     * @param <T> return type
     * @return the result of the action
     */
    protected <T> T runIfInitialized(Supplier<T> action) {
        if (!initialized.get()) {
            String msg =
                    "MCP server is not initialized. Call connect() before using client features.";
            Console.error(Console.Color.RED, msg);
            throw new McpException(msg);
        }
        return action.get();
    }

    /**
     * Returns the most recently fetched tools list as an unmodifiable view.
     *
     * @return the list of tools, or null if not fetched yet
     */
    public List<McpSchema.Tool> getToolList() {
        return toolList == null ? null : Collections.unmodifiableList(toolList);
    }

    /**
     * Subclasses must implement how to send a JSON-RPC request and receive a response.
     *
     * @param request request object
     * @return the response
     * @throws McpException if sending or receiving fails
     */
    protected abstract McpSchema.JsonRpcResponse sendRequestAndWaitForResponse(
            McpSchema.JsonRpcRequest request) throws McpException;

    /**
     * Subclasses must implement how to send a JSON-RPC notification.
     *
     * @param notification notification object
     * @throws McpException if sending fails
     */
    protected abstract void sendNotification(McpSchema.JsonRpcNotification notification)
            throws McpException;
}
