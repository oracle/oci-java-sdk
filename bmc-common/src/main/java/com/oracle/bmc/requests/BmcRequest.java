/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.requests;

import javax.ws.rs.client.Invocation;

import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Consumer;

import lombok.Getter;
import lombok.Setter;

public class BmcRequest {
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
}
