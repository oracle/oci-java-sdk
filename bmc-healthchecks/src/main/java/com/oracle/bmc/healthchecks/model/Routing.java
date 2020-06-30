/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The routing information for a vantage point.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Routing.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Routing {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("asLabel")
        private String asLabel;

        public Builder asLabel(String asLabel) {
            this.asLabel = asLabel;
            this.__explicitlySet__.add("asLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asn")
        private Integer asn;

        public Builder asn(Integer asn) {
            this.asn = asn;
            this.__explicitlySet__.add("asn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Routing build() {
            Routing __instance__ = new Routing(asLabel, asn, prefix, weight);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Routing o) {
            Builder copiedBuilder =
                    asLabel(o.getAsLabel())
                            .asn(o.getAsn())
                            .prefix(o.getPrefix())
                            .weight(o.getWeight());

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
     * The registry label for `asn`, usually the name of the organization that
     * owns the ASN. May be omitted or null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asLabel")
    String asLabel;

    /**
     * The Autonomous System Number (ASN) identifying the organization
     * responsible for routing packets to `prefix`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asn")
    Integer asn;

    /**
     * An IP prefix (CIDR syntax) that is less specific than
     * `address`, through which `address` is routed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    String prefix;

    /**
     * An integer between 0 and 100 used to select between multiple
     * origin ASNs when routing to `prefix`. Most prefixes have
     * exactly one origin ASN, in which case `weight` will be 100.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    Integer weight;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
