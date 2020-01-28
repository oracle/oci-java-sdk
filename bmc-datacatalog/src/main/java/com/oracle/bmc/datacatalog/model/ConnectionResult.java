/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Result from connection test and validation.
 * SUCCEEDED - The connection is valid and tested successfully.
 * FAILED  - The connection validation failed. This could be due to incorrect or insufficient credentials or invalid connection metadata.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum ConnectionResult {
    Succeeded("SUCCEEDED"),
    Failed("FAILED"),
    ;

    private final String value;
    private static java.util.Map<String, ConnectionResult> map;

    static {
        map = new java.util.HashMap<>();
        for (ConnectionResult v : ConnectionResult.values()) {
            map.put(v.getValue(), v);
        }
    }

    ConnectionResult(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ConnectionResult create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid ConnectionResult: " + key);
    }
}
