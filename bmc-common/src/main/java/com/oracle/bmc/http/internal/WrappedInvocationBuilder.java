/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.net.URI;

/**
 * An {@link Invocation.Builder} that stores the headers being set, allowing access to them.
 * Delegates to an underlying builder.
 */
public class WrappedInvocationBuilder extends ForwardingInvocationBuilder {
    private final Invocation.Builder delegate;

    /**
     * This structure stores all the headers set by the customer in the invocation callback.
     */
    private MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();

    /**
     * This structure stores the request URI set by the customer in the invocation callback.
     */
    private final URI requestUri;

    @Override
    public Invocation.Builder delegate() {
        return delegate;
    }

    @Override
    public ForwardingInvocationBuilder header(String name, Object value) {
        super.header(name, value);
        headers.add(name, value);
        return this;
    }

    /**
     * Replaces all existing headers with the newly supplied headers. Modifying the passed in {@code headers}
     * map after this call does not have any effect.
     *
     * @param headers new headers to be set, if {@code null} all existing
     *                headers will be removed.
     * @return the updated builder.
     */
    @Override
    public ForwardingInvocationBuilder headers(MultivaluedMap<String, Object> headers) {
        if (headers != null) {
            // create a copy; that way, later modifications to headers do not have any effect
            MultivaluedMap<String, Object> copy = new MultivaluedHashMap<String, Object>(headers);
            // pass our private copy to the delegate, to be clear about the behavior
            // (Invocation.Builder.headers(MultivaluedMap) itself does not specify semantics)
            super.headers(copy);
            this.headers = copy;
        } else {
            super.headers(null);
            this.headers.clear();
        }
        return this;
    }

    @java.beans.ConstructorProperties({"delegate", "requestUri"})
    public WrappedInvocationBuilder(final Invocation.Builder delegate, final URI requestUri) {
        this.delegate = delegate;
        this.requestUri = requestUri;
    }

    /**
     * This structure stores all the headers set by the customer in the invocation callback.
     */
    public MultivaluedMap<String, Object> getHeaders() {
        return this.headers;
    }

    /**
     * This structure stores the request URI set by the customer in the invocation callback.
     */
    public URI getRequestUri() {
        return this.requestUri;
    }
}
