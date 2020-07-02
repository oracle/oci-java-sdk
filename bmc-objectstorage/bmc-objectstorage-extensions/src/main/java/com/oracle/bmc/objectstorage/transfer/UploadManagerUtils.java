/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UploadManagerUtils {

    public static final int MAX_RETRIES;
    public static final int EXPONENTIAL_BACKOFF_MAX_DELAY;

    static {
        final int jvmOptMaxRetriesInt = getIntProperty("oci.java.sdk.upload-manager.max-retry-attempts", -1);
        final int jvmOptExponentialBackoffMaxDelay = getIntProperty("oci.java.sdk.upload-manager.exponential-backoff-max-delay", -1);
        MAX_RETRIES = Math.max(jvmOptMaxRetriesInt, 3);
        EXPONENTIAL_BACKOFF_MAX_DELAY = Math.max(jvmOptExponentialBackoffMaxDelay, 100);
        LOG.info("max retries is set to {}", MAX_RETRIES);
        LOG.info("exponential backoff max-delay is set to {}", EXPONENTIAL_BACKOFF_MAX_DELAY);
    }

    private static int getIntProperty(String name, int defaultValue) {
        final String jvmOptMaxRetries = System.getProperty(name);
        if (jvmOptMaxRetries != null && !jvmOptMaxRetries.isEmpty()) {
            try {
                return Integer.parseInt(jvmOptMaxRetries);
            } catch (NumberFormatException nfe) {
                LOG.warn("System property \"" + name + "\" can not be converted to an integer", nfe);
            }
        }
        return defaultValue;
    }
}
