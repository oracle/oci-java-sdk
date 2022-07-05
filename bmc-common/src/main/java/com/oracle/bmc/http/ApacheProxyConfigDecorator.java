/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.util.internal.Validate;
import javax.annotation.Nonnull;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.spi.ConnectorProvider;
import org.slf4j.Logger;

/**
 * A {@code ClientConfigDecorator} implementation that configures an HTTP or HTTPS proxy for the specific client instance.
 */
public class ApacheProxyConfigDecorator implements ClientConfigDecorator {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApacheProxyConfigDecorator.class);
    private final ApacheProxyConfig proxyConfig;

    /**
     * Creates a new {@code ApacheProxyConfigDecorator} object.
     *
     * @param proxyConfig the proxy configuration
     */
    public ApacheProxyConfigDecorator(@Nonnull final ApacheProxyConfig proxyConfig) {
        if (proxyConfig == null) {
            throw new java.lang.NullPointerException("proxyConfig is marked non-null but is null");
        }
        this.proxyConfig = proxyConfig;
    }

    /**
     * Customizes the client configuration for specifying a proxy to connect to for client operations.
     * {@inheritDoc}
     */
    @Override
    public void customizeClientConfig(final ClientConfig clientConfig) {
        Validate.notNull(clientConfig, "ClientConfig must not be null");

        // Fetch the provider reference from the config
        final ConnectorProvider provider = clientConfig.getConnectorProvider();
        // Only configure ApacheConnectorProvider types
        Validate.isInstanceOf(
                ApacheConnectorProvider.class,
                provider,
                String.format(
                        "ConnectorProvider of type [%s] is not supported. Expected ApacheConnectorProvider",
                        provider.getClass().getCanonicalName()));

        if (!proxyConfig.isConfiguredAndValid()) {
            LOG.info("Invalid proxy configuration.  Not configuring a proxy.");
            return;
        }
        LOG.debug("ApacheProxyConfig: {}", proxyConfig);

        final String proxyUri = proxyConfig.getUri();
        LOG.info("Configuring proxy for ApacheConnectorProvider to connect to {}", proxyUri);

        clientConfig.property(ClientProperties.PROXY_URI, proxyUri);
        configureAuth(clientConfig, proxyConfig);
    }

    private static void configureAuth(
            final ClientConfig clientConfig, final ApacheProxyConfig proxyConfig) {
        final String username = proxyConfig.getUsername();
        final String password = proxyConfig.getPassword();

        if (username == null || password == null) {
            LOG.info(
                    "Either username or password is null. Not configuring auth credentials for the proxy");
        } else {
            LOG.info("Configuring auth credentials for the proxy");
            clientConfig.property(ClientProperties.PROXY_USERNAME, username);
            clientConfig.property(ClientProperties.PROXY_PASSWORD, password);
        }
    }
}
