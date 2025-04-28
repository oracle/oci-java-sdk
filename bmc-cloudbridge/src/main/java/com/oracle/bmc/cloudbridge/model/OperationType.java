/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
    CreateEnvironment("CREATE_ENVIRONMENT"),
    UpdateEnvironment("UPDATE_ENVIRONMENT"),
    DeleteEnvironment("DELETE_ENVIRONMENT"),
    MoveEnvironment("MOVE_ENVIRONMENT"),
    CreateOcbAgent("CREATE_OCB_AGENT"),
    UpdateOcbAgent("UPDATE_OCB_AGENT"),
    DeleteOcbAgent("DELETE_OCB_AGENT"),
    MoveOcbAgent("MOVE_OCB_AGENT"),
    CreateAgentDependency("CREATE_AGENT_DEPENDENCY"),
    UpdateAgentDependency("UPDATE_AGENT_DEPENDENCY"),
    DeleteAgentDependency("DELETE_AGENT_DEPENDENCY"),
    MoveAgentDependency("MOVE_AGENT_DEPENDENCY"),
    CreateInventory("CREATE_INVENTORY"),
    DeleteInventory("DELETE_INVENTORY"),
    ImportInventory("IMPORT_INVENTORY"),
    DeleteAssetSource("DELETE_ASSET_SOURCE"),
    RefreshAssetSource("REFRESH_ASSET_SOURCE"),
    CreateAssetSource("CREATE_ASSET_SOURCE"),
    UpdateAssetSource("UPDATE_ASSET_SOURCE"),
    UpdatePluginState("UPDATE_PLUGIN_STATE"),
    CloudAwsDiscovery("CLOUD_AWS_DISCOVERY"),
    CollectAwsRealtimeMetrics("COLLECT_AWS_REALTIME_METRICS"),
    CollectAwsHistoricalMetrics("COLLECT_AWS_HISTORICAL_METRICS"),

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
