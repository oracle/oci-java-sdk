/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The secondary lifecycle states of an Automatic DR configuration. Provides information in addition
 * to the lifecycle state. - RESOURCE_PRINCIPAL_VALIDATION_FAILED - Resource principal validation
 * has failed. - DR_PLAN_NEEDS_ATTENTION - One or more default DR Plans associated with this
 * Automatic DR configuration are not in an 'Active' state. - DR_PLAN_INACTIVE - One or more default
 * DR Plans associated with this Automatic DR configuration are in an 'Inactive' state.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutomaticDrConfigurationLifecycleSubState
        implements com.oracle.bmc.http.internal.BmcEnum {
    ResourcePrincipalValidationFailed("RESOURCE_PRINCIPAL_VALIDATION_FAILED"),
    DrPlanNeedsAttention("DR_PLAN_NEEDS_ATTENTION"),
    DrPlanInactive("DR_PLAN_INACTIVE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutomaticDrConfigurationLifecycleSubState.class);

    private final String value;
    private static java.util.Map<String, AutomaticDrConfigurationLifecycleSubState> map;

    static {
        map = new java.util.HashMap<>();
        for (AutomaticDrConfigurationLifecycleSubState v :
                AutomaticDrConfigurationLifecycleSubState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutomaticDrConfigurationLifecycleSubState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutomaticDrConfigurationLifecycleSubState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutomaticDrConfigurationLifecycleSubState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
