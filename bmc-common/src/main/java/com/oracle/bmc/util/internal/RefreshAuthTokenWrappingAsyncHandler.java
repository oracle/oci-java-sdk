/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.responses.AsyncHandler;

import lombok.RequiredArgsConstructor;

/**
 * Callbacks for asynchronous requests intended to work with some authenticated calls, like instance principals.
 * This handler wraps a base AsyncHandler and has additional logic so that if a call fails with a 401,  we'll
 * refresh the auth token and then try again up to a given number of retries (it is recommended that we only do one
 * retry).
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
@RequiredArgsConstructor
public abstract class RefreshAuthTokenWrappingAsyncHandler<REQUEST, RESPONSE>
        implements AsyncHandler<REQUEST, RESPONSE> {
    private static final int NUM_TRIES_ALLOWED = 2;

    private final RefreshableOnNotAuthenticatedProvider<?> authDetailsProvider;
    private final AsyncHandler<REQUEST, RESPONSE> innerHandler;
    private int currentAttempt = 0;

    @Override
    public void onSuccess(REQUEST request, RESPONSE response) {
        innerHandler.onSuccess(request, response);
    }

    @Override
    public void onError(REQUEST request, Throwable error) {
        currentAttempt++;
        if (error instanceof BmcException) {
            if (((BmcException) error).getStatusCode() == 401
                    && currentAttempt < NUM_TRIES_ALLOWED) {
                authDetailsProvider.refresh();
                retryCall();
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
     */
    public abstract void retryCall();
}
