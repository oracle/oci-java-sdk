/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Commitment summary for a subscription. <br>
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
        builder = SubscriptionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contractId",
        "subscriptionId",
        "customerName",
        "currencyCode",
        "timeCommitmentStart",
        "timeCommitmentEnd",
        "amountCommitment",
        "amountAuthorized",
        "amountProvisioned",
        "amountConsumed",
        "amountAvailable",
        "commitmentPeriods",
        "productsAndServices"
    })
    public SubscriptionDetails(
            String contractId,
            String subscriptionId,
            String customerName,
            String currencyCode,
            java.util.Date timeCommitmentStart,
            java.util.Date timeCommitmentEnd,
            Double amountCommitment,
            Double amountAuthorized,
            Double amountProvisioned,
            Double amountConsumed,
            Double amountAvailable,
            java.util.List<CommitmentPeriod> commitmentPeriods,
            java.util.List<ProductAndService> productsAndServices) {
        super();
        this.contractId = contractId;
        this.subscriptionId = subscriptionId;
        this.customerName = customerName;
        this.currencyCode = currencyCode;
        this.timeCommitmentStart = timeCommitmentStart;
        this.timeCommitmentEnd = timeCommitmentEnd;
        this.amountCommitment = amountCommitment;
        this.amountAuthorized = amountAuthorized;
        this.amountProvisioned = amountProvisioned;
        this.amountConsumed = amountConsumed;
        this.amountAvailable = amountAvailable;
        this.commitmentPeriods = commitmentPeriods;
        this.productsAndServices = productsAndServices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Contract identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("contractId")
        private String contractId;

        /**
         * Contract identifier.
         *
         * @param contractId the value to set
         * @return this builder
         */
        public Builder contractId(String contractId) {
            this.contractId = contractId;
            this.__explicitlySet__.add("contractId");
            return this;
        }
        /** Subscription identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Subscription identifier.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Sold-to customer name. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerName")
        private String customerName;

        /**
         * Sold-to customer name.
         *
         * @param customerName the value to set
         * @return this builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            this.__explicitlySet__.add("customerName");
            return this;
        }
        /**
         * The currency of the subscription, in the format specified by
         * [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * The currency of the subscription, in the format specified by
         * [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html).
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** Start date and time of the subscription commitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentStart")
        private java.util.Date timeCommitmentStart;

        /**
         * Start date and time of the subscription commitment.
         *
         * @param timeCommitmentStart the value to set
         * @return this builder
         */
        public Builder timeCommitmentStart(java.util.Date timeCommitmentStart) {
            this.timeCommitmentStart = timeCommitmentStart;
            this.__explicitlySet__.add("timeCommitmentStart");
            return this;
        }
        /** End date and time of the subscription commitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentEnd")
        private java.util.Date timeCommitmentEnd;

        /**
         * End date and time of the subscription commitment.
         *
         * @param timeCommitmentEnd the value to set
         * @return this builder
         */
        public Builder timeCommitmentEnd(java.util.Date timeCommitmentEnd) {
            this.timeCommitmentEnd = timeCommitmentEnd;
            this.__explicitlySet__.add("timeCommitmentEnd");
            return this;
        }
        /** Total committed amount for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountCommitment")
        private Double amountCommitment;

        /**
         * Total committed amount for the subscription.
         *
         * @param amountCommitment the value to set
         * @return this builder
         */
        public Builder amountCommitment(Double amountCommitment) {
            this.amountCommitment = amountCommitment;
            this.__explicitlySet__.add("amountCommitment");
            return this;
        }
        /** Amount authorized for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountAuthorized")
        private Double amountAuthorized;

        /**
         * Amount authorized for the subscription.
         *
         * @param amountAuthorized the value to set
         * @return this builder
         */
        public Builder amountAuthorized(Double amountAuthorized) {
            this.amountAuthorized = amountAuthorized;
            this.__explicitlySet__.add("amountAuthorized");
            return this;
        }
        /** Amount provisioned for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountProvisioned")
        private Double amountProvisioned;

        /**
         * Amount provisioned for the subscription.
         *
         * @param amountProvisioned the value to set
         * @return this builder
         */
        public Builder amountProvisioned(Double amountProvisioned) {
            this.amountProvisioned = amountProvisioned;
            this.__explicitlySet__.add("amountProvisioned");
            return this;
        }
        /** Amount consumed from the subscription commitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
        private Double amountConsumed;

        /**
         * Amount consumed from the subscription commitment.
         *
         * @param amountConsumed the value to set
         * @return this builder
         */
        public Builder amountConsumed(Double amountConsumed) {
            this.amountConsumed = amountConsumed;
            this.__explicitlySet__.add("amountConsumed");
            return this;
        }
        /** Amount remaining and available for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountAvailable")
        private Double amountAvailable;

        /**
         * Amount remaining and available for the subscription.
         *
         * @param amountAvailable the value to set
         * @return this builder
         */
        public Builder amountAvailable(Double amountAvailable) {
            this.amountAvailable = amountAvailable;
            this.__explicitlySet__.add("amountAvailable");
            return this;
        }
        /** Commitment periods associated with the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriods")
        private java.util.List<CommitmentPeriod> commitmentPeriods;

        /**
         * Commitment periods associated with the subscription.
         *
         * @param commitmentPeriods the value to set
         * @return this builder
         */
        public Builder commitmentPeriods(java.util.List<CommitmentPeriod> commitmentPeriods) {
            this.commitmentPeriods = commitmentPeriods;
            this.__explicitlySet__.add("commitmentPeriods");
            return this;
        }
        /** Products and services that draw down from the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("productsAndServices")
        private java.util.List<ProductAndService> productsAndServices;

        /**
         * Products and services that draw down from the subscription.
         *
         * @param productsAndServices the value to set
         * @return this builder
         */
        public Builder productsAndServices(java.util.List<ProductAndService> productsAndServices) {
            this.productsAndServices = productsAndServices;
            this.__explicitlySet__.add("productsAndServices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionDetails build() {
            SubscriptionDetails model =
                    new SubscriptionDetails(
                            this.contractId,
                            this.subscriptionId,
                            this.customerName,
                            this.currencyCode,
                            this.timeCommitmentStart,
                            this.timeCommitmentEnd,
                            this.amountCommitment,
                            this.amountAuthorized,
                            this.amountProvisioned,
                            this.amountConsumed,
                            this.amountAvailable,
                            this.commitmentPeriods,
                            this.productsAndServices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionDetails model) {
            if (model.wasPropertyExplicitlySet("contractId")) {
                this.contractId(model.getContractId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("customerName")) {
                this.customerName(model.getCustomerName());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("timeCommitmentStart")) {
                this.timeCommitmentStart(model.getTimeCommitmentStart());
            }
            if (model.wasPropertyExplicitlySet("timeCommitmentEnd")) {
                this.timeCommitmentEnd(model.getTimeCommitmentEnd());
            }
            if (model.wasPropertyExplicitlySet("amountCommitment")) {
                this.amountCommitment(model.getAmountCommitment());
            }
            if (model.wasPropertyExplicitlySet("amountAuthorized")) {
                this.amountAuthorized(model.getAmountAuthorized());
            }
            if (model.wasPropertyExplicitlySet("amountProvisioned")) {
                this.amountProvisioned(model.getAmountProvisioned());
            }
            if (model.wasPropertyExplicitlySet("amountConsumed")) {
                this.amountConsumed(model.getAmountConsumed());
            }
            if (model.wasPropertyExplicitlySet("amountAvailable")) {
                this.amountAvailable(model.getAmountAvailable());
            }
            if (model.wasPropertyExplicitlySet("commitmentPeriods")) {
                this.commitmentPeriods(model.getCommitmentPeriods());
            }
            if (model.wasPropertyExplicitlySet("productsAndServices")) {
                this.productsAndServices(model.getProductsAndServices());
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

    /** Contract identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("contractId")
    private final String contractId;

    /**
     * Contract identifier.
     *
     * @return the value
     */
    public String getContractId() {
        return contractId;
    }

    /** Subscription identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Subscription identifier.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Sold-to customer name. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerName")
    private final String customerName;

    /**
     * Sold-to customer name.
     *
     * @return the value
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * The currency of the subscription, in the format specified by
     * [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * The currency of the subscription, in the format specified by
     * [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html).
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** Start date and time of the subscription commitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentStart")
    private final java.util.Date timeCommitmentStart;

    /**
     * Start date and time of the subscription commitment.
     *
     * @return the value
     */
    public java.util.Date getTimeCommitmentStart() {
        return timeCommitmentStart;
    }

    /** End date and time of the subscription commitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentEnd")
    private final java.util.Date timeCommitmentEnd;

    /**
     * End date and time of the subscription commitment.
     *
     * @return the value
     */
    public java.util.Date getTimeCommitmentEnd() {
        return timeCommitmentEnd;
    }

    /** Total committed amount for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountCommitment")
    private final Double amountCommitment;

    /**
     * Total committed amount for the subscription.
     *
     * @return the value
     */
    public Double getAmountCommitment() {
        return amountCommitment;
    }

    /** Amount authorized for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountAuthorized")
    private final Double amountAuthorized;

    /**
     * Amount authorized for the subscription.
     *
     * @return the value
     */
    public Double getAmountAuthorized() {
        return amountAuthorized;
    }

    /** Amount provisioned for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountProvisioned")
    private final Double amountProvisioned;

    /**
     * Amount provisioned for the subscription.
     *
     * @return the value
     */
    public Double getAmountProvisioned() {
        return amountProvisioned;
    }

    /** Amount consumed from the subscription commitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
    private final Double amountConsumed;

    /**
     * Amount consumed from the subscription commitment.
     *
     * @return the value
     */
    public Double getAmountConsumed() {
        return amountConsumed;
    }

    /** Amount remaining and available for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountAvailable")
    private final Double amountAvailable;

    /**
     * Amount remaining and available for the subscription.
     *
     * @return the value
     */
    public Double getAmountAvailable() {
        return amountAvailable;
    }

    /** Commitment periods associated with the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriods")
    private final java.util.List<CommitmentPeriod> commitmentPeriods;

    /**
     * Commitment periods associated with the subscription.
     *
     * @return the value
     */
    public java.util.List<CommitmentPeriod> getCommitmentPeriods() {
        return commitmentPeriods;
    }

    /** Products and services that draw down from the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("productsAndServices")
    private final java.util.List<ProductAndService> productsAndServices;

    /**
     * Products and services that draw down from the subscription.
     *
     * @return the value
     */
    public java.util.List<ProductAndService> getProductsAndServices() {
        return productsAndServices;
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
        sb.append("SubscriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("contractId=").append(String.valueOf(this.contractId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", customerName=").append(String.valueOf(this.customerName));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", timeCommitmentStart=").append(String.valueOf(this.timeCommitmentStart));
        sb.append(", timeCommitmentEnd=").append(String.valueOf(this.timeCommitmentEnd));
        sb.append(", amountCommitment=").append(String.valueOf(this.amountCommitment));
        sb.append(", amountAuthorized=").append(String.valueOf(this.amountAuthorized));
        sb.append(", amountProvisioned=").append(String.valueOf(this.amountProvisioned));
        sb.append(", amountConsumed=").append(String.valueOf(this.amountConsumed));
        sb.append(", amountAvailable=").append(String.valueOf(this.amountAvailable));
        sb.append(", commitmentPeriods=").append(String.valueOf(this.commitmentPeriods));
        sb.append(", productsAndServices=").append(String.valueOf(this.productsAndServices));
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
        return java.util.Objects.equals(this.contractId, other.contractId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.customerName, other.customerName)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.timeCommitmentStart, other.timeCommitmentStart)
                && java.util.Objects.equals(this.timeCommitmentEnd, other.timeCommitmentEnd)
                && java.util.Objects.equals(this.amountCommitment, other.amountCommitment)
                && java.util.Objects.equals(this.amountAuthorized, other.amountAuthorized)
                && java.util.Objects.equals(this.amountProvisioned, other.amountProvisioned)
                && java.util.Objects.equals(this.amountConsumed, other.amountConsumed)
                && java.util.Objects.equals(this.amountAvailable, other.amountAvailable)
                && java.util.Objects.equals(this.commitmentPeriods, other.commitmentPeriods)
                && java.util.Objects.equals(this.productsAndServices, other.productsAndServices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contractId == null ? 43 : this.contractId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.customerName == null ? 43 : this.customerName.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCommitmentStart == null
                                ? 43
                                : this.timeCommitmentStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCommitmentEnd == null ? 43 : this.timeCommitmentEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.amountCommitment == null ? 43 : this.amountCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.amountAuthorized == null ? 43 : this.amountAuthorized.hashCode());
        result =
                (result * PRIME)
                        + (this.amountProvisioned == null ? 43 : this.amountProvisioned.hashCode());
        result =
                (result * PRIME)
                        + (this.amountConsumed == null ? 43 : this.amountConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.amountAvailable == null ? 43 : this.amountAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentPeriods == null ? 43 : this.commitmentPeriods.hashCode());
        result =
                (result * PRIME)
                        + (this.productsAndServices == null
                                ? 43
                                : this.productsAndServices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
