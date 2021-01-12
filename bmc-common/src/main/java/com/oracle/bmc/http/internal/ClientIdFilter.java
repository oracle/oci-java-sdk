/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import com.oracle.bmc.ClientRuntime;

/**
 * Filter that adds the client identifier headers to every request.
 * <p>
 * The headers will always be replaced if they exist already.
 */
@Priority(Priorities.HEADER_DECORATOR)
public class ClientIdFilter implements ClientRequestFilter {

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        MultivaluedMap<String, Object> headers = requestContext.getHeaders();

        headers.putSingle(HttpHeaders.USER_AGENT, ClientRuntime.getRuntime().getUserAgent());
        headers.putSingle("opc-client-info", ClientRuntime.getRuntime().getClientInfo());
    }
}
