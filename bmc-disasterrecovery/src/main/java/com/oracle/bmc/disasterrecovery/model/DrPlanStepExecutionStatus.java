/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Possible execution statuses for a DR Plan Step. - QUEUED - DR Plan Step execution has been
 * queued. - DISABLED - DR Plan Step execution has been disabled. - IN_PROGRESS - DR Plan Step
 * execution is in progress. - SUCCEEDED - DR Plan Step execution has succeeded. - FAILED - DR Plan
 * Step execution has failed. - FAILED_IGNORED - DR Plan Step execution has failed, but was ignored.
 * - TIMED_OUT - DR Plan Step execution has timed out. - TIMED_OUT_IGNORED - DR Plan Step execution
 * has timed out, but was ignored. - PAUSED - DR Plan Step execution has paused. - CANCELED - DR
 * Plan Step execution has been canceled.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanStepExecutionStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Queued("QUEUED"),
    Disabled("DISABLED"),
    InProgress("IN_PROGRESS"),
    Succeeded("SUCCEEDED"),
    Failed("FAILED"),
    FailedIgnored("FAILED_IGNORED"),
    TimedOut("TIMED_OUT"),
    TimedOutIgnored("TIMED_OUT_IGNORED"),
    Paused("PAUSED"),
    Canceled("CANCELED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanStepExecutionStatus.class);

    private final String value;
    private static java.util.Map<String, DrPlanStepExecutionStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanStepExecutionStatus v : DrPlanStepExecutionStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanStepExecutionStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanStepExecutionStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanStepExecutionStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
