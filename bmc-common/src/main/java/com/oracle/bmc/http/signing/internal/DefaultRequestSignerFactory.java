/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthCachingPolicy;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RequestSignerCacheConfigurationProvider;
import com.oracle.bmc.auth.RequestSignerCacheConfiguration;
import com.oracle.bmc.auth.YubikeyAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;

/**
 * Factory class to create RequestSigner instances. Takes care of setting up the appropriate suppliers
 * based on the cacheability of the credentials (indicated by {@link AuthCachingPolicy}.  By default,
 * all credentials are cacheable.
 * <p>
 * This factory supports authentication providers that inherit from
 * {@link BasicAuthenticationDetailsProvider}.
 */
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

        if (abstractAuthProvider instanceof YubikeyAuthenticationDetailsProvider) {
            // YubikeyAuthenticationDetailsProvider requires a different request signer constructor
            KeySupplier<PrivateKey> keySupplier =
                    keyId ->
                            Optional.ofNullable(
                                    ((YubikeyAuthenticationDetailsProvider) abstractAuthProvider)
                                            .getYubikeyPrivateKey());
            return new RequestSignerImpl(signingStrategy, keySupplier, keyIdSupplier);
        }

        KeySupplier<RSAPrivateKey> keySupplier = createKeySupplier(authProvider, policy);

        return new RequestSignerImpl(keySupplier, signingStrategy, keyIdSupplier);
    }

    private static Supplier<String> createKeyIdSupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        final RequestSignerCacheConfiguration cacheConfiguration =
                resolveCacheConfiguration(authenticationDetailsProvider);

        if (cacheConfiguration.isKeyIdCachingEnabled()) {
            final Optional<Duration> ttl = cacheConfiguration.getKeyIdTimeToLive();
            if (!ttl.isPresent()) {
                final String keyId =
                        Objects.requireNonNull(
                                authenticationDetailsProvider.getKeyId(),
                                "BasicAuthenticationDetailsProvider#getKeyId returned null.");
                return () -> keyId;
            }

            final TimedValue<String> cache = new TimedValue<>(ttl.get());
            return () ->
                    cache.computeIfExpired(
                            () ->
                                    Objects.requireNonNull(
                                            authenticationDetailsProvider.getKeyId(),
                                            "BasicAuthenticationDetailsProvider#getKeyId returned null."));
        }

        boolean cacheKeyId = true;
        if (policy != null) {
            cacheKeyId = policy.cacheKeyId();
        }

        if (!cacheKeyId) {
            return authenticationDetailsProvider::getKeyId;
        }

        final String keyId = authenticationDetailsProvider.getKeyId();
        return () -> keyId;
    }

    private static KeySupplier<RSAPrivateKey> createKeySupplier(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            final AuthCachingPolicy policy) {
        final RequestSignerCacheConfiguration cacheConfiguration =
                resolveCacheConfiguration(authenticationDetailsProvider);

        if (cacheConfiguration.isPrivateKeyCachingEnabled()) {
            final Optional<Duration> ttl = cacheConfiguration.getPrivateKeyTimeToLive();
            if (!ttl.isPresent()) {
                return keyId ->
                        new PEMFileRSAPrivateKeySupplier(
                                        authenticationDetailsProvider.getPrivateKey(),
                                        authenticationDetailsProvider.getPassphraseCharacters())
                                .supplyKey(keyId);
            }

            final TimedValue<Optional<RSAPrivateKey>> cache = new TimedValue<>(ttl.get());

            return keyId ->
                    cache.computeIfExpired(
                            () ->
                                    new PEMFileRSAPrivateKeySupplier(
                                                    authenticationDetailsProvider.getPrivateKey(),
                                                    authenticationDetailsProvider
                                                            .getPassphraseCharacters())
                                            .supplyKey(keyId));
        }

        boolean cachePrivateKey = true;
        if (policy != null) {
            cachePrivateKey = policy.cachePrivateKey();
        }

        if (!cachePrivateKey) {
            return keyId ->
                    new PEMFileRSAPrivateKeySupplier(
                                    authenticationDetailsProvider.getPrivateKey(),
                                    authenticationDetailsProvider.getPassphraseCharacters())
                            .supplyKey(keyId);
        }

        return new PEMFileRSAPrivateKeySupplier(
                authenticationDetailsProvider.getPrivateKey(),
                authenticationDetailsProvider.getPassphraseCharacters());
    }

    private static RequestSignerCacheConfiguration resolveCacheConfiguration(
            BasicAuthenticationDetailsProvider provider) {
        if (provider instanceof RequestSignerCacheConfigurationProvider) {
            return ((RequestSignerCacheConfigurationProvider) provider)
                    .getRequestSignerCacheConfiguration();
        }
        return RequestSignerCacheConfiguration.builder().build();
    }

    private static final class TimedValue<T> {
        private final Object lock = new Object();
        private final long ttlNanos;
        private volatile ValueHolder<T> holder;
        private volatile CompletableFuture<ValueHolder<T>> inFlight;

        private TimedValue(Duration ttl) {
            if (ttl == null || ttl.isZero() || ttl.isNegative()) {
                throw new IllegalArgumentException("ttl must be a positive duration.");
            }
            this.ttlNanos = ttl.toNanos();
        }

        T computeIfExpired(Supplier<T> supplier) {
            long now = System.nanoTime();
            ValueHolder<T> current = holder;
            if (current != null && !current.isExpired(now)) {
                return current.value;
            }

            CompletableFuture<ValueHolder<T>> future;
            boolean leader = false;

            synchronized (lock) {
                current = holder;
                if (current != null && !current.isExpired(now)) {
                    return current.value;
                }
                if (inFlight != null) {
                    future = inFlight;
                } else {
                    future = new CompletableFuture<>();
                    inFlight = future;
                    leader = true;
                }
            }

            if (leader) {
                try {
                    T value = supplier.get();
                    ValueHolder<T> newHolder =
                            new ValueHolder<>(value, System.nanoTime() + ttlNanos);
                    holder = newHolder;
                    future.complete(newHolder);
                    return value;
                } catch (Throwable t) {
                    future.completeExceptionally(t);
                    throw propagate(t);
                } finally {
                    synchronized (lock) {
                        if (inFlight == future) {
                            inFlight = null;
                        }
                    }
                }
            } else {
                try {
                    ValueHolder<T> result = future.get();
                    return result == null ? null : result.value;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(
                            "Interrupted while waiting for cached value", e);
                } catch (ExecutionException e) {
                    throw propagate(e.getCause());
                }
            }
        }

        private static RuntimeException propagate(Throwable throwable) {
            if (throwable instanceof RuntimeException) {
                return (RuntimeException) throwable;
            }
            if (throwable instanceof Error) {
                throw (Error) throwable;
            }
            return new IllegalStateException("Failed to compute cached value", throwable);
        }

        private static final class ValueHolder<T> {
            private final T value;
            private final long expiresAtNanos;

            private ValueHolder(T value, long expiresAtNanos) {
                this.value = value;
                this.expiresAtNanos = expiresAtNanos;
            }

            private boolean isExpired(long now) {
                return now >= expiresAtNanos;
            }
        }
    }

    public static AuthCachingPolicy getAuthCachingPolicy(
            final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        return authenticationDetailsProvider.getClass().getAnnotation(AuthCachingPolicy.class);
    }

    /**
     * Create the default request signer factories.
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
