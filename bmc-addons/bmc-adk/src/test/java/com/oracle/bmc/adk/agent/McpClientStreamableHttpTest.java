/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.oracle.bmc.adk.client.mcp.McpClientStreamableHttp;
import com.oracle.bmc.adk.error.McpException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class McpClientStreamableHttpTest {

    private McpClientStreamableHttp client;

    @BeforeEach
    void setUp() throws MalformedURLException {
        client =
                com.oracle.bmc.adk.client.mcp.McpClientStreamableHttp.builder()
                        .name("testHttpClient")
                        .url(new URL("http://localhost:8080/mcp"))
                        .timeoutInMillis(10000)
                        .headers(new HashMap<>())
                        .build();
    }

    @Test
    void testBuildWithoutParamsThrows() {
        Exception ex =
                assertThrows(
                        IllegalArgumentException.class,
                        () ->
                                com.oracle.bmc.adk.client.mcp.McpClientStreamableHttp.builder()
                                        .name("test")
                                        .build());

        assertTrue(ex.getMessage().contains("URL must be provided"));
    }

    @Test
    void testBuildWithTimeoutParam() {
        assertEquals(10000, client.getTimeoutInMillis());
    }

    @Test
    void testBuildWithoutTimeoutParam() throws MalformedURLException {
        client =
                com.oracle.bmc.adk.client.mcp.McpClientStreamableHttp.builder()
                        .name("testHttpClient")
                        .url(new URL("http://localhost:8080/mcp"))
                        .headers(new HashMap<>())
                        .build();
        assertEquals(30000, client.getTimeoutInMillis());
    }

    @Test
    void testConnectHandlesServerError() throws Exception {
        HttpURLConnection mockConn = mock(HttpURLConnection.class);
        // Simulate a non-200 response
        when(mockConn.getResponseCode()).thenReturn(500);
        when(mockConn.getErrorStream()).thenReturn(new ByteArrayInputStream("error!".getBytes()));

        // Use reflection to inject mock connection method
        setPrivateMethod(client, "createHttpConnection", (url, method) -> mockConn);

        Exception ex = assertThrows(McpException.class, client::connect);
        assertTrue(ex.getMessage().contains("Failed to connect"));
    }

    @Test
    void testCloseWhenNoSessionId() {
        assertDoesNotThrow(() -> client.close());
    }

    private interface HttpConnectionFactory {
        HttpURLConnection create(URL url, String method) throws Exception;
    }

    private void setPrivateField(Object obj, String name, Object value) throws Exception {
        Class<?> c = obj.getClass();
        while (c != null) {
            try {
                java.lang.reflect.Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                f.set(obj, value);
                return;
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    private void setPrivateMethod(
            McpClientStreamableHttp client, String methodName, HttpConnectionFactory factory)
            throws Exception {
        java.lang.reflect.Method m =
                McpClientStreamableHttp.class.getDeclaredMethod(
                        "createHttpConnection", URL.class, String.class);
        m.setAccessible(true);
        InvocationHandler proxy =
                (InvocationHandler)
                        (proxy1, method, args) -> {
                            if (method.getName().equals("createHttpConnection")) {
                                return factory.create((URL) args[0], (String) args[1]);
                            }
                            return method.invoke(proxy1, args);
                        };
    }
}
