/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.http.ApacheConfigurator;
import com.oracle.bmc.http.ApacheConnectorProperties;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.junit.Before;
import org.junit.Test;

import static com.oracle.bmc.http.ApacheConnectorProperties.DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IdleConnectionMonitorTest {

    @Before
    public void setup() {
        IdleConnectionMonitor.shutdown();
    }

    @Test
    public void validateEnabledIdleConnectionMonitorThread() {
        final ApacheConnectorProperties apacheConnectorProperties =
                ApacheConnectorProperties.builder()
                        .idleConnectionMonitorThreadEnabled(
                                true) // To enable the idle connection monitor thread
                        .idleConnectionMonitorThreadIdleTimeoutInSeconds(
                                20) // to set the connection idle timeout
                        .idleConnectionMonitorThreadWaitTimeInSeconds(
                                5) // to set the idle connection monitor thread wait time
                        .build();
        final ApacheConfigurator configurator =
                new ApacheConfigurator.NonBuffering(apacheConnectorProperties);

        RestClient client =
                RestClientFactoryBuilder.builder()
                        .clientConfigurator(configurator)
                        .build()
                        .create(null, null, ClientConfiguration.builder().build());

        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        client.close();
        assertFalse(IdleConnectionMonitor.shutdown());
    }

    @Test
    public void validateDisabledIdleConnectionMonitorThread() {
        final ApacheConnectorProperties apacheConnectorProperties =
                ApacheConnectorProperties.builder()
                        .idleConnectionMonitorThreadEnabled(
                                false) // To enable the idle connection monitor thread
                        .build();
        final ApacheConfigurator configurator =
                new ApacheConfigurator.NonBuffering(apacheConnectorProperties);

        RestClient client =
                RestClientFactoryBuilder.builder()
                        .clientConfigurator(configurator)
                        .build()
                        .create(null, null, ClientConfiguration.builder().build());

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
