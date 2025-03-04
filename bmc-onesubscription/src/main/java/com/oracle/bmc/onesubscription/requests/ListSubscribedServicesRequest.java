/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.requests;

import com.oracle.bmc.onesubscription.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/onesubscription/ListSubscribedServicesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListSubscribedServicesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ListSubscribedServicesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the root compartment. */
    private String compartmentId;

    /** The OCID of the root compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Line level Subscription Id */
    private String subscriptionId;

    /** Line level Subscription Id */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /**
     * Order Line identifier at subscribed service level . This identifier is originated in Order
     * Management module. Default is null.
     */
    private Long orderLineId;

    /**
     * Order Line identifier at subscribed service level . This identifier is originated in Order
     * Management module. Default is null.
     */
    public Long getOrderLineId() {
        return orderLineId;
    }
    /** This param is used to filter subscribed services based on its status */
    private String status;

    /** This param is used to filter subscribed services based on its status */
    public String getStatus() {
        return status;
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
                    ListSubscribedServicesRequest, java.lang.Void> {
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

        /**
         * Order Line identifier at subscribed service level . This identifier is originated in
         * Order Management module. Default is null.
         */
        private Long orderLineId = null;

        /**
         * Order Line identifier at subscribed service level . This identifier is originated in
         * Order Management module. Default is null.
         *
         * @param orderLineId the value to set
         * @return this builder instance
         */
        public Builder orderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /** This param is used to filter subscribed services based on its status */
        private String status = null;

        /**
         * This param is used to filter subscribed services based on its status
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(String status) {
            this.status = status;
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
        public Builder copy(ListSubscribedServicesRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            orderLineId(o.getOrderLineId());
            status(o.getStatus());
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
         * Build the instance of ListSubscribedServicesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSubscribedServicesRequest
         */
        public ListSubscribedServicesRequest build() {
            ListSubscribedServicesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSubscribedServicesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSubscribedServicesRequest
         */
        public ListSubscribedServicesRequest buildWithoutInvocationCallback() {
            ListSubscribedServicesRequest request = new ListSubscribedServicesRequest();
            request.compartmentId = compartmentId;
            request.subscriptionId = subscriptionId;
            request.orderLineId = orderLineId;
            request.status = status;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSubscribedServicesRequest(compartmentId, subscriptionId, orderLineId, status,
            // limit, page, sortOrder, sortBy, opcRequestId);
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
                .subscriptionId(subscriptionId)
                .orderLineId(orderLineId)
                .status(status)
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",orderLineId=").append(String.valueOf(this.orderLineId));
        sb.append(",status=").append(String.valueOf(this.status));
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
        if (!(o instanceof ListSubscribedServicesRequest)) {
            return false;
        }

        ListSubscribedServicesRequest other = (ListSubscribedServicesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.orderLineId, other.orderLineId)
                && java.util.Objects.equals(this.status, other.status)
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
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.orderLineId == null ? 43 : this.orderLineId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
