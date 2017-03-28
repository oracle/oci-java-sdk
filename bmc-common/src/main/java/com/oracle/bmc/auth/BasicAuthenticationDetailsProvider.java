/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;

/**
 * Base interface used provide required information to sign requests to Oracle Bare Metal Services.
 * <p>
 * Implementations may choose to provide hints about the cacheability of the keyId and privateKey using
 * {@link AuthCachingPolicy} (optional).
 */
public interface BasicAuthenticationDetailsProvider extends AbstractAuthenticationDetailsProvider {
    /**
     * Returns the keyId used to sign requests.
     *
     * @return The keyId.
     */
    String getKeyId();

    /**
     * Returns a new InputStream to the private key. This stream should be
     * closed by the caller, implementations should return new streams each
     * time.
     *
     * @return A new InputStream.
     */
    InputStream getPrivateKey();

    /**
     * Returns the optional pass phrase for the (encrypted) private key.
     *
     * @return The pass phrase, or null if not applicable
     */
    String getPassPhrase();
}
