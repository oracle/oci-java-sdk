/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.internal.CryptoAlgorithm;

/** Represents a KmsMasterKeyProvider that holds KmsMasterKeys. */
public class KmsMasterKeyProvider implements MasterKeyProvider {
    private final KmsMasterKey kmsMasterKey;
    private final BasicAuthenticationDetailsProvider authenticationDetailsProvider;

    /**
     * Initialize KmsMasterKeyProvider for decryption.
     *
     * @param authenticationDetailsProvider Authentication Provider for OCI.
     */
    public KmsMasterKeyProvider(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this.kmsMasterKey = null;
        this.authenticationDetailsProvider = authenticationDetailsProvider;
    }
    /**
     * Initialize KmsMasterKeyProvider with kmsMasterKey for encryption.
     *
     * @param kmsMasterKey OCI KMS Key.
     */
    public KmsMasterKeyProvider(KmsMasterKey kmsMasterKey) {
        this.kmsMasterKey = kmsMasterKey;
        this.authenticationDetailsProvider = kmsMasterKey.getProvider();
    }

    /** Get kmsMasterKey. */
    @Override
    public KmsMasterKey getMasterKey() {
        return kmsMasterKey;
    }
    /** Get Authentication Details Provider. */
    @Override
    public BasicAuthenticationDetailsProvider getAuthenticationProvider() {
        return authenticationDetailsProvider;
    }
    /** Get Crypto Algorithm. The default is AES_256_GCM_IV12_TAG16 */
    @Override
    public CryptoAlgorithm getCryptoAlgorithm() {
        return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
    }
}
