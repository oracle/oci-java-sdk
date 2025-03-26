/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Common execution states for jobs in data catalog.
 * CREATED     - Job has been created but yet to start execution. It will transition to IN_PROGRESS when resources are available for execution.
 * IN_PROGRESS - Job is currently executing.
 * INACTIVE    - Job has been paused by the worker. This could be due to resource contention or window management.
 * FAILED      - Job has failed due to errors during execution.
 * SUCCEEDED   - Job has successfully completed execution.
 * CANCELED    - Job has been aborted by the worker due to a user request.
 * SUCCEEDED_WITH_WARNINGS - Job has successfully completed execution with one or more warnings.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum JobExecutionState {
    Created("CREATED"),
    InProgress("IN_PROGRESS"),
    Inactive("INACTIVE"),
    Failed("FAILED"),
    Succeeded("SUCCEEDED"),
    Canceled("CANCELED"),
    SucceededWithWarnings("SUCCEEDED_WITH_WARNINGS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JobExecutionState.class);

    private final String value;
    private static java.util.Map<String, JobExecutionState> map;

    static {
        map = new java.util.HashMap<>();
        for (JobExecutionState v : JobExecutionState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    JobExecutionState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobExecutionState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'JobExecutionState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
