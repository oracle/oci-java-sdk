/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Lifecycle state for jobs. ACTIVE - The job is active and will execute based on it's schedule
 * information. INACTIVE - The job is inactive and will not execute based on it's schedule until it
 * is ACTIVE. EXPIRED - The job's schedule has expired and will not result in any further
 * executions. This is a terminal state.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Expired("EXPIRED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JobLifecycleState.class);

    private final String value;
    private static java.util.Map<String, JobLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (JobLifecycleState v : JobLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn(
                "Received unknown value '{}' for enum 'JobLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
