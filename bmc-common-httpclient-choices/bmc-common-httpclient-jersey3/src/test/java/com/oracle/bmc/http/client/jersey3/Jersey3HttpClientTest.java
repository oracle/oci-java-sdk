/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Jersey3HttpClientTest {

    @Test
    public void validateEnabledIdleConnectionMonitorThread() {

        HttpClientBuilder builder = Jersey3HttpProvider.getInstance().newBuilder();
        Jersey3HttpClient client = (Jersey3HttpClient) builder.baseUri("test").build();
        IdleConnectionMonitor idleConnectionMonitor = client.idleConnectionMonitor;
        assertTrue(idleConnectionMonitor != null);
        assertTrue(!idleConnectionMonitor.isIdleMonitorThreadShutdown());
        client.close();
        assertTrue(idleConnectionMonitor.isIdleMonitorThreadShutdown());
    }

    @Test
    public void validateDisabledIdleConnectionMonitorThread() {

        HttpClientBuilder builder = Jersey3HttpProvider.getInstance().newBuilder();
        Jersey3HttpClient client =
                (Jersey3HttpClient)
                        builder.baseUri("test")
                                .property(
                                        Jersey3ClientProperties
                                                .APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED,
                                        false)
                                .build();
        IdleConnectionMonitor idleConnectionMonitor = client.idleConnectionMonitor;
        assertTrue(idleConnectionMonitor == null);
        client.close();
    }
}
