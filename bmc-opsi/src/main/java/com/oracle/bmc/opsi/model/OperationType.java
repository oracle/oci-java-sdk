/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
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
    UpdatePrivateEndpoint("UPDATE_PRIVATE_ENDPOINT"),
    CreatePrivateEndpoint("CREATE_PRIVATE_ENDPOINT"),
    MovePrivateEndpoint("MOVE_PRIVATE_ENDPOINT"),
    DeletePrivateEndpoint("DELETE_PRIVATE_ENDPOINT"),
    ChangePeComanagedDatabaseInsightDetails("CHANGE_PE_COMANAGED_DATABASE_INSIGHT_DETAILS"),
    UpdateOpsiConfiguration("UPDATE_OPSI_CONFIGURATION"),
    CreateOpsiConfiguration("CREATE_OPSI_CONFIGURATION"),
    MoveOpsiConfiguration("MOVE_OPSI_CONFIGURATION"),
    DeleteOpsiConfiguration("DELETE_OPSI_CONFIGURATION"),
    EnableAdbAdvancedFeatures("ENABLE_ADB_ADVANCED_FEATURES"),
    DisableAdbAdvancedFeatures("DISABLE_ADB_ADVANCED_FEATURES"),
    UpdateAdbAdvancedFeatures("UPDATE_ADB_ADVANCED_FEATURES"),
    CreateNewsReport("CREATE_NEWS_REPORT"),
    EnableNewsReport("ENABLE_NEWS_REPORT"),
    DisableNewsReport("DISABLE_NEWS_REPORT"),
    UpdateNewsReport("UPDATE_NEWS_REPORT"),
    MoveNewsReport("MOVE_NEWS_REPORT"),
    DeleteNewsReport("DELETE_NEWS_REPORT"),
    CreateAwrhubSource("CREATE_AWRHUB_SOURCE"),
    DeleteAwrhubSource("DELETE_AWRHUB_SOURCE"),
    UpdateAwrhubSource("UPDATE_AWRHUB_SOURCE"),
    MoveAwrhubSource("MOVE_AWRHUB_SOURCE"),
    EnableAwrhubSource("ENABLE_AWRHUB_SOURCE"),
    DisableAwrhubSource("DISABLE_AWRHUB_SOURCE"),
    ChangeMacsManagedCloudDatabaseInsightConnectionDetails(
            "CHANGE_MACS_MANAGED_CLOUD_DATABASE_INSIGHT_CONNECTION_DETAILS"),
    TestMacsManagedCloudDatabaseInsightConnectionDetails(
            "TEST_MACS_MANAGED_CLOUD_DATABASE_INSIGHT_CONNECTION_DETAILS"),

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
