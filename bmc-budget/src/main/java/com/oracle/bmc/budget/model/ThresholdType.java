/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/** The type of threshold. Valid values are PERCENTAGE or ABSOLUTE. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public enum ThresholdType implements com.oracle.bmc.http.internal.BmcEnum {
    Percentage("PERCENTAGE"),
    Absolute("ABSOLUTE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ThresholdType.class);

    private final String value;
    private static java.util.Map<String, ThresholdType> map;

    static {
        map = new java.util.HashMap<>();
        for (ThresholdType v : ThresholdType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ThresholdType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ThresholdType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ThresholdType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
