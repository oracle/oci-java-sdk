/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Possible Batching Strategy types to specify during an update Exadata Fleet Update Cycle operation.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum UpdateBatchingStrategies {
    Sequential("SEQUENTIAL"),
    FiftyFifty("FIFTY_FIFTY"),
    ServiceAvailabilityFactor("SERVICE_AVAILABILITY_FACTOR"),
    NonRolling("NON_ROLLING"),
    None("NONE"),
    ;

    private final String value;
    private static java.util.Map<String, UpdateBatchingStrategies> map;

    static {
        map = new java.util.HashMap<>();
        for (UpdateBatchingStrategies v : UpdateBatchingStrategies.values()) {
            map.put(v.getValue(), v);
        }
    }

    UpdateBatchingStrategies(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static UpdateBatchingStrategies create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid UpdateBatchingStrategies: " + key);
    }
}
