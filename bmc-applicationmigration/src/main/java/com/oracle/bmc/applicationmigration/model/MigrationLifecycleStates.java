/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Resource lifecycle state
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public enum MigrationLifecycleStates {
    Creating("CREATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Updating("UPDATING"),
    Succeeded("SUCCEEDED"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    ;

    private final String value;
    private static java.util.Map<String, MigrationLifecycleStates> map;

    static {
        map = new java.util.HashMap<>();
        for (MigrationLifecycleStates v : MigrationLifecycleStates.values()) {
            map.put(v.getValue(), v);
        }
    }

    MigrationLifecycleStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MigrationLifecycleStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid MigrationLifecycleStates: " + key);
    }
}
