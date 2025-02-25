/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SdkLanguageOptionalParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SdkLanguageOptionalParameters
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "paramName",
        "displayName",
        "description",
        "isRequired",
        "maxSize",
        "inputType",
        "allowedValues"
    })
    public SdkLanguageOptionalParameters(
            String paramName,
            String displayName,
            String description,
            Boolean isRequired,
            java.math.BigDecimal maxSize,
            InputType inputType,
            java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues) {
        super();
        this.paramName = paramName;
        this.displayName = displayName;
        this.description = description;
        this.isRequired = isRequired;
        this.maxSize = maxSize;
        this.inputType = inputType;
        this.allowedValues = allowedValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        /**
         * Name of the parameter.
         *
         * @param paramName the value to set
         * @return this builder
         **/
        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }
        /**
         * Display name of the parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the parameter.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description for the parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for the parameter.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Information on whether the parameter is required or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Information on whether the parameter is required or not.
         *
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }
        /**
         * Maximum size as input value for this parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
        private java.math.BigDecimal maxSize;

        /**
         * Maximum size as input value for this parameter.
         *
         * @param maxSize the value to set
         * @return this builder
         **/
        public Builder maxSize(java.math.BigDecimal maxSize) {
            this.maxSize = maxSize;
            this.__explicitlySet__.add("maxSize");
            return this;
        }
        /**
         * The input type for this param.
         * - Input type is ENUM when only specific list of input strings are allowed.
         * - Input type is EMAIL when input type is an email ID.
         * - Input type is URI when input type is an URI.
         * - Input type is STRING in all other cases.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputType")
        private InputType inputType;

        /**
         * The input type for this param.
         * - Input type is ENUM when only specific list of input strings are allowed.
         * - Input type is EMAIL when input type is an email ID.
         * - Input type is URI when input type is an URI.
         * - Input type is STRING in all other cases.
         *
         * @param inputType the value to set
         * @return this builder
         **/
        public Builder inputType(InputType inputType) {
            this.inputType = inputType;
            this.__explicitlySet__.add("inputType");
            return this;
        }
        /**
         * List of allowed input values.
         * Example: {@code [{"name": "name1", "description": "description1"}, ...]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues;

        /**
         * List of allowed input values.
         * Example: {@code [{"name": "name1", "description": "description1"}, ...]}
         *
         * @param allowedValues the value to set
         * @return this builder
         **/
        public Builder allowedValues(
                java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SdkLanguageOptionalParameters build() {
            SdkLanguageOptionalParameters model =
                    new SdkLanguageOptionalParameters(
                            this.paramName,
                            this.displayName,
                            this.description,
                            this.isRequired,
                            this.maxSize,
                            this.inputType,
                            this.allowedValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SdkLanguageOptionalParameters model) {
            if (model.wasPropertyExplicitlySet("paramName")) {
                this.paramName(model.getParamName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("maxSize")) {
                this.maxSize(model.getMaxSize());
            }
            if (model.wasPropertyExplicitlySet("inputType")) {
                this.inputType(model.getInputType());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    private final String paramName;

    /**
     * Name of the parameter.
     *
     * @return the value
     **/
    public String getParamName() {
        return paramName;
    }

    /**
     * Display name of the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the parameter.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description for the parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for the parameter.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Information on whether the parameter is required or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Information on whether the parameter is required or not.
     *
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Maximum size as input value for this parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
    private final java.math.BigDecimal maxSize;

    /**
     * Maximum size as input value for this parameter.
     *
     * @return the value
     **/
    public java.math.BigDecimal getMaxSize() {
        return maxSize;
    }

    /**
     * The input type for this param.
     * - Input type is ENUM when only specific list of input strings are allowed.
     * - Input type is EMAIL when input type is an email ID.
     * - Input type is URI when input type is an URI.
     * - Input type is STRING in all other cases.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InputType.class);

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
    private final InputType inputType;

    /**
     * The input type for this param.
     * - Input type is ENUM when only specific list of input strings are allowed.
     * - Input type is EMAIL when input type is an email ID.
     * - Input type is URI when input type is an URI.
     * - Input type is STRING in all other cases.
     *
     * @return the value
     **/
    public InputType getInputType() {
        return inputType;
    }

    /**
     * List of allowed input values.
     * Example: {@code [{"name": "name1", "description": "description1"}, ...]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<SdkLanguageOptionalParametersAllowedValue> allowedValues;

    /**
     * List of allowed input values.
     * Example: {@code [{"name": "name1", "description": "description1"}, ...]}
     *
     * @return the value
     **/
    public java.util.List<SdkLanguageOptionalParametersAllowedValue> getAllowedValues() {
        return allowedValues;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SdkLanguageOptionalParameters(");
        sb.append("super=").append(super.toString());
        sb.append("paramName=").append(String.valueOf(this.paramName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", maxSize=").append(String.valueOf(this.maxSize));
        sb.append(", inputType=").append(String.valueOf(this.inputType));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SdkLanguageOptionalParameters)) {
            return false;
        }

        SdkLanguageOptionalParameters other = (SdkLanguageOptionalParameters) o;
        return java.util.Objects.equals(this.paramName, other.paramName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.maxSize, other.maxSize)
                && java.util.Objects.equals(this.inputType, other.inputType)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.paramName == null ? 43 : this.paramName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.maxSize == null ? 43 : this.maxSize.hashCode());
        result = (result * PRIME) + (this.inputType == null ? 43 : this.inputType.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
