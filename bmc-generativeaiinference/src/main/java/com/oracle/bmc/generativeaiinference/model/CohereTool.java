/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A definition of tool (function).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CohereTool.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CohereTool extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "parameterDefinitions"})
    public CohereTool(
            String name,
            String description,
            java.util.Map<String, CohereParameterDefinition> parameterDefinitions) {
        super();
        this.name = name;
        this.description = description;
        this.parameterDefinitions = parameterDefinitions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the tool to be called. Valid names contain only the characters a-z, A-Z, 0-9, _ and must not begin with a digit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tool to be called. Valid names contain only the characters a-z, A-Z, 0-9, _ and must not begin with a digit.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of what the tool does, the model uses the description to choose when and how to call the function.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of what the tool does, the model uses the description to choose when and how to call the function.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The input parameters of the tool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterDefinitions")
        private java.util.Map<String, CohereParameterDefinition> parameterDefinitions;

        /**
         * The input parameters of the tool.
         * @param parameterDefinitions the value to set
         * @return this builder
         **/
        public Builder parameterDefinitions(
                java.util.Map<String, CohereParameterDefinition> parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            this.__explicitlySet__.add("parameterDefinitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereTool build() {
            CohereTool model =
                    new CohereTool(this.name, this.description, this.parameterDefinitions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereTool model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("parameterDefinitions")) {
                this.parameterDefinitions(model.getParameterDefinitions());
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
     * The name of the tool to be called. Valid names contain only the characters a-z, A-Z, 0-9, _ and must not begin with a digit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tool to be called. Valid names contain only the characters a-z, A-Z, 0-9, _ and must not begin with a digit.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description of what the tool does, the model uses the description to choose when and how to call the function.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of what the tool does, the model uses the description to choose when and how to call the function.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The input parameters of the tool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterDefinitions")
    private final java.util.Map<String, CohereParameterDefinition> parameterDefinitions;

    /**
     * The input parameters of the tool.
     * @return the value
     **/
    public java.util.Map<String, CohereParameterDefinition> getParameterDefinitions() {
        return parameterDefinitions;
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
        sb.append("CohereTool(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parameterDefinitions=").append(String.valueOf(this.parameterDefinitions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereTool)) {
            return false;
        }

        CohereTool other = (CohereTool) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parameterDefinitions, other.parameterDefinitions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterDefinitions == null
                                ? 43
                                : this.parameterDefinitions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
