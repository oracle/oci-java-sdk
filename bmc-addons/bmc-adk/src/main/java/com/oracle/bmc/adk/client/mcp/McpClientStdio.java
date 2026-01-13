/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client.mcp;

import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.JsonUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Stdio-based implementation of the McpClient.
 *
 * <p>Launches a local MCP server process and communicates using standard input and output streams.
 */
public class McpClientStdio extends McpClientBase {

    /** The command and arguments to launch the server process. */
    protected final String[] connectionParams;

    /** The underlying process for the MCP server. */
    private Process serverProcess;

    /** Writer to the server process stdin. */
    private BufferedWriter processWriter;

    /** Reader from the server process stdout. */
    private BufferedReader processReader;

    /** Lock for connect/close synchronization. */
    protected final ReentrantLock reentrantLock = new ReentrantLock();

    /** Shared empty string array instance. */
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    /**
     * Constructs an McpClientStdio from a Builder.
     *
     * @param builder builder instance
     */
    protected McpClientStdio(Builder builder) {
        super(builder.name);
        if (builder.connectionParams == null) {
            throw new McpException("MCP client connection params are required");
        }
        if (builder.connectionParams.length == 0) {
            throw new McpException("MCP Client connection params must not be empty");
        }
        this.connectionParams = builder.connectionParams;
    }

    /**
     * Connects to the MCP server by launching a local process and initializing the protocol.
     *
     * @throws McpException if the process or initialization fails
     */
    @Override
    public void connect() throws McpException {
        reentrantLock.lock();
        try {
            if (initialized.get()) {
                Console.log(
                        Console.Color.WHITE,
                        String.format(
                                "McpClientStdio [%s] is already connected.",
                                name != null ? name : ""));
                return;
            }
            try {
                ProcessBuilder pb = new ProcessBuilder(connectionParams);
                pb.redirectErrorStream(false);
                serverProcess = pb.start();
                processWriter =
                        new BufferedWriter(new OutputStreamWriter(serverProcess.getOutputStream()));
                processReader =
                        new BufferedReader(new InputStreamReader(serverProcess.getInputStream()));

                McpSchema.InitializeRequest initRequest =
                        new McpSchema.InitializeRequest(
                                "2024-11-05",
                                new McpSchema.ClientInfo("McpClientStdio", "1.0.0"),
                                new McpSchema.ClientCapabilities());
                McpSchema.JsonRpcRequest request =
                        new McpSchema.JsonRpcRequest(
                                requestId.getAndIncrement(), "initialize", initRequest);
                McpSchema.JsonRpcResponse response = sendRequestAndWaitForResponse(request);
                if (response.error != null) {
                    throw new McpException("Initialize failed: " + response.error.message);
                }

                McpSchema.JsonRpcNotification notification =
                        new McpSchema.JsonRpcNotification("notifications/initialized", null);
                sendNotification(notification);

                initialized.set(true);
                Console.debug(
                        Console.Color.WHITE,
                        String.format("Initialized MCP Client [%s]", name != null ? name : ""));
            } catch (McpException e) {
                Console.error(
                        Console.Color.RED,
                        String.format(
                                "Failed to initialize MCP Client [%s]: %s",
                                name != null ? name : "", e));
                throw e;
            } catch (IOException e) {
                Console.error(
                        Console.Color.RED,
                        String.format(
                                "Failed to initialize MCP Client [%s]: %s",
                                name != null ? name : "", e));
                throw new McpException("Failed to initialize MCP Client [" + name + "]", e);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /** Cleans up resources, closes the process streams, and terminates the server process. */
    @Override
    public void close() throws McpException {
        reentrantLock.lock();
        try {
            if (cleanedUp) {
                return;
            }
            try {
                if (processWriter != null) {
                    processWriter.close();
                }
                if (processReader != null) {
                    processReader.close();
                }
                if (serverProcess != null) {
                    serverProcess.destroy();
                    serverProcess.waitFor();
                }
            } catch (IOException e) {
                Console.error(
                        Console.Color.RED,
                        "ProcessWriter/ProcessReader close failed: " + e.getMessage());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Console.error(
                        Console.Color.RED, "Interrupted while waiting for serverProcess to exit.");
            }
            cleanedUp = true;
        } finally {
            initialized.set(false);
            reentrantLock.unlock();
        }
    }

    /**
     * Sends a JSON-RPC request to the server and waits for the response.
     *
     * @param request request object
     * @return the response object
     * @throws McpException if I/O fails or the server closes the connection
     */
    @Override
    protected McpSchema.JsonRpcResponse sendRequestAndWaitForResponse(
            McpSchema.JsonRpcRequest request) throws McpException {
        try {
            String requestJson = JsonUtils.OBJECT_MAPPER.writeValueAsString(request);
            processWriter.write(requestJson);
            processWriter.newLine();
            processWriter.flush();
            String responseJson = processReader.readLine();
            if (responseJson == null) {
                throw new McpException("Connection closed by server");
            }
            McpSchema.JsonRpcResponse jsonRpcResponse =
                    JsonUtils.OBJECT_MAPPER.readValue(
                            responseJson, McpSchema.JsonRpcResponse.class);
            if (!request.id.equals(jsonRpcResponse.id)) {
                throw new McpException("Invalid response ID");
            }
            return jsonRpcResponse;
        } catch (IOException e) {
            Console.error(Console.Color.RED, "Failed to send MCP response to server: " + e);
            throw new McpException("Failed to send MCP response to server", e);
        }
    }

    /**
     * Sends a JSON-RPC notification to the server (no response expected).
     *
     * @param notification notification object
     * @throws McpException if I/O fails
     */
    @Override
    protected void sendNotification(McpSchema.JsonRpcNotification notification)
            throws McpException {
        try {
            String notificationJson = JsonUtils.OBJECT_MAPPER.writeValueAsString(notification);
            processWriter.write(notificationJson);
            processWriter.newLine();
            processWriter.flush();
        } catch (IOException e) {
            Console.error(Console.Color.RED, "Failed to send MCP notification to server: " + e);
            throw new McpException("Failed to send MCP notification to server", e);
        }
    }

    /**
     * Returns connection parameters (the command and arguments).
     *
     * @return String array with command and arguments, or null if not set
     */
    public String[] getConnectionParams() {
        return connectionParams;
    }

    /**
     * Creates a builder for McpClientStdio.
     *
     * @return the builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder for McpClientStdio. */
    public static class Builder {
        protected String name;
        protected String[] connectionParams;

        /**
         * Sets the client name.
         *
         * @param name client name
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the connection command and arguments.
         *
         * @param command command and arguments
         * @return this builder
         */
        public Builder connectionParams(String... command) {
            this.connectionParams = command != null ? command.clone() : EMPTY_STRING_ARRAY;
            return this;
        }

        /**
         * Sets the connection command and arguments from a list.
         *
         * @param commandList command and arguments
         * @return this builder
         */
        public Builder connectionParams(List<String> commandList) {
            this.connectionParams =
                    commandList != null
                            ? commandList.toArray(new String[commandList.size()])
                            : EMPTY_STRING_ARRAY;
            return this;
        }

        /**
         * Builds the McpClientStdio instance.
         *
         * @return new McpClientStdio
         */
        public McpClientStdio build() {
            return new McpClientStdio(this);
        }
    }
}
