/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Product items of the invoice
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvoiceLineSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InvoiceLineSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("orderNo")
        private String orderNo;

        public Builder orderNo(String orderNo) {
            this.orderNo = orderNo;
            this.__explicitlySet__.add("orderNo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
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

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private java.math.BigDecimal quantity;

        public Builder quantity(java.math.BigDecimal quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private java.math.BigDecimal netUnitPrice;

        public Builder netUnitPrice(java.math.BigDecimal netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalPrice")
        private java.math.BigDecimal totalPrice;

        public Builder totalPrice(java.math.BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
            this.__explicitlySet__.add("totalPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private Currency currency;

        public Builder currency(Currency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoiceLineSummary build() {
            InvoiceLineSummary __instance__ =
                    new InvoiceLineSummary(
                            product,
                            orderNo,
                            partNumber,
                            timeStart,
                            timeEnd,
                            quantity,
                            netUnitPrice,
                            totalPrice,
                            currency);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoiceLineSummary o) {
            Builder copiedBuilder =
                    product(o.getProduct())
                            .orderNo(o.getOrderNo())
                            .partNumber(o.getPartNumber())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .quantity(o.getQuantity())
                            .netUnitPrice(o.getNetUnitPrice())
                            .totalPrice(o.getTotalPrice())
                            .currency(o.getCurrency());

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
     * Product of the item
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    String product;

    /**
     * Product of the item
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNo")
    String orderNo;

    /**
     * Part number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    String partNumber;

    /**
     * Start date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * End date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * Quantity of the ordered product
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    java.math.BigDecimal quantity;

    /**
     * Unit price of the ordered product
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    java.math.BigDecimal netUnitPrice;

    /**
     * Total price of the ordered product (Net unit price x quantity)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalPrice")
    java.math.BigDecimal totalPrice;

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    Currency currency;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
