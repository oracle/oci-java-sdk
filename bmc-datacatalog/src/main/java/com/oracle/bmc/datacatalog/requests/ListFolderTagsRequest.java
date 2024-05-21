/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListFolderTagsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFolderTagsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListFolderTagsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique catalog identifier.
     */
    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Unique data asset key.
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /**
     * Unique folder key.
     */
    private String folderKey;

    /**
     * Unique folder key.
     */
    public String getFolderKey() {
        return folderKey;
    }
    /**
     * Immutable resource name.
     */
    private String name;

    /**
     * Immutable resource name.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    public com.oracle.bmc.datacatalog.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Unique key of the related term.
     */
    private String termKey;

    /**
     * Unique key of the related term.
     */
    public String getTermKey() {
        return termKey;
    }
    /**
     * Path of the related term.
     */
    private String termPath;

    /**
     * Path of the related term.
     */
    public String getTermPath() {
        return termPath;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who created the resource.
     */
    public String getCreatedById() {
        return createdById;
    }
    /**
     * Specifies the fields to return in a folder tag summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a folder tag summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        Name("name"),
        TermKey("termKey"),
        TermPath("termPath"),
        TermDescription("termDescription"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        Uri("uri"),
        GlossaryKey("glossaryKey"),
        FolderKey("folderKey"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * Specifies the fields to return in a folder tag summary response.
     *
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
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
                    ListFolderTagsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique catalog identifier.
         */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Unique data asset key.
         */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * Unique folder key.
         */
        private String folderKey = null;

        /**
         * Unique folder key.
         * @param folderKey the value to set
         * @return this builder instance
         */
        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            return this;
        }

        /**
         * Immutable resource name.
         */
        private String name = null;

        /**
         * Immutable resource name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         */
        private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Unique key of the related term.
         */
        private String termKey = null;

        /**
         * Unique key of the related term.
         * @param termKey the value to set
         * @return this builder instance
         */
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            return this;
        }

        /**
         * Path of the related term.
         */
        private String termPath = null;

        /**
         * Path of the related term.
         * @param termPath the value to set
         * @return this builder instance
         */
        public Builder termPath(String termPath) {
            this.termPath = termPath;
            return this;
        }

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        /**
         * OCID of the user who created the resource.
         */
        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         * @param createdById the value to set
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        /**
         * Specifies the fields to return in a folder tag summary response.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a folder tag summary response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a folder tag summary response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
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
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListFolderTagsRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            folderKey(o.getFolderKey());
            name(o.getName());
            lifecycleState(o.getLifecycleState());
            termKey(o.getTermKey());
            termPath(o.getTermPath());
            timeCreated(o.getTimeCreated());
            createdById(o.getCreatedById());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFolderTagsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFolderTagsRequest
         */
        public ListFolderTagsRequest build() {
            ListFolderTagsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFolderTagsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFolderTagsRequest
         */
        public ListFolderTagsRequest buildWithoutInvocationCallback() {
            ListFolderTagsRequest request = new ListFolderTagsRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.folderKey = folderKey;
            request.name = name;
            request.lifecycleState = lifecycleState;
            request.termKey = termKey;
            request.termPath = termPath;
            request.timeCreated = timeCreated;
            request.createdById = createdById;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFolderTagsRequest(catalogId, dataAssetKey, folderKey, name, lifecycleState, termKey, termPath, timeCreated, createdById, fields, sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .dataAssetKey(dataAssetKey)
                .folderKey(folderKey)
                .name(name)
                .lifecycleState(lifecycleState)
                .termKey(termKey)
                .termPath(termPath)
                .timeCreated(timeCreated)
                .createdById(createdById)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",folderKey=").append(String.valueOf(this.folderKey));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",termKey=").append(String.valueOf(this.termKey));
        sb.append(",termPath=").append(String.valueOf(this.termPath));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFolderTagsRequest)) {
            return false;
        }

        ListFolderTagsRequest other = (ListFolderTagsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termPath, other.termPath)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result = (result * PRIME) + (this.termPath == null ? 43 : this.termPath.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
