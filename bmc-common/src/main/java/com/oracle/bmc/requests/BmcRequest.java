/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.requests;

import javax.ws.rs.client.Invocation;

import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Consumer;
import lombok.Getter;
import lombok.Setter;

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
    @Setter @Getter private Consumer<Invocation.Builder> invocationCallback;

    /**
     * Optional {@link RetryConfiguration} to use for this request.
     *
     * Note: This overrides the retry configurations set on the client (via
     * {@link com.oracle.bmc.ClientConfiguration} and SDK level (via
     * {@link com.oracle.bmc.retrier.Retriers#setDefaultRetryConfiguration(RetryConfiguration)}
     */
    @Setter @Getter private RetryConfiguration retryConfiguration;

    /**
     * Alternative accessor for the body parameter, if this request supports a body.
     *
     * If this request does not support a body, an {@link IllegalStateException} is thrown.
     *
     * @return body parameter
     *
     * @throws IllegalStateException if this request does not support a body
     */
    @com.oracle.bmc.InternalSdk
    public B getBody$() {
        throw new IllegalStateException("This request does not support a body");
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
         * @return this builder instance
         */
        Builder<T, B> copy(T o);

        /**
         * Build the request.
         * @return request
         */
        T build();
    }
}
