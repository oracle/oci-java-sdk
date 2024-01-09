/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import org.glassfish.jersey.spi.ExecutorServiceProvider;

/** Properties for the Jersey HTTP client. */
public enum JerseyClientProperties {
    ;

    public static final JerseyClientProperty<Boolean> USE_APACHE_CONNECTOR =
            JerseyClientProperty.create("com.oracle.bmc.http.client.jersey.use_apache_connector");

    /**
     * Jersey provides a default {@link ExecutorServiceProvider}, but in stand-alone applications,
     * its threads fail to terminate, because they are not daemon threads.
     *
     * <p>By default, the OCI Java SDK uses its own {@link ExecutorServiceProvider} instead of
     * Jersey's default. Setting this property to true changes the OCI Java SDK behavior to use
     * Jersey's default and not its own.
     *
     * <p>Note, this property is pointless if a specific {@link ExecutorServiceProvider} is
     * specified using EXECUTOR_SERVICE_PROVIDER.
     */
    public static final JerseyClientProperty<Boolean> USE_JERSEY_DEFAULT_EXECUTOR_SERVICE_PROVIDER =
            JerseyClientProperty.create(
                    "com.oracle.bmc.http.client.jersey.use_jersey_default_executor_service_provider");

    public static final JerseyClientProperty<ExecutorServiceProvider> EXECUTOR_SERVICE_PROVIDER =
            JerseyClientProperty.create(
                    "com.oracle.bmc.http.client.jersey.executor_service_provider");
    /**
     * Idle monitor thread polls the connection manager to monitor for expired and idle connections
     * and closes any such connections
     *
     * <p>If the property is absent then default value of true will be used
     */
    public static final JerseyClientProperty<Boolean>
            APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED =
                    JerseyClientProperty.create(
                            "com.oracle.bmc.http.client.jersey.apache_idle_connection_monitor_thread_enabled");

    /**
     * The time interval after which the check and closing of expired/idle connections is performed
     * by the idleMonitorThread. This is applicable only if idleConnectionMonitorThead is
     * enabled/true
     *
     * <p>If the property is absent then default value of 5 seconds will be used
     */
    public static final JerseyClientProperty<Integer>
            APACHE_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_SECONDS =
                    JerseyClientProperty.create(
                            "com.oracle.bmc.http.client.jersey.apache_idle_connection_monitor_thread_wait_time_seconds");

    /**
     * The idle timeout - close connections that have been idle longer than
     * idleConnectionMonitorThreadIdleTimeoutInSeconds seconds by idleMonitorThread. This is
     * applicable only if idleConnectionMonitorThead is enabled/true
     *
     * <p>If the property is absent then default value of 20 seconds will be used
     */
    public static final JerseyClientProperty<Integer>
            APACHE_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_SECONDS =
                    JerseyClientProperty.create(
                            "com.oracle.bmc.http.client.jersey.apache_idle_connection_monitor_thread_idle_timeout_seconds");
}
