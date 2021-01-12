/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.waiter.Waiter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * SimpleWaiterImpl is a basic wrapper around a Callable that executes an action, and
 * provides methods to either execute it synchronously or asynchronously.
 *
 * @param <REQUEST>
 *            The request type.
 * @param <RESPONSE>
 *            The response type.
 */
@RequiredArgsConstructor
public class SimpleWaiterImpl<REQUEST, RESPONSE> implements Waiter<REQUEST, RESPONSE> {
    /**
     * The executor service to submit async requests to.
     */
    private final ExecutorService executorService;
    /**
     * The callable to invoke.
     */
    private final Callable<RESPONSE> callable;
    /**
     * The request this waiter is being invoked on.
     */
    @Getter private final REQUEST request;

    @Override
    public RESPONSE execute() throws Exception {
        return callable.call();
    }

    @Override
    public Future<Void> execute(final AsyncHandler<REQUEST, RESPONSE> asyncHandler) {
        return executorService.submit(
                new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        try {
                            RESPONSE response = callable.call();
                            asyncHandler.onSuccess(request, response);
                            return null;
                        } catch (Exception e) {
                            asyncHandler.onError(request, e);
                            throw e;
                        }
                    }
                });
    }
}
