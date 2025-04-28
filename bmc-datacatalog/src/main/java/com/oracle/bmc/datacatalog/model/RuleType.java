/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of rule as described below. PRIMARYKEY - Primary key constraint defined in the source
 * database. FOREIGNKEY - Foreign key constraint defined in the source database. UNIQUEKEY - Unique
 * key constraint defined in the source database.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum RuleType implements com.oracle.bmc.http.internal.BmcEnum {
    Primarykey("PRIMARYKEY"),
    Foreignkey("FOREIGNKEY"),
    Uniquekey("UNIQUEKEY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RuleType.class);

    private final String value;
    private static java.util.Map<String, RuleType> map;

    static {
        map = new java.util.HashMap<>();
        for (RuleType v : RuleType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RuleType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RuleType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RuleType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
