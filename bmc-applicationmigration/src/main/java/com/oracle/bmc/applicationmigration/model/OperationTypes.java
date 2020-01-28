/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public enum OperationTypes {
    CreateSource("CREATE_SOURCE"),
    UpdateSource("UPDATE_SOURCE"),
    DeleteSource("DELETE_SOURCE"),
    CreateMigration("CREATE_MIGRATION"),
    UpdateMigration("UPDATE_MIGRATION"),
    DeleteMigration("DELETE_MIGRATION"),
    AuthorizeSource("AUTHORIZE_SOURCE"),
    DiscoverApplication("DISCOVER_APPLICATION"),
    MigrateApplication("MIGRATE_APPLICATION"),
    ChangeSourceCompartment("CHANGE_SOURCE_COMPARTMENT"),
    ChangeMigrationCompartment("CHANGE_MIGRATION_COMPARTMENT"),
    ;

    private final String value;
    private static java.util.Map<String, OperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationTypes v : OperationTypes.values()) {
            map.put(v.getValue(), v);
        }
    }

    OperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid OperationTypes: " + key);
    }
}
