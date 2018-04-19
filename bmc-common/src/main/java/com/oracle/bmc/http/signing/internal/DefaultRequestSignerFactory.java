/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthCachingPolicy;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;

import lombok.RequiredArgsConstructor;

/**
 * Factory class to create RequestSigner instances. Takes care of setting up the appropriate suppliers
 * based on the cacheability of the credentials (indicated by {@link AuthCachingPolicy}.  By default,
 * all credentials are cacheable.
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

        AuthCachingPolicy policy = getAuthCachingPolicy(authProvider);

        Supplier<String> keyIdSupplier = createKeyIdSupplier(authProvider, policy);
        KeySupplier<RSAPrivateKey> keySupplier = createKeySupplier(authProvider, policy);

        return new RequestSignerImpl(keySupplier, signingStrategy, keyIdSupplier);
    }

    private static Supplier<String> createKeyIdSupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        boolean cacheKeyId = true;
        if (policy != null) {
            cacheKeyId = policy.cacheKeyId();
        }

        // if keyId caching is disabled, fetch the ID on every request
        if (!cacheKeyId) {
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
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        boolean cachePrivateKey = true;
        if (policy != null) {
            cachePrivateKey = policy.cachePrivateKey();
        }

        // if private key caching is disabled, parse the stream on every request
        if (!cachePrivateKey) {
            return new KeySupplier<RSAPrivateKey>() {
                @Override
                public Optional<RSAPrivateKey> getKey(String keyId) {
                    return new PEMFileRSAPrivateKeySupplier(
                                    authenticationDetailsProvider.getPrivateKey(),
                                    authenticationDetailsProvider.getPassphraseCharacters())
                            .getKey(keyId);
                }
            };
        }

        // else parse once now and return a fixed supplier
        return new PEMFileRSAPrivateKeySupplier(
                authenticationDetailsProvider.getPrivateKey(),
                authenticationDetailsProvider.getPassphraseCharacters());
    }

    private static AuthCachingPolicy getAuthCachingPolicy(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        return authenticationDetailsProvider.getClass().getAnnotation(AuthCachingPolicy.class);
    }

    /**
     * Create the default request signer factories.
     * @return default request signer factories
     */
    public static Map<SigningStrategy, RequestSignerFactory> createDefaultRequestSignerFactories() {
        ImmutableMap.Builder<SigningStrategy, RequestSignerFactory> builder =
                ImmutableMap.builder();
        for (SigningStrategy s : SigningStrategy.values()) {
            builder.put(s, new DefaultRequestSignerFactory(s));
        }
        return builder.build();
    }
}
