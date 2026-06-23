/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.StringUtils;

import java.io.File;

public enum DeveloperToolConfiguration {
// no-member enum to prevent instantiation
;

    private static final String DEFAULT_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH =
            "~/.oci/developer-tool-configuration.json";

    // Default developer-tool-configuration env attribute key
    private static final String OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH =
            "OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH";

    // Env variable for the users with both PLC regions and OCI regions at the same time
    private static final String OCI_ALLOW_ONLY_DEVELOPER_TOOL_CONFIGURATION_REGIONS_ENV_VAR =
            "OCI_ALLOW_ONLY_DEVELOPER_TOOL_CONFIGURATION_REGIONS";

    private static boolean shouldUseOnlyDeveloperToolConfigurationRegions =
            (doesDeveloperToolConfigurationExist() && !isDevToolConfigRegionCoexistEnabled());

    /**
     * Checks if DeveloperToolConfiguration configuration exists either in the default file or as
     * env variable.
     */
    public static boolean doesDeveloperToolConfigurationExist() {
        return doesDeveloperToolConfigurationFileExists()
                || doesDeveloperToolConfigurationEnvExists();
    }

    /** Checks if DeveloperToolConfiguration file exists. */
    public static boolean doesDeveloperToolConfigurationFileExists() {
        File file =
                new File(FileUtils.expandUserHome(DEFAULT_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH));
        return file.isFile();
    }

    /** Checks if DeveloperToolConfiguration config exists as env variable. */
    public static boolean doesDeveloperToolConfigurationEnvExists() {
        return System.getenv(OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH) != null;
    }

    /** Checks if Oci DeveloperToolConfiguration region coexist is set to true. */
    public static boolean isDevToolConfigRegionCoexistEnabled() {
        String ociRegionCoexistFromEnvVar =
                System.getenv(OCI_ALLOW_ONLY_DEVELOPER_TOOL_CONFIGURATION_REGIONS_ENV_VAR);
        if (StringUtils.isNotBlank(ociRegionCoexistFromEnvVar)) {
            return StringUtils.equalsIgnoreCase(ociRegionCoexistFromEnvVar, "true");
        }
        return com.oracle.bmc.Region.isDeveloperToolConfigCoexistEnabled();
    }

    /** Checks if regions from only the DeveloperToolConfiguration config has to be considered. */
    public static boolean shouldUseOnlyDeveloperToolConfigurationRegions() {
        return DeveloperToolConfiguration.shouldUseOnlyDeveloperToolConfigurationRegions;
    }

    /** Get config path from env variable. */
    public static String getDeveloperToolConfigurationEnvContent() {
        return System.getenv(OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH);
    }

    /** Get config path from env variable or from the default file path. */
    public static String getDeveloperToolConfigurationFilePath() {
        if (doesDeveloperToolConfigurationEnvExists()) {
            return getDeveloperToolConfigurationEnvContent();
        } else {
            return DEFAULT_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH;
        }
    }

    /**
     * Throws IllegalArgumentException if the region ID is not a registered
     * DeveloperToolConfiguration region.
     *
     * @param regionId The region ID
     * @param e The error received.
     */
    public static void throwUnknownDevToolConfigRegionIfAppropriate(String regionId, Throwable e) {
        if (DeveloperToolConfiguration.shouldUseOnlyDeveloperToolConfigurationRegions()) {
            throw new IllegalArgumentException(
                    "Unknown regionId "
                            + regionId
                            + ", region information not defined in DeveloperToolConfiguration configuration.",
                    e);
        }
    }

    /**
     * Throws IllegalArgumentException if the service is not a registered DeveloperToolConfiguration
     * service.
     *
     * @param serviceName Name of the service
     */
    public static void throwDisabledServiceExceptionIfAppropriate(String serviceName) {
        if (!com.oracle.bmc.Region.isServiceEnabled(serviceName)) {
            throw new IllegalArgumentException(
                    "The DeveloperToolConfiguration disabled service '"
                            + serviceName
                            + "'. This behavior is controlled by OCI_SDK_ENABLED_SERVICES_SET variable. Please check if your local developer-tool-configuration.json file configured the service you're targeting or contact the cloud provider on the availability of this service");
        }
    }

    @InternalSdk
    @VisibleForTesting
    public static void resetAllowOnlyDevToolConfigRegionsStatus() {
        DeveloperToolConfiguration.shouldUseOnlyDeveloperToolConfigurationRegions =
                (doesDeveloperToolConfigurationExist() && !isDevToolConfigRegionCoexistEnabled());
    }
}
