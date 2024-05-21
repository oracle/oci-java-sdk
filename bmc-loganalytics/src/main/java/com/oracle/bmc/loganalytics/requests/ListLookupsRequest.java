/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLookupsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLookupsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLookupsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The lookup type.  Valid values are Lookup, Dictionary or Module.
     */
    private Type type;

    /**
     * The lookup type.  Valid values are Lookup, Dictionary or Module.
     **/
    public enum Type {
        Lookup("Lookup"),
        Dictionary("Dictionary"),
        Module("Module"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

    /**
     * The lookup type.  Valid values are Lookup, Dictionary or Module.
     */
    public Type getType() {
        return type;
    }
    /**
     * The lookup text used for filtering.  Only lookups with the specified name
     * or description will be returned.
     *
     */
    private String lookupDisplayText;

    /**
     * The lookup text used for filtering.  Only lookups with the specified name
     * or description will be returned.
     *
     */
    public String getLookupDisplayText() {
        return lookupDisplayText;
    }
    /**
     * The system value used for filtering.  Only items with the specified system value
     * will be returned.  Valid values are built in, custom (for user defined items), or
     * all (for all items, regardless of system value).
     *
     */
    private IsSystem isSystem;

    /**
     * The system value used for filtering.  Only items with the specified system value
     * will be returned.  Valid values are built in, custom (for user defined items), or
     * all (for all items, regardless of system value).
     *
     **/
    public enum IsSystem {
        All("ALL"),
        Custom("CUSTOM"),
        BuiltIn("BUILT_IN"),
        ;

        private final String value;
        private static java.util.Map<String, IsSystem> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSystem v : IsSystem.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsSystem(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSystem create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsSystem: " + key);
        }
    };

    /**
     * The system value used for filtering.  Only items with the specified system value
     * will be returned.  Valid values are built in, custom (for user defined items), or
     * all (for all items, regardless of system value).
     *
     */
    public IsSystem getIsSystem() {
        return isSystem;
    }
    /**
     * sort by field
     */
    private SortBy sortBy;

    /**
     * sort by field
     **/
    public enum SortBy {
        DisplayName("displayName"),
        Status("status"),
        Type("type"),
        UpdatedTime("updatedTime"),
        CreationType("creationType"),
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
     * sort by field
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The lookup status used for filtering when fetching a list of lookups.
     */
    private Status status;

    /**
     * The lookup status used for filtering when fetching a list of lookups.
     **/
    public enum Status {
        All("ALL"),
        Successful("SUCCESSFUL"),
        Failed("FAILED"),
        Inprogress("INPROGRESS"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };

    /**
     * The lookup status used for filtering when fetching a list of lookups.
     */
    public Status getStatus() {
        return status;
    }
    /**
     * A comma-separated list of categories used for filtering
     */
    private String categories;

    /**
     * A comma-separated list of categories used for filtering
     */
    public String getCategories() {
        return categories;
    }
    /**
     * A flag indicating whether or not to return OMC annotated or hidden lookups.
     *
     */
    private Boolean isHideSpecial;

    /**
     * A flag indicating whether or not to return OMC annotated or hidden lookups.
     *
     */
    public Boolean getIsHideSpecial() {
        return isHideSpecial;
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
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
                    ListLookupsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
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
         * The lookup type.  Valid values are Lookup, Dictionary or Module.
         */
        private Type type = null;

        /**
         * The lookup type.  Valid values are Lookup, Dictionary or Module.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        /**
         * The lookup text used for filtering.  Only lookups with the specified name
         * or description will be returned.
         *
         */
        private String lookupDisplayText = null;

        /**
         * The lookup text used for filtering.  Only lookups with the specified name
         * or description will be returned.
         *
         * @param lookupDisplayText the value to set
         * @return this builder instance
         */
        public Builder lookupDisplayText(String lookupDisplayText) {
            this.lookupDisplayText = lookupDisplayText;
            return this;
        }

        /**
         * The system value used for filtering.  Only items with the specified system value
         * will be returned.  Valid values are built in, custom (for user defined items), or
         * all (for all items, regardless of system value).
         *
         */
        private IsSystem isSystem = null;

        /**
         * The system value used for filtering.  Only items with the specified system value
         * will be returned.  Valid values are built in, custom (for user defined items), or
         * all (for all items, regardless of system value).
         *
         * @param isSystem the value to set
         * @return this builder instance
         */
        public Builder isSystem(IsSystem isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * sort by field
         */
        private SortBy sortBy = null;

        /**
         * sort by field
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The lookup status used for filtering when fetching a list of lookups.
         */
        private Status status = null;

        /**
         * The lookup status used for filtering when fetching a list of lookups.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * A comma-separated list of categories used for filtering
         */
        private String categories = null;

        /**
         * A comma-separated list of categories used for filtering
         * @param categories the value to set
         * @return this builder instance
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * A flag indicating whether or not to return OMC annotated or hidden lookups.
         *
         */
        private Boolean isHideSpecial = null;

        /**
         * A flag indicating whether or not to return OMC annotated or hidden lookups.
         *
         * @param isHideSpecial the value to set
         * @return this builder instance
         */
        public Builder isHideSpecial(Boolean isHideSpecial) {
            this.isHideSpecial = isHideSpecial;
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
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
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
        public Builder copy(ListLookupsRequest o) {
            namespaceName(o.getNamespaceName());
            type(o.getType());
            lookupDisplayText(o.getLookupDisplayText());
            isSystem(o.getIsSystem());
            sortBy(o.getSortBy());
            status(o.getStatus());
            categories(o.getCategories());
            isHideSpecial(o.getIsHideSpecial());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLookupsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLookupsRequest
         */
        public ListLookupsRequest build() {
            ListLookupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLookupsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLookupsRequest
         */
        public ListLookupsRequest buildWithoutInvocationCallback() {
            ListLookupsRequest request = new ListLookupsRequest();
            request.namespaceName = namespaceName;
            request.type = type;
            request.lookupDisplayText = lookupDisplayText;
            request.isSystem = isSystem;
            request.sortBy = sortBy;
            request.status = status;
            request.categories = categories;
            request.isHideSpecial = isHideSpecial;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLookupsRequest(namespaceName, type, lookupDisplayText, isSystem, sortBy, status, categories, isHideSpecial, limit, page, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .type(type)
                .lookupDisplayText(lookupDisplayText)
                .isSystem(isSystem)
                .sortBy(sortBy)
                .status(status)
                .categories(categories)
                .isHideSpecial(isHideSpecial)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",lookupDisplayText=").append(String.valueOf(this.lookupDisplayText));
        sb.append(",isSystem=").append(String.valueOf(this.isSystem));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",categories=").append(String.valueOf(this.categories));
        sb.append(",isHideSpecial=").append(String.valueOf(this.isHideSpecial));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLookupsRequest)) {
            return false;
        }

        ListLookupsRequest other = (ListLookupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lookupDisplayText, other.lookupDisplayText)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.isHideSpecial, other.isHideSpecial)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupDisplayText == null ? 43 : this.lookupDisplayText.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result =
                (result * PRIME)
                        + (this.isHideSpecial == null ? 43 : this.isHideSpecial.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
