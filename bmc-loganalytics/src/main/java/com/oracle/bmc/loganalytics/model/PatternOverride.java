/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of pattern level override for a property. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatternOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatternOverride
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "value", "effectiveLevel"})
    public PatternOverride(String id, String value, String effectiveLevel) {
        super();
        this.id = id;
        this.value = value;
        this.effectiveLevel = effectiveLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The pattern id. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The pattern id.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The value of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the property.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The effective level of the property value. */
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveLevel")
        private String effectiveLevel;

        /**
         * The effective level of the property value.
         *
         * @param effectiveLevel the value to set
         * @return this builder
         */
        public Builder effectiveLevel(String effectiveLevel) {
            this.effectiveLevel = effectiveLevel;
            this.__explicitlySet__.add("effectiveLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatternOverride build() {
            PatternOverride model = new PatternOverride(this.id, this.value, this.effectiveLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatternOverride model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("effectiveLevel")) {
                this.effectiveLevel(model.getEffectiveLevel());
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

    /** The pattern id. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The pattern id.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The value of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the property.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The effective level of the property value. */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveLevel")
    private final String effectiveLevel;

    /**
     * The effective level of the property value.
     *
     * @return the value
     */
    public String getEffectiveLevel() {
        return effectiveLevel;
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
        sb.append("PatternOverride(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", effectiveLevel=").append(String.valueOf(this.effectiveLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatternOverride)) {
            return false;
        }

        PatternOverride other = (PatternOverride) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.effectiveLevel, other.effectiveLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.effectiveLevel == null ? 43 : this.effectiveLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
