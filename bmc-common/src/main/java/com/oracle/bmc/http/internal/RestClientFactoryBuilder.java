/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.google.common.base.MoreObjects;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.DefaultConfigurator;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Builder for {@link RestClientFactory}.  Will use default values
 * when no other values were provided.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestClientFactoryBuilder {
    private ClientConfigurator clientConfigurator;

    /**
     * Create a new builder instance.
     * @return A new builder instance.
     */
    public static RestClientFactoryBuilder builder() {
        return new RestClientFactoryBuilder();
    }

    /**
     * Sets the ClientConfigurator to use, or null to use the {@link DefaultConfigurator}.
     *
     * @param clientConfigurator The client configurator to use.
     * @return The builder.
     */
    public RestClientFactoryBuilder clientConfigurator(ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
        return this;
    }

    /**
     * Builds a new RestClientFactory using the options provided.  Options that were not set will
     * use default values.
     *
     * @return A new RestClientFactory instance.
     */
    public RestClientFactory build() {
        ClientConfigurator clientConfigurator =
                MoreObjects.firstNonNull(this.clientConfigurator, new DefaultConfigurator());

        return new RestClientFactory(clientConfigurator);
    }
}
