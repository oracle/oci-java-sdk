/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * The field to sort by (one column only). Default sort order is default group first, then sort by
 * resource name, ascending.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum ResourceGroupSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    Id("id"),
    ResourceName("resourceName"),
    DisplayName("displayName"),
    Description("description"),
    Capacity("capacity"),
    Status("status"),
    ;

    private final String value;
    private static java.util.Map<String, ResourceGroupSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (ResourceGroupSortBy v : ResourceGroupSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    ResourceGroupSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResourceGroupSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ResourceGroupSortBy: " + key);
    }
}
