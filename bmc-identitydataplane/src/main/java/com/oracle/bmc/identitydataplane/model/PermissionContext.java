/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PermissionContext.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PermissionContext
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"permission", "variables"})
    public PermissionContext(Permission permission, java.util.List<ContextVariable> variables) {
        super();
        this.permission = permission;
        this.variables = variables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The permission context. */
        @com.fasterxml.jackson.annotation.JsonProperty("permission")
        private Permission permission;

        /**
         * The permission context.
         *
         * @param permission the value to set
         * @return this builder
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            this.__explicitlySet__.add("permission");
            return this;
        }
        /** The set of variables in this permission context. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<ContextVariable> variables;

        /**
         * The set of variables in this permission context.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.List<ContextVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PermissionContext build() {
            PermissionContext model = new PermissionContext(this.permission, this.variables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PermissionContext model) {
            if (model.wasPropertyExplicitlySet("permission")) {
                this.permission(model.getPermission());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
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

    /** The permission context. */
    @com.fasterxml.jackson.annotation.JsonProperty("permission")
    private final Permission permission;

    /**
     * The permission context.
     *
     * @return the value
     */
    public Permission getPermission() {
        return permission;
    }

    /** The set of variables in this permission context. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<ContextVariable> variables;

    /**
     * The set of variables in this permission context.
     *
     * @return the value
     */
    public java.util.List<ContextVariable> getVariables() {
        return variables;
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
        sb.append("PermissionContext(");
        sb.append("super=").append(super.toString());
        sb.append("permission=").append(String.valueOf(this.permission));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PermissionContext)) {
            return false;
        }

        PermissionContext other = (PermissionContext) o;
        return java.util.Objects.equals(this.permission, other.permission)
                && java.util.Objects.equals(this.variables, other.variables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permission == null ? 43 : this.permission.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
