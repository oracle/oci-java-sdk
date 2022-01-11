/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public enum OperationType {
    EnableDatabaseInsight("ENABLE_DATABASE_INSIGHT"),
    DisableDatabaseInsight("DISABLE_DATABASE_INSIGHT"),
    UpdateDatabaseInsight("UPDATE_DATABASE_INSIGHT"),
    CreateDatabaseInsight("CREATE_DATABASE_INSIGHT"),
    MoveDatabaseInsight("MOVE_DATABASE_INSIGHT"),
    DeleteDatabaseInsight("DELETE_DATABASE_INSIGHT"),
    CreateEnterpriseManagerBridge("CREATE_ENTERPRISE_MANAGER_BRIDGE"),
    UdpateEnterpriseManagerBridge("UDPATE_ENTERPRISE_MANAGER_BRIDGE"),
    MoveEnterpriseManagerBridge("MOVE_ENTERPRISE_MANAGER_BRIDGE"),
    DeleteEnterpriseManagerBridge("DELETE_ENTERPRISE_MANAGER_BRIDGE"),
    EnableHostInsight("ENABLE_HOST_INSIGHT"),
    DisableHostInsight("DISABLE_HOST_INSIGHT"),
    UpdateHostInsight("UPDATE_HOST_INSIGHT"),
    CreateHostInsight("CREATE_HOST_INSIGHT"),
    MoveHostInsight("MOVE_HOST_INSIGHT"),
    DeleteHostInsight("DELETE_HOST_INSIGHT"),
    CreateExadataInsight("CREATE_EXADATA_INSIGHT"),
    EnableExadataInsight("ENABLE_EXADATA_INSIGHT"),
    DisableExadataInsight("DISABLE_EXADATA_INSIGHT"),
    UpdateExadataInsight("UPDATE_EXADATA_INSIGHT"),
    MoveExadataInsight("MOVE_EXADATA_INSIGHT"),
    DeleteExadataInsight("DELETE_EXADATA_INSIGHT"),
    AddExadataInsightMembers("ADD_EXADATA_INSIGHT_MEMBERS"),
    ExadataAutoSync("EXADATA_AUTO_SYNC"),
    UpdateOpsiWarehouse("UPDATE_OPSI_WAREHOUSE"),
    CreateOpsiWarehouse("CREATE_OPSI_WAREHOUSE"),
    MoveOpsiWarehouse("MOVE_OPSI_WAREHOUSE"),
    DeleteOpsiWarehouse("DELETE_OPSI_WAREHOUSE"),
    RotateOpsiWarehouseWallet("ROTATE_OPSI_WAREHOUSE_WALLET"),
    UpdateOpsiWarehouseUser("UPDATE_OPSI_WAREHOUSE_USER"),
    CreateOpsiWarehouseUser("CREATE_OPSI_WAREHOUSE_USER"),
    MoveOpsiWarehouseUser("MOVE_OPSI_WAREHOUSE_USER"),
    DeleteOpsiWarehouseUser("DELETE_OPSI_WAREHOUSE_USER"),
    UpdateAwrhub("UPDATE_AWRHUB"),
    CreateAwrhub("CREATE_AWRHUB"),
    MoveAwrhub("MOVE_AWRHUB"),
    DeleteAwrhub("DELETE_AWRHUB"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

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
