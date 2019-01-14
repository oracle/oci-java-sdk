/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

/**
 * Interface defining a BasicAuthenticationDetailsProvider that also provides
 * the individual components used to create the keyId.
 * <p>
 * The {@link #getKeyId()} method should be implemented as "tentantId/userId/fingerprint".  See
 * <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/signingrequests.htm">docs
 * </a> for more information.
 */
public interface AuthenticationDetailsProvider extends BasicAuthenticationDetailsProvider {
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
}
