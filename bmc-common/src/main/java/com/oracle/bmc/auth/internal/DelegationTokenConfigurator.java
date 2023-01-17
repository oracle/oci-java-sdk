/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.signing.internal.Constants;
import javax.annotation.Nonnull;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Configurator that injects a delegation token on every request.
 */
public class DelegationTokenConfigurator implements ClientConfigurator {
    private final String delegationToken;

    @java.beans.ConstructorProperties({"delegationToken"})
    public DelegationTokenConfigurator(String delegationToken) {
        this.delegationToken = delegationToken;
    }

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

        public DelegationTokenClientFilter(@Nonnull String delegationToken) {
            if (delegationToken == null) {
                throw new java.lang.NullPointerException(
                        "delegationToken is marked non-null but is null");
            }
            this.delegationToken = delegationToken;
        }

        @Override
        public void filter(@Nonnull ClientRequestContext clientRequestContext) throws IOException {
            if (clientRequestContext == null) {
                throw new java.lang.NullPointerException(
                        "clientRequestContext is marked non-null but is null");
            }
            clientRequestContext
                    .getHeaders()
                    .putSingle(Constants.OPC_OBO_TOKEN, this.delegationToken);
        }
    }
}
