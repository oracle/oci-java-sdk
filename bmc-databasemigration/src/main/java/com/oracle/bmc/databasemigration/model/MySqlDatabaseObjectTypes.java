/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** MySQL database object types used by Data Verification. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum MySqlDatabaseObjectTypes implements com.oracle.bmc.http.internal.BmcEnum {
    Table("TABLE"),
    View("VIEW"),
    Index("INDEX"),
    Trigger("TRIGGER"),
    Procedure("PROCEDURE"),
    Function("FUNCTION"),
    Event("EVENT"),
    Database("DATABASE"),
    Schema("SCHEMA"),
    Tablespace("TABLESPACE"),
    Server("SERVER"),
    LogfileGroup("LOGFILE_GROUP"),
    User("USER"),
    Role("ROLE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MySqlDatabaseObjectTypes.class);

    private final String value;
    private static java.util.Map<String, MySqlDatabaseObjectTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (MySqlDatabaseObjectTypes v : MySqlDatabaseObjectTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MySqlDatabaseObjectTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MySqlDatabaseObjectTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MySqlDatabaseObjectTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
