/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.requests;

import com.oracle.bmc.onesubscription.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/onesubscription/ListSubscriptionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSubscriptionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ListSubscriptionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the root compartment. */
    private String compartmentId;

    /** The OCID of the root compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The Plan Number */
    private String planNumber;

    /** The Plan Number */
    public String getPlanNumber() {
        return planNumber;
    }
    /** Line level Subscription Id */
    private String subscriptionId;

    /** Line level Subscription Id */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** Buyer Email Id */
    private String buyerEmail;

    /** Buyer Email Id */
    public String getBuyerEmail() {
        return buyerEmail;
    }
    /** Boolean value to decide whether commitment services will be shown */
    private Boolean isCommitInfoRequired;

    /** Boolean value to decide whether commitment services will be shown */
    public Boolean getIsCommitInfoRequired() {
        return isCommitInfoRequired;
    }
    /**
     * The maximum number of items to return in a paginated "List" call. Default: ({@code 50})
     *
     * <p>Example: '500'
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call. Default: ({@code 50})
     *
     * <p>Example: '500'
     */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the 'opc-next-page' response header from the previous "List" call. */
    private String page;

    /** The value of the 'opc-next-page' response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ('ASC') or descending ('DESC'). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ('ASC') or descending ('DESC'). */
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

    /** The sort order to use, either ascending ('ASC') or descending ('DESC'). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field to sort by. You can provide one sort order ('sortOrder'). */
    private SortBy sortBy;

    /** The field to sort by. You can provide one sort order ('sortOrder'). */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Ordernumber("ORDERNUMBER"),
        Timeinvoicing("TIMEINVOICING"),
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

    /** The field to sort by. You can provide one sort order ('sortOrder'). */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSubscriptionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the root compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The Plan Number */
        private String planNumber = null;

        /**
         * The Plan Number
         *
         * @param planNumber the value to set
         * @return this builder instance
         */
        public Builder planNumber(String planNumber) {
            this.planNumber = planNumber;
            return this;
        }

        /** Line level Subscription Id */
        private String subscriptionId = null;

        /**
         * Line level Subscription Id
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** Buyer Email Id */
        private String buyerEmail = null;

        /**
         * Buyer Email Id
         *
         * @param buyerEmail the value to set
         * @return this builder instance
         */
        public Builder buyerEmail(String buyerEmail) {
            this.buyerEmail = buyerEmail;
            return this;
        }

        /** Boolean value to decide whether commitment services will be shown */
        private Boolean isCommitInfoRequired = null;

        /**
         * Boolean value to decide whether commitment services will be shown
         *
         * @param isCommitInfoRequired the value to set
         * @return this builder instance
         */
        public Builder isCommitInfoRequired(Boolean isCommitInfoRequired) {
            this.isCommitInfoRequired = isCommitInfoRequired;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call. Default: ({@code 50})
         *
         * <p>Example: '500'
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call. Default: ({@code 50})
         *
         * <p>Example: '500'
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the 'opc-next-page' response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the 'opc-next-page' response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ('ASC') or descending ('DESC'). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ('ASC') or descending ('DESC').
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field to sort by. You can provide one sort order ('sortOrder'). */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ('sortOrder').
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListSubscriptionsRequest o) {
            compartmentId(o.getCompartmentId());
            planNumber(o.getPlanNumber());
            subscriptionId(o.getSubscriptionId());
            buyerEmail(o.getBuyerEmail());
            isCommitInfoRequired(o.getIsCommitInfoRequired());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSubscriptionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSubscriptionsRequest
         */
        public ListSubscriptionsRequest build() {
            ListSubscriptionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSubscriptionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSubscriptionsRequest
         */
        public ListSubscriptionsRequest buildWithoutInvocationCallback() {
            ListSubscriptionsRequest request = new ListSubscriptionsRequest();
            request.compartmentId = compartmentId;
            request.planNumber = planNumber;
            request.subscriptionId = subscriptionId;
            request.buyerEmail = buyerEmail;
            request.isCommitInfoRequired = isCommitInfoRequired;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSubscriptionsRequest(compartmentId, planNumber, subscriptionId, buyerEmail,
            // isCommitInfoRequired, limit, page, sortOrder, sortBy, opcRequestId);
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
                .planNumber(planNumber)
                .subscriptionId(subscriptionId)
                .buyerEmail(buyerEmail)
                .isCommitInfoRequired(isCommitInfoRequired)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",planNumber=").append(String.valueOf(this.planNumber));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",buyerEmail=").append(String.valueOf(this.buyerEmail));
        sb.append(",isCommitInfoRequired=").append(String.valueOf(this.isCommitInfoRequired));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSubscriptionsRequest)) {
            return false;
        }

        ListSubscriptionsRequest other = (ListSubscriptionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.planNumber, other.planNumber)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.buyerEmail, other.buyerEmail)
                && java.util.Objects.equals(this.isCommitInfoRequired, other.isCommitInfoRequired)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.planNumber == null ? 43 : this.planNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.buyerEmail == null ? 43 : this.buyerEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.isCommitInfoRequired == null
                                ? 43
                                : this.isCommitInfoRequired.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
