/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.StringUtils;

import java.io.File;

public enum Alloy {
// no-member enum to prevent instantiation
;

    private static final String DEFAULT_ALLOY_CONFIG_FILE_PATH = "~/.oci/alloy-config.json";

    // Default alloy-config env attribute key
    private static final String OCI_ALLOY_CONFIG_FILE_PATH = "OCI_ALLOY_CONFIG_FILE_PATH";

    // Env variable for the users with both PLC regions and OCI regions at the same time
    private static final String OCI_ALLOY_REGION_COEXIST_ENV_VAR = "OCI_ALLOY_REGION_COEXIST";

    private static boolean shouldUseOnlyAlloyRegions =
            (doesAlloyConfigExist() && !isAlloyRegionCoexistEnabled());

    /** Checks if Alloy configuration exists either in the default file or as env variable. */
    public static boolean doesAlloyConfigExist() {
        return doesAlloyFileExists() || doesAlloyEnvExists();
    }

    /** Checks if Alloy file exists. */
    public static boolean doesAlloyFileExists() {
        File file = new File(FileUtils.expandUserHome(DEFAULT_ALLOY_CONFIG_FILE_PATH));
        return file.isFile();
    }

    /** Checks if Alloy config exists as env variable. */
    public static boolean doesAlloyEnvExists() {
        return System.getenv(OCI_ALLOY_CONFIG_FILE_PATH) != null;
    }

    /** Checks if Oci Alloy region coexist is set to true. */
    public static boolean isAlloyRegionCoexistEnabled() {
        String ociRegionCoexistFromEnvVar = System.getenv(OCI_ALLOY_REGION_COEXIST_ENV_VAR);
        if (StringUtils.isNotBlank(ociRegionCoexistFromEnvVar)) {
            return StringUtils.equalsIgnoreCase(ociRegionCoexistFromEnvVar, "true");
        }
        return com.oracle.bmc.Region.isAlloyRegionCoexistEnabled();
    }

    /** Checks if regions from only the Alloy config has to be considered. */
    public static boolean shouldUseOnlyAlloyRegions() {
        return Alloy.shouldUseOnlyAlloyRegions;
    }

    /** Get config path from env variable. */
    public static String getAlloyEnvContent() {
        return System.getenv(OCI_ALLOY_CONFIG_FILE_PATH);
    }

    /** Get config path from env variable or from the default file path. */
    public static String getAlloyConfigFilePath() {
        if (doesAlloyEnvExists()) {
            return getAlloyEnvContent();
        } else {
            return DEFAULT_ALLOY_CONFIG_FILE_PATH;
        }
    }

    /**
     * Throws IllegalArgumentException if the region ID is not a registered Alloy region.
     *
     * @param regionId The region ID
     * @param e The error received.
     */
    public static void throwUnknownAlloyRegionIfAppropriate(String regionId, Throwable e) {
        if (Alloy.shouldUseOnlyAlloyRegions()) {
            throw new IllegalArgumentException(
                    "Unknown regionId "
                            + regionId
                            + ", region information not defined in Alloy configuration.",
                    e);
        }
    }

    /**
     * Throws IllegalArgumentException if the service is not a registered Alloy service.
     *
     * @param serviceName Name of the service
     */
    public static void throwDisabledServiceExceptionIfAppropriate(String serviceName) {
        if (!com.oracle.bmc.Region.isServiceEnabled(serviceName)) {
            throw new IllegalArgumentException(
                    "The Alloy configuration disabled service '"
                            + serviceName
                            + "'. This behavior is controlled by OCI_SDK_ENABLED_SERVICES_SET variable. Please check if your local alloy-config.json file configured the service you're targeting or contact the cloud provider on the availability of this service");
        }
    }

    @InternalSdk
    @VisibleForTesting
    public static void resetAlloyRegionCoexistStatus() {
        Alloy.shouldUseOnlyAlloyRegions =
                (doesAlloyConfigExist() && !isAlloyRegionCoexistEnabled());
    }
}
