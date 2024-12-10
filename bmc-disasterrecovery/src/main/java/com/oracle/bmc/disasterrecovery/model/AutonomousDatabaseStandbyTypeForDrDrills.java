/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * This specifies the mechanism used to create a temporary Autonomous Database instance for DR Drills.
 * See https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-clone-about.html for information about these clone types.
 * See https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/adbsb/autonomous-data-guard-snapshot-standby.html for information about snapshot standby.
 * - FULL_CLONE - Creates a full clone of the source Autonomous Database with read-write access for DR Drill operations.
 * - REFRESHABLE_CLONE - Creates a full clone of the source Autonomous Database with read-only access for DR Drill operations.
 * - SNAPSHOT_STANDBY - Converts the existing standby Autonomous Database to a snapshot standby for DR Drill operations.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutonomousDatabaseStandbyTypeForDrDrills {
    FullClone("FULL_CLONE"),
    RefreshableClone("REFRESHABLE_CLONE"),
    SnapshotStandby("SNAPSHOT_STANDBY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutonomousDatabaseStandbyTypeForDrDrills.class);

    private final String value;
    private static java.util.Map<String, AutonomousDatabaseStandbyTypeForDrDrills> map;

    static {
        map = new java.util.HashMap<>();
        for (AutonomousDatabaseStandbyTypeForDrDrills v :
                AutonomousDatabaseStandbyTypeForDrDrills.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutonomousDatabaseStandbyTypeForDrDrills(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutonomousDatabaseStandbyTypeForDrDrills create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutonomousDatabaseStandbyTypeForDrDrills', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
