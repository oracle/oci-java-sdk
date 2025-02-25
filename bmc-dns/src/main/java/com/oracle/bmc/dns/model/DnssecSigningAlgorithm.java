/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The signing algorithm that will be used for a {@code DnssecKeyVersion}.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public enum DnssecSigningAlgorithm {
    Rsasha256("RSASHA256"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DnssecSigningAlgorithm.class);

    private final String value;
    private static java.util.Map<String, DnssecSigningAlgorithm> map;

    static {
        map = new java.util.HashMap<>();
        for (DnssecSigningAlgorithm v : DnssecSigningAlgorithm.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DnssecSigningAlgorithm(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DnssecSigningAlgorithm create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DnssecSigningAlgorithm', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
