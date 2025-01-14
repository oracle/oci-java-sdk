/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPublicKey;
import java.util.Set;

import jakarta.annotation.Nonnull;

import java.util.Optional;

/** The rules for a signed request version, i.e., supported algorithms, supported keyId formats. */
public interface Version {

    /** Get a set of supported algorithms. */
    Set<Algorithm> getSupportedAlgorithms();

    /** Get a set of supported keyId types. */
    Set<KeyIdType> getSupportedKeyIdTypes();

    /** Get the version number. */
    int getVersionNumber();

    /** Get the name of this version - usually the version number as a String. */
    String getVersionName();

    /** Get the minimum public key size in bits. */
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
