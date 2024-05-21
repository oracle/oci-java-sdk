/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSubscriptionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class ListSubscriptionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The ID of the subscription to which the tenancy is associated.
     */
    private String subscriptionId;

    /**
     * The ID of the subscription to which the tenancy is associated.
     */
    public String getSubscriptionId() {
        return subscriptionId;
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
    /**
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The version of the subscription entity.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.EntityVersion entityVersion;

    /**
     * The version of the subscription entity.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.EntityVersion getEntityVersion() {
        return entityVersion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSubscriptionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The ID of the subscription to which the tenancy is associated.
         */
        private String subscriptionId = null;

        /**
         * The ID of the subscription to which the tenancy is associated.
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * The field to sort by. Only one sort order can be provided.
         * * The default order for timeCreated is descending.
         * * The default order for displayName is ascending.
         * * If no value is specified, timeCreated is the default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided.
         * * The default order for timeCreated is descending.
         * * The default order for displayName is ascending.
         * * If no value is specified, timeCreated is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The version of the subscription entity.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.EntityVersion entityVersion = null;

        /**
         * The version of the subscription entity.
         * @param entityVersion the value to set
         * @return this builder instance
         */
        public Builder entityVersion(
                com.oracle.bmc.tenantmanagercontrolplane.model.EntityVersion entityVersion) {
            this.entityVersion = entityVersion;
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
        public Builder copy(ListSubscriptionsRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            entityVersion(o.getEntityVersion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSubscriptionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSubscriptionsRequest
         */
        public ListSubscriptionsRequest buildWithoutInvocationCallback() {
            ListSubscriptionsRequest request = new ListSubscriptionsRequest();
            request.compartmentId = compartmentId;
            request.subscriptionId = subscriptionId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.entityVersion = entityVersion;
            return request;
            // new ListSubscriptionsRequest(compartmentId, subscriptionId, opcRequestId, page, limit, sortOrder, sortBy, entityVersion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .subscriptionId(subscriptionId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .entityVersion(entityVersion);
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",entityVersion=").append(String.valueOf(this.entityVersion));
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
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.entityVersion, other.entityVersion);
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
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.entityVersion == null ? 43 : this.entityVersion.hashCode());
        return result;
    }
}
