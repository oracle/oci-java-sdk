/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The sort order to use. At present, the values are resource name ({@code resourceDisplayName}),
 * target name ({@code displayName}) or product name ({@code product}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public enum InventoryResourceSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    TimeCreated("timeCreated"),
    DisplayName("displayName"),
    ;

    private final String value;
    private static java.util.Map<String, InventoryResourceSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (InventoryResourceSortBy v : InventoryResourceSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    InventoryResourceSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InventoryResourceSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid InventoryResourceSortBy: " + key);
    }
}
