/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.http.DefaultConfigurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Builder for {@link RestClientFactory}.  Will use default values
 * when no other values were provided.
 */
public class RestClientFactoryBuilder {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RestClientFactoryBuilder.class);

    public static final ClientConfigurator DEFAULT_CONFIGURATOR = new DefaultConfigurator();

    /**
     * This is the client configurator used if a caller passes <code>null</code> to
     * {@link RestClientFactoryBuilder#clientConfigurator(ClientConfigurator)}.
     */
    private ClientConfigurator defaultConfigurator = DEFAULT_CONFIGURATOR;
    private ClientConfigurator clientConfigurator;
    private List<ClientConfigurator> additionalClientConfigurators = new ArrayList<>();

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
     * Setting a non-null client configurator will completely replace the existing client configurator, and also not
     * use the default client configurator.
     *
     * @param clientConfigurator The client configurator to use.
     * @return The builder.
     */
    public RestClientFactoryBuilder clientConfigurator(ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
        return this;
    }

    /**
     * Adds client configurators, which will be run after the client configurators that have already been registered.
     *
     * @param clientConfigurators The list of client configurator to run after the other client configurators.
     * @return The builder
     */
    public RestClientFactoryBuilder additionalClientConfigurators(
            ClientConfigurator... clientConfigurators) {
        additionalClientConfigurators =
                Collections.unmodifiableList(new ArrayList<>(Arrays.asList(clientConfigurators)));
        return this;
    }

    /**
     * Adds client configurators, which will be run after the client configurators that have already been registered.
     *
     * @param clientConfigurators The list of client configurator to run after the other client configurators.
     * @return The builder
     */
    public RestClientFactoryBuilder additionalClientConfigurators(
            List<ClientConfigurator> clientConfigurators) {
        additionalClientConfigurators =
                Collections.unmodifiableList(new ArrayList<>(clientConfigurators));
        return this;
    }

    /**
     * Builds a new RestClientFactory using the options provided.  Options that were not set will
     * use default values.
     *
     * @return A new RestClientFactory instance.
     */
    public RestClientFactory build() {
        ClientConfigurator preferredClientConfigurator = getClientConfigurator();
        List<ClientConfigurator> configurators = new ArrayList<>();
        configurators.add(preferredClientConfigurator);
        configurators.addAll(additionalClientConfigurators);
        return new RestClientFactory(
                new CompositeClientConfigurator(Collections.unmodifiableList(configurators)));
    }

    @InternalSdk
    @VisibleForTesting
    protected ClientConfigurator getClientConfigurator() {
        return this.clientConfigurator != null ? this.clientConfigurator : defaultConfigurator;
    }

    @InternalSdk
    @VisibleForTesting
    protected List<ClientConfigurator> getAdditionalClientConfigurators() {
        return additionalClientConfigurators;
    }

    protected RestClientFactoryBuilder() {}
}
