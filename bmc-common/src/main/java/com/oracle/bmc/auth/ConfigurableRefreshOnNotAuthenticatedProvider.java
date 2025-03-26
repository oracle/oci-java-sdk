/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.time.Duration;

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
public interface ConfigurableRefreshOnNotAuthenticatedProvider<T> {

    /**
     * Refreshes the authentication data used by the provider
     * if the token is expiring within the provided duration
     * @param time the duration to check
     * @return the refreshed authentication data
     */
    T refreshIfExpiringWithin(Duration time);

    /**
     * Refreshes the authentication data used by the provider
     * if the token is expiring within the provided duration and
     * allows to enable/disable refresh of keys
     * @param time the duration to check
     * @param refreshKeys boolean value to enable/disable refresh of keys
     * @return the refreshed authentication data
     */
    T refreshIfExpiringWithin(Duration time, boolean refreshKeys);
}
