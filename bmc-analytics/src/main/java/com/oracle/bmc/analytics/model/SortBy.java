/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
        throw new IllegalArgumentException("Invalid SortBy: " + key);
    }
}
