/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the type of SearchDetails. FreeText - A request containing arbitrary text
 * that must be present in the resource. Structured - A request that uses Search's structured query
 * language to specify filter conditions to apply to search results.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum SearchDetailsTypeEnum implements com.oracle.bmc.http.internal.BmcEnum {
    FreeText("FreeText"),
    Structured("Structured"),
    ;

    private final String value;
    private static java.util.Map<String, SearchDetailsTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (SearchDetailsTypeEnum v : SearchDetailsTypeEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    SearchDetailsTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SearchDetailsTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SearchDetailsTypeEnum: " + key);
    }
}
