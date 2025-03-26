/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BillingScheduleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BillingScheduleSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscribedServiceId",
        "timeStart",
        "timeEnd",
        "timeInvoicing",
        "invoiceStatus",
        "quantity",
        "netUnitPrice",
        "amount",
        "billingFrequency",
        "arInvoiceNumber",
        "arCustomerTransactionId",
        "orderNumber",
        "product"
    })
    public BillingScheduleSummary(
            String subscribedServiceId,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            java.util.Date timeInvoicing,
            InvoiceStatus invoiceStatus,
            String quantity,
            String netUnitPrice,
            String amount,
            String billingFrequency,
            String arInvoiceNumber,
            String arCustomerTransactionId,
            String orderNumber,
            BillingScheduleProduct product) {
        super();
        this.subscribedServiceId = subscribedServiceId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeInvoicing = timeInvoicing;
        this.invoiceStatus = invoiceStatus;
        this.quantity = quantity;
        this.netUnitPrice = netUnitPrice;
        this.amount = amount;
        this.billingFrequency = billingFrequency;
        this.arInvoiceNumber = arInvoiceNumber;
        this.arCustomerTransactionId = arCustomerTransactionId;
        this.orderNumber = orderNumber;
        this.product = product;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SPM internal Subscribed Service ID
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
        private String subscribedServiceId;

        /**
         * SPM internal Subscribed Service ID
         *
         * @param subscribedServiceId the value to set
         * @return this builder
         **/
        public Builder subscribedServiceId(String subscribedServiceId) {
            this.subscribedServiceId = subscribedServiceId;
            this.__explicitlySet__.add("subscribedServiceId");
            return this;
        }
        /**
         * Billing schedule start date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Billing schedule start date
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Billing schedule end date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Billing schedule end date
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Billing schedule invoicing date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoicing")
        private java.util.Date timeInvoicing;

        /**
         * Billing schedule invoicing date
         *
         * @param timeInvoicing the value to set
         * @return this builder
         **/
        public Builder timeInvoicing(java.util.Date timeInvoicing) {
            this.timeInvoicing = timeInvoicing;
            this.__explicitlySet__.add("timeInvoicing");
            return this;
        }
        /**
         * Billing schedule invoice status
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
        private InvoiceStatus invoiceStatus;

        /**
         * Billing schedule invoice status
         *
         * @param invoiceStatus the value to set
         * @return this builder
         **/
        public Builder invoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            this.__explicitlySet__.add("invoiceStatus");
            return this;
        }
        /**
         * Billing schedule quantity
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Billing schedule quantity
         *
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Billing schedule net unit price
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Billing schedule net unit price
         *
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Billing schedule line net amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private String amount;

        /**
         * Billing schedule line net amount
         *
         * @param amount the value to set
         * @return this builder
         **/
        public Builder amount(String amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }
        /**
         * Billing frequency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
        private String billingFrequency;

        /**
         * Billing frequency
         *
         * @param billingFrequency the value to set
         * @return this builder
         **/
        public Builder billingFrequency(String billingFrequency) {
            this.billingFrequency = billingFrequency;
            this.__explicitlySet__.add("billingFrequency");
            return this;
        }
        /**
         * Indicates the associated AR Invoice Number
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
        private String arInvoiceNumber;

        /**
         * Indicates the associated AR Invoice Number
         *
         * @param arInvoiceNumber the value to set
         * @return this builder
         **/
        public Builder arInvoiceNumber(String arInvoiceNumber) {
            this.arInvoiceNumber = arInvoiceNumber;
            this.__explicitlySet__.add("arInvoiceNumber");
            return this;
        }
        /**
         * Indicates the associated AR Customer transaction id a unique identifier existing on AR.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arCustomerTransactionId")
        private String arCustomerTransactionId;

        /**
         * Indicates the associated AR Customer transaction id a unique identifier existing on AR.
         *
         * @param arCustomerTransactionId the value to set
         * @return this builder
         **/
        public Builder arCustomerTransactionId(String arCustomerTransactionId) {
            this.arCustomerTransactionId = arCustomerTransactionId;
            this.__explicitlySet__.add("arCustomerTransactionId");
            return this;
        }
        /**
         * Order number associated with the Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private String orderNumber;

        /**
         * Order number associated with the Subscribed Service
         *
         * @param orderNumber the value to set
         * @return this builder
         **/
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private BillingScheduleProduct product;

        public Builder product(BillingScheduleProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillingScheduleSummary build() {
            BillingScheduleSummary model =
                    new BillingScheduleSummary(
                            this.subscribedServiceId,
                            this.timeStart,
                            this.timeEnd,
                            this.timeInvoicing,
                            this.invoiceStatus,
                            this.quantity,
                            this.netUnitPrice,
                            this.amount,
                            this.billingFrequency,
                            this.arInvoiceNumber,
                            this.arCustomerTransactionId,
                            this.orderNumber,
                            this.product);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillingScheduleSummary model) {
            if (model.wasPropertyExplicitlySet("subscribedServiceId")) {
                this.subscribedServiceId(model.getSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("timeInvoicing")) {
                this.timeInvoicing(model.getTimeInvoicing());
            }
            if (model.wasPropertyExplicitlySet("invoiceStatus")) {
                this.invoiceStatus(model.getInvoiceStatus());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("billingFrequency")) {
                this.billingFrequency(model.getBillingFrequency());
            }
            if (model.wasPropertyExplicitlySet("arInvoiceNumber")) {
                this.arInvoiceNumber(model.getArInvoiceNumber());
            }
            if (model.wasPropertyExplicitlySet("arCustomerTransactionId")) {
                this.arCustomerTransactionId(model.getArCustomerTransactionId());
            }
            if (model.wasPropertyExplicitlySet("orderNumber")) {
                this.orderNumber(model.getOrderNumber());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            return this;
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
    @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
    private final String subscribedServiceId;

    /**
     * SPM internal Subscribed Service ID
     *
     * @return the value
     **/
    public String getSubscribedServiceId() {
        return subscribedServiceId;
    }

    /**
     * Billing schedule start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Billing schedule start date
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Billing schedule end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Billing schedule end date
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Billing schedule invoicing date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoicing")
    private final java.util.Date timeInvoicing;

    /**
     * Billing schedule invoicing date
     *
     * @return the value
     **/
    public java.util.Date getTimeInvoicing() {
        return timeInvoicing;
    }

    /**
     * Billing schedule invoice status
     *
     **/
    public enum InvoiceStatus {
        Invoiced("INVOICED"),
        NotInvoiced("NOT_INVOICED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InvoiceStatus.class);

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
    private final InvoiceStatus invoiceStatus;

    /**
     * Billing schedule invoice status
     *
     * @return the value
     **/
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Billing schedule quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Billing schedule quantity
     *
     * @return the value
     **/
    public String getQuantity() {
        return quantity;
    }

    /**
     * Billing schedule net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Billing schedule net unit price
     *
     * @return the value
     **/
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Billing schedule line net amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final String amount;

    /**
     * Billing schedule line net amount
     *
     * @return the value
     **/
    public String getAmount() {
        return amount;
    }

    /**
     * Billing frequency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
    private final String billingFrequency;

    /**
     * Billing frequency
     *
     * @return the value
     **/
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Indicates the associated AR Invoice Number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arInvoiceNumber")
    private final String arInvoiceNumber;

    /**
     * Indicates the associated AR Invoice Number
     *
     * @return the value
     **/
    public String getArInvoiceNumber() {
        return arInvoiceNumber;
    }

    /**
     * Indicates the associated AR Customer transaction id a unique identifier existing on AR.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arCustomerTransactionId")
    private final String arCustomerTransactionId;

    /**
     * Indicates the associated AR Customer transaction id a unique identifier existing on AR.
     *
     * @return the value
     **/
    public String getArCustomerTransactionId() {
        return arCustomerTransactionId;
    }

    /**
     * Order number associated with the Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final String orderNumber;

    /**
     * Order number associated with the Subscribed Service
     *
     * @return the value
     **/
    public String getOrderNumber() {
        return orderNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final BillingScheduleProduct product;

    public BillingScheduleProduct getProduct() {
        return product;
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
        sb.append("BillingScheduleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("subscribedServiceId=").append(String.valueOf(this.subscribedServiceId));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", timeInvoicing=").append(String.valueOf(this.timeInvoicing));
        sb.append(", invoiceStatus=").append(String.valueOf(this.invoiceStatus));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", billingFrequency=").append(String.valueOf(this.billingFrequency));
        sb.append(", arInvoiceNumber=").append(String.valueOf(this.arInvoiceNumber));
        sb.append(", arCustomerTransactionId=")
                .append(String.valueOf(this.arCustomerTransactionId));
        sb.append(", orderNumber=").append(String.valueOf(this.orderNumber));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BillingScheduleSummary)) {
            return false;
        }

        BillingScheduleSummary other = (BillingScheduleSummary) o;
        return java.util.Objects.equals(this.subscribedServiceId, other.subscribedServiceId)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.timeInvoicing, other.timeInvoicing)
                && java.util.Objects.equals(this.invoiceStatus, other.invoiceStatus)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(this.billingFrequency, other.billingFrequency)
                && java.util.Objects.equals(this.arInvoiceNumber, other.arInvoiceNumber)
                && java.util.Objects.equals(
                        this.arCustomerTransactionId, other.arCustomerTransactionId)
                && java.util.Objects.equals(this.orderNumber, other.orderNumber)
                && java.util.Objects.equals(this.product, other.product)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscribedServiceId == null
                                ? 43
                                : this.subscribedServiceId.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoicing == null ? 43 : this.timeInvoicing.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceStatus == null ? 43 : this.invoiceStatus.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result =
                (result * PRIME)
                        + (this.billingFrequency == null ? 43 : this.billingFrequency.hashCode());
        result =
                (result * PRIME)
                        + (this.arInvoiceNumber == null ? 43 : this.arInvoiceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.arCustomerTransactionId == null
                                ? 43
                                : this.arCustomerTransactionId.hashCode());
        result = (result * PRIME) + (this.orderNumber == null ? 43 : this.orderNumber.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
