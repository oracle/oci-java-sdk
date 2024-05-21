/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.requests;

import com.oracle.bmc.cloudbridge.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudbridge/ListAssetsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAssetsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class ListAssetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return only assets whose lifecycleState matches the given lifecycleState.
     */
    private com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState;

    /**
     * A filter to return only assets whose lifecycleState matches the given lifecycleState.
     */
    public com.oracle.bmc.cloudbridge.model.Asset.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Source key from where the assets originate.
     */
    private String sourceKey;

    /**
     * Source key from where the assets originate.
     */
    public String getSourceKey() {
        return sourceKey;
    }
    /**
     * External asset key.
     */
    private String externalAssetKey;

    /**
     * External asset key.
     */
    public String getExternalAssetKey() {
        return externalAssetKey;
    }
    /**
     * The type of asset.
     */
    private com.oracle.bmc.cloudbridge.model.AssetType assetType;

    /**
     * The type of asset.
     */
    public com.oracle.bmc.cloudbridge.model.AssetType getAssetType() {
        return assetType;
    }
    /**
     * Unique asset identifier.
     */
    private String assetId;

    /**
     * Unique asset identifier.
     */
    public String getAssetId() {
        return assetId;
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
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.cloudbridge.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.cloudbridge.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     **/
    public enum SortBy {
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
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
    /**
     * Unique Inventory identifier.
     */
    private String inventoryId;

    /**
     * Unique Inventory identifier.
     */
    public String getInventoryId() {
        return inventoryId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAssetsRequest, java.lang.Void> {
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
         * A filter to return only assets whose lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState = null;

        /**
         * A filter to return only assets whose lifecycleState matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Source key from where the assets originate.
         */
        private String sourceKey = null;

        /**
         * Source key from where the assets originate.
         * @param sourceKey the value to set
         * @return this builder instance
         */
        public Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            return this;
        }

        /**
         * External asset key.
         */
        private String externalAssetKey = null;

        /**
         * External asset key.
         * @param externalAssetKey the value to set
         * @return this builder instance
         */
        public Builder externalAssetKey(String externalAssetKey) {
            this.externalAssetKey = externalAssetKey;
            return this;
        }

        /**
         * The type of asset.
         */
        private com.oracle.bmc.cloudbridge.model.AssetType assetType = null;

        /**
         * The type of asset.
         * @param assetType the value to set
         * @return this builder instance
         */
        public Builder assetType(com.oracle.bmc.cloudbridge.model.AssetType assetType) {
            this.assetType = assetType;
            return this;
        }

        /**
         * Unique asset identifier.
         */
        private String assetId = null;

        /**
         * Unique asset identifier.
         * @param assetId the value to set
         * @return this builder instance
         */
        public Builder assetId(String assetId) {
            this.assetId = assetId;
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
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.cloudbridge.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudbridge.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
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
         * Unique Inventory identifier.
         */
        private String inventoryId = null;

        /**
         * Unique Inventory identifier.
         * @param inventoryId the value to set
         * @return this builder instance
         */
        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
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
        public Builder copy(ListAssetsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sourceKey(o.getSourceKey());
            externalAssetKey(o.getExternalAssetKey());
            assetType(o.getAssetType());
            assetId(o.getAssetId());
            displayName(o.getDisplayName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            inventoryId(o.getInventoryId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAssetsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAssetsRequest
         */
        public ListAssetsRequest build() {
            ListAssetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAssetsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAssetsRequest
         */
        public ListAssetsRequest buildWithoutInvocationCallback() {
            ListAssetsRequest request = new ListAssetsRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sourceKey = sourceKey;
            request.externalAssetKey = externalAssetKey;
            request.assetType = assetType;
            request.assetId = assetId;
            request.displayName = displayName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.inventoryId = inventoryId;
            return request;
            // new ListAssetsRequest(compartmentId, limit, page, lifecycleState, sourceKey, externalAssetKey, assetType, assetId, displayName, sortOrder, sortBy, opcRequestId, inventoryId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sourceKey(sourceKey)
                .externalAssetKey(externalAssetKey)
                .assetType(assetType)
                .assetId(assetId)
                .displayName(displayName)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .inventoryId(inventoryId);
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
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(",externalAssetKey=").append(String.valueOf(this.externalAssetKey));
        sb.append(",assetType=").append(String.valueOf(this.assetType));
        sb.append(",assetId=").append(String.valueOf(this.assetId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAssetsRequest)) {
            return false;
        }

        ListAssetsRequest other = (ListAssetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && java.util.Objects.equals(this.externalAssetKey, other.externalAssetKey)
                && java.util.Objects.equals(this.assetType, other.assetType)
                && java.util.Objects.equals(this.assetId, other.assetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalAssetKey == null ? 43 : this.externalAssetKey.hashCode());
        result = (result * PRIME) + (this.assetType == null ? 43 : this.assetType.hashCode());
        result = (result * PRIME) + (this.assetId == null ? 43 : this.assetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.inventoryId == null ? 43 : this.inventoryId.hashCode());
        return result;
    }
}
