/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the link type.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum LinkEnum {
    Self("SELF"),
    Canonical("CANONICAL"),
    Next("NEXT"),
    Template("TEMPLATE"),
    Prev("PREV"),
    ;

    private final String value;
    private static java.util.Map<String, LinkEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (LinkEnum v : LinkEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    LinkEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LinkEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid LinkEnum: " + key);
    }
}
