/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The lifecycle state of a cluster.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.extern.slf4j.Slf4j
public enum ClusterLifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Failed("FAILED"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Updating("UPDATING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, ClusterLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (ClusterLifecycleState v : ClusterLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ClusterLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public static ClusterLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ClusterLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
