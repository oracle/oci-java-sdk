/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.pki;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OpenSslPbeSecretKeyGeneratorTest {

    @Test
    public void testGenerateUsesOpenSslDigestChaining() {
        byte[] key =
                OpenSslPbeSecretKeyGenerator.builder()
                        .password("test-passphrase".toCharArray())
                        .salt(Hex.decode("0102030405060708"))
                        .keyLength(256)
                        .build()
                        .generate();

        assertArrayEquals(
                Hex.decode("088173B66041DE63E07BAB012F106C71FB77702EE57C8295FF473156D64A85C3"),
                key);
    }
}
