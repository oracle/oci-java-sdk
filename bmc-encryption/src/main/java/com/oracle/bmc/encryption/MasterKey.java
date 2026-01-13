/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.CryptoAlgorithm;
import com.oracle.bmc.encryption.internal.DataKey;

/** Represents a MasterKey used to encrypt/decrypt Data Key. */
public interface MasterKey {
    /**
     * Generates a data encryption key (DEK) based on the algorithm provided using this MasterKey.
     * The returned DataKey includes a copy of the DEK encrypted under this MasterKey.
     *
     * @param cryptoAlgorithm
     * @return DataKey
     */
    DataKey generateDataEncryptionKey(CryptoAlgorithm cryptoAlgorithm);

    /**
     * Decrypts and returns data key that was encrypted under this master key.
     *
     * @param encryptedDataKey
     * @param masterKeyId
     * @return Decrypted data key
     */
    String decryptDataKey(String encryptedDataKey, String masterKeyId);
}
