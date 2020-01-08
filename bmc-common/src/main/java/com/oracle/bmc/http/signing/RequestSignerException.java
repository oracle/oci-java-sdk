/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

public class RequestSignerException extends RuntimeException {
    public RequestSignerException(final String msg) {
        super(msg);
    }

    public RequestSignerException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
