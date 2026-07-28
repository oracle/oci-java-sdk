/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;
import com.oracle.bmc.http.ClientConfigurator;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestFilter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAbstractFederationClientAuthenticationDetailsProviderBuilder {
    private static final String CONFIGURED_HEADER = "x-configured";

    @Test
    public void testMetadataClientConfiguratorUsedForRegionLookup() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        AtomicInteger configuredRequests = new AtomicInteger(0);
        server.createContext(
                "/opc/v2/instance/region",
                exchange -> {
                    if ("true".equals(exchange.getRequestHeaders().getFirst(CONFIGURED_HEADER))) {
                        configuredRequests.incrementAndGet();
                        writeResponse(exchange, 200, "us-ashburn-1");
                    } else {
                        writeResponse(exchange, 500, "missing configured header");
                    }
                });
        server.start();
        try {
            TestBuilder builder =
                    new TestBuilder()
                            .metadataBaseUrl(
                                    "http://localhost:"
                                            + server.getAddress().getPort()
                                            + "/opc/v2/")
                            .federationClientMetadataConfigurator(new HeaderClientConfigurator());

            assertTrue(builder.detectEndpoint().contains(Region.US_ASHBURN_1.getRegionId()));
            assertEquals(Region.US_ASHBURN_1, builder.getRegion());
            assertEquals(2, configuredRequests.get());
        } finally {
            server.stop(0);
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

    private static class TestBuilder
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    TestBuilder, TestProvider> {
        String detectEndpoint() {
            return autoDetectEndpointUsingMetadataUrl();
        }

        @Override
        protected TestProvider buildProvider(SessionKeySupplier sessionKeySupplierToUse) {
            return new TestProvider();
        }
    }

    private static class TestProvider implements AbstractAuthenticationDetailsProvider {}
}
