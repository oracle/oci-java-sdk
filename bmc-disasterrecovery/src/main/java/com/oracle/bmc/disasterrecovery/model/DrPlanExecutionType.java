/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * All available DR Plan types.  Plans of type *precheck* are automatically created, updated, or deleted.
 * - SWITCHOVER - Switchover from primary to standby.
 * - SWITCHOVER_PRECHECK - Precheck for switchover DR Plan.
 * - FAILOVER - Failover to standby.
 * - FAILOVER_PRECHECK - Precheck for failover DR Plan.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanExecutionType {
    Switchover("SWITCHOVER"),
    SwitchoverPrecheck("SWITCHOVER_PRECHECK"),
    Failover("FAILOVER"),
    FailoverPrecheck("FAILOVER_PRECHECK"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanExecutionType.class);

    private final String value;
    private static java.util.Map<String, DrPlanExecutionType> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanExecutionType v : DrPlanExecutionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanExecutionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanExecutionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanExecutionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
