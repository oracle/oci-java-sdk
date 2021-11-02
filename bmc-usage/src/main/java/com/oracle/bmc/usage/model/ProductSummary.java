/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * It provides details about a product rewards and usage amount.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProductSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProductSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("productNumber")
        private String productNumber;

        public Builder productNumber(String productNumber) {
            this.productNumber = productNumber;
            this.__explicitlySet__.add("productNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
        private Double usageAmount;

        public Builder usageAmount(Double usageAmount) {
            this.usageAmount = usageAmount;
            this.__explicitlySet__.add("usageAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
        private Float earnedRewards;

        public Builder earnedRewards(Float earnedRewards) {
            this.earnedRewards = earnedRewards;
            this.__explicitlySet__.add("earnedRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleToEarnRewards")
        private Boolean isEligibleToEarnRewards;

        public Builder isEligibleToEarnRewards(Boolean isEligibleToEarnRewards) {
            this.isEligibleToEarnRewards = isEligibleToEarnRewards;
            this.__explicitlySet__.add("isEligibleToEarnRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductSummary build() {
            ProductSummary __instance__ =
                    new ProductSummary(
                            productNumber,
                            productName,
                            usageAmount,
                            earnedRewards,
                            isEligibleToEarnRewards);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductSummary o) {
            Builder copiedBuilder =
                    productNumber(o.getProductNumber())
                            .productName(o.getProductName())
                            .usageAmount(o.getUsageAmount())
                            .earnedRewards(o.getEarnedRewards())
                            .isEligibleToEarnRewards(o.getIsEligibleToEarnRewards());

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
     * The ratecard product number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productNumber")
    String productNumber;

    /**
     * The ratecard product Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    String productName;

    /**
     * The ratecard product usage amount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    Double usageAmount;

    /**
     * The earned rewards for the product.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    Float earnedRewards;

    /**
     * The boolean flag to tell if the product is eligible for earning rewards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleToEarnRewards")
    Boolean isEligibleToEarnRewards;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
