/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * The state of the configuration: 1. *VALID* configuration is valid and usable 2. *INVALID*
 * configuration has compilation errors and is not usable
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public enum UnifiedAgentServiceConfigurationStates implements com.oracle.bmc.http.internal.BmcEnum {
    Valid("VALID"),
    Invalid("INVALID"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UnifiedAgentServiceConfigurationStates.class);

    private final String value;
    private static java.util.Map<String, UnifiedAgentServiceConfigurationStates> map;

    static {
        map = new java.util.HashMap<>();
        for (UnifiedAgentServiceConfigurationStates v :
                UnifiedAgentServiceConfigurationStates.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    UnifiedAgentServiceConfigurationStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static UnifiedAgentServiceConfigurationStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'UnifiedAgentServiceConfigurationStates', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
