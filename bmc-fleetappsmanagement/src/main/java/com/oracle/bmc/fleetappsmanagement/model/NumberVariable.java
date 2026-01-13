/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The default numeric value. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NumberVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NumberVariable extends BaseVariable {
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
        /** Default value */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Float defaultValue;

        /**
         * Default value
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(Float defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** Acceptable values must be a multiple of this number. */
        @com.fasterxml.jackson.annotation.JsonProperty("multipleOf")
        private Float multipleOf;

        /**
         * Acceptable values must be a multiple of this number.
         *
         * @param multipleOf the value to set
         * @return this builder
         */
        public Builder multipleOf(Float multipleOf) {
            this.multipleOf = multipleOf;
            this.__explicitlySet__.add("multipleOf");
            return this;
        }
        /** The minimum allowed value(inclusive). */
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Float minimum;

        /**
         * The minimum allowed value(inclusive).
         *
         * @param minimum the value to set
         * @return this builder
         */
        public Builder minimum(Float minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }
        /** The maximum allowed value(inclusive). */
        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Float maximum;

        /**
         * The maximum allowed value(inclusive).
         *
         * @param maximum the value to set
         * @return this builder
         */
        public Builder maximum(Float maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }
        /** Value must be greater than this (exclusive lower bound). */
        @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMinimum")
        private Float exclusiveMinimum;

        /**
         * Value must be greater than this (exclusive lower bound).
         *
         * @param exclusiveMinimum the value to set
         * @return this builder
         */
        public Builder exclusiveMinimum(Float exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            this.__explicitlySet__.add("exclusiveMinimum");
            return this;
        }
        /** Value must be less than this (exclusive upper bound). */
        @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMaximum")
        private Float exclusiveMaximum;

        /**
         * Value must be less than this (exclusive upper bound).
         *
         * @param exclusiveMaximum the value to set
         * @return this builder
         */
        public Builder exclusiveMaximum(Float exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            this.__explicitlySet__.add("exclusiveMaximum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NumberVariable build() {
            NumberVariable model =
                    new NumberVariable(
                            this.title,
                            this.description,
                            this.isRequired,
                            this.visible,
                            this.defaultValue,
                            this.multipleOf,
                            this.minimum,
                            this.maximum,
                            this.exclusiveMinimum,
                            this.exclusiveMaximum);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NumberVariable model) {
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
            if (model.wasPropertyExplicitlySet("multipleOf")) {
                this.multipleOf(model.getMultipleOf());
            }
            if (model.wasPropertyExplicitlySet("minimum")) {
                this.minimum(model.getMinimum());
            }
            if (model.wasPropertyExplicitlySet("maximum")) {
                this.maximum(model.getMaximum());
            }
            if (model.wasPropertyExplicitlySet("exclusiveMinimum")) {
                this.exclusiveMinimum(model.getExclusiveMinimum());
            }
            if (model.wasPropertyExplicitlySet("exclusiveMaximum")) {
                this.exclusiveMaximum(model.getExclusiveMaximum());
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
    public NumberVariable(
            String title,
            String description,
            Boolean isRequired,
            String visible,
            Float defaultValue,
            Float multipleOf,
            Float minimum,
            Float maximum,
            Float exclusiveMinimum,
            Float exclusiveMaximum) {
        super(title, description, isRequired, visible);
        this.defaultValue = defaultValue;
        this.multipleOf = multipleOf;
        this.minimum = minimum;
        this.maximum = maximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.exclusiveMaximum = exclusiveMaximum;
    }

    /** Default value */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Float defaultValue;

    /**
     * Default value
     *
     * @return the value
     */
    public Float getDefaultValue() {
        return defaultValue;
    }

    /** Acceptable values must be a multiple of this number. */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleOf")
    private final Float multipleOf;

    /**
     * Acceptable values must be a multiple of this number.
     *
     * @return the value
     */
    public Float getMultipleOf() {
        return multipleOf;
    }

    /** The minimum allowed value(inclusive). */
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final Float minimum;

    /**
     * The minimum allowed value(inclusive).
     *
     * @return the value
     */
    public Float getMinimum() {
        return minimum;
    }

    /** The maximum allowed value(inclusive). */
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private final Float maximum;

    /**
     * The maximum allowed value(inclusive).
     *
     * @return the value
     */
    public Float getMaximum() {
        return maximum;
    }

    /** Value must be greater than this (exclusive lower bound). */
    @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMinimum")
    private final Float exclusiveMinimum;

    /**
     * Value must be greater than this (exclusive lower bound).
     *
     * @return the value
     */
    public Float getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    /** Value must be less than this (exclusive upper bound). */
    @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMaximum")
    private final Float exclusiveMaximum;

    /**
     * Value must be less than this (exclusive upper bound).
     *
     * @return the value
     */
    public Float getExclusiveMaximum() {
        return exclusiveMaximum;
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
        sb.append("NumberVariable(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", multipleOf=").append(String.valueOf(this.multipleOf));
        sb.append(", minimum=").append(String.valueOf(this.minimum));
        sb.append(", maximum=").append(String.valueOf(this.maximum));
        sb.append(", exclusiveMinimum=").append(String.valueOf(this.exclusiveMinimum));
        sb.append(", exclusiveMaximum=").append(String.valueOf(this.exclusiveMaximum));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumberVariable)) {
            return false;
        }

        NumberVariable other = (NumberVariable) o;
        return java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.multipleOf, other.multipleOf)
                && java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.maximum, other.maximum)
                && java.util.Objects.equals(this.exclusiveMinimum, other.exclusiveMinimum)
                && java.util.Objects.equals(this.exclusiveMaximum, other.exclusiveMaximum)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.multipleOf == null ? 43 : this.multipleOf.hashCode());
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
        result = (result * PRIME) + (this.maximum == null ? 43 : this.maximum.hashCode());
        result =
                (result * PRIME)
                        + (this.exclusiveMinimum == null ? 43 : this.exclusiveMinimum.hashCode());
        result =
                (result * PRIME)
                        + (this.exclusiveMaximum == null ? 43 : this.exclusiveMaximum.hashCode());
        return result;
    }
}
