/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Enumeration of different types of Oracle Cloud Infrastructure (OCI) resources that are members in
 * a DR protection group. - COMPUTE_INSTANCE - Deprecated. A compute instance. -
 * COMPUTE_INSTANCE_MOVABLE - A compute instance that moves across regions or ADs during DR. -
 * COMPUTE_INSTANCE_NON_MOVABLE - A compute instance that does not move across regions or ADs during
 * DR. - VOLUME_GROUP - A volume group. - DATABASE - An Oracle Database instance from Base Database
 * service, or Exadata Database service. - AUTONOMOUS_DATABASE - An Oracle Autonomous Database
 * Serverless. - LOAD_BALANCER - A load balancer. - NETWORK_LOAD_BALANCER - A network load balancer.
 * - FILE_SYSTEM - A file system.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupMemberType implements com.oracle.bmc.http.internal.BmcEnum {
    ComputeInstance("COMPUTE_INSTANCE"),
    ComputeInstanceMovable("COMPUTE_INSTANCE_MOVABLE"),
    ComputeInstanceNonMovable("COMPUTE_INSTANCE_NON_MOVABLE"),
    VolumeGroup("VOLUME_GROUP"),
    Database("DATABASE"),
    AutonomousDatabase("AUTONOMOUS_DATABASE"),
    LoadBalancer("LOAD_BALANCER"),
    NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),
    FileSystem("FILE_SYSTEM"),

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
