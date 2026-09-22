/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/ListAdminListingRevisionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAdminListingRevisionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class ListAdminListingRevisionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** listing OCID */
    private String listingId;

    /** listing OCID */
    public String getListingId() {
        return listingId;
    }
    /** The unique identifier for the compartment. */
    private String compartmentId;

    /** The unique identifier for the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return listings based on their type */
    private com.oracle.bmc.marketplacepublisher.model.ListingType listingType;

    /** A filter to return listings based on their type */
    public com.oracle.bmc.marketplacepublisher.model.ListingType getListingType() {
        return listingType;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** Unique publisher identifier. */
    private String publisherId;

    /** Unique publisher identifier. */
    public String getPublisherId() {
        return publisherId;
    }
    /**
     * A filter to return only listing revisions their lifecycleState matches the given
     * lifecycleState.
     */
    private com.oracle.bmc.marketplacepublisher.model.ListingRevision.LifecycleState lifecycleState;

    /**
     * A filter to return only listing revisions their lifecycleState matches the given
     * lifecycleState.
     */
    public com.oracle.bmc.marketplacepublisher.model.ListingRevision.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only listing revisions their status matches the given listing revision
     * status.
     */
    private com.oracle.bmc.marketplacepublisher.model.ListingRevision.Status listingRevisionStatus;

    /**
     * A filter to return only listing revisions their status matches the given listing revision
     * status.
     */
    public com.oracle.bmc.marketplacepublisher.model.ListingRevision.Status
            getListingRevisionStatus() {
        return listingRevisionStatus;
    }
    /**
     * Comma-separated listing revision status values used to filter OpenSearch admin listing
     * revision results.
     */
    private String statusCsv;

    /**
     * Comma-separated listing revision status values used to filter OpenSearch admin listing
     * revision results.
     */
    public String getStatusCsv() {
        return statusCsv;
    }
    /** Product value used to filter OpenSearch admin listing revision results. */
    private String product;

    /** Product value used to filter OpenSearch admin listing revision results. */
    public String getProduct() {
        return product;
    }
    /** Filters data created after the specified date. */
    private java.util.Date timeCreatedAfter;

    /** Filters data created after the specified date. */
    public java.util.Date getTimeCreatedAfter() {
        return timeCreatedAfter;
    }
    /** Filters data updated after the specified date. */
    private java.util.Date timeUpdatedAfter;

    /** Filters data updated after the specified date. */
    public java.util.Date getTimeUpdatedAfter() {
        return timeUpdatedAfter;
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
    private com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.marketplacepublisher.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for timeUpdated is descending. Default order for displayName is
     * ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for timeUpdated is descending. Default order for displayName is
     * ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for timeUpdated is descending. Default order for displayName is
     * ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Optional pricing type filter for listing admin listing revisions. This filter is only applied
     * when dataSource is opensearch.
     */
    private String pricingType;

    /**
     * Optional pricing type filter for listing admin listing revisions. This filter is only applied
     * when dataSource is opensearch.
     */
    public String getPricingType() {
        return pricingType;
    }
    /**
     * Optional private offer enabled filter for listing admin listing revisions. This filter is
     * only applied when dataSource is opensearch.
     */
    private Boolean isPrivateOfferEnabled;

    /**
     * Optional private offer enabled filter for listing admin listing revisions. This filter is
     * only applied when dataSource is opensearch.
     */
    public Boolean getIsPrivateOfferEnabled() {
        return isPrivateOfferEnabled;
    }
    /**
     * Optional source for listing admin listing revisions. Use opensearch to read from OpenSearch.
     */
    private String dataSource;

    /**
     * Optional source for listing admin listing revisions. Use opensearch to read from OpenSearch.
     */
    public String getDataSource() {
        return dataSource;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAdminListingRevisionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** listing OCID */
        private String listingId = null;

        /**
         * listing OCID
         *
         * @param listingId the value to set
         * @return this builder instance
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            return this;
        }

        /** The unique identifier for the compartment. */
        private String compartmentId = null;

        /**
         * The unique identifier for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return listings based on their type */
        private com.oracle.bmc.marketplacepublisher.model.ListingType listingType = null;

        /**
         * A filter to return listings based on their type
         *
         * @param listingType the value to set
         * @return this builder instance
         */
        public Builder listingType(
                com.oracle.bmc.marketplacepublisher.model.ListingType listingType) {
            this.listingType = listingType;
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

        /** Unique publisher identifier. */
        private String publisherId = null;

        /**
         * Unique publisher identifier.
         *
         * @param publisherId the value to set
         * @return this builder instance
         */
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        /**
         * A filter to return only listing revisions their lifecycleState matches the given
         * lifecycleState.
         */
        private com.oracle.bmc.marketplacepublisher.model.ListingRevision.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only listing revisions their lifecycleState matches the given
         * lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.marketplacepublisher.model.ListingRevision.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only listing revisions their status matches the given listing revision
         * status.
         */
        private com.oracle.bmc.marketplacepublisher.model.ListingRevision.Status
                listingRevisionStatus = null;

        /**
         * A filter to return only listing revisions their status matches the given listing revision
         * status.
         *
         * @param listingRevisionStatus the value to set
         * @return this builder instance
         */
        public Builder listingRevisionStatus(
                com.oracle.bmc.marketplacepublisher.model.ListingRevision.Status
                        listingRevisionStatus) {
            this.listingRevisionStatus = listingRevisionStatus;
            return this;
        }

        /**
         * Comma-separated listing revision status values used to filter OpenSearch admin listing
         * revision results.
         */
        private String statusCsv = null;

        /**
         * Comma-separated listing revision status values used to filter OpenSearch admin listing
         * revision results.
         *
         * @param statusCsv the value to set
         * @return this builder instance
         */
        public Builder statusCsv(String statusCsv) {
            this.statusCsv = statusCsv;
            return this;
        }

        /** Product value used to filter OpenSearch admin listing revision results. */
        private String product = null;

        /**
         * Product value used to filter OpenSearch admin listing revision results.
         *
         * @param product the value to set
         * @return this builder instance
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /** Filters data created after the specified date. */
        private java.util.Date timeCreatedAfter = null;

        /**
         * Filters data created after the specified date.
         *
         * @param timeCreatedAfter the value to set
         * @return this builder instance
         */
        public Builder timeCreatedAfter(java.util.Date timeCreatedAfter) {
            this.timeCreatedAfter = timeCreatedAfter;
            return this;
        }

        /** Filters data updated after the specified date. */
        private java.util.Date timeUpdatedAfter = null;

        /**
         * Filters data updated after the specified date.
         *
         * @param timeUpdatedAfter the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedAfter(java.util.Date timeUpdatedAfter) {
            this.timeUpdatedAfter = timeUpdatedAfter;
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
        private com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for timeUpdated is descending. Default order for displayName
         * is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for timeUpdated is descending. Default order for displayName
         * is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Optional pricing type filter for listing admin listing revisions. This filter is only
         * applied when dataSource is opensearch.
         */
        private String pricingType = null;

        /**
         * Optional pricing type filter for listing admin listing revisions. This filter is only
         * applied when dataSource is opensearch.
         *
         * @param pricingType the value to set
         * @return this builder instance
         */
        public Builder pricingType(String pricingType) {
            this.pricingType = pricingType;
            return this;
        }

        /**
         * Optional private offer enabled filter for listing admin listing revisions. This filter is
         * only applied when dataSource is opensearch.
         */
        private Boolean isPrivateOfferEnabled = null;

        /**
         * Optional private offer enabled filter for listing admin listing revisions. This filter is
         * only applied when dataSource is opensearch.
         *
         * @param isPrivateOfferEnabled the value to set
         * @return this builder instance
         */
        public Builder isPrivateOfferEnabled(Boolean isPrivateOfferEnabled) {
            this.isPrivateOfferEnabled = isPrivateOfferEnabled;
            return this;
        }

        /**
         * Optional source for listing admin listing revisions. Use opensearch to read from
         * OpenSearch.
         */
        private String dataSource = null;

        /**
         * Optional source for listing admin listing revisions. Use opensearch to read from
         * OpenSearch.
         *
         * @param dataSource the value to set
         * @return this builder instance
         */
        public Builder dataSource(String dataSource) {
            this.dataSource = dataSource;
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
        public Builder copy(ListAdminListingRevisionsRequest o) {
            listingId(o.getListingId());
            compartmentId(o.getCompartmentId());
            listingType(o.getListingType());
            displayName(o.getDisplayName());
            publisherId(o.getPublisherId());
            lifecycleState(o.getLifecycleState());
            listingRevisionStatus(o.getListingRevisionStatus());
            statusCsv(o.getStatusCsv());
            product(o.getProduct());
            timeCreatedAfter(o.getTimeCreatedAfter());
            timeUpdatedAfter(o.getTimeUpdatedAfter());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            pricingType(o.getPricingType());
            isPrivateOfferEnabled(o.getIsPrivateOfferEnabled());
            dataSource(o.getDataSource());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAdminListingRevisionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAdminListingRevisionsRequest
         */
        public ListAdminListingRevisionsRequest build() {
            ListAdminListingRevisionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAdminListingRevisionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAdminListingRevisionsRequest
         */
        public ListAdminListingRevisionsRequest buildWithoutInvocationCallback() {
            ListAdminListingRevisionsRequest request = new ListAdminListingRevisionsRequest();
            request.listingId = listingId;
            request.compartmentId = compartmentId;
            request.listingType = listingType;
            request.displayName = displayName;
            request.publisherId = publisherId;
            request.lifecycleState = lifecycleState;
            request.listingRevisionStatus = listingRevisionStatus;
            request.statusCsv = statusCsv;
            request.product = product;
            request.timeCreatedAfter = timeCreatedAfter;
            request.timeUpdatedAfter = timeUpdatedAfter;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.pricingType = pricingType;
            request.isPrivateOfferEnabled = isPrivateOfferEnabled;
            request.dataSource = dataSource;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAdminListingRevisionsRequest(listingId, compartmentId, listingType,
            // displayName, publisherId, lifecycleState, listingRevisionStatus, statusCsv, product,
            // timeCreatedAfter, timeUpdatedAfter, limit, page, sortOrder, sortBy, pricingType,
            // isPrivateOfferEnabled, dataSource, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .listingId(listingId)
                .compartmentId(compartmentId)
                .listingType(listingType)
                .displayName(displayName)
                .publisherId(publisherId)
                .lifecycleState(lifecycleState)
                .listingRevisionStatus(listingRevisionStatus)
                .statusCsv(statusCsv)
                .product(product)
                .timeCreatedAfter(timeCreatedAfter)
                .timeUpdatedAfter(timeUpdatedAfter)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .pricingType(pricingType)
                .isPrivateOfferEnabled(isPrivateOfferEnabled)
                .dataSource(dataSource)
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
        sb.append(",listingId=").append(String.valueOf(this.listingId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",listingType=").append(String.valueOf(this.listingType));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",publisherId=").append(String.valueOf(this.publisherId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",listingRevisionStatus=").append(String.valueOf(this.listingRevisionStatus));
        sb.append(",statusCsv=").append(String.valueOf(this.statusCsv));
        sb.append(",product=").append(String.valueOf(this.product));
        sb.append(",timeCreatedAfter=").append(String.valueOf(this.timeCreatedAfter));
        sb.append(",timeUpdatedAfter=").append(String.valueOf(this.timeUpdatedAfter));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",pricingType=").append(String.valueOf(this.pricingType));
        sb.append(",isPrivateOfferEnabled=").append(String.valueOf(this.isPrivateOfferEnabled));
        sb.append(",dataSource=").append(String.valueOf(this.dataSource));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAdminListingRevisionsRequest)) {
            return false;
        }

        ListAdminListingRevisionsRequest other = (ListAdminListingRevisionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.listingRevisionStatus, other.listingRevisionStatus)
                && java.util.Objects.equals(this.statusCsv, other.statusCsv)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.timeCreatedAfter, other.timeCreatedAfter)
                && java.util.Objects.equals(this.timeUpdatedAfter, other.timeUpdatedAfter)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.isPrivateOfferEnabled, other.isPrivateOfferEnabled)
                && java.util.Objects.equals(this.dataSource, other.dataSource)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.listingRevisionStatus == null
                                ? 43
                                : this.listingRevisionStatus.hashCode());
        result = (result * PRIME) + (this.statusCsv == null ? 43 : this.statusCsv.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedAfter == null ? 43 : this.timeCreatedAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedAfter == null ? 43 : this.timeUpdatedAfter.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrivateOfferEnabled == null
                                ? 43
                                : this.isPrivateOfferEnabled.hashCode());
        result = (result * PRIME) + (this.dataSource == null ? 43 : this.dataSource.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
