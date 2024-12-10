/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.internal.ClientThreadFactory;
import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import org.apache.http.conn.HttpClientConnectionManager;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class Jersey3HttpClientTest {

    @Test
    public void validateEnabledIdleConnectionMonitorThread() throws InterruptedException {

        HttpClientBuilder builder = Jersey3HttpProvider.getInstance().newBuilder();
        Jersey3HttpClient client = (Jersey3HttpClient) builder.baseUri("test").build();
        HttpClientConnectionManager httpClientConnectionManager =
                client.httpClientConnectionManager;
        assertNotNull(httpClientConnectionManager);
        IdleConnectionMonitor icm = IdleConnectionMonitor.getInstance();
        assertTrue(!icm.isIdleMonitorThreadShutdown());
        client.close();
        assertTrue(icm.isIdleMonitorThreadShutdown());
        assertNull(IdleConnectionMonitor.getInstance());
    }

    @Test
    public void threadSafeUpdateEndpoint() throws InterruptedException {

        HttpClientBuilder builder = Jersey3HttpProvider.getInstance().newBuilder();
        Jersey3HttpClient client =
                (Jersey3HttpClient)
                        builder.baseUri("https://objectstorage.us-phoenix-1.oci.customer-oci.com")
                                .build();

        final ConcurrentMap<Integer, String> endpointMap = new ConcurrentHashMap<>();
        final String epOne = "https://ns1.objectstorage.us-phoenix-1.oci.customer-oci.com";
        final String epTwo = "https://ns2.objectstorage.us-phoenix-1.oci.customer-oci.com";
        Thread t1 =
                new Thread(
                        () -> {
                            try {
                                client.updateEndpoint(epOne);
                                Thread.sleep(30);
                                Jersey3HttpRequest request =
                                        (Jersey3HttpRequest) client.createRequest(Method.GET);
                                String endpoint = request.uri().toString();
                                endpointMap.put(1, endpoint);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
        Thread t2 =
                new Thread(
                        () -> {
                            try {
                                Thread.sleep(10);
                                client.updateEndpoint(epTwo);
                                Jersey3HttpRequest request =
                                        (Jersey3HttpRequest) client.createRequest(Method.GET);
                                String endpoint = request.uri().toString();
                                endpointMap.put(2, endpoint);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        assertEquals(epOne, endpointMap.get(1));
        assertEquals(epTwo, endpointMap.get(2));
        client.close();
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
        HttpClientConnectionManager httpClientConnectionManager =
                client.httpClientConnectionManager;
        assertNull(httpClientConnectionManager);
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
