/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** The type of location used to share Spark application artifacts. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum SparkArtifactLocationType implements com.oracle.bmc.http.internal.BmcEnum {
    OciObjectStorage("OCI_OBJECT_STORAGE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SparkArtifactLocationType.class);

    private final String value;
    private static java.util.Map<String, SparkArtifactLocationType> map;

    static {
        map = new java.util.HashMap<>();
        for (SparkArtifactLocationType v : SparkArtifactLocationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SparkArtifactLocationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SparkArtifactLocationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SparkArtifactLocationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
