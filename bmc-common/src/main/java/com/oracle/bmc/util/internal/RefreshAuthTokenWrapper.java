/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.AsyncHandler;
import javax.annotation.Nonnull;
import org.slf4j.Logger;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/**
 * Combined future and callbacks for asynchronous requests intended to work with some authenticated calls, like
 * instance principals.
 *
 * This handler wraps a base AsyncHandler and has additional logic so that if a call fails with a 401,  we'll
 * refresh the auth token and then try again up to a given number of retries (it is recommended that we only do one
 * retry).
 *
 * It also wraps a delegate Future, and when the result of the future is requested, but the call fails with a 401,
 * we perform the additional logic described above.
 *
 * This is to account for scenarios where we  have a valid/non-expired token but the permissions
 * for the instance have changed since the token was issued and so on the server-side the presented
 * token is considered invalid.
 *
 * @param <REQUEST>
 *            The request type.
 * @param <RESPONSE>
 *            The response type.
 */
public abstract class RefreshAuthTokenWrapper<REQUEST extends BmcRequest<?>, RESPONSE>
        implements AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE> {
    private static final int NUM_TRIES_ALLOWED = 2;
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RefreshAuthTokenWrapper.class);

    private final RefreshableOnNotAuthenticatedProvider<?> authDetailsProvider;
    private final AsyncHandler<REQUEST, RESPONSE> innerHandler;

    private final Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> futureSupplier;
    @Nonnull private Future<RESPONSE> delegate;

    private volatile int currentAttempt = 0;

    public RefreshAuthTokenWrapper(
            RefreshableOnNotAuthenticatedProvider<?> authDetailsProvider,
            AsyncHandler<REQUEST, RESPONSE> innerHandler,
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> futureSupplier) {
        this.authDetailsProvider = authDetailsProvider;
        this.innerHandler = innerHandler;
        this.futureSupplier = futureSupplier;

        this.delegate = buildResponseFuture();
    }

    @Override
    public void onSuccess(REQUEST request, RESPONSE response) {
        innerHandler.onSuccess(request, response);
    }

    @Override
    public void onError(REQUEST request, Throwable error) {
        if (error instanceof BmcException) {
            if (((BmcException) error).getStatusCode() == 401) {
                if (!retryCall()) {
                    innerHandler.onError(request, error);
                }
            } else {
                innerHandler.onError(request, error);
            }
        } else {
            innerHandler.onError(request, error);
        }
    }

    /**
     * If we need to retry the request (i.e. on a 401), this method contains the information on how to do that. This method
     * will be leveraged by the onError callback of this handler.
     *
     * @return false if the retry was not allowed because of the number of attempts
     */
    public synchronized boolean retryCall() {
        if (!delegate.isDone()) {
            // future is still running, that means it was already retried
            return true;
        }

        currentAttempt++;
        if (currentAttempt >= NUM_TRIES_ALLOWED) {
            return false;
        }

        authDetailsProvider.refresh();
        beforeRetryAction();
        delegate = buildResponseFuture();

        return true;
    }

    /**
     * Abstract action to be taken before a retry.
     */
    protected abstract void beforeRetryAction();

    /**
     * Call the future supplier to get the response future.
     * @return response future
     */
    protected java.util.concurrent.Future<RESPONSE> buildResponseFuture() {
        return futureSupplier.apply(this);
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
    public RESPONSE get() throws InterruptedException, ExecutionException {
        try {
            return delegate.get();
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                retryCall();
                return delegate.get();
            } else {
                throw e;
            }
        }
    }

    @Override
    public RESPONSE get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        try {
            return delegate.get(timeout, unit);
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                retryCall();
                return delegate.get(timeout, unit);
            } else {
                throw e;
            }
        }
    }
}
