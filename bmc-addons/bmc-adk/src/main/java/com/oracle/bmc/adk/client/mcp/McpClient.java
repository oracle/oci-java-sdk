/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client.mcp;

import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.tools.FunctionTool;
import com.oracle.bmc.adk.tools.Toolkit;

import java.util.List;
import java.util.Map;

/**
 * Interface for a Model Context Protocol (MCP) client.
 *
 * <p>An MCP client establishes a connection to an MCP server, lists available tools, and invokes
 * tools on the remote MCP server.
 */
public interface McpClient extends AutoCloseable {

    /**
     * Connects to the MCP server. This method must be called before using any other client
     * operations.
     *
     * @throws McpException if a connection failure occurs
     */
    void connect() throws McpException;

    /**
     * Releases resources and closes the connection to the server. This method is idempotent and
     * safe to call multiple times.
     */
    void close();

    /**
     * Gets the display name associated with the client or server connection.
     *
     * @return the display name or {@code null} if not set
     */
    String getName();

    /**
     * Retrieves the list of tools available on the connected MCP server.
     *
     * @return list of {@link McpSchema.Tool} instances
     * @throws McpException if an error occurs during the request
     */
    List<McpSchema.Tool> listTools() throws McpException;

    /**
     * Invokes a tool on the MCP server with the specified arguments.
     *
     * @param toolName the unique name of the tool to invoke
     * @param args arguments to pass to the tool
     * @return the result of the tool invocation
     * @throws McpException if invocation fails or the client is not connected
     */
    McpSchema.CallToolResult callTool(String toolName, Map<String, Object> args)
            throws McpException;

    /**
     * Returns all registered tools as a list of {@link FunctionTool} wrappers for agent
     * orchestration.
     *
     * @return list of converted {@link FunctionTool} objects
     */
    List<FunctionTool> asTools();

    /**
     * Converts the MCP client into a {@link Toolkit} representation, wrapping the client's tools as
     * {@link FunctionTool} instances. This allows the MCP client's tools to be used in contexts
     * that expect a {@link Toolkit}. The resulting {@link Toolkit} is initialized with the provided
     * {@code toolkitName}.
     *
     * @param toolkitName the name to be used for the resulting {@link Toolkit}
     * @return a {@link Toolkit} representation of the MCP client's tools, with the specified name
     */
    Toolkit asToolkit(String toolkitName);
}
