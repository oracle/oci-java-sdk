/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Possible lifecycle states of a DR Plan Execution. - ACCEPTED - DR Plan Execution has been
 * accepted. - IN_PROGRESS - DR Plan Execution is in progress. - WAITING - DR Plan Execution is
 * waiting for user action. - CANCELING - DR Plan Execution is being canceled. - CANCELED - DR Plan
 * Execution has been canceled. - SUCCEEDED - DR Plan Execution has succeeded. - FAILED - DR Plan
 * Execution has failed. - DELETING - DR Plan Execution is being deleted. - DELETED - DR Plan
 * Execution has been deleted. - PAUSING - DR Plan Execution is being paused. - PAUSED - DR Plan
 * Execution has been paused. - RESUMING - DR Plan Execution is resuming.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrPlanExecutionLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
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
