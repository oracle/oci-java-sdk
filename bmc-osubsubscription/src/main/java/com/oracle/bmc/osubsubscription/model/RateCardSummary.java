/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Rate Card Summary
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RateCardSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RateCardSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discretionaryDiscountPercentage")
        private String discretionaryDiscountPercentage;

        public Builder discretionaryDiscountPercentage(String discretionaryDiscountPercentage) {
            this.discretionaryDiscountPercentage = discretionaryDiscountPercentage;
            this.__explicitlySet__.add("discretionaryDiscountPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
        private String overagePrice;

        public Builder overagePrice(String overagePrice) {
            this.overagePrice = overagePrice;
            this.__explicitlySet__.add("overagePrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTier")
        private Boolean isTier;

        public Builder isTier(Boolean isTier) {
            this.isTier = isTier;
            this.__explicitlySet__.add("isTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private Currency currency;

        public Builder currency(Currency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardTiers")
        private java.util.List<RateCardTier> rateCardTiers;

        public Builder rateCardTiers(java.util.List<RateCardTier> rateCardTiers) {
            this.rateCardTiers = rateCardTiers;
            this.__explicitlySet__.add("rateCardTiers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RateCardSummary build() {
            RateCardSummary __instance__ =
                    new RateCardSummary(
                            product,
                            timeStart,
                            timeEnd,
                            netUnitPrice,
                            discretionaryDiscountPercentage,
                            overagePrice,
                            isTier,
                            currency,
                            rateCardTiers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RateCardSummary o) {
            Builder copiedBuilder =
                    product(o.getProduct())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .netUnitPrice(o.getNetUnitPrice())
                            .discretionaryDiscountPercentage(o.getDiscretionaryDiscountPercentage())
                            .overagePrice(o.getOveragePrice())
                            .isTier(o.getIsTier())
                            .currency(o.getCurrency())
                            .rateCardTiers(o.getRateCardTiers());

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

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    Product product;

    /**
     * Rate card start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Rate card end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * Rate card net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    String netUnitPrice;

    /**
     * Rate card discretionary discount percentage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discretionaryDiscountPercentage")
    String discretionaryDiscountPercentage;

    /**
     * Rate card overage price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
    String overagePrice;

    /**
     * Rate card price tier flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTier")
    Boolean isTier;

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    Currency currency;

    /**
     * List of tiered rate card prices
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardTiers")
    java.util.List<RateCardTier> rateCardTiers;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
