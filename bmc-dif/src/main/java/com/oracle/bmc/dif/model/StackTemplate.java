/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/** Template for the stack */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
public enum StackTemplate implements com.oracle.bmc.http.internal.BmcEnum {
    Datalake("DATALAKE"),
    Datapipeline("DATAPIPELINE"),
    Aiservices("AISERVICES"),
    Datatransformation("DATATRANSFORMATION"),
    Devopstoolkit("DEVOPSTOOLKIT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StackTemplate.class);

    private final String value;
    private static java.util.Map<String, StackTemplate> map;

    static {
        map = new java.util.HashMap<>();
        for (StackTemplate v : StackTemplate.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    StackTemplate(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StackTemplate create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'StackTemplate', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
