/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nonnull;

import com.oracle.bmc.util.internal.Validate;

/**
 * List of supported signed request versions with associated version rules.
 */
public enum SignedRequestVersion implements Version {
    ONE(1, unmodifiableSetOf(Algorithm.RSAPSS256), unmodifiableSetOf(KeyIdType.REF), 2048);

    private static final Optional<Error> ABSENT = Optional.empty();
    private final int number;
    private final Set<Algorithm> algorithms;
    private final Set<KeyIdType> keyIdTypes;
    private final int minimumKeySize;

    SignedRequestVersion(
            final int number,
            final Set<Algorithm> algorithms,
            final Set<KeyIdType> keyIdTypes,
            final int minimumKeySize) {
        this.number = number;
        this.algorithms = algorithms;
        this.keyIdTypes = keyIdTypes;
        this.minimumKeySize = minimumKeySize;
    }

    @Override
    public Set<Algorithm> getSupportedAlgorithms() {
        return algorithms;
    }

    @Override
    public Set<KeyIdType> getSupportedKeyIdTypes() {
        return keyIdTypes;
    }

    @Override
    public int getVersionNumber() {
        return number;
    }

    @Override
    public String getVersionName() {
        return String.valueOf(getVersionNumber());
    }

    @Override
    public int getMinimumKeySizeInBits() {
        return minimumKeySize;
    }

    @Override
    public Optional<Error> validateKeyId(@Nonnull String keyId) {
        Validate.notBlank(keyId, "keyId may not be blank");

        boolean isKeyIdValid = false;
        for (KeyIdType idType : this.getSupportedKeyIdTypes()) {
            if (keyId.matches(idType.getPattern())) {
                isKeyIdValid = true;
                break;
            }
        }
        return isKeyIdValid ? ABSENT : Optional.of(Error.UNSUPPORTED_KEYID);
    }

    @Override
    public Optional<Error> validateAlgorithm(@Nonnull Algorithm algorithm) {
        Validate.notNull(algorithm, "algorithm must not be null");
        boolean isAlgorithmValid = this.getSupportedAlgorithms().contains(algorithm);
        return isAlgorithmValid ? ABSENT : Optional.of(Error.UNSUPPORTED_ALGORITHM);
    }

    @Override
    public Optional<Error> validateKeySize(@Nonnull RSAPublicKey publicKey) {
        int keySize = publicKey.getModulus().bitLength();
        if (keySize < this.getMinimumKeySizeInBits()) {
            return Optional.of(Error.KEY_TOO_SMALL);
        }
        return ABSENT;
    }

    /**
     * Get the latest signed request version.
     */
    public static SignedRequestVersion getLatestVersion() {
        return ONE;
    }

    /**
     * Get the SignedRequestVersion based on version number. Leading and
     * trailing spaces in the specified number is ignored.
     */
    static Optional<SignedRequestVersion> getVersion(@Nonnull String versionNumber) {
        Validate.notNull(versionNumber, "versionNumber must not be null");

        try {
            Integer number = Integer.valueOf(versionNumber.trim());

            for (SignedRequestVersion version : SignedRequestVersion.values()) {
                if (version.getVersionNumber() == number) {
                    return Optional.of(version);
                }
            }
            return Optional.empty();
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    private static <T> Set<T> unmodifiableSetOf(T item) {
        Set<T> set = new HashSet<>();
        set.add(item);
        return Collections.unmodifiableSet(set);
    }
}
