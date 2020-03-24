/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
