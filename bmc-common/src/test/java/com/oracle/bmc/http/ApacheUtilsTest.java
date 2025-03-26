/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;
import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApacheUtilsTest {
    @Test
    public void testGetClosingStrategyNull() {
        assertEquals(null, ApacheUtils.getApacheConnectionClosingStrategy(null));
    }

    @Test
    public void testGetClosingStrategyDefault() {
        DefaultConfigurator clientConfigurator = new DefaultConfigurator();
        Assume.assumeTrue(clientConfigurator.isApacheDependencyPresent());
        assertEquals(null, ApacheUtils.getApacheConnectionClosingStrategy(clientConfigurator));
    }

    @Test
    public void testGetClosingStrategyJersey() {
        assertEquals(
                null,
                ApacheUtils.getApacheConnectionClosingStrategy(
                        new JerseyDefaultConnectorConfigurator()));
    }

    @Test
    public void testGetClosingStrategyJerseyNonBuffering() {
        assertEquals(
                null,
                ApacheUtils.getApacheConnectionClosingStrategy(
                        new JerseyDefaultConnectorConfigurator.NonBuffering()));
    }

    @Test
    public void testGetClosingStrategyApache() {
        assertTrue(
                ApacheUtils.getApacheConnectionClosingStrategy(new ApacheConfigurator())
                        instanceof ApacheConnectionClosingStrategy.ImmediateClosingStrategy);
    }

    @Test
    public void testGetClosingStrategyApacheNonBuffering() {
        assertTrue(
                ApacheUtils.getApacheConnectionClosingStrategy(
                                new ApacheConfigurator.NonBuffering())
                        instanceof ApacheConnectionClosingStrategy.ImmediateClosingStrategy);
    }

    @Test
    public void testGetClosingStrategyApachePropertiesNull() {
        assertTrue(
                ApacheUtils.getApacheConnectionClosingStrategy(
                                new ApacheConfigurator(ApacheConnectorProperties.builder().build()))
                        instanceof ApacheConnectionClosingStrategy.ImmediateClosingStrategy);
    }

    @Test
    public void testGetClosingStrategyApacheNonBufferingPropertiesNull() {
        assertTrue(
                ApacheUtils.getApacheConnectionClosingStrategy(
                                new ApacheConfigurator.NonBuffering(
                                        ApacheConnectorProperties.builder().build()))
                        instanceof ApacheConnectionClosingStrategy.ImmediateClosingStrategy);
    }

    @Test
    public void testGetClosingStrategyApacheProperties() {
        ApacheConnectionClosingStrategy ccs =
                new ApacheConnectionClosingStrategy.GracefulClosingStrategy();
        assertEquals(
                ccs,
                ApacheUtils.getApacheConnectionClosingStrategy(
                        new ApacheConfigurator(
                                ApacheConnectorProperties.builder()
                                        .connectionClosingStrategy(ccs)
                                        .build())));
    }

    @Test
    public void testGetClosingStrategyApacheNonBufferingProperties() {
        ApacheConnectionClosingStrategy ccs =
                new ApacheConnectionClosingStrategy.GracefulClosingStrategy();
        assertEquals(
                ccs,
                ApacheUtils.getApacheConnectionClosingStrategy(
                        new ApacheConfigurator.NonBuffering(
                                ApacheConnectorProperties.builder()
                                        .connectionClosingStrategy(ccs)
                                        .build())));
    }

    // expect continue

    @Test
    public void testGetExpectContinueNull() {
        assertTrue(ApacheUtils.getApacheConnectionExpectContinue(null));
    }

    @Test
    public void testGetExpectContinueDefault() {
        DefaultConfigurator clientConfigurator = new DefaultConfigurator();
        Assume.assumeTrue(clientConfigurator.isApacheDependencyPresent());
        assertTrue(ApacheUtils.getApacheConnectionExpectContinue(clientConfigurator));
    }

    @Test
    public void testGetExpectContinueJersey() {
        assertFalse(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new JerseyDefaultConnectorConfigurator()));
    }

    @Test
    public void testGetExpectContinueJerseyNonBuffering() {
        assertFalse(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new JerseyDefaultConnectorConfigurator.NonBuffering()));
    }

    @Test
    public void testGetExpectContinueApache() {
        assertTrue(ApacheUtils.getApacheConnectionExpectContinue(new ApacheConfigurator()));
    }

    @Test
    public void testGetExpectContinueApacheNonBuffering() {
        assertTrue(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new ApacheConfigurator.NonBuffering()));
    }

    @Test
    public void testGetExpectContinueApachePropertiesNull() {
        assertTrue(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new ApacheConfigurator(ApacheConnectorProperties.builder().build())));
    }

    @Test
    public void testGetExpectContinueApacheNonBufferingPropertiesNull() {
        assertTrue(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new ApacheConfigurator.NonBuffering(
                                ApacheConnectorProperties.builder().build())));
    }

    @Test
    public void testGetExpectContinueApacheProperties() {
        assertFalse(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new ApacheConfigurator(
                                ApacheConnectorProperties.builder()
                                        .expectContinue(false)
                                        .build())));
    }

    @Test
    public void testGetExpectContinueApacheNonBufferingProperties() {
        assertFalse(
                ApacheUtils.getApacheConnectionExpectContinue(
                        new ApacheConfigurator.NonBuffering(
                                ApacheConnectorProperties.builder()
                                        .expectContinue(false)
                                        .build())));
    }
}
