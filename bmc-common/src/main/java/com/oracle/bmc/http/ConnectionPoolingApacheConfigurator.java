/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.NoopUserTokenHandler;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;
import org.glassfish.jersey.apache.connector.ApacheHttpClientBuilderConfigurator;
import org.glassfish.jersey.client.ClientRequest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * {@link ApacheConfigurator} configurator that applies connection-pool friendly defaults for the
 * Jersey Apache connector.
 * <p>
 * It requires an {@link ApacheConnectionPoolConfig} describing the desired pool size and idle timeout
 * and configures the underlying client as follows:
 * <ul>
 *     <li>forces connection pooling and applies the provided {@link ApacheConnectionPoolConfig}</li>
 *     <li>installs a keep-alive strategy that honours the server timeout header and falls back to the configured idle timeout</li>
 *     <li>works around the Apache HTTP client stream-closing race in versions prior to 4.5</li>
 *     <li>sets {@link NoopUserTokenHandler} to avoid pinning pooled connections to a user principal</li>
 * </ul>
 * <p>
 * Typical usage:
 * <pre>{@code
 * ApacheConnectionPoolConfig poolConfig =
 *         ApacheConnectionPoolConfig.builder()
 *                 .defaultMaxConnectionsPerRoute(512)
 *                 .totalOpenConnections(2_048)
 *                 .idleConnectionTimeoutInMillis(5_000L)
 *                 .build();
 *
 * ClientConfigurator configurator = new ConnectionPoolingApacheConfigurator(poolConfig);
 * }</pre>
 */
public class ConnectionPoolingApacheConfigurator extends ApacheConfigurator {

    public ConnectionPoolingApacheConfigurator(ApacheConnectionPoolConfig poolConfig) {
        super(
                apacheConnectorProperties(poolConfig),
                Arrays.asList(
                        clientConfig ->
                                clientConfig.register(
                                        (ApacheHttpClientBuilderConfigurator)
                                                httpClientBuilder -> {
                                                    httpClientBuilder.setUserTokenHandler(
                                                            NoopUserTokenHandler.INSTANCE);
                                                    return httpClientBuilder;
                                                })));
    }

    private static ApacheConnectorProperties apacheConnectorProperties(
            ApacheConnectionPoolConfig poolConfig) {

        ApacheConnectorProperties.ApacheConnectorPropertiesBuilder
                apacheConnectorPropertiesBuilder =
                        ApacheConnectorProperties.builder()
                                .connectionPooling(true)
                                .connectionPoolConfig(poolConfig);

        // Enforce closing an idle connection after the configured timeout. Without this, the Apache client keeps
        // sockets open until the server or OS closes them, which can lead to idle resource accumulation.
        apacheConnectorPropertiesBuilder.keepAliveStrategy(
                new CustomConnectionKeepAliveStrategy(
                        poolConfig.getIdleConnectionTimeoutInMillis()));

        // fixes closing contention error in the Apache HTTP Client: apache HTTP Client closes stream and connection
        // in a wrong order causing each connection to get closed despite the fact it should be kept alive.
        // So the intent here is: consume/close the entity stream (which releases the connection back to the pool)
        // but leave the CloseableHttpResponse open long enough for the pool to reuse the socket.
        if (!isApacheHttpClientGreaterThan45()) {
            apacheConnectorPropertiesBuilder.connectionClosingStrategy(
                    new ApacheConnectionClosingStrategy() {
                        @Override
                        public void close(
                                ClientRequest clientRequest,
                                HttpUriRequest httpUriRequest,
                                CloseableHttpResponse closeableHttpResponse,
                                InputStream stream)
                                throws IOException {
                            try {
                                if (stream != null) {
                                    stream.close();
                                }
                            } catch (IOException ex) {
                                // Ignore
                            }
                        }
                    });
        } else {
            apacheConnectorPropertiesBuilder.connectionClosingStrategy(
                    new ApacheConnectionClosingStrategy.GracefulClosingStrategy());
        }

        return apacheConnectorPropertiesBuilder.build();
    }

    private static boolean isApacheHttpClientGreaterThan45() {
        VersionInfo vi =
                VersionInfo.loadVersionInfo(
                        "org.apache.http.client", HttpClientBuilder.class.getClassLoader());
        return vi != null && vi.getRelease().compareTo("4.5") > 0;
    }

    /**
     * Keep-alive strategy that honours the server-provided timeout when present while falling back to the configured
     * default. This mirrors the behaviour in {@link CustomConnectionKeepAliveStrategy}.
     */
    public static class CustomConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {
        private final long defaultKeepAliveDurationMillis;

        public CustomConnectionKeepAliveStrategy(long defaultKeepAliveDurationMillis) {
            this.defaultKeepAliveDurationMillis = defaultKeepAliveDurationMillis;
        }

        @Override
        public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
            Args.notNull(response, "HTTP response");
            long keepAliveDuration = defaultKeepAliveDurationMillis;
            final BasicHeaderElementIterator it =
                    new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
            while (it.hasNext()) {
                final HeaderElement he = it.nextElement();
                final String param = he.getName();
                final String value = he.getValue();
                if (value != null && param.equalsIgnoreCase("timeout")) {
                    try {
                        keepAliveDuration = Long.parseLong(value) * 1000;
                        break;
                    } catch (final NumberFormatException ignore) {
                        // Ignore
                        continue;
                    }
                }
            }

            return keepAliveDuration;
        }
    }
}
