/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/** The valid set of Parameter types. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public enum ParameterType implements com.oracle.bmc.http.internal.BmcEnum {
    String("STRING"),
    Integer("INTEGER"),
    Float("FLOAT"),
    Boolean("BOOLEAN"),
    Secure("SECURE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ParameterType.class);

    private final String value;
    private static java.util.Map<String, ParameterType> map;

    static {
        map = new java.util.HashMap<>();
        for (ParameterType v : ParameterType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ParameterType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ParameterType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ParameterType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
