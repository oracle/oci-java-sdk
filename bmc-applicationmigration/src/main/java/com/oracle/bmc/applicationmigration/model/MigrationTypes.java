/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * The type of application service to be migrated.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.extern.slf4j.Slf4j
public enum MigrationTypes {
    Jcs("JCS"),
    Soacs("SOACS"),
    Oic("OIC"),
    Oac("OAC"),
    Ics("ICS"),
    Pcs("PCS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, MigrationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (MigrationTypes v : MigrationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MigrationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MigrationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MigrationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
