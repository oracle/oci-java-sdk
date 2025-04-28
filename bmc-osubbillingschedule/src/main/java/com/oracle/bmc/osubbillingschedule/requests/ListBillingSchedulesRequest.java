/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubbillingschedule.requests;

import com.oracle.bmc.osubbillingschedule.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osubbillingschedule/ListBillingSchedulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBillingSchedulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
public class ListBillingSchedulesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** This param is used to get only the billing schedules for a particular Subscription Id */
    private String subscriptionId;

    /** This param is used to get only the billing schedules for a particular Subscription Id */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** This param is used to get only the billing schedules for a particular Subscribed Service */
    private String subscribedServiceId;

    /** This param is used to get only the billing schedules for a particular Subscribed Service */
    public String getSubscribedServiceId() {
        return subscribedServiceId;
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
    /**
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
     * us-phoenix-1 etc.
     */
    private String xOneOriginRegion;

    /**
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
     * us-phoenix-1 etc.
     */
    public String getXOneOriginRegion() {
        return xOneOriginRegion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBillingSchedulesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** This param is used to get only the billing schedules for a particular Subscription Id */
        private String subscriptionId = null;

        /**
         * This param is used to get only the billing schedules for a particular Subscription Id
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * This param is used to get only the billing schedules for a particular Subscribed Service
         */
        private String subscribedServiceId = null;

        /**
         * This param is used to get only the billing schedules for a particular Subscribed Service
         *
         * @param subscribedServiceId the value to set
         * @return this builder instance
         */
        public Builder subscribedServiceId(String subscribedServiceId) {
            this.subscribedServiceId = subscribedServiceId;
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
         * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
         * us-phoenix-1 etc.
         */
        private String xOneOriginRegion = null;

        /**
         * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
         * us-phoenix-1 etc.
         *
         * @param xOneOriginRegion the value to set
         * @return this builder instance
         */
        public Builder xOneOriginRegion(String xOneOriginRegion) {
            this.xOneOriginRegion = xOneOriginRegion;
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
        public Builder copy(ListBillingSchedulesRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            subscribedServiceId(o.getSubscribedServiceId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            xOneOriginRegion(o.getXOneOriginRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBillingSchedulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListBillingSchedulesRequest
         */
        public ListBillingSchedulesRequest build() {
            ListBillingSchedulesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBillingSchedulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBillingSchedulesRequest
         */
        public ListBillingSchedulesRequest buildWithoutInvocationCallback() {
            ListBillingSchedulesRequest request = new ListBillingSchedulesRequest();
            request.compartmentId = compartmentId;
            request.subscriptionId = subscriptionId;
            request.subscribedServiceId = subscribedServiceId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.xOneOriginRegion = xOneOriginRegion;
            return request;
            // new ListBillingSchedulesRequest(compartmentId, subscriptionId, subscribedServiceId,
            // limit, page, sortOrder, sortBy, opcRequestId, xOneOriginRegion);
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
                .subscribedServiceId(subscribedServiceId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .xOneOriginRegion(xOneOriginRegion);
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
        sb.append(",subscribedServiceId=").append(String.valueOf(this.subscribedServiceId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",xOneOriginRegion=").append(String.valueOf(this.xOneOriginRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBillingSchedulesRequest)) {
            return false;
        }

        ListBillingSchedulesRequest other = (ListBillingSchedulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.subscribedServiceId, other.subscribedServiceId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.xOneOriginRegion, other.xOneOriginRegion);
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
        result =
                (result * PRIME)
                        + (this.subscribedServiceId == null
                                ? 43
                                : this.subscribedServiceId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.xOneOriginRegion == null ? 43 : this.xOneOriginRegion.hashCode());
        return result;
    }
}
