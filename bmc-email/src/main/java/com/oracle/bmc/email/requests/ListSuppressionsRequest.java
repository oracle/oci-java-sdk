/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/ListSuppressionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSuppressionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class ListSuppressionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID for the compartment. */
    private String compartmentId;

    /** The OCID for the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The email address of the suppression. */
    private String emailAddress;

    /** The email address of the suppression. */
    public String getEmailAddress() {
        return emailAddress;
    }
    /**
     * Search for suppressions that were created within a specific date range, using this parameter
     * to specify the earliest creation date for the returned list (inclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
     * suppressions created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current
     * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for suppressions that were created within a specific date range, using this parameter
     * to specify the earliest creation date for the returned list (inclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
     * suppressions created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current
     * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * Search for suppressions that were created within a specific date range, using this parameter
     * to specify the latest creation date for the returned list (exclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter will
     * retrieve all suppressions created before the specified end date, in "YYYY-MM-ddThh:mmZ"
     * format with a Z offset, as defined by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for suppressions that were created within a specific date range, using this parameter
     * to specify the latest creation date for the returned list (exclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter will
     * retrieve all suppressions created before the specified end date, in "YYYY-MM-ddThh:mmZ"
     * format with a Z offset, as defined by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For important
     * details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For important
     * details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The field to sort by. The {@code TIMECREATED} value returns the list in in descending order
     * by default. The {@code EMAILADDRESS} value returns the list in ascending order by default.
     * Use the {@code SortOrderQueryParam} to change the direction of the returned list of items.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. The {@code TIMECREATED} value returns the list in in descending order
     * by default. The {@code EMAILADDRESS} value returns the list in ascending order by default.
     * Use the {@code SortOrderQueryParam} to change the direction of the returned list of items.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Emailaddress("EMAILADDRESS"),
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
     * The field to sort by. The {@code TIMECREATED} value returns the list in in descending order
     * by default. The {@code EMAILADDRESS} value returns the list in ascending order by default.
     * Use the {@code SortOrderQueryParam} to change the direction of the returned list of items.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending or descending order. */
    private com.oracle.bmc.email.model.SortOrder sortOrder;

    /** The sort order to use, either ascending or descending order. */
    public com.oracle.bmc.email.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSuppressionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID for the compartment. */
        private String compartmentId = null;

        /**
         * The OCID for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The email address of the suppression. */
        private String emailAddress = null;

        /**
         * The email address of the suppression.
         *
         * @param emailAddress the value to set
         * @return this builder instance
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Search for suppressions that were created within a specific date range, using this
         * parameter to specify the earliest creation date for the returned list (inclusive).
         * Specifying this parameter without the corresponding {@code timeCreatedLessThan} parameter
         * will retrieve suppressions created from the given {@code timeCreatedGreaterThanOrEqualTo}
         * to the current time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC
         * 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * Search for suppressions that were created within a specific date range, using this
         * parameter to specify the earliest creation date for the returned list (inclusive).
         * Specifying this parameter without the corresponding {@code timeCreatedLessThan} parameter
         * will retrieve suppressions created from the given {@code timeCreatedGreaterThanOrEqualTo}
         * to the current time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC
         * 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for suppressions that were created within a specific date range, using this
         * parameter to specify the latest creation date for the returned list (exclusive).
         * Specifying this parameter without the corresponding {@code
         * timeCreatedGreaterThanOrEqualTo} parameter will retrieve all suppressions created before
         * the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC
         * 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * Search for suppressions that were created within a specific date range, using this
         * parameter to specify the latest creation date for the returned list (exclusive).
         * Specifying this parameter without the corresponding {@code
         * timeCreatedGreaterThanOrEqualTo} parameter will retrieve all suppressions created before
         * the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by RFC
         * 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For
         * important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For
         * important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The field to sort by. The {@code TIMECREATED} value returns the list in in descending
         * order by default. The {@code EMAILADDRESS} value returns the list in ascending order by
         * default. Use the {@code SortOrderQueryParam} to change the direction of the returned list
         * of items.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. The {@code TIMECREATED} value returns the list in in descending
         * order by default. The {@code EMAILADDRESS} value returns the list in ascending order by
         * default. Use the {@code SortOrderQueryParam} to change the direction of the returned list
         * of items.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending or descending order. */
        private com.oracle.bmc.email.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending or descending order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.email.model.SortOrder sortOrder) {
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
        public Builder copy(ListSuppressionsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            emailAddress(o.getEmailAddress());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSuppressionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSuppressionsRequest
         */
        public ListSuppressionsRequest build() {
            ListSuppressionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSuppressionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSuppressionsRequest
         */
        public ListSuppressionsRequest buildWithoutInvocationCallback() {
            ListSuppressionsRequest request = new ListSuppressionsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.emailAddress = emailAddress;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListSuppressionsRequest(compartmentId, opcRequestId, emailAddress,
            // timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan, page, limit, sortBy,
            // sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .emailAddress(emailAddress)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
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
        if (!(o instanceof ListSuppressionsRequest)) {
            return false;
        }

        ListSuppressionsRequest other = (ListSuppressionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
