/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.UUID;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import lombok.extern.slf4j.Slf4j;

/**
 * Filter that always ensures there is an opc-request-id sent by the client to
 * make it easier to track down requests when customers contact Oracle for
 * support.
 */
@Slf4j
@Priority(Priorities.HEADER_DECORATOR)
public class RequestIdFilter implements ClientRequestFilter {
    private static final String OPC_REQUEST_ID_HEADER = "opc-request-id";

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        // only add if the customer has not added it themselves.
        if (!requestContext.getHeaders().containsKey(OPC_REQUEST_ID_HEADER)) {
            String requestId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
            LOG.debug("Generated request ID: {}", requestId);
            requestContext.getHeaders().putSingle(OPC_REQUEST_ID_HEADER, requestId);
        }
    }
}
