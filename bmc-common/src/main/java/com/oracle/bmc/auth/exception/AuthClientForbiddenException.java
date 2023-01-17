/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.exception;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.Validate;

/**
 * Exception thrown when the client failed to authorize to the auth service using configured key
 * suppliers
 */
public class AuthClientForbiddenException extends AuthClientException {
    private static final long serialVersionUID = 1L;
    private static final int STATUS_CODE_FORBIDDEN = 403;
    private static final String MESSAGE = "Client is forbidden. ";

    public AuthClientForbiddenException(BmcException e) {
        this(MESSAGE + e.getMessage(), e);
    }

    public AuthClientForbiddenException(String message, BmcException cause) {
        super(message, validate(cause));
    }

    private static BmcException validate(BmcException cause) {
        Validate.notNull(cause, "cause must not be null");
        Validate.isTrue(
                matches(cause),
                "status code of cause must match '"
                        + STATUS_CODE_FORBIDDEN
                        + "', but was '"
                        + cause.getStatusCode()
                        + "'");
        return cause;
    }

    /**
     * Return true if the exception is a "client forbidden" exception.
     *
     * @param cause BMC exception to check
     * @return true if the exception is a "client forbidden" exception
     */
    public static boolean matches(BmcException cause) {
        return cause.getStatusCode() == STATUS_CODE_FORBIDDEN;
    }
}
