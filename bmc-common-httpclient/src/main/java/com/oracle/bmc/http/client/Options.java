/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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

    /**
     * Sets the boolean value to indicate if the SDK should auto-close the InputStream stream
     * returned from the response once the stream has been read until the content-length of the
     * stream Note : This has been added to automatically release connections from the connection
     * pool when using the Apache Connector since the Apache Connector uses connection pooling by
     * default
     */
    public static void shouldAutoCloseResponseInputStream(final boolean shouldAutoClose) {
        LOG.info("Setting auto-close of response input stream to", shouldAutoClose);
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
     * Returns the boolean indicating if the SDK should use realm-specific endpoint templates or
     * not.
     *
     * @return true if the client should use realm-specific endpoint template
     */
    public static boolean getUseOfRealmSpecificEndpointTemplateByDefault() {
        final String useOfRealmSpecificEndpointTemplateEnabledEnvVar =
                System.getenv(OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED_ENV_VAR);
        return useOfRealmSpecificEndpointTemplateEnabledEnvVar != null
                && useOfRealmSpecificEndpointTemplateEnabledEnvVar.equalsIgnoreCase("true");
    }
}
