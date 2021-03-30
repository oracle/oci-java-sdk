/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Enterprise manager lifecycle state. Supported states are CREATING, ACTIVE, DELETED, NEEDS_ATTENTION
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.extern.slf4j.Slf4j
public enum EmBridgeLifecycleStates {
    Creating("CREATING"),
    Active("ACTIVE"),
    Deleted("DELETED"),
    NeedsAttention("NEEDS_ATTENTION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, EmBridgeLifecycleStates> map;

    static {
        map = new java.util.HashMap<>();
        for (EmBridgeLifecycleStates v : EmBridgeLifecycleStates.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    EmBridgeLifecycleStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EmBridgeLifecycleStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'EmBridgeLifecycleStates', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
