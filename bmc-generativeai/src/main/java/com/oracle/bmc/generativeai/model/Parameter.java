/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Defines a configurable parameter supported by a model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Parameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Parameter extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "minimum",
        "maximum",
        "defaultValue",
        "description"
    })
    public Parameter(
            String name,
            String type,
            Double minimum,
            Double maximum,
            String defaultValue,
            String description) {
        super();
        this.name = name;
        this.type = type;
        this.minimum = minimum;
        this.maximum = maximum;
        this.defaultValue = defaultValue;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of this parameter.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The data type of the parameter (e.g., float, integer, string). */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The data type of the parameter (e.g., float, integer, string).
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The minimum allowed value for this parameter. Applicable only when type is FLOAT or
         * INTEGER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Double minimum;

        /**
         * The minimum allowed value for this parameter. Applicable only when type is FLOAT or
         * INTEGER.
         *
         * @param minimum the value to set
         * @return this builder
         */
        public Builder minimum(Double minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }
        /**
         * The maximum allowed value for this parameter. Applicable only when type is FLOAT or
         * INTEGER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Double maximum;

        /**
         * The maximum allowed value for this parameter. Applicable only when type is FLOAT or
         * INTEGER.
         *
         * @param maximum the value to set
         * @return this builder
         */
        public Builder maximum(Double maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }
        /** The default value used when this parameter is not supplied. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value used when this parameter is not supplied.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** A human-readable description of this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description of this parameter.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Parameter build() {
            Parameter model =
                    new Parameter(
                            this.name,
                            this.type,
                            this.minimum,
                            this.maximum,
                            this.defaultValue,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Parameter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("minimum")) {
                this.minimum(model.getMinimum());
            }
            if (model.wasPropertyExplicitlySet("maximum")) {
                this.maximum(model.getMaximum());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** The name of this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of this parameter.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The data type of the parameter (e.g., float, integer, string). */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The data type of the parameter (e.g., float, integer, string).
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * The minimum allowed value for this parameter. Applicable only when type is FLOAT or INTEGER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final Double minimum;

    /**
     * The minimum allowed value for this parameter. Applicable only when type is FLOAT or INTEGER.
     *
     * @return the value
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * The maximum allowed value for this parameter. Applicable only when type is FLOAT or INTEGER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private final Double maximum;

    /**
     * The maximum allowed value for this parameter. Applicable only when type is FLOAT or INTEGER.
     *
     * @return the value
     */
    public Double getMaximum() {
        return maximum;
    }

    /** The default value used when this parameter is not supplied. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value used when this parameter is not supplied.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** A human-readable description of this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description of this parameter.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("Parameter(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", minimum=").append(String.valueOf(this.minimum));
        sb.append(", maximum=").append(String.valueOf(this.maximum));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parameter)) {
            return false;
        }

        Parameter other = (Parameter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.maximum, other.maximum)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
        result = (result * PRIME) + (this.maximum == null ? 43 : this.maximum.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
