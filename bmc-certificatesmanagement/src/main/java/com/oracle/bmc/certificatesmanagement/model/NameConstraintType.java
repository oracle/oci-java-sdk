/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The type of name constraint. A directory name constraint specifies restrictions on any subject
 * fields. A DNS address name constraint or IP address name constraint specifies restrictions on the
 * common name in the subject field and on the subject alternative name.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum NameConstraintType implements com.oracle.bmc.http.internal.BmcEnum {
    DirectoryName("DIRECTORY_NAME"),
    Dns("DNS"),
    Ip("IP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NameConstraintType.class);

    private final String value;
    private static java.util.Map<String, NameConstraintType> map;

    static {
        map = new java.util.HashMap<>();
        for (NameConstraintType v : NameConstraintType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NameConstraintType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NameConstraintType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'NameConstraintType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
