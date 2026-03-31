/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.internal.SpiClientConfigurator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Utility class that helps manage and configure instances of {@link SpiClientConfigurator}.
 * This class allows SDK users to enable or disable specific implementations of {@code SpiClientConfigurator}.
 */
public class SpiClientConfiguratorUtils {

    private static final String JAVASDK_DISABLED_SPI_CLASSES_PROPERTY =
            "oci.javasdk.disabled.spi.classes";

    private static final String DISABLED_SPI_CLASSES_STRING;

    static {
        DISABLED_SPI_CLASSES_STRING = System.getProperty(JAVASDK_DISABLED_SPI_CLASSES_PROPERTY, "");
    }

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SpiClientConfiguratorUtils.class);

    /**
     * Returns all available instances of {@link SpiClientConfigurator} after disabling the ones specified
     * by the {@code oci.javasdk.disabled.spi.classes} system property.
     * @return A list of enabled {@link SpiClientConfigurator} ClientConfigurators.
     */
    public static List<SpiClientConfigurator> getEnabledSpiClientConfigurators() {

        List<SpiClientConfigurator> additionalSpiClientConfigurators =
                SpiClientConfigurator.getSpiClientConfigurators();
        HashSet<String> disabledSpiClasses =
                new HashSet<>(Arrays.asList(DISABLED_SPI_CLASSES_STRING.split(",")));
        Iterator<SpiClientConfigurator> spiClientConfiguratorIterator =
                additionalSpiClientConfigurators.iterator();
        while (spiClientConfiguratorIterator.hasNext()) {
            SpiClientConfigurator spiClientConfigurator = spiClientConfiguratorIterator.next();
            if (disabledSpiClasses.contains(spiClientConfigurator.getClass().getName())) {
                spiClientConfiguratorIterator.remove();
                LOG.info(
                        "Did not load additional client configurator using SPI since it was disabled using the oci.javasdk.disabled.spi.classes system property: {}",
                        spiClientConfigurator.getClass());
            } else {
                LOG.info(
                        "Additional client configurator loaded using SPI: {}",
                        spiClientConfigurator.getClass());
            }
        }
        return additionalSpiClientConfigurators;
    }
}
