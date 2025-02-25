/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The type of Oracle Database installation:
 * - EXTERNAL_SIDB: Single instance external database.
 * - EXTERNAL_RAC: Oracle Real Application Clusters (Oracle RAC) external database.
 * - CLOUD_SIDB: Single instance database in Oracle Cloud.
 * - CLOUD_RAC: Oracle RAC database in Oracle Cloud.
 * - SHARED: Autonomous shared database in Oracle Cloud.
 * - DEDICATED: Autonomous dedicated database in Oracle Cloud.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum DatabaseType {
    ExternalSidb("EXTERNAL_SIDB"),
    ExternalRac("EXTERNAL_RAC"),
    CloudSidb("CLOUD_SIDB"),
    CloudRac("CLOUD_RAC"),
    Shared("SHARED"),
    Dedicated("DEDICATED"),

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
