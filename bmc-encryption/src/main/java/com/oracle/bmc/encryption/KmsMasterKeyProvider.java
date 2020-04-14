/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.encryption.internal.CryptoAlgorithm;
import lombok.Getter;

/**
 * Represents a KmsMasterKeyProvider that holds KmsMasterKeys.
 */
public class KmsMasterKeyProvider implements MasterKeyProvider {
    private final KmsMasterKey kmsMasterKey;
    private final AuthenticationDetailsProvider authenticationDetailsProvider;

    /**
     * Initialize KmsMasterKeyProvider for decryption.
     * @param authenticationDetailsProvider Authentication Provider for OCI.
     */
    public KmsMasterKeyProvider(AuthenticationDetailsProvider authenticationDetailsProvider) {
        this.kmsMasterKey = null;
        this.authenticationDetailsProvider = authenticationDetailsProvider;
    }
    /**
     * Initialize KmsMasterKeyProvider with kmsMasterKey for encryption.
     * @param kmsMasterKey OCI KMS Key.
     */
    public KmsMasterKeyProvider(KmsMasterKey kmsMasterKey) {
        this.kmsMasterKey = kmsMasterKey;
        this.authenticationDetailsProvider = kmsMasterKey.getProvider();
    }

    /**
     * Get kmsMasterKey.
     */
    @Override
    public KmsMasterKey getMasterKey() {
        return kmsMasterKey;
    }
    /**
     * Get Authentication Details Provider.
     */
    @Override
    public AuthenticationDetailsProvider getAuthenticationProvider() {
        return authenticationDetailsProvider;
    }
    /**
     * Get Crypto Algorithm.
     * The default is AES_256_GCM_IV12_TAG16
     */
    @Override
    public CryptoAlgorithm getCryptoAlgorithm() {
        return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
    }
}
