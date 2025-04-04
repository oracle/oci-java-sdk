/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The table statistics collection status, which can be divided into the following categories: -
 * NO_STATS: Table objects with no statistics. - STALE: Table objects with statistics that aren't
 * up-to-date. - NOT_STALE: Table objects with fresh or latest stats.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum TableStatisticsStatusCategory implements com.oracle.bmc.http.internal.BmcEnum {
    NoStats("NO_STATS"),
    Stale("STALE"),
    NotStale("NOT_STALE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TableStatisticsStatusCategory.class);

    private final String value;
    private static java.util.Map<String, TableStatisticsStatusCategory> map;

    static {
        map = new java.util.HashMap<>();
        for (TableStatisticsStatusCategory v : TableStatisticsStatusCategory.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TableStatisticsStatusCategory(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TableStatisticsStatusCategory create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TableStatisticsStatusCategory', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
