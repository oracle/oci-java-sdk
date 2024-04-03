/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.junit.Before;
import org.junit.Test;

import static com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor.DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class IdleConnectionMonitorTest {

    @Before
    public void setup() {
        IdleConnectionMonitor.shutdown();
    }

    @Test
    public void validateEnabledIdleConnectionMonitorThread() {
        HttpClient client =
                new Jersey3HttpClientBuilder()
                        .property(
                                Jersey3ClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED,
                                true)
                        .property(
                                Jersey3ClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_SECONDS,
                                20)
                        .property(
                                Jersey3ClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_SECONDS,
                                5)
                        .baseUri("https://test")
                        .build();

        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        IdleConnectionMonitor icm = IdleConnectionMonitor.getInstance();
        assertTrue(!icm.isIdleMonitorThreadShutdown());
        client.close();
        assertTrue(icm.isIdleMonitorThreadShutdown());
        assertNull(IdleConnectionMonitor.getInstance());
    }

    @Test
    public void validateDisabledIdleConnectionMonitorThread() {
        HttpClient client =
                new Jersey3HttpClientBuilder()
                        .property(
                                Jersey3ClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED,
                                false)
                        .baseUri("https://test")
                        .build();

        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        client.close();
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void testIdleConnectionMonitorOnForceShutdown() {
        HttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager();

        // Register connectionManager to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager, 5, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // Force shutdown IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.shutdown());
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // IdleConnectionMonitor is already shutdown
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void testIdleConnectionMonitorOnAutoShutdown() {
        HttpClientConnectionManager connectionManager1 = new BasicHttpClientConnectionManager();
        HttpClientConnectionManager connectionManager2 = new BasicHttpClientConnectionManager();

        // Register connectionManagers to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager1, 5, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager2, 5, 10));
        assertEquals(2, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // Remove connectionManagers from IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.removeConnectionManager(connectionManager1));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertTrue(IdleConnectionMonitor.removeConnectionManager(connectionManager2));
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // IdleConnectionMonitor is already shutdown after the removal of the last
        // connectionManager2
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void testWeakReferenceConnectionManagerRemoval() throws InterruptedException {
        HttpClientConnectionManager connectionManager1 = new BasicHttpClientConnectionManager();
        HttpClientConnectionManager connectionManager2 = new BasicHttpClientConnectionManager();

        // Register connectionManager to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager1, 10, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        int actualIdleConnectionMonitorThreadSize = 1;

        // connectionManager1 is automatically removed from the IdleConnectionMonitor thread
        connectionManager1 = null;
        for (int attempt = 0; attempt < 5; ++attempt) {
            System.gc();
            Thread.sleep(1000);
            IdleConnectionMonitor.cleanStaleReferences();
            actualIdleConnectionMonitorThreadSize =
                    IdleConnectionMonitor.idleConnectionMonitorThreadSize();
            if (actualIdleConnectionMonitorThreadSize == 0) {
                break;
            }
        }

        assertEquals(0, actualIdleConnectionMonitorThreadSize);

        // Register connectionManager to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager2, 10, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertTrue(IdleConnectionMonitor.removeConnectionManager(connectionManager2));
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void testWeakReferenceConnectionManagerRemovalLong() throws InterruptedException {
        for (int i = 0; i < 1000; ++i) {
            HttpClientConnectionManager connectionManager1 = new BasicHttpClientConnectionManager();

            // Register connectionManager to IdleConnectionMonitor
            assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager1, 10, 10));

            connectionManager1 = null;
        }

        System.gc();
        Thread.sleep(1000);
        IdleConnectionMonitor.cleanStaleReferences();
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
    }

    @Test
    public void testDifferentWaitTimeInSeconds() throws InterruptedException {
        HttpClientConnectionManager connectionManager1 = new BasicHttpClientConnectionManager();
        int waitTimeInSeconds1 = 10;
        assertTrue(
                IdleConnectionMonitor.registerConnectionManager(
                        connectionManager1, waitTimeInSeconds1, 10));

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        int waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(waitTimeInSeconds1, waitTimeInSeconds);

        HttpClientConnectionManager connectionManager2 = new BasicHttpClientConnectionManager();
        int waitTimeInSeconds2 = 15;
        assertTrue(
                IdleConnectionMonitor.registerConnectionManager(
                        connectionManager2, waitTimeInSeconds2, 10));

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(waitTimeInSeconds1, waitTimeInSeconds);

        HttpClientConnectionManager connectionManager3 = new BasicHttpClientConnectionManager();
        int waitTimeInSeconds3 = 5;
        assertTrue(
                IdleConnectionMonitor.registerConnectionManager(
                        connectionManager3, waitTimeInSeconds3, 10));

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(waitTimeInSeconds3, waitTimeInSeconds);

        connectionManager1 = null;
        connectionManager3 = null;

        System.gc();
        Thread.sleep(1000);
        IdleConnectionMonitor.cleanStaleReferences();

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(waitTimeInSeconds2, waitTimeInSeconds);

        connectionManager2 = null;

        System.gc();
        Thread.sleep(1000);
        IdleConnectionMonitor.cleanStaleReferences();

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(
                DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS, waitTimeInSeconds);
    }
}
