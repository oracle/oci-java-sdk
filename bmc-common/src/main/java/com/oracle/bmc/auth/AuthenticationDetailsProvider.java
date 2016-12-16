/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.io.InputStream;

/**
 * Interface defining a provider for BMC credentials.
 */
public interface AuthenticationDetailsProvider {
    /**
     * Returns the fingerprint of the key being used.
     *
     * @return The fingerprint.
     */
    String getFingerprint();

    /**
     * Returns the tenant OCID.
     *
     * @return The tenant OCID.
     */
    String getTenantId();

    /**
     * Returns the user OCID.
     *
     * @return The user OCID.
     */
    String getUserId();

    /**
     * Returns the optional pass phrase for the (encrypted) private key.
     *
     * @return The pass phrase, or null if not applicable
     */
    String getPassPhrase();

    /**
     * Returns a new InputStream to the private key. This stream should be
     * closed by the caller, implementations should return new streams each
     * time.
     *
     * @return A new InputStream.
     */
    InputStream getPrivateKey();
}
