/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Types of NAT action support for NATv4 type NAT.
 *
 * <p>DIPP_SRC_NAT - Dynamic-ip-port source NAT.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum NatV4ActionType implements com.oracle.bmc.http.internal.BmcEnum {
    DippSrcNat("DIPP_SRC_NAT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NatV4ActionType.class);

    private final String value;
    private static java.util.Map<String, NatV4ActionType> map;

    static {
        map = new java.util.HashMap<>();
        for (NatV4ActionType v : NatV4ActionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NatV4ActionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NatV4ActionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'NatV4ActionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
