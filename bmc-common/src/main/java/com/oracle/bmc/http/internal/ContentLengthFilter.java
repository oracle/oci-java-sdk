/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.util.internal.StringUtils;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

/**
 * A client request filter to remove content-length.
 * It is required for calls to only allow Apache and Resteasy to set the content-length header.
 */
public class ContentLengthFilter implements ClientRequestFilter {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContentLengthFilter.class);

    private final boolean removeZeroLengthHeader;

    public ContentLengthFilter() {
        // by default we remove the header regardless of value
        this(true);
    }

    public ContentLengthFilter(boolean removeZeroLengthHeader) {
        this.removeZeroLengthHeader = removeZeroLengthHeader;
    }

    @Override
    public void filter(ClientRequestContext requestContext) {
        final MultivaluedMap<String, Object> headers = requestContext.getHeaders();
        final String method = requestContext.getMethod();
        final String uri = requestContext.getUri().toString();

        if (headers == null) {
            LOG.debug(
                    "Headers from request context is null for Method [{}], URI [{}]", method, uri);
            return;
        }

        String contentLengthHeader = null;
        for (String key : headers.keySet()) {
            if (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(key)) {
                contentLengthHeader = key;
            }
        }

        if (contentLengthHeader == null) {
            LOG.debug("content-length not found for Method [{}], URI [{}]", method, uri);
            return;
        }

        Object contentLengthValue = headers.getFirst(contentLengthHeader);
        if (!removeZeroLengthHeader && "0".equals(contentLengthValue)) {
            LOG.debug("Not removing zero content-length for Mehtod [{}], URI [{}]", method, uri);
            return;
        }

        final Object existingContentLengthValue = headers.remove(contentLengthHeader);
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
