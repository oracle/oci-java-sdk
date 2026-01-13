/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.apacheconfigurator;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

public class ApacheConnectorProperties {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApacheConnectorProperties.class);

    private static ConnectionKeepAliveStrategy DEFAULT_KEEP_ALIVE_STRATEGY = null;
    private static boolean DEFAULT_CONNECTION_MANAGER_SHARED = false;
    private static HttpClientConnectionManager DEFAULT_CONNECTION_MANAGER = null;
    private static ConnectionReuseStrategy DEFAULT_CONNECTION_REUSE_STRATEGY;
    private static SSLContext DEFAULT_SSL_CONTEXT = null;
    private static HostnameVerifier DEFAULT_HOSTNAME_VERIFIER = null;
    private static HttpRequestRetryHandler DEFAULT_REQUEST_RETRY_HANDLER =
            new DefaultHttpRequestRetryHandler(0, false);

    private static ApacheConnectionClosingStrategy DEFAULT_APACHE_CONNECTION_CLOSING_STRATEGY =
            new ApacheConnectionClosingStrategy.ImmediateClosingStrategy();

    private static boolean DEFAULT_POOLING_OPTION = true;
    private static ApacheConnectionPoolConfig DEFAULT_APACHE_CONNECTION_POOL_CONFIG =
            ApacheConnectionPoolConfig.newDefault();
    private static boolean DEFAULT_EXPECT_CONTINUE = true;
    private static boolean DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_ENABLED;

    static {
        DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_ENABLED =
                Boolean.parseBoolean(
                        System.getProperty(
                                "oci.javasdk.apache.idle.connection.monitor.thread.enabled",
                                "true"));
        if (!DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_ENABLED) {
            DEFAULT_CONNECTION_REUSE_STRATEGY = new NoConnectionReuseStrategy();
        }
    }

    private static int DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS = 5;
    private static int DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_IN_SECONDS = 20;

    /**
     * ConnectionKeepAliveStrategy for the Apache HttpClient. The value MUST be an instance of
     * ConnectionKeepAliveStrategy.
     *
     * <p>If the property is absent the default keepalive strategy of the Apache HTTP library will
     * be used
     */
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    /**
     * A value of true indicates that configured connection manager should be shared among multiple
     * Jersey ClientRuntime instances. It means that closing a particular ClientRuntime instance
     * does not shut down the underlying connection manager automatically. In such case, the
     * connection manager life-cycle should be fully managed by the application code. To release all
     * allocated resources, caller code should especially ensure
     * HttpClientConnectionManager.shutdown() gets invoked eventually. This property may only be set
     * prior to constructing Apache connector using ApacheConnectorProvider.
     *
     * <p>The value MUST be boolean
     */
    private final boolean connectionManagerShared;
    /**
     * Connection Manager which will be used to create the Apache HttpClient. This takes precedence
     * over the default pooling configuration The value MUST be an instance of
     * HttpClientConnectionManager.
     *
     * <p>If the property is absent a default Connection Manager will be used
     * (PoolingHttpClientConnectionManager)
     */
    private final HttpClientConnectionManager connectionManager;
    /**
     * ConnectionReuseStrategy for the Apache HttpClient. The value MUST be an instance of
     * org.apache.http.impl.ConnectionReuseStrategy.
     *
     * <p>If the property is absent the default reuse strategy of the Apache HTTP library will be
     * used
     */
    private final ConnectionReuseStrategy connectionReuseStrategy;
    /**
     * A value that indicates whether connection pooling will be enabled. The value MUST be boolean
     *
     * <p>If the property is absent then default option of pooling will be used If the property is
     * false, then the thread-safe BasicHttpClientConnectionManager is used for the Apache
     * HttpClient A connection manager for a single connection. This connection manager maintains
     * only one active connection. Even though this class is fully thread-safe it ought to be used
     * by one execution thread only, as only one thread a time can lease the connection at a time.
     * This connection manager implementation should be used inside an EJB container
     */
    private final boolean connectionPooling;
    /**
     * ApacheConnectionPoolConfig for the connection pooling The value MUST be an instance of
     * ApacheConnectionPoolConfig
     *
     * <p>If the property is absent then default option of pool config will be used
     */
    private final ApacheConnectionPoolConfig connectionPoolConfig;
    /**
     * A value that indicates whether to support expect 100 continue behavior for the Apache
     * HttpClient.
     *
     * <p>If this value is true, and the Apache HttpClient is used, and operation supports expect
     * 100 continue, then this request header will be emitted.
     *
     * <p>The value MUST be boolean.
     *
     * <p>If the property is absent then default option of true will be used.
     */
    private final boolean expectContinue;
    /**
     * Strategy that closes the Apache Connection. Accepts an instance of
     * ApacheConnectionClosingStrategy. The value MUST be an instance of
     * ApacheConnectionClosingStrategy.
     *
     * <p>If the property is absent then default option of
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy will be used
     *
     * <p>Note: When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams returned
     * from response are read till the end of the stream when closing the stream. This can introduce
     * additional time when closing the stream with partial read, depending on how large the
     * remaining stream is. Use ApacheConnectionClosingStrategy.ImmediateClosingStrategy for large
     * files with partial reads instead for faster close.
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy on the other hand takes longer when
     * using partial read for smaller stream size (< 1MB). Please consider your use-case and change
     * accordingly. Please use ApacheConnectorPropertiesExample for reference
     */
    private final ApacheConnectionClosingStrategy connectionClosingStrategy;
    /**
     * SSLContext to be used for the Apache Connection. Accepts an instance of SSLContext. The value
     * MUST be an instance of SSLContext.
     *
     * <p>If the property is absent then default value of null will be used
     */
    private final SSLContext sslContext;
    /**
     * HostnameVerifier to be used for the Apache Connection. Accepts an instance of
     * HostnameVerifier. The value MUST be an instance of HostnameVerifier.
     *
     * <p>If the property is absent then default value of null will be used
     */
    private final HostnameVerifier hostnameVerifier;
    /**
     * Request RetryHandler to be used for the Apache Connection. Accepts an instance of
     * HttpRequestRetryHandler
     */
    private final HttpRequestRetryHandler requestRetryHandler;
    /**
     * Idle monitor thread polls the connection manager to monitor for expired and idle connections
     * and closes any such connections
     *
     * <p>If the property is absent then default value of true will be used
     */
    private final boolean idleConnectionMonitorThreadEnabled;
    /**
     * The time interval after which the check and closing of expired/idle connections is performed
     * by the idleMonitorThread. This is applicable only if idleConnectionMonitorThead is
     * enabled/true
     *
     * <p>If the property is absent then default value of 5 seconds will be used
     */
    private final int idleConnectionMonitorThreadWaitTimeInSeconds;
    /**
     * The idle timeout - close connections that have been idle longer than
     * idleConnectionMonitorThreadIdleTimeoutInSeconds seconds by idleMonitorThread. This is
     * applicable only if idleConnectionMonitorThead is enabled/true
     *
     * <p>If the property is absent then default value of 20 seconds will be used
     */
    private final int idleConnectionMonitorThreadIdleTimeoutInSeconds;

    private static ConnectionKeepAliveStrategy $default$keepAliveStrategy() {
        return DEFAULT_KEEP_ALIVE_STRATEGY;
    }

    private static boolean $default$connectionManagerShared() {
        return DEFAULT_CONNECTION_MANAGER_SHARED;
    }

    private static HttpClientConnectionManager $default$connectionManager() {
        return DEFAULT_CONNECTION_MANAGER;
    }

    private static ConnectionReuseStrategy $default$connectionReuseStrategy() {
        return DEFAULT_CONNECTION_REUSE_STRATEGY;
    }

    private static boolean $default$connectionPooling() {
        return DEFAULT_POOLING_OPTION;
    }

    private static ApacheConnectionPoolConfig $default$connectionPoolConfig() {
        return DEFAULT_APACHE_CONNECTION_POOL_CONFIG;
    }

    private static boolean $default$expectContinue() {
        return DEFAULT_EXPECT_CONTINUE;
    }

    private static ApacheConnectionClosingStrategy $default$connectionClosingStrategy() {
        return DEFAULT_APACHE_CONNECTION_CLOSING_STRATEGY;
    }

    private static SSLContext $default$sslContext() {
        return DEFAULT_SSL_CONTEXT;
    }

    private static HostnameVerifier $default$hostnameVerifier() {
        return DEFAULT_HOSTNAME_VERIFIER;
    }

    private static HttpRequestRetryHandler $default$requestRetryHandler() {
        return DEFAULT_REQUEST_RETRY_HANDLER;
    }

    private static boolean $default$idleConnectionMonitorThreadEnabled() {
        return DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_ENABLED;
    }

    private static int $default$idleConnectionMonitorThreadWaitTimeInSeconds() {
        return DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_IN_SECONDS;
    }

    private static int $default$idleConnectionMonitorThreadIdleTimeoutInSeconds() {
        return DEFAULT_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_IN_SECONDS;
    }

    @java.beans.ConstructorProperties({
        "keepAliveStrategy",
        "connectionManagerShared",
        "connectionManager",
        "connectionReuseStrategy",
        "connectionPooling",
        "connectionPoolConfig",
        "expectContinue",
        "connectionClosingStrategy",
        "sslContext",
        "hostnameVerifier",
        "requestRetryHandler",
        "idleConnectionMonitorThreadEnabled",
        "idleConnectionMonitorThreadWaitTimeInSeconds",
        "idleConnectionMonitorThreadIdleTimeoutInSeconds"
    })
    ApacheConnectorProperties(
            final ConnectionKeepAliveStrategy keepAliveStrategy,
            final boolean connectionManagerShared,
            final HttpClientConnectionManager connectionManager,
            final ConnectionReuseStrategy connectionReuseStrategy,
            final boolean connectionPooling,
            final ApacheConnectionPoolConfig connectionPoolConfig,
            final boolean expectContinue,
            final ApacheConnectionClosingStrategy connectionClosingStrategy,
            final SSLContext sslContext,
            final HostnameVerifier hostnameVerifier,
            final HttpRequestRetryHandler requestRetryHandler,
            final boolean idleConnectionMonitorThreadEnabled,
            final int idleConnectionMonitorThreadWaitTimeInSeconds,
            final int idleConnectionMonitorThreadIdleTimeoutInSeconds) {
        this.keepAliveStrategy = keepAliveStrategy;
        this.connectionManagerShared = connectionManagerShared;
        this.connectionManager = connectionManager;
        this.connectionReuseStrategy = connectionReuseStrategy;
        this.connectionPooling = connectionPooling;
        this.connectionPoolConfig = connectionPoolConfig;
        this.expectContinue = expectContinue;
        this.connectionClosingStrategy = connectionClosingStrategy;
        this.sslContext = sslContext;
        this.hostnameVerifier = hostnameVerifier;
        this.requestRetryHandler = requestRetryHandler;
        this.idleConnectionMonitorThreadEnabled = idleConnectionMonitorThreadEnabled;
        this.idleConnectionMonitorThreadWaitTimeInSeconds =
                idleConnectionMonitorThreadWaitTimeInSeconds;
        this.idleConnectionMonitorThreadIdleTimeoutInSeconds =
                idleConnectionMonitorThreadIdleTimeoutInSeconds;
    }

    public static class ApacheConnectorPropertiesBuilder {
        private boolean keepAliveStrategy$set;

        private ConnectionKeepAliveStrategy keepAliveStrategy$value;

        private boolean connectionManagerShared$set;

        private boolean connectionManagerShared$value;

        private boolean connectionManager$set;

        private HttpClientConnectionManager connectionManager$value;

        private boolean connectionReuseStrategy$set;

        private ConnectionReuseStrategy connectionReuseStrategy$value;

        private boolean connectionPooling$set;

        private boolean connectionPooling$value;

        private boolean connectionPoolConfig$set;

        private ApacheConnectionPoolConfig connectionPoolConfig$value;

        private boolean expectContinue$set;

        private boolean expectContinue$value;

        private boolean connectionClosingStrategy$set;

        private ApacheConnectionClosingStrategy connectionClosingStrategy$value;

        private boolean sslContext$set;

        private SSLContext sslContext$value;

        private boolean hostnameVerifier$set;

        private HostnameVerifier hostnameVerifier$value;

        private boolean requestRetryHandler$set;

        private HttpRequestRetryHandler requestRetryHandler$value;

        private boolean idleConnectionMonitorThreadEnabled$set;

        private boolean idleConnectionMonitorThreadEnabled$value;

        private boolean idleConnectionMonitorThreadWaitTimeInSeconds$set;

        private int idleConnectionMonitorThreadWaitTimeInSeconds$value;

        private boolean idleConnectionMonitorThreadIdleTimeoutInSeconds$set;

        private int idleConnectionMonitorThreadIdleTimeoutInSeconds$value;

        ApacheConnectorPropertiesBuilder() {}

        /**
         * ConnectionKeepAliveStrategy for the Apache HttpClient. The value MUST be an instance of
         * ConnectionKeepAliveStrategy.
         *
         * <p>If the property is absent the default keepalive strategy of the Apache HTTP library
         * will be used
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder keepAliveStrategy(
                final ConnectionKeepAliveStrategy keepAliveStrategy) {
            this.keepAliveStrategy$value = keepAliveStrategy;
            keepAliveStrategy$set = true;
            return this;
        }

        /**
         * A value of true indicates that configured connection manager should be shared among
         * multiple Jersey ClientRuntime instances. It means that closing a particular ClientRuntime
         * instance does not shut down the underlying connection manager automatically. In such
         * case, the connection manager life-cycle should be fully managed by the application code.
         * To release all allocated resources, caller code should especially ensure
         * HttpClientConnectionManager.shutdown() gets invoked eventually. This property may only be
         * set prior to constructing Apache connector using ApacheConnectorProvider.
         *
         * <p>The value MUST be boolean
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionManagerShared(
                final boolean connectionManagerShared) {
            this.connectionManagerShared$value = connectionManagerShared;
            connectionManagerShared$set = true;
            return this;
        }

        /**
         * Connection Manager which will be used to create the Apache HttpClient. This takes
         * precedence over the default pooling configuration The value MUST be an instance of
         * HttpClientConnectionManager.
         *
         * <p>If the property is absent a default Connection Manager will be used
         * (PoolingHttpClientConnectionManager)
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionManager(
                final HttpClientConnectionManager connectionManager) {
            this.connectionManager$value = connectionManager;
            connectionManager$set = true;
            return this;
        }

        /**
         * ConnectionReuseStrategy for the Apache HttpClient. The value MUST be an instance of
         * org.apache.http.impl.ConnectionReuseStrategy.
         *
         * <p>If the property is absent the default reuse strategy of the Apache HTTP library will
         * be used
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionReuseStrategy(
                final ConnectionReuseStrategy connectionReuseStrategy) {
            this.connectionReuseStrategy$value = connectionReuseStrategy;
            connectionReuseStrategy$set = true;
            return this;
        }

        /**
         * A value that indicates whether connection pooling will be enabled. The value MUST be
         * boolean
         *
         * <p>If the property is absent then default option of pooling will be used If the property
         * is false, then the thread-safe BasicHttpClientConnectionManager is used for the Apache
         * HttpClient A connection manager for a single connection. This connection manager
         * maintains only one active connection. Even though this class is fully thread-safe it
         * ought to be used by one execution thread only, as only one thread a time can lease the
         * connection at a time. This connection manager implementation should be used inside an EJB
         * container
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionPooling(
                final boolean connectionPooling) {
            this.connectionPooling$value = connectionPooling;
            connectionPooling$set = true;
            return this;
        }

        /**
         * ApacheConnectionPoolConfig for the connection pooling The value MUST be an instance of
         * ApacheConnectionPoolConfig
         *
         * <p>If the property is absent then default option of pool config will be used
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionPoolConfig(
                final ApacheConnectionPoolConfig connectionPoolConfig) {
            this.connectionPoolConfig$value = connectionPoolConfig;
            connectionPoolConfig$set = true;
            return this;
        }

        /**
         * A value that indicates whether to support expect 100 continue behavior for the Apache
         * HttpClient.
         *
         * <p>If this value is true, and the Apache HttpClient is used, and operation supports
         * expect 100 continue, then this request header will be emitted.
         *
         * <p>The value MUST be boolean.
         *
         * <p>If the property is absent then default option of true will be used.
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder expectContinue(
                final boolean expectContinue) {
            this.expectContinue$value = expectContinue;
            expectContinue$set = true;
            return this;
        }

        /**
         * Strategy that closes the Apache Connection. Accepts an instance of
         * ApacheConnectionClosingStrategy. The value MUST be an instance of
         * ApacheConnectionClosingStrategy.
         *
         * <p>If the property is absent then default option of
         * ApacheConnectionClosingStrategy.ImmediateClosingStrategy will be used
         *
         * <p>Note: When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams
         * returned from response are read till the end of the stream when closing the stream. This
         * can introduce additional time when closing the stream with partial read, depending on how
         * large the remaining stream is. Use
         * ApacheConnectionClosingStrategy.ImmediateClosingStrategy for large files with partial
         * reads instead for faster close. ApacheConnectionClosingStrategy.ImmediateClosingStrategy
         * on the other hand takes longer when using partial read for smaller stream size (< 1MB).
         * Please consider your use-case and change accordingly. Please use
         * ApacheConnectorPropertiesExample for reference
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder connectionClosingStrategy(
                final ApacheConnectionClosingStrategy connectionClosingStrategy) {
            this.connectionClosingStrategy$value = connectionClosingStrategy;
            connectionClosingStrategy$set = true;
            return this;
        }

        /**
         * SSLContext to be used for the Apache Connection. Accepts an instance of SSLContext. The
         * value MUST be an instance of SSLContext.
         *
         * <p>If the property is absent then default value of null will be used
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder sslContext(
                final SSLContext sslContext) {
            this.sslContext$value = sslContext;
            sslContext$set = true;
            return this;
        }

        /**
         * HostnameVerifier to be used for the Apache Connection. Accepts an instance of
         * HostnameVerifier. The value MUST be an instance of HostnameVerifier.
         *
         * <p>If the property is absent then default value of null will be used
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder hostnameVerifier(
                final HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier$value = hostnameVerifier;
            hostnameVerifier$set = true;
            return this;
        }

        /**
         * Request RetryHandler to be used for the Apache Connection. Accepts an instance of
         * HttpRequestRetryHandler
         *
         * @return {@code this}.
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder requestRetryHandler(
                final HttpRequestRetryHandler requestRetryHandler) {
            this.requestRetryHandler$value = requestRetryHandler;
            requestRetryHandler$set = true;
            return this;
        }

        /**
         * Idle monitor thread polls the connection manager to monitor for expired and idle
         * connections and closes any such connections
         *
         * <p>If the property is absent then default value of false will be used
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder
                idleConnectionMonitorThreadEnabled(
                        final boolean idleConnectionMonitorThreadEnabled) {
            this.idleConnectionMonitorThreadEnabled$value = idleConnectionMonitorThreadEnabled;
            idleConnectionMonitorThreadEnabled$set = true;
            return this;
        }

        /**
         * The time interval after which the check and closing of expired/idle connections is
         * performed by the idleMonitorThread. This is applicable only if idleConnectionMonitorThead
         * is enabled/true
         *
         * <p>If the property is absent then default value of 5 seconds will be used
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder
                idleConnectionMonitorThreadWaitTimeInSeconds(
                        final int idleConnectionMonitorThreadWaitTimeInSeconds) {
            this.idleConnectionMonitorThreadWaitTimeInSeconds$value =
                    idleConnectionMonitorThreadWaitTimeInSeconds;
            idleConnectionMonitorThreadWaitTimeInSeconds$set = true;
            return this;
        }

        /**
         * The idle timeout - close connections that have been idle longer than
         * idleConnectionMonitorThreadIdleTimeoutInSeconds seconds by idleMonitorThread. This is
         * applicable only if idleConnectionMonitorThead is enabled/true
         *
         * <p>If the property is absent then default value of 20 seconds will be used
         */
        public ApacheConnectorProperties.ApacheConnectorPropertiesBuilder
                idleConnectionMonitorThreadIdleTimeoutInSeconds(
                        final int idleConnectionMonitorThreadIdleTimeoutInSeconds) {
            this.idleConnectionMonitorThreadIdleTimeoutInSeconds$value =
                    idleConnectionMonitorThreadIdleTimeoutInSeconds;
            idleConnectionMonitorThreadIdleTimeoutInSeconds$set = true;
            return this;
        }

        public ApacheConnectorProperties build() {
            ConnectionKeepAliveStrategy keepAliveStrategy$value = this.keepAliveStrategy$value;
            if (!this.keepAliveStrategy$set)
                keepAliveStrategy$value = ApacheConnectorProperties.$default$keepAliveStrategy();
            boolean connectionManagerShared$value = this.connectionManagerShared$value;
            if (!this.connectionManagerShared$set)
                connectionManagerShared$value =
                        ApacheConnectorProperties.$default$connectionManagerShared();
            HttpClientConnectionManager connectionManager$value = this.connectionManager$value;
            if (!this.connectionManager$set)
                connectionManager$value = ApacheConnectorProperties.$default$connectionManager();
            ConnectionReuseStrategy connectionReuseStrategy$value =
                    this.connectionReuseStrategy$value;
            if (!this.connectionReuseStrategy$set)
                connectionReuseStrategy$value =
                        ApacheConnectorProperties.$default$connectionReuseStrategy();
            boolean connectionPooling$value = this.connectionPooling$value;
            if (!this.connectionPooling$set)
                connectionPooling$value = ApacheConnectorProperties.$default$connectionPooling();
            ApacheConnectionPoolConfig connectionPoolConfig$value = this.connectionPoolConfig$value;
            if (!this.connectionPoolConfig$set)
                connectionPoolConfig$value =
                        ApacheConnectorProperties.$default$connectionPoolConfig();
            boolean expectContinue$value = this.expectContinue$value;
            if (!this.expectContinue$set)
                expectContinue$value = ApacheConnectorProperties.$default$expectContinue();
            ApacheConnectionClosingStrategy connectionClosingStrategy$value =
                    this.connectionClosingStrategy$value;
            if (!this.connectionClosingStrategy$set)
                connectionClosingStrategy$value =
                        ApacheConnectorProperties.$default$connectionClosingStrategy();
            SSLContext sslContext$value = this.sslContext$value;
            if (!this.sslContext$set)
                sslContext$value = ApacheConnectorProperties.$default$sslContext();
            HostnameVerifier hostnameVerifier$value = this.hostnameVerifier$value;
            if (!this.hostnameVerifier$set)
                hostnameVerifier$value = ApacheConnectorProperties.$default$hostnameVerifier();
            HttpRequestRetryHandler requestRetryHandler$value = this.requestRetryHandler$value;
            if (!this.requestRetryHandler$set)
                requestRetryHandler$value =
                        ApacheConnectorProperties.$default$requestRetryHandler();
            boolean idleConnectionMonitorThreadEnabled$value =
                    this.idleConnectionMonitorThreadEnabled$value;
            if (!this.idleConnectionMonitorThreadEnabled$set)
                idleConnectionMonitorThreadEnabled$value =
                        ApacheConnectorProperties.$default$idleConnectionMonitorThreadEnabled();
            int idleConnectionMonitorThreadWaitTimeInSeconds$value =
                    this.idleConnectionMonitorThreadWaitTimeInSeconds$value;
            if (!this.idleConnectionMonitorThreadWaitTimeInSeconds$set)
                idleConnectionMonitorThreadWaitTimeInSeconds$value =
                        ApacheConnectorProperties
                                .$default$idleConnectionMonitorThreadWaitTimeInSeconds();
            int idleConnectionMonitorThreadIdleTimeoutInSeconds$value =
                    this.idleConnectionMonitorThreadIdleTimeoutInSeconds$value;
            if (!this.idleConnectionMonitorThreadIdleTimeoutInSeconds$set)
                idleConnectionMonitorThreadIdleTimeoutInSeconds$value =
                        ApacheConnectorProperties
                                .$default$idleConnectionMonitorThreadIdleTimeoutInSeconds();
            return new ApacheConnectorProperties(
                    keepAliveStrategy$value,
                    connectionManagerShared$value,
                    connectionManager$value,
                    connectionReuseStrategy$value,
                    connectionPooling$value,
                    connectionPoolConfig$value,
                    expectContinue$value,
                    connectionClosingStrategy$value,
                    sslContext$value,
                    hostnameVerifier$value,
                    requestRetryHandler$value,
                    idleConnectionMonitorThreadEnabled$value,
                    idleConnectionMonitorThreadWaitTimeInSeconds$value,
                    idleConnectionMonitorThreadIdleTimeoutInSeconds$value);
        }

        @java.lang.Override
        public String toString() {
            return "ApacheConnectorProperties.ApacheConnectorPropertiesBuilder(keepAliveStrategy$value="
                    + this.keepAliveStrategy$value
                    + ", connectionManagerShared$value="
                    + this.connectionManagerShared$value
                    + ", connectionManager$value="
                    + this.connectionManager$value
                    + ", connectionReuseStrategy$value="
                    + this.connectionReuseStrategy$value
                    + ", connectionPooling$value="
                    + this.connectionPooling$value
                    + ", connectionPoolConfig$value="
                    + this.connectionPoolConfig$value
                    + ", expectContinue$value="
                    + this.expectContinue$value
                    + ", connectionClosingStrategy$value="
                    + this.connectionClosingStrategy$value
                    + ", sslContext$value="
                    + this.sslContext$value
                    + ", hostnameVerifier$value="
                    + this.hostnameVerifier$value
                    + ", requestRetryHandler$value="
                    + this.requestRetryHandler$value
                    + ", idleConnectionMonitorThreadEnabled$value="
                    + this.idleConnectionMonitorThreadEnabled$value
                    + ", idleConnectionMonitorThreadWaitTimeInSeconds$value"
                    + this.idleConnectionMonitorThreadWaitTimeInSeconds$value
                    + ", idleConnectionMonitorThreadIdleTimeoutInSeconds$value"
                    + this.idleConnectionMonitorThreadIdleTimeoutInSeconds$value
                    + ")";
        }
    }

    public static ApacheConnectorProperties.ApacheConnectorPropertiesBuilder builder() {
        return new ApacheConnectorProperties.ApacheConnectorPropertiesBuilder();
    }

    @java.lang.Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApacheConnectorProperties)) return false;
        final ApacheConnectorProperties other = (ApacheConnectorProperties) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isConnectionManagerShared() != other.isConnectionManagerShared()) return false;
        if (this.isConnectionPooling() != other.isConnectionPooling()) return false;
        if (this.isExpectContinue() != other.isExpectContinue()) return false;
        final Object this$keepAliveStrategy = this.getKeepAliveStrategy();
        final Object other$keepAliveStrategy = other.getKeepAliveStrategy();
        if (this$keepAliveStrategy == null
                ? other$keepAliveStrategy != null
                : !this$keepAliveStrategy.equals(other$keepAliveStrategy)) return false;
        final Object this$connectionManager = this.getConnectionManager();
        final Object other$connectionManager = other.getConnectionManager();
        if (this$connectionManager == null
                ? other$connectionManager != null
                : !this$connectionManager.equals(other$connectionManager)) return false;
        final Object this$connectionReuseStrategy = this.getConnectionReuseStrategy();
        final Object other$connectionReuseStrategy = other.getConnectionReuseStrategy();
        if (this$connectionReuseStrategy == null
                ? other$connectionReuseStrategy != null
                : !this$connectionReuseStrategy.equals(other$connectionReuseStrategy)) return false;
        final Object this$connectionPoolConfig = this.getConnectionPoolConfig();
        final Object other$connectionPoolConfig = other.getConnectionPoolConfig();
        if (this$connectionPoolConfig == null
                ? other$connectionPoolConfig != null
                : !this$connectionPoolConfig.equals(other$connectionPoolConfig)) return false;
        final Object this$connectionClosingStrategy = this.getConnectionClosingStrategy();
        final Object other$connectionClosingStrategy = other.getConnectionClosingStrategy();
        if (this$connectionClosingStrategy == null
                ? other$connectionClosingStrategy != null
                : !this$connectionClosingStrategy.equals(other$connectionClosingStrategy))
            return false;
        final Object this$sslContext = this.getSslContext();
        final Object other$sslContext = other.getSslContext();
        if (this$sslContext == null
                ? other$sslContext != null
                : !this$sslContext.equals(other$sslContext)) return false;
        final Object this$hostnameVerifier = this.getHostnameVerifier();
        final Object other$hostnameVerifier = other.getHostnameVerifier();
        if (this$hostnameVerifier == null
                ? other$hostnameVerifier != null
                : !this$hostnameVerifier.equals(other$hostnameVerifier)) return false;
        final Object this$requestRetryHandler = this.getRequestRetryHandler();
        final Object other$requestRetryHandler = other.getRequestRetryHandler();
        if (this$requestRetryHandler == null
                ? other$requestRetryHandler != null
                : !this$requestRetryHandler.equals(other$requestRetryHandler)) return false;
        if (this.isIdleConnectionMonitorThreadEnabled()
                != other.isIdleConnectionMonitorThreadEnabled()) return false;
        final int this$idleConnectionMonitorThreadWaitTimeInSeconds =
                this.getIdleConnectionMonitorThreadWaitTimeInSeconds();
        final int other$idleConnectionMonitorThreadWaitTimeInSeconds =
                other.getIdleConnectionMonitorThreadWaitTimeInSeconds();
        if (this$idleConnectionMonitorThreadWaitTimeInSeconds
                != other$idleConnectionMonitorThreadWaitTimeInSeconds) return false;
        final int this$idleConnectionMonitorThreadIdleTimeoutInSeconds =
                this.getIdleConnectionMonitorThreadIdleTimeoutInSeconds();
        final int other$idleConnectionMonitorThreadIdleTimeoutInSeconds =
                other.getIdleConnectionMonitorThreadIdleTimeoutInSeconds();
        if (this$idleConnectionMonitorThreadIdleTimeoutInSeconds
                != other$idleConnectionMonitorThreadIdleTimeoutInSeconds) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApacheConnectorProperties;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isConnectionManagerShared() ? 79 : 97);
        result = result * PRIME + (this.isConnectionPooling() ? 79 : 97);
        result = result * PRIME + (this.isExpectContinue() ? 79 : 97);
        final Object $keepAliveStrategy = this.getKeepAliveStrategy();
        result = result * PRIME + ($keepAliveStrategy == null ? 43 : $keepAliveStrategy.hashCode());
        final Object $connectionManager = this.getConnectionManager();
        result = result * PRIME + ($connectionManager == null ? 43 : $connectionManager.hashCode());
        final Object $connectionReuseStrategy = this.getConnectionReuseStrategy();
        result =
                result * PRIME
                        + ($connectionReuseStrategy == null
                                ? 43
                                : $connectionReuseStrategy.hashCode());
        final Object $connectionPoolConfig = this.getConnectionPoolConfig();
        result =
                result * PRIME
                        + ($connectionPoolConfig == null ? 43 : $connectionPoolConfig.hashCode());
        final Object $connectionClosingStrategy = this.getConnectionClosingStrategy();
        result =
                result * PRIME
                        + ($connectionClosingStrategy == null
                                ? 43
                                : $connectionClosingStrategy.hashCode());
        final Object $sslContext = this.getSslContext();
        result = result * PRIME + ($sslContext == null ? 43 : $sslContext.hashCode());
        final Object $hostnameVerifier = this.getHostnameVerifier();
        result = result * PRIME + ($hostnameVerifier == null ? 43 : $hostnameVerifier.hashCode());
        final Object $requestRetryHandler = this.getRequestRetryHandler();
        result =
                result * PRIME
                        + ($requestRetryHandler == null ? 43 : $requestRetryHandler.hashCode());
        result = result * PRIME + (this.isIdleConnectionMonitorThreadEnabled() ? 79 : 97);
        final int $idleConnectionMonitorThreadWaitTimeInSeconds =
                this.getIdleConnectionMonitorThreadWaitTimeInSeconds();
        result = result * PRIME + Integer.hashCode($idleConnectionMonitorThreadWaitTimeInSeconds);
        final int $idleConnectionMonitorThreadIdleTimeoutInSeconds =
                this.getIdleConnectionMonitorThreadIdleTimeoutInSeconds();
        result =
                result * PRIME + Integer.hashCode($idleConnectionMonitorThreadIdleTimeoutInSeconds);
        return result;
    }

    @java.lang.Override
    public String toString() {
        return "ApacheConnectorProperties(keepAliveStrategy="
                + this.getKeepAliveStrategy()
                + ", connectionManagerShared="
                + this.isConnectionManagerShared()
                + ", connectionManager="
                + this.getConnectionManager()
                + ", connectionReuseStrategy="
                + this.getConnectionReuseStrategy()
                + ", connectionPooling="
                + this.isConnectionPooling()
                + ", connectionPoolConfig="
                + this.getConnectionPoolConfig()
                + ", expectContinue="
                + this.isExpectContinue()
                + ", connectionClosingStrategy="
                + this.getConnectionClosingStrategy()
                + ", sslContext="
                + this.getSslContext()
                + ", hostnameVerifier="
                + this.getHostnameVerifier()
                + ", requestRetryHandler="
                + this.getRequestRetryHandler()
                + ", idleConnectionMonitorThreadEnabled="
                + this.isIdleConnectionMonitorThreadEnabled()
                + ", idleConnectionMonitorThreadWaitTimeInSeconds="
                + this.getIdleConnectionMonitorThreadWaitTimeInSeconds()
                + ", idleConnectionMonitorThreadIdleTimeoutInSeconds="
                + this.getIdleConnectionMonitorThreadIdleTimeoutInSeconds()
                + ")";
    }

    /**
     * ConnectionKeepAliveStrategy for the Apache HttpClient. The value MUST be an instance of
     * ConnectionKeepAliveStrategy.
     *
     * <p>If the property is absent the default keepalive strategy of the Apache HTTP library will
     * be used
     */
    public ConnectionKeepAliveStrategy getKeepAliveStrategy() {
        return this.keepAliveStrategy;
    }

    /**
     * A value of true indicates that configured connection manager should be shared among multiple
     * Jersey ClientRuntime instances. It means that closing a particular ClientRuntime instance
     * does not shut down the underlying connection manager automatically. In such case, the
     * connection manager life-cycle should be fully managed by the application code. To release all
     * allocated resources, caller code should especially ensure
     * HttpClientConnectionManager.shutdown() gets invoked eventually. This property may only be set
     * prior to constructing Apache connector using ApacheConnectorProvider.
     *
     * <p>The value MUST be boolean
     */
    public boolean isConnectionManagerShared() {
        return this.connectionManagerShared;
    }

    /**
     * Connection Manager which will be used to create the Apache HttpClient. This takes precedence
     * over the default pooling configuration The value MUST be an instance of
     * HttpClientConnectionManager.
     *
     * <p>If the property is absent a default Connection Manager will be used
     * (PoolingHttpClientConnectionManager)
     */
    public HttpClientConnectionManager getConnectionManager() {
        return this.connectionManager;
    }

    /**
     * ConnectionReuseStrategy for the Apache HttpClient. The value MUST be an instance of
     * org.apache.http.impl.ConnectionReuseStrategy.
     *
     * <p>If the property is absent the default reuse strategy of the Apache HTTP library will be
     * used
     */
    public ConnectionReuseStrategy getConnectionReuseStrategy() {
        return this.connectionReuseStrategy;
    }

    /**
     * A value that indicates whether connection pooling will be enabled. The value MUST be boolean
     *
     * <p>If the property is absent then default option of pooling will be used If the property is
     * false, then the thread-safe BasicHttpClientConnectionManager is used for the Apache
     * HttpClient A connection manager for a single connection. This connection manager maintains
     * only one active connection. Even though this class is fully thread-safe it ought to be used
     * by one execution thread only, as only one thread a time can lease the connection at a time.
     * This connection manager implementation should be used inside an EJB container
     */
    public boolean isConnectionPooling() {
        return this.connectionPooling;
    }

    /**
     * ApacheConnectionPoolConfig for the connection pooling The value MUST be an instance of
     * ApacheConnectionPoolConfig
     *
     * <p>If the property is absent then default option of pool config will be used
     */
    public ApacheConnectionPoolConfig getConnectionPoolConfig() {
        return this.connectionPoolConfig;
    }

    /**
     * A value that indicates whether to support expect 100 continue behavior for the Apache
     * HttpClient.
     *
     * <p>If this value is true, and the Apache HttpClient is used, and operation supports expect
     * 100 continue, then this request header will be emitted.
     *
     * <p>The value MUST be boolean.
     *
     * <p>If the property is absent then default option of true will be used.
     */
    public boolean isExpectContinue() {
        return this.expectContinue;
    }

    /**
     * Strategy that closes the Apache Connection. Accepts an instance of
     * ApacheConnectionClosingStrategy. The value MUST be an instance of
     * ApacheConnectionClosingStrategy.
     *
     * <p>If the property is absent then default option of
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy will be used
     *
     * <p>Note: When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams returned
     * from response are read till the end of the stream when closing the stream. This can introduce
     * additional time when closing the stream with partial read, depending on how large the
     * remaining stream is. Use ApacheConnectionClosingStrategy.ImmediateClosingStrategy for large
     * files with partial reads instead for faster close.
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy on the other hand takes longer when
     * using partial read for smaller stream size (< 1MB). Please consider your use-case and change
     * accordingly. Please use ApacheConnectorPropertiesExample for reference
     */
    public ApacheConnectionClosingStrategy getConnectionClosingStrategy() {
        return this.connectionClosingStrategy;
    }

    /**
     * SSLContext to be used for the Apache Connection. Accepts an instance of SSLContext. The value
     * MUST be an instance of SSLContext.
     *
     * <p>If the property is absent then default value of null will be used
     */
    public SSLContext getSslContext() {
        return this.sslContext;
    }

    /**
     * HostnameVerifier to be used for the Apache Connection. Accepts an instance of
     * HostnameVerifier. The value MUST be an instance of HostnameVerifier.
     *
     * <p>If the property is absent then default value of null will be used
     */
    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    /**
     * Request RetryHandler to be used for the Apache Connection. Accepts an instance of
     * HttpRequestRetryHandler
     */
    public HttpRequestRetryHandler getRequestRetryHandler() {
        return this.requestRetryHandler;
    }

    /**
     * Idle monitor thread polls the connection manager to monitor for expired and idle connections
     * and closes any such connections
     *
     * <p>If the property is absent then default value of false will be used
     */
    public boolean isIdleConnectionMonitorThreadEnabled() {
        return this.idleConnectionMonitorThreadEnabled;
    }

    /**
     * The time interval after which the check and closing of expired/idle connections is performed
     * by the idleMonitorThread. This is applicable only if idleConnectionMonitorThead is
     * enabled/true
     *
     * <p>If the property is absent then default value of 5 seconds will be used
     */
    public int getIdleConnectionMonitorThreadWaitTimeInSeconds() {
        return this.idleConnectionMonitorThreadWaitTimeInSeconds;
    }

    /**
     * The idle timeout - close connections that have been idle longer than
     * idleConnectionMonitorThreadIdleTimeoutInSeconds seconds by idleMonitorThread. This is
     * applicable only if idleConnectionMonitorThead is enabled/true
     *
     * <p>If the property is absent then default value of 20 seconds will be used
     */
    public int getIdleConnectionMonitorThreadIdleTimeoutInSeconds() {
        return this.idleConnectionMonitorThreadIdleTimeoutInSeconds;
    }
}
