/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * The set of supported indicator types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public enum IndicatorType {
    DomainName("DOMAIN_NAME"),
    FileName("FILE_NAME"),
    Md5Hash("MD5_HASH"),
    Sha1Hash("SHA1_HASH"),
    Sha256Hash("SHA256_HASH"),
    IpAddress("IP_ADDRESS"),
    Url("URL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IndicatorType.class);

    private final String value;
    private static java.util.Map<String, IndicatorType> map;

    static {
        map = new java.util.HashMap<>();
        for (IndicatorType v : IndicatorType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    IndicatorType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static IndicatorType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'IndicatorType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
