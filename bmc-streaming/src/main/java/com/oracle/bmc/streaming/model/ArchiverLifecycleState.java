/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * The state of the stream archiver.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.extern.slf4j.Slf4j
public enum ArchiverLifecycleState {
    Creating("CREATING"),
    Stopped("STOPPED"),
    Starting("STARTING"),
    Running("RUNNING"),
    Stopping("STOPPING"),
    Updating("UPDATING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, ArchiverLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (ArchiverLifecycleState v : ArchiverLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ArchiverLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ArchiverLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ArchiverLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
