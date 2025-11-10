/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * String variable. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StringVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StringVariable extends BaseVariable {
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
        /** The default string value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default string value.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** Regex pattern that the string must match. */
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * Regex pattern that the string must match.
         *
         * @param pattern the value to set
         * @return this builder
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /** Maximum allowed length for the string. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private Integer maxLength;

        /**
         * Maximum allowed length for the string.
         *
         * @param maxLength the value to set
         * @return this builder
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }
        /** Minimum allowed length for the string. */
        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private Integer minLength;

        /**
         * Minimum allowed length for the string.
         *
         * @param minLength the value to set
         * @return this builder
         */
        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StringVariable build() {
            StringVariable model =
                    new StringVariable(
                            this.title,
                            this.description,
                            this.isRequired,
                            this.visible,
                            this.defaultValue,
                            this.pattern,
                            this.maxLength,
                            this.minLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StringVariable model) {
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
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
            }
            if (model.wasPropertyExplicitlySet("maxLength")) {
                this.maxLength(model.getMaxLength());
            }
            if (model.wasPropertyExplicitlySet("minLength")) {
                this.minLength(model.getMinLength());
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
    public StringVariable(
            String title,
            String description,
            Boolean isRequired,
            String visible,
            String defaultValue,
            String pattern,
            Integer maxLength,
            Integer minLength) {
        super(title, description, isRequired, visible);
        this.defaultValue = defaultValue;
        this.pattern = pattern;
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    /** The default string value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default string value.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** Regex pattern that the string must match. */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * Regex pattern that the string must match.
     *
     * @return the value
     */
    public String getPattern() {
        return pattern;
    }

    /** Maximum allowed length for the string. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private final Integer maxLength;

    /**
     * Maximum allowed length for the string.
     *
     * @return the value
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /** Minimum allowed length for the string. */
    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private final Integer minLength;

    /**
     * Minimum allowed length for the string.
     *
     * @return the value
     */
    public Integer getMinLength() {
        return minLength;
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
        sb.append("StringVariable(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", maxLength=").append(String.valueOf(this.maxLength));
        sb.append(", minLength=").append(String.valueOf(this.minLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StringVariable)) {
            return false;
        }

        StringVariable other = (StringVariable) o;
        return java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.maxLength, other.maxLength)
                && java.util.Objects.equals(this.minLength, other.minLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.maxLength == null ? 43 : this.maxLength.hashCode());
        result = (result * PRIME) + (this.minLength == null ? 43 : this.minLength.hashCode());
        return result;
    }
}
