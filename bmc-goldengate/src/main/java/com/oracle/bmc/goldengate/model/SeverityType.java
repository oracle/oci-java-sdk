/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Message severity of GoldenGate APIs called for a step in a recipe.
 * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum SeverityType {
    Info("INFO"),
    Error("ERROR"),
    Warning("WARNING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SeverityType.class);

    private final String value;
    private static java.util.Map<String, SeverityType> map;

    static {
        map = new java.util.HashMap<>();
        for (SeverityType v : SeverityType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SeverityType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SeverityType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SeverityType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
