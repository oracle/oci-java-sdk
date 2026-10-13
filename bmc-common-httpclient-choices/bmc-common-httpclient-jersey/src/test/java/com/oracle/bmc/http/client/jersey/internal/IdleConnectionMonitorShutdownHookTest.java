/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.internal;

import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class IdleConnectionMonitorShutdownHookTest {
    private static final long TEST_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(5);

    @Before
    public void setUp() {
        IdleConnectionMonitor.shutdown();
    }

    @After
    public void tearDown() throws InterruptedException {
        IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
        IdleConnectionMonitor.shutdown();
        joinMonitor(monitor);
    }

    @Test
    public void explicitShutdownDeregistersHookAndCanRestart() throws Exception {
        Thread previousHook = null;
        for (int i = 0; i < 3; i++) {
            HttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
            assertTrue(IdleConnectionMonitor.registerConnectionManager(manager, 60, 60));
            IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
            Thread hook = monitor.getShutdownHook();
            assertNotNull(hook);
            assertNotSame(previousHook, hook);
            IdleConnectionMonitor.registerShutdownHook();
            assertSame(hook, monitor.getShutdownHook());

            assertTrue(IdleConnectionMonitor.shutdown());
            assertFalse(IdleConnectionMonitor.shutdown());
            assertNull(monitor.getShutdownHook());
            assertFalse(Runtime.getRuntime().removeShutdownHook(hook));
            joinMonitor(monitor);
            previousHook = hook;
            manager.shutdown();
        }
    }

    @Test
    public void onlyLastManagerRemovalDeregistersHook() throws Exception {
        HttpClientConnectionManager first = new BasicHttpClientConnectionManager();
        HttpClientConnectionManager second = new BasicHttpClientConnectionManager();
        try {
            IdleConnectionMonitor.registerConnectionManager(first, 60, 60);
            IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
            Thread hook = monitor.getShutdownHook();
            IdleConnectionMonitor.registerConnectionManager(second, 60, 60);
            assertSame(hook, monitor.getShutdownHook());
            assertTrue(IdleConnectionMonitor.removeConnectionManager(first));
            assertSame(monitor, IdleConnectionMonitor.getInstance());
            assertSame(hook, monitor.getShutdownHook());
            assertTrue(IdleConnectionMonitor.removeConnectionManager(second));
            assertNull(IdleConnectionMonitor.getInstance());
            assertFalse(Runtime.getRuntime().removeShutdownHook(hook));
            joinMonitor(monitor);
        } finally {
            first.shutdown();
            second.shutdown();
        }
    }

    @Test
    public void interruptionDeregistersHook() throws Exception {
        HttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
        IdleConnectionMonitor.registerConnectionManager(manager, 60, 60);
        IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
        Thread hook = monitor.getShutdownHook();
        monitor.interrupt();
        joinMonitor(monitor);
        assertNull(IdleConnectionMonitor.getInstance());
        assertFalse(Runtime.getRuntime().removeShutdownHook(hook));
        manager.shutdown();
    }

    @Test
    public void oldHookCannotStopReplacementMonitor() throws Exception {
        HttpClientConnectionManager first = new BasicHttpClientConnectionManager();
        HttpClientConnectionManager second = new BasicHttpClientConnectionManager();
        try {
            IdleConnectionMonitor.registerConnectionManager(first, 60, 60);
            IdleConnectionMonitor oldMonitor = IdleConnectionMonitor.getInstance();
            Thread oldHook = oldMonitor.getShutdownHook();
            IdleConnectionMonitor.shutdown();
            joinMonitor(oldMonitor);
            IdleConnectionMonitor.registerConnectionManager(second, 60, 60);
            IdleConnectionMonitor replacement = IdleConnectionMonitor.getInstance();
            Thread replacementHook = replacement.getShutdownHook();

            oldHook.run();

            assertSame(replacement, IdleConnectionMonitor.getInstance());
            assertSame(replacementHook, replacement.getShutdownHook());
            assertFalse(replacement.isIdleMonitorThreadShutdown());
            assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        } finally {
            first.shutdown();
            second.shutdown();
        }
    }

    @Test
    public void absentHookDoesNotPreventShutdown() throws Exception {
        HttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
        IdleConnectionMonitor.registerConnectionManager(manager, 60, 60);
        IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
        assertTrue(Runtime.getRuntime().removeShutdownHook(monitor.getShutdownHook()));
        assertTrue(IdleConnectionMonitor.shutdown());
        assertNull(IdleConnectionMonitor.getInstance());
        joinMonitor(monitor);
        manager.shutdown();
    }

    @Test
    public void removalDuringJvmShutdownStillCleansUpMonitor() throws Exception {
        assertRemovalFailureStillCleansUp(new IllegalStateException("Shutdown in progress"));
    }

    @Test
    public void deniedRemovalStillCleansUpMonitor() throws Exception {
        assertRemovalFailureStillCleansUp(new SecurityException("Hook removal denied"));
    }

    private void assertRemovalFailureStillCleansUp(RuntimeException failure) throws Exception {
        Runtime runtime = mock(Runtime.class);
        HttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
        IdleConnectionMonitor.registerConnectionManager(manager, 60, 60);
        IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
        Thread hook = monitor.getShutdownHook();
        when(runtime.removeShutdownHook(hook)).thenThrow(failure);
        try {
            assertTrue(IdleConnectionMonitor.shutdown(runtime));
            assertNull(IdleConnectionMonitor.getInstance());
            assertNull(monitor.getShutdownHook());
            assertTrue(monitor.isIdleMonitorThreadShutdown());
            assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
            verify(runtime).removeShutdownHook(hook);
            joinMonitor(monitor);
        } finally {
            Runtime.getRuntime().removeShutdownHook(hook);
            manager.shutdown();
        }
    }

    @Test
    public void registrationFailureRollsBackBeforeWorkerStarts() {
        Runtime runtime = mock(Runtime.class);
        SecurityException failure = new SecurityException("Hook registration denied");
        doThrow(failure).when(runtime).addShutdownHook(any(Thread.class));
        IdleConnectionMonitor monitor = new IdleConnectionMonitor(60);

        assertSame(
                failure,
                assertThrows(
                        SecurityException.class,
                        () -> IdleConnectionMonitor.startMonitor(monitor, runtime)));

        assertNull(IdleConnectionMonitor.getInstance());
        assertNull(monitor.getShutdownHook());
        assertEquals(Thread.State.NEW, monitor.getState());
        assertTrue(monitor.isIdleMonitorThreadShutdown());
        verify(runtime, never()).removeShutdownHook(any(Thread.class));
    }

    @Test
    public void startupFailureDeregistersHookAndRollsBack() {
        IdleConnectionMonitor monitor = spy(new IdleConnectionMonitor(60));
        AtomicReference<Thread> registeredHook = new AtomicReference<>();
        OutOfMemoryError failure = new OutOfMemoryError("Simulated thread startup failure");
        doAnswer(
                        invocation -> {
                            registeredHook.set(monitor.getShutdownHook());
                            throw failure;
                        })
                .when(monitor)
                .start();

        assertSame(
                failure,
                assertThrows(
                        OutOfMemoryError.class,
                        () -> IdleConnectionMonitor.startMonitor(monitor, Runtime.getRuntime())));

        assertNotNull(registeredHook.get());
        assertFalse(Runtime.getRuntime().removeShutdownHook(registeredHook.get()));
        assertNull(IdleConnectionMonitor.getInstance());
        assertNull(monitor.getShutdownHook());
        assertFalse(monitor.isAlive());
        assertTrue(monitor.isIdleMonitorThreadShutdown());
    }

    private static void joinMonitor(Thread monitor) throws InterruptedException {
        if (monitor != null) {
            monitor.join(TEST_TIMEOUT_MILLIS);
            assertFalse("Monitor did not terminate", monitor.isAlive());
        }
    }
}
