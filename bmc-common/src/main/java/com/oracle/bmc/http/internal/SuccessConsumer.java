/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import javax.ws.rs.core.Response;

import com.google.common.base.Function;
import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.util.internal.Consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Basic Consumer to handle successful calls.
 *
 * @param <REQUEST> The request type.
 * @param <RESPONSE> The response type.
 */
@Slf4j
@RequiredArgsConstructor
public class SuccessConsumer<REQUEST, RESPONSE> implements Consumer<Response> {
    private final AsyncHandler<REQUEST, RESPONSE> handler;
    private final Function<Response, RESPONSE> transformer;
    private final REQUEST request;

    @Override
    public void accept(Response response) {
        if (handler != null) {
            // only transform if there's a handler
            RESPONSE responseWrapper = transformer.apply(response);
            handler.onSuccess(request, responseWrapper);
        } else {
            LOG.debug("Request successful, but no handler configured");
        }
    }
}
