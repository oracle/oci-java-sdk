/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

import com.oracle.bmc.util.VisibleForTesting;

/**
 * Filter that logs all of the outbound and inbound headers at debug level.
 */
@Priority(Priorities.USER)
public class LogHeadersFilter implements ClientResponseFilter, ClientRequestFilter {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogHeadersFilter.class);

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
            List<String> value = entry.getValue();
            if (entry.getKey() != null && entry.getKey().equalsIgnoreCase("authorization")) {
                value = maskValue(entry.getValue());
            }
            LOG.debug("Sending header '{}' with value '{}'", entry.getKey(), value);
        }
    }

    @VisibleForTesting
    protected List<String> maskValue(List<String> values) {
        return values.stream()
                .map(e -> e.replaceAll("(?<=keyId=)\"(.*?)\"", "\"REDACTED\""))
                .collect(Collectors.toList());
    }
}
