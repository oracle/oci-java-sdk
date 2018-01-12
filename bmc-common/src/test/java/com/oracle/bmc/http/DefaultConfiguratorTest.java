/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for DefaultConfigurator.
 */
public class DefaultConfiguratorTest {
    @Test
    public void succeedIfPropertyNotSet() {
        DefaultConfigurator.setAllowRestrictedHeadersProperty(null);
        assertEquals(
                "true",
                System.getProperty(DefaultConfigurator.SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
    }

    @Test(expected = IllegalStateException.class)
    public void failIfPropertyFalse() {
        DefaultConfigurator.setAllowRestrictedHeadersProperty("false");
    }

    @Test
    public void succeedIfPropertyTrue() {
        DefaultConfigurator.setAllowRestrictedHeadersProperty("true");
        assertEquals(
                "true",
                System.getProperty(DefaultConfigurator.SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
    }
}
