/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.encryption.OciCryptoInputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EncryptionStream extends OciCryptoInputStream {
    private final CipherInputStream cipherInputStream;
    private final InputStream inputStream;
    private final ByteArrayInputStream headerBuffer;

    public EncryptionStream(
            final InputStream inputStream, Cipher cipher, final EncryptionHeader header) {
        super(header);
        cipherInputStream = new CipherInputStream(inputStream, cipher);
        this.inputStream = inputStream;
        headerBuffer = new ByteArrayInputStream(header.getHeaderBytes());
    }

    /**
     * Reads up to len bytes of data from the input stream into an array of bytes. An attempt is
     * made to read as many as len bytes, but a smaller number may be read. The number of bytes
     * actually read is returned as an integer.
     *
     * @param b The buffer into which the data is read.
     * @return The total number of bytes read into the buffer, or -1 if there is no more data
     *     because the end of the stream has been reached.
     */
    public int read(byte[] b) throws IOException {
        // Read the header first unencrypted
        int result = headerBuffer.read(b);
        if (result == -1) {
            // Read the data encrypted
            result = cipherInputStream.read(b);
        }
        return result;
    }

    /**
     * Close the CipherInputStream and InputStream
     *
     * @throws IOException
     */
    public void close() throws IOException {
        if (cipherInputStream != null) {
            cipherInputStream.close();
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
