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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscribedServiceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SubscribedServiceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * SPM internal Subscribed Service ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    SubscriptionProduct product;

    /**
     * Subscribed service quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    String quantity;

    /**
     * Subscribed service status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    /**
     * Subscribed service operation type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    String operationType;

    /**
     * Subscribed service net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    String netUnitPrice;

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    String fundedAllocationValue;

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
    String partnerTransactionType;

    /**
     * Term value in Months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValue")
    Long termValue;

    /**
     * Term value UOM
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValueUOM")
    String termValueUOM;

    /**
     * Booking Opportunity Number of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
    String bookingOptyNumber;

    /**
     * Subscribed service total value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
    String totalValue;

    /**
     * Sales Order Number associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    Long orderNumber;

    /**
     * Subscribed service data center region
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    String dataCenterRegion;

    /**
     * Subscribed service pricing model
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    String pricingModel;

    /**
     * Subscribed service program type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("programType")
    String programType;

    /**
     * Subscribed service promotion type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    String promoType;

    /**
     * Subscribed service CSI number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    Long csi;

    /**
     * Subscribed service intent to pay flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    Boolean isIntentToPay;

    /**
     * Subscribed service start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Subscribed service end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * List of Commitment services of a line
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
    java.util.List<Commitment> commitmentServices;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
