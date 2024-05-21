/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Possible data masking categories.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public enum DataMaskCategory {
    Actor("ACTOR"),
    Pii("PII"),
    Phi("PHI"),
    Financial("FINANCIAL"),
    Location("LOCATION"),
    Custom("CUSTOM"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataMaskCategory.class);

    private final String value;
    private static java.util.Map<String, DataMaskCategory> map;

    static {
        map = new java.util.HashMap<>();
        for (DataMaskCategory v : DataMaskCategory.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DataMaskCategory(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataMaskCategory create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DataMaskCategory', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
