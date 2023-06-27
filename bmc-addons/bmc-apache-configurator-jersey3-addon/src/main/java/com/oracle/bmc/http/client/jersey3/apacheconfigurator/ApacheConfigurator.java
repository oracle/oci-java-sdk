/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.apacheconfigurator;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import jakarta.annotation.Nonnull;
import javax.net.ssl.SSLContext;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey3.ApacheClientProperties;
import com.oracle.bmc.util.JavaRuntimeUtils;
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
import org.slf4j.Logger;

/**
 * A {@code ClientConfigurator} implementation that uses the Apache HTTP Connector Provider for the
 * Jersey Client configuration. This enables support for connection pooling in addition to
 * per-client HTTP(S) proxy support.
 *
 * <p>This is, for the most part, a replacement for {@link com.oracle.bmc.http.ApacheConfigurator}.
 *
 * <p>Note: Use of the ApacheConnectorProvider will buffer requests into memory and can impact
 * memory utilization within your application. To avoid buffering of requests in memory, please use
 * ApacheConfigurator.NonBuffering Apache Configurator by default configures a connection pool with
 * default values for defaultMaxConnectionsPerRoute and maximum open connections. Please make sure
 * to close all InputStreams obtained from the response object by calling close on the stream
 * object. For example - GetObjectResponse.getInputStream().close or try-with-resources. Otherwise,
 * the connection is not released from the pool and results in hanging for an indefinite time.
 */
public class ApacheConfigurator implements ClientConfigurator {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ApacheConfigurator.class);

    /** Getter for ApacheConnectorProperties for the Apache Connection * */
    protected ApacheConnectorProperties apacheConnectorProperties;

    /** Creates a new {@code ApacheConfigurator} object. */
    public ApacheConfigurator() {
        this.apacheConnectorProperties = ApacheConnectorProperties.builder().build();
    }

    /**
     * Creates a new {@code ApacheConfigurator} object and sets the {@code
     * ApacheConnectorProperties}
     */
    public ApacheConfigurator(@Nonnull final ApacheConnectorProperties apacheConnectorProperties) {
        if (apacheConnectorProperties == null) {
            throw new NullPointerException(
                    "apacheConnectorProperties is marked non-null but is null");
        }
        this.apacheConnectorProperties = apacheConnectorProperties;
    }

    @Override
    public void customizeClient(HttpClientBuilder builder) {
        builder.property(StandardClientProperties.BUFFER_REQUEST, false);

        // Apache Configurator by default configures a connection pool with
        // defaultMaxConnectionsPerRoute and
        // maximum open connections. Please make sure to close all InputStreams obtained from the
        // response object by
        // calling close on the stream object. For example -
        // GetObjectResponse.getInputStream().close
        // or
        // try-with-resources. Otherwise, the connection is not released from the pool and results
        // in hanging for
        // an indefinite time

        setApacheConnectorProperties(builder);

        setSslContext(builder);
    }

    /**
     * Sets the SSL context on the builder.
     *
     * <p>Separate so subclasses can call if desired.
     *
     * @param builder The client builder to use.
     */
    protected void setSslContext(HttpClientBuilder builder) {
        JavaRuntimeUtils.JreVersion version = JavaRuntimeUtils.getRuntimeVersion();
        if (version == JavaRuntimeUtils.JreVersion.Java_7) {
            LOG.info("Running on 1.7 VM, manually setting security protocol to TLSv1.2");
            SSLContext sslContext =
                    SslConfigurator.newInstance(true)
                            .securityProtocol("TLSv1.2")
                            .createSSLContext();
            builder.property(StandardClientProperties.SSL_CONTEXT, sslContext);
        } else if (version == JavaRuntimeUtils.JreVersion.Unsupported) {
            LOG.error("Using an unsupported runtime only 1.7+ is supported");
        } else if (version == JavaRuntimeUtils.JreVersion.Unknown) {
            LOG.warn("Using an unknown runtime, calls may not work");
        }
    }

    public ApacheConnectorProperties getApacheConnectorProperties() {
        return this.apacheConnectorProperties;
    }

    public static class NonBuffering extends ApacheConfigurator {

        public NonBuffering() {
            super();
        }

        public NonBuffering(@Nonnull final ApacheConnectorProperties apacheConnectorProperties) {
            if (apacheConnectorProperties == null) {
                throw new NullPointerException(
                        "apacheConnectorProperties is marked non-null but is null");
            }
            this.apacheConnectorProperties = apacheConnectorProperties;
        }

        @Override
        public void customizeClient(HttpClientBuilder builder) {
            super.customizeClient(builder);
            builder.property(StandardClientProperties.BUFFER_REQUEST, false);
        }
    }

    protected void setApacheConnectorProperties(HttpClientBuilder builder) {
        if (apacheConnectorProperties == null) {
            return;
        }
        // Only configure ApacheConnectorProvider types
        // TODO: DEX-14784 - can we add a check here so this is only used with Jersey 2?
        /*
        final ConnectorProvider provider = builder.getConnectorProvider();
        Validate.isInstanceOf(
                ApacheConnectorProvider.class,
                provider,
                String.format(
                        "ConnectorProvider of type [%s] is not supported. Expected ApacheConnectorProvider",
                        provider.getClass().getCanonicalName()));
         */

        // Defining the connection manager takes precedence over the other default options for
        // Connection Manager
        if (apacheConnectorProperties.getConnectionManager() != null) {
            builder.property(
                    ApacheClientProperties.CONNECTION_MANAGER,
                    apacheConnectorProperties.getConnectionManager());
        }
        // if connection pooling is switched on, either go for the default connection pooling config
        // or the user
        // defined connection pooling config
        else if (apacheConnectorProperties.isConnectionPooling()) {
            final Registry<ConnectionSocketFactory> registry = getRegistry();
            final Map.Entry<Integer, TimeUnit> ttl =
                    apacheConnectorProperties.getConnectionPoolConfig().getTtl();
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
                    apacheConnectorProperties.getConnectionPoolConfig().getTotalOpenConnections());
            poolConnectionManager.setDefaultMaxPerRoute(
                    apacheConnectorProperties
                            .getConnectionPoolConfig()
                            .getDefaultMaxConnectionsPerRoute());
            builder.property(ApacheClientProperties.CONNECTION_MANAGER, poolConnectionManager);
        }
        // if connection pooling is disabled, create an instance of BasicHttpClientConnectionManager
        // and use that as the
        // connection manager. BasicHttpClientConnectionManager - A connection manager for a single
        // connection. This
        // connection manager maintains only one active connection. Even though this class is fully
        // thread-safe it ought
        // to be used by one execution thread only, as only one thread a time can lease the
        // connection at a time.
        // This connection manager implementation should be used inside an EJB container
        else if (!apacheConnectorProperties.isConnectionPooling()) {
            BasicHttpClientConnectionManager basicHttpClientConnectionManager =
                    new BasicHttpClientConnectionManager();
            builder.property(
                    ApacheClientProperties.CONNECTION_MANAGER, basicHttpClientConnectionManager);
        }

        if (apacheConnectorProperties.getKeepAliveStrategy() != null) {
            builder.property(
                    ApacheClientProperties.KEEPALIVE_STRATEGY,
                    apacheConnectorProperties.getKeepAliveStrategy());
        }

        if (apacheConnectorProperties.getConnectionReuseStrategy() != null) {
            builder.property(
                    ApacheClientProperties.REUSE_STRATEGY,
                    apacheConnectorProperties.getConnectionReuseStrategy());
        }

        if (apacheConnectorProperties.getConnectionClosingStrategy() != null) {
            builder.property(
                    ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                    apacheConnectorProperties.getConnectionClosingStrategy());
        }

        if (apacheConnectorProperties.getRequestRetryHandler() != null) {
            builder.property(
                    ApacheClientProperties.RETRY_HANDLER,
                    apacheConnectorProperties.getRequestRetryHandler());
        }

        // Disable the default behavior to auto compress and deflate the request/response content
        // based on the
        // content-encoding.
        final RequestConfig requestConfig =
                RequestConfig.custom()
                        .setContentCompressionEnabled(false)
                        // do not add Expect: 100-Continue globally; this is done per operation in
                        // the *Converter
                        .setExpectContinueEnabled(false)
                        .build();

        builder.property(ApacheClientProperties.REQUEST_CONFIG, requestConfig);

        builder.property(
                ApacheClientProperties.CONNECTION_MANAGER_SHARED,
                apacheConnectorProperties.isConnectionManagerShared());
    }

    private Registry<ConnectionSocketFactory> getRegistry() {
        final RegistryBuilder<ConnectionSocketFactory> registryBuilder =
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.getSocketFactory());
        Registry<ConnectionSocketFactory> registry;
        SSLConnectionSocketFactory sslConnectionSocketFactory = null;
        if (apacheConnectorProperties.getSslContext() != null) {
            sslConnectionSocketFactory =
                    new SSLConnectionSocketFactory(
                            apacheConnectorProperties.getSslContext(),
                            apacheConnectorProperties.getHostnameVerifier());
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
}
