/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the publisher category to which a publication can belong. The publisher
 * category informs where the listing appears for use.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum ListingType implements com.oracle.bmc.http.internal.BmcEnum {
    Community("COMMUNITY"),
    Partner("PARTNER"),
    Private("PRIVATE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListingType.class);

    private final String value;
    private static java.util.Map<String, ListingType> map;

    static {
        map = new java.util.HashMap<>();
        for (ListingType v : ListingType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ListingType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ListingType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ListingType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
