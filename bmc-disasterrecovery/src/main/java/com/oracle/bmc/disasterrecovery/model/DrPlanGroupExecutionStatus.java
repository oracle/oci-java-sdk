/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Possible execution statuses for a DR Plan Group. - QUEUED - DR Plan Group execution has been
 * queued. - DISABLED - DR Plan Group execution has been disabled. - IN_PROGRESS - DR Plan Group
 * execution is in progress. - SUCCEEDED - DR Plan Group execution has succeeded. -
 * SUCCEEDED_WITH_WARNING - DR Plan Group execution has succeeded, but with warnings. - FAILED - DR
 * Plan Group execution has failed. - FAILED_IGNORED - DR Plan Group execution has failed, but was
 * ignored. - TIMED_OUT - DR Plan Group execution has timed out. - TIMED_OUT_IGNORED - DR Plan Group
 * execution has timed out, but was ignored. - PAUSED - DR Plan Group execution is paused. -
 * CANCELED - DR Plan Group execution has been canceled.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanGroupExecutionStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Queued("QUEUED"),
    Disabled("DISABLED"),
    InProgress("IN_PROGRESS"),
    Succeeded("SUCCEEDED"),
    SucceededWithWarning("SUCCEEDED_WITH_WARNING"),
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
            org.slf4j.LoggerFactory.getLogger(DrPlanGroupExecutionStatus.class);

    private final String value;
    private static java.util.Map<String, DrPlanGroupExecutionStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanGroupExecutionStatus v : DrPlanGroupExecutionStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanGroupExecutionStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanGroupExecutionStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanGroupExecutionStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
