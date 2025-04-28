/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Subscribed Service summary <br>
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
        builder = SubscriptionSubscribedService.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionSubscribedService
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "product",
        "quantity",
        "status",
        "operationType",
        "netUnitPrice",
        "usedAmount",
        "availableAmount",
        "fundedAllocationValue",
        "partnerTransactionType",
        "termValue",
        "termValueUom",
        "bookingOptyNumber",
        "totalValue",
        "originalPromoAmount",
        "orderNumber",
        "dataCenterRegion",
        "pricingModel",
        "programType",
        "promoType",
        "csi",
        "isIntentToPay",
        "timeStart",
        "timeEnd",
        "commitmentServices"
    })
    public SubscriptionSubscribedService(
            String id,
            SubscriptionProduct product,
            String quantity,
            String status,
            String operationType,
            String netUnitPrice,
            String usedAmount,
            String availableAmount,
            String fundedAllocationValue,
            String partnerTransactionType,
            Long termValue,
            String termValueUom,
            String bookingOptyNumber,
            String totalValue,
            String originalPromoAmount,
            Long orderNumber,
            String dataCenterRegion,
            String pricingModel,
            String programType,
            String promoType,
            Long csi,
            Boolean isIntentToPay,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.List<CommitmentService> commitmentServices) {
        super();
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.operationType = operationType;
        this.netUnitPrice = netUnitPrice;
        this.usedAmount = usedAmount;
        this.availableAmount = availableAmount;
        this.fundedAllocationValue = fundedAllocationValue;
        this.partnerTransactionType = partnerTransactionType;
        this.termValue = termValue;
        this.termValueUom = termValueUom;
        this.bookingOptyNumber = bookingOptyNumber;
        this.totalValue = totalValue;
        this.originalPromoAmount = originalPromoAmount;
        this.orderNumber = orderNumber;
        this.dataCenterRegion = dataCenterRegion;
        this.pricingModel = pricingModel;
        this.programType = programType;
        this.promoType = promoType;
        this.csi = csi;
        this.isIntentToPay = isIntentToPay;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.commitmentServices = commitmentServices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SPM internal Subscribed Service ID */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * SPM internal Subscribed Service ID
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private SubscriptionProduct product;

        public Builder product(SubscriptionProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /** Subscribed service quantity */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Subscribed service quantity
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /** Subscribed service status */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Subscribed service status
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Subscribed service operation type */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private String operationType;

        /**
         * Subscribed service operation type
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** Subscribed service net unit price */
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Subscribed service net unit price
         *
         * @param netUnitPrice the value to set
         * @return this builder
         */
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /** Subscribed service used amount */
        @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
        private String usedAmount;

        /**
         * Subscribed service used amount
         *
         * @param usedAmount the value to set
         * @return this builder
         */
        public Builder usedAmount(String usedAmount) {
            this.usedAmount = usedAmount;
            this.__explicitlySet__.add("usedAmount");
            return this;
        }
        /** Subscribed sercice available or remaining amount */
        @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
        private String availableAmount;

        /**
         * Subscribed sercice available or remaining amount
         *
         * @param availableAmount the value to set
         * @return this builder
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            this.__explicitlySet__.add("availableAmount");
            return this;
        }
        /** Funded Allocation line value example: 12000.00 */
        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        /**
         * Funded Allocation line value example: 12000.00
         *
         * @param fundedAllocationValue the value to set
         * @return this builder
         */
        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }
        /**
         * This field contains the name of the partner to which the subscription belongs - depending
         * on which the invoicing may differ
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
        private String partnerTransactionType;

        /**
         * This field contains the name of the partner to which the subscription belongs - depending
         * on which the invoicing may differ
         *
         * @param partnerTransactionType the value to set
         * @return this builder
         */
        public Builder partnerTransactionType(String partnerTransactionType) {
            this.partnerTransactionType = partnerTransactionType;
            this.__explicitlySet__.add("partnerTransactionType");
            return this;
        }
        /** Term value in Months */
        @com.fasterxml.jackson.annotation.JsonProperty("termValue")
        private Long termValue;

        /**
         * Term value in Months
         *
         * @param termValue the value to set
         * @return this builder
         */
        public Builder termValue(Long termValue) {
            this.termValue = termValue;
            this.__explicitlySet__.add("termValue");
            return this;
        }
        /** Term value UOM */
        @com.fasterxml.jackson.annotation.JsonProperty("termValueUom")
        private String termValueUom;

        /**
         * Term value UOM
         *
         * @param termValueUom the value to set
         * @return this builder
         */
        public Builder termValueUom(String termValueUom) {
            this.termValueUom = termValueUom;
            this.__explicitlySet__.add("termValueUom");
            return this;
        }
        /** Booking Opportunity Number of Subscribed Service */
        @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
        private String bookingOptyNumber;

        /**
         * Booking Opportunity Number of Subscribed Service
         *
         * @param bookingOptyNumber the value to set
         * @return this builder
         */
        public Builder bookingOptyNumber(String bookingOptyNumber) {
            this.bookingOptyNumber = bookingOptyNumber;
            this.__explicitlySet__.add("bookingOptyNumber");
            return this;
        }
        /** Subscribed service total value */
        @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
        private String totalValue;

        /**
         * Subscribed service total value
         *
         * @param totalValue the value to set
         * @return this builder
         */
        public Builder totalValue(String totalValue) {
            this.totalValue = totalValue;
            this.__explicitlySet__.add("totalValue");
            return this;
        }
        /** Subscribed service Promotion Amount */
        @com.fasterxml.jackson.annotation.JsonProperty("originalPromoAmount")
        private String originalPromoAmount;

        /**
         * Subscribed service Promotion Amount
         *
         * @param originalPromoAmount the value to set
         * @return this builder
         */
        public Builder originalPromoAmount(String originalPromoAmount) {
            this.originalPromoAmount = originalPromoAmount;
            this.__explicitlySet__.add("originalPromoAmount");
            return this;
        }
        /** Sales Order Number associated to the subscribed service */
        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private Long orderNumber;

        /**
         * Sales Order Number associated to the subscribed service
         *
         * @param orderNumber the value to set
         * @return this builder
         */
        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }
        /** Subscribed service data center region */
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
        private String dataCenterRegion;

        /**
         * Subscribed service data center region
         *
         * @param dataCenterRegion the value to set
         * @return this builder
         */
        public Builder dataCenterRegion(String dataCenterRegion) {
            this.dataCenterRegion = dataCenterRegion;
            this.__explicitlySet__.add("dataCenterRegion");
            return this;
        }
        /** Subscribed service pricing model */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
        private String pricingModel;

        /**
         * Subscribed service pricing model
         *
         * @param pricingModel the value to set
         * @return this builder
         */
        public Builder pricingModel(String pricingModel) {
            this.pricingModel = pricingModel;
            this.__explicitlySet__.add("pricingModel");
            return this;
        }
        /** Subscribed service program type */
        @com.fasterxml.jackson.annotation.JsonProperty("programType")
        private String programType;

        /**
         * Subscribed service program type
         *
         * @param programType the value to set
         * @return this builder
         */
        public Builder programType(String programType) {
            this.programType = programType;
            this.__explicitlySet__.add("programType");
            return this;
        }
        /** Subscribed service promotion type */
        @com.fasterxml.jackson.annotation.JsonProperty("promoType")
        private String promoType;

        /**
         * Subscribed service promotion type
         *
         * @param promoType the value to set
         * @return this builder
         */
        public Builder promoType(String promoType) {
            this.promoType = promoType;
            this.__explicitlySet__.add("promoType");
            return this;
        }
        /** Subscribed service CSI number */
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private Long csi;

        /**
         * Subscribed service CSI number
         *
         * @param csi the value to set
         * @return this builder
         */
        public Builder csi(Long csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /** Subscribed service intent to pay flag */
        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        /**
         * Subscribed service intent to pay flag
         *
         * @param isIntentToPay the value to set
         * @return this builder
         */
        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }
        /** Subscribed service start date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Subscribed service start date
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Subscribed service end date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Subscribed service end date
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** List of Commitment services of a line */
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
        private java.util.List<CommitmentService> commitmentServices;

        /**
         * List of Commitment services of a line
         *
         * @param commitmentServices the value to set
         * @return this builder
         */
        public Builder commitmentServices(java.util.List<CommitmentService> commitmentServices) {
            this.commitmentServices = commitmentServices;
            this.__explicitlySet__.add("commitmentServices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSubscribedService build() {
            SubscriptionSubscribedService model =
                    new SubscriptionSubscribedService(
                            this.id,
                            this.product,
                            this.quantity,
                            this.status,
                            this.operationType,
                            this.netUnitPrice,
                            this.usedAmount,
                            this.availableAmount,
                            this.fundedAllocationValue,
                            this.partnerTransactionType,
                            this.termValue,
                            this.termValueUom,
                            this.bookingOptyNumber,
                            this.totalValue,
                            this.originalPromoAmount,
                            this.orderNumber,
                            this.dataCenterRegion,
                            this.pricingModel,
                            this.programType,
                            this.promoType,
                            this.csi,
                            this.isIntentToPay,
                            this.timeStart,
                            this.timeEnd,
                            this.commitmentServices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSubscribedService model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("usedAmount")) {
                this.usedAmount(model.getUsedAmount());
            }
            if (model.wasPropertyExplicitlySet("availableAmount")) {
                this.availableAmount(model.getAvailableAmount());
            }
            if (model.wasPropertyExplicitlySet("fundedAllocationValue")) {
                this.fundedAllocationValue(model.getFundedAllocationValue());
            }
            if (model.wasPropertyExplicitlySet("partnerTransactionType")) {
                this.partnerTransactionType(model.getPartnerTransactionType());
            }
            if (model.wasPropertyExplicitlySet("termValue")) {
                this.termValue(model.getTermValue());
            }
            if (model.wasPropertyExplicitlySet("termValueUom")) {
                this.termValueUom(model.getTermValueUom());
            }
            if (model.wasPropertyExplicitlySet("bookingOptyNumber")) {
                this.bookingOptyNumber(model.getBookingOptyNumber());
            }
            if (model.wasPropertyExplicitlySet("totalValue")) {
                this.totalValue(model.getTotalValue());
            }
            if (model.wasPropertyExplicitlySet("originalPromoAmount")) {
                this.originalPromoAmount(model.getOriginalPromoAmount());
            }
            if (model.wasPropertyExplicitlySet("orderNumber")) {
                this.orderNumber(model.getOrderNumber());
            }
            if (model.wasPropertyExplicitlySet("dataCenterRegion")) {
                this.dataCenterRegion(model.getDataCenterRegion());
            }
            if (model.wasPropertyExplicitlySet("pricingModel")) {
                this.pricingModel(model.getPricingModel());
            }
            if (model.wasPropertyExplicitlySet("programType")) {
                this.programType(model.getProgramType());
            }
            if (model.wasPropertyExplicitlySet("promoType")) {
                this.promoType(model.getPromoType());
            }
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("isIntentToPay")) {
                this.isIntentToPay(model.getIsIntentToPay());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("commitmentServices")) {
                this.commitmentServices(model.getCommitmentServices());
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
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * SPM internal Subscribed Service ID
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final SubscriptionProduct product;

    public SubscriptionProduct getProduct() {
        return product;
    }

    /** Subscribed service quantity */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Subscribed service quantity
     *
     * @return the value
     */
    public String getQuantity() {
        return quantity;
    }

    /** Subscribed service status */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Subscribed service status
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Subscribed service operation type */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final String operationType;

    /**
     * Subscribed service operation type
     *
     * @return the value
     */
    public String getOperationType() {
        return operationType;
    }

    /** Subscribed service net unit price */
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Subscribed service net unit price
     *
     * @return the value
     */
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /** Subscribed service used amount */
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
    private final String usedAmount;

    /**
     * Subscribed service used amount
     *
     * @return the value
     */
    public String getUsedAmount() {
        return usedAmount;
    }

    /** Subscribed sercice available or remaining amount */
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    private final String availableAmount;

    /**
     * Subscribed sercice available or remaining amount
     *
     * @return the value
     */
    public String getAvailableAmount() {
        return availableAmount;
    }

    /** Funded Allocation line value example: 12000.00 */
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    /**
     * Funded Allocation line value example: 12000.00
     *
     * @return the value
     */
    public String getFundedAllocationValue() {
        return fundedAllocationValue;
    }

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on
     * which the invoicing may differ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
    private final String partnerTransactionType;

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on
     * which the invoicing may differ
     *
     * @return the value
     */
    public String getPartnerTransactionType() {
        return partnerTransactionType;
    }

    /** Term value in Months */
    @com.fasterxml.jackson.annotation.JsonProperty("termValue")
    private final Long termValue;

    /**
     * Term value in Months
     *
     * @return the value
     */
    public Long getTermValue() {
        return termValue;
    }

    /** Term value UOM */
    @com.fasterxml.jackson.annotation.JsonProperty("termValueUom")
    private final String termValueUom;

    /**
     * Term value UOM
     *
     * @return the value
     */
    public String getTermValueUom() {
        return termValueUom;
    }

    /** Booking Opportunity Number of Subscribed Service */
    @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
    private final String bookingOptyNumber;

    /**
     * Booking Opportunity Number of Subscribed Service
     *
     * @return the value
     */
    public String getBookingOptyNumber() {
        return bookingOptyNumber;
    }

    /** Subscribed service total value */
    @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
    private final String totalValue;

    /**
     * Subscribed service total value
     *
     * @return the value
     */
    public String getTotalValue() {
        return totalValue;
    }

    /** Subscribed service Promotion Amount */
    @com.fasterxml.jackson.annotation.JsonProperty("originalPromoAmount")
    private final String originalPromoAmount;

    /**
     * Subscribed service Promotion Amount
     *
     * @return the value
     */
    public String getOriginalPromoAmount() {
        return originalPromoAmount;
    }

    /** Sales Order Number associated to the subscribed service */
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final Long orderNumber;

    /**
     * Sales Order Number associated to the subscribed service
     *
     * @return the value
     */
    public Long getOrderNumber() {
        return orderNumber;
    }

    /** Subscribed service data center region */
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    private final String dataCenterRegion;

    /**
     * Subscribed service data center region
     *
     * @return the value
     */
    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    /** Subscribed service pricing model */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    private final String pricingModel;

    /**
     * Subscribed service pricing model
     *
     * @return the value
     */
    public String getPricingModel() {
        return pricingModel;
    }

    /** Subscribed service program type */
    @com.fasterxml.jackson.annotation.JsonProperty("programType")
    private final String programType;

    /**
     * Subscribed service program type
     *
     * @return the value
     */
    public String getProgramType() {
        return programType;
    }

    /** Subscribed service promotion type */
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    private final String promoType;

    /**
     * Subscribed service promotion type
     *
     * @return the value
     */
    public String getPromoType() {
        return promoType;
    }

    /** Subscribed service CSI number */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final Long csi;

    /**
     * Subscribed service CSI number
     *
     * @return the value
     */
    public Long getCsi() {
        return csi;
    }

    /** Subscribed service intent to pay flag */
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    /**
     * Subscribed service intent to pay flag
     *
     * @return the value
     */
    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /** Subscribed service start date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Subscribed service start date
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Subscribed service end date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Subscribed service end date
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** List of Commitment services of a line */
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
    private final java.util.List<CommitmentService> commitmentServices;

    /**
     * List of Commitment services of a line
     *
     * @return the value
     */
    public java.util.List<CommitmentService> getCommitmentServices() {
        return commitmentServices;
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
        sb.append("SubscriptionSubscribedService(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", usedAmount=").append(String.valueOf(this.usedAmount));
        sb.append(", availableAmount=").append(String.valueOf(this.availableAmount));
        sb.append(", fundedAllocationValue=").append(String.valueOf(this.fundedAllocationValue));
        sb.append(", partnerTransactionType=").append(String.valueOf(this.partnerTransactionType));
        sb.append(", termValue=").append(String.valueOf(this.termValue));
        sb.append(", termValueUom=").append(String.valueOf(this.termValueUom));
        sb.append(", bookingOptyNumber=").append(String.valueOf(this.bookingOptyNumber));
        sb.append(", totalValue=").append(String.valueOf(this.totalValue));
        sb.append(", originalPromoAmount=").append(String.valueOf(this.originalPromoAmount));
        sb.append(", orderNumber=").append(String.valueOf(this.orderNumber));
        sb.append(", dataCenterRegion=").append(String.valueOf(this.dataCenterRegion));
        sb.append(", pricingModel=").append(String.valueOf(this.pricingModel));
        sb.append(", programType=").append(String.valueOf(this.programType));
        sb.append(", promoType=").append(String.valueOf(this.promoType));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", isIntentToPay=").append(String.valueOf(this.isIntentToPay));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", commitmentServices=").append(String.valueOf(this.commitmentServices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionSubscribedService)) {
            return false;
        }

        SubscriptionSubscribedService other = (SubscriptionSubscribedService) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.usedAmount, other.usedAmount)
                && java.util.Objects.equals(this.availableAmount, other.availableAmount)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && java.util.Objects.equals(
                        this.partnerTransactionType, other.partnerTransactionType)
                && java.util.Objects.equals(this.termValue, other.termValue)
                && java.util.Objects.equals(this.termValueUom, other.termValueUom)
                && java.util.Objects.equals(this.bookingOptyNumber, other.bookingOptyNumber)
                && java.util.Objects.equals(this.totalValue, other.totalValue)
                && java.util.Objects.equals(this.originalPromoAmount, other.originalPromoAmount)
                && java.util.Objects.equals(this.orderNumber, other.orderNumber)
                && java.util.Objects.equals(this.dataCenterRegion, other.dataCenterRegion)
                && java.util.Objects.equals(this.pricingModel, other.pricingModel)
                && java.util.Objects.equals(this.programType, other.programType)
                && java.util.Objects.equals(this.promoType, other.promoType)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.isIntentToPay, other.isIntentToPay)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.commitmentServices, other.commitmentServices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.usedAmount == null ? 43 : this.usedAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAmount == null ? 43 : this.availableAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.fundedAllocationValue == null
                                ? 43
                                : this.fundedAllocationValue.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerTransactionType == null
                                ? 43
                                : this.partnerTransactionType.hashCode());
        result = (result * PRIME) + (this.termValue == null ? 43 : this.termValue.hashCode());
        result = (result * PRIME) + (this.termValueUom == null ? 43 : this.termValueUom.hashCode());
        result =
                (result * PRIME)
                        + (this.bookingOptyNumber == null ? 43 : this.bookingOptyNumber.hashCode());
        result = (result * PRIME) + (this.totalValue == null ? 43 : this.totalValue.hashCode());
        result =
                (result * PRIME)
                        + (this.originalPromoAmount == null
                                ? 43
                                : this.originalPromoAmount.hashCode());
        result = (result * PRIME) + (this.orderNumber == null ? 43 : this.orderNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCenterRegion == null ? 43 : this.dataCenterRegion.hashCode());
        result = (result * PRIME) + (this.pricingModel == null ? 43 : this.pricingModel.hashCode());
        result = (result * PRIME) + (this.programType == null ? 43 : this.programType.hashCode());
        result = (result * PRIME) + (this.promoType == null ? 43 : this.promoType.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntentToPay == null ? 43 : this.isIntentToPay.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentServices == null
                                ? 43
                                : this.commitmentServices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
