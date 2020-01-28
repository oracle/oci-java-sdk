/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Lifecycle state for jobs.
 * ACTIVE    - The job is active and will execute based on it's schedule information.
 * INACTIVE  - The job is inactive and will not execute based on it's schedule until it is ACTIVE.
 * EXPIRED - The job's schedule has expired and will not result in any further executions. This is a terminal state.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobLifecycleState {
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Expired("EXPIRED"),
    ;

    private final String value;
    private static java.util.Map<String, JobLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (JobLifecycleState v : JobLifecycleState.values()) {
            map.put(v.getValue(), v);
        }
    }

    JobLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid JobLifecycleState: " + key);
    }
}
