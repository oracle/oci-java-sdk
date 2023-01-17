/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListResolversExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListResolversRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class ListResolversRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment the resource belongs to. */
    private String compartmentId;

    /** The OCID of the compartment the resource belongs to. */
    public String getCompartmentId() {
        return compartmentId;
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
    /** The displayName of a resource. */
    private String displayName;

    /** The displayName of a resource. */
    public String getDisplayName() {
        return displayName;
    }
    /** The OCID of a resource. */
    private String id;

    /** The OCID of a resource. */
    public String getId() {
        return id;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in a page of the collection. */
    private Long limit;

    /** The maximum number of items to return in a page of the collection. */
    public Long getLimit() {
        return limit;
    }
    /** The order to sort the resources. */
    private com.oracle.bmc.dns.model.SortOrder sortOrder;

    /** The order to sort the resources. */
    public com.oracle.bmc.dns.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field by which to sort resolvers. */
    private SortBy sortBy;

    /** The field by which to sort resolvers. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
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

    /** The field by which to sort resolvers. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The state of a resource. */
    private com.oracle.bmc.dns.model.ResolverSummary.LifecycleState lifecycleState;

    /** The state of a resource. */
    public com.oracle.bmc.dns.model.ResolverSummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** Specifies to operate only on resources that have a matching DNS scope. */
    private com.oracle.bmc.dns.model.Scope scope;

    /** Specifies to operate only on resources that have a matching DNS scope. */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListResolversRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment the resource belongs to. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /** The displayName of a resource. */
        private String displayName = null;

        /**
         * The displayName of a resource.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The OCID of a resource. */
        private String id = null;

        /**
         * The OCID of a resource.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of items to return in a page of the collection. */
        private Long limit = null;

        /**
         * The maximum number of items to return in a page of the collection.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /** The order to sort the resources. */
        private com.oracle.bmc.dns.model.SortOrder sortOrder = null;

        /**
         * The order to sort the resources.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.dns.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field by which to sort resolvers. */
        private SortBy sortBy = null;

        /**
         * The field by which to sort resolvers.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The state of a resource. */
        private com.oracle.bmc.dns.model.ResolverSummary.LifecycleState lifecycleState = null;

        /**
         * The state of a resource.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dns.model.ResolverSummary.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** Specifies to operate only on resources that have a matching DNS scope. */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
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
        public Builder copy(ListResolversRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            displayName(o.getDisplayName());
            id(o.getId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListResolversRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListResolversRequest
         */
        public ListResolversRequest build() {
            ListResolversRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListResolversRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListResolversRequest
         */
        public ListResolversRequest buildWithoutInvocationCallback() {
            ListResolversRequest request = new ListResolversRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.displayName = displayName;
            request.id = id;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.scope = scope;
            return request;
            // new ListResolversRequest(compartmentId, opcRequestId, displayName, id, page, limit,
            // sortOrder, sortBy, lifecycleState, scope);
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
                .displayName(displayName)
                .id(id)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
                .scope(scope);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListResolversRequest)) {
            return false;
        }

        ListResolversRequest other = (ListResolversRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
