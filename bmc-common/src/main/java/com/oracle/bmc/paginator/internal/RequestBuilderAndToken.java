/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import java.util.Optional;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.internal.GuavaUtils;

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

    @InternalSdk(backwardCompatibilityRequired = true)
    public static <T> RequestBuilderAndToken<T> subsequentPage(
            final T requestBuilder, final Optional<String> token) {
        RequestBuilderAndToken<T> rbat = new RequestBuilderAndToken<>(requestBuilder);
        rbat.token = token;
        return rbat;
    }

    @InternalSdk(backwardCompatibilityRequired = true)
    public static <T> RequestBuilderAndToken<T> initialPage(final T requestBuilder) {
        RequestBuilderAndToken<T> rbat = new RequestBuilderAndToken<>(requestBuilder);
        rbat.token = null;
        return rbat;
    }

    @InternalSdk(backwardCompatibilityRequired = true)
    private RequestBuilderAndToken(final T requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    @Deprecated
    @InternalSdk(backwardCompatibilityRequired = true)
    public RequestBuilderAndToken(
            final T requestBuilder,
            final com.google.common /*Guava will be removed soon*/.base.Optional<String> token) {
        this.requestBuilder = requestBuilder;
        this.token = GuavaUtils.adaptFromGuava(token);
    }

    public T getRequestBuilder() {
        return this.requestBuilder;
    }

    @InternalSdk(backwardCompatibilityRequired = true)
    public Optional<String> getNextPageToken() {
        return token;
    }

    @Deprecated
    @InternalSdk(backwardCompatibilityRequired = true)
    public com.google.common /*Guava will be removed soon*/.base.Optional<String> getToken() {
        return GuavaUtils.adaptToGuava(token);
    }
}
