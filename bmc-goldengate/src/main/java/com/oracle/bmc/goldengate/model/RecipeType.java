/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** Possible recipe types for a pipeline. A recipe is a set of steps that run in a sequence. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum RecipeType implements com.oracle.bmc.http.internal.BmcEnum {
    ZeroEtl("ZERO_ETL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RecipeType.class);

    private final String value;
    private static java.util.Map<String, RecipeType> map;

    static {
        map = new java.util.HashMap<>();
        for (RecipeType v : RecipeType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RecipeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RecipeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RecipeType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
