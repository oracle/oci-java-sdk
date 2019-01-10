/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPublicKey;
import java.util.Set;

import javax.annotation.Nonnull;

import com.google.common.base.Optional;

/**
 * The rules for a signed request version, i.e., supported algorithms, supported keyId formats.
 */
public interface Version {

    /**
     * Get a set of supported algorithms.
     */
    Set<Algorithm> getSupportedAlgorithms();

    /**
     * Get a set of supported keyId types.
     */
    Set<KeyIdType> getSupportedKeyIdTypes();

    /**
     * Get the version number.
     */
    int getVersionNumber();

    /**
     * Get the name of this version - usually the version number as a String.
     */
    String getVersionName();

    /**
     * Get the minimum public key size in bits.
     */
    int getMinimumKeySizeInBits();

    Optional<Error> validateKeyId(@Nonnull String keyId);

    Optional<Error> validateAlgorithm(@Nonnull Algorithm algorithm);

    Optional<Error> validateKeySize(@Nonnull RSAPublicKey publicKey);

    enum Error {
        UNSUPPORTED_ALGORITHM,
        UNSUPPORTED_KEYID,
        KEY_TOO_SMALL
    }
}
