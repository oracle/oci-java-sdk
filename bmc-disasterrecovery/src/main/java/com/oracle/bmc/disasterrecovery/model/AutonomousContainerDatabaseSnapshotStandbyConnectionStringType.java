/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The type of connection strings used to connect to an Autonomous Container Database snapshot standby created during a DR Drill operation.
 * See https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html for information about these service types.
 * - SNAPSHOT_SERVICE - Connect to the snapshot standby using new services that are active only in snapshot standby mode.
 * - PRIMARY_SERVICE - Connect to the snapshot standby database using the same services as the primary database.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutonomousContainerDatabaseSnapshotStandbyConnectionStringType {
    SnapshotService("SNAPSHOT_SERVICE"),
    PrimaryService("PRIMARY_SERVICE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    AutonomousContainerDatabaseSnapshotStandbyConnectionStringType.class);

    private final String value;
    private static java.util.Map<
                    String, AutonomousContainerDatabaseSnapshotStandbyConnectionStringType>
            map;

    static {
        map = new java.util.HashMap<>();
        for (AutonomousContainerDatabaseSnapshotStandbyConnectionStringType v :
                AutonomousContainerDatabaseSnapshotStandbyConnectionStringType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutonomousContainerDatabaseSnapshotStandbyConnectionStringType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutonomousContainerDatabaseSnapshotStandbyConnectionStringType create(
            String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutonomousContainerDatabaseSnapshotStandbyConnectionStringType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
