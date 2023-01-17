/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/ListInvoicesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListInvoicesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class ListInvoicesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The home region's public name of the logged in user. */
    private String ospHomeRegion;

    /** The home region's public name of the logged in user. */
    public String getOspHomeRegion() {
        return ospHomeRegion;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The invoice query param (not unique). */
    private String invoiceId;

    /** The invoice query param (not unique). */
    public String getInvoiceId() {
        return invoiceId;
    }
    /** A filter to only return resources that match the given type exactly. */
    private java.util.List<Type> type;

    /** A filter to only return resources that match the given type exactly. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Hardware("HARDWARE"),
        Subscription("SUBSCRIPTION"),
        Support("SUPPORT"),
        License("LICENSE"),
        Education("EDUCATION"),
        Consulting("CONSULTING"),
        Service("SERVICE"),
        Usage("USAGE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

    /** A filter to only return resources that match the given type exactly. */
    public java.util.List<Type> getType() {
        return type;
    }
    /**
     * A filter to only return resources that match the given value. Looking for partial matches in
     * the following fileds: Invoice No., Reference No. (plan number), Payment Ref, Total
     * Amount(plan number), Balance Due(plan number) and Party/Customer Name
     */
    private String searchText;

    /**
     * A filter to only return resources that match the given value. Looking for partial matches in
     * the following fileds: Invoice No., Reference No. (plan number), Payment Ref, Total
     * Amount(plan number), Balance Due(plan number) and Party/Customer Name
     */
    public String getSearchText() {
        return searchText;
    }
    /**
     * description: Start time (UTC) of the target invoice date range for which to fetch invoice
     * data (inclusive).
     */
    private java.util.Date timeInvoiceStart;

    /**
     * description: Start time (UTC) of the target invoice date range for which to fetch invoice
     * data (inclusive).
     */
    public java.util.Date getTimeInvoiceStart() {
        return timeInvoiceStart;
    }
    /**
     * description: End time (UTC) of the target invoice date range for which to fetch invoice data
     * (exclusive).
     */
    private java.util.Date timeInvoiceEnd;

    /**
     * description: End time (UTC) of the target invoice date range for which to fetch invoice data
     * (exclusive).
     */
    public java.util.Date getTimeInvoiceEnd() {
        return timeInvoiceEnd;
    }
    /**
     * description: Start time (UTC) of the target payment date range for which to fetch invoice
     * data (inclusive).
     */
    private java.util.Date timePaymentStart;

    /**
     * description: Start time (UTC) of the target payment date range for which to fetch invoice
     * data (inclusive).
     */
    public java.util.Date getTimePaymentStart() {
        return timePaymentStart;
    }
    /**
     * description: End time (UTC) of the target payment date range for which to fetch invoice data
     * (exclusive).
     */
    private java.util.Date timePaymentEnd;

    /**
     * description: End time (UTC) of the target payment date range for which to fetch invoice data
     * (exclusive).
     */
    public java.util.Date getTimePaymentEnd() {
        return timePaymentEnd;
    }
    /** A filter to only return resources that match one of the status elements. */
    private java.util.List<Status> status;

    /** A filter to only return resources that match one of the status elements. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Open("OPEN"),
        PastDue("PAST_DUE"),
        PaymentSubmitted("PAYMENT_SUBMITTED"),
        Closed("CLOSED"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };

    /** A filter to only return resources that match one of the status elements. */
    public java.util.List<Status> getStatus() {
        return status;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call.
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call.
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The field to sort by. Only one field can be selected for sorting. */
    private SortBy sortBy;

    /** The field to sort by. Only one field can be selected for sorting. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        InvoiceNo("INVOICE_NO"),
        RefNo("REF_NO"),
        Status("STATUS"),
        Type("TYPE"),
        InvoiceDate("INVOICE_DATE"),
        DueDate("DUE_DATE"),
        PaymRef("PAYM_REF"),
        TotalAmount("TOTAL_AMOUNT"),
        BalanceDue("BALANCE_DUE"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /** The field to sort by. Only one field can be selected for sorting. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use (ascending or descending). */
    private SortOrder sortOrder;

    /** The sort order to use (ascending or descending). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use (ascending or descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInvoicesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The home region's public name of the logged in user. */
        private String ospHomeRegion = null;

        /**
         * The home region's public name of the logged in user.
         *
         * @param ospHomeRegion the value to set
         * @return this builder instance
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            this.ospHomeRegion = ospHomeRegion;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The invoice query param (not unique). */
        private String invoiceId = null;

        /**
         * The invoice query param (not unique).
         *
         * @param invoiceId the value to set
         * @return this builder instance
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /** A filter to only return resources that match the given type exactly. */
        private java.util.List<Type> type = null;

        /**
         * A filter to only return resources that match the given type exactly.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(java.util.List<Type> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. A filter to only return resources that match the given type exactly.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder type(Type singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to only return resources that match the given value. Looking for partial matches
         * in the following fileds: Invoice No., Reference No. (plan number), Payment Ref, Total
         * Amount(plan number), Balance Due(plan number) and Party/Customer Name
         */
        private String searchText = null;

        /**
         * A filter to only return resources that match the given value. Looking for partial matches
         * in the following fileds: Invoice No., Reference No. (plan number), Payment Ref, Total
         * Amount(plan number), Balance Due(plan number) and Party/Customer Name
         *
         * @param searchText the value to set
         * @return this builder instance
         */
        public Builder searchText(String searchText) {
            this.searchText = searchText;
            return this;
        }

        /**
         * description: Start time (UTC) of the target invoice date range for which to fetch invoice
         * data (inclusive).
         */
        private java.util.Date timeInvoiceStart = null;

        /**
         * description: Start time (UTC) of the target invoice date range for which to fetch invoice
         * data (inclusive).
         *
         * @param timeInvoiceStart the value to set
         * @return this builder instance
         */
        public Builder timeInvoiceStart(java.util.Date timeInvoiceStart) {
            this.timeInvoiceStart = timeInvoiceStart;
            return this;
        }

        /**
         * description: End time (UTC) of the target invoice date range for which to fetch invoice
         * data (exclusive).
         */
        private java.util.Date timeInvoiceEnd = null;

        /**
         * description: End time (UTC) of the target invoice date range for which to fetch invoice
         * data (exclusive).
         *
         * @param timeInvoiceEnd the value to set
         * @return this builder instance
         */
        public Builder timeInvoiceEnd(java.util.Date timeInvoiceEnd) {
            this.timeInvoiceEnd = timeInvoiceEnd;
            return this;
        }

        /**
         * description: Start time (UTC) of the target payment date range for which to fetch invoice
         * data (inclusive).
         */
        private java.util.Date timePaymentStart = null;

        /**
         * description: Start time (UTC) of the target payment date range for which to fetch invoice
         * data (inclusive).
         *
         * @param timePaymentStart the value to set
         * @return this builder instance
         */
        public Builder timePaymentStart(java.util.Date timePaymentStart) {
            this.timePaymentStart = timePaymentStart;
            return this;
        }

        /**
         * description: End time (UTC) of the target payment date range for which to fetch invoice
         * data (exclusive).
         */
        private java.util.Date timePaymentEnd = null;

        /**
         * description: End time (UTC) of the target payment date range for which to fetch invoice
         * data (exclusive).
         *
         * @param timePaymentEnd the value to set
         * @return this builder instance
         */
        public Builder timePaymentEnd(java.util.Date timePaymentEnd) {
            this.timePaymentEnd = timePaymentEnd;
            return this;
        }

        /** A filter to only return resources that match one of the status elements. */
        private java.util.List<Status> status = null;

        /**
         * A filter to only return resources that match one of the status elements.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to only return resources that match one of the status elements.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(Status singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call.
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The field to sort by. Only one field can be selected for sorting. */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one field can be selected for sorting.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use (ascending or descending). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use (ascending or descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListInvoicesRequest o) {
            ospHomeRegion(o.getOspHomeRegion());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            invoiceId(o.getInvoiceId());
            type(o.getType());
            searchText(o.getSearchText());
            timeInvoiceStart(o.getTimeInvoiceStart());
            timeInvoiceEnd(o.getTimeInvoiceEnd());
            timePaymentStart(o.getTimePaymentStart());
            timePaymentEnd(o.getTimePaymentEnd());
            status(o.getStatus());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListInvoicesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListInvoicesRequest
         */
        public ListInvoicesRequest build() {
            ListInvoicesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInvoicesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInvoicesRequest
         */
        public ListInvoicesRequest buildWithoutInvocationCallback() {
            ListInvoicesRequest request = new ListInvoicesRequest();
            request.ospHomeRegion = ospHomeRegion;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.invoiceId = invoiceId;
            request.type = type;
            request.searchText = searchText;
            request.timeInvoiceStart = timeInvoiceStart;
            request.timeInvoiceEnd = timeInvoiceEnd;
            request.timePaymentStart = timePaymentStart;
            request.timePaymentEnd = timePaymentEnd;
            request.status = status;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListInvoicesRequest(ospHomeRegion, compartmentId, opcRequestId, invoiceId, type,
            // searchText, timeInvoiceStart, timeInvoiceEnd, timePaymentStart, timePaymentEnd,
            // status, page, limit, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ospHomeRegion(ospHomeRegion)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .invoiceId(invoiceId)
                .type(type)
                .searchText(searchText)
                .timeInvoiceStart(timeInvoiceStart)
                .timeInvoiceEnd(timeInvoiceEnd)
                .timePaymentStart(timePaymentStart)
                .timePaymentEnd(timePaymentEnd)
                .status(status)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",ospHomeRegion=").append(String.valueOf(this.ospHomeRegion));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",invoiceId=").append(String.valueOf(this.invoiceId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",searchText=").append(String.valueOf(this.searchText));
        sb.append(",timeInvoiceStart=").append(String.valueOf(this.timeInvoiceStart));
        sb.append(",timeInvoiceEnd=").append(String.valueOf(this.timeInvoiceEnd));
        sb.append(",timePaymentStart=").append(String.valueOf(this.timePaymentStart));
        sb.append(",timePaymentEnd=").append(String.valueOf(this.timePaymentEnd));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListInvoicesRequest)) {
            return false;
        }

        ListInvoicesRequest other = (ListInvoicesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ospHomeRegion, other.ospHomeRegion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.invoiceId, other.invoiceId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.searchText, other.searchText)
                && java.util.Objects.equals(this.timeInvoiceStart, other.timeInvoiceStart)
                && java.util.Objects.equals(this.timeInvoiceEnd, other.timeInvoiceEnd)
                && java.util.Objects.equals(this.timePaymentStart, other.timePaymentStart)
                && java.util.Objects.equals(this.timePaymentEnd, other.timePaymentEnd)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ospHomeRegion == null ? 43 : this.ospHomeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.invoiceId == null ? 43 : this.invoiceId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.searchText == null ? 43 : this.searchText.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoiceStart == null ? 43 : this.timeInvoiceStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInvoiceEnd == null ? 43 : this.timeInvoiceEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timePaymentStart == null ? 43 : this.timePaymentStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timePaymentEnd == null ? 43 : this.timePaymentEnd.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
