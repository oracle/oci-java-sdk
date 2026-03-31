/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.requests;

import com.oracle.bmc.limitsincrease.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/ListLimitsIncreaseItemRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLimitsIncreaseItemRequestsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListLimitsIncreaseItemRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent compartment.
     * Note: The tenancy is the root compartment.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent compartment.
     * Note: The tenancy is the root compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Name of service that owns the limit.
     *
     */
    private String service;

    /**
     * Name of service that owns the limit.
     *
     */
    public String getService() {
        return service;
    }
    /**
     * Lifecycle state of the limit increase request.
     *
     */
    private String lifecycleState;

    /**
     * Lifecycle state of the limit increase request.
     *
     */
    public String getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
     *
     */
    private String limitsIncreaseRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
     *
     */
    public String getLimitsIncreaseRequestId() {
        return limitsIncreaseRequestId;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
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

    /**
     * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can specify only one sort order. The default order for {@code timeCreated} is descending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order. The default order for {@code timeCreated} is descending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
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
     * The field to sort by. You can specify only one sort order. The default order for {@code timeCreated} is descending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Maximum number of items returned in a page.
     */
    private Integer limit;

    /**
     * Maximum number of items returned in a page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The next page token.
     */
    private String page;

    /**
     * The next page token.
     */
    public String getPage() {
        return page;
    }
    /**
     * Override request id for request tracking purposes.
     */
    private String opcRequestId;

    /**
     * Override request id for request tracking purposes.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLimitsIncreaseItemRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent compartment.
         * Note: The tenancy is the root compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent compartment.
         * Note: The tenancy is the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Name of service that owns the limit.
         *
         */
        private String service = null;

        /**
         * Name of service that owns the limit.
         *
         * @param service the value to set
         * @return this builder instance
         */
        public Builder service(String service) {
            this.service = service;
            return this;
        }

        /**
         * Lifecycle state of the limit increase request.
         *
         */
        private String lifecycleState = null;

        /**
         * Lifecycle state of the limit increase request.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
         *
         */
        private String limitsIncreaseRequestId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
         *
         * @param limitsIncreaseRequestId the value to set
         * @return this builder instance
         */
        public Builder limitsIncreaseRequestId(String limitsIncreaseRequestId) {
            this.limitsIncreaseRequestId = limitsIncreaseRequestId;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sort order. The default order for {@code timeCreated} is descending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order. The default order for {@code timeCreated} is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Maximum number of items returned in a page.
         */
        private Integer limit = null;

        /**
         * Maximum number of items returned in a page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The next page token.
         */
        private String page = null;

        /**
         * The next page token.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Override request id for request tracking purposes.
         */
        private String opcRequestId = null;

        /**
         * Override request id for request tracking purposes.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
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
        public Builder copy(ListLimitsIncreaseItemRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            service(o.getService());
            lifecycleState(o.getLifecycleState());
            limitsIncreaseRequestId(o.getLimitsIncreaseRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLimitsIncreaseItemRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLimitsIncreaseItemRequestsRequest
         */
        public ListLimitsIncreaseItemRequestsRequest build() {
            ListLimitsIncreaseItemRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLimitsIncreaseItemRequestsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLimitsIncreaseItemRequestsRequest
         */
        public ListLimitsIncreaseItemRequestsRequest buildWithoutInvocationCallback() {
            ListLimitsIncreaseItemRequestsRequest request =
                    new ListLimitsIncreaseItemRequestsRequest();
            request.compartmentId = compartmentId;
            request.service = service;
            request.lifecycleState = lifecycleState;
            request.limitsIncreaseRequestId = limitsIncreaseRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLimitsIncreaseItemRequestsRequest(compartmentId, service, lifecycleState, limitsIncreaseRequestId, sortOrder, sortBy, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .service(service)
                .lifecycleState(lifecycleState)
                .limitsIncreaseRequestId(limitsIncreaseRequestId)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",service=").append(String.valueOf(this.service));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limitsIncreaseRequestId=").append(String.valueOf(this.limitsIncreaseRequestId));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLimitsIncreaseItemRequestsRequest)) {
            return false;
        }

        ListLimitsIncreaseItemRequestsRequest other = (ListLimitsIncreaseItemRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.limitsIncreaseRequestId, other.limitsIncreaseRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.limitsIncreaseRequestId == null
                                ? 43
                                : this.limitsIncreaseRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
