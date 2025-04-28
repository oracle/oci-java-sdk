/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/** Possible types of criteria to use for a Exadata Fleet Update Discovery. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum DiscoveryCriteria implements com.oracle.bmc.http.internal.BmcEnum {
    SearchQuery("SEARCH_QUERY"),
    Filters("FILTERS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiscoveryCriteria.class);

    private final String value;
    private static java.util.Map<String, DiscoveryCriteria> map;

    static {
        map = new java.util.HashMap<>();
        for (DiscoveryCriteria v : DiscoveryCriteria.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DiscoveryCriteria(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DiscoveryCriteria create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DiscoveryCriteria', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
