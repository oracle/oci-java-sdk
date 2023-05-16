/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The redemption summary for the requested subscription ID and date range. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RedemptionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RedemptionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeRedeemed",
        "redemptionEmail",
        "redemptionCode",
        "invoiceNumber",
        "invoiceTotalAmount",
        "invoiceCurrency",
        "redeemedRewards",
        "baseRewards",
        "fxRate",
        "timeInvoiced"
    })
    public RedemptionSummary(
            java.util.Date timeRedeemed,
            String redemptionEmail,
            String redemptionCode,
            String invoiceNumber,
            Double invoiceTotalAmount,
            String invoiceCurrency,
            Float redeemedRewards,
            Float baseRewards,
            Double fxRate,
            java.util.Date timeInvoiced) {
        super();
        this.timeRedeemed = timeRedeemed;
        this.redemptionEmail = redemptionEmail;
        this.redemptionCode = redemptionCode;
        this.invoiceNumber = invoiceNumber;
        this.invoiceTotalAmount = invoiceTotalAmount;
        this.invoiceCurrency = invoiceCurrency;
        this.redeemedRewards = redeemedRewards;
        this.baseRewards = baseRewards;
        this.fxRate = fxRate;
        this.timeInvoiced = timeInvoiced;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** It provides redeem date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRedeemed")
        private java.util.Date timeRedeemed;

        /**
         * It provides redeem date.
         *
         * @param timeRedeemed the value to set
         * @return this builder
         */
        public Builder timeRedeemed(java.util.Date timeRedeemed) {
            this.timeRedeemed = timeRedeemed;
            this.__explicitlySet__.add("timeRedeemed");
            return this;
        }
        /** It provides the redemption email id. */
        @com.fasterxml.jackson.annotation.JsonProperty("redemptionEmail")
        private String redemptionEmail;

        /**
         * It provides the redemption email id.
         *
         * @param redemptionEmail the value to set
         * @return this builder
         */
        public Builder redemptionEmail(String redemptionEmail) {
            this.redemptionEmail = redemptionEmail;
            this.__explicitlySet__.add("redemptionEmail");
            return this;
        }
        /** The redemption code used in the Billing Center during the reward redemption process. */
        @com.fasterxml.jackson.annotation.JsonProperty("redemptionCode")
        private String redemptionCode;

        /**
         * The redemption code used in the Billing Center during the reward redemption process.
         *
         * @param redemptionCode the value to set
         * @return this builder
         */
        public Builder redemptionCode(String redemptionCode) {
            this.redemptionCode = redemptionCode;
            this.__explicitlySet__.add("redemptionCode");
            return this;
        }
        /** It provides the invoice number against the redemption. */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
        private String invoiceNumber;

        /**
         * It provides the invoice number against the redemption.
         *
         * @param invoiceNumber the value to set
         * @return this builder
         */
        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            this.__explicitlySet__.add("invoiceNumber");
            return this;
        }
        /** It provides the invoice total amount of given redemption. */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceTotalAmount")
        private Double invoiceTotalAmount;

        /**
         * It provides the invoice total amount of given redemption.
         *
         * @param invoiceTotalAmount the value to set
         * @return this builder
         */
        public Builder invoiceTotalAmount(Double invoiceTotalAmount) {
            this.invoiceTotalAmount = invoiceTotalAmount;
            this.__explicitlySet__.add("invoiceTotalAmount");
            return this;
        }
        /** The currency associated with invoice. */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceCurrency")
        private String invoiceCurrency;

        /**
         * The currency associated with invoice.
         *
         * @param invoiceCurrency the value to set
         * @return this builder
         */
        public Builder invoiceCurrency(String invoiceCurrency) {
            this.invoiceCurrency = invoiceCurrency;
            this.__explicitlySet__.add("invoiceCurrency");
            return this;
        }
        /** It provides the redeemed rewards in invoice currency. */
        @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
        private Float redeemedRewards;

        /**
         * It provides the redeemed rewards in invoice currency.
         *
         * @param redeemedRewards the value to set
         * @return this builder
         */
        public Builder redeemedRewards(Float redeemedRewards) {
            this.redeemedRewards = redeemedRewards;
            this.__explicitlySet__.add("redeemedRewards");
            return this;
        }
        /** It provides the redeemed rewards in base/subscription currency. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseRewards")
        private Float baseRewards;

        /**
         * It provides the redeemed rewards in base/subscription currency.
         *
         * @param baseRewards the value to set
         * @return this builder
         */
        public Builder baseRewards(Float baseRewards) {
            this.baseRewards = baseRewards;
            this.__explicitlySet__.add("baseRewards");
            return this;
        }
        /** It provides the fxRate between invoice currency and subscription currency. */
        @com.fasterxml.jackson.annotation.JsonProperty("fxRate")
        private Double fxRate;

        /**
         * It provides the fxRate between invoice currency and subscription currency.
         *
         * @param fxRate the value to set
         * @return this builder
         */
        public Builder fxRate(Double fxRate) {
            this.fxRate = fxRate;
            this.__explicitlySet__.add("fxRate");
            return this;
        }
        /** It provides the invoice date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiced")
        private java.util.Date timeInvoiced;

        /**
         * It provides the invoice date.
         *
         * @param timeInvoiced the value to set
         * @return this builder
         */
        public Builder timeInvoiced(java.util.Date timeInvoiced) {
            this.timeInvoiced = timeInvoiced;
            this.__explicitlySet__.add("timeInvoiced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedemptionSummary build() {
            RedemptionSummary model =
                    new RedemptionSummary(
                            this.timeRedeemed,
                            this.redemptionEmail,
                            this.redemptionCode,
                            this.invoiceNumber,
                            this.invoiceTotalAmount,
                            this.invoiceCurrency,
                            this.redeemedRewards,
                            this.baseRewards,
                            this.fxRate,
                            this.timeInvoiced);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedemptionSummary model) {
            if (model.wasPropertyExplicitlySet("timeRedeemed")) {
                this.timeRedeemed(model.getTimeRedeemed());
            }
            if (model.wasPropertyExplicitlySet("redemptionEmail")) {
                this.redemptionEmail(model.getRedemptionEmail());
            }
            if (model.wasPropertyExplicitlySet("redemptionCode")) {
                this.redemptionCode(model.getRedemptionCode());
            }
            if (model.wasPropertyExplicitlySet("invoiceNumber")) {
                this.invoiceNumber(model.getInvoiceNumber());
            }
            if (model.wasPropertyExplicitlySet("invoiceTotalAmount")) {
                this.invoiceTotalAmount(model.getInvoiceTotalAmount());
            }
            if (model.wasPropertyExplicitlySet("invoiceCurrency")) {
                this.invoiceCurrency(model.getInvoiceCurrency());
            }
            if (model.wasPropertyExplicitlySet("redeemedRewards")) {
                this.redeemedRewards(model.getRedeemedRewards());
            }
            if (model.wasPropertyExplicitlySet("baseRewards")) {
                this.baseRewards(model.getBaseRewards());
            }
            if (model.wasPropertyExplicitlySet("fxRate")) {
                this.fxRate(model.getFxRate());
            }
            if (model.wasPropertyExplicitlySet("timeInvoiced")) {
                this.timeInvoiced(model.getTimeInvoiced());
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

    /** It provides redeem date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRedeemed")
    private final java.util.Date timeRedeemed;

    /**
     * It provides redeem date.
     *
     * @return the value
     */
    public java.util.Date getTimeRedeemed() {
        return timeRedeemed;
    }

    /** It provides the redemption email id. */
    @com.fasterxml.jackson.annotation.JsonProperty("redemptionEmail")
    private final String redemptionEmail;

    /**
     * It provides the redemption email id.
     *
     * @return the value
     */
    public String getRedemptionEmail() {
        return redemptionEmail;
    }

    /** The redemption code used in the Billing Center during the reward redemption process. */
    @com.fasterxml.jackson.annotation.JsonProperty("redemptionCode")
    private final String redemptionCode;

    /**
     * The redemption code used in the Billing Center during the reward redemption process.
     *
     * @return the value
     */
    public String getRedemptionCode() {
        return redemptionCode;
    }

    /** It provides the invoice number against the redemption. */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
    private final String invoiceNumber;

    /**
     * It provides the invoice number against the redemption.
     *
     * @return the value
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /** It provides the invoice total amount of given redemption. */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceTotalAmount")
    private final Double invoiceTotalAmount;

    /**
     * It provides the invoice total amount of given redemption.
     *
     * @return the value
     */
    public Double getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    /** The currency associated with invoice. */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceCurrency")
    private final String invoiceCurrency;

    /**
     * The currency associated with invoice.
     *
     * @return the value
     */
    public String getInvoiceCurrency() {
        return invoiceCurrency;
    }

    /** It provides the redeemed rewards in invoice currency. */
    @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
    private final Float redeemedRewards;

    /**
     * It provides the redeemed rewards in invoice currency.
     *
     * @return the value
     */
    public Float getRedeemedRewards() {
        return redeemedRewards;
    }

    /** It provides the redeemed rewards in base/subscription currency. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseRewards")
    private final Float baseRewards;

    /**
     * It provides the redeemed rewards in base/subscription currency.
     *
     * @return the value
     */
    public Float getBaseRewards() {
        return baseRewards;
    }

    /** It provides the fxRate between invoice currency and subscription currency. */
    @com.fasterxml.jackson.annotation.JsonProperty("fxRate")
    private final Double fxRate;

    /**
     * It provides the fxRate between invoice currency and subscription currency.
     *
     * @return the value
     */
    public Double getFxRate() {
        return fxRate;
    }

    /** It provides the invoice date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiced")
    private final java.util.Date timeInvoiced;

    /**
     * It provides the invoice date.
     *
     * @return the value
     */
    public java.util.Date getTimeInvoiced() {
        return timeInvoiced;
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
        sb.append("RedemptionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeRedeemed=").append(String.valueOf(this.timeRedeemed));
        sb.append(", redemptionEmail=").append(String.valueOf(this.redemptionEmail));
        sb.append(", redemptionCode=").append(String.valueOf(this.redemptionCode));
        sb.append(", invoiceNumber=").append(String.valueOf(this.invoiceNumber));
        sb.append(", invoiceTotalAmount=").append(String.valueOf(this.invoiceTotalAmount));
        sb.append(", invoiceCurrency=").append(String.valueOf(this.invoiceCurrency));
        sb.append(", redeemedRewards=").append(String.valueOf(this.redeemedRewards));
        sb.append(", baseRewards=").append(String.valueOf(this.baseRewards));
        sb.append(", fxRate=").append(String.valueOf(this.fxRate));
        sb.append(", timeInvoiced=").append(String.valueOf(this.timeInvoiced));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedemptionSummary)) {
            return false;
        }

        RedemptionSummary other = (RedemptionSummary) o;
        return java.util.Objects.equals(this.timeRedeemed, other.timeRedeemed)
                && java.util.Objects.equals(this.redemptionEmail, other.redemptionEmail)
                && java.util.Objects.equals(this.redemptionCode, other.redemptionCode)
                && java.util.Objects.equals(this.invoiceNumber, other.invoiceNumber)
                && java.util.Objects.equals(this.invoiceTotalAmount, other.invoiceTotalAmount)
                && java.util.Objects.equals(this.invoiceCurrency, other.invoiceCurrency)
                && java.util.Objects.equals(this.redeemedRewards, other.redeemedRewards)
                && java.util.Objects.equals(this.baseRewards, other.baseRewards)
                && java.util.Objects.equals(this.fxRate, other.fxRate)
                && java.util.Objects.equals(this.timeInvoiced, other.timeInvoiced)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeRedeemed == null ? 43 : this.timeRedeemed.hashCode());
        result =
                (result * PRIME)
                        + (this.redemptionEmail == null ? 43 : this.redemptionEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.redemptionCode == null ? 43 : this.redemptionCode.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceNumber == null ? 43 : this.invoiceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceTotalAmount == null
                                ? 43
                                : this.invoiceTotalAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceCurrency == null ? 43 : this.invoiceCurrency.hashCode());
        result =
                (result * PRIME)
                        + (this.redeemedRewards == null ? 43 : this.redeemedRewards.hashCode());
        result = (result * PRIME) + (this.baseRewards == null ? 43 : this.baseRewards.hashCode());
        result = (result * PRIME) + (this.fxRate == null ? 43 : this.fxRate.hashCode());
        result = (result * PRIME) + (this.timeInvoiced == null ? 43 : this.timeInvoiced.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
