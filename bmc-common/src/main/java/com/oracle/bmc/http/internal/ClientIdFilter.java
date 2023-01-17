/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;

/**
 * Filter that adds the client identifier headers to every request.
 *
 * <p>The headers will always be replaced if they exist already.
 */
public class ClientIdFilter implements RequestInterceptor {

    @Override
    public void intercept(HttpRequest request) {
        request.header("User-Agent", ClientRuntime.getRuntime().getUserAgent());
        request.header("opc-client-info", ClientRuntime.getRuntime().getClientInfo());
    }
}
