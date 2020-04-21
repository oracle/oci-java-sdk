/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.google.common.base.Function;

import lombok.RequiredArgsConstructor;

/**
 * Future that both delegates to another one and provides the ability to transform
 * the response to another type.
 *
 * @param <FROM> The type returned by the delegate Future.
 * @param <TO> The type to convert to.
 */
@RequiredArgsConstructor
public class TransformingFuture<FROM, TO> implements Future<TO> {
    private final Future<FROM> delegate;
    private final Function<FROM, TO> transformer;

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return delegate.cancel(mayInterruptIfRunning);
    }

    @Override
    public boolean isCancelled() {
        return delegate.isCancelled();
    }

    @Override
    public boolean isDone() {
        return delegate.isDone();
    }

    @Override
    public TO get() throws InterruptedException, ExecutionException {
        FROM from = delegate.get();
        return transformer.apply(from);
    }

    @Override
    public TO get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        FROM from = delegate.get(timeout, unit);
        return transformer.apply(from);
    }
}
