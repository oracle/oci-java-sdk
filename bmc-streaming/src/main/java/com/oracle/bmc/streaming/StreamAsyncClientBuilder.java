/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

public class StreamAsyncClientBuilder
        extends AbstractStreamBasedClientBuilder<StreamAsyncClientBuilder, StreamAsyncClient> {
    public StreamAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public StreamAsyncClient build(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new StreamAsyncClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
