/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public enum GdpOperationType {
    CreateGdpPipeline("CREATE_GDP_PIPELINE"),
    StartGdpPipeline("START_GDP_PIPELINE"),
    StopGdpPipeline("STOP_GDP_PIPELINE"),
    UpdateGdpPipeline("UPDATE_GDP_PIPELINE"),
    DeleteGdpPipeline("DELETE_GDP_PIPELINE"),
    PeerGdpPipeline("PEER_GDP_PIPELINE"),
    MoveGdpPipeline("MOVE_GDP_PIPELINE"),
    RotateGdpPipelineKeys("ROTATE_GDP_PIPELINE_KEYS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GdpOperationType.class);

    private final String value;
    private static java.util.Map<String, GdpOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (GdpOperationType v : GdpOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    GdpOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GdpOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'GdpOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
