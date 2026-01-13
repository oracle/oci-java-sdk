/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.responses.AsyncHandler;
import org.slf4j.Logger;

/**
 * Callbacks for asynchronous requests intended to work with some authenticated calls, like instance
 * principals. This handler wraps a base AsyncHandler and has additional logic so that if a call
 * fails with a 401, we'll refresh the auth token and then try again up to a given number of retries
 * (it is recommended that we only do one retry).
 *
 * <p>This is to account for scenarios where we have a valid/non-expired token but the permissions
 * for the instance have changed since the token was issued and so on the server-side the presented
 * token is considered invalid.
 *
 * @param <REQUEST> The request type.
 * @param <RESPONSE> The response type.
 * @deprecated in favor of RefreshAuthTokenWrapper -- versions after 1.25.1 do not use
 *     RefreshAuthTokenWrappingAsyncHandler anymore
 */
public abstract class RefreshAuthTokenWrappingAsyncHandler<REQUEST, RESPONSE>
        implements AsyncHandler<REQUEST, RESPONSE> {
    private static final int NUM_TRIES_ALLOWED = 2;
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RefreshAuthTokenWrappingAsyncHandler.class);

    private final RefreshableOnNotAuthenticatedProvider<?> authDetailsProvider;
    private final AsyncHandler<REQUEST, RESPONSE> innerHandler;
    private int currentAttempt = 0;

    public RefreshAuthTokenWrappingAsyncHandler(
            RefreshableOnNotAuthenticatedProvider<?> authDetailsProvider,
            AsyncHandler<REQUEST, RESPONSE> innerHandler) {
        this.authDetailsProvider = authDetailsProvider;
        this.innerHandler = innerHandler;
        LOG.warn(
                "The class {} should not be used after version 1.25.1. You are using an oci-java-sdk-common "
                        + "version newer than 1.25.1 with a service client of version 1.25.1 or older. Upgrade your "
                        + "service client version to match your oci-java-sdk-common version.",
                this.getClass().getName());
    }

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
     * If we need to retry the request (i.e. on a 401), this method contains the information on how
     * to do that. This method will be leveraged by the onError callback of this handler.
     */
    public abstract void retryCall();
}
