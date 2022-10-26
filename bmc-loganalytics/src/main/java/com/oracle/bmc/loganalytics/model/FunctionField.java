/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field outlining queryString aggregate function entries. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FunctionField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FunctionField extends AbstractField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeclared")
        private Boolean isDeclared;

        public Builder isDeclared(Boolean isDeclared) {
            this.isDeclared = isDeclared;
            this.__explicitlySet__.add("isDeclared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayNames")
        private java.util.List<String> originalDisplayNames;

        public Builder originalDisplayNames(java.util.List<String> originalDisplayNames) {
            this.originalDisplayNames = originalDisplayNames;
            this.__explicitlySet__.add("originalDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
        private Boolean isGroupable;

        public Builder isGroupable(Boolean isGroupable) {
            this.isGroupable = isGroupable;
            this.__explicitlySet__.add("isGroupable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDuration")
        private Boolean isDuration;

        public Builder isDuration(Boolean isDuration) {
            this.isDuration = isDuration;
            this.__explicitlySet__.add("isDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterQueryString")
        private String filterQueryString;

        public Builder filterQueryString(String filterQueryString) {
            this.filterQueryString = filterQueryString;
            this.__explicitlySet__.add("filterQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }
        /** Name of the aggregate function. */
        @com.fasterxml.jackson.annotation.JsonProperty("function")
        private String function;

        /**
         * Name of the aggregate function.
         *
         * @param function the value to set
         * @return this builder
         */
        public Builder function(String function) {
            this.function = function;
            this.__explicitlySet__.add("function");
            return this;
        }
        /** List of function arguments if specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<Argument> arguments;

        /**
         * List of function arguments if specified.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<Argument> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionField build() {
            FunctionField model =
                    new FunctionField(
                            this.displayName,
                            this.isDeclared,
                            this.originalDisplayNames,
                            this.internalName,
                            this.valueType,
                            this.isGroupable,
                            this.isDuration,
                            this.alias,
                            this.filterQueryString,
                            this.unitType,
                            this.function,
                            this.arguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionField model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isDeclared")) {
                this.isDeclared(model.getIsDeclared());
            }
            if (model.wasPropertyExplicitlySet("originalDisplayNames")) {
                this.originalDisplayNames(model.getOriginalDisplayNames());
            }
            if (model.wasPropertyExplicitlySet("internalName")) {
                this.internalName(model.getInternalName());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("isGroupable")) {
                this.isGroupable(model.getIsGroupable());
            }
            if (model.wasPropertyExplicitlySet("isDuration")) {
                this.isDuration(model.getIsDuration());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("filterQueryString")) {
                this.filterQueryString(model.getFilterQueryString());
            }
            if (model.wasPropertyExplicitlySet("unitType")) {
                this.unitType(model.getUnitType());
            }
            if (model.wasPropertyExplicitlySet("function")) {
                this.function(model.getFunction());
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
    public FunctionField(
            String displayName,
            Boolean isDeclared,
            java.util.List<String> originalDisplayNames,
            String internalName,
            ValueType valueType,
            Boolean isGroupable,
            Boolean isDuration,
            String alias,
            String filterQueryString,
            String unitType,
            String function,
            java.util.List<Argument> arguments) {
        super(
                displayName,
                isDeclared,
                originalDisplayNames,
                internalName,
                valueType,
                isGroupable,
                isDuration,
                alias,
                filterQueryString,
                unitType);
        this.function = function;
        this.arguments = arguments;
    }

    /** Name of the aggregate function. */
    @com.fasterxml.jackson.annotation.JsonProperty("function")
    private final String function;

    /**
     * Name of the aggregate function.
     *
     * @return the value
     */
    public String getFunction() {
        return function;
    }

    /** List of function arguments if specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<Argument> arguments;

    /**
     * List of function arguments if specified.
     *
     * @return the value
     */
    public java.util.List<Argument> getArguments() {
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
        sb.append("FunctionField(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", function=").append(String.valueOf(this.function));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionField)) {
            return false;
        }

        FunctionField other = (FunctionField) o;
        return java.util.Objects.equals(this.function, other.function)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.function == null ? 43 : this.function.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        return result;
    }
}
