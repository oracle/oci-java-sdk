/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/** The family that the compute shape belongs to. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public enum ModelDeploymentShapeSeries implements com.oracle.bmc.http.internal.BmcEnum {
    AmdRome("AMD_ROME"),
    IntelSkylake("INTEL_SKYLAKE"),
    NvidiaGpu("NVIDIA_GPU"),
    Generic("GENERIC"),
    Legacy("LEGACY"),
    Arm("ARM"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ModelDeploymentShapeSeries.class);

    private final String value;
    private static java.util.Map<String, ModelDeploymentShapeSeries> map;

    static {
        map = new java.util.HashMap<>();
        for (ModelDeploymentShapeSeries v : ModelDeploymentShapeSeries.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ModelDeploymentShapeSeries(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ModelDeploymentShapeSeries create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ModelDeploymentShapeSeries', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
