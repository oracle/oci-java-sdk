/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * EARLY - Early update channel recommended for pre-production use. REGULAR - Regular update channel
 * recommended for production use. PHASE_1 - Reserved for future use. PHASE_2 - Reserved for future
 * use.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum UpdateChannel implements com.oracle.bmc.http.internal.BmcEnum {
    Regular("REGULAR"),
    Early("EARLY"),
    Phase2("PHASE_2"),
    Phase1("PHASE_1"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UpdateChannel.class);

    private final String value;
    private static java.util.Map<String, UpdateChannel> map;

    static {
        map = new java.util.HashMap<>();
        for (UpdateChannel v : UpdateChannel.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    UpdateChannel(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static UpdateChannel create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'UpdateChannel', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
