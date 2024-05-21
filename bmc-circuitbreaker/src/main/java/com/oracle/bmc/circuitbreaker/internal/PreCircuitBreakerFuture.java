/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.ws.rs.core.Response;
import javax.annotation.Nonnull;

final class PreCircuitBreakerFuture implements Future<Response> {

    private final Future<Response> future;
    private final Set<Integer> recordHttpStatuses;

    PreCircuitBreakerFuture(
            @Nonnull Future<Response> future, @Nonnull Set<Integer> recordHttpStatuses) {
        if (future == null) {
            throw new NullPointerException("future is marked non-null but is null");
        }
        if (recordHttpStatuses == null) {
            throw new NullPointerException("recordHttpStatuses is marked non-null but is null");
        }

        this.future = future;
        this.recordHttpStatuses = recordHttpStatuses;
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
        Response response = this.future.get();
        if (recordHttpStatuses.contains(response.getStatus())) {
            throw new HttpStatusErrorException(response);
        }
        return response;
    }

    @Override
    public Response get(long timeout, @Nonnull TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        if (unit == null) {
            throw new NullPointerException("unit is marked non-null but is null");
        }

        Response response = this.future.get(timeout, unit);
        if (recordHttpStatuses.contains(response.getStatus())) {
            throw new HttpStatusErrorException(response);
        }
        return response;
    }
}
