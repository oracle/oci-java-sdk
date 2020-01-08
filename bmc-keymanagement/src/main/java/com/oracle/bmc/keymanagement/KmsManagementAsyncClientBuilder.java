/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

@lombok.extern.slf4j.Slf4j
public class KmsManagementAsyncClientBuilder
        extends AbstractKmsManagementClientBuilder<
                KmsManagementAsyncClientBuilder, KmsManagementAsyncClient> {
    public KmsManagementAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public KmsManagementAsyncClient build(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new KmsManagementAsyncClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
