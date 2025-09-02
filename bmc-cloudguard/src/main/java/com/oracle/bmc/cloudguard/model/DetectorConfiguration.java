/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Configuration details for a detector. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetectorConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectorConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "configKey",
        "name",
        "value",
        "dataType",
        "values",
        "allowedValuesDataType",
        "allowedValues",
        "additionalProperties"
    })
    public DetectorConfiguration(
            String configKey,
            String name,
            String value,
            String dataType,
            java.util.List<ConfigValue> values,
            String allowedValuesDataType,
            java.util.List<PropertyTuple> allowedValues,
            java.util.List<AdditionalConfigPropertyDefinition> additionalProperties) {
        super();
        this.configKey = configKey;
        this.name = name;
        this.value = value;
        this.dataType = dataType;
        this.values = values;
        this.allowedValuesDataType = allowedValuesDataType;
        this.allowedValues = allowedValues;
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of the configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("configKey")
        private String configKey;

        /**
         * Unique identifier of the configuration
         *
         * @param configKey the value to set
         * @return this builder
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            this.__explicitlySet__.add("configKey");
            return this;
        }
        /** Configuration name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Configuration name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Configuration value */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Configuration value
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Configuration data type */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Configuration data type
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** List of configuration values */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<ConfigValue> values;

        /**
         * List of configuration values
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<ConfigValue> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** Map property Value data type */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValuesDataType")
        private String allowedValuesDataType;

        /**
         * Map property Value data type
         *
         * @param allowedValuesDataType the value to set
         * @return this builder
         */
        public Builder allowedValuesDataType(String allowedValuesDataType) {
            this.allowedValuesDataType = allowedValuesDataType;
            this.__explicitlySet__.add("allowedValuesDataType");
            return this;
        }
        /** Map of possible values for configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<PropertyTuple> allowedValues;

        /**
         * Map of possible values for configuration
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(java.util.List<PropertyTuple> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** Map of additional property values for configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
        private java.util.List<AdditionalConfigPropertyDefinition> additionalProperties;

        /**
         * Map of additional property values for configuration
         *
         * @param additionalProperties the value to set
         * @return this builder
         */
        public Builder additionalProperties(
                java.util.List<AdditionalConfigPropertyDefinition> additionalProperties) {
            this.additionalProperties = additionalProperties;
            this.__explicitlySet__.add("additionalProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorConfiguration build() {
            DetectorConfiguration model =
                    new DetectorConfiguration(
                            this.configKey,
                            this.name,
                            this.value,
                            this.dataType,
                            this.values,
                            this.allowedValuesDataType,
                            this.allowedValues,
                            this.additionalProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorConfiguration model) {
            if (model.wasPropertyExplicitlySet("configKey")) {
                this.configKey(model.getConfigKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("allowedValuesDataType")) {
                this.allowedValuesDataType(model.getAllowedValuesDataType());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("additionalProperties")) {
                this.additionalProperties(model.getAdditionalProperties());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique identifier of the configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("configKey")
    private final String configKey;

    /**
     * Unique identifier of the configuration
     *
     * @return the value
     */
    public String getConfigKey() {
        return configKey;
    }

    /** Configuration name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Configuration name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Configuration value */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Configuration value
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Configuration data type */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Configuration data type
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** List of configuration values */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<ConfigValue> values;

    /**
     * List of configuration values
     *
     * @return the value
     */
    public java.util.List<ConfigValue> getValues() {
        return values;
    }

    /** Map property Value data type */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValuesDataType")
    private final String allowedValuesDataType;

    /**
     * Map property Value data type
     *
     * @return the value
     */
    public String getAllowedValuesDataType() {
        return allowedValuesDataType;
    }

    /** Map of possible values for configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<PropertyTuple> allowedValues;

    /**
     * Map of possible values for configuration
     *
     * @return the value
     */
    public java.util.List<PropertyTuple> getAllowedValues() {
        return allowedValues;
    }

    /** Map of additional property values for configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
    private final java.util.List<AdditionalConfigPropertyDefinition> additionalProperties;

    /**
     * Map of additional property values for configuration
     *
     * @return the value
     */
    public java.util.List<AdditionalConfigPropertyDefinition> getAdditionalProperties() {
        return additionalProperties;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectorConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", allowedValuesDataType=").append(String.valueOf(this.allowedValuesDataType));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", additionalProperties=").append(String.valueOf(this.additionalProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectorConfiguration)) {
            return false;
        }

        DetectorConfiguration other = (DetectorConfiguration) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.allowedValuesDataType, other.allowedValuesDataType)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.additionalProperties, other.additionalProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configKey == null ? 43 : this.configKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValuesDataType == null
                                ? 43
                                : this.allowedValuesDataType.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalProperties == null
                                ? 43
                                : this.additionalProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
