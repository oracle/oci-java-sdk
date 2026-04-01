/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Time allowed for the application downtime.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum AcceptableDowntime {
    LessThan10Minutes("LESS_THAN_10_MINUTES"),
    LessThan1Hour("LESS_THAN_1_HOUR"),
    LessThan4Hours("LESS_THAN_4_HOURS"),
    LessThan8Hours("LESS_THAN_8_HOURS"),
    LessThan12Hours("LESS_THAN_12_HOURS"),
    LessThan1Day("LESS_THAN_1_DAY"),
    LessThan2Days("LESS_THAN_2_DAYS"),
    MoreThan2Days("MORE_THAN_2_DAYS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AcceptableDowntime.class);

    private final String value;
    private static java.util.Map<String, AcceptableDowntime> map;

    static {
        map = new java.util.HashMap<>();
        for (AcceptableDowntime v : AcceptableDowntime.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AcceptableDowntime(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AcceptableDowntime create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AcceptableDowntime', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
