/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage MODULE command. <br>
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
        builder = ModuleCommandDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /** Description of the macro. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the macro.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Description of the macro. */
        @com.fasterxml.jackson.annotation.JsonProperty("example")
        private String example;

        /**
         * Description of the macro.
         *
         * @param example the value to set
         * @return this builder
         */
        public Builder example(String example) {
            this.example = example;
            this.__explicitlySet__.add("example");
            return this;
        }
        /** Optional list of properties for the macro. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<PropertyDefinition> properties;

        /**
         * Optional list of properties for the macro.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<PropertyDefinition> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /** Optional list of arguments used in the macro. */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<VariableDefinition> arguments;

        /**
         * Optional list of arguments used in the macro.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<VariableDefinition> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleCommandDescriptor build() {
            ModuleCommandDescriptor model =
                    new ModuleCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.description,
                            this.example,
                            this.properties,
                            this.arguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleCommandDescriptor model) {
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("referencedFields")) {
                this.referencedFields(model.getReferencedFields());
            }
            if (model.wasPropertyExplicitlySet("declaredFields")) {
                this.declaredFields(model.getDeclaredFields());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("example")) {
                this.example(model.getExample());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
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
    public ModuleCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            String description,
            String example,
            java.util.List<PropertyDefinition> properties,
            java.util.List<VariableDefinition> arguments) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.description = description;
        this.example = example;
        this.properties = properties;
        this.arguments = arguments;
    }

    /** Description of the macro. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the macro.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Description of the macro. */
    @com.fasterxml.jackson.annotation.JsonProperty("example")
    private final String example;

    /**
     * Description of the macro.
     *
     * @return the value
     */
    public String getExample() {
        return example;
    }

    /** Optional list of properties for the macro. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<PropertyDefinition> properties;

    /**
     * Optional list of properties for the macro.
     *
     * @return the value
     */
    public java.util.List<PropertyDefinition> getProperties() {
        return properties;
    }

    /** Optional list of arguments used in the macro. */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<VariableDefinition> arguments;

    /**
     * Optional list of arguments used in the macro.
     *
     * @return the value
     */
    public java.util.List<VariableDefinition> getArguments() {
        return arguments;
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
        sb.append("ModuleCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", example=").append(String.valueOf(this.example));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleCommandDescriptor)) {
            return false;
        }

        ModuleCommandDescriptor other = (ModuleCommandDescriptor) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.example, other.example)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.example == null ? 43 : this.example.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        return result;
    }
}
