/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.exception;

import com.oracle.bmc.model.BmcException;

/**
 * Authentication client exception.
 */
public class AuthClientException extends BmcException {
    private static final long serialVersionUID = 1L;

    /**
     * Create a wrapper around an authentication client exception.
     * @param message message
     * @param cause BMC exception that indicated this is an authentication client exception
     */
    public AuthClientException(String message, BmcException cause) {
        super(
                cause.getStatusCode(),
                cause.getServiceCode(),
                message,
                cause.getOpcRequestId(),
                cause);
    }
}
