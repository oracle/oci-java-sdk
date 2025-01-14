/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListCategoriesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCategoriesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListCategoriesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * A comma-separated list of category types used for filtering. Only categories of the specified
     * types will be returned.
     */
    private String categoryType;

    /**
     * A comma-separated list of category types used for filtering. Only categories of the specified
     * types will be returned.
     */
    public String getCategoryType() {
        return categoryType;
    }
    /**
     * The category display text used for filtering. Only categories matching the specified display
     * name or description will be returned.
     */
    private String categoryDisplayText;

    /**
     * The category display text used for filtering. Only categories matching the specified display
     * name or description will be returned.
     */
    public String getCategoryDisplayText() {
        return categoryDisplayText;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
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

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The attribute used to sort the returned categories */
    private SortBy sortBy;

    /** The attribute used to sort the returned categories */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        Type("type"),
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

    /** The attribute used to sort the returned categories */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    private String name;

    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    public String getName() {
        return name;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCategoriesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * A comma-separated list of category types used for filtering. Only categories of the
         * specified types will be returned.
         */
        private String categoryType = null;

        /**
         * A comma-separated list of category types used for filtering. Only categories of the
         * specified types will be returned.
         *
         * @param categoryType the value to set
         * @return this builder instance
         */
        public Builder categoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }

        /**
         * The category display text used for filtering. Only categories matching the specified
         * display name or description will be returned.
         */
        private String categoryDisplayText = null;

        /**
         * The category display text used for filtering. Only categories matching the specified
         * display name or description will be returned.
         *
         * @param categoryDisplayText the value to set
         * @return this builder instance
         */
        public Builder categoryDisplayText(String categoryDisplayText) {
            this.categoryDisplayText = categoryDisplayText;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The attribute used to sort the returned categories */
        private SortBy sortBy = null;

        /**
         * The attribute used to sort the returned categories
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         */
        private String name = null;

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
        public Builder copy(ListCategoriesRequest o) {
            namespaceName(o.getNamespaceName());
            categoryType(o.getCategoryType());
            categoryDisplayText(o.getCategoryDisplayText());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCategoriesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCategoriesRequest
         */
        public ListCategoriesRequest build() {
            ListCategoriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCategoriesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCategoriesRequest
         */
        public ListCategoriesRequest buildWithoutInvocationCallback() {
            ListCategoriesRequest request = new ListCategoriesRequest();
            request.namespaceName = namespaceName;
            request.categoryType = categoryType;
            request.categoryDisplayText = categoryDisplayText;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.name = name;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCategoriesRequest(namespaceName, categoryType, categoryDisplayText,
            // sortOrder, sortBy, limit, page, name, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .categoryType(categoryType)
                .categoryDisplayText(categoryDisplayText)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .limit(limit)
                .page(page)
                .name(name)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",categoryType=").append(String.valueOf(this.categoryType));
        sb.append(",categoryDisplayText=").append(String.valueOf(this.categoryDisplayText));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCategoriesRequest)) {
            return false;
        }

        ListCategoriesRequest other = (ListCategoriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.categoryType, other.categoryType)
                && java.util.Objects.equals(this.categoryDisplayText, other.categoryDisplayText)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.categoryType == null ? 43 : this.categoryType.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryDisplayText == null
                                ? 43
                                : this.categoryDisplayText.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
