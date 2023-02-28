/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** Possible Migration Database Target types to specify. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
public enum MigrationDatabaseTargetTypes implements com.oracle.bmc.http.internal.BmcEnum {
    AdbSRemap("ADB_S_REMAP"),
    AdbDRemap("ADB_D_REMAP"),
    AdbDAutocreate("ADB_D_AUTOCREATE"),
    NonAdbRemap("NON_ADB_REMAP"),
    NonAdbAutocreate("NON_ADB_AUTOCREATE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MigrationDatabaseTargetTypes.class);

    private final String value;
    private static java.util.Map<String, MigrationDatabaseTargetTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (MigrationDatabaseTargetTypes v : MigrationDatabaseTargetTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MigrationDatabaseTargetTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MigrationDatabaseTargetTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MigrationDatabaseTargetTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
