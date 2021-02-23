/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Configurator allowing SDK users to enable Jersey logging request & response on client-side.
 */
@RequiredArgsConstructor
public class JerseyLoggingClientConfigurator implements ClientConfigurator {

    @NonNull private org.glassfish.jersey.logging.LoggingFeature.Verbosity verbosity;
    @NonNull private String loggingLevel;

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
