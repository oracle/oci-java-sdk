/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.ClientProperty;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;

/**
 * A decorator around the client builder. Allows users to change the {@link ClientBuilder} and call
 * {@link ClientBuilder#build()} themselves to create the {@link Client}.
 */
public interface ClientBuilderDecorator {
    /**
     * Use this property to register a different {@link ClientBuilderDecorator} for building the
     * {@link Client}.
     *
     * <p>The default {@link ClientBuilderDecorator} simply calls {@link ClientBuilder#build()}.
     */
    ClientProperty<ClientBuilderDecorator> PROPERTY = ClientProperty.create("jerseyDecorator");

    /**
     * Build a client. The {@link ClientBuilder} is properly set up.
     *
     * <p>However, it is even possible to return a completely different {@link Client}, created in a
     * custom way.
     *
     * @param builder client builder properly set up using the {@link
     *     com.oracle.bmc.http.client.StandardClientProperties} and {@link Jersey3ClientProperties}.
     * @return client
     */
    Client finish(ClientBuilder builder);
}
