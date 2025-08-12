/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The audit policy provisioning conditions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoleCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoleCondition extends PolicyCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entitySelection")
        private EntitySelection entitySelection;

        public Builder entitySelection(EntitySelection entitySelection) {
            this.entitySelection = entitySelection;
            this.__explicitlySet__.add("entitySelection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /** List of roles that the policy must be enabled for. */
        @com.fasterxml.jackson.annotation.JsonProperty("roleNames")
        private java.util.List<String> roleNames;

        /**
         * List of roles that the policy must be enabled for.
         *
         * @param roleNames the value to set
         * @return this builder
         */
        public Builder roleNames(java.util.List<String> roleNames) {
            this.roleNames = roleNames;
            this.__explicitlySet__.add("roleNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoleCondition build() {
            RoleCondition model =
                    new RoleCondition(this.entitySelection, this.operationStatus, this.roleNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleCondition model) {
            if (model.wasPropertyExplicitlySet("entitySelection")) {
                this.entitySelection(model.getEntitySelection());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("roleNames")) {
                this.roleNames(model.getRoleNames());
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
    public RoleCondition(
            EntitySelection entitySelection,
            OperationStatus operationStatus,
            java.util.List<String> roleNames) {
        super(entitySelection, operationStatus);
        this.roleNames = roleNames;
    }

    /** List of roles that the policy must be enabled for. */
    @com.fasterxml.jackson.annotation.JsonProperty("roleNames")
    private final java.util.List<String> roleNames;

    /**
     * List of roles that the policy must be enabled for.
     *
     * @return the value
     */
    public java.util.List<String> getRoleNames() {
        return roleNames;
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
        sb.append("RoleCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", roleNames=").append(String.valueOf(this.roleNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleCondition)) {
            return false;
        }

        RoleCondition other = (RoleCondition) o;
        return java.util.Objects.equals(this.roleNames, other.roleNames) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.roleNames == null ? 43 : this.roleNames.hashCode());
        return result;
    }
}
