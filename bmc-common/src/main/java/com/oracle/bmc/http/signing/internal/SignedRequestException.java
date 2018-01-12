/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

/**
 * Generic exception exposed to callers of the HTTP Signature code
 */
public class SignedRequestException extends RuntimeException {

    private static final long serialVersionUID = 8908408039973580885L;

    public SignedRequestException(final Throwable cause) {
        super(cause);
    }
}
