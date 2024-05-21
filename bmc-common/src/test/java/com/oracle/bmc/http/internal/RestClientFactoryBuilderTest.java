/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.Arrays;
import java.util.Collections;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link RestClientFactoryBuilder}.
 */
public class RestClientFactoryBuilderTest {
    @Test
    public void testDefaultConfigurator() {
        RestClientFactory factory = RestClientFactoryBuilder.builder().build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(RestClientFactoryBuilder.DEFAULT_CONFIGURATOR)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testDefaultConfiguratorWithAdditionalConfigurators() {
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .additionalClientConfigurators(
                                Collections.unmodifiableList(
                                        Arrays.asList(clientConfigurator1, clientConfigurator2)))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(
                                RestClientFactoryBuilder.DEFAULT_CONFIGURATOR,
                                clientConfigurator1,
                                clientConfigurator2)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetDefaultConfigurator() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder().defaultConfigurator(defaultConfigurator).build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(Arrays.asList(defaultConfigurator)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetDefaultConfiguratorWithAdditionalConfigurators() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .defaultConfigurator(defaultConfigurator)
                        .additionalClientConfigurators(
                                Collections.unmodifiableList(
                                        Arrays.asList(clientConfigurator1, clientConfigurator2)))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(
                                defaultConfigurator, clientConfigurator1, clientConfigurator2)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetDefaultConfiguratorWithAdditionalConfiguratorsAfterDefault() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .defaultConfigurator(defaultConfigurator) // order doesn't matter
                        .additionalClientConfigurators(
                                Collections.unmodifiableList(
                                        Arrays.asList(clientConfigurator1, clientConfigurator2)))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(
                                defaultConfigurator, clientConfigurator1, clientConfigurator2)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetConfigurator() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .defaultConfigurator(defaultConfigurator)
                        .clientConfigurator(clientConfigurator)
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(Arrays.asList(clientConfigurator)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetConfiguratorWithAdditionalConfigurators() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .defaultConfigurator(defaultConfigurator)
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(clientConfigurator1, clientConfigurator2)
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(
                                clientConfigurator, clientConfigurator1, clientConfigurator2)),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testSetConfiguratorWithAdditionalConfiguratorsAfterDefault() {
        ClientConfigurator defaultConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .defaultConfigurator(defaultConfigurator) // order doesn't matter
                        .additionalClientConfigurators(clientConfigurator1, clientConfigurator2)
                        .clientConfigurator(clientConfigurator)
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                Collections.unmodifiableList(
                        Arrays.asList(
                                clientConfigurator, clientConfigurator1, clientConfigurator2)),
                compositeClientConfigurator.getConfigurators());
    }
}
