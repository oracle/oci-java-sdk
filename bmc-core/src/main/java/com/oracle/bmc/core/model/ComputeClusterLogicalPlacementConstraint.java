/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The logical placement strategy to apply for compute cluster placement. Allowed values are {@code
 * SINGLE_TIER}, {@code SINGLE_BLOCK}, and {@code PACKED_DISTRIBUTION_MULTI_BLOCK}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum ComputeClusterLogicalPlacementConstraint
        implements com.oracle.bmc.http.internal.BmcEnum {
    SingleTier("SINGLE_TIER"),
    SingleBlock("SINGLE_BLOCK"),
    PackedDistributionMultiBlock("PACKED_DISTRIBUTION_MULTI_BLOCK"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeClusterLogicalPlacementConstraint.class);

    private final String value;
    private static java.util.Map<String, ComputeClusterLogicalPlacementConstraint> map;

    static {
        map = new java.util.HashMap<>();
        for (ComputeClusterLogicalPlacementConstraint v :
                ComputeClusterLogicalPlacementConstraint.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ComputeClusterLogicalPlacementConstraint(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ComputeClusterLogicalPlacementConstraint create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ComputeClusterLogicalPlacementConstraint', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
