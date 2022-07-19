/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvoiceLineSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoiceLineSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "product",
        "orderNo",
        "partNumber",
        "timeStart",
        "timeEnd",
        "quantity",
        "netUnitPrice",
        "totalPrice",
        "currency"
    })
    public InvoiceLineSummary(
            String product,
            String orderNo,
            String partNumber,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.math.BigDecimal quantity,
            java.math.BigDecimal netUnitPrice,
            java.math.BigDecimal totalPrice,
            Currency currency) {
        super();
        this.product = product;
        this.orderNo = orderNo;
        this.partNumber = partNumber;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.quantity = quantity;
        this.netUnitPrice = netUnitPrice;
        this.totalPrice = totalPrice;
        this.currency = currency;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Product of the item
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product of the item
         * @param product the value to set
         * @return this builder
         **/
        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Product of the item
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderNo")
        private String orderNo;

        /**
         * Product of the item
         * @param orderNo the value to set
         * @return this builder
         **/
        public Builder orderNo(String orderNo) {
            this.orderNo = orderNo;
            this.__explicitlySet__.add("orderNo");
            return this;
        }
        /**
         * Part number
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        /**
         * Part number
         * @param partNumber the value to set
         * @return this builder
         **/
        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }
        /**
         * Start date
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Start date
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * End date
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * End date
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Quantity of the ordered product
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private java.math.BigDecimal quantity;

        /**
         * Quantity of the ordered product
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(java.math.BigDecimal quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Unit price of the ordered product
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private java.math.BigDecimal netUnitPrice;

        /**
         * Unit price of the ordered product
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(java.math.BigDecimal netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Total price of the ordered product (Net unit price x quantity)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalPrice")
        private java.math.BigDecimal totalPrice;

        /**
         * Total price of the ordered product (Net unit price x quantity)
         * @param totalPrice the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Product of the item
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product of the item
     * @return the value
     **/
    public String getProduct() {
        return product;
    }

    /**
     * Product of the item
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNo")
    private final String orderNo;

    /**
     * Product of the item
     * @return the value
     **/
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Part number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    private final String partNumber;

    /**
     * Part number
     * @return the value
     **/
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Start date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Start date
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * End date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * End date
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Quantity of the ordered product
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final java.math.BigDecimal quantity;

    /**
     * Quantity of the ordered product
     * @return the value
     **/
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Unit price of the ordered product
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final java.math.BigDecimal netUnitPrice;

    /**
     * Unit price of the ordered product
     * @return the value
     **/
    public java.math.BigDecimal getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Total price of the ordered product (Net unit price x quantity)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalPrice")
    private final java.math.BigDecimal totalPrice;

    /**
     * Total price of the ordered product (Net unit price x quantity)
     * @return the value
     **/
    public java.math.BigDecimal getTotalPrice() {
        return totalPrice;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final Currency currency;

    public Currency getCurrency() {
        return currency;
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
        sb.append("InvoiceLineSummary(");
        sb.append("product=").append(String.valueOf(this.product));
        sb.append(", orderNo=").append(String.valueOf(this.orderNo));
        sb.append(", partNumber=").append(String.valueOf(this.partNumber));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", totalPrice=").append(String.valueOf(this.totalPrice));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoiceLineSummary)) {
            return false;
        }

        InvoiceLineSummary other = (InvoiceLineSummary) o;
        return java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.orderNo, other.orderNo)
                && java.util.Objects.equals(this.partNumber, other.partNumber)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.totalPrice, other.totalPrice)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.orderNo == null ? 43 : this.orderNo.hashCode());
        result = (result * PRIME) + (this.partNumber == null ? 43 : this.partNumber.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.totalPrice == null ? 43 : this.totalPrice.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
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
