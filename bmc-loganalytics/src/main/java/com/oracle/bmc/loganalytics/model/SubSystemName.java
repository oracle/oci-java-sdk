/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Each subsystem has its own namespace for fields it contains. This means two fields in different
 * subsystems can have the same name; for example, log.status and security.status refer to two
 * different fields. The subsystem parameter identifies the default subsystem to use when
 * validating/querying a field that is not explicitly qualified by its subsystem.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum SubSystemName implements com.oracle.bmc.http.internal.BmcEnum {
    Log("LOG"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubSystemName.class);

    private final String value;
    private static java.util.Map<String, SubSystemName> map;

    static {
        map = new java.util.HashMap<>();
        for (SubSystemName v : SubSystemName.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SubSystemName(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SubSystemName create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SubSystemName', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
