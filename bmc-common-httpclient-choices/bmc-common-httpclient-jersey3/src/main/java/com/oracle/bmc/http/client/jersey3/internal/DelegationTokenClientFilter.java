/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.internal;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;

import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;

/** Filter that injects delegation token into the request (for either obo or delegation request) */
@Priority(DelegationTokenClientFilter.PRIORITY)
public class DelegationTokenClientFilter implements RequestInterceptor {
    // priority must be higher than AUTHENTICATION so it can add the header before the signing
    // happens
    public static final int PRIORITY = Priorities.AUTHENTICATION - 2;
    public static final String OPC_OBO_TOKEN = "opc-obo-token";

    private final String delegationToken;

    public DelegationTokenClientFilter(@Nonnull String delegationToken) {
        if (delegationToken == null) {
            throw new NullPointerException("delegationToken is marked non-null but is null");
        }
        this.delegationToken = delegationToken;
    }

    @Override
    public void intercept(HttpRequest request) {
        request.header(OPC_OBO_TOKEN, this.delegationToken);
    }
}
