/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/** Applicable severity types are critical, high, medium, low, info and none. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public enum ResourcesSeverities implements com.oracle.bmc.http.internal.BmcEnum {
    Critical("CRITICAL"),
    High("HIGH"),
    Medium("MEDIUM"),
    Low("LOW"),
    Info("INFO"),
    None("NONE"),
    ;

    private final String value;
    private static java.util.Map<String, ResourcesSeverities> map;

    static {
        map = new java.util.HashMap<>();
        for (ResourcesSeverities v : ResourcesSeverities.values()) {
            map.put(v.getValue(), v);
        }
    }

    ResourcesSeverities(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResourcesSeverities create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ResourcesSeverities: " + key);
    }
}
