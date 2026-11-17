/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

/**
 * A {@link CallNotAllowedException} signals that the CircuitBreaker is HALF_OPEN or OPEN and a call
 * is not permitted to be executed.
 */
public class CallNotAllowedException extends RuntimeException {
    private final CircuitBreakerOpenEvent openEvent;

    private CallNotAllowedException(
            String message, boolean writableStackTrace, CircuitBreakerOpenEvent openEvent) {
        super(message, null, false, writableStackTrace);
        this.openEvent = openEvent;
    }

    /**
     * Static method to construct a {@link CallNotAllowedException}
     *
     * @param message the detail message.
     * @param writableStackTrace whether or not the stack trace should be writable
     * @return {@link CallNotAllowedException} instance
     */
    public static CallNotAllowedException createCallNotAllowedException(
            String message, boolean writableStackTrace) {
        return new CallNotAllowedException(message, writableStackTrace, null);
    }

    /** Creates a rejection that can be correlated with the breaker opening that caused it. */
    public static CallNotAllowedException createCallNotAllowedException(
            String message, boolean writableStackTrace, CircuitBreakerOpenEvent openEvent) {
        return new CallNotAllowedException(message, writableStackTrace, openEvent);
    }

    /** Returns the diagnostic event for the current breaker opening, if it is available. */
    public CircuitBreakerOpenEvent getOpenEvent() {
        return openEvent;
    }

    /** Returns the opening correlation identifier, if it is available. */
    public String getCorrelationId() {
        return openEvent == null ? null : openEvent.getCorrelationId();
    }
}
