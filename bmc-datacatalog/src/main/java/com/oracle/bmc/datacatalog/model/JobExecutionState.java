/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
    ;

    private final String value;
    private static java.util.Map<String, JobExecutionState> map;

    static {
        map = new java.util.HashMap<>();
        for (JobExecutionState v : JobExecutionState.values()) {
            map.put(v.getValue(), v);
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
        throw new RuntimeException("Invalid JobExecutionState: " + key);
    }
}
