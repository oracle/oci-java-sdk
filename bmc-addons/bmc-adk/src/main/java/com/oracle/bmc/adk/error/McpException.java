/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.error;

/**
 * Exception thrown by the OCI MCP service to indicate an error.
 *
 * <p>This class extends {@link AdkException} and provides constructors for creating McpException
 * instances with or without a detail message and/or a cause. The detail message is prefixed with
 * "MCP Error: " to distinguish it from other AdkExceptions.
 */
public class McpException extends AdkException {
    /**
     * Constructs a new McpException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     */
    public McpException(String message) {
        super("MCP Error: " + message);
    }
    /**
     * Constructs a new McpException with the specified detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link
     *     #getMessage()} method)
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public McpException(String message, Throwable cause) {
        super("MCP Error: " + message, cause);
    }
    /**
     * Constructs a new McpException with the specified cause and a detail message that is a
     * concatenation of "MCP Error: " and the cause's message.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public McpException(Throwable cause) {
        super("MCP Error: " + cause.getMessage(), cause);
    }
}
