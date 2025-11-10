/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * An organizational grouping of related variables within the schema. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VariableGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VariableGroup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"title", "variables", "visible"})
    public VariableGroup(String title, java.util.List<String> variables, String visible) {
        super();
        this.title = title;
        this.variables = variables;
        this.visible = visible;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Display title for the group of variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Display title for the group of variables.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /** Array of variable references assigned to this group. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<String> variables;

        /**
         * Array of variable references assigned to this group.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.List<String> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }
        /** Hint controlling the group's visibility. */
        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        private String visible;

        /**
         * Hint controlling the group's visibility.
         *
         * @param visible the value to set
         * @return this builder
         */
        public Builder visible(String visible) {
            this.visible = visible;
            this.__explicitlySet__.add("visible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VariableGroup build() {
            VariableGroup model = new VariableGroup(this.title, this.variables, this.visible);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VariableGroup model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("visible")) {
                this.visible(model.getVisible());
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

    /** Display title for the group of variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Display title for the group of variables.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** Array of variable references assigned to this group. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<String> variables;

    /**
     * Array of variable references assigned to this group.
     *
     * @return the value
     */
    public java.util.List<String> getVariables() {
        return variables;
    }

    /** Hint controlling the group's visibility. */
    @com.fasterxml.jackson.annotation.JsonProperty("visible")
    private final String visible;

    /**
     * Hint controlling the group's visibility.
     *
     * @return the value
     */
    public String getVisible() {
        return visible;
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
        sb.append("VariableGroup(");
        sb.append("super=").append(super.toString());
        sb.append("title=").append(String.valueOf(this.title));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", visible=").append(String.valueOf(this.visible));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VariableGroup)) {
            return false;
        }

        VariableGroup other = (VariableGroup) o;
        return java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.visible, other.visible)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.visible == null ? 43 : this.visible.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
