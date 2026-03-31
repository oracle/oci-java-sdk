/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * The details of a subscription
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscriptionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pricingPlan",
        "partnerRegistrationUrl",
        "currency",
        "amount",
        "billingDetails",
        "isAutoRenew"
    })
    public SubscriptionDetails(
            PricingPlan pricingPlan,
            String partnerRegistrationUrl,
            String currency,
            Float amount,
            BillingDetails billingDetails,
            Boolean isAutoRenew) {
        super();
        this.pricingPlan = pricingPlan;
        this.partnerRegistrationUrl = partnerRegistrationUrl;
        this.currency = currency;
        this.amount = amount;
        this.billingDetails = billingDetails;
        this.isAutoRenew = isAutoRenew;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlan")
        private PricingPlan pricingPlan;

        public Builder pricingPlan(PricingPlan pricingPlan) {
            this.pricingPlan = pricingPlan;
            this.__explicitlySet__.add("pricingPlan");
            return this;
        }
        /**
         * The activation link given by the partner.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerRegistrationUrl")
        private String partnerRegistrationUrl;

        /**
         * The activation link given by the partner.
         * @param partnerRegistrationUrl the value to set
         * @return this builder
         **/
        public Builder partnerRegistrationUrl(String partnerRegistrationUrl) {
            this.partnerRegistrationUrl = partnerRegistrationUrl;
            this.__explicitlySet__.add("partnerRegistrationUrl");
            return this;
        }
        /**
         * The currency supported, in the format specified by ISO-4217
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        /**
         * The currency supported, in the format specified by ISO-4217
         * @param currency the value to set
         * @return this builder
         **/
        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /**
         * Tha amount for the currency type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private Float amount;

        /**
         * Tha amount for the currency type.
         * @param amount the value to set
         * @return this builder
         **/
        public Builder amount(Float amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingDetails")
        private BillingDetails billingDetails;

        public Builder billingDetails(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            this.__explicitlySet__.add("billingDetails");
            return this;
        }
        /**
         * Whether subscription should be auto-renewed at the end of cycle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoRenew")
        private Boolean isAutoRenew;

        /**
         * Whether subscription should be auto-renewed at the end of cycle.
         * @param isAutoRenew the value to set
         * @return this builder
         **/
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            this.__explicitlySet__.add("isAutoRenew");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionDetails build() {
            SubscriptionDetails model =
                    new SubscriptionDetails(
                            this.pricingPlan,
                            this.partnerRegistrationUrl,
                            this.currency,
                            this.amount,
                            this.billingDetails,
                            this.isAutoRenew);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionDetails model) {
            if (model.wasPropertyExplicitlySet("pricingPlan")) {
                this.pricingPlan(model.getPricingPlan());
            }
            if (model.wasPropertyExplicitlySet("partnerRegistrationUrl")) {
                this.partnerRegistrationUrl(model.getPartnerRegistrationUrl());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("billingDetails")) {
                this.billingDetails(model.getBillingDetails());
            }
            if (model.wasPropertyExplicitlySet("isAutoRenew")) {
                this.isAutoRenew(model.getIsAutoRenew());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlan")
    private final PricingPlan pricingPlan;

    public PricingPlan getPricingPlan() {
        return pricingPlan;
    }

    /**
     * The activation link given by the partner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerRegistrationUrl")
    private final String partnerRegistrationUrl;

    /**
     * The activation link given by the partner.
     * @return the value
     **/
    public String getPartnerRegistrationUrl() {
        return partnerRegistrationUrl;
    }

    /**
     * The currency supported, in the format specified by ISO-4217
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final String currency;

    /**
     * The currency supported, in the format specified by ISO-4217
     * @return the value
     **/
    public String getCurrency() {
        return currency;
    }

    /**
     * Tha amount for the currency type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final Float amount;

    /**
     * Tha amount for the currency type.
     * @return the value
     **/
    public Float getAmount() {
        return amount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billingDetails")
    private final BillingDetails billingDetails;

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Whether subscription should be auto-renewed at the end of cycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoRenew")
    private final Boolean isAutoRenew;

    /**
     * Whether subscription should be auto-renewed at the end of cycle.
     * @return the value
     **/
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SubscriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pricingPlan=").append(String.valueOf(this.pricingPlan));
        sb.append(", partnerRegistrationUrl=").append(String.valueOf(this.partnerRegistrationUrl));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", billingDetails=").append(String.valueOf(this.billingDetails));
        sb.append(", isAutoRenew=").append(String.valueOf(this.isAutoRenew));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionDetails)) {
            return false;
        }

        SubscriptionDetails other = (SubscriptionDetails) o;
        return java.util.Objects.equals(this.pricingPlan, other.pricingPlan)
                && java.util.Objects.equals(
                        this.partnerRegistrationUrl, other.partnerRegistrationUrl)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(this.billingDetails, other.billingDetails)
                && java.util.Objects.equals(this.isAutoRenew, other.isAutoRenew)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pricingPlan == null ? 43 : this.pricingPlan.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerRegistrationUrl == null
                                ? 43
                                : this.partnerRegistrationUrl.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result =
                (result * PRIME)
                        + (this.billingDetails == null ? 43 : this.billingDetails.hashCode());
        result = (result * PRIME) + (this.isAutoRenew == null ? 43 : this.isAutoRenew.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
