/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubbillingschedule.model;

/**
 * Billing schedule details related to Subscription Id
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
    builder = BillingScheduleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BillingScheduleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoicing")
        private java.util.Date timeInvoicing;

        public Builder timeInvoicing(java.util.Date timeInvoicing) {
            this.timeInvoicing = timeInvoicing;
            this.__explicitlySet__.add("timeInvoicing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
        private InvoiceStatus invoiceStatus;

        public Builder invoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            this.__explicitlySet__.add("invoiceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private String amount;

        public Builder amount(String amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
        private String billingFrequency;

        public Builder billingFrequency(String billingFrequency) {
            this.billingFrequency = billingFrequency;
            this.__explicitlySet__.add("billingFrequency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
        private String arInvoiceNumber;

        public Builder arInvoiceNumber(String arInvoiceNumber) {
            this.arInvoiceNumber = arInvoiceNumber;
            this.__explicitlySet__.add("arInvoiceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arCustomerTransactionId")
        private String arCustomerTransactionId;

        public Builder arCustomerTransactionId(String arCustomerTransactionId) {
            this.arCustomerTransactionId = arCustomerTransactionId;
            this.__explicitlySet__.add("arCustomerTransactionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private String orderNumber;

        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillingScheduleSummary build() {
            BillingScheduleSummary __instance__ =
                    new BillingScheduleSummary(
                            timeStart,
                            timeEnd,
                            timeInvoicing,
                            invoiceStatus,
                            quantity,
                            netUnitPrice,
                            amount,
                            billingFrequency,
                            arInvoiceNumber,
                            arCustomerTransactionId,
                            orderNumber,
                            product);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillingScheduleSummary o) {
            Builder copiedBuilder =
                    timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .timeInvoicing(o.getTimeInvoicing())
                            .invoiceStatus(o.getInvoiceStatus())
                            .quantity(o.getQuantity())
                            .netUnitPrice(o.getNetUnitPrice())
                            .amount(o.getAmount())
                            .billingFrequency(o.getBillingFrequency())
                            .arInvoiceNumber(o.getArInvoiceNumber())
                            .arCustomerTransactionId(o.getArCustomerTransactionId())
                            .orderNumber(o.getOrderNumber())
                            .product(o.getProduct());

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
     * Billing schedule start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Billing schedule end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * Billing schedule invoicing date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoicing")
    java.util.Date timeInvoicing;
    /**
     * Billing schedule invoice status
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InvoiceStatus {
        Invoiced("INVOICED"),
        NotInvoiced("NOT_INVOICED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InvoiceStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (InvoiceStatus v : InvoiceStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InvoiceStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InvoiceStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InvoiceStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Billing schedule invoice status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
    InvoiceStatus invoiceStatus;

    /**
     * Billing schedule quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    String quantity;

    /**
     * Billing schedule net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    String netUnitPrice;

    /**
     * Billing schedule line net amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    String amount;

    /**
     * Billing frequency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
    String billingFrequency;

    /**
     * Indicates the associated AR Invoice Number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
    String arInvoiceNumber;

    /**
     * Indicates the associated AR Customer transaction id a unique identifier existing on AR.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arCustomerTransactionId")
    String arCustomerTransactionId;

    /**
     * Order number associated with the Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    String orderNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    Product product;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
