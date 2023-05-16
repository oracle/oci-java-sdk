/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Rate Card Summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RateCardSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RateCardSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscribedServiceId",
        "product",
        "timeStart",
        "timeEnd",
        "netUnitPrice",
        "discretionaryDiscountPercentage",
        "overagePrice",
        "isTier",
        "currency",
        "rateCardTiers"
    })
    public RateCardSummary(
            String subscribedServiceId,
            RateCardProduct product,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String netUnitPrice,
            String discretionaryDiscountPercentage,
            String overagePrice,
            Boolean isTier,
            SubscriptionCurrency currency,
            java.util.List<RateCardTier> rateCardTiers) {
        super();
        this.subscribedServiceId = subscribedServiceId;
        this.product = product;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.netUnitPrice = netUnitPrice;
        this.discretionaryDiscountPercentage = discretionaryDiscountPercentage;
        this.overagePrice = overagePrice;
        this.isTier = isTier;
        this.currency = currency;
        this.rateCardTiers = rateCardTiers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SPM internal Subscribed Service ID */
        @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
        private String subscribedServiceId;

        /**
         * SPM internal Subscribed Service ID
         *
         * @param subscribedServiceId the value to set
         * @return this builder
         */
        public Builder subscribedServiceId(String subscribedServiceId) {
            this.subscribedServiceId = subscribedServiceId;
            this.__explicitlySet__.add("subscribedServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private RateCardProduct product;

        public Builder product(RateCardProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /** Rate card start date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Rate card start date
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Rate card end date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Rate card end date
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** Rate card net unit price */
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Rate card net unit price
         *
         * @param netUnitPrice the value to set
         * @return this builder
         */
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /** Rate card discretionary discount percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("discretionaryDiscountPercentage")
        private String discretionaryDiscountPercentage;

        /**
         * Rate card discretionary discount percentage
         *
         * @param discretionaryDiscountPercentage the value to set
         * @return this builder
         */
        public Builder discretionaryDiscountPercentage(String discretionaryDiscountPercentage) {
            this.discretionaryDiscountPercentage = discretionaryDiscountPercentage;
            this.__explicitlySet__.add("discretionaryDiscountPercentage");
            return this;
        }
        /** Rate card overage price */
        @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
        private String overagePrice;

        /**
         * Rate card overage price
         *
         * @param overagePrice the value to set
         * @return this builder
         */
        public Builder overagePrice(String overagePrice) {
            this.overagePrice = overagePrice;
            this.__explicitlySet__.add("overagePrice");
            return this;
        }
        /** Rate card price tier flag */
        @com.fasterxml.jackson.annotation.JsonProperty("isTier")
        private Boolean isTier;

        /**
         * Rate card price tier flag
         *
         * @param isTier the value to set
         * @return this builder
         */
        public Builder isTier(Boolean isTier) {
            this.isTier = isTier;
            this.__explicitlySet__.add("isTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private SubscriptionCurrency currency;

        public Builder currency(SubscriptionCurrency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /** List of tiered rate card prices */
        @com.fasterxml.jackson.annotation.JsonProperty("rateCardTiers")
        private java.util.List<RateCardTier> rateCardTiers;

        /**
         * List of tiered rate card prices
         *
         * @param rateCardTiers the value to set
         * @return this builder
         */
        public Builder rateCardTiers(java.util.List<RateCardTier> rateCardTiers) {
            this.rateCardTiers = rateCardTiers;
            this.__explicitlySet__.add("rateCardTiers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RateCardSummary build() {
            RateCardSummary model =
                    new RateCardSummary(
                            this.subscribedServiceId,
                            this.product,
                            this.timeStart,
                            this.timeEnd,
                            this.netUnitPrice,
                            this.discretionaryDiscountPercentage,
                            this.overagePrice,
                            this.isTier,
                            this.currency,
                            this.rateCardTiers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RateCardSummary model) {
            if (model.wasPropertyExplicitlySet("subscribedServiceId")) {
                this.subscribedServiceId(model.getSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("discretionaryDiscountPercentage")) {
                this.discretionaryDiscountPercentage(model.getDiscretionaryDiscountPercentage());
            }
            if (model.wasPropertyExplicitlySet("overagePrice")) {
                this.overagePrice(model.getOveragePrice());
            }
            if (model.wasPropertyExplicitlySet("isTier")) {
                this.isTier(model.getIsTier());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("rateCardTiers")) {
                this.rateCardTiers(model.getRateCardTiers());
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

    /** SPM internal Subscribed Service ID */
    @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
    private final String subscribedServiceId;

    /**
     * SPM internal Subscribed Service ID
     *
     * @return the value
     */
    public String getSubscribedServiceId() {
        return subscribedServiceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final RateCardProduct product;

    public RateCardProduct getProduct() {
        return product;
    }

    /** Rate card start date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Rate card start date
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Rate card end date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Rate card end date
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** Rate card net unit price */
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Rate card net unit price
     *
     * @return the value
     */
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /** Rate card discretionary discount percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("discretionaryDiscountPercentage")
    private final String discretionaryDiscountPercentage;

    /**
     * Rate card discretionary discount percentage
     *
     * @return the value
     */
    public String getDiscretionaryDiscountPercentage() {
        return discretionaryDiscountPercentage;
    }

    /** Rate card overage price */
    @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
    private final String overagePrice;

    /**
     * Rate card overage price
     *
     * @return the value
     */
    public String getOveragePrice() {
        return overagePrice;
    }

    /** Rate card price tier flag */
    @com.fasterxml.jackson.annotation.JsonProperty("isTier")
    private final Boolean isTier;

    /**
     * Rate card price tier flag
     *
     * @return the value
     */
    public Boolean getIsTier() {
        return isTier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final SubscriptionCurrency currency;

    public SubscriptionCurrency getCurrency() {
        return currency;
    }

    /** List of tiered rate card prices */
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardTiers")
    private final java.util.List<RateCardTier> rateCardTiers;

    /**
     * List of tiered rate card prices
     *
     * @return the value
     */
    public java.util.List<RateCardTier> getRateCardTiers() {
        return rateCardTiers;
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
        sb.append("RateCardSummary(");
        sb.append("super=").append(super.toString());
        sb.append("subscribedServiceId=").append(String.valueOf(this.subscribedServiceId));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", discretionaryDiscountPercentage=")
                .append(String.valueOf(this.discretionaryDiscountPercentage));
        sb.append(", overagePrice=").append(String.valueOf(this.overagePrice));
        sb.append(", isTier=").append(String.valueOf(this.isTier));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", rateCardTiers=").append(String.valueOf(this.rateCardTiers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RateCardSummary)) {
            return false;
        }

        RateCardSummary other = (RateCardSummary) o;
        return java.util.Objects.equals(this.subscribedServiceId, other.subscribedServiceId)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(
                        this.discretionaryDiscountPercentage, other.discretionaryDiscountPercentage)
                && java.util.Objects.equals(this.overagePrice, other.overagePrice)
                && java.util.Objects.equals(this.isTier, other.isTier)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.rateCardTiers, other.rateCardTiers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscribedServiceId == null
                                ? 43
                                : this.subscribedServiceId.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result =
                (result * PRIME)
                        + (this.discretionaryDiscountPercentage == null
                                ? 43
                                : this.discretionaryDiscountPercentage.hashCode());
        result = (result * PRIME) + (this.overagePrice == null ? 43 : this.overagePrice.hashCode());
        result = (result * PRIME) + (this.isTier == null ? 43 : this.isTier.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result =
                (result * PRIME)
                        + (this.rateCardTiers == null ? 43 : this.rateCardTiers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
