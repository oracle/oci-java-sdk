/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.requests;

import javax.ws.rs.client.Invocation;

import javax.ws.rs.core.MultivaluedMap;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Consumer;
import java.util.Objects;

/**
 * Request base class.
 * @param <B> type of the body parameter
 */
public class BmcRequest<B> {
    /**
     * Optional consumer that will be invoked before the actual REST call is made.
     * Allows callers to alter/add any parameters that were not directly
     * configurable otherwise.  Attempting to invoke or build the builder in any
     * way will result in an exception.
     *
     * For the {@link Invocation.Builder#headers(javax.ws.rs.core.MultivaluedMap)} method, note that
     * modifying the passed in {@code headers} map after the call does not have any
     * effect on headers set.
     */
    private Consumer<Invocation.Builder> invocationCallback;
    /**
     * Optional {@link RetryConfiguration} to use for this request.
     *
     * Note: This overrides the retry configurations set on the client (via
     * {@link com.oracle.bmc.ClientConfiguration} and SDK level (via
     * {@link com.oracle.bmc.retrier.Retriers#setDefaultRetryConfiguration(RetryConfiguration)}
     */
    private RetryConfiguration retryConfiguration;

    /**
     * Alternative accessor for the body parameter, if this request supports a body.
     *
     * If this request does not support a body, an {@link IllegalStateException} is thrown.
     *
     * @return body parameter
     *
     * @throws IllegalStateException if this request does not support a body
     */
    @JsonIgnore
    @com.oracle.bmc.InternalSdk
    public B getBody$() {
        throw new IllegalStateException("This request does not support a body");
    }

    /**
     * Returns true if this operation supports Expect: 100-Continue.
     * @return true if this operation supports Expect: 100-Continue.
     */
    @JsonIgnore
    @com.oracle.bmc.InternalSdk
    public boolean supportsExpect100Continue() {
        return false;
    }

    /**
     * Uses getInvocationCallback and getRetryConfiguration to determine if passed
     * request is equal to 'this'.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BmcRequest)) {
            return false;
        }
        BmcRequest<?> that = (BmcRequest<?>) o;
        return Objects.equals(getInvocationCallback(), that.getInvocationCallback())
                && Objects.equals(getRetryConfiguration(), that.getRetryConfiguration());
    }

    /**
     * Uses invocationCallback and retryConfiguration to generate a hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getInvocationCallback(), getRetryConfiguration());
    }

    /**
     * Builder interface for requests.
     * @param <T> type of the request
     * @param <B> type of the body parameter (use {@link Void} if no body)
     */
    public interface Builder<T extends BmcRequest<B>, B> {
        /**
         * Alternative setter for the body parameter, if this request supports a body.
         *
         * If this request does not support a body, an {@link IllegalStateException} is thrown.
         *
         * @param body the body parameter
         * @return this builder instance
         *
         * @throws IllegalStateException if this request does not support a body
         */
        @com.oracle.bmc.InternalSdk
        default Builder<T, B> body$(B body) {
            throw new IllegalStateException("This request does not support a body");
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @param o other request from which to copy values
         * @return this builder instance
         */
        Builder<T, B> copy(T o);

        /**
         * Build the request.
         * @return request
         */
        T build();
    }

    /**
     * Optional consumer that will be invoked before the actual REST call is made.
     * Allows callers to alter/add any parameters that were not directly
     * configurable otherwise.  Attempting to invoke or build the builder in any
     * way will result in an exception.
     *
     * For the {@link Invocation.Builder#headers(MultivaluedMap)} method, note that
     * modifying the passed in {@code headers} map after the call does not have any
     * effect on headers set.
     */
    public void setInvocationCallback(final Consumer<Invocation.Builder> invocationCallback) {
        this.invocationCallback = invocationCallback;
    }

    /**
     * Optional consumer that will be invoked before the actual REST call is made.
     * Allows callers to alter/add any parameters that were not directly
     * configurable otherwise.  Attempting to invoke or build the builder in any
     * way will result in an exception.
     *
     * For the {@link Invocation.Builder#headers(MultivaluedMap)} method, note that
     * modifying the passed in {@code headers} map after the call does not have any
     * effect on headers set.
     */
    public Consumer<Invocation.Builder> getInvocationCallback() {
        return this.invocationCallback;
    }

    /**
     * Optional {@link RetryConfiguration} to use for this request.
     *
     * Note: This overrides the retry configurations set on the client (via
     * {@link com.oracle.bmc.ClientConfiguration} and SDK level (via
     * {@link com.oracle.bmc.retrier.Retriers#setDefaultRetryConfiguration(RetryConfiguration)}
     */
    public void setRetryConfiguration(final RetryConfiguration retryConfiguration) {
        this.retryConfiguration = retryConfiguration;
    }

    /**
     * Optional {@link RetryConfiguration} to use for this request.
     *
     * Note: This overrides the retry configurations set on the client (via
     * {@link com.oracle.bmc.ClientConfiguration} and SDK level (via
     * {@link com.oracle.bmc.retrier.Retriers#setDefaultRetryConfiguration(RetryConfiguration)}
     */
    public RetryConfiguration getRetryConfiguration() {
        return this.retryConfiguration;
    }
}
