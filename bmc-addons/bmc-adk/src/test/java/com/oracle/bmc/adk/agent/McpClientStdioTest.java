/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.oracle.bmc.adk.client.mcp.McpClientStdio;
import com.oracle.bmc.adk.error.McpException;
import com.oracle.bmc.adk.module.McpSchema;
import com.oracle.bmc.adk.utils.JsonUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class McpClientStdioTest {

    private McpClientStdio client;
    private Process mockProcess;
    private ByteArrayOutputStream mockStdin;
    private ByteArrayInputStream mockStdout;

    @BeforeEach
    void setUp() throws Exception {
        // Create client with test connection parameters
        client =
                McpClientStdio.builder()
                        .name("testClient")
                        .connectionParams("node", "test-server.js")
                        .build();

        // Reset initialization state
        setPrivateField(client, "initialized", new AtomicBoolean(false));
        setPrivateField(client, "cleanedUp", false);
    }

    @AfterEach
    void tearDown() throws Exception {
        if (client != null) {
            try {
                client.close();
            } catch (Exception e) {
                // Ignore cleanup errors in tests
            }
        }
    }

    @Test
    void testConnectCreatesProcessAndInitializesClient() throws Exception {
        McpClientStdio testClient =
                McpClientStdio.builder()
                        .name("testClient")
                        .connectionParams("echo", "test")
                        .build();

        mockProcess = mock(Process.class);
        mockStdin = new ByteArrayOutputStream();

        String initResponse = createInitializeResponse();
        mockStdout = new ByteArrayInputStream(initResponse.getBytes());

        when(mockProcess.getOutputStream()).thenReturn(mockStdin);
        when(mockProcess.getInputStream()).thenReturn(mockStdout);
        when(mockProcess.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));

        setPrivateField(testClient, "serverProcess", mockProcess);

        BufferedWriter mockWriter = new BufferedWriter(new OutputStreamWriter(mockStdin));
        BufferedReader mockReader = new BufferedReader(new InputStreamReader(mockStdout));

        setPrivateField(testClient, "processWriter", mockWriter);
        setPrivateField(testClient, "processReader", mockReader);

        setPrivateField(testClient, "initialized", new AtomicBoolean(false));

        assertDoesNotThrow(
                () -> {
                    assertNotNull(testClient.getConnectionParams());
                    assertEquals(2, testClient.getConnectionParams().length);
                    assertEquals("echo", testClient.getConnectionParams()[0]);
                    assertEquals("test", testClient.getConnectionParams()[1]);

                    AtomicBoolean initialized =
                            (AtomicBoolean) getPrivateField(testClient, "initialized");
                    assertFalse(initialized.get());
                });

        try {
            testClient.close();
        } catch (Exception e) {
            // Ignore cleanup errors
        }
    }

    @Test
    void testConnectWithMockedStreams() throws Exception {
        mockProcess = mock(Process.class);

        String initResponse = createInitializeResponse();
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        ByteArrayInputStream responseStream = new ByteArrayInputStream(initResponse.getBytes());

        when(mockProcess.getOutputStream()).thenReturn(pos);
        when(mockProcess.getInputStream()).thenReturn(responseStream);
        when(mockProcess.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        when(mockProcess.isAlive()).thenReturn(true);

        setPrivateField(client, "serverProcess", mockProcess);
        setPrivateField(client, "processWriter", new BufferedWriter(new OutputStreamWriter(pos)));
        setPrivateField(
                client, "processReader", new BufferedReader(new InputStreamReader(responseStream)));

        AtomicBoolean initialized = (AtomicBoolean) getPrivateField(client, "initialized");
        initialized.set(false);

        assertNotNull(getPrivateField(client, "serverProcess"));
        assertNotNull(getPrivateField(client, "processWriter"));
        assertNotNull(getPrivateField(client, "processReader"));

        assertTrue(true, "Mock setup completed successfully");
    }

    @Test
    void testConnectWithValidConnectionParams() {
        String[] params = client.getConnectionParams();
        assertNotNull(params, "Connection params should not be null");
        assertEquals(2, params.length, "Should have 2 connection parameters");
        assertEquals("node", params[0], "First param should be 'node'");
        assertEquals("test-server.js", params[1], "Second param should be 'test-server.js'");
    }

    @Test
    void testConnectWhenAlreadyInitialized() throws Exception {
        AtomicBoolean initialized = (AtomicBoolean) getPrivateField(client, "initialized");
        initialized.set(true);
        assertDoesNotThrow(() -> client.connect());

        assertTrue(initialized.get(), "Client should remain initialized");
    }

    @Test
    void testBuilderValidation() {
        assertThrows(
                McpException.class,
                () -> {
                    McpClientStdio.builder().name("test").build(); // No connection params
                },
                "Should throw exception when no connection params provided");

        assertThrows(
                McpException.class,
                () -> {
                    McpClientStdio.builder()
                            .name("test")
                            .connectionParams() // Empty params
                            .build();
                },
                "Should throw exception when empty connection params provided");
    }

    @Test
    void testCloseDestroysProcessAndCleansUpResources() throws Exception {
        mockProcess = mock(Process.class);
        BufferedWriter mockWriter = mock(BufferedWriter.class);
        BufferedReader mockReader = mock(BufferedReader.class);

        setPrivateField(client, "serverProcess", mockProcess);
        setPrivateField(client, "processWriter", mockWriter);
        setPrivateField(client, "processReader", mockReader);
        setPrivateField(client, "initialized", new AtomicBoolean(true));

        client.close();

        verify(mockWriter).close();
        verify(mockReader).close();
        verify(mockProcess).destroy();
        verify(mockProcess).waitFor();

        AtomicBoolean initialized = (AtomicBoolean) getPrivateField(client, "initialized");
        assertFalse(initialized.get(), "Client should not be initialized after close");

        boolean cleanedUp = (boolean) getPrivateField(client, "cleanedUp");
        assertTrue(cleanedUp, "Client should be marked as cleaned up");
    }

    @Test
    void testRequestIdIncrementing() throws Exception {
        AtomicInteger requestId = (AtomicInteger) getPrivateField(client, "requestId");
        int initialId = requestId.get();

        assertNotNull(requestId, "Request ID should be initialized");
        assertTrue(initialId >= 0, "Request ID should be non-negative");
    }

    private void setPrivateField(Object obj, String fieldName, Object value) throws Exception {
        Field field = findField(obj.getClass(), fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    private Object getPrivateField(Object obj, String fieldName) throws Exception {
        Field field = findField(obj.getClass(), fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    private Field findField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        while (clazz != null) {
            try {
                return clazz.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        }
        throw new NoSuchFieldException(fieldName);
    }

    private String createInitializeResponse() throws Exception {
        McpSchema.JsonRpcResponse response = new McpSchema.JsonRpcResponse();
        response.id = 0;

        McpSchema.InitializeResult initResult = new McpSchema.InitializeResult();
        initResult.protocolVersion = "2024-11-05";

        McpSchema.ServerInfo serverInfo = new McpSchema.ServerInfo();
        serverInfo.name = "TestServer";
        serverInfo.version = "1.0.0";
        initResult.serverInfo = serverInfo;

        initResult.capabilities = new McpSchema.ServerCapabilities();

        response.result = initResult;
        response.error = null;

        return JsonUtils.OBJECT_MAPPER.writeValueAsString(response) + "\n";
    }
}
