/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkAddVirtualCircuitPublicPrefixesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkAddVirtualCircuitPublicPrefixesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"publicPrefixes"})
    public BulkAddVirtualCircuitPublicPrefixesDetails(
            java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes) {
        super();
        this.publicPrefixes = publicPrefixes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The public IP prefixes (CIDRs) to add to the public virtual circuit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

        /**
         * The public IP prefixes (CIDRs) to add to the public virtual circuit.
         * @param publicPrefixes the value to set
         * @return this builder
         **/
        public Builder publicPrefixes(
                java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkAddVirtualCircuitPublicPrefixesDetails build() {
            BulkAddVirtualCircuitPublicPrefixesDetails __instance__ =
                    new BulkAddVirtualCircuitPublicPrefixesDetails(publicPrefixes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkAddVirtualCircuitPublicPrefixesDetails o) {
            Builder copiedBuilder = publicPrefixes(o.getPublicPrefixes());

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
     * The public IP prefixes (CIDRs) to add to the public virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    private final java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

    /**
     * The public IP prefixes (CIDRs) to add to the public virtual circuit.
     * @return the value
     **/
    public java.util.List<CreateVirtualCircuitPublicPrefixDetails> getPublicPrefixes() {
        return publicPrefixes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkAddVirtualCircuitPublicPrefixesDetails(");
        sb.append("publicPrefixes=").append(String.valueOf(this.publicPrefixes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkAddVirtualCircuitPublicPrefixesDetails)) {
            return false;
        }

        BulkAddVirtualCircuitPublicPrefixesDetails other =
                (BulkAddVirtualCircuitPublicPrefixesDetails) o;
        return java.util.Objects.equals(this.publicPrefixes, other.publicPrefixes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.publicPrefixes == null ? 43 : this.publicPrefixes.hashCode());
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
