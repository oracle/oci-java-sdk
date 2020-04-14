/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.CryptoAlgorithm;
import com.oracle.bmc.encryption.internal.DataKey;

/**
 * Represents a MasterKey used to encrypt/decrypt Data Key.
 */
public interface MasterKey {
    /**
     * Generates a data encryption key (DEK) based on the algorithm provided using
     *         this MasterKey.  The returned DataKey includes a copy of the
     *         DEK encrypted under this MasterKey.
     * @param cryptoAlgorithm
     * @return DataKey
     */
    DataKey generateDataEncryptionKey(CryptoAlgorithm cryptoAlgorithm);

    /**
     * Decrypts and returns data key that was encrypted under this master key.
     * @param encryptedDataKey
     * @param masterKeyId
     * @return Decrypted data key
     */
    String decryptDataKey(String encryptedDataKey, String masterKeyId);
}
