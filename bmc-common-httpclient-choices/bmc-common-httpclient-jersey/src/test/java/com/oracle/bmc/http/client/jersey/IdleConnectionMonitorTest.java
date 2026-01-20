/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.jersey.internal.IdleConnectionMonitor;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static com.oracle.bmc.http.client.jersey.internal.IdleConnectionMonitor.DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
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
                new JerseyHttpClientBuilder()
                        .property(
                                JerseyClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED,
                                true)
                        .property(
                                JerseyClientProperties
                                        .APACHE_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_SECONDS,
                                20)
                        .property(
                                JerseyClientProperties
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
                new JerseyHttpClientBuilder()
                        .property(
                                JerseyClientProperties
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

        // connectionManager1 is automatically removed from the IdleConnectionMonitor thread
        connectionManager1 = null;
        garbageCollect(5, 0);
        assertEquals(0, IdleConnectionMonitor.getInstance().idleConnectionMonitorThreadSize());

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

        garbageCollect(3, 0);
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

        assertEquals(3, IdleConnectionMonitor.getInstance().idleConnectionMonitorThreadSize());

        connectionManager1 = null;
        connectionManager3 = null;

        garbageCollect(3, 1);
        assertEquals(1, IdleConnectionMonitor.getInstance().idleConnectionMonitorThreadSize());

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(waitTimeInSeconds2, waitTimeInSeconds);

        connectionManager2 = null;

        garbageCollect(3, 0);
        assertEquals(0, IdleConnectionMonitor.getInstance().idleConnectionMonitorThreadSize());

        IdleConnectionMonitor.getInstance().closeIdleConnections();
        waitTimeInSeconds = IdleConnectionMonitor.getInstance().getWaitTimeInSeconds();
        assertEquals(
                DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS, waitTimeInSeconds);
    }

    @Test
    public void testThreadInterruptAndCleanup() throws InterruptedException {
        HttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager();

        // Register connectionManager to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager, 2, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // Manually interrupt the thread
        IdleConnectionMonitor.getInstance().interrupt();
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertFalse(IdleConnectionMonitor.getInstance().isIdleMonitorThreadShutdown());

        garbageCollect(3, 0);

        // Loop should be terminated with thread size 0 and instance set to null
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertNull(IdleConnectionMonitor.getInstance());

        // Ensuring shutdown is idempotent
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void testThreadInterruptAndRestart() throws InterruptedException {
        HttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager();

        // Register connectionManager to IdleConnectionMonitor
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager, 2, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        // Manually interrupt the thread
        IdleConnectionMonitor.getInstance().interrupt();

        garbageCollect(3, 0);

        // Loop should be terminated with thread size 0 and instance set to null
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertNull(IdleConnectionMonitor.getInstance());

        // Restart IdleConnectionMonitor thread with new connectionManager
        HttpClientConnectionManager connectionManager2 = new BasicHttpClientConnectionManager();
        assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager2, 2, 10));
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        IdleConnectionMonitor.shutdown();
    }

    private static void garbageCollect(int maxAttempts, int expectedConnectionMonitorThreadSize)
            throws InterruptedException {
        int numAttempts = maxAttempts;
        do {
            System.gc();
            Thread.sleep(1000);
            IdleConnectionMonitor.cleanStaleReferences();
        } while (IdleConnectionMonitor.getInstance().idleConnectionMonitorThreadSize()
                        > expectedConnectionMonitorThreadSize
                && numAttempts-- > 0);
    }
}
