/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

/** Options that can be set to control the behavior of the OCI Java SDK. */
public enum Options {
// no-value enum to prevent instantiation: static methods and fields only
;

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Options.class);

    private static volatile boolean SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM = true;

    private static final String OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED_ENV_VAR =
            "OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED";

    /** The system property key for token refresh enablement. */
    private static final String JAVASDK_TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY =
            "oci.javasdk.token.refresh.enabled";

    /** The system property key for sync-request async core thread timeout enablement. */
    private static final String
            JAVASDK_SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY =
                    "oci.javasdk.sync.requests.async.core.thread.timeout.enabled";

    /** The system property key for async-request async core thread timeout enablement. */
    private static final String
            JAVASDK_ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY =
                    "oci.javasdk.async.requests.async.core.thread.timeout.enabled";

    /**
     * Flag indicating whether token refresh retries are enabled. By default, the token refresh
     * retries are enabled for 401s and processing exceptions. You have the flexibility to disable
     * these retries if needed. This can be achieved by setting the system property.
     *
     * <pre>
     * System.setProperty("oci.javasdk.token.refresh.enabled", "false");
     * </pre>
     */
    private static volatile boolean TOKEN_REFRESH_RETRY_ENABLED;

    /**
     * Flag indicating whether idle core threads in the SDK-managed async HTTP executor may time out
     * for sync request execution. Default is false.
     */
    private static volatile boolean SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED;

    /**
     * Flag indicating whether idle core threads in the SDK-managed async HTTP executor may time out
     * for async request execution. Default is false.
     */
    private static volatile boolean ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED;

    static {
        /**
         * Initializes token refresher and async core thread timeout options. Token refresh can be
         * managed by system property {@value #JAVASDK_TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY}. The
         * default is true. Sync and async request async core thread timeout options can be managed
         * by system properties {@value
         * #JAVASDK_SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY} and {@value
         * #JAVASDK_ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY}. The default
         * is false.
         */
        initializeTokenRefreshRetryEnabled();
        initializeAsyncCoreThreadTimeoutOptions();
    }

    /**
     * Sets the boolean value to indicate if the SDK should auto-close the InputStream stream
     * returned from the response once the stream has been read until the content-length of the
     * stream Note : This has been added to automatically release connections from the connection
     * pool when using the Apache Connector since the Apache Connector uses connection pooling by
     * default
     */
    public static void shouldAutoCloseResponseInputStream(final boolean shouldAutoClose) {
        LOG.info("Setting auto-close of response input stream to {}", shouldAutoClose);
        SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM = shouldAutoClose;
    }

    /**
     * Returns the boolean indicating if the SDK should auto-close the InputStream returned from the
     * response once the stream has been read until the content-length of the stream.
     *
     * @return true if the stream should be auto-closed
     */
    public static boolean getShouldAutoCloseResponseInputStream() {
        return SHOULD_AUTO_CLOSE_RESPONSE_INPUTSTREAM;
    }

    /**
     * Whether the use of realm-specific endpoints was enabled programmatically, using Java code.
     */
    private static volatile Boolean
            USE_OF_REALM_SPECIFIC_ENDPOINT_TEMPLATE_ENABLED_PROGRAMMATICALLY = null;

    /**
     * Returns the boolean indicating if the SDK should use realm-specific endpoint templates or
     * not.
     *
     * <p>Enabling or disabling programmatically takes precedence over the environment variable.
     *
     * @return true if the client should use realm-specific endpoint template
     */
    public static boolean getUseOfRealmSpecificEndpointTemplateByDefault() {
        if (USE_OF_REALM_SPECIFIC_ENDPOINT_TEMPLATE_ENABLED_PROGRAMMATICALLY != null) {
            return USE_OF_REALM_SPECIFIC_ENDPOINT_TEMPLATE_ENABLED_PROGRAMMATICALLY;
        }
        final String useOfRealmSpecificEndpointTemplateEnabledEnvVar =
                System.getenv(OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED_ENV_VAR);
        return useOfRealmSpecificEndpointTemplateEnabledEnvVar != null
                && useOfRealmSpecificEndpointTemplateEnabledEnvVar.equalsIgnoreCase("true");
    }

    /**
     * Get the programmatic flag for whether realm-specific endpoints are enabled. <code>null</code>
     * means use the environment variable instead.
     *
     * @return status of the programmatic flag for whether realm-specific endpoints are enabled
     */
    public static Boolean getUseOfRealmSpecificEndpointTemplateEnabledProgrammatically() {
        return USE_OF_REALM_SPECIFIC_ENDPOINT_TEMPLATE_ENABLED_PROGRAMMATICALLY;
    }

    /**
     * Set the programmatic flag for whether realm-specific endpoints are enabled. <code>null</code>
     * means use environment variable instead.
     *
     * @param useOfRealmSpecificEndpointTemplateEnabledProgrammatically programmatic flag
     */
    public static void setUseOfRealmSpecificEndpointTemplateEnabledProgrammatically(
            Boolean useOfRealmSpecificEndpointTemplateEnabledProgrammatically) {
        USE_OF_REALM_SPECIFIC_ENDPOINT_TEMPLATE_ENABLED_PROGRAMMATICALLY =
                useOfRealmSpecificEndpointTemplateEnabledProgrammatically;
    }

    /** Initializes the token refresh retry enablement based on system property. */
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

    /** Initializes async core thread timeout enablement based on system properties. */
    private static void initializeAsyncCoreThreadTimeoutOptions() {
        SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED =
                Boolean.parseBoolean(
                        System.getProperty(
                                JAVASDK_SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY,
                                "false"));
        ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED =
                Boolean.parseBoolean(
                        System.getProperty(
                                JAVASDK_ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY,
                                "false"));
        LOG.debug(
                "Setting sync requests async core thread timeout to {} ({} set to {})",
                SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED,
                JAVASDK_SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY,
                System.getProperty(
                        JAVASDK_SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY));
        LOG.debug(
                "Setting async requests async core thread timeout to {} ({} set to {})",
                ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED,
                JAVASDK_ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY,
                System.getProperty(
                        JAVASDK_ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED_SYSTEM_PROPERTY));
    }

    /**
     * Returns whether idle core threads in the SDK-managed async HTTP executor may time out for
     * sync request execution.
     *
     * @return true if idle core async executor threads may time out for sync request execution
     */
    public static boolean isSyncRequestsAsyncCoreThreadTimeoutEnabled() {
        return SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED;
    }

    /**
     * Returns whether idle core threads in the SDK-managed async HTTP executor may time out for
     * async request execution.
     *
     * @return true if idle core async executor threads may time out for async request execution
     */
    public static boolean isAsyncRequestsAsyncCoreThreadTimeoutEnabled() {
        return ASYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED;
    }
}
