/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
