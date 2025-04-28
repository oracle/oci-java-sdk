/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/** The layer 3 IP MTU to use with this virtual circuit. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum VirtualCircuitIpMtu implements com.oracle.bmc.http.internal.BmcEnum {
    Mtu1500("MTU_1500"),
    Mtu9000("MTU_9000"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VirtualCircuitIpMtu.class);

    private final String value;
    private static java.util.Map<String, VirtualCircuitIpMtu> map;

    static {
        map = new java.util.HashMap<>();
        for (VirtualCircuitIpMtu v : VirtualCircuitIpMtu.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    VirtualCircuitIpMtu(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static VirtualCircuitIpMtu create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'VirtualCircuitIpMtu', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
