/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;

/**
 * An abstract client builder for clients that need the managementEndpoint
 *
 * @param <B> actual builder class
 * @param <C> client class
 */
public abstract class AbstractKmsManagementClientBuilder<
                B extends AbstractKmsManagementClientBuilder, C>
        extends AbstractVaultBasedClientBuilder<B, C> {
    public AbstractKmsManagementClientBuilder(Service service) {
        super(service);
    }

    protected String getEndpoint() {
        String managementEndpoint = null;

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
            managementEndpoint = vault.getManagementEndpoint();
        }
        if (vaultSummary != null) {
            managementEndpoint = vaultSummary.getManagementEndpoint();
        }
        if (endpoint != null) {
            managementEndpoint = endpoint;
        }
        return managementEndpoint;
    }
}
