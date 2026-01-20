/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.error;

/**
 * ADK exception for OCI Agent service errors.
 *
 * <p>This abstract class extends RuntimeException and provides constructors for creating
 * AdkException instances with or without a detail message and/or a cause.
 */
public abstract class AdkException extends RuntimeException {

    public AdkException() {}

    /**
     * Constructs a new AdkException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     */
    public AdkException(String message) {
        super(message);
    }

    /**
     * Constructs a new AdkException with the specified detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public AdkException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new AdkException with the specified cause and a detail message that is {@code
     * (cause==null ? null : cause.toString())}.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public AdkException(Throwable cause) {
        super(cause);
    }
}
