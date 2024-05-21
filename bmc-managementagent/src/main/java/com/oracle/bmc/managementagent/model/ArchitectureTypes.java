/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Supported architecture types.
 * X86_64 - Package architecture is x86-64
 * SPARC - Package architecture is SPARC
 * M1 - Package architecture for M1 chipset
 * AARCH64
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum ArchitectureTypes {
    X8664("X86_64"),
    Sparc("SPARC"),
    X86("X86"),
    M1("M1"),
    Aarch64("AARCH64"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ArchitectureTypes.class);

    private final String value;
    private static java.util.Map<String, ArchitectureTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (ArchitectureTypes v : ArchitectureTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ArchitectureTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ArchitectureTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ArchitectureTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
