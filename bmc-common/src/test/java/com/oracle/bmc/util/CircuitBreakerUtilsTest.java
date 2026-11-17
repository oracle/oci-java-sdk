/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import static org.junit.Assert.assertEquals;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import org.junit.Test;

public class CircuitBreakerUtilsTest {
    @Test
    public void authClientRetainsOneHalfOpenProbeWhileOrdinaryDefaultsPermitTen() {
        assertEquals(
                1,
                CircuitBreakerUtils.getDefaultAuthClientCircuitBreakerConfiguration()
                        .getPermittedNumberOfCallsInHalfOpenState());
        assertEquals(
                10,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
                        .getPermittedNumberOfCallsInHalfOpenState());
        assertEquals(
                10, new CircuitBreakerConfiguration().getPermittedNumberOfCallsInHalfOpenState());
        assertEquals(
                10,
                CircuitBreakerConfiguration.builder()
                        .build()
                        .getPermittedNumberOfCallsInHalfOpenState());
    }
}
