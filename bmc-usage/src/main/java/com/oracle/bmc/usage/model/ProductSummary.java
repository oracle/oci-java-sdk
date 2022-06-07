/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Provides details about product rewards and the usage amount.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProductSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProductSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "productNumber",
        "productName",
        "usageAmount",
        "earnedRewards",
        "isEligibleToEarnRewards"
    })
    public ProductSummary(
            String productNumber,
            String productName,
            Double usageAmount,
            Float earnedRewards,
            Boolean isEligibleToEarnRewards) {
        super();
        this.productNumber = productNumber;
        this.productName = productName;
        this.usageAmount = usageAmount;
        this.earnedRewards = earnedRewards;
        this.isEligibleToEarnRewards = isEligibleToEarnRewards;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The rate card product number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productNumber")
    private final String productNumber;

    public String getProductNumber() {
        return productNumber;
    }

    /**
     * The rate card product name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    public String getProductName() {
        return productName;
    }

    /**
     * The rate card product usage amount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    private final Double usageAmount;

    public Double getUsageAmount() {
        return usageAmount;
    }

    /**
     * The earned rewards for the product.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    private final Float earnedRewards;

    public Float getEarnedRewards() {
        return earnedRewards;
    }

    /**
     * The boolean parameter to indicate if the product is eligible to earn rewards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleToEarnRewards")
    private final Boolean isEligibleToEarnRewards;

    public Boolean getIsEligibleToEarnRewards() {
        return isEligibleToEarnRewards;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProductSummary(");
        sb.append("productNumber=").append(String.valueOf(this.productNumber));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", usageAmount=").append(String.valueOf(this.usageAmount));
        sb.append(", earnedRewards=").append(String.valueOf(this.earnedRewards));
        sb.append(", isEligibleToEarnRewards=")
                .append(String.valueOf(this.isEligibleToEarnRewards));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductSummary)) {
            return false;
        }

        ProductSummary other = (ProductSummary) o;
        return java.util.Objects.equals(this.productNumber, other.productNumber)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.usageAmount, other.usageAmount)
                && java.util.Objects.equals(this.earnedRewards, other.earnedRewards)
                && java.util.Objects.equals(
                        this.isEligibleToEarnRewards, other.isEligibleToEarnRewards)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.productNumber == null ? 43 : this.productNumber.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.usageAmount == null ? 43 : this.usageAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.earnedRewards == null ? 43 : this.earnedRewards.hashCode());
        result =
                (result * PRIME)
                        + (this.isEligibleToEarnRewards == null
                                ? 43
                                : this.isEligibleToEarnRewards.hashCode());
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
