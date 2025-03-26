/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A definition of tool parameter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CohereParameterDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CohereParameterDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "type", "isRequired"})
    public CohereParameterDefinition(String description, String type, Boolean isRequired) {
        super();
        this.description = description;
        this.type = type;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The description of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the parameter.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of the parameter. Must be a valid Python type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of the parameter. Must be a valid Python type.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Denotes whether the parameter is always present (required) or not. Defaults to not required.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Denotes whether the parameter is always present (required) or not. Defaults to not required.
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereParameterDefinition build() {
            CohereParameterDefinition model =
                    new CohereParameterDefinition(this.description, this.type, this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereParameterDefinition model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * The description of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the parameter.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of the parameter. Must be a valid Python type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of the parameter. Must be a valid Python type.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Denotes whether the parameter is always present (required) or not. Defaults to not required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Denotes whether the parameter is always present (required) or not. Defaults to not required.
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("CohereParameterDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereParameterDefinition)) {
            return false;
        }

        CohereParameterDefinition other = (CohereParameterDefinition) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
