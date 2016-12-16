/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.interfaces.RSAPrivateKey;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMEncryptedKeyPair;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

import lombok.extern.slf4j.Slf4j;

/**
 * An implementation of {@link KeySupplier} that supplies a RSA private key from
 * a PEM file. Supports both PKCS#8 (starts with '-----BEGIN PRIVATE KEY-----'
 * tag) and PKCS#1 (i.e., starts with '-----BEGIN RSA PRIVATE KEY-----' tag)
 * format.
 * <p>
 * Example commands that can be used to generate a 2048 bits RSA private key:
 * </p>
 * <code>$ openssl genrsa -out privateKey 2048</code>
 * <p>
 * <code>$ ssh-keygen -t rsa -b 2048</code>
 * <p>
 */
@Slf4j
public class PEMFileRSAPrivateKeySupplier implements KeySupplier<RSAPrivateKey> {
    private final JcaPEMKeyConverter converter = new JcaPEMKeyConverter();

    private final RSAPrivateKey key;

    /**
     * Constructs a new file key supplier which reads the private key from the
     * specified file.
     *
     * @param inputStream
     *            the path to the RSA private key
     * @param password
     *            the passphrase of the private key, optional
     */
    public PEMFileRSAPrivateKeySupplier(
            @Nonnull final InputStream inputStream, @Nullable final String password) {
        try {
            LOG.debug("Initializing private key");

            try (PEMParser keyReader =
                    new PEMParser(new InputStreamReader(inputStream, Charsets.UTF_8))) {
                Object object = keyReader.readObject();

                final PrivateKeyInfo keyInfo;

                if (object instanceof PEMEncryptedKeyPair) {
                    Preconditions.checkNotNull(
                            password, "The provided private key requires a passphrase");

                    PEMDecryptorProvider decProv =
                            new JcePEMDecryptorProviderBuilder().build(password.toCharArray());
                    try {
                        keyInfo =
                                ((PEMEncryptedKeyPair) object)
                                        .decryptKeyPair(decProv)
                                        .getPrivateKeyInfo();
                    } catch (EncryptionException ex) {
                        throw new IllegalArgumentException(
                                "The provided passphrase is incorrect.", ex);
                    }
                } else if (object instanceof PrivateKeyInfo) {
                    keyInfo = (PrivateKeyInfo) object;
                } else if (object instanceof PEMKeyPair) {
                    keyInfo = ((PEMKeyPair) object).getPrivateKeyInfo();
                } else if (object instanceof SubjectPublicKeyInfo) {
                    throw new IllegalArgumentException(
                            "Public key provided instead of private key");
                } else {
                    throw new IllegalArgumentException(
                            "Private key must be in PEM format: " + object.getClass());
                }

                this.key = (RSAPrivateKey) converter.getPrivateKey(keyInfo);
            }
        } catch (IOException ex) {
            LOG.debug("Failed to read RSA private key from file", ex);
            throw Throwables.propagate(ex);
        }
    }

    @Override
    public Optional<RSAPrivateKey> getKey(@Nonnull String keyId) {
        return Optional.of(key);
    }
}
