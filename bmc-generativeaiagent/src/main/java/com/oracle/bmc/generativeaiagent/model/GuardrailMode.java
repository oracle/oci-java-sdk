/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/** Configuration setting applied to determine the guardrail mode for input or output. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public enum GuardrailMode implements com.oracle.bmc.http.internal.BmcEnum {
    Disable("DISABLE"),
    Block("BLOCK"),
    Inform("INFORM"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GuardrailMode.class);

    private final String value;
    private static java.util.Map<String, GuardrailMode> map;

    static {
        map = new java.util.HashMap<>();
        for (GuardrailMode v : GuardrailMode.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    GuardrailMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GuardrailMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'GuardrailMode', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
