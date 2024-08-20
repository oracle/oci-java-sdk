/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of the database management supported features: - DIAGNOSTICS_AND_MANAGEMENT: Diagnostics
 * and management. - DB_LIFECYCLE_MANAGEMENT: Database lifecycle management. - SQLWATCH: Real
 * application testing.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum DbManagementFeature implements com.oracle.bmc.http.internal.BmcEnum {
    DiagnosticsAndManagement("DIAGNOSTICS_AND_MANAGEMENT"),
    DbLifecycleManagement("DB_LIFECYCLE_MANAGEMENT"),
    Sqlwatch("SQLWATCH"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementFeature.class);

    private final String value;
    private static java.util.Map<String, DbManagementFeature> map;

    static {
        map = new java.util.HashMap<>();
        for (DbManagementFeature v : DbManagementFeature.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DbManagementFeature(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DbManagementFeature create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DbManagementFeature', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
