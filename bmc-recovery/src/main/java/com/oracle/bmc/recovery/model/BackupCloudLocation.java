/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Indicates the cloud service environment where the protected database is provisioned. For example, Oracle Cloud or Microsoft Azure.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public enum BackupCloudLocation {
    Azure("AZURE"),
    Oci("OCI"),
    Gcp("GCP"),
    Aws("AWS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BackupCloudLocation.class);

    private final String value;
    private static java.util.Map<String, BackupCloudLocation> map;

    static {
        map = new java.util.HashMap<>();
        for (BackupCloudLocation v : BackupCloudLocation.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    BackupCloudLocation(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static BackupCloudLocation create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'BackupCloudLocation', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
