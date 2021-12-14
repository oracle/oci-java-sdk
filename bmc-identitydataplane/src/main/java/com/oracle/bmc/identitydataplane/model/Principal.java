/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Principal.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Principal {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
        private String subjectId;

        public Builder subjectId(String subjectId) {
            this.subjectId = subjectId;
            this.__explicitlySet__.add("subjectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("claims")
        private java.util.List<Claim> claims;

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

    /**
     * The user's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
    String subjectId;

    /**
     * The tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The set of claims for this principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("claims")
    java.util.List<Claim> claims;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
