/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.extern.slf4j.Slf4j
public enum WorkRequestOperationType {
    CreateDbsystem("CREATE_DBSYSTEM"),
    UpdateDbsystem("UPDATE_DBSYSTEM"),
    DeleteDbsystem("DELETE_DBSYSTEM"),
    StartDbsystem("START_DBSYSTEM"),
    StopDbsystem("STOP_DBSYSTEM"),
    RestartDbsystem("RESTART_DBSYSTEM"),
    AddAnalyticsCluster("ADD_ANALYTICS_CLUSTER"),
    UpdateAnalyticsCluster("UPDATE_ANALYTICS_CLUSTER"),
    DeleteAnalyticsCluster("DELETE_ANALYTICS_CLUSTER"),
    StartAnalyticsCluster("START_ANALYTICS_CLUSTER"),
    StopAnalyticsCluster("STOP_ANALYTICS_CLUSTER"),
    RestartAnalyticsCluster("RESTART_ANALYTICS_CLUSTER"),
    GenerateAnalyticsClusterMemoryEstimate("GENERATE_ANALYTICS_CLUSTER_MEMORY_ESTIMATE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

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
