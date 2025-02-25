/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.pki;

public class PemException extends IllegalStateException {

    PemException(final String message) {
        this(message, null);
    }

    PemException(final Throwable cause) {
        this(null, cause);
    }

    PemException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
