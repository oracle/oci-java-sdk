/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The lifecycle states of a DR plan execution.
 * - ACCEPTED - DR plan execution has been accepted.
 * - IN_PROGRESS - DR plan execution is in progress.
 * - WAITING - DR plan execution is waiting for user action.
 * - CANCELING - DR plan execution is being canceled.
 * - CANCELED - DR plan execution has been canceled.
 * - SUCCEEDED - DR plan execution has succeeded.
 * - FAILED - DR plan execution has failed.
 * - DELETING - DR plan execution is being deleted.
 * - DELETED - DR plan execution has been deleted.
 * - PAUSING - DR plan execution is being paused.
 * - PAUSED - DR plan execution has been paused.
 * - RESUMING - DR plan execution is resuming.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanExecutionLifecycleState {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Waiting("WAITING"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),
    Succeeded("SUCCEEDED"),
    Failed("FAILED"),
    Deleting("DELETING"),
    Deleted("DELETED"),
    Pausing("PAUSING"),
    Paused("PAUSED"),
    Resuming("RESUMING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrPlanExecutionLifecycleState.class);

    private final String value;
    private static java.util.Map<String, DrPlanExecutionLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (DrPlanExecutionLifecycleState v : DrPlanExecutionLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrPlanExecutionLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrPlanExecutionLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrPlanExecutionLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
