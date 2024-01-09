/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * An object used to represent a level at which a property or resource or constraint is defined.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Level.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Level extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "constraints"})
    public Level(String name, String constraints) {
        super();
        this.name = name;
        this.constraints = constraints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The level name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The level name.
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
         * A string representation of constraints that apply at this level. For example, a property
         * defined at SOURCE level could further be applicable only for SOURCE_TYPE:database_sql.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("constraints")
        private String constraints;

        /**
         * A string representation of constraints that apply at this level. For example, a property
         * defined at SOURCE level could further be applicable only for SOURCE_TYPE:database_sql.
         *
         * @param constraints the value to set
         * @return this builder
         */
        public Builder constraints(String constraints) {
            this.constraints = constraints;
            this.__explicitlySet__.add("constraints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Level build() {
            Level model = new Level(this.name, this.constraints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Level model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("constraints")) {
                this.constraints(model.getConstraints());
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

    /** The level name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The level name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A string representation of constraints that apply at this level. For example, a property
     * defined at SOURCE level could further be applicable only for SOURCE_TYPE:database_sql.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("constraints")
    private final String constraints;

    /**
     * A string representation of constraints that apply at this level. For example, a property
     * defined at SOURCE level could further be applicable only for SOURCE_TYPE:database_sql.
     *
     * @return the value
     */
    public String getConstraints() {
        return constraints;
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
        sb.append("Level(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", constraints=").append(String.valueOf(this.constraints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Level)) {
            return false;
        }

        Level other = (Level) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.constraints, other.constraints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.constraints == null ? 43 : this.constraints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
