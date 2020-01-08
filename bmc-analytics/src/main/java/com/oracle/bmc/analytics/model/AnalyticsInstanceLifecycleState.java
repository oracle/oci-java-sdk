/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.model;

/**
 * The current state of an instance.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.extern.slf4j.Slf4j
public enum AnalyticsInstanceLifecycleState {
    Active("ACTIVE"),
    Creating("CREATING"),
    Deleted("DELETED"),
    Deleting("DELETING"),
    Failed("FAILED"),
    Inactive("INACTIVE"),
    Updating("UPDATING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, AnalyticsInstanceLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (AnalyticsInstanceLifecycleState v : AnalyticsInstanceLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AnalyticsInstanceLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AnalyticsInstanceLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AnalyticsInstanceLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
