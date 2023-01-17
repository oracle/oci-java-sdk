/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
 * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum DatabaseSubType {
    Cdb("CDB"),
    Pdb("PDB"),
    NonCdb("NON_CDB"),
    Acd("ACD"),
    Adb("ADB"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseSubType.class);

    private final String value;
    private static java.util.Map<String, DatabaseSubType> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseSubType v : DatabaseSubType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DatabaseSubType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseSubType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DatabaseSubType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
