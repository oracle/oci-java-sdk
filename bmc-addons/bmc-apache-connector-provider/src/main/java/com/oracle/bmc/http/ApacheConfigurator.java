/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.internal.ContentLengthFilter;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.RequestEntityProcessing;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.LinkedList;
import java.util.List;

/**
 * A {@code ClientConfigurator} implementation that uses the Apache HTTP Connector Provider for the Jersey Client
 * configuration.  This enables support for connection pooling in addition to per-client HTTP(S) proxy support.
 *
 * Note: Use of the ApacheConnectorProvider will buffer requests into memory and can impact memory utilization within
 * your application.
 */
@Slf4j
public class ApacheConfigurator implements ClientConfigurator {
    /** The list of {@code ClientConfigDecorator}s to support the ability to decorate {@code ClientConfig} */
    protected final List<ClientConfigDecorator> clientConfigDecorators = new LinkedList<>();

    /** Creates a new {@code ApacheConfigurator} object. */
    public ApacheConfigurator() {}

    /**
     * Creates a new {@code ApacheConfigurator} and registers the list of provided {@code ClientConfigDecorator}s.
     *
     * @param clientConfigDecorators the list of client configuration decorators
     */
    public ApacheConfigurator(final List<ClientConfigDecorator> clientConfigDecorators) {
        this.clientConfigDecorators.addAll(clientConfigDecorators);
    }

    @Override
    public void customizeBuilder(ClientBuilder builder) {
        setConnectorProvider(builder);
    }

    @Override
    public void customizeClient(Client client) {
        // Use buffered processing to get better error messages on POST and PUT
        // but the downside is that this will buffer large uploads in memory.
        client.property(
                ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.BUFFERED);

        // Required for calls to only allow Apache to set the content-length header.
        // Otherwise, apache will throw an exception if it already exists. For example, such a case includes
        // ObjectStorage where the content-length is explicitly set in the header based on the value in the request.
        client.register(new ContentLengthFilter());
    }

    protected void setConnectorProvider(ClientBuilder builder) {
        LOG.info("Setting connector provider to ApacheConnectorProvider");

        final ClientConfig clientConfig = new ClientConfig();
        // Disable the default behavior to auto compress and deflate the request/response content based on the
        // content-encoding.
        final RequestConfig requestConfig =
                RequestConfig.custom().setContentCompressionEnabled(false).build();
        clientConfig.property(ApacheClientProperties.REQUEST_CONFIG, requestConfig);
        clientConfig.connectorProvider(new ApacheConnectorProvider());

        // Decorate config with any configured client config decorators
        for (ClientConfigDecorator clientConfigDecorator : clientConfigDecorators) {
            clientConfigDecorator.customizeClientConfig(clientConfig);
        }

        builder.withConfig(clientConfig);
    }
}
