/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The secondary lifecycle states of a DR plan. Provides information in addition to the lifecycle state.
 * - NEEDS_REFRESH - The DR plan needs a refresh.
 * - NEEDS_VERIFICATION - The DR plan needs verification.
 * - REFRESHING - The DR plan is being updated due to a plan refresh.
 * - VERIFYING - The DR plan is being updated due to a plan verification.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanLifecycleSubState {
    NeedsRefresh("NEEDS_REFRESH"),
    NeedsVerification("NEEDS_VERIFICATION"),
    Refreshing("REFRESHING"),
    Verifying("VERIFYING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanLifecycleSubState.class);

    private final String value;
    private static java.util.Map<String, DrPlanLifecycleSubState> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanLifecycleSubState v : DrPlanLifecycleSubState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanLifecycleSubState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanLifecycleSubState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanLifecycleSubState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
