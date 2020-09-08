/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.signing.internal.Constants;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Configurator that injects a delegation token on every request.
 */
@RequiredArgsConstructor
public class DelegationTokenConfigurator implements ClientConfigurator {
    private final String delegationToken;

    @Override
    public void customizeBuilder(ClientBuilder builder) {}

    @Override
    public void customizeClient(Client client) {
        client.register(new DelegationTokenClientFilter(this.delegationToken));
    }

    /**
     * Filter that injects delegation token into the request (for either obo or delegation request)
     */
    @Priority(DelegationTokenClientFilter.PRIORITY)
    public static class DelegationTokenClientFilter implements ClientRequestFilter {
        // priority must be higher than AUTHENTICATION so it can add the header before the signing happens
        public static final int PRIORITY = Priorities.AUTHENTICATION - 2;

        private final String delegationToken;

        public DelegationTokenClientFilter(@NonNull String delegationToken) {
            this.delegationToken = delegationToken;
        }

        @Override
        public void filter(@NonNull ClientRequestContext clientRequestContext) throws IOException {
            clientRequestContext
                    .getHeaders()
                    .putSingle(Constants.OPC_OBO_TOKEN, this.delegationToken);
        }
    }
}
