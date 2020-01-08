/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.responses;

/**
 * Callback for asynchronous requests.
 *
 * @param <REQUEST>
 *            The request type.
 * @param <RESPONSE>
 *            The response type.
 */
public interface AsyncHandler<REQUEST, RESPONSE> {

    /**
     * Called if the request was successfully completed.
     *
     * @param request
     *            The request that was made.
     * @param response
     *            The response that was received.
     */
    void onSuccess(REQUEST request, RESPONSE response);

    /**
     * Called if the request could not be completed successfully.
     *
     * @param request
     *            The request that was made.
     * @param error
     *            The error that was received.
     */
    void onError(REQUEST request, Throwable error);
}
