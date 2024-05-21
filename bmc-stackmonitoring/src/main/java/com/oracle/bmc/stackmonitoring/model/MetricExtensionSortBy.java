/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Sort By.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public enum MetricExtensionSortBy {
    Name("NAME"),
    TimeCreated("TIME_CREATED"),
    ;

    private final String value;
    private static java.util.Map<String, MetricExtensionSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (MetricExtensionSortBy v : MetricExtensionSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    MetricExtensionSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MetricExtensionSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MetricExtensionSortBy: " + key);
    }
}
