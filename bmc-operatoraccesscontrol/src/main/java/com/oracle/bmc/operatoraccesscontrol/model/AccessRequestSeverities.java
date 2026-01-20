/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/** Levels of priorities associated with an access request */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum AccessRequestSeverities implements com.oracle.bmc.http.internal.BmcEnum {
    S1("S1"),
    S2("S2"),
    S3("S3"),
    S4("S4"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AccessRequestSeverities.class);

    private final String value;
    private static java.util.Map<String, AccessRequestSeverities> map;

    static {
        map = new java.util.HashMap<>();
        for (AccessRequestSeverities v : AccessRequestSeverities.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AccessRequestSeverities(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AccessRequestSeverities create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AccessRequestSeverities', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
