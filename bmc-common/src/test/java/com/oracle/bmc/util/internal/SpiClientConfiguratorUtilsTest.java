/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.internal.SpiClientConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SpiClientConfigurator.class})
public class SpiClientConfiguratorUtilsTest {

    @Test
    public void testGetSpiClientConfiguratorsClasses() throws Exception {
        mockStatic(SpiClientConfigurator.class);

        // Setting up environment variable
        System.setProperty(
                "oci.javasdk.disabled.spi.classes",
                "com.oracle.bmc.util.internal.SpiClientConfiguratorUtilsTest$TestSpiClientConfigurator");

        // Mocking SpiClientConfigurator.getSpiClientConfigurators()
        List<SpiClientConfigurator> mockedSpiClientConfigurators = new ArrayList<>();
        mockedSpiClientConfigurators.add(new TestSpiClientConfigurator());
        mockedSpiClientConfigurators.add(new AnotherTestSpiClientConfigurator());
        when(SpiClientConfigurator.getSpiClientConfigurators())
                .thenReturn(mockedSpiClientConfigurators);

        // Get enabled SPI configurators
        List<SpiClientConfigurator> result =
                SpiClientConfiguratorUtils.getEnabledSpiClientConfigurators();

        // Should have only one enabled configurator
        assertEquals(1, result.size());
        assertFalse(result.get(0) instanceof TestSpiClientConfigurator);
        assertTrue(result.get(0) instanceof AnotherTestSpiClientConfigurator);
        System.setProperty("oci.javasdk.disabled.spi.classes", "");
    }

    private static class TestSpiClientConfigurator implements SpiClientConfigurator {
        @Override
        public void customizeBuilder(ClientBuilder builder) {}

        @Override
        public void customizeClient(Client client) {}
    }

    private static class AnotherTestSpiClientConfigurator implements SpiClientConfigurator {
        @Override
        public void customizeBuilder(ClientBuilder builder) {}

        @Override
        public void customizeClient(Client client) {}
    }
}
