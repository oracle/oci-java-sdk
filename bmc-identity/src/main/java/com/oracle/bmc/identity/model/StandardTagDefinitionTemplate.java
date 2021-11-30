/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StandardTagDefinitionTemplate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StandardTagDefinitionTemplate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
        private java.util.List<String> possibleValues;

        public Builder possibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            this.__explicitlySet__.add("possibleValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
        private Boolean isCostTracking;

        public Builder isCostTracking(Boolean isCostTracking) {
            this.isCostTracking = isCostTracking;
            this.__explicitlySet__.add("isCostTracking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enumMutability")
        private EnumMutability enumMutability;

        public Builder enumMutability(EnumMutability enumMutability) {
            this.enumMutability = enumMutability;
            this.__explicitlySet__.add("enumMutability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandardTagDefinitionTemplate build() {
            StandardTagDefinitionTemplate __instance__ =
                    new StandardTagDefinitionTemplate(
                            description,
                            tagDefinitionName,
                            type,
                            possibleValues,
                            isCostTracking,
                            enumMutability);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardTagDefinitionTemplate o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .tagDefinitionName(o.getTagDefinitionName())
                            .type(o.getType())
                            .possibleValues(o.getPossibleValues())
                            .isCostTracking(o.getIsCostTracking())
                            .enumMutability(o.getEnumMutability());

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
     * The default description of the tag namespace that users can use to create the tag definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The name of this standard tag definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    String tagDefinitionName;
    /**
     * The type of tag definition. Enum or string.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        Enum("ENUM"),
        String("STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of tag definition. Enum or string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * List of possible values. An optional parameter that will be present if the type of definition is enum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
    java.util.List<String> possibleValues;

    /**
     * Is the tag a cost tracking tag. Default will be false as cost tracking tags have been deprecated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
    Boolean isCostTracking;
    /**
     * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EnumMutability {
        Immutable("IMMUTABLE"),
        Mutable("MUTABLE"),
        Appendable("APPENDABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EnumMutability> map;

        static {
            map = new java.util.HashMap<>();
            for (EnumMutability v : EnumMutability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnumMutability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnumMutability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnumMutability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enumMutability")
    EnumMutability enumMutability;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
