/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Invoice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Invoice extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "invoiceId",
        "invoiceNumber",
        "internalInvoiceId",
        "isCreditCardPayable",
        "timeInvoice",
        "tax",
        "invoiceAmount",
        "invoiceAmountDue",
        "invoiceAmountCredited",
        "invoiceAmountAdjusted",
        "invoiceAmountApplied",
        "currency",
        "invoiceType",
        "timeInvoiceDue",
        "invoiceRefNumber",
        "invoicePoNumber",
        "invoiceStatus",
        "preferredEmail",
        "isPdfEmailAvailable",
        "isDisplayDownloadPdf",
        "isPayable",
        "paymentTerms",
        "lastPaymentDetail",
        "billToAddress",
        "subscriptionIds"
    })
    public Invoice(
            String invoiceId,
            String invoiceNumber,
            String internalInvoiceId,
            Boolean isCreditCardPayable,
            java.util.Date timeInvoice,
            java.math.BigDecimal tax,
            java.math.BigDecimal invoiceAmount,
            java.math.BigDecimal invoiceAmountDue,
            java.math.BigDecimal invoiceAmountCredited,
            java.math.BigDecimal invoiceAmountAdjusted,
            java.math.BigDecimal invoiceAmountApplied,
            Currency currency,
            InvoiceType invoiceType,
            java.util.Date timeInvoiceDue,
            String invoiceRefNumber,
            String invoicePoNumber,
            InvoiceStatus invoiceStatus,
            String preferredEmail,
            Boolean isPdfEmailAvailable,
            Boolean isDisplayDownloadPdf,
            Boolean isPayable,
            String paymentTerms,
            PaymentDetail lastPaymentDetail,
            BillToAddress billToAddress,
            java.util.List<String> subscriptionIds) {
        super();
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.internalInvoiceId = internalInvoiceId;
        this.isCreditCardPayable = isCreditCardPayable;
        this.timeInvoice = timeInvoice;
        this.tax = tax;
        this.invoiceAmount = invoiceAmount;
        this.invoiceAmountDue = invoiceAmountDue;
        this.invoiceAmountCredited = invoiceAmountCredited;
        this.invoiceAmountAdjusted = invoiceAmountAdjusted;
        this.invoiceAmountApplied = invoiceAmountApplied;
        this.currency = currency;
        this.invoiceType = invoiceType;
        this.timeInvoiceDue = timeInvoiceDue;
        this.invoiceRefNumber = invoiceRefNumber;
        this.invoicePoNumber = invoicePoNumber;
        this.invoiceStatus = invoiceStatus;
        this.preferredEmail = preferredEmail;
        this.isPdfEmailAvailable = isPdfEmailAvailable;
        this.isDisplayDownloadPdf = isDisplayDownloadPdf;
        this.isPayable = isPayable;
        this.paymentTerms = paymentTerms;
        this.lastPaymentDetail = lastPaymentDetail;
        this.billToAddress = billToAddress;
        this.subscriptionIds = subscriptionIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Invoice identifier which is generated on the on-premise sie. Pls note this is not an OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
        private String invoiceId;

        /**
         * Invoice identifier which is generated on the on-premise sie. Pls note this is not an OCID
         * @param invoiceId the value to set
         * @return this builder
         **/
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            this.__explicitlySet__.add("invoiceId");
            return this;
        }
        /**
         * Invoice external reference
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
        private String invoiceNumber;

        /**
         * Invoice external reference
         * @param invoiceNumber the value to set
         * @return this builder
         **/
        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            this.__explicitlySet__.add("invoiceNumber");
            return this;
        }
        /**
         * Transaction identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
        private String internalInvoiceId;

        /**
         * Transaction identifier
         * @param internalInvoiceId the value to set
         * @return this builder
         **/
        public Builder internalInvoiceId(String internalInvoiceId) {
            this.internalInvoiceId = internalInvoiceId;
            this.__explicitlySet__.add("internalInvoiceId");
            return this;
        }
        /**
         * Is credit card payment eligible
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
        private Boolean isCreditCardPayable;

        /**
         * Is credit card payment eligible
         * @param isCreditCardPayable the value to set
         * @return this builder
         **/
        public Builder isCreditCardPayable(Boolean isCreditCardPayable) {
            this.isCreditCardPayable = isCreditCardPayable;
            this.__explicitlySet__.add("isCreditCardPayable");
            return this;
        }
        /**
         * Date of invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
        private java.util.Date timeInvoice;

        /**
         * Date of invoice
         * @param timeInvoice the value to set
         * @return this builder
         **/
        public Builder timeInvoice(java.util.Date timeInvoice) {
            this.timeInvoice = timeInvoice;
            this.__explicitlySet__.add("timeInvoice");
            return this;
        }
        /**
         * Tax of invoice amount
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tax")
        private java.math.BigDecimal tax;

        /**
         * Tax of invoice amount
         * @param tax the value to set
         * @return this builder
         **/
        public Builder tax(java.math.BigDecimal tax) {
            this.tax = tax;
            this.__explicitlySet__.add("tax");
            return this;
        }
        /**
         * Total amount of invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
        private java.math.BigDecimal invoiceAmount;

        /**
         * Total amount of invoice
         * @param invoiceAmount the value to set
         * @return this builder
         **/
        public Builder invoiceAmount(java.math.BigDecimal invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            this.__explicitlySet__.add("invoiceAmount");
            return this;
        }
        /**
         * Balance of invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
        private java.math.BigDecimal invoiceAmountDue;

        /**
         * Balance of invoice
         * @param invoiceAmountDue the value to set
         * @return this builder
         **/
        public Builder invoiceAmountDue(java.math.BigDecimal invoiceAmountDue) {
            this.invoiceAmountDue = invoiceAmountDue;
            this.__explicitlySet__.add("invoiceAmountDue");
            return this;
        }
        /**
         * Invoice amount credit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
        private java.math.BigDecimal invoiceAmountCredited;

        /**
         * Invoice amount credit
         * @param invoiceAmountCredited the value to set
         * @return this builder
         **/
        public Builder invoiceAmountCredited(java.math.BigDecimal invoiceAmountCredited) {
            this.invoiceAmountCredited = invoiceAmountCredited;
            this.__explicitlySet__.add("invoiceAmountCredited");
            return this;
        }
        /**
         * Invoice amount adjust
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
        private java.math.BigDecimal invoiceAmountAdjusted;

        /**
         * Invoice amount adjust
         * @param invoiceAmountAdjusted the value to set
         * @return this builder
         **/
        public Builder invoiceAmountAdjusted(java.math.BigDecimal invoiceAmountAdjusted) {
            this.invoiceAmountAdjusted = invoiceAmountAdjusted;
            this.__explicitlySet__.add("invoiceAmountAdjusted");
            return this;
        }
        /**
         * Invoice amount applied
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
        private java.math.BigDecimal invoiceAmountApplied;

        /**
         * Invoice amount applied
         * @param invoiceAmountApplied the value to set
         * @return this builder
         **/
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
        /**
         * Type of invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
        private InvoiceType invoiceType;

        /**
         * Type of invoice
         * @param invoiceType the value to set
         * @return this builder
         **/
        public Builder invoiceType(InvoiceType invoiceType) {
            this.invoiceType = invoiceType;
            this.__explicitlySet__.add("invoiceType");
            return this;
        }
        /**
         * Due date of invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
        private java.util.Date timeInvoiceDue;

        /**
         * Due date of invoice
         * @param timeInvoiceDue the value to set
         * @return this builder
         **/
        public Builder timeInvoiceDue(java.util.Date timeInvoiceDue) {
            this.timeInvoiceDue = timeInvoiceDue;
            this.__explicitlySet__.add("timeInvoiceDue");
            return this;
        }
        /**
         * Invoice reference number
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
        private String invoiceRefNumber;

        /**
         * Invoice reference number
         * @param invoiceRefNumber the value to set
         * @return this builder
         **/
        public Builder invoiceRefNumber(String invoiceRefNumber) {
            this.invoiceRefNumber = invoiceRefNumber;
            this.__explicitlySet__.add("invoiceRefNumber");
            return this;
        }
        /**
         * Invoice PO number
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
        private String invoicePoNumber;

        /**
         * Invoice PO number
         * @param invoicePoNumber the value to set
         * @return this builder
         **/
        public Builder invoicePoNumber(String invoicePoNumber) {
            this.invoicePoNumber = invoicePoNumber;
            this.__explicitlySet__.add("invoicePoNumber");
            return this;
        }
        /**
         * Invoice status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
        private InvoiceStatus invoiceStatus;

        /**
         * Invoice status
         * @param invoiceStatus the value to set
         * @return this builder
         **/
        public Builder invoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            this.__explicitlySet__.add("invoiceStatus");
            return this;
        }
        /**
         * Preferred Email on the invoice
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preferredEmail")
        private String preferredEmail;

        /**
         * Preferred Email on the invoice
         * @param preferredEmail the value to set
         * @return this builder
         **/
        public Builder preferredEmail(String preferredEmail) {
            this.preferredEmail = preferredEmail;
            this.__explicitlySet__.add("preferredEmail");
            return this;
        }
        /**
         * Is emailing pdf allowed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
        private Boolean isPdfEmailAvailable;

        /**
         * Is emailing pdf allowed
         * @param isPdfEmailAvailable the value to set
         * @return this builder
         **/
        public Builder isPdfEmailAvailable(Boolean isPdfEmailAvailable) {
            this.isPdfEmailAvailable = isPdfEmailAvailable;
            this.__explicitlySet__.add("isPdfEmailAvailable");
            return this;
        }
        /**
         * Is pdf download access allowed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
        private Boolean isDisplayDownloadPdf;

        /**
         * Is pdf download access allowed
         * @param isDisplayDownloadPdf the value to set
         * @return this builder
         **/
        public Builder isDisplayDownloadPdf(Boolean isDisplayDownloadPdf) {
            this.isDisplayDownloadPdf = isDisplayDownloadPdf;
            this.__explicitlySet__.add("isDisplayDownloadPdf");
            return this;
        }
        /**
         * Whether invoice can be payed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
        private Boolean isPayable;

        /**
         * Whether invoice can be payed
         * @param isPayable the value to set
         * @return this builder
         **/
        public Builder isPayable(Boolean isPayable) {
            this.isPayable = isPayable;
            this.__explicitlySet__.add("isPayable");
            return this;
        }
        /**
         * Payment terms
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
        private String paymentTerms;

        /**
         * Payment terms
         * @param paymentTerms the value to set
         * @return this builder
         **/
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
        /**
         * List of subscription identifiers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * List of subscription identifiers
         * @param subscriptionIds the value to set
         * @return this builder
         **/
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Invoice build() {
            Invoice model =
                    new Invoice(
                            this.invoiceId,
                            this.invoiceNumber,
                            this.internalInvoiceId,
                            this.isCreditCardPayable,
                            this.timeInvoice,
                            this.tax,
                            this.invoiceAmount,
                            this.invoiceAmountDue,
                            this.invoiceAmountCredited,
                            this.invoiceAmountAdjusted,
                            this.invoiceAmountApplied,
                            this.currency,
                            this.invoiceType,
                            this.timeInvoiceDue,
                            this.invoiceRefNumber,
                            this.invoicePoNumber,
                            this.invoiceStatus,
                            this.preferredEmail,
                            this.isPdfEmailAvailable,
                            this.isDisplayDownloadPdf,
                            this.isPayable,
                            this.paymentTerms,
                            this.lastPaymentDetail,
                            this.billToAddress,
                            this.subscriptionIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Invoice model) {
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
            if (model.wasPropertyExplicitlySet("timeInvoice")) {
                this.timeInvoice(model.getTimeInvoice());
            }
            if (model.wasPropertyExplicitlySet("tax")) {
                this.tax(model.getTax());
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
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("invoiceType")) {
                this.invoiceType(model.getInvoiceType());
            }
            if (model.wasPropertyExplicitlySet("timeInvoiceDue")) {
                this.timeInvoiceDue(model.getTimeInvoiceDue());
            }
            if (model.wasPropertyExplicitlySet("invoiceRefNumber")) {
                this.invoiceRefNumber(model.getInvoiceRefNumber());
            }
            if (model.wasPropertyExplicitlySet("invoicePoNumber")) {
                this.invoicePoNumber(model.getInvoicePoNumber());
            }
            if (model.wasPropertyExplicitlySet("invoiceStatus")) {
                this.invoiceStatus(model.getInvoiceStatus());
            }
            if (model.wasPropertyExplicitlySet("preferredEmail")) {
                this.preferredEmail(model.getPreferredEmail());
            }
            if (model.wasPropertyExplicitlySet("isPdfEmailAvailable")) {
                this.isPdfEmailAvailable(model.getIsPdfEmailAvailable());
            }
            if (model.wasPropertyExplicitlySet("isDisplayDownloadPdf")) {
                this.isDisplayDownloadPdf(model.getIsDisplayDownloadPdf());
            }
            if (model.wasPropertyExplicitlySet("isPayable")) {
                this.isPayable(model.getIsPayable());
            }
            if (model.wasPropertyExplicitlySet("paymentTerms")) {
                this.paymentTerms(model.getPaymentTerms());
            }
            if (model.wasPropertyExplicitlySet("lastPaymentDetail")) {
                this.lastPaymentDetail(model.getLastPaymentDetail());
            }
            if (model.wasPropertyExplicitlySet("billToAddress")) {
                this.billToAddress(model.getBillToAddress());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
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
     * Invoice identifier which is generated on the on-premise sie. Pls note this is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceId")
    private final String invoiceId;

    /**
     * Invoice identifier which is generated on the on-premise sie. Pls note this is not an OCID
     * @return the value
     **/
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Invoice external reference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceNumber")
    private final String invoiceNumber;

    /**
     * Invoice external reference
     * @return the value
     **/
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Transaction identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalInvoiceId")
    private final String internalInvoiceId;

    /**
     * Transaction identifier
     * @return the value
     **/
    public String getInternalInvoiceId() {
        return internalInvoiceId;
    }

    /**
     * Is credit card payment eligible
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCreditCardPayable")
    private final Boolean isCreditCardPayable;

    /**
     * Is credit card payment eligible
     * @return the value
     **/
    public Boolean getIsCreditCardPayable() {
        return isCreditCardPayable;
    }

    /**
     * Date of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoice")
    private final java.util.Date timeInvoice;

    /**
     * Date of invoice
     * @return the value
     **/
    public java.util.Date getTimeInvoice() {
        return timeInvoice;
    }

    /**
     * Tax of invoice amount
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tax")
    private final java.math.BigDecimal tax;

    /**
     * Tax of invoice amount
     * @return the value
     **/
    public java.math.BigDecimal getTax() {
        return tax;
    }

    /**
     * Total amount of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmount")
    private final java.math.BigDecimal invoiceAmount;

    /**
     * Total amount of invoice
     * @return the value
     **/
    public java.math.BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Balance of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountDue")
    private final java.math.BigDecimal invoiceAmountDue;

    /**
     * Balance of invoice
     * @return the value
     **/
    public java.math.BigDecimal getInvoiceAmountDue() {
        return invoiceAmountDue;
    }

    /**
     * Invoice amount credit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountCredited")
    private final java.math.BigDecimal invoiceAmountCredited;

    /**
     * Invoice amount credit
     * @return the value
     **/
    public java.math.BigDecimal getInvoiceAmountCredited() {
        return invoiceAmountCredited;
    }

    /**
     * Invoice amount adjust
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountAdjusted")
    private final java.math.BigDecimal invoiceAmountAdjusted;

    /**
     * Invoice amount adjust
     * @return the value
     **/
    public java.math.BigDecimal getInvoiceAmountAdjusted() {
        return invoiceAmountAdjusted;
    }

    /**
     * Invoice amount applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceAmountApplied")
    private final java.math.BigDecimal invoiceAmountApplied;

    /**
     * Invoice amount applied
     * @return the value
     **/
    public java.math.BigDecimal getInvoiceAmountApplied() {
        return invoiceAmountApplied;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    /**
     * Type of invoice
     **/
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
    /**
     * Type of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceType")
    private final InvoiceType invoiceType;

    /**
     * Type of invoice
     * @return the value
     **/
    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    /**
     * Due date of invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDue")
    private final java.util.Date timeInvoiceDue;

    /**
     * Due date of invoice
     * @return the value
     **/
    public java.util.Date getTimeInvoiceDue() {
        return timeInvoiceDue;
    }

    /**
     * Invoice reference number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceRefNumber")
    private final String invoiceRefNumber;

    /**
     * Invoice reference number
     * @return the value
     **/
    public String getInvoiceRefNumber() {
        return invoiceRefNumber;
    }

    /**
     * Invoice PO number
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoicePoNumber")
    private final String invoicePoNumber;

    /**
     * Invoice PO number
     * @return the value
     **/
    public String getInvoicePoNumber() {
        return invoicePoNumber;
    }

    /**
     * Invoice status
     **/
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
     * Invoice status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceStatus")
    private final InvoiceStatus invoiceStatus;

    /**
     * Invoice status
     * @return the value
     **/
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Preferred Email on the invoice
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredEmail")
    private final String preferredEmail;

    /**
     * Preferred Email on the invoice
     * @return the value
     **/
    public String getPreferredEmail() {
        return preferredEmail;
    }

    /**
     * Is emailing pdf allowed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPdfEmailAvailable")
    private final Boolean isPdfEmailAvailable;

    /**
     * Is emailing pdf allowed
     * @return the value
     **/
    public Boolean getIsPdfEmailAvailable() {
        return isPdfEmailAvailable;
    }

    /**
     * Is pdf download access allowed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisplayDownloadPdf")
    private final Boolean isDisplayDownloadPdf;

    /**
     * Is pdf download access allowed
     * @return the value
     **/
    public Boolean getIsDisplayDownloadPdf() {
        return isDisplayDownloadPdf;
    }

    /**
     * Whether invoice can be payed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPayable")
    private final Boolean isPayable;

    /**
     * Whether invoice can be payed
     * @return the value
     **/
    public Boolean getIsPayable() {
        return isPayable;
    }

    /**
     * Payment terms
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
    private final String paymentTerms;

    /**
     * Payment terms
     * @return the value
     **/
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastPaymentDetail")
    private final PaymentDetail lastPaymentDetail;

    public PaymentDetail getLastPaymentDetail() {
        return lastPaymentDetail;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
    private final BillToAddress billToAddress;

    public BillToAddress getBillToAddress() {
        return billToAddress;
    }

    /**
     * List of subscription identifiers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * List of subscription identifiers
     * @return the value
     **/
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
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
        sb.append("Invoice(");
        sb.append("super=").append(super.toString());
        sb.append("invoiceId=").append(String.valueOf(this.invoiceId));
        sb.append(", invoiceNumber=").append(String.valueOf(this.invoiceNumber));
        sb.append(", internalInvoiceId=").append(String.valueOf(this.internalInvoiceId));
        sb.append(", isCreditCardPayable=").append(String.valueOf(this.isCreditCardPayable));
        sb.append(", timeInvoice=").append(String.valueOf(this.timeInvoice));
        sb.append(", tax=").append(String.valueOf(this.tax));
        sb.append(", invoiceAmount=").append(String.valueOf(this.invoiceAmount));
        sb.append(", invoiceAmountDue=").append(String.valueOf(this.invoiceAmountDue));
        sb.append(", invoiceAmountCredited=").append(String.valueOf(this.invoiceAmountCredited));
        sb.append(", invoiceAmountAdjusted=").append(String.valueOf(this.invoiceAmountAdjusted));
        sb.append(", invoiceAmountApplied=").append(String.valueOf(this.invoiceAmountApplied));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", invoiceType=").append(String.valueOf(this.invoiceType));
        sb.append(", timeInvoiceDue=").append(String.valueOf(this.timeInvoiceDue));
        sb.append(", invoiceRefNumber=").append(String.valueOf(this.invoiceRefNumber));
        sb.append(", invoicePoNumber=").append(String.valueOf(this.invoicePoNumber));
        sb.append(", invoiceStatus=").append(String.valueOf(this.invoiceStatus));
        sb.append(", preferredEmail=").append(String.valueOf(this.preferredEmail));
        sb.append(", isPdfEmailAvailable=").append(String.valueOf(this.isPdfEmailAvailable));
        sb.append(", isDisplayDownloadPdf=").append(String.valueOf(this.isDisplayDownloadPdf));
        sb.append(", isPayable=").append(String.valueOf(this.isPayable));
        sb.append(", paymentTerms=").append(String.valueOf(this.paymentTerms));
        sb.append(", lastPaymentDetail=").append(String.valueOf(this.lastPaymentDetail));
        sb.append(", billToAddress=").append(String.valueOf(this.billToAddress));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Invoice)) {
            return false;
        }

        Invoice other = (Invoice) o;
        return java.util.Objects.equals(this.invoiceId, other.invoiceId)
                && java.util.Objects.equals(this.invoiceNumber, other.invoiceNumber)
                && java.util.Objects.equals(this.internalInvoiceId, other.internalInvoiceId)
                && java.util.Objects.equals(this.isCreditCardPayable, other.isCreditCardPayable)
                && java.util.Objects.equals(this.timeInvoice, other.timeInvoice)
                && java.util.Objects.equals(this.tax, other.tax)
                && java.util.Objects.equals(this.invoiceAmount, other.invoiceAmount)
                && java.util.Objects.equals(this.invoiceAmountDue, other.invoiceAmountDue)
                && java.util.Objects.equals(this.invoiceAmountCredited, other.invoiceAmountCredited)
                && java.util.Objects.equals(this.invoiceAmountAdjusted, other.invoiceAmountAdjusted)
                && java.util.Objects.equals(this.invoiceAmountApplied, other.invoiceAmountApplied)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.invoiceType, other.invoiceType)
                && java.util.Objects.equals(this.timeInvoiceDue, other.timeInvoiceDue)
                && java.util.Objects.equals(this.invoiceRefNumber, other.invoiceRefNumber)
                && java.util.Objects.equals(this.invoicePoNumber, other.invoicePoNumber)
                && java.util.Objects.equals(this.invoiceStatus, other.invoiceStatus)
                && java.util.Objects.equals(this.preferredEmail, other.preferredEmail)
                && java.util.Objects.equals(this.isPdfEmailAvailable, other.isPdfEmailAvailable)
                && java.util.Objects.equals(this.isDisplayDownloadPdf, other.isDisplayDownloadPdf)
                && java.util.Objects.equals(this.isPayable, other.isPayable)
                && java.util.Objects.equals(this.paymentTerms, other.paymentTerms)
                && java.util.Objects.equals(this.lastPaymentDetail, other.lastPaymentDetail)
                && java.util.Objects.equals(this.billToAddress, other.billToAddress)
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
        result = (result * PRIME) + (this.timeInvoice == null ? 43 : this.timeInvoice.hashCode());
        result = (result * PRIME) + (this.tax == null ? 43 : this.tax.hashCode());
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
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.invoiceType == null ? 43 : this.invoiceType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoiceDue == null ? 43 : this.timeInvoiceDue.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceRefNumber == null ? 43 : this.invoiceRefNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.invoicePoNumber == null ? 43 : this.invoicePoNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceStatus == null ? 43 : this.invoiceStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredEmail == null ? 43 : this.preferredEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.isPdfEmailAvailable == null
                                ? 43
                                : this.isPdfEmailAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisplayDownloadPdf == null
                                ? 43
                                : this.isDisplayDownloadPdf.hashCode());
        result = (result * PRIME) + (this.isPayable == null ? 43 : this.isPayable.hashCode());
        result = (result * PRIME) + (this.paymentTerms == null ? 43 : this.paymentTerms.hashCode());
        result =
                (result * PRIME)
                        + (this.lastPaymentDetail == null ? 43 : this.lastPaymentDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.billToAddress == null ? 43 : this.billToAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
