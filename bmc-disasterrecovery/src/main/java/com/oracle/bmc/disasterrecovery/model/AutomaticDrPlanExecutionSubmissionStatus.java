/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The status of most recent attempt to submit Automatic DR plan execution. -
 * AUTOMATIC_DR_EXECUTION_STARTED_SUCCESSFULLY - Event processed and Automatic DR execution was
 * started successfully. - AUTOMATIC_DR_EXECUTION_BLOCKED_VALIDATION_FAILED - Event processed but
 * Automatic DR execution submission failed due to validation error.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum AutomaticDrPlanExecutionSubmissionStatus
        implements com.oracle.bmc.http.internal.BmcEnum {
    AutomaticDrExecutionStartedSuccessfully("AUTOMATIC_DR_EXECUTION_STARTED_SUCCESSFULLY"),
    AutomaticDrExecutionBlockedValidationFailed("AUTOMATIC_DR_EXECUTION_BLOCKED_VALIDATION_FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutomaticDrPlanExecutionSubmissionStatus.class);

    private final String value;
    private static java.util.Map<String, AutomaticDrPlanExecutionSubmissionStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (AutomaticDrPlanExecutionSubmissionStatus v :
                AutomaticDrPlanExecutionSubmissionStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AutomaticDrPlanExecutionSubmissionStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AutomaticDrPlanExecutionSubmissionStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AutomaticDrPlanExecutionSubmissionStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
