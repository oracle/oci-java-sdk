/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;

import com.google.common.base.Supplier;
import com.oracle.bmc.Region;

import lombok.Builder;
import lombok.Getter;

/**
 * Basic implementation of {@link AuthenticationDetailsProvider} that just
 * returns configured values.
 */
@Builder
public class SimpleAuthenticationDetailsProvider extends CustomerAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider {
    @Getter(onMethod = @__({@Override}))
    private final String tenantId;

    @Getter(onMethod = @__({@Override}))
    private final String userId;

    @Getter(onMethod = @__({@Override}))
    private final String fingerprint;

    @Getter(onMethod = @__({@Override}))
    private final char[] passphraseCharacters;

    /**
     * Supplier of the input stream with the private key. Note that this stream may be read multiple times.
     */
    private final Supplier<InputStream> privateKeySupplier;

    @Getter(onMethod = @__({@Override}))
    private final Region region;

    /**
     * Get the input stream with the private key. Note that this stream may be read multiple times.
     * @return input stream with private key
     */
    @Override
    public InputStream getPrivateKey() {
        return privateKeySupplier.get();
    }

    @Deprecated
    @Override
    public String getPassPhrase() {
        return passphraseCharacters != null ? new String(passphraseCharacters) : null;
    }

    @Override
    public String toString() {
        // show that there was a passphrase, but not what it was
        return String.format(
                "SimpleAuthenticationDetailsProvider(tenantId=%s, userId=%s, fingerprint=%s, passphraseCharacters=%s, privateKeySupplier=%s)",
                tenantId,
                userId,
                fingerprint,
                passphraseCharacters != null ? "<provided>" : passphraseCharacters,
                privateKeySupplier);
    }

    public static class SimpleAuthenticationDetailsProviderBuilder {

        // want to provide both passPhrase(String) and passphraseCharacters(char[])
        public SimpleAuthenticationDetailsProviderBuilder passPhrase(String passPhrase) {
            return passphraseCharacters(passPhrase != null ? passPhrase.toCharArray() : null);
        }

        // toString overridden as the default lombok builder prints all builder properties
        // including the passphrase.  manually overriding to just show that there was a passphrase
        @Override
        public String toString() {
            return String.format(
                    "SimpleAuthenticationDetailsProvider.SimpleAuthenticationDetailsProviderBuilder(tenantId=%s, userId=%s, fingerprint=%s, passphraseCharacters=%s, privateKeySupplier=%s)",
                    tenantId,
                    userId,
                    fingerprint,
                    passphraseCharacters != null ? "<provided>" : passphraseCharacters,
                    privateKeySupplier);
        }
    }
}
