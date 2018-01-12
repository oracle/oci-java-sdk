/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import com.oracle.bmc.util.JavaRuntimeUtils;
import com.oracle.bmc.util.JavaRuntimeUtils.JreVersion;

import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.client.RequestEntityProcessing;

/**
 * DefaultConfigurator handles basic configuration of clients under different
 * environments. This is the configurator used by the REST client factory when
 * no configurator is provided by the SDK user.
 * <p>
 * It currently does the following:
 * <ul>
 * <li>Sets the SSL context to use TLS 1.2 if running on Java7</li>
 * <li>Updates the client to use a custom connector that allows large objects to
 * be uploaded without buffering
 * </ul>
 * <p>
 * If the default configurator results in any issues, callers can provide their
 * own implementation when constructing service objects.
 */
@Slf4j
public class DefaultConfigurator implements ClientConfigurator {

    static final String SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS =
            "sun.net.http.allowRestrictedHeaders";

    static {
        setAllowRestrictedHeadersProperty(
                System.getProperty(SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
    }

    static void setAllowRestrictedHeadersProperty(String previousValue) {
        // necessary for the default HttpUrlConnector implementation;
        // check if this property was explicitly set to false; if so, fail
        if (previousValue != null && !Boolean.valueOf(previousValue)) {
            throw new IllegalStateException(
                    "Property "
                            + SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS
                            + " was explicitly "
                            + "set to "
                            + previousValue
                            + "; the OCI SDK needs to set this property to true. Failing...");
        }
        System.setProperty(SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS, "true");
    }

    @Override
    public void customizeBuilder(ClientBuilder builder) {
        setSslContext(builder);
        setConnectorProvider(builder);
    }

    /**
     * Sets the SSL context on the builder.
     * <p>
     * Separate so subclasses can call if desired.
     *
     * @param builder
     *            The client builder to use.
     */
    protected void setSslContext(ClientBuilder builder) {
        JreVersion version = JavaRuntimeUtils.getRuntimeVersion();
        if (version == JreVersion.Java_7) {
            LOG.info("Running on 1.7 VM, manually setting security protocol to TLSv1.2");
            SSLContext sslContext =
                    SslConfigurator.newInstance(true)
                            .securityProtocol("TLSv1.2")
                            .createSSLContext();
            builder.sslContext(sslContext);
        } else if (version == JreVersion.Unsupported) {
            LOG.error("Using an unsupported runtime only 1.7+ is supported");
        } else if (version == JreVersion.Unknown) {
            LOG.warn("Using an unknown runtime, calls may not work");
        }
    }

    /**
     * Sets the custom ConnectorProvider to use. Subclasses can override this to
     * be a no-op if they do not want to use the custom connector, or wish to
     * set their own.
     *
     * @param builder
     *            The builder to set the provider on
     */
    protected void setConnectorProvider(ClientBuilder builder) {
        LOG.info("Setting connector provider to HttpUrlConnectorProvider");

        ClientConfig clientConfig = new ClientConfig();
        // 1) enable workaround for 'patch' requests
        HttpUrlConnectorProvider provider = new HttpUrlConnectorProvider().useSetMethodWorkaround();

        clientConfig.connectorProvider(provider);

        builder.withConfig(clientConfig);
    }

    @Override
    public void customizeClient(Client client) {
        // Use buffered processing to get better error messages on POST and PUT
        // but the downside is that this will buffer large uploads in memory.
        // Operations that should not use buffering should set null instead
        client.property(
                ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.BUFFERED);
    }

    /**
     * A {@link ClientConfigurator} for a client that does not buffer requests in memory.
     *
     * Note: for PUT and POST requests, this will result in less accurate error messages
     */
    public static class NonBuffering extends DefaultConfigurator {
        @Override
        public void customizeClient(Client client) {
            super.customizeClient(client);
            client.property(ClientProperties.REQUEST_ENTITY_PROCESSING, null);
        }

        @Override
        protected void setConnectorProvider(ClientBuilder builder) {
            LOG.info("Setting non-buffering connector provider to HttpUrlConnectorProvider");

            ClientConfig clientConfig = new ClientConfig();
            // 1) use fixed length streaming when possible to allow large uploads without
            // buffering.
            // 2) enable workaround for 'patch' requests
            HttpUrlConnectorProvider provider =
                    new HttpUrlConnectorProvider()
                            .useFixedLengthStreaming()
                            .useSetMethodWorkaround();

            clientConfig.connectorProvider(provider);
            builder.withConfig(clientConfig);
        }
    }
}
