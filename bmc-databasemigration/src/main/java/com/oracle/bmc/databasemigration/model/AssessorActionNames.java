/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Supported Assessor Action Names.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum AssessorActionNames {
    Run("RUN"),
    Configure("CONFIGURE"),
    ConfigureMigration("CONFIGURE_MIGRATION"),
    CreateMigration("CREATE_MIGRATION"),
    UpdateMigration("UPDATE_MIGRATION"),
    Recheck("RECHECK"),
    RunSql("RUN_SQL"),
    DownloadSql("DOWNLOAD_SQL"),
    DownloadLog("DOWNLOAD_LOG"),
    Confirm("CONFIRM"),
    Manage("MANAGE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AssessorActionNames.class);

    private final String value;
    private static java.util.Map<String, AssessorActionNames> map;

    static {
        map = new java.util.HashMap<>();
        for (AssessorActionNames v : AssessorActionNames.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AssessorActionNames(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AssessorActionNames create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AssessorActionNames', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
