/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The refresh status of a DR plan step.
 * - STEP_ADDED - DR plan step was added to the group.
 * - STEP_DELETED - DR plan step was deleted from the group.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanStepRefreshStatus {
    StepAdded("STEP_ADDED"),
    StepDeleted("STEP_DELETED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanStepRefreshStatus.class);

    private final String value;
    private static java.util.Map<String, DrPlanStepRefreshStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanStepRefreshStatus v : DrPlanStepRefreshStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanStepRefreshStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanStepRefreshStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanStepRefreshStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
