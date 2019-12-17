/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the lifecycle state.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum LifecycleStateEnum {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),
    ;

    private final String value;
    private static java.util.Map<String, LifecycleStateEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (LifecycleStateEnum v : LifecycleStateEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    LifecycleStateEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LifecycleStateEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid LifecycleStateEnum: " + key);
    }
}
