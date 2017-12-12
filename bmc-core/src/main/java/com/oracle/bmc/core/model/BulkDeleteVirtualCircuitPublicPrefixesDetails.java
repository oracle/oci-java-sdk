/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkDeleteVirtualCircuitPublicPrefixesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BulkDeleteVirtualCircuitPublicPrefixesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<DeleteVirtualCircuitPublicPrefixDetails> publicPrefixes;

        public Builder publicPrefixes(
                java.util.List<DeleteVirtualCircuitPublicPrefixDetails> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDeleteVirtualCircuitPublicPrefixesDetails build() {
            BulkDeleteVirtualCircuitPublicPrefixesDetails __instance__ =
                    new BulkDeleteVirtualCircuitPublicPrefixesDetails(publicPrefixes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDeleteVirtualCircuitPublicPrefixesDetails o) {
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

    /**
     * The public IP prefixes (CIDRs) to remove from the public virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    java.util.List<DeleteVirtualCircuitPublicPrefixDetails> publicPrefixes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
