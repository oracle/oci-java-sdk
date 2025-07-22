/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The category of the Named credential property value. CLEAR_TEXT indicates the value field
 * contains a clear text value. SECRET_IDENTIFIER indicates the value field contains a vault secret
 * ocid identifier. ADB_IDENTIFIER indicates the value field contains an Autonomous database ocid
 * identifier. ALLOWED_VALUE indicates the value should be selected from the options in the
 * allowedValues field.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum ValueCategoryType implements com.oracle.bmc.http.internal.BmcEnum {
    ClearText("CLEAR_TEXT"),
    SecretIdentifier("SECRET_IDENTIFIER"),
    AdbIdentifier("ADB_IDENTIFIER"),
    AllowedValue("ALLOWED_VALUE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ValueCategoryType.class);

    private final String value;
    private static java.util.Map<String, ValueCategoryType> map;

    static {
        map = new java.util.HashMap<>();
        for (ValueCategoryType v : ValueCategoryType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ValueCategoryType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ValueCategoryType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ValueCategoryType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
