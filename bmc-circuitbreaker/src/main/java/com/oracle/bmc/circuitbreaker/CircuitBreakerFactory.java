/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;

import java.util.function.Predicate;

/** This is a Factory class to create OciCircuitBreaker for OCI clients */
public class CircuitBreakerFactory {

    /**
     * Creates JaxRsCircuitBreaker a specialized {@link CircuitBreaker} for JaxRs clients
     *
     * @param cbConfig custom JaxRs CircuitBreaker configuration
     */
    public static OciCircuitBreaker build(
            CircuitBreakerConfiguration cbConfig, Predicate<Throwable> recordExceptionPredicate) {
        OciCircuitBreaker circuitBreaker = null;
        if (cbConfig != null) {
            circuitBreaker = new OciCircuitBreakerImpl(cbConfig, recordExceptionPredicate);
        }
        return circuitBreaker;
    }
}
