/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

/**
 * Setup builder for a HTTP request, to be executed with {@link #execute()}.
 *
 * <p>A {@link HttpRequest} must be either {@link #execute() executed} or {@link #discard()
 * discarded} to clean up all resources associated with it.
 */
public interface HttpRequest {
    Method method();

    HttpRequest body(Object body);

    HttpRequest body(InputStream body, long contentLength);

    Object body();

    HttpRequest appendPathPart(String encodedPathPart);

    /**
     * Add a query parameter. May be called multiple times for the same name.
     *
     * <p>Note: name and value must already be percent-encoded.
     */
    HttpRequest query(String name, String value);

    URI uri();

    HttpRequest header(String name, String value);

    Map<String, List<String>> headers();

    Object attribute(String name);

    HttpRequest removeAttribute(String name);

    HttpRequest attribute(String name, Object value);

    /** Executor to offload some work onto (mostly for better stack traces) */
    HttpRequest offloadExecutor(Executor executor);

    /**
     * Create a new copy of this {@link HttpRequest} with independent request properties. For
     * example, you can add a new header to the copied request without affecting this one, and
     * execute them independently. Note that the copied request must be either executed or discarded
     * (just like this one).
     */
    HttpRequest copy();

    /**
     * Discard this request, signalling that it won't be {@link #execute() executed}. Any resources
     * associated with this request may be released.
     */
    void discard();

    CompletionStage<HttpResponse> execute();
}
