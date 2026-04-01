/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.model;

/**
 * Enrichment job type. Currently supported Full Build (All supported objects in a given schema) and Partial Build (Selected tables and/or supported objects in a given schema).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public enum EnrichmentJobType {
    FullBuild("FULL_BUILD"),
    PartialBuild("PARTIAL_BUILD"),
    DeltaRefresh("DELTA_REFRESH"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EnrichmentJobType.class);

    private final String value;
    private static java.util.Map<String, EnrichmentJobType> map;

    static {
        map = new java.util.HashMap<>();
        for (EnrichmentJobType v : EnrichmentJobType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    EnrichmentJobType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EnrichmentJobType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'EnrichmentJobType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
