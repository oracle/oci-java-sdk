/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

/**
 * Defines a basic interface for a federation endpoint that provides
 * a security token for authentication.
 */
public interface FederationClient {
    /**
     * Gets a security token from the federation endpoint. May use a cached token if
     * it judged to still be valid.
     * @return A security token that can be used to authenticate requests.
     */
    String getSecurityToken();

    /**
     * Gets a security token from the federation endpoint. This will always retreive
     * a new token from the federation endpoint and does not use a cached token.
     * @return A security token that can be used to authenticate requests.
     */
    String refreshAndGetSecurityToken();

    /**
     * Get a claim embedded in the security token. May use the cached token if it is
     * judged to still be valid.
     */
    String getStringClaim(String key);
}
