/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/** The type of work request operation. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum WorkRequestOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateDbManagementPrivateEndpoint("CREATE_DB_MANAGEMENT_PRIVATE_ENDPOINT"),
    DeleteDbManagementPrivateEndpoint("DELETE_DB_MANAGEMENT_PRIVATE_ENDPOINT"),
    CreateDbSystemDiscovery("CREATE_DB_SYSTEM_DISCOVERY"),
    CreateDbSystem("CREATE_DB_SYSTEM"),
    UpdateDbSystem("UPDATE_DB_SYSTEM"),
    DbSystemEnableDbmgmt("DB_SYSTEM_ENABLE_DBMGMT"),
    DbSystemDisableDbmgmt("DB_SYSTEM_DISABLE_DBMGMT"),
    DeleteDbSystem("DELETE_DB_SYSTEM"),
    UpdateExternalDbSystemConnector("UPDATE_EXTERNAL_DB_SYSTEM_CONNECTOR"),
    ChangeExternalDbSystemCompartment("CHANGE_EXTERNAL_DB_SYSTEM_COMPARTMENT"),
    DisableExadataInfrasturcture("DISABLE_EXADATA_INFRASTURCTURE"),
    EnableExadataInfrastructure("ENABLE_EXADATA_INFRASTRUCTURE"),
    DeleteExadataInfrastructure("DELETE_EXADATA_INFRASTRUCTURE"),
    ChangeExadataCompartment("CHANGE_EXADATA_COMPARTMENT"),

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
