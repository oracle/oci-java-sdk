/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/** System Model for Database Infrastructure. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public enum SystemModelEnum implements com.oracle.bmc.http.internal.BmcEnum {
    X11Ha768("X11_HA_768"),
    X10Ha512("X10_HA_512"),
    X8Ha384("X8_HA_384"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SystemModelEnum.class);

    private final String value;
    private static java.util.Map<String, SystemModelEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (SystemModelEnum v : SystemModelEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SystemModelEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SystemModelEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SystemModelEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
