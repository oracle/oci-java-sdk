/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.responses.internal;

import com.oracle.bmc.responses.AsyncHandler;

/**
 * An async handler that doesn't do anything.
 * @param <REQUEST> type of the request
 * @param <RESPONSE> type of the response
 */
public class NoOpAsyncHandler<REQUEST, RESPONSE> implements AsyncHandler<REQUEST, RESPONSE> {
    private static final NoOpAsyncHandler<?, ?> SINGLETON = new NoOpAsyncHandler<Object, Object>();

    /**
     * Private singleton constructor
     */
    private NoOpAsyncHandler() {}

    @Override
    public void onSuccess(REQUEST request, RESPONSE response) {
        // no op
    }

    @Override
    public void onError(REQUEST request, Throwable error) {
        // no op
    }

    /**
     * Return the singleton with the correct generic types.
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return no op async handler singleton instance
     */
    public static final <REQUEST, RESPONSE> NoOpAsyncHandler<REQUEST, RESPONSE> singleton() {
        return (NoOpAsyncHandler<REQUEST, RESPONSE>) SINGLETON;
    }
}
