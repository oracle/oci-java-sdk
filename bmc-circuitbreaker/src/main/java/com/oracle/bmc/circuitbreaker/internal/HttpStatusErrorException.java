/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import lombok.Getter;
import lombok.NonNull;

import javax.ws.rs.core.Response;

/**
 * A {@link HttpStatusErrorException} signals that the JaxRs client call returned an error state
 */
final class HttpStatusErrorException extends RuntimeException {

    @Getter @NonNull private final Response response;

    HttpStatusErrorException(Response response) {
        this.response = response;
    }
}
