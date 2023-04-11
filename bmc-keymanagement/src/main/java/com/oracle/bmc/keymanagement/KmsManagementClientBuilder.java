/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import jakarta.annotation.Nonnull;

import java.util.concurrent.ExecutorService;

public class KmsManagementClientBuilder
        extends AbstractKmsManagementClientBuilder<
                KmsManagementClientBuilder, KmsManagementClient> {
    protected java.util.concurrent.ExecutorService executorService = null;

    public KmsManagementClientBuilder(Service service) {
        super(service);
    }

    public KmsManagementClientBuilder executorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    @Override
    public KmsManagementClient build(
            @Nonnull AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }

        String cryptoEndpoint = getEndpoint();

        // We create a copy of the builder and set the endpoint there, this way we don't modify this
        // builder
        // Otherwise, we might have both endpoint and vault or vaultSummary set, which would cause
        // an exception to be thrown in getEndpoint(), if this builder were used a second time.
        KmsManagementClientBuilder copy =
                KmsManagementClient.builder().copyFrom(this).endpoint(cryptoEndpoint);

        return new KmsManagementClient(copy, authenticationDetailsProvider, executorService);
    }
}
