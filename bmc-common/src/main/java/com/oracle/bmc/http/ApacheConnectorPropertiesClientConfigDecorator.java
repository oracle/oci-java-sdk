/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.util.JavaRuntimeUtils;
import com.oracle.bmc.util.internal.Validate;
import javax.annotation.Nonnull;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLInitializationException;
import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.spi.ConnectorProvider;
import org.slf4j.Logger;
import javax.net.ssl.SSLContext;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApacheConnectorPropertiesClientConfigDecorator implements ClientConfigDecorator {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApacheConnectorPropertiesClientConfigDecorator.class);
    private final ApacheConnectorProperties config;

    /**
     * Creates a new {@code ApacheConnectorPropertiesClientConfigDecorator} object.
     */
    public ApacheConnectorPropertiesClientConfigDecorator(
            @Nonnull final ApacheConnectorProperties config) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        this.config = config;
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

        // Defining the connection manager takes precedence over the other default options for Connection Manager
        if (config.getConnectionManager() != null) {
            clientConfig.property(
                    ApacheClientProperties.CONNECTION_MANAGER, config.getConnectionManager());
        }
        // if connection pooling is switched on, either go for the default connection pooling config or the user
        // defined connection pooling config
        else if (config.isConnectionPooling()) {
            final Registry<ConnectionSocketFactory> registry = getRegistry();
            final Map.Entry<Integer, TimeUnit> ttl = config.getConnectionPoolConfig().getTtl();
            final PoolingHttpClientConnectionManager poolConnectionManager;
            if (registry != null) {
                poolConnectionManager =
                        (ttl != null)
                                ? new PoolingHttpClientConnectionManager(
                                        registry, null, null, null, ttl.getKey(), ttl.getValue())
                                : new PoolingHttpClientConnectionManager(registry);
            } else {
                poolConnectionManager =
                        (ttl != null)
                                ? new PoolingHttpClientConnectionManager(
                                        ttl.getKey(), ttl.getValue())
                                : new PoolingHttpClientConnectionManager();
            }
            poolConnectionManager.setMaxTotal(
                    config.getConnectionPoolConfig().getTotalOpenConnections());
            poolConnectionManager.setDefaultMaxPerRoute(
                    config.getConnectionPoolConfig().getDefaultMaxConnectionsPerRoute());
            clientConfig.property(ApacheClientProperties.CONNECTION_MANAGER, poolConnectionManager);
        }
        // if connection pooling is disabled, create an instance of BasicHttpClientConnectionManager and use that as the
        // connection manager. BasicHttpClientConnectionManager - A connection manager for a single connection. This
        // connection manager maintains only one active connection. Even though this class is fully thread-safe it ought
        // to be used by one execution thread only, as only one thread a time can lease the connection at a time.
        // This connection manager implementation should be used inside an EJB container
        else if (!config.isConnectionPooling()) {
            BasicHttpClientConnectionManager basicHttpClientConnectionManager =
                    new BasicHttpClientConnectionManager();
            clientConfig.property(
                    ApacheClientProperties.CONNECTION_MANAGER, basicHttpClientConnectionManager);
        }

        if (config.getKeepAliveStrategy() != null) {
            clientConfig.property(
                    ApacheClientProperties.KEEPALIVE_STRATEGY, config.getKeepAliveStrategy());
        }

        if (config.getConnectionReuseStrategy() != null) {
            clientConfig.property(
                    ApacheClientProperties.REUSE_STRATEGY, config.getConnectionReuseStrategy());
        }

        if (config.getConnectionClosingStrategy() != null) {
            clientConfig.property(
                    ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                    config.getConnectionClosingStrategy());
        }

        if (config.getRequestRetryHandler() != null) {
            clientConfig.property(
                    ApacheClientProperties.RETRY_HANDLER, config.getRequestRetryHandler());
        }

        // Disable the default behavior to auto compress and deflate the request/response content based on the
        // content-encoding.
        final RequestConfig requestConfig =
                RequestConfig.custom()
                        .setContentCompressionEnabled(false)
                        // do not add Expect: 100-Continue globally; this is done per operation in the *Converter
                        .setExpectContinueEnabled(false)
                        .build();

        clientConfig.property(ApacheClientProperties.REQUEST_CONFIG, requestConfig);

        clientConfig.property(
                ApacheClientProperties.CONNECTION_MANAGER_SHARED,
                config.isConnectionManagerShared());
    }

    private Registry<ConnectionSocketFactory> getRegistry() {
        final RegistryBuilder<ConnectionSocketFactory> registryBuilder =
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.getSocketFactory());
        Registry<ConnectionSocketFactory> registry;
        SSLConnectionSocketFactory sslConnectionSocketFactory = null;
        if (config.getSslContext() != null) {
            sslConnectionSocketFactory =
                    new SSLConnectionSocketFactory(
                            config.getSslContext(), config.getHostnameVerifier());
        }
        try {
            if (sslConnectionSocketFactory != null) {
                registry = registryBuilder.register("https", sslConnectionSocketFactory).build();
            } else {
                registry =
                        registryBuilder
                                .register("https", SSLConnectionSocketFactory.getSocketFactory())
                                .build();
            }
        } catch (SSLInitializationException e) {
            registry =
                    registryBuilder
                            .register("https", PlainConnectionSocketFactory.getSocketFactory())
                            .build();
        }
        return registry;
    }

    private SSLContext getSslContext() {
        JavaRuntimeUtils.JreVersion version = JavaRuntimeUtils.getRuntimeVersion();
        if (version == JavaRuntimeUtils.JreVersion.Java_7) {
            LOG.info("Running on 1.7 VM, manually setting security protocol to TLSv1.2");
            SSLContext sslContext =
                    SslConfigurator.newInstance(true)
                            .securityProtocol("TLSv1.2")
                            .createSSLContext();
            return sslContext;
        } else if (version == JavaRuntimeUtils.JreVersion.Unsupported) {
            LOG.error("Using an unsupported runtime only 1.7+ is supported");
        } else if (version == JavaRuntimeUtils.JreVersion.Unknown) {
            LOG.warn("Using an unknown runtime, calls may not work");
        }
        return null;
    }
}
