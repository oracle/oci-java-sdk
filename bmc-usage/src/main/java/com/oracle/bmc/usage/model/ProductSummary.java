/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Provides details about product rewards and the usage amount. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProductSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProductSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The rate card product number. */
        @com.fasterxml.jackson.annotation.JsonProperty("productNumber")
        private String productNumber;

        /**
         * The rate card product number.
         *
         * @param productNumber the value to set
         * @return this builder
         */
        public Builder productNumber(String productNumber) {
            this.productNumber = productNumber;
            this.__explicitlySet__.add("productNumber");
            return this;
        }
        /** The rate card product name. */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * The rate card product name.
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /** The rate card product usage amount. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
        private Double usageAmount;

        /**
         * The rate card product usage amount.
         *
         * @param usageAmount the value to set
         * @return this builder
         */
        public Builder usageAmount(Double usageAmount) {
            this.usageAmount = usageAmount;
            this.__explicitlySet__.add("usageAmount");
            return this;
        }
        /** The earned rewards for the product. */
        @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
        private Float earnedRewards;

        /**
         * The earned rewards for the product.
         *
         * @param earnedRewards the value to set
         * @return this builder
         */
        public Builder earnedRewards(Float earnedRewards) {
            this.earnedRewards = earnedRewards;
            this.__explicitlySet__.add("earnedRewards");
            return this;
        }
        /** The boolean parameter to indicate if the product is eligible to earn rewards. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleToEarnRewards")
        private Boolean isEligibleToEarnRewards;

        /**
         * The boolean parameter to indicate if the product is eligible to earn rewards.
         *
         * @param isEligibleToEarnRewards the value to set
         * @return this builder
         */
        public Builder isEligibleToEarnRewards(Boolean isEligibleToEarnRewards) {
            this.isEligibleToEarnRewards = isEligibleToEarnRewards;
            this.__explicitlySet__.add("isEligibleToEarnRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductSummary build() {
            ProductSummary model =
                    new ProductSummary(
                            this.productNumber,
                            this.productName,
                            this.usageAmount,
                            this.earnedRewards,
                            this.isEligibleToEarnRewards);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductSummary model) {
            if (model.wasPropertyExplicitlySet("productNumber")) {
                this.productNumber(model.getProductNumber());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("usageAmount")) {
                this.usageAmount(model.getUsageAmount());
            }
            if (model.wasPropertyExplicitlySet("earnedRewards")) {
                this.earnedRewards(model.getEarnedRewards());
            }
            if (model.wasPropertyExplicitlySet("isEligibleToEarnRewards")) {
                this.isEligibleToEarnRewards(model.getIsEligibleToEarnRewards());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The rate card product number. */
    @com.fasterxml.jackson.annotation.JsonProperty("productNumber")
    private final String productNumber;

    /**
     * The rate card product number.
     *
     * @return the value
     */
    public String getProductNumber() {
        return productNumber;
    }

    /** The rate card product name. */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * The rate card product name.
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /** The rate card product usage amount. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    private final Double usageAmount;

    /**
     * The rate card product usage amount.
     *
     * @return the value
     */
    public Double getUsageAmount() {
        return usageAmount;
    }

    /** The earned rewards for the product. */
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    private final Float earnedRewards;

    /**
     * The earned rewards for the product.
     *
     * @return the value
     */
    public Float getEarnedRewards() {
        return earnedRewards;
    }

    /** The boolean parameter to indicate if the product is eligible to earn rewards. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleToEarnRewards")
    private final Boolean isEligibleToEarnRewards;

    /**
     * The boolean parameter to indicate if the product is eligible to earn rewards.
     *
     * @return the value
     */
    public Boolean getIsEligibleToEarnRewards() {
        return isEligibleToEarnRewards;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProductSummary(");
        sb.append("super=").append(super.toString());
        sb.append("productNumber=").append(String.valueOf(this.productNumber));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", usageAmount=").append(String.valueOf(this.usageAmount));
        sb.append(", earnedRewards=").append(String.valueOf(this.earnedRewards));
        sb.append(", isEligibleToEarnRewards=")
                .append(String.valueOf(this.isEligibleToEarnRewards));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
