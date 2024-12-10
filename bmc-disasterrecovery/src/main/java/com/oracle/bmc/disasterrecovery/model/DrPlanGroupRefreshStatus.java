/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The refresh status of a DR plan group.
 * - GROUP_ADDED - DR plan group was added to the plan.
 * - GROUP_DELETED - DR plan group was deleted from the plan.
 * - GROUP_MODIFIED - DR plan group was modified.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanGroupRefreshStatus {
    GroupAdded("GROUP_ADDED"),
    GroupDeleted("GROUP_DELETED"),
    GroupModified("GROUP_MODIFIED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanGroupRefreshStatus.class);

    private final String value;
    private static java.util.Map<String, DrPlanGroupRefreshStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanGroupRefreshStatus v : DrPlanGroupRefreshStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanGroupRefreshStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanGroupRefreshStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanGroupRefreshStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
