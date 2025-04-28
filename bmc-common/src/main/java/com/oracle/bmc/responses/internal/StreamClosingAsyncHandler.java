/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.responses.internal;

import java.io.InputStream;

import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.AsyncHandler;

/**
 * A wrapper around an async handler that closes the stream at the end of a request, if the body is
 * a stream.
 *
 * @param <REQUEST> type of the request
 * @param <RESPONSE> type of the response
 */
public class StreamClosingAsyncHandler<REQUEST extends BmcRequest<?>, RESPONSE>
        extends ForwardingAsyncHandler<REQUEST, RESPONSE> {
    public StreamClosingAsyncHandler(AsyncHandler<REQUEST, RESPONSE> delegate) {
        super(delegate);
    }

    @Override
    public void onSuccess(REQUEST request, RESPONSE response) {
        if (request.getBody$() instanceof InputStream) {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    (InputStream) request.getBody$());
        }
        super.onSuccess(request, response);
    }

    @Override
    public void onError(REQUEST request, Throwable error) {
        if (request.getBody$() instanceof InputStream) {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    (InputStream) request.getBody$());
        }
        super.onError(request, error);
    }
}
