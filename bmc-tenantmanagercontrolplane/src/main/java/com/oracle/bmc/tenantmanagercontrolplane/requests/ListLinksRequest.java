/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListLinksExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLinksRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class ListLinksRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the parent tenancy this link is associated with.
     */
    private String parentTenancyId;

    /**
     * The ID of the parent tenancy this link is associated with.
     */
    public String getParentTenancyId() {
        return parentTenancyId;
    }
    /**
     * The ID of the child tenancy this link is associated with.
     */
    private String childTenancyId;

    /**
     * The ID of the child tenancy this link is associated with.
     */
    public String getChildTenancyId() {
        return childTenancyId;
    }
    /**
     * The lifecycle state of the resource.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the resource.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState getLifecycleState() {
        return lifecycleState;
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
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
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
     * The sort order to use, whether 'asc' or 'desc'.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder;

    /**
     * The sort order to use, whether 'asc' or 'desc'.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLinksRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the parent tenancy this link is associated with.
         */
        private String parentTenancyId = null;

        /**
         * The ID of the parent tenancy this link is associated with.
         * @param parentTenancyId the value to set
         * @return this builder instance
         */
        public Builder parentTenancyId(String parentTenancyId) {
            this.parentTenancyId = parentTenancyId;
            return this;
        }

        /**
         * The ID of the child tenancy this link is associated with.
         */
        private String childTenancyId = null;

        /**
         * The ID of the child tenancy this link is associated with.
         * @param childTenancyId the value to set
         * @return this builder instance
         */
        public Builder childTenancyId(String childTenancyId) {
            this.childTenancyId = childTenancyId;
            return this;
        }

        /**
         * The lifecycle state of the resource.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState = null;

        /**
         * The lifecycle state of the resource.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
         * The sort order to use, whether 'asc' or 'desc'.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, whether 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(
                com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListLinksRequest o) {
            parentTenancyId(o.getParentTenancyId());
            childTenancyId(o.getChildTenancyId());
            lifecycleState(o.getLifecycleState());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLinksRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLinksRequest
         */
        public ListLinksRequest build() {
            ListLinksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLinksRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLinksRequest
         */
        public ListLinksRequest buildWithoutInvocationCallback() {
            ListLinksRequest request = new ListLinksRequest();
            request.parentTenancyId = parentTenancyId;
            request.childTenancyId = childTenancyId;
            request.lifecycleState = lifecycleState;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            return request;
            // new ListLinksRequest(parentTenancyId, childTenancyId, lifecycleState, opcRequestId, page, limit, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .parentTenancyId(parentTenancyId)
                .childTenancyId(childTenancyId)
                .lifecycleState(lifecycleState)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder);
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
        sb.append(",parentTenancyId=").append(String.valueOf(this.parentTenancyId));
        sb.append(",childTenancyId=").append(String.valueOf(this.childTenancyId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLinksRequest)) {
            return false;
        }

        ListLinksRequest other = (ListLinksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.parentTenancyId, other.parentTenancyId)
                && java.util.Objects.equals(this.childTenancyId, other.childTenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.parentTenancyId == null ? 43 : this.parentTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.childTenancyId == null ? 43 : this.childTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
