/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

public class SpiClientConfiguratorTest {

    @Test
    public void testDownstreamRequestIdClientConfiguratorDisabled() {
        List<SpiClientConfigurator> spiClientConfiguratorList =
                SpiClientConfigurator.getSpiClientConfigurators();
        assertNotNull(spiClientConfiguratorList);
        boolean downStreamRequestIdConfiguratorPresent = false;
        for (SpiClientConfigurator spiClientConfigurator : spiClientConfiguratorList) {
            if (spiClientConfigurator
                    .getClass()
                    .getSimpleName()
                    .equals("DownstreamRequestIdPropagationConfigurator")) {
                downStreamRequestIdConfiguratorPresent = true;
            }
        }
        assertFalse(downStreamRequestIdConfiguratorPresent);
    }
}
