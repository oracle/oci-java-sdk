/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.util.internal.StringUtils;

/**
 * Options that can be set to control the behavior of the OCI Java SDK.
 */
public enum Options {
// no-value enum to prevent instantiation: static methods and fields only
;

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Options.class);

    private static volatile boolean SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM = true;

    /**
     * The system property key for token refresh enablement.
     */
    private static final String JAVASDK_TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY =
            "oci.javasdk.token.refresh.enabled";

    /**
     * Flag indicating whether token refresh retries are enabled.
     * By default, the token refresh retries are enabled for 401s and processing exceptions.
     * You have the flexibility to disable these retries if needed. This can be achieved by setting the system property.
     * <pre>
     * System.setProperty("oci.javasdk.token.refresh.enabled", "false");
     * </pre>
     */
    private static volatile boolean TOKEN_REFRESH_RETRY_ENABLED;

    static {
        /**
         * Initializes token refresher.
         * Token refresh can be managed by system property {@value #JAVASDK_TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY}.
         * The default is true.
         */
        initializeTokenRefreshRetryEnabled();
    }

    /**
     * Sets the boolean value to indicate if the SDK should auto-close the InputStream stream returned from the
     * response once the stream has been read until the content-length of the stream
     * Note : This has been added to automatically release connections from the connection pool when using
     * the Apache Connector since the Apache Connector uses connection pooling by default
     */
    public static void shouldAutoCloseResponseInputStream(final boolean shouldAutoClose) {
        LOG.info("Setting auto-close of response input stream to {}", shouldAutoClose);
        SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM = shouldAutoClose;
    }

    /**
     * Returns the boolean indicating if the SDK should auto-close the InputStream returned from the response once
     * the stream has been read until the content-length of the stream.
     * @return true if the stream should be auto-closed
     */
    public static boolean getShouldAutoCloseResponseInputStream() {
        return SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM;
    }

    /**
     * Initializes the token refresh retry enablement based on system property.
     */
    private static void initializeTokenRefreshRetryEnabled() {
        TOKEN_REFRESH_RETRY_ENABLED =
                Boolean.parseBoolean(
                        System.getProperty(JAVASDK_TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY, "true"));
        LOG.debug("Setting token refresh retry to {}", TOKEN_REFRESH_RETRY_ENABLED);
    }

    /**
     * Returns the current status of token refresh retry enablement.
     *
     * @return true if token refresh retries are enabled; false otherwise.
     */
    public static boolean isTokenRefreshRetrierEnabled() {
        return TOKEN_REFRESH_RETRY_ENABLED;
    }

    /**
     * The prefix for the system property key that controls whether the ConnectionPoolingApacheConfigurator is
     * enabled by default.
     *
     * The default of this property is "true". Note that not all clients set a ConnectionPoolingApacheConfigurator
     * as default configurator.
     */
    private static final String
            JAVASDK_DEFAULT_CONNECTION_POOLING_APACHE_CONFIGURATOR_ENABLED_GLOBAL =
                    "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.global";

    /**
     * The prefix for the system property key that controls whether the ConnectionPoolingApacheConfigurator is
     * enabled by default.
     * The whole system property key can be constructed by appending the fully-qualified class name, e.g.
     * "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.com.oracle.bmc.vault.VaultsClient".
     *
     * The default of this property is "true". Note that not all clients set a ConnectionPoolingApacheConfigurator
     * as default configurator.
     */
    private static final String
            JAVASDK_DEFAULT_CONNECTION_POOLING_APACHE_CONFIGURATOR_ENABLED_PREFIX =
                    "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.";

    /**
     * Returns true if the ConnectionPoolingApacheConfigurator should be used for the given class name,
     * provided it has been set as default configurator by the client.
     * @param className fully-qualified class name of the client
     * @return true if ConnectionPoolingApacheConfigurator should be used, provided it has been set by the client
     */
    public static boolean isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(
            String className) {
        String key = JAVASDK_DEFAULT_CONNECTION_POOLING_APACHE_CONFIGURATOR_ENABLED_GLOBAL;
        boolean globalValue = Boolean.parseBoolean(System.getProperty(key, "true"));
        if (!globalValue) {
            LOG.info(
                    "ConnectionPoolingApacheConfigurator as default for all clients has been disabled by system property {}",
                    key);
        }

        key = JAVASDK_DEFAULT_CONNECTION_POOLING_APACHE_CONFIGURATOR_ENABLED_PREFIX + className;
        boolean classValue = Boolean.parseBoolean(System.getProperty(key, "true"));
        if (!classValue) {
            LOG.info(
                    "ConnectionPoolingApacheConfigurator as default for client {} has been disabled by system property {}",
                    className,
                    key);
        }
        return globalValue && classValue;
    }
}
