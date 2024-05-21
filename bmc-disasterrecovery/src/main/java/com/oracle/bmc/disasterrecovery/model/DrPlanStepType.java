/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The types of steps in a DR plan.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanStepType {
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
    VolumeGroupRestoreStartDrillPrecheck("VOLUME_GROUP_RESTORE_START_DRILL_PRECHECK"),
    VolumeGroupRemovePrecheck("VOLUME_GROUP_REMOVE_PRECHECK"),
    VolumeGroupTerminatePrecheck("VOLUME_GROUP_TERMINATE_PRECHECK"),
    VolumeGroupRestoreStartDrill("VOLUME_GROUP_RESTORE_START_DRILL"),
    AutonomousDatabaseCreateClonePrecheck("AUTONOMOUS_DATABASE_CREATE_CLONE_PRECHECK"),
    AutonomousDatabaseDeleteClonePrecheck("AUTONOMOUS_DATABASE_DELETE_CLONE_PRECHECK"),
    LoadBalancerUpdatePrimaryBackendSetPrecheck(
            "LOAD_BALANCER_UPDATE_PRIMARY_BACKEND_SET_PRECHECK"),
    LoadBalancerUpdateStandbyBackendSetPrecheck(
            "LOAD_BALANCER_UPDATE_STANDBY_BACKEND_SET_PRECHECK"),
    FileSystemSwitchoverPrecheck("FILE_SYSTEM_SWITCHOVER_PRECHECK"),
    FileSystemFailoverPrecheck("FILE_SYSTEM_FAILOVER_PRECHECK"),
    FileSystemStartDrillPrecheck("FILE_SYSTEM_START_DRILL_PRECHECK"),
    FileSystemStopDrillPrecheck("FILE_SYSTEM_STOP_DRILL_PRECHECK"),
    FileSystemRemovePrecheck("FILE_SYSTEM_REMOVE_PRECHECK"),
    FileSystemTerminatePrecheck("FILE_SYSTEM_TERMINATE_PRECHECK"),
    FileSystemMountPrecheck("FILE_SYSTEM_MOUNT_PRECHECK"),
    FileSystemUnmountPrecheck("FILE_SYSTEM_UNMOUNT_PRECHECK"),
    ComputeInstanceStartPrecheck("COMPUTE_INSTANCE_START_PRECHECK"),
    ComputeInstanceAttachBlockVolumesPrecheck("COMPUTE_INSTANCE_ATTACH_BLOCK_VOLUMES_PRECHECK"),
    ComputeInstanceDetachBlockVolumesPrecheck("COMPUTE_INSTANCE_DETACH_BLOCK_VOLUMES_PRECHECK"),
    ComputeInstanceMountBlockVolumesPrecheck("COMPUTE_INSTANCE_MOUNT_BLOCK_VOLUMES_PRECHECK"),
    ComputeInstanceUnmountBlockVolumesPrecheck("COMPUTE_INSTANCE_UNMOUNT_BLOCK_VOLUMES_PRECHECK"),
    ComputeCapacityReservationStartDrillPrecheck(
            "COMPUTE_CAPACITY_RESERVATION_START_DRILL_PRECHECK"),
    ComputeCapacityAvailabilityStartDrillPrecheck(
            "COMPUTE_CAPACITY_AVAILABILITY_START_DRILL_PRECHECK"),
    AutonomousDatabaseCreateClone("AUTONOMOUS_DATABASE_CREATE_CLONE"),
    AutonomousDatabaseDeleteClone("AUTONOMOUS_DATABASE_DELETE_CLONE"),
    LoadBalancerUpdatePrimaryBackendSet("LOAD_BALANCER_UPDATE_PRIMARY_BACKEND_SET"),
    LoadBalancerUpdateStandbyBackendSet("LOAD_BALANCER_UPDATE_STANDBY_BACKEND_SET"),
    FileSystemSwitchover("FILE_SYSTEM_SWITCHOVER"),
    FileSystemFailover("FILE_SYSTEM_FAILOVER"),
    FileSystemRemove("FILE_SYSTEM_REMOVE"),
    FileSystemReverse("FILE_SYSTEM_REVERSE"),
    FileSystemTerminate("FILE_SYSTEM_TERMINATE"),
    FileSystemStartDrill("FILE_SYSTEM_START_DRILL"),
    FileSystemStopDrill("FILE_SYSTEM_STOP_DRILL"),
    ComputeInstanceStart("COMPUTE_INSTANCE_START"),
    ComputeInstanceAttachBlockVolumes("COMPUTE_INSTANCE_ATTACH_BLOCK_VOLUMES"),
    ComputeInstanceDetachBlockVolumes("COMPUTE_INSTANCE_DETACH_BLOCK_VOLUMES"),
    FileSystemMount("FILE_SYSTEM_MOUNT"),
    FileSystemUnmount("FILE_SYSTEM_UNMOUNT"),
    ComputeCapacityReservationSwitchoverPrecheck(
            "COMPUTE_CAPACITY_RESERVATION_SWITCHOVER_PRECHECK"),
    ComputeCapacityReservationFailoverPrecheck("COMPUTE_CAPACITY_RESERVATION_FAILOVER_PRECHECK"),
    ComputeCapacityAvailabilitySwitchoverPrecheck(
            "COMPUTE_CAPACITY_AVAILABILITY_SWITCHOVER_PRECHECK"),
    ComputeCapacityAvailabilityFailoverPrecheck("COMPUTE_CAPACITY_AVAILABILITY_FAILOVER_PRECHECK"),

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
