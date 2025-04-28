/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AuthCachingPolicy provides the ability to annotation basic auth providers with what level of
 * caching a request signer should try to follow.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCachingPolicy {
    /**
     * Param to set whether or not keyIds can be cached.
     *
     * @return true to enable caching, false if the keyId should be retrieved for every request.
     */
    boolean cacheKeyId();

    /**
     * Param to set whether or not private can be cached.
     *
     * @return true to enable caching, false if the private key should be retrieved for every
     *     request.
     */
    boolean cachePrivateKey();
}
