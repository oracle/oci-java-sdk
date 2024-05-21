/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.function.Function;
import javax.ws.rs.core.Response;

import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.util.internal.Consumer;

/**
 * Basic Consumer to handle successful calls.
 *
 * @param <REQUEST> The request type.
 * @param <RESPONSE> The response type.
 */
public class SuccessConsumer<REQUEST, RESPONSE> implements Consumer<Response> {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SuccessConsumer.class);
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

    @java.beans.ConstructorProperties({"handler", "transformer", "request"})
    public SuccessConsumer(
            final AsyncHandler<REQUEST, RESPONSE> handler,
            final Function<Response, RESPONSE> transformer,
            final REQUEST request) {
        this.handler = handler;
        this.transformer = transformer;
        this.request = request;
    }
}
