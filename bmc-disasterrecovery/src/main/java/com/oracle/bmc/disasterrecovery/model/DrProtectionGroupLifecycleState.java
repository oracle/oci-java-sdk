/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Possible lifecycle states of a DR Protection Group. - CREATING - DR Protection Group is being
 * created. - ACTIVE - DR Protection Group is active and available for operations. - UPDATING - DR
 * Protection Group is being updated and is not available for operations. - NEEDS_ATTENTION - DR
 * Protection Group needs user attention. - DELETING - DR Protection Group is being deleted. -
 * DELETED - DR Protection Group has been deleted. - FAILED - DR Protection Group is in a failed
 * state.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
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
