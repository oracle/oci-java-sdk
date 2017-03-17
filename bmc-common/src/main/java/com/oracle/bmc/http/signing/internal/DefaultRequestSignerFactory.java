/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPrivateKey;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;

import lombok.RequiredArgsConstructor;

/**
 * Factory class to create RequestSigner instances. Takes care of determining
 * what signing strategy to use.
 * <p>
 * This factory supports authentication providers that inherit from
 * {@link BasicAuthenticationDetailsProvider}.
 */
@RequiredArgsConstructor
public class DefaultRequestSignerFactory implements RequestSignerFactory {
    private final SigningStrategy signingStrategy;

    /**
     * {@inheritDoc}
     * <p>
     * Note, service parameter is not used by this factory.
     */
    @Override
    public RequestSigner createRequestSigner(
            Service service, AbstractAuthenticationDetailsProvider abstractAuthProvider) {
        if (!(abstractAuthProvider instanceof BasicAuthenticationDetailsProvider)) {
            throw new IllegalArgumentException(
                    "Unsupported auth provider type: " + abstractAuthProvider.getClass().getName());
        }

        final BasicAuthenticationDetailsProvider authProvider =
                (BasicAuthenticationDetailsProvider) abstractAuthProvider;

        Supplier<String> keyIdSupplier = createKeyIdSupplier(authProvider);
        KeySupplier<RSAPrivateKey> keySupplier = createKeySupplier(authProvider);

        return new RequestSignerImpl(keySupplier, signingStrategy, keyIdSupplier);
    }

    private static Supplier<String> createKeyIdSupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        // if auth caching is disabled, fetch the ID on every request
        if (authenticationDetailsProvider
                instanceof AbstractAuthenticationDetailsProvider.DisableAuthCaching) {
            return new Supplier<String>() {
                @Override
                public String get() {
                    return authenticationDetailsProvider.getKeyId();
                }
            };
        }

        // else fetch it now and return a fixed supplier
        final String keyId = authenticationDetailsProvider.getKeyId();
        return new Supplier<String>() {
            @Override
            public String get() {
                return keyId;
            }
        };
    }

    private static KeySupplier<RSAPrivateKey> createKeySupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        // if auth caching is disabled, parse the stream on every request
        if (authenticationDetailsProvider
                instanceof AbstractAuthenticationDetailsProvider.DisableAuthCaching) {
            return new KeySupplier<RSAPrivateKey>() {
                @Override
                public Optional<RSAPrivateKey> getKey(String keyId) {
                    return new PEMFileRSAPrivateKeySupplier(
                                    authenticationDetailsProvider.getPrivateKey(),
                                    authenticationDetailsProvider.getPassPhrase())
                            .getKey(keyId);
                }
            };
        }

        // else parse once now and return a fixed supplier
        return new PEMFileRSAPrivateKeySupplier(
                authenticationDetailsProvider.getPrivateKey(),
                authenticationDetailsProvider.getPassPhrase());
    }
}
