/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** Specifies supported Capabilities or features supported by deployment type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum SupportedCapabilities implements com.oracle.bmc.http.internal.BmcEnum {
    Placement("PLACEMENT"),
    DisasterRecovery("DISASTER_RECOVERY"),
    GroupToRole("GROUP_TO_ROLE"),
    BackupRestore("BACKUP_RESTORE"),
    CopyBackup("COPY_BACKUP"),
    ManualBackup("MANUAL_BACKUP"),
    ScheduleManualBackup("SCHEDULE_MANUAL_BACKUP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SupportedCapabilities.class);

    private final String value;
    private static java.util.Map<String, SupportedCapabilities> map;

    static {
        map = new java.util.HashMap<>();
        for (SupportedCapabilities v : SupportedCapabilities.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SupportedCapabilities(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SupportedCapabilities create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SupportedCapabilities', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
