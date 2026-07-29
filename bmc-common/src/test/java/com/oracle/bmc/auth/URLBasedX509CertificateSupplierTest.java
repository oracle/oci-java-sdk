/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.util.StreamUtils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestFilter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class URLBasedX509CertificateSupplierTest {
    private static final String CONFIGURED_HEADER = "x-configured";

    @Test
    public void testClientConfiguratorUsedForHttpResourceFetches() throws Exception {
        String certificate = readResource("x509_cert.pem");
        String privateKey = readResource("pkcs1_decrypted_private_key.pem");
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        AtomicInteger configuredRequests = new AtomicInteger(0);
        server.createContext(
                "/cert.pem",
                exchange -> writeConfiguredResponse(exchange, certificate, configuredRequests));
        server.createContext(
                "/key.pem",
                exchange -> writeConfiguredResponse(exchange, privateKey, configuredRequests));
        server.start();
        try {
            int port = server.getAddress().getPort();
            URLBasedX509CertificateSupplier supplier =
                    new URLBasedX509CertificateSupplier(
                            new URL("http://localhost:" + port + "/cert.pem"),
                            new URL("http://localhost:" + port + "/key.pem"),
                            (char[]) null,
                            new HeaderClientConfigurator());

            assertNotNull(supplier.getCertificateAndKeyPair().getCertificate());
            assertNotNull(supplier.getCertificateAndKeyPair().getPrivateKey());
            assertEquals(2, configuredRequests.get());
        } finally {
            server.stop(0);
        }
    }

    private static String readResource(String resourceName) throws IOException {
        try (InputStream stream =
                URLBasedX509CertificateSupplierTest.class
                        .getClassLoader()
                        .getResourceAsStream(resourceName)) {
            return StreamUtils.toString(stream, StandardCharsets.UTF_8);
        }
    }

    private static void writeConfiguredResponse(
            HttpExchange exchange, String body, AtomicInteger configuredRequests)
            throws IOException {
        if ("true".equals(exchange.getRequestHeaders().getFirst(CONFIGURED_HEADER))) {
            configuredRequests.incrementAndGet();
            writeResponse(exchange, 200, body);
        } else {
            writeResponse(exchange, 500, "missing configured header");
        }
    }

    private static void writeResponse(HttpExchange exchange, int status, String body)
            throws IOException {
        byte[] response = body.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(status, response.length);
        exchange.getResponseBody().write(response);
        exchange.close();
    }

    private static class HeaderClientConfigurator implements ClientConfigurator {
        @Override
        public void customizeBuilder(ClientBuilder builder) {}

        @Override
        public void customizeClient(Client client) {
            client.register(
                    (ClientRequestFilter)
                            requestContext ->
                                    requestContext.getHeaders().add(CONFIGURED_HEADER, "true"));
        }
    }
}
