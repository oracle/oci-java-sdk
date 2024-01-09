/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import java.util.concurrent.Future;

import com.oracle.bmc.responses.AsyncHandler;

/**
 * Waiter provides a standard interface for waiting on some condition in either a blocking or
 * asynchronous manner.
 *
 * @param <REQUEST> The request type.
 * @param <RESPONSE> The response type.
 */
public interface Waiter<REQUEST, RESPONSE> {

    /**
     * Executes the waiter callback and blocks until it either returns or throws an exception.
     *
     * @return The response.
     * @throws Exception If the waiter timed out.
     */
    public RESPONSE execute() throws Exception;

    /**
     * Executes the waiter callback and returns a Future. The Future will not contain an
     * information. The provided handler will be invoked with either the successful response
     * instance, or the exception thrown in case of failure.
     *
     * @param asyncHandler The async handler to call, must not be null.
     * @return A Future for the submitted request.
     */
    public Future<Void> execute(final AsyncHandler<REQUEST, RESPONSE> asyncHandler);
}
