/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.util.internal.Consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Basic Consumer type to handle failed calls.
 *
 * @param <REQUEST> The request type.
 */
@Slf4j
@RequiredArgsConstructor
public class ErrorConsumer<REQUEST> implements Consumer<Throwable> {
    private final AsyncHandler<REQUEST, ?> handler;
    private final REQUEST request;

    @Override
    public void accept(Throwable t) {
        if (handler != null) {
            handler.onError(request, t);
        } else {
            LOG.debug("Request failed, but no handler configured");
        }
    }
}
