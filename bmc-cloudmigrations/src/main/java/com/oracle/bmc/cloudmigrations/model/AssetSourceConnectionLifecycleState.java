/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/** Lifecycle state of a connection. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public enum AssetSourceConnectionLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Active("ACTIVE"),
    Updating("UPDATING"),
    NeedsAttention("NEEDS_ATTENTION"),
    Deleted("DELETED"),
    Creating("CREATING"),
    ;

    private final String value;
    private static java.util.Map<String, AssetSourceConnectionLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (AssetSourceConnectionLifecycleState v : AssetSourceConnectionLifecycleState.values()) {
            map.put(v.getValue(), v);
        }
    }

    AssetSourceConnectionLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AssetSourceConnectionLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AssetSourceConnectionLifecycleState: " + key);
    }
}
