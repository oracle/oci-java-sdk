/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.budget.model;

/**
 * The field to sort by. If not specified, the default is timeCreated.
 * The default sort order for timeCreated is DESC.
 * The default sort order for displayName is ASC in alphanumeric order.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public enum SortBy {
    TimeCreated("timeCreated"),
    DisplayName("displayName"),
    ;

    private final String value;
    private static java.util.Map<String, SortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (SortBy v : SortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    SortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid SortBy: " + key);
    }
}
