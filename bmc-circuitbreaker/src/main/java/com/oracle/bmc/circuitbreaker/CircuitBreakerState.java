/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

public enum CircuitBreakerState {
    /**
     * A DISABLED breaker is not operating (no state transition, no events) and allowing all
     * requests through.
     */
    DISABLED,
    /**
     * A CLOSED breaker is operating normally and allowing requests through.
     */
    CLOSED,
    /**
     * An OPEN breaker has tripped and will not allow requests through.
     */
    OPEN,
    /**
     * A FORCED_OPEN breaker is not operating (no state transition, no events) and not allowing
     * any requests through.
     */
    FORCED_OPEN,
    /**
     * A HALF_OPEN breaker has completed its wait interval and will allow requests
     */
    HALF_OPEN,

    /**
     * The underlying implementation has an unmapped state
     */
    UNKNOWN
}
