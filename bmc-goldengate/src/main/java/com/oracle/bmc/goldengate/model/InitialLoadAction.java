/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** Action on existing tables, if Initial Load is true. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum InitialLoadAction implements com.oracle.bmc.http.internal.BmcEnum {
    Truncate("TRUNCATE"),
    Replace("REPLACE"),
    Append("APPEND"),
    Skip("SKIP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InitialLoadAction.class);

    private final String value;
    private static java.util.Map<String, InitialLoadAction> map;

    static {
        map = new java.util.HashMap<>();
        for (InitialLoadAction v : InitialLoadAction.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    InitialLoadAction(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InitialLoadAction create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'InitialLoadAction', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
