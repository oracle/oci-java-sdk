/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The lifecycle state of the target database group. - CREATING - The target database group is
 * currently being created. - UPDATING - The target database group is being updated. - ACTIVE - The
 * target database group has been successfully created. - DELETING - The target database group is in
 * the process of being deleted. - DELETED - The target database group has been successfully
 * deleted. - FAILED - The target database group creation or update has failed. - NEEDS_ATTENTION -
 * The target database group requires user attention.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum TargetDatabaseGroupLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
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
            org.slf4j.LoggerFactory.getLogger(TargetDatabaseGroupLifecycleState.class);

    private final String value;
    private static java.util.Map<String, TargetDatabaseGroupLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (TargetDatabaseGroupLifecycleState v : TargetDatabaseGroupLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TargetDatabaseGroupLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TargetDatabaseGroupLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TargetDatabaseGroupLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
