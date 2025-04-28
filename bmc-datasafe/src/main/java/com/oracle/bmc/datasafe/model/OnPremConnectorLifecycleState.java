/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/** The current state of the on-premises connector. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum OnPremConnectorLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),
    NeedsAttention("NEEDS_ATTENTION"),
    ;

    private final String value;
    private static java.util.Map<String, OnPremConnectorLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (OnPremConnectorLifecycleState v : OnPremConnectorLifecycleState.values()) {
            map.put(v.getValue(), v);
        }
    }

    OnPremConnectorLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OnPremConnectorLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OnPremConnectorLifecycleState: " + key);
    }
}
