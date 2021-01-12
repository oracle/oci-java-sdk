/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import javax.annotation.Nonnull;

import com.google.common.base.Optional;

/**
 * Interface for anything that can get supply a Key of type T given a keyId
 *
 * @param <T>
 *            the type of the key that will be supplied
 */
public interface KeySupplier<T> {

    /**
     * Try to get a key for the given KeyId
     *
     * @param keyId
     *            the identifier of the key to try to supply
     * @return an Optional for the key, or empty if the key cannot be found.
     */
    @Nonnull
    Optional<T> getKey(@Nonnull final String keyId);
}
