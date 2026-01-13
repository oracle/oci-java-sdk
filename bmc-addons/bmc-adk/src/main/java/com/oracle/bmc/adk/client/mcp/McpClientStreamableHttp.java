/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.client.mcp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.JsonUtils;
import org.apache.http.HttpStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * HTTP(S)-based implementation of the McpClient with streamable HTTP transport support.
 *
 * <p>Communicates with an MCP server over HTTP/HTTPS and supports Server-Sent Events (SSE)
 * streaming for responses.
 */
public class McpClientStreamableHttp extends McpClientBase {

    /** The prefix of the data section */
    private static final String DATA_PREFIX = "data:";

    /** The prefix of the event section */
    private static final String EVENT_PREFIX = "event:";

    /** Connection parameters including URL, endpoint, timeout, and headers. */
    protected final Map<String, String> headers;

    /** The URL of the server (with endpoint). */
    protected final URL url;

    /** HTTP read timeout in milliseconds. */
    protected final int timeoutInMillis;

    /** Current session identifier, may be null. */
    private volatile String sessionId;

    /** Lock for cleanup synchronization. */
    protected final ReentrantLock reentrantLock = new ReentrantLock();

    /**
     * Constructs an McpClientStreamableHttp from the given Builder.
     *
     * @param builder the builder instance
     */
    protected McpClientStreamableHttp(Builder builder) {
        super(builder.name);
        this.url = builder.url;
        this.timeoutInMillis = builder.timeoutInMillis;
        this.headers = builder.headers;
    }

    /**
     * Connects to the MCP server by sending an initialization request.
     *
     * @throws McpException if connection or initialization fails
     */
    @Override
    public void connect() throws McpException {
        reentrantLock.lock();
        try {
            if (initialized.get()) {
                Console.log(
                        Console.Color.WHITE,
                        String.format(
                                "McpClientStreamableHttp [%s] is already connected.",
                                name != null ? name : ""));
                return;
            }
            HttpURLConnection connection = null;
            try {
                McpSchema.InitializeRequest initRequest =
                        new McpSchema.InitializeRequest(
                                "2025-03-26",
                                new McpSchema.ClientInfo("McpClientStreamableHttp", "1.0.0"),
                                new McpSchema.ClientCapabilities());
                McpSchema.JsonRpcRequest request =
                        new McpSchema.JsonRpcRequest(
                                requestId.getAndIncrement(), "initialize", initRequest);
                String requestBody = JsonUtils.OBJECT_MAPPER.writeValueAsString(request);

                connection = createHttpConnection(url, "POST");
                setRequiredHeaders(connection);
                setOptionalHeaders(connection);

                connection.setDoOutput(true);
                try (OutputStream os = connection.getOutputStream()) {
                    os.write(requestBody.getBytes(StandardCharsets.UTF_8));
                    os.flush();
                }

                int responseCode = connection.getResponseCode();
                handleHttpErrors(responseCode, connection);

                String sessionIdHeader = connection.getHeaderField("Mcp-Session-Id");
                if (sessionIdHeader != null) {
                    this.sessionId = sessionIdHeader;
                }

                McpSchema.JsonRpcResponse jsonRpcResponse = handleSseResponse(connection);
                if (jsonRpcResponse.error != null) {
                    throw new McpException("Initialize failed: " + jsonRpcResponse.error.message);
                }

                McpSchema.JsonRpcNotification notification =
                        new McpSchema.JsonRpcNotification("notifications/initialized", null);
                sendNotification(notification);
                initialized.set(true);
            } catch (McpException e) {
                Console.error(
                        Console.Color.RED,
                        String.format(
                                "Failed to initialize MCP Streamable HTTP Client [%s]: %s",
                                name != null ? name : "", e.getMessage()));
                throw new McpException("Failed to connect McpClientStreamableHttp", e);
            } catch (JsonProcessingException e) {
                Console.error(
                        Console.Color.RED,
                        String.format(
                                "Failed to initialize MCP Streamable HTTP Client [%s] (JSON error): %s",
                                name != null ? name : "", e.getMessage()));
                throw new McpException("Failed to connect McpClientStreamableHttp (JSON error)", e);
            } catch (IOException e) {
                Console.error(
                        Console.Color.RED,
                        String.format(
                                "Failed to initialize MCP Streamable HTTP Client [%s] (I/O error): %s",
                                name != null ? name : "", e.getMessage()));
                throw new McpException("Failed to connect McpClientStreamableHttp (I/O error)", e);
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /** Releases resources, ends session, and cleans up client state. */
    @Override
    public void close() throws McpException {
        reentrantLock.lock();
        try {
            if (cleanedUp) {
                return;
            }
            if (sessionId != null) {
                terminateSession();
                sessionId = null;
            }
            cleanedUp = true;
        } finally {
            initialized.set(false);
            reentrantLock.unlock();
        }
    }

    /**
     * Sends a JSON-RPC request and waits for the streamed response using SSE.
     *
     * @param request the request object
     * @return the response object
     * @throws McpException on communication failure
     */
    @Override
    protected McpSchema.JsonRpcResponse sendRequestAndWaitForResponse(
            McpSchema.JsonRpcRequest request) throws McpException {
        HttpURLConnection connection = null;
        try {
            String requestBody = JsonUtils.OBJECT_MAPPER.writeValueAsString(request);

            connection = createHttpConnection(url, "POST");
            setRequiredHeaders(connection);
            setOptionalHeaders(connection);

            if (sessionId != null) {
                connection.setRequestProperty("Mcp-Session-Id", sessionId);
            }

            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                os.write(requestBody.getBytes(StandardCharsets.UTF_8));
                os.flush();
            }

            int responseCode = connection.getResponseCode();
            handleHttpErrors(responseCode, connection);

            McpSchema.JsonRpcResponse jsonRpcResponse = handleSseResponse(connection);
            if (!request.id.equals(jsonRpcResponse.id)) {
                throw new McpException("Invalid response ID");
            }
            return jsonRpcResponse;
        } catch (JsonProcessingException e) {
            Console.error(
                    Console.Color.RED, "Failed to serialize request to JSON: " + e.getMessage());
            throw new McpException("Failed to serialize request to JSON", e);
        } catch (IOException e) {
            Console.error(Console.Color.RED, "I/O error during HTTP request: " + e.getMessage());
            throw new McpException("I/O error during HTTP request", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * Handles HTTP errors based on the response code from the server.
     *
     * <p>This method checks the HTTP response code and throws an {@link McpException} with a
     * descriptive message based on the error type. It handles specific cases for session expiration
     * (404), server errors (5xx), and other client errors or unexpected status codes.
     *
     * @param responseCode the HTTP response code received from the server
     * @param connection the {@link HttpURLConnection} object used for the request
     * @throws McpException if an HTTP error occurs, with a message describing the error
     * @throws IOException if an I/O error occurs while reading the error stream from the connection
     */
    private void handleHttpErrors(int responseCode, HttpURLConnection connection)
            throws McpException, IOException {
        if (responseCode == HttpStatus.SC_OK || responseCode == HttpStatus.SC_ACCEPTED) {
            return; // Success, no error handling needed
        }

        String errorBody = readErrorStream(connection);

        if (responseCode == 404 && sessionId != null) {
            close();
            throw new McpException("Session expired, please reconnect");
        }

        // 5xx errors often indicate server issues or server doesn't exist
        if (responseCode >= 500 && responseCode < 600) {
            // Reset session state as server might be unreachable/restarted
            if (sessionId != null) {
                close();
            }
            throw new McpException(
                    "Server error (status: "
                            + responseCode
                            + "), server may be unavailable. Body: "
                            + errorBody);
        }

        // Other client errors (4xx) or unexpected status codes
        throw new McpException(
                "HTTP request failed with status: " + responseCode + ", body: " + errorBody);
    }

    /**
     * Reads and parses a server-sent event stream (SSE) for a JSON-RPC response.
     *
     * @param connection open HTTP connection
     * @return JsonRpcResponse parsed from stream
     * @throws McpException on parsing or I/O error
     */
    private McpSchema.JsonRpcResponse handleSseResponse(HttpURLConnection connection)
            throws McpException {
        try (BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                connection.getInputStream(), StandardCharsets.UTF_8))) {

            String line;
            StringBuilder data = new StringBuilder();
            McpSchema.JsonRpcResponse finalResponse = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(EVENT_PREFIX)) {
                    // event type unused
                } else if (line.startsWith(DATA_PREFIX)) {
                    String dataLine = line.substring(DATA_PREFIX.length()).trim();
                    if (data.length() > 0) {
                        data.append(System.lineSeparator());
                    }
                    data.append(dataLine);
                } else if (line.isEmpty()) {
                    if (data.length() > 0) {
                        McpSchema.JsonRpcResponse response =
                                JsonUtils.OBJECT_MAPPER.readValue(
                                        data.toString(), McpSchema.JsonRpcResponse.class);
                        if (response.id != null) {
                            finalResponse = response;
                        }
                        data.setLength(0);
                    }
                }
            }
            if (finalResponse == null) {
                throw new McpException("No valid response received from SSE stream");
            }
            return finalResponse;
        } catch (IOException e) {
            throw new McpException("I/O error while reading SSE response", e);
        }
    }

    /**
     * Sends a JSON-RPC notification to the MCP server.
     *
     * @param notification notification object
     * @throws McpException on I/O error
     */
    @Override
    protected void sendNotification(McpSchema.JsonRpcNotification notification)
            throws McpException {
        HttpURLConnection connection = null;
        try {
            String requestBody = JsonUtils.OBJECT_MAPPER.writeValueAsString(notification);
            connection = createHttpConnection(url, "POST");
            setRequiredHeaders(connection);
            setOptionalHeaders(connection);
            if (sessionId != null) {
                connection.setRequestProperty("Mcp-Session-Id", sessionId);
            }
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                os.write(requestBody.getBytes(StandardCharsets.UTF_8));
                os.flush();
            }
            int responseCode = connection.getResponseCode();
            handleHttpErrors(responseCode, connection);
        } catch (JsonProcessingException e) {
            throw new McpException("Failed to serialize notification", e);
        } catch (IOException e) {
            throw new McpException("I/O error when sending notification", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /** Sends a DELETE request to terminate the current session, if active. */
    private void terminateSession() throws McpException {
        if (sessionId == null) {
            return;
        }
        HttpURLConnection connection = null;
        try {
            connection = createHttpConnection(url, "DELETE");
            if (sessionId != null) {
                connection.setRequestProperty("Mcp-Session-Id", sessionId);
            }
            connection.getResponseCode();
        } catch (IOException e) {
            Console.error(Console.Color.YELLOW, "Failed to terminate session: " + e.getMessage());
            throw new McpException("Failed to terminate session", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * Sets required HTTP headers for all requests.
     *
     * @param connection HTTP connection
     */
    private void setRequiredHeaders(HttpURLConnection connection) {
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json, text/event-stream");
    }

    /**
     * Sets optional/custom HTTP headers, skipping Content-Type and Accept.
     *
     * @param connection HTTP connection
     */
    private void setOptionalHeaders(HttpURLConnection connection) {
        if (this.headers != null) {
            for (Map.Entry<String, String> header : this.headers.entrySet()) {
                String key = header.getKey();
                if (!"Content-Type".equalsIgnoreCase(key) && !"Accept".equalsIgnoreCase(key)) {
                    connection.setRequestProperty(key, header.getValue());
                }
            }
        }
    }

    /**
     * Creates an HTTP or HTTPS connection for the given URL with the specified method.
     *
     * @param url target URL
     * @param method HTTP method
     * @return configured HttpURLConnection
     * @throws McpException on connection error
     */
    private HttpURLConnection createHttpConnection(URL url, String method) throws McpException {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(timeoutInMillis);
            connection.setUseCaches(false);
            return connection;
        } catch (IOException e) {
            throw new McpException("Failed to open HTTP connection to " + url, e);
        }
    }

    /**
     * Reads the error stream from an HTTP connection and returns its content as a string.
     *
     * @param connection HTTP connection
     * @return error message body, or empty if none
     * @throws IOException on I/O error
     */
    private String readErrorStream(HttpURLConnection connection) throws IOException {
        InputStream errorStream = connection.getErrorStream();
        if (errorStream == null) {
            return "";
        }
        try (BufferedReader reader =
                new BufferedReader(new InputStreamReader(errorStream, StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }

    /**
     * Returns the current MCP session identifier.
     *
     * @return session ID or null
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Returns the HTTP read timeout in milliseconds used for this MCP client.
     *
     * <p>The timeout value is set during the construction of the {@link McpClientStreamableHttp}
     * instance via the {@link Builder#timeoutInMillis(Integer)} method. If not explicitly set, it
     * defaults to 30 seconds (30000 ms).
     *
     * @return the HTTP read timeout in milliseconds
     */
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * Returns a new builder for McpClientStreamableHttp.
     *
     * @return builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder for McpClientStreamableHttp. */
    public static class Builder {
        protected String name;
        protected URL url;
        protected Integer timeoutInMillis;
        protected Map<String, String> headers;

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
         * Sets the server base URL.
         *
         * @param url server base URL
         * @return this builder
         */
        public Builder url(URL url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the read timeout in milliseconds.
         *
         * @param timeoutInMillis read timeout (ms)
         * @return this builder
         */
        public Builder timeoutInMillis(Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            return this;
        }

        /**
         * Sets the custom headers.
         *
         * @param headers custom headers
         * @return this builder
         */
        public Builder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Builds the McpClientStreamableHttp instance.
         *
         * @return new McpClientStreamableHttp
         */
        public McpClientStreamableHttp build() {
            if (url == null) {
                throw new IllegalArgumentException("URL must be provided");
            }
            // Apply default values if not set
            timeoutInMillis = timeoutInMillis != null ? timeoutInMillis : 30000;
            Console.debug(
                    Console.Color.YELLOW,
                    "Building McpClientStreamableHttp with Timeout: " + timeoutInMillis);
            headers = headers != null ? headers : Collections.emptyMap();

            return new McpClientStreamableHttp(this);
        }
    }
}
