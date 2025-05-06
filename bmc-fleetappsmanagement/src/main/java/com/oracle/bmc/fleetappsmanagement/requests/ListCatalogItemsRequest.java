/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListCatalogItemsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCatalogItemsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class ListCatalogItemsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [ConfigSourceType](https://docs.oracle.com/iaas/definitions/CatalogItem/configSourceType)
     * Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, URL_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     */
    private String configSourceType;

    /**
     * The [ConfigSourceType](https://docs.oracle.com/iaas/definitions/CatalogItem/configSourceType)
     * Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, URL_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     */
    public String getConfigSourceType() {
        return configSourceType;
    }
    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide only one sort by. Default value for {@code timeCreated}
     * is descending. Default order for {@code displayName} is ascending
     */
    private com.oracle.bmc.fleetappsmanagement.model.CatalogItemSortBy sortBy;

    /**
     * The field to sort by. You can provide only one sort by. Default value for {@code timeCreated}
     * is descending. Default order for {@code displayName} is ascending
     */
    public com.oracle.bmc.fleetappsmanagement.model.CatalogItemSortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * catalogListingId of the package. This is an integer whose min and max length are specified.
     */
    private String catalogListingId;

    /**
     * catalogListingId of the package. This is an integer whose min and max length are specified.
     */
    public String getCatalogListingId() {
        return catalogListingId;
    }
    /**
     * Parameter to list all catalog items only with latest version or list all catalog items with
     * all versions.
     */
    private com.oracle.bmc.fleetappsmanagement.model.CatalogListingVersionCriteriaEnum
            catalogListingVersionCriteria;

    /**
     * Parameter to list all catalog items only with latest version or list all catalog items with
     * all versions.
     */
    public com.oracle.bmc.fleetappsmanagement.model.CatalogListingVersionCriteriaEnum
            getCatalogListingVersionCriteria() {
        return catalogListingVersionCriteria;
    }
    /**
     * The indicator to append Public Items from the root compartment to any query, when set to
     * TRUE.
     */
    private Boolean shouldListPublicItems;

    /**
     * The indicator to append Public Items from the root compartment to any query, when set to
     * TRUE.
     */
    public Boolean getShouldListPublicItems() {
        return shouldListPublicItems;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCatalogItemsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The
         * [ConfigSourceType](https://docs.oracle.com/iaas/definitions/CatalogItem/configSourceType)
         * Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, URL_CATALOG_SOURCE,
         * MARKETPLACE_CATALOG_SOURCE.
         */
        private String configSourceType = null;

        /**
         * The
         * [ConfigSourceType](https://docs.oracle.com/iaas/definitions/CatalogItem/configSourceType)
         * Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, URL_CATALOG_SOURCE,
         * MARKETPLACE_CATALOG_SOURCE.
         *
         * @param configSourceType the value to set
         * @return this builder instance
         */
        public Builder configSourceType(String configSourceType) {
            this.configSourceType = configSourceType;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
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
         * The field to sort by. You can provide only one sort by. Default value for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending
         */
        private com.oracle.bmc.fleetappsmanagement.model.CatalogItemSortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort by. Default value for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.fleetappsmanagement.model.CatalogItemSortBy sortBy) {
            this.sortBy = sortBy;
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
         * catalogListingId of the package. This is an integer whose min and max length are
         * specified.
         */
        private String catalogListingId = null;

        /**
         * catalogListingId of the package. This is an integer whose min and max length are
         * specified.
         *
         * @param catalogListingId the value to set
         * @return this builder instance
         */
        public Builder catalogListingId(String catalogListingId) {
            this.catalogListingId = catalogListingId;
            return this;
        }

        /**
         * Parameter to list all catalog items only with latest version or list all catalog items
         * with all versions.
         */
        private com.oracle.bmc.fleetappsmanagement.model.CatalogListingVersionCriteriaEnum
                catalogListingVersionCriteria = null;

        /**
         * Parameter to list all catalog items only with latest version or list all catalog items
         * with all versions.
         *
         * @param catalogListingVersionCriteria the value to set
         * @return this builder instance
         */
        public Builder catalogListingVersionCriteria(
                com.oracle.bmc.fleetappsmanagement.model.CatalogListingVersionCriteriaEnum
                        catalogListingVersionCriteria) {
            this.catalogListingVersionCriteria = catalogListingVersionCriteria;
            return this;
        }

        /**
         * The indicator to append Public Items from the root compartment to any query, when set to
         * TRUE.
         */
        private Boolean shouldListPublicItems = null;

        /**
         * The indicator to append Public Items from the root compartment to any query, when set to
         * TRUE.
         *
         * @param shouldListPublicItems the value to set
         * @return this builder instance
         */
        public Builder shouldListPublicItems(Boolean shouldListPublicItems) {
            this.shouldListPublicItems = shouldListPublicItems;
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
        public Builder copy(ListCatalogItemsRequest o) {
            compartmentId(o.getCompartmentId());
            configSourceType(o.getConfigSourceType());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            catalogListingId(o.getCatalogListingId());
            catalogListingVersionCriteria(o.getCatalogListingVersionCriteria());
            shouldListPublicItems(o.getShouldListPublicItems());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCatalogItemsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCatalogItemsRequest
         */
        public ListCatalogItemsRequest build() {
            ListCatalogItemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCatalogItemsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCatalogItemsRequest
         */
        public ListCatalogItemsRequest buildWithoutInvocationCallback() {
            ListCatalogItemsRequest request = new ListCatalogItemsRequest();
            request.compartmentId = compartmentId;
            request.configSourceType = configSourceType;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.catalogListingId = catalogListingId;
            request.catalogListingVersionCriteria = catalogListingVersionCriteria;
            request.shouldListPublicItems = shouldListPublicItems;
            return request;
            // new ListCatalogItemsRequest(compartmentId, configSourceType, lifecycleState,
            // sortOrder, sortBy, displayName, limit, page, opcRequestId, catalogListingId,
            // catalogListingVersionCriteria, shouldListPublicItems);
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
                .configSourceType(configSourceType)
                .lifecycleState(lifecycleState)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .catalogListingId(catalogListingId)
                .catalogListingVersionCriteria(catalogListingVersionCriteria)
                .shouldListPublicItems(shouldListPublicItems);
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
        sb.append(",configSourceType=").append(String.valueOf(this.configSourceType));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",catalogListingId=").append(String.valueOf(this.catalogListingId));
        sb.append(",catalogListingVersionCriteria=")
                .append(String.valueOf(this.catalogListingVersionCriteria));
        sb.append(",shouldListPublicItems=").append(String.valueOf(this.shouldListPublicItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCatalogItemsRequest)) {
            return false;
        }

        ListCatalogItemsRequest other = (ListCatalogItemsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configSourceType, other.configSourceType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.catalogListingId, other.catalogListingId)
                && java.util.Objects.equals(
                        this.catalogListingVersionCriteria, other.catalogListingVersionCriteria)
                && java.util.Objects.equals(
                        this.shouldListPublicItems, other.shouldListPublicItems);
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
                        + (this.configSourceType == null ? 43 : this.configSourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogListingId == null ? 43 : this.catalogListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogListingVersionCriteria == null
                                ? 43
                                : this.catalogListingVersionCriteria.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldListPublicItems == null
                                ? 43
                                : this.shouldListPublicItems.hashCode());
        return result;
    }
}
