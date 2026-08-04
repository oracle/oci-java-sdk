/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * A single usage record to submit for a marketplace offer. The usage window must have {@code
 * timeUsageStarted} before {@code timeUsageEnded}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSubscriptionUsageRecordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSubscriptionUsageRecordDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "marketplaceOfferId",
        "billingType",
        "usageDimensionName",
        "consumedQuantity",
        "amount",
        "currencyCode",
        "billingPeriod",
        "customerTenancyId",
        "billingIdentifier",
        "unitOfMeasure",
        "unitPrice",
        "productSku",
        "contractDuration",
        "additionalMetadata",
        "usageRecordId",
        "timeUsageStarted",
        "timeUsageEnded"
    })
    public CreateSubscriptionUsageRecordDetails(
            String id,
            String marketplaceOfferId,
            BillingType billingType,
            String usageDimensionName,
            Double consumedQuantity,
            Double amount,
            String currencyCode,
            String billingPeriod,
            String customerTenancyId,
            String billingIdentifier,
            String unitOfMeasure,
            Double unitPrice,
            String productSku,
            BillingFrequency contractDuration,
            java.util.List<ExtendedMetadata> additionalMetadata,
            String usageRecordId,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded) {
        super();
        this.id = id;
        this.marketplaceOfferId = marketplaceOfferId;
        this.billingType = billingType;
        this.usageDimensionName = usageDimensionName;
        this.consumedQuantity = consumedQuantity;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.billingPeriod = billingPeriod;
        this.customerTenancyId = customerTenancyId;
        this.billingIdentifier = billingIdentifier;
        this.unitOfMeasure = unitOfMeasure;
        this.unitPrice = unitPrice;
        this.productSku = productSku;
        this.contractDuration = contractDuration;
        this.additionalMetadata = additionalMetadata;
        this.usageRecordId = usageRecordId;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Partner-provided unique identifier for this usage record. This identifier must be unique
         * per partner.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Partner-provided unique identifier for this usage record. This identifier must be unique
         * per partner.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * marketplace offer being billed. A submit request can contain records for multiple
         * marketplace offers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("marketplaceOfferId")
        private String marketplaceOfferId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * marketplace offer being billed. A submit request can contain records for multiple
         * marketplace offers.
         *
         * @param marketplaceOfferId the value to set
         * @return this builder
         */
        public Builder marketplaceOfferId(String marketplaceOfferId) {
            this.marketplaceOfferId = marketplaceOfferId;
            this.__explicitlySet__.add("marketplaceOfferId");
            return this;
        }
        /** The billing type this usage record applies to. */
        @com.fasterxml.jackson.annotation.JsonProperty("billingType")
        private BillingType billingType;

        /**
         * The billing type this usage record applies to.
         *
         * @param billingType the value to set
         * @return this builder
         */
        public Builder billingType(BillingType billingType) {
            this.billingType = billingType;
            this.__explicitlySet__.add("billingType");
            return this;
        }
        /** The pricing dimension against which usage is being reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageDimensionName")
        private String usageDimensionName;

        /**
         * The pricing dimension against which usage is being reported.
         *
         * @param usageDimensionName the value to set
         * @return this builder
         */
        public Builder usageDimensionName(String usageDimensionName) {
            this.usageDimensionName = usageDimensionName;
            this.__explicitlySet__.add("usageDimensionName");
            return this;
        }
        /** An optional non-negative usage quantity being reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumedQuantity")
        private Double consumedQuantity;

        /**
         * An optional non-negative usage quantity being reported.
         *
         * @param consumedQuantity the value to set
         * @return this builder
         */
        public Builder consumedQuantity(Double consumedQuantity) {
            this.consumedQuantity = consumedQuantity;
            this.__explicitlySet__.add("consumedQuantity");
            return this;
        }
        /** The non-negative usage cost computed by the partner for the submitted usage quantity. */
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private Double amount;

        /**
         * The non-negative usage cost computed by the partner for the submitted usage quantity.
         *
         * @param amount the value to set
         * @return this builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }
        /** The ISO-4217 currency submitted for the computed usage cost. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * The ISO-4217 currency submitted for the computed usage cost.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** The billing period associated with this usage record in {@code YYYY-MM} format. */
        @com.fasterxml.jackson.annotation.JsonProperty("billingPeriod")
        private String billingPeriod;

        /**
         * The billing period associated with this usage record in {@code YYYY-MM} format.
         *
         * @param billingPeriod the value to set
         * @return this builder
         */
        public Builder billingPeriod(String billingPeriod) {
            this.billingPeriod = billingPeriod;
            this.__explicitlySet__.add("billingPeriod");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * customer tenancy associated with this usage record.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerTenancyId")
        private String customerTenancyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * customer tenancy associated with this usage record.
         *
         * @param customerTenancyId the value to set
         * @return this builder
         */
        public Builder customerTenancyId(String customerTenancyId) {
            this.customerTenancyId = customerTenancyId;
            this.__explicitlySet__.add("customerTenancyId");
            return this;
        }
        /** The partner billing identifier associated with this usage record. */
        @com.fasterxml.jackson.annotation.JsonProperty("billingIdentifier")
        private String billingIdentifier;

        /**
         * The partner billing identifier associated with this usage record.
         *
         * @param billingIdentifier the value to set
         * @return this builder
         */
        public Builder billingIdentifier(String billingIdentifier) {
            this.billingIdentifier = billingIdentifier;
            this.__explicitlySet__.add("billingIdentifier");
            return this;
        }
        /** The unit of measure associated with the reported usage quantity. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        /**
         * The unit of measure associated with the reported usage quantity.
         *
         * @param unitOfMeasure the value to set
         * @return this builder
         */
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }
        /** The unit price associated with this usage record. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
        private Double unitPrice;

        /**
         * The unit price associated with this usage record.
         *
         * @param unitPrice the value to set
         * @return this builder
         */
        public Builder unitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            this.__explicitlySet__.add("unitPrice");
            return this;
        }
        /** The product SKU associated with this usage record. */
        @com.fasterxml.jackson.annotation.JsonProperty("productSku")
        private String productSku;

        /**
         * The product SKU associated with this usage record.
         *
         * @param productSku the value to set
         * @return this builder
         */
        public Builder productSku(String productSku) {
            this.productSku = productSku;
            this.__explicitlySet__.add("productSku");
            return this;
        }
        /** The contract duration associated with this usage record. */
        @com.fasterxml.jackson.annotation.JsonProperty("contractDuration")
        private BillingFrequency contractDuration;

        /**
         * The contract duration associated with this usage record.
         *
         * @param contractDuration the value to set
         * @return this builder
         */
        public Builder contractDuration(BillingFrequency contractDuration) {
            this.contractDuration = contractDuration;
            this.__explicitlySet__.add("contractDuration");
            return this;
        }
        /** Additional key/value metadata associated with this usage record for extensibility. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalMetadata")
        private java.util.List<ExtendedMetadata> additionalMetadata;

        /**
         * Additional key/value metadata associated with this usage record for extensibility.
         *
         * @param additionalMetadata the value to set
         * @return this builder
         */
        public Builder additionalMetadata(java.util.List<ExtendedMetadata> additionalMetadata) {
            this.additionalMetadata = additionalMetadata;
            this.__explicitlySet__.add("additionalMetadata");
            return this;
        }
        /** Partner-provided usage record identifier for traceability. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageRecordId")
        private String usageRecordId;

        /**
         * Partner-provided usage record identifier for traceability.
         *
         * @param usageRecordId the value to set
         * @return this builder
         */
        public Builder usageRecordId(String usageRecordId) {
            this.usageRecordId = usageRecordId;
            this.__explicitlySet__.add("usageRecordId");
            return this;
        }
        /**
         * The inclusive start timestamp for the usage window. This value must be before {@code
         * timeUsageEnded}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The inclusive start timestamp for the usage window. This value must be before {@code
         * timeUsageEnded}.
         *
         * @param timeUsageStarted the value to set
         * @return this builder
         */
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /**
         * The exclusive end timestamp for the usage window. This value must be after {@code
         * timeUsageStarted}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The exclusive end timestamp for the usage window. This value must be after {@code
         * timeUsageStarted}.
         *
         * @param timeUsageEnded the value to set
         * @return this builder
         */
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubscriptionUsageRecordDetails build() {
            CreateSubscriptionUsageRecordDetails model =
                    new CreateSubscriptionUsageRecordDetails(
                            this.id,
                            this.marketplaceOfferId,
                            this.billingType,
                            this.usageDimensionName,
                            this.consumedQuantity,
                            this.amount,
                            this.currencyCode,
                            this.billingPeriod,
                            this.customerTenancyId,
                            this.billingIdentifier,
                            this.unitOfMeasure,
                            this.unitPrice,
                            this.productSku,
                            this.contractDuration,
                            this.additionalMetadata,
                            this.usageRecordId,
                            this.timeUsageStarted,
                            this.timeUsageEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubscriptionUsageRecordDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("marketplaceOfferId")) {
                this.marketplaceOfferId(model.getMarketplaceOfferId());
            }
            if (model.wasPropertyExplicitlySet("billingType")) {
                this.billingType(model.getBillingType());
            }
            if (model.wasPropertyExplicitlySet("usageDimensionName")) {
                this.usageDimensionName(model.getUsageDimensionName());
            }
            if (model.wasPropertyExplicitlySet("consumedQuantity")) {
                this.consumedQuantity(model.getConsumedQuantity());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("billingPeriod")) {
                this.billingPeriod(model.getBillingPeriod());
            }
            if (model.wasPropertyExplicitlySet("customerTenancyId")) {
                this.customerTenancyId(model.getCustomerTenancyId());
            }
            if (model.wasPropertyExplicitlySet("billingIdentifier")) {
                this.billingIdentifier(model.getBillingIdentifier());
            }
            if (model.wasPropertyExplicitlySet("unitOfMeasure")) {
                this.unitOfMeasure(model.getUnitOfMeasure());
            }
            if (model.wasPropertyExplicitlySet("unitPrice")) {
                this.unitPrice(model.getUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("productSku")) {
                this.productSku(model.getProductSku());
            }
            if (model.wasPropertyExplicitlySet("contractDuration")) {
                this.contractDuration(model.getContractDuration());
            }
            if (model.wasPropertyExplicitlySet("additionalMetadata")) {
                this.additionalMetadata(model.getAdditionalMetadata());
            }
            if (model.wasPropertyExplicitlySet("usageRecordId")) {
                this.usageRecordId(model.getUsageRecordId());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
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

    /**
     * Partner-provided unique identifier for this usage record. This identifier must be unique per
     * partner.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Partner-provided unique identifier for this usage record. This identifier must be unique per
     * partner.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * marketplace offer being billed. A submit request can contain records for multiple marketplace
     * offers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("marketplaceOfferId")
    private final String marketplaceOfferId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * marketplace offer being billed. A submit request can contain records for multiple marketplace
     * offers.
     *
     * @return the value
     */
    public String getMarketplaceOfferId() {
        return marketplaceOfferId;
    }

    /** The billing type this usage record applies to. */
    public enum BillingType implements com.oracle.bmc.http.internal.BmcEnum {
        FlatRate("FLAT_RATE"),
        UsageBased("USAGE_BASED"),
        ;

        private final String value;
        private static java.util.Map<String, BillingType> map;

        static {
            map = new java.util.HashMap<>();
            for (BillingType v : BillingType.values()) {
                map.put(v.getValue(), v);
            }
        }

        BillingType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BillingType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BillingType: " + key);
        }
    };
    /** The billing type this usage record applies to. */
    @com.fasterxml.jackson.annotation.JsonProperty("billingType")
    private final BillingType billingType;

    /**
     * The billing type this usage record applies to.
     *
     * @return the value
     */
    public BillingType getBillingType() {
        return billingType;
    }

    /** The pricing dimension against which usage is being reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageDimensionName")
    private final String usageDimensionName;

    /**
     * The pricing dimension against which usage is being reported.
     *
     * @return the value
     */
    public String getUsageDimensionName() {
        return usageDimensionName;
    }

    /** An optional non-negative usage quantity being reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumedQuantity")
    private final Double consumedQuantity;

    /**
     * An optional non-negative usage quantity being reported.
     *
     * @return the value
     */
    public Double getConsumedQuantity() {
        return consumedQuantity;
    }

    /** The non-negative usage cost computed by the partner for the submitted usage quantity. */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final Double amount;

    /**
     * The non-negative usage cost computed by the partner for the submitted usage quantity.
     *
     * @return the value
     */
    public Double getAmount() {
        return amount;
    }

    /** The ISO-4217 currency submitted for the computed usage cost. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * The ISO-4217 currency submitted for the computed usage cost.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** The billing period associated with this usage record in {@code YYYY-MM} format. */
    @com.fasterxml.jackson.annotation.JsonProperty("billingPeriod")
    private final String billingPeriod;

    /**
     * The billing period associated with this usage record in {@code YYYY-MM} format.
     *
     * @return the value
     */
    public String getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * customer tenancy associated with this usage record.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerTenancyId")
    private final String customerTenancyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * customer tenancy associated with this usage record.
     *
     * @return the value
     */
    public String getCustomerTenancyId() {
        return customerTenancyId;
    }

    /** The partner billing identifier associated with this usage record. */
    @com.fasterxml.jackson.annotation.JsonProperty("billingIdentifier")
    private final String billingIdentifier;

    /**
     * The partner billing identifier associated with this usage record.
     *
     * @return the value
     */
    public String getBillingIdentifier() {
        return billingIdentifier;
    }

    /** The unit of measure associated with the reported usage quantity. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    /**
     * The unit of measure associated with the reported usage quantity.
     *
     * @return the value
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /** The unit price associated with this usage record. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    private final Double unitPrice;

    /**
     * The unit price associated with this usage record.
     *
     * @return the value
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /** The product SKU associated with this usage record. */
    @com.fasterxml.jackson.annotation.JsonProperty("productSku")
    private final String productSku;

    /**
     * The product SKU associated with this usage record.
     *
     * @return the value
     */
    public String getProductSku() {
        return productSku;
    }

    /** The contract duration associated with this usage record. */
    @com.fasterxml.jackson.annotation.JsonProperty("contractDuration")
    private final BillingFrequency contractDuration;

    /**
     * The contract duration associated with this usage record.
     *
     * @return the value
     */
    public BillingFrequency getContractDuration() {
        return contractDuration;
    }

    /** Additional key/value metadata associated with this usage record for extensibility. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMetadata")
    private final java.util.List<ExtendedMetadata> additionalMetadata;

    /**
     * Additional key/value metadata associated with this usage record for extensibility.
     *
     * @return the value
     */
    public java.util.List<ExtendedMetadata> getAdditionalMetadata() {
        return additionalMetadata;
    }

    /** Partner-provided usage record identifier for traceability. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageRecordId")
    private final String usageRecordId;

    /**
     * Partner-provided usage record identifier for traceability.
     *
     * @return the value
     */
    public String getUsageRecordId() {
        return usageRecordId;
    }

    /**
     * The inclusive start timestamp for the usage window. This value must be before {@code
     * timeUsageEnded}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The inclusive start timestamp for the usage window. This value must be before {@code
     * timeUsageEnded}.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /**
     * The exclusive end timestamp for the usage window. This value must be after {@code
     * timeUsageStarted}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The exclusive end timestamp for the usage window. This value must be after {@code
     * timeUsageStarted}.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
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
        sb.append("CreateSubscriptionUsageRecordDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", marketplaceOfferId=").append(String.valueOf(this.marketplaceOfferId));
        sb.append(", billingType=").append(String.valueOf(this.billingType));
        sb.append(", usageDimensionName=").append(String.valueOf(this.usageDimensionName));
        sb.append(", consumedQuantity=").append(String.valueOf(this.consumedQuantity));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", billingPeriod=").append(String.valueOf(this.billingPeriod));
        sb.append(", customerTenancyId=").append(String.valueOf(this.customerTenancyId));
        sb.append(", billingIdentifier=").append(String.valueOf(this.billingIdentifier));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append(", unitPrice=").append(String.valueOf(this.unitPrice));
        sb.append(", productSku=").append(String.valueOf(this.productSku));
        sb.append(", contractDuration=").append(String.valueOf(this.contractDuration));
        sb.append(", additionalMetadata=").append(String.valueOf(this.additionalMetadata));
        sb.append(", usageRecordId=").append(String.valueOf(this.usageRecordId));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubscriptionUsageRecordDetails)) {
            return false;
        }

        CreateSubscriptionUsageRecordDetails other = (CreateSubscriptionUsageRecordDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.marketplaceOfferId, other.marketplaceOfferId)
                && java.util.Objects.equals(this.billingType, other.billingType)
                && java.util.Objects.equals(this.usageDimensionName, other.usageDimensionName)
                && java.util.Objects.equals(this.consumedQuantity, other.consumedQuantity)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.billingPeriod, other.billingPeriod)
                && java.util.Objects.equals(this.customerTenancyId, other.customerTenancyId)
                && java.util.Objects.equals(this.billingIdentifier, other.billingIdentifier)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && java.util.Objects.equals(this.unitPrice, other.unitPrice)
                && java.util.Objects.equals(this.productSku, other.productSku)
                && java.util.Objects.equals(this.contractDuration, other.contractDuration)
                && java.util.Objects.equals(this.additionalMetadata, other.additionalMetadata)
                && java.util.Objects.equals(this.usageRecordId, other.usageRecordId)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.marketplaceOfferId == null
                                ? 43
                                : this.marketplaceOfferId.hashCode());
        result = (result * PRIME) + (this.billingType == null ? 43 : this.billingType.hashCode());
        result =
                (result * PRIME)
                        + (this.usageDimensionName == null
                                ? 43
                                : this.usageDimensionName.hashCode());
        result =
                (result * PRIME)
                        + (this.consumedQuantity == null ? 43 : this.consumedQuantity.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.billingPeriod == null ? 43 : this.billingPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.customerTenancyId == null ? 43 : this.customerTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.billingIdentifier == null ? 43 : this.billingIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
        result = (result * PRIME) + (this.unitPrice == null ? 43 : this.unitPrice.hashCode());
        result = (result * PRIME) + (this.productSku == null ? 43 : this.productSku.hashCode());
        result =
                (result * PRIME)
                        + (this.contractDuration == null ? 43 : this.contractDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalMetadata == null
                                ? 43
                                : this.additionalMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.usageRecordId == null ? 43 : this.usageRecordId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
