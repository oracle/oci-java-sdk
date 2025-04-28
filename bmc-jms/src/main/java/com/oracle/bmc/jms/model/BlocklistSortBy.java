/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** The field to sort blocklist records. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum BlocklistSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    Operation("operation"),
    ;

    private final String value;
    private static java.util.Map<String, BlocklistSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (BlocklistSortBy v : BlocklistSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    BlocklistSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static BlocklistSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid BlocklistSortBy: " + key);
    }
}
