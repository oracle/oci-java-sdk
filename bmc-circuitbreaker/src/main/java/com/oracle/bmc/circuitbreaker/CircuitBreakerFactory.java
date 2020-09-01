/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;

/**
 * This is a Factory class to create JaxRsCircuitBreaker for JaxRs clients
 */
public class CircuitBreakerFactory {

    /**
     * Creates JaxRsCircuitBreaker a specialized {@link CircuitBreaker} for JaxRs clients
     *
     * @param cbConfig custom JaxRs CircuitBreaker configuration
     */
    public static JaxRsCircuitBreaker build(CircuitBreakerConfiguration cbConfig) {
        JaxRsCircuitBreaker circuitBreaker = null;
        if (cbConfig != null) {
            circuitBreaker = new JaxRsCircuitBreakerImpl(cbConfig);
        }
        return circuitBreaker;
    }
}
