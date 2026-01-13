/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.util.internal.ClientCompatibilityChecker;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.oracle.bmc.util.internal.StringUtils;

/** This class provides client info that will be sent to the servers as part of each request. */
public class ClientRuntime {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ClientRuntime.class);
    public static final String SDK_VERSION_PROPERTY_NAME = "sdk.version";

    /**
     * Sets an extra piece of information into the user-agent header passed to the server. The
     * format is (by convention) "Application/Version", ex "MyApp/1.3.5".
     *
     * <p>Note, this must be called BEFORE any service calls are ever made, and once set, cannot be
     * changed after a call has been made.
     */
    private static String clientUserAgent;

    public static void setClientUserAgent(String clientUserAgent) {
        ClientRuntime.clientUserAgent = clientUserAgent;
    }

    /**
     * The user agent to send.
     *
     * <p>The agent will include runtime information, ex: <code>
     * Oracle-JavaSDK/1.0.0 (Linux/3.10.0-229.el7.x86_64; Java/1.8.0_60; Java HotSpot(TM) 64-Bit Server VM/25.60-b23)
     * </code>
     */
    private final String userAgent;
    /** The SDK client info to send. */
    private final String clientInfo;

    private final String sdkVersion;

    private final ClientCompatibilityChecker clientCompatibilityChecker;
    private static final String ENV_VAR_USER_AGENT = "OCI_SDK_APPEND_USER_AGENT";

    ClientRuntime() {
        String os = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String javaVmName = System.getProperty("java.vm.name");
        String javaVmVersion = System.getProperty("java.vm.version");
        Properties sdkProperties = getSdkProperties();
        sdkVersion = extractSdkVersionFromProperties(sdkProperties);
        clientCompatibilityChecker = new ClientCompatibilityChecker(sdkProperties);

        String userAgentFromEnvVar = System.getenv(ENV_VAR_USER_AGENT);
        String ociSdkAppendUserAgent =
                StringUtils.isBlank(userAgentFromEnvVar) ? "" : " " + userAgentFromEnvVar.trim();

        final String clientInfoFormat = "Oracle-JavaSDK/%s";
        clientInfo = String.format(clientInfoFormat, sdkVersion);

        final String additionalUserAgentFromClient;
        if (clientUserAgent != null && !clientUserAgent.trim().isEmpty()) {
            additionalUserAgentFromClient = " " + clientUserAgent.trim();
        } else {
            additionalUserAgentFromClient = "";
        }

        final String agentFormat = "%s (%s/%s; Java/%s; %s/%s)%s%s";
        userAgent =
                String.format(
                        agentFormat,
                        clientInfo,
                        os,
                        osVersion,
                        javaVersion,
                        javaVmName,
                        javaVmVersion,
                        additionalUserAgentFromClient,
                        ociSdkAppendUserAgent);
        LOG.info("Using SDK: {}", clientInfo);
        LOG.info("User agent set to: {}", userAgent);
    }

    static Properties getSdkProperties() {
        InputStream propertyStream =
                ClientRuntime.class
                        .getClassLoader()
                        .getResourceAsStream("com/oracle/bmc/sdk.properties");

        Properties properties = new Properties();
        try {
            properties.load(propertyStream);
        } catch (Exception e) {
            LOG.error("Failed to load sdk.properties", e);
            return properties;
        } finally {
            try {
                propertyStream.close();
            } catch (IOException e) {
                LOG.warn("Failed to close property stream correctly", e);
            }
        }
        return properties;
    }

    public static String extractSdkVersionFromProperties(Properties sdkProperties) {
        return sdkProperties.getProperty(SDK_VERSION_PROPERTY_NAME, "Unknown");
    }

    /**
     * Get the ClientRuntime instance.
     *
     * @return The ClientRuntime instance.
     */
    public static ClientRuntime getRuntime() {
        return RuntimeInstance.INSTANCE;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getClientInfo() {
        return this.clientInfo;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public ClientCompatibilityChecker getClientCompatibilityChecker() {
        return clientCompatibilityChecker;
    }

    // holder
    private static class RuntimeInstance {
        private static final ClientRuntime INSTANCE = new ClientRuntime();
    }
}
