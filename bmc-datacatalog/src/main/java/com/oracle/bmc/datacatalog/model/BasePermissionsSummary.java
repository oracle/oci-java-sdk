/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Permissions object sent as part of the response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BasePermissionsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BasePermissionsSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"userPermissions"})
    public BasePermissionsSummary(java.util.List<String> userPermissions) {
        super();
        this.userPermissions = userPermissions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of permissions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
        private java.util.List<String> userPermissions;

        /**
         * An array of permissions.
         * @param userPermissions the value to set
         * @return this builder
         **/
        public Builder userPermissions(java.util.List<String> userPermissions) {
            this.userPermissions = userPermissions;
            this.__explicitlySet__.add("userPermissions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BasePermissionsSummary build() {
            BasePermissionsSummary model = new BasePermissionsSummary(this.userPermissions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BasePermissionsSummary model) {
            if (model.wasPropertyExplicitlySet("userPermissions")) {
                this.userPermissions(model.getUserPermissions());
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
     * An array of permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
    private final java.util.List<String> userPermissions;

    /**
     * An array of permissions.
     * @return the value
     **/
    public java.util.List<String> getUserPermissions() {
        return userPermissions;
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
        sb.append("BasePermissionsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("userPermissions=").append(String.valueOf(this.userPermissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasePermissionsSummary)) {
            return false;
        }

        BasePermissionsSummary other = (BasePermissionsSummary) o;
        return java.util.Objects.equals(this.userPermissions, other.userPermissions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.userPermissions == null ? 43 : this.userPermissions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
