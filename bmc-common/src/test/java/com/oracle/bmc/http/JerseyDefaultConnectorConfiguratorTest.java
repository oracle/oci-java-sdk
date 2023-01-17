/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JerseyDefaultConnectorConfiguratorTest {
    @Test
    public void succeedIfPropertyNotSet() {
        JerseyDefaultConnectorConfigurator.setAllowRestrictedHeadersProperty(null);
        assertEquals(
                "true",
                System.getProperty(
                        JerseyDefaultConnectorConfigurator.SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
    }

    @Test(expected = IllegalStateException.class)
    public void failIfPropertyFalse() {
        JerseyDefaultConnectorConfigurator.setAllowRestrictedHeadersProperty("false");
    }

    @Test
    public void succeedIfPropertyTrue() {
        JerseyDefaultConnectorConfigurator.setAllowRestrictedHeadersProperty("true");
        assertEquals(
                "true",
                System.getProperty(
                        JerseyDefaultConnectorConfigurator.SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
    }
}
