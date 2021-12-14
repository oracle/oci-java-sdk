/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/ListInvoicesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListInvoicesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListInvoicesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The home region's public name of the logged in user.
     *
     */
    private String ospHomeRegion;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    private String compartmentId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The invoice query param (not unique).
     */
    private String invoiceId;

    /**
     * A filter to only return resources that match the given type exactly.
     *
     */
    private java.util.List<Type> type;

    /**
     * A filter to only return resources that match the given type exactly.
     *
     **/
    public enum Type {
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
    /**
     * A filter to only return resources that match the given value.
     * Looking for partial matches in the following fileds:
     * Invoice No., Reference No. (plan number), Payment Ref, Total Amount(plan number), Balance Due(plan number)
     * and Party/Customer Name
     *
     */
    private String searchText;

    /**
     * description: Start time (UTC) of the target invoice date range for which to fetch invoice data (inclusive).
     *
     */
    private java.util.Date timeInvoiceStart;

    /**
     * description: End time (UTC) of the target invoice date range for which to fetch invoice data (exclusive).
     *
     */
    private java.util.Date timeInvoiceEnd;

    /**
     * description: Start time (UTC) of the target payment date range for which to fetch invoice data (inclusive).
     *
     */
    private java.util.Date timePaymentStart;

    /**
     * description: End time (UTC) of the target payment date range for which to fetch invoice data (exclusive).
     *
     */
    private java.util.Date timePaymentEnd;

    /**
     * A filter to only return resources that match one of the status elements.
     *
     */
    private java.util.List<Status> status;

    /**
     * A filter to only return resources that match one of the status elements.
     *
     **/
    public enum Status {
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
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The field to sort by. Only one field can be selected for sorting.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one field can be selected for sorting.
     *
     **/
    public enum SortBy {
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
    /**
     * The sort order to use (ascending or descending).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use (ascending or descending).
     *
     **/
    public enum SortOrder {
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInvoicesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Type> type = null;

        /**
         * A filter to only return resources that match the given type exactly.
         *
         * @return this builder instance
         */
        public Builder type(java.util.List<Type> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. A filter to only return resources that match the given type exactly.
         *
         * @return this builder instance
         */
        public Builder type(Type singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Status> status = null;

        /**
         * A filter to only return resources that match one of the status elements.
         *
         * @return this builder instance
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to only return resources that match one of the status elements.
         *
         * @return this builder instance
         */
        public Builder status(Status singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListInvoicesRequest
         */
        public ListInvoicesRequest build() {
            ListInvoicesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
