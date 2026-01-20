/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for disbursement report item <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisbursementReportRecord.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisbursementReportRecord
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "enterpriseQuarter",
        "enterprisePeriod",
        "listingName",
        "listingId",
        "privateOfferId",
        "privateOfferName",
        "sku",
        "transactionReferenceId",
        "customerId",
        "customerName",
        "customerDomain",
        "endUserCustomerId",
        "endUserCustomerName",
        "country",
        "state",
        "city",
        "zip",
        "currencyCode",
        "usageQuantity",
        "usedAmountLc",
        "lcAmountForDisbursementCalculations",
        "lcBaseAmountForTaxCalculations",
        "withholdingTaxRate",
        "withholdingTaxAmount",
        "transferTaxBaseAmount",
        "transferTaxRate",
        "transferTaxAmount",
        "lcAmountForDisbursementAfterTax",
        "lcPartnerPayment",
        "fxRateLcToUsd",
        "disbursementAmountUsd",
        "partnerName",
        "partnerId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DisbursementReportRecord(
            String enterpriseQuarter,
            String enterprisePeriod,
            String listingName,
            String listingId,
            String privateOfferId,
            String privateOfferName,
            String sku,
            String transactionReferenceId,
            String customerId,
            String customerName,
            String customerDomain,
            String endUserCustomerId,
            String endUserCustomerName,
            String country,
            String state,
            String city,
            String zip,
            String currencyCode,
            String usageQuantity,
            String usedAmountLc,
            String lcAmountForDisbursementCalculations,
            String lcBaseAmountForTaxCalculations,
            String withholdingTaxRate,
            String withholdingTaxAmount,
            String transferTaxBaseAmount,
            String transferTaxRate,
            String transferTaxAmount,
            String lcAmountForDisbursementAfterTax,
            String lcPartnerPayment,
            String fxRateLcToUsd,
            String disbursementAmountUsd,
            String partnerName,
            String partnerId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.enterpriseQuarter = enterpriseQuarter;
        this.enterprisePeriod = enterprisePeriod;
        this.listingName = listingName;
        this.listingId = listingId;
        this.privateOfferId = privateOfferId;
        this.privateOfferName = privateOfferName;
        this.sku = sku;
        this.transactionReferenceId = transactionReferenceId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerDomain = customerDomain;
        this.endUserCustomerId = endUserCustomerId;
        this.endUserCustomerName = endUserCustomerName;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.currencyCode = currencyCode;
        this.usageQuantity = usageQuantity;
        this.usedAmountLc = usedAmountLc;
        this.lcAmountForDisbursementCalculations = lcAmountForDisbursementCalculations;
        this.lcBaseAmountForTaxCalculations = lcBaseAmountForTaxCalculations;
        this.withholdingTaxRate = withholdingTaxRate;
        this.withholdingTaxAmount = withholdingTaxAmount;
        this.transferTaxBaseAmount = transferTaxBaseAmount;
        this.transferTaxRate = transferTaxRate;
        this.transferTaxAmount = transferTaxAmount;
        this.lcAmountForDisbursementAfterTax = lcAmountForDisbursementAfterTax;
        this.lcPartnerPayment = lcPartnerPayment;
        this.fxRateLcToUsd = fxRateLcToUsd;
        this.disbursementAmountUsd = disbursementAmountUsd;
        this.partnerName = partnerName;
        this.partnerId = partnerId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enterprise Quarter */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseQuarter")
        private String enterpriseQuarter;

        /**
         * Enterprise Quarter
         *
         * @param enterpriseQuarter the value to set
         * @return this builder
         */
        public Builder enterpriseQuarter(String enterpriseQuarter) {
            this.enterpriseQuarter = enterpriseQuarter;
            this.__explicitlySet__.add("enterpriseQuarter");
            return this;
        }
        /** Enterprise Period */
        @com.fasterxml.jackson.annotation.JsonProperty("enterprisePeriod")
        private String enterprisePeriod;

        /**
         * Enterprise Period
         *
         * @param enterprisePeriod the value to set
         * @return this builder
         */
        public Builder enterprisePeriod(String enterprisePeriod) {
            this.enterprisePeriod = enterprisePeriod;
            this.__explicitlySet__.add("enterprisePeriod");
            return this;
        }
        /** Listing Name */
        @com.fasterxml.jackson.annotation.JsonProperty("listingName")
        private String listingName;

        /**
         * Listing Name
         *
         * @param listingName the value to set
         * @return this builder
         */
        public Builder listingName(String listingName) {
            this.listingName = listingName;
            this.__explicitlySet__.add("listingName");
            return this;
        }
        /** Listing ID */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * Listing ID
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** Private Offer ID */
        @com.fasterxml.jackson.annotation.JsonProperty("privateOfferId")
        private String privateOfferId;

        /**
         * Private Offer ID
         *
         * @param privateOfferId the value to set
         * @return this builder
         */
        public Builder privateOfferId(String privateOfferId) {
            this.privateOfferId = privateOfferId;
            this.__explicitlySet__.add("privateOfferId");
            return this;
        }
        /** Private Offer Name */
        @com.fasterxml.jackson.annotation.JsonProperty("privateOfferName")
        private String privateOfferName;

        /**
         * Private Offer Name
         *
         * @param privateOfferName the value to set
         * @return this builder
         */
        public Builder privateOfferName(String privateOfferName) {
            this.privateOfferName = privateOfferName;
            this.__explicitlySet__.add("privateOfferName");
            return this;
        }
        /** SKU */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * SKU
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /** Transaction Reference ID */
        @com.fasterxml.jackson.annotation.JsonProperty("transactionReferenceId")
        private String transactionReferenceId;

        /**
         * Transaction Reference ID
         *
         * @param transactionReferenceId the value to set
         * @return this builder
         */
        public Builder transactionReferenceId(String transactionReferenceId) {
            this.transactionReferenceId = transactionReferenceId;
            this.__explicitlySet__.add("transactionReferenceId");
            return this;
        }
        /** Customer ID */
        @com.fasterxml.jackson.annotation.JsonProperty("customerId")
        private String customerId;

        /**
         * Customer ID
         *
         * @param customerId the value to set
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            this.__explicitlySet__.add("customerId");
            return this;
        }
        /** Customer Name */
        @com.fasterxml.jackson.annotation.JsonProperty("customerName")
        private String customerName;

        /**
         * Customer Name
         *
         * @param customerName the value to set
         * @return this builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            this.__explicitlySet__.add("customerName");
            return this;
        }
        /** Customer Domain */
        @com.fasterxml.jackson.annotation.JsonProperty("customerDomain")
        private String customerDomain;

        /**
         * Customer Domain
         *
         * @param customerDomain the value to set
         * @return this builder
         */
        public Builder customerDomain(String customerDomain) {
            this.customerDomain = customerDomain;
            this.__explicitlySet__.add("customerDomain");
            return this;
        }
        /** End User Customer ID */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomerId")
        private String endUserCustomerId;

        /**
         * End User Customer ID
         *
         * @param endUserCustomerId the value to set
         * @return this builder
         */
        public Builder endUserCustomerId(String endUserCustomerId) {
            this.endUserCustomerId = endUserCustomerId;
            this.__explicitlySet__.add("endUserCustomerId");
            return this;
        }
        /** EEnd User Customer Name */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomerName")
        private String endUserCustomerName;

        /**
         * EEnd User Customer Name
         *
         * @param endUserCustomerName the value to set
         * @return this builder
         */
        public Builder endUserCustomerName(String endUserCustomerName) {
            this.endUserCustomerName = endUserCustomerName;
            this.__explicitlySet__.add("endUserCustomerName");
            return this;
        }
        /** Country */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** State */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** City */
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City
         *
         * @param city the value to set
         * @return this builder
         */
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /** Zip */
        @com.fasterxml.jackson.annotation.JsonProperty("zip")
        private String zip;

        /**
         * Zip
         *
         * @param zip the value to set
         * @return this builder
         */
        public Builder zip(String zip) {
            this.zip = zip;
            this.__explicitlySet__.add("zip");
            return this;
        }
        /** Currency Code */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency Code
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** Usage Quantity */
        @com.fasterxml.jackson.annotation.JsonProperty("usageQuantity")
        private String usageQuantity;

        /**
         * Usage Quantity
         *
         * @param usageQuantity the value to set
         * @return this builder
         */
        public Builder usageQuantity(String usageQuantity) {
            this.usageQuantity = usageQuantity;
            this.__explicitlySet__.add("usageQuantity");
            return this;
        }
        /** Used Amount (LC) */
        @com.fasterxml.jackson.annotation.JsonProperty("usedAmountLc")
        private String usedAmountLc;

        /**
         * Used Amount (LC)
         *
         * @param usedAmountLc the value to set
         * @return this builder
         */
        public Builder usedAmountLc(String usedAmountLc) {
            this.usedAmountLc = usedAmountLc;
            this.__explicitlySet__.add("usedAmountLc");
            return this;
        }
        /** LC Amount for Disbursement Calculations */
        @com.fasterxml.jackson.annotation.JsonProperty("lcAmountForDisbursementCalculations")
        private String lcAmountForDisbursementCalculations;

        /**
         * LC Amount for Disbursement Calculations
         *
         * @param lcAmountForDisbursementCalculations the value to set
         * @return this builder
         */
        public Builder lcAmountForDisbursementCalculations(
                String lcAmountForDisbursementCalculations) {
            this.lcAmountForDisbursementCalculations = lcAmountForDisbursementCalculations;
            this.__explicitlySet__.add("lcAmountForDisbursementCalculations");
            return this;
        }
        /** LC Base Amount for Tax Calculations */
        @com.fasterxml.jackson.annotation.JsonProperty("lcBaseAmountForTaxCalculations")
        private String lcBaseAmountForTaxCalculations;

        /**
         * LC Base Amount for Tax Calculations
         *
         * @param lcBaseAmountForTaxCalculations the value to set
         * @return this builder
         */
        public Builder lcBaseAmountForTaxCalculations(String lcBaseAmountForTaxCalculations) {
            this.lcBaseAmountForTaxCalculations = lcBaseAmountForTaxCalculations;
            this.__explicitlySet__.add("lcBaseAmountForTaxCalculations");
            return this;
        }
        /** Withholding Tax Rate */
        @com.fasterxml.jackson.annotation.JsonProperty("withholdingTaxRate")
        private String withholdingTaxRate;

        /**
         * Withholding Tax Rate
         *
         * @param withholdingTaxRate the value to set
         * @return this builder
         */
        public Builder withholdingTaxRate(String withholdingTaxRate) {
            this.withholdingTaxRate = withholdingTaxRate;
            this.__explicitlySet__.add("withholdingTaxRate");
            return this;
        }
        /** Withholding Tax Amount */
        @com.fasterxml.jackson.annotation.JsonProperty("withholdingTaxAmount")
        private String withholdingTaxAmount;

        /**
         * Withholding Tax Amount
         *
         * @param withholdingTaxAmount the value to set
         * @return this builder
         */
        public Builder withholdingTaxAmount(String withholdingTaxAmount) {
            this.withholdingTaxAmount = withholdingTaxAmount;
            this.__explicitlySet__.add("withholdingTaxAmount");
            return this;
        }
        /** Transfer Tax Base Amount */
        @com.fasterxml.jackson.annotation.JsonProperty("transferTaxBaseAmount")
        private String transferTaxBaseAmount;

        /**
         * Transfer Tax Base Amount
         *
         * @param transferTaxBaseAmount the value to set
         * @return this builder
         */
        public Builder transferTaxBaseAmount(String transferTaxBaseAmount) {
            this.transferTaxBaseAmount = transferTaxBaseAmount;
            this.__explicitlySet__.add("transferTaxBaseAmount");
            return this;
        }
        /** Transfer Tax Rate */
        @com.fasterxml.jackson.annotation.JsonProperty("transferTaxRate")
        private String transferTaxRate;

        /**
         * Transfer Tax Rate
         *
         * @param transferTaxRate the value to set
         * @return this builder
         */
        public Builder transferTaxRate(String transferTaxRate) {
            this.transferTaxRate = transferTaxRate;
            this.__explicitlySet__.add("transferTaxRate");
            return this;
        }
        /** Transfer Tax Amount */
        @com.fasterxml.jackson.annotation.JsonProperty("transferTaxAmount")
        private String transferTaxAmount;

        /**
         * Transfer Tax Amount
         *
         * @param transferTaxAmount the value to set
         * @return this builder
         */
        public Builder transferTaxAmount(String transferTaxAmount) {
            this.transferTaxAmount = transferTaxAmount;
            this.__explicitlySet__.add("transferTaxAmount");
            return this;
        }
        /** LC Amount for Disbursement after Tax */
        @com.fasterxml.jackson.annotation.JsonProperty("lcAmountForDisbursementAfterTax")
        private String lcAmountForDisbursementAfterTax;

        /**
         * LC Amount for Disbursement after Tax
         *
         * @param lcAmountForDisbursementAfterTax the value to set
         * @return this builder
         */
        public Builder lcAmountForDisbursementAfterTax(String lcAmountForDisbursementAfterTax) {
            this.lcAmountForDisbursementAfterTax = lcAmountForDisbursementAfterTax;
            this.__explicitlySet__.add("lcAmountForDisbursementAfterTax");
            return this;
        }
        /** LC Partner Payment */
        @com.fasterxml.jackson.annotation.JsonProperty("lcPartnerPayment")
        private String lcPartnerPayment;

        /**
         * LC Partner Payment
         *
         * @param lcPartnerPayment the value to set
         * @return this builder
         */
        public Builder lcPartnerPayment(String lcPartnerPayment) {
            this.lcPartnerPayment = lcPartnerPayment;
            this.__explicitlySet__.add("lcPartnerPayment");
            return this;
        }
        /** FX Rate (LC to USD) */
        @com.fasterxml.jackson.annotation.JsonProperty("fxRateLcToUsd")
        private String fxRateLcToUsd;

        /**
         * FX Rate (LC to USD)
         *
         * @param fxRateLcToUsd the value to set
         * @return this builder
         */
        public Builder fxRateLcToUsd(String fxRateLcToUsd) {
            this.fxRateLcToUsd = fxRateLcToUsd;
            this.__explicitlySet__.add("fxRateLcToUsd");
            return this;
        }
        /** Disbursement Amount (USD) */
        @com.fasterxml.jackson.annotation.JsonProperty("disbursementAmountUsd")
        private String disbursementAmountUsd;

        /**
         * Disbursement Amount (USD)
         *
         * @param disbursementAmountUsd the value to set
         * @return this builder
         */
        public Builder disbursementAmountUsd(String disbursementAmountUsd) {
            this.disbursementAmountUsd = disbursementAmountUsd;
            this.__explicitlySet__.add("disbursementAmountUsd");
            return this;
        }
        /** Partner Name */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
        private String partnerName;

        /**
         * Partner Name
         *
         * @param partnerName the value to set
         * @return this builder
         */
        public Builder partnerName(String partnerName) {
            this.partnerName = partnerName;
            this.__explicitlySet__.add("partnerName");
            return this;
        }
        /** Partner OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerId")
        private String partnerId;

        /**
         * Partner OCID
         *
         * @param partnerId the value to set
         * @return this builder
         */
        public Builder partnerId(String partnerId) {
            this.partnerId = partnerId;
            this.__explicitlySet__.add("partnerId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisbursementReportRecord build() {
            DisbursementReportRecord model =
                    new DisbursementReportRecord(
                            this.enterpriseQuarter,
                            this.enterprisePeriod,
                            this.listingName,
                            this.listingId,
                            this.privateOfferId,
                            this.privateOfferName,
                            this.sku,
                            this.transactionReferenceId,
                            this.customerId,
                            this.customerName,
                            this.customerDomain,
                            this.endUserCustomerId,
                            this.endUserCustomerName,
                            this.country,
                            this.state,
                            this.city,
                            this.zip,
                            this.currencyCode,
                            this.usageQuantity,
                            this.usedAmountLc,
                            this.lcAmountForDisbursementCalculations,
                            this.lcBaseAmountForTaxCalculations,
                            this.withholdingTaxRate,
                            this.withholdingTaxAmount,
                            this.transferTaxBaseAmount,
                            this.transferTaxRate,
                            this.transferTaxAmount,
                            this.lcAmountForDisbursementAfterTax,
                            this.lcPartnerPayment,
                            this.fxRateLcToUsd,
                            this.disbursementAmountUsd,
                            this.partnerName,
                            this.partnerId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisbursementReportRecord model) {
            if (model.wasPropertyExplicitlySet("enterpriseQuarter")) {
                this.enterpriseQuarter(model.getEnterpriseQuarter());
            }
            if (model.wasPropertyExplicitlySet("enterprisePeriod")) {
                this.enterprisePeriod(model.getEnterprisePeriod());
            }
            if (model.wasPropertyExplicitlySet("listingName")) {
                this.listingName(model.getListingName());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("privateOfferId")) {
                this.privateOfferId(model.getPrivateOfferId());
            }
            if (model.wasPropertyExplicitlySet("privateOfferName")) {
                this.privateOfferName(model.getPrivateOfferName());
            }
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("transactionReferenceId")) {
                this.transactionReferenceId(model.getTransactionReferenceId());
            }
            if (model.wasPropertyExplicitlySet("customerId")) {
                this.customerId(model.getCustomerId());
            }
            if (model.wasPropertyExplicitlySet("customerName")) {
                this.customerName(model.getCustomerName());
            }
            if (model.wasPropertyExplicitlySet("customerDomain")) {
                this.customerDomain(model.getCustomerDomain());
            }
            if (model.wasPropertyExplicitlySet("endUserCustomerId")) {
                this.endUserCustomerId(model.getEndUserCustomerId());
            }
            if (model.wasPropertyExplicitlySet("endUserCustomerName")) {
                this.endUserCustomerName(model.getEndUserCustomerName());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("zip")) {
                this.zip(model.getZip());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("usageQuantity")) {
                this.usageQuantity(model.getUsageQuantity());
            }
            if (model.wasPropertyExplicitlySet("usedAmountLc")) {
                this.usedAmountLc(model.getUsedAmountLc());
            }
            if (model.wasPropertyExplicitlySet("lcAmountForDisbursementCalculations")) {
                this.lcAmountForDisbursementCalculations(
                        model.getLcAmountForDisbursementCalculations());
            }
            if (model.wasPropertyExplicitlySet("lcBaseAmountForTaxCalculations")) {
                this.lcBaseAmountForTaxCalculations(model.getLcBaseAmountForTaxCalculations());
            }
            if (model.wasPropertyExplicitlySet("withholdingTaxRate")) {
                this.withholdingTaxRate(model.getWithholdingTaxRate());
            }
            if (model.wasPropertyExplicitlySet("withholdingTaxAmount")) {
                this.withholdingTaxAmount(model.getWithholdingTaxAmount());
            }
            if (model.wasPropertyExplicitlySet("transferTaxBaseAmount")) {
                this.transferTaxBaseAmount(model.getTransferTaxBaseAmount());
            }
            if (model.wasPropertyExplicitlySet("transferTaxRate")) {
                this.transferTaxRate(model.getTransferTaxRate());
            }
            if (model.wasPropertyExplicitlySet("transferTaxAmount")) {
                this.transferTaxAmount(model.getTransferTaxAmount());
            }
            if (model.wasPropertyExplicitlySet("lcAmountForDisbursementAfterTax")) {
                this.lcAmountForDisbursementAfterTax(model.getLcAmountForDisbursementAfterTax());
            }
            if (model.wasPropertyExplicitlySet("lcPartnerPayment")) {
                this.lcPartnerPayment(model.getLcPartnerPayment());
            }
            if (model.wasPropertyExplicitlySet("fxRateLcToUsd")) {
                this.fxRateLcToUsd(model.getFxRateLcToUsd());
            }
            if (model.wasPropertyExplicitlySet("disbursementAmountUsd")) {
                this.disbursementAmountUsd(model.getDisbursementAmountUsd());
            }
            if (model.wasPropertyExplicitlySet("partnerName")) {
                this.partnerName(model.getPartnerName());
            }
            if (model.wasPropertyExplicitlySet("partnerId")) {
                this.partnerId(model.getPartnerId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Enterprise Quarter */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseQuarter")
    private final String enterpriseQuarter;

    /**
     * Enterprise Quarter
     *
     * @return the value
     */
    public String getEnterpriseQuarter() {
        return enterpriseQuarter;
    }

    /** Enterprise Period */
    @com.fasterxml.jackson.annotation.JsonProperty("enterprisePeriod")
    private final String enterprisePeriod;

    /**
     * Enterprise Period
     *
     * @return the value
     */
    public String getEnterprisePeriod() {
        return enterprisePeriod;
    }

    /** Listing Name */
    @com.fasterxml.jackson.annotation.JsonProperty("listingName")
    private final String listingName;

    /**
     * Listing Name
     *
     * @return the value
     */
    public String getListingName() {
        return listingName;
    }

    /** Listing ID */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * Listing ID
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** Private Offer ID */
    @com.fasterxml.jackson.annotation.JsonProperty("privateOfferId")
    private final String privateOfferId;

    /**
     * Private Offer ID
     *
     * @return the value
     */
    public String getPrivateOfferId() {
        return privateOfferId;
    }

    /** Private Offer Name */
    @com.fasterxml.jackson.annotation.JsonProperty("privateOfferName")
    private final String privateOfferName;

    /**
     * Private Offer Name
     *
     * @return the value
     */
    public String getPrivateOfferName() {
        return privateOfferName;
    }

    /** SKU */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * SKU
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /** Transaction Reference ID */
    @com.fasterxml.jackson.annotation.JsonProperty("transactionReferenceId")
    private final String transactionReferenceId;

    /**
     * Transaction Reference ID
     *
     * @return the value
     */
    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    /** Customer ID */
    @com.fasterxml.jackson.annotation.JsonProperty("customerId")
    private final String customerId;

    /**
     * Customer ID
     *
     * @return the value
     */
    public String getCustomerId() {
        return customerId;
    }

    /** Customer Name */
    @com.fasterxml.jackson.annotation.JsonProperty("customerName")
    private final String customerName;

    /**
     * Customer Name
     *
     * @return the value
     */
    public String getCustomerName() {
        return customerName;
    }

    /** Customer Domain */
    @com.fasterxml.jackson.annotation.JsonProperty("customerDomain")
    private final String customerDomain;

    /**
     * Customer Domain
     *
     * @return the value
     */
    public String getCustomerDomain() {
        return customerDomain;
    }

    /** End User Customer ID */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomerId")
    private final String endUserCustomerId;

    /**
     * End User Customer ID
     *
     * @return the value
     */
    public String getEndUserCustomerId() {
        return endUserCustomerId;
    }

    /** EEnd User Customer Name */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomerName")
    private final String endUserCustomerName;

    /**
     * EEnd User Customer Name
     *
     * @return the value
     */
    public String getEndUserCustomerName() {
        return endUserCustomerName;
    }

    /** Country */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** State */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /** City */
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City
     *
     * @return the value
     */
    public String getCity() {
        return city;
    }

    /** Zip */
    @com.fasterxml.jackson.annotation.JsonProperty("zip")
    private final String zip;

    /**
     * Zip
     *
     * @return the value
     */
    public String getZip() {
        return zip;
    }

    /** Currency Code */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency Code
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** Usage Quantity */
    @com.fasterxml.jackson.annotation.JsonProperty("usageQuantity")
    private final String usageQuantity;

    /**
     * Usage Quantity
     *
     * @return the value
     */
    public String getUsageQuantity() {
        return usageQuantity;
    }

    /** Used Amount (LC) */
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmountLc")
    private final String usedAmountLc;

    /**
     * Used Amount (LC)
     *
     * @return the value
     */
    public String getUsedAmountLc() {
        return usedAmountLc;
    }

    /** LC Amount for Disbursement Calculations */
    @com.fasterxml.jackson.annotation.JsonProperty("lcAmountForDisbursementCalculations")
    private final String lcAmountForDisbursementCalculations;

    /**
     * LC Amount for Disbursement Calculations
     *
     * @return the value
     */
    public String getLcAmountForDisbursementCalculations() {
        return lcAmountForDisbursementCalculations;
    }

    /** LC Base Amount for Tax Calculations */
    @com.fasterxml.jackson.annotation.JsonProperty("lcBaseAmountForTaxCalculations")
    private final String lcBaseAmountForTaxCalculations;

    /**
     * LC Base Amount for Tax Calculations
     *
     * @return the value
     */
    public String getLcBaseAmountForTaxCalculations() {
        return lcBaseAmountForTaxCalculations;
    }

    /** Withholding Tax Rate */
    @com.fasterxml.jackson.annotation.JsonProperty("withholdingTaxRate")
    private final String withholdingTaxRate;

    /**
     * Withholding Tax Rate
     *
     * @return the value
     */
    public String getWithholdingTaxRate() {
        return withholdingTaxRate;
    }

    /** Withholding Tax Amount */
    @com.fasterxml.jackson.annotation.JsonProperty("withholdingTaxAmount")
    private final String withholdingTaxAmount;

    /**
     * Withholding Tax Amount
     *
     * @return the value
     */
    public String getWithholdingTaxAmount() {
        return withholdingTaxAmount;
    }

    /** Transfer Tax Base Amount */
    @com.fasterxml.jackson.annotation.JsonProperty("transferTaxBaseAmount")
    private final String transferTaxBaseAmount;

    /**
     * Transfer Tax Base Amount
     *
     * @return the value
     */
    public String getTransferTaxBaseAmount() {
        return transferTaxBaseAmount;
    }

    /** Transfer Tax Rate */
    @com.fasterxml.jackson.annotation.JsonProperty("transferTaxRate")
    private final String transferTaxRate;

    /**
     * Transfer Tax Rate
     *
     * @return the value
     */
    public String getTransferTaxRate() {
        return transferTaxRate;
    }

    /** Transfer Tax Amount */
    @com.fasterxml.jackson.annotation.JsonProperty("transferTaxAmount")
    private final String transferTaxAmount;

    /**
     * Transfer Tax Amount
     *
     * @return the value
     */
    public String getTransferTaxAmount() {
        return transferTaxAmount;
    }

    /** LC Amount for Disbursement after Tax */
    @com.fasterxml.jackson.annotation.JsonProperty("lcAmountForDisbursementAfterTax")
    private final String lcAmountForDisbursementAfterTax;

    /**
     * LC Amount for Disbursement after Tax
     *
     * @return the value
     */
    public String getLcAmountForDisbursementAfterTax() {
        return lcAmountForDisbursementAfterTax;
    }

    /** LC Partner Payment */
    @com.fasterxml.jackson.annotation.JsonProperty("lcPartnerPayment")
    private final String lcPartnerPayment;

    /**
     * LC Partner Payment
     *
     * @return the value
     */
    public String getLcPartnerPayment() {
        return lcPartnerPayment;
    }

    /** FX Rate (LC to USD) */
    @com.fasterxml.jackson.annotation.JsonProperty("fxRateLcToUsd")
    private final String fxRateLcToUsd;

    /**
     * FX Rate (LC to USD)
     *
     * @return the value
     */
    public String getFxRateLcToUsd() {
        return fxRateLcToUsd;
    }

    /** Disbursement Amount (USD) */
    @com.fasterxml.jackson.annotation.JsonProperty("disbursementAmountUsd")
    private final String disbursementAmountUsd;

    /**
     * Disbursement Amount (USD)
     *
     * @return the value
     */
    public String getDisbursementAmountUsd() {
        return disbursementAmountUsd;
    }

    /** Partner Name */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
    private final String partnerName;

    /**
     * Partner Name
     *
     * @return the value
     */
    public String getPartnerName() {
        return partnerName;
    }

    /** Partner OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerId")
    private final String partnerId;

    /**
     * Partner OCID
     *
     * @return the value
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("DisbursementReportRecord(");
        sb.append("super=").append(super.toString());
        sb.append("enterpriseQuarter=").append(String.valueOf(this.enterpriseQuarter));
        sb.append(", enterprisePeriod=").append(String.valueOf(this.enterprisePeriod));
        sb.append(", listingName=").append(String.valueOf(this.listingName));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", privateOfferId=").append(String.valueOf(this.privateOfferId));
        sb.append(", privateOfferName=").append(String.valueOf(this.privateOfferName));
        sb.append(", sku=").append(String.valueOf(this.sku));
        sb.append(", transactionReferenceId=").append(String.valueOf(this.transactionReferenceId));
        sb.append(", customerId=").append(String.valueOf(this.customerId));
        sb.append(", customerName=").append(String.valueOf(this.customerName));
        sb.append(", customerDomain=").append(String.valueOf(this.customerDomain));
        sb.append(", endUserCustomerId=").append(String.valueOf(this.endUserCustomerId));
        sb.append(", endUserCustomerName=").append(String.valueOf(this.endUserCustomerName));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", zip=").append(String.valueOf(this.zip));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", usageQuantity=").append(String.valueOf(this.usageQuantity));
        sb.append(", usedAmountLc=").append(String.valueOf(this.usedAmountLc));
        sb.append(", lcAmountForDisbursementCalculations=")
                .append(String.valueOf(this.lcAmountForDisbursementCalculations));
        sb.append(", lcBaseAmountForTaxCalculations=")
                .append(String.valueOf(this.lcBaseAmountForTaxCalculations));
        sb.append(", withholdingTaxRate=").append(String.valueOf(this.withholdingTaxRate));
        sb.append(", withholdingTaxAmount=").append(String.valueOf(this.withholdingTaxAmount));
        sb.append(", transferTaxBaseAmount=").append(String.valueOf(this.transferTaxBaseAmount));
        sb.append(", transferTaxRate=").append(String.valueOf(this.transferTaxRate));
        sb.append(", transferTaxAmount=").append(String.valueOf(this.transferTaxAmount));
        sb.append(", lcAmountForDisbursementAfterTax=")
                .append(String.valueOf(this.lcAmountForDisbursementAfterTax));
        sb.append(", lcPartnerPayment=").append(String.valueOf(this.lcPartnerPayment));
        sb.append(", fxRateLcToUsd=").append(String.valueOf(this.fxRateLcToUsd));
        sb.append(", disbursementAmountUsd=").append(String.valueOf(this.disbursementAmountUsd));
        sb.append(", partnerName=").append(String.valueOf(this.partnerName));
        sb.append(", partnerId=").append(String.valueOf(this.partnerId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisbursementReportRecord)) {
            return false;
        }

        DisbursementReportRecord other = (DisbursementReportRecord) o;
        return java.util.Objects.equals(this.enterpriseQuarter, other.enterpriseQuarter)
                && java.util.Objects.equals(this.enterprisePeriod, other.enterprisePeriod)
                && java.util.Objects.equals(this.listingName, other.listingName)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.privateOfferId, other.privateOfferId)
                && java.util.Objects.equals(this.privateOfferName, other.privateOfferName)
                && java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(
                        this.transactionReferenceId, other.transactionReferenceId)
                && java.util.Objects.equals(this.customerId, other.customerId)
                && java.util.Objects.equals(this.customerName, other.customerName)
                && java.util.Objects.equals(this.customerDomain, other.customerDomain)
                && java.util.Objects.equals(this.endUserCustomerId, other.endUserCustomerId)
                && java.util.Objects.equals(this.endUserCustomerName, other.endUserCustomerName)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.zip, other.zip)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.usageQuantity, other.usageQuantity)
                && java.util.Objects.equals(this.usedAmountLc, other.usedAmountLc)
                && java.util.Objects.equals(
                        this.lcAmountForDisbursementCalculations,
                        other.lcAmountForDisbursementCalculations)
                && java.util.Objects.equals(
                        this.lcBaseAmountForTaxCalculations, other.lcBaseAmountForTaxCalculations)
                && java.util.Objects.equals(this.withholdingTaxRate, other.withholdingTaxRate)
                && java.util.Objects.equals(this.withholdingTaxAmount, other.withholdingTaxAmount)
                && java.util.Objects.equals(this.transferTaxBaseAmount, other.transferTaxBaseAmount)
                && java.util.Objects.equals(this.transferTaxRate, other.transferTaxRate)
                && java.util.Objects.equals(this.transferTaxAmount, other.transferTaxAmount)
                && java.util.Objects.equals(
                        this.lcAmountForDisbursementAfterTax, other.lcAmountForDisbursementAfterTax)
                && java.util.Objects.equals(this.lcPartnerPayment, other.lcPartnerPayment)
                && java.util.Objects.equals(this.fxRateLcToUsd, other.fxRateLcToUsd)
                && java.util.Objects.equals(this.disbursementAmountUsd, other.disbursementAmountUsd)
                && java.util.Objects.equals(this.partnerName, other.partnerName)
                && java.util.Objects.equals(this.partnerId, other.partnerId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.enterpriseQuarter == null ? 43 : this.enterpriseQuarter.hashCode());
        result =
                (result * PRIME)
                        + (this.enterprisePeriod == null ? 43 : this.enterprisePeriod.hashCode());
        result = (result * PRIME) + (this.listingName == null ? 43 : this.listingName.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateOfferId == null ? 43 : this.privateOfferId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateOfferName == null ? 43 : this.privateOfferName.hashCode());
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result =
                (result * PRIME)
                        + (this.transactionReferenceId == null
                                ? 43
                                : this.transactionReferenceId.hashCode());
        result = (result * PRIME) + (this.customerId == null ? 43 : this.customerId.hashCode());
        result = (result * PRIME) + (this.customerName == null ? 43 : this.customerName.hashCode());
        result =
                (result * PRIME)
                        + (this.customerDomain == null ? 43 : this.customerDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserCustomerId == null ? 43 : this.endUserCustomerId.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserCustomerName == null
                                ? 43
                                : this.endUserCustomerName.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.zip == null ? 43 : this.zip.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.usageQuantity == null ? 43 : this.usageQuantity.hashCode());
        result = (result * PRIME) + (this.usedAmountLc == null ? 43 : this.usedAmountLc.hashCode());
        result =
                (result * PRIME)
                        + (this.lcAmountForDisbursementCalculations == null
                                ? 43
                                : this.lcAmountForDisbursementCalculations.hashCode());
        result =
                (result * PRIME)
                        + (this.lcBaseAmountForTaxCalculations == null
                                ? 43
                                : this.lcBaseAmountForTaxCalculations.hashCode());
        result =
                (result * PRIME)
                        + (this.withholdingTaxRate == null
                                ? 43
                                : this.withholdingTaxRate.hashCode());
        result =
                (result * PRIME)
                        + (this.withholdingTaxAmount == null
                                ? 43
                                : this.withholdingTaxAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.transferTaxBaseAmount == null
                                ? 43
                                : this.transferTaxBaseAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.transferTaxRate == null ? 43 : this.transferTaxRate.hashCode());
        result =
                (result * PRIME)
                        + (this.transferTaxAmount == null ? 43 : this.transferTaxAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.lcAmountForDisbursementAfterTax == null
                                ? 43
                                : this.lcAmountForDisbursementAfterTax.hashCode());
        result =
                (result * PRIME)
                        + (this.lcPartnerPayment == null ? 43 : this.lcPartnerPayment.hashCode());
        result =
                (result * PRIME)
                        + (this.fxRateLcToUsd == null ? 43 : this.fxRateLcToUsd.hashCode());
        result =
                (result * PRIME)
                        + (this.disbursementAmountUsd == null
                                ? 43
                                : this.disbursementAmountUsd.hashCode());
        result = (result * PRIME) + (this.partnerName == null ? 43 : this.partnerName.hashCode());
        result = (result * PRIME) + (this.partnerId == null ? 43 : this.partnerId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
