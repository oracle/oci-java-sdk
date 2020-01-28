/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Harvest state of the object indicates the completeness of the metadata definition of the object in the catalog.
 * COMPLETE   - The object's metadata is harvested successfully including properties, relationships, and its children.
 * ERROR      - There is an error during the harvest process. This could be due to failure in the harvest process, or
 *              invalid or currupted data.
 * IN-PROGRESS - The harvest is currently in progress. This might imply a successful shallow harvest and a deep harvest
 *              is currently in progress.
 * DEFERRED   - The dependencies are incomplete and the resolution of the metadata is deferred until all information
 *              is available for the object.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum HarvestStatus {
    Complete("COMPLETE"),
    Error("ERROR"),
    InProgress("IN_PROGRESS"),
    Deferred("DEFERRED"),
    ;

    private final String value;
    private static java.util.Map<String, HarvestStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (HarvestStatus v : HarvestStatus.values()) {
            map.put(v.getValue(), v);
        }
    }

    HarvestStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static HarvestStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid HarvestStatus: " + key);
    }
}
