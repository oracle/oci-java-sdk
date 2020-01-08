/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import javax.annotation.Nullable;
import javax.ws.rs.core.MultivaluedMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

/**
 * Represents a result with HTTP headers
 *
 * @param <T>
 *            The type of element returned.
 */
@Getter
@AllArgsConstructor
public class WithHeaders<T> {

    /**
     * The item returned from the call, null if the returned code is 304 (not-modified).
     */
    @Nullable private final T item;

    /**
     * The HTTP response headers.
     */
    private final @NonNull MultivaluedMap<String, String> headers;

    /**
     * The HTTP status code returned.
     */
    private final int statusCode;
}
