/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import lombok.Getter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A client configurator composed of other client configurators. All of the client configurators contained
 * in this composite object will be used in the order they are added.
 */
public class CompositeClientConfigurator implements ClientConfigurator {
    @Getter private final List<ClientConfigurator> configurators;

    /**
     * Create a new composite client configurator.
     * @param configurators the other configurators contained in this composite
     */
    public CompositeClientConfigurator(List<ClientConfigurator> configurators) {
        this.configurators = new ArrayList<>(configurators);
    }

    /**
     * Create a new composite client configurator.
     * @param configurators the other configurators contained in this composite
     */
    public static CompositeClientConfigurator of(ClientConfigurator... configurators) {
        return new CompositeClientConfigurator(Arrays.asList(configurators));
    }

    @Override
    public void customizeBuilder(ClientBuilder builder) {
        for (ClientConfigurator configurator : configurators) {
            configurator.customizeBuilder(builder);
        }
    }

    @Override
    public void customizeClient(Client client) {
        for (ClientConfigurator configurator : configurators) {
            configurator.customizeClient(client);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeClientConfigurator that = (CompositeClientConfigurator) o;

        return configurators != null
                ? configurators.equals(that.configurators)
                : that.configurators == null;
    }

    @Override
    public int hashCode() {
        return configurators != null ? configurators.hashCode() : 0;
    }
}
