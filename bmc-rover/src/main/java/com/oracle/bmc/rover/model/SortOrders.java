/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Sort orders.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public enum SortOrders {
    Asc("ASC"),
    Desc("DESC"),
    ;

    private final String value;
    private static java.util.Map<String, SortOrders> map;

    static {
        map = new java.util.HashMap<>();
        for (SortOrders v : SortOrders.values()) {
            map.put(v.getValue(), v);
        }
    }

    SortOrders(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortOrders create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SortOrders: " + key);
    }
}
