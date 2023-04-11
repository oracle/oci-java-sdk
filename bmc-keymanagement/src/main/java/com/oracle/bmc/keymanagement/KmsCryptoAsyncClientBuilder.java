/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import jakarta.annotation.Nonnull;

public class KmsCryptoAsyncClientBuilder
        extends AbstractKmsCryptoClientBuilder<KmsCryptoAsyncClientBuilder, KmsCryptoAsyncClient> {
    public KmsCryptoAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public KmsCryptoAsyncClient build(
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
        KmsCryptoAsyncClientBuilder copy =
                KmsCryptoAsyncClient.builder().copyFrom(this).endpoint(cryptoEndpoint);

        return new KmsCryptoAsyncClient(copy, authenticationDetailsProvider);
    }
}
