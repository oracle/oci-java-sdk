/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public enum OperationType {
    CreateMigration("CREATE_MIGRATION"),
    UpdateMigration("UPDATE_MIGRATION"),
    RefreshMigration("REFRESH_MIGRATION"),
    DeleteMigration("DELETE_MIGRATION"),
    MoveMigration("MOVE_MIGRATION"),
    StartAssetReplication("START_ASSET_REPLICATION"),
    StartMigrationReplication("START_MIGRATION_REPLICATION"),
    CreateReplicationSchedule("CREATE_REPLICATION_SCHEDULE"),
    UpdateReplicationSchedule("UPDATE_REPLICATION_SCHEDULE"),
    DeleteReplicationSchedule("DELETE_REPLICATION_SCHEDULE"),
    MoveReplicationSchedule("MOVE_REPLICATION_SCHEDULE"),
    CreateMigrationPlan("CREATE_MIGRATION_PLAN"),
    UpdateMigrationPlan("UPDATE_MIGRATION_PLAN"),
    DeleteMigrationPlan("DELETE_MIGRATION_PLAN"),
    MoveMigrationPlan("MOVE_MIGRATION_PLAN"),
    RefreshMigrationPlan("REFRESH_MIGRATION_PLAN"),
    ExecuteMigrationPlan("EXECUTE_MIGRATION_PLAN"),
    RefreshMigrationAsset("REFRESH_MIGRATION_ASSET"),
    CreateMigrationAsset("CREATE_MIGRATION_ASSET"),
    DeleteMigrationAsset("DELETE_MIGRATION_ASSET"),
    CreateTargetAsset("CREATE_TARGET_ASSET"),
    UpdateTargetAsset("UPDATE_TARGET_ASSET"),
    DeleteTargetAsset("DELETE_TARGET_ASSET"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
