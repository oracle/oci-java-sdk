/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The types of DR plan that can be created, updated, or deleted by the user. - SWITCHOVER -
 * Switchover from primary to standby. - FAILOVER - Failover to standby. - START_DRILL - Start DR
 * Drill. - STOP_DRILL - Stop DR Drill.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanType implements com.oracle.bmc.http.internal.BmcEnum {
    Switchover("SWITCHOVER"),
    Failover("FAILOVER"),
    StartDrill("START_DRILL"),
    StopDrill("STOP_DRILL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DrPlanType.class);

    private final String value;
    private static java.util.Map<String, DrPlanType> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanType v : DrPlanType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
