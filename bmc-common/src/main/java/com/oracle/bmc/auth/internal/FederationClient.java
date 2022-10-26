/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

/**
 * Defines a basic interface for a federation endpoint that provides a security token for
 * authentication.
 */
public interface FederationClient {
    /**
     * Gets a security token from the federation endpoint. May use a cached token if it judged to
     * still be valid.
     *
     * @return A security token that can be used to authenticate requests.
     */
    String getSecurityToken();

    /**
     * Gets a security token from the federation endpoint. This will always retreive a new token
     * from the federation endpoint and does not use a cached token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    String refreshAndGetSecurityToken();

    /**
     * Get a claim embedded in the security token. May use the cached token if it is judged to still
     * be valid.
     */
    String getStringClaim(String key);
}
