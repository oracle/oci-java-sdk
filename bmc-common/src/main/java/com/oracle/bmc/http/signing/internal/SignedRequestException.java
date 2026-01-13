/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

/** Generic exception exposed to callers of the HTTP Signature code */
public class SignedRequestException extends RuntimeException {

    private static final long serialVersionUID = 8908408039973580885L;

    public SignedRequestException(final Throwable cause) {
        super(cause);
    }
}
