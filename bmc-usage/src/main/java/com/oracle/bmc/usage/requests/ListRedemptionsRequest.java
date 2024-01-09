/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.requests;

import com.oracle.bmc.usage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/usage/ListRedemptionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRedemptionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ListRedemptionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the tenancy. */
    private String tenancyId;

    /** The OCID of the tenancy. */
    public String getTenancyId() {
        return tenancyId;
    }
    /** The subscription ID for which rewards information is requested for. */
    private String subscriptionId;

    /** The subscription ID for which rewards information is requested for. */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** The starting redeemed date filter for the redemption history. */
    private java.util.Date timeRedeemedGreaterThanOrEqualTo;

    /** The starting redeemed date filter for the redemption history. */
    public java.util.Date getTimeRedeemedGreaterThanOrEqualTo() {
        return timeRedeemedGreaterThanOrEqualTo;
    }
    /** The ending redeemed date filter for the redemption history. */
    private java.util.Date timeRedeemedLessThan;

    /** The ending redeemed date filter for the redemption history. */
    public java.util.Date getTimeRedeemedLessThan() {
        return timeRedeemedLessThan;
    }
    /**
     * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The value of the 'opc-next-page' response header from the previous call. */
    private String page;

    /** The value of the 'opc-next-page' response header from the previous call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in the paginated response. */
    private Integer limit;

    /** The maximum number of items to return in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /** The sort order to use, which can be ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, which can be ascending (ASC) or descending (DESC). */
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

    /** The sort order to use, which can be ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field to be used only for list redemptions API. Supports one sort order. */
    private SortBy sortBy;

    /** The field to be used only for list redemptions API. Supports one sort order. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timeredeemed("TIMEREDEEMED"),
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

    /** The field to be used only for list redemptions API. Supports one sort order. */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRedemptionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the tenancy. */
        private String tenancyId = null;

        /**
         * The OCID of the tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder instance
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /** The subscription ID for which rewards information is requested for. */
        private String subscriptionId = null;

        /**
         * The subscription ID for which rewards information is requested for.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** The starting redeemed date filter for the redemption history. */
        private java.util.Date timeRedeemedGreaterThanOrEqualTo = null;

        /**
         * The starting redeemed date filter for the redemption history.
         *
         * @param timeRedeemedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeRedeemedGreaterThanOrEqualTo(
                java.util.Date timeRedeemedGreaterThanOrEqualTo) {
            this.timeRedeemedGreaterThanOrEqualTo = timeRedeemedGreaterThanOrEqualTo;
            return this;
        }

        /** The ending redeemed date filter for the redemption history. */
        private java.util.Date timeRedeemedLessThan = null;

        /**
         * The ending redeemed date filter for the redemption history.
         *
         * @param timeRedeemedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeRedeemedLessThan(java.util.Date timeRedeemedLessThan) {
            this.timeRedeemedLessThan = timeRedeemedLessThan;
            return this;
        }

        /**
         * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The value of the 'opc-next-page' response header from the previous call. */
        private String page = null;

        /**
         * The value of the 'opc-next-page' response header from the previous call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of items to return in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The sort order to use, which can be ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, which can be ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field to be used only for list redemptions API. Supports one sort order. */
        private SortBy sortBy = null;

        /**
         * The field to be used only for list redemptions API. Supports one sort order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListRedemptionsRequest o) {
            tenancyId(o.getTenancyId());
            subscriptionId(o.getSubscriptionId());
            timeRedeemedGreaterThanOrEqualTo(o.getTimeRedeemedGreaterThanOrEqualTo());
            timeRedeemedLessThan(o.getTimeRedeemedLessThan());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRedemptionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRedemptionsRequest
         */
        public ListRedemptionsRequest build() {
            ListRedemptionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRedemptionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRedemptionsRequest
         */
        public ListRedemptionsRequest buildWithoutInvocationCallback() {
            ListRedemptionsRequest request = new ListRedemptionsRequest();
            request.tenancyId = tenancyId;
            request.subscriptionId = subscriptionId;
            request.timeRedeemedGreaterThanOrEqualTo = timeRedeemedGreaterThanOrEqualTo;
            request.timeRedeemedLessThan = timeRedeemedLessThan;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListRedemptionsRequest(tenancyId, subscriptionId,
            // timeRedeemedGreaterThanOrEqualTo, timeRedeemedLessThan, opcRequestId, page, limit,
            // sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .tenancyId(tenancyId)
                .subscriptionId(subscriptionId)
                .timeRedeemedGreaterThanOrEqualTo(timeRedeemedGreaterThanOrEqualTo)
                .timeRedeemedLessThan(timeRedeemedLessThan)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",timeRedeemedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeRedeemedGreaterThanOrEqualTo));
        sb.append(",timeRedeemedLessThan=").append(String.valueOf(this.timeRedeemedLessThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRedemptionsRequest)) {
            return false;
        }

        ListRedemptionsRequest other = (ListRedemptionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.timeRedeemedGreaterThanOrEqualTo,
                        other.timeRedeemedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeRedeemedLessThan, other.timeRedeemedLessThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRedeemedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeRedeemedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRedeemedLessThan == null
                                ? 43
                                : this.timeRedeemedLessThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
