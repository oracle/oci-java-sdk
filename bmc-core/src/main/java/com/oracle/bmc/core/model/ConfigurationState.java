/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The current state of the host configuration. The Host is either CONFORMANT - current state
 * matches the desired configuration NON_CONFORMANT - current state does not match the desired
 * configuration PRE_APPLYING, APPLYING, CHECKING - transitional states UNKNOWN - current state is
 * unknown
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum ConfigurationState implements com.oracle.bmc.http.internal.BmcEnum {
    Conformant("CONFORMANT"),
    NonConformant("NON_CONFORMANT"),
    Checking("CHECKING"),
    PreApplying("PRE_APPLYING"),
    Applying("APPLYING"),
    Unknown("UNKNOWN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigurationState.class);

    private final String value;
    private static java.util.Map<String, ConfigurationState> map;

    static {
        map = new java.util.HashMap<>();
        for (ConfigurationState v : ConfigurationState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ConfigurationState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ConfigurationState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ConfigurationState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
