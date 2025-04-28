/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * Common lifecycle states for resources in a Sql Endpoint: CREATING - The resource is being created
 * and might not be usable until the entire metadata is defined. ACTIVE - The resource is valid and
 * available for access. DELETING - The resource is being deleted, and might require a deep clean of
 * any children. DELETED - The resource has been deleted, and isn't available. FAILED - The resource
 * is in a failed state due to validation or other errors. UPDATING - The resource is being updated
 * and might not be usable until all changes are commited. NEEDS_ATTENTION - The resource needs
 * customer/operator intervention.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public enum SqlEndpointLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Active("ACTIVE"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),
    Updating("UPDATING"),
    NeedsAttention("NEEDS_ATTENTION"),
    Inactive("INACTIVE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SqlEndpointLifecycleState.class);

    private final String value;
    private static java.util.Map<String, SqlEndpointLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (SqlEndpointLifecycleState v : SqlEndpointLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SqlEndpointLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SqlEndpointLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SqlEndpointLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
