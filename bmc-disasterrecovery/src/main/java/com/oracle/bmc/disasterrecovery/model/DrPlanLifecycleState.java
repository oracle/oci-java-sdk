/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The lifecycle states of a DR plan. - CREATING - DR plan is being created. - UPDATING - DR plan is
 * being updated. - ACTIVE - DR plan is active and available for operations. - INACTIVE - DR plan is
 * inactive and is not available for operations. - DELETING - DR plan is being deleted. - DELETED -
 * DR plan has been deleted. - FAILED - DR plan creation failed. - NEEDS_ATTENTION - DR plan has
 * failed to update.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Failed("FAILED"),
    NeedsAttention("NEEDS_ATTENTION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanLifecycleState.class);

    private final String value;
    private static java.util.Map<String, DrPlanLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanLifecycleState v : DrPlanLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
