/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import java.util.logging.Level;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.glassfish.jersey.logging.LoggingFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Configurator allowing SDK users to enable Jersey logging request & response on client-side.
 *
 * See also https://hc.apache.org/httpcomponents-client-4.5.x/logging.html
 */
public class JerseyLoggingClientConfigurator implements ClientConfigurator {

    @NonNull private org.glassfish.jersey.logging.LoggingFeature.Verbosity verbosity;

    /**
     * This logging level is {@link java.util.logging.Level}.
     *
     *  The levels in descending order are:
     *
     *     SEVERE (highest value)
     *     WARNING
     *     INFO
     *     CONFIG
     *     FINE
     *     FINER
     *     FINEST (lowest value)
     */
    @NonNull private String loggingLevel;

    /**
     * Create a Jersey logging configurator.
     * @param verbosity verbosity
     * @param loggingLevel logging level
     */
    public JerseyLoggingClientConfigurator(
            @NonNull LoggingFeature.Verbosity verbosity, @NonNull String loggingLevel) {
        this.verbosity = verbosity;
        this.loggingLevel = loggingLevel;
    }

    /**
     * Create a Jersey logging configurator.
     * @param verbosity verbosity
     * @param loggingLevel logging level
     */
    public JerseyLoggingClientConfigurator(
            @NonNull LoggingFeature.Verbosity verbosity, @NonNull Level loggingLevel) {
        this.verbosity = verbosity;
        this.loggingLevel = loggingLevel.toString();
    }

    @Override
    public void customizeBuilder(ClientBuilder builder) {}

    @Override
    public void customizeClient(Client client) {
        client.property(
                org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_VERBOSITY_CLIENT,
                verbosity);
        client.property(
                org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL_CLIENT,
                loggingLevel);
    }
}
