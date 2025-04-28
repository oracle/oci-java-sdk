/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/** The field used to sort JmsPlugins. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum JmsPluginSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    Id("id"),
    TimeLastSeen("timeLastSeen"),
    TimeRegistered("timeRegistered"),
    Hostname("hostname"),
    AgentId("agentId"),
    AgentType("agentType"),
    LifecycleState("lifecycleState"),
    AvailabilityStatus("availabilityStatus"),
    FleetId("fleetId"),
    CompartmentId("compartmentId"),
    OsFamily("osFamily"),
    OsArchitecture("osArchitecture"),
    OsDistribution("osDistribution"),
    PluginVersion("pluginVersion"),
    ;

    private final String value;
    private static java.util.Map<String, JmsPluginSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (JmsPluginSortBy v : JmsPluginSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    JmsPluginSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JmsPluginSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid JmsPluginSortBy: " + key);
    }
}
