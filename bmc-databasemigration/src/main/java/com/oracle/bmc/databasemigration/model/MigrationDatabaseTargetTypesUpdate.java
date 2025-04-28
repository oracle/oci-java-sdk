/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** Possible Migration Database Target types to specify. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum MigrationDatabaseTargetTypesUpdate implements com.oracle.bmc.http.internal.BmcEnum {
    AdbSRemap("ADB_S_REMAP"),
    AdbDRemap("ADB_D_REMAP"),
    AdbDAutocreate("ADB_D_AUTOCREATE"),
    NonAdbRemap("NON_ADB_REMAP"),
    NonAdbAutocreate("NON_ADB_AUTOCREATE"),
    TargetDefaultsRemap("TARGET_DEFAULTS_REMAP"),
    TargetDefaultsAutocreate("TARGET_DEFAULTS_AUTOCREATE"),
    ;

    private final String value;
    private static java.util.Map<String, MigrationDatabaseTargetTypesUpdate> map;

    static {
        map = new java.util.HashMap<>();
        for (MigrationDatabaseTargetTypesUpdate v : MigrationDatabaseTargetTypesUpdate.values()) {
            map.put(v.getValue(), v);
        }
    }

    MigrationDatabaseTargetTypesUpdate(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MigrationDatabaseTargetTypesUpdate create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MigrationDatabaseTargetTypesUpdate: " + key);
    }
}
