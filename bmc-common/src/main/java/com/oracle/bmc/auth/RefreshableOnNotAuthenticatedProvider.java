/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

/**
 * For authentication providers with refreshable authentication data (e.g. those which wrap a security
 * token received from a remote service), this interface flags that when a caller receives a
 * NotAuthenticated error (HTTP 401) that they can refresh the authentication data and retry their request.
 *
 * Consistent HTTP 401s would indicate that there is potentially an issue outside the issued token, so only
 * making a single retry is suggested.
 *
 * @param <T> The type of authentication data held by the provider (e.g. for security tokens this could be
 * a string)
 */
public interface RefreshableOnNotAuthenticatedProvider<T> {

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
    T refresh();
}
