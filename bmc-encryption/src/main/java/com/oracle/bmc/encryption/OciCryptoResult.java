/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.EncryptionHeader;

import java.io.IOException;
import java.util.Map;

/** OciCryptoResult holds the encryption/decryption output. */
public class OciCryptoResult {
    private final EncryptionHeader header;
    private final byte[] result;

    public OciCryptoResult(byte[] result, EncryptionHeader header) {
        this.header = header;
        this.result = result;
    }

    /**
     * Get the encryption context. It can be used to verify the Additional Authenticated Data.
     *
     * @return Map of strings.
     */
    public Map<String, String> getContext() {
        try {
            return header.getContext();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Returns the encrypted or decrypted bytes associated with this OciCryptoResult.
     *
     * @return bytes array
     */
    public byte[] getResult() {
        return result;
    }
}
