/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The resources affected by this work request.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public enum OperationType {
    CreateModel("CREATE_MODEL"),
    DeleteModel("DELETE_MODEL"),
    MoveModel("MOVE_MODEL"),
    CreateDedicatedAiCluster("CREATE_DEDICATED_AI_CLUSTER"),
    DeleteDedicatedAiCluster("DELETE_DEDICATED_AI_CLUSTER"),
    UpdateDedicatedAiCluster("UPDATE_DEDICATED_AI_CLUSTER"),
    MoveDedicatedAiCluster("MOVE_DEDICATED_AI_CLUSTER"),
    CreateEndpoint("CREATE_ENDPOINT"),
    DeleteEndpoint("DELETE_ENDPOINT"),
    UpdateEndpoint("UPDATE_ENDPOINT"),
    MoveEndpoint("MOVE_ENDPOINT"),

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
