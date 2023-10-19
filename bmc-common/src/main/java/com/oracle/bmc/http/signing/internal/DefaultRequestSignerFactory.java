/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthCachingPolicy;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;

/**
 * Factory class to create RequestSigner instances. Takes care of setting up the appropriate
 * suppliers based on the cacheability of the credentials (indicated by {@link AuthCachingPolicy}).
 * By default, all credentials are cacheable.
 *
 * <p>This factory supports authentication providers that inherit from {@link
 * BasicAuthenticationDetailsProvider}.
 */
public class DefaultRequestSignerFactory implements RequestSignerFactory {
    private final SigningStrategy signingStrategy;

    /**
     * {@inheritDoc}
     *
     * <p>Note, service parameter is not used by this factory.
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

    protected Supplier<String> createKeyIdSupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        boolean cacheKeyId = true;
        if (policy != null) {
            cacheKeyId = policy.cacheKeyId();
        }

        // if keyId caching is disabled, fetch the ID on every request
        if (!cacheKeyId) {
            return authenticationDetailsProvider::getKeyId;
        }

        // else fetch it now and return a fixed supplier
        final String keyId = authenticationDetailsProvider.getKeyId();
        return () -> keyId;
    }

    public static KeySupplier<RSAPrivateKey> createKeySupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        boolean cachePrivateKey = true;
        if (policy != null) {
            cachePrivateKey = policy.cachePrivateKey();
        }

        // if private key caching is disabled, parse the stream on every request
        if (!cachePrivateKey) {
            return keyId -> new PEMFileRSAPrivateKeySupplier(
                            authenticationDetailsProvider.getPrivateKey(),
                            authenticationDetailsProvider.getPassphraseCharacters())
                    .supplyKey(keyId);
        }

        // else parse once now and return a fixed supplier
        return new PEMFileRSAPrivateKeySupplier(
                authenticationDetailsProvider.getPrivateKey(),
                authenticationDetailsProvider.getPassphraseCharacters());
    }

    public static AuthCachingPolicy getAuthCachingPolicy(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        return authenticationDetailsProvider.getClass().getAnnotation(AuthCachingPolicy.class);
    }

    /**
     * Create the default request signer factories.
     *
     * @return default request signer factories
     */
    public static Map<SigningStrategy, RequestSignerFactory> createDefaultRequestSignerFactories() {
        Map<SigningStrategy, RequestSignerFactory> map = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            map.put(s, new DefaultRequestSignerFactory(s));
        }
        return Collections.unmodifiableMap(map);
    }

    @java.beans.ConstructorProperties({"signingStrategy"})
    @InternalSdk(backwardCompatibilityRequired = true)
    public DefaultRequestSignerFactory(final SigningStrategy signingStrategy) {
        this.signingStrategy = signingStrategy;
    }
}
