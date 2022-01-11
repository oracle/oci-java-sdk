/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

@Slf4j
@Data
@Builder
public class ApacheConnectorProperties {
    private static ConnectionKeepAliveStrategy DEFAULT_KEEP_ALIVE_STRATEGY = null;
    private static boolean DEFAULT_CONNECTION_MANAGER_SHARED = false;
    private static HttpClientConnectionManager DEFAULT_CONNECTION_MANAGER = null;
    private static ConnectionReuseStrategy DEFAULT_CONNECTION_REUSE_STRATEGY = null;
    private static SSLContext DEFAULT_SSL_CONTEXT = null;
    private static HostnameVerifier DEFAULT_HOSTNAME_VERIFIER = null;

    private static ApacheConnectionClosingStrategy DEFAULT_APACHE_CONNECTION_CLOSING_STRATEGY =
            new ApacheConnectionClosingStrategy.ImmediateClosingStrategy();

    private static boolean DEFAULT_POOLING_OPTION = true;
    private static ApacheConnectionPoolConfig DEFAULT_APACHE_CONNECTION_POOL_CONFIG =
            ApacheConnectionPoolConfig.newDefault();
    private static boolean DEFAULT_EXPECT_CONTINUE = true;

    /**
     * ConnectionKeepAliveStrategy for the Apache HttpClient.
     * The value MUST be an instance of ConnectionKeepAliveStrategy.
     *
     * If the property is absent the default keepalive strategy of the Apache HTTP library will be used
     */
    @Getter @Builder.Default
    private final ConnectionKeepAliveStrategy keepAliveStrategy = DEFAULT_KEEP_ALIVE_STRATEGY;

    /**
     * A value of true indicates that configured connection manager should be shared among multiple Jersey ClientRuntime instances. It means that closing a particular ClientRuntime instance does not shut down the underlying connection manager automatically. In such case, the connection manager life-cycle should be fully managed by the application code. To release all allocated resources, caller code should especially ensure HttpClientConnectionManager.shutdown() gets invoked eventually.
     * This property may only be set prior to constructing Apache connector using ApacheConnectorProvider.
     *
     * The value MUST be boolean
     */
    @Getter @Builder.Default
    private final boolean connectionManagerShared = DEFAULT_CONNECTION_MANAGER_SHARED;

    /**
     * Connection Manager which will be used to create the Apache HttpClient.
     * This takes precedence over the default pooling configuration
     * The value MUST be an instance of HttpClientConnectionManager.
     *
     * If the property is absent a default Connection Manager will be used (PoolingHttpClientConnectionManager)
     */
    @Getter @Builder.Default
    private final HttpClientConnectionManager connectionManager = DEFAULT_CONNECTION_MANAGER;

    /**
     * ConnectionReuseStrategy for the Apache HttpClient.
     * The value MUST be an instance of org.apache.http.impl.ConnectionReuseStrategy.
     *
     * If the property is absent the default reuse strategy of the Apache HTTP library will be used
     */
    @Getter @Builder.Default
    private final ConnectionReuseStrategy connectionReuseStrategy =
            DEFAULT_CONNECTION_REUSE_STRATEGY;

    /**
     * A value that indicates whether connection pooling will be enabled.
     * The value MUST be boolean
     *
     * If the property is absent then default option of pooling will be used
     * If the property is false, then the thread-safe BasicHttpClientConnectionManager is used for the Apache HttpClient
     * A connection manager for a single connection. This connection manager maintains only one active connection. Even
     * though this class is fully thread-safe it ought to be used by one execution thread only, as only one thread a
     * time can lease the connection at a time. This connection manager implementation should be used inside an EJB
     * container
     */
    @Getter @Builder.Default private final boolean connectionPooling = DEFAULT_POOLING_OPTION;

    /**
     * ApacheConnectionPoolConfig for the connection pooling
     * The value MUST be an instance of ApacheConnectionPoolConfig
     *
     * If the property is absent then default option of pool config will be used
     */
    @Getter @Builder.Default
    private final ApacheConnectionPoolConfig connectionPoolConfig =
            DEFAULT_APACHE_CONNECTION_POOL_CONFIG;

    /**
     * A value that indicates whether to support expect 100 continue behavior for the Apache HttpClient.
     *
     * If this value is true, and the Apache HttpClient is used, and operation supports expect 100 continue, then this
     * request header will be emitted.
     *
     * The value MUST be boolean.
     *
     * If the property is absent then default option of true will be used.
     */
    @Getter @Builder.Default private final boolean expectContinue = DEFAULT_EXPECT_CONTINUE;

    /**
     * Strategy that closes the Apache Connection. Accepts an instance of ApacheConnectionClosingStrategy.
     * The value MUST be an instance of ApacheConnectionClosingStrategy.
     *
     * If the property is absent then default option of ApacheConnectionClosingStrategy.ImmediateClosingStrategy will be used
     *
     * Note: When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams returned from response are read
     * till the end of the stream when closing the stream. This can introduce additional time when closing the stream
     * with partial read, depending on how large the remaining stream is. Use
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy for large files with partial reads instead for faster
     * close.
     * ApacheConnectionClosingStrategy.ImmediateClosingStrategy on the other hand takes longer when using partial
     * read for smaller stream size (< 1MB). Please consider your use-case and change accordingly. Please use
     * ApacheConnectorPropertiesExample for reference
     */
    @Getter @Builder.Default
    private final ApacheConnectionClosingStrategy connectionClosingStrategy =
            DEFAULT_APACHE_CONNECTION_CLOSING_STRATEGY;

    /**
     * SSLContext to be used for the Apache Connection. Accepts an instance of SSLContext.
     * The value MUST be an instance of SSLContext.
     *
     * If the property is absent then default value of null will be used
     */
    @Getter @Builder.Default private final SSLContext sslContext = DEFAULT_SSL_CONTEXT;

    /**
     * HostnameVerifier to be used for the Apache Connection. Accepts an instance of HostnameVerifier.
     * The value MUST be an instance of HostnameVerifier.
     *
     * If the property is absent then default value of null will be used
     */
    @Getter @Builder.Default
    private final HostnameVerifier hostnameVerifier = DEFAULT_HOSTNAME_VERIFIER;
}
