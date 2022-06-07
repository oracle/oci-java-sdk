/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Routing.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Routing {
    @Deprecated
    @java.beans.ConstructorProperties({"asLabel", "asn", "prefix", "weight"})
    public Routing(String asLabel, Integer asn, String prefix, Integer weight) {
        super();
        this.asLabel = asLabel;
        this.asn = asn;
        this.prefix = prefix;
        this.weight = weight;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The registry label for {@code asn}, usually the name of the organization that
     * owns the ASN. May be omitted or null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asLabel")
    private final String asLabel;

    public String getAsLabel() {
        return asLabel;
    }

    /**
     * The Autonomous System Number (ASN) identifying the organization
     * responsible for routing packets to {@code prefix}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asn")
    private final Integer asn;

    public Integer getAsn() {
        return asn;
    }

    /**
     * An IP prefix (CIDR syntax) that is less specific than
     * {@code address}, through which {@code address} is routed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    public String getPrefix() {
        return prefix;
    }

    /**
     * An integer between 0 and 100 used to select between multiple
     * origin ASNs when routing to {@code prefix}. Most prefixes have
     * exactly one origin ASN, in which case {@code weight} will be 100.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Routing(");
        sb.append("asLabel=").append(String.valueOf(this.asLabel));
        sb.append(", asn=").append(String.valueOf(this.asn));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Routing)) {
            return false;
        }

        Routing other = (Routing) o;
        return java.util.Objects.equals(this.asLabel, other.asLabel)
                && java.util.Objects.equals(this.asn, other.asn)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.asLabel == null ? 43 : this.asLabel.hashCode());
        result = (result * PRIME) + (this.asn == null ? 43 : this.asn.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
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
