/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Possible Exadata Releases. Note that an Exadata Release depends on underlying major Oracle Linux
 * OS version. For example, Exadata Release 21.2 depends on Oracle Linux 7. For more details, refer
 * to [Oracle document
 * 2075007.1](https://support.oracle.com/knowledge/Oracle%20Database%20Products/2075007_1.html)
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public enum ExadataReleaseVersions implements com.oracle.bmc.http.internal.BmcEnum {
    ExaOl5111("EXA_OL_5_11_1"),
    ExaOl5112("EXA_OL_5_11_2"),
    ExaOl5121("EXA_OL_5_12_1"),
    ExaOl6122("EXA_OL_6_12_2"),
    ExaOl6181("EXA_OL_6_18_1"),
    ExaOl7191("EXA_OL_7_19_1"),
    ExaOl7192("EXA_OL_7_19_2"),
    ExaOl7193("EXA_OL_7_19_3"),
    ExaOl7201("EXA_OL_7_20_1"),
    ExaOl7212("EXA_OL_7_21_2"),
    ExaOl7221("EXA_OL_7_22_1"),
    ExaOl8231("EXA_OL_8_23_1"),
    ExaOl8241("EXA_OL_8_24_1"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ExadataReleaseVersions.class);

    private final String value;
    private static java.util.Map<String, ExadataReleaseVersions> map;

    static {
        map = new java.util.HashMap<>();
        for (ExadataReleaseVersions v : ExadataReleaseVersions.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExadataReleaseVersions(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExadataReleaseVersions create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ExadataReleaseVersions', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
