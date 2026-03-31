/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Defines the MySQL instances to be operated during a controlled update.
 *  - ALL_BUT_PRIMARY: Update all MySQL instances in a highly available DB System except the primary group member,
 *    without triggering a controlled failover.
 *  - PRIMARY_ONLY: Update the primary group member in a highly available DB System
 *    after a controlled failover (downtime is expected). This operation requires that the other
 *    MySQL instances have been previously updated using the ALL_BUT_PRIMARY option.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum ControlledUpdateTargetDbInstances {
    AllButPrimary("ALL_BUT_PRIMARY"),
    PrimaryOnly("PRIMARY_ONLY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ControlledUpdateTargetDbInstances.class);

    private final String value;
    private static java.util.Map<String, ControlledUpdateTargetDbInstances> map;

    static {
        map = new java.util.HashMap<>();
        for (ControlledUpdateTargetDbInstances v : ControlledUpdateTargetDbInstances.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ControlledUpdateTargetDbInstances(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ControlledUpdateTargetDbInstances create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ControlledUpdateTargetDbInstances', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
