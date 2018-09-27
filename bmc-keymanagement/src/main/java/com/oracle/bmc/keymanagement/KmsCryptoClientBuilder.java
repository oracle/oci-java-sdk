/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

@lombok.extern.slf4j.Slf4j
public class KmsCryptoClientBuilder
        extends AbstractKmsCryptoClientBuilder<KmsCryptoClientBuilder, KmsCryptoClient> {
    public KmsCryptoClientBuilder(Service service) {
        super(service);
    }

    @Override
    public KmsCryptoClient build(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new KmsCryptoClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
