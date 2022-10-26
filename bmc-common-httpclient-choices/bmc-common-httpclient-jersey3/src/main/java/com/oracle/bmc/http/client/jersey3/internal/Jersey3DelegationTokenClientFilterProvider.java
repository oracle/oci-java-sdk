/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.internal;

import javax.annotation.Nonnull;

import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.internal.DelegationTokenClientFilterProvider;

public class Jersey3DelegationTokenClientFilterProvider
        implements DelegationTokenClientFilterProvider {
    private static final Jersey3DelegationTokenClientFilterProvider INSTANCE =
            new Jersey3DelegationTokenClientFilterProvider();

    static {
        // make loading this class fail if javax.annotation is not on classpath
        jakarta.annotation.Priority.class.getName();
    }

    public Jersey3DelegationTokenClientFilterProvider() {}

    public static Jersey3DelegationTokenClientFilterProvider getInstance() {
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
