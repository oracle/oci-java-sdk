/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.pki;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/** Generates the derived key for OpenSSL style encryption for PKCS1 encoded private keys */
class OpenSslPbeSecretKeyFactory {
    private final MessageDigest digest;

    OpenSslPbeSecretKeyFactory() {
        this(digest("MD5"));
    }

    OpenSslPbeSecretKeyFactory(final MessageDigest digest) {
        this.digest = digest;
    }

    private static MessageDigest digest(final String algorithmName) {
        try {
            return MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    Key generateSecret(final PBEKeySpec pbeSpec) throws InvalidKeySpecException {
        OpenSslPbeSecretKeyGenerator generator =
                OpenSslPbeSecretKeyGenerator.builder()
                        .password(pbeSpec.getPassword())
                        .salt(pbeSpec.getSalt())
                        .keyLength(pbeSpec.getKeyLength())
                        .build();
        final byte[] keyBytes = generator.generate();
        return new SecretKeySpec(keyBytes, "OpenSSLPBKDF");
    }
}
