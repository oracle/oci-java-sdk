/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListFleetsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFleetsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class ListFleetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return fleets whose lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState lifecycleState;

    /** A filter to return fleets whose lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The ID of the compartment in which to list resources. Empty only if the resource OCID query
     * param is not specified.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources. Empty only if the resource OCID query
     * param is not specified.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return fleets whose fleetType matches the given fleetType. */
    private com.oracle.bmc.fleetappsmanagement.model.FleetDetails.FleetType fleetType;

    /** A filter to return fleets whose fleetType matches the given fleetType. */
    public com.oracle.bmc.fleetappsmanagement.model.FleetDetails.FleetType getFleetType() {
        return fleetType;
    }
    /** A filter to return resources that match the Application Type/Product Stack given.. */
    private String applicationType;

    /** A filter to return resources that match the Application Type/Product Stack given.. */
    public String getApplicationType() {
        return applicationType;
    }
    /** A filter to return resources that match the Product/Product Stack given. */
    private String product;

    /** A filter to return resources that match the Product/Product Stack given. */
    public String getProduct() {
        return product;
    }
    /** A filter to return resources that match the Environment Type given. */
    private String environmentType;

    /** A filter to return resources that match the Environment Type given. */
    public String getEnvironmentType() {
        return environmentType;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Unique identifier or OCID for listing a single fleet by id. Either compartmentId or id must
     * be provided.
     */
    private String id;

    /**
     * Unique identifier or OCID for listing a single fleet by id. Either compartmentId or id must
     * be provided.
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
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private com.oracle.bmc.fleetappsmanagement.model.FleetSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public com.oracle.bmc.fleetappsmanagement.model.FleetSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFleetsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A filter to return fleets whose lifecycleState matches the given lifecycleState. */
        private com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState lifecycleState = null;

        /**
         * A filter to return fleets whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The ID of the compartment in which to list resources. Empty only if the resource OCID
         * query param is not specified.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources. Empty only if the resource OCID
         * query param is not specified.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return fleets whose fleetType matches the given fleetType. */
        private com.oracle.bmc.fleetappsmanagement.model.FleetDetails.FleetType fleetType = null;

        /**
         * A filter to return fleets whose fleetType matches the given fleetType.
         *
         * @param fleetType the value to set
         * @return this builder instance
         */
        public Builder fleetType(
                com.oracle.bmc.fleetappsmanagement.model.FleetDetails.FleetType fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        /** A filter to return resources that match the Application Type/Product Stack given.. */
        private String applicationType = null;

        /**
         * A filter to return resources that match the Application Type/Product Stack given..
         *
         * @param applicationType the value to set
         * @return this builder instance
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /** A filter to return resources that match the Product/Product Stack given. */
        private String product = null;

        /**
         * A filter to return resources that match the Product/Product Stack given.
         *
         * @param product the value to set
         * @return this builder instance
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /** A filter to return resources that match the Environment Type given. */
        private String environmentType = null;

        /**
         * A filter to return resources that match the Environment Type given.
         *
         * @param environmentType the value to set
         * @return this builder instance
         */
        public Builder environmentType(String environmentType) {
            this.environmentType = environmentType;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Unique identifier or OCID for listing a single fleet by id. Either compartmentId or id
         * must be provided.
         */
        private String id = null;

        /**
         * Unique identifier or OCID for listing a single fleet by id. Either compartmentId or id
         * must be provided.
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
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private com.oracle.bmc.fleetappsmanagement.model.FleetSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.fleetappsmanagement.model.FleetSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListFleetsRequest o) {
            lifecycleState(o.getLifecycleState());
            compartmentId(o.getCompartmentId());
            fleetType(o.getFleetType());
            applicationType(o.getApplicationType());
            product(o.getProduct());
            environmentType(o.getEnvironmentType());
            displayName(o.getDisplayName());
            id(o.getId());
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
         * Build the instance of ListFleetsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFleetsRequest
         */
        public ListFleetsRequest build() {
            ListFleetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFleetsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFleetsRequest
         */
        public ListFleetsRequest buildWithoutInvocationCallback() {
            ListFleetsRequest request = new ListFleetsRequest();
            request.lifecycleState = lifecycleState;
            request.compartmentId = compartmentId;
            request.fleetType = fleetType;
            request.applicationType = applicationType;
            request.product = product;
            request.environmentType = environmentType;
            request.displayName = displayName;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFleetsRequest(lifecycleState, compartmentId, fleetType, applicationType,
            // product, environmentType, displayName, id, limit, page, sortOrder, sortBy,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .lifecycleState(lifecycleState)
                .compartmentId(compartmentId)
                .fleetType(fleetType)
                .applicationType(applicationType)
                .product(product)
                .environmentType(environmentType)
                .displayName(displayName)
                .id(id)
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",fleetType=").append(String.valueOf(this.fleetType));
        sb.append(",applicationType=").append(String.valueOf(this.applicationType));
        sb.append(",product=").append(String.valueOf(this.product));
        sb.append(",environmentType=").append(String.valueOf(this.environmentType));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
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
        if (!(o instanceof ListFleetsRequest)) {
            return false;
        }

        ListFleetsRequest other = (ListFleetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fleetType, other.fleetType)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.fleetType == null ? 43 : this.fleetType.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
