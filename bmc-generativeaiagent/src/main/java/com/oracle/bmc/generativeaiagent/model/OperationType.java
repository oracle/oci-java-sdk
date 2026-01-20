/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/** The asynchronous operation tracked by the work request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateAgent("CREATE_AGENT"),
    UpdateAgent("UPDATE_AGENT"),
    DeleteAgent("DELETE_AGENT"),
    MoveAgent("MOVE_AGENT"),
    CreateAgentEndpoint("CREATE_AGENT_ENDPOINT"),
    UpdateAgentEndpoint("UPDATE_AGENT_ENDPOINT"),
    DeleteAgentEndpoint("DELETE_AGENT_ENDPOINT"),
    MoveAgentEndpoint("MOVE_AGENT_ENDPOINT"),
    CreateDataSource("CREATE_DATA_SOURCE"),
    UpdateDataSource("UPDATE_DATA_SOURCE"),
    DeleteDataSource("DELETE_DATA_SOURCE"),
    CreateKnowledgeBase("CREATE_KNOWLEDGE_BASE"),
    UpdateKnowledgeBase("UPDATE_KNOWLEDGE_BASE"),
    DeleteKnowledgeBase("DELETE_KNOWLEDGE_BASE"),
    MoveKnowledgeBase("MOVE_KNOWLEDGE_BASE"),
    CreateDataIngestionJob("CREATE_DATA_INGESTION_JOB"),
    DeleteDataIngestionJob("DELETE_DATA_INGESTION_JOB"),
    CreateTool("CREATE_TOOL"),
    UpdateTool("UPDATE_TOOL"),
    DeleteTool("DELETE_TOOL"),
    CreateProvisionedCapacity("CREATE_PROVISIONED_CAPACITY"),
    UpdateProvisionedCapacity("UPDATE_PROVISIONED_CAPACITY"),
    DeleteProvisionedCapacity("DELETE_PROVISIONED_CAPACITY"),
    MoveProvisionedCapacity("MOVE_PROVISIONED_CAPACITY"),

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
