/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Invoice list elements <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InvoiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InvoiceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "invoiceId",
        "invoiceNumber",
        "internalInvoiceId",
        "isCreditCardPayable",
        "invoiceStatus",
        "invoiceType",
        "isPaid",
        "isPayable",
        "invoiceAmount",
        "invoiceAmountDue",
        "invoiceAmountCredited",
        "invoiceAmountAdjusted",
        "invoiceAmountApplied",
        "timeInvoiceDue",
        "isPaymentFailed",
        "invoiceAmountInDispute",
        "invoiceRefNumber",
        "invoicePoNumber",
        "timeInvoice",
        "currency",
        "isPdfEmailAvailable",
        "isDisplayViewPdf",
        "isDisplayDownloadPdf",
        "lastPaymentDetail",
        "partyName",
        "subscriptionIds"
    })
    public InvoiceSummary(
            String invoiceId,
            String invoiceNumber,
            String internalInvoiceId,
            Boolean isCreditCardPayable,
            InvoiceStatus invoiceStatus,
            InvoiceType invoiceType,
            Boolean isPaid,
            Boolean isPayable,
            java.math.BigDecimal invoiceAmount,
            java.math.BigDecimal invoiceAmountDue,
            java.math.BigDecimal invoiceAmountCredited,
            java.math.BigDecimal invoiceAmountAdjusted,
            java.math.BigDecimal invoiceAmountApplied,
            java.util.Date timeInvoiceDue,
            Boolean isPaymentFailed,
            java.math.BigDecimal invoiceAmountInDispute,
            String invoiceRefNumber,
            String invoicePoNumber,
            java.util.Date timeInvoice,
            Currency currency,
            Boolean isPdfEmailAvailable,
            Boolean isDisplayViewPdf,
            Boolean isDisplayDownloadPdf,
            PaymentDetail lastPaymentDetail,
            String partyName,
            java.util.List<String> subscriptionIds) {
        super();
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.internalInvoiceId = internalInvoiceId;
        this.isCreditCardPayable = isCreditCardPayable;
        this.invoiceStatus = invoiceStatus;
        this.invoiceType = invoiceType;
        this.isPaid = isPaid;
        this.isPayable = isPayable;
        this.invoiceAmount = invoiceAmount;
        this.invoiceAmountDue = invoiceAmountDue;
        this.invoiceAmountCredited = invoiceAmountCredited;
        this.invoiceAmountAdjusted = invoiceAmountAdjusted;
        this.invoiceAmountApplied = invoiceAmountApplied;
        this.timeInvoiceDue = timeInvoiceDue;
        this.isPaymentFailed = isPaymentFailed;
        this.invoiceAmountInDispute = invoiceAmountInDispute;
        this.invoiceRefNumber = invoiceRefNumber;
        this.invoicePoNumber = invoicePoNumber;
        this.timeInvoice = timeInvoice;
        this.currency = currency;
        this.isPdfEmailAvailable = isPdfEmailAvailable;
        this.isDisplayViewPdf = isDisplayViewPdf;
        this.isDisplayDownloadPdf = isDisplayDownloadPdf;
        this.lastPaymentDetail = lastPaymentDetail;
        this.partyName = partyName;
        this.subscriptionIds = subscriptionIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Invoice identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
        private String invoiceId;

        /**
         * Invoice identifier
         *
         * @param invoiceId the value to set
         * @return this builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            this.__explicitlySet__.add("invoiceId");
            return this;
        }
        /** Invoice external reference */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
        private String invoiceNumber;

        /**
         * Invoice external reference
         *
         * @param invoiceNumber the value to set
         * @return this builder
         */
        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            this.__explicitlySet__.add("invoiceNumber");
            return this;
        }
        /** PC invoice identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
        private String internalInvoiceId;

        /**
         * PC invoice identifier
         *
         * @param internalInvoiceId the value to set
         * @return this builder
         */
        public Builder internalInvoiceId(String internalInvoiceId) {
            this.internalInvoiceId = internalInvoiceId;
            this.__explicitlySet__.add("internalInvoiceId");
            return this;
        }
        /** Is credit card payment eligible */
        @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
        private Boolean isCreditCardPayable;

        /**
         * Is credit card payment eligible
         *
         * @param isCreditCardPayable the value to set
         * @return this builder
         */
        public Builder isCreditCardPayable(Boolean isCreditCardPayable) {
            this.isCreditCardPayable = isCreditCardPayable;
            this.__explicitlySet__.add("isCreditCardPayable");
            return this;
        }
        /** Invoice status */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
        private InvoiceStatus invoiceStatus;

        /**
         * Invoice status
         *
         * @param invoiceStatus the value to set
         * @return this builder
         */
        public Builder invoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            this.__explicitlySet__.add("invoiceStatus");
            return this;
        }
        /** Type of invoice */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
        private InvoiceType invoiceType;

        /**
         * Type of invoice
         *
         * @param invoiceType the value to set
         * @return this builder
         */
        public Builder invoiceType(InvoiceType invoiceType) {
            this.invoiceType = invoiceType;
            this.__explicitlySet__.add("invoiceType");
            return this;
        }
        /** Is the invoice has been already payed */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaid")
        private Boolean isPaid;

        /**
         * Is the invoice has been already payed
         *
         * @param isPaid the value to set
         * @return this builder
         */
        public Builder isPaid(Boolean isPaid) {
            this.isPaid = isPaid;
            this.__explicitlySet__.add("isPaid");
            return this;
        }
        /** Whether invoice can be payed */
        @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
        private Boolean isPayable;

        /**
         * Whether invoice can be payed
         *
         * @param isPayable the value to set
         * @return this builder
         */
        public Builder isPayable(Boolean isPayable) {
            this.isPayable = isPayable;
            this.__explicitlySet__.add("isPayable");
            return this;
        }
        /** Invoice amount */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
        private java.math.BigDecimal invoiceAmount;

        /**
         * Invoice amount
         *
         * @param invoiceAmount the value to set
         * @return this builder
         */
        public Builder invoiceAmount(java.math.BigDecimal invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            this.__explicitlySet__.add("invoiceAmount");
            return this;
        }
        /** Invoice amount due */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
        private java.math.BigDecimal invoiceAmountDue;

        /**
         * Invoice amount due
         *
         * @param invoiceAmountDue the value to set
         * @return this builder
         */
        public Builder invoiceAmountDue(java.math.BigDecimal invoiceAmountDue) {
            this.invoiceAmountDue = invoiceAmountDue;
            this.__explicitlySet__.add("invoiceAmountDue");
            return this;
        }
        /** Invoice amount credit */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
        private java.math.BigDecimal invoiceAmountCredited;

        /**
         * Invoice amount credit
         *
         * @param invoiceAmountCredited the value to set
         * @return this builder
         */
        public Builder invoiceAmountCredited(java.math.BigDecimal invoiceAmountCredited) {
            this.invoiceAmountCredited = invoiceAmountCredited;
            this.__explicitlySet__.add("invoiceAmountCredited");
            return this;
        }
        /** Invoice amount adjust */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
        private java.math.BigDecimal invoiceAmountAdjusted;

        /**
         * Invoice amount adjust
         *
         * @param invoiceAmountAdjusted the value to set
         * @return this builder
         */
        public Builder invoiceAmountAdjusted(java.math.BigDecimal invoiceAmountAdjusted) {
            this.invoiceAmountAdjusted = invoiceAmountAdjusted;
            this.__explicitlySet__.add("invoiceAmountAdjusted");
            return this;
        }
        /** Invoice amount applied */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
        private java.math.BigDecimal invoiceAmountApplied;

        /**
         * Invoice amount applied
         *
         * @param invoiceAmountApplied the value to set
         * @return this builder
         */
        public Builder invoiceAmountApplied(java.math.BigDecimal invoiceAmountApplied) {
            this.invoiceAmountApplied = invoiceAmountApplied;
            this.__explicitlySet__.add("invoiceAmountApplied");
            return this;
        }
        /** Due date of invoice amount */
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
        private java.util.Date timeInvoiceDue;

        /**
         * Due date of invoice amount
         *
         * @param timeInvoiceDue the value to set
         * @return this builder
         */
        public Builder timeInvoiceDue(java.util.Date timeInvoiceDue) {
            this.timeInvoiceDue = timeInvoiceDue;
            this.__explicitlySet__.add("timeInvoiceDue");
            return this;
        }
        /** Is the last payment failed */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaymentFailed")
        private Boolean isPaymentFailed;

        /**
         * Is the last payment failed
         *
         * @param isPaymentFailed the value to set
         * @return this builder
         */
        public Builder isPaymentFailed(Boolean isPaymentFailed) {
            this.isPaymentFailed = isPaymentFailed;
            this.__explicitlySet__.add("isPaymentFailed");
            return this;
        }
        /** Invoice amount in dispute */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountInDispute")
        private java.math.BigDecimal invoiceAmountInDispute;

        /**
         * Invoice amount in dispute
         *
         * @param invoiceAmountInDispute the value to set
         * @return this builder
         */
        public Builder invoiceAmountInDispute(java.math.BigDecimal invoiceAmountInDispute) {
            this.invoiceAmountInDispute = invoiceAmountInDispute;
            this.__explicitlySet__.add("invoiceAmountInDispute");
            return this;
        }
        /** Invoice reference number */
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
        private String invoiceRefNumber;

        /**
         * Invoice reference number
         *
         * @param invoiceRefNumber the value to set
         * @return this builder
         */
        public Builder invoiceRefNumber(String invoiceRefNumber) {
            this.invoiceRefNumber = invoiceRefNumber;
            this.__explicitlySet__.add("invoiceRefNumber");
            return this;
        }
        /** Invoice PO number */
        @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
        private String invoicePoNumber;

        /**
         * Invoice PO number
         *
         * @param invoicePoNumber the value to set
         * @return this builder
         */
        public Builder invoicePoNumber(String invoicePoNumber) {
            this.invoicePoNumber = invoicePoNumber;
            this.__explicitlySet__.add("invoicePoNumber");
            return this;
        }
        /** Date of invoice */
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
        private java.util.Date timeInvoice;

        /**
         * Date of invoice
         *
         * @param timeInvoice the value to set
         * @return this builder
         */
        public Builder timeInvoice(java.util.Date timeInvoice) {
            this.timeInvoice = timeInvoice;
            this.__explicitlySet__.add("timeInvoice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private Currency currency;

        public Builder currency(Currency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /** Is emailing pdf allowed */
        @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
        private Boolean isPdfEmailAvailable;

        /**
         * Is emailing pdf allowed
         *
         * @param isPdfEmailAvailable the value to set
         * @return this builder
         */
        public Builder isPdfEmailAvailable(Boolean isPdfEmailAvailable) {
            this.isPdfEmailAvailable = isPdfEmailAvailable;
            this.__explicitlySet__.add("isPdfEmailAvailable");
            return this;
        }
        /** Is view access allowed */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisplayViewPdf")
        private Boolean isDisplayViewPdf;

        /**
         * Is view access allowed
         *
         * @param isDisplayViewPdf the value to set
         * @return this builder
         */
        public Builder isDisplayViewPdf(Boolean isDisplayViewPdf) {
            this.isDisplayViewPdf = isDisplayViewPdf;
            this.__explicitlySet__.add("isDisplayViewPdf");
            return this;
        }
        /** Is pdf download access allowed */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
        private Boolean isDisplayDownloadPdf;

        /**
         * Is pdf download access allowed
         *
         * @param isDisplayDownloadPdf the value to set
         * @return this builder
         */
        public Builder isDisplayDownloadPdf(Boolean isDisplayDownloadPdf) {
            this.isDisplayDownloadPdf = isDisplayDownloadPdf;
            this.__explicitlySet__.add("isDisplayDownloadPdf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastPaymentDetail")
        private PaymentDetail lastPaymentDetail;

        public Builder lastPaymentDetail(PaymentDetail lastPaymentDetail) {
            this.lastPaymentDetail = lastPaymentDetail;
            this.__explicitlySet__.add("lastPaymentDetail");
            return this;
        }
        /** Name of the bill to customer */
        @com.fasterxml.jackson.annotation.JsonProperty("partyName")
        private String partyName;

        /**
         * Name of the bill to customer
         *
         * @param partyName the value to set
         * @return this builder
         */
        public Builder partyName(String partyName) {
            this.partyName = partyName;
            this.__explicitlySet__.add("partyName");
            return this;
        }
        /** List of subscription identifiers */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * List of subscription identifiers
         *
         * @param subscriptionIds the value to set
         * @return this builder
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoiceSummary build() {
            InvoiceSummary model =
                    new InvoiceSummary(
                            this.invoiceId,
                            this.invoiceNumber,
                            this.internalInvoiceId,
                            this.isCreditCardPayable,
                            this.invoiceStatus,
                            this.invoiceType,
                            this.isPaid,
                            this.isPayable,
                            this.invoiceAmount,
                            this.invoiceAmountDue,
                            this.invoiceAmountCredited,
                            this.invoiceAmountAdjusted,
                            this.invoiceAmountApplied,
                            this.timeInvoiceDue,
                            this.isPaymentFailed,
                            this.invoiceAmountInDispute,
                            this.invoiceRefNumber,
                            this.invoicePoNumber,
                            this.timeInvoice,
                            this.currency,
                            this.isPdfEmailAvailable,
                            this.isDisplayViewPdf,
                            this.isDisplayDownloadPdf,
                            this.lastPaymentDetail,
                            this.partyName,
                            this.subscriptionIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoiceSummary model) {
            if (model.wasPropertyExplicitlySet("invoiceId")) {
                this.invoiceId(model.getInvoiceId());
            }
            if (model.wasPropertyExplicitlySet("invoiceNumber")) {
                this.invoiceNumber(model.getInvoiceNumber());
            }
            if (model.wasPropertyExplicitlySet("internalInvoiceId")) {
                this.internalInvoiceId(model.getInternalInvoiceId());
            }
            if (model.wasPropertyExplicitlySet("isCreditCardPayable")) {
                this.isCreditCardPayable(model.getIsCreditCardPayable());
            }
            if (model.wasPropertyExplicitlySet("invoiceStatus")) {
                this.invoiceStatus(model.getInvoiceStatus());
            }
            if (model.wasPropertyExplicitlySet("invoiceType")) {
                this.invoiceType(model.getInvoiceType());
            }
            if (model.wasPropertyExplicitlySet("isPaid")) {
                this.isPaid(model.getIsPaid());
            }
            if (model.wasPropertyExplicitlySet("isPayable")) {
                this.isPayable(model.getIsPayable());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmount")) {
                this.invoiceAmount(model.getInvoiceAmount());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmountDue")) {
                this.invoiceAmountDue(model.getInvoiceAmountDue());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmountCredited")) {
                this.invoiceAmountCredited(model.getInvoiceAmountCredited());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmountAdjusted")) {
                this.invoiceAmountAdjusted(model.getInvoiceAmountAdjusted());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmountApplied")) {
                this.invoiceAmountApplied(model.getInvoiceAmountApplied());
            }
            if (model.wasPropertyExplicitlySet("timeInvoiceDue")) {
                this.timeInvoiceDue(model.getTimeInvoiceDue());
            }
            if (model.wasPropertyExplicitlySet("isPaymentFailed")) {
                this.isPaymentFailed(model.getIsPaymentFailed());
            }
            if (model.wasPropertyExplicitlySet("invoiceAmountInDispute")) {
                this.invoiceAmountInDispute(model.getInvoiceAmountInDispute());
            }
            if (model.wasPropertyExplicitlySet("invoiceRefNumber")) {
                this.invoiceRefNumber(model.getInvoiceRefNumber());
            }
            if (model.wasPropertyExplicitlySet("invoicePoNumber")) {
                this.invoicePoNumber(model.getInvoicePoNumber());
            }
            if (model.wasPropertyExplicitlySet("timeInvoice")) {
                this.timeInvoice(model.getTimeInvoice());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("isPdfEmailAvailable")) {
                this.isPdfEmailAvailable(model.getIsPdfEmailAvailable());
            }
            if (model.wasPropertyExplicitlySet("isDisplayViewPdf")) {
                this.isDisplayViewPdf(model.getIsDisplayViewPdf());
            }
            if (model.wasPropertyExplicitlySet("isDisplayDownloadPdf")) {
                this.isDisplayDownloadPdf(model.getIsDisplayDownloadPdf());
            }
            if (model.wasPropertyExplicitlySet("lastPaymentDetail")) {
                this.lastPaymentDetail(model.getLastPaymentDetail());
            }
            if (model.wasPropertyExplicitlySet("partyName")) {
                this.partyName(model.getPartyName());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
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

    /** Invoice identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
    private final String invoiceId;

    /**
     * Invoice identifier
     *
     * @return the value
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /** Invoice external reference */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
    private final String invoiceNumber;

    /**
     * Invoice external reference
     *
     * @return the value
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /** PC invoice identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
    private final String internalInvoiceId;

    /**
     * PC invoice identifier
     *
     * @return the value
     */
    public String getInternalInvoiceId() {
        return internalInvoiceId;
    }

    /** Is credit card payment eligible */
    @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
    private final Boolean isCreditCardPayable;

    /**
     * Is credit card payment eligible
     *
     * @return the value
     */
    public Boolean getIsCreditCardPayable() {
        return isCreditCardPayable;
    }

    /** Invoice status */
    public enum InvoiceStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Open("OPEN"),
        PastDue("PAST_DUE"),
        PaymentSubmitted("PAYMENT_SUBMITTED"),
        Closed("CLOSED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Invoice status */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
    private final InvoiceStatus invoiceStatus;

    /**
     * Invoice status
     *
     * @return the value
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    /** Type of invoice */
    public enum InvoiceType implements com.oracle.bmc.http.internal.BmcEnum {
        Hardware("HARDWARE"),
        Subscription("SUBSCRIPTION"),
        Support("SUPPORT"),
        License("LICENSE"),
        Education("EDUCATION"),
        Consulting("CONSULTING"),
        Service("SERVICE"),
        Usage("USAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InvoiceType.class);

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
    /** Type of invoice */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
    private final InvoiceType invoiceType;

    /**
     * Type of invoice
     *
     * @return the value
     */
    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    /** Is the invoice has been already payed */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaid")
    private final Boolean isPaid;

    /**
     * Is the invoice has been already payed
     *
     * @return the value
     */
    public Boolean getIsPaid() {
        return isPaid;
    }

    /** Whether invoice can be payed */
    @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
    private final Boolean isPayable;

    /**
     * Whether invoice can be payed
     *
     * @return the value
     */
    public Boolean getIsPayable() {
        return isPayable;
    }

    /** Invoice amount */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
    private final java.math.BigDecimal invoiceAmount;

    /**
     * Invoice amount
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /** Invoice amount due */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
    private final java.math.BigDecimal invoiceAmountDue;

    /**
     * Invoice amount due
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmountDue() {
        return invoiceAmountDue;
    }

    /** Invoice amount credit */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
    private final java.math.BigDecimal invoiceAmountCredited;

    /**
     * Invoice amount credit
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmountCredited() {
        return invoiceAmountCredited;
    }

    /** Invoice amount adjust */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
    private final java.math.BigDecimal invoiceAmountAdjusted;

    /**
     * Invoice amount adjust
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmountAdjusted() {
        return invoiceAmountAdjusted;
    }

    /** Invoice amount applied */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
    private final java.math.BigDecimal invoiceAmountApplied;

    /**
     * Invoice amount applied
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmountApplied() {
        return invoiceAmountApplied;
    }

    /** Due date of invoice amount */
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
    private final java.util.Date timeInvoiceDue;

    /**
     * Due date of invoice amount
     *
     * @return the value
     */
    public java.util.Date getTimeInvoiceDue() {
        return timeInvoiceDue;
    }

    /** Is the last payment failed */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaymentFailed")
    private final Boolean isPaymentFailed;

    /**
     * Is the last payment failed
     *
     * @return the value
     */
    public Boolean getIsPaymentFailed() {
        return isPaymentFailed;
    }

    /** Invoice amount in dispute */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountInDispute")
    private final java.math.BigDecimal invoiceAmountInDispute;

    /**
     * Invoice amount in dispute
     *
     * @return the value
     */
    public java.math.BigDecimal getInvoiceAmountInDispute() {
        return invoiceAmountInDispute;
    }

    /** Invoice reference number */
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
    private final String invoiceRefNumber;

    /**
     * Invoice reference number
     *
     * @return the value
     */
    public String getInvoiceRefNumber() {
        return invoiceRefNumber;
    }

    /** Invoice PO number */
    @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
    private final String invoicePoNumber;

    /**
     * Invoice PO number
     *
     * @return the value
     */
    public String getInvoicePoNumber() {
        return invoicePoNumber;
    }

    /** Date of invoice */
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
    private final java.util.Date timeInvoice;

    /**
     * Date of invoice
     *
     * @return the value
     */
    public java.util.Date getTimeInvoice() {
        return timeInvoice;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    /** Is emailing pdf allowed */
    @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
    private final Boolean isPdfEmailAvailable;

    /**
     * Is emailing pdf allowed
     *
     * @return the value
     */
    public Boolean getIsPdfEmailAvailable() {
        return isPdfEmailAvailable;
    }

    /** Is view access allowed */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisplayViewPdf")
    private final Boolean isDisplayViewPdf;

    /**
     * Is view access allowed
     *
     * @return the value
     */
    public Boolean getIsDisplayViewPdf() {
        return isDisplayViewPdf;
    }

    /** Is pdf download access allowed */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
    private final Boolean isDisplayDownloadPdf;

    /**
     * Is pdf download access allowed
     *
     * @return the value
     */
    public Boolean getIsDisplayDownloadPdf() {
        return isDisplayDownloadPdf;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastPaymentDetail")
    private final PaymentDetail lastPaymentDetail;

    public PaymentDetail getLastPaymentDetail() {
        return lastPaymentDetail;
    }

    /** Name of the bill to customer */
    @com.fasterxml.jackson.annotation.JsonProperty("partyName")
    private final String partyName;

    /**
     * Name of the bill to customer
     *
     * @return the value
     */
    public String getPartyName() {
        return partyName;
    }

    /** List of subscription identifiers */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * List of subscription identifiers
     *
     * @return the value
     */
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
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
        sb.append("InvoiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("invoiceId=").append(String.valueOf(this.invoiceId));
        sb.append(", invoiceNumber=").append(String.valueOf(this.invoiceNumber));
        sb.append(", internalInvoiceId=").append(String.valueOf(this.internalInvoiceId));
        sb.append(", isCreditCardPayable=").append(String.valueOf(this.isCreditCardPayable));
        sb.append(", invoiceStatus=").append(String.valueOf(this.invoiceStatus));
        sb.append(", invoiceType=").append(String.valueOf(this.invoiceType));
        sb.append(", isPaid=").append(String.valueOf(this.isPaid));
        sb.append(", isPayable=").append(String.valueOf(this.isPayable));
        sb.append(", invoiceAmount=").append(String.valueOf(this.invoiceAmount));
        sb.append(", invoiceAmountDue=").append(String.valueOf(this.invoiceAmountDue));
        sb.append(", invoiceAmountCredited=").append(String.valueOf(this.invoiceAmountCredited));
        sb.append(", invoiceAmountAdjusted=").append(String.valueOf(this.invoiceAmountAdjusted));
        sb.append(", invoiceAmountApplied=").append(String.valueOf(this.invoiceAmountApplied));
        sb.append(", timeInvoiceDue=").append(String.valueOf(this.timeInvoiceDue));
        sb.append(", isPaymentFailed=").append(String.valueOf(this.isPaymentFailed));
        sb.append(", invoiceAmountInDispute=").append(String.valueOf(this.invoiceAmountInDispute));
        sb.append(", invoiceRefNumber=").append(String.valueOf(this.invoiceRefNumber));
        sb.append(", invoicePoNumber=").append(String.valueOf(this.invoicePoNumber));
        sb.append(", timeInvoice=").append(String.valueOf(this.timeInvoice));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", isPdfEmailAvailable=").append(String.valueOf(this.isPdfEmailAvailable));
        sb.append(", isDisplayViewPdf=").append(String.valueOf(this.isDisplayViewPdf));
        sb.append(", isDisplayDownloadPdf=").append(String.valueOf(this.isDisplayDownloadPdf));
        sb.append(", lastPaymentDetail=").append(String.valueOf(this.lastPaymentDetail));
        sb.append(", partyName=").append(String.valueOf(this.partyName));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoiceSummary)) {
            return false;
        }

        InvoiceSummary other = (InvoiceSummary) o;
        return java.util.Objects.equals(this.invoiceId, other.invoiceId)
                && java.util.Objects.equals(this.invoiceNumber, other.invoiceNumber)
                && java.util.Objects.equals(this.internalInvoiceId, other.internalInvoiceId)
                && java.util.Objects.equals(this.isCreditCardPayable, other.isCreditCardPayable)
                && java.util.Objects.equals(this.invoiceStatus, other.invoiceStatus)
                && java.util.Objects.equals(this.invoiceType, other.invoiceType)
                && java.util.Objects.equals(this.isPaid, other.isPaid)
                && java.util.Objects.equals(this.isPayable, other.isPayable)
                && java.util.Objects.equals(this.invoiceAmount, other.invoiceAmount)
                && java.util.Objects.equals(this.invoiceAmountDue, other.invoiceAmountDue)
                && java.util.Objects.equals(this.invoiceAmountCredited, other.invoiceAmountCredited)
                && java.util.Objects.equals(this.invoiceAmountAdjusted, other.invoiceAmountAdjusted)
                && java.util.Objects.equals(this.invoiceAmountApplied, other.invoiceAmountApplied)
                && java.util.Objects.equals(this.timeInvoiceDue, other.timeInvoiceDue)
                && java.util.Objects.equals(this.isPaymentFailed, other.isPaymentFailed)
                && java.util.Objects.equals(
                        this.invoiceAmountInDispute, other.invoiceAmountInDispute)
                && java.util.Objects.equals(this.invoiceRefNumber, other.invoiceRefNumber)
                && java.util.Objects.equals(this.invoicePoNumber, other.invoicePoNumber)
                && java.util.Objects.equals(this.timeInvoice, other.timeInvoice)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.isPdfEmailAvailable, other.isPdfEmailAvailable)
                && java.util.Objects.equals(this.isDisplayViewPdf, other.isDisplayViewPdf)
                && java.util.Objects.equals(this.isDisplayDownloadPdf, other.isDisplayDownloadPdf)
                && java.util.Objects.equals(this.lastPaymentDetail, other.lastPaymentDetail)
                && java.util.Objects.equals(this.partyName, other.partyName)
                && java.util.Objects.equals(this.subscriptionIds, other.subscriptionIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.invoiceId == null ? 43 : this.invoiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceNumber == null ? 43 : this.invoiceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.internalInvoiceId == null ? 43 : this.internalInvoiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCreditCardPayable == null
                                ? 43
                                : this.isCreditCardPayable.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceStatus == null ? 43 : this.invoiceStatus.hashCode());
        result = (result * PRIME) + (this.invoiceType == null ? 43 : this.invoiceType.hashCode());
        result = (result * PRIME) + (this.isPaid == null ? 43 : this.isPaid.hashCode());
        result = (result * PRIME) + (this.isPayable == null ? 43 : this.isPayable.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmount == null ? 43 : this.invoiceAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmountDue == null ? 43 : this.invoiceAmountDue.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmountCredited == null
                                ? 43
                                : this.invoiceAmountCredited.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmountAdjusted == null
                                ? 43
                                : this.invoiceAmountAdjusted.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmountApplied == null
                                ? 43
                                : this.invoiceAmountApplied.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoiceDue == null ? 43 : this.timeInvoiceDue.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaymentFailed == null ? 43 : this.isPaymentFailed.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceAmountInDispute == null
                                ? 43
                                : this.invoiceAmountInDispute.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceRefNumber == null ? 43 : this.invoiceRefNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.invoicePoNumber == null ? 43 : this.invoicePoNumber.hashCode());
        result = (result * PRIME) + (this.timeInvoice == null ? 43 : this.timeInvoice.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result =
                (result * PRIME)
                        + (this.isPdfEmailAvailable == null
                                ? 43
                                : this.isPdfEmailAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisplayViewPdf == null ? 43 : this.isDisplayViewPdf.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisplayDownloadPdf == null
                                ? 43
                                : this.isDisplayDownloadPdf.hashCode());
        result =
                (result * PRIME)
                        + (this.lastPaymentDetail == null ? 43 : this.lastPaymentDetail.hashCode());
        result = (result * PRIME) + (this.partyName == null ? 43 : this.partyName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
