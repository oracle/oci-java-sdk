/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.util.internal.Consumer;

/**
 * Basic Consumer type to handle failed calls.
 *
 * @param <REQUEST> The request type.
 */
public class ErrorConsumer<REQUEST> implements Consumer<Throwable> {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ErrorConsumer.class);

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

    @java.beans.ConstructorProperties({"handler", "request"})
    public ErrorConsumer(final AsyncHandler<REQUEST, ?> handler, final REQUEST request) {
        this.handler = handler;
        this.request = request;
    }
}
