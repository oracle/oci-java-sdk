/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.internal;

import jakarta.annotation.Nonnull;

import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.internal.DelegationTokenClientFilterProvider;

public class JerseyDelegationTokenClientFilterProvider
        implements DelegationTokenClientFilterProvider {
    private static final JerseyDelegationTokenClientFilterProvider INSTANCE =
            new JerseyDelegationTokenClientFilterProvider();

    static {
        // make loading this class fail if javax.annotation is not on classpath
        javax.annotation.Priority.class.getName();
    }

    public JerseyDelegationTokenClientFilterProvider() {}

    public static JerseyDelegationTokenClientFilterProvider getInstance() {
        return INSTANCE;
    }

    @Override
    public RequestInterceptor newDelegationTokenClientFilter(@Nonnull String delegationToken) {
        return new DelegationTokenClientFilter(delegationToken);
    }

    @Override
    public int getPriority() {
        return DelegationTokenClientFilter.PRIORITY;
    }
}
