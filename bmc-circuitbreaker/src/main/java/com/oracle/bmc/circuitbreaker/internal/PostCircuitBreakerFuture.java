/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.ws.rs.core.Response;
import javax.annotation.Nonnull;

final class PostCircuitBreakerFuture implements Future<Response> {

    private final Future<Response> future;
    private final boolean writableStackTrace;

    PostCircuitBreakerFuture(@Nonnull Future<Response> future, boolean writableStackTrace) {
        if (future == null) {
            throw new NullPointerException("future is marked non-null but is null");
        }
        this.future = future;
        this.writableStackTrace = writableStackTrace;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.future.cancel(mayInterruptIfRunning);
    }

    @Override
    public boolean isCancelled() {
        return this.future.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.future.isDone();
    }

    @Override
    public Response get() throws InterruptedException, ExecutionException {
        try {
            return this.future.get();
        } catch (HttpStatusErrorException e) {
            return e.getResponse();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof CallNotPermittedException) {
                throw CallNotAllowedException.createCallNotAllowedException(
                        e.getCause().getMessage(), writableStackTrace);
            } else {
                throw e;
            }
        }
    }

    @Override
    public Response get(long timeout, @Nonnull TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        if (unit == null) {
            throw new NullPointerException("unit is marked non-null but is null");
        }

        try {
            return this.future.get(timeout, unit);
        } catch (HttpStatusErrorException e) {
            return e.getResponse();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof CallNotPermittedException) {
                throw CallNotAllowedException.createCallNotAllowedException(
                        e.getCause().getMessage(), writableStackTrace);
            } else {
                throw e;
            }
        }
    }
}
