/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The types of steps in a DR plan. - COMPUTE_INSTANCE_STOP_PRECHECK - A precheck step for
 * validating a compute instance stop. - COMPUTE_INSTANCE_LAUNCH_PRECHECK - A precheck step for
 * validating a compute instance launch. - COMPUTE_INSTANCE_TERMINATE_PRECHECK - A precheck step for
 * validating a compute instance termination. - COMPUTE_INSTANCE_REMOVE_PRECHECK - A precheck step
 * for validating a compute instance removal. - VOLUME_GROUP_RESTORE_SWITCHOVER_PRECHECK - A
 * precheck step for validating a volume group restoration during a switchover. -
 * VOLUME_GROUP_RESTORE_FAILOVER_PRECHECK - A precheck step for validating a volume group
 * restoration during a failover. - DATABASE_SWITCHOVER_PRECHECK - A precheck step for validating
 * the database during a switchover. - DATABASE_FAILOVER_PRECHECK - A precheck step for validating
 * the database during a failover. - AUTONOMOUS_DATABASE_SWITCHOVER_PRECHECK - A precheck step for
 * validating an autonomous database during a switchover. - AUTONOMOUS_DATABASE_FAILOVER_PRECHECK -
 * A precheck step for validating an autonomous database during a failover. -
 * AUTONOMOUS_CONTAINER_DATABASE_SWITCHOVER_PRECHECK - A precheck step for validating an autonomous
 * container database during a switchover. - AUTONOMOUS_CONTAINER_DATABASE_FAILOVER_PRECHECK - A
 * precheck step for validating an autonomous container database during a failover. -
 * AUTONOMOUS_CONTAINER_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK - A precheck step
 * for validating the conversion of an autonomous container database to a snapshot at standby for a
 * start drill. - AUTONOMOUS_CONTAINER_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK - A
 * precheck step for validating the conversion of an autonomous container database to a physical
 * instance at standby for a stop drill. - AUTONOMOUS_CONTAINER_DATABASE_SWITCHOVER - A DR plan step
 * to perform an autonomous container database switchover. - AUTONOMOUS_CONTAINER_DATABASE_FAILOVER
 * - A DR plan step to perform an autonomous container database failover. -
 * AUTONOMOUS_CONTAINER_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY - A DR plan step to convert
 * an autonomous container database to a snapshot at standby during a start drill. -
 * AUTONOMOUS_CONTAINER_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY - A DR plan step to convert
 * an autonomous container database to a physical instance at standby during a stop drill. -
 * AUTONOMOUS_DATABASE_START_DRILL_CREATE_CLONE_STANDBY_PRECHECK - A precheck step for validating
 * the creation of an autonomous database clone at standby during a start drill. -
 * AUTONOMOUS_DATABASE_STOP_DRILL_DELETE_CLONE_STANDBY_PRECHECK - A precheck step for validating the
 * deletion of an autonomous database clone at standby during a stop drill. -
 * AUTONOMOUS_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK - A precheck step for
 * validating the conversion of an autonomous database to snapshot at standby during a start drill.
 * - AUTONOMOUS_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK - A precheck step for
 * validating the conversion of an autonomous database to a physical instance at standby during a
 * start drill. - AUTONOMOUS_DATABASE_START_DRILL_CREATE_CLONE_STANDBY - A DR plan step to create an
 * autonomous database clone at standby during a start drill. -
 * AUTONOMOUS_DATABASE_STOP_DRILL_DELETE_CLONE_STANDBY - A DR plan step to delete an autonomous
 * database clone at standby during a stop drill. -
 * AUTONOMOUS_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY - A DR plan step to convert an
 * autonomous database to a snapshot at standby during a start drill. -
 * AUTONOMOUS_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY - A DR plan step to convert an
 * autonomous database to a physical instance at standby during a stop drill. -
 * DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK - A precheck step for validating the
 * conversion of a database to a snapshot at standby during a start drill. -
 * DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK - A precheck step for validating the
 * conversion of a database to a physical instance at standby during a stop drill. -
 * DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY - A DR plan step to convert a database to a
 * snapshot at standby during a start drill. - DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY - A
 * DR plan step to convert a database to a physical instance at standby during a stop drill. -
 * USER_DEFINED_PRECHECK - A precheck step for validating a user-defined step. -
 * COMPUTE_INSTANCE_LAUNCH - A DR plan step to launch a compute instance. - COMPUTE_INSTANCE_STOP -
 * A DR plan step to stop a compute instance. - COMPUTE_INSTANCE_TERMINATE - A DR plan step to
 * terminate a compute instance. - COMPUTE_INSTANCE_REMOVE - A DR plan step to remove a compute
 * instance. - DATABASE_SWITCHOVER - A DR plan step to perform a database switchover. -
 * DATABASE_FAILOVER - A DR plan step to perform a database failover. -
 * AUTONOMOUS_DATABASE_SWITCHOVER - A DR plan step to perform an autonomous database switchover. -
 * AUTONOMOUS_DATABASE_FAILOVER - A DR plan step to perform an autonomous database failover. -
 * VOLUME_GROUP_RESTORE_SWITCHOVER - A DR plan step to perform a volume group restoration during a
 * switchover. - VOLUME_GROUP_RESTORE_FAILOVER - A DR plan step to perform a volume group
 * restoration during a failover. - VOLUME_GROUP_REVERSE - A DR plan step to reverse a volume group.
 * - VOLUME_GROUP_DELETE - A DR plan step to delete a volume group. - VOLUME_GROUP_REMOVE - A DR
 * plan step to remove a volume group. - VOLUME_GROUP_TERMINATE - A DR plan step to terminate a
 * volume group. - USER_DEFINED - User-defined step - USER_DEFINED_CUSTOM_PRECHECK - User-defined
 * custom precheck step. - VOLUME_GROUP_RESTORE_START_DRILL_PRECHECK - A precheck step for
 * validating a volume group restoration during a start drill. - VOLUME_GROUP_REMOVE_PRECHECK - A
 * precheck step for validating a volume group removal. - VOLUME_GROUP_TERMINATE_PRECHECK - A
 * precheck step for validating a volume group termination. - VOLUME_GROUP_RESTORE_START_DRILL - A
 * DR plan step for volume group restoration during a start drill. -
 * AUTONOMOUS_DATABASE_CREATE_CLONE_PRECHECK - A precheck step for validating the creation of an
 * autonomous database clone. - AUTONOMOUS_DATABASE_DELETE_CLONE_PRECHECK - A precheck step for
 * validating the deletion of an autonomous database clone. -
 * LOAD_BALANCER_UPDATE_PRIMARY_BACKEND_SET_PRECHECK - A precheck step for validating the update of
 * primary load balancer backend set. - LOAD_BALANCER_UPDATE_STANDBY_BACKEND_SET_PRECHECK - A
 * precheck step for validating the update of standby load balancer backend set. -
 * FILE_SYSTEM_SWITCHOVER_PRECHECK - A precheck step for validating a file system during a
 * switchover. - FILE_SYSTEM_FAILOVER_PRECHECK - A precheck step for validating a file system during
 * a failover. - FILE_SYSTEM_START_DRILL_PRECHECK - A precheck step for validating a file system
 * during a start drill. - FILE_SYSTEM_STOP_DRILL_PRECHECK - A precheck step for validating a file
 * system during a stop drill. - FILE_SYSTEM_REMOVE_PRECHECK - A precheck step for validating a file
 * system removal. - FILE_SYSTEM_TERMINATE_PRECHECK - A precheck step for validating a file system
 * termination. - FILE_SYSTEM_MOUNT_PRECHECK - A precheck step for validating a file system to be
 * mounted. - FILE_SYSTEM_UNMOUNT_PRECHECK - A precheck step for validating a file system to be
 * unmounted. - COMPUTE_INSTANCE_START_PRECHECK - A precheck step for validating the start of a
 * compute instance. - COMPUTE_INSTANCE_ATTACH_BLOCK_VOLUMES_PRECHECK - A precheck step for
 * validating the attachment of block volumes to a compute instance. -
 * COMPUTE_INSTANCE_DETACH_BLOCK_VOLUMES_PRECHECK - A precheck step for validating the detachment of
 * block volumes from a compute instance. - COMPUTE_INSTANCE_MOUNT_BLOCK_VOLUMES_PRECHECK - A
 * precheck step for validating the mounting of block volumes on a compute instance. -
 * COMPUTE_INSTANCE_UNMOUNT_BLOCK_VOLUMES_PRECHECK - A precheck step for validating the unmounting
 * of block volumes from a compute instance. - COMPUTE_CAPACITY_RESERVATION_START_DRILL_PRECHECK - A
 * precheck step for validating a compute capacity reservation during a start drill. -
 * COMPUTE_CAPACITY_AVAILABILITY_START_DRILL_PRECHECK - A precheck step for validating a compute
 * capacity availability during a start drill . - AUTONOMOUS_DATABASE_CREATE_CLONE - A DR plan step
 * to create an autonomous database clone. - AUTONOMOUS_DATABASE_DELETE_CLONE - A DR plan step to
 * delete an autonomous database clone. - LOAD_BALANCER_UPDATE_PRIMARY_BACKEND_SET - A DR plan step
 * to update a primary load balancer backend set. - LOAD_BALANCER_UPDATE_STANDBY_BACKEND_SET - A DR
 * plan step to update a standby load balancer backend set. - FILE_SYSTEM_SWITCHOVER - A DR plan
 * step to perform a file system switchover. - FILE_SYSTEM_FAILOVER - A DR plan step to perform a
 * file system failover. - FILE_SYSTEM_REMOVE - A DR plan step to remove a file system. -
 * FILE_SYSTEM_REVERSE - A DR plan step to reverse replication in a file system. -
 * FILE_SYSTEM_TERMINATE - A DR plan step to terminate a file system. - FILE_SYSTEM_START_DRILL - A
 * DR plan step to perform a start drill operation for a file system. - FILE_SYSTEM_STOP_DRILL - A
 * DR plan step to perform a stop drill operation for a file system. - COMPUTE_INSTANCE_START - A DR
 * plan step to start a compute instance. - COMPUTE_INSTANCE_ATTACH_BLOCK_VOLUMES - A DR plan step
 * to attach block volumes to a compute instance. - COMPUTE_INSTANCE_DETACH_BLOCK_VOLUMES - A DR
 * plan step to detach block volumes from a compute instance. - FILE_SYSTEM_MOUNT - A DR plan step
 * to mount a file system. - FILE_SYSTEM_UNMOUNT - A DR plan step to unmount a file system. -
 * COMPUTE_CAPACITY_RESERVATION_SWITCHOVER_PRECHECK - A precheck step for validating a compute
 * capacity reservation during a switchover. - COMPUTE_CAPACITY_RESERVATION_FAILOVER_PRECHECK - A
 * precheck step for validating a capacity reservation during a failover. -
 * COMPUTE_CAPACITY_AVAILABILITY_SWITCHOVER_PRECHECK - A precheck step for validating a compute
 * capacity availability during a switchover. - COMPUTE_CAPACITY_AVAILABILITY_FAILOVER_PRECHECK - A
 * precheck step for validating a compute capacity availability during a failover. -
 * OKE_CLUSTER_SWITCHOVER_CLEANUP_PRIMARY_PRECHECK - A precheck step for validating clean up of an
 * OKE cluster in the primary region during a switchover. -
 * OKE_CLUSTER_SWITCHOVER_RESTORE_STANDBY_PRECHECK - A precheck step for validating restoration of
 * an OKE cluster in the standby region during a switchover. -
 * OKE_CLUSTER_FAILOVER_RESTORE_STANDBY_PRECHECK - A precheck step for validating restoration of an
 * OKE cluster in the standby region during a failover. -
 * OKE_CLUSTER_STOP_DRILL_CLEANUP_STANDBY_PRECHECK - A precheck step for validating clean up of an
 * OKE cluster in the standby region during a stop drill. -
 * OKE_CLUSTER_START_DRILL_RESTORE_STANDBY_PRECHECK - A precheck step for validating restoration of
 * an OKE cluster in the standby region during a start drill. -
 * OKE_CLUSTER_SWITCHOVER_CLEANUP_PRIMARY - A DR plan step to clean up an OKE cluster in the primary
 * region during a switchover. - OKE_CLUSTER_SWITCHOVER_SCALE_UP_STANDBY - A DR plan step to scale
 * up the node pool of an OKE cluster in the standby during a switchover. -
 * OKE_CLUSTER_SWITCHOVER_RESTORE_STANDBY - A DR plan step to restore an OKE cluster in the standby
 * region during a switchover. - OKE_CLUSTER_SWITCHOVER_REVERSE_BACKUP_STANDBY - A DR plan step to
 * reverse an OKE cluster backup in the standby during a switchover. -
 * OKE_CLUSTER_SWITCHOVER_SCALE_DOWN_PRIMARY - A DR plan step to scale down the node pool of an OKE
 * cluster in the primary during a switchover. - OKE_CLUSTER_FAILOVER_RESTORE_STANDBY - A DR plan
 * step to restore an OKE cluster in the standby region during a failover. -
 * OKE_CLUSTER_FAILOVER_SCALE_UP_STANDBY - A DR plan step to scale up the node pool of an OKE
 * cluster in the standby region during a failover. - OKE_CLUSTER_START_DRILL_RESTORE_STANDBY - A DR
 * plan step to restore an OKE cluster in the standby region during a start drill. -
 * OKE_CLUSTER_START_DRILL_SCALE_UP_STANDBY - A DR plan step to scale up the node pool of an OKE
 * cluster in the standby region during a start drill. - OKE_CLUSTER_STOP_DRILL_CLEANUP_STANDBY - A
 * DR plan step to clean up an OKE cluster in the standby region during a stop drill. -
 * OKE_CLUSTER_STOP_DRILL_SCALE_DOWN_STANDBY - A DR plan step to scale down the node pool of an OKE
 * cluster in the standby region during a stop drill. -
 * OBJECT_STORAGE_BUCKET_SWITCHOVER_DELETE_REPLICATION_PRIMARY_PRECHECK - A precheck step for
 * validating the deletion of an object storage bucket replication in the primary region during a
 * switchover. - OBJECT_STORAGE_BUCKET_SWITCHOVER_SETUP_REVERSE_REPLICATION_STANDBY_PRECHECK - A
 * precheck step for validating an object storage bucket reverse replication set up in the standby
 * region during a switchover. - OBJECT_STORAGE_BUCKET_FAILOVER_DELETE_REPLICATION_STANDBY_PRECHECK
 * - A precheck step for validating the deletion of an object storage bucket replication in the
 * standby region during a failover. -
 * OBJECT_STORAGE_BUCKET_FAILOVER_SETUP_REVERSE_REPLICATION_STANDBY_PRECHECK - A precheck step for
 * validating an object storage bucket reverse replication set up in the standby region during a
 * failover. - OBJECT_STORAGE_BUCKET_SWITCHOVER_DELETE_REPLICATION_PRIMARY - A DR plan step to
 * delete an object storage bucket replication in the primary region during a switchover. -
 * OBJECT_STORAGE_BUCKET_SWITCHOVER_SETUP_REVERSE_REPLICATION_STANDBY - A DR plan step to set up an
 * object storage bucket reverse replication in the standby region during a switchover. -
 * OBJECT_STORAGE_BUCKET_FAILOVER_DELETE_REPLICATION_STANDBY - A DR plan step to delete an object
 * storage bucket replication in the standby region during a failover. -
 * OBJECT_STORAGE_BUCKET_FAILOVER_SETUP_REVERSE_REPLICATION_STANDBY - A DR plan step to set up an
 * object storage bucket reverse replication in the standby region during a failover. -
 * MYSQL_DB_SYSTEM_SWITCHOVER_PRECHECK - A precheck step for validating HeatWave MySQL DB System
 * switchover. - MYSQL_DB_SYSTEM_SWITCHOVER - A DR plan step to perform a HeatWave MySQL DB System
 * switchover. - MYSQL_DB_SYSTEM_FAILOVER_PRECHECK - A precheck step for validating HeatWave MySQL
 * DB System failover. - MYSQL_DB_SYSTEM_FAILOVER - A DR plan step to perform a HeatWave MySQL DB
 * System failover. - MYSQL_DB_SYSTEM_START_DRILL_PRECHECK - A precheck step for validating HeatWave
 * MySQL DB System start drill. - MYSQL_DB_SYSTEM_START_DRILL - A DR plan step to perform a HeatWave
 * MySQL DB System start drill. - MYSQL_DB_SYSTEM_STOP_DRILL_PRECHECK - A precheck step for
 * validating HeatWave MySQL DB System stop drill. - MYSQL_DB_SYSTEM_STOP_DRILL - A DR plan step to
 * perform a HeatWave MySQL DB System stop drill. - INTEGRATION_INSTANCE_SWITCHOVER_PRECHECK - A
 * precheck step for validating an integration instance (OIC) for switchover. -
 * INTEGRATION_INSTANCE_SWITCHOVER - A DR plan step to perform a switchover operation for an
 * integration instance (OIC). - INTEGRATION_INSTANCE_FAILOVER_PRECHECK -A precheck step for
 * validating an integration instance (OIC) for failover. - INTEGRATION_INSTANCE_FAILOVER - A DR
 * plan step to perform a failover operation for an integration instance (OIC).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
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
    AutonomousContainerDatabaseSwitchoverPrecheck(
            "AUTONOMOUS_CONTAINER_DATABASE_SWITCHOVER_PRECHECK"),
    AutonomousContainerDatabaseFailoverPrecheck("AUTONOMOUS_CONTAINER_DATABASE_FAILOVER_PRECHECK"),
    AutonomousContainerDatabaseStartDrillConvertToSnapshotStandbyPrecheck(
            "AUTONOMOUS_CONTAINER_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK"),
    AutonomousContainerDatabaseStopDrillConvertToPhysicalStandbyPrecheck(
            "AUTONOMOUS_CONTAINER_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK"),
    AutonomousContainerDatabaseSwitchover("AUTONOMOUS_CONTAINER_DATABASE_SWITCHOVER"),
    AutonomousContainerDatabaseFailover("AUTONOMOUS_CONTAINER_DATABASE_FAILOVER"),
    AutonomousContainerDatabaseStartDrillConvertToSnapshotStandby(
            "AUTONOMOUS_CONTAINER_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY"),
    AutonomousContainerDatabaseStopDrillConvertToPhysicalStandby(
            "AUTONOMOUS_CONTAINER_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY"),
    AutonomousDatabaseStartDrillCreateCloneStandbyPrecheck(
            "AUTONOMOUS_DATABASE_START_DRILL_CREATE_CLONE_STANDBY_PRECHECK"),
    AutonomousDatabaseStopDrillDeleteCloneStandbyPrecheck(
            "AUTONOMOUS_DATABASE_STOP_DRILL_DELETE_CLONE_STANDBY_PRECHECK"),
    AutonomousDatabaseStartDrillConvertToSnapshotStandbyPrecheck(
            "AUTONOMOUS_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK"),
    AutonomousDatabaseStopDrillConvertToPhysicalStandbyPrecheck(
            "AUTONOMOUS_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK"),
    AutonomousDatabaseStartDrillCreateCloneStandby(
            "AUTONOMOUS_DATABASE_START_DRILL_CREATE_CLONE_STANDBY"),
    AutonomousDatabaseStopDrillDeleteCloneStandby(
            "AUTONOMOUS_DATABASE_STOP_DRILL_DELETE_CLONE_STANDBY"),
    AutonomousDatabaseStartDrillConvertToSnapshotStandby(
            "AUTONOMOUS_DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY"),
    AutonomousDatabaseStopDrillConvertToPhysicalStandby(
            "AUTONOMOUS_DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY"),
    DatabaseStartDrillConvertToSnapshotStandbyPrecheck(
            "DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY_PRECHECK"),
    DatabaseStopDrillConvertToPhysicalStandbyPrecheck(
            "DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY_PRECHECK"),
    DatabaseStartDrillConvertToSnapshotStandby("DATABASE_START_DRILL_CONVERT_TO_SNAPSHOT_STANDBY"),
    DatabaseStopDrillConvertToPhysicalStandby("DATABASE_STOP_DRILL_CONVERT_TO_PHYSICAL_STANDBY"),
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
    UserDefinedCustomPrecheck("USER_DEFINED_CUSTOM_PRECHECK"),
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
    OkeClusterSwitchoverCleanupPrimaryPrecheck("OKE_CLUSTER_SWITCHOVER_CLEANUP_PRIMARY_PRECHECK"),
    OkeClusterSwitchoverRestoreStandbyPrecheck("OKE_CLUSTER_SWITCHOVER_RESTORE_STANDBY_PRECHECK"),
    OkeClusterFailoverRestoreStandbyPrecheck("OKE_CLUSTER_FAILOVER_RESTORE_STANDBY_PRECHECK"),
    OkeClusterStopDrillCleanupStandbyPrecheck("OKE_CLUSTER_STOP_DRILL_CLEANUP_STANDBY_PRECHECK"),
    OkeClusterStartDrillRestoreStandbyPrecheck("OKE_CLUSTER_START_DRILL_RESTORE_STANDBY_PRECHECK"),
    OkeClusterSwitchoverCleanupPrimary("OKE_CLUSTER_SWITCHOVER_CLEANUP_PRIMARY"),
    OkeClusterSwitchoverScaleUpStandby("OKE_CLUSTER_SWITCHOVER_SCALE_UP_STANDBY"),
    OkeClusterSwitchoverRestoreStandby("OKE_CLUSTER_SWITCHOVER_RESTORE_STANDBY"),
    OkeClusterSwitchoverReverseBackupStandby("OKE_CLUSTER_SWITCHOVER_REVERSE_BACKUP_STANDBY"),
    OkeClusterSwitchoverScaleDownPrimary("OKE_CLUSTER_SWITCHOVER_SCALE_DOWN_PRIMARY"),
    OkeClusterFailoverRestoreStandby("OKE_CLUSTER_FAILOVER_RESTORE_STANDBY"),
    OkeClusterFailoverScaleUpStandby("OKE_CLUSTER_FAILOVER_SCALE_UP_STANDBY"),
    OkeClusterStartDrillRestoreStandby("OKE_CLUSTER_START_DRILL_RESTORE_STANDBY"),
    OkeClusterStartDrillScaleUpStandby("OKE_CLUSTER_START_DRILL_SCALE_UP_STANDBY"),
    OkeClusterStopDrillCleanupStandby("OKE_CLUSTER_STOP_DRILL_CLEANUP_STANDBY"),
    OkeClusterStopDrillScaleDownStandby("OKE_CLUSTER_STOP_DRILL_SCALE_DOWN_STANDBY"),
    ObjectStorageBucketSwitchoverDeleteReplicationPrimaryPrecheck(
            "OBJECT_STORAGE_BUCKET_SWITCHOVER_DELETE_REPLICATION_PRIMARY_PRECHECK"),
    ObjectStorageBucketSwitchoverSetupReverseReplicationStandbyPrecheck(
            "OBJECT_STORAGE_BUCKET_SWITCHOVER_SETUP_REVERSE_REPLICATION_STANDBY_PRECHECK"),
    ObjectStorageBucketFailoverDeleteReplicationStandbyPrecheck(
            "OBJECT_STORAGE_BUCKET_FAILOVER_DELETE_REPLICATION_STANDBY_PRECHECK"),
    ObjectStorageBucketFailoverSetupReverseReplicationStandbyPrecheck(
            "OBJECT_STORAGE_BUCKET_FAILOVER_SETUP_REVERSE_REPLICATION_STANDBY_PRECHECK"),
    ObjectStorageBucketSwitchoverDeleteReplicationPrimary(
            "OBJECT_STORAGE_BUCKET_SWITCHOVER_DELETE_REPLICATION_PRIMARY"),
    ObjectStorageBucketSwitchoverSetupReverseReplicationStandby(
            "OBJECT_STORAGE_BUCKET_SWITCHOVER_SETUP_REVERSE_REPLICATION_STANDBY"),
    ObjectStorageBucketFailoverDeleteReplicationStandby(
            "OBJECT_STORAGE_BUCKET_FAILOVER_DELETE_REPLICATION_STANDBY"),
    ObjectStorageBucketFailoverSetupReverseReplicationStandby(
            "OBJECT_STORAGE_BUCKET_FAILOVER_SETUP_REVERSE_REPLICATION_STANDBY"),
    MysqlDbSystemSwitchoverPrecheck("MYSQL_DB_SYSTEM_SWITCHOVER_PRECHECK"),
    MysqlDbSystemSwitchover("MYSQL_DB_SYSTEM_SWITCHOVER"),
    MysqlDbSystemFailoverPrecheck("MYSQL_DB_SYSTEM_FAILOVER_PRECHECK"),
    MysqlDbSystemFailover("MYSQL_DB_SYSTEM_FAILOVER"),
    MysqlDbSystemStartDrillPrecheck("MYSQL_DB_SYSTEM_START_DRILL_PRECHECK"),
    MysqlDbSystemStartDrill("MYSQL_DB_SYSTEM_START_DRILL"),
    MysqlDbSystemStopDrillPrecheck("MYSQL_DB_SYSTEM_STOP_DRILL_PRECHECK"),
    MysqlDbSystemStopDrill("MYSQL_DB_SYSTEM_STOP_DRILL"),
    IntegrationInstanceSwitchoverPrecheck("INTEGRATION_INSTANCE_SWITCHOVER_PRECHECK"),
    IntegrationInstanceSwitchover("INTEGRATION_INSTANCE_SWITCHOVER"),
    IntegrationInstanceFailoverPrecheck("INTEGRATION_INSTANCE_FAILOVER_PRECHECK"),
    IntegrationInstanceFailover("INTEGRATION_INSTANCE_FAILOVER"),

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
