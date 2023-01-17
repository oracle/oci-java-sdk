/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Enumeration of different type of members in a DR Protection Group. - COMPUTE_INSTANCE - An Oracle
 * Cloud compute instance. - VOLUME_GROUP - An Oracle Cloud volume group. - DATABASE - An Oracle
 * Database Cloud Service database. - AUTONOMOUS_DATABASE - An Oracle Autonomous Database.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupMemberType implements com.oracle.bmc.http.internal.BmcEnum {
    ComputeInstance("COMPUTE_INSTANCE"),
    VolumeGroup("VOLUME_GROUP"),
    Database("DATABASE"),
    AutonomousDatabase("AUTONOMOUS_DATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrProtectionGroupMemberType.class);

    private final String value;
    private static java.util.Map<String, DrProtectionGroupMemberType> map;

    static {
        map = new java.util.HashMap<>();
        for (DrProtectionGroupMemberType v : DrProtectionGroupMemberType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrProtectionGroupMemberType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrProtectionGroupMemberType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrProtectionGroupMemberType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
