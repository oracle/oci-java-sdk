/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.Arrays;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CompositeClientConfiguratorTest {

    private ClientBuilder mockBuilder;
    private Client mockClient;

    @Before
    public void setup() {
        mockBuilder = mock(ClientBuilder.class);
        mockClient = mock(Client.class);
    }

    @Test
    public void testCompositeConfigurator_happyCase() {
        CompositeClientConfigurator compositeConfigurator =
                new CompositeClientConfigurator(
                        Arrays.<ClientConfigurator>asList(
                                new ConfiguratorA(), new ConfiguratorB()));
        compositeConfigurator.customizeBuilder(mockBuilder);
        verify(mockBuilder).register(argThat(new StringArgVerifier("A")));
        verify(mockBuilder).register(argThat(new StringArgVerifier("B")));

        compositeConfigurator.customizeClient(mockClient);
        verify(mockClient).target((String) argThat(new StringArgVerifier("A")));
        verify(mockClient).target((String) argThat(new StringArgVerifier("B")));
    }

    //Below we have two sample configurators implemented. We call a methods with bogus values just so we can
    // confirm that it was called and in the expected order

    private static final class ConfiguratorA extends DefaultConfigurator {
        @Override
        public void customizeClient(Client client) {
            client.target("A");
        }

        @Override
        public void customizeBuilder(ClientBuilder builder) {
            builder.register("A");
        }
    }

    private static final class ConfiguratorB extends DefaultConfigurator {
        @Override
        public void customizeClient(javax.ws.rs.client.Client client) {
            client.target("B");
        }

        @Override
        public void customizeBuilder(javax.ws.rs.client.ClientBuilder builder) {
            builder.register("B");
        }
    }

    // We can't use lambdas, so we define Matchers here to verify what args a mock was called with.
    @AllArgsConstructor
    private static final class StringArgVerifier extends ArgumentMatcher {
        @NonNull private final String expectedString;

        @Override
        public boolean matches(Object s) {
            return expectedString.equals(s);
        }
    }
}
