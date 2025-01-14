/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccCustomerGroupsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListOccCustomerGroupsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListOccCustomerGroupsRequest
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
    /** A query filter to return the list result based on status. */
    private com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.Status status;

    /** A query filter to return the list result based on status. */
    public com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.Status getStatus() {
        return status;
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
     * A query filter to return the list result based on the customer group OCID. This is done for
     * users who have INSPECT permission but do not have READ permission.
     */
    private String id;

    /**
     * A query filter to return the list result based on the customer group OCID. This is done for
     * users who have INSPECT permission but do not have READ permission.
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
     * The field to sort by. Only one sort order may be provided. Default order for name and
     * compartment ID is ascending. Default order for time created is descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for name and
     * compartment ID is ascending. Default order for time created is descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        CompartmentId("compartmentId"),
        Name("name"),
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
     * The field to sort by. Only one sort order may be provided. Default order for name and
     * compartment ID is ascending. Default order for time created is descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOccCustomerGroupsRequest, java.lang.Void> {
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

        /** A query filter to return the list result based on status. */
        private com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.Status status = null;

        /**
         * A query filter to return the list result based on status.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.Status status) {
            this.status = status;
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
         * A query filter to return the list result based on the customer group OCID. This is done
         * for users who have INSPECT permission but do not have READ permission.
         */
        private String id = null;

        /**
         * A query filter to return the list result based on the customer group OCID. This is done
         * for users who have INSPECT permission but do not have READ permission.
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
         * The field to sort by. Only one sort order may be provided. Default order for name and
         * compartment ID is ascending. Default order for time created is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for name and
         * compartment ID is ascending. Default order for time created is descending.
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
        public Builder copy(ListOccCustomerGroupsRequest o) {
            compartmentId(o.getCompartmentId());
            status(o.getStatus());
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
         * Build the instance of ListOccCustomerGroupsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListOccCustomerGroupsRequest
         */
        public ListOccCustomerGroupsRequest build() {
            ListOccCustomerGroupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOccCustomerGroupsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOccCustomerGroupsRequest
         */
        public ListOccCustomerGroupsRequest buildWithoutInvocationCallback() {
            ListOccCustomerGroupsRequest request = new ListOccCustomerGroupsRequest();
            request.compartmentId = compartmentId;
            request.status = status;
            request.displayName = displayName;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListOccCustomerGroupsRequest(compartmentId, status, displayName, id, limit, page,
            // opcRequestId, sortOrder, sortBy);
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
                .status(status)
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
        sb.append(",status=").append(String.valueOf(this.status));
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
        if (!(o instanceof ListOccCustomerGroupsRequest)) {
            return false;
        }

        ListOccCustomerGroupsRequest other = (ListOccCustomerGroupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.status, other.status)
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
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
