/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Primary Key Compatibility option. IGNORE_MISSING_PKS - Make the instance, schema, or table dump
 * utility ignore any missing primary keys when the dump is carried out, CREATE_INVISIBLE_PKS - Add
 * a flag in the dump metadata to notify MySQL Shell\u2019s dump loading utility to add primary keys
 * in invisible columns, for each table that does not contain a primary key.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum PrimaryKeyCompatibility implements com.oracle.bmc.http.internal.BmcEnum {
    None("NONE"),
    IgnoreMissingPks("IGNORE_MISSING_PKS"),
    CreateInvisiblePks("CREATE_INVISIBLE_PKS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrimaryKeyCompatibility.class);

    private final String value;
    private static java.util.Map<String, PrimaryKeyCompatibility> map;

    static {
        map = new java.util.HashMap<>();
        for (PrimaryKeyCompatibility v : PrimaryKeyCompatibility.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PrimaryKeyCompatibility(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PrimaryKeyCompatibility create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'PrimaryKeyCompatibility', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
