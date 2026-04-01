/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.EncryptionHeader;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class OciCryptoInputStreamTest {

    private EncryptionHeader header;

    @Before
    public void setup() {
        header = null;
    }

    @Test
    public void testRead_ReturnsByte_WhenReadByteArrayReturnsOne() throws IOException {
        OciCryptoInputStream ociCryptoInputStream =
                new OciCryptoInputStream(header) {
                    @Override
                    public int read(byte[] b) throws IOException {
                        b[0] = (byte) 0xFF;
                        return 1;
                    }
                };

        int result = ociCryptoInputStream.read();

        assertEquals(255, result);
    }

    @Test
    public void testRead_ReturnsMinusOne_WhenReadByteArrayReturnsMinusOne() throws IOException {
        OciCryptoInputStream ociCryptoInputStream =
                new OciCryptoInputStream(header) {
                    @Override
                    public int read(byte[] b) throws IOException {
                        return -1;
                    }
                };

        int result = ociCryptoInputStream.read();

        assertEquals(-1, result);
    }

    @Test(expected = IOException.class)
    public void testRead_ThrowsIOException_WhenReadByteArrayThrowsIOException() throws IOException {
        OciCryptoInputStream ociCryptoInputStream =
                new OciCryptoInputStream(header) {
                    @Override
                    public int read(byte[] b) throws IOException {
                        throw new IOException("Mocked IOException");
                    }
                };

        ociCryptoInputStream.read();
    }
}
