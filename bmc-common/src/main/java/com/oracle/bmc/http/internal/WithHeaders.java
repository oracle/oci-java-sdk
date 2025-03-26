/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import javax.annotation.Nullable;
import javax.ws.rs.core.MultivaluedMap;
import javax.annotation.Nonnull;

/**
 * Represents a result with HTTP headers
 *
 * @param <T>
 *            The type of element returned.
 */
public class WithHeaders<T> {
    /**
     * The item returned from the call, null if the returned code is 304 (not-modified).
     */
    @Nullable private final T item;

    /**
     * The HTTP response headers.
     */
    @Nonnull private final MultivaluedMap<String, String> headers;

    /**
     * The HTTP status code returned.
     */
    private final int statusCode;

    /**
     * The item returned from the call, null if the returned code is 304 (not-modified).
     */
    @Nullable
    public T getItem() {
        return this.item;
    }

    /**
     * The HTTP response headers.
     */
    @Nonnull
    public MultivaluedMap<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * The HTTP status code returned.
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    @java.beans.ConstructorProperties({"item", "headers", "statusCode"})
    public WithHeaders(
            @Nullable final T item,
            @Nonnull final MultivaluedMap<String, String> headers,
            final int statusCode) {
        if (headers == null) {
            throw new java.lang.NullPointerException("headers is marked non-null but is null");
        }
        this.item = item;
        this.headers = headers;
        this.statusCode = statusCode;
    }
}
