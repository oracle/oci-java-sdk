/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.requests;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedMap;

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
     * For the {@link Invocation.Builder#headers(MultivaluedMap)} method, note that
     * modifying the passed in {@code headers} map after the call does not have any
     * effect on headers set.
     */
    @Setter @Getter private Consumer<Invocation.Builder> invocationCallback;
}
