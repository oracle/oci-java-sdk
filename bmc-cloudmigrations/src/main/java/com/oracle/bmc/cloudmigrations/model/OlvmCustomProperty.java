/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Custom properties applied to the vNIC Profile. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmCustomProperty.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmCustomProperty
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "regexp", "value"})
    public OlvmCustomProperty(String name, String regexp, String value) {
        super();
        this.name = name;
        this.regexp = regexp;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Property name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Property name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A regular expression defining the available values a custom property can get. */
        @com.fasterxml.jackson.annotation.JsonProperty("regexp")
        private String regexp;

        /**
         * A regular expression defining the available values a custom property can get.
         *
         * @param regexp the value to set
         * @return this builder
         */
        public Builder regexp(String regexp) {
            this.regexp = regexp;
            this.__explicitlySet__.add("regexp");
            return this;
        }
        /** Property value */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Property value
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmCustomProperty build() {
            OlvmCustomProperty model = new OlvmCustomProperty(this.name, this.regexp, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmCustomProperty model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("regexp")) {
                this.regexp(model.getRegexp());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /** Property name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Property name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A regular expression defining the available values a custom property can get. */
    @com.fasterxml.jackson.annotation.JsonProperty("regexp")
    private final String regexp;

    /**
     * A regular expression defining the available values a custom property can get.
     *
     * @return the value
     */
    public String getRegexp() {
        return regexp;
    }

    /** Property value */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Property value
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("OlvmCustomProperty(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", regexp=").append(String.valueOf(this.regexp));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmCustomProperty)) {
            return false;
        }

        OlvmCustomProperty other = (OlvmCustomProperty) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.regexp, other.regexp)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.regexp == null ? 43 : this.regexp.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
