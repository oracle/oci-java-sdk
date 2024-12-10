/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListFleetTargetsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFleetTargetsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class ListFleetTargetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Fleet identifier.
     */
    private String fleetId;

    /**
     * Unique Fleet identifier.
     */
    public String getFleetId() {
        return fleetId;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Product Name.
     */
    private String product;

    /**
     * Product Name.
     */
    public String getProduct() {
        return product;
    }
    /**
     * Resource Identifier
     */
    private String resourceId;

    /**
     * Resource Identifier
     */
    public String getResourceId() {
        return resourceId;
    }
    /**
     * Resource Display Name.
     */
    private String resourceDisplayName;

    /**
     * Resource Display Name.
     */
    public String getResourceDisplayName() {
        return resourceDisplayName;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for displayName,product and resourceDisplayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for displayName,product and resourceDisplayName is ascending.
     *
     **/
    public enum SortBy {
        DisplayName("displayName"),
        Product("product"),
        ResourceDisplayName("resourceDisplayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for displayName,product and resourceDisplayName is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFleetTargetsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Fleet identifier.
         */
        private String fleetId = null;

        /**
         * Unique Fleet identifier.
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Product Name.
         */
        private String product = null;

        /**
         * Product Name.
         * @param product the value to set
         * @return this builder instance
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * Resource Identifier
         */
        private String resourceId = null;

        /**
         * Resource Identifier
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Resource Display Name.
         */
        private String resourceDisplayName = null;

        /**
         * Resource Display Name.
         * @param resourceDisplayName the value to set
         * @return this builder instance
         */
        public Builder resourceDisplayName(String resourceDisplayName) {
            this.resourceDisplayName = resourceDisplayName;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for displayName,product and resourceDisplayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for displayName,product and resourceDisplayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListFleetTargetsRequest o) {
            fleetId(o.getFleetId());
            displayName(o.getDisplayName());
            product(o.getProduct());
            resourceId(o.getResourceId());
            resourceDisplayName(o.getResourceDisplayName());
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
         * Build the instance of ListFleetTargetsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFleetTargetsRequest
         */
        public ListFleetTargetsRequest build() {
            ListFleetTargetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFleetTargetsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFleetTargetsRequest
         */
        public ListFleetTargetsRequest buildWithoutInvocationCallback() {
            ListFleetTargetsRequest request = new ListFleetTargetsRequest();
            request.fleetId = fleetId;
            request.displayName = displayName;
            request.product = product;
            request.resourceId = resourceId;
            request.resourceDisplayName = resourceDisplayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFleetTargetsRequest(fleetId, displayName, product, resourceId, resourceDisplayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .displayName(displayName)
                .product(product)
                .resourceId(resourceId)
                .resourceDisplayName(resourceDisplayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",product=").append(String.valueOf(this.product));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",resourceDisplayName=").append(String.valueOf(this.resourceDisplayName));
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
        if (!(o instanceof ListFleetTargetsRequest)) {
            return false;
        }

        ListFleetTargetsRequest other = (ListFleetTargetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceDisplayName, other.resourceDisplayName)
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
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDisplayName == null
                                ? 43
                                : this.resourceDisplayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
