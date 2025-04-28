/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.EncryptionHeader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/** OciCryptoInputStream holds the encrypted/decrypted stream. */
public abstract class OciCryptoInputStream extends InputStream {
    protected final EncryptionHeader header;

    public OciCryptoInputStream(EncryptionHeader header) {
        this.header = header;
    }

    /**
     * Get the encryption Context. It can be used to verify the Additional Authenticated Data.
     *
     * @return Map of strings
     */
    public Map<String, String> getContext() {
        try {
            return header.getContext();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Reads a byte from the stream
     *
     * @return The byte read
     */
    @Override
    public int read() throws IOException {
        byte[] b = new byte[1];
        int result = read(b);
        if (result == -1) {
            return -1;
        } else {
            return b[0];
        }
    }
}
