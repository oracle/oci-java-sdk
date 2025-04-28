/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.time.Duration;

/**
 * An interface that has the API to return refresh security token after if the token expires within
 * a configurable time
 */
public interface ProvidesConfigurableRefresh {
    /**
     * Gets a security token from the federation endpoint if the security token expires within the
     * provided duration. This will always retrieve a new token from the federation endpoint and
     * does not use a cached token.
     *
     * @param time the duration to check
     * @return A security token that can be used to authenticate requests.
     */
    String refreshAndGetSecurityTokenIfExpiringWithin(Duration time);

    /**
     * Gets a security token from the federation endpoint if the security token expires within the
     * provided duration and allows to enable/disable refresh of keys. This will always retrieve a
     * new token from the federation endpoint and does not use a cached token.
     *
     * @param time the duration to check
     * @param refreshKeys boolean value to enable/disable refresh of keys
     * @return A security token that can be used to authenticate requests.
     */
    String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys);
}
