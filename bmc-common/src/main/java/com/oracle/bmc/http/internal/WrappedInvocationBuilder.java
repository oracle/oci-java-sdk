/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

/**
 * An {@link Invocation.Builder} that stores the headers being set, allowing access to them.
 * Delegates to an underlying builder.
 */
@RequiredArgsConstructor
public class WrappedInvocationBuilder extends ForwardingInvocationBuilder {
    private final Invocation.Builder delegate;

    /**
     * This structure stores all the headers set by the customer in the invocation callback.
     */
    @Getter private MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();

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
}
