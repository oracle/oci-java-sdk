/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating the role of a DR protection group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDrProtectionGroupRoleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrProtectionGroupRoleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"role"})
    public UpdateDrProtectionGroupRoleDetails(DrProtectionGroupRole role) {
        super();
        this.role = role;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The new role of the DR protection group. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private DrProtectionGroupRole role;

        /**
         * The new role of the DR protection group.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(DrProtectionGroupRole role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupRoleDetails build() {
            UpdateDrProtectionGroupRoleDetails model =
                    new UpdateDrProtectionGroupRoleDetails(this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupRoleDetails model) {
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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

    /** The new role of the DR protection group. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final DrProtectionGroupRole role;

    /**
     * The new role of the DR protection group.
     *
     * @return the value
     */
    public DrProtectionGroupRole getRole() {
        return role;
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
        sb.append("UpdateDrProtectionGroupRoleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupRoleDetails)) {
            return false;
        }

        UpdateDrProtectionGroupRoleDetails other = (UpdateDrProtectionGroupRoleDetails) o;
        return java.util.Objects.equals(this.role, other.role) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
