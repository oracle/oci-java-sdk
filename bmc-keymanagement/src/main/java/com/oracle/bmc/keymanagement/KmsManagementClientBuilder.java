/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

@lombok.extern.slf4j.Slf4j
public class KmsManagementClientBuilder
        extends AbstractKmsManagementClientBuilder<
                KmsManagementClientBuilder, KmsManagementClient> {
    public KmsManagementClientBuilder(Service service) {
        super(service);
    }

    @Override
    public KmsManagementClient build(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String managementEndpoint = getEndpoint();

        return new KmsManagementClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                managementEndpoint);
    }
}
