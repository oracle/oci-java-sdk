/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The MySQL instances operated during a maintenance event.
 *  - ALL: maintenance event targeting all MySQL instances in a DB System.
 *  - ALL_BUT_PRIMARY: maintenance event targeting all MySQL instances in a highly available DB System except the primary group member.
 *  - PRIMARY_ONLY: maintenance event targeting only the primary group member in a highly available DB System.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum MaintenanceScope {
    All("ALL"),
    AllButPrimary("ALL_BUT_PRIMARY"),
    PrimaryOnly("PRIMARY_ONLY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MaintenanceScope.class);

    private final String value;
    private static java.util.Map<String, MaintenanceScope> map;

    static {
        map = new java.util.HashMap<>();
        for (MaintenanceScope v : MaintenanceScope.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MaintenanceScope(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MaintenanceScope create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MaintenanceScope', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
