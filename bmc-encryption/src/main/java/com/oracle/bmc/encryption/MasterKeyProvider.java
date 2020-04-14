/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.internal.CryptoAlgorithm;

/**
 * Represents a MasterKeyProvider that holds MasterKeys.
 */
public interface MasterKeyProvider<K extends AbstractAuthenticationDetailsProvider> {
    MasterKey getMasterKey();

    K getAuthenticationProvider();

    CryptoAlgorithm getCryptoAlgorithm();
}
