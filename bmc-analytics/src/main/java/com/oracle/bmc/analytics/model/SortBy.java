/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.model;

/**
 * The field to sort by (one column only). Default sort order is
 * ascending exception of `timeCreated` column (descending).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum SortBy {
    CapacityType("capacityType"),
    FeatureSet("featureSet"),
    LifecycleState("lifecycleState"),
    Name("name"),
    TimeCreated("timeCreated"),
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
