/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Common lifecycle states for resources in data catalog:
 * CREATING - The resource is being created and may not be usable until the entire metadata is defined.
 * UPDATING - The resource is being updated and may not be usable until all changes are commited.
 * DELETING - The resource is being deleted and might require deep cleanup of children.
 * ACTIVE   - The resource is valid and available for access.
 * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
 *            administrative reasons.
 * DELETED  - The resource has been deleted and isn't available.
 * FAILED   - The resource is in a failed state due to validation or other errors.
 * MOVING   - The resource is being moved to another compartment (action changeCompartment)
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.extern.slf4j.Slf4j
public enum LifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Updating("UPDATING"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),
    Moving("MOVING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, LifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (LifecycleState v : LifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    LifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
