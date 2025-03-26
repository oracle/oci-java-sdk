/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * The state of the LogSavedSearch
 *   1. CREATING
 *   2. ACTIVE   LogSavedSearch is active and can be used by other users
 *   3. UPDATING
 *   4. INACTIVE
 *   5. DELETING
 *   6. FAILED
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public enum LogSavedSearchLifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
    Inactive("INACTIVE"),
    Deleting("DELETING"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogSavedSearchLifecycleState.class);

    private final String value;
    private static java.util.Map<String, LogSavedSearchLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (LogSavedSearchLifecycleState v : LogSavedSearchLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    LogSavedSearchLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LogSavedSearchLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'LogSavedSearchLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
