/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import javax.annotation.Nonnull;

import javax.annotation.Priority;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.oracle.bmc.http.signing.internal.Constants.CROSS_TENANCY_REQUEST_HEADER_NAME;

/**
 * Filter that injects authentication headers into the request.
 */
@Priority(CrossTenancyRequestClientFilter.PRIORITY)
public class CrossTenancyRequestClientFilter implements ClientRequestFilter {
    // run before javax.ws.rs.Priorities.AUTHENTICATION
    public static final int PRIORITY = javax.ws.rs.Priorities.AUTHENTICATION - 1;
    private final String authorizedTenancyIdsValue;

    public CrossTenancyRequestClientFilter(String[] authorizedTenancyIds) {
        if (authorizedTenancyIds == null || authorizedTenancyIds.length == 0) {
            throw new IllegalArgumentException("Must provide at least one authorized tenancyId");
        }
        for (String authorizedTenancyId : authorizedTenancyIds) {
            if (authorizedTenancyId == null || authorizedTenancyId.isEmpty()) {
                throw new IllegalArgumentException("Authorized tenancyId was not valid");
            }
        }
        this.authorizedTenancyIdsValue =
                Arrays.asList(authorizedTenancyIds).stream().collect(Collectors.joining(","));
    }

    @Override
    public void filter(@Nonnull ClientRequestContext clientRequestContext) throws IOException {
        if (clientRequestContext == null) {
            throw new java.lang.NullPointerException(
                    "clientRequestContext is marked non-null but is null");
        }
        clientRequestContext
                .getHeaders()
                .putSingle(CROSS_TENANCY_REQUEST_HEADER_NAME, authorizedTenancyIdsValue);
    }
}
