/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.requests;

import com.oracle.bmc.cloudbridge.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudbridge/AnalyzeAssetsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AnalyzeAssetsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class AnalyzeAssetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** An array of properties on which to aggregate. */
    private java.util.List<String> aggregationProperties;

    /** An array of properties on which to aggregate. */
    public java.util.List<String> getAggregationProperties() {
        return aggregationProperties;
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
    /** A filter to return only assets whose lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState;

    /** A filter to return only assets whose lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.cloudbridge.model.Asset.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** Source key from where the assets originate. */
    private String sourceKey;

    /** Source key from where the assets originate. */
    public String getSourceKey() {
        return sourceKey;
    }
    /** External asset key. */
    private String externalAssetKey;

    /** External asset key. */
    public String getExternalAssetKey() {
        return externalAssetKey;
    }
    /** The type of asset. */
    private com.oracle.bmc.cloudbridge.model.AssetType assetType;

    /** The type of asset. */
    public com.oracle.bmc.cloudbridge.model.AssetType getAssetType() {
        return assetType;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.cloudbridge.model.SortOrders sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.cloudbridge.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The dimensions in which to group the aggregations. */
    private java.util.List<String> groupBy;

    /** The dimensions in which to group the aggregations. */
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }
    /** Unique Inventory identifier. */
    private String inventoryId;

    /** Unique Inventory identifier. */
    public String getInventoryId() {
        return inventoryId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AnalyzeAssetsRequest, java.lang.Void> {
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

        /** An array of properties on which to aggregate. */
        private java.util.List<String> aggregationProperties = null;

        /**
         * An array of properties on which to aggregate.
         *
         * @param aggregationProperties the value to set
         * @return this builder instance
         */
        public Builder aggregationProperties(java.util.List<String> aggregationProperties) {
            this.aggregationProperties = aggregationProperties;
            return this;
        }

        /**
         * Singular setter. An array of properties on which to aggregate.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder aggregationProperties(String singularValue) {
            return this.aggregationProperties(java.util.Arrays.asList(singularValue));
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

        /** A filter to return only assets whose lifecycleState matches the given lifecycleState. */
        private com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState = null;

        /**
         * A filter to return only assets whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.cloudbridge.model.Asset.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** Source key from where the assets originate. */
        private String sourceKey = null;

        /**
         * Source key from where the assets originate.
         *
         * @param sourceKey the value to set
         * @return this builder instance
         */
        public Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            return this;
        }

        /** External asset key. */
        private String externalAssetKey = null;

        /**
         * External asset key.
         *
         * @param externalAssetKey the value to set
         * @return this builder instance
         */
        public Builder externalAssetKey(String externalAssetKey) {
            this.externalAssetKey = externalAssetKey;
            return this;
        }

        /** The type of asset. */
        private com.oracle.bmc.cloudbridge.model.AssetType assetType = null;

        /**
         * The type of asset.
         *
         * @param assetType the value to set
         * @return this builder instance
         */
        public Builder assetType(com.oracle.bmc.cloudbridge.model.AssetType assetType) {
            this.assetType = assetType;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.cloudbridge.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudbridge.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
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

        /** The dimensions in which to group the aggregations. */
        private java.util.List<String> groupBy = null;

        /**
         * The dimensions in which to group the aggregations.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Singular setter. The dimensions in which to group the aggregations.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder groupBy(String singularValue) {
            return this.groupBy(java.util.Arrays.asList(singularValue));
        }

        /** Unique Inventory identifier. */
        private String inventoryId = null;

        /**
         * Unique Inventory identifier.
         *
         * @param inventoryId the value to set
         * @return this builder instance
         */
        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
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
        public Builder copy(AnalyzeAssetsRequest o) {
            compartmentId(o.getCompartmentId());
            aggregationProperties(o.getAggregationProperties());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sourceKey(o.getSourceKey());
            externalAssetKey(o.getExternalAssetKey());
            assetType(o.getAssetType());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            groupBy(o.getGroupBy());
            inventoryId(o.getInventoryId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AnalyzeAssetsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AnalyzeAssetsRequest
         */
        public AnalyzeAssetsRequest build() {
            AnalyzeAssetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of AnalyzeAssetsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AnalyzeAssetsRequest
         */
        public AnalyzeAssetsRequest buildWithoutInvocationCallback() {
            AnalyzeAssetsRequest request = new AnalyzeAssetsRequest();
            request.compartmentId = compartmentId;
            request.aggregationProperties = aggregationProperties;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sourceKey = sourceKey;
            request.externalAssetKey = externalAssetKey;
            request.assetType = assetType;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.groupBy = groupBy;
            request.inventoryId = inventoryId;
            return request;
            // new AnalyzeAssetsRequest(compartmentId, aggregationProperties, limit, page,
            // lifecycleState, sourceKey, externalAssetKey, assetType, sortOrder, opcRequestId,
            // groupBy, inventoryId);
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
                .aggregationProperties(aggregationProperties)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sourceKey(sourceKey)
                .externalAssetKey(externalAssetKey)
                .assetType(assetType)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .groupBy(groupBy)
                .inventoryId(inventoryId);
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
        sb.append(",aggregationProperties=").append(String.valueOf(this.aggregationProperties));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(",externalAssetKey=").append(String.valueOf(this.externalAssetKey));
        sb.append(",assetType=").append(String.valueOf(this.assetType));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeAssetsRequest)) {
            return false;
        }

        AnalyzeAssetsRequest other = (AnalyzeAssetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.aggregationProperties, other.aggregationProperties)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && java.util.Objects.equals(this.externalAssetKey, other.externalAssetKey)
                && java.util.Objects.equals(this.assetType, other.assetType)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId);
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
                        + (this.aggregationProperties == null
                                ? 43
                                : this.aggregationProperties.hashCode());
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
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.inventoryId == null ? 43 : this.inventoryId.hashCode());
        return result;
    }
}
