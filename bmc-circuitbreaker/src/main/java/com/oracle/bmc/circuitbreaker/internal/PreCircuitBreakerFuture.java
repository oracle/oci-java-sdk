/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import com.google.common.collect.ImmutableSet;
import lombok.NonNull;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.ws.rs.core.Response;

final class PreCircuitBreakerFuture implements Future<Response> {

    private final Future<Response> future;
    private final ImmutableSet<Integer> recordHttpStatuses;

    PreCircuitBreakerFuture(
            @NonNull Future<Response> future, @NonNull ImmutableSet<Integer> recordHttpStatuses) {
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
    public Response get(long timeout, @NonNull TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        Response response = this.future.get(timeout, unit);
        if (recordHttpStatuses.contains(response.getStatus())) {
            throw new HttpStatusErrorException(response);
        }
        return response;
    }
}
