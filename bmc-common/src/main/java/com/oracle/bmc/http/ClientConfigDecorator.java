/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import org.glassfish.jersey.client.ClientConfig;

/** Decorator allowing customization of the {@link ClientConfig} for a client. */
public interface ClientConfigDecorator {

    /**
     * Configures the {@code ClientConfig}.
     *
     * @param clientConfig the client configuration
     */
    void customizeClientConfig(ClientConfig clientConfig);
}
