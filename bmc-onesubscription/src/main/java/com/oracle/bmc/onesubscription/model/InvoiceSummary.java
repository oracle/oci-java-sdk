/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Invoice details
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InvoiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoiceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "spmInvoiceNumber",
        "arInvoices",
        "billToCustomer",
        "billToContact",
        "billToAddress",
        "paymentMethod",
        "paymentTerm",
        "receiptMethod",
        "currency",
        "organization",
        "type",
        "status",
        "subscriptionNumber",
        "timeInvoiceDate",
        "timeCreated",
        "createdBy",
        "timeUpdated",
        "updatedBy",
        "invoiceLines"
    })
    public InvoiceSummary(
            String spmInvoiceNumber,
            String arInvoices,
            InvoicingBusinessPartner billToCustomer,
            InvoicingUser billToContact,
            InvoicingAddress billToAddress,
            String paymentMethod,
            InvoicingPaymentTerm paymentTerm,
            String receiptMethod,
            InvoicingCurrency currency,
            InvoicingOrganization organization,
            String type,
            String status,
            String subscriptionNumber,
            java.util.Date timeInvoiceDate,
            java.util.Date timeCreated,
            String createdBy,
            java.util.Date timeUpdated,
            String updatedBy,
            java.util.List<InvoiceLineSummary> invoiceLines) {
        super();
        this.spmInvoiceNumber = spmInvoiceNumber;
        this.arInvoices = arInvoices;
        this.billToCustomer = billToCustomer;
        this.billToContact = billToContact;
        this.billToAddress = billToAddress;
        this.paymentMethod = paymentMethod;
        this.paymentTerm = paymentTerm;
        this.receiptMethod = receiptMethod;
        this.currency = currency;
        this.organization = organization;
        this.type = type;
        this.status = status;
        this.subscriptionNumber = subscriptionNumber;
        this.timeInvoiceDate = timeInvoiceDate;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.invoiceLines = invoiceLines;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SPM Document Number is an functional identifier for invoice in SPM
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spmInvoiceNumber")
        private String spmInvoiceNumber;

        /**
         * SPM Document Number is an functional identifier for invoice in SPM
         *
         * @param spmInvoiceNumber the value to set
         * @return this builder
         **/
        public Builder spmInvoiceNumber(String spmInvoiceNumber) {
            this.spmInvoiceNumber = spmInvoiceNumber;
            this.__explicitlySet__.add("spmInvoiceNumber");
            return this;
        }
        /**
         * AR Invoice Numbers comma separated under one invoice
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arInvoices")
        private String arInvoices;

        /**
         * AR Invoice Numbers comma separated under one invoice
         *
         * @param arInvoices the value to set
         * @return this builder
         **/
        public Builder arInvoices(String arInvoices) {
            this.arInvoices = arInvoices;
            this.__explicitlySet__.add("arInvoices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToCustomer")
        private InvoicingBusinessPartner billToCustomer;

        public Builder billToCustomer(InvoicingBusinessPartner billToCustomer) {
            this.billToCustomer = billToCustomer;
            this.__explicitlySet__.add("billToCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToContact")
        private InvoicingUser billToContact;

        public Builder billToContact(InvoicingUser billToContact) {
            this.billToContact = billToContact;
            this.__explicitlySet__.add("billToContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
        private InvoicingAddress billToAddress;

        public Builder billToAddress(InvoicingAddress billToAddress) {
            this.billToAddress = billToAddress;
            this.__explicitlySet__.add("billToAddress");
            return this;
        }
        /**
         * Payment Method
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paymentMethod")
        private String paymentMethod;

        /**
         * Payment Method
         *
         * @param paymentMethod the value to set
         * @return this builder
         **/
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            this.__explicitlySet__.add("paymentMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentTerm")
        private InvoicingPaymentTerm paymentTerm;

        public Builder paymentTerm(InvoicingPaymentTerm paymentTerm) {
            this.paymentTerm = paymentTerm;
            this.__explicitlySet__.add("paymentTerm");
            return this;
        }
        /**
         * Receipt Method of Payment Mode
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("receiptMethod")
        private String receiptMethod;

        /**
         * Receipt Method of Payment Mode
         *
         * @param receiptMethod the value to set
         * @return this builder
         **/
        public Builder receiptMethod(String receiptMethod) {
            this.receiptMethod = receiptMethod;
            this.__explicitlySet__.add("receiptMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private InvoicingCurrency currency;

        public Builder currency(InvoicingCurrency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private InvoicingOrganization organization;

        public Builder organization(InvoicingOrganization organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }
        /**
         * Document Type in SPM like SPM Invoice,SPM Credit Memo etc.,
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Document Type in SPM like SPM Invoice,SPM Credit Memo etc.,
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Document Status in SPM which depicts current state of invoice
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Document Status in SPM which depicts current state of invoice
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Invoice associated subscription plan number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionNumber")
        private String subscriptionNumber;

        /**
         * Invoice associated subscription plan number.
         *
         * @param subscriptionNumber the value to set
         * @return this builder
         **/
        public Builder subscriptionNumber(String subscriptionNumber) {
            this.subscriptionNumber = subscriptionNumber;
            this.__explicitlySet__.add("subscriptionNumber");
            return this;
        }
        /**
         * Invoice Date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDate")
        private java.util.Date timeInvoiceDate;

        /**
         * Invoice Date
         *
         * @param timeInvoiceDate the value to set
         * @return this builder
         **/
        public Builder timeInvoiceDate(java.util.Date timeInvoiceDate) {
            this.timeInvoiceDate = timeInvoiceDate;
            this.__explicitlySet__.add("timeInvoiceDate");
            return this;
        }
        /**
         * SPM Invocie creation date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * SPM Invocie creation date
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * User that executed SPM Invoice process
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * User that executed SPM Invoice process
         *
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * SPM Invoice updated date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * SPM Invoice updated date
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * User that updated SPM Invoice
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * User that updated SPM Invoice
         *
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /**
         * Invoice Lines under particular invoice.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invoiceLines")
        private java.util.List<InvoiceLineSummary> invoiceLines;

        /**
         * Invoice Lines under particular invoice.
         *
         * @param invoiceLines the value to set
         * @return this builder
         **/
        public Builder invoiceLines(java.util.List<InvoiceLineSummary> invoiceLines) {
            this.invoiceLines = invoiceLines;
            this.__explicitlySet__.add("invoiceLines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoiceSummary build() {
            InvoiceSummary model =
                    new InvoiceSummary(
                            this.spmInvoiceNumber,
                            this.arInvoices,
                            this.billToCustomer,
                            this.billToContact,
                            this.billToAddress,
                            this.paymentMethod,
                            this.paymentTerm,
                            this.receiptMethod,
                            this.currency,
                            this.organization,
                            this.type,
                            this.status,
                            this.subscriptionNumber,
                            this.timeInvoiceDate,
                            this.timeCreated,
                            this.createdBy,
                            this.timeUpdated,
                            this.updatedBy,
                            this.invoiceLines);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoiceSummary model) {
            if (model.wasPropertyExplicitlySet("spmInvoiceNumber")) {
                this.spmInvoiceNumber(model.getSpmInvoiceNumber());
            }
            if (model.wasPropertyExplicitlySet("arInvoices")) {
                this.arInvoices(model.getArInvoices());
            }
            if (model.wasPropertyExplicitlySet("billToCustomer")) {
                this.billToCustomer(model.getBillToCustomer());
            }
            if (model.wasPropertyExplicitlySet("billToContact")) {
                this.billToContact(model.getBillToContact());
            }
            if (model.wasPropertyExplicitlySet("billToAddress")) {
                this.billToAddress(model.getBillToAddress());
            }
            if (model.wasPropertyExplicitlySet("paymentMethod")) {
                this.paymentMethod(model.getPaymentMethod());
            }
            if (model.wasPropertyExplicitlySet("paymentTerm")) {
                this.paymentTerm(model.getPaymentTerm());
            }
            if (model.wasPropertyExplicitlySet("receiptMethod")) {
                this.receiptMethod(model.getReceiptMethod());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("organization")) {
                this.organization(model.getOrganization());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("subscriptionNumber")) {
                this.subscriptionNumber(model.getSubscriptionNumber());
            }
            if (model.wasPropertyExplicitlySet("timeInvoiceDate")) {
                this.timeInvoiceDate(model.getTimeInvoiceDate());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("invoiceLines")) {
                this.invoiceLines(model.getInvoiceLines());
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
     * SPM Document Number is an functional identifier for invoice in SPM
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spmInvoiceNumber")
    private final String spmInvoiceNumber;

    /**
     * SPM Document Number is an functional identifier for invoice in SPM
     *
     * @return the value
     **/
    public String getSpmInvoiceNumber() {
        return spmInvoiceNumber;
    }

    /**
     * AR Invoice Numbers comma separated under one invoice
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arInvoices")
    private final String arInvoices;

    /**
     * AR Invoice Numbers comma separated under one invoice
     *
     * @return the value
     **/
    public String getArInvoices() {
        return arInvoices;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToCustomer")
    private final InvoicingBusinessPartner billToCustomer;

    public InvoicingBusinessPartner getBillToCustomer() {
        return billToCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToContact")
    private final InvoicingUser billToContact;

    public InvoicingUser getBillToContact() {
        return billToContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
    private final InvoicingAddress billToAddress;

    public InvoicingAddress getBillToAddress() {
        return billToAddress;
    }

    /**
     * Payment Method
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentMethod")
    private final String paymentMethod;

    /**
     * Payment Method
     *
     * @return the value
     **/
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerm")
    private final InvoicingPaymentTerm paymentTerm;

    public InvoicingPaymentTerm getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Receipt Method of Payment Mode
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("receiptMethod")
    private final String receiptMethod;

    /**
     * Receipt Method of Payment Mode
     *
     * @return the value
     **/
    public String getReceiptMethod() {
        return receiptMethod;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final InvoicingCurrency currency;

    public InvoicingCurrency getCurrency() {
        return currency;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final InvoicingOrganization organization;

    public InvoicingOrganization getOrganization() {
        return organization;
    }

    /**
     * Document Type in SPM like SPM Invoice,SPM Credit Memo etc.,
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Document Type in SPM like SPM Invoice,SPM Credit Memo etc.,
     *
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Document Status in SPM which depicts current state of invoice
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Document Status in SPM which depicts current state of invoice
     *
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Invoice associated subscription plan number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionNumber")
    private final String subscriptionNumber;

    /**
     * Invoice associated subscription plan number.
     *
     * @return the value
     **/
    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Invoice Date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInvoiceDate")
    private final java.util.Date timeInvoiceDate;

    /**
     * Invoice Date
     *
     * @return the value
     **/
    public java.util.Date getTimeInvoiceDate() {
        return timeInvoiceDate;
    }

    /**
     * SPM Invocie creation date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * SPM Invocie creation date
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * User that executed SPM Invoice process
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * User that executed SPM Invoice process
     *
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * SPM Invoice updated date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * SPM Invoice updated date
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * User that updated SPM Invoice
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * User that updated SPM Invoice
     *
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Invoice Lines under particular invoice.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invoiceLines")
    private final java.util.List<InvoiceLineSummary> invoiceLines;

    /**
     * Invoice Lines under particular invoice.
     *
     * @return the value
     **/
    public java.util.List<InvoiceLineSummary> getInvoiceLines() {
        return invoiceLines;
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
        sb.append("InvoiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("spmInvoiceNumber=").append(String.valueOf(this.spmInvoiceNumber));
        sb.append(", arInvoices=").append(String.valueOf(this.arInvoices));
        sb.append(", billToCustomer=").append(String.valueOf(this.billToCustomer));
        sb.append(", billToContact=").append(String.valueOf(this.billToContact));
        sb.append(", billToAddress=").append(String.valueOf(this.billToAddress));
        sb.append(", paymentMethod=").append(String.valueOf(this.paymentMethod));
        sb.append(", paymentTerm=").append(String.valueOf(this.paymentTerm));
        sb.append(", receiptMethod=").append(String.valueOf(this.receiptMethod));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", organization=").append(String.valueOf(this.organization));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", subscriptionNumber=").append(String.valueOf(this.subscriptionNumber));
        sb.append(", timeInvoiceDate=").append(String.valueOf(this.timeInvoiceDate));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", invoiceLines=").append(String.valueOf(this.invoiceLines));
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
        return java.util.Objects.equals(this.spmInvoiceNumber, other.spmInvoiceNumber)
                && java.util.Objects.equals(this.arInvoices, other.arInvoices)
                && java.util.Objects.equals(this.billToCustomer, other.billToCustomer)
                && java.util.Objects.equals(this.billToContact, other.billToContact)
                && java.util.Objects.equals(this.billToAddress, other.billToAddress)
                && java.util.Objects.equals(this.paymentMethod, other.paymentMethod)
                && java.util.Objects.equals(this.paymentTerm, other.paymentTerm)
                && java.util.Objects.equals(this.receiptMethod, other.receiptMethod)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.organization, other.organization)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.subscriptionNumber, other.subscriptionNumber)
                && java.util.Objects.equals(this.timeInvoiceDate, other.timeInvoiceDate)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.invoiceLines, other.invoiceLines)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.spmInvoiceNumber == null ? 43 : this.spmInvoiceNumber.hashCode());
        result = (result * PRIME) + (this.arInvoices == null ? 43 : this.arInvoices.hashCode());
        result =
                (result * PRIME)
                        + (this.billToCustomer == null ? 43 : this.billToCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.billToContact == null ? 43 : this.billToContact.hashCode());
        result =
                (result * PRIME)
                        + (this.billToAddress == null ? 43 : this.billToAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.paymentMethod == null ? 43 : this.paymentMethod.hashCode());
        result = (result * PRIME) + (this.paymentTerm == null ? 43 : this.paymentTerm.hashCode());
        result =
                (result * PRIME)
                        + (this.receiptMethod == null ? 43 : this.receiptMethod.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionNumber == null
                                ? 43
                                : this.subscriptionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoiceDate == null ? 43 : this.timeInvoiceDate.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.invoiceLines == null ? 43 : this.invoiceLines.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
