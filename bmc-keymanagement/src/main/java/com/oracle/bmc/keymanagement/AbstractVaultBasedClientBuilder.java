/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.Service;
import com.oracle.bmc.common.ClientBuilderBase;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.model.VaultSummary;

/**
 * A builder for a client that requires a vault.
 *
 * @param <B> actual class of the builder
 * @param <C> client class
 */
public abstract class AbstractVaultBasedClientBuilder<B extends AbstractVaultBasedClientBuilder, C>
        extends ClientBuilderBase<B, C> {
    protected Vault vault = null;
    protected VaultSummary vaultSummary = null;

    /**
     * Set the vault. May be null
     *
     * @param vault the vault to use. May be null.
     * @return this builder
     */
    public B vault(Vault vault) {
        this.vault = vault;
        return (B) this;
    }

    /**
     * Set the vault summary. May be null
     *
     * @param vaultSummary the vault summary to use. May be null
     * @return this builder
     */
    public B vaultSummary(VaultSummary vaultSummary) {
        this.vaultSummary = vaultSummary;
        return (B) this;
    }

    public AbstractVaultBasedClientBuilder(Service service) {
        super(service);
    }
}
