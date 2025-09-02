/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public enum WorkRequestOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateDbsystem("CREATE_DBSYSTEM"),
    UpdateDbsystem("UPDATE_DBSYSTEM"),
    DeleteDbsystem("DELETE_DBSYSTEM"),
    StartDbsystem("START_DBSYSTEM"),
    StopDbsystem("STOP_DBSYSTEM"),
    RestartDbsystem("RESTART_DBSYSTEM"),
    AddHeatwaveCluster("ADD_HEATWAVE_CLUSTER"),
    UpdateHeatwaveCluster("UPDATE_HEATWAVE_CLUSTER"),
    DeleteHeatwaveCluster("DELETE_HEATWAVE_CLUSTER"),
    StartHeatwaveCluster("START_HEATWAVE_CLUSTER"),
    StopHeatwaveCluster("STOP_HEATWAVE_CLUSTER"),
    RestartHeatwaveCluster("RESTART_HEATWAVE_CLUSTER"),
    GenerateHeatwaveClusterMemoryEstimate("GENERATE_HEATWAVE_CLUSTER_MEMORY_ESTIMATE"),
    CreateReplica("CREATE_REPLICA"),
    UpdateReplica("UPDATE_REPLICA"),
    DeleteReplica("DELETE_REPLICA"),
    CreateChannel("CREATE_CHANNEL"),
    UpdateChannel("UPDATE_CHANNEL"),
    ResumeChannel("RESUME_CHANNEL"),
    ResetChannel("RESET_CHANNEL"),
    DeleteChannel("DELETE_CHANNEL"),
    CopyBackup("COPY_BACKUP"),
    CreateBackup("CREATE_BACKUP"),
    DeleteBackup("DELETE_BACKUP"),
    UpdateBackup("UPDATE_BACKUP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestOperationType.class);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationType v : WorkRequestOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
