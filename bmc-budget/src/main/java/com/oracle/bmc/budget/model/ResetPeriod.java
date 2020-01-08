/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.budget.model;

/**
 * The reset period for the budget. Valid value is MONTHLY.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.extern.slf4j.Slf4j
public enum ResetPeriod {
    Monthly("MONTHLY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, ResetPeriod> map;

    static {
        map = new java.util.HashMap<>();
        for (ResetPeriod v : ResetPeriod.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ResetPeriod(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResetPeriod create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ResetPeriod', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
