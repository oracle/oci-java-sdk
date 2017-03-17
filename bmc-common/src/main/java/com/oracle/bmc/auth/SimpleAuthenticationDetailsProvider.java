/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;

import com.google.common.base.Supplier;

import lombok.Builder;
import lombok.Getter;

/**
 * Basic implementation of {@link AuthenticationDetailsProvider} that just
 * returns configured values.
 */
@Builder
public class SimpleAuthenticationDetailsProvider extends CustomerAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider {
    @Getter(onMethod = @__({@Override}))
    private final String tenantId;

    @Getter(onMethod = @__({@Override}))
    private final String userId;

    @Getter(onMethod = @__({@Override}))
    private final String fingerprint;

    @Getter(onMethod = @__({@Override}))
    private final String passPhrase;

    private final Supplier<InputStream> privateKeySupplier;

    @Override
    public InputStream getPrivateKey() {
        return privateKeySupplier.get();
    }

    @Override
    public String toString() {
        // show that there was a passphrase, but not what it was
        return String.format(
                "SimpleAuthenticationDetailsProvider(tenantId=%s, userId=%s, fingerprint=%s, passPhrase=%s, privateKeySupplier=%s)",
                tenantId,
                userId,
                fingerprint,
                passPhrase != null ? "<provided>" : passPhrase,
                privateKeySupplier);
    }

    public static class SimpleAuthenticationDetailsProviderBuilder {
        // toString overridden as the default lombok builder prints all builder properties
        // including the passphrase.  manually overriding to just show that there was a passphrase
        @Override
        public String toString() {
            return String.format(
                    "SimpleAuthenticationDetailsProvider.SimpleAuthenticationDetailsProviderBuilder(tenantId=%s, userId=%s, fingerprint=%s, passPhrase=%s, privateKeySupplier=%s)",
                    tenantId,
                    userId,
                    fingerprint,
                    passPhrase != null ? "<provided>" : passPhrase,
                    privateKeySupplier);
        }
    }
}
