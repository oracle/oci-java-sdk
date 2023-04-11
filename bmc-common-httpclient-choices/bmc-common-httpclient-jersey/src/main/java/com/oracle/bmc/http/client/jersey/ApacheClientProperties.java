/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

/**
 * Commonly used Apache client properties from {@link
 * org.glassfish.jersey.apache.connector.ApacheClientProperties}, but with the correct type
 * information.
 */
public enum ApacheClientProperties {
    ;

    public static final JerseyClientProperty<ConnectionReuseStrategy> REUSE_STRATEGY =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.REUSE_STRATEGY);
    public static final JerseyClientProperty<HttpRequestRetryHandler> RETRY_HANDLER =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.RETRY_HANDLER);

    /**
     * Note that if you specify your own {@link javax.net.ssl.SSLContext} using {@link
     * com.oracle.bmc.http.client.StandardClientProperties#SSL_CONTEXT}, you will most likely have
     * to provide the {@link javax.net.ssl.SSLContext} to the connection manager as well.
     *
     * @see {@link
     *     JerseyHttpClientBuilder#buildDefaultPoolingHttpClientConnectionManagerForApacheConnector(javax.net.ssl.SSLContext)}
     */
    public static final JerseyClientProperty<HttpClientConnectionManager> CONNECTION_MANAGER =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .CONNECTION_MANAGER);

    public static final JerseyClientProperty<ApacheConnectionClosingStrategy>
            CONNECTION_CLOSING_STRATEGY =
                    JerseyClientProperty.create(
                            org.glassfish.jersey.apache.connector.ApacheClientProperties
                                    .CONNECTION_CLOSING_STRATEGY);
    public static final JerseyClientProperty<ConnectionKeepAliveStrategy> KEEPALIVE_STRATEGY =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .KEEPALIVE_STRATEGY);
    public static final JerseyClientProperty<RequestConfig> REQUEST_CONFIG =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.REQUEST_CONFIG);
    public static final JerseyClientProperty<Boolean> CONNECTION_MANAGER_SHARED =
            JerseyClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .CONNECTION_MANAGER_SHARED);
}
