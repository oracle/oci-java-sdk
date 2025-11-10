/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Enum variable. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EnumVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnumVariable extends BaseVariable {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
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

        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        private String visible;

        public Builder visible(String visible) {
            this.visible = visible;
            this.__explicitlySet__.add("visible");
            return this;
        }
        /** List of allowed string values for this enum variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("enumValue")
        private java.util.List<String> enumValue;

        /**
         * List of allowed string values for this enum variable.
         *
         * @param enumValue the value to set
         * @return this builder
         */
        public Builder enumValue(java.util.List<String> enumValue) {
            this.enumValue = enumValue;
            this.__explicitlySet__.add("enumValue");
            return this;
        }
        /** efault value selected if the user does not provide a value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * efault value selected if the user does not provide a value.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** True if multiple selections are allowed for this variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("canAllowMultiple")
        private Boolean canAllowMultiple;

        /**
         * True if multiple selections are allowed for this variable.
         *
         * @param canAllowMultiple the value to set
         * @return this builder
         */
        public Builder canAllowMultiple(Boolean canAllowMultiple) {
            this.canAllowMultiple = canAllowMultiple;
            this.__explicitlySet__.add("canAllowMultiple");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnumVariable build() {
            EnumVariable model =
                    new EnumVariable(
                            this.title,
                            this.description,
                            this.isRequired,
                            this.visible,
                            this.enumValue,
                            this.defaultValue,
                            this.canAllowMultiple);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnumVariable model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("visible")) {
                this.visible(model.getVisible());
            }
            if (model.wasPropertyExplicitlySet("enumValue")) {
                this.enumValue(model.getEnumValue());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("canAllowMultiple")) {
                this.canAllowMultiple(model.getCanAllowMultiple());
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

    @Deprecated
    public EnumVariable(
            String title,
            String description,
            Boolean isRequired,
            String visible,
            java.util.List<String> enumValue,
            String defaultValue,
            Boolean canAllowMultiple) {
        super(title, description, isRequired, visible);
        this.enumValue = enumValue;
        this.defaultValue = defaultValue;
        this.canAllowMultiple = canAllowMultiple;
    }

    /** List of allowed string values for this enum variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("enumValue")
    private final java.util.List<String> enumValue;

    /**
     * List of allowed string values for this enum variable.
     *
     * @return the value
     */
    public java.util.List<String> getEnumValue() {
        return enumValue;
    }

    /** efault value selected if the user does not provide a value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * efault value selected if the user does not provide a value.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** True if multiple selections are allowed for this variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("canAllowMultiple")
    private final Boolean canAllowMultiple;

    /**
     * True if multiple selections are allowed for this variable.
     *
     * @return the value
     */
    public Boolean getCanAllowMultiple() {
        return canAllowMultiple;
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
        sb.append("EnumVariable(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enumValue=").append(String.valueOf(this.enumValue));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", canAllowMultiple=").append(String.valueOf(this.canAllowMultiple));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnumVariable)) {
            return false;
        }

        EnumVariable other = (EnumVariable) o;
        return java.util.Objects.equals(this.enumValue, other.enumValue)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.canAllowMultiple, other.canAllowMultiple)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.enumValue == null ? 43 : this.enumValue.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.canAllowMultiple == null ? 43 : this.canAllowMultiple.hashCode());
        return result;
    }
}
