/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * A parameter to a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ParameterDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ParameterDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private Integer minLength;

        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private Integer maxLength;

        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private Direction direction;

        public Builder direction(Direction direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uiPlacementHint")
        private String uiPlacementHint;

        public Builder uiPlacementHint(String uiPlacementHint) {
            this.uiPlacementHint = uiPlacementHint;
            this.__explicitlySet__.add("uiPlacementHint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMetadata")
        private Object resourceTypeMetadata;

        public Builder resourceTypeMetadata(Object resourceTypeMetadata) {
            this.resourceTypeMetadata = resourceTypeMetadata;
            this.__explicitlySet__.add("resourceTypeMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParameterDefinition build() {
            ParameterDefinition __instance__ =
                    new ParameterDefinition(
                            name,
                            type,
                            description,
                            isRequired,
                            isSensitive,
                            defaultValue,
                            minLength,
                            maxLength,
                            pattern,
                            direction,
                            uiPlacementHint,
                            resourceTypeMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterDefinition o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .type(o.getType())
                            .description(o.getDescription())
                            .isRequired(o.getIsRequired())
                            .isSensitive(o.getIsSensitive())
                            .defaultValue(o.getDefaultValue())
                            .minLength(o.getMinLength())
                            .maxLength(o.getMaxLength())
                            .pattern(o.getPattern())
                            .direction(o.getDirection())
                            .uiPlacementHint(o.getUiPlacementHint())
                            .resourceTypeMetadata(o.getResourceTypeMetadata());

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
     * The name of the parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * Enumerated parameter type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        String("STRING"),
        Uri("URI"),
        Url("URL"),
        Number("NUMBER"),

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
     * Enumerated parameter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * Description of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Is this parameter required. Ignored for parameters with direction = OUTPUT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    Boolean isRequired;

    /**
     * Is the data for this parameter sensitive (e.g. should the data be hidden in UI, encrypted if stored, etc.)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    Boolean isSensitive;

    /**
     * Default value for the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    String defaultValue;

    /**
     * Used for character string types such as STRING to constrain the length of the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    Integer minLength;

    /**
     * Used for character string types such as STRING to constrain the length of the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    Integer maxLength;

    /**
     * Regular expression used to validate the value of a string type such as STRING
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    String pattern;
    /**
     * Is this parameter an input parameter, output parameter, or both?
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Direction {
        Input("INPUT"),
        Output("OUTPUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Direction> map;

        static {
            map = new java.util.HashMap<>();
            for (Direction v : Direction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Direction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Direction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Direction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Is this parameter an input parameter, output parameter, or both?
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    Direction direction;

    /**
     * A forward-slash-delimited 'path' in an imaginary hierarchy, at which this parameter's UI widgets should be placed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiPlacementHint")
    String uiPlacementHint;

    /**
     * Any configuration needed to help the resource type process this parameter (e.g. link to manifest, etc.).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMetadata")
    Object resourceTypeMetadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
