/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PricingModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PricingModel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PricingModel build() {
            PricingModel __instance__ = new PricingModel(type, payGoStrategy, currency, rate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PricingModel o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .payGoStrategy(o.getPayGoStrategy())
                            .currency(o.getCurrency())
                            .rate(o.getRate());

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
     * The type of the pricing model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    PricingTypeEnum type;

    /**
     * The type of pricing for a PAYGO model, eg PER_OCPU_LINEAR, PER_OCPU_MIN_BILLING, PER_INSTANCE.  Null if type is not PAYGO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("payGoStrategy")
    PricingStrategyEnum payGoStrategy;

    /**
     * The currency of the pricing model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    PricingCurrencyEnum currency;

    /**
     * The pricing rate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rate")
    java.math.BigDecimal rate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
