/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;

/**
 * Base interface used provide required information to sign requests to Oracle Cloud Infrastructure.
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
     *
     * @deprecated Use getPassphraseCharacters instead
     */
    @Deprecated
    String getPassPhrase();

    /**
     * Returns the optional pass phrase for the (encrypted) private key, as a character array.
     *
     * @return The pass phrase as character array, or null if not applicable
     */
    char[] getPassphraseCharacters();
}
