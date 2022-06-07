/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for pricing.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PricingModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PricingModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "payGoStrategy",
        "currency",
        "rate",
        "internationalMarketPrice"
    })
    public PricingModel(
            PricingTypeEnum type,
            PricingStrategyEnum payGoStrategy,
            PricingCurrencyEnum currency,
            java.math.BigDecimal rate,
            InternationalMarketPrice internationalMarketPrice) {
        super();
        this.type = type;
        this.payGoStrategy = payGoStrategy;
        this.currency = currency;
        this.rate = rate;
        this.internationalMarketPrice = internationalMarketPrice;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private PricingTypeEnum type;

        public Builder type(PricingTypeEnum type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("payGoStrategy")
        private PricingStrategyEnum payGoStrategy;

        public Builder payGoStrategy(PricingStrategyEnum payGoStrategy) {
            this.payGoStrategy = payGoStrategy;
            this.__explicitlySet__.add("payGoStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private PricingCurrencyEnum currency;

        public Builder currency(PricingCurrencyEnum currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rate")
        private java.math.BigDecimal rate;

        public Builder rate(java.math.BigDecimal rate) {
            this.rate = rate;
            this.__explicitlySet__.add("rate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internationalMarketPrice")
        private InternationalMarketPrice internationalMarketPrice;

        public Builder internationalMarketPrice(InternationalMarketPrice internationalMarketPrice) {
            this.internationalMarketPrice = internationalMarketPrice;
            this.__explicitlySet__.add("internationalMarketPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PricingModel build() {
            PricingModel __instance__ =
                    new PricingModel(type, payGoStrategy, currency, rate, internationalMarketPrice);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PricingModel o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .payGoStrategy(o.getPayGoStrategy())
                            .currency(o.getCurrency())
                            .rate(o.getRate())
                            .internationalMarketPrice(o.getInternationalMarketPrice());

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
     * The type of the pricing model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final PricingTypeEnum type;

    public PricingTypeEnum getType() {
        return type;
    }

    /**
     * The type of pricing for a PAYGO model, eg PER_OCPU_LINEAR, PER_OCPU_MIN_BILLING, PER_INSTANCE.  Null if type is not PAYGO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("payGoStrategy")
    private final PricingStrategyEnum payGoStrategy;

    public PricingStrategyEnum getPayGoStrategy() {
        return payGoStrategy;
    }

    /**
     * The currency of the pricing model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final PricingCurrencyEnum currency;

    public PricingCurrencyEnum getCurrency() {
        return currency;
    }

    /**
     * The pricing rate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rate")
    private final java.math.BigDecimal rate;

    public java.math.BigDecimal getRate() {
        return rate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("internationalMarketPrice")
    private final InternationalMarketPrice internationalMarketPrice;

    public InternationalMarketPrice getInternationalMarketPrice() {
        return internationalMarketPrice;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PricingModel(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", payGoStrategy=").append(String.valueOf(this.payGoStrategy));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", rate=").append(String.valueOf(this.rate));
        sb.append(", internationalMarketPrice=")
                .append(String.valueOf(this.internationalMarketPrice));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PricingModel)) {
            return false;
        }

        PricingModel other = (PricingModel) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.payGoStrategy, other.payGoStrategy)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.rate, other.rate)
                && java.util.Objects.equals(
                        this.internationalMarketPrice, other.internationalMarketPrice)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.payGoStrategy == null ? 43 : this.payGoStrategy.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.rate == null ? 43 : this.rate.hashCode());
        result =
                (result * PRIME)
                        + (this.internationalMarketPrice == null
                                ? 43
                                : this.internationalMarketPrice.hashCode());
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
