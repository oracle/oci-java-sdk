/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.model.BmcException;
import javax.annotation.Nonnull;
import org.slf4j.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Future that both delegates to another one and provides the ability to transform
 * the response to another type. This is intended to work with some authenticated calls, like instance principals,
 * and has handling so that if we receive a 401, we'll refresh the auth token and then try again.
 *
 * This is to account for scenarios where we have a valid/non-expired token but the permissions
 * for the instance have changed since the token was issued and so on the server-side the presented
 * token is considered invalid.
 *
 * @param <FROM> The type returned by the delegate Future.
 * @param <TO> The type to convert to.
 *
 * @deprecated in favor of RefreshAuthTokenWrapper -- versions after 1.25.1 do not use RefreshAuthTokenTransformingFuture anymore
 */
public class RefreshAuthTokenTransformingFuture<FROM, TO> implements Future<TO> {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RefreshAuthTokenTransformingFuture.class);
    @Nonnull private Future<FROM> delegate;
    private final Function<FROM, TO> transformer;
    private final RefreshableOnNotAuthenticatedProvider<?> authProvider;
    private final Supplier<Future<FROM>> generateNewFutureForRetry;

    public RefreshAuthTokenTransformingFuture(
            @Nonnull Future<FROM> delegate,
            Function<FROM, TO> transformer,
            RefreshableOnNotAuthenticatedProvider<?> authProvider,
            Supplier<Future<FROM>> generateNewFutureForRetry) {
        if (delegate == null) {
            throw new java.lang.NullPointerException("delegate is marked non-null but is null");
        }
        this.delegate = delegate;
        this.transformer = transformer;
        this.authProvider = authProvider;
        this.generateNewFutureForRetry = generateNewFutureForRetry;
        LOG.warn(
                "The class {} should not be used after version 1.25.1. You are using an oci-java-sdk-common "
                        + "version newer than 1.25.1 with a service client of version 1.25.1 or older. Upgrade your "
                        + "service client version to match your oci-java-sdk-common version.",
                this.getClass().getName());
    }

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
        try {
            return transformer.apply(from);
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                authProvider.refresh();
                delegate = generateNewFutureForRetry.get();
                return transformer.apply(delegate.get());
            } else {
                throw e;
            }
        }
    }

    @Override
    public TO get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        FROM from = delegate.get(timeout, unit);
        try {
            return transformer.apply(from);
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                authProvider.refresh();
                delegate = generateNewFutureForRetry.get();
                return transformer.apply(delegate.get(timeout, unit));
            } else {
                throw e;
            }
        }
    }
}
