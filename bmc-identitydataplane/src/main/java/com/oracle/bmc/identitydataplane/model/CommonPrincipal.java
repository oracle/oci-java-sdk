/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CommonPrincipal.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CommonPrincipal
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tenant", "user"})
    public CommonPrincipal(Tenant tenant, User user) {
        super();
        this.tenant = tenant;
        this.user = user;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The tenant. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenant")
        private Tenant tenant;

        /**
         * The tenant.
         *
         * @param tenant the value to set
         * @return this builder
         */
        public Builder tenant(Tenant tenant) {
            this.tenant = tenant;
            this.__explicitlySet__.add("tenant");
            return this;
        }
        /** The user. */
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private User user;

        /**
         * The user.
         *
         * @param user the value to set
         * @return this builder
         */
        public Builder user(User user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommonPrincipal build() {
            CommonPrincipal model = new CommonPrincipal(this.tenant, this.user);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommonPrincipal model) {
            if (model.wasPropertyExplicitlySet("tenant")) {
                this.tenant(model.getTenant());
            }
            if (model.wasPropertyExplicitlySet("user")) {
                this.user(model.getUser());
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

    /** The tenant. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenant")
    private final Tenant tenant;

    /**
     * The tenant.
     *
     * @return the value
     */
    public Tenant getTenant() {
        return tenant;
    }

    /** The user. */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final User user;

    /**
     * The user.
     *
     * @return the value
     */
    public User getUser() {
        return user;
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
        sb.append("CommonPrincipal(");
        sb.append("super=").append(super.toString());
        sb.append("tenant=").append(String.valueOf(this.tenant));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommonPrincipal)) {
            return false;
        }

        CommonPrincipal other = (CommonPrincipal) o;
        return java.util.Objects.equals(this.tenant, other.tenant)
                && java.util.Objects.equals(this.user, other.user)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenant == null ? 43 : this.tenant.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
