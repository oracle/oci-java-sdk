/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The lifecycle states of an Automatic DR configuration. - CREATING - Automatic DR configuration is
 * being created. - UPDATING - Automatic DR configuration is being updated. - ACTIVE - Automatic DR
 * configuration is active. - INACTIVE - Automatic DR configuration is inactive and is not available
 * for operations. - NEEDS_ATTENTION - Automatic DR configuration needs user attention. - DELETING -
 * Automatic DR configuration is being deleted. - DELETED - Automatic DR configuration has been
 * deleted. - FAILED - Automatic DR configuration creation failed.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutomaticDrConfigurationLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
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
            org.slf4j.LoggerFactory.getLogger(AutomaticDrConfigurationLifecycleState.class);

    private final String value;
    private static java.util.Map<String, AutomaticDrConfigurationLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (AutomaticDrConfigurationLifecycleState v :
                AutomaticDrConfigurationLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutomaticDrConfigurationLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutomaticDrConfigurationLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutomaticDrConfigurationLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
