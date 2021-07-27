/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * List of additional applicable parameters for any given target language.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SdkLanguageOptionalParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SdkLanguageOptionalParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
        private java.math.BigDecimal maxSize;

        public Builder maxSize(java.math.BigDecimal maxSize) {
            this.maxSize = maxSize;
            this.__explicitlySet__.add("maxSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputType")
        private InputType inputType;

        public Builder inputType(InputType inputType) {
            this.inputType = inputType;
            this.__explicitlySet__.add("inputType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues;

        public Builder allowedValues(
                java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SdkLanguageOptionalParameters build() {
            SdkLanguageOptionalParameters __instance__ =
                    new SdkLanguageOptionalParameters(
                            paramName,
                            displayName,
                            description,
                            isRequired,
                            maxSize,
                            inputType,
                            allowedValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SdkLanguageOptionalParameters o) {
            Builder copiedBuilder =
                    paramName(o.getParamName())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .isRequired(o.getIsRequired())
                            .maxSize(o.getMaxSize())
                            .inputType(o.getInputType())
                            .allowedValues(o.getAllowedValues());

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
     * Name of the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    String paramName;

    /**
     * Display name of the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description for the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Information on whether the parameter is required or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    Boolean isRequired;

    /**
     * Maximum size as input value for this parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
    java.math.BigDecimal maxSize;
    /**
     * The input type for this param.
     * - Input type is ENUM when only specific list of input strings are allowed.
     * - Input type is EMAIL when input type is an email ID.
     * - Input type is URI when input type is an URI.
     * - Input type is STRING in all other cases.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InputType {
        Enum("ENUM"),
        Email("EMAIL"),
        Uri("URI"),
        String("STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InputType> map;

        static {
            map = new java.util.HashMap<>();
            for (InputType v : InputType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InputType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The input type for this param.
     * - Input type is ENUM when only specific list of input strings are allowed.
     * - Input type is EMAIL when input type is an email ID.
     * - Input type is URI when input type is an URI.
     * - Input type is STRING in all other cases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputType")
    InputType inputType;

    /**
     * List of allowed input values.
     * Example: {@code [{"name": "name1", "description": "description1"}, ...]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
