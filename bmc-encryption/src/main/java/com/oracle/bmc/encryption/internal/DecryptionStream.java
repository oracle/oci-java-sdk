/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.encryption.OciCryptoInputStream;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptionStream extends OciCryptoInputStream {
    private final Cipher cipher;
    private final InputStream inputStream;
    private boolean isInputStreamDecrypted = false;
    private InputStream decryptInputStream;

    public DecryptionStream(final InputStream inputStream, Cipher cipher, EncryptionHeader header) {
        super(header);
        this.inputStream = inputStream;
        this.cipher = cipher;
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
        if (!isInputStreamDecrypted) {
            byte[] result = decrypt();
            decryptInputStream = new ByteArrayInputStream(result);
            isInputStreamDecrypted = true;
        }
        // read the decrypted stream
        return decryptInputStream.read(b);
    }

    protected byte[] decrypt() throws IOException {
        ByteArrayOutputStream bBuffer = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024 * 16];
        int length = 0;
        try {
            while ((length = inputStream.read(buffer)) != -1) {
                bBuffer.write(buffer, 0, length);
            }
            return cipher.doFinal(bBuffer.toByteArray());
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new RuntimeException("Failed to decrypt the data. ", e);
        }
    }

    public void close() throws IOException {
        if (decryptInputStream != null) {
            decryptInputStream.close();
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
