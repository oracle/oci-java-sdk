/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/** Address type of the CIDR/IP within a VCN or subnet */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum AddressType implements com.oracle.bmc.http.internal.BmcEnum {
    PrivateIPv4("Private_IPv4"),
    OracleAllocatedPublicIPv4("Oracle_Allocated_Public_IPv4"),
    ByoipIPv4("BYOIP_IPv4"),
    UlaIPv6("ULA_IPv6"),
    OracleAllocatedGuaIPv6("Oracle_Allocated_GUA_IPv6"),
    ByoipIPv6("BYOIP_IPv6"),
    ;

    private final String value;
    private static java.util.Map<String, AddressType> map;

    static {
        map = new java.util.HashMap<>();
        for (AddressType v : AddressType.values()) {
            map.put(v.getValue(), v);
        }
    }

    AddressType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AddressType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AddressType: " + key);
    }
}
