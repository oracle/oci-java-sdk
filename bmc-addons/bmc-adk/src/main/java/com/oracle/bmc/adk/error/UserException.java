/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.error;

/**
 * Exception thrown when a user-related error occurs in the OCI Agent service.
 *
 * <p>This class extends {@link AdkException} and provides constructors for creating UserException
 * instances with or without a detail message and/or a cause. The detail message is prefixed with
 * "User Error: " to indicate that the error is related to user input or action.
 */
public class UserException extends AdkException {

    /**
     * Constructs a new UserException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     */
    public UserException(String message) {
        super("User Error: " + message);
    }

    /**
     * Constructs a new UserException with the specified detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public UserException(String message, Throwable cause) {
        super("User Error: " + message, cause);
    }

    /**
     * Constructs a new UserException with the specified cause and a detail message that is {@code
     * "User Error: " + cause.getMessage()}.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public UserException(Throwable cause) {
        super("User Error: " + cause.getMessage(), cause);
    }
}
