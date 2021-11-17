/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircuitBreakerUtils {

    @Setter @Getter
    private static volatile CircuitBreakerConfiguration defaultCircuitBreakerConfiguration =
            CircuitBreakerConfiguration.builder().build();

    @Setter @Getter
    private static volatile CircuitBreakerConfiguration noCircuitBreakerConfiguration = null;

    /**
     * Get default CircuitBreakerConfiguration
     * @return the default CircuitBreakerConfiguration
     */
    public static CircuitBreakerConfiguration getDefaultCircuitBreakerConfig() {
        return defaultCircuitBreakerConfiguration;
    }

    public static final JaxRsCircuitBreaker DEFAULT_CIRCUIT_BREAKER =
            new JaxRsCircuitBreakerImpl(CircuitBreakerConfiguration.builder().build());
    private static final String OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED_ENV_VAR =
            "OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED";

    public static JaxRsCircuitBreaker getUserDefinedCircuitBreaker(
            ClientConfiguration configuration) {
        JaxRsCircuitBreaker circuitBreaker = null;
        if (configuration != null) {
            if (configuration.getCircuitBreakerConfiguration() != null
                    && configuration.getCircuitBreaker() != null) {
                throw new IllegalArgumentException(
                        "Invalid CircuitBreaker setting. Please provide either CircuitBreaker configuration or CircuitBreaker and not both");
            }

            if (configuration.getCircuitBreakerConfiguration() != null) {
                circuitBreaker =
                        new JaxRsCircuitBreakerImpl(configuration.getCircuitBreakerConfiguration());
            } else if (configuration.getCircuitBreaker() != null)
                circuitBreaker = configuration.getCircuitBreaker();
        } else {
            JaxRsCircuitBreaker userGlobalCircuitBreaker = null;
            CircuitBreakerConfiguration globalCircuitBreakerConfiguration =
                    CircuitBreakerUtils.getDefaultCircuitBreakerConfiguration();
            if (globalCircuitBreakerConfiguration != null) {
                userGlobalCircuitBreaker =
                        new JaxRsCircuitBreakerImpl(globalCircuitBreakerConfiguration);
            } else if (isEnvBasedDefaultCircuitBreakerEnabled()) {
                userGlobalCircuitBreaker = DEFAULT_CIRCUIT_BREAKER;
            }
            circuitBreaker = userGlobalCircuitBreaker;
        }
        LOG.debug("Circuit breaker in use: {}", circuitBreaker);
        return circuitBreaker;
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
}
