/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.oracle.bmc.http.signing.internal.Constants.CROSS_TENANCY_REQUEST_HEADER_NAME;

/** Filter that injects authentication headers into the request. */
public class CrossTenancyRequestClientFilter implements RequestInterceptor {
    // run before Priorities.AUTHENTICATION
    public static final int PRIORITY = Priorities.AUTHENTICATION - 1;
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
    public void intercept(HttpRequest request) {
        request.header(CROSS_TENANCY_REQUEST_HEADER_NAME, authorizedTenancyIdsValue);
    }
}
