/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import com.oracle.bmc.http.client.InternalSdk;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.security.interfaces.RSAPrivateKey;
import java.util.Optional;

/**
 * An implementation of {@link KeySupplier} that supplies a RSA private key from a PEM file.
 * Supports PKCS#8 (starts with '-----BEGIN PRIVATE KEY-----' tag), PKCS#8 encrypted key (starts
 * with '-----BEGIN ENCRYPTED PRIVATE KEY-----' tag) and PKCS#1 (i.e., starts with '-----BEGIN RSA
 * PRIVATE KEY-----' tag) format.
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
    private final PEMStreamRSAPrivateKeySupplier delegate;

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

            delegate = new PEMStreamRSAPrivateKeySupplier(inputStream, passphraseCharacters);
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
        return delegate.supplyKey(ignored);
    }

    /**
     * Get the key from the file.
     *
     * @return an Optional for the key
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Nonnull
    public Optional<RSAPrivateKey> supplyKey() {
        return supplyKey(null);
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
