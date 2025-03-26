/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
