/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.encryption.internal.EncryptionHeader;

/**
 * OciCryptoResult holds the encryption/decryption output.
 */
public class OciCryptoResult {
    private final EncryptionHeader header;
    private final byte[] result;

    public OciCryptoResult(byte[] result, EncryptionHeader header) {
        this.header = header;
        this.result = result;
    }

    /**
     * Get the encryption context.
     * It can be used to verify the Additional Authenticated Data.
     * @return Map of strings.
     */
    public Map<String, String> getContext() {
        try {
            return header.getContext();
        } catch (JsonProcessingException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Returns the encrypted or decrypted bytes associated with this OciCryptoResult.
     * @return bytes array
     */
    public byte[] getResult() {
        return result;
    }
}
