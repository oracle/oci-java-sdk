/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPrivateKey;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.oracle.bmc.InternalSdk;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMEncryptedKeyPair;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;

import java.util.Optional;
import com.oracle.bmc.util.internal.Validate;

/**
 * An implementation of {@link KeySupplier} that supplies a RSA private key from a PEM file.
 * Supports both PKCS#8 (starts with '-----BEGIN PRIVATE KEY-----' tag) and PKCS#1 (i.e., starts
 * with '-----BEGIN RSA PRIVATE KEY-----' tag) format.
 *
 * <p>Example commands that can be used to generate a 2048 bits RSA private key: <code>
 * $ openssl genrsa -out privateKey 2048</code>
 *
 * <p><code>$ ssh-keygen -t rsa -b 2048</code>
 *
 * <p>
 */
public class PEMFileRSAPrivateKeySupplier implements KeySupplier<RSAPrivateKey> {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PEMFileRSAPrivateKeySupplier.class);
    private final JcaPEMKeyConverter converter = new JcaPEMKeyConverter();

    private final RSAPrivateKey key;

    /**
     * Constructs a new file key supplier which reads the private key from the specified file. The
     * provided stream will be closed by this supplier automatically.
     *
     * @param inputStream the path to the RSA private key
     * @param passphraseCharacters the passphrase of the private key, optional
     */
    public PEMFileRSAPrivateKeySupplier(
            @Nonnull final InputStream inputStream, @Nullable final char[] passphraseCharacters) {
        try {
            LOG.debug("Initializing private key");

            try (PEMParser keyReader =
                    new PEMParser(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                Object object = keyReader.readObject();

                final PrivateKeyInfo keyInfo;

                if (object instanceof PEMEncryptedKeyPair) {
                    Validate.notNull(
                            passphraseCharacters, "The provided private key requires a passphrase");

                    JcePEMDecryptorProviderBuilder decryptorProviderBuilder =
                            new JcePEMDecryptorProviderBuilder();

                    // If either of BouncyCastle or BouncyCastleFIPS provider is installed, then
                    // irrespective of the
                    // version of the library used, decryption of passphrase protected PEM files are
                    // supported. Else,
                    // for versions of BouncyCastle > 1.52 (or BC-FIPS), need to add the provider to
                    // be able to read
                    // passphrase protected PEM files. Adding the provider to the
                    // PEMDecryptorProvider instead of
                    // modifying the application's security environment (by calling
                    // Security.addProvider) to maintain
                    // backward compatibility. Details at
                    // https://github.com/bcgit/bc-java/issues/156
                    if (!BouncyCastleHelper.getInstance().isProviderInstalled()) {
                        decryptorProviderBuilder.setProvider(
                                BouncyCastleHelper.getInstance().getBouncyCastleProvider());
                    }

                    PEMDecryptorProvider decProv =
                            decryptorProviderBuilder.build(passphraseCharacters);
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
                    throw new IllegalArgumentException("Private key must be in PEM format");
                }

                this.key = (RSAPrivateKey) converter.getPrivateKey(keyInfo);
            }
        } catch (IOException ex) {
            LOG.debug("Failed to read RSA private key from file ", ex);
            throw new PEMFileRSAPrivateKeySupplierException(
                    "Failed to read RSA private key from file ", ex);
        }
    }

    /**
     * Get the key from the file.
     *
     * @param ignored this parameter is ignored. The key returned is always the same, the one from
     *     the file.
     * @return an Optional for the key
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Override
    public Optional<RSAPrivateKey> supplyKey(@Nonnull String ignored) {
        return supplyKey();
    }

    /**
     * Get the key from the file.
     *
     * @return an Optional for the key
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Nonnull
    public Optional<RSAPrivateKey> supplyKey() {
        return Optional.of(key);
    }

    /** An exception in the {@link PEMFileRSAPrivateKeySupplier}. */
    public static class PEMFileRSAPrivateKeySupplierException extends RuntimeException {
        public PEMFileRSAPrivateKeySupplierException(String message, Throwable cause) {
            super(message, cause);
        }

        public PEMFileRSAPrivateKeySupplierException(Throwable cause) {
            super(cause);
        }
    }
}
