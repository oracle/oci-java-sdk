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

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class IdleConnectionMonitorConcurrencyTest {
    private static final long TEST_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(5);
    private static final long BLOCKED_REMOVE_ASSERTION_MILLIS = TimeUnit.SECONDS.toMillis(1);

    @Before
    public void setUp() {
        IdleConnectionMonitor.clearTestHooks();
        IdleConnectionMonitor.shutdown();
    }

    @After
    public void tearDown() {
        IdleConnectionMonitor.clearTestHooks();
        IdleConnectionMonitor.shutdown();
    }

    @Test
    public void removeWaitsForInFlightRegistrationAndDoesNotShutdownMonitor() throws Exception {
        HttpClientConnectionManager existingConnectionManager =
                new BasicHttpClientConnectionManager();
        HttpClientConnectionManager racingConnectionManager =
                new BasicHttpClientConnectionManager();

        assertTrue(
                IdleConnectionMonitor.registerConnectionManager(existingConnectionManager, 60, 60));
        assertNotNull(IdleConnectionMonitor.getInstance());
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

        CountDownLatch registerHookStarted = new CountDownLatch(1);
        CountDownLatch allowRegisterToProceed = new CountDownLatch(1);
        IdleConnectionMonitor.setBeforeRegisterConnectionManagerPutHookForTest(
                () ->
                        awaitLatchAtHook(
                                registerHookStarted,
                                allowRegisterToProceed,
                                "Timed out waiting to resume registerConnectionManager()"));

        AtomicReference<Throwable> registerFailure = new AtomicReference<>();
        Thread registerThread =
                new Thread(
                        () -> runRegister(racingConnectionManager, registerFailure),
                        "racing-register-thread");

        CountDownLatch removeStarted = new CountDownLatch(1);
        CountDownLatch removeCompleted = new CountDownLatch(1);
        AtomicReference<Throwable> removeFailure = new AtomicReference<>();
        AtomicReference<Boolean> removeResult = new AtomicReference<>();
        Thread removeThread =
                new Thread(
                        () ->
                                runRemove(
                                        existingConnectionManager,
                                        removeStarted,
                                        removeCompleted,
                                        removeFailure,
                                        removeResult),
                        "racing-remove-thread");

        try {
            registerThread.start();
            assertTrue(registerHookStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));

            removeThread.start();
            assertTrue(removeStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            assertFalse(
                    "removeConnectionManager() should wait for the in-flight registration to release the class monitor",
                    removeCompleted.await(BLOCKED_REMOVE_ASSERTION_MILLIS, TimeUnit.MILLISECONDS));
            assertNotNull(
                    "The singleton monitor must remain available while registration is in progress",
                    IdleConnectionMonitor.getInstance());
        } finally {
            allowRegisterToProceed.countDown();
            joinThread(registerThread);
            joinThread(removeThread);
        }

        assertNull(registerFailure.get());
        assertNull(removeFailure.get());
        assertTrue(removeResult.get());
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertNotNull(
                "A successful registration must leave a live monitor instance",
                IdleConnectionMonitor.getInstance());
    }

    @Test
    public void oldInterruptedMonitorCannotClearReplacementInstance() throws Exception {
        HttpClientConnectionManager existingConnectionManager =
                new BasicHttpClientConnectionManager();
        HttpClientConnectionManager replacementConnectionManager =
                new BasicHttpClientConnectionManager();

        assertTrue(
                IdleConnectionMonitor.registerConnectionManager(existingConnectionManager, 60, 60));
        IdleConnectionMonitor originalMonitor = IdleConnectionMonitor.getInstance();
        assertNotNull(originalMonitor);
        Thread originalShutdownHook = originalMonitor.getShutdownHook();
        awaitMonitorThreadToEnterSleep(originalMonitor);

        CountDownLatch interruptCleanupStarted = new CountDownLatch(1);
        CountDownLatch allowInterruptCleanupToProceed = new CountDownLatch(1);
        IdleConnectionMonitor.setBeforeInterruptCleanupHookForTest(
                () ->
                        awaitLatchAtHook(
                                interruptCleanupStarted,
                                allowInterruptCleanupToProceed,
                                "Timed out waiting to resume interrupted monitor cleanup"));

        try {
            assertTrue(IdleConnectionMonitor.shutdown());
            assertTrue(interruptCleanupStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            assertNull(IdleConnectionMonitor.getInstance());
            assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());

            assertTrue(
                    IdleConnectionMonitor.registerConnectionManager(
                            replacementConnectionManager, 60, 60));
        } finally {
            allowInterruptCleanupToProceed.countDown();
            joinThread(originalMonitor);
        }

        IdleConnectionMonitor replacementMonitor = IdleConnectionMonitor.getInstance();
        assertNotNull(replacementMonitor);
        assertNotSame(originalMonitor, replacementMonitor);
        assertEquals(1, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertSame(
                "An old interrupted monitor thread must not clear a replacement instance",
                replacementMonitor,
                IdleConnectionMonitor.getInstance());
        assertFalse(Runtime.getRuntime().removeShutdownHook(originalShutdownHook));
        assertNotNull(replacementMonitor.getShutdownHook());
        assertNotSame(originalShutdownHook, replacementMonitor.getShutdownHook());
    }

    @Test
    public void shutdownWaitsForInFlightRegistration() throws Exception {
        HttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
        CountDownLatch registrationStarted = new CountDownLatch(1);
        CountDownLatch allowRegistration = new CountDownLatch(1);
        CountDownLatch shutdownStarted = new CountDownLatch(1);
        CountDownLatch shutdownCompleted = new CountDownLatch(1);
        AtomicReference<Throwable> registerFailure = new AtomicReference<>();
        AtomicReference<Throwable> shutdownFailure = new AtomicReference<>();
        IdleConnectionMonitor.setBeforeRegisterConnectionManagerPutHookForTest(
                () ->
                        awaitLatchAtHook(
                                registrationStarted, allowRegistration, "Registration blocked"));
        Thread registerThread = new Thread(() -> runRegister(manager, registerFailure));
        Thread shutdownThread =
                new Thread(
                        () -> {
                            shutdownStarted.countDown();
                            try {
                                assertTrue(IdleConnectionMonitor.shutdown());
                            } catch (Throwable t) {
                                shutdownFailure.set(t);
                            } finally {
                                shutdownCompleted.countDown();
                            }
                        });
        IdleConnectionMonitor monitor = null;
        try {
            registerThread.start();
            assertTrue(registrationStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            monitor = IdleConnectionMonitor.getInstance();
            shutdownThread.start();
            assertTrue(shutdownStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            assertFalse(
                    shutdownCompleted.await(
                            BLOCKED_REMOVE_ASSERTION_MILLIS, TimeUnit.MILLISECONDS));
        } finally {
            allowRegistration.countDown();
            joinThread(registerThread);
            joinThread(shutdownThread);
            joinThread(monitor);
            manager.shutdown();
        }
        assertNull(registerFailure.get());
        assertNull(shutdownFailure.get());
        assertNull(IdleConnectionMonitor.getInstance());
        assertEquals(0, IdleConnectionMonitor.idleConnectionMonitorThreadSize());
        assertNull(monitor.getShutdownHook());
    }

    @Test
    public void shutdownDoesNotWaitForBlockedExpiredConnectionCleanup() throws Exception {
        HttpClientConnectionManager manager = mock(HttpClientConnectionManager.class);
        CountDownLatch callbackStarted = new CountDownLatch(1);
        CountDownLatch releaseCallback = new CountDownLatch(1);
        CountDownLatch shutdownCompleted = new CountDownLatch(1);
        AtomicReference<Throwable> callbackFailure = new AtomicReference<>();
        AtomicReference<Throwable> shutdownFailure = new AtomicReference<>();
        doAnswer(
                        invocation -> {
                            callbackStarted.countDown();
                            long deadline =
                                    System.nanoTime()
                                            + TimeUnit.MILLISECONDS.toNanos(TEST_TIMEOUT_MILLIS);
                            // Simulate a custom manager that consumes interruption while a callback
                            // is in progress.
                            while (releaseCallback.getCount() != 0) {
                                long remaining = deadline - System.nanoTime();
                                if (remaining <= 0) {
                                    callbackFailure.set(
                                            new AssertionError("Callback was not released"));
                                    break;
                                }
                                try {
                                    releaseCallback.await(remaining, TimeUnit.NANOSECONDS);
                                } catch (InterruptedException ignored) {
                                    // Deliberately ignored to exercise shutdown independently of
                                    // interruption.
                                }
                            }
                            return null;
                        })
                .when(manager)
                .closeExpiredConnections();
        // Populate the manager before starting this worker so the callback does not depend on sleep
        // timing.
        IdleConnectionMonitor monitor = new IdleConnectionMonitor(1);
        IdleConnectionMonitor.instance = monitor;
        IdleConnectionMonitor.registerConnectionManager(manager, 1, 60);
        IdleConnectionMonitor.startMonitor(monitor, Runtime.getRuntime());
        Thread hook = monitor.getShutdownHook();
        Thread shutdownThread =
                new Thread(
                        () -> {
                            try {
                                assertTrue(IdleConnectionMonitor.shutdown());
                            } catch (Throwable t) {
                                shutdownFailure.set(t);
                            } finally {
                                shutdownCompleted.countDown();
                            }
                        });
        try {
            assertTrue(callbackStarted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            shutdownThread.start();
            assertTrue(shutdownCompleted.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            assertTrue(monitor.isAlive());
            assertTrue(monitor.isIdleMonitorThreadShutdown());
            assertFalse(Runtime.getRuntime().removeShutdownHook(hook));
        } finally {
            releaseCallback.countDown();
            joinThread(shutdownThread);
            joinThread(monitor);
        }
        assertNull(callbackFailure.get());
        assertNull(shutdownFailure.get());
        verify(manager, never()).closeIdleConnections(anyLong(), eq(TimeUnit.SECONDS));
        verify(manager, never()).shutdown();
    }

    @Test
    public void failingManagersDoNotPreventOtherManagersFromBeingProcessed() throws Exception {
        HttpClientConnectionManager initial = new BasicHttpClientConnectionManager();
        IdleConnectionMonitor.registerConnectionManager(initial, 60, 60);
        IdleConnectionMonitor monitor = IdleConnectionMonitor.getInstance();
        awaitMonitorThreadToEnterSleep(monitor);
        HttpClientConnectionManager expiredFailure = mock(HttpClientConnectionManager.class);
        HttpClientConnectionManager idleFailure = mock(HttpClientConnectionManager.class);
        HttpClientConnectionManager healthy = mock(HttpClientConnectionManager.class);
        doThrow(new IllegalStateException("Expired cleanup failed"))
                .when(expiredFailure)
                .closeExpiredConnections();
        doThrow(new IllegalStateException("Idle cleanup failed"))
                .when(idleFailure)
                .closeIdleConnections(60, TimeUnit.SECONDS);
        IdleConnectionMonitor.registerConnectionManager(expiredFailure, 60, 60);
        IdleConnectionMonitor.registerConnectionManager(idleFailure, 60, 60);
        IdleConnectionMonitor.registerConnectionManager(healthy, 60, 60);

        monitor.closeIdleConnections();

        verify(expiredFailure).closeExpiredConnections();
        verify(idleFailure).closeIdleConnections(60, TimeUnit.SECONDS);
        verify(healthy).closeExpiredConnections();
        verify(healthy).closeIdleConnections(60, TimeUnit.SECONDS);
        IdleConnectionMonitor.shutdown();
        joinThread(monitor);
        initial.shutdown();
    }

    private static void runRegister(
            HttpClientConnectionManager connectionManager, AtomicReference<Throwable> failure) {
        try {
            assertTrue(IdleConnectionMonitor.registerConnectionManager(connectionManager, 60, 60));
        } catch (Throwable t) {
            failure.set(t);
        }
    }

    private static void runRemove(
            HttpClientConnectionManager connectionManager,
            CountDownLatch started,
            CountDownLatch completed,
            AtomicReference<Throwable> failure,
            AtomicReference<Boolean> result) {
        started.countDown();
        try {
            result.set(IdleConnectionMonitor.removeConnectionManager(connectionManager));
        } catch (Throwable t) {
            failure.set(t);
        } finally {
            completed.countDown();
        }
    }

    private static void awaitLatchAtHook(
            CountDownLatch hookStarted, CountDownLatch allowToProceed, String timeoutMessage) {
        hookStarted.countDown();
        try {
            assertTrue(
                    timeoutMessage,
                    allowToProceed.await(TEST_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError("Interrupted while waiting to resume a test hook", e);
        }
    }

    private static void joinThread(Thread thread) throws InterruptedException {
        if (thread == null) {
            return;
        }
        thread.join(TEST_TIMEOUT_MILLIS);
        assertFalse(thread.getName() + " did not finish in time", thread.isAlive());
    }

    private static void awaitMonitorThreadToEnterSleep(Thread thread) throws InterruptedException {
        long deadlineNanos = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(TEST_TIMEOUT_MILLIS);
        while (System.nanoTime() < deadlineNanos) {
            if (thread.getState() == Thread.State.TIMED_WAITING) {
                return;
            }
            Thread.sleep(10);
        }
        fail(
                thread.getName()
                        + " did not enter TIMED_WAITING before timeout; last state was "
                        + thread.getState());
    }
}
