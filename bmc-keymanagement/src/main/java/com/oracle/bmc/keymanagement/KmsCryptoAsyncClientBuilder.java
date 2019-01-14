/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

@lombok.extern.slf4j.Slf4j
public class KmsCryptoAsyncClientBuilder
        extends AbstractKmsCryptoClientBuilder<KmsCryptoAsyncClientBuilder, KmsCryptoAsyncClient> {
    public KmsCryptoAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public KmsCryptoAsyncClient build(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new KmsCryptoAsyncClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
