/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Enumeration of different types of Oracle Cloud Infrastructure (OCI) resources that are members in
 * Automatic DR Configuration. - DATABASE - AUTONOMOUS_DATABASE - AUTONOMOUS_CONTAINER_DATABASE
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutomaticDrConfigurationMemberType implements com.oracle.bmc.http.internal.BmcEnum {
    Database("DATABASE"),
    AutonomousDatabase("AUTONOMOUS_DATABASE"),
    AutonomousContainerDatabase("AUTONOMOUS_CONTAINER_DATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutomaticDrConfigurationMemberType.class);

    private final String value;
    private static java.util.Map<String, AutomaticDrConfigurationMemberType> map;

    static {
        map = new java.util.HashMap<>();
        for (AutomaticDrConfigurationMemberType v : AutomaticDrConfigurationMemberType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutomaticDrConfigurationMemberType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutomaticDrConfigurationMemberType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutomaticDrConfigurationMemberType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
