/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum OperationType {
    CreateDiscovery("CREATE_DISCOVERY"),
    DeleteDiscovery("DELETE_DISCOVERY"),
    CreateCollection("CREATE_COLLECTION"),
    UpdateCollection("UPDATE_COLLECTION"),
    DeleteCollection("DELETE_COLLECTION"),
    MoveCollection("MOVE_COLLECTION"),
    AddTargetsToCollection("ADD_TARGETS_TO_COLLECTION"),
    RemoveTargetsInCollection("REMOVE_TARGETS_IN_COLLECTION"),
    CreateMaintenanceCycle("CREATE_MAINTENANCE_CYCLE"),
    UpdateMaintenanceCycle("UPDATE_MAINTENANCE_CYCLE"),
    DeleteMaintenanceCycle("DELETE_MAINTENANCE_CYCLE"),
    MoveMaintenanceCycle("MOVE_MAINTENANCE_CYCLE"),
    CloneMaintenanceCycle("CLONE_MAINTENANCE_CYCLE"),
    CreateAction("CREATE_ACTION"),
    UpdateAction("UPDATE_ACTION"),
    DeleteAction("DELETE_ACTION"),
    MoveAction("MOVE_ACTION"),
    PatchAction("PATCH_ACTION"),
    CleanupAction("CLEANUP_ACTION"),
    RollbackAndRemoveAction("ROLLBACK_AND_REMOVE_ACTION"),
    ApplyAction("APPLY_ACTION"),
    PrecheckAction("PRECHECK_ACTION"),
    StageAction("STAGE_ACTION"),

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
