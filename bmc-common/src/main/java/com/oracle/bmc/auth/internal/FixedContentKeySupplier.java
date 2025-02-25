/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/**
 * This is a SessionKeySupplier which fakes the ability to refresh its contained key.
 * It is initialised once with fixed values of private key and (optional) passphrase; that key is always returned.
 */
public class FixedContentKeySupplier implements SessionKeySupplier {
    final private KeyPair keyPair;

    public FixedContentKeySupplier(String privateKeyContents, char[] passphrase) {
        try (ByteArrayInputStream inputStream =
                new ByteArrayInputStream(privateKeyContents.getBytes())) {
            final RSAPrivateKey privateKey =
                    new PEMFileRSAPrivateKeySupplier(inputStream, passphrase)
                            .supplyKey("unused")
                            .orElse(null);

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPrivateCrtKeySpec keySpec =
                    keyFactory.getKeySpec(
                            keyFactory.translateKey(privateKey), RSAPrivateCrtKeySpec.class);
            final RSAPublicKey publicKey =
                    (RSAPublicKey)
                            keyFactory.generatePublic(
                                    new RSAPublicKeySpec(
                                            keySpec.getModulus(), keySpec.getPublicExponent()));
            keyPair = new KeyPair(publicKey, privateKey);
        } catch (NoSuchAlgorithmException
                | InvalidKeyException
                | InvalidKeySpecException
                | IOException e) {
            throw new IllegalStateException("problem handling private key", e);
        }
    }

    @Override
    public KeyPair getKeyPair() {
        return keyPair;
    }

    @Override
    public RSAPublicKey getPublicKey() {
        return (RSAPublicKey) keyPair.getPublic();
    }

    @Override
    public RSAPrivateKey getPrivateKey() {
        return (RSAPrivateKey) keyPair.getPrivate();
    }

    @Override
    public void refreshKeys() {}
}
