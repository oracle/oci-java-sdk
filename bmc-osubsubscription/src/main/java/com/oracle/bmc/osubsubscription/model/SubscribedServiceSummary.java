/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Subscribed Service summary
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscribedServiceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscribedServiceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "product",
        "quantity",
        "status",
        "operationType",
        "netUnitPrice",
        "fundedAllocationValue",
        "partnerTransactionType",
        "termValue",
        "termValueUOM",
        "bookingOptyNumber",
        "totalValue",
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
    public SubscribedServiceSummary(
            String id,
            SubscriptionProduct product,
            String quantity,
            String status,
            String operationType,
            String netUnitPrice,
            String fundedAllocationValue,
            String partnerTransactionType,
            Long termValue,
            String termValueUOM,
            String bookingOptyNumber,
            String totalValue,
            Long orderNumber,
            String dataCenterRegion,
            String pricingModel,
            String programType,
            String promoType,
            Long csi,
            Boolean isIntentToPay,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.List<Commitment> commitmentServices) {
        super();
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.operationType = operationType;
        this.netUnitPrice = netUnitPrice;
        this.fundedAllocationValue = fundedAllocationValue;
        this.partnerTransactionType = partnerTransactionType;
        this.termValue = termValue;
        this.termValueUOM = termValueUOM;
        this.bookingOptyNumber = bookingOptyNumber;
        this.totalValue = totalValue;
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
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

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

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private String operationType;

        public Builder operationType(String operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
        private String partnerTransactionType;

        public Builder partnerTransactionType(String partnerTransactionType) {
            this.partnerTransactionType = partnerTransactionType;
            this.__explicitlySet__.add("partnerTransactionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termValue")
        private Long termValue;

        public Builder termValue(Long termValue) {
            this.termValue = termValue;
            this.__explicitlySet__.add("termValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termValueUOM")
        private String termValueUOM;

        public Builder termValueUOM(String termValueUOM) {
            this.termValueUOM = termValueUOM;
            this.__explicitlySet__.add("termValueUOM");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
        private String bookingOptyNumber;

        public Builder bookingOptyNumber(String bookingOptyNumber) {
            this.bookingOptyNumber = bookingOptyNumber;
            this.__explicitlySet__.add("bookingOptyNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
        private String totalValue;

        public Builder totalValue(String totalValue) {
            this.totalValue = totalValue;
            this.__explicitlySet__.add("totalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private Long orderNumber;

        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
        private String dataCenterRegion;

        public Builder dataCenterRegion(String dataCenterRegion) {
            this.dataCenterRegion = dataCenterRegion;
            this.__explicitlySet__.add("dataCenterRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
        private String pricingModel;

        public Builder pricingModel(String pricingModel) {
            this.pricingModel = pricingModel;
            this.__explicitlySet__.add("pricingModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("programType")
        private String programType;

        public Builder programType(String programType) {
            this.programType = programType;
            this.__explicitlySet__.add("programType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("promoType")
        private String promoType;

        public Builder promoType(String promoType) {
            this.promoType = promoType;
            this.__explicitlySet__.add("promoType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private Long csi;

        public Builder csi(Long csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
        private java.util.List<Commitment> commitmentServices;

        public Builder commitmentServices(java.util.List<Commitment> commitmentServices) {
            this.commitmentServices = commitmentServices;
            this.__explicitlySet__.add("commitmentServices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscribedServiceSummary build() {
            SubscribedServiceSummary __instance__ =
                    new SubscribedServiceSummary(
                            id,
                            product,
                            quantity,
                            status,
                            operationType,
                            netUnitPrice,
                            fundedAllocationValue,
                            partnerTransactionType,
                            termValue,
                            termValueUOM,
                            bookingOptyNumber,
                            totalValue,
                            orderNumber,
                            dataCenterRegion,
                            pricingModel,
                            programType,
                            promoType,
                            csi,
                            isIntentToPay,
                            timeStart,
                            timeEnd,
                            commitmentServices);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscribedServiceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .product(o.getProduct())
                            .quantity(o.getQuantity())
                            .status(o.getStatus())
                            .operationType(o.getOperationType())
                            .netUnitPrice(o.getNetUnitPrice())
                            .fundedAllocationValue(o.getFundedAllocationValue())
                            .partnerTransactionType(o.getPartnerTransactionType())
                            .termValue(o.getTermValue())
                            .termValueUOM(o.getTermValueUOM())
                            .bookingOptyNumber(o.getBookingOptyNumber())
                            .totalValue(o.getTotalValue())
                            .orderNumber(o.getOrderNumber())
                            .dataCenterRegion(o.getDataCenterRegion())
                            .pricingModel(o.getPricingModel())
                            .programType(o.getProgramType())
                            .promoType(o.getPromoType())
                            .csi(o.getCsi())
                            .isIntentToPay(o.getIsIntentToPay())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .commitmentServices(o.getCommitmentServices());

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
     * SPM internal Subscribed Service ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final SubscriptionProduct product;

    public SubscriptionProduct getProduct() {
        return product;
    }

    /**
     * Subscribed service quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    public String getQuantity() {
        return quantity;
    }

    /**
     * Subscribed service status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    public String getStatus() {
        return status;
    }

    /**
     * Subscribed service operation type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final String operationType;

    public String getOperationType() {
        return operationType;
    }

    /**
     * Subscribed service net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    public String getFundedAllocationValue() {
        return fundedAllocationValue;
    }

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
    private final String partnerTransactionType;

    public String getPartnerTransactionType() {
        return partnerTransactionType;
    }

    /**
     * Term value in Months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValue")
    private final Long termValue;

    public Long getTermValue() {
        return termValue;
    }

    /**
     * Term value UOM
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValueUOM")
    private final String termValueUOM;

    public String getTermValueUOM() {
        return termValueUOM;
    }

    /**
     * Booking Opportunity Number of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
    private final String bookingOptyNumber;

    public String getBookingOptyNumber() {
        return bookingOptyNumber;
    }

    /**
     * Subscribed service total value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
    private final String totalValue;

    public String getTotalValue() {
        return totalValue;
    }

    /**
     * Sales Order Number associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final Long orderNumber;

    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * Subscribed service data center region
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    private final String dataCenterRegion;

    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    /**
     * Subscribed service pricing model
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    private final String pricingModel;

    public String getPricingModel() {
        return pricingModel;
    }

    /**
     * Subscribed service program type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("programType")
    private final String programType;

    public String getProgramType() {
        return programType;
    }

    /**
     * Subscribed service promotion type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    private final String promoType;

    public String getPromoType() {
        return promoType;
    }

    /**
     * Subscribed service CSI number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final Long csi;

    public Long getCsi() {
        return csi;
    }

    /**
     * Subscribed service intent to pay flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /**
     * Subscribed service start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Subscribed service end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * List of Commitment services of a line
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
    private final java.util.List<Commitment> commitmentServices;

    public java.util.List<Commitment> getCommitmentServices() {
        return commitmentServices;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SubscribedServiceSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", fundedAllocationValue=").append(String.valueOf(this.fundedAllocationValue));
        sb.append(", partnerTransactionType=").append(String.valueOf(this.partnerTransactionType));
        sb.append(", termValue=").append(String.valueOf(this.termValue));
        sb.append(", termValueUOM=").append(String.valueOf(this.termValueUOM));
        sb.append(", bookingOptyNumber=").append(String.valueOf(this.bookingOptyNumber));
        sb.append(", totalValue=").append(String.valueOf(this.totalValue));
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscribedServiceSummary)) {
            return false;
        }

        SubscribedServiceSummary other = (SubscribedServiceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && java.util.Objects.equals(
                        this.partnerTransactionType, other.partnerTransactionType)
                && java.util.Objects.equals(this.termValue, other.termValue)
                && java.util.Objects.equals(this.termValueUOM, other.termValueUOM)
                && java.util.Objects.equals(this.bookingOptyNumber, other.bookingOptyNumber)
                && java.util.Objects.equals(this.totalValue, other.totalValue)
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.termValueUOM == null ? 43 : this.termValueUOM.hashCode());
        result =
                (result * PRIME)
                        + (this.bookingOptyNumber == null ? 43 : this.bookingOptyNumber.hashCode());
        result = (result * PRIME) + (this.totalValue == null ? 43 : this.totalValue.hashCode());
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
