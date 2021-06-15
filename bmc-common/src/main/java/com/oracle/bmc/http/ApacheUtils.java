/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import java.util.Optional;

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
     * @param clientConfigurator
     * @return closingStrategy representing the Apache Connector closing strategy
     */
    public static ApacheConnectionClosingStrategy getApacheConnectionClosingStrategy(
            ClientConfigurator clientConfigurator) {
        ApacheConnectionClosingStrategy closingStrategy = null;
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
                        closingStrategy =
                                effectiveApacheConnectorConfigurator
                                        .getApacheConnectorProperties()
                                        .getConnectionClosingStrategy();
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
                            closingStrategy =
                                    innerEffectiveApacheClientConfigurator
                                            .getApacheConnectorProperties()
                                            .getConnectionClosingStrategy();
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
                closingStrategy =
                        apacheClientConfigurator
                                .getApacheConnectorProperties()
                                .getConnectionClosingStrategy();
            }
        }
        return closingStrategy;
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
