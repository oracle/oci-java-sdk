/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import lombok.Getter;
import lombok.Setter;

public class CircuitBreakerUtils {

    @Setter @Getter
    private static volatile CircuitBreakerConfiguration defaultCircuitBreakerConfiguration = null;

    /**
     * Get default CircuitBreakerConfiguration
     */
    public static CircuitBreakerConfiguration getDefaultCircuitBreakerConfig() {
        return defaultCircuitBreakerConfiguration;
    }
}
