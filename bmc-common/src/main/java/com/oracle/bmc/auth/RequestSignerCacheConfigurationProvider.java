/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

/**
 * Optional marker for {@link BasicAuthenticationDetailsProvider} implementations that wish to
 * control request-signer caching behaviour.
 *
 * <p>Implementations should return a configuration that enables caching only when desired.
 */
public interface RequestSignerCacheConfigurationProvider {
    /**
     * Returns the cache configuration for request-signer materials.
     *
     * @return The configuration; default implementation disables caching.
     */
    default RequestSignerCacheConfiguration getRequestSignerCacheConfiguration() {
        return RequestSignerCacheConfiguration.builder().build();
    }
}
