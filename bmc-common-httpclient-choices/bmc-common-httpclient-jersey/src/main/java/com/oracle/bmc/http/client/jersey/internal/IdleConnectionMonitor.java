/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.internal;

import org.apache.http.conn.HttpClientConnectionManager;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class IdleConnectionMonitor implements Runnable {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdleConnectionMonitor.class);
    /** The connection manager to monitor for expired and idle connections */
    private final HttpClientConnectionManager connMgr;
    /**
     * The time interval after which the check and closing of expired/idle connections is performed
     */
    private final int waitTimeInSeconds;
    /** The idle timeout - close connections that have been idle longer than idleTimeout seconds */
    private final int idleTimeoutInSeconds;

    private volatile boolean shutdown;

    public IdleConnectionMonitor(
            HttpClientConnectionManager connMgr, int waitTimeInSeconds, int idleTimeout) {
        Objects.requireNonNull(connMgr, "ConnectionManager cannot be null");
        this.connMgr = connMgr;
        this.waitTimeInSeconds = waitTimeInSeconds;
        this.idleTimeoutInSeconds = idleTimeout;
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(waitTimeInSeconds * 1000);
                    // Close expired connections
                    connMgr.closeExpiredConnections();
                    // close connections that have been idle longer than idleTimeout seconds
                    connMgr.closeIdleConnections(idleTimeoutInSeconds, TimeUnit.SECONDS);
                }
            }
        } catch (InterruptedException ex) {
            // terminate
            LOG.info("IdleConnectionMonitorThread was interrupted, terminating", ex);
        }
    }

    public void shutdown() {
        shutdown = true;
        synchronized (this) {
            notifyAll();
        }
    }
}
