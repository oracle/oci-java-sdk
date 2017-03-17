/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

/**
 * Root interface for classes providing some information needed to authenticate
 * requests.
 */
public interface AbstractAuthenticationDetailsProvider {

    /**
     * Decorator interface to indicate that credentials provided by the
     * provider should not be cached and should always be fetched on every request.
     */
    interface DisableAuthCaching {}
}
