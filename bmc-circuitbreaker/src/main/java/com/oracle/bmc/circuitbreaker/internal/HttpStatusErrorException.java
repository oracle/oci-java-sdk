/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import javax.ws.rs.core.Response;
import javax.annotation.Nonnull;

/**
 * A {@link HttpStatusErrorException} signals that the JaxRs client call returned an error state
 */
final class HttpStatusErrorException extends RuntimeException {

    @Nonnull private final Response response;

    HttpStatusErrorException(@Nonnull Response response) {
        if (response == null) {
            throw new NullPointerException("response is marked non-null but is null");
        }
        this.response = response;
    }

    public @Nonnull Response getResponse() {
        return this.response;
    }
}
