/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The type of the database. Allowed values are - DATABASE_CLOUD_SERVICE - Represents Oracle
 * Database Cloud Services. - AUTONOMOUS_DATABASE - Represents Oracle Autonomous Databases. -
 * INSTALLED_DATABASE - Represents databases running on-premises or on compute instances.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum DatabaseType implements com.oracle.bmc.http.internal.BmcEnum {
    DatabaseCloudService("DATABASE_CLOUD_SERVICE"),
    AutonomousDatabase("AUTONOMOUS_DATABASE"),
    InstalledDatabase("INSTALLED_DATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseType.class);

    private final String value;
    private static java.util.Map<String, DatabaseType> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseType v : DatabaseType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DatabaseType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DatabaseType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
