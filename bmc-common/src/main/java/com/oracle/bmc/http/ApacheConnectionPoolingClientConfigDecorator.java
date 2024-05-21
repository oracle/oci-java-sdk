/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.util.internal.Validate;
import javax.annotation.Nonnull;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.spi.ConnectorProvider;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A {@code ClientConfigDecorator} implementation that configure a connection pool for the client for a given
 * {@code ApacheConnectionPoolConfig}.
 *
 * @see ApacheConnectionPoolConfig
 */
public class ApacheConnectionPoolingClientConfigDecorator implements ClientConfigDecorator {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApacheConnectionPoolingClientConfigDecorator.class);
    private final ApacheConnectionPoolConfig config;
    private PoolingHttpClientConnectionManager poolConnectionManager;

    /**
     * Creates a new {@code ApacheConnectionPoolingClientConfigDecorator} object.
     */
    public ApacheConnectionPoolingClientConfigDecorator(
            @Nonnull final ApacheConnectionPoolConfig config) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        this.config = config;
    }

    /**
     * Gets the underlying {@code PoolingHttpClientConnectionManager} for the
     * {@code ApacheConnectionPoolingClientConfigDecorator}.  If the client has yet to be initialized and configured,
     * then the {@code PoolingHttpClientConnectionManager} can be {@code null}.
     *
     * @return the configured PoolingHttpClientConnectionManager
     */
    public PoolingHttpClientConnectionManager getPoolingHttpClientConnectionManager() {
        return poolConnectionManager;
    }

    @Override
    public void customizeClientConfig(ClientConfig clientConfig) {
        Validate.notNull(clientConfig, "ClientConfig must not be null");

        // Only configure ApacheConnectorProvider types
        final ConnectorProvider provider = clientConfig.getConnectorProvider();
        Validate.isInstanceOf(
                ApacheConnectorProvider.class,
                provider,
                String.format(
                        "ConnectorProvider of type [%s] is not supported. Expected ApacheConnectorProvider",
                        provider.getClass().getCanonicalName()));

        LOG.info("ApacheConnectionPoolConfig: {}", config);

        final Map.Entry<Integer, TimeUnit> ttl = config.getTtl();
        poolConnectionManager =
                (ttl != null)
                        ? new PoolingHttpClientConnectionManager(ttl.getKey(), ttl.getValue())
                        : new PoolingHttpClientConnectionManager();
        poolConnectionManager.setMaxTotal(config.getTotalOpenConnections());
        poolConnectionManager.setDefaultMaxPerRoute(config.getDefaultMaxConnectionsPerRoute());

        clientConfig.property(ApacheClientProperties.CONNECTION_MANAGER, poolConnectionManager);
    }
}
