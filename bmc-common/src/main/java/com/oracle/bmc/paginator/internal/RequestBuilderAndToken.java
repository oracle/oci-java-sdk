/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.paginator.internal;

import com.google.common.base.Optional;

/**
 * A container class for a request builder and next page token. These pieces will be used to create
 * a request to a list operation.
 *
 * There are three possible values for the token:
 *
 * <ul>
 *   <li>A null reference, in which case we should use the builder as-is to construct a request</li>
 *   <li>A populated Optional, in which case we should use the value in the Optional as the page token in the builder</li>
 *   <li>An empty/absent Optional, in which case we should use null as the page token in the builder</li>
 * </ul>
 *
 * @param <T> The type of the request builder object
 */
public class RequestBuilderAndToken<T> {
    private T requestBuilder;
    private Optional<String> token;

    public RequestBuilderAndToken(final T requestBuilder, final Optional<String> token) {
        this.requestBuilder = requestBuilder;
        this.token = token;
    }

    public T getRequestBuilder() {
        return this.requestBuilder;
    }

    public Optional<String> getToken() {
        return token;
    }
}
