/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The lifecycle states of a DR protection group.
 * - CREATING - DR protection group is being created.
 * - ACTIVE - DR protection group is active and available for operations.
 * - UPDATING - DR protection group is being updated and is not available for operations.
 * - INACTIVE - The DR protection group is locked because a DR Drill is in progress.
 * - NEEDS_ATTENTION - DR protection group needs user attention.
 * - DELETING - DR protection group is being deleted.
 * - DELETED - DR protection group has been deleted.
 * - FAILED - DR protection group is in a failed state.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupLifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
    Inactive("INACTIVE"),
    NeedsAttention("NEEDS_ATTENTION"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrProtectionGroupLifecycleState.class);

    private final String value;
    private static java.util.Map<String, DrProtectionGroupLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (DrProtectionGroupLifecycleState v : DrProtectionGroupLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrProtectionGroupLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrProtectionGroupLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrProtectionGroupLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
