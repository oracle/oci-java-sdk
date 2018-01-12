/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
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
import com.oracle.bmc.util.StreamUtils;

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
     * specified file.  The provided stream will be closed by this supplier automatically.
     *
     * @param inputStream
     *            the path to the RSA private key
     * @param passphraseCharacters
     *            the passphrase of the private key, optional
     */
    public PEMFileRSAPrivateKeySupplier(
            @Nonnull final InputStream inputStream, @Nullable final char[] passphraseCharacters) {
        try {
            LOG.debug("Initializing private key");

            try (PEMParser keyReader =
                    new PEMParser(new InputStreamReader(inputStream, Charsets.UTF_8))) {
                Object object = keyReader.readObject();

                final PrivateKeyInfo keyInfo;

                if (object instanceof PEMEncryptedKeyPair) {
                    Preconditions.checkNotNull(
                            passphraseCharacters, "The provided private key requires a passphrase");

                    PEMDecryptorProvider decProv =
                            new JcePEMDecryptorProviderBuilder().build(passphraseCharacters);
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
                } else if (object != null) {
                    throw new IllegalArgumentException(
                            "Private key must be in PEM format, was: " + object.getClass());
                } else {
                    throw new IllegalArgumentException("Private key must be in PEM format");
                }

                this.key = (RSAPrivateKey) converter.getPrivateKey(keyInfo);
            } finally {
                StreamUtils.closeQuietly(inputStream);
            }
        } catch (IOException ex) {
            LOG.debug("Failed to read RSA private key from file", ex);
            throw Throwables.propagate(ex);
        }
    }

    /**
     * Get the key from the file.
     *
     * @param ignored
     *            this parameter is ignored. The key returned is always the same, the one from the file.
     * @return an Optional for the key
     */
    @Override
    public Optional<RSAPrivateKey> getKey(@Nonnull String ignored) {
        return getKey();
    }

    /**
     * Get the key from the file.
     *
     * @return an Optional for the key
     */
    @Nonnull
    public Optional<RSAPrivateKey> getKey() {
        return Optional.of(key);
    }
}
