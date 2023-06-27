/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The type of alert. Stateful alerts are automatically cleared on severity transition to normal.
 * Stateless alerts are never cleared. You can change the alert by setting the examinedBy attribute.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum AlertTypeEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Stateful("STATEFUL"),
    Stateless("STATELESS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AlertTypeEnum.class);

    private final String value;
    private static java.util.Map<String, AlertTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (AlertTypeEnum v : AlertTypeEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AlertTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AlertTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AlertTypeEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
