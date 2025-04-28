/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import com.oracle.bmc.http.client.pki.Pem;
import com.oracle.bmc.http.client.pki.PemEncryptionException;
import com.oracle.bmc.http.client.pki.PemException;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.Optional;

class PEMStreamRSAPrivateKeySupplier implements KeySupplier<RSAPrivateKey> {
    private final Optional<RSAPrivateKey> privateKey;

    public PEMStreamRSAPrivateKeySupplier(
            @Nonnull final InputStream inputStream, @Nullable final char[] passphrase)
            throws IOException {
        // Must close the input stream to honor PEMFileRSAPrivateKeySupplier behavior
        try (final ReadableByteChannel channel = Channels.newChannel(inputStream);
                final Pem.Passphrase pemPassphrase = Pem.Passphrase.of(passphrase)) {
            final PrivateKey privateKey =
                    Pem.decoder().with(pemPassphrase).decodePrivateKey(channel);
            if (privateKey instanceof RSAPrivateKey) {
                this.privateKey = Optional.of((RSAPrivateKey) privateKey);
            } else {
                throw new IllegalStateException(privateKey.toString());
            }
        } catch (PemEncryptionException e) {
            throw new IllegalArgumentException("The provided passphrase is incorrect.", e);
        } catch (PemException e) {
            throw new IllegalArgumentException("Private key must be in PEM format", e);
        }
    }

    @Override
    public Optional<RSAPrivateKey> supplyKey(String keyId) {
        return privateKey;
    }
}
