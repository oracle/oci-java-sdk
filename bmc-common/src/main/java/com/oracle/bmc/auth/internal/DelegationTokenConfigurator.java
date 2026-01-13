/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.internal.DelegationTokenClientFilterProvider;

/** Configurator that injects a delegation token on every request. */
public class DelegationTokenConfigurator implements ClientConfigurator {
    private final String delegationToken;

    @java.beans.ConstructorProperties({"delegationToken"})
    public DelegationTokenConfigurator(String delegationToken) {
        this.delegationToken = delegationToken;
    }

    @Override
    public void customizeClient(HttpClientBuilder builder) {
        DelegationTokenClientFilterProvider provider =
                DelegationTokenClientFilterProvider.getDefault();
        builder.registerRequestInterceptor(
                provider.getPriority(),
                provider.newDelegationTokenClientFilter(this.delegationToken));
    }
}
