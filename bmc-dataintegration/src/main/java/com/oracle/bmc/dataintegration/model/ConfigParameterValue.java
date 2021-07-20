/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Contains the parameter configuration values.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigParameterValue.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ConfigParameterValue {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
        private String stringValue;

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            this.__explicitlySet__.add("stringValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intValue")
        private Integer intValue;

        public Builder intValue(Integer intValue) {
            this.intValue = intValue;
            this.__explicitlySet__.add("intValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
        private Object objectValue;

        public Builder objectValue(Object objectValue) {
            this.objectValue = objectValue;
            this.__explicitlySet__.add("objectValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refValue")
        private Object refValue;

        public Builder refValue(Object refValue) {
            this.refValue = refValue;
            this.__explicitlySet__.add("refValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
        private String parameterValue;

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            this.__explicitlySet__.add("parameterValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
        private Object rootObjectValue;

        public Builder rootObjectValue(Object rootObjectValue) {
            this.rootObjectValue = rootObjectValue;
            this.__explicitlySet__.add("rootObjectValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigParameterValue build() {
            ConfigParameterValue __instance__ =
                    new ConfigParameterValue(
                            stringValue,
                            intValue,
                            objectValue,
                            refValue,
                            parameterValue,
                            rootObjectValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigParameterValue o) {
            Builder copiedBuilder =
                    stringValue(o.getStringValue())
                            .intValue(o.getIntValue())
                            .objectValue(o.getObjectValue())
                            .refValue(o.getRefValue())
                            .parameterValue(o.getParameterValue())
                            .rootObjectValue(o.getRootObjectValue());

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
     * A string value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
    String stringValue;

    /**
     * An integer value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intValue")
    Integer intValue;

    /**
     * An object value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
    Object objectValue;

    /**
     * The root object reference value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refValue")
    Object refValue;

    /**
     * Reference to the parameter by its key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
    String parameterValue;

    /**
     * The root object value, used in custom parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
    Object rootObjectValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
