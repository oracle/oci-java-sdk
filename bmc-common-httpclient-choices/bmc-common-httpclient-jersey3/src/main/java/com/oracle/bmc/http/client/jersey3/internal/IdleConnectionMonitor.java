/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.internal;

import org.apache.http.conn.HttpClientConnectionManager;
import org.slf4j.Logger;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IdleConnectionMonitor extends Thread {
    public static int DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS = 5;

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdleConnectionMonitor.class);
    /** The connection managers to be monitored for expired and idle connections. */
    private static final Map<WeakReference<HttpClientConnectionManager>, ConnectionMonitorSettings>
            connectionManagers = new ConcurrentHashMap<>();

    private static final ReferenceQueue<HttpClientConnectionManager> referenceQueue =
            new ReferenceQueue<>();

    /** Single instance of the connection monitor to track idle connections for all clients. */
    // @VisibleForTesting
    static volatile IdleConnectionMonitor instance;

    // Minimal test hooks allow deterministic scheduling of rare lifecycle races.
    private static volatile Runnable beforeRegisterConnectionManagerPutHookForTest;
    private static volatile Runnable beforeInterruptCleanupHookForTest;

    private volatile boolean shutdown;
    private volatile int waitTimeInSeconds;
    // Access only while holding the IdleConnectionMonitor.class monitor.
    private Thread shutdownHook;

    static {
        cleanStaleReferences();
    }
    /** Constructor for the singleton monitor; package access allows lifecycle failure tests. */
    // @VisibleForTesting
    IdleConnectionMonitor(int waitTimeInSeconds) {
        super("idle-connection-monitor-thread-" + System.currentTimeMillis());
        this.waitTimeInSeconds = waitTimeInSeconds;
        this.shutdown = false;
        setDaemon(true);
    }

    /**
     * Registers the connection manager with the IdleConnectionMonitor thread;
     *
     * @param connectionManager Connection manager to register
     * @param waitTimeInSeconds The maximum time interval after which the check and closing of
     *     expired/idle connections is performed; this may happen more often
     * @param idleTimeoutInSeconds The idle timeout - close connections that have been idle longer
     *     than idleTimeoutInSeconds seconds
     * @return {@code true} if the connection manager has been successfully registered; otherwise
     *     {@code false}.
     */
    public static synchronized boolean registerConnectionManager(
            HttpClientConnectionManager connectionManager,
            int waitTimeInSeconds,
            int idleTimeoutInSeconds) {
        cleanStaleReferences();
        IdleConnectionMonitor monitor = instance;
        if (monitor == null) {
            monitor = new IdleConnectionMonitor(waitTimeInSeconds);
            startMonitor(monitor, Runtime.getRuntime());
        }
        monitor.waitTimeInSeconds = Math.min(monitor.waitTimeInSeconds, waitTimeInSeconds);
        Runnable hook = beforeRegisterConnectionManagerPutHookForTest;
        if (hook != null) {
            hook.run();
        }
        LOG.debug(
                "Registering ConnectionManager {} in IdleConnectionMonitor thread",
                connectionManager);
        return connectionManagers.put(
                        new WeakReference<>(connectionManager, referenceQueue),
                        new ConnectionMonitorSettings(waitTimeInSeconds, idleTimeoutInSeconds))
                == null;
    }

    /**
     * Removes the connection manager from the IdleConnectionMonitor thread, and shuts down the
     * thread if there is no connection manager left.
     *
     * @return {@code true} if the connection manager has been successfully removed; otherwise
     *     {@code false}.
     */
    public static synchronized boolean removeConnectionManager(
            HttpClientConnectionManager connectionManager) {
        cleanStaleReferences();
        boolean wasRemoved =
                connectionManagers.keySet().removeIf(ref -> ref.get() == connectionManager);
        if (wasRemoved) {
            LOG.debug(
                    "Removing ConnectionManager {} from IdleConnectionMonitor thread",
                    connectionManager);
        }
        if (connectionManagers.isEmpty()) {
            shutdown();
        }
        return wasRemoved;
    }

    @Override
    public void run() {
        while (!shutdown) {
            try {
                cleanStaleReferences();
                closeIdleConnections();

                if (shutdown) {
                    break;
                }
                TimeUnit.SECONDS.sleep(waitTimeInSeconds);
            } catch (InterruptedException ex) {
                Runnable hook = beforeInterruptCleanupHookForTest;
                if (hook != null) {
                    hook.run();
                }
                synchronized (IdleConnectionMonitor.class) {
                    clearIfCurrentMonitor(this);
                }
                Thread.currentThread().interrupt();
                LOG.debug("IdleConnectionMonitorThread was interrupted, terminating", ex);
                break;
            }
        }
    }

    /** Close idle connections. As a side effect, updates the minimum wait time between checks. */
    public void closeIdleConnections() {
        if (shutdown) {
            return;
        }
        int minWaitTime = Integer.MAX_VALUE;
        for (Map.Entry<WeakReference<HttpClientConnectionManager>, ConnectionMonitorSettings>
                entry : connectionManagers.entrySet()) {
            if (shutdown) {
                return;
            }
            try {
                HttpClientConnectionManager connectionManager = entry.getKey().get();

                minWaitTime = Math.min(minWaitTime, entry.getValue().getWaitTimeInSeconds());

                if (connectionManager != null) {
                    // Close expired connections
                    connectionManager.closeExpiredConnections();
                    if (shutdown) {
                        return;
                    }
                    // Close connections that have been idle longer than idleTimeoutInSeconds
                    // seconds
                    connectionManager.closeIdleConnections(
                            entry.getValue().getIdleTimeoutInSeconds(), TimeUnit.SECONDS);
                }
            } catch (Exception t) {
                LOG.warn("Unable to close idle connections", t);
            }
        }

        if (minWaitTime != Integer.MAX_VALUE) {
            waitTimeInSeconds = minWaitTime;
        } else {
            waitTimeInSeconds = DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
        }
    }

    /**
     * Registers a shutdown hook with the Java Runtime to ensure that the IdleConnectionMonitor is
     * properly shut down when the JVM exits. The hook only stops the monitor that registered it.
     */
    protected static synchronized void registerShutdownHook() {
        registerShutdownHook(Runtime.getRuntime());
    }

    // @VisibleForTesting
    static synchronized void startMonitor(IdleConnectionMonitor monitor, Runtime runtime) {
        instance = monitor;
        try {
            registerShutdownHook(runtime);
            monitor.start();
        } catch (RuntimeException | Error ex) {
            clearIfCurrentMonitor(monitor, runtime);
            throw ex;
        }
    }

    private static void registerShutdownHook(Runtime runtime) {
        IdleConnectionMonitor monitor = instance;
        if (monitor == null || monitor.shutdownHook != null) {
            return;
        }
        LOG.debug("Registering IdleConnectionMonitor shutdown hook");
        Thread hook =
                new Thread(
                        () -> {
                            synchronized (IdleConnectionMonitor.class) {
                                // A delayed hook must not stop a replacement monitor.
                                if (instance == monitor) {
                                    shutdown();
                                }
                            }
                        },
                        "idle-connection-monitor-shutdown-hook");
        runtime.addShutdownHook(hook);
        monitor.shutdownHook = hook;
    }

    private void removeShutdownHook(Runtime runtime) {
        if (shutdownHook == null) {
            return;
        }
        try {
            runtime.removeShutdownHook(shutdownHook);
        } catch (IllegalStateException ex) {
            // Hooks cannot be removed once JVM shutdown has begun.
            LOG.debug("JVM shutdown is already in progress", ex);
        } catch (SecurityException ex) {
            LOG.warn("Unable to remove IdleConnectionMonitor shutdown hook", ex);
        } finally {
            shutdownHook = null;
        }
    }

    /** Remove stale references that have been garbage-collected already. */
    // @VisibleForTesting
    public static void cleanStaleReferences() {
        WeakReference<HttpClientConnectionManager> ref;
        while ((ref = (WeakReference<HttpClientConnectionManager>) referenceQueue.poll()) != null) {
            connectionManagers.remove(ref);
        }
    }

    /**
     * Stops the execution of IdleConnectionMonitor thread by shutting down the thread and clears
     * the connection managers in it. This affects all clients sharing this classloader and does not
     * wait for the thread to terminate.
     *
     * @return {@code true} if the shutdown process was initiated successfully, otherwise {@code
     *     false}.
     */
    public static synchronized boolean shutdown() {
        return shutdown(Runtime.getRuntime());
    }

    // @VisibleForTesting
    static synchronized boolean shutdown(Runtime runtime) {
        IdleConnectionMonitor monitor = instance;
        if (monitor == null) {
            return false;
        }
        clearIfCurrentMonitor(monitor, runtime);
        monitor.interrupt();
        return true;
    }

    // Call only while holding the IdleConnectionMonitor.class monitor.
    private static void clearIfCurrentMonitor(IdleConnectionMonitor expectedMonitor) {
        clearIfCurrentMonitor(expectedMonitor, Runtime.getRuntime());
    }

    private static void clearIfCurrentMonitor(
            IdleConnectionMonitor expectedMonitor, Runtime runtime) {
        // Only the active singleton may clear shared monitor state.
        if (instance != expectedMonitor) {
            return;
        }
        LOG.info("Shutting down IdleConnectionMonitor");
        expectedMonitor.markShuttingDown();
        expectedMonitor.removeShutdownHook(runtime);
        connectionManagers.clear();
        cleanStaleReferences();
        instance = null;
    }

    private void markShuttingDown() {
        shutdown = true;
    }

    // @VisibleForTesting
    public static int idleConnectionMonitorThreadSize() {
        return connectionManagers.size();
    }

    // @VisibleForTesting
    public int getWaitTimeInSeconds() {
        return waitTimeInSeconds;
    }

    // @VisibleForTesting
    public boolean isIdleMonitorThreadShutdown() {
        return shutdown;
    }

    // @VisibleForTesting
    public static IdleConnectionMonitor getInstance() {
        return instance;
    }

    // @VisibleForTesting
    Thread getShutdownHook() {
        synchronized (IdleConnectionMonitor.class) {
            return shutdownHook;
        }
    }

    // @VisibleForTesting
    static void setBeforeRegisterConnectionManagerPutHookForTest(Runnable hook) {
        beforeRegisterConnectionManagerPutHookForTest = hook;
    }

    // @VisibleForTesting
    static void setBeforeInterruptCleanupHookForTest(Runnable hook) {
        beforeInterruptCleanupHookForTest = hook;
    }

    // @VisibleForTesting
    static void clearTestHooks() {
        beforeRegisterConnectionManagerPutHookForTest = null;
        beforeInterruptCleanupHookForTest = null;
    }

    /** Keeps the settings for a ConnectionMonitor. */
    private static class ConnectionMonitorSettings {
        private final int waitTimeInSeconds;
        private final int idleTimeoutInMillis;

        public ConnectionMonitorSettings(int waitTimeInSeconds, int idleTimeoutInSeconds) {
            this.waitTimeInSeconds = waitTimeInSeconds;
            this.idleTimeoutInMillis = idleTimeoutInSeconds;
        }

        public int getWaitTimeInSeconds() {
            return waitTimeInSeconds;
        }

        public int getIdleTimeoutInSeconds() {
            return idleTimeoutInMillis;
        }
    }
}
