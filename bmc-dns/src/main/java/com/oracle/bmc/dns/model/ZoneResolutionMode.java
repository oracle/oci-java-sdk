/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The resolution mode of a zone defines behavior related to how query responses can be handled.
 * <p>
 * Static - This is the default behavior.
 * Transparent - Continue resolution if, and only if, the response is NXDOMAIN for any domain or NODATA at the apex.
 *   Only supported for private zones.
 * RTypeTransparent - Continue resolution if, and only if, the response is NXDOMAIN or NODATA. Only supported for
 *   private zones.
 * <p>
 * For private DNS, continue resolution means moving on to the next evaluation for the resolver following the normal
 * sequence for checking query resolution.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public enum ZoneResolutionMode {
    Static("STATIC"),
    Transparent("TRANSPARENT"),
    RtypeTransparent("RTYPE_TRANSPARENT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ZoneResolutionMode.class);

    private final String value;
    private static java.util.Map<String, ZoneResolutionMode> map;

    static {
        map = new java.util.HashMap<>();
        for (ZoneResolutionMode v : ZoneResolutionMode.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ZoneResolutionMode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ZoneResolutionMode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ZoneResolutionMode', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
