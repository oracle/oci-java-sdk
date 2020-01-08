/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.exception;

/**
 * Failed to fetch Instance Principal cert from the Instance Metadata Service.
 */
public class InstancePrincipalUnavailableException extends IllegalArgumentException {
    public InstancePrincipalUnavailableException(String message, Exception cause) {
        super(message, cause);
    }

    public InstancePrincipalUnavailableException(String message) {
        super(message);
    }
}
