/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/ListBdsMetastoreConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBdsMetastoreConfigurationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class ListBdsMetastoreConfigurationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the cluster.
     */
    private String bdsInstanceId;

    /**
     * The OCID of the cluster.
     */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /**
     * The type of the metastore in the metastore configuration
     */
    private com.oracle.bmc.bds.model.BdsMetastoreConfiguration.MetastoreType metastoreType;

    /**
     * The type of the metastore in the metastore configuration
     */
    public com.oracle.bmc.bds.model.BdsMetastoreConfiguration.MetastoreType getMetastoreType() {
        return metastoreType;
    }
    /**
     * The OCID of the Data Catalog metastore in the metastore configuration
     */
    private String metastoreId;

    /**
     * The OCID of the Data Catalog metastore in the metastore configuration
     */
    public String getMetastoreId() {
        return metastoreId;
    }
    /**
     * The lifecycle state of the metastore in the metastore configuration
     */
    private com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the metastore in the metastore configuration
     */
    public com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The ID of the API key that is associated with the external metastore in the metastore configuration
     */
    private String bdsApiKeyId;

    /**
     * The ID of the API key that is associated with the external metastore in the metastore configuration
     */
    public String getBdsApiKeyId() {
        return bdsApiKeyId;
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.bds.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.bds.model.SortOrders getSortOrder() {
        return sortOrder;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBdsMetastoreConfigurationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the cluster.
         */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /**
         * The type of the metastore in the metastore configuration
         */
        private com.oracle.bmc.bds.model.BdsMetastoreConfiguration.MetastoreType metastoreType =
                null;

        /**
         * The type of the metastore in the metastore configuration
         * @param metastoreType the value to set
         * @return this builder instance
         */
        public Builder metastoreType(
                com.oracle.bmc.bds.model.BdsMetastoreConfiguration.MetastoreType metastoreType) {
            this.metastoreType = metastoreType;
            return this;
        }

        /**
         * The OCID of the Data Catalog metastore in the metastore configuration
         */
        private String metastoreId = null;

        /**
         * The OCID of the Data Catalog metastore in the metastore configuration
         * @param metastoreId the value to set
         * @return this builder instance
         */
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            return this;
        }

        /**
         * The lifecycle state of the metastore in the metastore configuration
         */
        private com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState lifecycleState =
                null;

        /**
         * The lifecycle state of the metastore in the metastore configuration
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The ID of the API key that is associated with the external metastore in the metastore configuration
         */
        private String bdsApiKeyId = null;

        /**
         * The ID of the API key that is associated with the external metastore in the metastore configuration
         * @param bdsApiKeyId the value to set
         * @return this builder instance
         */
        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.bds.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.bds.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListBdsMetastoreConfigurationsRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            metastoreType(o.getMetastoreType());
            metastoreId(o.getMetastoreId());
            lifecycleState(o.getLifecycleState());
            bdsApiKeyId(o.getBdsApiKeyId());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBdsMetastoreConfigurationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBdsMetastoreConfigurationsRequest
         */
        public ListBdsMetastoreConfigurationsRequest build() {
            ListBdsMetastoreConfigurationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBdsMetastoreConfigurationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBdsMetastoreConfigurationsRequest
         */
        public ListBdsMetastoreConfigurationsRequest buildWithoutInvocationCallback() {
            ListBdsMetastoreConfigurationsRequest request =
                    new ListBdsMetastoreConfigurationsRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.metastoreType = metastoreType;
            request.metastoreId = metastoreId;
            request.lifecycleState = lifecycleState;
            request.bdsApiKeyId = bdsApiKeyId;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListBdsMetastoreConfigurationsRequest(bdsInstanceId, metastoreType, metastoreId, lifecycleState, bdsApiKeyId, page, limit, sortBy, sortOrder, displayName, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .metastoreType(metastoreType)
                .metastoreId(metastoreId)
                .lifecycleState(lifecycleState)
                .bdsApiKeyId(bdsApiKeyId)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .displayName(displayName)
                .opcRequestId(opcRequestId);
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",metastoreType=").append(String.valueOf(this.metastoreType));
        sb.append(",metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",bdsApiKeyId=").append(String.valueOf(this.bdsApiKeyId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBdsMetastoreConfigurationsRequest)) {
            return false;
        }

        ListBdsMetastoreConfigurationsRequest other = (ListBdsMetastoreConfigurationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.metastoreType, other.metastoreType)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.bdsApiKeyId, other.bdsApiKeyId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.metastoreType == null ? 43 : this.metastoreType.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.bdsApiKeyId == null ? 43 : this.bdsApiKeyId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
