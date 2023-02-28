/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Enum Representing various data types allowed for the custom property TEXT - String data type
 * RICH_TEXT - Rich text to hold long descriptions and formatted values NUMBER - Numeric Data type
 * BOOLEAN - Boolean type with allowed values of true or false DATE - Date data type
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum CustomPropertyDataType implements com.oracle.bmc.http.internal.BmcEnum {
    Text("TEXT"),
    RichText("RICH_TEXT"),
    Boolean("BOOLEAN"),
    Number("NUMBER"),
    Date("DATE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CustomPropertyDataType.class);

    private final String value;
    private static java.util.Map<String, CustomPropertyDataType> map;

    static {
        map = new java.util.HashMap<>();
        for (CustomPropertyDataType v : CustomPropertyDataType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CustomPropertyDataType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CustomPropertyDataType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CustomPropertyDataType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
