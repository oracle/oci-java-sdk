/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A function the model may call. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FunctionDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FunctionDefinition extends ToolDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
         * dashes, with a maximum length of 64.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
         * dashes, with a maximum length of 64.
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
         * A description of what the function does, used by the model to choose when and how to call
         * the function.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of what the function does, used by the model to choose when and how to call
         * the function.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The parameters the functions accepts, described as a JSON Schema object. Omitting
         * parameters defines a function with an empty parameter list.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private Object parameters;

        /**
         * The parameters the functions accepts, described as a JSON Schema object. Omitting
         * parameters defines a function with an empty parameter list.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(Object parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionDefinition build() {
            FunctionDefinition model =
                    new FunctionDefinition(this.name, this.description, this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionDefinition model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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
    public FunctionDefinition(String name, String description, Object parameters) {
        super();
        this.name = name;
        this.description = description;
        this.parameters = parameters;
    }

    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
     * dashes, with a maximum length of 64.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
     * dashes, with a maximum length of 64.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A description of what the function does, used by the model to choose when and how to call the
     * function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of what the function does, used by the model to choose when and how to call the
     * function.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The parameters the functions accepts, described as a JSON Schema object. Omitting parameters
     * defines a function with an empty parameter list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final Object parameters;

    /**
     * The parameters the functions accepts, described as a JSON Schema object. Omitting parameters
     * defines a function with an empty parameter list.
     *
     * @return the value
     */
    public Object getParameters() {
        return parameters;
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
        sb.append("FunctionDefinition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionDefinition)) {
            return false;
        }

        FunctionDefinition other = (FunctionDefinition) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }
}
