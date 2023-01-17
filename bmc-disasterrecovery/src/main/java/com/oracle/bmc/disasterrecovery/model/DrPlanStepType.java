/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/** Step types in a DR Plan. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanStepType implements com.oracle.bmc.http.internal.BmcEnum {
    ComputeInstanceStopPrecheck("COMPUTE_INSTANCE_STOP_PRECHECK"),
    ComputeInstanceLaunchPrecheck("COMPUTE_INSTANCE_LAUNCH_PRECHECK"),
    ComputeInstanceTerminatePrecheck("COMPUTE_INSTANCE_TERMINATE_PRECHECK"),
    ComputeInstanceRemovePrecheck("COMPUTE_INSTANCE_REMOVE_PRECHECK"),
    VolumeGroupRestoreSwitchoverPrecheck("VOLUME_GROUP_RESTORE_SWITCHOVER_PRECHECK"),
    VolumeGroupRestoreFailoverPrecheck("VOLUME_GROUP_RESTORE_FAILOVER_PRECHECK"),
    DatabaseSwitchoverPrecheck("DATABASE_SWITCHOVER_PRECHECK"),
    DatabaseFailoverPrecheck("DATABASE_FAILOVER_PRECHECK"),
    AutonomousDatabaseSwitchoverPrecheck("AUTONOMOUS_DATABASE_SWITCHOVER_PRECHECK"),
    AutonomousDatabaseFailoverPrecheck("AUTONOMOUS_DATABASE_FAILOVER_PRECHECK"),
    UserDefinedPrecheck("USER_DEFINED_PRECHECK"),
    ComputeInstanceLaunch("COMPUTE_INSTANCE_LAUNCH"),
    ComputeInstanceStop("COMPUTE_INSTANCE_STOP"),
    ComputeInstanceTerminate("COMPUTE_INSTANCE_TERMINATE"),
    ComputeInstanceRemove("COMPUTE_INSTANCE_REMOVE"),
    DatabaseSwitchover("DATABASE_SWITCHOVER"),
    DatabaseFailover("DATABASE_FAILOVER"),
    AutonomousDatabaseSwitchover("AUTONOMOUS_DATABASE_SWITCHOVER"),
    AutonomousDatabaseFailover("AUTONOMOUS_DATABASE_FAILOVER"),
    VolumeGroupRestoreSwitchover("VOLUME_GROUP_RESTORE_SWITCHOVER"),
    VolumeGroupRestoreFailover("VOLUME_GROUP_RESTORE_FAILOVER"),
    VolumeGroupReverse("VOLUME_GROUP_REVERSE"),
    VolumeGroupDelete("VOLUME_GROUP_DELETE"),
    VolumeGroupRemove("VOLUME_GROUP_REMOVE"),
    VolumeGroupTerminate("VOLUME_GROUP_TERMINATE"),
    UserDefined("USER_DEFINED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanStepType.class);

    private final String value;
    private static java.util.Map<String, DrPlanStepType> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanStepType v : DrPlanStepType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanStepType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanStepType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanStepType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
