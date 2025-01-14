/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Qualitative evaluation of the severity for a vulnerability, from NONE to CRITICAL. Used to
 * configure requests that specify severity requirements, that's why UNSET is also a valid value
 * (unlike in VulnerabilitySeverity).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public enum ConfigSeverity implements com.oracle.bmc.http.internal.BmcEnum {
    Unset("UNSET"),
    None("NONE"),
    Low("LOW"),
    Medium("MEDIUM"),
    High("HIGH"),
    Critical("CRITICAL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigSeverity.class);

    private final String value;
    private static java.util.Map<String, ConfigSeverity> map;

    static {
        map = new java.util.HashMap<>();
        for (ConfigSeverity v : ConfigSeverity.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ConfigSeverity(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ConfigSeverity create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ConfigSeverity', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
