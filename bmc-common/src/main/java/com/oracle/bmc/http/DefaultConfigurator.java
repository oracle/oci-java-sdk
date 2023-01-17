/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.StandardClientProperties;
import org.slf4j.Logger;

/**
 * DefaultConfigurator handles basic configuration of clients under different environments. This is
 * the configurator used by the REST client factory when no configurator is provided by the SDK
 * user.
 *
 * <p>It currently does the following:
 *
 * <ul>
 *   <li>Checks for the presence of Apache Config Classes and creates the appropriate configurator
 * </ul>
 *
 * <p>If the default configurator results in any issues, callers can provide their own
 * implementation when constructing service objects.
 */
public class DefaultConfigurator implements ClientConfigurator, HasEffectiveClientConfigurator {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(DefaultConfigurator.class);

    /** Creates a new {@code DefaultConfigurator} object. */
    public DefaultConfigurator() {}

    @Override
    public void customizeClient(HttpClientBuilder builder) {}

    /**
     * A {@link ClientConfigurator} for a client that does not buffer requests in memory.
     *
     * <p>Note: for PUT and POST requests, this will result in less accurate error messages
     */
    public static class NonBuffering implements ClientConfigurator, HasEffectiveClientConfigurator {
        public NonBuffering() {}

        @Override
        public void customizeClient(HttpClientBuilder builder) {
            builder.property(StandardClientProperties.BUFFER_REQUEST, false);
        }
    }
}
