/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/** The asynchronous operation tracked by the work request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateBatchContext("CREATE_BATCH_CONTEXT"),
    UpdateBatchContext("UPDATE_BATCH_CONTEXT"),
    DeleteBatchContext("DELETE_BATCH_CONTEXT"),
    StartBatchContext("START_BATCH_CONTEXT"),
    StopBatchContext("STOP_BATCH_CONTEXT"),
    MoveBatchContext("MOVE_BATCH_CONTEXT"),
    CreateBatchJob("CREATE_BATCH_JOB"),
    UpdateBatchJob("UPDATE_BATCH_JOB"),
    DeleteBatchJob("DELETE_BATCH_JOB"),
    MoveBatchJob("MOVE_BATCH_JOB"),
    PauseBatchJob("PAUSE_BATCH_JOB"),
    UnpauseBatchJob("UNPAUSE_BATCH_JOB"),
    MoveBatchJobPool("MOVE_BATCH_JOB_POOL"),
    UpdateBatchJobPool("UPDATE_BATCH_JOB_POOL"),
    StartBatchJobPool("START_BATCH_JOB_POOL"),
    StopBatchJobPool("STOP_BATCH_JOB_POOL"),
    MoveBatchTaskEnvironment("MOVE_BATCH_TASK_ENVIRONMENT"),
    MoveBatchTaskProfile("MOVE_BATCH_TASK_PROFILE"),
    Internal("INTERNAL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
