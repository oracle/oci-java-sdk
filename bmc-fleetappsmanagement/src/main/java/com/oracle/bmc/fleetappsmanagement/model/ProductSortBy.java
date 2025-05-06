/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The sort order to use. At present, the values are either resource name ({@code
 * resourceDisplayName}) or product name ({@code displayName}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public enum ProductSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    DisplayName("displayName"),
    ResourceDisplayName("resourceDisplayName"),
    ;

    private final String value;
    private static java.util.Map<String, ProductSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (ProductSortBy v : ProductSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    ProductSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProductSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ProductSortBy: " + key);
    }
}
