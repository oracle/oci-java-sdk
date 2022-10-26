/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class FileBasedKeySupplier implements SessionKeySupplier {
    private volatile KeyPair keyPair;
    private final String privateKeyPath;
    private final Path passphrasePath;

    public FileBasedKeySupplier(String privateKeyPath, String passphrasePath) {
        this.privateKeyPath = privateKeyPath;
        if (passphrasePath != null) {
            this.passphrasePath = new File(passphrasePath).toPath();
        } else {
            this.passphrasePath = null;
        }
        refreshKeys();
    }

    @Override
    public KeyPair getKeyPair() {
        return keyPair;
    }

    @Override
    public void refreshKeys() {
        if (this.privateKeyPath == null) {
            throw new IllegalArgumentException("privateKeyPath not set");
        }

        try (InputStream in = new FileInputStream(this.privateKeyPath)) {
            char[] passphrase = null;
            if (passphrasePath != null) {
                passphrase = new String(Files.readAllBytes(passphrasePath)).toCharArray();
            }

            RSAPrivateKey privateKey =
                    new PEMFileRSAPrivateKeySupplier(in, passphrase)
                            .supplyKey("unused")
                            .orElse(null);

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPrivateCrtKeySpec keySpec =
                    keyFactory.getKeySpec(
                            keyFactory.translateKey(privateKey), RSAPrivateCrtKeySpec.class);
            RSAPublicKey publicKey =
                    (RSAPublicKey)
                            keyFactory.generatePublic(
                                    new RSAPublicKeySpec(
                                            keySpec.getModulus(), keySpec.getPublicExponent()));
            keyPair = new KeyPair(publicKey, privateKey);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Can't find file for private key", e);
        } catch (IOException e) {
            throw new RuntimeException("cannot read the passphrase", e);
        } catch (NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException e) {
            throw new IllegalStateException("problem handling private key", e);
        }
    }
}
