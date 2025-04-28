/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.exception;

import com.oracle.bmc.model.BmcException;

/** Exception thrown when something goes wrong on the authentication server. */
public class AuthServerException extends BmcException {
    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "Error happened calling server. ";

    public AuthServerException(BmcException e) {
        this(MESSAGE + e.getMessage(), e);
    }

    public AuthServerException(String message, BmcException cause) {
        super(
                cause.getStatusCode(),
                cause.getServiceCode(),
                message,
                cause.getOpcRequestId(),
                cause);
    }
}
