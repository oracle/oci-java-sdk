/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Origin type for the given rule. SOURCE - Represents rule is harvested and is as defined in source
 * system. USER - Represents user defined rules at data catalog system. PROFILING - Represents rules
 * which are inferred via profiling.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum RuleOriginType implements com.oracle.bmc.http.internal.BmcEnum {
    Source("SOURCE"),
    User("USER"),
    Profiling("PROFILING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RuleOriginType.class);

    private final String value;
    private static java.util.Map<String, RuleOriginType> map;

    static {
        map = new java.util.HashMap<>();
        for (RuleOriginType v : RuleOriginType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RuleOriginType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RuleOriginType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RuleOriginType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
