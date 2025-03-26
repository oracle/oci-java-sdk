/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Monitor type.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum MonitorTypes {
    ScriptedBrowser("SCRIPTED_BROWSER"),
    Browser("BROWSER"),
    ScriptedRest("SCRIPTED_REST"),
    Rest("REST"),
    Network("NETWORK"),
    Dns("DNS"),
    Ftp("FTP"),
    Sql("SQL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MonitorTypes.class);

    private final String value;
    private static java.util.Map<String, MonitorTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (MonitorTypes v : MonitorTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MonitorTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MonitorTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MonitorTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
