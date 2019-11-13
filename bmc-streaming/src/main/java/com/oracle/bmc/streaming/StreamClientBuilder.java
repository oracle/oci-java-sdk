/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

public class StreamClientBuilder
        extends AbstractStreamBasedClientBuilder<StreamClientBuilder, StreamClient> {
    public StreamClientBuilder(Service service) {
        super(service);
    }

    @Override
    public StreamClient build(AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new StreamClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
