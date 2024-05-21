/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * Specifies which tag value types in the {@code tagValues} field result in overrides of the recommendation criteria. Allowed values are {@code ANY} and {@code VALUE}.
 * <p>
 * When the {@code tagValueType} field value is {@code ANY}, the {@code tagValues} field should be empty, which enforces overrides to the recommendation for resources with any tag values attached to them.
 * When the {@code tagValueType} field value is {@code VALUE}, the {@code tagValues} field must include a specific value or list of values. Overrides to the recommendation criteria only occur for resources that match the values in the {@code tagKey} and the {@code tagValues} fields.
 * <p>
 * For example, if the {@code tagKey} value is {@code B}, the {@code tagValueType} value is {@code ANY}, and the {@code tagValues} field is empty, overrides to the recommendation criteria occur for any resources that have the tag key B.
 * If the {@code tagKey} value is {@code B}, the {@code tagValueType} value is {@code VALUE}, and the {@code tagValues} value is {@code s1}, overrides to the recommendation criteria only occur for resources that have the tag key B with the associated tag value s1.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public enum TagValueType {
    Value("VALUE"),
    Any("ANY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TagValueType.class);

    private final String value;
    private static java.util.Map<String, TagValueType> map;

    static {
        map = new java.util.HashMap<>();
        for (TagValueType v : TagValueType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TagValueType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TagValueType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TagValueType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
