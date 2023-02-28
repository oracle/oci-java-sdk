/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The way in which this resource is affected by the work tracked in the work request. A resource
 * being created, updated, or deleted will remain in the IN_PROGRESS state until work is complete
 * for that resource at which point it will transition to CREATED, UPDATED, or DELETED,
 * respectively.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum WorkRequestResourceActionType implements com.oracle.bmc.http.internal.BmcEnum {
    Created("CREATED"),
    Updated("UPDATED"),
    Deleted("DELETED"),
    InProgress("IN_PROGRESS"),
    Related("RELATED"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestResourceActionType.class);

    private final String value;
    private static java.util.Map<String, WorkRequestResourceActionType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestResourceActionType v : WorkRequestResourceActionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestResourceActionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestResourceActionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestResourceActionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
