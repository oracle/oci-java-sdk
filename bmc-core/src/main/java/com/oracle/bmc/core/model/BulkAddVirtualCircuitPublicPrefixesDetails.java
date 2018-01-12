/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkAddVirtualCircuitPublicPrefixesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BulkAddVirtualCircuitPublicPrefixesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

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

    /**
     * The public IP prefixes (CIDRs) to add to the public virtual circuit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
