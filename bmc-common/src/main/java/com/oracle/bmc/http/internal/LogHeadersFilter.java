/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.util.VisibleForTesting;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/** Filter that logs all of the outbound and inbound headers at debug level. */
public class LogHeadersFilter implements RequestInterceptor {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogHeadersFilter.class);

    @VisibleForTesting
    protected List<String> maskValue(List<String> values) {
        return values.stream()
                .map(e -> e.replaceAll("(?<=keyId=)\"(.*?)\"", "\"REDACTED\""))
                .collect(Collectors.toList());
    }

    @Override
    public void intercept(HttpRequest request) {
        if (!LOG.isDebugEnabled()) {
            return;
        }
        LOG.debug("Sending '{}' request to '{}'", request.method(), request.uri());
        Map<String, List<String>> headers = request.headers();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            List<String> value = entry.getValue();
            if (entry.getKey() != null && entry.getKey().equalsIgnoreCase("authorization")) {
                value = maskValue(entry.getValue());
            }
            LOG.debug("Sending header '{}' with value '{}'", entry.getKey(), value);
        }
    }
}
