/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;

import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.serialization.jackson.JacksonSerializer;
import jakarta.ws.rs.client.Client;

public class Jersey3HttpProvider implements HttpProvider {
    private static final String SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS =
            "sun.net.http.allowRestrictedHeaders";

    private static final Jersey3HttpProvider INSTANCE = new Jersey3HttpProvider();

    static final boolean isApacheDependencyPresent =
            (checkForApacheDependencies() && !jerseyDefaultConnectorEnabled());

    static {
        // make loading this class fail if jax-rs is not on classpath
        Client.class.getName();

        if (!isApacheDependencyPresent) {
            setAllowRestrictedHeadersProperty(
                    System.getProperty(SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS));
        }
    }

    public Jersey3HttpProvider() {}

    public static Jersey3HttpProvider getInstance() {
        return INSTANCE;
    }

    @Override
    public HttpClientBuilder newBuilder() {
        return new Jersey3HttpClientBuilder();
    }

    @Override
    public Serializer getSerializer() {
        return JacksonSerializer.getDefaultSerializer();
    }

    private static boolean checkForApacheDependencies() {
        try {
            Class.forName("org.apache.http.client.config.RequestConfig");
            Class.forName("org.glassfish.jersey.apache.connector.ApacheConnector");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static boolean jerseyDefaultConnectorEnabled() {
        final String jerseyDefaultConnectorEnabledString =
                System.getenv("OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED");
        if (jerseyDefaultConnectorEnabledString != null
                && !jerseyDefaultConnectorEnabledString.isEmpty()) {
            String trimmedValue = jerseyDefaultConnectorEnabledString.trim();
            if ("true".equalsIgnoreCase(trimmedValue)) {
                return true;
            }
        }
        return false;
    }

    private static void setAllowRestrictedHeadersProperty(String previousValue) {
        // necessary for the default HttpUrlConnector implementation;
        // check if this property was explicitly set to false; if so, fail
        if (previousValue != null && !Boolean.valueOf(previousValue)) {
            throw new IllegalStateException(
                    "Property "
                            + SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS
                            + " was explicitly "
                            + "set to "
                            + previousValue
                            + "; the OCI SDK needs to set this property to true. Failing...");
        }
        System.setProperty(SUN_NET_HTTP_ALLOW_RESTRICTED_HEADERS, "true");
    }
}
