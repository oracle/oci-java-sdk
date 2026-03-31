/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.time.Duration;
import java.util.Optional;

/**
 * Configuration object used by {@link BasicAuthenticationDetailsProvider} implementations to
 * influence how request signer metadata should be cached.
 *
 * <p>The cache settings are interpreted by {@link
 * com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory} when creating per-request
 * suppliers.
 */
public final class RequestSignerCacheConfiguration {
    /**
     * Defaulting to 1 minute will prevent frequent calls under heavy traffic and avoid long propagation in case of key rotation
     */
    public static final Duration DEFAULT_KEY_ID_TTL = Duration.ofMinutes(1);
    public static final Duration DEFAULT_PRIVATE_KEY_ID_TTL = Duration.ofMinutes(1);

    private final Optional<Duration> keyIdTimeToLive;
    private final Optional<Duration> privateKeyTimeToLive;

    private RequestSignerCacheConfiguration(Builder builder) {
        this.keyIdTimeToLive = builder.keyIdTimeToLive;
        this.privateKeyTimeToLive = builder.privateKeyTimeToLive;
    }

    /**
     * Indicates whether the key identifier value should be cached.
     *
     * @return {@code true} if key identifiers may be cached, otherwise {@code false}.
     */
    public boolean isKeyIdCachingEnabled() {
        return keyIdTimeToLive.isPresent();
    }

    /**
     * Indicates whether the parsed private key should be cached.
     *
     * @return {@code true} if private keys may be cached, otherwise {@code false}.
     */
    public boolean isPrivateKeyCachingEnabled() {
        return privateKeyTimeToLive.isPresent();
    }

    /**
     * Returns the optional time-to-live for cached key identifiers.
     *
     * @return The optional time-to-live duration.
     */
    public Optional<Duration> getKeyIdTimeToLive() {
        return keyIdTimeToLive;
    }

    /**
     * Returns the optional time-to-live for cached private keys.
     *
     * @return The optional time-to-live duration.
     */
    public Optional<Duration> getPrivateKeyTimeToLive() {
        return privateKeyTimeToLive;
    }

    /**
     * Creates a new builder with caching disabled. Enable individual caches (and optionally TTLs)
     * using the builder's configuration methods.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder for {@link RequestSignerCacheConfiguration}. */
    public static final class Builder {
        private Optional<Duration> keyIdTimeToLive = Optional.empty();
        private Optional<Duration> privateKeyTimeToLive = Optional.empty();

        private Builder() {}

        /**
         * Sets the time-to-live for key identifier cache entries. Supplying {@code null} clears the
         * TTL and disables key identifier caching.
         *
         * @param duration The TTL duration, must be positive if provided.
         * @return this builder.
         */
        public Builder keyIdTimeToLive(Duration duration) {
            this.keyIdTimeToLive = Optional.ofNullable(duration);
            return this;
        }

        /**
         * Sets the time-to-live for private key cache entries. Supplying {@code null} clears the TTL
         * and disables private key caching.
         *
         * @param duration The TTL duration, must be positive if provided.
         * @return this builder.
         */
        public Builder privateKeyTimeToLive(Duration duration) {
            this.privateKeyTimeToLive = Optional.ofNullable(duration);
            return this;
        }

        /**
         * Sets the time-to-live for cached private keys in seconds-equivalent form. This is an alias
         * for {@link #privateKeyTimeToLive(Duration)} to mirror {@link #keyIdTimeToLive(Duration)}
         * usage.
         *
         * @param duration The TTL duration, must be positive if provided.
         * @return this builder.
         */
        public Builder privateKeyCacheTimeToLive(Duration duration) {
            return privateKeyTimeToLive(duration);
        }

        /**
         * Builds the immutable configuration.
         *
         * @return The configuration instance.
         */
        public RequestSignerCacheConfiguration build() {
            keyIdTimeToLive.ifPresent(duration -> validateDuration("keyIdTimeToLive", duration));
            privateKeyTimeToLive.ifPresent(
                    duration -> validateDuration("privateKeyTimeToLive", duration));
            return new RequestSignerCacheConfiguration(this);
        }

        private static void validateDuration(String fieldName, Duration duration) {
            if (duration.isZero() || duration.isNegative()) {
                throw new IllegalArgumentException(fieldName + " must be a positive duration.");
            }
        }
    }
}
