/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

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

    public static final Jersey3ClientProperty<ConnectionReuseStrategy> REUSE_STRATEGY =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.REUSE_STRATEGY);
    public static final Jersey3ClientProperty<HttpRequestRetryHandler> RETRY_HANDLER =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.RETRY_HANDLER);
    /**
     * Note that if you specify your own {@link javax.net.ssl.SSLContext} using {@link
     * com.oracle.bmc.http.client.StandardClientProperties#SSL_CONTEXT}, you will most likely have
     * to provide the {@link javax.net.ssl.SSLContext} to the connection manager as well.
     *
     * @see {@link
     *     Jersey3HttpClientBuilder#buildDefaultPoolingHttpClientConnectionManagerForApacheConnector(javax.net.ssl.SSLContext)}
     */
    public static final Jersey3ClientProperty<HttpClientConnectionManager> CONNECTION_MANAGER =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .CONNECTION_MANAGER);

    public static final Jersey3ClientProperty<ApacheConnectionClosingStrategy>
            CONNECTION_CLOSING_STRATEGY =
                    Jersey3ClientProperty.create(
                            org.glassfish.jersey.apache.connector.ApacheClientProperties
                                    .CONNECTION_CLOSING_STRATEGY);
    public static final Jersey3ClientProperty<ConnectionKeepAliveStrategy> KEEPALIVE_STRATEGY =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .KEEPALIVE_STRATEGY);
    public static final Jersey3ClientProperty<RequestConfig> REQUEST_CONFIG =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties.REQUEST_CONFIG);
    public static final Jersey3ClientProperty<Boolean> CONNECTION_MANAGER_SHARED =
            Jersey3ClientProperty.create(
                    org.glassfish.jersey.apache.connector.ApacheClientProperties
                            .CONNECTION_MANAGER_SHARED);
}
