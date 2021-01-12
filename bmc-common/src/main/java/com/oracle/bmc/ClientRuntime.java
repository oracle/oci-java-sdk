/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * This class provides client info that will be sent to the servers as part of each request.
 */
@Slf4j
public class ClientRuntime {
    /**
     * Sets an extra piece of information into the user-agent header passed to the server.
     * The format is (by convention) "Application/Version", ex "MyApp/1.3.5".
     * <p>
     * Note, this must be called BEFORE any service calls are ever made, and once set, cannot
     * be changed after a call has been made.
     */
    @Setter private static String clientUserAgent;

    /**
     * The user agent to send.
     * <p>
     * The agent will include runtime information, ex:
     * <code>Oracle-JavaSDK/1.0.0 (Linux/3.10.0-229.el7.x86_64; Java/1.8.0_60; Java HotSpot(TM) 64-Bit Server VM/25.60-b23)</code>
     */
    @Getter private final String userAgent;
    /**
     * The SDK client info to send.
     */
    @Getter private final String clientInfo;

    private ClientRuntime() {
        String os = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String javaVmName = System.getProperty("java.vm.name");
        String javaVmVersion = System.getProperty("java.vm.version");
        String sdkVersion = sdkVersion();

        final String clientInfoFormat = "Oracle-JavaSDK/%s";
        clientInfo = String.format(clientInfoFormat, sdkVersion);

        final String additionalUserAgentFromClient;
        if (clientUserAgent != null && !clientUserAgent.trim().isEmpty()) {
            additionalUserAgentFromClient = " " + clientUserAgent.trim();
        } else {
            additionalUserAgentFromClient = "";
        }

        final String agentFormat = "%s (%s/%s; Java/%s; %s/%s)%s";
        userAgent =
                String.format(
                        agentFormat,
                        clientInfo,
                        os,
                        osVersion,
                        javaVersion,
                        javaVmName,
                        javaVmVersion,
                        additionalUserAgentFromClient);
        LOG.info("Using SDK: {}", clientInfo);
        LOG.info("User agent set to: {}", userAgent);
    }

    private String sdkVersion() {
        InputStream propertyStream =
                getClass().getClassLoader().getResourceAsStream("com/oracle/bmc/sdk.properties");

        Properties properties = new Properties();
        try {
            properties.load(propertyStream);
        } catch (Exception e) {
            LOG.error("Failed to load sdk.properties", e);
            return "Unknown";
        } finally {
            try {
                propertyStream.close();
            } catch (IOException e) {
                LOG.warn("Failed to close property stream correctly", e);
            }
        }
        return properties.getProperty("sdk.version");
    }

    /**
     * Get the ClientRuntime instance.
     *
     * @return The ClientRuntime instance.
     */
    public static ClientRuntime getRuntime() {
        return RuntimeInstance.INSTANCE;
    }

    // holder
    private static class RuntimeInstance {
        private static final ClientRuntime INSTANCE = new ClientRuntime();
    }
}
