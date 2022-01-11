/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Utility functions related to Apache
 */
public final class ApacheUtils {
    /**
     * Determines if the client should buffer entities
     * @param clientConfigurator
     * @return isNonBufferingApacheClient boolean value indicating if the client should buffer in memory
     */
    public static boolean isNonBufferingClientConfigurator(ClientConfigurator clientConfigurator) {
        boolean isNonBufferingApacheClient = false;
        if (clientConfigurator instanceof com.oracle.bmc.http.CompositeClientConfigurator) {
            com.oracle.bmc.http.CompositeClientConfigurator compositeClientConfigurator =
                    (com.oracle.bmc.http.CompositeClientConfigurator) clientConfigurator;
            Optional<ClientConfigurator> optionalEffectiveConfigurator =
                    filterOutEffectiveCompositeConfigurator(
                            compositeClientConfigurator,
                            new Class[] {
                                DefaultConfigurator.NonBuffering.class,
                                ApacheConfigurator.NonBuffering.class
                            });
            if (optionalEffectiveConfigurator.isPresent()) {
                com.oracle.bmc.http.ClientConfigurator effectiveClientConfigurator =
                        optionalEffectiveConfigurator.get();
                if (effectiveClientConfigurator instanceof ApacheConfigurator.NonBuffering) {
                    isNonBufferingApacheClient = true;
                } else if (effectiveClientConfigurator
                        instanceof com.oracle.bmc.http.HasEffectiveClientConfigurator) {
                    isNonBufferingApacheClient =
                            ((com.oracle.bmc.http.HasEffectiveClientConfigurator)
                                                    effectiveClientConfigurator)
                                            .getEffectiveClientConfigurator()
                                    instanceof ApacheConfigurator.NonBuffering;
                }
            }
        } else if (clientConfigurator instanceof ApacheConfigurator.NonBuffering) {
            isNonBufferingApacheClient = true;
        }
        return isNonBufferingApacheClient;
    }

    /**
     * Determines the closing strategy used by the Apache connector
     * @param clientConfigurator client configurator used to configure the client
     * @return closingStrategy representing the Apache Connector closing strategy
     */
    public static ApacheConnectionClosingStrategy getApacheConnectionClosingStrategy(
            ClientConfigurator clientConfigurator) {
        return getApacheConnectionSetting(
                clientConfigurator, acp -> acp.getConnectionClosingStrategy());
    }

    /**
     * Determines the expect 100 continue setting used by the Apache connector
     * @param clientConfigurator client configurator used to configure the client
     * @return true if expect 100 continue is enabled
     */
    public static boolean getApacheConnectionExpectContinue(ClientConfigurator clientConfigurator) {
        if (clientConfigurator == null) {
            clientConfigurator = new DefaultConfigurator().getEffectiveClientConfigurator();
        } else if (clientConfigurator instanceof DefaultConfigurator) {
            clientConfigurator =
                    ((DefaultConfigurator) clientConfigurator).getEffectiveClientConfigurator();
        }
        Boolean apacheConnectionSetting =
                getApacheConnectionSetting(clientConfigurator, acp -> acp.isExpectContinue());
        // this treats null as false
        return apacheConnectionSetting == Boolean.TRUE;
    }

    /**
     * Determines the value of an {@link ApacheConnectorProperties} setting in the client configurator
     * @param clientConfigurator client configurator used to configure the client
     * @param settingsExtractor function to extract the setting from the {@link ApacheConnectorProperties}
     * @param <T> type of the setting
     * @return setting, or null
     */
    static <T> T getApacheConnectionSetting(
            ClientConfigurator clientConfigurator,
            Function<ApacheConnectorProperties, T> settingsExtractor) {
        T property = null;
        if (clientConfigurator instanceof com.oracle.bmc.http.CompositeClientConfigurator) {
            com.oracle.bmc.http.CompositeClientConfigurator compositeClientConfigurator =
                    (com.oracle.bmc.http.CompositeClientConfigurator) clientConfigurator;
            Optional<ClientConfigurator> optionalEffectiveConfigurator =
                    filterOutEffectiveCompositeConfigurator(
                            compositeClientConfigurator,
                            new Class[] {
                                DefaultConfigurator.class,
                                DefaultConfigurator.NonBuffering.class,
                                ApacheConfigurator.NonBuffering.class,
                                ApacheConfigurator.class
                            });
            if (optionalEffectiveConfigurator.isPresent()) {
                com.oracle.bmc.http.ClientConfigurator effectiveClientConfigurator =
                        optionalEffectiveConfigurator.get();
                if (effectiveClientConfigurator instanceof HasApacheConnectorProperties) {
                    HasApacheConnectorProperties effectiveApacheConnectorConfigurator =
                            (HasApacheConnectorProperties) effectiveClientConfigurator;
                    if (effectiveApacheConnectorConfigurator.getApacheConnectorProperties() != null
                            && effectiveApacheConnectorConfigurator
                                            .getApacheConnectorProperties()
                                            .getConnectionClosingStrategy()
                                    != null) {
                        property =
                                settingsExtractor.apply(
                                        effectiveApacheConnectorConfigurator
                                                .getApacheConnectorProperties());
                    }
                } else if (effectiveClientConfigurator
                        instanceof com.oracle.bmc.http.HasEffectiveClientConfigurator) {
                    ClientConfigurator innerEffectiveClientConfigurator =
                            ((com.oracle.bmc.http.HasEffectiveClientConfigurator)
                                            effectiveClientConfigurator)
                                    .getEffectiveClientConfigurator();
                    if (innerEffectiveClientConfigurator instanceof HasApacheConnectorProperties) {
                        HasApacheConnectorProperties innerEffectiveApacheClientConfigurator =
                                (HasApacheConnectorProperties) innerEffectiveClientConfigurator;
                        if (innerEffectiveApacheClientConfigurator.getApacheConnectorProperties()
                                        != null
                                && innerEffectiveApacheClientConfigurator
                                                .getApacheConnectorProperties()
                                                .getConnectionClosingStrategy()
                                        != null) {
                            property =
                                    settingsExtractor.apply(
                                            innerEffectiveApacheClientConfigurator
                                                    .getApacheConnectorProperties());
                        }
                    }
                }
            }
        } else if (clientConfigurator instanceof HasApacheConnectorProperties) {
            HasApacheConnectorProperties apacheClientConfigurator =
                    (HasApacheConnectorProperties) clientConfigurator;
            if (apacheClientConfigurator.getApacheConnectorProperties() != null
                    && apacheClientConfigurator
                                    .getApacheConnectorProperties()
                                    .getConnectionClosingStrategy()
                            != null) {
                property =
                        settingsExtractor.apply(
                                apacheClientConfigurator.getApacheConnectorProperties());
            }
        }
        return property;
    }

    /**
     * The boolean value indicating if extra logs related to operations that return streams are enabled/disabled.
     * Disabling this will disable warnings to close the streams, logs about wrapping response stream in
     * an auto-closeble stream. Default is true.
     */
    @Getter
    private static final boolean isExtraStreamLogsEnabled =
            isExtraStreamLogsEnabledViaSystemProperty();

    private static boolean isExtraStreamLogsEnabledViaSystemProperty() {
        String streamLogsEnabledString =
                System.getProperty("oci.javasdk.extra.stream.logs.enabled");
        if (streamLogsEnabledString != null && !streamLogsEnabledString.isEmpty()) {
            String trimmedValue = streamLogsEnabledString.trim();
            if (StringUtils.equalsIgnoreCase("false", trimmedValue)) {
                return false;
            }
        }
        return true;
    }

    private static Optional<ClientConfigurator> filterOutEffectiveCompositeConfigurator(
            CompositeClientConfigurator compositeClientConfigurator, Class[] classesToFilter) {
        return compositeClientConfigurator
                .getConfigurators()
                .stream()
                .filter(c -> filterMethod(c, classesToFilter))
                .findAny();
    }

    private static boolean filterMethod(Object c, Class[] classesToFilter) {
        boolean result = false;
        for (Class clazz : classesToFilter) {
            result = result || clazz.isInstance(c);
        }
        return result;
    }
}
