/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Supplier;
import com.oracle.bmc.Region;

import java.io.InputStream;

/**
 * Basic implementation of {@link AuthenticationDetailsProvider} that just
 * returns configured values.
 */
public class SimpleAuthenticationDetailsProvider extends CustomerAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider {
    private final String tenantId;

    private final String userId;

    private final String fingerprint;

    private final char[] passphraseCharacters;

    /**
     * Supplier of the input stream with the private key. Note that this stream may be read multiple times.
     */
    private final Supplier<InputStream> privateKeySupplier;

    private final Region region;

    @java.beans.ConstructorProperties({
        "tenantId",
        "userId",
        "fingerprint",
        "passphraseCharacters",
        "privateKeySupplier",
        "region"
    })
    SimpleAuthenticationDetailsProvider(
            String tenantId,
            String userId,
            String fingerprint,
            char[] passphraseCharacters,
            Supplier<InputStream> privateKeySupplier,
            Region region) {
        this.tenantId = tenantId;
        this.userId = userId;
        this.fingerprint = fingerprint;
        this.passphraseCharacters = passphraseCharacters;
        this.privateKeySupplier = privateKeySupplier;
        this.region = region;
    }

    public static SimpleAuthenticationDetailsProviderBuilder builder() {
        return new SimpleAuthenticationDetailsProviderBuilder();
    }

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

    @Override
    public String getTenantId() {
        return this.tenantId;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public String getFingerprint() {
        return this.fingerprint;
    }

    @Override
    public char[] getPassphraseCharacters() {
        return this.passphraseCharacters;
    }

    @Override
    public Region getRegion() {
        return this.region;
    }

    public static class SimpleAuthenticationDetailsProviderBuilder {

        private String tenantId;
        private String userId;
        private String fingerprint;
        private char[] passphraseCharacters;
        private Supplier<InputStream> privateKeySupplier;
        private Region region;

        SimpleAuthenticationDetailsProviderBuilder() {}

        // want to provide both passPhrase(String) and passphraseCharacters(char[])
        public SimpleAuthenticationDetailsProviderBuilder passPhrase(String passPhrase) {
            return passphraseCharacters(passPhrase != null ? passPhrase.toCharArray() : null);
        }

        // manually overriding to just show that there was a passphrase
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

        public SimpleAuthenticationDetailsProviderBuilder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public SimpleAuthenticationDetailsProviderBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public SimpleAuthenticationDetailsProviderBuilder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public SimpleAuthenticationDetailsProviderBuilder passphraseCharacters(
                char[] passphraseCharacters) {
            this.passphraseCharacters = passphraseCharacters;
            return this;
        }

        public SimpleAuthenticationDetailsProviderBuilder privateKeySupplier(
                Supplier<InputStream> privateKeySupplier) {
            this.privateKeySupplier = privateKeySupplier;
            return this;
        }

        public SimpleAuthenticationDetailsProviderBuilder region(Region region) {
            this.region = region;
            return this;
        }

        public SimpleAuthenticationDetailsProvider build() {
            return new SimpleAuthenticationDetailsProvider(
                    tenantId,
                    userId,
                    fingerprint,
                    passphraseCharacters,
                    privateKeySupplier,
                    region);
        }
    }
}
