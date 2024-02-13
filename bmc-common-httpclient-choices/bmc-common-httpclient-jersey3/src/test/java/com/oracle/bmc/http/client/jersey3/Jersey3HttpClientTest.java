/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.internal.ClientThreadFactory;
import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertFalse;
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

    @Test
    public void validateExecutorServiceWithoutShutdown() throws InterruptedException {

        ExecutorService executorService =
                Executors.newFixedThreadPool(
                        1,
                        ClientThreadFactory.builder()
                                .nameFormat(
                                        "idle-connection-monitor-thread-"
                                                + System.currentTimeMillis()
                                                + "-%d")
                                .isDaemon(true)
                                .build());

        MockIdleConnectionMonitor idleConnectionMonitor = new MockIdleConnectionMonitor();

        // Execute thread
        executorService.execute(idleConnectionMonitor);
        assertFalse(idleConnectionMonitor.shutdown);
        assertFalse(executorService.isTerminated());

        // Close IdleConnectionMonitor thread
        idleConnectionMonitor.shutdown();
        Thread.sleep(2000);
        assertTrue(idleConnectionMonitor.shutdown); // IdleConnectionMonitor thread closed
        assertFalse(
                executorService
                        .isTerminated()); // ExecutorService is still open and holding resources
    }

    @Test
    public void validateExecutorServiceOnShutdown() throws InterruptedException {

        ExecutorService executorService =
                Executors.newFixedThreadPool(
                        1,
                        ClientThreadFactory.builder()
                                .nameFormat(
                                        "idle-connection-monitor-thread-"
                                                + System.currentTimeMillis()
                                                + "-%d")
                                .isDaemon(true)
                                .build());

        MockIdleConnectionMonitor idleConnectionMonitor = new MockIdleConnectionMonitor();
        executorService.execute(idleConnectionMonitor);
        assertFalse(idleConnectionMonitor.shutdown);
        assertFalse(executorService.isTerminated());

        // Shutdown ExecutorService
        executorService.shutdown();
        Thread.sleep(2000);
        assertFalse(idleConnectionMonitor.shutdown); // IdleConnectionMonitor thread running
        assertFalse(
                executorService.isTerminated()); // ExecutorService waiting for thread to complete

        // Close IdleConnectionMonitor thread
        idleConnectionMonitor.shutdown();
        Thread.sleep(2000);
        assertTrue(idleConnectionMonitor.shutdown); // IdleConnectionMonitor thread closed
        assertTrue(executorService.isTerminated()); // ExecutorService gracefully closed
    }

    class MockIdleConnectionMonitor implements Runnable {

        private volatile boolean shutdown;

        @Override
        public void run() {
            while (!shutdown) {
                synchronized (this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // InterruptedException
                    }
                }
            }
        }

        public void shutdown() {
            shutdown = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
