/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.error;

/**
 * Exception thrown by the OCI Agent service to indicate an error.
 *
 * <p>This class extends {@link AdkException} and provides constructors for creating AgentException
 * instances with or without a detail message and/or a cause. The detail message is prefixed with
 * "Agent Error: " to distinguish it from other AdkExceptions.
 */
public class AgentException extends AdkException {

    /**
     * Constructs a new AgentException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     */
    public AgentException(String message) {
        super("Agent Error: " + message);
    }

    /**
     * Constructs a new AgentException with the specified detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public AgentException(String message, Throwable cause) {
        super("Agent Error: " + message, cause);
    }

    /**
     * Constructs a new AgentException with the specified cause and a detail message that is a
     * concatenation of "Agent Error: " and the cause's message.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public AgentException(Throwable cause) {
        super("Agent Error: " + cause.getMessage(), cause);
    }
}
