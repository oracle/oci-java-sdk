/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiplatform.model;

/**
 * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code
 * displayName} sort order is case sensitive.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240829")
public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
    Asc("ASC"),
    Desc("DESC"),
    ;

    private final String value;
    private static java.util.Map<String, SortOrder> map;

    static {
        map = new java.util.HashMap<>();
        for (SortOrder v : SortOrder.values()) {
            map.put(v.getValue(), v);
        }
    }

    SortOrder(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortOrder create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SortOrder: " + key);
    }
}
