/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

import jakarta.annotation.Nonnull;

public class StreamAsyncClientBuilder
        extends AbstractStreamBasedClientBuilder<StreamAsyncClientBuilder, StreamAsyncClient> {
    public StreamAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public StreamAsyncClient build(
            @Nonnull AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }

        String streamEndpoint = getEndpoint();

        // We create a copy of the builder and set the endpoint there, this way we don't modify this
        // builder
        // Otherwise, we might have both endpoint and stream or streamSummary set, which would cause
        // an exception to be thrown in getEndpoint(), if this builder were used a second time.
        StreamAsyncClientBuilder copy =
                StreamAsyncClient.builder().copyFrom(this).endpoint(streamEndpoint);

        return new StreamAsyncClient(copy, authenticationDetailsProvider);
    }
}
