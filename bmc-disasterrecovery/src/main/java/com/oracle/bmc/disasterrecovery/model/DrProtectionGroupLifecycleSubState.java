/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The secondary lifecycle states of a DR protection group. Provides information in addition to the
 * lifecycle state. - DR_DRILL_IN_PROGRESS - A DR Drill is in progress.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupLifecycleSubState implements com.oracle.bmc.http.internal.BmcEnum {
    DrDrillInProgress("DR_DRILL_IN_PROGRESS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrProtectionGroupLifecycleSubState.class);

    private final String value;
    private static java.util.Map<String, DrProtectionGroupLifecycleSubState> map;

    static {
        map = new java.util.HashMap<>();
        for (DrProtectionGroupLifecycleSubState v : DrProtectionGroupLifecycleSubState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrProtectionGroupLifecycleSubState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrProtectionGroupLifecycleSubState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrProtectionGroupLifecycleSubState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
