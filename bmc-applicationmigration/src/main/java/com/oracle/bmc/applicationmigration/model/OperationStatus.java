/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Possible operation status.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public enum OperationStatus {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Failed("FAILED"),
    Succeeded("SUCCEEDED"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),
    ;

    private final String value;
    private static java.util.Map<String, OperationStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationStatus v : OperationStatus.values()) {
            map.put(v.getValue(), v);
        }
    }

    OperationStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OperationStatus: " + key);
    }
}
