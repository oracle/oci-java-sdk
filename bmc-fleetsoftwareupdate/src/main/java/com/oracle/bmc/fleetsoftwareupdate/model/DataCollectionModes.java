/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Maintenance Cycle incident logs and trace collection operation modes.
 *   ENABLE: Enable diagnostics log collection for all targets for easy troubleshooting and Oracle support for
 *   this Exadata Fleet Update Maintenance Cycle and future Exadata Fleet Update Actions.
 *   ENABLE_AND_RESTORE: Enable diagnostic log collection for all targets only for the current Exadata Fleet Update Maintenance Cycle.
 *   After cycle finishes, log collection settings will go back to the settings prior to the start of the Exadata Fleet Update Maintenance Cycle.
 *   NO_CHANGE: Use existing diagnostic log collection settings on each VM Cluster.
 *   Collect logs for targets with diagnostic log collection for targets with log collection already enabled.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum DataCollectionModes {
    Enable("ENABLE"),
    EnableAndRestore("ENABLE_AND_RESTORE"),
    NoChange("NO_CHANGE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataCollectionModes.class);

    private final String value;
    private static java.util.Map<String, DataCollectionModes> map;

    static {
        map = new java.util.HashMap<>();
        for (DataCollectionModes v : DataCollectionModes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DataCollectionModes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataCollectionModes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DataCollectionModes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
