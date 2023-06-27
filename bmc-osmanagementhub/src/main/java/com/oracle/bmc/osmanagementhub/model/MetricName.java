/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Possible metric names.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum MetricName {
    TotalInstanceCount("TOTAL_INSTANCE_COUNT"),
    InstanceWithAvailableSecurityUpdatesCount("INSTANCE_WITH_AVAILABLE_SECURITY_UPDATES_COUNT"),
    InstanceWithAvailableBugfixUpdatesCount("INSTANCE_WITH_AVAILABLE_BUGFIX_UPDATES_COUNT"),
    NormalInstanceCount("NORMAL_INSTANCE_COUNT"),
    ErrorInstanceCount("ERROR_INSTANCE_COUNT"),
    WarningInstanceCount("WARNING_INSTANCE_COUNT"),
    UnreachableInstanceCount("UNREACHABLE_INSTANCE_COUNT"),
    RegistrationFailedInstanceCount("REGISTRATION_FAILED_INSTANCE_COUNT"),
    InstanceSecurityUpdatesCount("INSTANCE_SECURITY_UPDATES_COUNT"),
    InstanceBugfixUpdatesCount("INSTANCE_BUGFIX_UPDATES_COUNT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MetricName.class);

    private final String value;
    private static java.util.Map<String, MetricName> map;

    static {
        map = new java.util.HashMap<>();
        for (MetricName v : MetricName.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MetricName(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MetricName create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MetricName', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
