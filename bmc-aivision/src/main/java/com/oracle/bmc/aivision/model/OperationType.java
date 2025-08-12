/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateProject("CREATE_PROJECT"),
    UpdateProject("UPDATE_PROJECT"),
    DeleteProject("DELETE_PROJECT"),
    MoveProject("MOVE_PROJECT"),
    CreateModel("CREATE_MODEL"),
    UpdateModel("UPDATE_MODEL"),
    DeleteModel("DELETE_MODEL"),
    MoveModel("MOVE_MODEL"),
    AddStreamSource("ADD_STREAM_SOURCE"),
    UpdateStreamSource("UPDATE_STREAM_SOURCE"),
    DeleteStreamSource("DELETE_STREAM_SOURCE"),
    MoveStreamSource("MOVE_STREAM_SOURCE"),
    CreateStreamJob("CREATE_STREAM_JOB"),
    DeleteStreamJob("DELETE_STREAM_JOB"),
    UpdateStreamJob("UPDATE_STREAM_JOB"),
    StartStreamJob("START_STREAM_JOB"),
    StopStreamJob("STOP_STREAM_JOB"),
    MoveStreamJob("MOVE_STREAM_JOB"),
    AddStreamGroup("ADD_STREAM_GROUP"),
    UpdateStreamGroup("UPDATE_STREAM_GROUP"),
    DeleteStreamGroup("DELETE_STREAM_GROUP"),
    CreateVisionPrivateEndpoint("CREATE_VISION_PRIVATE_ENDPOINT"),
    UpdateVisionPrivateEndpoint("UPDATE_VISION_PRIVATE_ENDPOINT"),
    DeleteVisionPrivateEndpoint("DELETE_VISION_PRIVATE_ENDPOINT"),
    MoveVisionPrivateEndpoint("MOVE_VISION_PRIVATE_ENDPOINT"),

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
