/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A property and its effective value details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EffectivePropertySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EffectivePropertySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "effectiveLevel", "patterns"})
    public EffectivePropertySummary(
            String name,
            String value,
            String effectiveLevel,
            java.util.List<PatternOverride> patterns) {
        super();
        this.name = name;
        this.value = value;
        this.effectiveLevel = effectiveLevel;
        this.patterns = patterns;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The property name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The property name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The effective value of the property. This is determined by considering the value set at
         * the most effective level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The effective value of the property. This is determined by considering the value set at
         * the most effective level.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The level from which the effective value was determined. */
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveLevel")
        private String effectiveLevel;

        /**
         * The level from which the effective value was determined.
         *
         * @param effectiveLevel the value to set
         * @return this builder
         */
        public Builder effectiveLevel(String effectiveLevel) {
            this.effectiveLevel = effectiveLevel;
            this.__explicitlySet__.add("effectiveLevel");
            return this;
        }
        /** A list of pattern level override values for the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<PatternOverride> patterns;

        /**
         * A list of pattern level override values for the property.
         *
         * @param patterns the value to set
         * @return this builder
         */
        public Builder patterns(java.util.List<PatternOverride> patterns) {
            this.patterns = patterns;
            this.__explicitlySet__.add("patterns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EffectivePropertySummary build() {
            EffectivePropertySummary model =
                    new EffectivePropertySummary(
                            this.name, this.value, this.effectiveLevel, this.patterns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EffectivePropertySummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("effectiveLevel")) {
                this.effectiveLevel(model.getEffectiveLevel());
            }
            if (model.wasPropertyExplicitlySet("patterns")) {
                this.patterns(model.getPatterns());
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

    /** The property name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The property name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The effective value of the property. This is determined by considering the value set at the
     * most effective level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The effective value of the property. This is determined by considering the value set at the
     * most effective level.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The level from which the effective value was determined. */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveLevel")
    private final String effectiveLevel;

    /**
     * The level from which the effective value was determined.
     *
     * @return the value
     */
    public String getEffectiveLevel() {
        return effectiveLevel;
    }

    /** A list of pattern level override values for the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<PatternOverride> patterns;

    /**
     * A list of pattern level override values for the property.
     *
     * @return the value
     */
    public java.util.List<PatternOverride> getPatterns() {
        return patterns;
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
        sb.append("EffectivePropertySummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", effectiveLevel=").append(String.valueOf(this.effectiveLevel));
        sb.append(", patterns=").append(String.valueOf(this.patterns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EffectivePropertySummary)) {
            return false;
        }

        EffectivePropertySummary other = (EffectivePropertySummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.effectiveLevel, other.effectiveLevel)
                && java.util.Objects.equals(this.patterns, other.patterns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.effectiveLevel == null ? 43 : this.effectiveLevel.hashCode());
        result = (result * PRIME) + (this.patterns == null ? 43 : this.patterns.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
