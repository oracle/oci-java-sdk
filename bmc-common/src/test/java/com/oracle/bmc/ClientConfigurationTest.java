/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClientConfigurationTest {
    @Test
    public void asyncThreadPoolCoreThreadTimeoutControlsDisabledByDefault() {
        ClientConfiguration configuration = ClientConfiguration.builder().build();

        assertFalse(configuration.isSyncRequestsAsyncCoreThreadTimeoutEnabled());
        assertFalse(configuration.isAsyncRequestsAsyncCoreThreadTimeoutEnabled());
    }

    @Test
    public void syncRequestsAsyncCoreThreadTimeoutEnabledWhenOptedIn() {
        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .syncRequestsAsyncCoreThreadTimeoutEnabled(true)
                        .build();

        assertTrue(configuration.isSyncRequestsAsyncCoreThreadTimeoutEnabled());
        assertFalse(configuration.isAsyncRequestsAsyncCoreThreadTimeoutEnabled());
    }

    @Test
    public void asyncRequestsAsyncCoreThreadTimeoutEnabledWhenOptedIn() {
        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .asyncRequestsAsyncCoreThreadTimeoutEnabled(true)
                        .build();

        assertFalse(configuration.isSyncRequestsAsyncCoreThreadTimeoutEnabled());
        assertTrue(configuration.isAsyncRequestsAsyncCoreThreadTimeoutEnabled());
    }
}
