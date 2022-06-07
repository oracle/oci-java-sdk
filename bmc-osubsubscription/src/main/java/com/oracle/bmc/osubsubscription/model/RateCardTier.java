/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Rate Card Tier details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RateCardTier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RateCardTier {
    @Deprecated
    @java.beans.ConstructorProperties({"upToQuantity", "netUnitPrice", "overagePrice"})
    public RateCardTier(String upToQuantity, String netUnitPrice, String overagePrice) {
        super();
        this.upToQuantity = upToQuantity;
        this.netUnitPrice = netUnitPrice;
        this.overagePrice = overagePrice;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("upToQuantity")
        private String upToQuantity;

        public Builder upToQuantity(String upToQuantity) {
            this.upToQuantity = upToQuantity;
            this.__explicitlySet__.add("upToQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
        private String overagePrice;

        public Builder overagePrice(String overagePrice) {
            this.overagePrice = overagePrice;
            this.__explicitlySet__.add("overagePrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RateCardTier build() {
            RateCardTier __instance__ = new RateCardTier(upToQuantity, netUnitPrice, overagePrice);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RateCardTier o) {
            Builder copiedBuilder =
                    upToQuantity(o.getUpToQuantity())
                            .netUnitPrice(o.getNetUnitPrice())
                            .overagePrice(o.getOveragePrice());

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
     * Rate card tier quantity range
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upToQuantity")
    private final String upToQuantity;

    public String getUpToQuantity() {
        return upToQuantity;
    }

    /**
     * Rate card tier net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Rate card tier overage price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
    private final String overagePrice;

    public String getOveragePrice() {
        return overagePrice;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RateCardTier(");
        sb.append("upToQuantity=").append(String.valueOf(this.upToQuantity));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", overagePrice=").append(String.valueOf(this.overagePrice));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RateCardTier)) {
            return false;
        }

        RateCardTier other = (RateCardTier) o;
        return java.util.Objects.equals(this.upToQuantity, other.upToQuantity)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.overagePrice, other.overagePrice)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.upToQuantity == null ? 43 : this.upToQuantity.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.overagePrice == null ? 43 : this.overagePrice.hashCode());
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
