/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.circuitbreaker;

/**
 * A {@link CallNotAllowedException} signals that the CircuitBreaker is HALF_OPEN or OPEN and a
 * call is not permitted to be executed.
 */
public class CallNotAllowedException extends RuntimeException {

    private CallNotAllowedException(String message, boolean writableStackTrace) {
        super(message, null, false, writableStackTrace);
    }

    /**
     * Static method to construct a {@link CallNotAllowedException}
     *
     * @param message            the detail message.
     * @param writableStackTrace whether or not the stack trace should be writable
     * @return {@link CallNotAllowedException} instance
     */
    public static CallNotAllowedException createCallNotAllowedException(
            String message, boolean writableStackTrace) {
        return new CallNotAllowedException(message, writableStackTrace);
    }
}
