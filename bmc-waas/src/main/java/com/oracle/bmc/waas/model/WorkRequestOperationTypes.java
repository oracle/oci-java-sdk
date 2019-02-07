/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * An enum value indicating the operation being performed by the work request.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.extern.slf4j.Slf4j
public enum WorkRequestOperationTypes {
    CreateWaasPolicy("CREATE_WAAS_POLICY"),
    UpdateWaasPolicy("UPDATE_WAAS_POLICY"),
    DeleteWaasPolicy("DELETE_WAAS_POLICY"),
    PurgeWaasPolicy("PURGE_WAAS_POLICY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationTypes v : WorkRequestOperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public static WorkRequestOperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
