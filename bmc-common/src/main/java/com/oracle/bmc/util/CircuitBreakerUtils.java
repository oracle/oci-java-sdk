/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.NoCircuitBreakerConfiguration;
import org.slf4j.Logger;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class CircuitBreakerUtils {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CircuitBreakerUtils.class);
    private static volatile CircuitBreakerConfiguration defaultCircuitBreakerConfiguration;
    private static final int DEFAULT_FAILURE_RATE_THRESHOLD_FOR_AUTH_CLIENT_CB = 65;
    private static final int DEFAULT_MINIMUM_NUMBER_OF_CALLS_FOR_AUTH_CLIENT_CB = 3;
    private static final int DEFAULT_MINIMUM_WAIT_DURATION_IN_OPEN_STATE_FOR_AUTH_CLIENT_CB = 30;
    private static final int DEFAULT_MAXIMUM_WAIT_DURATION_IN_OPEN_STATE_FOR_AUTH_CLIENT_CB = 49;

    public static CircuitBreakerConfiguration getNoCircuitBreakerConfiguration() {
        return new NoCircuitBreakerConfiguration();
    }

    /**
     * Get default CircuitBreakerConfiguration
     *
     * @return the default CircuitBreakerConfiguration
     */
    public static CircuitBreakerConfiguration getDefaultCircuitBreakerConfiguration() {
        return defaultCircuitBreakerConfiguration;
    }

    public static final CircuitBreakerConfiguration DEFAULT_CIRCUIT_BREAKER_CONFIGURATION =
            CircuitBreakerConfiguration.builder().build();
    private static final String OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED_ENV_VAR =
            "OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED";

    /**
     * Gets the user defined CircuitBreakerConfiguration
     *
     * @return the user defined CircuitBreakerConfiguration
     */
    public static CircuitBreakerConfiguration getUserDefinedCircuitBreakerConfiguration(
            ClientConfiguration configuration) {
        CircuitBreakerConfiguration circuitBreakerConfiguration = null;
        if (configuration != null) {
            if (configuration.getCircuitBreakerConfiguration() != null) {
                circuitBreakerConfiguration = configuration.getCircuitBreakerConfiguration();
            }
        } else if (defaultCircuitBreakerConfiguration != null) {
            circuitBreakerConfiguration = defaultCircuitBreakerConfiguration;
        } else if (isEnvBasedDefaultCircuitBreakerEnabled()) {
            circuitBreakerConfiguration = DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        } else if (!isEnvBasedDefaultCircuitBreakerEnabled()) {
            circuitBreakerConfiguration = getNoCircuitBreakerConfiguration();
        }
        LOG.debug("Circuit breaker configuration in use: {}", circuitBreakerConfiguration);
        return circuitBreakerConfiguration;
    }

    private static boolean isEnvBasedDefaultCircuitBreakerEnabled() {
        final String defaultCircuitBreakerEnvVariable =
                System.getenv(OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED_ENV_VAR);
        if (defaultCircuitBreakerEnvVariable != null
                && defaultCircuitBreakerEnvVariable.equalsIgnoreCase("false")) {
            return false;
        }
        return true;
    }

    public static void setDefaultCircuitBreakerConfiguration(
            CircuitBreakerConfiguration defaultCircuitBreakerConfiguration) {
        CircuitBreakerUtils.defaultCircuitBreakerConfiguration = defaultCircuitBreakerConfiguration;
    }

    /**
     * Get default CircuitBreakerConfiguration for X509 calls
     *
     * @return the default CircuitBreakerConfiguration for Auth client
     */
    public static CircuitBreakerConfiguration getDefaultAuthClientCircuitBreakerConfiguration() {
        LOG.debug(
                "Configuring default auth client circuit breaker configuration for federation client");
        return CircuitBreakerConfiguration.builder()
                .minimumNumberOfCalls(DEFAULT_MINIMUM_NUMBER_OF_CALLS_FOR_AUTH_CLIENT_CB)
                .failureRateThreshold(DEFAULT_FAILURE_RATE_THRESHOLD_FOR_AUTH_CLIENT_CB)
                .waitDurationInOpenState(
                        Duration.ofSeconds(
                                ThreadLocalRandom.current()
                                        .nextInt(
                                                DEFAULT_MINIMUM_WAIT_DURATION_IN_OPEN_STATE_FOR_AUTH_CLIENT_CB,
                                                DEFAULT_MAXIMUM_WAIT_DURATION_IN_OPEN_STATE_FOR_AUTH_CLIENT_CB
                                                        + 1)))
                .build();
    }
}
