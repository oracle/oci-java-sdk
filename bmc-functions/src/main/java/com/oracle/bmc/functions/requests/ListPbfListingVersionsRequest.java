/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/ListPbfListingVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListPbfListingVersionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListPbfListingVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique PbfListing identifier */
    private String pbfListingId;

    /** unique PbfListing identifier */
    public String getPbfListingId() {
        return pbfListingId;
    }
    /** unique PbfListingVersion identifier */
    private String pbfListingVersionId;

    /** unique PbfListingVersion identifier */
    public String getPbfListingVersionId() {
        return pbfListingVersionId;
    }
    /**
     * Matches a PbfListingVersion based on a provided semantic version name for a
     * PbfListingVersion. Each PbfListingVersion name is unique with respect to its associated
     * PbfListing.
     */
    private String name;

    /**
     * Matches a PbfListingVersion based on a provided semantic version name for a
     * PbfListingVersion. Each PbfListingVersion name is unique with respect to its associated
     * PbfListing.
     */
    public String getName() {
        return name;
    }
    /**
     * Matches the current version (the most recently added version with an Active lifecycleState)
     * associated with a PbfListing.
     */
    private Boolean isCurrentVersion;

    /**
     * Matches the current version (the most recently added version with an Active lifecycleState)
     * associated with a PbfListing.
     */
    public Boolean getIsCurrentVersion() {
        return isCurrentVersion;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.functions.model.PbfListingVersion.LifecycleState lifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.functions.model.PbfListingVersion.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     *
     * <p>Default: 10
     */
    private Integer limit;

    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     *
     * <p>Default: 10
     */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token for a list query returned by a previous operation */
    private String page;

    /** The pagination token for a list query returned by a previous operation */
    public String getPage() {
        return page;
    }
    /**
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Specifies sort order.
     *
     * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for name is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for name is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        Name("name"),
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
     * descending. Default order for name is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPbfListingVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique PbfListing identifier */
        private String pbfListingId = null;

        /**
         * unique PbfListing identifier
         *
         * @param pbfListingId the value to set
         * @return this builder instance
         */
        public Builder pbfListingId(String pbfListingId) {
            this.pbfListingId = pbfListingId;
            return this;
        }

        /** unique PbfListingVersion identifier */
        private String pbfListingVersionId = null;

        /**
         * unique PbfListingVersion identifier
         *
         * @param pbfListingVersionId the value to set
         * @return this builder instance
         */
        public Builder pbfListingVersionId(String pbfListingVersionId) {
            this.pbfListingVersionId = pbfListingVersionId;
            return this;
        }

        /**
         * Matches a PbfListingVersion based on a provided semantic version name for a
         * PbfListingVersion. Each PbfListingVersion name is unique with respect to its associated
         * PbfListing.
         */
        private String name = null;

        /**
         * Matches a PbfListingVersion based on a provided semantic version name for a
         * PbfListingVersion. Each PbfListingVersion name is unique with respect to its associated
         * PbfListing.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Matches the current version (the most recently added version with an Active
         * lifecycleState) associated with a PbfListing.
         */
        private Boolean isCurrentVersion = null;

        /**
         * Matches the current version (the most recently added version with an Active
         * lifecycleState) associated with a PbfListing.
         *
         * @param isCurrentVersion the value to set
         * @return this builder instance
         */
        public Builder isCurrentVersion(Boolean isCurrentVersion) {
            this.isCurrentVersion = isCurrentVersion;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.functions.model.PbfListingVersion.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.functions.model.PbfListingVersion.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         *
         * <p>Default: 10
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         *
         * <p>Default: 10
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token for a list query returned by a previous operation */
        private String page = null;

        /**
         * The pagination token for a list query returned by a previous operation
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Specifies sort order.
         *
         * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order.
         *
         * <p>**ASC:** Ascending sort order. * **DESC:** Descending sort order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for name is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for name is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(ListPbfListingVersionsRequest o) {
            pbfListingId(o.getPbfListingId());
            pbfListingVersionId(o.getPbfListingVersionId());
            name(o.getName());
            isCurrentVersion(o.getIsCurrentVersion());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListPbfListingVersionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPbfListingVersionsRequest
         */
        public ListPbfListingVersionsRequest build() {
            ListPbfListingVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPbfListingVersionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPbfListingVersionsRequest
         */
        public ListPbfListingVersionsRequest buildWithoutInvocationCallback() {
            ListPbfListingVersionsRequest request = new ListPbfListingVersionsRequest();
            request.pbfListingId = pbfListingId;
            request.pbfListingVersionId = pbfListingVersionId;
            request.name = name;
            request.isCurrentVersion = isCurrentVersion;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPbfListingVersionsRequest(pbfListingId, pbfListingVersionId, name,
            // isCurrentVersion, lifecycleState, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pbfListingId(pbfListingId)
                .pbfListingVersionId(pbfListingVersionId)
                .name(name)
                .isCurrentVersion(isCurrentVersion)
                .lifecycleState(lifecycleState)
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
        sb.append(",pbfListingId=").append(String.valueOf(this.pbfListingId));
        sb.append(",pbfListingVersionId=").append(String.valueOf(this.pbfListingVersionId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",isCurrentVersion=").append(String.valueOf(this.isCurrentVersion));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListPbfListingVersionsRequest)) {
            return false;
        }

        ListPbfListingVersionsRequest other = (ListPbfListingVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pbfListingId, other.pbfListingId)
                && java.util.Objects.equals(this.pbfListingVersionId, other.pbfListingVersionId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isCurrentVersion, other.isCurrentVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.pbfListingId == null ? 43 : this.pbfListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.pbfListingVersionId == null
                                ? 43
                                : this.pbfListingVersionId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.isCurrentVersion == null ? 43 : this.isCurrentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
