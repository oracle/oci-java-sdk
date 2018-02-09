/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
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
    public static final DefaultConfigurator DEFAULT_CONFIGURATOR = new DefaultConfigurator();

    /**
     * This is the client configurator used if a caller passes <code>null</code> to
     * {@link RestClientFactoryBuilder#clientConfigurator(ClientConfigurator)}.
     */
    private ClientConfigurator defaultConfigurator = DEFAULT_CONFIGURATOR;
    private ClientConfigurator clientConfigurator;

    /**
     * Create a new builder instance.
     * @return A new builder instance.
     */
    public static RestClientFactoryBuilder builder() {
        return new RestClientFactoryBuilder();
    }

    /**
     * Sets the default ClientConfigurator.
     * @param defaultConfigurator the {@link ClientConfigurator} used if null is passed to the clientConfigurator method
     * @return The builder.
     */
    public RestClientFactoryBuilder defaultConfigurator(ClientConfigurator defaultConfigurator) {
        if (defaultConfigurator != null) {
            this.defaultConfigurator = defaultConfigurator;
        } else {
            this.defaultConfigurator = DEFAULT_CONFIGURATOR;
        }
        return this;
    }

    /**
     * Sets the ClientConfigurator to use, or null to use the default client configurator.
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
                MoreObjects.firstNonNull(this.clientConfigurator, defaultConfigurator);

        return new RestClientFactory(clientConfigurator);
    }
}
