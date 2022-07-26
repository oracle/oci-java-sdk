/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Status of Management Agent Plugin.
 * RUNNING - The plugin is running.
 * STOPPED - The plugin is stopped.
 * INVALID - The plugin status is not recognized.
 * FAILED - The plugin deployment has failed.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum PluginStatus {
    Running("RUNNING"),
    Stopped("STOPPED"),
    Invalid("INVALID"),
    Failed("FAILED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PluginStatus.class);

    private final String value;
    private static java.util.Map<String, PluginStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (PluginStatus v : PluginStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PluginStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PluginStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'PluginStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
