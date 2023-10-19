/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Type of address List. The accepted values are - * FQDN - An address list which contains Fully
 * Qualified Domain Names as elements. * IP - - An address list which contains IP Addresses as
 * elements.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum AddressListType implements com.oracle.bmc.http.internal.BmcEnum {
    Fqdn("FQDN"),
    Ip("IP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AddressListType.class);

    private final String value;
    private static java.util.Map<String, AddressListType> map;

    static {
        map = new java.util.HashMap<>();
        for (AddressListType v : AddressListType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AddressListType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AddressListType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AddressListType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
