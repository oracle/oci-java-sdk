/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.google.common.collect.ImmutableList;
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
                ImmutableList.of(RestClientFactoryBuilder.DEFAULT_CONFIGURATOR),
                compositeClientConfigurator.getConfigurators());
    }

    @Test
    public void testDefaultConfiguratorWithAdditionalConfigurators() {
        ClientConfigurator clientConfigurator1 = Mockito.mock(ClientConfigurator.class);
        ClientConfigurator clientConfigurator2 = Mockito.mock(ClientConfigurator.class);
        RestClientFactory factory =
                RestClientFactoryBuilder.builder()
                        .additionalClientConfigurators(
                                ImmutableList.of(clientConfigurator1, clientConfigurator2))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                ImmutableList.of(
                        RestClientFactoryBuilder.DEFAULT_CONFIGURATOR,
                        clientConfigurator1,
                        clientConfigurator2),
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
                ImmutableList.of(defaultConfigurator),
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
                                ImmutableList.of(clientConfigurator1, clientConfigurator2))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                ImmutableList.of(defaultConfigurator, clientConfigurator1, clientConfigurator2),
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
                                ImmutableList.of(clientConfigurator1, clientConfigurator2))
                        .build();
        ClientConfigurator fromFactory = factory.getClientConfigurator();
        assertTrue(fromFactory instanceof CompositeClientConfigurator);

        CompositeClientConfigurator compositeClientConfigurator =
                (CompositeClientConfigurator) fromFactory;
        assertEquals(
                ImmutableList.of(defaultConfigurator, clientConfigurator1, clientConfigurator2),
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
                ImmutableList.of(clientConfigurator),
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
                ImmutableList.of(clientConfigurator, clientConfigurator1, clientConfigurator2),
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
                ImmutableList.of(clientConfigurator, clientConfigurator1, clientConfigurator2),
                compositeClientConfigurator.getConfigurators());
    }
}
