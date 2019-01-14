/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

/**
 * A client request filter to remove content-length.
 * It is required for calls to only allow Apache and Resteasy to set the content-length header.
 */
@Slf4j
public class ContentLengthFilter implements ClientRequestFilter {
    @Override
    public void filter(ClientRequestContext requestContext) {
        String contentLengthHeader = null;
        for (String key : requestContext.getHeaders().keySet()) {
            if (StringUtils.equalsIgnoreCase("content-length", key)) {
                contentLengthHeader = key;
            }
        }

        final String method = requestContext.getMethod();
        final String uri = requestContext.getUri().toString();
        final Object existingContentLengthValue =
                requestContext.getHeaders().remove(contentLengthHeader);
        if (existingContentLengthValue != null) {
            LOG.debug(
                    "Removed existing content-length header for Method [{}], URI [{}], Existing Value [{}]",
                    method,
                    uri,
                    existingContentLengthValue);
        } else {
            LOG.debug("content-length not found for Method [{}], URI [{}]", method, uri);
        }
    }
}
