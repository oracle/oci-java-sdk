/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.responses.internal;

import com.oracle.bmc.responses.AsyncHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ForwardingAsyncHandler<REQUEST, RESPONSE> implements AsyncHandler<REQUEST, RESPONSE> {
    private final AsyncHandler<REQUEST, RESPONSE> delegate;

    @Override
    public void onSuccess(REQUEST request, RESPONSE response) {
        if (delegate != null) {
            delegate.onSuccess(request, response);
        }
    }

    @Override
    public void onError(REQUEST request, Throwable error) {
        if (delegate != null) {
            delegate.onError(request, error);
        }
    }
}
