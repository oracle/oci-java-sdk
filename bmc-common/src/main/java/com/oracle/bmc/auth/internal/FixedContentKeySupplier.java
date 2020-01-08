/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;

import java.io.ByteArrayInputStream;
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
        final RSAPrivateKey privateKey =
                new PEMFileRSAPrivateKeySupplier(
                                new ByteArrayInputStream(privateKeyContents.getBytes()), passphrase)
                        .getKey("unused")
                        .orNull();

        try {
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
        } catch (NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException e) {
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
