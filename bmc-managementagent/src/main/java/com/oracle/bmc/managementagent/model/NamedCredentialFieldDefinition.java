/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * A named credential field metadata definition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NamedCredentialFieldDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedCredentialFieldDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "defaultValue",
        "regex",
        "allowedValues",
        "valueCategory",
        "isRequired"
    })
    public NamedCredentialFieldDefinition(
            String name,
            String displayName,
            String defaultValue,
            String regex,
            java.util.List<String> allowedValues,
            java.util.List<ValueCategoryType> valueCategory,
            Boolean isRequired) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.defaultValue = defaultValue;
        this.regex = regex;
        this.allowedValues = allowedValues;
        this.valueCategory = valueCategory;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The field name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The field name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The field display name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The field display name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The default value which will be used if no value is set. If defaultValue is empty, then
         * no default will be set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value which will be used if no value is set. If defaultValue is empty, then
         * no default will be set.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * Optional regular expression definition which will be applied to the value when
         * valueCategory is CLEAR_TEXT
         */
        @com.fasterxml.jackson.annotation.JsonProperty("regex")
        private String regex;

        /**
         * Optional regular expression definition which will be applied to the value when
         * valueCategory is CLEAR_TEXT
         *
         * @param regex the value to set
         * @return this builder
         */
        public Builder regex(String regex) {
            this.regex = regex;
            this.__explicitlySet__.add("regex");
            return this;
        }
        /** List of values which can be applied to the value when valueCategory is ALLOWED_VALUES */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        /**
         * List of values which can be applied to the value when valueCategory is ALLOWED_VALUES
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** List of value categories of field allowed for this property */
        @com.fasterxml.jackson.annotation.JsonProperty("valueCategory")
        private java.util.List<ValueCategoryType> valueCategory;

        /**
         * List of value categories of field allowed for this property
         *
         * @param valueCategory the value to set
         * @return this builder
         */
        public Builder valueCategory(java.util.List<ValueCategoryType> valueCategory) {
            this.valueCategory = valueCategory;
            this.__explicitlySet__.add("valueCategory");
            return this;
        }
        /** Set to true if the field must be defined */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Set to true if the field must be defined
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedCredentialFieldDefinition build() {
            NamedCredentialFieldDefinition model =
                    new NamedCredentialFieldDefinition(
                            this.name,
                            this.displayName,
                            this.defaultValue,
                            this.regex,
                            this.allowedValues,
                            this.valueCategory,
                            this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedCredentialFieldDefinition model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("regex")) {
                this.regex(model.getRegex());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("valueCategory")) {
                this.valueCategory(model.getValueCategory());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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

    /** The field name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The field name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The field display name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The field display name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The default value which will be used if no value is set. If defaultValue is empty, then no
     * default will be set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value which will be used if no value is set. If defaultValue is empty, then no
     * default will be set.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Optional regular expression definition which will be applied to the value when valueCategory
     * is CLEAR_TEXT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regex")
    private final String regex;

    /**
     * Optional regular expression definition which will be applied to the value when valueCategory
     * is CLEAR_TEXT
     *
     * @return the value
     */
    public String getRegex() {
        return regex;
    }

    /** List of values which can be applied to the value when valueCategory is ALLOWED_VALUES */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<String> allowedValues;

    /**
     * List of values which can be applied to the value when valueCategory is ALLOWED_VALUES
     *
     * @return the value
     */
    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /** List of value categories of field allowed for this property */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCategory")
    private final java.util.List<ValueCategoryType> valueCategory;

    /**
     * List of value categories of field allowed for this property
     *
     * @return the value
     */
    public java.util.List<ValueCategoryType> getValueCategory() {
        return valueCategory;
    }

    /** Set to true if the field must be defined */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Set to true if the field must be defined
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("NamedCredentialFieldDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", regex=").append(String.valueOf(this.regex));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", valueCategory=").append(String.valueOf(this.valueCategory));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedCredentialFieldDefinition)) {
            return false;
        }

        NamedCredentialFieldDefinition other = (NamedCredentialFieldDefinition) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.regex, other.regex)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.valueCategory, other.valueCategory)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.regex == null ? 43 : this.regex.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result =
                (result * PRIME)
                        + (this.valueCategory == null ? 43 : this.valueCategory.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
