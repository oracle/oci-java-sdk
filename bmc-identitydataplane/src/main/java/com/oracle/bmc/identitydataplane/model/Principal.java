/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Principal.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Principal {
    @Deprecated
    @java.beans.ConstructorProperties({"subjectId", "tenantId", "claims"})
    public Principal(String subjectId, String tenantId, java.util.List<Claim> claims) {
        super();
        this.subjectId = subjectId;
        this.tenantId = tenantId;
        this.claims = claims;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user's OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
        private String subjectId;

        /**
         * The user's OCID.
         * @param subjectId the value to set
         * @return this builder
         **/
        public Builder subjectId(String subjectId) {
            this.subjectId = subjectId;
            this.__explicitlySet__.add("subjectId");
            return this;
        }
        /**
         * The tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The tenancy OCID.
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The set of claims for this principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("claims")
        private java.util.List<Claim> claims;

        /**
         * The set of claims for this principal.
         * @param claims the value to set
         * @return this builder
         **/
        public Builder claims(java.util.List<Claim> claims) {
            this.claims = claims;
            this.__explicitlySet__.add("claims");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Principal build() {
            Principal __instance__ = new Principal(subjectId, tenantId, claims);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Principal o) {
            Builder copiedBuilder =
                    subjectId(o.getSubjectId()).tenantId(o.getTenantId()).claims(o.getClaims());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The user's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
    private final String subjectId;

    /**
     * The user's OCID.
     * @return the value
     **/
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * The tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The tenancy OCID.
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The set of claims for this principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("claims")
    private final java.util.List<Claim> claims;

    /**
     * The set of claims for this principal.
     * @return the value
     **/
    public java.util.List<Claim> getClaims() {
        return claims;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Principal(");
        sb.append("subjectId=").append(String.valueOf(this.subjectId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", claims=").append(String.valueOf(this.claims));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Principal)) {
            return false;
        }

        Principal other = (Principal) o;
        return java.util.Objects.equals(this.subjectId, other.subjectId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.claims, other.claims)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subjectId == null ? 43 : this.subjectId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.claims == null ? 43 : this.claims.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
