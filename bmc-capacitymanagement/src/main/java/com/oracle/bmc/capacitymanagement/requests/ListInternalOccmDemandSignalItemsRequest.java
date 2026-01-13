/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListInternalOccmDemandSignalItemsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListInternalOccmDemandSignalItemsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListInternalOccmDemandSignalItemsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ocid of the compartment or tenancy in which resources are to be listed. This will also be
     * used for authorization purposes.
     */
    private String compartmentId;

    /**
     * The ocid of the compartment or tenancy in which resources are to be listed. This will also be
     * used for authorization purposes.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The customer group ocid by which we would filter the list. */
    private String occCustomerGroupId;

    /** The customer group ocid by which we would filter the list. */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }
    /** A query parameter to filter the list of demand signal items based on a demand signal id. */
    private String occmDemandSignalId;

    /** A query parameter to filter the list of demand signal items based on a demand signal id. */
    public String getOccmDemandSignalId() {
        return occmDemandSignalId;
    }
    /** A query parameter to filter the list of demand signal details based on the resource name. */
    private String resourceName;

    /** A query parameter to filter the list of demand signal details based on the resource name. */
    public String getResourceName() {
        return resourceName;
    }
    /** A query parameter to filter the list of demand signal details based on the namespace. */
    private com.oracle.bmc.capacitymanagement.model.DemandSignalNamespace demandSignalNamespace;

    /** A query parameter to filter the list of demand signal details based on the namespace. */
    public com.oracle.bmc.capacitymanagement.model.DemandSignalNamespace
            getDemandSignalNamespace() {
        return demandSignalNamespace;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.capacitymanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort the response of List Demand Signal Details API. Only one sort order may be
     * provided. The default order for resource name is case sensitive alphabetical order.
     */
    private SortBy sortBy;

    /**
     * The field to sort the response of List Demand Signal Details API. Only one sort order may be
     * provided. The default order for resource name is case sensitive alphabetical order.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        ResourceName("resourceName"),
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
     * The field to sort the response of List Demand Signal Details API. Only one sort order may be
     * provided. The default order for resource name is case sensitive alphabetical order.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInternalOccmDemandSignalItemsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ocid of the compartment or tenancy in which resources are to be listed. This will
         * also be used for authorization purposes.
         */
        private String compartmentId = null;

        /**
         * The ocid of the compartment or tenancy in which resources are to be listed. This will
         * also be used for authorization purposes.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The customer group ocid by which we would filter the list. */
        private String occCustomerGroupId = null;

        /**
         * The customer group ocid by which we would filter the list.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder instance
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            return this;
        }

        /**
         * A query parameter to filter the list of demand signal items based on a demand signal id.
         */
        private String occmDemandSignalId = null;

        /**
         * A query parameter to filter the list of demand signal items based on a demand signal id.
         *
         * @param occmDemandSignalId the value to set
         * @return this builder instance
         */
        public Builder occmDemandSignalId(String occmDemandSignalId) {
            this.occmDemandSignalId = occmDemandSignalId;
            return this;
        }

        /**
         * A query parameter to filter the list of demand signal details based on the resource name.
         */
        private String resourceName = null;

        /**
         * A query parameter to filter the list of demand signal details based on the resource name.
         *
         * @param resourceName the value to set
         * @return this builder instance
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /** A query parameter to filter the list of demand signal details based on the namespace. */
        private com.oracle.bmc.capacitymanagement.model.DemandSignalNamespace
                demandSignalNamespace = null;

        /**
         * A query parameter to filter the list of demand signal details based on the namespace.
         *
         * @param demandSignalNamespace the value to set
         * @return this builder instance
         */
        public Builder demandSignalNamespace(
                com.oracle.bmc.capacitymanagement.model.DemandSignalNamespace
                        demandSignalNamespace) {
            this.demandSignalNamespace = demandSignalNamespace;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort the response of List Demand Signal Details API. Only one sort order may
         * be provided. The default order for resource name is case sensitive alphabetical order.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort the response of List Demand Signal Details API. Only one sort order may
         * be provided. The default order for resource name is case sensitive alphabetical order.
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
        public Builder copy(ListInternalOccmDemandSignalItemsRequest o) {
            compartmentId(o.getCompartmentId());
            occCustomerGroupId(o.getOccCustomerGroupId());
            occmDemandSignalId(o.getOccmDemandSignalId());
            resourceName(o.getResourceName());
            demandSignalNamespace(o.getDemandSignalNamespace());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListInternalOccmDemandSignalItemsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListInternalOccmDemandSignalItemsRequest
         */
        public ListInternalOccmDemandSignalItemsRequest build() {
            ListInternalOccmDemandSignalItemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInternalOccmDemandSignalItemsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInternalOccmDemandSignalItemsRequest
         */
        public ListInternalOccmDemandSignalItemsRequest buildWithoutInvocationCallback() {
            ListInternalOccmDemandSignalItemsRequest request =
                    new ListInternalOccmDemandSignalItemsRequest();
            request.compartmentId = compartmentId;
            request.occCustomerGroupId = occCustomerGroupId;
            request.occmDemandSignalId = occmDemandSignalId;
            request.resourceName = resourceName;
            request.demandSignalNamespace = demandSignalNamespace;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListInternalOccmDemandSignalItemsRequest(compartmentId, occCustomerGroupId,
            // occmDemandSignalId, resourceName, demandSignalNamespace, limit, page, opcRequestId,
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
                .compartmentId(compartmentId)
                .occCustomerGroupId(occCustomerGroupId)
                .occmDemandSignalId(occmDemandSignalId)
                .resourceName(resourceName)
                .demandSignalNamespace(demandSignalNamespace)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(",occmDemandSignalId=").append(String.valueOf(this.occmDemandSignalId));
        sb.append(",resourceName=").append(String.valueOf(this.resourceName));
        sb.append(",demandSignalNamespace=").append(String.valueOf(this.demandSignalNamespace));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
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
        if (!(o instanceof ListInternalOccmDemandSignalItemsRequest)) {
            return false;
        }

        ListInternalOccmDemandSignalItemsRequest other =
                (ListInternalOccmDemandSignalItemsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.occmDemandSignalId, other.occmDemandSignalId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.demandSignalNamespace, other.demandSignalNamespace)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
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
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.occmDemandSignalId == null
                                ? 43
                                : this.occmDemandSignalId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.demandSignalNamespace == null
                                ? 43
                                : this.demandSignalNamespace.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
