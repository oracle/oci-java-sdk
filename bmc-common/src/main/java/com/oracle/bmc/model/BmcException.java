/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.model;

import lombok.Getter;

public class BmcException extends RuntimeException {
    /**
     * The HTTP status code.
     */
    @Getter private final int statusCode;
    /**
     * Service specific code returned.  Null if the client timed out or failed to get a response from the service.
     */
    @Getter private final String serviceCode;
    /**
     * Flag to indicate that the request timed out.  Status code and service code should not be used if this is true.
     */
    @Getter private final boolean timeout;

    /**
     * The opc-request-id header returned by the service that should be provided for support requests.
     * Null if the client timed out or failed to get a response from the service.
     */
    @Getter private final String opcRequestId;

    public BmcException(
            int statusCode,
            String serviceCode,
            String message,
            String opcRequestId,
            Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.serviceCode = serviceCode;
        this.opcRequestId = opcRequestId;
        this.timeout = false;
    }

    public BmcException(int statusCode, String serviceCode, String message, String opcRequestId) {
        super(message);
        this.statusCode = statusCode;
        this.serviceCode = serviceCode;
        this.opcRequestId = opcRequestId;
        this.timeout = false;
    }

    public BmcException(boolean timeout, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = -1;
        this.serviceCode = null;
        this.opcRequestId = null;
        this.timeout = timeout;
    }

    @Override
    public String getMessage() {
        String requestId =
                this.opcRequestId != null ? " (opc-request-id: " + this.opcRequestId + ")" : "";
        return String.format(
                "(%s, %s, %s) %s%s",
                statusCode,
                serviceCode,
                timeout,
                super.getMessage(),
                requestId);
    }
}
