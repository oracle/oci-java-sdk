/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

import lombok.extern.slf4j.Slf4j;

/**
 * Filter that logs all of the outbound and inbound headers at debug level.
 */
@Priority(Priorities.USER)
@Slf4j
public class LogHeadersFilter implements ClientResponseFilter, ClientRequestFilter {

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext)
            throws IOException {
        if (!LOG.isDebugEnabled()) {
            return;
        }
        LOG.debug(
                "Received '{}' response for '{}' request to '{}'",
                responseContext.getStatus(),
                requestContext.getMethod(),
                requestContext.getUri());
        MultivaluedMap<String, String> headers = responseContext.getHeaders();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            LOG.debug("Received header '{}' with value '{}'", entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        if (!LOG.isDebugEnabled()) {
            return;
        }
        LOG.debug(
                "Sending '{}' request to '{}'",
                requestContext.getMethod(),
                requestContext.getUri());
        MultivaluedMap<String, String> headers = requestContext.getStringHeaders();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            LOG.debug("Sending header '{}' with value '{}'", entry.getKey(), entry.getValue());
        }
    }
}
