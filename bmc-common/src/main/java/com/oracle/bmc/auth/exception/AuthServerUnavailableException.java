/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.exception;

import com.oracle.bmc.model.BmcException;

/**
 * Exception thrown when the authentication server is unavailable.
 */
public class AuthServerUnavailableException extends AuthServerException {
    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "Error happened calling server. ";

    public AuthServerUnavailableException(BmcException e) {
        this(MESSAGE + e.getMessage(), e);
    }

    public AuthServerUnavailableException(String message, BmcException cause) {
        super(message, cause);
    }

    /**
     * Return true if the exception is a "server unavailable" exception.
     * @param cause BMC exception to check
     * @return true if the exception is a "server unavailable" exception
     */
    public static boolean matches(BmcException cause) {
        return cause.getStatusCode() >= 500;
    }
}
