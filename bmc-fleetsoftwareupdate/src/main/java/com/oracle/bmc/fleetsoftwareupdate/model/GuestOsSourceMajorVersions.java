/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Possible source major versions for a GUEST_OS Exadata Fleet Update Collection. Major Versions of
 * Exadata Software are demarcated by the underlying OS version. For more details, refer to [Oracle
 * document
 * 2075007.1](https://support.oracle.com/knowledge/Oracle%20Database%20Products/2075007_1.html)
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum GuestOsSourceMajorVersions implements com.oracle.bmc.http.internal.BmcEnum {
    ExaOl5("EXA_OL_5"),
    ExaOl6("EXA_OL_6"),
    ExaOl7("EXA_OL_7"),
    ExaOl8("EXA_OL_8"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GuestOsSourceMajorVersions.class);

    private final String value;
    private static java.util.Map<String, GuestOsSourceMajorVersions> map;

    static {
        map = new java.util.HashMap<>();
        for (GuestOsSourceMajorVersions v : GuestOsSourceMajorVersions.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    GuestOsSourceMajorVersions(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GuestOsSourceMajorVersions create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'GuestOsSourceMajorVersions', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
