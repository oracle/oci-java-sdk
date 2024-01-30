/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccCapacityRequestsInternalExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListOccCapacityRequestsInternalRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListOccCapacityRequestsInternalRequest
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
    /**
     * A filter to return the list of capacity requests based on the OCID of the availability
     * catalog against which they were created.
     */
    private String occAvailabilityCatalogId;

    /**
     * A filter to return the list of capacity requests based on the OCID of the availability
     * catalog against which they were created.
     */
    public String getOccAvailabilityCatalogId() {
        return occAvailabilityCatalogId;
    }
    /** The namespace by which we would filter the list. */
    private com.oracle.bmc.capacitymanagement.model.Namespace namespace;

    /** The namespace by which we would filter the list. */
    public com.oracle.bmc.capacitymanagement.model.Namespace getNamespace() {
        return namespace;
    }
    /**
     * A filter to return only the resources that match the entire display name. The match is not
     * case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only the resources that match the entire display name. The match is not
     * case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return the list of capacity requests based on the OCID of the capacity request.
     * This is done for the users who have INSPECT permission on the resource but do not have READ
     * permission.
     */
    private String id;

    /**
     * A filter to return the list of capacity requests based on the OCID of the capacity request.
     * This is done for the users who have INSPECT permission on the resource but do not have READ
     * permission.
     */
    public String getId() {
        return id;
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
     * The field to sort by. Only one sort order may be provided. The default order for display name
     * is ascending. The default order for time created is reverse chronological order(latest date
     * at the top).
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. The default order for display name
     * is ascending. The default order for time created is reverse chronological order(latest date
     * at the top).
     */
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

    /**
     * The field to sort by. Only one sort order may be provided. The default order for display name
     * is ascending. The default order for time created is reverse chronological order(latest date
     * at the top).
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOccCapacityRequestsInternalRequest, java.lang.Void> {
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
         * A filter to return the list of capacity requests based on the OCID of the availability
         * catalog against which they were created.
         */
        private String occAvailabilityCatalogId = null;

        /**
         * A filter to return the list of capacity requests based on the OCID of the availability
         * catalog against which they were created.
         *
         * @param occAvailabilityCatalogId the value to set
         * @return this builder instance
         */
        public Builder occAvailabilityCatalogId(String occAvailabilityCatalogId) {
            this.occAvailabilityCatalogId = occAvailabilityCatalogId;
            return this;
        }

        /** The namespace by which we would filter the list. */
        private com.oracle.bmc.capacitymanagement.model.Namespace namespace = null;

        /**
         * The namespace by which we would filter the list.
         *
         * @param namespace the value to set
         * @return this builder instance
         */
        public Builder namespace(com.oracle.bmc.capacitymanagement.model.Namespace namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * A filter to return only the resources that match the entire display name. The match is
         * not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire display name. The match is
         * not case sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return the list of capacity requests based on the OCID of the capacity
         * request. This is done for the users who have INSPECT permission on the resource but do
         * not have READ permission.
         */
        private String id = null;

        /**
         * A filter to return the list of capacity requests based on the OCID of the capacity
         * request. This is done for the users who have INSPECT permission on the resource but do
         * not have READ permission.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
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
         * The field to sort by. Only one sort order may be provided. The default order for display
         * name is ascending. The default order for time created is reverse chronological
         * order(latest date at the top).
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. The default order for display
         * name is ascending. The default order for time created is reverse chronological
         * order(latest date at the top).
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
        public Builder copy(ListOccCapacityRequestsInternalRequest o) {
            compartmentId(o.getCompartmentId());
            occCustomerGroupId(o.getOccCustomerGroupId());
            occAvailabilityCatalogId(o.getOccAvailabilityCatalogId());
            namespace(o.getNamespace());
            displayName(o.getDisplayName());
            id(o.getId());
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
         * Build the instance of ListOccCapacityRequestsInternalRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListOccCapacityRequestsInternalRequest
         */
        public ListOccCapacityRequestsInternalRequest build() {
            ListOccCapacityRequestsInternalRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOccCapacityRequestsInternalRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOccCapacityRequestsInternalRequest
         */
        public ListOccCapacityRequestsInternalRequest buildWithoutInvocationCallback() {
            ListOccCapacityRequestsInternalRequest request =
                    new ListOccCapacityRequestsInternalRequest();
            request.compartmentId = compartmentId;
            request.occCustomerGroupId = occCustomerGroupId;
            request.occAvailabilityCatalogId = occAvailabilityCatalogId;
            request.namespace = namespace;
            request.displayName = displayName;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListOccCapacityRequestsInternalRequest(compartmentId, occCustomerGroupId,
            // occAvailabilityCatalogId, namespace, displayName, id, limit, page, opcRequestId,
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
                .occAvailabilityCatalogId(occAvailabilityCatalogId)
                .namespace(namespace)
                .displayName(displayName)
                .id(id)
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
        sb.append(",occAvailabilityCatalogId=")
                .append(String.valueOf(this.occAvailabilityCatalogId));
        sb.append(",namespace=").append(String.valueOf(this.namespace));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
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
        if (!(o instanceof ListOccCapacityRequestsInternalRequest)) {
            return false;
        }

        ListOccCapacityRequestsInternalRequest other = (ListOccCapacityRequestsInternalRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalogId, other.occAvailabilityCatalogId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
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
                        + (this.occAvailabilityCatalogId == null
                                ? 43
                                : this.occAvailabilityCatalogId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
