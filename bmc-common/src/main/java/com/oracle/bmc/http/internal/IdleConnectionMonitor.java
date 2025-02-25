/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.util.VisibleForTesting;
import org.apache.http.conn.HttpClientConnectionManager;
import org.slf4j.Logger;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IdleConnectionMonitor extends Thread {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdleConnectionMonitor.class);
    /**
     * The connection managers to be monitored for expired and idle connections.
     */
    private static final Map<WeakReference<HttpClientConnectionManager>, ConnectionMonitorSettings>
            connectionManagers = new ConcurrentHashMap<>();

    private static final ReferenceQueue<HttpClientConnectionManager> referenceQueue =
            new ReferenceQueue<>();

    /**
     * Single instance of the connection monitor to track idle connections for all clients.
     */
    @VisibleForTesting static volatile IdleConnectionMonitor instance;
    private volatile boolean shutdown;
    private volatile int waitTimeInSeconds;

    static {
        cleanStaleReferences();
    }
    /**
     * Private constructor - singleton pattern.
     */
    private IdleConnectionMonitor(int waitTimeInSeconds) {
        super("idle-connection-monitor-thread-" + System.currentTimeMillis());
        this.waitTimeInSeconds = waitTimeInSeconds;
        this.shutdown = false;
        setDaemon(true);
    }

    /**
     * Registers the connection manager with the IdleConnectionMonitor thread;
     *
     * @param connectionManager Connection manager to register
     * @param waitTimeInSeconds The maximum time interval after which the check and closing of expired/idle connections is performed; this may happen more often
     * @param idleTimeoutInSeconds The idle timeout - close connections that have been idle longer than idleTimeoutInSeconds seconds
     * @return {@code true} if the connection manager has been successfully registered; otherwise {@code false}.
     */
    public static boolean registerConnectionManager(
            HttpClientConnectionManager connectionManager,
            int waitTimeInSeconds,
            int idleTimeoutInSeconds) {
        cleanStaleReferences();
        if (instance == null) {
            synchronized (IdleConnectionMonitor.class) {
                if (instance == null) {
                    instance = new IdleConnectionMonitor(waitTimeInSeconds);
                    instance.start();
                }
            }
        } else {
            instance.waitTimeInSeconds = Math.min(instance.waitTimeInSeconds, waitTimeInSeconds);
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
     * Removes the connection manager from the IdleConnectionMonitor thread,
     * and shuts down the thread if there is no connection manager left.
     *
     * @return {@code true} if the connection manager has been successfully removed;
     * otherwise {@code false}.
     */
    public static boolean removeConnectionManager(HttpClientConnectionManager connectionManager) {
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

                TimeUnit.SECONDS.sleep(waitTimeInSeconds);
            } catch (InterruptedException ex) {
                // terminate
                Thread.currentThread().interrupt();
                LOG.debug("IdleConnectionMonitorThread was interrupted, terminating", ex);
            }
        }
    }

    /**
     * Close idle connections. As a side effect, updates the minimum wait time between checks.
     */
    public void closeIdleConnections() {
        int minWaitTime = Integer.MAX_VALUE;
        for (Map.Entry<WeakReference<HttpClientConnectionManager>, ConnectionMonitorSettings>
                entry : connectionManagers.entrySet()) {
            try {
                HttpClientConnectionManager connectionManager = entry.getKey().get();

                minWaitTime = Math.min(minWaitTime, entry.getValue().getWaitTimeInSeconds());

                if (connectionManager != null) {
                    // Close expired connections
                    connectionManager.closeExpiredConnections();
                    // Close connections that have been idle longer than idleTimeoutInSeconds seconds
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
            waitTimeInSeconds =
                    com.oracle.bmc.http.ApacheConnectorProperties
                            .DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
        }
    }

    /**
     * Remove stale references that have been garbage-collected already.
     */
    protected static void cleanStaleReferences() {
        WeakReference<HttpClientConnectionManager> ref;
        while ((ref = (WeakReference<HttpClientConnectionManager>) referenceQueue.poll()) != null) {
            connectionManagers.remove(ref);
        }
    }

    /**
     * Stops the execution of IdleConnectionMonitor thread by shutting down the thread and clears the connection managers in it.
     * @return {@code true} if the shutdown process was initiated successfully, otherwise {@code false}.
     */
    public static synchronized boolean shutdown() {
        if (instance != null) {
            LOG.info("Shutting down IdleConnectionMonitor");
            instance.markShuttingDown();
            instance.interrupt();
            connectionManagers.clear();
            cleanStaleReferences();
            instance = null;
            return true;
        }
        return false;
    }

    private void markShuttingDown() {
        shutdown = true;
    }

    @VisibleForTesting
    protected static int idleConnectionMonitorThreadSize() {
        return connectionManagers.size();
    }

    @VisibleForTesting
    public int getWaitTimeInSeconds() {
        return waitTimeInSeconds;
    }

    @VisibleForTesting
    boolean isIdleConnectionMonitorThreadClosed() {
        return shutdown;
    }

    @VisibleForTesting
    public static IdleConnectionMonitor getInstance() {
        return instance;
    }
    /**
     * Keeps the settings for a ConnectionMonitor.
     */
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
