/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Contains field schema information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FieldInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FieldInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldInfo build() {
            FieldInfo __instance__ = new FieldInfo(fieldName, fieldType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldInfo o) {
            Builder copiedBuilder = fieldName(o.getFieldName()).fieldType(o.getFieldType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Field name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;
    /**
     * Field type -
     * * `STRING`: A sequence of characters.
     * * `NUMBER`: Numeric type which can be an integer or floating point.
     * * `BOOLEAN`: Either true or false.
     * * `ARRAY`: An ordered collection of values.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum FieldType {
        String("STRING"),
        Number("NUMBER"),
        Boolean("BOOLEAN"),
        Array("ARRAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, FieldType> map;

        static {
            map = new java.util.HashMap<>();
            for (FieldType v : FieldType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FieldType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FieldType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Field type -
     * * `STRING`: A sequence of characters.
     * * `NUMBER`: Numeric type which can be an integer or floating point.
     * * `BOOLEAN`: Either true or false.
     * * `ARRAY`: An ordered collection of values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    FieldType fieldType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
