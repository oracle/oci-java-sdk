/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
