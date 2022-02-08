/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Invoice details
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Invoice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Invoice {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
        private String invoiceId;

        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            this.__explicitlySet__.add("invoiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
        private String invoiceNumber;

        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            this.__explicitlySet__.add("invoiceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
        private String internalInvoiceId;

        public Builder internalInvoiceId(String internalInvoiceId) {
            this.internalInvoiceId = internalInvoiceId;
            this.__explicitlySet__.add("internalInvoiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
        private Boolean isCreditCardPayable;

        public Builder isCreditCardPayable(Boolean isCreditCardPayable) {
            this.isCreditCardPayable = isCreditCardPayable;
            this.__explicitlySet__.add("isCreditCardPayable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
        private java.util.Date timeInvoice;

        public Builder timeInvoice(java.util.Date timeInvoice) {
            this.timeInvoice = timeInvoice;
            this.__explicitlySet__.add("timeInvoice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tax")
        private java.math.BigDecimal tax;

        public Builder tax(java.math.BigDecimal tax) {
            this.tax = tax;
            this.__explicitlySet__.add("tax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
        private java.math.BigDecimal invoiceAmount;

        public Builder invoiceAmount(java.math.BigDecimal invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            this.__explicitlySet__.add("invoiceAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
        private java.math.BigDecimal invoiceAmountDue;

        public Builder invoiceAmountDue(java.math.BigDecimal invoiceAmountDue) {
            this.invoiceAmountDue = invoiceAmountDue;
            this.__explicitlySet__.add("invoiceAmountDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
        private java.math.BigDecimal invoiceAmountCredited;

        public Builder invoiceAmountCredited(java.math.BigDecimal invoiceAmountCredited) {
            this.invoiceAmountCredited = invoiceAmountCredited;
            this.__explicitlySet__.add("invoiceAmountCredited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
        private java.math.BigDecimal invoiceAmountAdjusted;

        public Builder invoiceAmountAdjusted(java.math.BigDecimal invoiceAmountAdjusted) {
            this.invoiceAmountAdjusted = invoiceAmountAdjusted;
            this.__explicitlySet__.add("invoiceAmountAdjusted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
        private java.math.BigDecimal invoiceAmountApplied;

        public Builder invoiceAmountApplied(java.math.BigDecimal invoiceAmountApplied) {
            this.invoiceAmountApplied = invoiceAmountApplied;
            this.__explicitlySet__.add("invoiceAmountApplied");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private Currency currency;

        public Builder currency(Currency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
        private InvoiceType invoiceType;

        public Builder invoiceType(InvoiceType invoiceType) {
            this.invoiceType = invoiceType;
            this.__explicitlySet__.add("invoiceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
        private java.util.Date timeInvoiceDue;

        public Builder timeInvoiceDue(java.util.Date timeInvoiceDue) {
            this.timeInvoiceDue = timeInvoiceDue;
            this.__explicitlySet__.add("timeInvoiceDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
        private String invoiceRefNumber;

        public Builder invoiceRefNumber(String invoiceRefNumber) {
            this.invoiceRefNumber = invoiceRefNumber;
            this.__explicitlySet__.add("invoiceRefNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
        private String invoicePoNumber;

        public Builder invoicePoNumber(String invoicePoNumber) {
            this.invoicePoNumber = invoicePoNumber;
            this.__explicitlySet__.add("invoicePoNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
        private InvoiceStatus invoiceStatus;

        public Builder invoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            this.__explicitlySet__.add("invoiceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preferredEmail")
        private String preferredEmail;

        public Builder preferredEmail(String preferredEmail) {
            this.preferredEmail = preferredEmail;
            this.__explicitlySet__.add("preferredEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
        private Boolean isPdfEmailAvailable;

        public Builder isPdfEmailAvailable(Boolean isPdfEmailAvailable) {
            this.isPdfEmailAvailable = isPdfEmailAvailable;
            this.__explicitlySet__.add("isPdfEmailAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
        private Boolean isDisplayDownloadPdf;

        public Builder isDisplayDownloadPdf(Boolean isDisplayDownloadPdf) {
            this.isDisplayDownloadPdf = isDisplayDownloadPdf;
            this.__explicitlySet__.add("isDisplayDownloadPdf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
        private Boolean isPayable;

        public Builder isPayable(Boolean isPayable) {
            this.isPayable = isPayable;
            this.__explicitlySet__.add("isPayable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
        private String paymentTerms;

        public Builder paymentTerms(String paymentTerms) {
            this.paymentTerms = paymentTerms;
            this.__explicitlySet__.add("paymentTerms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastPaymentDetail")
        private PaymentDetail lastPaymentDetail;

        public Builder lastPaymentDetail(PaymentDetail lastPaymentDetail) {
            this.lastPaymentDetail = lastPaymentDetail;
            this.__explicitlySet__.add("lastPaymentDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
        private BillToAddress billToAddress;

        public Builder billToAddress(BillToAddress billToAddress) {
            this.billToAddress = billToAddress;
            this.__explicitlySet__.add("billToAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Invoice build() {
            Invoice __instance__ =
                    new Invoice(
                            invoiceId,
                            invoiceNumber,
                            internalInvoiceId,
                            isCreditCardPayable,
                            timeInvoice,
                            tax,
                            invoiceAmount,
                            invoiceAmountDue,
                            invoiceAmountCredited,
                            invoiceAmountAdjusted,
                            invoiceAmountApplied,
                            currency,
                            invoiceType,
                            timeInvoiceDue,
                            invoiceRefNumber,
                            invoicePoNumber,
                            invoiceStatus,
                            preferredEmail,
                            isPdfEmailAvailable,
                            isDisplayDownloadPdf,
                            isPayable,
                            paymentTerms,
                            lastPaymentDetail,
                            billToAddress,
                            subscriptionIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Invoice o) {
            Builder copiedBuilder =
                    invoiceId(o.getInvoiceId())
                            .invoiceNumber(o.getInvoiceNumber())
                            .internalInvoiceId(o.getInternalInvoiceId())
                            .isCreditCardPayable(o.getIsCreditCardPayable())
                            .timeInvoice(o.getTimeInvoice())
                            .tax(o.getTax())
                            .invoiceAmount(o.getInvoiceAmount())
                            .invoiceAmountDue(o.getInvoiceAmountDue())
                            .invoiceAmountCredited(o.getInvoiceAmountCredited())
                            .invoiceAmountAdjusted(o.getInvoiceAmountAdjusted())
                            .invoiceAmountApplied(o.getInvoiceAmountApplied())
                            .currency(o.getCurrency())
                            .invoiceType(o.getInvoiceType())
                            .timeInvoiceDue(o.getTimeInvoiceDue())
                            .invoiceRefNumber(o.getInvoiceRefNumber())
                            .invoicePoNumber(o.getInvoicePoNumber())
                            .invoiceStatus(o.getInvoiceStatus())
                            .preferredEmail(o.getPreferredEmail())
                            .isPdfEmailAvailable(o.getIsPdfEmailAvailable())
                            .isDisplayDownloadPdf(o.getIsDisplayDownloadPdf())
                            .isPayable(o.getIsPayable())
                            .paymentTerms(o.getPaymentTerms())
                            .lastPaymentDetail(o.getLastPaymentDetail())
                            .billToAddress(o.getBillToAddress())
                            .subscriptionIds(o.getSubscriptionIds());

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
     * Invoice identifier which is generated on the on-premise sie. Pls note this is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
    String invoiceId;

    /**
     * Invoice external reference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
    String invoiceNumber;

    /**
     * Transaction identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
    String internalInvoiceId;

    /**
     * Is credit card payment eligible
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
    Boolean isCreditCardPayable;

    /**
     * Date of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
    java.util.Date timeInvoice;

    /**
     * Tax of invoice amount
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tax")
    java.math.BigDecimal tax;

    /**
     * Total amount of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
    java.math.BigDecimal invoiceAmount;

    /**
     * Balance of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
    java.math.BigDecimal invoiceAmountDue;

    /**
     * Invoice amount credit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
    java.math.BigDecimal invoiceAmountCredited;

    /**
     * Invoice amount adjust
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
    java.math.BigDecimal invoiceAmountAdjusted;

    /**
     * Invoice amount applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
    java.math.BigDecimal invoiceAmountApplied;

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    Currency currency;
    /**
     * Type of invoice
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InvoiceType {
        Hardware("HARDWARE"),
        Subscription("SUBSCRIPTION"),
        Support("SUPPORT"),
        License("LICENSE"),
        Education("EDUCATION"),
        Consulting("CONSULTING"),
        Service("SERVICE"),
        Usage("USAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InvoiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (InvoiceType v : InvoiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InvoiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InvoiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InvoiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
    InvoiceType invoiceType;

    /**
     * Due date of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
    java.util.Date timeInvoiceDue;

    /**
     * Invoice reference number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
    String invoiceRefNumber;

    /**
     * Invoice PO number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
    String invoicePoNumber;
    /**
     * Invoice status
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InvoiceStatus {
        Open("OPEN"),
        PastDue("PAST_DUE"),
        PaymentSubmitted("PAYMENT_SUBMITTED"),
        Closed("CLOSED"),

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
     * Invoice status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
    InvoiceStatus invoiceStatus;

    /**
     * Preferred Email on the invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredEmail")
    String preferredEmail;

    /**
     * Is emailing pdf allowed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
    Boolean isPdfEmailAvailable;

    /**
     * Is pdf download access allowed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
    Boolean isDisplayDownloadPdf;

    /**
     * Whether invoice can be payed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
    Boolean isPayable;

    /**
     * Payment terms
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
    String paymentTerms;

    @com.fasterxml.jackson.annotation.JsonProperty("lastPaymentDetail")
    PaymentDetail lastPaymentDetail;

    @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
    BillToAddress billToAddress;

    /**
     * List of subscription identifiers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    java.util.List<String> subscriptionIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
