/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;

/**
 * An abstract client builder for clients that need the cryptoEndpoint
 * @param <B> actual builder class
 * @param <C> client class
 */
public abstract class AbstractKmsCryptoClientBuilder<B extends AbstractKmsCryptoClientBuilder, C>
        extends AbstractVaultBasedClientBuilder<B, C> {
    public AbstractKmsCryptoClientBuilder(Service service) {
        super(service);
    }

    protected String getEndpoint() {
        String cryptoEndpoint = null;

        // vault and vault summary are exclusive
        int endpointsProvided = 0;
        if (vault != null) {
            ++endpointsProvided;
        }
        if (vaultSummary != null) {
            ++endpointsProvided;
        }
        if (endpoint != null) {
            ++endpointsProvided;
        }
        if (endpointsProvided != 1) {
            throw new IllegalArgumentException(
                    "Must provide exactly one of vault, vault summary, or endpoint");
        }

        if (vault != null) {
            cryptoEndpoint = vault.getCryptoEndpoint();
        }
        if (vaultSummary != null) {
            cryptoEndpoint = vaultSummary.getCryptoEndpoint();
        }
        if (endpoint != null) {
            cryptoEndpoint = endpoint;
        }
        return cryptoEndpoint;
    }
}
